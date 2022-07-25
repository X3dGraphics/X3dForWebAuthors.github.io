from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("DolphinSwitcher.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Switch among 3 different dolphin poses") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Chris Lang") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("1 August 2007") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("https://savage.nps.edu/Savage/Biologics/Dolphin/DolphinSwitcher.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/DolphinSwitcher.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit") \
     .setName("generator") \
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
     .setGroundColor([1,1,1]) \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Dolphin switcher, 2m away") \
     .setPosition([0,0,2]) \
    ) \
# Modify the whichChoice value in this Switch to 0, 1 or 2 to see the various versions of the model. Select whichChoice= -1 to show nothing. 
    .addChild(Switch() \
     .setDEF("Switch") \
     .setWhichChoice(2) \
# whichChoice values are 0, 1, 2 for these three children 
     .addChild(Group() \
      .setDEF("CurvedUpwardPose") \
      .addChild(Inline() \
       .setUrl(["DolphinPose02.x3d","https://savage.nps.edu/Savage/Biologics/Dolphin/DolphinPose02.x3d"]) \
      ) \
     ) \
     .addChild(Group() \
      .setDEF("NeutralPose") \
      .addChild(Inline() \
       .setUrl(["DolphinPose01.x3d","https://savage.nps.edu/Savage/Biologics/Dolphin/DolphinPose01.x3d"]) \
      ) \
     ) \
     .addChild(Group() \
      .setDEF("CurvedDownwardPose") \
      .addChild(Inline() \
       .setUrl(["DolphinPose03.x3d","https://savage.nps.edu/Savage/Biologics/Dolphin/DolphinPose03.x3d"]) \
      ) \
     ) \
    ) \
    .addChild(IntegerSequencer() \
     .setDEF("Sequencer") \
     .setKey([0,0.25,0.5,0.75,1]) \
     .setKeyValue([0,1,2,1,0]) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("Time") \
     .setCycleInterval(4) \
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

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation//DolphinSwitcher_RoundTrip.x3d")
