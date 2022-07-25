from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("BackgroundTimeOfDay.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Interpolate between Background color arrays to show a gradually changing time-of-day effect.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman and MV4205 class") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("22 April 2009") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("20 November 2011") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironment/BackgroundSelector.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("X3D Background example") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundTimeOfDay.x3d") \
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
    .addChild(Transform() \
     .setTranslation([0,3,0]) \
     .addChild(Shape() \
      .setGeometry(Text() \
       .setString(["Background Time Of Day"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
       ) \
      ) \
     ) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("TimeOfDayClock") \
     .setCycleInterval(6) \
     .setLoop(True) \
    ) \
    .addChild(Script() \
     .setDEF("BackgroundColorInterpolator") \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("set_fraction") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("groundColorSunrise") \
      .setType("MFColor") \
      .setValue("0.133 0.419 0 0.36 0.1 0 1 0.74 0.4 1 0.74 0.4 0 0.2 0.75 0 0.1 0.5") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("groundColorNoon") \
      .setType("MFColor") \
      .setValue("0.133 0.419 0 0.36 0.1 0 1 0.74 0.4 1 0.74 0.4 0 0 0.5 0 0 0.2") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("groundColorSunset") \
      .setType("MFColor") \
      .setValue("0.133 0.419 0 0.36 0.1 0 1 0.74 0.4 1 0.74 0.4 0 0 0.5 0 0 0.2") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("groundColorNight") \
      .setType("MFColor") \
      .setValue("0.133 0.419 0 0.36 0.1 0 1 0.74 0.4 1 0.74 0.4 0 0 0.5 0 0 0.2") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("skyColorSunrise") \
      .setType("MFColor") \
      .setValue("1 1 0.2 1 1 0 0.36 0.63 1 0 0.4 1 0 0.4 1") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("skyColorNoon") \
      .setType("MFColor") \
      .setValue("0 0.035 0.34 0 0.015 0.44 0 0.05 0.5 0 0.1 0.6 0.44 0.8 1 1 1 0.7") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("skyColorSunset") \
      .setType("MFColor") \
      .setValue("0 0 0.38 0 0 0.68 0.5 0.2 1 0.5 0.2 1 1 0.3 0 1 0.2 0.8") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("skyColorNight") \
      .setType("MFColor") \
      .setValue("1 1 1 0.8 0.8 0.8 0.1 0.1 0.1 0 0 0 0 0 0") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("groundColor_changed") \
      .setType("MFColor") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("skyColor_changed") \
      .setType("MFColor") \
     ) \
.setSourceCode('''\n"+
"ecmascript:\n"+
"\n"+
"function initialize()\n"+
"{\n"+
"    Browser.print ('groundColorSunrise length=' + groundColorSunrise.length + ' '  + groundColorSunrise.toString() + '\\n');\n"+
"    Browser.print ('groundColorNoon    length=' +    groundColorNoon.length +    ' '  + groundColorNoon.toString() + '\\n');\n"+
"    Browser.print ('groundColorSunset  length=' +  groundColorSunset.length +  ' '  + groundColorSunset.toString() + '\\n');\n"+
"    Browser.print ('groundColorNight   length=' +   groundColorNight.length +   ' '  + groundColorNight.toString() + '\\n');\n"+
"    Browser.print ('skyColorSunrise    length=' +    skyColorSunrise.length +    ' '  + skyColorSunrise.toString() + '\\n');\n"+
"    Browser.print ('skyColorNoon       length=' +       skyColorNoon.length +       ' '  + skyColorNoon.toString() + '\\n');\n"+
"    Browser.print ('skyColorSunset     length=' +     skyColorSunset.length +     ' '  + skyColorSunset.toString() + '\\n');\n"+
"    Browser.print ('skyColorNight      length=' +      skyColorNight.length +      ' '  + skyColorNight.toString() + '\\n');\n"+
"}\n"+
"function set_fraction (fraction) // fraction is input value sent by TimeSensor clock\n"+
"{\n"+
"    // Sunrise to Noon, fraction 0.0 to 0.25, interval=0.25\n"+
"    if      (fraction < 0.25)\n"+
"    {\n"+
"        groundColor_changed = interpolate (groundColorSunrise, groundColorNoon, fraction, 0.00, 0.25);\n"+
"           skyColor_changed = interpolate (   skyColorSunrise,    skyColorNoon, fraction, 0.00, 0.25);\n"+
"    }\n"+
"    // Noon to Evening, fraction 0.25 to 0.5, interval=0.25\n"+
"    else if (fraction < 0.5)\n"+
"    {\n"+
"        groundColor_changed = interpolate (groundColorNoon, groundColorSunset, fraction, 0.25, 0.25);\n"+
"           skyColor_changed = interpolate (   skyColorNoon,    skyColorSunset, fraction, 0.25, 0.25);\n"+
"    }\n"+
"    // Evening to Night, fraction 0.5 to 0.6, interval=0.1\n"+
"    else if (fraction < 0.6)\n"+
"    {\n"+
"        groundColor_changed = interpolate (groundColorSunset, groundColorNight, fraction, 0.5, 0.1);\n"+
"           skyColor_changed = interpolate (   skyColorSunset,    skyColorNight, fraction, 0.5, 0.1);\n"+
"    }\n"+
"    // Night (unchanging), fraction 0.6 to 0.95, interval=0.35\n"+
"    else if (fraction < 0.95)\n"+
"    {\n"+
"        groundColor_changed = groundColorNight;\n"+
"           skyColor_changed = skyColorNight;\n"+
"    }\n"+
"    // Night to Sunrise, fraction 0.95 to 1.0, interval=0.05\n"+
"    else // (fraction < 1.0)\n"+
"    {\n"+
"        groundColor_changed = interpolate (groundColorNight, groundColorSunrise, fraction, 0.95, 0.05);\n"+
"           skyColor_changed = interpolate (   skyColorNight,    skyColorSunrise, fraction, 0.95, 0.05);\n"+
"    }\n"+
"//    Browser.print ('groundColor_changed=' + groundColor_changed.toString() + '\\n');\n"+
"//    Browser.print ('   skyColor_changed=' +    skyColor_changed.toString() + '\\n');\n"+
"}\n"+
"function interpolate (firstColorArray, secondColorArray, fraction, initialFraction, interval)\n"+
"{\n"+
"    f = (fraction - initialFraction) / interval; // f should range from 0 to 1\n"+
"//  Browser.print ('initialFraction=' + initialFraction + ', fraction=' + fraction + ', f=' + f + '\\n');\n"+
"\n"+
"    color0 = firstColorArray[0] + (secondColorArray[0] - firstColorArray[0]) * f;\n"+
"    color1 = firstColorArray[1] + (secondColorArray[1] - firstColorArray[1]) * f;\n"+
"    color2 = firstColorArray[2] + (secondColorArray[2] - firstColorArray[2]) * f;\n"+
"    color3 = firstColorArray[3] + (secondColorArray[3] - firstColorArray[3]) * f;\n"+
"    color4 = firstColorArray[4] + (secondColorArray[4] - firstColorArray[4]) * f;\n"+
"    return new MFColor (color0, color1, color2, color3, color4);\n"+
"}\n"+
"''')
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("TimeOfDayClock") \
     .setToField("set_fraction") \
     .setToNode("BackgroundColorInterpolator") \
    ) \
    .addChild(Background() \
     .setDEF("AnimatedBackground") \
     .setGroundAngle([0.03,1.26,1.5,1.57]) \
     .setGroundColor([0.133333,0.419608,0,0.36,0.1,0,1,0.74,0.4,0,0,0.5,0,0,0.2]) \
     .setSkyAngle([0.03,0.05,1.5,1.57]) \
     .setSkyColor([1,1,1,0.8,0.8,0.8,0.1,0.1,0.1,0,0,0,0,0,0]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("groundColor_changed") \
     .setFromNode("BackgroundColorInterpolator") \
     .setToField("groundColor") \
     .setToNode("AnimatedBackground") \
    ) \
    .addChild(ROUTE() \
     .setFromField("skyColor_changed") \
     .setFromNode("BackgroundColorInterpolator") \
     .setToField("skyColor") \
     .setToNode("AnimatedBackground") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects//BackgroundTimeOfDay_RoundTrip.x3d")
