from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("PixelTexture.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("This example shows a colorful PixelTexture applied to the standard primitive shapes.") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/PixelTexture.x3d") \
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
     .setDescription("Book Viewpoint") \
     .setOrientation([0.736,0.615,-0.284,-0.32]) \
     .setPosition([-2.9,1.64,9.33]) \
    ) \
    .addChild(Transform() \
     .setTranslation([2,2,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture(repeatS = False, repeatT = False) \
        .setDEF("PixelColors") \
        .setImage([2,4,3,0xff0000,0xffff00,0x007700,0xff0077,0x0000ff,0xff7700,0x00ff77,0x888888]) \
       ) \
      ) \
      .setGeometry(Box() \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([-2,2,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
        .setUSE("PixelColors") \
       ) \
      ) \
      .setGeometry(Cone() \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([2,-2,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
        .setUSE("PixelColors") \
       ) \
      ) \
      .setGeometry(Cylinder() \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([-2,-2,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setTexture(PixelTexture() \
        .setUSE("PixelColors") \
       ) \
      ) \
      .setGeometry(Sphere() \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures//PixelTexture_RoundTrip.x3d")
