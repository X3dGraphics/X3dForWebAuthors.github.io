from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addComponent(component() \
     .setLevel(2) \
     .setName("Geometry2D") \
    ) \
    .addMeta(meta() \
     .setContent("Arc2D.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example of Arc2D node showing semicircular arcs") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("17 April 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("13 January 2014") \
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
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter10Geometry2D/Arc2D.x3d") \
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
     .setDescription("Arc2D example") \
    ) \
    .addChild(Transform() \
     .setTranslation([-2.5,1,0]) \
     .addChild(Shape() \
      .setGeometry(Arc2D(radius = 3) \
       .setEndAngle(0) \
       .setStartAngle(4.5) \
      ) \
      .setAppearance(Appearance() \
       .setDEF("MagentaAppearance") \
       .setMaterial(Material() \
        .setDiffuseColor([1,0,0]) \
        .setEmissiveColor([0,0,1]) \
        .setSpecularColor([0,.8,0]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setScale([1,.5,0]) \
     .setTranslation([-1,-1.5,0]) \
     .addChild(Shape() \
      .setGeometry(Arc2D(radius = 1.5) \
       .setEndAngle(.78) \
       .setStartAngle(6) \
      ) \
      .setAppearance(Appearance() \
       .setUSE("MagentaAppearance") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter10Geometry2D//Arc2D_RoundTrip.x3d")