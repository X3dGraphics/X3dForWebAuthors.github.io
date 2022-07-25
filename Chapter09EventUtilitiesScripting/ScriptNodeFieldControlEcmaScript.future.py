from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ScriptNodeFieldControlEcmaScript.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Script node interface between X3D and EcmaScript: this conformance example tests field-based X3D-EcmaScript functionality.") \
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
     .setContent("http://www.web3d.org/x3d/content/examples/Basic/ScriptConformance/ScriptNodeFieldControlEcmaScript.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/ScriptNodeFieldControlEcmaScript.x3d") \
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
     .setContent("ScriptNodeFieldControlEcmaScript-VrmlConsoleOutput.txt") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("ScriptNodeFieldControlEcmaScriptSnapshots.html") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("ScriptNodeFieldControl-Java.x3d") \
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
     .addChild(Script(directOutput = True) \
      .setDEF("InterfaceScriptNode") \
# No default values are allowed for eventIn or eventOut. 
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("startTime") \
       .setType("SFTime") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setName("sceneText") \
       .setType("SFNode") \
       .addChild(Text() \
        .setUSE("MessageToUser") \
       ) \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setName("sceneTransform") \
       .setType("SFNode") \
       .addChild(Transform() \
        .setUSE("TextPosition") \
       ) \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setName("sceneMaterial") \
       .setType("SFNode") \
       .addChild(Material() \
        .setUSE("TextMaterial") \
       ) \
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
"	sceneText.string = new MFString (\n"+
"	'EcmaScript initialize () with field control',\n"+
" 	'has reinitialized the changedText node.',\n"+
" 	'',\n"+
" 	'Please click text for additional results.');\n"+
"	sceneTransform.translation = new SFVec3f ( 0, 3, 0 );\n"+
"	sceneMaterial.diffuseColor = new SFColor ( 0.8, 0.8, 0.2 );\n"+
"	if (DEBUG) Browser.print ('sceneText.string           =' + sceneText.string);\n"+
"	if (DEBUG) Browser.print ('sceneTransform.translation =' + sceneTransform.translation);\n"+
"	if (DEBUG) Browser.print ('sceneMaterial.diffuseColor =' + sceneMaterial.diffuseColor);\n"+
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
"		sceneText.string = new MFString (\n"+
"		'Default text in X3D scene will be replaced by',\n"+
" 		'EcmaScript initialize() in Script using field control.',\n"+
" 		'This text appears first, if EcmaScript initialization fails.',\n"+
" 		'');\n"+
" 		sceneTransform.translation = new SFVec3f ( 0, 1, 0 );\n"+
"		sceneMaterial.diffuseColor = new SFColor ( 0.8, 0.2, 0.2 ); \n"+
"	  	break;\n"+
"\n"+
"	  case 1:	// post-initialize ready-to-click message\n"+
"		initialize ();\n"+
"		break;\n"+
"\n"+
"	  case 2:	// post-click all-done message\n"+
"		sceneText.string = new MFString (\n"+
"		'User click on text seen by EcmaScript',\n"+
" 		'function via Script node eventIn.',\n"+
" 		'Text & position successfully changed',\n"+
" 		'via field control.  Test passed.');\n"+
"	 	sceneTransform.translation = new SFVec3f ( 0, -1, 0 );\n"+
"	 	sceneMaterial.diffuseColor = new SFColor ( 0.2, 0.8, 0.2 );\n"+
"		break;\n"+
"	}\n"+
"		\n"+
"	if (mode != 1)\n"+
"	{\n"+
"	 	if (DEBUG) Browser.print ('sceneText.string           =' + sceneText.string);\n"+
"	 	if (DEBUG) Browser.print ('sceneTransform.translation =' + sceneTransform.translation);\n"+
"	 	if (DEBUG) Browser.print ('sceneMaterial.diffuseColor =' + sceneMaterial.diffuseColor);\n"+
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
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//ScriptNodeFieldControlEcmaScript_RoundTrip.x3d")
