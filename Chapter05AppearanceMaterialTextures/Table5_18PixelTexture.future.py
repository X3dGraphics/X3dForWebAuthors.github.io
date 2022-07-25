from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("Table5_18PixelTexture") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("PixelTexture example for Table 5.18") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("18 December 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("2 April 2017") \
     .setName("modified") \
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
     .setContent("X3D, PixelTexture") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/Table5_18PixelTexture") \
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
     .setSkyColor([0,0,1]) \
    ) \
    .addChild(Transform() \
     .setDEF("Checkerboard") \
     .setTranslation([0,0,-10]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTextureTransform(TextureTransform() \
        .setScale([500,500]) \
       ) \
       .setTexture(PixelTexture() \
        .setImage([2,2,3,0xE6B5FD,0xFFDBB7,0xFFDBB7,0xE6B5FD]) \
       ) \
      ) \
      .setGeometry(Box(size = [1000,1000,.01]) \
      ) \
     ) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("View All") \
     .setPosition([0,0,20]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Empty Image") \
     .setPosition([0,5,5]) \
    ) \
    .addChild(Transform() \
     .setDEF("EmptyImage") \
     .setRotation([1,1,0,1]) \
     .setTranslation([0,5,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
       ) \
      ) \
      .setGeometry(Box() \
       .setDEF("StandardBox") \
      ) \
     ) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Black and white PixelTexture") \
     .setPosition([-5,0,5]) \
    ) \
    .addChild(Transform() \
     .setDEF("BW") \
     .setRotation([1,1,0,1]) \
     .setTranslation([-5,0,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
        .setImage([1,2,1,0xFF,0x00]) \
       ) \
      ) \
      .setGeometry(Box() \
       .setUSE("StandardBox") \
      ) \
     ) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Black and white with Alpha PixelTexture") \
     .setPosition([5,0,5]) \
    ) \
    .addChild(Transform() \
     .setDEF("AlphaBW") \
     .setRotation([1,1,0,1]) \
     .setTranslation([5,0,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
        .setImage([2,1,2,0xCCFF,0x2277]) \
       ) \
      ) \
      .setGeometry(Box() \
       .setUSE("StandardBox") \
      ) \
     ) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("RGB PixelTexture") \
     .setPosition([-5,-5,5]) \
    ) \
    .addChild(Transform() \
     .setDEF("RGB") \
     .setRotation([1,1,0,1]) \
     .setTranslation([-5,-5,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
        .setImage([2,4,3,0xFF0000,0x00FF00,0,0,0,0,0xFFFFFF,0xFFFF00]) \
       ) \
      ) \
      .setGeometry(Box() \
       .setUSE("StandardBox") \
      ) \
     ) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("RGB with Alpha PixelTexture") \
     .setPosition([5,-5,5]) \
    ) \
    .addChild(Transform() \
     .setDEF("AlphaRGB") \
     .setRotation([1,1,0,1]) \
     .setTranslation([5,-5,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
        .setImage([3,2,4,-16776961,0x00FF00FF,0x0000FFFF,-16777089,0x00FF007F,0x0000FF7F]) \
       ) \
      ) \
      .setGeometry(Box() \
       .setUSE("StandardBox") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures//Table5_18PixelTexture_RoundTrip.x3d")
