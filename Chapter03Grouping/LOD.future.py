from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("LOD.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example for LOD node") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("14 November 2005") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("5 December 2018") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("https://github.com/create3000/x_ite/issues/38") \
     .setName("reference") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/LOD.x3d") \
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
    .addChild(NavigationInfo() \
     .setType(["FLY","ANY"]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book View - Near, all shapes shown") \
     .setOrientation([0.866,-0.497,0.058,-0.59]) \
     .setPosition([1.2,1.98,3.4]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book View - Farther, texture shown") \
     .setOrientation([0.866,-0.497,0.058,-0.59]) \
     .setPosition([1.47,2.43,4.18]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book View - Farthest, nothing shown") \
     .setPosition([0,0,12]) \
    ) \
    .addChild(LOD() \
     .setRange([5,9]) \
     .addChild(Group() \
      .setDEF("View3dModelAtCloseRange") \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0,0]) \
        ) \
       ) \
       .setGeometry(Box() \
       ) \
      ) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,1]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = 1.4) \
       ) \
      ) \
     ) \
     .addChild(Group() \
      .setDEF("View2dImageAtLongerRange") \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.8,0.8,0.8]) \
        ) \
# https://github.com/create3000/x_ite/issues/38 
        .setTexture(ImageTexture() \
         .setUrl(["LOD.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/LOD.jpg"]) \
        ) \
       ) \
       .setGeometry(Box() \
       ) \
      ) \
     ) \
     .addChild(WorldInfo() \
      .setInfo(["Not visible at farthest range"]) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping//LOD_RoundTrip.x3d")
