from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("SoundLoadSensorTest.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("UsingLoadSensor to test when AudioClip loading is complete") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("19 July 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("2 September 2013") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/SoundLoadSensorTest.x3d") \
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
# Sound location y-value is 1.6 in order to match typical avatar height (in meters) 
    .addChild(Sound() \
     .setDEF("SomeSound") \
     .setLocation([0,1.6,0]) \
     .setMaxBack(100) \
     .setMaxFront(100) \
     .setMinBack(10) \
     .setMinFront(10) \
     .setSource(AudioClip() \
      .setDEF("WaterSounds") \
      .setDescription("Running Water") \
      .setUrl(["aqua.wav","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/aqua.wav"]) \
     ) \
    ) \
    .addChild(LoadSensor() \
     .setDEF("ReportWhenLoaded") \
     .setWatchList(AudioClip() \
      .setUSE("WaterSounds") \
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("loadTime") \
     .setFromNode("ReportWhenLoaded") \
     .setToField("startTime") \
     .setToNode("WaterSounds") \
    ) \
# send completion report to console 
    .addChild(Script() \
     .setDEF("ConsoleReport") \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("loadComplete") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("loadTime") \
      .setType("SFTime") \
     ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"function initialize ()\n"+
"{\n"+
"	Browser.println ('Script initialize() complete');\n"+
"}\n"+
"function loadComplete (value)\n"+
"{\n"+
"	Browser.println ('LoadSensor AudioClip isLoaded=' + value);\n"+
"}\n"+
"function loadTime (value)\n"+
"{\n"+
"	Browser.println ('LoadSensor AudioClip loadTime=' + value);\n"+
"}\n"+
"''')
    ) \
    .addChild(ROUTE() \
     .setFromField("isLoaded") \
     .setFromNode("ReportWhenLoaded") \
     .setToField("loadComplete") \
     .setToNode("ConsoleReport") \
    ) \
    .addChild(ROUTE() \
     .setFromField("loadTime") \
     .setFromNode("ReportWhenLoaded") \
     .setToField("loadTime") \
     .setToNode("ConsoleReport") \
    ) \
# show visible indication of load waiting, complete 
    .addChild(Transform() \
     .setDEF("PivotTextSigns") \
# First sign indicates waiting... 
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["LoadSensor waiting for AudioClip..."]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.7, style = "ITALIC") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setEmissiveColor([0.878431,0.262745,0]) \
       ) \
      ) \
     ) \
# Second sign indicates completed, initially rotated 90 degrees out of view 
     .addChild(Transform() \
      .setRotation([0,1,0,1.57]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["LoadSensor reports AudioClip loading complete."]) \
        .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.7, style = "ITALIC") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setEmissiveColor([0,0.278431,0.027451]) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(OrientationInterpolator() \
     .setDEF("SignRotationInterpolator") \
     .setKey([0,1]) \
     .setKeyValue([0,1,0,0,0,1,0,-1.57]) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("SignRotationClock") \
     .setCycleInterval(0.8) \
    ) \
    .addChild(ROUTE() \
     .setFromField("loadTime") \
     .setFromNode("ReportWhenLoaded") \
     .setToField("startTime") \
     .setToNode("SignRotationClock") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("SignRotationClock") \
     .setToField("set_fraction") \
     .setToNode("SignRotationInterpolator") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("SignRotationInterpolator") \
     .setToField("rotation") \
     .setToNode("PivotTextSigns") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound//SoundLoadSensorTest_RoundTrip.x3d")
