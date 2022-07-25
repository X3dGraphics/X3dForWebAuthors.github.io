from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interactive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("BoundingBoxIllustration.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simple Inline example illustrating bounding box coverage. Bounding box lines are not typically rendered.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("28 December 2005") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("2 September 2013") \
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
     .setContent("Copyright Don Brutzman and Leonard Daly 2007") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/BoundingBoxIllustration.x3d") \
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
     .setDescription("Bounding box illustration") \
     .setPosition([0,0,15]) \
    ) \
    .addChild(Group(bboxSize = [12,4,4]) \
     .addChild(Inline() \
      .setUrl(["../Chapter02GeometryPrimitives/GeometryPrimitiveNodes.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/GeometryPrimitiveNodes.x3d","../Chapter02GeometryPrimitives/GeometryPrimitiveNodes.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/GeometryPrimitiveNodes.wrl"]) \
     ) \
     .addChild(Shape() \
      .setGeometry(IndexedLineSet(coordIndex = [0,1,2,3,0,-1,4,5,6,7,4,-1,0,4,-1,1,5,-1,2,6,-1,3,7,-1]) \
       .setCoord(Coordinate() \
        .setPoint([-6,-2,-2,-6,-2,2,6,-2,2,6,-2,-2,-6,2,-2,-6,2,2,6,2,2,6,2,-2]) \
       ) \
      ) \
      .setAppearance(Appearance() \
# lines are only lit by emissiveColor 
       .setMaterial(Material() \
        .setEmissiveColor([0,0.8,0.8]) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping//BoundingBoxIllustration_RoundTrip.x3d")
