from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interactive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("IntegerSequencerRoadSignSwitcher.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Switch among different road signs using IntegerSequencer") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("2 January 2009") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/IntegerSequencerRoadSignSwitcher.x3d") \
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
     .setGroundColor([0.2,0.2,0.2]) \
     .setSkyColor([0.2,0.2,0.2]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Road sign switcher, 6m away") \
     .setPosition([0,0,6]) \
    ) \
    .addChild(Shape() \
     .setDEF("Frame") \
# Box framee scaled to be wider, taller and thinner than Box holding image 
     .setGeometry(Box(size = [3.5,2.7,0.05]) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setAmbientIntensity(0) \
       .setDiffuseColor([0,0,0]) \
       .setEmissiveColor([1,0.442751,0]) \
       .setShininess(0.05102) \
       .setSpecularColor([0.475676,0.475676,0.475676]) \
# Universal Media Library: Neon 13 
      ) \
     ) \
    ) \
# Modify the whichChoice value in this Switch to 0, 1, 2 or 3 to see the various versions of the model. Select whichChoice= -1 to show nothing. 
    .addChild(Switch() \
     .setDEF("Switch") \
     .setWhichChoice(0) \
# whichChoice values are 0, 1, 2, 3 for these four children 
     .addChild(Shape() \
# Box size scaled to match aspect ratio of original images 
      .setGeometry(Box(size = [3.072,2.304,0.1]) \
       .setDEF("SignHolder") \
      ) \
      .setAppearance(Appearance() \
# each image size reduced from 1-1.5M down to 150-200KB using GIMP for faster downloading, quality still looks good 
       .setTexture(ImageTexture() \
        .setUrl(["RoadSignRoadWorkAhead.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/RoadSignRoadWorkAhead.jpg"]) \
       ) \
      ) \
     ) \
     .addChild(Shape() \
      .setGeometry(Box() \
       .setUSE("SignHolder") \
      ) \
      .setAppearance(Appearance() \
       .setTexture(ImageTexture() \
        .setUrl(["RoadSignExpectDelays.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/RoadSignExpectDelays.jpg"]) \
       ) \
      ) \
     ) \
     .addChild(Shape() \
      .setGeometry(Box() \
       .setUSE("SignHolder") \
      ) \
      .setAppearance(Appearance() \
       .setTexture(ImageTexture() \
        .setUrl(["RoadSignMondayThruFriday.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/RoadSignMondayThruFriday.jpg"]) \
       ) \
      ) \
     ) \
     .addChild(Shape() \
      .setGeometry(Box() \
       .setUSE("SignHolder") \
      ) \
      .setAppearance(Appearance() \
       .setTexture(ImageTexture() \
        .setUrl(["RoadSign7amTo5pm.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/RoadSign7amTo5pm.jpg"]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(IntegerSequencer() \
     .setDEF("Sequencer") \
     .setKey([0,0.25,0.5,0.75,1]) \
     .setKeyValue([0,1,2,3,0]) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("Time") \
     .setCycleInterval(8) \
     .setLoop(True) \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("Sequencer") \
     .setToField("whichChoice") \
     .setToNode("Switch") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("Time") \
     .setToField("set_fraction") \
     .setToNode("Sequencer") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//IntegerSequencerRoadSignSwitcher_RoundTrip.x3d")
