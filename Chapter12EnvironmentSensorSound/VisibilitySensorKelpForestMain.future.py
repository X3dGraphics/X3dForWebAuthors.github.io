from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("VisibilitySensorKelpForestMain.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("VisibilitySensor example.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman Revised: Leonard Daly for X3D Book") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("1 June 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("2 April 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://faculty.nps.edu/brutzman/kelp") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://faculty.nps.edu/brutzman/kelp/KelpForestDesignPaper.pdf") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Kelp Forest 3D models") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute.") \
     .setName("permissions") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestMain.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/VisibilitySensorKelpForestMain.x3d") \
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
    .addChild(Collision() \
     .setEnabled(False) \
     .setProxy(Transform() \
      .setTranslation([0,-3.5,-2]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,.5,0]) \
         .setTransparency(.9) \
        ) \
       ) \
       .setGeometry(Box(size = [20,11,11]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(VisibilitySensor(size = [20,11,11]) \
     .setDEF("SeeMe") \
     .setCenter([0,-3.5,-2]) \
    ) \
    .addChild(Script() \
     .setDEF("PrintInfo") \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("isVisible") \
      .setType("SFBool") \
     ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"\n"+
"// Functions for ProximitySensor\n"+
"\n"+
"function position (value) {\n"+
"  var x = Math.floor (value[0] * precision + 0.5) / precision;\n"+
"  var y = Math.floor (value[1] * precision + 0.5) / precision;\n"+
"  var z = Math.floor (value[2] * precision + 0.5) / precision;\n"+
"  Browser.print ('position: ' + x + ' ' + y + ' ' + z);\n"+
"}\n"+
"\n"+
"function orientation (value) {\n"+
"  var x = Math.floor (value[0] * precision + 0.5) / precision;\n"+
"  var y = Math.floor (value[1] * precision + 0.5) / precision;\n"+
"  var z = Math.floor (value[2] * precision + 0.5) / precision;\n"+
"  var a = Math.floor (value[3] * precision + 0.5) / precision;\n"+
"  Browser.print ('orientation: ' + x + ' ' + y + ' ' + z + ' ' + a);\n"+
"}\n"+
"\n"+
"// Functions for VisibilitySensor\n"+
"\n"+
"function isVisible (value) {\n"+
"  Browser.print ('The region is visible: ' + value);\n"+
"}\n"+
"''')
    ) \
    .addChild(ROUTE() \
     .setFromField("isActive") \
     .setFromNode("SeeMe") \
     .setToField("isVisible") \
     .setToNode("PrintInfo") \
    ) \
    .addChild(WorldInfo() \
     .setInfo(["kelpForestMain3.4.wrl","Model of the Monterey Bay Aquarium Kelp Forest","DTG of last updated: 111500Jun98","Updated: kelpTank2.9.wrl; ","Created by Naval Postgraduate School students under the supervision of Don Brutzman","Feel free to copy anything you wish - just give credit where it is due","http://faculty.nps.edu/brutzman/kelp"]) \
     .setTitle("NPS Virtual Kelp Forest Exhibit") \
    ) \
    .addChild(NavigationInfo() \
     .setSpeed(3.0) \
    ) \
    .addChild(ExternProtoDeclare() \
     .setAppinfo("ViewPositionOrientation prototype provides local position and orientation as user navigates with optional console output") \
     .setName("ViewPositionOrientation") \
     .setUrl(["../../Savage/Tools/Authoring/ViewPositionOrientationPrototype.x3d#ViewPositionOrientation","https://savage.nps.edu/Savage/Tools/Authoring/ViewPositionOrientationPrototype.x3d#ViewPositionOrientation","../../Savage/Tools/Authoring/ViewPositionOrientationPrototype.wrl#ViewPositionOrientation","https://savage.nps.edu/Savage/Tools/Authoring/ViewPositionOrientationPrototype.wrl#ViewPositionOrientation"]) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("Whether or not ViewPositionOrientation sends output to console.") \
      .setName("enabled") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Output internal trace messages for debugging this node - developer use only can be ignored.") \
      .setName("traceEnabled") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setAppinfo("Ability to turn output tracing on/off at runtime.") \
      .setName("set_traceEnabled") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setAppinfo("Output local position.") \
      .setName("position_changed") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setAppinfo("Output local orientation.") \
      .setName("orientation_changed") \
      .setType("SFRotation") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setAppinfo("MFString value of new Viewpoint for example: <Viewpoint position=\"20 15 20\" orientation=\"-0.516 0.83 0.212 0.9195\"/>") \
      .setName("outputViewpointString") \
      .setType("MFString") \
     ) \
    ) \
    .addChild(ProtoInstance() \
     .setName("ViewPositionOrientation") \
     .addFieldValue(fieldValue() \
      .setName("enabled") \
      .setValue("false") \
     ) \
    ) \
    .addChild(ExternProtoDeclare() \
     .setAppinfo("Reads waypoints and legSpeeds/legDurations/defaultSpeed to provide a customizable position/orientation interpolator.") \
     .setName("WaypointInterpolator") \
     .setUrl(["../../../Savage/Tools/Animation/WaypointInterpolatorPrototype.x3d#WaypointInterpolator","https://savage.nps.edu/Savage/Tools/Animation/WaypointInterpolatorPrototype.x3d#WaypointInterpolator","../../../Savage/Tools/Animation/WaypointInterpolatorPrototype.wrl#WaypointInterpolator","https://savage.nps.edu/Savage/Tools/Animation/WaypointInterpolatorPrototype.wrl#WaypointInterpolator"]) \
# Priority of use: legSpeeds (m/sec), legDurations (seconds), defaultSpeed (m/sec) 
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Short description of what is animated by this WaypointInterpolator.") \
      .setName("description") \
      .setType("SFString") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Waypoints being traversed with interpolation of intermediate positions and orientations.") \
      .setName("waypoints") \
      .setType("MFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setAppinfo("Add another single waypoint to array of waypoints recalculate interpolator values.") \
      .setName("add_waypoint") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setAppinfo("Replace all waypoints recalculate interpolator values.") \
      .setName("set_waypoints") \
      .setType("MFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Whether to pitch child geometry (such as a vehicle) up or down to match vertical slope") \
      .setName("pitchUpDownForVerticalWaypoints") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Units m/sec. If used array lengths for legSpeeds and legDurations must be one less than number of waypoints.") \
      .setName("legSpeeds") \
      .setType("MFFloat") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Units in seconds. If used array lengths for legSpeeds and legDurations must be one less than number of waypoints.") \
      .setName("legDurations") \
      .setType("MFTime") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Units m/sec.") \
      .setName("defaultSpeed") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("turningRate (degrees/second) also determines standoff distance prior to waypoint where turn commences. If 0 turns are instantaneous.") \
      .setName("turningRate") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setAppinfo("Output calculation summing all leg durations, useful for setting TimeSensor cycleInterval. Units in seconds.") \
      .setName("totalDuration") \
      .setType("SFTime") \
     ) \
