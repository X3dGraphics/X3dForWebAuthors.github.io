from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("TextureTransformTranslation.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("3 Boxes with the same PixelTexture and different TextureTransform translation values.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("2 February 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("2 February 2006") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("14 December 2014") \
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
     .setContent("Copyright (c) 2006, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/TextureTransformTranslation.x3d") \
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
     .setDescription("Book View") \
     .setOrientation([-0.893,0.449,0.032,0.16]) \
     .setPosition([0.5,1.27,9.24]) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,2,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
        .setDEF("Coloring") \
        .setImage([2,4,3,0xff0000,0xffff00,0x007700,0xff0077,0x0000ff,0xff7700,0x00ff77,0xffffff]) \
       ) \
       .setTextureTransform(TextureTransform() \
       ) \
      ) \
      .setGeometry(Box() \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([2,-2,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
        .setUSE("Coloring") \
       ) \
       .setTextureTransform(TextureTransform() \
        .setTranslation([.33,.5]) \
       ) \
      ) \
      .setGeometry(Box() \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([-2,-2,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
        .setUSE("Coloring") \
       ) \
       .setTextureTransform(TextureTransform() \
        .setTranslation([.25,.33]) \
       ) \
      ) \
      .setGeometry(Box() \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,2,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
        .setUSE("Coloring") \
       ) \
      ) \
      .setGeometry(Box() \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures//TextureTransformTranslation_RoundTrip.x3d")
