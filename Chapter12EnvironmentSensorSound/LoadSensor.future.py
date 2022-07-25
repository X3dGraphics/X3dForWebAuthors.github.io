from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("LoadSensor.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simple test of LoadSensor node") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("17 July 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("1 January 2011") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright Don Brutzman and Leonard Daly 2008") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D LoadSensor example") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/LoadSensor.x3d") \
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
     .setDEF("ViewAll") \
     .setDescription("LoadSensor test") \
     .setPosition([0,0,12]) \
    ) \
    .addChild(Inline() \
     .setDEF("HelloWorld") \
     .setUrl(["../HelloWorld.x3d","http://www.web3d.org/x3d/content/examples/HelloWorld.x3d"]) \
    ) \
    .addChild(LoadSensor() \
     .setDEF("InlineLoadSensor") \
     .setTimeOut(5) \
     .setWatchList(Inline() \
      .setUSE("HelloWorld") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("PivotTextSigns") \
     .setTranslation([0,3,0]) \
# First sign indicates waiting... 
     .addChild(Shape() \
      .setGeometry(Text() \
       .setLength([0]) \
       .setString(["LoadSensor waiting for HelloWorld scene..."]) \
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
        .setLength([0]) \
        .setString(["LoadSensor reports HelloWorld scene loading complete."]) \
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
     .setFromNode("InlineLoadSensor") \
     .setToField("set_startTime") \
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
     .setToField("set_rotation") \
     .setToNode("PivotTextSigns") \
    ) \
    .addChild(Script() \
     .setDEF("TraceScript") \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("eventLoaded") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("loadTimeEvent") \
      .setType("SFTime") \
     ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"function eventLoaded (value)\n"+
"{\n"+
"	Browser.println ('InlineLoadSensor isLoaded=' + value);\n"+
"}\n"+
"function loadTimeEvent (value)\n"+
"{\n"+
"	Browser.println ('InlineLoadSensor loadTime=' + value);\n"+
"}\n"+
"''')
    ) \
    .addChild(ROUTE() \
     .setFromField("isLoaded") \
     .setFromNode("InlineLoadSensor") \
     .setToField("eventLoaded") \
     .setToNode("TraceScript") \
    ) \
    .addChild(ROUTE() \
     .setFromField("loadTime") \
     .setFromNode("InlineLoadSensor") \
     .setToField("loadTimeEvent") \
     .setToNode("TraceScript") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound//LoadSensor_RoundTrip.x3d")
