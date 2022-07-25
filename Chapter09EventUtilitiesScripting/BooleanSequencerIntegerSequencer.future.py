from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("BooleanSequencerIntegerSequencer.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Show synchronized use of BooleanSequencer and IntegerSequencer nodes for SpotLight enabled and Switch whichChoice control, respectively") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("6 September 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("3 September 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/BooleanSequencerIntegerSequencer.x3d") \
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
    .addChild(NavigationInfo() \
    ) \
    .addChild(TimeSensor() \
     .setDEF("Clock") \
     .setCycleInterval(10) \
     .setLoop(True) \
    ) \
    .addChild(BooleanSequencer() \
     .setDEF("OnOffSequencer") \
     .setKey([0,0.2,0.4,0.6,0.8,1]) \
     .setKeyValue([true,false,true,false,true,true]) \
    ) \
    .addChild(SpotLight() \
     .setDEF("RedSpotLight") \
     .setColor([1,0.0,0.0]) \
     .setLocation([0,0,10]) \
    ) \
# Note no red or pink materials, only grey 
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("Clock") \
     .setToField("set_fraction") \
     .setToNode("OnOffSequencer") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("OnOffSequencer") \
     .setToField("on") \
     .setToNode("RedSpotLight") \
    ) \
    .addChild(IntegerSequencer() \
     .setDEF("ChildSequencer") \
     .setKey([0,0.2,0.4,0.6,0.8,1]) \
     .setKeyValue([0,1,2,3,-1,0]) \
    ) \
    .addChild(Transform() \
     .setTranslation([-3.5,1,0]) \
     .addChild(Switch() \
      .setDEF("ShapeSwitcher") \
      .setWhichChoice(-1) \
      .addChild(Shape() \
       .setDEF("Child0") \
       .setGeometry(Text() \
        .setString(["Grey child 0","headlight plus red light"]) \
       ) \
       .setAppearance(Appearance() \
        .setDEF("GreyAppearance") \
        .setMaterial(Material() \
         .setDiffuseColor([0.7,0.7,0.7]) \
        ) \
       ) \
      ) \
      .addChild(Shape() \
       .setDEF("Child1") \
       .setGeometry(Text() \
        .setString(["Grey child 1","headlight only"]) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("GreyAppearance") \
       ) \
      ) \
      .addChild(Shape() \
       .setDEF("Child2") \
       .setGeometry(Text() \
        .setString(["Grey child 2","headlight plus red light"]) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("GreyAppearance") \
       ) \
      ) \
      .addChild(Shape() \
       .setDEF("Child3") \
       .setGeometry(Text() \
        .setString(["Grey child 3","headlight only"]) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("GreyAppearance") \
       ) \
      ) \
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("Clock") \
     .setToField("set_fraction") \
     .setToNode("ChildSequencer") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("ChildSequencer") \
     .setToField("whichChoice") \
     .setToNode("ShapeSwitcher") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//BooleanSequencerIntegerSequencer_RoundTrip.x3d")
