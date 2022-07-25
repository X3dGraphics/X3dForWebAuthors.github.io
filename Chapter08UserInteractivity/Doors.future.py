from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interactive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("Doors.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Two doors activated by different fields from a TouchSensor node.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("6 June 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
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
     .setContent("Copyright 2006, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/Doors.x3d") \
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
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(NavigationInfo() \
     .setType(["WALK","ANY"]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Initial default") \
     .setPosition([0,1.4,10]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book View") \
     .setPosition([0,1.4,4.5]) \
    ) \
    .addChild(Transform() \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([.6,.2,0]) \
        .setShininess(0) \
       ) \
       .setTexture(ImageTexture() \
        .setUrl(["brick_3.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/brick_3.jpg","http://www.dei.isep.ipp.pt/~losa/public/cg/UniversalMedia/textures/urban/brick_3.jpg"]) \
       ) \
      ) \
      .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,3,-1,0,3,8,11,-1,4,5,6,7,-1,8,9,10,11,-1,12,15,14,13,-1,12,23,20,15,-1,16,19,18,17,-1,20,23,22,21,-1,0,1,13,12,-1,2,14,15,3,-1,4,16,17,5,-1,7,6,18,19,-1,8,20,21,9,-1,11,10,22,23,-1,0,11,23,12,-1,1,13,14,2,-1,3,15,16,4,-1,7,19,20,8,-1,5,17,18,6,-1,9,21,22,10,-1]) \
       .setDEF("Wall") \
       .setCoord(Coordinate() \
        .setPoint([-2,3,0,-2,0,0,-1.5,0,0,-1.5,2.25,0,-.5,2.25,0,-.5,0,0,.5,0,0,.5,2.25,0,1.5,2.25,0,1.5,0,0,2,0,0,2,3,0,-2,3,-.1,-2,0,-.1,-1.5,0,-.1,-1.5,2.25,-.1,-.5,2.25,-.1,-.5,0,-.1,.5,0,-.1,.5,2.25,-.1,1.5,2.25,-.1,1.5,0,-.1,2,0,-.1,2,3,-.1]) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("DoorLeftTransform") \
     .setCenter([-.5,0,0]) \
     .setTranslation([-1,1.125,-.05]) \
     .addChild(Group() \
      .setDEF("Door") \
      .addChild(Shape() \
       .setDEF("DoorShape") \
       .setAppearance(Appearance() \
        .setDEF("DoorApp") \
        .setMaterial(Material() \
         .setDEF("DoorMat") \
         .setDiffuseColor([0,.7,0]) \
        ) \
        .setTexture(ImageTexture() \
         .setDEF("DoorImage") \
         .setUrl(["door_1.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/door_1.jpg","http://www.dei.isep.ipp.pt/~losa/public/cg/UniversalMedia/textures/urban/door_1.jpg"]) \
        ) \
       ) \
       .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,3,-1,4,7,6,5,-1,0,1,5,4,-1,1,5,6,2,-1,2,6,7,3,-1,3,7,6,4,-1]) \
        .setDEF("DoorGeometry") \
        .setCoord(Coordinate() \
         .setPoint([-.5,-1.125,.05,.5,-1.125,.05,.5,1.125,.05,-.5,1.125,.05,-.5,-1.125,-.05,.5,-1.125,-.05,.5,1.125,-.05,-.5,1.125,-.05]) \
        ) \
        .setTexCoord(TextureCoordinate() \
         .setPoint([0,0,1,0,1,1,0,1,0,0,1,0,1,1,0,1,1,0,.95,0,1,.95,.95,.95,1,0,.95,0,1,.95,.95,.95,1,0,.95,0,1,.95,.95,.95,1,0,.95,0,1,.95,.95,.95]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(OrientationInterpolator() \
      .setDEF("MoverLeft") \
      .setKey([0,1]) \
      .setKeyValue([0,1,0,0,0,1,0,-1]) \
     ) \
     .addChild(TimeSensor() \
      .setDEF("TimerLeft") \
      .setCycleInterval(3) \
     ) \
     .addChild(TimeTrigger() \
      .setDEF("TriggerLeft") \
     ) \
     .addChild(BooleanFilter() \
      .setDEF("FilterLeft") \
     ) \
     .addChild(TouchSensor() \
      .setDEF("TouchLeft") \
      .setDescription("touch to activate") \
     ) \
     .addChild(ROUTE() \
      .setFromField("isActive") \
      .setFromNode("TouchLeft") \
      .setToField("set_boolean") \
      .setToNode("FilterLeft") \
     ) \
     .addChild(ROUTE() \
      .setFromField("inputTrue") \
      .setFromNode("FilterLeft") \
      .setToField("set_boolean") \
      .setToNode("TriggerLeft") \
     ) \
     .addChild(ROUTE() \
      .setFromField("triggerTime") \
      .setFromNode("TriggerLeft") \
      .setToField("startTime") \
      .setToNode("TimerLeft") \
     ) \
     .addChild(ROUTE() \
      .setFromField("fraction_changed") \
      .setFromNode("TimerLeft") \
      .setToField("set_fraction") \
      .setToNode("MoverLeft") \
     ) \
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("MoverLeft") \
      .setToField("rotation") \
      .setToNode("DoorLeftTransform") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("DoorRight") \
     .setCenter([-.5,0,0]) \
     .setTranslation([1,1.125,-.05]) \
     .addChild(Group() \
      .setUSE("Door") \
     ) \
     .addChild(OrientationInterpolator() \
      .setDEF("MoverRight") \
      .setKey([0,1]) \
      .setKeyValue([0,1,0,0,0,1,0,-1]) \
     ) \
     .addChild(TimeSensor() \
      .setDEF("TimerRight") \
      .setCycleInterval(3) \
     ) \
     .addChild(TouchSensor() \
      .setDEF("TouchRight") \
      .setDescription("touch to activate") \
     ) \
     .addChild(ROUTE() \
      .setFromField("touchTime") \
      .setFromNode("TouchRight") \
      .setToField("startTime") \
      .setToNode("TimerRight") \
     ) \
     .addChild(ROUTE() \
      .setFromField("fraction_changed") \
      .setFromNode("TimerRight") \
      .setToField("set_fraction") \
      .setToNode("MoverRight") \
     ) \
     .addChild(ROUTE() \
      .setFromField("value_changed") \
      .setFromNode("MoverRight") \
      .setToField("rotation") \
      .setToNode("DoorRight") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter08UserInteractivity//Doors_RoundTrip.x3d")