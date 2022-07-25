from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("RubberLipGroup.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("A group of RubberLip fish, instanced using the CircleFish prototype.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Circular fish behavior is embedded in prototype, instead the circular path needs to be used in external files or possibly parameterized.") \
     .setName("warning") \
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
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RubberLipGroup.x3d") \
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
     .setUrl(["CircleFishPrototype.wrl#CircleFish","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPrototype.wrl#CircleFish","CircleFishPrototype.x3d#CircleFish","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPrototype.x3d#CircleFish"]) \
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
    .addChild(ProtoInstance() \
     .setName("CircleFish") \
     .addFieldValue(fieldValue() \
      .setName("skinTextureUrl") \
      .setValue("\"RubberLip.jpg\" \"http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RubberLip.jpg\"") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("fishScale") \
      .setValue("1.0 4.0 1.0") \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([-4.0,1.0,0.0]) \
     .addChild(ProtoInstance() \
      .setName("CircleFish") \
      .addFieldValue(fieldValue() \
       .setName("skinTextureUrl") \
       .setValue("\"RubberLip.jpg\" \"http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RubberLip.jpg\"") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("1.0 4.0 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("positionKey") \
       .setValue("0.0 0.5 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("positionKeyValue") \
       .setValue("0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orientationKey") \
       .setValue("0.0 0.5 0.5 1.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orientationKeyValue") \
       .setValue("0.0 1.0 0.0 -180.0 0.0 1.0 0.0 -180.0 0.0 1.0 0.0 0.0 0.0 1.0 0.0 0.0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("orbitTime") \
       .setValue("60.0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([0.0,1.0,0.0,-90.0]) \
     .setTranslation([0.0,2.0,0.0]) \
     .addChild(ProtoInstance() \
      .setName("CircleFish") \
      .addFieldValue(fieldValue() \
       .setName("skinTextureUrl") \
       .setValue("\"RubberLip.jpg\" \"http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RubberLip.jpg\"") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("1.0 4.0 1.0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([0.0,1.0,0.0,-180.0]) \
     .setTranslation([0.0,1.0,-4.0]) \
     .addChild(ProtoInstance() \
      .setName("CircleFish") \
      .addFieldValue(fieldValue() \
       .setName("skinTextureUrl") \
       .setValue("\"RubberLip.jpg\" \"http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RubberLip.jpg\"") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("1.0 4.0 1.0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([0.0,1.0,0.0,90.0]) \
     .setTranslation([0.0,4.0,0.0]) \
     .addChild(ProtoInstance() \
      .setName("CircleFish") \
      .addFieldValue(fieldValue() \
       .setName("skinTextureUrl") \
       .setValue("\"RubberLip.jpg\" \"http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RubberLip.jpg\"") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("1.0 4.0 1.0") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([0.0,1.0,0.0,-50.0]) \
     .setTranslation([-1.0,-2.0,0.0]) \
     .addChild(ProtoInstance() \
      .setName("CircleFish") \
      .addFieldValue(fieldValue() \
       .setName("skinTextureUrl") \
       .setValue("\"RubberLip.jpg\" \"http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RubberLip.jpg\"") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("fishScale") \
       .setValue("1.0 4.0 1.0") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//RubberLipGroup_RoundTrip.x3d")
