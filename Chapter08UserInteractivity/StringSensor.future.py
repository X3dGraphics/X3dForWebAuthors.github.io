from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("StringSensor.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("A StringSensor example that displays typed text in the world.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("7 June 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 October 2015") \
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
     .setContent("Copyright (c) 2006, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/StringSensor.x3d") \
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
     .setDescription("Book View") \
     .setPosition([-0.02,0.01,6.85]) \
    ) \
    .addChild(StringSensor() \
     .setDEF("GenText") \
     .setDeletionAllowed(True) \
     .setEnabled(True) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,0.8,0]) \
     .addChild(Transform() \
      .setTranslation([0,0,-.1]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,1,.6]) \
        ) \
       ) \
       .setGeometry(Box(size = [8,1.5,.01]) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-3.8,0.2,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,1]) \
        ) \
       ) \
       .setGeometry(Text() \
        .setDEF("DisplayText") \
        .setFontStyle(FontStyle(justify = ["BEGIN","MIDDLE"], size = 0.75) \
        ) \
       ) \
      ) \
     ) \
# convert StringSensor SFString into Text node MFString by using explicit typecasting in ECMAScript 
     .addChild(Script() \
      .setDEF("Converter") \
      .setUrl(["StringSensorScriptConverter.js","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/StringSensorScriptConverter.js"]) \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("SFString_MFString") \
       .setType("SFString") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("MFString_out") \
       .setType("MFString") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("SFFloat_Xout") \
       .setType("SFFloat") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("SFFloat_Yout") \
       .setType("SFFloat") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("SFFloat_Zout") \
       .setType("SFFloat") \
      ) \
     ) \
     .addChild(ROUTE() \
      .setFromField("enteredText") \
      .setFromNode("GenText") \
      .setToField("SFString_MFString") \
      .setToNode("Converter") \
     ) \
     .addChild(ROUTE() \
      .setFromField("MFString_out") \
      .setFromNode("Converter") \
      .setToField("string") \
      .setToNode("DisplayText") \
     ) \
     .addChild(Transform() \
      .setTranslation([0,-1.25,0]) \
      .addChild(Group() \
       .addChild(Shape() \
        .setGeometry(Text(solid = False) \
         .setString(["StringSensor lets users enter text...","please type to test"]) \
         .setFontStyle(FontStyle(family = ["SANS"], justify = ["MIDDLE","BEGIN"], size = 0.5) \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDiffuseColor([0.7,0.7,0.7]) \
         ) \
        ) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter08UserInteractivity//StringSensor_RoundTrip.x3d")
