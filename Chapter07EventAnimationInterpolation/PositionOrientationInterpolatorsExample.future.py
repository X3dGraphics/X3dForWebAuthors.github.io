from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("PositionOrientationInterpolatorsExample.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Demonstrate use of PositionInterpolator and OrientationInterpolator to animate object motion.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("29 January 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("29 October 2016") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("PositionOrientationInterpolatorsExample.mp4") \
     .setName("MovingImage") \
    ) \
    .addMeta(meta() \
     .setContent("PositionOrientationInterpolatorsExampleTraced.x3d") \
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
     .setContent("Copyright Don Brutzman and Leonard Daly 2007") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("https://savage.nps.edu/Savage/Tools/Animation/WaypointInterpolatorExample.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/PositionOrientationInterpolatorsExample.x3d") \
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
    .addChild(Viewpoint() \
     .setDescription("Animation demo") \
     .setOrientation([1,0,0,-0.588003]) \
     .setPosition([0,8,12]) \
    ) \
    .addChild(Viewpoint() \
     .setCenterOfRotation([5,0.1,5]) \
     .setDescription("View from above") \
     .setOrientation([1,0,0,-1.570796]) \
     .setPosition([0,15,0]) \
    ) \
    .addChild(Transform() \
     .setDEF("Pointer") \
     .setTranslation([1,0,1]) \
     .addChild(Transform() \
      .setRotation([1,0,0,1.57]) \
      .addChild(Shape() \
       .setGeometry(Cone(bottomRadius = 0.5, height = 1.5) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDEF("ConeMaterial") \
         .setDiffuseColor([0.427451,1,0.160784]) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Shape() \
     .setDEF("Floor") \
     .setGeometry(Box(size = [12,0.05,12]) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setDiffuseColor([0,0.262745,0.941176]) \
      ) \
     ) \
    ) \
# note that final value equals first value in keyValue array in order to support smooth looping 
# first drive around the location 
    .addChild(PositionInterpolator() \
     .setDEF("PositionAnimator") \
     .setKey([0,0.2,0.25,0.45,0.5,0.7,0.75,0.95,1]) \
     .setKeyValue([-4,0,-4,-4,0,4,-4,0,4,4,0,4,4,0,4,4,0,-4,4,0,-4,-4,0,-4,-4,0,-4]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("PositionAnimator") \
     .setToField("set_translation") \
     .setToNode("Pointer") \
    ) \
# then rotate the pointer to match next direction while paused at each position 
    .addChild(OrientationInterpolator() \
     .setDEF("OrientationAnimator") \
     .setKey([0,0.2,0.25,0.45,0.5,0.7,0.75,0.95,1]) \
     .setKeyValue([0,1,0,0,0,1,0,0,0,1,0,1.57,0,1,0,1.57,0,1,0,3.14,0,1,0,3.14,0,1,0,4.71,0,1,0,4.71,0,1,0,6.283]) \
    ) \
# final rotation value is 2pi rather than 0 so that rotation animation is smooth, not flip-flopping 
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("OrientationAnimator") \
     .setToField("set_rotation") \
     .setToNode("Pointer") \
    ) \
# put TimeSensor clock last so that animation design pattern and ROUTE events flow upward 
    .addChild(TimeSensor() \
     .setDEF("AnimationClock") \
     .setCycleInterval(10) \
     .setLoop(True) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("AnimationClock") \
     .setToField("set_fraction") \
     .setToNode("PositionAnimator") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("AnimationClock") \
     .setToField("set_fraction") \
     .setToNode("OrientationAnimator") \
    ) \
# notice that explanatory Text is placed later in scene although it is graphically located above driving plane 
    .addChild(Transform() \
     .setTranslation([0,4,0]) \
     .addChild(Billboard() \
      .setAxisOfRotation([0,0,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["Animation using PositionInterpolator","and OrientationInterpolator"]) \
        .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.6) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
        ) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation//PositionOrientationInterpolatorsExample_RoundTrip.x3d")
