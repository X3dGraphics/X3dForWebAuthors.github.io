from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("PositionOrientationInterpolatorsExampleTraced.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Demonstrate use of PositionInterpolator and OrientationInterpolator to animate object motion, with console output tracing added for PositionInterpolator and ROUTE events.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("5 August 2011") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("29 October 2016") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Chapter07EventAnimationInterpolation-EventTracing.pdf") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("PositionOrientationInterpolatorsExampleTracedConsole.txt") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("PositionOrientationInterpolatorsExample.mp4") \
     .setName("MovingImage") \
    ) \
    .addMeta(meta() \
     .setContent("PositionOrientationInterpolatorsExample.x3d") \
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
     .setContent("https://savage.nps.edu/Savage/Tools/Animation/WaypointInterpolatorExample.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/PositionOrientationInterpolatorsExampleTraced.x3d") \
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
     .setDescription("Animation demo") \
     .setOrientation([1,0,0,-0.588003]) \
     .setPosition([0,8,12]) \
    ) \
    .addChild(Viewpoint() \
     .setCenterOfRotation([5,0.1,5]) \
     .setDescription("View from above") \
     .setOrientation([1,0,0,-1.570796]) \
     .setPosition([0,15,0]) \
    ) \
    .addChild(Transform() \
     .setDEF("Pointer") \
     .setTranslation([1,0,1]) \
     .addChild(Transform() \
      .setRotation([1,0,0,1.57]) \
      .addChild(Shape() \
       .setGeometry(Cone(bottomRadius = 0.5, height = 1.5) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDEF("ConeMaterial") \
         .setDiffuseColor([0.427451,1,0.160784]) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Shape() \
     .setDEF("Floor") \
     .setGeometry(Box(size = [12,0.05,12]) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setDiffuseColor([0,0.262745,0.941176]) \
      ) \
     ) \
    ) \
# note that final value equals first value in keyValue array in order to support smooth looping 
# first drive around the location 
    .addChild(PositionInterpolator() \
     .setDEF("PositionAnimator") \
     .setKey([0,0.2,0.25,0.45,0.5,0.7,0.75,0.95,1]) \
     .setKeyValue([-4,0,-4,-4,0,4,-4,0,4,4,0,4,4,0,4,4,0,-4,4,0,-4,-4,0,-4,-4,0,-4]) \
    ) \
    .addChild(Group() \
# ======= PositionInterpolator Trace ============================================== 
     .addChild(Script(mustEvaluate = True) \
      .setDEF("Trace_PositionInterpolator_PositionAnimator") \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("Sampling frequency in seconds (0 means all values)") \
       .setName("reportInterval") \
       .setType("SFTime") \
       .setValue("1.0") \
      ) \
# Trace ROUTEd values on X3D browser console 
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("value_changed") \
       .setType("SFVec3f") \
      ) \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("key") \
       .setType("MFFloat") \
      ) \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("keyValue") \
       .setType("MFVec3f") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setName("timeStampPreviousReport") \
       .setType("SFTime") \
       .setValue("-1") \
      ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"    function value_changed (eventValue, timeStamp) {\n"+
"      if (timeStamp - timeStampPreviousReport >= reportInterval) {\n"+
"        Browser.print ('Trace_PositionInterpolator_PositionAnimator type=SFVec3f value_changed=' + eventValue.toString() + '\\n');\n"+
"        timeStampPreviousReport = timeStamp;\n"+
"      }\n"+
"    }\n"+
"    function key (eventValue) {\n"+
"      Browser.print ('Trace_PositionInterpolator_PositionAnimator type=MFFloat key=' + eventValue.toString() + '\\n');\n"+
"    }\n"+
"    function keyValue (eventValue) {\n"+
"      Browser.print ('Trace_PositionInterpolator_PositionAnimator type=MFVec3f keyValue=' + eventValue.toString() + '\\n');\n"+
"    }\n"+
"''')
     ) \
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("PositionAnimator") \
      .setToField("value_changed") \
      .setToNode("Trace_PositionInterpolator_PositionAnimator") \
     ) \
     .addChild(ROUTE() \
      .setFromField("key") \
      .setFromNode("PositionAnimator") \
      .setToField("key") \
      .setToNode("Trace_PositionInterpolator_PositionAnimator") \
     ) \
     .addChild(ROUTE() \
      .setFromField("keyValue") \
      .setFromNode("PositionAnimator") \
      .setToField("keyValue") \
      .setToNode("Trace_PositionInterpolator_PositionAnimator") \
     ) \
