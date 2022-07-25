from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("BindingOperations.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Illustrate Viewpoint binding operations (in gory detail!) as described in Chapter 4 concepts. Scene design: a TimeSensor clock drives and IntegerSequencer for each t0/t1/etc. event, and a customized Script node sends bind/unbind events to the correct Viewpoint. Display the browser console to see occurrence of each event.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("5 January 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("22 July 2013") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("BindingOperations.console.txt") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("BindingStackOperations.png") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("X3D for Web Authors, Section 2.5.1, Figure 4.1") \
     .setName("reference") \
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
     .setContent("Copyright Don Brutzman and Leonard Daly 2007") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/BindingOperations.x3d") \
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
     .setDEF("View1") \
     .setCenterOfRotation([-6,0,0]) \
     .setDescription("Viewpoint 1") \
     .setPosition([-6,0,5]) \
    ) \
    .addChild(Viewpoint() \
     .setDEF("View2") \
     .setCenterOfRotation([-2,0,0]) \
     .setDescription("Viewpoint 2") \
     .setPosition([-2,0,5]) \
    ) \
    .addChild(Viewpoint() \
     .setDEF("View3") \
     .setCenterOfRotation([2,0,0]) \
     .setDescription("Viewpoint 3") \
     .setPosition([2,0,5]) \
    ) \
    .addChild(Viewpoint() \
     .setDEF("View4") \
     .setCenterOfRotation([6,0,0]) \
     .setDescription("Viewpoint 4") \
     .setPosition([6,0,5]) \
    ) \
