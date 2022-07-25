from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addComponent(component() \
     .setLevel(3) \
     .setName("EnvironmentalEffects") \
    ) \
    .addMeta(meta() \
     .setContent("TextureBackground.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simple TextureBackground node with images only.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("20 April 2009") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("20 November 2011") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironment/BackgroundImagesOnly.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/Basic/DistributedInteractiveSimulation/TestImages.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("X3D TextureBackground example") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/TextureBackground.x3d") \
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
    .addChild(TextureBackground() \
     .setLeftTexture(ImageTexture() \
      .setUrl(["images/left.png","http://www.web3d.org/x3d/content/examples/Basic/DistributedInteractiveSimulation/images/left.png"]) \
     ) \
     .setRightTexture(ImageTexture() \
      .setUrl(["images/right.png","http://www.web3d.org/x3d/content/examples/Basic/DistributedInteractiveSimulation/images/right.png"]) \
     ) \
     .setFrontTexture(ImageTexture() \
      .setUrl(["images/front.png","http://www.web3d.org/x3d/content/examples/Basic/DistributedInteractiveSimulation/images/front.png"]) \
     ) \
     .setBackTexture(ImageTexture() \
      .setUrl(["images/back.png","http://www.web3d.org/x3d/content/examples/Basic/DistributedInteractiveSimulation/images/back.png"]) \
     ) \
     .setTopTexture(ImageTexture() \
      .setUrl(["images/top.png","http://www.web3d.org/x3d/content/examples/Basic/DistributedInteractiveSimulation/images/top.png"]) \
     ) \
     .setBottomTexture(ImageTexture() \
      .setUrl(["images/bottom.png","http://www.web3d.org/x3d/content/examples/Basic/DistributedInteractiveSimulation/images/bottom.png"]) \
     ) \
    ) \
    .addChild(Shape() \
     .setGeometry(Text() \
      .setString(["TextureBackground node using","ImageTexture nodes"]) \
      .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], style = "BOLD") \
      ) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setDiffuseColor([1,1,1]) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects//TextureBackground_RoundTrip.x3d")
