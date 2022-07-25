from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("PixelTextureSnowman.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("This snowman example shows a colorful PixelTexture applied to X3D primitive shapes - happy holidays!") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Craig Schwetje, Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("2 February 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("25 August 2008") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("8 December 2015") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://en.wikipedia.org/wiki/Snowman") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/frosty2.mid") \
     .setName("midi") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.the-north-pole.com/carols/frosty.html") \
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
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/PixelTextureSnowman.x3d") \
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
     .setDescription("PixelTexture Snowman") \
     .setOrientation([1,0,0,-0.17985]) \
     .setPosition([0,2,11]) \
    ) \
    .addChild(Sound() \
     .setLocation([0,1.6,0]) \
     .setMaxBack(50) \
     .setMaxFront(50) \
     .setMinBack(5) \
     .setMinFront(5) \
     .setPriority(1) \
     .setSource(AudioClip() \
      .setDescription("Frosty the Snowman") \
      .setLoop(True) \
      .setUrl(["frosty2.mid","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/frosty2.mid"]) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,-2.5,2]) \
     .addChild(Billboard() \
      .addChild(Anchor() \
       .setDEF("WikipediaAnchorLink") \
       .setDescription("Wikipedia Snowman entry") \
       .setParameter(["target=_blank"]) \
       .setUrl(["http://en.wikipedia.org/wiki/Snowman"]) \
       .addChild(Shape() \
        .setGeometry(Text() \
         .setString(["Click here to learn more","about snowmen"]) \
         .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.6) \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDEF("Autumn11") \
          .setAmbientIntensity(0.25641) \
          .setDiffuseColor([1,0.160784,0.764706]) \
          .setShininess(1) \
          .setSpecularColor([0.48655,0.319155,0.444036]) \
         ) \
        ) \
       ) \
# Add transparent geometry over the text to make clicking (i.e. Anchor selection) easier 
       .addChild(Shape() \
        .setGeometry(Box(size = [6,1.5,0.02]) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setTransparency(1) \
         ) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("SnowmanRoot") \
     .addChild(OrientationInterpolator() \
      .setDEF("TwistInterpolator") \
      .setKey([0,0.22,0.25,0.5,0.73,0.75,1]) \
      .setKeyValue([0,1,0,0,0,1,0,5.75959,0,1,0,5.75959,0,1,0,0,0,1,0,0.5236,0,1,0,0.5236,0,1,0,0]) \
     ) \
     .addChild(TimeSensor() \
      .setDEF("Clock") \
      .setCycleInterval(6) \
      .setLoop(True) \
     ) \
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("TwistInterpolator") \
      .setToField("rotation") \
      .setToNode("SnowmanRoot") \
     ) \
     .addChild(ROUTE() \
      .setFromField("fraction_changed") \
      .setFromNode("Clock") \
      .setToField("set_fraction") \
      .setToNode("TwistInterpolator") \
     ) \
# Hat 
     .addChild(Transform() \
      .setTranslation([0,3.6,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.003922,0.003922,0.003922]) \
        ) \
       ) \
       .setGeometry(Cylinder(height = 1, radius = 0.5) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([0,3.2,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.003922,0.003922,0.003922]) \
        ) \
       ) \
       .setGeometry(Cylinder(height = 0.2) \
       ) \
      ) \
     ) \
# Head 
     .addChild(Transform() \
      .setTranslation([0,2.6,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setTexture(PixelTexture(repeatS = False, repeatT = False) \
         .setDEF("PixelColors") \
         .setImage([2,4,3,0xff0000,0xffff00,0x007700,0xff0077,0x0000ff,0xff7700,0x00ff77,0x888888]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .75) \
       ) \
      ) \
     ) \
# Eyes 
     .addChild(Transform() \
      .setTranslation([0.3,2.7,.55]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,0]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .18) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-0.3,2.7,.55]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,0]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .18) \
       ) \
      ) \
     ) \
# Nose 
     .addChild(Transform() \
      .setRotation([1,0,0,1.57]) \
      .setTranslation([0,2.5,0.55]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.901961,0.403922,0]) \
         .setEmissiveColor([1,0.145098,0.058824]) \
         .setSpecularColor([1,0.454902,0.360784]) \
        ) \
       ) \
       .setGeometry(Cone(bottomRadius = 0.3, height = 1.75) \
       ) \
      ) \
     ) \
