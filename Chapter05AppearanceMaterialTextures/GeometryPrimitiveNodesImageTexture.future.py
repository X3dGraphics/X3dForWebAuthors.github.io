from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("GeometryPrimitiveNodesImageTexture.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Geometry Primitive Nodes: Shape, Box, Cone, Cylinder, Sphere, Text, FontStyle, with ImageTexture applied") \
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
     .setContent("7 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright (c) Don Brutzman and Leonard Daly, 2005") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/GeometryPrimitiveNodesImageTexture.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/GeometryPrimitiveNodes-White.x3d") \
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
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Transform() \
     .setTranslation([-5,0,0]) \
     .addChild(Shape() \
      .setDEF("DefaultShape") \
      .setGeometry(Box() \
       .setDEF("DefaultBox") \
      ) \
      .setAppearance(Appearance() \
       .setDEF("DefaultAppearance") \
       .setMaterial(Material() \
        .setDiffuseColor([1,0.2,0.2]) \
       ) \
       .setTexture(ImageTexture() \
        .setDEF("earth-topo") \
        .setUrl(["../Chapter01TechnicalOverview/earth-topo.png","../Chapter01TechnicalOverview/earth-topo.jpg","../Chapter01TechnicalOverview/earth-topo-small.gif","http://www.web3d.org/x3d/content/examples/Basic/earth-topo.png","http://www.web3d.org/x3d/content/examples/Basic/earth-topo.jpg","http://www.web3d.org/x3d/content/examples/Basic/earth-topo-small.gif"]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([-2.5,0,0]) \
     .addChild(Shape() \
      .setGeometry(Cone() \
       .setDEF("DefaultCone") \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0.2,1,0.2]) \
       ) \
       .setTexture(ImageTexture() \
        .setUSE("earth-topo") \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .addChild(Shape() \
      .setGeometry(Cylinder() \
       .setDEF("DefaultCylinder") \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0.2,0.2,1]) \
       ) \
       .setTexture(ImageTexture() \
        .setUSE("earth-topo") \
       ) \
      ) \
     ) \
    ) \
# let's uh, rotate the earth to see North America 
    .addChild(Transform() \
     .setRotation([0,1,0,-1.57]) \
     .setTranslation([2.5,0,0]) \
     .addChild(Shape() \
      .setGeometry(Sphere() \
       .setDEF("DefaultSphere") \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,1,0.2]) \
       ) \
       .setTexture(ImageTexture() \
        .setUSE("earth-topo") \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([5,0,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setDEF("DefaultText") \
       .setLength([0]) \
       .setString(["Learn","X3D!"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
        .setDEF("DefaultFontStyle") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDEF("DefaultMaterial") \
        .setAmbientIntensity(0.33) \
        .setDiffuseColor([0.237059,0.096273,0.215625]) \
        .setShininess(0.13) \
        .setSpecularColor([0.311358,0.387879,0.387879]) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures//GeometryPrimitiveNodesImageTexture_RoundTrip.x3d")
