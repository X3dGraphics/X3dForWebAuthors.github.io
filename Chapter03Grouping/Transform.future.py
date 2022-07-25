from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("Transform.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example for Transform node") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("13 November 2005") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("23 May 2009") \
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
     .setContent("Copyright (c) 2005, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/Transform.x3d") \
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
     .setOrientation([-0.682,-0.707,-0.187,0.68]) \
     .setPosition([-3.42,3.73,6.04]) \
    ) \
    .addChild(Transform() \
     .setRotation([0.577,0.577,0.577,1]) \
     .setTranslation([2,0,1]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,0,0]) \
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
       .setMaterial(Material() \
        .setDiffuseColor([1,1,0]) \
       ) \
      ) \
      .setGeometry(Sphere() \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([1,0,0,.707]) \
     .setTranslation([-2,0,-1]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0,1,0]) \
       ) \
      ) \
      .setGeometry(Cylinder() \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([1,0,0,-.707]) \
     .setTranslation([0,-2,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0,0,1]) \
       ) \
      ) \
      .setGeometry(Cone() \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping//Transform_RoundTrip.x3d")
