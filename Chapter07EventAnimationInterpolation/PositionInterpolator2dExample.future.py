from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
# Note that the following component statement is needed to add PositionInterpolator2D to Immersive profile nodes 
    .addComponent(component() \
     .setLevel(3) \
     .setName("Interpolation") \
    ) \
    .addMeta(meta() \
     .setContent("PositionInterpolator2dExample.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Interpolation example using PositionInterpolator2D, user can touch (select) the geometry to activate an animation loop that rescales the image texture superimposed on the geometry.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("16 October 2001") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("PositionInterpolator2D") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/PositionInterpolator2dExample.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/Basic/development/PositionInterpolator2dExample.x3d") \
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
     .setPosition([0,0,3]) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("Clock") \
     .setCycleInterval(10) \
     .setEnabled(False) \
     .setLoop(True) \
    ) \
# author fun: experiment by comparing results with keyValue='1 1 1 3 1 3 0.8 0.8 1 1 1 1' 
    .addChild(PositionInterpolator2D() \
     .setDEF("InterpolateTTscale") \
     .setKey([0,0.35,0.45,0.8,0.9,1]) \
     .setKeyValue([1,1,3,3,3,3,0.8,0.8,1,1,1,1]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("Clock") \
     .setToField("set_fraction") \
     .setToNode("InterpolateTTscale") \
    ) \
    .addChild(Transform() \
     .setDEF("ImageAspectRatio") \
     .setScale([1.5,1,1]) \
     .addChild(TouchSensor() \
      .setDEF("Toucher") \
      .setDescription("click and hold to animate TextureTransform") \
     ) \
     .addChild(ROUTE() \
      .setFromField("isActive") \
      .setFromNode("Toucher") \
      .setToField("enabled") \
      .setToNode("Clock") \
     ) \
     .addChild(Shape() \
# solid='true' means single-sided rendering 
      .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,3,0,-1]) \
# note how DEF names can be self-documenting 
       .setCoord(Coordinate() \
        .setDEF("TwoByTwoSquare") \
        .setPoint([-1,-1,0,1,-1,0,1,1,0,-1,1,0]) \
       ) \
      ) \
      .setAppearance(Appearance() \
       .setTexture(ImageTexture() \
        .setDEF("ContactImage") \
        .setUrl(["JavaBoardSmileForTheCamera.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/JavaBoardSmileForTheCamera.jpg"]) \
       ) \
       .setTextureTransform(TextureTransform() \
        .setDEF("TextureTransformNode") \
       ) \
      ) \
     ) \
# author fun: replace destination toField from 'set_scale' with new value of 'set_translation' or 'set_center' 
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("InterpolateTTscale") \
      .setToField("set_scale") \
      .setToNode("TextureTransformNode") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation//PositionInterpolator2dExample_RoundTrip.x3d")
