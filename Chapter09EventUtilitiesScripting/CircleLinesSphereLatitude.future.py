from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interactive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("CircleLinesSphereLatitude.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Build a sphere outline by using multiple CircleLine circles as latitude rings, with actual semitransparent Sphere and axes added as a visualization hint.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman and Ben Cheng") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("12 August 2013") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("CircleLinesSphereCalculations.jpg") \
     .setName("drawing") \
    ) \
    .addMeta(meta() \
     .setContent("CircleLinesExample.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("CircleLinesSphereLongitude.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/CircleLinesSphereLatitude.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit") \
     .setName("generator") \
    ) \
    .addMeta(meta() \
     .setContent("../license.html") \
     .setName("license") \
    ) \
   ) \
   .setScene(Scene() \
    .addChild(Viewpoint() \
     .setDescription("CircleLines Example") \
     .setPosition([0,0,4]) \
    ) \
    .addChild(Shape() \
     .setDEF("OuterHullVisualizationHint") \
     .setGeometry(Sphere(radius = 0.995) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setDiffuseColor([1,1,1]) \
       .setTransparency(0.4) \
      ) \
     ) \
    ) \
# CircleLines is an IndexedLineSet made out of 24 line segments 
    .addChild(Transform() \
     .setDEF("CircleEquator") \
     .setRotation([1,0,0,1.570796]) \
     .addChild(Shape() \
      .setDEF("CircleLines") \
      .setGeometry(IndexedLineSet(coordIndex = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,-1]) \
       .setCoord(Coordinate() \
        .setPoint([0.000,1.000,0.0,0.259,0.966,0.0,0.500,0.866,0.0,0.707,0.707,0.0,0.866,0.500,0.0,0.966,0.259,0.0,1.000,0.000,0.0,0.966,-0.259,0.0,0.866,-0.500,0.0,0.707,-0.707,0.0,0.500,-0.866,0.0,0.259,-0.966,0.0,0.000,-1.000,0.0,-0.259,-0.966,0.0,-0.500,-0.866,0.0,-0.707,-0.707,0.0,-0.866,-0.500,0.0,-0.966,-0.259,0.0,-1.000,-0.000,0.0,-0.966,0.259,0.0,-0.866,0.500,0.0,-0.707,0.707,0.0,-0.500,0.866,0.0,-0.259,0.966,0.0,0,1,0,0,-1,0,1,0,0,-1,0,0]) \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setDEF("CircleAppearance") \
       .setMaterial(Material() \
        .setEmissiveColor([1,.5,.2]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Group() \
     .setDEF("CircleLatitudes") \
     .addChild(Transform() \
      .setScale([0.9682,0.9682,0.9682]) \
      .setTranslation([0,.25,0]) \
      .addChild(Transform() \
       .setUSE("CircleEquator") \
      ) \
     ) \
     .addChild(Transform() \
      .setScale([0.8660,0.8660,0.8660]) \
      .setTranslation([0,.5,0]) \
      .addChild(Transform() \
       .setUSE("CircleEquator") \
      ) \
     ) \
     .addChild(Transform() \
      .setScale([0.6614,0.6614,0.6614]) \
      .setTranslation([0,.75,0]) \
      .addChild(Transform() \
       .setUSE("CircleEquator") \
      ) \
     ) \
     .addChild(Transform() \
      .setScale([0.3122,0.3122,0.3122]) \
      .setTranslation([0,.95,0]) \
      .addChild(Transform() \
       .setUSE("CircleEquator") \
      ) \
     ) \
     .addChild(Shape() \
      .setDEF("TipTop") \
      .setGeometry(PointSet() \
       .setCoord(Coordinate() \
        .setPoint([0,1,0]) \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setUSE("CircleAppearance") \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([1,0,0,3.141593]) \
     .addChild(Group() \
      .setUSE("CircleLatitudes") \
     ) \
    ) \
# Authoring hint: these axes are aligned within local coordinate system 
    .addChild(Transform() \
     .setDEF("CoordinateAxesAdjustedScale") \
     .addChild(Transform() \
      .setDEF("ScaleFeetToMeters") \
      .setScale([0.4,0.4,0.4]) \
      .addChild(Inline() \
       .setDEF("CoordinateAxes") \
       .setUrl(["../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl"]) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//CircleLinesSphereLatitude_RoundTrip.x3d")
