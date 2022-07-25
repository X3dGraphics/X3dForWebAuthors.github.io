from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("StripedSurfPerch.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Create a new fish type through configuration of the CircleFishLod prototype.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Ildeniz Duman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("Jeff Weekley") \
     .setName("translator") \
    ) \
    .addMeta(meta() \
     .setContent("1 May 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("25 February 2001") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("21 March 2009") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/StripedSurfPerch.x3d") \
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
     .setAppinfo("CircleFish prototype with LOD added") \
     .setName("CircleFishLod") \
     .setUrl(["CircleFishLodPrototype.x3d#CircleFishLod","http://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishLodPrototype.x3d#CircleFishLod","CircleFishLodPrototype.wrl#CircleFishLod","http://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishLodPrototype.wrl#CircleFishLod"]) \
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
    .addChild(Viewpoint() \
     .setDescription("Striped SurfPerch") \
     .setOrientation([0.0,1.0,0.0,89.9]) \
     .setPosition([4.0,0.0,-1.0]) \
    ) \
    .addChild(ProtoInstance() \
     .setDEF("StripedSurfPerch") \
     .setName("CircleFishLod") \
     .addFieldValue(fieldValue() \
      .setName("skinTextureUrl") \
      .setValue("\"StripedSurfPerchPatch.jpg\" \"http://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/StripedSurfPerchPatch.jpg\"") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("fishScale") \
      .setValue("0.39 0.26 0.2") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("finColor") \
      .setValue("0.73 0.56 0.56") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("positionKey") \
      .setValue("0 0.25 0.5 0.75 1") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("positionKeyValue") \
      .setValue("0 0 -0.5 0.5 0 0 0 0 0.5 -0.5 0 0 0 0 -0.5") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("orientationKey") \
      .setValue("0 0.25 0.5 0.75 1") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("orientationKeyValue") \
      .setValue("0 1 0 -6.28 0 1 0 -3.14 0 1 0 0 0 1 0 3.14 0 1 0 6.28") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("orbitTime") \
      .setValue("80.0") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//StripedSurfPerch_RoundTrip.x3d")
