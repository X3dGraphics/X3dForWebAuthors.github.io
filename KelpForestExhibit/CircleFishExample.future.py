from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("CircleFishExample.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("This is a circle fish using the CircleFish prototype. Fish size max width is 10 cm (X-axis) length is 1 m (Y-axis) max height is 1 m (Z-axis)") \
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
     .setContent("21 March 2009") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishExample.x3d") \
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
     .setDescription("Circle Fish") \
    ) \
    .addChild(ProtoInstance() \
     .setName("CircleFish") \
# fieldValue tags revise default values 
     .addFieldValue(fieldValue() \
      .setName("skinTextureUrl") \
      .setValue("\"blue.jpg\" \"http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/blue.jpg\"") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("fishScale") \
      .setValue("1 0.5 1") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("finColor") \
      .setValue("0 0 1") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("positionKey") \
      .setValue("0 1") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("positionKeyValue") \
      .setValue("0 0 0 1 1 1") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("orbitTime") \
      .setValue("10") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//CircleFishExample_RoundTrip.x3d")
