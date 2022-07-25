from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("MaterialModulatorExamples.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Demonstrate multiple instances of an external prototype.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Learning suggestion for authors: try changing the modulation script so that it goes from [0 ... 1] and then [1 ... 0] alternating, rather than abruptly shifting from 1 immediately back to 0.") \
     .setName("hint") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("7 September 2017") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("29 October 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("X3D prototype instances DEF USE") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("MaterialModulator.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("MaterialModulatorExamples.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulatorExamples.x3d") \
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
    .addChild(ExternProtoDeclare() \
     .setAppinfo("mimic a Material node and modulate the diffuseColor field as an animation effect") \
     .setDocumentation("http://x3dgraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulatorIndex.html") \
     .setName("MaterialModulator") \
     .setUrl(["MaterialModulator.x3d#MaterialModulator","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulator.x3d#MaterialModulator"]) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("default value true") \
      .setName("enabled") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("default value 0.8 0.8 0.8") \
      .setName("diffuseColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("default value 0 0 0") \
      .setName("emissiveColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("default value 0 0 0") \
      .setName("specularColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("default value 0.0") \
      .setName("transparency") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("default value 0.2") \
      .setName("shininess") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("default value 0.2") \
      .setName("ambientIntensity") \
      .setType("SFFloat") \
     ) \
    ) \
# Rendered geometry for the ProtoInstance now follows external prototype declaration 
    .addChild(Transform() \
     .setRotation([-0.8,0.93923,0.18785,5.759586]) \
     .setTranslation([-2,1,0]) \
     .addChild(Shape() \
      .setDEF("ModulatingBoxShape") \
      .setGeometry(Box() \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(ProtoInstance() \
        .setDEF("MaterialModulatorInstance") \
        .setName("MaterialModulator") \
        .addFieldValue(fieldValue() \
         .setName("enabled") \
         .setValue("true") \
        ) \
        .addFieldValue(fieldValue() \
         .setName("diffuseColor") \
         .setValue("0.5 0.1 0.1") \
        ) \
# fieldValue declarations for other Material attributes can appear here 
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([1,0,0,0.523599]) \
     .setTranslation([2,1,0]) \
     .addChild(Shape() \
      .setGeometry(Cylinder() \
      ) \
      .setAppearance(Appearance() \
# note that ProtoInstance USE does not require name='MaterialModulator' 
       .setMaterial(ProtoInstance() \
        .setUSE("MaterialModulatorInstance") \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([-2,3.5,0]) \
     .addChild(Shape() \
      .setGeometry(Text(solid = False) \
       .setString(["DEF original"]) \
       .setFontStyle(FontStyle(family = ["SANS"], justify = ["MIDDLE","MIDDLE"], size = 0.5, style = "BOLD") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setDEF("TextAppearance") \
       .setMaterial(Material() \
        .setDiffuseColor([0.9,0.9,0.9]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([2,3.5,0]) \
     .addChild(Shape() \
      .setGeometry(Text(solid = False) \
       .setString(["USE copy"]) \
       .setFontStyle(FontStyle(family = ["SANS"], justify = ["MIDDLE","MIDDLE"], size = 0.5, style = "BOLD") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setUSE("TextAppearance") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,-2,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["enable/disable","MaterialModulator"]) \
       .setFontStyle(FontStyle(family = ["SANS"], justify = ["MIDDLE","MIDDLE"], size = 1, style = "BOLD") \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setUSE("TextAppearance") \
      ) \
     ) \
# Selectable Text design pattern has transparent Box and TouchSensor description as a tooltip 
     .addChild(Shape() \
      .setGeometry(Box(size = [8,2,.001]) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setTransparency(1) \
       ) \
      ) \
     ) \
# Toggle text to enable/disable MaterialModulator 
     .addChild(TouchSensor() \
      .setDEF("TouchTextInterface") \
      .setDescription("Select text to enable/disable MaterialModulator") \
     ) \
     .addChild(BooleanToggle() \
      .setDEF("EventToggler") \
     ) \
     .addChild(ROUTE() \
      .setFromField("isActive") \
      .setFromNode("TouchTextInterface") \
      .setToField("set_boolean") \
      .setToNode("EventToggler") \
     ) \
     .addChild(ROUTE() \
      .setFromField("toggle") \
      .setFromNode("EventToggler") \
      .setToField("enabled") \
      .setToNode("MaterialModulatorInstance") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter14Prototypes//MaterialModulatorExamples_RoundTrip.x3d")
