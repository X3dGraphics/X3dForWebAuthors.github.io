from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("DirectionalLight.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("An example of the DirectionalLight node showing no shadows on the lit geometry.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("24 April 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("DirectionalLightFigure.png") \
     .setName("Image") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/DirectionalLight.x3d") \
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
     .setDescription("Book Viewpoint") \
     .setOrientation([0.627,-0.707,-0.326,-0.93]) \
     .setPosition([6.03,6.69,9.25]) \
    ) \
    .addChild(NavigationInfo() \
     .setHeadlight(False) \
    ) \
    .addChild(DirectionalLight() \
    ) \
    .addChild(Transform() \
     .setTranslation([0,1.5,7]) \
     .addChild(Group() \
      .setDEF("Arrow") \
      .addChild(Transform() \
       .setRotation([1,0,0,1.57]) \
       .addChild(Shape() \
        .setAppearance(Appearance() \
         .setDEF("ArrowApp") \
         .setMaterial(Material() \
          .setDEF("ArrowColor") \
         ) \
        ) \
        .setGeometry(Cylinder(radius = .1) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setRotation([1,0,0,-1.57]) \
       .setTranslation([0,0,-1]) \
       .addChild(Shape() \
        .setAppearance(Appearance() \
         .setUSE("ArrowApp") \
        ) \
        .setGeometry(Cone(bottomRadius = .25, height = .5) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,.5,7]) \
     .addChild(Group() \
      .setUSE("Arrow") \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,-.5,7]) \
     .addChild(Group() \
      .setUSE("Arrow") \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,-1.5,7]) \
     .addChild(Group() \
      .setUSE("Arrow") \
     ) \
    ) \
    .addChild(Transform() \
     .addChild(Transform() \
      .setDEF("Box") \
      .setTranslation([0,0,4]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0,0]) \
        ) \
       ) \
       .setGeometry(Box(size = [2,2,.2]) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("rod") \
      .setTranslation([0,0,1]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,.8,0]) \
        ) \
       ) \
       .setGeometry(Cylinder(height = 4) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("hat") \
      .setRotation([0,0,1,1.57]) \
      .setTranslation([1,0,-2]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,1]) \
        ) \
       ) \
       .setGeometry(Cone(height = 4) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("ball") \
      .setTranslation([3,0,-5]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,1,1]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = 2) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects//DirectionalLight_RoundTrip.x3d")
