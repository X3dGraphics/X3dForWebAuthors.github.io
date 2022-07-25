from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("MaterialModulatorPrototypeExpanded.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Provide example for expansion of a MaterialModulator as regular X3D nodes, rather than a ProtoDeclare/ProtoInstance combination. MaterialModulator mimics a Material node and modulates diffuseColor field as an animation effect.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman, John Carlson, Roy Walmsley") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("2 July 2016") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("15 April 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("X3D prototype expander, IS/connect, Script inputOutput field") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("MaterialModulator.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("MaterialModulator.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("JSON prototype expander https://github.com/coderextreme/X3DJSONLD") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Create corresponding web page describing Prototype Expander design.") \
     .setName("TODO") \
    ) \
    .addMeta(meta() \
     .setContent("Create stylesheet converter matching this Prototype Expander design pattern.") \
     .setName("TODO") \
    ) \
    .addMeta(meta() \
     .setContent("Add external ROUTEs to original example as a further test case for Prototype Expander design.") \
     .setName("TODO") \
    ) \
    .addMeta(meta() \
     .setContent("https://github.com/coderextreme/X3DJSONLD/blob/master/PrototypeExpander.js") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://github.com/coderextreme/X3DJSONLD/blob/master/ServerPrototypeExpander.js") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("X3D Tooltips: ProtoBody http://www.web3d.org/x3d/content/X3dTooltips.html#ProtoBody") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("4.4.4.3 PROTO definition semantics http://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#PROTOdefinitionsemantics") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("[x3d-public] Prototype Expander, Question on design of instance expansions: http://web3d.org/pipermail/x3d-public_web3d.org/2016-July/004982.html") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulatorPrototypeExpanded.x3d") \
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
    .addChild(Shape() \
     .setGeometry(Sphere() \
     ) \
     .setAppearance(Appearance() \
# Prototype Expander design note: only first node (the node type) of the prototype is substituted here. 
      .setMaterial(Material() \
       .setDEF("MaterialModulatorNodeExpanded1") \
       .setDiffuseColor([0.5,0.1,0.1]) \
# Prototype Expander design note: no children nodes found in originally defined initial ProtoBody node, so no contained child nodes appear here 
      ) \
     ) \
    ) \
# Prototype Expander design note: only first node (the node type) of the prototype is renderable above. when Switch is first allowed 
    .addChild(Switch() \
     .setDEF("HideAdditionalPrototypeBodyNodesExpanded1") \
     .setWhichChoice(-1) \
# Prototype Expander design note: all children inside a Switch continue to receive/send events. 
     .addChild(Group() \
# Prototype Expander design note: additional follow-on nodes from the original ProtoBody are placed here. 
      .addChild(Script() \
       .setDEF("MaterialModulatorScriptExpanded1") \
       .addField(field() \
        .setAccessType("inputOutput") \
        .setName("enabled") \
        .setType("SFBool") \
        .setValue("true") \
       ) \
       .addField(field() \
        .setAccessType("inputOutput") \
        .setName("diffuseColor") \
        .setType("SFColor") \
        .setValue("0.5 0.1 0.1") \
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
.setSourceCode('''\n"+
"ecmascript:\n"+
"function initialize ()\n"+
"{\n"+
"    newColor = diffuseColor; // start with correct color\n"+
"}\n"+
"function clockTrigger (timeValue)\n"+
"{\n"+
"    if (!enabled) return;\n"+
"    red   = newColor.r;\n"+
"    green = newColor.g;\n"+
"    blue  = newColor.b;\n"+
"    \n"+
"    // note different modulation rates for each color component, % is modulus operator\n"+
"    newColor = new SFColor ((red + 0.02) % 1, (green + 0.03) % 1, (blue + 0.04) % 1);   \n"+
"    Browser.print ('diffuseColor=(' + red +',' + green + ',' + blue + ') newColor=' + newColor.toString() + '\\n');\n"+
"}\n"+
"''')
      ) \
# Clock tickles Script to wake up and compute a new value 
      .addChild(ROUTE() \
       .setFromField("newColor") \
       .setFromNode("MaterialModulatorScriptExpanded1") \
       .setToField("diffuseColor") \
       .setToNode("MaterialModulatorNodeExpanded1") \
      ) \
      .addChild(TimeSensor() \
       .setDEF("ModulationClockExpanded1") \
       .setCycleInterval(0.1) \
       .setLoop(True) \
      ) \
      .addChild(ROUTE() \
       .setFromField("cycleTime") \
       .setFromNode("ModulationClockExpanded1") \
       .setToField("clockTrigger") \
       .setToNode("MaterialModulatorScriptExpanded1") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter14Prototypes//MaterialModulatorPrototypeExpanded_RoundTrip.x3d")
