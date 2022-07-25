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
     .setContent("TriangleSet2D.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example of TriangleSet2D showing multiple simple triangle shapes.") \
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
     .setContent("24 May 2008") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter10Geometry2D/TriangleSet2D.x3d") \
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
     .setDescription("TriangleSet2D example") \
     .setOrientation([0,1,0,0.159]) \
     .setPosition([1.11,0.9,8.06]) \
    ) \
    .addChild(Transform() \
     .setTranslation([-2.5,1,0]) \
     .addChild(Shape() \
      .setGeometry(TriangleSet2D() \
       .setVertices([3,-1.5,3,1.5,2,-1,.5,3,-.5,1.5,1.5,1.5]) \
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
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter10Geometry2D//TriangleSet2D_RoundTrip.x3d")