# Script initialization ought to first bind view5 below. 
    .addChild(Group() \
     .addChild(Transform() \
      .setDEF("Text1") \
      .setTranslation([-6,0,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["View","# 1"]) \
        .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
         .setDEF("CenterJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0,0]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("Text2") \
      .setTranslation([-2,0,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["View","# 2"]) \
        .setFontStyle(FontStyle() \
         .setUSE("CenterJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,1,0]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("Text3") \
      .setTranslation([2,0,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["View","# 3"]) \
        .setFontStyle(FontStyle() \
         .setUSE("CenterJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,1]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("Text4") \
      .setTranslation([6,0,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["View","# 4"]) \
        .setFontStyle(FontStyle() \
         .setUSE("CenterJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
        ) \
       ) \
      ) \
     ) \
    ) \
# The following advanced animation sequence uses nodes covered in Chapters 7, 8 and 9. 
# It does not need to be studied in this chapter. 
    .addChild(Transform() \
     .setTranslation([0,-3,8]) \
# notice this next Viewpoint has been transformed with the text, so its position is relative. it is called view5 in the Script. 
     .addChild(Viewpoint() \
      .setDEF("ClickToAnimateView") \
      .setDescription("Select animation sequence") \
      .setPosition([0,0,7]) \
     ) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["Click here to animate"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","BEGIN"]) \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0.8,0.4,0]) \
       ) \
      ) \
     ) \
     .addChild(Shape() \
      .setGeometry(Box(size = [7,1,0.02]) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setTransparency(1) \
       ) \
      ) \
     ) \
     .addChild(TouchSensor() \
      .setDEF("TextTouchSensor") \
      .setDescription("Click to begin animating viewpoint selections") \
     ) \
     .addChild(TimeSensor() \
      .setDEF("Clock") \
      .setCycleInterval(10) \
     ) \
     .addChild(ROUTE() \
      .setFromField("touchTime") \
      .setFromNode("TextTouchSensor") \
      .setToField("set_startTime") \
      .setToNode("Clock") \
     ) \
     .addChild(IntegerSequencer() \
      .setDEF("TimingSequencer") \
      .setKey([0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1.0]) \
      .setKeyValue([0,1,2,3,4,5,6,7,8,10]) \
     ) \
     .addChild(ROUTE() \
      .setFromField("fraction_changed") \
      .setFromNode("Clock") \
      .setToField("set_fraction") \
      .setToNode("TimingSequencer") \
     ) \
     .addChild(Script() \
      .setDEF("BindingSequencerEngine") \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("set_timeEvent") \
       .setType("SFInt32") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("bindView1") \
       .setType("SFBool") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("bindView2") \
       .setType("SFBool") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("bindView3") \
       .setType("SFBool") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("bindView4") \
       .setType("SFBool") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("bindView5") \
       .setType("SFBool") \
      ) \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("view1Bound") \
       .setType("SFBool") \
      ) \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("view2Bound") \
       .setType("SFBool") \
      ) \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("view3Bound") \
       .setType("SFBool") \
      ) \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("view4Bound") \
       .setType("SFBool") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setName("priorInputvalue") \
       .setType("SFInt32") \
       .setValue("-1") \
      ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"\n"+
"function initialize ()\n"+
"{\n"+
"    bindView5 = true;\n"+
"    Browser.print ('Timing script initialized and ready for activation');\n"+
"}\n"+
"function set_timeEvent (inputValue)\n"+
"{\n"+
"    if (inputValue == priorInputvalue)\n"+
"    {\n"+
"        return; // ignore repeated inputs\n"+
"    }\n"+
"    // new value provided\n"+
"    priorInputvalue = inputValue;\n"+
"    // Browser.print ('\\ntimeEvent inputValue=' + inputValue);\n"+
"        \n"+
"    // mimics user execution of Figure 4.1 steps t_0 through t_8\n"+
"    if (inputValue == 0)\n"+
"    {\n"+
"        Browser.print ('\\n===========\\n time t0');\n"+
"        bindView1 = true;\n"+
"    }\n"+
"    else if (inputValue == 1)\n"+
"    {\n"+
"        Browser.print ('\\n===========\\n time t1');\n"+
"        bindView2 = true;\n"+
"    }\n"+
"    else if (inputValue == 2)\n"+
"    {\n"+
"        Browser.print ('\\n===========\\n time t2');\n"+
"        bindView3 = true;\n"+
"    }\n"+
"    else if (inputValue == 3)\n"+
"    {\n"+
"        Browser.print ('\\n===========\\n time t3');\n"+
"        bindView3 = false;\n"+
"    }\n"+
"    else if (inputValue == 4)\n"+
"    {\n"+
"        Browser.print ('\\n===========\\n time t4');\n"+
"        bindView1 = true;\n"+
"    }\n"+
"    else if (inputValue == 5)\n"+
"    {\n"+
"        Browser.print ('\\n===========\\n time t5');\n"+
"        bindView2 = false;\n"+
"    }\n"+
"    else if (inputValue == 6)\n"+
"    {\n"+
"        Browser.print ('\\n===========\\n time t6');\n"+
"        bindView1 = false;\n"+
"    }\n"+
"    else if (inputValue == 7)\n"+
"    {\n"+
"        Browser.print ('\\n===========\\n time t7');\n"+
"        bindView4 = true;\n"+
"\n"+
"    }\n"+
"    else if (inputValue == 8)\n"+
"    {\n"+
"        Browser.print ('\\n===========\\n time t8');\n"+
"        Browser.print (', no action, all done');\n"+
"        Browser.print ('\\n\\n');\n"+
"    }\n"+
"}\n"+
"\n"+
"function view1Bound (inputValue)\n"+
"{\n"+
"    Browser.print (', view1Bound ' + (inputValue));\n"+
"    if (priorInputvalue == -1) Browser.print ('\\n');\n"+
"}\n"+
"function view2Bound (inputValue)\n"+
"{\n"+
"    Browser.print (', view2Bound ' + (inputValue));\n"+
"}\n"+
"function view3Bound (inputValue)\n"+
"{\n"+
"    Browser.print (', view3Bound ' + (inputValue));\n"+
"}\n"+
"function view4Bound (inputValue)\n"+
"{\n"+
"    Browser.print (', view4Bound ' + (inputValue));\n"+
"}\n"+
"function view5Bound (inputValue)\n"+
"{\n"+
"    Browser.print (', view5Bound ' + (inputValue));\n"+
"}\n"+
"''')
     ) \
# drive Script with TimeSensor clock 
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("TimingSequencer") \
      .setToField("set_timeEvent") \
      .setToNode("BindingSequencerEngine") \
     ) \
# Script will bind and unbind Viewpoint nodes 
     .addChild(ROUTE() \
      .setFromField("bindView1") \
      .setFromNode("BindingSequencerEngine") \
      .setToField("set_bind") \
      .setToNode("View1") \
     ) \
     .addChild(ROUTE() \
      .setFromField("bindView2") \
      .setFromNode("BindingSequencerEngine") \
      .setToField("set_bind") \
      .setToNode("View2") \
     ) \
     .addChild(ROUTE() \
      .setFromField("bindView3") \
      .setFromNode("BindingSequencerEngine") \
      .setToField("set_bind") \
      .setToNode("View3") \
     ) \
     .addChild(ROUTE() \
      .setFromField("bindView4") \
      .setFromNode("BindingSequencerEngine") \
      .setToField("set_bind") \
      .setToNode("View4") \
     ) \
     .addChild(ROUTE() \
      .setFromField("bindView5") \
      .setFromNode("BindingSequencerEngine") \
      .setToField("set_bind") \
      .setToNode("ClickToAnimateView") \
     ) \
# Viewpoint nodes report bind and unbind events 
     .addChild(ROUTE() \
      .setFromField("isBound") \
      .setFromNode("View1") \
      .setToField("view1Bound") \
      .setToNode("BindingSequencerEngine") \
     ) \
     .addChild(ROUTE() \
      .setFromField("isBound") \
      .setFromNode("View2") \
      .setToField("view2Bound") \
      .setToNode("BindingSequencerEngine") \
     ) \
     .addChild(ROUTE() \
      .setFromField("isBound") \
      .setFromNode("View3") \
      .setToField("view3Bound") \
      .setToNode("BindingSequencerEngine") \
     ) \
     .addChild(ROUTE() \
      .setFromField("isBound") \
      .setFromNode("View4") \
      .setToField("view4Bound") \
      .setToNode("BindingSequencerEngine") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter04ViewingNavigation//BindingOperations_RoundTrip.x3d")
