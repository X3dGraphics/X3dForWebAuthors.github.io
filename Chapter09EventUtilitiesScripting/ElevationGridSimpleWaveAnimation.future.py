from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ElevationGridSimpleWaveAnimation.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simple Javascript animation of ElevationGrid") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("2 December 2012") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("2 September 2013") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("ElevationGridSimpleWaveAnimation.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/ElevationGridSimpleWaveAnimation.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit") \
     .setName("generator") \
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
     .setDescription("Wave view") \
     .setOrientation([1,0,0,-0.358771]) \
     .setPosition([0,3,8]) \
    ) \
    .addChild(Background() \
     .setGroundColor([1,1,1]) \
     .setSkyColor([1,1,1]) \
    ) \
# Shift zero-based ElevationGrid to left, centering it 
    .addChild(Transform() \
     .setTranslation([-4,0,0]) \
     .addChild(Shape() \
      .setGeometry(ElevationGrid(height = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0], solid = False) \
       .setDEF("GridSurface") \
       .setXDimension(9) \
       .setZDimension(3) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0,0.5,1]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("Clock") \
     .setCycleInterval(5) \
     .setLoop(True) \
    ) \
    .addChild(Script() \
     .setDEF("WaveGenerationScript") \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setAppinfo("provide value and trigger new computation") \
      .setName("newInputValue") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setAppinfo("provide values to ElevationGrid") \
      .setName("gridOutput") \
      .setType("MFFloat") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("wave variation") \
      .setName("waveStep") \
      .setType("SFTime") \
      .setValue("0.1") \
     ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"\n"+
"function newInputValue (eventValue)\n"+
"{\n"+
"   fraction = eventValue; // connected by ROUTE, receives values from TimeSensor Clock fraction_changed\n"+
"   \n"+
"   value0 = 0.2 * Math.sin (2 * Math.PI * (fraction - 4*waveStep));\n"+
"   value1 = 0.2 * Math.sin (2 * Math.PI * (fraction - 3*waveStep));\n"+
"   value2 = 0.2 * Math.sin (2 * Math.PI * (fraction - 2*waveStep));\n"+
"   value3 = 0.2 * Math.sin (2 * Math.PI * (fraction -   waveStep));\n"+
"   value4 = 0.2 * Math.sin (2 * Math.PI * (fraction             ));\n"+
"   value5 = 0.2 * Math.sin (2 * Math.PI * (fraction +   waveStep));\n"+
"   value6 = 0.2 * Math.sin (2 * Math.PI * (fraction + 2*waveStep));\n"+
"   value7 = 0.2 * Math.sin (2 * Math.PI * (fraction + 3*waveStep));\n"+
"   value8 = 0.2 * Math.sin (2 * Math.PI * (fraction + 4*waveStep));\n"+
"   \n"+
"   // setting the gridOutput value creates an output event that is connected via ROUTE to the ElevationGrid set_height field.\n"+
"   // note that types match (MFFloat) and accessTypes also match (output_only connects to inputOnly).\n"+
"   gridOutput = new MFFloat (\n"+
"		value0, value1, value2, value3, value4, value5, value6, value7, value8,\n"+
"		value0, value1, value2, value3, value4, value5, value6, value7, value8,\n"+
"		value0, value1, value2, value3, value4, value5, value6, value7, value8 );\n"+
"}\n"+
"''')
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("Clock") \
     .setToField("newInputValue") \
     .setToNode("WaveGenerationScript") \
    ) \
    .addChild(ROUTE() \
     .setFromField("gridOutput") \
     .setFromNode("WaveGenerationScript") \
     .setToField("set_height") \
     .setToNode("GridSurface") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//ElevationGridSimpleWaveAnimation_RoundTrip.x3d")
