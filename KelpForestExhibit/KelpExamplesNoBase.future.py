from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("KelpExamplesNoBase.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Creates 3 instances of Kelp that sway.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Joseph Cannon, Dan DeVos, Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("25 September 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://faculty.nps.edu/brutzman/kelp") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute.") \
     .setName("accessRights") \
    ) \
    .addMeta(meta() \
     .setContent("http://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpExamplesNoBase.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html") \
     .setName("generator") \
    ) \
    .addMeta(meta() \
     .setContent("../license.html") \
     .setName("license") \
    ) \
   ) \
   .setScene(Scene() \
    .addChild(ExternProtoDeclare() \
     .setAppinfo("Kelp strands and bulbs with no base") \
     .setName("Kelp") \
     .setUrl(["KelpPrototype.x3d#Kelp","http://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpPrototype.x3d#Kelp","KelpPrototype.wrl#Kelp","http://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpPrototype.wrl#Kelp"]) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("frontBladeSize") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("rearSideBladeHeight") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("frontSideBladeHeight") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("rightBladeSize") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("rightSideBladeHeight") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("leftBladeSize") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("rearBladeSize") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("leftSideBladeHeight") \
      .setType("SFVec3f") \
     ) \
    ) \
    .addChild(Group() \
     .addChild(Transform() \
      .setDEF("KelpTransform0") \
      .setScale([0.3,0.3,0.3]) \
      .addChild(ProtoInstance() \
       .setName("Kelp") \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("KelpTransform1") \
      .setRotation([0.0,1.0,0.0,5.5]) \
      .setScale([0.29,0.29,0.29]) \
      .setTranslation([-0.5,0.0,0.0]) \
      .addChild(ProtoInstance() \
       .setName("Kelp") \
       .addFieldValue(fieldValue() \
        .setName("rearSideBladeHeight") \
        .setValue("0.0 15.0 0.0") \
       ) \
       .addFieldValue(fieldValue() \
        .setName("frontBladeSize") \
        .setValue("0.4 0.4 0.4") \
       ) \
       .addFieldValue(fieldValue() \
        .setName("frontSideBladeHeight") \
        .setValue("0.0 23.0 0.0") \
       ) \
       .addFieldValue(fieldValue() \
        .setName("rightBladeSize") \
        .setValue("0.4 0.4 0.4") \
       ) \
       .addFieldValue(fieldValue() \
        .setName("rightSideBladeHeight") \
        .setValue("0.0 20.0 0.0") \
       ) \
       .addFieldValue(fieldValue() \
        .setName("leftBladeSize") \
        .setValue("0.7 0.7 0.7") \
       ) \
       .addFieldValue(fieldValue() \
        .setName("rearBladeSize") \
        .setValue("0.7 0.7 0.7") \
       ) \
       .addFieldValue(fieldValue() \
        .setName("leftSideBladeHeight") \
        .setValue("0.0 6.0 0.0") \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("KelpTransform2") \
      .setScale([0.3,0.3,0.3]) \
      .setTranslation([0.5,0.0,0.5]) \
      .addChild(ProtoInstance() \
       .setName("Kelp") \
       .addFieldValue(fieldValue() \
        .setName("rearSideBladeHeight") \
        .setValue("0.0 18.0 0.0") \
       ) \
       .addFieldValue(fieldValue() \
        .setName("frontBladeSize") \
        .setValue("0.7 0.7 0.7") \
       ) \
       .addFieldValue(fieldValue() \
        .setName("frontSideBladeHeight") \
        .setValue("0.0 8.0 0.0") \
       ) \
       .addFieldValue(fieldValue() \
        .setName("rightBladeSize") \
        .setValue("0.7 0.7 0.7") \
       ) \
       .addFieldValue(fieldValue() \
        .setName("rightSideBladeHeight") \
        .setValue("0.0 16.0 0.0") \
       ) \
       .addFieldValue(fieldValue() \
        .setName("leftBladeSize") \
        .setValue("0.7 0.7 0.7") \
       ) \
       .addFieldValue(fieldValue() \
        .setName("rearBladeSize") \
        .setValue("0.4 0.4 0.4") \
       ) \
       .addFieldValue(fieldValue() \
        .setName("leftSideBladeHeight") \
        .setValue("0.0 13.0 0.0") \
       ) \
      ) \
     ) \
    ) \
    .addChild(Group() \
# ==================== 
     .addChild(TimeSensor() \
      .setDEF("Clock0") \
      .setCycleInterval(5.5) \
      .setLoop(True) \
     ) \
# ==================== 
     .addChild(OrientationInterpolator() \
      .setDEF("KelpPath0") \
      .setKey([0.0,0.05,0.25,0.45,0.5,0.55,0.75,0.95,1.0]) \
      .setKeyValue([0,0,1,0.1,0,0,1,0.095,0,0,1,0,0,0,1,-0.095,0,0,1,-0.1,0,0,1,-0.095,0,0,1,0,0,0,1,0.095,0,0,1,0.1]) \
     ) \
     .addChild(ROUTE() \
      .setFromField("fraction_changed") \
      .setFromNode("Clock0") \
      .setToField("set_fraction") \
      .setToNode("KelpPath0") \
     ) \
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("KelpPath0") \
      .setToField("set_rotation") \
      .setToNode("KelpTransform0") \
     ) \
# ==================== 
     .addChild(Script() \
      .setDEF("TimeDelay1") \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("set_fraction") \
       .setType("SFFloat") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("value_changed") \
       .setType("SFFloat") \
      ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"\n"+
"function set_fraction (value, timestamp)\n"+
"{\n"+
"	delay = 0.25;\n"+
"	delayedValue = value + (delay/5.5); // delay/interval, seconds\n"+
"	if (delayedValue > 1) delayedValue--;\n"+
"	value_changed = delayedValue;\n"+
"\n"+
"//	Browser.print ('TimeDelay1 value=' + value + ', value_changed=' + value_changed);\n"+
"}\n"+
"''')
     ) \
     .addChild(OrientationInterpolator() \
      .setDEF("KelpPath1") \
      .setKey([0.0,0.05,0.25,0.45,0.5,0.55,0.75,0.95,1.0]) \
      .setKeyValue([0,0,1,0.1,0,0,1,0.095,0,0,1,0,0,0,1,-0.095,0,0,1,-0.1,0,0,1,-0.095,0,0,1,0,0,0,1,0.095,0,0,1,0.1]) \
     ) \
     .addChild(ROUTE() \
      .setFromField("fraction_changed") \
      .setFromNode("Clock0") \
      .setToField("set_fraction") \
      .setToNode("TimeDelay1") \
     ) \
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("TimeDelay1") \
      .setToField("set_fraction") \
      .setToNode("KelpPath1") \
     ) \
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("KelpPath1") \
      .setToField("set_rotation") \
      .setToNode("KelpTransform1") \
     ) \
# ==================== 
     .addChild(Script() \
      .setDEF("TimeDelay2") \
      .addField(field() \
       .setAccessType("inputOnly") \
       .setName("set_fraction") \
       .setType("SFFloat") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setName("value_changed") \
       .setType("SFFloat") \
      ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"\n"+
"function set_fraction (value, timestamp)\n"+
"{\n"+
"	delay = 0.5;\n"+
"	delayedValue = value + (delay/5.5); // delay/interval, seconds\n"+
"	if (delayedValue > 1) delayedValue--;\n"+
"	value_changed = delayedValue;\n"+
"\n"+
"//	Browser.print ('TimeDelay2 value=' + value + ', value_changed=' + value_changed);\n"+
"}\n"+
"''')
     ) \
     .addChild(OrientationInterpolator() \
      .setDEF("KelpPath2") \
      .setKey([0.0,0.05,0.25,0.45,0.5,0.55,0.75,0.95,1.0]) \
      .setKeyValue([0,0,1,0.1,0,0,1,0.095,0,0,1,0,0,0,1,-0.095,0,0,1,-0.1,0,0,1,-0.095,0,0,1,0,0,0,1,0.095,0,0,1,0.1]) \
     ) \
     .addChild(ROUTE() \
      .setFromField("fraction_changed") \
      .setFromNode("Clock0") \
      .setToField("set_fraction") \
      .setToNode("TimeDelay2") \
     ) \
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("TimeDelay2") \
      .setToField("set_fraction") \
      .setToNode("KelpPath2") \
     ) \
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("KelpPath2") \
      .setToField("set_rotation") \
      .setToNode("KelpTransform2") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//KelpExamplesNoBase_RoundTrip.x3d")
