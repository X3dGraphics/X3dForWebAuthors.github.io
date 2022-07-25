from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("CoordinateAxesLines.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("13 October 2013") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("24 February 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("X Y Z axis lines (red green blue, respectively) in X3D coordinate system, providing a simple reusable widget.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxesNSEW.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxesNSEW.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxesNSEW.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxesLines.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com") \
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
# See X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons to learn more about IndexedLineSet, Coordinate and Color nodes 
    .addChild(Shape() \
     .setGeometry(IndexedLineSet(colorPerVertex = False, coordIndex = [0,1,-1,0,2,-1,0,3,-1]) \
      .setColorIndex([0,1,2]) \
      .setCoord(Coordinate() \
       .setPoint([0,0,0,1,0,0,0,1,0,0,0,1]) \
      ) \
      .setColor(Color() \
       .setColor([1,0,0,0,1,0,0.2,0.2,1]) \
      ) \
     ) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Oblique view") \
     .setOrientation([-0.59028,0.76927,0.2445,0.987861]) \
     .setPosition([6,6,6]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("View from X axis") \
     .setOrientation([0,1,0,1.570796]) \
     .setPosition([10,0,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("View from Y axis") \
     .setOrientation([1,0,0,-1.570796]) \
     .setPosition([0,10,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("View from Z axis") \
     .setPosition([0,0,10]) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping//CoordinateAxesLines_RoundTrip.x3d")
