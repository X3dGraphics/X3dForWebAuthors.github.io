from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("TextLengthMaxExtent.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simple Text node, illustrating length array and maxExtent field") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("25 January 2009") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("21 March 2009") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("TextLengthMaxExtent.png") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright (c) Don Brutzman and Leonard Daly, 2005") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/TextLengthMaxExtent.x3d") \
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
    .addChild(Viewpoint() \
     .setDescription("Default View") \
     .setPosition([0,0,6]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book View") \
     .setPosition([0.89,-1.11,2.33]) \
    ) \
    .addChild(Transform() \
     .setTranslation([-2,0,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setDEF("LengthText") \
       .setLength([2,3,4]) \
       .setString(["length='2 3 4'","Second line 25 characters","Line 3 shortest"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
        .setDEF("CenteredFontStyle") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDEF("BlueMaterial") \
        .setDiffuseColor([0.219608,0.345098,1]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([2,0,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setDEF("maxExtentText") \
       .setMaxExtent(2.5) \
       .setString(["maxExtent='2.5'","Second line 25 characters","Line 3 shortest"]) \
       .setFontStyle(FontStyle() \
        .setUSE("CenteredFontStyle") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter02GeometryPrimitives//TextLengthMaxExtent_RoundTrip.x3d")
