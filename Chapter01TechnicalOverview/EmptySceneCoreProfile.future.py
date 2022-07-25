from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Core") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("EmptySceneCoreProfile.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Illustrate a minimalist scene using only Core profile nodes. Root nodes must either be allowed children nodes of a Grouping node, or a LayerSet node. Note that DOCTYPE, head/meta and Group/Metadata* elements can be deleted without losing scene validity.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly, Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("24 February 2014") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("26 February 2016") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("EmptyScene.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("should Metadata nodes inherit from X3DNode or X3DChildNode?") \
     .setName("TODO") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Rootnodes") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Increase X3D profile (or add component statements) to match if any other X3D nodes are added to this scene.") \
     .setName("info") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/EmptySceneCoreProfile.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("http://x3dgraphics.com/chapters/Chapter15MetadataInformation.html") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com") \
     .setName("reference") \
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
# Core profile can only contain WorldInfo and Metadata nodes. 
    .addChild(WorldInfo() \
     .setMetadata(MetadataSet() \
      .setName("NodeSet") \
      .setValue(MetadataBoolean() \
       .setName("BooleanData") \
       .setValue([true,false]) \
      ) \
      .setValue(MetadataDouble() \
       .setName("DoubleData") \
       .setValue([1,2,3]) \
      ) \
      .setValue(MetadataFloat() \
       .setName("FloatData") \
       .setValue([4,5,6]) \
      ) \
      .setValue(MetadataInteger() \
       .setName("IntegerData") \
       .setValue([7,8,9]) \
      ) \
      .setValue(MetadataString() \
       .setName("StringData") \
       .setValue(["Empty Scene","Core Profile"]) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter01TechnicalOverview//EmptySceneCoreProfile_RoundTrip.x3d")
