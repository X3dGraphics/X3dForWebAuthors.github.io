from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("SoundVisualization.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("An example of the Sound node for testing X3D-Edit author-assist visualization") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("15 November 2009") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("2 September 2013") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("SoundVisualization.png") \
     .setName("Image") \
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
     .setContent("Copyright 2009, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/SoundVisualization.x3d") \
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
# Note that navigation mode shifts to WALK when ViewInside is bound, otherwise default is EXAMINE 
    .addChild(Viewpoint() \
     .setDEF("ViewOutside") \
     .setDescription("outside") \
     .setPosition([0,8,40]) \
    ) \
    .addChild(NavigationInfo() \
     .setDEF("NavOutside") \
    ) \
    .addChild(ROUTE() \
     .setFromField("isBound") \
     .setFromNode("ViewOutside") \
     .setToField("set_bind") \
     .setToNode("NavOutside") \
    ) \
    .addChild(Viewpoint() \
     .setDEF("ViewInside") \
     .setDescription("inside") \
     .setPosition([0,1.6,6]) \
    ) \
    .addChild(NavigationInfo() \
     .setDEF("NavInside") \
     .setType(["WALK","ANY"]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("isBound") \
     .setFromNode("ViewInside") \
     .setToField("set_bind") \
     .setToNode("NavInside") \
    ) \
    .addChild(Viewpoint() \
     .setDEF("ViewAbove") \
     .setDescription("above") \
     .setOrientation([1,0,0,-1.57079]) \
     .setPosition([0,40,0]) \
    ) \
    .addChild(Inline() \
     .setDEF("GridXZ_20x20Fixed") \
     .setUrl(["GridXZ_20x20Fixed.x3d","../../../Savage/Tools/Authoring/GridXZ_20x20Fixed.x3d","https://savage.nps.edu/Savage/Tools/Authoring/GridXZ_20x20Fixed.x3d","GridXZ_20x20Fixed.wrl","../../../Savage/Tools/Authoring/GridXZ_20x20Fixed.wrl","https://savage.nps.edu/Savage/Tools/Authoring/GridXZ_20x20Fixed.wrl"]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("isBound") \
     .setFromNode("ViewAbove") \
     .setToField("set_bind") \
     .setToNode("NavOutside") \
    ) \
# Sound node example 
    .addChild(Sound() \
     .setDirection([1,0,1]) \
     .setLocation([-3,1.6,-3]) \
     .setMaxBack(6) \
     .setMinBack(5) \
     .setSource(AudioClip() \
      .setDEF("WaterSounds") \
      .setDescription("Running Water") \
      .setUrl(["aqua.wav","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/aqua.wav"]) \
     ) \
    ) \
# ================== 
# Sound outlines, patterned after http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/SoundAudioClip.x3d 
# Approximate ellipsoidal footprints and envelope using Cylinders and Spheres, respectively 
# Sound direction is x axis, so minimum-attenuation minLength = (minBack + minFront) and minRadius = minLength/2 along x axis 
# and so width, height dimensions ~= maximum-attenuation halfwidth = maxWidth ~= 45 along y, z axes 
# Ellipsoid focus is (0 0 0) but geometric center offset for spheroidal approximation is (-minBack + minRadius) 
    .addChild(Transform() \
     .setRotation([0,1,0,-2.356194490192345]) \
     .setTranslation([-3,1.6,-3]) \
     .addChild(Transform() \
      .setRotation([1,0,0,0.0]) \
# here is local center of sound ellipse, with local X axis pointed along direction vector 
      .addChild(Inline() \
       .setDEF("CoordinateAxes") \
       .setUrl(["../Chapter03Grouping/CoordinateAxes.x3d","../../Savage/Tools/Authoring/CoordinateAxes.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d","../Chapter03Grouping/CoordinateAxes.wrl","../../Savage/Tools/Authoring/CoordinateAxes.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.wrl"]) \
      ) \
      .addChild(Transform() \
       .setScale([6.0,2.23606797749979,2.23606797749979]) \
       .setTranslation([-2,0,0]) \
       .addChild(Collision() \
        .setEnabled(False) \
        .setProxy(Shape() \
         .setGeometry(Cylinder(height = 0.04, radius = 0.5, side = False) \
         ) \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([0.8,0.6,0.4]) \
           .setEmissiveColor([0.8,0.6,0.4]) \
           .setTransparency(0.7) \
          ) \
         ) \
        ) \
        .setProxy(Shape() \
         .setGeometry(Sphere(radius = 0.5) \
         ) \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([0.8,0.6,0.4]) \
           .setEmissiveColor([0.8,0.6,0.4]) \
           .setTransparency(0.7) \
          ) \
         ) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setScale([16.0,7.745966692414834,7.745966692414834]) \
       .setTranslation([2,0,0]) \
       .addChild(Collision() \
        .setEnabled(False) \
        .setProxy(Shape() \
         .setGeometry(Cylinder(height = 0.02, radius = 0.5, side = False) \
         ) \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([0.4,0.3,0.2]) \
           .setEmissiveColor([0.4,0.3,0.2]) \
           .setTransparency(0.85) \
          ) \
         ) \
        ) \
        .setProxy(Shape() \
         .setGeometry(Sphere(radius = 0.5) \
         ) \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([0.4,0.3,0.2]) \
           .setEmissiveColor([0.4,0.3,0.2]) \
           .setTransparency(0.85) \
          ) \
         ) \
        ) \
       ) \
      ) \
     ) \
    ) \
# ================== 
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound//SoundVisualization_RoundTrip.x3d")
