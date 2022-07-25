from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("newECMAscriptTest.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example scene providing a unit test for newECMAscript template javascript source code, first load this scene and then see console for test output.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("3 November 2013") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("25 October 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("newECMAscriptTestConsole.txt") \
     .setName("reference") \
    ) \
# local, master and online versions of script template 
    .addMeta(meta() \
     .setContent("newECMAscript.js") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("../newECMAscript.js") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/newECMAscript.js") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("../../build.xml#commonSetup") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("X3D javascript ECMAscript") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/newECMAscriptTest.x3d") \
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
     .setSkyColor([1,0.5,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Check X3D console to see output") \
     .setPosition([0,0,8]) \
    ) \
    .addChild(Transform() \
     .setScale([0.4,0.4,0.4]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["newECMAscriptTest.x3d","","to check newECMAscript.js","","(see browser console for output)"]) \
       .setFontStyle(FontStyle(family = ["SANS"], justify = ["MIDDLE","MIDDLE"], style = "BOLD") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,1,1]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Script() \
     .setDEF("TestScript") \
     .setUrl(["newECMAscript.js","../newECMAscript.js","http://www.web3d.org/x3d/content/examples/newECMAscript.js"]) \
# initialize() method includes unit test with output on browser console 
# authors adding field definitions put them here 
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//newECMAscriptTest_RoundTrip.x3d")
