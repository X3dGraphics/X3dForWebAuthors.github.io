from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("TextureTransformFull.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Two Boxes with the same PixelTexture showing different TextureTransform field values.") \
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
     .setContent("13 December 2014") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/TextureTransformFull.x3d") \
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
     .setOrientation([0.42,0.905,-0.061,-0.83]) \
     .setPosition([-4.02,1.24,3.61]) \
    ) \
    .addChild(Transform() \
     .setTranslation([2,0,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture(repeatS = False, repeatT = False) \
        .setDEF("ColorTexture") \
        .setImage([2,4,3,0xff0000,0xffff00,0x007700,0xff0077,0x0000ff,0xff7700,0x00ff77,0x888888]) \
       ) \
      ) \
      .setGeometry(Box() \
       .setDEF("DefaultBox") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([-2,0,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
        .setUSE("ColorTexture") \
       ) \
       .setTextureTransform(TextureTransform() \
        .setCenter([.25,.33]) \
        .setRotation(.707) \
        .setScale([2,.333]) \
        .setTranslation([.33,.25]) \
       ) \
       .setMaterial(Material() \
       ) \
      ) \
      .setGeometry(Box() \
       .setUSE("DefaultBox") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures//TextureTransformFull_RoundTrip.x3d")
