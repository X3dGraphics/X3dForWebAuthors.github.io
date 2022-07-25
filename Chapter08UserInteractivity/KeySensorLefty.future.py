from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("KeySensorLefty.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("A KeySensor is used to change relative Viewpoints looking at the shark Lefty, while a SphereSensor can also rotate Lefty in place.") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/KeySensorLefty.x3d") \
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
    .addChild(Group() \
     .setDEF("LeftyViewpointsUnrotated") \
     .addChild(Viewpoint() \
      .setDEF("View1") \
      .setDescription("Lefty from the Right") \
     ) \
     .addChild(Viewpoint() \
      .setDEF("View2") \
      .setDescription("Lefty from the Front") \
      .setOrientation([0,1,0,1.57]) \
      .setPosition([10,0,0]) \
     ) \
     .addChild(Viewpoint() \
      .setDEF("View3") \
      .setDescription("Lefty from the Left") \
      .setOrientation([0,1,0,3.14]) \
      .setPosition([0,0,-10]) \
     ) \
     .addChild(Viewpoint() \
      .setDEF("View4") \
      .setDescription("Lefty from Behind") \
      .setOrientation([0,1,0,-1.57]) \
      .setPosition([-10,0,0]) \
     ) \
     .addChild(Viewpoint() \
      .setDEF("View5") \
      .setDescription("Lefty from the Top") \
      .setOrientation([1,0,0,-1.57]) \
      .setPosition([0,10,0]) \
     ) \
     .addChild(Viewpoint() \
      .setDEF("View6") \
      .setDescription("Lefty from the Bottom") \
      .setOrientation([1,0,0,1.57]) \
      .setPosition([0,-10,0]) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([-2,2,0]) \
     .addChild(Billboard() \
      .setAxisOfRotation([0,0,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,0,0]) \
        ) \
       ) \
       .setGeometry(Text() \
        .setString(["Press 'n' key for next Viewpoint,","press 'p' key ppnnfor previous Viewpoint."]) \
        .setFontStyle(FontStyle(family = ["SANS"], justify = ["BEGIN","BEGIN"], size = 0.5) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("OrientationControl") \
     .setTranslation([2,-2,3]) \
     .addChild(SphereSensor() \
      .setDEF("Rotator") \
      .setDescription("Select and drag to rotate") \
     ) \
     .addChild(Transform() \
      .setDEF("OrientationDisplay") \
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
    .addChild(Transform() \
     .setScale([3,3,3]) \
     .addChild(Transform() \
      .setDEF("ReOrient") \
      .addChild(Inline() \
       .setUrl(["../KelpForestExhibit/SharkLefty.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLefty.x3d","../KelpForestExhibit/SharkLefty.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLefty.wrl"]) \
      ) \
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("rotation_changed") \
     .setFromNode("Rotator") \
     .setToField("rotation") \
     .setToNode("OrientationDisplay") \
    ) \
    .addChild(ROUTE() \
     .setFromField("rotation_changed") \
     .setFromNode("Rotator") \
     .setToField("rotation") \
     .setToNode("ReOrient") \
    ) \
    .addChild(KeySensor() \
     .setDEF("KeyDetector") \
     .setEnabled(True) \
    ) \
    .addChild(Script() \
     .setDEF("KeyHandler") \
     .setUrl(["KeySensorLeftyScript.js","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/KeySensorLeftyScript.js"]) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("keyPress") \
      .setType("SFString") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("viewpointIndex") \
      .setType("SFInt32") \
      .setValue("1") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("bind_View1") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("bind_View2") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("bind_View3") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("bind_View4") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("bind_View5") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("outputOnly") \
      .setName("bind_View6") \
      .setType("SFBool") \
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("keyPress") \
     .setFromNode("KeyDetector") \
     .setToField("keyPress") \
     .setToNode("KeyHandler") \
    ) \
    .addChild(ROUTE() \
     .setFromField("bind_View1") \
     .setFromNode("KeyHandler") \
     .setToField("set_bind") \
     .setToNode("View1") \
    ) \
    .addChild(ROUTE() \
     .setFromField("bind_View2") \
     .setFromNode("KeyHandler") \
     .setToField("set_bind") \
     .setToNode("View2") \
    ) \
    .addChild(ROUTE() \
     .setFromField("bind_View3") \
     .setFromNode("KeyHandler") \
     .setToField("set_bind") \
     .setToNode("View3") \
    ) \
    .addChild(ROUTE() \
     .setFromField("bind_View4") \
     .setFromNode("KeyHandler") \
     .setToField("set_bind") \
     .setToNode("View4") \
    ) \
    .addChild(ROUTE() \
     .setFromField("bind_View5") \
     .setFromNode("KeyHandler") \
     .setToField("set_bind") \
     .setToNode("View5") \
    ) \
    .addChild(ROUTE() \
     .setFromField("bind_View6") \
     .setFromNode("KeyHandler") \
     .setToField("set_bind") \
     .setToNode("View6") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter08UserInteractivity//KeySensorLefty_RoundTrip.x3d")
