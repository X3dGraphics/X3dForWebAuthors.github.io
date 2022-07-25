from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("AnchorComparison.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Anchor-node examples comparing HTML page launch, shifting Viewpoints, and loading another X3D scene.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("21 April 2011") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("23 April 2011") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("AnchorComparisonFrontViewpoint.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("AnchorComparisonObliqueViewpoint.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("Show Anchor link to Monterey Bay Aquarium web site for Kelp Forest exhibit") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.mbayaq.org/efc/kelp.asp") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/X3dResources.html") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright (c) 2005, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/AnchorComparison.x3d") \
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
     .setDEF("FrontView") \
     .setDescription("Front view Anchor text") \
     .setPosition([0,0,8]) \
    ) \
    .addChild(Viewpoint() \
     .setDEF("AngledView") \
     .setDescription("Side view Anchor text") \
     .setOrientation([0,1,0,0.7854]) \
     .setPosition([6,0,6]) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,2,0]) \
# First Anchor loads a web page 
     .addChild(Anchor() \
      .setDEF("AnchorExample") \
      .setDescription("Aquarium Exhibit Web Site") \
      .setParameter(["target=_blank"]) \
      .setUrl(["http://www.montereybayaquarium.org/efc/kelp.asp"]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["Click orange text to launch","Monterey Bay Aquarium","kelp forest HTML page"]) \
        .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.6) \
         .setDEF("LocalFontStyle") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDEF("Autumn11") \
         .setAmbientIntensity(0.25641) \
         .setDiffuseColor([0.795918,0.273554,0.006861]) \
         .setShininess(1) \
         .setSpecularColor([0.48655,0.319155,0.444036]) \
# Universal Media Library: Autumn 11 
        ) \
       ) \
      ) \
# Add transparent geometry over the text to make clicking (i.e. Anchor selection) easier 
      .addChild(Shape() \
       .setDEF("TransparentBoxForEasierUserSelection") \
       .setGeometry(Box(size = [6,2,0.02]) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setTransparency(1) \
        ) \
       ) \
      ) \
     ) \
    ) \
# Second Anchor brings user to a different viewpoint 
    .addChild(Transform() \
     .setTranslation([0,-0.25,0]) \
     .addChild(Anchor() \
      .setDescription("Move view to diagonal Viewpoint") \
      .setUrl(["#AngledView"]) \
      .addChild(Shape() \
       .setDEF("AnchorMessage2") \
       .setGeometry(Text() \
        .setString(["Click yellow text to move","to a diagonal Viewpoint"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LocalFontStyle") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setAmbientIntensity(0.25641) \
         .setDiffuseColor([0.222308,0.15428,0]) \
         .setShininess(0.02) \
         .setSpecularColor([0.678571,0.661796,0.528818]) \
# Universal Media Library: Metals 16 
        ) \
       ) \
      ) \
      .addChild(Shape() \
       .setUSE("TransparentBoxForEasierUserSelection") \
      ) \
     ) \
    ) \
# Third Anchor Launches Kelp Forest scene 
    .addChild(Transform() \
     .setTranslation([0,-2,0]) \
     .addChild(Anchor() \
      .setUrl(["../Chapter03Grouping/CoordinateAxes.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","../Chapter03Grouping/CoordinateAxes.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl"]) \
      .addChild(Shape() \
       .setDEF("AnchorMessage3") \
       .setGeometry(Text() \
        .setString(["Click green text to load X3D","CoordinateAxes.x3d scene"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LocalFontStyle") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setAmbientIntensity(0.25) \
         .setDiffuseColor([0.315389,0.544,0.258052]) \
         .setShininess(0.5) \
         .setSpecularColor([0.456,0.456,0.456]) \
# Universal Media Library: Autumn 28 
        ) \
       ) \
      ) \
      .addChild(Shape() \
       .setUSE("TransparentBoxForEasierUserSelection") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter04ViewingNavigation//AnchorComparison_RoundTrip.x3d")
