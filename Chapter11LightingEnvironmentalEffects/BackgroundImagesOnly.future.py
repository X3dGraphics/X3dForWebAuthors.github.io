from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("BackgroundImagesOnly.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simple Background node with images only.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("20 April 2009") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/Basic/UniversalMediaPanoramas") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/Basic/UniversalMediaPanoramas/horizon3.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("X3D Background example") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundImagesOnly.x3d") \
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
     .setBackUrl(["urn:web3d:media:textures/panoramas/horizon_3_back.jpg","../../Basic/UniversalMediaPanoramas/horizon_3_back.jpg","http://www.web3d.org/WorkingGroups/media/textures/panoramas/horizon_3_back.jpg","http://www.web3d.org/x3d/content/examples/UniversalMediaPanoramas/horizon_3_back.jpg","http://www.web3dmedia.com/UniversalMedia/textures/panoramas/horizon_3_back.jpg","http://www.officetowers.com/UniversalMedia/textures/panoramas/horizon_3_back.jpg","http://geometrek.com/UniversalMedia/textures/panoramas/horizon_3_back.jpg","http://www.sc.ehu.es/ccwgamoa/UniversalMedia/textures/panoramas/horizon_3_back.jpg"]) \
     .setBottomUrl(["urn:web3d:media:textures/panoramas/horizon_3_bottom.jpg","../../Basic/UniversalMediaPanoramas/horizon_3_bottom.jpg","http://www.web3d.org/WorkingGroups/media/textures/panoramas/horizon_3_bottom.jpg","http://www.web3d.org/x3d/content/examples/UniversalMediaPanoramas/horizon_3_bottom.jpg","http://www.web3dmedia.com/UniversalMedia/textures/panoramas/horizon_3_bottom.jpg","http://www.officetowers.com/UniversalMedia/textures/panoramas/horizon_3_bottom.jpg","http://geometrek.com/UniversalMedia/textures/panoramas/horizon_3_bottom.jpg","http://www.sc.ehu.es/ccwgamoa/UniversalMedia/textures/panoramas/horizon_3_bottom.jpg"]) \
     .setFrontUrl(["urn:web3d:media:textures/panoramas/horizon_3_front.jpg","../../Basic/UniversalMediaPanoramas/horizon_3_front.jpg","http://www.web3d.org/WorkingGroups/media/textures/panoramas/horizon_3_front.jpg","http://www.web3d.org/x3d/content/examples/UniversalMediaPanoramas/horizon_3_front.jpg","http://www.web3dmedia.com/UniversalMedia/textures/panoramas/horizon_3_front.jpg","http://www.officetowers.com/UniversalMedia/textures/panoramas/horizon_3_front.jpg","http://geometrek.com/UniversalMedia/textures/panoramas/horizon_3_front.jpg","http://www.sc.ehu.es/ccwgamoa/UniversalMedia/textures/panoramas/horizon_3_front.jpg"]) \
     .setLeftUrl(["urn:web3d:media:textures/panoramas/horizon_3_left.jpg","../../Basic/UniversalMediaPanoramas/horizon_3_left.jpg","http://www.web3d.org/WorkingGroups/media/textures/panoramas/horizon_3_left.jpg","http://www.web3d.org/x3d/content/examples/UniversalMediaPanoramas/horizon_3_left.jpg","http://www.web3dmedia.com/UniversalMedia/textures/panoramas/horizon_3_left.jpg","http://www.officetowers.com/UniversalMedia/textures/panoramas/horizon_3_left.jpg","http://geometrek.com/UniversalMedia/textures/panoramas/horizon_3_left.jpg","http://www.sc.ehu.es/ccwgamoa/UniversalMedia/textures/panoramas/horizon_3_left.jpg"]) \
     .setRightUrl(["urn:web3d:media:textures/panoramas/horizon_3_right.jpg","../../Basic/UniversalMediaPanoramas/horizon_3_right.jpg","http://www.web3d.org/WorkingGroups/media/textures/panoramas/horizon_3_right.jpg","http://www.web3d.org/x3d/content/examples/UniversalMediaPanoramas/horizon_3_right.jpg","http://www.web3dmedia.com/UniversalMedia/textures/panoramas/horizon_3_right.jpg","http://www.officetowers.com/UniversalMedia/textures/panoramas/horizon_3_right.jpg","http://geometrek.com/UniversalMedia/textures/panoramas/horizon_3_right.jpg","http://www.sc.ehu.es/ccwgamoa/UniversalMedia/textures/panoramas/horizon_3_right.jpg"]) \
     .setTopUrl(["urn:web3d:media:textures/panoramas/horizon_3_top.jpg","../../Basic/UniversalMediaPanoramas/horizon_3_top.jpg","http://www.web3d.org/WorkingGroups/media/textures/panoramas/horizon_3_top.jpg","http://www.web3d.org/x3d/content/examples/UniversalMediaPanoramas/horizon_3_top.jpg","http://www.web3dmedia.com/UniversalMedia/textures/panoramas/horizon_3_top.jpg","http://www.officetowers.com/UniversalMedia/textures/panoramas/horizon_3_top.jpg","http://geometrek.com/UniversalMedia/textures/panoramas/horizon_3_top.jpg","http://www.sc.ehu.es/ccwgamoa/UniversalMedia/textures/panoramas/horizon_3_top.jpg"]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Background images view") \
    ) \
    .addChild(Shape() \
     .setGeometry(Text() \
      .setString(["Background node using","image url arrays"]) \
      .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], style = "BOLD") \
      ) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setDiffuseColor([1,1,1]) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects//BackgroundImagesOnly_RoundTrip.x3d")
