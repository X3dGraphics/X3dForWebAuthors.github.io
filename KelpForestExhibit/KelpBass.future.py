from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("KelpBass.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Kelp bass is a type of fish.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("1 June 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("18 August 2009") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("translator") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBass.x3d") \
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
     .setAppinfo("Simple model of a fish swimming in a circle") \
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
    .addChild(Viewpoint() \
     .setDescription("Kelp Bass") \
     .setOrientation([0.0,1.0,0.0,120.0]) \
     .setPosition([3.0,1.0,4.0]) \
    ) \
    .addChild(Transform() \
     .setRotation([0.0,1.0,0.0,60.0]) \
     .setTranslation([0.0,0.5,0.0]) \
     .addChild(ProtoInstance() \
      .setDEF("KelpBass1") \
      .setName("CircleFish") \
      .addFieldValue(fieldValue() \
       .setName("skinTextureUrl") \
       .setValue("\"KelpBassPatch.jpg\" \"http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBassPatch.jpg\"") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("0.5 0.72 0.3") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue("0.33 0.4 0.2") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("positionKey") \
       .setValue("0.0 0.3 0.6 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("positionKeyValue") \
       .setValue("0.0 0.0 1.0 1.0 0.0 0.0 0.0 0.0 -1.0 0.0 0.0 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orbitTime") \
       .setValue("80.0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .addChild(ProtoInstance() \
      .setDEF("KelpBass2") \
      .setName("CircleFish") \
      .addFieldValue(fieldValue() \
       .setName("skinTextureUrl") \
       .setValue("\"KelpBassPatch.jpg\" \"http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBassPatch.jpg\"") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("0.5 0.72 0.3") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishColor") \
       .setValue("0.33 0.4 0.2") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("positionKey") \
       .setValue("0.0 0.3 0.6 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("positionKeyValue") \
       .setValue("0.0 0.0 1.0 1.0 0.0 0.0 0.0 0.0 -1.0 0.0 0.0 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orbitTime") \
       .setValue("60.0") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//KelpBass_RoundTrip.x3d")
