from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("MorphingTriangleSet.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Animated example of a morphing TriangleSet") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("1 January 2007") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("11 January 2014") \
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
     .setContent("Copyright Don Brutzman and Leonard Daly 2007") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter13GeometryTrianglesQuadrilaterals/MorphingTriangleSet.x3d") \
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
     .setDescription("Book View - Cube") \
     .setOrientation([-0.742,0.635,0.215,0.81]) \
     .setPosition([5.71,6.54,7.99]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book View - Pyramid") \
     .setOrientation([-0.044,0.998,0.037,0.72]) \
     .setPosition([5.5,1.68,4.41]) \
    ) \
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Transform() \
     .setRotation([1,0,0,0]) \
     .addChild(Shape() \
      .setGeometry(TriangleSet(solid = False) \
       .setCoord(Coordinate() \
        .setDEF("Points") \
        .setPoint([0,0,0,4,0,0,2,1.15,0,4,0,0,2,3.46,0,2,1.15,0,2,3.46,0,0,0,0,2,1.15,0,0,0,0,4,0,0,2,1.15,1.15,4,0,0,2,1.73,3,2,1.15,1.15,2,1.73,3,0,0,0,2,1.15,1.15,4,0,0,2,3.46,0,3,2.31,1.15,2,3.46,0,2,1.73,3,3,2.31,1.15,2,1.73,3,4,0,0,3,2.31,1.15,2,3.46,0,0,0,0,1,2.31,1.15,0,0,0,2,1.73,3,1,2.31,1.15,2,1.73,3,2,3.46,0,1,2.31,1.15]) \
       ) \
       .setColor(Color() \
        .setColor([1,0.,0,0,.8,0,1,.5,0,0,.8,0,0,0.,1,1,.5,0,0,0.,1,1,0.,0,1,.5,0,1.,0.,0.,0.,.8,0.,1,0,1,0.,.8,0.,.7,.3,.4,1,0,1,.7,.3,.4,1.,0.,0.,1,0,1,0.,.8,0.,0.,0.,1.,0,1,1,0.,0.,1.,.7,.3,.4,0,1,1,.7,.3,.4,0.,.8,0.,0,1,1,0.,0.,1.,1.,0.,0.,1,1,0,1.,0.,0.,.7,.3,.4,1,1,0,.7,.3,.4,0.,0.,1.,1,1,0]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("Timer") \
     .setCycleInterval(30) \
     .setLoop(True) \
     .setStartTime(1) \
    ) \
    .addChild(CoordinateInterpolator() \
     .setDEF("Mover") \
     .setKey([0,.2,.5,.7]) \
     .setKeyValue([0,0,0,4,0,0,2,1.15,0,4,0,0,2,3.46,0,2,1.15,0,2,3.46,0,0,0,0,2,1.15,0,0,0,0,4,0,0,2,0.58,0.58,4,0,0,2,1.73,3,2,0.58,0.58,2,1.73,3,0,0,0,2,0.58,0.58,4,0,0,2,3.46,0,3,2.31,0.58,2,3.46,0,2,1.73,3,3,2.31,0.58,2,1.73,3,4,0,0,3,2.31,0.58,2,3.46,0,0,0,0,1,2.31,0.58,0,0,0,2,1.73,3,1,2.31,0.58,2,1.73,3,2,3.46,0,1,2.31,0.58,0,0,0,4,0,0,0,4,0,4,0,0,4,4,0,0,4,0,0,0,4,0,0,0,0,4,0,0,0,0,4,0,0,0,0,4,4,0,0,4,0,4,0,0,4,4,0,4,0,0,4,4,4,4,4,0,0,4,4,0,4,4,4,4,4,0,0,4,4,4,4,4,4,0,4,4,0,0,4,4,4,0,4,4,0,0,4,4,4,4,0,0,4,0,4,4,0,4,0,0,4,4,4,4,0,0,4,0,0,0,0,4,0,0,0,4,0,4,0,0,4,4,0,0,4,0,0,0,4,0,0,0,0,4,0,0,0,0,4,0,0,0,0,4,4,0,0,4,0,4,0,0,4,4,0,4,0,0,4,4,4,4,4,0,0,4,4,0,4,4,4,4,4,0,0,4,4,4,4,4,4,0,4,4,0,0,4,4,4,0,4,4,0,0,4,4,4,4,0,0,4,0,4,4,0,4,0,0,4,4,4,4,0,0,4,0,0,0,0,4,0,0,2,1.15,0,4,0,0,2,3.46,0,2,1.15,0,2,3.46,0,0,0,0,2,1.15,0,0,0,0,4,0,0,2,0.58,0.58,4,0,0,2,1.73,3,2,0.58,0.58,2,1.73,3,0,0,0,2,0.58,0.58,4,0,0,2,3.46,0,3,2.31,0.58,2,3.46,0,2,1.73,3,3,2.31,0.58,2,1.73,3,4,0,0,3,2.31,0.58,2,3.46,0,0,0,0,1,2.31,0.58,0,0,0,2,1.73,3,1,2.31,0.58,2,1.73,3,2,3.46,0,1,2.31,0.58]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("Timer") \
     .setToField("set_fraction") \
     .setToNode("Mover") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("Mover") \
     .setToField("point") \
     .setToNode("Points") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter13GeometryTrianglesQuadrilaterals//MorphingTriangleSet_RoundTrip.x3d")
