from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("TestScriptInitialization.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Test ability to perform Script initialize() method using ECMAsript") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("16 February 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("20 November 2011") \
     .setName("modified") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/TestScriptInitialization.x3d") \
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
     .setGeometry(Text() \
      .setDEF("DisplayText") \
      .setString(["waiting for","Script to initialize()..."]) \
      .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
      ) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setAmbientIntensity(0) \
       .setDiffuseColor([0,0,0]) \
       .setEmissiveColor([0,0.398733,1]) \
       .setShininess(0.05) \
       .setSpecularColor([0.622449,0.622449,0.622449]) \
      ) \
     ) \
    ) \
    .addChild(Script() \
     .setDEF("Initializer") \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("initializeResult") \
      .setType("MFString") \
     ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"\n"+
"function initialize ()\n"+
"{\n"+
"    scriptName = 'TestScriptInitialization.x3d';\n"+
"    Browser.print ('[' + scriptName + ' initialize() commmenced...]');\n"+
"\n"+
"    initializeResult = new MFString (\"Script initialize() OK\");\n"+
"\n"+
"    Browser.print ('[...' + scriptName + ' initialize() complete]');\n"+
"}\n"+
"''')
    ) \
    .addChild(ROUTE() \
     .setFromField("initializeResult") \
     .setFromNode("Initializer") \
     .setToField("string") \
     .setToNode("DisplayText") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//TestScriptInitialization_RoundTrip.x3d")
