from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ScriptEvents.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("A Script node drives the position and orientation of orbiting cones near the pump house.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Todd Gagnon and Mark A. Boyd") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("Xeena VRML importer, X3D-Edit 3.1, http://www.web3d.org/x3d/content/README.X3D-Edit.html") \
     .setName("translator") \
    ) \
    .addMeta(meta() \
     .setContent("8 June 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("20 December 2002") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("10 October 2015") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("KelpTank.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/PumpHouse.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/ScriptEvents.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit") \
     .setName("generator") \
    ) \
    .addMeta(meta() \
     .setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html") \
     .setName("generator") \
    ) \
    .addMeta(meta() \
     .setContent("../license.html") \
     .setName("license") \
    ) \
   ) \
   .setScene(Scene() \
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("click pump house to spin cones") \
     .setPosition([3,1,7]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book View") \
     .setOrientation([-0.969,0.239,0.056,0.13]) \
     .setPosition([1.66,1.34,5.95]) \
    ) \
    .addChild(Group() \
     .addChild(Transform() \
      .setScale([0.91,0.6,0.3]) \
      .setTranslation([0.8,-0.65,0.5]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.749,0.694,0.651]) \
        ) \
       ) \
       .setGeometry(Cylinder(bottom = False) \
        .setTop(False) \
       ) \
      ) \
     ) \
     .addChild(Group() \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setDEF("PumpHouseAppearance") \
        .setMaterial(Material() \
         .setDiffuseColor([0.82,0.78,0.74]) \
        ) \
       ) \
       .setGeometry(IndexedFaceSet(coordIndex = [0,1,5,4,-1,5,1,2,6,-1,6,2,3,7,-1,3,0,4,7,-1,1,12,13,2,-1,2,13,14,-1,12,15,16,13,-1,15,0,3,16,-1,16,3,17,-1,9,5,6,10,-1,8,9,10,11,-1,4,8,11,7,-1,4,5,9,8,-1,11,10,6,7,-1,3,2,14,17,-1,13,16,17,14,-1]) \
        .setCoord(Coordinate() \
         .setPoint([0.0,0.0,0.0,2.0,0.0,0.0,2.0,1.75,0.0,0.0,1.75,0.0,0.625,0.75,0.0,1.0,0.75,0.0,1.0,1.6,0.0,0.625,1.6,0.0,0.625,0.75,-0.65,1.0,0.75,-0.65,1.0,1.6,-0.65,0.625,1.6,-0.65,2.0,0.0,-2.7,2.0,1.75,-2.7,2.0,2.5,-1.0,0.0,0.0,-2.7,0.0,1.75,-2.7,0.0,2.5,-1.0]) \
        ) \
       ) \
      ) \
      .addChild(TouchSensor() \
       .setDEF("PumpTouched") \
       .setDescription("touch to activate") \
      ) \
     ) \
    ) \
    .addChild(Group() \
     .addChild(Transform() \
      .setScale([0.5,0.5,0.5]) \
      .setTranslation([1.0,1.1,-1.5]) \
      .addChild(Transform() \
       .setDEF("PistonTransform") \
       .addChild(Transform() \
        .setScale([1.8,1.2,0.6]) \
        .setTranslation([0.0,-0.2,0.0]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([0.427,0.427,0.42]) \
          ) \
         ) \
         .setGeometry(Cylinder(height = 1.0, radius = 0.98) \
         ) \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("CylinderRod") \
        .setRotation([0.0,0.0,-1.0,0.523599]) \
        .setTranslation([-0.25,0.75,0.0]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setUSE("PumpHouseAppearance") \
         ) \
         .setGeometry(Cylinder(height = 1.0, radius = 0.1) \
         ) \
        ) \
       ) \
       .addChild(Transform() \
        .setRotation([0.0,0.0,1.0,1.047198]) \
        .setTranslation([1.0,0.6,0.0]) \
        .addChild(Transform() \
         .setUSE("CylinderRod") \
        ) \
       ) \
       .addChild(Transform() \
        .setTranslation([0.0,1.2,0.0]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setUSE("PumpHouseAppearance") \
         ) \
         .setGeometry(Sphere(radius = 0.15) \
         ) \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("RockerArm1") \
        .setCenter([0.0,-0.4,0.0]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setUSE("PumpHouseAppearance") \
         ) \
         .setGeometry(Cylinder(height = 1.8, radius = 0.1) \
         ) \
        ) \
        .addChild(Transform() \
         .setTranslation([0.0,0.95,0.0]) \
         .addChild(Shape() \
          .setAppearance(Appearance() \
           .setUSE("PumpHouseAppearance") \
          ) \
          .setGeometry(Sphere(radius = 0.15) \
          ) \
         ) \
        ) \
        .addChild(PositionInterpolator() \
         .setDEF("Rocker1Path") \
         .setKey([0.0,0.3,0.32,0.5,0.75,1.0]) \
         .setKeyValue([0.0,2.0,-0.25,0.0,1.8,-0.35,0.0,1.8,-0.35,0.0,2.0,-0.25,0.0,2.0,-0.12,0.0,2.0,-0.25]) \
        ) \
        .addChild(OrientationInterpolator() \
         .setDEF("Rocker1Rotation") \
         .setKey([0.0,0.3,0.32,0.5,0.75,1.0]) \
         .setKeyValue([-1.0,0.0,0.0,0.523599,-1.0,0.0,0.0,1.0471976,-1.0,0.0,0.0,1.0471976,-1.0,0.0,0.0,0.523599,-1.0,0.0,0.0,0.2617994,-1.0,0.0,0.0,0.523599]) \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("RockerArm2") \
        .setCenter([0.0,0.7,0.0]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setUSE("PumpHouseAppearance") \
         ) \
         .setGeometry(Cylinder(height = 1.8, radius = 0.1) \
         ) \
        ) \
        .addChild(Transform() \
         .setTranslation([0.0,-0.95,0.0]) \
         .addChild(Shape() \
          .setAppearance(Appearance() \
           .setUSE("PumpHouseAppearance") \
          ) \
          .setGeometry(Sphere(radius = 0.15) \
          ) \
         ) \
        ) \
        .addChild(PositionInterpolator() \
         .setDEF("Rocker2Path") \
         .setKey([0.0,0.3,0.32,0.5,0.75,1.0]) \
         .setKeyValue([0.0,1.95,-1.0,0.0,1.2,-1.6,0.0,1.2,-1.6,0.0,1.95,-1.0,0.0,2.2,-0.65,0.0,1.95,-1.0]) \
        ) \
        .addChild(OrientationInterpolator() \
         .setDEF("Rocker2Rotation") \
         .setKey([0.0,0.3,0.32,0.5,0.75,1.0]) \
         .setKeyValue([1.0,0.0,0.0,0.523599,1.0,0.0,0.0,0.4,1.0,0.0,0.0,0.4,1.0,0.0,0.0,0.523599,1.0,0.0,0.0,1.570796,1.0,0.0,0.0,0.523599]) \
        ) \
       ) \
      ) \
      .addChild(TimeSensor() \
       .setDEF("PistonClock") \
       .setCycleInterval(5.5) \
       .setLoop(True) \
      ) \
      .addChild(PositionInterpolator() \
       .setDEF("PistonPath") \
       .setKey([0.0,0.3,0.32,0.5,0.75,1.0]) \
       .setKeyValue([-0.4,-2.3,4.0,-0.4,-1.5,4.0,-0.4,-1.5,4.0,-0.4,-2.3,4.0,-0.4,-3.3,4.0,-0.4,-2.3,4.0]) \
      ) \
      .addChild(Transform() \
       .setTranslation([3,2,4]) \
       .addChild(Transform() \
        .setDEF("ThreeCones") \
        .addChild(Transform() \
         .setDEF("RedTransform") \
         .setRotation([0,0,1,3.14]) \
         .setTranslation([0,-1.5,.5]) \
         .addChild(Shape() \
          .setAppearance(Appearance() \
           .setMaterial(Material() \
            .setDiffuseColor([1,0,0]) \
           ) \
          ) \
          .setGeometry(Cone(bottomRadius = .5, height = 1) \
           .setDEF("b1") \
          ) \
         ) \
        ) \
        .addChild(Transform() \
         .setDEF("GreenTransform") \
         .setRotation([0,0,1,-1.05]) \
         .setTranslation([1.3,.75,0]) \
         .addChild(Shape() \
          .setAppearance(Appearance() \
           .setMaterial(Material() \
            .setDiffuseColor([0,1,1]) \
           ) \
          ) \
          .setGeometry(Cone() \
           .setUSE("b1") \
          ) \
         ) \
        ) \
        .addChild(Transform() \
         .setDEF("TurquoiseTransform") \
         .setRotation([0,0,1,1.05]) \
         .setTranslation([-1.3,.75,-.5]) \
         .addChild(Shape() \
          .setAppearance(Appearance() \
           .setMaterial(Material() \
            .setDiffuseColor([1,1,0]) \
           ) \
          ) \
          .setGeometry(Cone() \
           .setUSE("b1") \
          ) \
         ) \
        ) \
       ) \
      ) \
      .addChild(Script() \
       .setDEF("ControlScript") \
       .addField(field() \
        .setAccessType("inputOnly") \
        .setName("angle") \
        .setType("SFFloat") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("positionRed") \
        .setType("SFVec3f") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("positionGreen") \
        .setType("SFVec3f") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("positionTurquoise") \
        .setType("SFVec3f") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("orientationRed") \
        .setType("SFRotation") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("orientationGreen") \
        .setType("SFRotation") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("orientationTurquoise") \
        .setType("SFRotation") \
       ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"\n"+
"//  this input function receives the currently interpolated rotation angle value,\n"+
"//  and then computes the position and orientation of each of the cones.\n"+
"\n"+
"function angle (value)\n"+
"{\n"+
"  positionRed       = new SFVec3f (Math.cos (value), 1.5 * Math.sin(value), 0.5);\n"+
"  positionGreen     = new SFVec3f (Math.cos (value+2.094), 1.5 * Math.sin(value+2.094),    0);\n"+
"  positionTurquoise = new SFVec3f (Math.cos (value+4.189), 1.5 * Math.sin(value+4.189), -0.5);\n"+
"\n"+
"  // The values 2.094 and 4.189 are 1/3 and 2/3 of 2*pi radians.\n"+
"  orientationRed       = new SFRotation (0, 0, 1, -2*value);\n"+
"  orientationGreen     = new SFRotation (0, 0, 1, -2*(value+2.094));\n"+
"  orientationTurquoise = new SFRotation (0, 0, 1, -2*(value+4.189));\n"+
"}\n"+
"''')
      ) \
     ) \
    ) \
