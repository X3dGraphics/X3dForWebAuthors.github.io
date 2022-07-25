from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addComponent(component() \
     .setLevel(3) \
     .setName("Navigation") \
    ) \
    .addMeta(meta() \
     .setContent("Sardine.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("One Sardine, three levels of detail.") \
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
     .setContent("13 January 2014") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Sardine.x3d") \
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
    .addChild(LOD() \
     .setDEF("Sardines") \
     .setRange([15,30,60]) \
# Three levels of detail, then disappears. 
     .addChild(Group() \
      .setDEF("Near") \
# High resolution sardine. 
      .addChild(Transform() \
       .setScale([.25,.1,.25]) \
       .addChild(Shape() \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDiffuseColor([.61,.61,.61]) \
          .setEmissiveColor([.5,.5,.5]) \
          .setShininess(.8) \
          .setSpecularColor([.76,.76,.76]) \
         ) \
        ) \
        .setGeometry(IndexedFaceSet(ccw = False, coordIndex = [0,2,1,-1,0,3,2,-1,0,4,3,-1,0,5,4,-1,0,1,8,-1,0,8,7,-1,0,7,6,-1,0,6,5,-1,1,2,10,9,-1,2,3,11,10,-1,3,4,12,11,-1,4,5,13,12,-1,1,9,16,8,-1,8,16,15,7,-1,7,15,14,6,-1,6,14,13,5,-1,9,10,18,17,-1,10,11,19,18,-1,11,12,20,19,-1,12,13,21,20,-1,9,17,24,16,-1,16,24,23,15,-1,15,23,22,14,-1,14,22,21,13,-1,17,18,26,25,-1,18,19,27,26,-1,19,20,28,27,-1,20,21,29,28,-1,17,25,32,24,-1,24,32,31,23,-1,23,31,30,22,-1,22,30,29,21,-1,25,26,34,33,-1,26,27,35,34,-1,27,28,36,35,-1,28,29,37,36,-1,25,33,40,32,-1,32,40,39,31,-1,31,39,38,30,-1,30,38,37,29,-1,33,34,41,-1,34,35,41,-1,35,42,41,-1,35,43,42,-1,36,43,35,-1,36,37,43,-1,33,41,40,-1,40,41,39,-1,39,41,42,-1,39,42,43,-1,39,43,37,-1,38,43,37,-1,50,49,48,47,46,45,44,-1,57,56,55,54,53,52,51,-1,44,45,52,51,-1,45,46,53,52,-1,46,47,54,53,-1,47,48,55,54,-1,48,49,56,55,-1,49,50,57,56,-1], creaseAngle = 3.14, solid = False) \
         .setDEF("SardineIndex") \
         .setCoord(Coordinate() \
          .setDEF("Sardine") \
          .setPoint([0,0,-1.5,0,.5,-1,-.12,.25,-1,-.25,0,-1,-.12,-.25,-1,0,-.5,-1,.12,-.25,-1,.25,0,-1,.12,.25,-1,0,1,0,-.25,.5,0,-.5,0,0,-.25,-.5,0,0,-1,0,.25,-.5,0,.5,0,0,.25,.5,0,0,.88,.9,-.19,.44,.9,-.37,0,.9,-.19,-.44,.9,0,-.88,.9,.19,-.44,.9,.37,0,.9,.19,.44,.9,0,.75,1.75,-.12,.35,1.75,-.25,0,1.75,-.12,-.35,1.75,0,-.75,1.75,.12,-.35,1.75,.25,0,1.75,.12,.35,1.75,0,.5,2.5,-.05,.25,2.5,-.1,0,2.5,-.05,-.25,2.5,0,-.5,2.5,.05,-.25,2.5,.1,0,2.5,.05,.25,2.5,1,1.25,3.25,0,0,3,0,-1.25,3.25,.01,-.7,-1.7,.01,-.75,-2.3,.01,-.74,-2.325,.01,-.72,-2.35,.01,-.7,-2.36,.01,-.67,-2.35,.01,-.54,-2.29,-.01,-.7,-1.7,-.01,-.75,-2.3,-.01,-.74,-2.325,-.01,-.72,-2.35,-.01,-.7,-2.36,-.01,-.67,-2.35,-.01,-.54,-2.29]) \
         ) \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("LeftEye") \
        .setTranslation([-.25,.2,-.55]) \
        .addChild(Shape() \
         .setDEF("Eye") \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([.1,.1,.1]) \
           .setShininess(.5) \
          ) \
         ) \
         .setGeometry(Sphere(radius = .1) \
         ) \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("RightEye") \
        .setTranslation([.25,.2,-.55]) \
        .addChild(Shape() \
         .setUSE("Eye") \
        ) \
       ) \
       .addChild(Transform() \
        .setDEF("DorsalFin") \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([.61,.61,.61]) \
           .setEmissiveColor([.4,.4,.4]) \
           .setShininess(.7) \
           .setSpecularColor([.75,.75,.75]) \
          ) \
         ) \
         .setGeometry(Extrusion(convex = False, crossSection = [0,.9,.25,0,1.3,.5,0,1.6,.6,0,1.3,.7,0,1.1,.8,0,1,.9,0,.95,1,0,.7,1], solid = False, spine = [.02,0,0,-.02,0,0]) \
          .setOrientation([0,1,0,0,0,1,0,0]) \
          .setScale([1,1,1,1]) \
         ) \
        ) \
       ) \
       .addChild(Transform() \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([.61,.61,.61]) \
           .setEmissiveColor([.4,.4,.4]) \
           .setShininess(.4) \
           .setSpecularColor([.75,.75,.75]) \
          ) \
         ) \
         .setGeometry(IndexedFaceSet(coordIndex = [0,3,2,-1,1,3,0,-1,1,0,2,-1,3,1,2,-1]) \
          .setCoord(Coordinate() \
           .setPoint([.1,-.65,.5,.1,-.7,.5,.1,-.7,.8,.15,-1.1,1.2]) \
          ) \
         ) \
        ) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([.61,.61,.61]) \
           .setEmissiveColor([.4,.4,.4]) \
           .setShininess(.4) \
           .setSpecularColor([.75,.75,.75]) \
          ) \
         ) \
         .setGeometry(IndexedFaceSet(coordIndex = [0,3,2,-1,1,3,0,-1,1,0,2,-1,3,1,2,-1]) \
          .setCoord(Coordinate() \
           .setPoint([-.1,-.65,.5,-.1,-.7,.5,-.1,-.7,.8,-.15,-1.1,1.2]) \
          ) \
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Group() \
      .setDEF("Medium") \
# Medium resolution sardine. 
      .addChild(Transform() \
       .setScale([.25,.1,.25]) \
       .addChild(Shape() \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDiffuseColor([.61,.61,.61]) \
          .setShininess(.9) \
          .setSpecularColor([.76,.76,.76]) \
         ) \
        ) \
        .setGeometry(IndexedFaceSet() \
         .setUSE("SardineIndex") \
        ) \
       ) \
      ) \
     ) \
     .addChild(Group() \
      .setDEF("Far") \
# Low resolution sardine. 
      .addChild(Transform() \
       .setRotation([1,0,0,-1.57]) \
       .setScale([.3,.25,.25]) \
       .addChild(Shape() \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDiffuseColor([.7,.7,.7]) \
         ) \
         .setTexture(ImageTexture() \
          .setUrl(["SardineScalesPatch.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SardineScalesPatch.jpg"]) \
         ) \
        ) \
        .setGeometry(Extrusion(creaseAngle = 1.57, crossSection = [-0.1,1.0,0.1,1,0.5,0.5,0.5,-0.5,0.1,-1,-0.1,-1,-0.5,-0.5,-0.5,0.5,-0.1,1], spine = [0,2.51,0,0,1.80,0,0,0.5,0,0,0,0,0,-0.6,0]) \
         .setScale([0.03,0.03,0.3,0.4,0.1,0.2,0.1,0.15,0.03,0.4]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(WorldInfo() \
      .setInfo(["null"]) \
# Lowest resolution node is nothing. 
     ) \
    ) \
# <Group DEF='TestViewpoints'> <Viewpoint description='Hi Res' orientation='0 1 0 1.57' position='2 0 0'/> <Viewpoint description='Med Res' orientation='0 1 0 1.57' position='15 0 0'/> <Viewpoint description='Low Res' orientation='0 1 0 1.57' position='30 0 0'/> </Group> 
    .addChild(ViewpointGroup(size = [20,20,20]) \
     .setDEF("HideViewpointsWhenDistant") \
     .setDescription("Sardine views up close") \
# Viewpoints around sardine at very close range, one good viewpoint fairly close to sardine, and no viewpoints further away. 
     .addChild(Viewpoint() \
      .setDescription("Closeup view right") \
      .setOrientation([0,1,0,1.57]) \
      .setPosition([2,0,0]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Closeup view right face") \
      .setOrientation([0,1,0,2.355]) \
      .setPosition([2,0,-2]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Closeup view face to face") \
      .setOrientation([0,1,0,3.14]) \
      .setPosition([0,0,-2]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Closeup view left face") \
      .setOrientation([0,1,0,3.825]) \
      .setPosition([-2,0,-2]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Closeup view left") \
      .setOrientation([0,1,0,-1.57]) \
      .setPosition([-2,0,0]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Closeup view left tail") \
      .setOrientation([0,1,0,-0.785]) \
      .setPosition([-2,0,2]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Closeup view tail") \
      .setPosition([0,0,2]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Closeup view right tail") \
      .setOrientation([0,1,0,0.785]) \
      .setPosition([2,0,2]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Closeup view top looking down") \
      .setOrientation([1,0,0,-1.57]) \
      .setPosition([0,2,0]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Closeup view bottom looking up") \
      .setOrientation([1,0,0,1.57]) \
      .setPosition([0,-2,0]) \
     ) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Single viewpoint when fairly close to sardine") \
     .setOrientation([0,1,0,1.57]) \
     .setPosition([10,0,0]) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("Clock") \
     .setCycleInterval(0.5) \
     .setLoop(True) \
    ) \
    .addChild(CoordinateInterpolator() \
     .setDEF("FishWiggle") \
     .setKey([0.0,0.25,0.50,0.75,1.0]) \
     .setKeyValue([0,0,-1.5,0,.5,-1,-.12,.25,-1,-.25,0,-1,-.12,-.25,-1,0,-.5,-1,.12,-.25,-1,.25,0,-1,.12,.25,-1,0,1,0,-.25,.5,0,-.5,0,0,-.25,-.5,0,0,-1,0,.25,-.5,0,.5,0,0,.25,0.5,0,0,.88,.9,-.19,.44,.9,-.37,0,.9,-.19,-.44,.9,0,-.88,.9,.19,-.44,.9,.37,0,.9,.19,.44,.9,0,.75,1.75,-.12,.35,1.75,-.25,0,1.75,-.12,-.35,1.75,0,-.75,1.75,.12,-.35,1.75,.25,0,1.75,.12,.35,1.75,0,.5,2.5,-.05,.25,2.5,-.1,0,2.5,-.05,-.25,2.5,0,-.5,2.5,.05,-.25,2.5,.1,0,2.5,.05,.25,2.5,0,1.25,3.25,0,0,3,0,-1.25,3.25,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,0,-1.5,0,.5,-1,-.12,.25,-1,-.25,0,-1,-.12,-.25,-1,0,-.5,-1,.12,-.25,-1,.25,0,-1,.12,.25,-1,0,1,0,-.25,.5,0,-.5,0,0,-.25,-.5,0,0,-1,0,.25,-.5,0,.5,0,0,.25,0.5,0,0,.88,.9,-.19,.44,.9,-.37,0,.9,-.19,-.44,.9,0,-.88,.9,.19,-.44,.9,.37,0,.9,.19,.44,.9,.2,.75,1.75,.08,.35,1.75,-.05,0,1.75,.08,-.35,1.75,.2,-.75,1.75,.32,-.35,1.75,.45,0,1.75,.32,.35,1.75,.3,.5,2.5,.25,.25,2.5,.15,0,2.5,.25,-.25,2.5,.30,-.5,2.5,.35,-.25,2.5,.4,0,2.5,.35,.25,2.5,.50,1.25,3.25,.50,0,3,.50,-1.25,3.25,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,0,0,-1.5,0,.5,-1,-.12,.25,-1,-.25,0,-1,-.12,-.25,-1,0,-.5,-1,.12,-.25,-1,.25,0,-1,.12,.25,-1,0,1,0,-.25,.5,0,-.5,0,0,-.25,-.5,0,0,-1,0,.25,-.5,0,.5,0,0,.25,0.5,0,0,.88,.9,-.19,.44,.9,-.37,0,.9,-.19,-.44,.9,0,-.88,.9,.19,-.44,.9,.37,0,.9,.19,.44,.9,0,.75,1.75,-.12,.35,1.75,-.25,0,1.75,-.12,-.35,1.75,0,-.75,1.75,.12,-.35,1.75,.25,0,1.75,.12,.35,1.75,0,.5,2.5,-.05,.25,2.5,-.1,0,2.5,-.05,-.25,2.5,0,-.5,2.5,.05,-.25,2.5,.1,0,2.5,.05,.25,2.5,0,1.25,3.25,0,0,3,0,-1.25,3.25,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,0,-1.5,0,.5,-1,-.12,.25,-1,-.25,0,-1,-.12,-.25,-1,0,-.5,-1,.12,-.25,-1,.25,0,-1,.12,.25,-1,0,1,0,-.25,.5,0,-.5,0,0,-.25,-.5,0,0,-1,0,.25,-.5,0,.5,0,0,.25,0.5,0,0,.88,.9,-.19,.44,.9,-.37,0,.9,-.19,-.44,.9,0,-.88,.9,.19,-.44,.9,.37,0,.9,.19,.44,.9,-.20,.75,1.75,-.32,.35,1.75,-.45,0,1.75,-.32,-.35,1.75,-.20,-.75,1.75,-.08,-.35,1.75,.05,0,1.75,-.08,.35,1.75,-.30,.5,2.5,-.35,.25,2.5,-.4,0,2.5,-.35,-.25,2.5,-.30,-.5,2.5,-.25,-.25,2.5,-.2,0,2.5,-.25,.25,2.5,-.50,1.25,3.25,-.50,0,3,-.50,-1.25,3.25,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,0,0,-1.5,0,.5,-1,-.12,.25,-1,-.25,0,-1,-.12,-.25,-1,0,-.5,-1,.12,-.25,-1,.25,0,-1,.12,.25,-1,0,1,0,-.25,.5,0,-.5,0,0,-.25,-.5,0,0,-1,0,.25,-.5,0,.5,0,0,.25,0.5,0,0,.88,.9,-.19,.44,.9,-.37,0,.9,-.19,-.44,.9,0,-.88,.9,.19,-.44,.9,.37,0,.9,.19,.44,.9,0,.75,1.75,-.12,.35,1.75,-.25,0,1.75,-.12,-.35,1.75,0,-.75,1.75,.12,-.35,1.75,.25,0,1.75,.12,.35,1.75,0,.5,2.5,-.05,.25,2.5,-.1,0,2.5,-.05,-.25,2.5,0,-.5,2.5,.05,-.25,2.5,.1,0,2.5,.05,.25,2.5,0,1.25,3.25,0,0,3,0,-1.25,3.25,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5,0,-.5,2.5]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("Clock") \
     .setToField("set_fraction") \
     .setToNode("FishWiggle") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("FishWiggle") \
     .setToField("set_point") \
     .setToNode("Sardine") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//Sardine_RoundTrip.x3d")
