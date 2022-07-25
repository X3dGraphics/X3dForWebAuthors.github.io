from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("MaterialModulator.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Mimic a Material node and modulate the diffuseColor field as an animation effect, provided as a prototype for reusability.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Learning suggestion for authors: try changing the modulation script so that it goes from [0 ... 1] and then [1 ... 0] alternating, rather than abruptly shifting from 1 immediately back to 0.") \
     .setName("hint") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("10 March 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("15 April 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("X3D prototype requiring Script inputOutput fields") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("MaterialModulator.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulator.x3d") \
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
    .addChild(ProtoDeclare() \
     .setAppinfo("mimic a Material node and modulate the diffuseColor field as an animation effect") \
     .setDocumentation("http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulatorIndex.html") \
     .setName("MaterialModulator") \
     .setProtoInterface(ProtoInterface() \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("default value true") \
       .setName("enabled") \
       .setType("SFBool") \
       .setValue("true") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("default value 0.8 0.8 0.8") \
       .setName("diffuseColor") \
       .setType("SFColor") \
       .setValue("0.8 0.8 0.8") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("default value 0 0 0") \
       .setName("emissiveColor") \
       .setType("SFColor") \
       .setValue("0 0 0") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("default value 0 0 0") \
       .setName("specularColor") \
       .setType("SFColor") \
       .setValue("0 0 0") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("default value 0.0") \
       .setName("transparency") \
       .setType("SFFloat") \
       .setValue("0.0") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("default value 0.2") \
       .setName("shininess") \
       .setType("SFFloat") \
       .setValue("0.2") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("default value 0.2") \
       .setName("ambientIntensity") \
       .setType("SFFloat") \
       .setValue("0.2") \
      ) \
     ) \
     .setProtoBody(ProtoBody() \
      .addChild(Material() \
       .setDEF("MaterialNode") \
       .setIS(IS() \
        .addConnect(connect() \
         .setNodeField("diffuseColor") \
         .setProtoField("diffuseColor") \
        ) \
        .addConnect(connect() \
         .setNodeField("emissiveColor") \
         .setProtoField("emissiveColor") \
        ) \
        .addConnect(connect() \
         .setNodeField("specularColor") \
         .setProtoField("specularColor") \
        ) \
        .addConnect(connect() \
         .setNodeField("transparency") \
         .setProtoField("transparency") \
        ) \
        .addConnect(connect() \
         .setNodeField("shininess") \
         .setProtoField("shininess") \
        ) \
        .addConnect(connect() \
         .setNodeField("ambientIntensity") \
         .setProtoField("ambientIntensity") \
        ) \
       ) \
      ) \
# Only first node (the node type) is renderable, others are along for the ride 
      .addChild(Script() \
       .setDEF("MaterialModulatorScript") \
       .addField(field() \
        .setAccessType("inputOutput") \
        .setName("enabled") \
        .setType("SFBool") \
       ) \
       .addField(field() \
        .setAccessType("inputOutput") \
        .setName("diffuseColor") \
        .setType("SFColor") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("newColor") \
        .setType("SFColor") \
       ) \
       .addField(field() \
        .setAccessType("inputOnly") \
        .setName("clockTrigger") \
        .setType("SFTime") \
       ) \
       .setIS(IS() \
        .addConnect(connect() \
         .setNodeField("enabled") \
         .setProtoField("enabled") \
        ) \
        .addConnect(connect() \
         .setNodeField("diffuseColor") \
         .setProtoField("diffuseColor") \
        ) \
       ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"function initialize ()\n"+
"{\n"+
"    newColor = diffuseColor; // start with original color\n"+
"}\n"+
"function clockTrigger (timeValue)\n"+
"{\n"+
"    if (!enabled) return;\n"+
"    red   = newColor.r;\n"+
"    green = newColor.g;\n"+
"    blue  = newColor.b;\n"+
"    \n"+
"    // note different modulation rates for each color component, % is modulus operator\n"+
"    newColor = new SFColor ((red + 0.02) % 1, (green + 0.03) % 1, (blue + 0.04) % 1);\n"+
"	if (enabled)\n"+
"	{\n"+
"		Browser.print ('diffuseColor=(' + red +',' + green + ',' + blue + ') newColor=' + newColor.toString() + '\\n');\n"+
"	}\n"+
"}\n"+
"function set_enabled (newValue)\n"+
"{\n"+
"	enabled = newValue;\n"+
"}\n"+
"''')
      ) \
# Clock tickles Script to wake up and compute a new value 
      .addChild(ROUTE() \
       .setFromField("newColor") \
       .setFromNode("MaterialModulatorScript") \
       .setToField("diffuseColor") \
       .setToNode("MaterialNode") \
      ) \
      .addChild(TimeSensor() \
       .setDEF("ModulationClock") \
       .setCycleInterval(0.1) \
       .setLoop(True) \
       .setIS(IS() \
        .addConnect(connect() \
         .setNodeField("enabled") \
         .setProtoField("enabled") \
        ) \
       ) \
      ) \
      .addChild(ROUTE() \
       .setFromField("cycleTime") \
       .setFromNode("ModulationClock") \
       .setToField("clockTrigger") \
       .setToNode("MaterialModulatorScript") \
      ) \
     ) \
    ) \
# Rendered geometry for the ProtoInstance now follows prototype declaration 
    .addChild(Transform() \
     .setTranslation([0,1,0]) \
     .addChild(Shape() \
      .setGeometry(Sphere() \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(ProtoInstance() \
        .setDEF("MaterialModulatorInstance") \
        .setName("MaterialModulator") \
        .addFieldValue(fieldValue() \
         .setName("enabled") \
         .setValue("true") \
        ) \
        .addFieldValue(fieldValue() \
         .setName("diffuseColor") \
         .setValue("0.5 0.1 0.1") \
        ) \
# fieldValue declarations for other Material attributes can appear here 
       ) \
      ) \
     ) \
    ) \
# Selectable Text design pattern has transparent Box and TouchSensor description as a tooltip 
    .addChild(Transform() \
     .setTranslation([0,-2,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["enable/disable","MaterialModulator"]) \
       .setFontStyle(FontStyle(family = ["SANS"], justify = ["MIDDLE","MIDDLE"], size = 1, style = "BOLD") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0.9,0.9,0.9]) \
       ) \
      ) \
     ) \
     .addChild(Shape() \
      .setGeometry(Box(size = [8,2,.001]) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setTransparency(1) \
       ) \
      ) \
     ) \
# Toggle text to enable/disable MaterialModulator 
     .addChild(TouchSensor() \
      .setDEF("TouchTextInterface") \
      .setDescription("Select to enable/disable MaterialModulator") \
     ) \
     .addChild(BooleanToggle() \
      .setDEF("EventToggler") \
     ) \
     .addChild(ROUTE() \
      .setFromField("isActive") \
      .setFromNode("TouchTextInterface") \
      .setToField("set_boolean") \
      .setToNode("EventToggler") \
     ) \
     .addChild(ROUTE() \
      .setFromField("toggle") \
      .setFromNode("EventToggler") \
      .setToField("enabled") \
      .setToNode("MaterialModulatorInstance") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter14Prototypes//MaterialModulator_RoundTrip.x3d")
