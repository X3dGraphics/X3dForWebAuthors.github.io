from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("Anchor.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Anchor example using the Kelp Forest world.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly, Don Brutzman and Marlon Heron") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("14 November 2005") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("21 November 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Show Anchor link to Monterey Bay Aquarium web site for Kelp Forest exhibit") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("KelpForestLiveWebCam.jpg") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.montereybayaquarium.org/animals-and-experiences/live-web-cams/kelp-forest-cam") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.montereybayaquarium.org/animals-and-experiences/exhibits/kelp-forest") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/Anchor.x3d") \
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
    .addChild(Transform() \
     .setTranslation([0,8,30]) \
     .addChild(Viewpoint() \
      .setDescription("view Anchor text") \
      .setPosition([0,-1,12]) \
     ) \
     .addChild(Transform() \
      .setTranslation([-2.25,0,0]) \
      .addChild(Anchor() \
       .setDEF("AnchorExample") \
       .setDescription("Aquarium Exhibit Web Site") \
       .setParameter(["target=_blank"]) \
       .setUrl(["http://www.montereybayaquarium.org/animals-and-experiences/exhibits/kelp-forest"]) \
       .addChild(Shape() \
        .setGeometry(Text() \
         .setString(["Click orange text for","Monterey Bay Aquarium","kelp forest web site"]) \
         .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.6) \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDEF("Autumn11") \
          .setAmbientIntensity(0.25641) \
          .setDiffuseColor([0.795918,0.273554,0.006861]) \
          .setShininess(1) \
          .setSpecularColor([0.48655,0.319155,0.444036]) \
         ) \
        ) \
       ) \
# Add transparent geometry over the text to make clicking (i.e. Anchor selection) easier 
       .addChild(Shape() \
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
     .addChild(Transform() \
      .setTranslation([3.25,0,0]) \
      .addChild(Anchor() \
       .setDEF("WebCamAnchor") \
       .setDescription("Click to see Kelp Forest Live Web Cam") \
       .setParameter(["target=_blank"]) \
       .setUrl(["http://www.montereybayaquarium.org/animals-and-experiences/live-web-cams/kelp-forest-cam"]) \
       .addChild(Transform() \
        .setScale([0.938,0.729,1]) \
        .addChild(Shape() \
         .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,3,0,-1], solid = False) \
          .setCoord(Coordinate() \
           .setPoint([1,1,0,1,-1,0,-1,-1,0,-1,1,0]) \
          ) \
         ) \
         .setAppearance(Appearance() \
# Image Size Is 938x729 Pixels 
          .setTexture(ImageTexture() \
           .setUrl(["KelpForestLiveWebCam.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/KelpForestLiveWebCam.jpg"]) \
          ) \
         ) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Inline() \
     .setUrl(["../KelpForestExhibit/KelpForestMain.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestMain.x3d","../KelpForestExhibit/KelpForestMain.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestMain.wrl"]) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter04ViewingNavigation//Anchor_RoundTrip.x3d")