# interpolation fields 
     .addField(field() \
      .setAccessType("inputOnly") \
      .setAppinfo("exposed PositionInterpolator and OrientationInterpolator setting") \
      .setName("set_fraction") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setAppinfo("exposed PositionInterpolator setting") \
      .setName("position_changed") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setAppinfo("exposed OrientationInterpolator setting") \
      .setName("orientation_changed") \
      .setType("SFRotation") \
     ) \
# display-related fields 
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("default color for non-active line segments") \
      .setName("lineColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("highlightSegmentColors must contain two color values for each endpoint of the highlight segment.") \
      .setName("highlightSegmentColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("1.0 is completely transparent, 0.0 is completely opaque.") \
      .setName("transparency") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("allowed values: none; waypoints (produce labels at each waypoint); or interpolation (produce single moving label at interpolator time course speed location)") \
      .setName("labelDisplayMode") \
      .setType("SFString") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("allowed values: altitude depth (negate Y value) none") \
      .setName("heightLabel") \
      .setType("SFString") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("heightLabel relative location") \
      .setName("labelOffset") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("heightLabel text size") \
      .setName("labelFontSize") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("heightLabel text color") \
      .setName("labelColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("enable console output to trace script computations and prototype progress") \
      .setName("traceEnabled") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Output the number of waypoints totalDistance and totalDuration to console upon initialization") \
      .setName("outputInitializationComputations") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("default color for vertical drop-line segments") \
      .setName("verticalDropLineColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("1.0 is completely transparent, 0.0 is completely opaque.") \
      .setName("verticalDropLineTransparency") \
      .setType("SFFloat") \
     ) \
    ) \
    .addChild(Group() \
     .setDEF("Viewpoints") \
     .addChild(Viewpoint() \
      .setDescription("Kelp Forest Monterey Bay Aquarium") \
      .setPosition([0.0,-5.0,45.0]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Side Windows") \
      .setFieldOfView(0.5) \
      .setOrientation([0.0,1.0,0.0,0.9]) \
      .setPosition([25.0,-4.0,15.0]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Star Fish") \
      .setOrientation([0.0,1.0,0.0,1.25]) \
      .setPosition([14.0,-5.75,1.0]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Inside Tank") \
      .setOrientation([0.0,1.0,0.0,3.14]) \
      .setPosition([0.0,-5.0,-7.0]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Top floor") \
      .setFieldOfView(1.04719) \
      .setOrientation([-0.3,1.0,0.3,1.57079]) \
      .setPosition([12.5,5.0,-2.0]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Bird's Eye View") \
      .setOrientation([1.0,0.0,0.0,-1.57]) \
      .setPosition([0.0,19.0,-3.5]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Pump House") \
      .setFieldOfView(0.6) \
      .setOrientation([0.0,1.0,0.0,1.3]) \
      .setPosition([-5.0,1.0,0.0]) \
     ) \
    ) \
    .addChild(Group() \
     .setDEF("Root") \
     .addChild(Background() \
      .setSkyColor([.8,.8,.8]) \
     ) \
     .addChild(Fog() \
      .setColor([.8,.8,.8]) \
      .setVisibilityRange(60) \
     ) \
     .addChild(Inline() \
      .setUrl(["../KelpForestExhibit/IntroductionMessage.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/IntroductionMessage.x3d","../KelpForestExhibit/IntroductionMessage.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/IntroductionMessage.wrl"]) \
     ) \
     .addChild(Collision() \
      .setEnabled(False) \
      .setProxy(Transform() \
       .addChild(Inline() \
        .setUrl(["../KelpForestExhibit/SharkLeftyLocale.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLeftyLocale.x3d","../KelpForestExhibit/SharkLeftyLocale.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLeftyLocale.wrl"]) \
       ) \
      ) \
      .setProxy(Transform() \
       .addChild(Inline() \
        .setUrl(["../KelpForestExhibit/SharkLucyLocale.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucyLocale.x3d","../KelpForestExhibit/SharkLucyLocale.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucyLocale.wrl"]) \
       ) \
      ) \
      .setProxy(Transform() \
       .addChild(Inline() \
        .setUrl(["../KelpForestExhibit/KelpTank.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTank.x3d","../KelpForestExhibit/KelpTank.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTank.wrl"]) \
       ) \
      ) \
      .setProxy(Transform() \
       .setScale([0.54,0.75,0.52]) \
       .setTranslation([0.3,-2.88,7.3]) \
       .addChild(Inline() \
        .setUrl(["../KelpForestExhibit/RockFloor.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RockFloor.x3d","../KelpForestExhibit/RockFloor.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RockFloor.wrl"]) \
       ) \
      ) \
      .setProxy(Transform() \
       .setDEF("K2_LOCALE") \
       .setTranslation([-4.0,0.0,1.0]) \
       .addChild(Transform() \
        .setDEF("K2_MIDWATER") \
        .setScale([0.2,0.2,0.2]) \
        .setTranslation([-1.0,-4.0,-4.0]) \
        .addChild(Inline() \
         .setUrl(["../KelpForestExhibit/SardineSchool.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SardineSchool.x3d","../KelpForestExhibit/SardineSchool.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SardineSchool.wrl"]) \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("K2_FLOOR") \
        .setRotation([0.0,1.0,0.0,0.44]) \
        .setScale([0.5,0.9,0.5]) \
        .setTranslation([-1.9,-8.5,-1.5]) \
        .addChild(Inline() \
         .setDEF("KelpExamplesNoBase") \
         .setUrl(["../KelpForestExhibit/KelpExamplesNoBase.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpExamplesNoBase.x3d","../KelpForestExhibit/KelpExamplesNoBase.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpExamplesNoBase.wrl"]) \
        ) \
       ) \
      ) \
      .setProxy(Transform() \
       .setDEF("K4_LOCALE") \
       .setTranslation([-2.5,0.0,-2.5]) \
       .addChild(Transform() \
        .setDEF("K4_MIDWATER") \
        .setTranslation([-10.0,-2.0,-2.0]) \
        .addChild(Inline() \
         .setUrl(["../KelpForestExhibit/HalfMoonGroup.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonGroup.x3d","../KelpForestExhibit/HalfMoonGroup.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonGroup.wrl"]) \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("K4_FLOOR") \
        .setRotation([0.0,1.0,0.0,-0.3]) \
        .setScale([0.5,0.8,0.5]) \
        .setTranslation([-1.5,-7.5,0.5]) \
        .addChild(Inline() \
         .setUSE("KelpExamplesNoBase") \
        ) \
       ) \
      ) \
      .setProxy(Transform() \
       .setDEF("K7_LOCALE") \
       .setTranslation([2.0,0.0,-2.5]) \
       .addChild(Transform() \
        .setDEF("K7_MIDWATER") \
        .setScale([0.25,0.25,0.25]) \
        .setTranslation([2.0,-4.0,0.0]) \
        .addChild(Inline() \
         .setUrl(["../KelpForestExhibit/RubberLipGroup.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RubberLipGroup.x3d","../KelpForestExhibit/RubberLipGroup.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RubberLipGroup.wrl"]) \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("K7_FLOOR") \
        .setScale([0.5,0.85,0.5]) \
        .setTranslation([0.0,-7.75,0.0]) \
        .addChild(Inline() \
         .setUSE("KelpExamplesNoBase") \
        ) \
       ) \
      ) \
      .setProxy(Transform() \
       .setDEF("K10_LOCALE") \
       .setTranslation([7.0,0.0,2.0]) \
       .addChild(Transform() \
        .setDEF("K10_DEEP") \
        .setTranslation([0.0,-5.0,0.0]) \
        .addChild(Inline() \
         .setUrl(["../KelpForestExhibit/StripedSurfPerch.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/StripedSurfPerch.x3d","../KelpForestExhibit/StripedSurfPerch.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/StripedSurfPerch.wrl"]) \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("K10_FLOOR") \
        .setRotation([0.0,1.0,0.0,0.16]) \
        .setScale([0.5,0.75,0.5]) \
        .setTranslation([-1.0,-7.0,-1.0]) \
        .addChild(Inline() \
         .setUSE("KelpExamplesNoBase") \
        ) \
       ) \
      ) \
      .setProxy(Transform() \
       .setDEF("K11_LOCALE") \
       .setTranslation([8.0,0.0,-2.0]) \
       .addChild(Transform() \
        .setDEF("K11_MIDWATER") \
        .setRotation([0.0,1.0,0.0,0.3]) \
        .setTranslation([2.19,-7.0,0.15]) \
        .addChild(Inline() \
         .setUrl(["../KelpForestExhibit/SeaStarSimple.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarSimple.x3d","../KelpForestExhibit/SeaStarSimple.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarSimple.wrl"]) \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("K11_DEEP") \
        .setRotation([0.0,1.0,0.0,0.9]) \
        .setTranslation([1.0,-5.0,0.0]) \
        .addChild(Inline() \
         .setUrl(["../KelpForestExhibit/BlackSurfPerch.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/BlackSurfPerch.x3d","../KelpForestExhibit/BlackSurfPerch.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/BlackSurfPerch.wrl"]) \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("K11_FLOOR") \
        .setRotation([0.0,1.0,0.0,0.3]) \
        .setScale([0.5,0.75,0.5]) \
        .setTranslation([-0.3,-7.0,0.0]) \
        .addChild(Inline() \
         .setUSE("KelpExamplesNoBase") \
        ) \
       ) \
       .addChild(Transform() \
        .setTranslation([1.3,-5.0,3.0]) \
        .addChild(Inline() \
         .setUrl(["../KelpForestExhibit/SeaStarGroup.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarGroup.x3d","../KelpForestExhibit/SeaStarGroup.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarGroup.wrl"]) \
        ) \
       ) \
      ) \
      .setProxy(Transform() \
       .setDEF("R2_LOCALE") \
       .setTranslation([-1.0,0.0,-1.0]) \
       .addChild(Transform() \
        .setDEF("R2_MIDWATER") \
        .setTranslation([-1.0,-6.0,-2.0]) \
        .addChild(Inline() \
         .setUrl(["../KelpForestExhibit/BlueRockFish.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/BlueRockFish.x3d","../KelpForestExhibit/BlueRockFish.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/BlueRockFish.wrl"]) \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("R2_DEEP") \
        .setTranslation([1.0,-6.5,-1.0]) \
        .addChild(Inline() \
         .setUrl(["../KelpForestExhibit/KelpSurfPerch.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpSurfPerch.x3d","../KelpForestExhibit/KelpSurfPerch.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpSurfPerch.wrl"]) \
        ) \
       ) \
      ) \
      .setProxy(Transform() \
       .setDEF("R3_LOCALE") \
       .setTranslation([3.0,0.0,-4.0]) \
       .addChild(Transform() \
        .setDEF("R3_MIDWATER") \
        .setTranslation([0.0,-6.0,0.0]) \
        .addChild(Inline() \
         .setUrl(["../KelpForestExhibit/Garibaldi.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Garibaldi.x3d","../KelpForestExhibit/Garibaldi.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Garibaldi.wrl"]) \
        ) \
       ) \
      ) \
      .setProxy(Transform() \
       .setDEF("R5_LOCALE") \
       .setTranslation([8.0,0.0,-2.0]) \
       .addChild(Transform() \
        .setDEF("R5_SHALLOW") \
        .setTranslation([-2.0,-2.0,0.0]) \
        .addChild(Inline() \
         .setUrl(["../KelpForestExhibit/KelpBass.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBass.x3d","../KelpForestExhibit/KelpBass.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBass.wrl"]) \
        ) \
       ) \
      ) \
      .setProxy(TimeSensor() \
       .setDEF("WAVE_CLOCK") \
       .setCycleInterval(5.5) \
       .setEnabled(False) \
       .setLoop(True) \
      ) \
      .setProxy(PositionInterpolator() \
       .setDEF("LEFT_SHALLOW_WAVE") \
       .setKey([0.0,0.125,0.25,0.375,0.5,0.625,0.75,0.875,1.0]) \
       .setKeyValue([0.0,0.0,0.0,0.056,-0.085,0.0,0.08,-0.12,0.0,0.056,-0.085,0.0,0.0,0.0,0.0,-0.056,0.085,0.0,-0.08,0.12,0.0,-0.056,0.085,0.0,0.0,0.0,0.0]) \
      ) \
      .setProxy(PositionInterpolator() \
       .setDEF("LEFT_DEEP_WAVE") \
       .setKey([0.0,0.125,0.25,0.375,0.5,0.625,0.75,0.875,1.0]) \
       .setKeyValue([0.0,0.0,0.0,0.035,-0.035,0.0,0.05,-0.05,0.0,0.035,-0.035,0.0,0.0,0.0,0.0,-0.035,0.035,0.0,-0.05,0.05,0.0,-0.035,0.035,0.0,0.0,0.0,0.0]) \
      ) \
      .setProxy(PositionInterpolator() \
       .setDEF("CENTER_WAVE") \
       .setKey([0.0,0.125,0.25,0.375,0.5,0.625,0.75,0.875,1.0]) \
       .setKeyValue([0.0,0.0,0.0,0.106,0.0,0.0,0.15,0.0,0.0,0.106,0.0,0.0,0.0,0.0,0.0,-0.106,0.0,0.0,-0.15,0.0,0.0,-0.106,0.0,0.0,0.0,0.0,0.0]) \
      ) \
      .setProxy(PositionInterpolator() \
       .setDEF("RIGHT_SHALLOW_WAVE") \
       .setKey([0.0,0.125,0.25,0.375,0.5,0.625,0.75,0.875,1.0]) \
       .setKeyValue([0.0,0.0,0.0,0.056,0.085,0.0,0.08,0.12,0.0,0.056,0.085,0.0,0.0,0.0,0.0,-0.056,-0.085,0.0,-0.08,-0.12,0.0,-0.056,-0.085,0.0,0.0,0.0,0.0]) \
      ) \
      .setProxy(PositionInterpolator() \
       .setDEF("RIGHT_DEEP_WAVE") \
       .setKey([0.0,0.125,0.25,0.375,0.5,0.625,0.75,0.875,1.0]) \
       .setKeyValue([0.0,0.0,0.0,0.035,0.035,0.0,0.05,0.05,0.0,0.035,0.035,0.0,0.0,0.0,0.0,-0.035,-0.035,0.0,-0.05,-0.05,0.0,-0.035,-0.035,0.0,0.0,0.0,0.0]) \
      ) \
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("WAVE_CLOCK") \
     .setToField("set_fraction") \
     .setToNode("CENTER_WAVE") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("CENTER_WAVE") \
     .setToField("set_translation") \
     .setToNode("K7_MIDWATER") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("RIGHT_DEEP_WAVE") \
     .setToField("set_translation") \
     .setToNode("K2_MIDWATER") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("CENTER_WAVE") \
     .setToField("set_translation") \
     .setToNode("K4_MIDWATER") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("LEFT_DEEP_WAVE") \
     .setToField("set_translation") \
     .setToNode("K10_DEEP") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("LEFT_DEEP_WAVE") \
     .setToField("set_translation") \
     .setToNode("K11_DEEP") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("RIGHT_SHALLOW_WAVE") \
     .setToField("set_translation") \
     .setToNode("R2_MIDWATER") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("RIGHT_DEEP_WAVE") \
     .setToField("set_translation") \
     .setToNode("R2_DEEP") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("CENTER_WAVE") \
     .setToField("set_translation") \
     .setToNode("R3_MIDWATER") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("RIGHT_SHALLOW_WAVE") \
     .setToField("set_translation") \
     .setToNode("R5_SHALLOW") \
    ) \
    .addChild(TimeSensor() \
     .setDEF("MasterClock") \
     .setLoop(True) \
    ) \
    .addChild(Group() \
     .setDEF("Nancy") \
# Scale used on Nancy underwater to approximate the defraction magnification of the plexiglass window. 
     .addChild(Transform() \
      .setDEF("NancyTransform") \
      .setRotation([-0.45,0.77,-0.45,1.82]) \
      .setScale([1.3,1.3,1.3]) \
      .setTranslation([3,-6.5,-2]) \
      .addChild(Inline() \
       .setUrl(["../../Basic/HumanoidAnimation/NancyDiving.x3d","http://www.web3d.org/x3d/content/examples/HumanoidAnimation/NancyDiving.x3d","../../Basic/HumanoidAnimation/NancyDiving.wrl","http://www.web3d.org/x3d/content/examples/HumanoidAnimation/NancyDiving.wrl"]) \
      ) \
     ) \
     .addChild(TimeSensor() \
      .setDEF("JEFFSCLOCK") \
      .setCycleInterval(100) \
      .setLoop(True) \
     ) \
     .addChild(ProtoInstance() \
      .setDEF("NancyInterpolator") \
      .setName("WaypointInterpolator") \
      .addFieldValue(fieldValue() \
       .setName("description") \
       .setValue("Nancy track") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("waypoints") \
       .setValue("-5.5 -5.7 -.2 -7.7 -2.7 -1.7 6 -3 -3 2 -2 -2 1 -4 -1 -2 -2 -2 -5.5 -5.7 -.2") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("defaultSpeed") \
       .setValue("0.5") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("pitchUpDownForVerticalWaypoints") \
       .setValue("true") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("labelDisplayMode") \
       .setValue("none") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("lineColor") \
       .setValue("0 0 0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("labelColor") \
       .setValue("0 0.8 0.8") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("labelOffset") \
       .setValue("0 -1.6 0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("labelFontSize") \
       .setValue("6") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("traceEnabled") \
       .setValue("false") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("transparency") \
       .setValue("1") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("turningRate") \
       .setValue("18") \
      ) \
# totalDuration is a computed output 
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("JEFFSCLOCK") \
     .setToField("set_fraction") \
     .setToNode("NancyInterpolator") \
    ) \
    .addChild(ROUTE() \
     .setFromField("position_changed") \
     .setFromNode("NancyInterpolator") \
     .setToField("set_translation") \
     .setToNode("NancyTransform") \
    ) \
    .addChild(ROUTE() \
     .setFromField("orientation_changed") \
     .setFromNode("NancyInterpolator") \
     .setToField("set_rotation") \
     .setToNode("NancyTransform") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound//VisibilitySensorKelpForestMain_RoundTrip.x3d")
