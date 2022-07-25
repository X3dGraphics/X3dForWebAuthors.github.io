from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interactive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("TreeFishPlaque.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Michael Collins") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("18 February 2001") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("5 January 20149") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("unfinished") \
     .setName("warning") \
    ) \
    .addMeta(meta() \
     .setContent("One fish plaque with lithograph on one side and actual picture on the back. Click on plaque to go to picture or click on buttons to change picture.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit") \
     .setName("generator") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/TreeFishPlaque.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("Treefish.jpg") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("http://faculty.nps.edu/brutzman/kelp/fish.html#Treefish") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("../license.html") \
     .setName("license") \
    ) \
   ) \
   .setScene(Scene() \
    .addChild(Viewpoint() \
     .setDEF("treefish") \
     .setDescription("Tree Fish") \
     .setPosition([0,0,4]) \
    ) \
# Fish Plaques 
    .addChild(Group() \
     .addChild(TouchSensor() \
      .setDEF("BlueRockfishTouchSensor") \
      .setDescription("touch to rotate") \
     ) \
     .addChild(TimeSensor() \
      .setDEF("BLUEROCKFISHCLOCK") \
      .setCycleInterval(2) \
     ) \
     .addChild(OrientationInterpolator() \
      .setDEF("BlueRockfishPathInterpolator") \
      .setKey([0.0,0.50,1.0]) \
      .setKeyValue([0.0,1.0,0.0,0.0,0.0,1.0,0.0,1.57,0.0,1.0,0.0,3.14]) \
     ) \
     .addChild(Transform() \
      .setDEF("BLUEROCKFISH_TRANSFORM") \
      .addChild(Shape() \
       .setGeometry(Box(size = [4,2,.1]) \
       ) \
       .setAppearance(Appearance() \
        .setTexture(ImageTexture() \
         .setUrl(["TreeFish.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/TreeFish.jpg"]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Group() \
      .addChild(Transform() \
       .setDEF("BASE_TRANSFORM") \
       .setTranslation([0,0,-.3]) \
       .addChild(Shape() \
        .setGeometry(Box(size = [8,6,.3]) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDiffuseColor([.3,.3,.6]) \
         ) \
        ) \
       ) \
      ) \
      .addChild(TouchSensor() \
       .setDEF("BaseTouchSensor") \
       .setDescription("touch to rotate") \
      ) \
      .addChild(Group() \
       .addChild(Transform() \
        .setTranslation([0,-2.6,0]) \
        .addChild(Shape() \
         .setGeometry(Box(size = [8,1,1]) \
         ) \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([0.8,0.8,0.2]) \
          ) \
         ) \
        ) \
       ) \
      ) \
      .addChild(Group() \
       .addChild(Transform() \
        .setTranslation([0,2.6,0]) \
        .addChild(Shape() \
         .setGeometry(Box(size = [8,1,1]) \
         ) \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([0.8,0.8,0.2]) \
          ) \
         ) \
        ) \
       ) \
      ) \
      .addChild(Group() \
       .addChild(Transform() \
        .setRotation([0,0,1,1.58]) \
        .setTranslation([3.6,0,0]) \
        .addChild(Shape() \
         .setGeometry(Box(size = [6.2,1,1]) \
         ) \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([0.8,0.8,0.2]) \
          ) \
         ) \
        ) \
       ) \
      ) \
      .addChild(Group() \
       .addChild(Transform() \
        .setRotation([0,0,1,1.58]) \
        .setTranslation([-3.6,0,0]) \
        .addChild(Shape() \
         .setGeometry(Box(size = [6.2,1,1]) \
         ) \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([0.8,0.8,0.2]) \
          ) \
         ) \
        ) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//TreeFishPlaque_RoundTrip.x3d")
