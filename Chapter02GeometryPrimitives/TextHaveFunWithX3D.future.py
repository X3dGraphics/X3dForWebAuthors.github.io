from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("TextHaveFunWithX3D.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simple smiley-face example illustrating an emoticon character entity, used in an MFString Text.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("26 April 2017") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("26 April 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("TextHaveFunWithX3D.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("http://unicode.org/emoji/charts/full-emoji-list.html") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://en.wikipedia.org/wiki/Emoticons_(Unicode_block)") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://en.wikipedia.org/wiki/Universal_Character_Set_characters") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://www.w3.org/TR/html4/sgml/entities.html") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://dev.w3.org/html5/html-author/charref") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://www.w3.org/wiki/Common_HTML_entities_used_for_typography") \
     .setName("reference") \
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
     .setContent("Copyright Don Brutzman and Leonard Daly 2007") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("emoji emoticon, X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/TextHaveFunWithX3D.x3d") \
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
     .setSkyColor([0.819608,0.984314,1]) \
    ) \
    .addChild(Shape() \
# &#9786; = smiley face emoticon, and \"\" means skip a line 
     .setGeometry(Text(solid = False) \
      .setString(["Have fun","with X3D!","",":)   ☺"]) \
      .setFontStyle(FontStyle(family = ["SANS"], justify = ["MIDDLE","MIDDLE"], size = 1, style = "BOLD") \
      ) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setAmbientIntensity(0.25) \
       .setDiffuseColor([0,0.251004,0.239248]) \
       .setShininess(0.06) \
       .setSpecularColor([0.177935,0.249369,0.229278]) \
# Universal Media Library: ArtDeco 19 
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter02GeometryPrimitives//TextHaveFunWithX3D_RoundTrip.x3d")
