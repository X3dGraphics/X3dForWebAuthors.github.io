from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("LineSetComparison.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("2 September 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("3 February 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("A simple wireframe cube, comparing two functionally equivalent nodes: IndexedLineSet (per-vertex coloring) with LineSet (per-segment coloring). Keeping track of how each node \"connects the dots\" is simply a book-keeping problem.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/LineSetComparison.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter13PointsLinesFaces/Figure13.11IndexedLineSetBoxWireframe.x3d") \
     .setName("reference") \
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
     .setDescription("8m away - note linewidth is unchanged and perspective is ambiguous") \
     .setPosition([0,0,8]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("15m away - note linewidth is unchanged and perspective is ambiguous") \
     .setPosition([0,0,15]) \
    ) \
    .addChild(Transform() \
     .setTranslation([-3,0,0]) \
# Rotating a single cube can help show near/far ambiguity, i.e. the optical illusion for constant-pixel-width line structures 
     .addChild(Viewpoint() \
      .setDescription("IndexedLineSet cube close up") \
      .setPosition([0,0,5]) \
     ) \
     .addChild(Shape() \
# The IndexedLineSet builds the same cube as the LineSet,but simply uses a different approach to connect the vertices. 
      .setGeometry(IndexedLineSet(colorPerVertex = False, coordIndex = [0,1,2,3,0,-1,4,5,6,7,4,-1,0,4,-1,1,5,-1,2,6,-1,3,7,-1]) \
       .setCoord(Coordinate() \
        .setPoint([-1,1,1,1,1,1,1,1,-1,-1,1,-1,-1,-1,1,1,-1,1,1,-1,-1,-1,-1,-1]) \
       ) \
       .setColor(Color() \
        .setColor([1,0.058824,0.117647,0.878431,0.447059,0,1,0.992157,0.141176,0.101961,0.721569,0,0.12549,0,0.901961,0.878431,0,0.843137,0.294118,0,0.341176,1,0.980392,0.992157,1,1,1]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([3,0,0]) \
     .addChild(Viewpoint() \
      .setDescription("LineSet cube close up") \
      .setPosition([0,0,5]) \
     ) \
     .addChild(Shape() \
# Coordinate sequence for the vertexCount='5 5 2 2 2 2' array: 0 1 2 3 0, 4 5 6 7 4, 0 4, 1 5, 2 6, 3 7. This corresponds to the IndexedLineSet coordIndex actually. 
      .setGeometry(LineSet() \
       .setVertexCount([5,5,2,2,2,2]) \
       .setCoord(Coordinate() \
        .setPoint([-1,1,1,1,1,1,1,1,-1,-1,1,-1,-1,1,1,-1,-1,1,1,-1,1,1,-1,-1,-1,-1,-1,-1,-1,1,-1,1,1,-1,-1,1,1,1,1,1,-1,1,1,1,-1,1,-1,-1,-1,1,-1,-1,-1,-1]) \
       ) \
       .setColor(Color() \
        .setColor([1,0,0,1,0.5,0,1,1,0,0,1,0,1,0,0,0,0,1,0.8,0,0.8,0.3,0,0.3,1,1,1,0,0,1,1,0,0,0,0,1,1,0.5,0,0.8,0,0.8,1,1,0,0.3,0,0.3,0,1,0,1,1,1]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([-3,2,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["IndexedLineSet"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.5) \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setDEF("TextAppearance") \
       .setMaterial(Material() \
        .setAmbientIntensity(0) \
        .setDiffuseColor([0,0,0]) \
        .setEmissiveColor([0,0.398733,1]) \
        .setShininess(0.05) \
        .setSpecularColor([0.622449,0.622449,0.622449]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([3,2,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["LineSet"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.5) \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setUSE("TextAppearance") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons//LineSetComparison_RoundTrip.x3d")
