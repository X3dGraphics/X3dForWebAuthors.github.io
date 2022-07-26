from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("Box.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Box geometric primitive node.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("1 January 2007") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("27 December 2007") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/Box.x3d") \
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
     .setDescription("Book View") \
     .setOrientation([-0.747,-0.624,-0.231,1.05]) \
     .setPosition([-1.81,3.12,2.59]) \
    ) \
    .addChild(Shape() \
     .setGeometry(Box(size = [1,2,3]) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter02GeometryPrimitives//Box_RoundTrip.x3d")
