from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ScriptNodeEventOutControlEcmaScript.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Script node interface between X3D and EcmaScript: this conformance example tests event-based X3D-EcmaScript functionality.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("30 November 1997") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("13 May 2001") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("2 April 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/Basic/ScriptConformance/ScriptNodeEventOutControlEcmaScript.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/ScriptNodeEventOutControlEcmaScript.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("VRML 97 Specification, Annex C, ECMAScript scripting reference") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/technicalinfo/specifications/vrml97/part1/javascript.html") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/technicalinfo/specifications/vrml97/part1/javascript.html#AccessingFields") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Makefile") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Makefile.out") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("ScriptNodeEventOutControlEcmaScript-VrmlConsoleOutput.txt") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("ScriptNodeEventOutControlEcmaScriptSnapshots.html") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("ScriptNodeEventOutControl-Java.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("VRML X3D EcmaScript Script conformance") \
     .setName("subject") \
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
     .setDescription("View test") \
     .setPosition([0,0,12]) \
    ) \
    .addChild(Group() \
     .addChild(TouchSensor() \
      .setDEF("ClickTextToTest") \
      .setDescription("Click text to test") \
     ) \
     .addChild(Transform() \
      .setDEF("TextPosition") \
# TextPosition translation is modified by InterfaceScriptNode. 
      .addChild(Shape() \
# note \"\" means empty string, which skips a line and pushes the other text upwards by a line 
       .setGeometry(Text() \
        .setDEF("MessageToUser") \
        .setString(["Default text in X3D scene will be replaced by","Java initialize() in Script using EventOut control.","This text appears first, if Java initialization fails."]) \
        .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.8) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDEF("TextMaterial") \
         .setDiffuseColor([0.8,0.2,0.2]) \
         .setShininess(0.9) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Script() \
      .setDEF("InterfaceScriptNode") \
# No default values are allowed for eventIn or eventOut. 
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("startTime") \
       .setType("SFTime") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("changedText") \
       .setType("MFString") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("changedPosition") \
       .setType("SFVec3f") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("changedColor") \
       .setType("SFColor") \
      ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"\n"+
"function initialize ()\n"+
"{\n"+
"	DEBUG = true;\n"+
"	mode  = 1;\n"+
"	if (DEBUG) Browser.print ('initialize ():');\n"+
"\n"+
"	changedText = new MFString (\n"+
"	'EcmaScript initialize () with eventOut control',\n"+
" 	'has reinitialized the changedText node.',\n"+
" 	'',\n"+
" 	'Please click text for additional results.');\n"+
"	changedPosition = new SFVec3f ( 0, 3, 0 );\n"+
"	changedColor    = new SFColor ( 0.8, 0.8, 0.2 );\n"+
"	if (DEBUG) Browser.print ('changedText =' + changedText);\n"+
"	if (DEBUG) Browser.print ('changedPosition =' + changedPosition);\n"+
"	if (DEBUG) Browser.print ('changedColor =' + changedColor);\n"+
"}\n"+
"function startTime (value, timestamp)\n"+
"{\n"+
"	if (DEBUG) Browser.print ('==============================');\n"+
"	if (DEBUG) Browser.print ('touchEvent startTime =' + value);\n"+
"\n"+
"	mode = (mode + 1) % 3;\n"+
"	if (DEBUG) Browser.print ('mode =' + mode);\n"+
"	switch (mode)\n"+
"	{\n"+
"	  case 0:	// pre-initialize error messsage\n"+
"		changedText = new MFString (\n"+
"		'Default text in X3D scene will be replaced by',\n"+
" 		'EcmaScript initialize() in Script using EventOut control.',\n"+
" 		'This text appears first, if EcmaScript initialization fails.',\n"+
" 		'');\n"+
" 		changedPosition = new SFVec3f ( 0, 1, 0 );\n"+
"		changedColor    = new SFColor ( 0.8, 0.2, 0.2 ); \n"+
"	  	break;\n"+
"\n"+
"	  case 1:	// post-initialize ready-to-click message\n"+
"		initialize ();\n"+
"		break;\n"+
"\n"+
"	  case 2:	// post-click all-done message\n"+
"		changedText = new MFString (\n"+
"		'User click on text seen by EcmaScript',\n"+
" 		'function via Script node eventIn.',\n"+
" 		'Text & position successfully changed',\n"+
" 		'via EventOut control.  Test passed.');\n"+
"	 	changedPosition = new SFVec3f ( 0, -1, 0 );\n"+
"	 	changedColor    = new SFColor ( 0.2, 0.8, 0.2 );\n"+
"		break;\n"+
"	}\n"+
"		\n"+
"	if (mode != 1)\n"+
"	{\n"+
"	 	if (DEBUG) Browser.print ('changedText     =' + changedText);\n"+
"	 	if (DEBUG) Browser.print ('changedPosition =' + changedPosition);\n"+
"	 	if (DEBUG) Browser.print ('changedColor    =' + changedColor);\n"+
"	 	if (DEBUG) Browser.print ();\n"+
" 	}\n"+
"}\n"+
"function shutdown()\n"+
"{\n"+
"	if (DEBUG) Browser.print ('==============================');\n"+
"  	if (DEBUG) Browser.print ('script shutdown.');\n"+
"	if (DEBUG) Browser.print ('==============================');\n"+
"}\n"+
"''')
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("touchTime") \
     .setFromNode("ClickTextToTest") \
     .setToField("startTime") \
     .setToNode("InterfaceScriptNode") \
    ) \
    .addChild(ROUTE() \
     .setFromField("changedText") \
     .setFromNode("InterfaceScriptNode") \
     .setToField("set_string") \
     .setToNode("MessageToUser") \
    ) \
    .addChild(ROUTE() \
     .setFromField("changedPosition") \
     .setFromNode("InterfaceScriptNode") \
     .setToField("set_translation") \
     .setToNode("TextPosition") \
    ) \
    .addChild(ROUTE() \
     .setFromField("changedColor") \
     .setFromNode("InterfaceScriptNode") \
     .setToField("set_diffuseColor") \
     .setToNode("TextMaterial") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//ScriptNodeEventOutControlEcmaScript_RoundTrip.x3d")
