from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("HalfMoonGroup.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("This is a group of HalfMoon fish implemented as ProtoInstances.") \
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
     .setContent("22 December 2002") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonGroup.x3d") \
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
     .setName("HalfMoon") \
     .setUrl(["HalfMoonPrototype.x3d#HalfMoon","http://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonPrototype.x3d#HalfMoon","HalfMoonPrototype.wrl#HalfMoon","http://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonPrototype.wrl#HalfMoon"]) \
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
    .addChild(Viewpoint() \
     .setDescription("HalfMoon Group") \
     .setOrientation([0,1,0,1.57]) \
     .setPosition([20,0,0]) \
    ) \
    .addChild(Transform() \
     .setTranslation([14,1,0]) \
     .addChild(ProtoInstance() \
      .setName("HalfMoon") \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue("1 0 0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([14.5,0,0]) \
     .addChild(ProtoInstance() \
      .setName("HalfMoon") \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue("1 1 0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([14,-1,0]) \
     .addChild(ProtoInstance() \
      .setName("HalfMoon") \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue("1 1 0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([13.5,0,0]) \
     .addChild(ProtoInstance() \
      .setName("HalfMoon") \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue("1 1 0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([15.5,0,0]) \
     .addChild(ProtoInstance() \
      .setName("HalfMoon") \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue("1 1 0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([12.5,0,0]) \
     .addChild(ProtoInstance() \
      .setName("HalfMoon") \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue("1 1 0") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//HalfMoonGroup_RoundTrip.x3d")
