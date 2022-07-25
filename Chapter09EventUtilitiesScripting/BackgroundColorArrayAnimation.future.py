from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("BackgroundColorArrayAnimation.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Design pattern demonstrating type conversion from single SFColor value (sent from a ColorInterpolator node) to an MFColor array (in a Background node).") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman and MV3204 class") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("8 September 2009") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("8 September 2009") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("also create a new prototype ColorArrayInterpolator in Chapter 14") \
     .setName("TODO") \
    ) \
    .addMeta(meta() \
     .setContent("http://openclipart.org/media/tags/smiley") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/BackgroundColorArrayAnimation.x3d") \
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
    .addChild(TimeSensor() \
     .setDEF("Clock") \
     .setCycleInterval(10) \
     .setLoop(True) \
    ) \
    .addChild(ColorInterpolator() \
     .setDEF("ColorChanger") \
     .setKey([0,0.333333,0.666667,1]) \
     .setKeyValue([1,0,0,0,1,0,0,0,1,1,0,0]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("Clock") \
     .setToField("set_fraction") \
     .setToNode("ColorChanger") \
    ) \
    .addChild(Script() \
     .setDEF("ColorTypeConversionScript") \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("colorValueInput") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("colorArrayOutput") \
      .setType("MFColor") \
     ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"\n"+
"function colorValueInput (inputValue) // input event received for inputOnly field\n"+
"{\n"+
"   colorArrayOutput[0] =  inputValue; // perform type conversion, result is sent as output event\n"+
"}\n"+
"''')
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("ColorChanger") \
     .setToField("colorValueInput") \
     .setToNode("ColorTypeConversionScript") \
    ) \
    .addChild(Background() \
     .setDEF("SingleColorBackground") \
    ) \
    .addChild(ROUTE() \
     .setFromField("colorArrayOutput") \
     .setFromNode("ColorTypeConversionScript") \
     .setToField("skyColor") \
     .setToNode("SingleColorBackground") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//BackgroundColorArrayAnimation_RoundTrip.x3d")
