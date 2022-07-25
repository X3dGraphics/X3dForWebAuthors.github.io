from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("Fish.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("One simple Fish with three levels of detail.") \
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
     .setContent("10 January 2014") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Fish.x3d") \
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
    .addChild(Group() \
     .setDEF("Viewpoints") \
     .addChild(Viewpoint() \
      .setDescription("Fish High Resolution") \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Fish Medium Resolution") \
      .setPosition([0,0,35]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Fish Low Resolution") \
      .setPosition([0,0,65]) \
     ) \
     .addChild(Viewpoint() \
      .setDescription("Fish No Resolution") \
      .setPosition([0,0,105]) \
     ) \
    ) \
# Align fish with X axis 
    .addChild(Transform() \
     .setRotation([0,1,0,-1.57]) \
     .addChild(LOD() \
      .setDEF("FishLOD") \
      .setRange([30,60,100]) \
# Three levels of visible detail, then disappears. 
      .addChild(Group() \
       .setDEF("Near") \
# High resolution fish. 
       .addChild(Transform() \
        .setDEF("Fish1") \
        .setScale([0.1,0.1,0.1]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setDEF("FishAppear") \
          .setMaterial(Material() \
           .setDiffuseColor([0.6,0.65,0.7]) \
           .setShininess(0.8) \
          ) \
          .setTexture(ImageTexture() \
           .setDEF("FishJPG") \
           .setUrl(["Fish2Patch.jpg","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Fish2Patch.jpg"]) \
          ) \
         ) \
         .setGeometry(IndexedFaceSet(ccw = False, coordIndex = [0,2,1,-1,0,3,2,-1,0,4,3,-1,0,5,4,-1,0,1,8,-1,0,8,7,-1,0,7,6,-1,0,6,5,-1,1,2,10,9,-1,2,3,11,10,-1,3,4,12,11,-1,4,5,13,12,-1,1,9,16,8,-1,8,16,15,7,-1,7,15,14,6,-1,6,14,13,5,-1,9,10,18,17,-1,10,11,19,18,-1,11,12,20,19,-1,12,13,21,20,-1,9,17,24,16,-1,16,24,23,15,-1,15,23,22,14,-1,14,22,21,13,-1,17,18,26,25,-1,18,19,27,26,-1,19,20,28,27,-1,20,21,29,28,-1,17,25,32,24,-1,24,32,31,23,-1,23,31,30,22,-1,22,30,29,21,-1,25,26,34,33,-1,26,27,35,34,-1,27,28,36,35,-1,28,29,37,36,-1,25,33,40,32,-1,32,40,39,31,-1,31,39,38,30,-1,30,38,37,29,-1,33,34,41,-1,34,35,41,-1,35,42,41,-1,35,43,42,-1,36,43,35,-1,36,37,43,-1,33,41,40,-1,40,41,39,-1,39,41,42,-1,39,42,43,-1,39,43,37,-1,38,43,37,-1], creaseAngle = 3.14, solid = False) \
          .setDEF("FishIndex") \
          .setCoord(Coordinate() \
           .setDEF("Fish") \
           .setPoint([0.0,0.0,-1.5,0.0,0.5,-1.0,-0.12,0.25,-1.0,-0.25,0.0,-1.0,-0.12,-0.25,-1.0,0.0,-0.5,-1.0,0.12,-0.25,-1.0,0.25,0.0,-1.0,0.12,0.25,-1.0,0.0,1.0,0.0,-0.25,0.5,0.0,-0.5,0.0,0.0,-0.25,-0.5,0.0,0.0,-1.0,0.0,0.25,-0.5,0.0,0.5,0.0,0.0,0.25,0.5,0.0,0.0,0.88,0.9,-0.19,0.44,0.9,-0.37,0.0,0.9,-0.19,-0.44,0.9,0.0,-0.88,0.9,0.19,-0.44,0.9,0.37,0.0,0.9,0.19,0.44,0.9,0.0,0.75,1.75,-0.12,0.35,1.75,-0.25,0.0,1.75,-0.12,-0.35,1.75,0.0,-0.75,1.75,0.12,-0.35,1.75,0.25,0.0,1.75,0.12,0.35,1.75,0.0,0.5,2.5,-0.05,0.25,2.5,-0.1,0.0,2.5,-0.05,-0.25,2.5,0.0,-0.5,2.5,0.05,-0.25,2.5,0.1,0.0,2.5,0.05,0.25,2.5,0.0,1.25,3.25,0.0,0.0,3.0,0.0,-1.25,3.25]) \
          ) \
         ) \
        ) \
       ) \
      ) \
      .addChild(Group() \
       .setDEF("Medium") \
# Medium resolution fish. 
       .addChild(Transform() \
        .setDEF("Fish2") \
        .setScale([0.1,0.1,0.1]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setUSE("FishAppear") \
         ) \
         .setGeometry(IndexedFaceSet(ccw = False, coordIndex = [0,2,3,-1,0,3,4,-1,0,4,1,-1,0,1,2,-1,1,4,5,-1,2,1,5,-1,3,5,4,-1,3,2,5,-1,5,7,6,-1,5,6,7,-1]) \
          .setCoord(Coordinate() \
           .setPoint([0.0,0.0,-2.0,0.0,-1.25,0.0,0.5,0.0,0.0,0.0,1.25,0.0,-0.5,0.0,0.0,0.0,0.0,2.25,0.0,1.25,3.0,0.0,-1.25,3.0]) \
          ) \
         ) \
        ) \
       ) \
      ) \
      .addChild(Group() \
       .setDEF("Far") \
# Low resolution fish. 
       .addChild(Transform() \
        .setDEF("Fish3") \
        .setScale([0.1,0.1,0.1]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDiffuseColor([0.6,0.9,0.9]) \
          ) \
         ) \
         .setGeometry(IndexedFaceSet(ccw = False, coordIndex = [0,2,3,-1,0,3,4,-1,0,4,1,-1,0,1,2,-1,1,4,5,-1,2,1,5,-1,3,5,4,-1,3,2,5,-1,5,7,6,-1,5,6,7,-1], creaseAngle = 1.57) \
          .setCoord(Coordinate() \
           .setPoint([0.0,0.0,-2.0,0.0,-1.25,0.0,0.3,0.0,0.0,0.0,1.25,0.0,-0.3,0.0,0.0,0.0,0.0,2.25,0.0,1.25,3.0,0.0,-1.25,3.0]) \
          ) \
         ) \
        ) \
       ) \
      ) \
      .addChild(WorldInfo() \
       .setInfo(["null"]) \
# Lowest resolution node is nothing. 
      ) \
     ) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("Clock") \
     .setCycleInterval(2.0) \
     .setLoop(True) \
    ) \
    .addChild(CoordinateInterpolator() \
     .setDEF("FishWiggle") \
     .setKey([0.0,0.25,0.5,0.75,1.0]) \
     .setKeyValue([0.0,0.0,-1.5,0.0,0.5,-1.0,-0.12,0.25,-1.0,-0.25,0.0,-1.0,-0.12,-0.25,-1.0,0.0,-0.5,-1.0,0.12,-0.25,-1.0,0.25,0.0,-1.0,0.12,0.25,-1.0,0.0,1.0,0.0,-0.25,0.5,0.0,-0.5,0.0,0.0,-0.25,-0.5,0.0,0.0,-1.0,0.0,0.25,-0.5,0.0,0.5,0.0,0.0,0.25,0.5,0.0,0.0,0.88,0.9,-0.19,0.44,0.9,-0.37,0.0,0.9,-0.19,-0.44,0.9,0.0,-0.88,0.9,0.19,-0.44,0.9,0.37,0.0,0.9,0.19,0.44,0.9,0.0,0.75,1.75,-0.12,0.35,1.75,-0.25,0.0,1.75,-0.12,-0.35,1.75,0.0,-0.75,1.75,0.12,-0.35,1.75,0.25,0.0,1.75,0.12,0.35,1.75,0.0,0.5,2.5,-0.05,0.25,2.5,-0.1,0.0,2.5,-0.05,-0.25,2.5,0.0,-0.5,2.5,0.05,-0.25,2.5,0.1,0.0,2.5,0.05,0.25,2.5,0.0,1.25,3.25,0.0,0.0,3.0,0.0,-1.25,3.25,0.0,0.0,-1.5,0.0,0.5,-1.0,-0.12,0.25,-1.0,-0.25,0.0,-1.0,-0.12,-0.25,-1.0,0.0,-0.5,-1.0,0.12,-0.25,-1.0,0.25,0.0,-1.0,0.12,0.25,-1.0,0.0,1.0,0.0,-0.25,0.5,0.0,-0.5,0.0,0.0,-0.25,-0.5,0.0,0.0,-1.0,0.0,0.25,-0.5,0.0,0.5,0.0,0.0,0.25,0.5,0.0,0.0,0.88,0.9,-0.19,0.44,0.9,-0.37,0.0,0.9,-0.19,-0.44,0.9,0.0,-0.88,0.9,0.19,-0.44,0.9,0.37,0.0,0.9,0.19,0.44,0.9,0.2,0.75,1.75,0.08,0.35,1.75,-0.05,0.0,1.75,0.08,-0.35,1.75,0.2,-0.75,1.75,0.32,-0.35,1.75,0.45,0.0,1.75,0.32,0.35,1.75,0.3,0.5,2.5,0.25,0.25,2.5,0.15,0.0,2.5,0.25,-0.25,2.5,0.3,-0.5,2.5,0.35,-0.25,2.5,0.4,0.0,2.5,0.35,0.25,2.5,0.5,1.25,3.25,0.5,0.0,3.0,0.5,-1.25,3.25,0.0,0.0,-1.5,0.0,0.5,-1.0,-0.12,0.25,-1.0,-0.25,0.0,-1.0,-0.12,-0.25,-1.0,0.0,-0.5,-1.0,0.12,-0.25,-1.0,0.25,0.0,-1.0,0.12,0.25,-1.0,0.0,1.0,0.0,-0.25,0.5,0.0,-0.5,0.0,0.0,-0.25,-0.5,0.0,0.0,-1.0,0.0,0.25,-0.5,0.0,0.5,0.0,0.0,0.25,0.5,0.0,0.0,0.88,0.9,-0.19,0.44,0.9,-0.37,0.0,0.9,-0.19,-0.44,0.9,0.0,-0.88,0.9,0.19,-0.44,0.9,0.37,0.0,0.9,0.19,0.44,0.9,0.0,0.75,1.75,-0.12,0.35,1.75,-0.25,0.0,1.75,-0.12,-0.35,1.75,0.0,-0.75,1.75,0.12,-0.35,1.75,0.25,0.0,1.75,0.12,0.35,1.75,0.0,0.5,2.5,-0.05,0.25,2.5,-0.1,0.0,2.5,-0.05,-0.25,2.5,0.0,-0.5,2.5,0.05,-0.25,2.5,0.1,0.0,2.5,0.05,0.25,2.5,0.0,1.25,3.25,0.0,0.0,3.0,0.0,-1.25,3.25,0.0,0.0,-1.5,0.0,0.5,-1.0,-0.12,0.25,-1.0,-0.25,0.0,-1.0,-0.12,-0.25,-1.0,0.0,-0.5,-1.0,0.12,-0.25,-1.0,0.25,0.0,-1.0,0.12,0.25,-1.0,0.0,1.0,0.0,-0.25,0.5,0.0,-0.5,0.0,0.0,-0.25,-0.5,0.0,0.0,-1.0,0.0,0.25,-0.5,0.0,0.5,0.0,0.0,0.25,0.5,0.0,0.0,0.88,0.9,-0.19,0.44,0.9,-0.37,0.0,0.9,-0.19,-0.44,0.9,0.0,-0.88,0.9,0.19,-0.44,0.9,0.37,0.0,0.9,0.19,0.44,0.9,-0.2,0.75,1.75,-0.32,0.35,1.75,-0.45,0.0,1.75,-0.32,-0.35,1.75,-0.2,-0.75,1.75,-0.08,-0.35,1.75,0.05,0.0,1.75,-0.08,0.35,1.75,-0.3,0.5,2.5,-0.35,0.25,2.5,-0.4,0.0,2.5,-0.35,-0.25,2.5,-0.3,-0.5,2.5,-0.25,-0.25,2.5,-0.2,0.0,2.5,-0.25,0.25,2.5,-0.5,1.25,3.25,-0.5,0.0,3.0,-0.5,-1.25,3.25,0.0,0.0,-1.5,0.0,0.5,-1.0,-0.12,0.25,-1.0,-0.25,0.0,-1.0,-0.12,-0.25,-1.0,0.0,-0.5,-1.0,0.12,-0.25,-1.0,0.25,0.0,-1.0,0.12,0.25,-1.0,0.0,1.0,0.0,-0.25,0.5,0.0,-0.5,0.0,0.0,-0.25,-0.5,0.0,0.0,-1.0,0.0,0.25,-0.5,0.0,0.5,0.0,0.0,0.25,0.5,0.0,0.0,0.88,0.9,-0.19,0.44,0.9,-0.37,0.0,0.9,-0.19,-0.44,0.9,0.0,-0.88,0.9,0.19,-0.44,0.9,0.37,0.0,0.9,0.19,0.44,0.9,0.0,0.75,1.75,-0.12,0.35,1.75,-0.25,0.0,1.75,-0.12,-0.35,1.75,0.0,-0.75,1.75,0.12,-0.35,1.75,0.25,0.0,1.75,0.12,0.35,1.75,0.0,0.5,2.5,-0.05,0.25,2.5,-0.1,0.0,2.5,-0.05,-0.25,2.5,0.0,-0.5,2.5,0.05,-0.25,2.5,0.1,0.0,2.5,0.05,0.25,2.5,0.0,1.25,3.25,0.0,0.0,3.0,0.0,-1.25,3.25]) \
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
     .setToNode("Fish") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//Fish_RoundTrip.x3d")
