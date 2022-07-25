from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("Text.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simple Text node: hello X3D!") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("25 March 2005") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright (c) Don Brutzman and Leonard Daly, 2005") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/Text.x3d") \
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
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Text example") \
     .setPosition([0,0,3]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book view") \
     .setPosition([0.89,-1.11,2.33]) \
    ) \
    .addChild(Shape() \
     .setGeometry(Text() \
      .setDEF("HelloText") \
      .setString(["hello","X3D!"]) \
      .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
       .setDEF("CenteredFontStyle") \
      ) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setDEF("DefaultMaterial") \
       .setDiffuseColor([.2,.2,.2]) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter02GeometryPrimitives//Text_RoundTrip.x3d")
