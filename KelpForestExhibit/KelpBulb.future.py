from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("KelpBulb.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("One leaf of Kelp moving around a Bulb. Cycle time is 11 seconds, which is twice the cycle time of tank surface motion.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Joseph Cannon, Dan DeVos") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("25 September 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("22 December 2002") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("KelpPrototype.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://faculty.nps.edu/brutzman/kelp") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf") \
     .setName("reference") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBulb.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html") \
     .setName("generator") \
    ) \
    .addMeta(meta() \
     .setContent("../license.html") \
     .setName("license") \
    ) \
   ) \
   .setScene(Scene() \
    .addChild(Group() \
     .addChild(Group() \
      .addChild(Transform() \
       .setRotation([0.0,0.0,1.0,1.5707]) \
       .addChild(Shape() \
        .setDEF("Stem") \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDEF("stipeColor") \
          .setDiffuseColor([0.882,0.757,0.184]) \
         ) \
        ) \
        .setGeometry(Cylinder(height = 2.5, radius = 0.15) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setScale([0.75,0.6,0.6]) \
       .setTranslation([1.8,0.0,0.0]) \
       .addChild(Shape() \
        .setDEF("Bulb") \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setUSE("stipeColor") \
         ) \
        ) \
        .setGeometry(Sphere() \
        ) \
       ) \
      ) \
     ) \
     .addChild(LOD() \
      .setDEF("Leaf") \
      .setRange([90]) \
      .addChild(Transform() \
       .addChild(Shape() \
        .setDEF("HighResolutionLeaf") \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDiffuseColor([0.694,0.525,0.176]) \
         ) \
        ) \
        .setGeometry(Extrusion(creaseAngle = 1.57, crossSection = [0.06,1.0,0.06,-1.0,-0.06,-1.0,-0.06,1.0], solid = False, spine = [1.9,0.0,0.0,2.5,0.0,0.0,4.0,0.0,0.0,7.0,0.0,0.0,16.0,0.0,0.0,21.0,0.0,0.0]) \
         .setDEF("BLADE_SHAPE") \
         .setBeginCap(False) \
         .setEndCap(False) \
         .setOrientation([0.0,1.0,0.0,0.0,0.0,1.0,0.0,0.0,0.0,1.0,0.0,0.2,0.0,1.0,0.0,0.9,0.0,1.0,0.0,0.45,0.0,1.0,0.0,0.0]) \
         .setScale([1.0,0.1,1.0,0.3,1.0,0.55,1.0,0.75,1.0,0.4,1.0,0.01]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([1.0,0.0,0.0]) \
       .addChild(Shape() \
        .setDEF("LowResolutionLeaf") \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDiffuseColor([0.694,0.525,0.176]) \
         ) \
        ) \
        .setGeometry(IndexedFaceSet(coordIndex = [1,0,9,-1,2,1,9,8,-1,3,2,8,7,-1,4,3,7,6,-1,5,4,6], solid = False) \
         .setCoord(Coordinate() \
          .setPoint([0.0,0.0,0.0,1.0,0.5,0.0,4.0,1.1,0.0,7.0,1.5,0.0,16.0,0.8,0.0,21.0,0.0,0.0,16.0,-0.8,0.0,7.0,-1.5,0.0,4.0,-1.1,0.0,1.0,-0.5,0.0]) \
         ) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("ANIMATOR") \
     .setCycleInterval(11.0) \
     .setLoop(True) \
    ) \
    .addChild(CoordinateInterpolator() \
     .setDEF("BLADE_MOTION") \
     .setKey([0.0,0.25,0.5,0.75,1.0]) \
     .setKeyValue([1.9,0.0,0.0,2.5,0.0,0.0,4.0,0.0,0.0,7.0,0.0,0.0,16.0,0.0,0.0,21.0,0.0,0.0,1.9,0.0,0.0,2.5,0.6,0.0,4.0,1.0,0.0,7.0,3.0,0.0,16.0,3.5,0.0,21.0,0.0,0.0,1.9,0.0,0.0,2.5,0.0,0.0,4.0,0.0,0.0,7.0,0.0,0.0,16.0,0.6,0.0,21.0,2.0,0.0,1.9,0.0,0.0,2.5,-0.6,0.0,4.0,-1.0,0.0,7.0,-3.0,0.0,16.0,-3.5,0.0,21.0,0.0,0.0,1.9,0.0,0.0,2.5,0.0,0.0,4.0,0.0,0.0,7.0,0.0,0.0,16.0,0.0,0.0,21.0,0.0,0.0]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("ANIMATOR") \
     .setToField("set_fraction") \
     .setToNode("BLADE_MOTION") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("BLADE_MOTION") \
     .setToField("set_spine") \
     .setToNode("BLADE_SHAPE") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//KelpBulb_RoundTrip.x3d")
