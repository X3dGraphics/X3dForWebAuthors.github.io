from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ColorPerVertexExamples.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Geometry Polygons Nodes: Color, Coordinate, ElevationGrid, Extrusion, IndexedFaceSet, IndexedLineSet, PointSet") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("5 September 2005") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("11 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("ColorPerVertexExamples.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright (c) 2005, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ColorPerVertexExamples.x3d") \
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
     .setDescription("ColorPerVertex Examples") \
     .setPosition([0,0,6]) \
    ) \
    .addChild(Background() \
     .setGroundColor([0.1,0.1,0.1]) \
     .setSkyColor([0.1,0.1,0.1]) \
    ) \
    .addChild(Transform() \
     .setTranslation([-0.5,0,0]) \
     .addChild(Transform() \
      .setTranslation([-3,0,0]) \
      .addChild(Shape() \
# Default settings: colorPerVertex='true' 
       .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,3,0,-1]) \
        .setColorIndex([0,1,2,3,0,-1]) \
        .setCoord(Coordinate() \
         .setDEF("FourPoints") \
         .setPoint([0,0,0,1,0,0,1,1,0,0,1,0]) \
        ) \
        .setColor(Color() \
         .setDEF("FourColors") \
         .setColor([1,0,0,0,1,0,0,0,1,0.8,0.8,0.8]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-1,0,0]) \
      .addChild(Shape() \
# Note that only 4 points are needed to create a 4-vertex polygon. 
       .setGeometry(IndexedFaceSet(colorPerVertex = False, coordIndex = [0,1,2,3,0,-1]) \
        .setColorIndex([2]) \
        .setCoord(Coordinate() \
         .setUSE("FourPoints") \
        ) \
        .setColor(ColorRGBA() \
         .setDEF("FourColorsRGBA") \
         .setColor([1,0,0,1,0,1,0,1,0,0,1,0.5,0.8,0.8,0.8,0]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([1,0,0]) \
      .addChild(Shape() \
# Student TODO: try different color indices. 
       .setGeometry(IndexedLineSet(coordIndex = [0,1,2,3,0,-1]) \
        .setColorIndex([0,1,2,3,0,-1]) \
        .setCoord(Coordinate() \
         .setUSE("FourPoints") \
        ) \
        .setColor(Color() \
         .setUSE("FourColors") \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([3,0,0]) \
      .addChild(Shape() \
# Note that 5 points are needed to create 4 complete line segments. 
       .setGeometry(IndexedLineSet(colorPerVertex = False, coordIndex = [0,1,2,3,0,-1]) \
        .setColorIndex([0]) \
        .setCoord(Coordinate() \
         .setUSE("FourPoints") \
        ) \
        .setColor(Color() \
         .setUSE("FourColors") \
        ) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons//ColorPerVertexExamples_RoundTrip.x3d")