# Drive the Script inputs 
    .addChild(ScalarInterpolator() \
     .setDEF("AngleGenerator") \
     .setKey([0,1]) \
     .setKeyValue([0,6.28319]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("AngleGenerator") \
     .setToField("angle") \
     .setToNode("ControlScript") \
    ) \
    .addChild(TimeSensor() \
     .setDEF("SpinAngleTimer") \
     .setCycleInterval(2) \
     .setEnabled(False) \
     .setLoop(True) \
     .setStartTime(1) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("SpinAngleTimer") \
     .setToField("set_fraction") \
     .setToNode("AngleGenerator") \
    ) \
    .addChild(BooleanFilter() \
     .setDEF("TouchFilter") \
    ) \
    .addChild(ROUTE() \
     .setFromField("isActive") \
     .setFromNode("PumpTouched") \
     .setToField("set_boolean") \
     .setToNode("TouchFilter") \
    ) \
    .addChild(ROUTE() \
     .setFromField("inputTrue") \
     .setFromNode("TouchFilter") \
     .setToField("enabled") \
     .setToNode("SpinAngleTimer") \
    ) \
# Script output converts angle timer into positions, orientations for spinning cones 
    .addChild(ROUTE() \
     .setFromField("positionRed") \
     .setFromNode("ControlScript") \
     .setToField("translation") \
     .setToNode("RedTransform") \
    ) \
    .addChild(ROUTE() \
     .setFromField("positionGreen") \
     .setFromNode("ControlScript") \
     .setToField("translation") \
     .setToNode("GreenTransform") \
    ) \
    .addChild(ROUTE() \
     .setFromField("positionTurquoise") \
     .setFromNode("ControlScript") \
     .setToField("translation") \
     .setToNode("TurquoiseTransform") \
    ) \
    .addChild(ROUTE() \
     .setFromField("orientationRed") \
     .setFromNode("ControlScript") \
     .setToField("rotation") \
     .setToNode("RedTransform") \
    ) \
    .addChild(ROUTE() \
     .setFromField("orientationGreen") \
     .setFromNode("ControlScript") \
     .setToField("rotation") \
     .setToNode("GreenTransform") \
    ) \
    .addChild(ROUTE() \
     .setFromField("orientationTurquoise") \
     .setFromNode("ControlScript") \
     .setToField("rotation") \
     .setToNode("TurquoiseTransform") \
    ) \
# Regular piston engine 
    .addChild(ROUTE() \
     .setFromField("inputFalse") \
     .setFromNode("TouchFilter") \
     .setToField("enabled") \
     .setToNode("PistonClock") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("PistonClock") \
     .setToField("set_fraction") \
     .setToNode("PistonPath") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("PistonPath") \
     .setToField("set_translation") \
     .setToNode("PistonTransform") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("PistonClock") \
     .setToField("set_fraction") \
     .setToNode("Rocker1Path") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("Rocker1Path") \
     .setToField("set_translation") \
     .setToNode("RockerArm1") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("PistonClock") \
     .setToField("set_fraction") \
     .setToNode("Rocker1Rotation") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("Rocker1Rotation") \
     .setToField("set_rotation") \
     .setToNode("RockerArm1") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("PistonClock") \
     .setToField("set_fraction") \
     .setToNode("Rocker2Path") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("Rocker2Path") \
     .setToField("set_translation") \
     .setToNode("RockerArm2") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("PistonClock") \
     .setToField("set_fraction") \
     .setToNode("Rocker2Rotation") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("Rocker2Rotation") \
     .setToField("set_rotation") \
     .setToNode("RockerArm2") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//ScriptEvents_RoundTrip.x3d")
