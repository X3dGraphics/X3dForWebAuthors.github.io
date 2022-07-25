from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("UserInteractivitySensorNodes.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("A collection of all of the user interactivity sensor nodes: TouchSensor, PlaceSensor, CylinderSensor, SphereSensor, KeySensor, and StringSensor.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("30 April 2005") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("8 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright 2006, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("UserInteractivitySensorNodes.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("UserInteractivitySensorNodesModified.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/UserInteractivitySensorNodes.x3d") \
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
     .setDescription("User interactivity sensor nodes") \
     .setPosition([0,0,12]) \
    ) \
    .addChild(Background() \
     .setDEF("BackgroundDefault") \
     .setGroundColor([0.2,0.4,0.6]) \
     .setSkyColor([0.2,0.4,0.6]) \
    ) \
    .addChild(Background() \
     .setDEF("BackgroundTouchCone") \
     .setSkyColor([0.5,0.7,0.9]) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,4,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["Sensor node examples"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 1.5) \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDEF("DefaultMaterial") \
        .setDiffuseColor([0.8,0.6,0.4]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,1,0]) \
     .addChild(Transform() \
      .setTranslation([-6,0,0]) \
      .addChild(TouchSensor() \
       .setDEF("DefaultTouchSensor") \
       .setDescription("click to activate TouchSensor bind alternate Background") \
      ) \
      .addChild(Shape() \
       .setGeometry(Cone() \
       ) \
       .setAppearance(Appearance() \
        .setDEF("RedAppearance") \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.2,0.2]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([0,-2,0]) \
       .addChild(Shape() \
        .setGeometry(Text() \
         .setString(["Touch","Sensor"]) \
         .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
          .setDEF("JustifyMiddle") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setUSE("RedAppearance") \
        ) \
       ) \
      ) \
      .addChild(ROUTE() \
       .setFromField("isActive") \
       .setFromNode("DefaultTouchSensor") \
       .setToField("set_bind") \
       .setToNode("BackgroundTouchCone") \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("TransformBox") \
      .setTranslation([-2,0,0]) \
      .addChild(PlaneSensor() \
       .setDEF("DefaultPlaneSensor") \
       .setDescription("drag Box to activate PlaneSensor") \
      ) \
      .addChild(Shape() \
       .setGeometry(Box() \
       ) \
       .setAppearance(Appearance() \
        .setDEF("GreenAppearance") \
        .setMaterial(Material() \
         .setDiffuseColor([0.2,1,0.2]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([0,-2,0]) \
       .addChild(Shape() \
        .setGeometry(Text() \
         .setString(["Plane","Sensor"]) \
         .setFontStyle(FontStyle() \
          .setUSE("JustifyMiddle") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setUSE("GreenAppearance") \
        ) \
       ) \
      ) \
      .addChild(ROUTE() \
       .setFromField("offset") \
       .setFromNode("DefaultPlaneSensor") \
       .setToField("set_translation") \
       .setToNode("TransformBox") \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("TransformCylinder") \
      .setTranslation([2,0,0]) \
      .addChild(CylinderSensor() \
       .setDEF("DefaultCylinderSensor") \
       .setDescription("drag to activate CylinderSensor") \
      ) \
      .addChild(Shape() \
       .setGeometry(Cylinder() \
       ) \
       .setAppearance(Appearance() \
        .setTexture(ImageTexture() \
         .setDEF("ReferenceTexture") \
         .setUrl(["../Chapter05AppearanceMaterialTextures/ImageTextureFigure18.1X3dSpecification.png","../Chapter05AppearanceMaterialTextures/ImageTextureFigure18.1X3dSpecification.gif","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/ImageTextureFigure18.1X3dSpecification.png","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/ImageTextureFigure18.1X3dSpecification.gif"]) \
        ) \
        .setMaterial(Material() \
         .setDEF("DarkBlue") \
         .setDiffuseColor([0,0,0.9]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([0,-2,0]) \
       .addChild(Shape() \
        .setGeometry(Text() \
         .setString(["Cylinder","Sensor"]) \
         .setFontStyle(FontStyle() \
          .setUSE("JustifyMiddle") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setUSE("DarkBlue") \
         ) \
        ) \
       ) \
      ) \
      .addChild(ROUTE() \
       .setFromField("rotation_changed") \
       .setFromNode("DefaultCylinderSensor") \
       .setToField("set_rotation") \
       .setToNode("TransformCylinder") \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("TransformSphere") \
      .setTranslation([6,0,0]) \
      .addChild(SphereSensor() \
       .setDEF("DefaultSphereSensor") \
       .setDescription("click to activate SphereSensor") \
      ) \
      .addChild(Shape() \
       .setGeometry(Sphere() \
       ) \
       .setAppearance(Appearance() \
        .setTexture(ImageTexture() \
         .setUSE("ReferenceTexture") \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setDEF("SphereSensorText") \
       .setTranslation([0,-2,0]) \
       .addChild(Shape() \
        .setGeometry(Text() \
         .setString(["Sphere","Sensor"]) \
         .setFontStyle(FontStyle() \
          .setUSE("JustifyMiddle") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDEF("GreyMaterial") \
         ) \
        ) \
       ) \
      ) \
      .addChild(ROUTE() \
       .setFromField("rotation_changed") \
       .setFromNode("DefaultSphereSensor") \
       .setToField("set_rotation") \
       .setToNode("TransformSphere") \
      ) \
     ) \
    ) \
    .addChild(Group() \
     .addChild(Transform() \
      .setTranslation([-4,-3,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setDEF("KeyText") \
        .setString(["?"]) \
        .setFontStyle(FontStyle() \
         .setUSE("JustifyMiddle") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setDEF("LightBrownAppearance") \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.862745,0.141176]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-2,-3,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setDEF("StringText") \
        .setString(["Press keys then <Enter>"]) \
        .setFontStyle(FontStyle(justify = ["BEGIN","MIDDLE"]) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("LightBrownAppearance") \
       ) \
      ) \
     ) \
     .addChild(KeySensor() \
      .setDEF("DefaultKeySensor") \
      .setEnabled(True) \
     ) \
     .addChild(StringSensor() \
      .setDEF("DefaultStringSensor") \
      .setDeletionAllowed(True) \
      .setEnabled(True) \
     ) \
     .addChild(Script() \
      .setDEF("KeyboardProcessor") \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("keyInput") \
       .setType("SFString") \
      ) \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("finalTextInput") \
       .setType("SFString") \
      ) \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("enteredTextInput") \
       .setType("SFString") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("keyOutput") \
       .setType("MFString") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("stringOutput") \
       .setType("MFString") \
      ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"\n"+
"function keyInput (inputValue)\n"+
"{\n"+
"//  Browser.print ('keyInput=' + inputValue + '\\n'); // console output\n"+
"    keyOutput = new MFString (inputValue); // type conversion\n"+
"}\n"+
"function finalTextInput (inputValue)\n"+
"{\n"+
"//  Browser.print ('finalText=' + inputValue + '\\n'); // console output\n"+
"    stringOutput = new MFString (inputValue); // type conversion\n"+
"}\n"+
"function enteredTextInput (inputValue)\n"+
"{\n"+
"    Browser.print ('enteredText=' + inputValue + '\\n'); // console output\n"+
"}\n"+
"''')
     ) \
     .addChild(ROUTE() \
      .setFromField("keyPress") \
      .setFromNode("DefaultKeySensor") \
      .setToField("keyInput") \
      .setToNode("KeyboardProcessor") \
     ) \
     .addChild(ROUTE() \
      .setFromField("finalText") \
      .setFromNode("DefaultStringSensor") \
      .setToField("finalTextInput") \
      .setToNode("KeyboardProcessor") \
     ) \
     .addChild(ROUTE() \
      .setFromField("enteredText") \
      .setFromNode("DefaultStringSensor") \
      .setToField("enteredTextInput") \
      .setToNode("KeyboardProcessor") \
     ) \
     .addChild(ROUTE() \
      .setFromField("keyOutput") \
      .setFromNode("KeyboardProcessor") \
      .setToField("string") \
      .setToNode("KeyText") \
     ) \
     .addChild(ROUTE() \
      .setFromField("stringOutput") \
      .setFromNode("KeyboardProcessor") \
      .setToField("string") \
      .setToNode("StringText") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter08UserInteractivity//UserInteractivitySensorNodes_RoundTrip.x3d")
