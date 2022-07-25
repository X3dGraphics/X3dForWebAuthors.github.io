from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addComponent(component() \
     .setLevel(4) \
     .setName("Shape") \
    ) \
    .addMeta(meta() \
     .setContent("TwoSidedMaterial.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("A Sphere colored red on outside and orange on inside using TwoSidedMaterial") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman and MV3204 class") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("18 February 2009") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("15 March 2009") \
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
     .setContent("Copyright (c) 2006, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/TwoSidedMaterial.x3d") \
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
     .setDescription("Outside, front face material") \
     .setPosition([0,0,4]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Inside, back face material") \
     .setPosition([0,0,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Above, looking down on two shapes") \
     .setOrientation([1,0,0,-1.57]) \
     .setPosition([0,8,-2]) \
    ) \
    .addChild(NavigationInfo() \
     .setType(["WALK","ANY"]) \
    ) \
# Disable collision between viewpoint and sphere to facilitate viewing 
    .addChild(Collision() \
     .setEnabled(False) \
     .setProxy(Shape() \
      .setDEF("RedOutsideOrangeInside") \
      .setAppearance(Appearance() \
       .setMaterial(TwoSidedMaterial() \
        .setBackDiffuseColor([1,0.5,0]) \
        .setBackTransparency(0.5) \
        .setDiffuseColor([1,0,0]) \
        .setSeparateBackColor(True) \
        .setTransparency(0.5) \
       ) \
      ) \
# Must have solid='false' to see inside of Sphere 
      .setGeometry(Sphere(solid = False) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,0,-4]) \
     .addChild(Shape() \
      .setGeometry(Box() \
       .setDEF("BackgroundBox") \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0,0.007843,0.839216]) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures//TwoSidedMaterial_RoundTrip.x3d")
