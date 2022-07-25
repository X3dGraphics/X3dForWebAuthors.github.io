from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("BackgroundSelector.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Select one of four Background nodes to show a time-of-day effect.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Dale Tourtelotte, Don Brutzman and MV4205 class") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("20 April 2009") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("20 November 2011") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironment/BackgroundColorsOnly.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("X3D Background example") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundSelector.x3d") \
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
    .addChild(Transform() \
     .setTranslation([0,3,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["Background Selector"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
       ) \
      ) \
     ) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("TimeOfDayClock") \
     .setCycleInterval(6) \
     .setLoop(True) \
    ) \
    .addChild(IntegerSequencer() \
     .setDEF("BackgroundSequencer") \
     .setKey([0,0.25,0.5,0.75,1]) \
     .setKeyValue([0,1,2,3,0]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("TimeOfDayClock") \
     .setToField("set_fraction") \
     .setToNode("BackgroundSequencer") \
    ) \
    .addChild(Script() \
     .setDEF("SelectorScript") \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("whichBackground") \
      .setType("SFInt32") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("bind0") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("bind1") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("bind2") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("bind3") \
      .setType("SFBool") \
     ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"function whichBackground (inputValue)\n"+
"{\n"+
"    if      (whichBackground == 0) bind0 = true;\n"+
"    else if (whichBackground == 1) bind1 = true;\n"+
"    else if (whichBackground == 2) bind2 = true;\n"+
"    else if (whichBackground == 3) bind3 = true;\n"+
"}\n"+
"''')
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("BackgroundSequencer") \
     .setToField("whichBackground") \
     .setToNode("SelectorScript") \
    ) \
    .addChild(Background() \
     .setDEF("SunRiseSky") \
     .setGroundAngle([0.75,1.2,1.25,1.26,1.5,1.57]) \
     .setGroundColor([0.133333,0.419608,0,0.36,0.1,0,1,0.74,0.4,1,0.74,0.4,0,0,0.5,0,0,0.2,0,0.231373,0.380392]) \
     .setSkyAngle([0.5,0.7,1.35,1.45,1.57]) \
     .setSkyColor([0,0.035,0.34,0,0.015,0.44,0,0.05,0.5,0,0.1,0.6,0.44,0.8,1,1,1,0.7]) \
    ) \
    .addChild(Background() \
     .setDEF("HighNoonSky") \
     .setGroundAngle([0.75,1.2,1.25,1.26,1.57]) \
     .setGroundColor([0.133333,0.419608,0,0.36,0.1,0,1,0.74,0.4,1,0.74,0.4,0,0.2,0.75,0,0.1,0.5]) \
     .setSkyAngle([0.05,0.07,1.57]) \
     .setSkyColor([1,1,0.2,1,1,0,0.36,0.63,1,0,0.4,1]) \
    ) \
    .addChild(Background() \
     .setDEF("SunsetSky") \
     .setGroundAngle([0.75,1.2,1.25,1.26,1.57]) \
     .setGroundColor([0.133333,0.419608,0,0.36,0.1,0,1,0.74,0.4,1,0.74,0.4,0,0,0.5,0,0,0.2]) \
     .setSkyAngle([0.5,0.7,1.2,1.4,1.57]) \
     .setSkyColor([0,0,0.38,0,0,0.68,0.5,0.2,1,0.5,0.2,1,1,0.3,0,1,0.2,0.8]) \
    ) \
    .addChild(Background() \
     .setDEF("NightSky") \
     .setGroundAngle([0.75,1.2,1.25,1.26,1.57]) \
     .setGroundColor([0.133333,0.419608,0,0.36,0.1,0,1,0.74,0.4,1,0.74,0.4,0,0,0.5,0,0,0.2]) \
     .setSkyAngle([0.03,0.05,1.57]) \
     .setSkyColor([1,1,1,0.8,0.8,0.8,0.1,0.1,0.1,0,0,0]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("bind0") \
     .setFromNode("SelectorScript") \
     .setToField("set_bind") \
     .setToNode("SunRiseSky") \
    ) \
    .addChild(ROUTE() \
     .setFromField("bind1") \
     .setFromNode("SelectorScript") \
     .setToField("set_bind") \
     .setToNode("HighNoonSky") \
    ) \
    .addChild(ROUTE() \
     .setFromField("bind2") \
     .setFromNode("SelectorScript") \
     .setToField("set_bind") \
     .setToNode("SunsetSky") \
    ) \
    .addChild(ROUTE() \
     .setFromField("bind3") \
     .setFromNode("SelectorScript") \
     .setToField("set_bind") \
     .setToNode("NightSky") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects//BackgroundSelector_RoundTrip.x3d")
