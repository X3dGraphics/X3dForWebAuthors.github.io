from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("MetadataNodeExamples.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simple examples of meta statements, comments, WorldInfo node and typed metadata nodes.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("30 September 2011") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("20 May 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Information in head and meta elements is retained after a scene is parsed and loaded, and can be referenced via the Scene Access Interface (SAI) or Document Object Model (DOM)") \
     .setName("info") \
    ) \
    .addMeta(meta() \
     .setContent("Authoring note: MetadataBoolean requires X3D version 3.3, as used in this example scene") \
     .setName("info") \
    ) \
    .addMeta(meta() \
     .setContent("The following referenced chapter is published online but was not included in the printed book.") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Chapter15MetadataInformation.html") \
     .setName("reference") \
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
     .setContent("http://www.web3d.org/x3d/content/examples/X3dResources.html") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright 2006, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/MetadataNodeExamples.x3d") \
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
# May 2017: X3D Specification clarification allows Metadata nodes at top level of Scene graph. 
    .addChild(MetadataString() \
     .setName("TestRootMetadataNode") \
     .setValue(["Test satisfactory.","Note that all SFString values must be quoted."]) \
    ) \
# Comments can appear between nodes (XML elements) but are not retained after a scene is parsed, loaded and playing 
    .addChild(WorldInfo() \
     .setDEF("MyWorldInfo") \
     .setInfo(["Metadata strings","can go here","as string array values"]) \
     .setTitle("MetadataNodeExamples.x3d Example Scene") \
# Structured information can go in Metadata nodes. Note that any X3D node can contain a single Metadata node with containerField='metadata' 
     .setMetadata(MetadataSet() \
      .setDEF("MyMetadataSetNode") \
      .setName("Metadata_name") \
      .setReference("SomeReferenceStandard 1.2.3c") \
# MetadataSet can also contain multiple Metadata nodes with containerField='value' 
      .setValue(MetadataBoolean() \
       .setDEF("MyMetadataBooleanNode") \
       .setName("Coin Flip") \
       .setReference("MetadataBoolean allowed in X3D v3.3 and later") \
       .setValue([true,false,true,false]) \
      ) \
      .setValue(MetadataDouble() \
       .setDEF("MyMetadataDoubleNode") \
       .setName("Metadata_name") \
       .setReference("SomeReferenceStandard 1.2.3c") \
       .setValue([3.141592658,2.71812181]) \
      ) \
      .setValue(MetadataFloat() \
       .setDEF("MyMetadataFloatNode") \
       .setName("Metadata_name") \
       .setReference("SomeReferenceStandard 1.2.3c") \
       .setValue([9.8,6.023e+23]) \
      ) \
      .setValue(MetadataInteger() \
       .setDEF("MyMetadataIntegerNode") \
       .setName("Metadata_name") \
       .setReference("SomeReferenceStandard 1.2.3c") \
       .setValue([6,28,496]) \
      ) \
      .setValue(MetadataString() \
       .setDEF("MyMetadataStringNode") \
       .setName("Metadata_name") \
       .setReference("SomeReferenceStandard 1.2.3c") \
       .setValue(["Part 27","P27","p27"]) \
      ) \
      .addValue(MetadataSet() \
       .setDEF("NestedMetadataSetNode") \
       .setName("TestNestedMetadataSetNodes") \
       .setValue(MetadataString() \
        .setUSE("MyMetadataStringNode") \
       ) \
       .setValue(MetadataInteger() \
        .setUSE("MyMetadataIntegerNode") \
       ) \
       .setValue(MetadataFloat() \
        .setUSE("MyMetadataFloatNode") \
       ) \
       .setValue(MetadataFloat() \
        .setName("coefficients") \
        .setValue([3.141592653,2.7128,1,0]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Background() \
     .setSkyColor([0,0.439216,0.760784]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("View scene source to see metadata examples") \
     .setPosition([0,0,9]) \
    ) \
    .addChild(Anchor() \
     .setDescription("Load scene index page") \
     .setParameter(["target=_blank"]) \
     .setUrl(["MetadataNodeExamplesIndex.html","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/MetadataNodeExamplesIndex.html"]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["View scene source","to see","metadata examples"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,0.992157,0.039216]) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter15Metadata//MetadataNodeExamples_RoundTrip.x3d")