# ======= PositionInterpolator Trace block complete ===================================================== 
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("PositionAnimator") \
     .setToField("translation") \
     .setToNode("Pointer") \
    ) \
    .addChild(Group() \
# ======= ROUTE Trace ============================================== 
     .addChild(Script(mustEvaluate = True) \
      .setDEF("Trace_ROUTE_PositionAnimator.value_changed_TO_Pointer.translation") \
# Trace ROUTEd values on X3D browser console 
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("Sampling frequency in seconds (0 means all values)") \
       .setName("reportInterval") \
       .setType("SFTime") \
       .setValue("1.0") \
      ) \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("traceValue") \
       .setType("SFVec3f") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setName("timeStampPreviousReport") \
       .setType("SFTime") \
       .setValue("-1") \
      ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"    function traceValue (eventValue, timeStamp) {\n"+
"      // input eventValue received for trace field\n"+
"      if (timeStamp - timeStampPreviousReport >= reportInterval) {\n"+
"        Browser.print ('Trace_ROUTE_PositionAnimator.value_changed_TO_Pointer.translation type=SFVec3f value=' + eventValue.toString() + '\\n');\n"+
"        timeStampPreviousReport = timeStamp;\n"+
"      }\n"+
"    }\n"+
"    function timeOfDay (someTime) {\n"+
"      hh = Math.floor (someTime /(60*60)) % 24;\n"+
"      mm = Math.floor (someTime / 60)     % 60;\n"+
"      ss = Math.floor (someTime)          % 60;\n"+
"      if (hh < 9) hour   = '0' + hh;\n"+
"      else        hour   =       hh;\n"+
"      if (mm < 9) minute = '0' + mm;\n"+
"      else        minute =       mm;\n"+
"      if (ss < 9) second = '0' + ss;\n"+
"      else        second =       ss;\n"+
"      return '(' + hour + ':' + minute + ':' + second + ' GMT)';\n"+
"    }\n"+
"''')
     ) \
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("PositionAnimator") \
      .setToField("traceValue") \
      .setToNode("Trace_ROUTE_PositionAnimator.value_changed_TO_Pointer.translation") \
     ) \
# ======= ROUTE Trace block complete ===================================================== 
    ) \
# then rotate the pointer to match next direction while paused at each position 
    .addChild(OrientationInterpolator() \
     .setDEF("OrientationAnimator") \
     .setKey([0,0.2,0.25,0.45,0.5,0.7,0.75,0.95,1]) \
     .setKeyValue([0,1,0,0,0,1,0,0,0,1,0,1.57,0,1,0,1.57,0,1,0,3.14,0,1,0,3.14,0,1,0,4.71,0,1,0,4.71,0,1,0,6.283]) \
    ) \
# final rotation value is 2pi rather than 0 so that rotation animation is smooth, not flip-flopping 
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("OrientationAnimator") \
     .setToField("set_rotation") \
     .setToNode("Pointer") \
    ) \
# put TimeSensor clock last so that animation design pattern and ROUTE events flow upward 
    .addChild(TimeSensor() \
     .setDEF("AnimationClock") \
     .setCycleInterval(10) \
     .setLoop(True) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("AnimationClock") \
     .setToField("set_fraction") \
     .setToNode("PositionAnimator") \
    ) \
    .addChild(Group() \
# ======= ROUTE Trace ============================================== 
     .addChild(Script(mustEvaluate = True) \
      .setDEF("Trace_ROUTE_AnimationClock.fraction_changed_TO_PositionAnimator.set_fraction") \
# Trace ROUTEd values on X3D browser console 
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("Sampling frequency in seconds (0 means all values)") \
       .setName("reportInterval") \
       .setType("SFTime") \
       .setValue("1.0") \
      ) \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("traceValue") \
       .setType("SFFloat") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setName("timeStampPreviousReport") \
       .setType("SFTime") \
       .setValue("-1") \
      ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"    function traceValue (eventValue, timeStamp) {\n"+
"      // input eventValue received for trace field\n"+
"      if (timeStamp - timeStampPreviousReport >= reportInterval) {\n"+
"        Browser.print ('Trace_ROUTE_AnimationClock.fraction_changed_TO_PositionAnimator.set_fraction type=SFFloat value=' + eventValue + '\\n');\n"+
"        timeStampPreviousReport = timeStamp;\n"+
"      }\n"+
"    }\n"+
"    function timeOfDay (someTime) {\n"+
"      hh = Math.floor (someTime /(60*60)) % 24;\n"+
"      mm = Math.floor (someTime / 60)     % 60;\n"+
"      ss = Math.floor (someTime)          % 60;\n"+
"      if (hh < 9) hour   = '0' + hh;\n"+
"      else        hour   =       hh;\n"+
"      if (mm < 9) minute = '0' + mm;\n"+
"      else        minute =       mm;\n"+
"      if (ss < 9) second = '0' + ss;\n"+
"      else        second =       ss;\n"+
"      return '(' + hour + ':' + minute + ':' + second + ' GMT)';\n"+
"    }\n"+
"''')
     ) \
     .addChild(ROUTE() \
      .setFromField("fraction_changed") \
      .setFromNode("AnimationClock") \
      .setToField("traceValue") \
      .setToNode("Trace_ROUTE_AnimationClock.fraction_changed_TO_PositionAnimator.set_fraction") \
     ) \
# ======= ROUTE Trace block complete ===================================================== 
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("AnimationClock") \
     .setToField("set_fraction") \
     .setToNode("OrientationAnimator") \
    ) \
# notice that explanatory Text is placed later in scene although it is graphically located above driving plane 
    .addChild(Transform() \
     .setTranslation([0,4,0]) \
     .addChild(Billboard() \
      .setAxisOfRotation([0,0,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["Animation using PositionInterpolator","and OrientationInterpolator"]) \
        .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.6) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
        ) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation//PositionOrientationInterpolatorsExampleTraced_RoundTrip.x3d")
