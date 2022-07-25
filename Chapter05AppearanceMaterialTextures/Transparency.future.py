from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("Transparency.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("This example shows a partially transparent Sphere in front of an opaque Box and Cylinder.") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/Transparency.x3d") \
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
     .setOrientation([-0.788,-0.614,-0.055,-0.12]) \
     .setPosition([-0.56,-0.64,3.37]) \
    ) \
    .addChild(Transform() \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,0,0]) \
        .setSpecularColor([0,1,0]) \
        .setTransparency(.4) \
       ) \
      ) \
      .setGeometry(Sphere(radius = .7) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([.707,.707,0,.707]) \
     .setTranslation([0,0,-6]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0,0,1]) \
       ) \
      ) \
      .setGeometry(Box() \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,1,-8]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0,.6,0]) \
       ) \
      ) \
      .setGeometry(Cylinder(height = 8, radius = .4) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures//Transparency_RoundTrip.x3d")
