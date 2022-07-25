from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("SphereSensorLefty.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Using a separate SphereSensor, Lefty shark can be oriented in any direction by remote control. Navigation locked so that no other scene rotation is possible.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("10 June 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("2 April 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Xj3D not supporting SphereSensor autoOffset field correctly") \
     .setName("warning") \
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
     .setContent("Copyright 2006, Leonard Daly and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/SphereSensorLefty.x3d") \
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
     .setDEF("LockUserSceneRotation") \
     .setType(["NONE"]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book View") \
     .setOrientation([0,-1,0,0.05]) \
     .setPosition([-0.06,-0.29,8.78]) \
    ) \
    .addChild(Transform() \
     .setDEF("UserInterfaceTranslation") \
     .setTranslation([2,-2,3]) \
# Note that splitting the single Transform into two, and embedding SphereSensor here, shields it from affecting other nodes in scene 
     .addChild(SphereSensor() \
      .setDEF("Rotator") \
      .setDescription("drag sphere to rotate Lefty") \
     ) \
# this nested Transform allows rotation about the center of the local coordinate frame 
     .addChild(Transform() \
      .setDEF("UserInterfaceRotation") \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,1]) \
        ) \
       ) \
       .setGeometry(Sphere(radius = .5) \
       ) \
      ) \
     ) \
    ) \
# note that the shark is translated to a different coordinate reference frame, so the SphereSensor is like a remote control 
    .addChild(Transform() \
     .setDEF("SharkRotation") \
     .setTranslation([0,0,7]) \
     .addChild(Inline() \
      .setUrl(["../KelpForestExhibit/SharkLefty.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLefty.x3d","../KelpForestExhibit/SharkLefty.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLefty.wrl"]) \
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("rotation_changed") \
     .setFromNode("Rotator") \
     .setToField("rotation") \
     .setToNode("SharkRotation") \
    ) \
# note that the shark will rotate without this ROUTE but that user interaction feels smoother and more natural 
    .addChild(ROUTE() \
     .setFromField("rotation_changed") \
     .setFromNode("Rotator") \
     .setToField("rotation") \
     .setToNode("UserInterfaceRotation") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter08UserInteractivity//SphereSensorLefty_RoundTrip.x3d")
