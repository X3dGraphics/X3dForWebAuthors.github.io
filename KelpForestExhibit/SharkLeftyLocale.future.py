from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("SharkLeftyLocale.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Lefty Shark with animation to traverse the tank") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Tim McLean") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("translator") \
    ) \
    .addMeta(meta() \
     .setContent("1 June 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://faculty.nps.edu/brutzman/kelp") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLeftyLocale.x3d") \
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
     .setDEF("_0") \
     .setTranslation([0.0,-5.5,-1.0]) \
     .addChild(Inline() \
      .setUrl(["SharkLefty.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLefty.x3d","SharkLefty.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLefty.wrl"]) \
     ) \
     .addChild(Group() \
      .addChild(TimeSensor() \
       .setDEF("SHARK2_CLOCK") \
       .setCycleInterval(110.0) \
       .setLoop(True) \
      ) \
      .addChild(PositionInterpolator() \
       .setDEF("SHARK2_POSITION") \
       .setKey([0.0,0.152,0.194,0.224,0.288,0.35,0.427,0.549,0.632,0.7,0.813,1.0]) \
       .setKeyValue([0.0,-4.25,-1.0,3.75,-4.5,-0.75,4.75,-4.5,-1.0,4.75,-4.5,-2.0,3.25,-4.0,-2.5,1.75,-4.0,-2.75,0.0,-4.0,-3.25,-3.0,-3.5,-4.0,-5.0,-4.0,-2.5,-5.75,-4.5,0.0,-4.5,-4.5,0.25,0.0,-4.25,-1.0]) \
      ) \
      .addChild(OrientationInterpolator() \
       .setDEF("SHARK2_ORIENTATION") \
       .setKey([0.0,0.152,0.194,0.224,0.288,0.35,0.427,0.549,0.632,0.7,0.813,1.0]) \
       .setKeyValue([0.0,1.0,0.0,6.2134,0.0,1.0,0.0,0.244,0.0,1.0,0.0,1.57,0.1564,0.9974,-0.0262,2.8141,0.0,1.0,0.0,2.967,0.0,1.0,0.0,2.7227,0.0872,0.9961,-0.0107,2.8982,-0.1218,0.9917,-0.0407,3.7824,-0.1469,0.9832,-0.1087,4.3995,0.0,1.0,0.0,6.0912,0.0,1.0,0.0,0.2618,0.0,1.0,0.0,6.2134]) \
      ) \
     ) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("_4") \
     .setLoop(True) \
    ) \
    .addChild(Script() \
     .setDEF("sharkSwimmingInTankTrigger_5") \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("triggerIn") \
      .setType("SFTime") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("startTime") \
      .setType("SFTime") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("firstTime") \
      .setType("SFBool") \
     ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"\n"+
"function triggerIn (value, time) \n"+
"{\n"+
"	startTime = value;\n"+
"	firstTime = false;\n"+
"}\n"+
"''')
    ) \
    .addChild(ROUTE() \
     .setFromField("startTime") \
     .setFromNode("sharkSwimmingInTankTrigger_5") \
     .setToField("set_startTime") \
     .setToNode("SHARK2_CLOCK") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("SHARK2_CLOCK") \
     .setToField("set_fraction") \
     .setToNode("SHARK2_POSITION") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("SHARK2_CLOCK") \
     .setToField("set_fraction") \
     .setToNode("SHARK2_ORIENTATION") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("SHARK2_POSITION") \
     .setToField("set_translation") \
     .setToNode("_0") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("SHARK2_ORIENTATION") \
     .setToField("set_rotation") \
     .setToNode("_0") \
    ) \
    .addChild(ROUTE() \
     .setFromField("firstTime") \
     .setFromNode("sharkSwimmingInTankTrigger_5") \
     .setToField("set_enabled") \
     .setToNode("_4") \
    ) \
    .addChild(ROUTE() \
     .setFromField("time") \
     .setFromNode("_4") \
     .setToField("triggerIn") \
     .setToNode("sharkSwimmingInTankTrigger_5") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//SharkLeftyLocale_RoundTrip.x3d")
