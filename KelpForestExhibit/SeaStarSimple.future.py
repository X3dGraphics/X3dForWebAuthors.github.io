from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("SeaStarSimple.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("A simple sea star constructed out of scaled Sphere primitives.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Karl Tenney") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("Scott Tufts") \
     .setName("translator") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("translator") \
    ) \
    .addMeta(meta() \
     .setContent("1 June 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("13 December 2001") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("29 May 2008") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarSimple.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("Cosmo Worlds V2.0") \
     .setName("generator") \
    ) \
    .addMeta(meta() \
     .setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit") \
     .setName("generator") \
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
     .setDEF("AuthoringViewpoints") \
     .addChild(Viewpoint() \
      .setDescription("SeaStarSimple default") \
     ) \
     .addChild(Viewpoint() \
      .setDEF("Main") \
      .setDescription("SeaStarSimple main") \
      .setPosition([-0.079625,0.149682,2.32008]) \
     ) \
     .addChild(Viewpoint() \
      .setDEF("Above") \
      .setDescription("SeaStarSimple from above") \
      .setOrientation([-0.999868,0.0140676,0.00816969,1.0524]) \
      .setPosition([-0.0604298,2.20843,1.12432]) \
     ) \
    ) \
    .addChild(Transform() \
# original translation 0.46739 0 -1.27889 
     .addChild(Transform() \
      .setRotation([0.0160324,0.999622,0.0223337,0.494856]) \
      .setScale([0.0564878,0.00994367,0.0245735]) \
      .setTranslation([-0.359698,0.00994363,1.36377]) \
      .addChild(Shape() \
       .setDEF("star_segment") \
       .setAppearance(Appearance() \
# Universal Media Materials value used 
        .setMaterial(Material() \
         .setDEF("SantaFe27") \
         .setAmbientIntensity(0.240502) \
         .setDiffuseColor([0.484043,0.338715,0.035729]) \
         .setShininess(0.085106) \
         .setSpecularColor([0.223676,0.109052,0.033373]) \
        ) \
       ) \
       .setGeometry(Sphere() \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setScale([.0276058,0.0102856,0.0691647]) \
      .setTranslation([-0.45535,0.0102856,1.22615]) \
      .addChild(Shape() \
       .setUSE("star_segment") \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([6.36314e-008,1,-7.41821e-009,0.631741]) \
      .setScale([0.0276058,0.0102856,0.0691647]) \
      .setTranslation([-0.426702,0.0102856,1.34188]) \
      .addChild(Shape() \
       .setUSE("star_segment") \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([-2.40082e-007,-1,3.43709e-007,0.712123]) \
      .setScale([0.0276058,0.0102856,0.0691647]) \
      .setTranslation([-0.5,0.0102856,1.32509]) \
      .addChild(Shape() \
       .setUSE("star_segment") \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([1.85515e-008,-1,-1.05709e-007,0.919461]) \
      .setScale([0.0276058,0.0102856,0.0691647]) \
      .setTranslation([-0.39858,0.0102856,1.25]) \
      .addChild(Shape() \
       .setUSE("star_segment") \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([3.53588e-007,1,1.0134e-006,0.84627]) \
      .setScale([0.0276058,0.0102856,0.0691647]) \
      .setTranslation([-0.5,0.0102858,1.25]) \
      .addChild(Shape() \
       .setUSE("star_segment") \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([1.48158e-008,1,-3.7903e-008,1.57079]) \
      .setScale([0.0564878,0.00994367,0.0245735]) \
      .setTranslation([-0.364396,0.00994358,1.19351]) \
      .addChild(Shape() \
       .setUSE("star_segment") \
      ) \
     ) \
     .addChild(Transform() \
      .setScale([0.0564878,0.00994367,0.0245735]) \
      .setTranslation([-0.569653,0.00994355,1.21309]) \
      .addChild(Shape() \
       .setUSE("star_segment") \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([4.05455e-007,-1,1.915e-007,1.02836]) \
      .setScale([0.0564878,0.00994367,0.0245735]) \
      .setTranslation([-0.464063,0.00994362,1.1596]) \
      .addChild(Shape() \
       .setUSE("star_segment") \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([-5.59581e-009,-1,-9.59606e-009,0.878147]) \
      .setScale([0.0564878,0.00994367,0.0245735]) \
      .setTranslation([-0.510391,0.00994369,1.40221]) \
      .addChild(Shape() \
       .setUSE("star_segment") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//SeaStarSimple_RoundTrip.x3d")
