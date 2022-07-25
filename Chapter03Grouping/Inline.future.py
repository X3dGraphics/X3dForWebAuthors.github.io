from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("Inline.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Inline example that loads Hello World example.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("12 October 2013") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("26 October 2015") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("X3D profile in this scene must be suffient to support Inline scene in order to properly set up the X3D player.") \
     .setName("info") \
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
     .setContent("../HelloWorld.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#InlinesPrototypes") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("InlineKelpForest.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright Don Brutzman and Leonard Daly 2007") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/Inline.x3d") \
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
# The following url is an ordered list of multiple addresses that support the following use cases. 
# Use case: (1a) .x3d on local disk or (1b) web server query looks on local server 
# Use case: (2) Older VRML97 browser unable to read X3D, reads .wrl version instead (backwards compatibility) 
# Use case: (3) local copy not available, retrieve from permanent server address 
# Use case: (4) combination of cases (2) and (3), VRML97 on remote server 
# TODO consider simpler scene to illustrate Inline, also consider adding Viewpoint 
    .addChild(Inline() \
     .setDEF("HelloWorldInline") \
     .setUrl(["../HelloWorld.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/HelloWorld.x3d","../HelloWorld.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/HelloWorld.wrl"]) \
    ) \
# Background nodes in the parent scene are automatically bound before any Background nodes from child Inline scenes 
    .addChild(Background() \
     .setSkyColor([0.560784,0.654902,1]) \
    ) \
# Viewpoints in the parent and children scenes appear in order of definition, allowing authors to predict results 
    .addChild(Viewpoint() \
     .setDEF("ViewFartherBack") \
     .setCenterOfRotation([0,-1,0]) \
     .setDescription("Hello world!") \
     .setPosition([0,-1,9]) \
    ) \
# This box encloses the world but not the text found in the Inline scene HelloWorld.x3d 
    .addChild(Shape() \
     .setGeometry(Box(size = [2.1,2.1,2.21]) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setDiffuseColor([1,1,1]) \
       .setTransparency(0.5) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping//Inline_RoundTrip.x3d")
