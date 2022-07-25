from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("HelloX3dAuthorsAnimationChain.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("5 October 2000") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("2 April 2019") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Fully developed animation-chain example showing spinning globe and text: Hello!") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/HelloX3dAuthorsAnimationChain.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/Basic/course/HelloX3dAuthorsAnimationChain.x3d") \
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
    .addChild(WorldInfo() \
     .setInfo(["an introductory scene"]) \
     .setTitle("Hello X3D Authors Animation Chain") \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Hello, world") \
     .setOrientation([0,1,0,3.14159]) \
     .setPosition([0,0,-8]) \
    ) \
# change TimeSensor loop='true' to enable automatic animation when loaded, rather than TouchSensor trigger to start 
    .addChild(TimeSensor() \
     .setDEF("OrbitalTimeInterval") \
     .setCycleInterval(12) \
    ) \
    .addChild(OrientationInterpolator() \
     .setDEF("SpinThoseThings") \
     .setKey([0.00,0.25,0.50,0.75,1.00]) \
     .setKeyValue([0,1,0,0,0,1,0,1.57079,0,1,0,3.14159,0,1,0,4.7123889,0,1,0,6.2831852]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("OrbitalTimeInterval") \
     .setToField("set_fraction") \
     .setToNode("SpinThoseThings") \
    ) \
    .addChild(Transform() \
     .setDEF("EarthCoordinateSystem") \
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("SpinThoseThings") \
      .setToField("set_rotation") \
      .setToNode("EarthCoordinateSystem") \
     ) \
     .addChild(Group() \
      .setDEF("MiniWorld") \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setTexture(ImageTexture() \
         .setUrl(["../../earth-topo.png","../../earth-topo.gif","../../earth-topo-small.gif","http://X3dGraphics.com/examples/X3dForWebAuthors/earth-topo.png","http://X3dGraphics.com/examples/X3dForWebAuthors/earth-topo.gif","http://X3dGraphics.com/examples/X3dForWebAuthors/earth-topo-small.gif"]) \
        ) \
       ) \
       .setGeometry(Sphere() \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("SimpleGeoStationarySatellite") \
      .setRotation([1,0,0,.3]) \
      .setScale([0.1,0.3,0.1]) \
      .setTranslation([0,0,5]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.9,0.1,0.1]) \
         .setEmissiveColor([0.9,0.2,0.1]) \
        ) \
       ) \
       .setGeometry(Text() \
        .setString(["Hello X3D Authors !!"]) \
        .setFontStyle(FontStyle(size = 3) \
        ) \
       ) \
      ) \
     ) \
     .addChild(TouchSensor() \
      .setDEF("ClickTriggerTouchSensor") \
      .setDescription("Click to start animation") \
     ) \
     .addChild(ROUTE() \
      .setFromField("touchTime") \
      .setFromNode("ClickTriggerTouchSensor") \
      .setToField("startTime") \
      .setToNode("OrbitalTimeInterval") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation//HelloX3dAuthorsAnimationChain_RoundTrip.x3d")
