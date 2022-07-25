from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("OrderOfOperations2.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Illustration of Order of Operations: initial, intermediate and final results for scale, rotation, and translation operations.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("22 May 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("29 December 2015") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/OrderOfOperations2.x3d") \
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
     .setDescription("Order of operations 2") \
     .setOrientation([0.66238,-0.73267,0.15637,0.623402]) \
     .setPosition([-2,-2,4]) \
    ) \
    .addChild(Shape() \
     .setDEF("OriginSphere") \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setDiffuseColor([1,0.2,0.2]) \
      ) \
     ) \
     .setGeometry(Sphere(radius = 0.2) \
     ) \
    ) \
    .addChild(Shape() \
     .setDEF("InitialBox") \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
      ) \
     ) \
     .setGeometry(Box(size = [0.3,0.6,0.9]) \
      .setDEF("Box.3.6.9") \
     ) \
    ) \
    .addChild(Transform() \
     .setScale([3,2,1.5]) \
     .addChild(Shape() \
      .setDEF("ScaledBox") \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,0.5,0]) \
        .setTransparency(0.8) \
       ) \
      ) \
      .setGeometry(Box() \
       .setUSE("Box.3.6.9") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([0.3,0.3,0.3,1]) \
     .setScale([3,2,1.5]) \
     .addChild(Shape() \
      .setDEF("RotatedScaledBox") \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,.5,0]) \
        .setTransparency(.85) \
       ) \
      ) \
      .setGeometry(Box() \
       .setUSE("Box.3.6.9") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([0.3,0.3,0.3,1]) \
     .setScale([3,2,1.5]) \
     .setTranslation([1,1,0]) \
     .addChild(Shape() \
      .setDEF("TransformedBox") \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,.5,0]) \
       ) \
      ) \
      .setGeometry(Box() \
       .setUSE("Box.3.6.9") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping//OrderOfOperations2_RoundTrip.x3d")
