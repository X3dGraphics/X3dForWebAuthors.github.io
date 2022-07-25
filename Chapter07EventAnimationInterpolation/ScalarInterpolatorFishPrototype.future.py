from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ScalarInterpolatorFishPrototype.x3d") \
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
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPrototype.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/ScalarInterpolatorFishPrototype.x3d") \
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
     .setName("CircleFish") \
     .setProtoInterface(ProtoInterface() \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("skinTextureUrl") \
       .setType("MFString") \
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
          .setGeometry(Extrusion(creaseAngle = 0.57, crossSection = [-0.1,1.0,0.1,1,0.5,0.5,0.5,-0.5,0.1,-1,-0.1,-1,-0.5,-0.5,-0.5,0.5,-0.1,1], spine = [0,1,0,0,0.8,0,0,0.6,0,0,0.5,0,0,0.3,0,0,0.2,0,0,0,0]) \
           .setDEF("FishBodyExtrusion") \
           .setScale([0.03,0.03,0.05,0.3,0.05,0.45,0.1,0.5,0.05,0.45,0.05,0.2,0.03,0.4]) \
          ) \
         ) \
         .addChild(TimeSensor() \
          .setDEF("TransparencyTimer") \
          .setCycleInterval(3) \
          .setLoop(True) \
          .setStartTime(1) \
         ) \
         .addChild(ScalarInterpolator() \
          .setDEF("TransparencyValue") \
          .setKey([0,.5,1]) \
          .setKeyValue([0,1,0]) \
         ) \
         .addChild(ROUTE() \
          .setFromField("fraction_changed") \
          .setFromNode("TransparencyTimer") \
          .setToField("set_fraction") \
          .setToNode("TransparencyValue") \
         ) \
         .addChild(ROUTE() \
          .setFromField("value_changed") \
          .setFromNode("TransparencyValue") \
          .setToField("transparency") \
          .setToNode("FishColor") \
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
      ) \
     ) \
    ) \
# ==================== 
    .addChild(ProtoInstance() \
     .setName("CircleFish") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation//ScalarInterpolatorFishPrototype_RoundTrip.x3d")
