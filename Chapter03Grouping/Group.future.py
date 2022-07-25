from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("Group.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example for Group node") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("13 November 2005") \
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
     .setContent("Copyright (c) 2005, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/Group.x3d") \
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
     .setOrientation([-0.668,-0.724,-0.174,0.7]) \
     .setPosition([-1.93,1.78,3.28]) \
    ) \
    .addChild(Group() \
     .setDEF("BoxAndSphereTogether") \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,0,0]) \
       ) \
      ) \
      .setGeometry(Box() \
      ) \
     ) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDEF("Pulsar") \
        .setDiffuseColor([0,0,1]) \
       ) \
      ) \
      .setGeometry(Sphere(radius = 1.4) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping//Group_RoundTrip.x3d")
