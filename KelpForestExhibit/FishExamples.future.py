from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("FishExamples.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example instances of the Fish prototype.") \
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
     .setContent("8 December 2001") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("17 December 2002") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/FishExamples.x3d") \
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
     .setName("Fish") \
     .setUrl(["FishPrototype.wrl#Fish","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/FishPrototype.wrl#Fish","FishPrototype.x3d#Fish","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/FishPrototype.x3d#Fish"]) \
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
    ) \
    .addChild(ProtoInstance() \
     .setName("Fish") \
    ) \
    .addChild(Transform() \
     .setRotation([0,1,0,-1.57]) \
     .setTranslation([0,2,0]) \
     .addChild(ProtoInstance() \
      .setName("Fish") \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("0.5 0.5 0.5") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue("1 0 0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([0,1,0,-3.14]) \
     .setTranslation([0,1,-4]) \
     .addChild(ProtoInstance() \
      .setName("Fish") \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("1 0.5 0.5") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue("1 1 0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([0,1,0,1.57]) \
     .setTranslation([0,1,-4]) \
     .addChild(ProtoInstance() \
      .setName("Fish") \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("0.5 1 0.5") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue("0 0 1") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([0,1,0,-0.872]) \
     .setTranslation([-1,-2,0]) \
     .addChild(ProtoInstance() \
      .setName("Fish") \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("0.5 0.5 1") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue("1 1 0") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//FishExamples_RoundTrip.x3d")
