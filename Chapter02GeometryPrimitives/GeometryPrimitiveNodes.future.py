from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("GeometryPrimitiveNodes.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Geometry Primitive Nodes: Shape, Box, Cone, Cylinder, Sphere, Text, FontStyle") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("25 March 2005") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("11 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Default values have been added to geometry nodes for clarity, ordinarily default values are omitted.") \
     .setName("hint") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright (c) Don Brutzman and Leonard Daly, 2005") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/GeometryPrimitiveNodes.x3d") \
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
    .addChild(Transform() \
     .setTranslation([-5,0,0]) \
     .addChild(Shape() \
      .setDEF("DefaultShape") \
      .setGeometry(Box(size = [2,2,2]) \
       .setDEF("DefaultBox") \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,0.2,0.2]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([-2.5,0,0]) \
     .addChild(Shape() \
      .setGeometry(Cone(bottom = True, bottomRadius = 1, height = 2, side = True) \
       .setDEF("DefaultCone") \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0.2,1,0.2]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .addChild(Shape() \
      .setGeometry(Cylinder(bottom = True, height = 2, radius = 1, side = True) \
       .setDEF("DefaultCylinder") \
       .setTop(True) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0.2,0.2,1]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([2.5,0,0]) \
     .addChild(Shape() \
      .setGeometry(Sphere(radius = 1) \
       .setDEF("DefaultSphere") \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,1,0.2]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([4,0,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setDEF("DefaultText") \
       .setString(["hello","X3D!"]) \
       .setFontStyle(FontStyle() \
        .setDEF("DefaultFontStyle") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setDEF("DefaultAppearance") \
       .setMaterial(Material() \
        .setDEF("DefaultMaterial") \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter02GeometryPrimitives//GeometryPrimitiveNodes_RoundTrip.x3d")
