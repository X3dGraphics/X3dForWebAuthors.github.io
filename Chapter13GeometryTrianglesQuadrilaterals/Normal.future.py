from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("Normal.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("A simple illustration of the Normal node on the coloring of triangles.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("22 May 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("15 March 2009") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter13GeometryTrianglesQuadrilaterals/Normal.x3d") \
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
    .addChild(Viewpoint() \
     .setDescription("Book View") \
     .setOrientation([0,-1,0,0.06]) \
     .setPosition([0,0.82,11.21]) \
    ) \
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Transform() \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setDEF("Look") \
       .setMaterial(Material() \
        .setDiffuseColor([0,.5,.6]) \
        .setShininess(.9) \
        .setSpecularColor([.7,0,0]) \
       ) \
      ) \
      .setGeometry(IndexedTriangleStripSet(solid = False) \
       .setIndex([9,10,11,12,13,-1,14,15,16,17,-1]) \
       .setCoord(Coordinate() \
        .setDEF("Points") \
        .setPoint([-4,1,3,-2,2,1.5,-3,4,0.5,-2,3,1.5,0,4,0.0,2,3,1.5,5,5,-2.5,4,3,1.5,6,4,2.0,-4,1,3,-2,2,1.0,-3,4,0.0,-2,3,1.0,0,4,0.0,2,3,1.0,5,5,-2.0,4,3,1.5,6,4,2.0,0,-2,4,1,-3,3.5,1.5,-1.5,3,0,-1,2,-.5,0,2.5,-1.5,1,3,-2,0,3.5,-3,-2,2,-3,-4,3,2,-4,-2,0,-3,-.5,1.3,-1.5,-1,4,-2,-1.5,4.2,-4.2,-1,3,-6,-.5]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,-3,0]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setUSE("Look") \
      ) \
      .setGeometry(IndexedTriangleStripSet(solid = False) \
       .setIndex([9,10,11,12,13,-1,14,15,16,17,-1]) \
       .setCoord(Coordinate() \
        .setUSE("Points") \
       ) \
       .setNormal(Normal() \
        .setVector([0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,1,0,0,0,1,0,0,0,1,1,0,0,0,1,0,0,0,1,1,0,0,0,1,0,0,0,1]) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter13GeometryTrianglesQuadrilaterals//Normal_RoundTrip.x3d")
