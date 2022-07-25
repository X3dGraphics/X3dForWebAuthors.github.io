from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interactive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("StripedSurfPerchPlaque.x3d") \
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
     .setContent("14 April 2019") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("under development") \
     .setName("warning") \
    ) \
    .addMeta(meta() \
     .setContent("One fish plaque with lithograph on one side and actual picture on the back. Click on plaque to go to picture or click on buttons to change picture.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/StripedSurfPerchPlaque.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit") \
     .setName("generator") \
    ) \
    .addMeta(meta() \
     .setContent("StripedSurfPerchPatch.jpg") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("RainbowSurfPerch002.jpg") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("../license.html") \
     .setName("license") \
    ) \
   ) \
   .setScene(Scene() \
    .addChild(Viewpoint() \
     .setDEF("stripedsurfperch") \
     .setDescription("Striped Surf Perch") \
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
         .setUrl(["StripedSurfPerchPatch.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/StripedSurfPerchPatch.jpg"]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([0,0,-.1]) \
       .addChild(Shape() \
        .setGeometry(Box(size = [4,2,.2]) \
        ) \
        .setAppearance(Appearance() \
         .setTexture(ImageTexture() \
          .setUrl(["RainbowSurfPerch002.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RainbowSurfPerch002.jpg"]) \
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Group() \
      .addChild(Transform() \
       .setDEF("BUTTON_TRANSFORM") \
       .setTranslation([1,2,0]) \
       .addChild(Shape() \
        .setGeometry(Sphere(radius = .5) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDiffuseColor([0,1,0]) \
         ) \
        ) \
       ) \
      ) \
      .addChild(TouchSensor() \
       .setDEF("FrontTouchSensor") \
       .setDescription("front TouchSensor") \
      ) \
      .addChild(TimeSensor() \
       .setDEF("FRONTTOUCHSENSORCLOCK") \
       .setCycleInterval(2) \
      ) \
      .addChild(OrientationInterpolator() \
       .setDEF("PlaqueToPictureInterpolator") \
       .setKey([0.0,0.50,1.0]) \
       .setKeyValue([0.0,1.0,0.0,3.14,0.0,1.0,0.0,1.57,0.0,1.0,0.0,0.00]) \
      ) \
     ) \
     .addChild(Group() \
      .addChild(Transform() \
       .setDEF("BUTTON_TRANSFORM2") \
       .setTranslation([-1,2,0]) \
       .addChild(Shape() \
        .setGeometry(Sphere(radius = .5) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDiffuseColor([1,0,0]) \
         ) \
        ) \
       ) \
      ) \
      .addChild(TouchSensor() \
       .setDEF("PictureTouchSensor") \
       .setDescription("picture TouchSensor") \
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
    .addChild(ROUTE() \
     .setFromField("touchTime") \
     .setFromNode("BlueRockfishTouchSensor") \
     .setToField("set_startTime") \
     .setToNode("BLUEROCKFISHCLOCK") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("BLUEROCKFISHCLOCK") \
     .setToField("set_fraction") \
     .setToNode("BlueRockfishPathInterpolator") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("BlueRockfishPathInterpolator") \
     .setToField("set_rotation") \
     .setToNode("BLUEROCKFISH_TRANSFORM") \
    ) \
    .addChild(ROUTE() \
     .setFromField("touchTime") \
     .setFromNode("FrontTouchSensor") \
     .setToField("set_startTime") \
     .setToNode("FRONTTOUCHSENSORCLOCK") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("FRONTTOUCHSENSORCLOCK") \
     .setToField("set_fraction") \
     .setToNode("PlaqueToPictureInterpolator") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("PlaqueToPictureInterpolator") \
     .setToField("set_rotation") \
     .setToNode("BLUEROCKFISH_TRANSFORM") \
    ) \
# Picture touch sensor only has to tie into the BLUEROCKFISHCLOCK so that it will turn picture. 
    .addChild(ROUTE() \
     .setFromField("touchTime") \
     .setFromNode("PictureTouchSensor") \
     .setToField("set_startTime") \
     .setToNode("BLUEROCKFISHCLOCK") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//StripedSurfPerchPlaque_RoundTrip.x3d")
