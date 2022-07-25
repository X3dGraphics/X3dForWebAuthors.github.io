from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("MovieTextureAuthoringOptions.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Provide examples of helpful MovieTexture usage") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman and MV3204 class") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("21 August 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("22 October 2015") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("MovieTexture examples") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("MovieTextureFigure.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("MovieTextureAuthoringOptions.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/MovieTextureAuthoringOptions.x3d") \
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
     .setDescription("MovieTexture authoring options") \
     .setPosition([0,0,18]) \
    ) \
    .addChild(Group() \
     .setDEF("TopGroupTextures") \
# First row: standard definition 
     .addChild(Transform() \
      .setTranslation([-6,3,0]) \
# Flat-surface movie, with fixed position and orientation 
      .addChild(Viewpoint() \
       .setDescription("Movie #1, standard definition") \
       .setPosition([0,0,5]) \
      ) \
      .addChild(Shape() \
       .setDEF("MovieShapeStandardDefinition") \
       .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,3], solid = False) \
        .setDEF("Quadrilateral320x240") \
        .setCoord(Coordinate() \
         .setPoint([-1.6,-1.2,0,1.6,-1.2,0,1.6,1.2,0,-1.6,1.2,0]) \
        ) \
        .setTexCoord(TextureCoordinate() \
         .setDEF("FullImageMapping") \
         .setPoint([0,0,1,0,1,1,0,1]) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setTexture(MovieTexture(repeatS = False, repeatT = False) \
         .setDEF("X3dQuipMovieStandardDefinition") \
         .setDescription("click to start movie, standard definition") \
         .setUrl(["X3dQuipBrutzmanStandardDefinitionMPEG1.mpg","X3dQuipBrutzmanStandardDefinitionMPEG1.mov","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanStandardDefinitionMPEG1.mpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanStandardDefinitionMPEG1.mov"]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([0,3,0]) \
# movie under a Billboard to always face user 
      .addChild(Viewpoint() \
       .setDescription("Billboarded movie #2 offset view location, standard definition") \
       .setOrientation([0,1,0,0.8]) \
       .setPosition([4,0,4]) \
      ) \
      .addChild(Billboard() \
       .setAxisOfRotation([0,0,0]) \
       .addChild(Shape() \
        .setUSE("MovieShapeStandardDefinition") \
       ) \
      ) \
     ) \
     .addChild(TouchSensor() \
      .setDEF("MovieTouchStandardDefinition") \
      .setDescription("click to start movie, standard definition") \
     ) \
     .addChild(ROUTE() \
      .setFromField("touchTime") \
      .setFromNode("MovieTouchStandardDefinition") \
      .setToField("startTime") \
      .setToNode("X3dQuipMovieStandardDefinition") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("TopGroupTextureLaunch") \
     .setTranslation([6,3,0]) \
# Launch movie into external browser 
     .addChild(Viewpoint() \
      .setDescription("Image #3 launches movie externally, standard definition") \
      .setPosition([0,0,5]) \
     ) \
     .addChild(Anchor() \
      .setDescription("Click to launch in external browser, standard definition") \
      .setParameter(["target=_blank"]) \
      .setUrl(["X3dQuipBrutzmanStandardDefinitionMPEG1.mpg","X3dQuipBrutzmanStandardDefinitionMPEG1.mov","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanStandardDefinitionMPEG1.mpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanStandardDefinitionMPEG1.mov"]) \
      .addChild(Shape() \
       .setGeometry(IndexedFaceSet() \
        .setUSE("Quadrilateral320x240") \
       ) \
       .setAppearance(Appearance() \
        .setTexture(ImageTexture(repeatS = False, repeatT = False) \
         .setUrl(["X3dQuipBrutzmanStandardDefinitionInitialFrame.png","X3dQuipBrutzmanStandardDefinitionInitialFrame.gif","X3dQuipBrutzmanStandardDefinitionInitialFrame.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanStandardDefinitionInitialFrame.png","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanStandardDefinitionInitialFrame.gif","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanStandardDefinitionInitialFrame.jpg"]) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("CenterGroupText") \
     .setTranslation([0,0.25,0]) \
# Text descriptions for user 
     .addChild(Transform() \
      .setTranslation([-6,0,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["Select to run","MovieTexture"]) \
        .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setDEF("TextAppearance") \
        .setMaterial(Material() \
         .setDiffuseColor([0,0.7,0.7]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Billboard() \
      .setAxisOfRotation([0,0,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["Billboarded","MovieTexture"]) \
        .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("TextAppearance") \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([6,0,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["Select image","to launch"]) \
        .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("TextAppearance") \
       ) \
      ) \
     ) \
    ) \
    .addChild(Group() \
     .setDEF("BottomGroupTextures") \
# Third row: high definition 
     .addChild(Transform() \
      .setTranslation([-6,-3,0]) \
      .addChild(Viewpoint() \
       .setDescription("Movie #4, high definition") \
       .setPosition([0,0,5]) \
      ) \
      .addChild(Shape() \
       .setDEF("MovieShapeHighDefinition") \
       .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,3], solid = False) \
        .setDEF("Quadrilateral480x270") \
        .setCoord(Coordinate() \
         .setPoint([-2.4,-1.35,0,2.4,-1.35,0,2.4,1.35,0,-2.4,1.35,0]) \
        ) \
        .setTexCoord(TextureCoordinate() \
         .setUSE("FullImageMapping") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setTexture(MovieTexture(repeatS = False, repeatT = False) \
         .setDEF("X3dQuipMovieHighDefinition") \
         .setDescription("click to start movie, high definition") \
         .setUrl(["X3dQuipBrutzmanH264MPEG1Mash.mpg","X3dQuipBrutzmanH264.mov","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanH264MPEG1Mash.mpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanH264.mov"]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([0,-3,0]) \
# movie under a Billboard to always face user 
      .addChild(Viewpoint() \
       .setDescription("Billboarded movie #5 offset view location, high definition") \
       .setOrientation([0,1,0,0.8]) \
       .setPosition([4,0,4]) \
      ) \
      .addChild(Billboard() \
       .setAxisOfRotation([0,0,0]) \
       .addChild(Shape() \
        .setUSE("MovieShapeHighDefinition") \
       ) \
      ) \
     ) \
     .addChild(TouchSensor() \
      .setDEF("MovieTouchHighDefinition") \
      .setDescription("click to start movie, high definition") \
     ) \
     .addChild(ROUTE() \
      .setFromField("touchTime") \
      .setFromNode("MovieTouchHighDefinition") \
      .setToField("startTime") \
      .setToNode("X3dQuipMovieHighDefinition") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("BottomGroupTextureLaunch") \
     .setTranslation([6,-3,0]) \
# Launch movie into external browser 
     .addChild(Viewpoint() \
      .setDescription("Image #6 launches movie externally, high definition") \
      .setPosition([0,0,5]) \
     ) \
     .addChild(Anchor() \
      .setDescription("Click to launch in external browser, high definition") \
      .setParameter(["target=_blank"]) \
      .setUrl(["X3dQuipBrutzmanH264MPEG1Mash.mpg","X3dQuipBrutzmanH264.mov","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanH264MPEG1Mash.mpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanH264.mov"]) \
      .addChild(Shape() \
       .setGeometry(IndexedFaceSet() \
        .setUSE("Quadrilateral480x270") \
       ) \
       .setAppearance(Appearance() \
        .setTexture(ImageTexture(repeatS = False, repeatT = False) \
         .setUrl(["X3dQuipBrutzmanH264InitialFrame.png","X3dQuipBrutzmanH264InitialFrame.gif","X3dQuipBrutzmanH264InitialFrame.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanH264InitialFrame.png","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanH264InitialFrame.gif","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanH264InitialFrame.jpg"]) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("Backdrop") \
     .setTranslation([0,0,-3]) \
     .addChild(Shape() \
      .setGeometry(Box(size = [22,16,0.5]) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0,0.501961,0.27451]) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures//MovieTextureAuthoringOptions_RoundTrip.x3d")
