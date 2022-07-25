from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("CADInterchange") \
   .setVersion("3.3") \
   .setHead(head() \
# Alternative to profile='CADInterchange' is X3D profile='Interchange' with <component level='1' name='CADGeometry' /> 
    .addMeta(meta() \
     .setContent("IndexedQuadSet.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("A simple example of the use of the IndexedQuadSet node.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("31 August 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("2 September 2013") \
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
     .setContent("Copyright 2008, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter13GeometryTrianglesQuadrilaterals/IndexedQuadSet.x3d") \
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
     .setDescription("IndexedQuadSet example") \
    ) \
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Transform() \
     .addChild(Shape() \
      .setGeometry(IndexedQuadSet(solid = False) \
       .setIndex([0,1,2,3,4,5,6,7]) \
       .setCoord(Coordinate() \
        .setPoint([-6,-2,0,-1,-2,0,-1,2,0,-6,2,0,1,-2,0,6,-2,0,6,2,0,1,2,0]) \
       ) \
       .setColor(Color() \
        .setColor([0.2,0.2,0.2,1,0.058824,0.227451,0.4,1,0.121569,0,0.007843,0.960784,0.6,0.235294,0,0.94902,1,0.380392,0.239216,1,0.886275,1,0.121569,0.964706]) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter13GeometryTrianglesQuadrilaterals//IndexedQuadSet_RoundTrip.x3d")