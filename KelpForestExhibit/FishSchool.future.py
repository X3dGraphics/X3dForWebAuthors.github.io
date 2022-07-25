from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("FishSchool.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Fish Schooling Demo") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Stewart Liles, Sean Hynes") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("25 September 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("11 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute.") \
     .setName("accessRights") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/FishSchool.x3d") \
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
    .addChild(NavigationInfo() \
     .setSpeed(5.0) \
     .setType(["EXAMINE"]) \
     .setVisibilityLimit(250.0) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Close to School - FS") \
     .setPosition([0.0,1.0,75.0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Nose on Glass - FS") \
     .setFieldOfView(1.0) \
     .setPosition([0.0,1.0,30.0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Fish Feeding - FS") \
     .setFieldOfView(1.0) \
     .setOrientation([1.0,0.0,0.0,-1.57]) \
     .setPosition([0.0,40.0,0.0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Left Side - FS") \
     .setFieldOfView(1.0) \
     .setOrientation([0.0,1.0,0.0,-1.57]) \
     .setPosition([-40.0,0.0,0.0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Right Side - FS") \
     .setFieldOfView(1.0) \
     .setOrientation([0.0,1.0,0.0,1.57]) \
     .setPosition([40.0,0.0,0.0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Middle Looking Out - FS") \
     .setJump(False) \
     .setOrientation([0.0,1.0,0.0,2.2]) \
     .setPosition([0.0,0.0,0.0]) \
    ) \
    .addChild(SpotLight() \
     .setAmbientIntensity(1.0) \
     .setDirection([0.0,-1.0,0.0]) \
     .setLocation([0.0,50.0,0.0]) \
    ) \
    .addChild(Sound() \
     .setLocation([0,0.1,0]) \
     .setMaxBack(50) \
     .setMaxFront(50) \
     .setMinBack(50) \
     .setMinFront(50) \
     .setSource(AudioClip() \
      .setDescription("Sound for Fish") \
      .setLoop(True) \
      .setUrl(["Sound2.wav","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Sound2.wav"]) \
     ) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("GlobalClock") \
     .setLoop(True) \
    ) \
    .addChild(Shape() \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setEmissiveColor([1.0,1.0,1.0]) \
      ) \
     ) \
     .setGeometry(IndexedLineSet(coordIndex = [0,1,2,3,0,-1,4,5,6,7,4,-1,0,4,-1,1,5,-1,2,6,-1,3,7]) \
      .setCoord(Coordinate() \
       .setPoint([-30.0,30.0,30.0,30.0,30.0,30.0,30.0,30.0,-30.0,-30.0,30.0,-30.0,-30.0,-30.0,30.0,30.0,-30.0,30.0,30.0,-30.0,-30.0,-30.0,-30.0,-30.0]) \
      ) \
     ) \
    ) \
    .addChild(Fog() \
     .setColor([0.1,0.3,0.1]) \
     .setVisibilityRange(70.0) \
    ) \
    .addChild(Transform() \
     .setDEF("Fish0") \
     .setTranslation([-5.0,0.0,0.0]) \
     .addChild(Viewpoint() \
      .setDescription("Fish 0 view") \
      .setFieldOfView(1.8) \
      .setPosition([0.0,1.0,-0.5]) \
     ) \
     .addChild(Inline() \
      .setDEF("FishIN") \
      .setUrl(["Fish.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Fish.x3d","Fish.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Fish.wrl"]) \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("Fish1") \
     .setTranslation([-4.0,0.0,0.0]) \
     .addChild(Viewpoint() \
      .setDescription("Fish 1 view") \
      .setFieldOfView(1.8) \
      .setPosition([0.0,1.0,-0.5]) \
     ) \
     .addChild(Inline() \
      .setUSE("FishIN") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("Fish2") \
     .setTranslation([-3.0,0.0,0.0]) \
     .addChild(Viewpoint() \
      .setDescription("Fish 2 view") \
      .setFieldOfView(1.8) \
      .setPosition([0.0,1.0,-0.5]) \
     ) \
     .addChild(Inline() \
      .setUSE("FishIN") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("Fish3") \
     .setTranslation([-2.0,0.0,0.0]) \
     .addChild(Viewpoint() \
      .setDescription("Fish 3 view") \
      .setFieldOfView(1.8) \
      .setPosition([0.0,1.0,-0.5]) \
     ) \
     .addChild(Inline() \
      .setUSE("FishIN") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("Fish4") \
     .setTranslation([-1.0,0.0,0.0]) \
     .addChild(Viewpoint() \
      .setDescription("Fish 4 view") \
      .setFieldOfView(1.8) \
      .setPosition([0.0,1.0,-0.5]) \
     ) \
     .addChild(Inline() \
      .setUSE("FishIN") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("Fish5") \
     .addChild(Viewpoint() \
      .setDescription("Fish 5 view") \
      .setFieldOfView(1.8) \
      .setPosition([0.0,1.0,-0.5]) \
     ) \
     .addChild(Inline() \
      .setUSE("FishIN") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("Fish6") \
     .setTranslation([1.0,0.0,0.0]) \
     .addChild(Viewpoint() \
      .setDescription("Fish 6 view") \
      .setFieldOfView(1.8) \
      .setPosition([0.0,1.0,-0.5]) \
     ) \
     .addChild(Inline() \
      .setUSE("FishIN") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("Fish7") \
     .setTranslation([2.0,0.0,0.0]) \
     .addChild(Viewpoint() \
      .setDescription("Fish 7 view") \
      .setFieldOfView(1.8) \
      .setPosition([0.0,1.0,-0.5]) \
     ) \
     .addChild(Inline() \
      .setUSE("FishIN") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("Fish8") \
     .setTranslation([3.0,0.0,0.0]) \
     .addChild(Viewpoint() \
      .setDescription("Fish 8 view") \
      .setFieldOfView(1.8) \
      .setPosition([0.0,1.0,-0.5]) \
     ) \
     .addChild(Inline() \
      .setUSE("FishIN") \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("Fish9") \
     .setTranslation([4.0,0.0,0.0]) \
     .addChild(Viewpoint() \
      .setDescription("Fish 9 view") \
      .setFieldOfView(1.8) \
      .setPosition([0.0,1.0,-0.5]) \
     ) \
     .addChild(Inline() \
      .setUSE("FishIN") \
     ) \
    ) \
# Warning: VRML97-style scripting, not X3D Scene Authoring Interface (SAI) 
    .addChild(Script(directOutput = True, mustEvaluate = True) \
     .setDEF("BoidScript") \
     .setUrl(["FishSchoolCode/Demo.class","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/FishSchoolCode/Demo.class"]) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("GlobalTick") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("B9") \
      .setType("SFNode") \
      .addChild(Transform() \
       .setUSE("Fish9") \
      ) \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("B8") \
      .setType("SFNode") \
      .addChild(Transform() \
       .setUSE("Fish8") \
      ) \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("B7") \
      .setType("SFNode") \
      .addChild(Transform() \
       .setUSE("Fish7") \
      ) \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("B6") \
      .setType("SFNode") \
      .addChild(Transform() \
       .setUSE("Fish6") \
      ) \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("B5") \
      .setType("SFNode") \
      .addChild(Transform() \
       .setUSE("Fish5") \
      ) \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("B4") \
      .setType("SFNode") \
      .addChild(Transform() \
       .setUSE("Fish4") \
      ) \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("B3") \
      .setType("SFNode") \
      .addChild(Transform() \
       .setUSE("Fish3") \
      ) \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("B2") \
      .setType("SFNode") \
      .addChild(Transform() \
       .setUSE("Fish2") \
      ) \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("B1") \
      .setType("SFNode") \
      .addChild(Transform() \
       .setUSE("Fish1") \
      ) \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("B0") \
      .setType("SFNode") \
      .addChild(Transform() \
       .setUSE("Fish0") \
      ) \
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("GlobalClock") \
     .setToField("GlobalTick") \
     .setToNode("BoidScript") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//FishSchool_RoundTrip.x3d")