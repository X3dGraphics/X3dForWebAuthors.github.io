from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("WorldInfo.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simple examples of meta statements, comments, WorldInfo node and a MetadataString node.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("3 March 2018") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("3 March 2018") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Information in head and meta elements is retained after a scene is parsed and loaded, and can be referenced via the Scene Access Interface (SAI) or Document Object Model (DOM)") \
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
     .setContent("Copyright 2018, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/WorldInfo.x3d") \
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
# Comments can appear between nodes (XML elements) but are not retained after a scene is parsed, loaded and playing 
    .addChild(WorldInfo() \
     .setDEF("MyWorldInfo") \
     .setInfo(["Metadata strings","can go here","as string array values"]) \
     .setTitle("WorldInfo.x3d Example Scene") \
# WorldInfo can contain Metadata nodes in X3D but not in VRML97. 
     .setMetadata(MetadataString() \
      .setDEF("MyMetadataStringNode") \
      .setName("TestNode") \
      .setReference("X3D") \
      .setValue(["Hello","WorldInfo"]) \
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
     .setUrl(["WorldInfoIndex.html","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/WorldInfoIndex.html"]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["View scene source","to see","WorldInfo example"]) \
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

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter15Metadata//WorldInfo_RoundTrip.x3d")
