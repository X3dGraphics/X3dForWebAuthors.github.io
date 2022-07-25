from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("CircleFishLodPrototype.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Modifies an externally defined CircleFish prototype by adding Level of Detail (LOD)") \
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
     .setContent("1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("11 December 2001") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("17 October 2015") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishLodPrototype.x3d") \
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
    .addChild(ExternProtoDeclare() \
     .setAppinfo("Simple model of a fish swimming in a cirlce") \
     .setName("CircleFish") \
     .setUrl(["CircleFishPrototype.x3d#CircleFish","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPrototype.x3d#CircleFish","CircleFishPrototype.wrl#CircleFish","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPrototype.wrl#CircleFish"]) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("skinTextureUrl") \
      .setType("MFString") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("fishScale") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("fishColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("finColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("positionKey") \
      .setType("MFFloat") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("positionKeyValue") \
      .setType("MFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("orientationKey") \
      .setType("MFFloat") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("orientationKeyValue") \
      .setType("MFRotation") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("orbitTime") \
      .setType("SFTime") \
     ) \
    ) \
# new LOD prototype extends a previously defined prototype 
    .addChild(ProtoDeclare() \
     .setAppinfo("CircleFish prototype with LOD added") \
     .setName("CircleFishLod") \
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
       .setValue("0.0 0.125 0.25 0.375 0.5 0.625 0.750 0.875 1") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("positionKeyValue") \
       .setType("MFVec3f") \
       .setValue("1.5 0.5 0 1.3 0 -0.8 0 -0.5 -1.0 -1.3 0 -0.8 -1.5 0.5 0 -1.3 0 0.8 0 -0.5 1.0 1.3 0 0.8 1.5 0.5 0") \
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
       .setValue("0 1 0 -3.14 0 1 0 -1.57 0 1 0 0 0 1 0 1.57 0 1 0 3.14") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setName("orbitTime") \
       .setType("SFTime") \
       .setValue("45") \
      ) \
     ) \
     .setProtoBody(ProtoBody() \
      .addChild(LOD() \
       .setForceTransitions(True) \
       .setRange([20,40]) \
       .addChild(ProtoInstance() \
        .setDEF("NearInstance") \
        .setName("CircleFish") \
        .setIS(IS() \
         .addConnect(connect() \
          .setNodeField("skinTextureUrl") \
          .setProtoField("skinTextureUrl") \
         ) \
         .addConnect(connect() \
          .setNodeField("fishScale") \
          .setProtoField("fishScale") \
         ) \
         .addConnect(connect() \
          .setNodeField("fishColor") \
          .setProtoField("fishColor") \
         ) \
         .addConnect(connect() \
          .setNodeField("finColor") \
          .setProtoField("finColor") \
         ) \
         .addConnect(connect() \
          .setNodeField("positionKey") \
          .setProtoField("positionKey") \
         ) \
         .addConnect(connect() \
          .setNodeField("positionKeyValue") \
          .setProtoField("positionKeyValue") \
         ) \
         .addConnect(connect() \
          .setNodeField("orientationKey") \
          .setProtoField("orientationKey") \
         ) \
         .addConnect(connect() \
          .setNodeField("orientationKeyValue") \
          .setProtoField("orientationKeyValue") \
         ) \
         .addConnect(connect() \
          .setNodeField("orbitTime") \
          .setProtoField("orbitTime") \
         ) \
        ) \
       ) \
       .addChild(ProtoInstance() \
        .setDEF("MidRangeInstance") \
        .setName("CircleFish") \
# no skinTexture at midRange for better performance 
        .setIS(IS() \
         .addConnect(connect() \
          .setNodeField("fishScale") \
          .setProtoField("fishScale") \
         ) \
         .addConnect(connect() \
          .setNodeField("fishColor") \
          .setProtoField("fishColor") \
         ) \
         .addConnect(connect() \
          .setNodeField("finColor") \
          .setProtoField("finColor") \
         ) \
         .addConnect(connect() \
          .setNodeField("positionKey") \
          .setProtoField("positionKey") \
         ) \
         .addConnect(connect() \
          .setNodeField("positionKeyValue") \
          .setProtoField("positionKeyValue") \
         ) \
         .addConnect(connect() \
          .setNodeField("orientationKey") \
          .setProtoField("orientationKey") \
         ) \
         .addConnect(connect() \
          .setNodeField("orientationKeyValue") \
          .setProtoField("orientationKeyValue") \
         ) \
         .addConnect(connect() \
          .setNodeField("orbitTime") \
          .setProtoField("orbitTime") \
         ) \
        ) \
       ) \
# Disappear at far range 
       .addChild(WorldInfo() \
        .setInfo(["null node"]) \
       ) \
      ) \
     ) \
    ) \
# ==================== 
    .addChild(Anchor() \
     .setDescription("CircleFishLod Example") \
     .setParameter(["target=_blank"]) \
     .setUrl(["CircleFishLodExample.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishLodExample.x3d","CircleFishLodExample.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishLodExample.wrl"]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0,1,1]) \
        .setEmissiveColor([0,1,1]) \
       ) \
      ) \
      .setGeometry(Text() \
       .setString(["CircleFishLodPrototype","is a Prototype declaration file.","","To see an example using this new node,","click this text and view","CircleFishLodExample scene"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.7) \
       ) \
      ) \
     ) \
# Selectable Text design pattern has transparent Box and TouchSensor description as a tooltip 
     .addChild(Shape() \
      .setGeometry(Box(size = [12,5,.001]) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setTransparency(1) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//CircleFishLodPrototype_RoundTrip.x3d")
