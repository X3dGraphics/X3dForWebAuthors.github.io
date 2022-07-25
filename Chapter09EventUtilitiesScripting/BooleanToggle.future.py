from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interactive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("BooleanToggle.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("A BooleanToggle button determines whether an animated Cone is jittery or not.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("9 October 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("9 April 2019") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("BS Contact BitManagement Bug Report submitted 28 November 2014 http://www.bitmanagement.de/en/contact") \
     .setName("TODO") \
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
     .setContent("Copyright 2006, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/BooleanToggle.x3d") \
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
     .setDescription("Select red button to toggle cone jitter") \
    ) \
    .addChild(Transform() \
     .setRotation([1,0,0,1.57]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,0,0]) \
       ) \
      ) \
      .setGeometry(Cylinder(height = .5, radius = .5) \
      ) \
     ) \
     .addChild(TouchSensor() \
      .setDEF("TouchButton") \
      .setDescription("touch to activate") \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([2,0,0]) \
     .addChild(Transform() \
      .setDEF("ShakingCone") \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,.8,0]) \
        ) \
       ) \
       .setGeometry(Cone() \
       ) \
      ) \
     ) \
    ) \
    .addChild(BooleanToggle() \
     .setDEF("Toggler") \
    ) \
    .addChild(ROUTE() \
     .setFromField("isActive") \
     .setFromNode("TouchButton") \
     .setToField("set_boolean") \
     .setToNode("Toggler") \
    ) \
    .addChild(BooleanFilter() \
     .setDEF("Tee") \
    ) \
    .addChild(ROUTE() \
     .setFromField("toggle_changed") \
     .setFromNode("Toggler") \
     .setToField("set_boolean") \
     .setToNode("Tee") \
    ) \
    .addChild(TimeTrigger() \
     .setDEF("PauseOn") \
    ) \
    .addChild(ROUTE() \
     .setFromField("inputTrue") \
     .setFromNode("Tee") \
     .setToField("set_boolean") \
     .setToNode("PauseOn") \
    ) \
    .addChild(TimeTrigger() \
     .setDEF("PauseOff") \
    ) \
    .addChild(ROUTE() \
     .setFromField("inputFalse") \
     .setFromNode("Tee") \
     .setToField("set_boolean") \
     .setToNode("PauseOff") \
    ) \
    .addChild(TimeSensor() \
     .setDEF("Timer") \
     .setCycleInterval(.15) \
     .setLoop(True) \
     .setStartTime(1) \
    ) \
    .addChild(ROUTE() \
     .setFromField("triggerTime") \
     .setFromNode("PauseOn") \
     .setToField("pauseTime") \
     .setToNode("Timer") \
    ) \
    .addChild(ROUTE() \
     .setFromField("triggerTime") \
     .setFromNode("PauseOff") \
     .setToField("resumeTime") \
     .setToNode("Timer") \
    ) \
    .addChild(PositionInterpolator() \
     .setDEF("Shaker") \
     .setKey([0,.25,.50,.75,1]) \
     .setKeyValue([0,0,0,.4,.2,-.3,-.2,.3,.1,-.1,-.2,.3,0,0,0]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("Timer") \
     .setToField("set_fraction") \
     .setToNode("Shaker") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("Shaker") \
     .setToField("translation") \
     .setToNode("ShakingCone") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//BooleanToggle_RoundTrip.x3d")