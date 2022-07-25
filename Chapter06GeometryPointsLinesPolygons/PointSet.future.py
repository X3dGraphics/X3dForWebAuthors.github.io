from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("PointSet.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Way points for the animated shark Lucy traversing the tank.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Tim McLean") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("translator") \
    ) \
    .addMeta(meta() \
     .setContent("1 June 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("7 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://faculty.nps.edu/brutzman/kelp") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucyLocale.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/PointSet.x3d") \
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
    .addChild(Background() \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book View") \
     .setOrientation([0.939,0.335,0.075,-0.57]) \
     .setPosition([-0.89,1.91,9.26]) \
    ) \
    .addChild(Transform() \
     .setDEF("_0") \
     .setTranslation([0.0,-8.0,-1.0]) \
     .addChild(Inline() \
      .setUrl(["../KelpForestExhibit/SharkLucy.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucy.x3d","../KelpForestExhibit/SharkLucy.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucy.wrl"]) \
     ) \
     .addChild(Group() \
      .addChild(TimeSensor() \
       .setDEF("SHARK1_CLOCK") \
       .setCycleInterval(220.0) \
       .setLoop(True) \
      ) \
      .addChild(PositionInterpolator() \
       .setDEF("SHARK1_POSITION") \
       .setKey([0.0,0.048,0.112,0.155,0.184,0.263,0.3,0.342,0.375,0.404,0.457,0.497,0.57,0.65,0.702,0.796,0.888,0.938,1.0]) \
       .setKeyValue([0.0,-7.0,-1.0,-1.75,-7.0,-0.5,-4.0,-7.0,0.5,-5.0,-6.5,1.5,-5.5,-6.25,0.75,-5.25,-5.5,-2.25,-4.25,-5.0,-3.25,-2.75,-4.5,-3.75,-1.5,-4.5,-4.0,-0.5,-4.25,-4.5,1.5,-3.75,-4.75,3.0,-3.75,-4.5,5.75,-4.5,-4.5,8.75,-4.5,-4.0,9.25,-4.5,-2.25,7.5,-5.5,0.0,4.0,-6.5,-0.25,2.25,-7.0,-0.25,0.0,-7.0,-1.0]) \
      ) \
      .addChild(OrientationInterpolator() \
       .setDEF("SHARK1_ORIENTATION") \
       .setKey([0.0,0.048,0.112,0.155,0.184,0.263,0.3,0.342,0.375,0.404,0.457,0.497,0.57,0.65,0.702,0.796,0.888,0.938,1.0]) \
       .setKeyValue([0.0,1.0,0.0,3.4208,0.0,1.0,0.0,3.5605,0.1504,0.986,0.0717,4.0208,0.1095,0.9918,-0.0658,2.0667,-0.1207,0.9836,0.134,1.4825,-0.1565,0.9125,0.3779,0.8522,-0.1099,0.7118,0.6937,0.4379,0.0,1.0,0.0,0.192,-0.0956,0.8656,0.4916,0.4418,-0.0606,0.4959,0.8663,0.2802,0.0,1.0,0.0,6.161,0.0,0.0,-1.0,0.2618,0.0,1.0,0.0,6.0388,0.0,1.0,0.0,5.236,-0.1388,0.9878,-0.0707,4.0742,-0.1392,0.9903,0.0,3.1416,-0.1305,0.9911,0.0265,3.0,0.0,1.0,0.0,2.827,0.0,1.0,0.0,3.4208]) \
      ) \
     ) \
    ) \
# TODO move PointSet to top 
    .addChild(Transform() \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setEmissiveColor([1,1,0]) \
       ) \
      ) \
      .setGeometry(PointSet() \
       .setCoord(Coordinate() \
        .setDEF("TurnPoints") \
        .setPoint([0.0,-7.0,-1.0,-1.75,-7.0,-0.5,-4.0,-7.0,0.5,-5.0,-6.5,1.5,-5.5,-6.25,0.75,-5.25,-5.5,-2.25,-4.25,-5.0,-3.25,-2.75,-4.5,-3.75,-1.5,-4.5,-4.0,-0.5,-4.25,-4.5,1.5,-3.75,-4.75,3.0,-3.75,-4.5,5.75,-4.5,-4.5,8.75,-4.5,-4.0,9.25,-4.5,-2.25,7.5,-5.5,0.0,4.0,-6.5,-0.25,2.25,-7.0,-0.25,0.0,-7.0,-1.0]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("_4") \
     .setLoop(True) \
    ) \
    .addChild(Script() \
     .setDEF("sharkSwimmingInTankTrigger_5") \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("triggerIn") \
      .setType("SFTime") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("startTime") \
      .setType("SFTime") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("firstTime") \
      .setType("SFBool") \
     ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"\n"+
"function triggerIn (value, time)\n"+
"{\n"+
"	startTime = value;\n"+
"	firstTime = false;\n"+
"}\n"+
"''')
    ) \
    .addChild(ROUTE() \
     .setFromField("startTime") \
     .setFromNode("sharkSwimmingInTankTrigger_5") \
     .setToField("set_startTime") \
     .setToNode("SHARK1_CLOCK") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("SHARK1_CLOCK") \
     .setToField("set_fraction") \
     .setToNode("SHARK1_POSITION") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("SHARK1_CLOCK") \
     .setToField("set_fraction") \
     .setToNode("SHARK1_ORIENTATION") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("SHARK1_POSITION") \
     .setToField("set_translation") \
     .setToNode("_0") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("SHARK1_ORIENTATION") \
     .setToField("set_rotation") \
     .setToNode("_0") \
    ) \
    .addChild(ROUTE() \
     .setFromField("firstTime") \
     .setFromNode("sharkSwimmingInTankTrigger_5") \
     .setToField("set_enabled") \
     .setToNode("_4") \
    ) \
    .addChild(ROUTE() \
     .setFromField("time") \
     .setFromNode("_4") \
     .setToField("triggerIn") \
     .setToNode("sharkSwimmingInTankTrigger_5") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons//PointSet_RoundTrip.x3d")
