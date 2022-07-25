from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interactive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("CircleLinesSphereLongitude.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Build a sphere outline by using multiple CircleLine circles as longitude rings, with actual semitransparent Sphere and axes added as a visualization hint.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("John Kelly") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("21 August 2013") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("CircleLinesExample.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("CircleLinesSphereLatitude.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/CircleLinesSphereLongitude.x3d") \
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
     .setDescription("LongitudeLines Example") \
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
     .setDEF("PrimeMeridian") \
     .setRotation([1,0,0,0]) \
     .addChild(Shape() \
      .setDEF("CircleLine") \
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
# Each transform below rotates the 'CircleLine' by 30 degrees 
    .addChild(Transform() \
     .setRotation([0,1,0,0.523599]) \
# 30 degrees 
     .addChild(Shape() \
      .setUSE("CircleLine") \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([0,1,0,1.047198]) \
# 60 degrees 
     .addChild(Shape() \
      .setUSE("CircleLine") \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([0,1,0,1.570796]) \
# 90 degrees 
     .addChild(Shape() \
      .setUSE("CircleLine") \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([0,1,0,2.094395]) \
# 120 degrees 
     .addChild(Shape() \
      .setUSE("CircleLine") \
     ) \
    ) \
    .addChild(Transform() \
     .setRotation([0,1,0,2.617994]) \
# 150 degrees 
     .addChild(Shape() \
      .setUSE("CircleLine") \
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

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting//CircleLinesSphereLongitude_RoundTrip.x3d")
