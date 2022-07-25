from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addComponent(component() \
     .setLevel(3) \
     .setName("Interpolation") \
    ) \
    .addMeta(meta() \
     .setContent("CoordinateInterpolator2dExample.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example to interpolate using CoordinateInterpolator2D - click geometry to activate animation loop.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman, Jeff Weekley, Jane Wu") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("9 October 2001") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("11 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("CoordinateInterpolator2D") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/CoordinateInterpolator2dExample.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/Basic/development/CoordinateInterpolator2dExample.x3d") \
     .setName("reference") \
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
     .setDescription("Click to activate animation") \
     .setOrientation([1,0,0,-0.4]) \
     .setPosition([0,4,10]) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("Clock") \
     .setCycleInterval(5) \
     .setEnabled(False) \
     .setLoop(True) \
    ) \
    .addChild(CoordinateInterpolator2D() \
     .setDEF("InterpolateCrossSection") \
     .setKey([0,0.45,0.9,1]) \
     .setKeyValue([1,1,1,-1,-1,-1,-1,1,1,1,2,2,2,-2,-1,-1,-1,1,2,2,1,1,1,-1,-1,-1,-1,1,1,1,1,1,1,-1,-1,-1,-1,1,1,1]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("Clock") \
     .setToField("set_fraction") \
     .setToNode("InterpolateCrossSection") \
    ) \
    .addChild(Transform() \
     .setTranslation([0.25,1,0]) \
# &amp; is the XML escape character code for ampersand character 
     .addChild(TouchSensor() \
      .setDEF("Toucher") \
      .setDescription("select & hold shape to animate Extrusion") \
     ) \
     .addChild(ROUTE() \
      .setFromField("isActive") \
      .setFromNode("Toucher") \
      .setToField("enabled") \
      .setToNode("Clock") \
     ) \
# also reset clock to restart 
     .addChild(ROUTE() \
      .setFromField("touchTime") \
      .setFromNode("Toucher") \
      .setToField("startTime") \
      .setToNode("Clock") \
     ) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0.2,0.8,0.4]) \
        .setEmissiveColor([0.05,0.2,0.1]) \
       ) \
      ) \
      .setGeometry(Extrusion(spine = [-4,0,-2,-1,0,-2,2,0,1,2,0,4]) \
       .setDEF("AnimatedCrossSectionExtrusion") \
      ) \
# default Extrusion crossSection='1 1 1 -1 -1 -1 -1 1 1 1' is a square 
     ) \
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("InterpolateCrossSection") \
      .setToField("set_crossSection") \
      .setToNode("AnimatedCrossSectionExtrusion") \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([-1.5,-1,2]) \
     .addChild(Billboard() \
      .setAxisOfRotation([0,0,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["select & hold shape","to animate Extrusion"]) \
        .setFontStyle(FontStyle(family = ["SANS"], justify = ["MIDDLE","MIDDLE"], size = 0.8) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.8,0.4,0.2]) \
        ) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation//CoordinateInterpolator2dExample_RoundTrip.x3d")
