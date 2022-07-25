from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("TriangleSet.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("A simple example of the use of the TriangleSet node.") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter13GeometryTrianglesQuadrilaterals/TriangleSet.x3d") \
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
     .setDescription("Book View 1") \
     .setOrientation([0,-1,0,0.05]) \
     .setPosition([0.13,2.51,11.24]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book View 2") \
     .setOrientation([-0.247,-0.964,-0.101,0.695]) \
     .setPosition([-4.96,3.13,7.09]) \
    ) \
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Transform() \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0,0,1]) \
        .setEmissiveColor([0,.2,0]) \
        .setShininess(.8) \
        .setSpecularColor([.3,0,0]) \
       ) \
      ) \
      .setGeometry(TriangleSet(solid = False) \
       .setCoord(Coordinate() \
        .setPoint([-4,1,3,-2,2,1,-3,4,0,0,2,0,2,3,1,-2,3,1,5,5,-2,4,3,1,6,4,2]) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter13GeometryTrianglesQuadrilaterals//TriangleSet_RoundTrip.x3d")
