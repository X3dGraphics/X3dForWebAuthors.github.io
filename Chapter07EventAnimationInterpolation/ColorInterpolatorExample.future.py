from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ColorInterpolatorExample.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Demonstrate basic design pattern for animating a node.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("17 April 2005") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("5 October 2015") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("ColorInterpolatorExampleSceneGraphWithRoutes.png") \
     .setName("drawing") \
    ) \
    .addMeta(meta() \
     .setContent("ColorInterpolatorExample4Colors.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("Animation ColorInterpolator") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/ColorInterpolatorExample.x3d") \
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
    .addChild(Group() \
# Place triggering text above sphere of interest 
     .addChild(Transform() \
      .setTranslation([0,2,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["Touch text to","start animation..."]) \
        .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
        ) \
       ) \
      ) \
# Selectable Text design pattern has transparent Box and TouchSensor description as a tooltip 
      .addChild(Shape() \
       .setGeometry(Box(size = [6.2,2,.001]) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setTransparency(1) \
        ) \
       ) \
      ) \
# This TouchSensor only reacts to user clicking on the sibling Shape and Text, because it is under a parent Transform grouping node 
      .addChild(TouchSensor() \
       .setDEF("TextTriggerTouchSensor") \
       .setDescription("Touch text to start...") \
      ) \
     ) \
# Here is Sphere with accompanying Material that will get animated 
     .addChild(Transform() \
      .setTranslation([0,-1,0]) \
      .addChild(Shape() \
       .setGeometry(Sphere() \
       ) \
       .setAppearance(Appearance() \
# SphereMaterial diffuseColor gets overridden by interpolator output 
        .setMaterial(Material() \
         .setDEF("SphereMaterial") \
         .setDiffuseColor([0.5,0.5,0.5]) \
        ) \
       ) \
      ) \
     ) \
# TimeSensor is triggered to start by TouchSensor, then sends animating values to Interpolator 
     .addChild(TimeSensor() \
      .setDEF("AnimationClock") \
      .setCycleInterval(6) \
     ) \
# ROUTE 1: TouchSensor trigger to TimeSensor clock 
     .addChild(ROUTE() \
      .setFromField("touchTime") \
      .setFromNode("TextTriggerTouchSensor") \
      .setToField("startTime") \
      .setToNode("AnimationClock") \
     ) \
# Interpolator: ColorChanger interpolates evenly between red, green, blue and then back to red 
     .addChild(ColorInterpolator() \
      .setDEF("ColorChanger") \
      .setKey([0,0.3333,0.6666,1]) \
      .setKeyValue([1,0,0,0,1,0,0,0,1,1,0,0]) \
     ) \
# ROUTE 2: the ColorChanger interpolator gets stimulated by AnimationClock TimeSensor fraction to compute a color value 
     .addChild(ROUTE() \
      .setFromField("fraction_changed") \
      .setFromNode("AnimationClock") \
      .setToField("set_fraction") \
      .setToNode("ColorChanger") \
     ) \
# ROUTE 3: Interpolator output is sent to target node of interest. Changed color value is routed to SphereMaterial color. 
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("ColorChanger") \
      .setToField("diffuseColor") \
      .setToNode("SphereMaterial") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation//ColorInterpolatorExample_RoundTrip.x3d")
