from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("TextureLocalGaribaldi.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Instantiate the Garibaldi fish prototype using a local texture file.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Ildeniz Duman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("1 June 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("29 October 2012") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Garibaldi.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/TextureLocalGaribaldi.x3d") \
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
     .setName("CircleFish") \
     .setUrl(["CircleFishPrototype.x3d#CircleFish","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/CircleFishPrototype.x3d#CircleFish","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPrototype.x3d#CircleFish","CircleFishPrototype.wrl#CircleFish","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/CircleFishPrototype.wrl#CircleFish","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPrototype.wrl#CircleFish"]) \
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
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Garibaldi") \
     .setOrientation([0,1,0,0.42]) \
     .setPosition([0.66,0,0.42]) \
    ) \
    .addChild(ProtoInstance() \
     .setName("CircleFish") \
     .addFieldValue(fieldValue() \
      .setName("skinTextureUrl") \
      .setValue("\"GaribaldiPatch.jpg\" \"http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/GaribaldiPatch.jpg\"") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("fishScale") \
      .setValue("1.0 0.39 0.4") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("finColor") \
      .setValue("0.9 0.66 0.4") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("fishColor") \
      .setValue(".97 .75 .3") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("positionKey") \
      .setValue("0.0 0.4 0.7 0.95 1.0") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("positionKeyValue") \
      .setValue("0.0 0.0 0.0 0.5 0.0 0.0 0.0 0.0 0.0 0.5 0.0 0.0 0.2 0.0 0.0") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("orientationKey") \
      .setValue("0.0 1.0") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("orientationKeyValue") \
      .setValue("0.0 1.0 0.0 90.0 0.0 1.0 0.0 90.0") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("orbitTime") \
      .setValue("80.0") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures//TextureLocalGaribaldi_RoundTrip.x3d")
