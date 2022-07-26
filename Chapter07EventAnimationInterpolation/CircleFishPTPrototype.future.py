from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("CircleFishPTPrototype.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("This is a prototype for a CircleFish, which is also used by CircleFishLod. Default fish size: length is 1 m (Y-axis), max Height is 1 m (Z-axis), max Width is 10 cm (X-axis).") \
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
     .setContent("1 May 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("11 December 2001") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("4 May 2004") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPrototype.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/CircleFishPTPrototype.x3d") \
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
     .setName("CircleFishPT") \
     .setProtoInterface(ProtoInterface() \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("skinPixelTexture") \
       .setType("SFImage") \
       .setValue("0 0 0") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("fishScale") \
       .setType("SFVec3f") \
       .setValue("1 1 1") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("fishColor") \
       .setType("SFColor") \
       .setValue("0.5 0.5 0.5") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("finColor") \
       .setType("SFColor") \
       .setValue("0.5 0.5 0.5") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("positionKey") \
       .setType("MFFloat") \
       .setValue("0.0 0.125 0.25 0.375 0.5 0.625 0.750 0.8751") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("positionKeyValue") \
       .setType("MFVec3f") \
       .setValue("1.5 2 0 1.5 0 -1.0 0 -1 -1.0 -1.5 0 -1.0 -1.5 2 0 -1.5 0 1.0 0 -2 1.0 1.5 0 1.0 1.5 2 0") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("orientationKey") \
       .setType("MFFloat") \
       .setValue("0.0 0.25 0.5 0.750 1") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("orientationKeyValue") \
       .setType("MFRotation") \
       .setValue("0 1 0 0 0 1 0 -1.57 0 1 0 -3.14 0 1 0 -4.71 0 1 0 -6.28") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("orbitTime") \
       .setType("SFTime") \
       .setValue("90") \
      ) \
     ) \
     .setProtoBody(ProtoBody() \
      .addChild(Transform() \
       .setDEF("Way") \
       .addChild(Transform() \
        .setRotation([1,0,0,1.395]) \
        .addChild(Transform() \
         .setDEF("FishTransform") \
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
           .setTexture(PixelTexture() \
            .setDEF("FishTexture") \
            .setIS(IS() \
             .addConnect(connect() \
              .setNodeField("image") \
              .setProtoField("skinPixelTexture") \
             ) \
            ) \
           ) \
          ) \
          .setGeometry(Extrusion(creaseAngle = 0.57, crossSection = [-0.1,1.0,0.1,1,0.5,0.5,0.5,-0.5,0.1,-1,-0.1,-1,-0.5,-0.5,-0.5,0.5,-0.1,1], spine = [0,1,0,0,0.8,0,0,0.6,0,0,0.5,0,0,0.3,0,0,0.2,0,0,0,0]) \
           .setDEF("FishBodyExtrusion") \
           .setScale([0.03,0.03,0.05,0.3,0.05,0.45,0.1,0.5,0.05,0.45,0.05,0.2,0.03,0.4]) \
          ) \
         ) \
         .addChild(Shape() \
          .setAppearance(Appearance() \
           .setDEF("FinSkin") \
           .setMaterial(Material() \
            .setDEF("FinColor") \
            .setTransparency(0.2) \
            .setIS(IS() \
             .addConnect(connect() \
              .setNodeField("diffuseColor") \
              .setProtoField("finColor") \
             ) \
            ) \
           ) \
          ) \
         ) \
         .addChild(Transform() \
          .setTranslation([0.015,0.8,-0.2]) \
          .addChild(Shape() \
           .setDEF("Eye") \
           .setAppearance(Appearance() \
            .setMaterial(Material() \
             .setDiffuseColor([0.5,0.5,0.5]) \
             .setShininess(1) \
             .setSpecularColor([0.3,0.3,0.3]) \
            ) \
           ) \
           .setGeometry(Sphere(radius = 0.03) \
           ) \
          ) \
         ) \
         .addChild(Transform() \
          .setTranslation([-0.015,0.8,-0.2]) \
          .addChild(Shape() \
           .setUSE("Eye") \
          ) \
         ) \
         .addChild(Transform() \
          .setScale([1,1,0.7]) \
          .setTranslation([0,0.98,0]) \
          .addChild(Shape() \
           .setUSE("Eye") \
          ) \
         ) \
         .addChild(Transform() \
          .setDEF("LeftPectoral") \
          .setTranslation([0.04,0.4,0.3]) \
          .addChild(Shape() \
           .setAppearance(Appearance() \
            .setUSE("FinSkin") \
           ) \
           .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,-1], solid = False) \
            .setCoord(Coordinate() \
             .setPoint([0,0,0,0,0.2,0,0.2,0.1,0]) \
            ) \
           ) \
          ) \
         ) \
         .addChild(Transform() \
          .setDEF("RightPectoral") \
          .setTranslation([-0.04,0.4,0.3]) \
          .addChild(Shape() \
           .setAppearance(Appearance() \
            .setUSE("FinSkin") \
           ) \
           .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,-1], solid = False) \
            .setCoord(Coordinate() \
             .setPoint([0,0,0,0,0.2,0,-0.2,0.1,0]) \
            ) \
           ) \
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
         .setKeyValue([0,1,0,0,0.8,0,0,0.6,0,0,0.5,0,0,0.3,0,0,0.2,0,0,0,0,0,1,0,0,0.8,0,0,0.6,0,0,0.5,0,0.05,0.3,0,0.1,0.2,0,0.2,0,0,0,1,0,0,0.8,0,0,0.6,0,0,0.5,0,0,0.3,0,0,0.2,0,0,0,0,0,1,0,0,0.8,0,0,0.6,0,0,0.5,0,-0.05,0.3,0,-0.1,0.2,0,-0.2,0,0,0,1,0,0,0.8,0,0,0.6,0,0,0.5,0,0,0.3,0,0.0,0.2,0,0,0,0,0,1,0,0,0.8,0,0,0.6,0,0,0.5,0,0.05,0.3,0,0.1,0.2,0,0.2,0,0,0,1,0,0,0.8,0,0,0.6,0,0,0.5,0,0,0.3,0,0,0.2,0,0,0,0,0,1,0,0,0.8,0,0,0.6,0,0,0.5,0,0,0.3,0,0,0.2,0,0,0,0]) \
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
         .setToNode("FishBodyExtrusion") \
        ) \
        .addChild(OrientationInterpolator() \
         .setDEF("LeftPectoralRotation") \
         .setKey([0,0.3,0.7,1]) \
         .setKeyValue([0,1,0,-.349,0,1,0,0,0,1,0,0,0,1,0,-.349]) \
        ) \
        .addChild(ROUTE() \
         .setFromField("fraction_changed") \
         .setFromNode("Timer") \
         .setToField("set_fraction") \
         .setToNode("LeftPectoralRotation") \
        ) \
        .addChild(ROUTE() \
         .setFromField("value_changed") \
         .setFromNode("LeftPectoralRotation") \
         .setToField("set_rotation") \
         .setToNode("LeftPectoral") \
        ) \
        .addChild(OrientationInterpolator() \
         .setDEF("RightPectoralRotation") \
         .setKey([0,0.3,0.7,1]) \
         .setKeyValue([0,1,0,.349,0,1,0,0,0,1,0,0,0,1,0,.349]) \
        ) \
        .addChild(ROUTE() \
         .setFromField("fraction_changed") \
         .setFromNode("Timer") \
         .setToField("set_fraction") \
         .setToNode("RightPectoralRotation") \
        ) \
        .addChild(ROUTE() \
         .setFromField("value_changed") \
         .setFromNode("RightPectoralRotation") \
         .setToField("set_rotation") \
         .setToNode("RightPectoral") \
        ) \
        .addChild(TimeSensor() \
         .setDEF("OrbitClock") \
         .setLoop(True) \
         .setIS(IS() \
          .addConnect(connect() \
           .setNodeField("cycleInterval") \
           .setProtoField("orbitTime") \
          ) \
         ) \
        ) \
        .addChild(PositionInterpolator() \
         .setDEF("CirclefishPath") \
         .setIS(IS() \
          .addConnect(connect() \
           .setNodeField("key") \
           .setProtoField("positionKey") \
          ) \
          .addConnect(connect() \
           .setNodeField("keyValue") \
           .setProtoField("positionKeyValue") \
          ) \
         ) \
        ) \
        .addChild(OrientationInterpolator() \
         .setDEF("CircleFishAngle") \
         .setIS(IS() \
          .addConnect(connect() \
           .setNodeField("key") \
           .setProtoField("orientationKey") \
          ) \
          .addConnect(connect() \
           .setNodeField("keyValue") \
           .setProtoField("orientationKeyValue") \
          ) \
         ) \
        ) \
        .addChild(ROUTE() \
         .setFromField("fraction_changed") \
         .setFromNode("OrbitClock") \
         .setToField("set_fraction") \
         .setToNode("CirclefishPath") \
        ) \
        .addChild(ROUTE() \
         .setFromField("fraction_changed") \
         .setFromNode("OrbitClock") \
         .setToField("set_fraction") \
         .setToNode("CircleFishAngle") \
        ) \
        .addChild(ROUTE() \
         .setFromField("value_changed") \
         .setFromNode("CirclefishPath") \
         .setToField("set_translation") \
         .setToNode("Way") \
        ) \
        .addChild(ROUTE() \
         .setFromField("value_changed") \
         .setFromNode("CircleFishAngle") \
         .setToField("set_rotation") \
         .setToNode("Way") \
        ) \
       ) \
      ) \
     ) \
    ) \
# ==================== 
    .addChild(ProtoInstance() \
     .setName("CircleFishPT") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation//CircleFishPTPrototype_RoundTrip.x3d")
