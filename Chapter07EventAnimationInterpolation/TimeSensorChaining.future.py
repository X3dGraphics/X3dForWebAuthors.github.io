from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("TimeSensorChaining.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Connecting TimeSensor nodes so that the completion of one behavior chain triggers another.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman and MV3204 class") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("2 September 2009") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("20 October 2009") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("under development") \
     .setName("warning") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/TimeSensorChaining.x3d") \
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
     .setDescription("TimeSensor chaining example") \
     .setPosition([0,1,6]) \
    ) \
    .addChild(Transform() \
     .setDEF("DoorHingeTransform") \
     .setCenter([-0.65,0,0]) \
     .setTranslation([0,1,0]) \
     .addChild(TouchSensor() \
      .setDEF("UserClick") \
      .setDescription("click to operate door") \
     ) \
     .addChild(Shape() \
      .setGeometry(Box(size = [1.3,2.5,0.08]) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDEF("DoorColor") \
        .setDiffuseColor([1,0,0]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setScale([0.6,0.6,0.6]) \
     .setTranslation([0,-1,0]) \
     .addChild(Switch() \
      .setDEF("TextSwitcher") \
      .setWhichChoice(0) \
      .addChild(Group() \
       .addChild(Shape() \
        .setGeometry(Text() \
         .setString(["Door is closed"]) \
         .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
          .setDEF("MiddleJustify") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setDEF("TextAppearance") \
         .setMaterial(Material() \
         ) \
        ) \
       ) \
      ) \
      .addChild(Group() \
       .addChild(Shape() \
        .setGeometry(Text() \
         .setString(["Door in motion..."]) \
         .setFontStyle(FontStyle() \
          .setUSE("MiddleJustify") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setUSE("TextAppearance") \
        ) \
       ) \
      ) \
      .addChild(Group() \
       .addChild(Shape() \
        .setGeometry(Text() \
         .setString(["Door is open"]) \
         .setFontStyle(FontStyle() \
          .setUSE("MiddleJustify") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setUSE("TextAppearance") \
        ) \
       ) \
      ) \
     ) \
    ) \
# ===== open the door ===== 
    .addChild(TimeSensor() \
     .setDEF("ClockNumber1") \
     .setCycleInterval(2) \
    ) \
    .addChild(ROUTE() \
     .setFromField("touchTime") \
     .setFromNode("UserClick") \
     .setToField("startTime") \
     .setToNode("ClockNumber1") \
    ) \
    .addChild(OrientationInterpolator() \
     .setDEF("DoorOpener") \
     .setKey([0,0.5,1]) \
     .setKeyValue([0,1,0,0,0,1,0,4.7124,0,1,0,3]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("ClockNumber1") \
     .setToField("set_fraction") \
     .setToNode("DoorOpener") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("DoorOpener") \
     .setToField("rotation") \
     .setToNode("DoorHingeTransform") \
    ) \
    .addChild(IntegerTrigger() \
     .setDEF("SetTextInMotion") \
     .setIntegerKey(1) \
    ) \
    .addChild(ROUTE() \
     .setFromField("isActive") \
     .setFromNode("UserClick") \
     .setToField("set_boolean") \
     .setToNode("SetTextInMotion") \
    ) \
    .addChild(ROUTE() \
     .setFromField("triggerValue") \
     .setFromNode("SetTextInMotion") \
     .setToField("whichChoice") \
     .setToNode("TextSwitcher") \
    ) \
# ===== door is now open ===== 
    .addChild(BooleanFilter() \
     .setDEF("DoorOpenComplete") \
    ) \
    .addChild(ROUTE() \
     .setFromField("isActive") \
     .setFromNode("ClockNumber1") \
     .setToField("set_boolean") \
     .setToNode("DoorOpenComplete") \
    ) \
# disable ClockNumber1 by turning itself off when complete 
    .addChild(ROUTE() \
     .setFromField("isActive") \
     .setFromNode("ClockNumber1") \
     .setToField("enabled") \
     .setToNode("ClockNumber1") \
    ) \
    .addChild(TimeTrigger() \
     .setDEF("TriggerOpeningAnimation") \
    ) \
    .addChild(ROUTE() \
     .setFromField("inputFalse") \
     .setFromNode("DoorOpenComplete") \
     .setToField("set_boolean") \
     .setToNode("TriggerOpeningAnimation") \
    ) \
    .addChild(TimeSensor() \
     .setDEF("ClockNumber2") \
     .setCycleInterval(0.5) \
    ) \
    .addChild(ROUTE() \
     .setFromField("triggerTime") \
     .setFromNode("TriggerOpeningAnimation") \
     .setToField("startTime") \
     .setToNode("ClockNumber2") \
    ) \
    .addChild(IntegerTrigger() \
     .setDEF("SetTextOpen") \
     .setIntegerKey(2) \
    ) \
    .addChild(ROUTE() \
     .setFromField("inputFalse") \
     .setFromNode("DoorOpenComplete") \
     .setToField("set_boolean") \
     .setToNode("SetTextOpen") \
    ) \
    .addChild(ROUTE() \
     .setFromField("triggerValue") \
     .setFromNode("SetTextOpen") \
     .setToField("whichChoice") \
     .setToNode("TextSwitcher") \
    ) \
    .addChild(ColorInterpolator() \
     .setDEF("DoorColorInterpolator") \
     .setKey([0,0.5,1]) \
     .setKeyValue([1,0,0,0.1,0.1,0.1,0.203922,0.701961,0]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("ClockNumber2") \
     .setToField("set_fraction") \
     .setToNode("DoorColorInterpolator") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("DoorColorInterpolator") \
     .setToField("diffuseColor") \
     .setToNode("DoorColor") \
    ) \
# ===== shut the door ===== 
    .addChild(TimeSensor() \
     .setDEF("ClockNumber3") \
     .setCycleInterval(2) \
     .setEnabled(False) \
    ) \
    .addChild(ROUTE() \
     .setFromField("touchTime") \
     .setFromNode("UserClick") \
     .setToField("startTime") \
     .setToNode("ClockNumber3") \
    ) \
# enable ClockNumber3 once door is fully open 
    .addChild(ROUTE() \
     .setFromField("inputFalse") \
     .setFromNode("DoorOpenComplete") \
     .setToField("enabled") \
     .setToNode("ClockNumber3") \
    ) \
# disable ClockNumber3 by turning itself off when complete 
    .addChild(ROUTE() \
     .setFromField("isActive") \
     .setFromNode("ClockNumber3") \
     .setToField("enabled") \
     .setToNode("ClockNumber3") \
    ) \
    .addChild(ScalarInterpolator() \
     .setDEF("ClockReversal") \
     .setKey([0,1]) \
     .setKeyValue([1,0]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("ClockNumber3") \
     .setToField("set_fraction") \
     .setToNode("ClockReversal") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("ClockReversal") \
     .setToField("set_fraction") \
     .setToNode("DoorOpener") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("ClockReversal") \
     .setToField("set_fraction") \
     .setToNode("DoorColorInterpolator") \
    ) \
# enable ClockNumber1 when door is fully shut 
    .addChild(BooleanTrigger() \
     .setDEF("Clock3CompleteTrigger") \
    ) \
    .addChild(ROUTE() \
     .setFromField("stopTime") \
     .setFromNode("ClockNumber3") \
     .setToField("set_triggerTime") \
     .setToNode("Clock3CompleteTrigger") \
    ) \
    .addChild(IntegerTrigger() \
     .setDEF("SetTextShut") \
     .setIntegerKey(0) \
    ) \
    .addChild(ROUTE() \
     .setFromField("triggerTrue") \
     .setFromNode("Clock3CompleteTrigger") \
     .setToField("set_boolean") \
     .setToNode("SetTextShut") \
    ) \
    .addChild(ROUTE() \
     .setFromField("triggerValue") \
     .setFromNode("SetTextShut") \
     .setToField("whichChoice") \
     .setToNode("TextSwitcher") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation//TimeSensorChaining_RoundTrip.x3d")
