from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ProximitySensor.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Demonstrates use of a ProximitySensor in building a HUD") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("15 July 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("ProximitySensorVisualization.png") \
     .setName("Image") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/ProximitySensor.x3d") \
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
# HUD = Heads-Up Display, which stays on screen in same relative location even while user navigates 
# TODO: authors should use X3D-Edit editing pane to try out the ProximitySensor Visualize capability 
    .addChild(ProximitySensor(size = [100,100,100]) \
     .setDEF("HereIAm") \
    ) \
    .addChild(Inline() \
     .setUrl(["../KelpForestExhibit/KelpForestMain.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestMain.x3d","../KelpForestExhibit/KelpForestMain.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestMain.wrl"]) \
    ) \
    .addChild(Transform() \
     .setDEF("HUD") \
     .addChild(Transform() \
      .setDEF("PushBack") \
      .setTranslation([-.8,1.,-3]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,1,0]) \
        ) \
       ) \
       .setGeometry(Box(size = [1.5,.4,.1]) \
       ) \
      ) \
      .addChild(Transform() \
       .setDEF("HudContents") \
       .setTranslation([-.7,.3,.1]) \
       .addChild(Transform() \
        .setDEF("TopText") \
        .setTranslation([0,-.2,0]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setDEF("Text_app") \
          .setMaterial(Material() \
           .setDiffuseColor([0,0,0]) \
          ) \
         ) \
         .setGeometry(Text() \
          .setDEF("TopTextLine") \
          .setString(["Position 0.00 0.00 10.00"]) \
          .setFontStyle(FontStyle(family = ["SANS","SERIF"], justify = ["BEGIN","BEGIN"], size = 0.1) \
           .setDEF("TextStyle") \
          ) \
         ) \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("BottomText") \
        .setTranslation([0,-.4,0]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setUSE("Text_app") \
         ) \
         .setGeometry(Text() \
          .setDEF("BottomTextLine") \
          .setString(["Orientation: 0.000 1.000 0.000 0.00"]) \
          .setFontStyle(FontStyle() \
           .setUSE("TextStyle") \
          ) \
         ) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Script() \
     .setDEF("CnvText") \
     .setUrl(["ProximitySensorScriptConvertText.js","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/ProximitySensorScriptConvertText.js"]) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("position") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("orientation") \
      .setType("SFRotation") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("positionText") \
      .setType("MFString") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("orientationText") \
      .setType("MFString") \
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("orientation_changed") \
     .setFromNode("HereIAm") \
     .setToField("rotation") \
     .setToNode("HUD") \
    ) \
    .addChild(ROUTE() \
     .setFromField("position_changed") \
     .setFromNode("HereIAm") \
     .setToField("translation") \
     .setToNode("HUD") \
    ) \
    .addChild(ROUTE() \
     .setFromField("position_changed") \
     .setFromNode("HereIAm") \
     .setToField("position") \
     .setToNode("CnvText") \
    ) \
    .addChild(ROUTE() \
     .setFromField("orientation_changed") \
     .setFromNode("HereIAm") \
     .setToField("orientation") \
     .setToNode("CnvText") \
    ) \
    .addChild(ROUTE() \
     .setFromField("positionText") \
     .setFromNode("CnvText") \
     .setToField("string") \
     .setToNode("TopTextLine") \
    ) \
    .addChild(ROUTE() \
     .setFromField("orientationText") \
     .setFromNode("CnvText") \
     .setToField("string") \
     .setToNode("BottomTextLine") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound//ProximitySensor_RoundTrip.x3d")
