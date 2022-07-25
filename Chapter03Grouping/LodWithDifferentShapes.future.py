from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("LodWithDifferentShapes.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example to demonstrate LOD forceTransitions field for animating different shapes, navigate in/out or else check Viewpoints to see each separate Shape") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("21 July 2011") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("23 July 2011") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("LOD.x3d") \
     .setName("reference") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/LodWithDifferentShapes.x3d") \
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
     .setType(["FLY","ANY"]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("LOD at 4m shows Box") \
     .setPosition([0,0,4]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("LOD at 8m shows Cone") \
     .setPosition([0,0,8]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("LOD at 12m shows Cylinder") \
     .setPosition([0,0,12]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("LOD at 16m shows Sphere") \
     .setPosition([0,0,16]) \
    ) \
    .addChild(LOD() \
     .setDEF("Switcher") \
     .setForceTransitions(True) \
     .setRange([5,10,15]) \
     .addChild(Shape() \
      .setDEF("BoxShape") \
      .setGeometry(Box() \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,0,0]) \
       ) \
      ) \
     ) \
     .addChild(Shape() \
      .setDEF("ConeShape") \
      .setGeometry(Cone() \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,1,0]) \
       ) \
      ) \
     ) \
     .addChild(Shape() \
      .setDEF("CylinderShape") \
      .setGeometry(Cylinder() \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0,1,0]) \
       ) \
      ) \
     ) \
     .addChild(Shape() \
      .setDEF("SphereShape") \
      .setGeometry(Sphere() \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0,0,1]) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping//LodWithDifferentShapes_RoundTrip.x3d")
