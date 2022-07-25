from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("SoundAudioClip.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("An example of the Sound and AudioClip node showing the effect of the various volume regions") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("1 May 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("7 November 2013") \
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
     .setContent("Don Brutzman") \
     .setName("creator") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/SoundAudioClip.x3d") \
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
    .addChild(Viewpoint() \
     .setDescription("Sound spheroid approximating ellipsoid volume") \
     .setOrientation([1,0,0,-0.2]) \
     .setPosition([0,40,200]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("100m distant") \
     .setOrientation([1,0,0,-0.2]) \
     .setPosition([0,20,100]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("50m distant") \
     .setOrientation([1,0,0,-0.2]) \
     .setPosition([0,10,50]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("25m distant") \
     .setOrientation([1,0,0,-0.2]) \
     .setPosition([0,5,25]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("10m distant") \
     .setOrientation([1,0,0,-0.2]) \
     .setPosition([0,2,10]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("center") \
     .setOrientation([0,1,0,-1.57]) \
     .setPosition([0,2,0]) \
    ) \
    .addChild(NavigationInfo() \
     .setSpeed(10) \
     .setType(["WALK","ANY"]) \
    ) \
# Sound location y-value is 1.6 in order to match typical avatar height (in meters) 
    .addChild(Sound() \
     .setDEF("Audible") \
     .setDirection([1,0,0]) \
     .setLocation([0,1.6,0]) \
     .setMaxBack(20) \
     .setMaxFront(100) \
     .setMinBack(10) \
     .setMinFront(10) \
     .setPriority(1) \
     .setSource(AudioClip() \
      .setDEF("WaterSounds") \
      .setDescription("Running Water") \
      .setLoop(True) \
      .setUrl(["aqua.wav","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/aqua.wav"]) \
     ) \
    ) \
# minWidth = sqrt (minBack * minFront) = 10 
# maxWidth = sqrt (maxBack * maxFront) = 45 
# Approximate ellipsoidal footprints and envelope using Cylinders and Spheres, respectively 
# Minimum attenuation parameters 10, 10, 10 produce a Cylinder and Sphere with uniform scale 
    .addChild(Transform() \
     .setDEF("minShapes") \
     .setScale([10,10,10]) \
     .addChild(Shape() \
      .setGeometry(Cylinder(height = 0.05) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDEF("MinFootprintMaterial") \
        .setDiffuseColor([0.8,0,0]) \
       ) \
      ) \
     ) \
     .addChild(Collision() \
      .setEnabled(False) \
      .setProxy(Shape() \
       .setGeometry(Sphere() \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDEF("MinSpheroidMaterial") \
         .setDiffuseColor([0.8,0,0]) \
         .setTransparency(0.5) \
        ) \
       ) \
      ) \
     ) \
    ) \
# Maximum attenuation parameters 20, 100, 45 produce a Cylinder and Sphere with non-uniform scale 
# Sound direction is x axis, so maximum-attenuation length = (100 + 20) = 120 and radius = 120 / 2 = 60 along x axis 
# and so width, height dimensions ~= maximum-attenuation halfwidth = maxWidth ~= 45 along y, z axes 
# Ellipsoid focus is (0 0 0) but geometric center of spheroidal approximation is (-maxBack + x radius) = (-20 + 60) = 40 along x axis 
    .addChild(Transform() \
     .setDEF("maxShapes") \
     .setScale([60,45,45]) \
     .setTranslation([40,0,0]) \
     .addChild(Shape() \
      .setGeometry(Cylinder(height = 0.002) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDEF("MaxFootprintMaterial") \
        .setDiffuseColor([1,0.894118,0.341176]) \
       ) \
      ) \
     ) \
     .addChild(Collision() \
      .setEnabled(False) \
      .setProxy(Shape() \
       .setGeometry(Sphere() \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDEF("MaxSpheroidMaterial") \
         .setDiffuseColor([1,0.5,0]) \
         .setTransparency(0.75) \
        ) \
       ) \
      ) \
     ) \
    ) \
# Author-assist prototype from Savage X3D model archive 
    .addChild(ExternProtoDeclare() \
     .setName("GridXZ") \
     .setUrl(["../../Savage/Tools/Authoring/GridXZPrototype.x3d#GridXZ","https://savage.nps.edu/Savage/Tools/Authoring/GridXZPrototype.x3d#GridXZ","../../Savage/Tools/Authoring/GridXZPrototype.wrl#GridXZ","https://savage.nps.edu/Savage/Tools/Authoring/GridXZPrototype.wrl#GridXZ"]) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setName("description") \
      .setType("SFString") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("labelColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("default unscaled size: 10m by 10m") \
      .setName("scale") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("label location offset (in meters) to improve readability") \
      .setName("labelsOffset") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("originLabel") \
      .setType("MFString") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("-Z axis") \
      .setName("WestLabel") \
      .setType("MFString") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("NorthWestLabel") \
      .setType("MFString") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("+X axis") \
      .setName("NorthLabel") \
      .setType("MFString") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("NorthEastLabel") \
      .setType("MFString") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("+Z axis") \
      .setName("EastLabel") \
      .setType("MFString") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("SouthEastLabel") \
      .setType("MFString") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("-X axis") \
      .setName("SouthLabel") \
      .setType("MFString") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("SouthWestLabel") \
      .setType("MFString") \
     ) \
    ) \
# default values scaled up by factor of 10 in this instance 
    .addChild(ProtoInstance() \
     .setName("GridXZ") \
     .addFieldValue(fieldValue() \
      .setName("description") \
      .setValue("GridXZ") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("labelColor") \
      .setValue("1 1 1") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("scale") \
      .setValue("10 10 10") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("labelsOffset") \
      .setValue("0 -0.5 0") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("originLabel") \
      .setValue("\"origin\" \"0 0 0\"") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("NorthLabel") \
      .setValue("\"North\" \"-Z\"") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("NorthEastLabel") \
      .setValue("\"100 0 -100\"") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("EastLabel") \
      .setValue("\"East\" \"+X\"") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("SouthEastLabel") \
      .setValue("\"100 0 100\"") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("SouthLabel") \
      .setValue("\"South\" \"+Z\"") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("SouthWestLabel") \
      .setValue("\"-100 0 100\"") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("WestLabel") \
      .setValue("\"West\" \"-X\"") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("NorthWestLabel") \
      .setValue("\"-100 0 -100\"") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound//SoundAudioClip_RoundTrip.x3d")
