from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ChangingFog.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("A Fog node that adjusts as the viewer's orientation and position changes. This is a good candidate to become a Prototype since Fog does not automatically bind when inlined.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Matthew Braun") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("20 September 2001") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
# javascript code for rotation calculations was derived from: 
    .addMeta(meta() \
     .setContent("http://astronomy.swin.edu.au/pbourke/geometry/rotate/") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright (c) Matthew Braun 2001") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("Fog") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/ChangingFog.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit") \
     .setName("generator") \
    ) \
    .addMeta(meta() \
     .setContent("../license.html") \
     .setName("license") \
    ) \
   ) \
   .setScene(Scene() \
    .addChild(NavigationInfo() \
     .setAvatarSize([0.01,0,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Start") \
     .setFieldOfView(0.9) \
     .setPosition([0,0,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Looking up from start") \
     .setOrientation([1,0,0,1.57]) \
     .setPosition([0,0,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("10m above, looking straight up") \
     .setOrientation([1,0,0,1.57]) \
     .setPosition([0,10,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("10m above start") \
     .setPosition([0,10,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("10m above, looking straight down") \
     .setOrientation([1,0,0,-1.57]) \
     .setPosition([0,10,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("10m below, looking down") \
     .setOrientation([1,0,0,-1.57]) \
     .setPosition([0,-10,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("10m below start") \
     .setPosition([0,-10,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("10m below, looking up") \
     .setOrientation([1,0,0,1.57]) \
     .setPosition([0,-10,0]) \
    ) \
    .addChild(Fog() \
     .setDEF("Water") \
     .setColor([0.2,0.2,0.4]) \
     .setFogType("EXPONENTIAL") \
    ) \
# Proximity sensor must be large enough to encompass the entire scene 
    .addChild(ProximitySensor(size = [1000,1000,1000]) \
     .setDEF("ProxSensor") \
    ) \
# TimeSensor triggering reduces frequency of calculations for performance reasons. 
    .addChild(TimeSensor() \
     .setDEF("Clock") \
     .setLoop(True) \
    ) \
    .addChild(Script() \
     .setDEF("ChangeVisibility") \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("get_clock_hit") \
      .setType("SFTime") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("run_script") \
      .setType("SFBool") \
      .setValue("false") \
     ) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("get_depth") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("visibility_changed") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("set_visibility") \
      .setType("SFRotation") \
     ) \
# <field accessType='initializeOnly' name='checked' type='SFBool' value='false'/> <field accessType='initializeOnly' name='moved' type='SFBool' value='false'/> 
.setSourceCode('''\n"+
"ecmascript:\n"+
"// REF: http://astronomy.swin.edu.au/pbourke/geometry/rotate/\n"+
"\n"+
"function initialize () {\n"+
"   visibility = 20;\n"+
"   depth = 0;\n"+
"   pos = (0,0,0);\n"+
"   Browser.print ('Position output from ProximitySensor.');\n"+
"}\n"+
"\n"+
"function get_clock_hit (clock_msg) {\n"+
"     run_script = true;\n"+
"}\n"+
"\n"+
"function get_depth ( position ) {\n"+
"\n"+
"   pos = position;\n"+
"   depth = position[1] - 30;   \n"+
"\n"+
"}\n"+
"\n"+
"function set_visibility( rotation ) {\n"+
"\n"+
" if (run_script) {\n"+
"\n"+
"//z coordinate of the default viewpoint direction(0,0,-1)\n"+
"   initZ = -1;  \n"+
"\n"+
"   rX = rotation[0];  // x coordinate of the rotation\n"+
"   rY = rotation[1];  // y coordinate of the rotation\n"+
"   rZ = rotation[2];  // z coordinate of the rotation\n"+
"\n"+
"   theta = rotation[3];  // angle of rotation in radians\n"+
"	\n"+
"Browser.print ('theta:' + theta);\n"+
"     \n"+
"   cosTheta = Math.cos(theta);\n"+
"   sinTheta = Math.sin(theta);\n"+
"\n"+
"Browser.print ('cosTheta:' + cosTheta + ' sinTheta:'+ sinTheta);\n"+
"\n"+
"\n"+
"// calculate the y coordinate of the point after rotation\n"+
"/* there are 8 other terms in the full conversion, but 6 are equal\n"+
"to zero because of the choice of a starting point on the z-axis. The\n"+
"other two are not calculated since all we need is the y coordinate\n"+
"*/\n"+
"   finalY = ((1 - cosTheta) * rY * rZ - rX * sinTheta) * initZ;\n"+
"\n"+
"Browser.print ('final y:' + finalY);\n"+
"\n"+
"//calculate the elevation/depression angle of the final point location\n"+
"\n"+
"   elevation = Math.asin(finalY);\n"+
"\n"+
"Browser.print ('elevation:' + elevation);\n"+
"\n"+
"   directionFactor = 1 + 0.2 * (4 * elevation / Math.PI);\n"+
"   depthAdjust = (60 + depth)/60\n"+
"   depthFactor = Math.max(depthAdjust,0.05);\n"+
"\n"+
"   visibility_changed =  60 * depthFactor * directionFactor; \n"+
"   Browser.print ('depth=' + depth + ', elevation=' + elevation + \n"+
"        ', visibility_changed=' + visibility_changed);\n"+
"   run_script = false;\n"+
"   \n"+
" }\n"+
"}\n"+
"''')
    ) \
    .addChild(ROUTE() \
     .setFromField("cycleTime") \
     .setFromNode("Clock") \
     .setToField("get_clock_hit") \
     .setToNode("ChangeVisibility") \
    ) \
    .addChild(ROUTE() \
     .setFromField("position_changed") \
     .setFromNode("ProxSensor") \
     .setToField("get_depth") \
     .setToNode("ChangeVisibility") \
    ) \
    .addChild(ROUTE() \
     .setFromField("orientation_changed") \
     .setFromNode("ProxSensor") \
     .setToField("set_visibility") \
     .setToNode("ChangeVisibility") \
    ) \
    .addChild(ROUTE() \
     .setFromField("visibility_changed") \
     .setFromNode("ChangeVisibility") \
     .setToField("visibilityRange") \
     .setToNode("Water") \
    ) \
# A set of arrows is used to show visibility and direction 
    .addChild(Transform() \
     .setDEF("Pointer") \
     .setTranslation([0,0,-15]) \
     .addChild(Transform() \
      .setTranslation([0,4,0]) \
      .addChild(Shape() \
       .setGeometry(Cone(bottomRadius = 0.4) \
       ) \
       .setAppearance(Appearance() \
        .setDEF("ShapeApp") \
        .setMaterial(Material() \
         .setAmbientIntensity(0.8) \
         .setDiffuseColor([1,1,0.3]) \
         .setShininess(0.6) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Shape() \
      .setGeometry(Cylinder(height = 6, radius = 0.2) \
      ) \
      .setAppearance(Appearance() \
       .setUSE("ShapeApp") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,10,0]) \
     .addChild(Transform() \
      .setUSE("Pointer") \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,-10,0]) \
     .addChild(Transform() \
      .setUSE("Pointer") \
     ) \
    ) \
# A pair of disks used to show visibility 
    .addChild(Transform() \
     .setTranslation([0,15,0]) \
     .addChild(Shape() \
      .setDEF("Disk") \
      .setGeometry(Cylinder(height = 0.01) \
      ) \
      .setAppearance(Appearance() \
       .setUSE("ShapeApp") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,-15,0]) \
     .addChild(Shape() \
      .setUSE("Disk") \
     ) \
    ) \
# An indexed face set box used to bound the working area 
    .addChild(Transform() \
     .setScale([20,20,20]) \
     .addChild(Shape() \
      .setDEF("IFSBox") \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,1,1]) \
       ) \
      ) \
      .setGeometry(IndexedFaceSet(ccw = False, colorPerVertex = False, coordIndex = [0,1,2,3,-1,7,6,5,4,-1,0,4,5,1,-1,1,5,6,2,-1,2,6,7,3,-1,3,7,4,0]) \
       .setColorIndex([0,2,2,2,2,1]) \
       .setCoord(Coordinate() \
        .setPoint([-1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,-1.0,-1.0,1.0,-1.0,-1.0,-1.0,1.0,1.0,-1.0,1.0,1.0,-1.0,-1.0,-1.0,-1.0,-1.0]) \
       ) \
       .setColor(Color() \
        .setColor([1,1,1,0,0,0,0.2,0.2,0.8]) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//ChangingFog_RoundTrip.x3d")
