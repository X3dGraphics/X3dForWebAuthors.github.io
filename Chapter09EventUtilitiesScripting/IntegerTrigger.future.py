from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("IntegerTrigger.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("An IntegerTrigger node controls the display of colored text.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman and Leonard Daly") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("1 March 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("5 October 2015") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("KelpTank.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/IntegerTrigger.x3d") \
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
     .setDescription("Select text to change color") \
     .setPosition([0,0,6]) \
    ) \
    .addChild(Switch() \
     .setDEF("SwitchColoredTextGroups") \
     .setWhichChoice(0) \
     .addChild(Group() \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0,0]) \
        ) \
       ) \
       .setGeometry(Text() \
        .setDEF("MessageText") \
        .setString(["Select these words","to change color"]) \
        .setFontStyle(FontStyle(justify = ["MIDDLE","BEGIN"]) \
        ) \
       ) \
      ) \
# TransparentBox makes selection of Text using TouchSensor easier for user 
      .addChild(Shape() \
       .setDEF("TransparentBox") \
       .setGeometry(Box(size = [6,2,0.02]) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setTransparency(1) \
        ) \
       ) \
      ) \
      .addChild(TouchSensor() \
       .setDEF("Touch1") \
       .setDescription("touch to activate") \
      ) \
     ) \
# Reuse Text geoemetry, paired with different Material colors 
     .addChild(Group() \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,1,1]) \
        ) \
       ) \
       .setGeometry(Text() \
        .setUSE("MessageText") \
       ) \
      ) \
      .addChild(Shape() \
       .setUSE("TransparentBox") \
      ) \
      .addChild(TouchSensor() \
       .setDEF("Touch2") \
       .setDescription("touch to activate") \
      ) \
     ) \
     .addChild(Group() \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.7,0.7,0]) \
        ) \
       ) \
       .setGeometry(Text() \
        .setUSE("MessageText") \
       ) \
      ) \
      .addChild(Shape() \
       .setUSE("TransparentBox") \
      ) \
      .addChild(TouchSensor() \
       .setDEF("Touch3") \
       .setDescription("touch to activate") \
      ) \
     ) \
    ) \
# IntegerTrigger nodes used to switch child shapes, must use separate one for each output value 
    .addChild(IntegerTrigger() \
     .setDEF("Filter1") \
     .setIntegerKey(1) \
    ) \
    .addChild(IntegerTrigger() \
     .setDEF("Filter2") \
     .setIntegerKey(2) \
    ) \
    .addChild(IntegerTrigger() \
     .setDEF("Filter3") \
     .setIntegerKey(0) \
    ) \
    .addChild(ROUTE() \
     .setFromField("isActive") \
     .setFromNode("Touch1") \
     .setToField("set_boolean") \
     .setToNode("Filter1") \
    ) \
    .addChild(ROUTE() \
     .setFromField("isActive") \
     .setFromNode("Touch2") \
     .setToField("set_boolean") \
     .setToNode("Filter2") \
    ) \
    .addChild(ROUTE() \
     .setFromField("isActive") \
     .setFromNode("Touch3") \
     .setToField("set_boolean") \
     .setToNode("Filter3") \
    ) \
    .addChild(ROUTE() \
     .setFromField("triggerValue") \
     .setFromNode("Filter1") \
     .setToField("whichChoice") \
     .setToNode("SwitchColoredTextGroups") \
    ) \
    .addChild(ROUTE() \
     .setFromField("triggerValue") \
     .setFromNode("Filter2") \
     .setToField("whichChoice") \
     .setToNode("SwitchColoredTextGroups") \
    ) \
    .addChild(ROUTE() \
     .setFromField("triggerValue") \
     .setFromNode("Filter3") \
     .setToField("whichChoice") \
     .setToNode("SwitchColoredTextGroups") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//IntegerTrigger_RoundTrip.x3d")
