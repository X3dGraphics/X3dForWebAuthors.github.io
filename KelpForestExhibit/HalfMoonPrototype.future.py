from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("HalfMoonPrototype.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Prototype for a group of HalfMoon fish in the Kelp forest.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Ildeniz Duman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("Scott Tufts") \
     .setName("translator") \
    ) \
    .addMeta(meta() \
     .setContent("1 June 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("6 June 2012") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Additional PositionInterpolator present but disabled.") \
     .setName("warning") \
    ) \
    .addMeta(meta() \
     .setContent("Wiggle causes texture flashing. TODO: move animation to example file.") \
     .setName("warning") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonPrototype.x3d") \
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
    .addChild(ProtoDeclare() \
     .setAppinfo("HalfMoon fish") \
     .setName("HalfMoon") \
     .setProtoInterface(ProtoInterface() \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("skinTextureUrl") \
       .setType("MFString") \
       .setValue("\"HalfMoonScalesPatch.jpg\"") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("fishScale") \
       .setType("SFVec3f") \
       .setValue("0.3 0.25 0.25") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("fishColor") \
       .setType("SFColor") \
       .setValue("0.7 0.7 0.7") \
      ) \
     ) \
     .setProtoBody(ProtoBody() \
      .addChild(Transform() \
       .setDEF("MyHalfMoon") \
       .setIS(IS() \
        .addConnect(connect() \
         .setNodeField("scale") \
         .setProtoField("fishScale") \
        ) \
       ) \
       .addChild(Shape() \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDEF("FishColor") \
          .setIS(IS() \
           .addConnect(connect() \
            .setNodeField("diffuseColor") \
            .setProtoField("fishColor") \
           ) \
          ) \
         ) \
         .setTexture(ImageTexture() \
          .setDEF("FishTexture") \
          .setIS(IS() \
           .addConnect(connect() \
            .setNodeField("url") \
            .setProtoField("skinTextureUrl") \
           ) \
          ) \
         ) \
        ) \
        .setGeometry(Extrusion(creaseAngle = 1.57, crossSection = [-0.1,1.0,0.1,1,0.5,0.5,0.5,-0.5,0.1,-1,-0.1,-1,-0.5,-0.5,-0.5,0.5,-0.1,1], spine = [0,1.5,0,0,1.2,0,0,0.5,0,0,0.3,0,0,0,0,0,-0.3,0]) \
         .setDEF("Fish_Shape") \
         .setScale([0.03,0.03,0.3,0.3,0.2,0.4,0.1,0.5,0.1,0.15,0.03,0.4]) \
        ) \
       ) \
       .addChild(Shape() \
        .setAppearance(Appearance() \
         .setDEF("Fin_Skin") \
         .setMaterial(Material() \
          .setDiffuseColor([0.5,0.5,0.5]) \
          .setTransparency(0.2) \
         ) \
        ) \
       ) \
       .addChild(Transform() \
        .setTranslation([1.37,0.1,0.1]) \
        .addChild(Shape() \
         .setDEF("Eye") \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([0.5,0.5,0.5]) \
           .setShininess(1) \
           .setSpecularColor([0.3,0.3,0.3]) \
          ) \
         ) \
         .setGeometry(Sphere(radius = 0.04) \
         ) \
        ) \
       ) \
       .addChild(Transform() \
        .setTranslation([1.37,0.1,-0.1]) \
        .addChild(Shape() \
         .setUSE("Eye") \
        ) \
       ) \
       .addChild(Transform() \
        .setScale([2.6,1,0.7]) \
        .setTranslation([1.46,0,0]) \
# Mouth 
        .addChild(Shape() \
         .setUSE("Eye") \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("Left_Pectoral") \
        .setTranslation([1.1,-0.15,-0.1]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setUSE("Fin_Skin") \
         ) \
         .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,-1], solid = False) \
          .setCoord(Coordinate() \
           .setPoint([0,0,0,0.2,0,0,-0.2,0,-0.2]) \
          ) \
         ) \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("Right_Pectoral") \
        .setTranslation([1.1,-0.15,0.1]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setUSE("Fin_Skin") \
         ) \
         .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,-1], solid = False) \
          .setCoord(Coordinate() \
           .setPoint([0,0,0,0.2,0,0,-0.2,0,0.2]) \
          ) \
         ) \
        ) \
       ) \
       .addChild(Group() \
        .setDEF("AnimationGroup") \
        .addChild(TimeSensor() \
         .setDEF("Timer") \
         .setCycleInterval(5) \
         .setLoop(True) \
        ) \
        .addChild(CoordinateInterpolator() \
         .setDEF("Waggler") \
         .setKey([0.0,0.15,0.28,0.4,0.55,0.7,0.85,1]) \
         .setKeyValue([1.5,0,0,1.2,0,0,0.5,0,0,0.3,0,0,0,0,0,-0.3,0,0,1.5,0,0,1.20,0,0,0.5,0,.1,0.3,0,.2,0,0,0.25,-0.3,0,0.3,1.5,0,0,1.20,0,0,0.5,0,0,0.3,0,0,0,0,0,-0.3,0,0,1.5,0,0,1.2,0,0,0.5,0,-0.1,0.3,0,-0.2,0,0,-0.25,-0.3,0,-0.3,1.5,0,0,1.2,0,0,0.5,0,0,0.3,0,0,0,0,0,-0.3,0,0,1.5,0,0,1.2,0,0,0.5,0,0.1,0.3,0,0.2,0,0,0.25,-0.3,0,0.3,1.5,0,0,1.2,0,0,0.5,0,0,0.3,0,0,0,0,0,-0.3,0,0,1.5,0,0,1.2,0,0,0.5,0,-0.1,0.3,0,-0.2,0,0,-0.25,-0.3,0,-0.3]) \
        ) \
        .addChild(OrientationInterpolator() \
         .setDEF("Left_Pectoral_Rotation") \
         .setKey([0,0.3,0.7,1]) \
         .setKeyValue([1,0,0,-0.52,1,0,0,0,1,0,0,0,1,0,0,-0.52]) \
        ) \
        .addChild(OrientationInterpolator() \
         .setDEF("Right_Pectoral_Rotation") \
         .setKey([0,0.3,0.7,1]) \
         .setKeyValue([1,0,0,-0.52,1,0,0,0,1,0,0,0,1,0,0,-0.52]) \
        ) \
# orbiting time 
        .addChild(TimeSensor() \
         .setDEF("OrbitClock") \
         .setCycleInterval(90) \
         .setEnabled(False) \
         .setLoop(True) \
        ) \
        .addChild(OrientationInterpolator() \
         .setDEF("Orbit") \
         .setKey([0.0,0.25,0.5,0.750,1]) \
         .setKeyValue([0,1,0,6.28,0,1,0,1.57,0,1,0,3.14,0,1,0,4.71,0,1,0,6.28]) \
        ) \
        .addChild(PositionInterpolator() \
         .setDEF("HalfMoonPath") \
         .setKey([0,0.125,0.25,0.375,0.5,0.625,0.75,0.875,1]) \
         .setKeyValue([15,2,0,15,0,-10,0,-1,-10,-15,0,-10,-15,2,0,-15,0,10,0,-2,10,15,0,10,15,2,0]) \
        ) \
        .addChild(ROUTE() \
         .setFromField("fraction_changed") \
         .setFromNode("Timer") \
         .setToField("set_fraction") \
         .setToNode("Waggler") \
        ) \
        .addChild(ROUTE() \
         .setFromField("value_changed") \
         .setFromNode("Waggler") \
         .setToField("set_spine") \
         .setToNode("Fish_Shape") \
        ) \
        .addChild(ROUTE() \
         .setFromField("fraction_changed") \
         .setFromNode("Timer") \
         .setToField("set_fraction") \
         .setToNode("Left_Pectoral_Rotation") \
        ) \
        .addChild(ROUTE() \
         .setFromField("value_changed") \
         .setFromNode("Left_Pectoral_Rotation") \
         .setToField("set_rotation") \
         .setToNode("Left_Pectoral") \
        ) \
        .addChild(ROUTE() \
         .setFromField("fraction_changed") \
         .setFromNode("Timer") \
         .setToField("set_fraction") \
         .setToNode("Right_Pectoral_Rotation") \
        ) \
        .addChild(ROUTE() \
         .setFromField("value_changed") \
         .setFromNode("Right_Pectoral_Rotation") \
         .setToField("set_rotation") \
         .setToNode("Right_Pectoral") \
        ) \
        .addChild(ROUTE() \
         .setFromField("fraction_changed") \
         .setFromNode("OrbitClock") \
         .setToField("set_fraction") \
         .setToNode("Orbit") \
        ) \
        .addChild(ROUTE() \
         .setFromField("fraction_changed") \
         .setFromNode("OrbitClock") \
         .setToField("set_fraction") \
         .setToNode("HalfMoonPath") \
        ) \
        .addChild(ROUTE() \
         .setFromField("value_changed") \
         .setFromNode("Orbit") \
         .setToField("set_rotation") \
         .setToNode("MyHalfMoon") \
        ) \
        .addChild(ROUTE() \
         .setFromField("value_changed") \
         .setFromNode("HalfMoonPath") \
         .setToField("set_translation") \
         .setToNode("MyHalfMoon") \
        ) \
       ) \
      ) \
     ) \
    ) \
# ==================== 
    .addChild(ProtoInstance() \
     .setName("HalfMoon") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//HalfMoonPrototype_RoundTrip.x3d")