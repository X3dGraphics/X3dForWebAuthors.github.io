from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ScalarInterpolator.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Demonstrate use of ScalarInterpolator to animate transparency.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("28 January 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("15 May 2010") \
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
     .setContent("Copyright Don Brutzman and Leonard Daly 2007") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/ScalarInterpolator.x3d") \
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
     .setTranslation([0,-1,0]) \
     .addChild(Shape() \
      .setGeometry(Sphere(radius = 2) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDEF("SphereMaterial") \
        .setDiffuseColor([0.941176,0.027451,0]) \
       ) \
      ) \
     ) \
    ) \
# note that final value equals first value in keyValue array in order to support smooth looping 
    .addChild(ScalarInterpolator() \
     .setDEF("TransparencyAnimator") \
     .setKey([0,0.5,1]) \
     .setKeyValue([0,1,0]) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("AnimationClock") \
     .setCycleInterval(8) \
     .setLoop(True) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("AnimationClock") \
     .setToField("set_fraction") \
     .setToNode("TransparencyAnimator") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("TransparencyAnimator") \
     .setToField("transparency") \
     .setToNode("SphereMaterial") \
    ) \
# notice that Text appears later in scene although it is located above Sphere 
    .addChild(Transform() \
     .setTranslation([0,1.5,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["Animating transparency","using ScalarInterpolator"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setDEF("TextAppearance") \
       .setMaterial(Material() \
        .setDiffuseColor([0,0.7,0.7]) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation//ScalarInterpolator_RoundTrip.x3d")
