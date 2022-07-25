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
     .setContent("Summary2D.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example of all of the Geometry2D nodes for the X3D Book.") \
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
     .setContent("13 January 2014") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter10Geometry2D/Summary2D.x3d") \
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
     .setDescription("Summary 2D example") \
    ) \
    .addChild(Group() \
     .addChild(Shape() \
      .setGeometry(Polypoint2D() \
       .setPoint([-3,2,-3,0,-1,0,-3,-1,-2,-2,0,-2,0,-1,-2,-1,3,-1.5,3,1.5,2,-1,.5,3,-.5,1.5,1.5,1.5]) \
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
     .addChild(Shape() \
      .setGeometry(Polyline2D() \
       .setLineSegments([-3,2,-3,0,-2,-2,3,-1.5,3,1.5,.5,3,-3,2]) \
      ) \
      .setAppearance(Appearance() \
       .setUSE("MagentaAppearance") \
      ) \
     ) \
     .addChild(Shape() \
      .setGeometry(TriangleSet2D() \
       .setVertices([3,-1.5,3,1.5,2,-1,.5,3,-.5,1.5,1.5,1.5]) \
      ) \
      .setAppearance(Appearance() \
       .setUSE("MagentaAppearance") \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-2.5,1,0]) \
      .addChild(Shape() \
       .setGeometry(Rectangle2D() \
       ) \
       .setAppearance(Appearance() \
        .setUSE("MagentaAppearance") \
       ) \
      ) \
      .addChild(Shape() \
       .setGeometry(Circle2D() \
       ) \
       .setAppearance(Appearance() \
        .setUSE("MagentaAppearance") \
       ) \
      ) \
      .addChild(Shape() \
       .setGeometry(Disk2D() \
       ) \
       .setAppearance(Appearance() \
        .setUSE("MagentaAppearance") \
       ) \
      ) \
      .addChild(Shape() \
       .setGeometry(Arc2D(radius = 3) \
        .setEndAngle(0) \
        .setStartAngle(4.5) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("MagentaAppearance") \
       ) \
      ) \
      .addChild(Shape() \
       .setGeometry(ArcClose2D(radius = 3) \
        .setClosureType("PIE") \
        .setEndAngle(0) \
        .setStartAngle(4.5) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("MagentaAppearance") \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-1,-1.5,0]) \
      .addChild(Shape() \
       .setGeometry(Rectangle2D(size = [2,1]) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("MagentaAppearance") \
       ) \
      ) \
      .addChild(Shape() \
       .setGeometry(Circle2D(radius = 2) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("MagentaAppearance") \
       ) \
      ) \
      .addChild(Shape() \
       .setGeometry(Disk2D() \
        .setInnerRadius(1.5) \
        .setOuterRadius(2) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("MagentaAppearance") \
       ) \
      ) \
      .addChild(Shape() \
       .setGeometry(Arc2D(radius = 1.5) \
        .setEndAngle(.78) \
        .setStartAngle(6) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("MagentaAppearance") \
       ) \
      ) \
      .addChild(Shape() \
       .setGeometry(ArcClose2D(radius = 1.5) \
        .setClosureType("CHORD") \
        .setEndAngle(.78) \
        .setStartAngle(6) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("MagentaAppearance") \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter10Geometry2D//Summary2D_RoundTrip.x3d")
