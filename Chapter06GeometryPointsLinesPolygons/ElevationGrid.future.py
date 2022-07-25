from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interactive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ElevationGrid.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simple ElevationGrid example.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("U.S. Naval Postgraduate School (NPS)") \
     .setName("organization") \
    ) \
    .addMeta(meta() \
     .setContent("8 May 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("23 December 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ElevationGrid.x3d") \
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
    ) \
    .addChild(Viewpoint() \
     .setDescription("ElevationGrid oblique view") \
     .setOrientation([1,0,0,-0.588003]) \
     .setPosition([0,4,6]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("ElevationGrid overhead view") \
     .setOrientation([1,0,0,-1.570796]) \
     .setPosition([0,8,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("ElevationGrid ground-level view") \
     .setPosition([0,0.2,6]) \
    ) \
    .addChild(Transform() \
     .setTranslation([-2.5,0,-2.5]) \
     .addChild(Shape() \
      .setDEF("ExampleElevationGridShape") \
      .setGeometry(ElevationGrid(height = [0,0,0,0,0,0,0,1,1,1,1,0,0,1,2,2,1,0,0,1,2,2,1,0,0,1,1,1,1,0,0,0,0,0,0,0], solid = False) \
       .setXDimension(6) \
       .setZDimension(6) \
      ) \
      .setAppearance(Appearance() \
       .setDEF("DiffuseRedAppearance") \
       .setMaterial(Material() \
        .setDiffuseColor([0.9,0.1,0.1]) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons//ElevationGrid_RoundTrip.x3d")
