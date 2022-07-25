from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("TimeTriggerTest.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Test of TimeTrigger node.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("8 October 2007") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("5 October 2015") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/TimeTriggerTest.x3d") \
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
     .setDescription("TimeTrigger test") \
     .setPosition([0,0,7]) \
    ) \
    .addChild(Transform() \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([.6,0,.8]) \
       ) \
      ) \
      .setGeometry(Text() \
       .setString(["Touch text to print","output values on console"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
       ) \
      ) \
     ) \
# Selectable Text design pattern has transparent Box and TouchSensor description as a tooltip 
     .addChild(Shape() \
      .setGeometry(Box(size = [9,2,.001]) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setTransparency(1) \
       ) \
      ) \
     ) \
# This TouchSensor only reacts to user clicking on the sibling Shape and Text, because it is under a parent Transform grouping node 
     .addChild(TouchSensor() \
      .setDEF("TextTouched") \
      .setDescription("touch to activate") \
     ) \
    ) \
    .addChild(BooleanFilter() \
     .setDEF("Filter") \
    ) \
    .addChild(ROUTE() \
     .setFromField("isActive") \
     .setFromNode("TextTouched") \
     .setToField("set_boolean") \
     .setToNode("Filter") \
    ) \
    .addChild(TimeTrigger() \
     .setDEF("Trigger") \
    ) \
    .addChild(ROUTE() \
     .setFromField("inputTrue") \
     .setFromNode("Filter") \
     .setToField("set_boolean") \
     .setToNode("Trigger") \
    ) \
    .addChild(Script() \
     .setDEF("TraceScript") \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("printBoolean") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("printTimestamp") \
      .setType("SFTime") \
     ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"    function printBoolean (value) {\n"+
"      Browser.print ('TouchSensor isActive=\"' + value + '\"\\n');\n"+
"    }\n"+
"    function printTimestamp (value) {\n"+
"      Browser.print ('====================================' +  '\\n');\n"+
"      Browser.print ('Trigger triggerTime=\"' + value + '\"\\n');\n"+
"    }\n"+
"''')
    ) \
    .addChild(ROUTE() \
     .setFromField("triggerTime") \
     .setFromNode("Trigger") \
     .setToField("printTimestamp") \
     .setToNode("TraceScript") \
    ) \
    .addChild(ROUTE() \
     .setFromField("isActive") \
     .setFromNode("TextTouched") \
     .setToField("printBoolean") \
     .setToNode("TraceScript") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//TimeTriggerTest_RoundTrip.x3d")
