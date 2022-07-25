from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("TextSpecialCharacters.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Text node demonstration of quotation, apostrophe, ampersand and backslash characters using X3D MFString escaping for XML character entities.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("12 July 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("7 May 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("See screenshot figures and various encoding conversions to note that multiple equivalences in XML character representations lead to consistent results despite slight differences in source.") \
     .setName("info") \
    ) \
    .addMeta(meta() \
     .setContent("TextSpecialCharactersScreenshotXmlSource.png") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("TextSpecialCharactersScreenshotPrettyPrintHtml.png") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Character entity references in HTML 4, http://www.w3.org/TR/REC-html40/sgml/entities.html") \
     .setName("reference") \
    ) \
# note quotes in comment and meta reference: https://en.wikipedia.org/wiki/\"Hello,_World!\"_program 
    .addMeta(meta() \
     .setContent("https://en.wikipedia.org/wiki/\"Hello,_World!\"_program") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright (c) Don Brutzman and Leonard Daly, 2008") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/TextSpecialCharacters.x3d") \
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
     .setDescription("Default View") \
     .setPosition([0,0,15]) \
    ) \
    .addChild(Shape() \
# Empty string \"\" means to skip a line 
# The ampersand escape characters are based on XML rules 
# apostrophe ' is &apos; and needs to be escaped in single-quote delimiters used for string='value' attribute 
# ampersand & is &amp; and needs to be escaped 
# quotation mark \" is &quot; and isn't needed if single-quote delimiters used for string='value' attribute 
# quotation mark \" character can be used within an X3D string value if escaped with backslash \\ as \\\" 
# backslash \\ is used as escape character for \" (and itself) in X3D 
# character entities are listed in HTML specification and are good for any XML 
     .setGeometry(Text() \
      .setDEF("DefaultText") \
      .setString(["Character entity substitutions:","empty string \"\" skips a line:","","apostrophe  '  is &apos;","ampersand & is &amp;","quote mark  \"  is &quot;","backslash \\\\ is X3D escape character","double backslash \\\\\\\\ is X3D backslash \\\\ character","Pi Π is &#928; XML character entity"]) \
      .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
       .setDEF("CenteredFontStyle") \
      ) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setDEF("DefaultMaterial") \
       .setDiffuseColor([0.2,0.2,0.2]) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter02GeometryPrimitives//TextSpecialCharacters_RoundTrip.x3d")
