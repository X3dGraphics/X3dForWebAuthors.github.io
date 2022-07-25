from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("HelloTriangle.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simplest possible triangle definition. Note that head metadata is optional. Provides interesting comparison to OpenGL definitions.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("5 August 2009") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("2 October 2016") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter01TechnicalOverview/HelloTriangle.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("HelloWorld.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/HelloWorld.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("create corresponding shader-based example") \
     .setName("TODO") \
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
    .addChild(Shape() \
     .setGeometry(IndexedFaceSet(coordIndex = [0,1,2]) \
      .setCoord(Coordinate() \
       .setPoint([0,0,0,1,0,0,0.5,1,0]) \
      ) \
     ) \
# default polygons are single-sided, applies default Appearance and Material 
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter01TechnicalOverview//HelloTriangle_RoundTrip.x3d")
