from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ScriptComplexStateEvents.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("A lamp with 4 intensities (off low medium high) and a push-button switcher, all controlled by a Script node.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("10 June 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("9 October 2017") \
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
     .setContent("Copyright 2006, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/ScriptComplexStateEvents.x3d") \
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
     .setDescription("Control 3-way lamp") \
     .setOrientation([-0.993,0.101,-0.063,1.06]) \
     .setPosition([0.06,3.63,2.29]) \
    ) \
    .addChild(Transform() \
     .setDEF("PushBox") \
     .setTranslation([-2,0,0]) \
     .addChild(Transform() \
      .setDEF("ControlBox") \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,.8,0]) \
        ) \
       ) \
       .setGeometry(Box(size = [1,.5,1]) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("ControlButton") \
      .setTranslation([0,.25,0]) \
      .addChild(TouchSensor() \
       .setDEF("ButtonTouch") \
       .setDescription("Push button to change state") \
      ) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0,0]) \
        ) \
       ) \
       .setGeometry(Cylinder(bottom = False, height = .5, radius = .25) \
        .setDEF("Button") \
       ) \
      ) \
      .addChild(PositionInterpolator() \
       .setDEF("ButtonMover") \
       .setKey([0,.5,1]) \
       .setKeyValue([0,.25,0,0,.05,0,0,.25,0]) \
      ) \
      .addChild(TimeSensor() \
       .setDEF("ButtonTimer") \
       .setCycleInterval(.3) \
       .setStopTime(1) \
      ) \
      .addChild(ROUTE() \
       .setFromField("touchTime") \
       .setFromNode("ButtonTouch") \
       .setToField("startTime") \
       .setToNode("ButtonTimer") \
      ) \
      .addChild(ROUTE() \
       .setFromField("fraction_changed") \
       .setFromNode("ButtonTimer") \
       .setToField("set_fraction") \
       .setToNode("ButtonMover") \
      ) \
      .addChild(ROUTE() \
       .setFromField("value_changed") \
       .setFromNode("ButtonMover") \
       .setToField("translation") \
       .setToNode("ControlButton") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("Lamp") \
     .setTranslation([1,0,0]) \
     .addChild(Transform() \
      .setDEF("Base") \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
        ) \
       ) \
       .setGeometry(Cylinder(height = .5, radius = .25) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("Bulb") \
      .setTranslation([0,.5,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
# be sure to match initial color of script so that toggling is smooth and predictable 
        .setMaterial(Material() \
         .setDEF("LightBulbMaterial") \
         .setDiffuseColor([0.2,0.2,0.2]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .5) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Script() \
     .setDEF("ControlScript") \
     .setUrl(["ScriptComplexStateEvents.js","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/ScriptComplexStateEvents.js"]) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("buttonMotionDone") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("the buttonPushCount value toggles 0..1..2..3 to represent four states, off/low/medium/high") \
      .setName("buttonPushCount") \
      .setType("SFInt32") \
      .setValue("0") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setAppinfo("color of lightBulb indicates off/low/medium/high") \
      .setName("lightBulbColor") \
      .setType("SFColor") \
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("isActive") \
     .setFromNode("ButtonTimer") \
     .setToField("buttonMotionDone") \
     .setToNode("ControlScript") \
    ) \
    .addChild(ROUTE() \
     .setFromField("lightBulbColor") \
     .setFromNode("ControlScript") \
     .setToField("diffuseColor") \
     .setToNode("LightBulbMaterial") \
    ) \
    .addChild(Transform() \
     .setTranslation([-1,-2,0]) \
     .addChild(Billboard() \
      .setAxisOfRotation([0,0,0]) \
      .addChild(Switch() \
       .setDEF("TextSwitch") \
       .setWhichChoice(0) \
# States: 0=Off, 1=Low, 2=Medium, 3=High 
       .addChild(Shape() \
        .setGeometry(Text(solid = False) \
         .setString(["Off"]) \
         .setFontStyle(FontStyle(family = ["SANS"], justify = ["BEGIN","MIDDLE"], style = "BOLD") \
          .setDEF("TextStyle") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setDEF("OffAppearance") \
         .setMaterial(Material() \
          .setDiffuseColor([0.6,0.6,0.6]) \
         ) \
        ) \
       ) \
       .addChild(Shape() \
        .setGeometry(Text(solid = False) \
         .setString(["Low"]) \
         .setFontStyle(FontStyle() \
          .setUSE("TextStyle") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setDEF("LowAppearance") \
         .setMaterial(Material() \
          .setDiffuseColor([1,0.6,0.6]) \
         ) \
        ) \
       ) \
       .addChild(Shape() \
        .setGeometry(Text(solid = False) \
         .setString(["Medium"]) \
         .setFontStyle(FontStyle() \
          .setUSE("TextStyle") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setDEF("MediumAppearance") \
         .setMaterial(Material() \
          .setDiffuseColor([0.6,1,0.6]) \
         ) \
        ) \
       ) \
       .addChild(Shape() \
        .setGeometry(Text(solid = False) \
         .setString(["High"]) \
         .setFontStyle(FontStyle() \
          .setUSE("TextStyle") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setDEF("HighAppearance") \
         .setMaterial(Material() \
          .setDiffuseColor([0.6,0.6,1]) \
         ) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("buttonPushCount") \
     .setFromNode("ControlScript") \
     .setToField("whichChoice") \
     .setToNode("TextSwitch") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//ScriptComplexStateEvents_RoundTrip.x3d")