# Scarf 
     .addChild(Transform() \
      .setTranslation([0,1.975,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Cylinder(height = 0.175, radius = 0.8) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([.7,1.1,.8]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([.725,1.2,.85]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([.7,1.3,.8]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([.7,1.4,.75]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([.7,1.5,.75]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([.7,1.6,.7]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([.7,1.7,.65]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([.6,1.8,.65]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([.55,1.9,.65]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([.55,2,.65]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
# Backside of scarf 
     .addChild(Transform() \
      .setTranslation([-.7,1.1,-.8]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-.725,1.2,-.85]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-.7,1.3,-.8]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-.7,1.4,-.75]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-.7,1.5,-.75]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-.7,1.6,-.7]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-.7,1.7,-.65]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-.6,1.8,-.65]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-.55,1.9,-.65]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-.55,2,-.65]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
# Mouth 
# Middle Mouthpiece 
     .addChild(Transform() \
      .setTranslation([0,2.2,.55]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,0]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([0.1,2.2,.55]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,0]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([0.2,2.2,.55]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,0]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-0.1,2.2,.55]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,0]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-0.2,2.2,.55]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,0]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
# Pipe 
     .addChild(Transform() \
      .setRotation([0.96225,0.19245,-0.19245,1.57]) \
      .setTranslation([0.1,2.2,0.55]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.219608,0.137255,0]) \
        ) \
       ) \
       .setGeometry(Cylinder(radius = 0.03) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([.45,2.3,1.5]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.219608,0.137255,0]) \
        ) \
       ) \
       .setGeometry(Cylinder(height = .2, radius = .1) \
       ) \
      ) \
     ) \
# Body 
     .addChild(Transform() \
      .setTranslation([0,1.15,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setTexture(PixelTexture() \
         .setUSE("PixelColors") \
        ) \
       ) \
       .setGeometry(Sphere(radius = 1.1) \
       ) \
      ) \
     ) \
# Arms 
     .addChild(Transform() \
      .setRotation([0,0,1,1.57]) \
      .setTranslation([0,1.5,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([.5,.25,.05]) \
        ) \
       ) \
       .setGeometry(Cylinder(height = 4.9, radius = 0.1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([0,0.92848,0.37139,1.57]) \
      .setTranslation([2,1.5,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([.5,.25,.05]) \
        ) \
       ) \
       .setGeometry(Cylinder(height = .9, radius = 0.05) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([0.84515,-0.50709,0.16903,1.57]) \
      .setTranslation([1.5,1.5,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([.5,.25,.05]) \
        ) \
       ) \
       .setGeometry(Cylinder(height = .7, radius = 0.03) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([0,0.64018,0.76822,1.57]) \
      .setTranslation([-1,1.5,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([.5,.25,.05]) \
        ) \
       ) \
       .setGeometry(Cylinder(height = 1, radius = 0.05) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([0,0.70711,-0.70711,1]) \
      .setTranslation([-1.9,1.5,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([.5,.25,.05]) \
        ) \
       ) \
       .setGeometry(Cylinder(height = .5, radius = 0.04) \
       ) \
      ) \
     ) \
# Left Glove 
     .addChild(Transform() \
      .setRotation([0,0,1,1.57]) \
      .setTranslation([2.45,1.5,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Box(size = [0.5,0.5,0.25]) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([0.95285,0,0.30345,1.57]) \
      .setTranslation([2.75,1.5,0.05]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Cylinder(height = .25, radius = 0.25) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([0.96352,0,0.26764,1.57]) \
      .setTranslation([2.55,1.85,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Cylinder(height = .15, radius = 0.15) \
       ) \
      ) \
     ) \
# Right Glove 
     .addChild(Transform() \
      .setRotation([0,0,1,1.57]) \
      .setTranslation([-2.45,1.5,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Box(size = [0.5,0.5,0.25]) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([-0.95285,0,0.30345,1.57]) \
      .setTranslation([-2.75,1.5,0.05]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Cylinder(height = .25, radius = 0.25) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([-0.96352,0,0.26764,1.57]) \
      .setTranslation([-2.55,1.85,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.039216,0.243137]) \
        ) \
       ) \
       .setGeometry(Cylinder(height = .15, radius = 0.15) \
       ) \
      ) \
     ) \
# Buttons 
     .addChild(Transform() \
      .setTranslation([0,1.7,.95]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,0]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([0,1.25,1.05]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,0]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([0,.8,1.05]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,0]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .1) \
       ) \
      ) \
     ) \
# Lower Body 
     .addChild(Transform() \
      .setTranslation([0,-1,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setTexture(PixelTexture() \
         .setUSE("PixelColors") \
        ) \
       ) \
       .setGeometry(Sphere(radius = 1.75) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures//PixelTextureSnowman_RoundTrip.x3d")
