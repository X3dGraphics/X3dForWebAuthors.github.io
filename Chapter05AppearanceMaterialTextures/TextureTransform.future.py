from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("TextureTransform.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("An illustration of the same PixelTexture applied to a cone with different TextureTransform values") \
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
     .setContent("4 August 2011") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/TextureTransform.x3d") \
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
     .setSkyColor([0.98,0.98,0.98]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book View") \
     .setOrientation([-0.982,0.184,-0.044,1.37]) \
     .setPosition([0.99,6.24,1.57]) \
    ) \
    .addChild(Transform() \
     .setTranslation([2,0,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
        .setDEF("BrightStripes") \
        .setImage([2,4,3,0xff0000,0xffff00,0x007700,0xff0077,0x0000ff,0xff7700,0x00ff77,0xffffff]) \
       ) \
       .setTextureTransform(TextureTransform() \
        .setRotation(1.5708) \
        .setScale([2,2]) \
        .setTranslation([0.33,0.5]) \
       ) \
      ) \
      .setGeometry(Cone(height = 3) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([-2,0,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
        .setUSE("BrightStripes") \
       ) \
       .setTextureTransform(TextureTransform() \
        .setTranslation([.25,.33]) \
       ) \
      ) \
      .setGeometry(Cone(bottomRadius = 3, height = 1) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures//TextureTransform_RoundTrip.x3d")
