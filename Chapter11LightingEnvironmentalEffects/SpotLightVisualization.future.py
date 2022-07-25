from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("SpotLightVisualization.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Create outline geometry to show SpotLight coverage. Author TODO: use the X3D-Edit SpotLight editor to modify and re-visualize the first SpotLight.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("14 November 2009") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("14 November 2009") \
     .setName("generated") \
    ) \
    .addMeta(meta() \
     .setContent("23 February 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("SpotLightVisualization.png") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/SpotLightVisualization.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("../Chapter09EventUtilitiesScripting/CircleLines.java") \
     .setName("generator") \
    ) \
    .addMeta(meta() \
     .setContent("../license.html") \
     .setName("license") \
    ) \
   ) \
   .setScene(Scene() \
    .addChild(NavigationInfo() \
     .setHeadlight(False) \
    ) \
    .addChild(Background() \
     .setSkyColor([0.05,0.1,0.2]) \
    ) \
    .addChild(Viewpoint() \
     .setCenterOfRotation([0,0,-5]) \
     .setDescription("Two examples of a single SpotLight") \
     .setPosition([0,0,15]) \
    ) \
    .addChild(Viewpoint() \
     .setCenterOfRotation([0,0,-5]) \
     .setDescription("View from above") \
     .setOrientation([1,0,0,-0.588]) \
     .setPosition([0,10,10]) \
    ) \
    .addChild(Transform() \
     .setDEF("RightSide") \
     .setTranslation([6,0,0]) \
# Author TODO: use the X3D-Edit SpotLight editor to modify and re-visualize the first SpotLight 
     .addChild(SpotLight(radius = 10) \
      .setBeamWidth(0.1745) \
      .setColor([0.8,0.8,0.2]) \
      .setCutOffAngle(0.7837) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("View from behind DirectionalLight") \
      .setOrientation([-0.8932,0.4488,0.0279,0.1389]) \
      .setPosition([0.5,1,8]) \
     ) \
     .addChild(Inline() \
      .setDEF("CoordinateAxes") \
      .setUrl(["../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d","../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.wrl"]) \
     ) \
     .addChild(Transform() \
      .setDEF("PolygonalWall") \
      .setRotation([1,0,0,1.57079]) \
      .setTranslation([-5,5,-5]) \
      .addChild(Shape() \
       .setGeometry(ElevationGrid(height = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0], solid = False) \
        .setXDimension(11) \
        .setZDimension(11) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,1,1]) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setDEF("LeftSide") \
     .setTranslation([-6,0,0]) \
# Watch out for global scope bugs if you copy a light by DEF/USE 
     .addChild(SpotLight(radius = 10) \
      .setBeamWidth(0.1745) \
      .setColor([0.8,0.8,0.2]) \
      .setCutOffAngle(0.7837) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("View from behind SpotLight") \
      .setOrientation([-0.8932,0.4488,0.0279,0.1389]) \
      .setPosition([0.5,1,8]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Side view of SpotLight outline") \
      .setOrientation([0,1,0,1.57079]) \
      .setPosition([12,0,-2.5]) \
     ) \
     .addChild(Transform() \
      .setDEF("BeamLines") \
      .setScale([1,1,5]) \
# CircleLines made out of 24 line segments, turned into a cone with 8 side lines 
      .addChild(Shape() \
       .setGeometry(IndexedLineSet(coordIndex = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,-1,25,0,-1,25,3,-1,25,6,-1,25,9,-1,25,12,-1,25,15,-1,25,18,-1,25,21,-1]) \
        .setCoord(Coordinate() \
         .setPoint([0,1,-1,0.259,0.966,-1,0.5,0.866,-1,0.707,0.707,-1,0.866,0.5,-1,0.966,0.259,-1,1,0,-1,0.966,-0.259,-1,0.866,-0.5,-1,0.707,-0.707,-1,0.5,-0.866,-1,0.259,-0.966,-1,0,-1,-1,-0.259,-0.966,-1,-0.5,-0.866,-1,-0.707,-0.707,-1,-0.866,-0.5,-1,-0.966,-0.259,-1,-1,-0,-1,-0.966,0.259,-1,-0.866,0.5,-1,-0.707,0.707,-1,-0.5,0.866,-1,-0.259,0.966,-1,0,1,-1,0,0,0,0,0,-1]) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setEmissiveColor([0.8,0.8,0.2]) \
        ) \
       ) \
      ) \
      .addChild(Shape() \
       .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
        .setCoord(Coordinate() \
         .setPoint([0,0,0,0,0,-1]) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setEmissiveColor([1,1,1]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("CutOffCone") \
      .setScale([5,5,5]) \
      .addChild(Transform() \
       .setRotation([1,0,0,1.57079]) \
       .setTranslation([0,0,-0.5]) \
       .addChild(Shape() \
        .setGeometry(Cone(bottom = False, height = 1) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDiffuseColor([0,0,0]) \
          .setEmissiveColor([0.4,0.4,0.1]) \
          .setTransparency(0.75) \
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Inline() \
      .setUSE("CoordinateAxes") \
     ) \
     .addChild(Transform() \
      .setUSE("PolygonalWall") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects//SpotLightVisualization_RoundTrip.x3d")
