import jnius_config
jnius_config.set_classpath('.', '../../../jars/X3DJSAIL.3.3.full.jar')
from jnius import autoclass
from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("HelloWorld.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simple X3D scene example: Hello World!") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("30 October 2000") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("14 April 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("HelloWorld.tall.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("http://en.wikipedia.org/wiki/Hello_world") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://en.wikipedia.org/wiki/Hello#.22Hello.2C_World.22_computer_program") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://en.wikipedia.org/wiki/\"Hello,_World!\"_program") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://en.wikibooks.org/w/index.php?title=Computer_Programming/Hello_world") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.HelloWorldExample.net") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3D.org") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/realtime-3d/news/internationalization-x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/HelloWorld.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForAdvancedModeling/HelloWorldScenes") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter01TechnicalOverview/HelloWorld.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/license.html") \
     .setName("license") \
    ) \
    .addMeta(meta() \
     .setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit") \
     .setName("generator") \
    ) \
.addComments(CommentsBlock(""" Alternate encodings: VRML97, X3D ClassicVRML Encoding, X3D Compressed Binary Encoding (CBE), X3DOM, JSON """)) \
    .addMeta(meta() \
     .setContent("HelloWorld.wrl") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("HelloWorld.x3dv") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("HelloWorld.x3db") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("HelloWorld.xhtml") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("HelloWorld.json") \
     .setName("reference") \
    ) \
   ) \
   .setScene(Scene() \
.addComments(CommentsBlock(""" Example scene to illustrate X3D nodes and fields (XML elements and attributes) """)) \
    .addChild(WorldInfo() \
     .setTitle("Hello world!") \
    ) \
    .addChild(Group() \
     .addChild(Viewpoint() \
      .setDEF("ViewUpClose") \
      .setCenterOfRotation([0,-1,0]) \
      .setDescription("Hello world!") \
      .setPosition([0,-1,7]) \
     ) \
     .addChild(Transform() \
      .setRotation([0,1,0,3]) \
      .addChild(Shape() \
       .setGeometry(Sphere() \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDEF("MaterialLightBlue") \
         .setDiffuseColor([0.1,0.5,1]) \
        ) \
        .setTexture(ImageTexture() \
         .setDEF("ImageCloudlessEarth") \
         .setUrl(["earth-topo.png","earth-topo.jpg","earth-topo-small.gif","http://www.web3d.org/x3d/content/examples/Basic/earth-topo.png","http://www.web3d.org/x3d/content/examples/Basic/earth-topo.jpg","http://www.web3d.org/x3d/content/examples/Basic/earth-topo-small.gif"]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([0,-2,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setDEF("TextMessage") \
        .setString(["Hello","world!"]) \
        .setFontStyle(FontStyle() \
         .setJustify(["MIDDLE","MIDDLE"]) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setUSE("MaterialLightBlue") \
        ) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/HelloWorld.newf.x3d")
