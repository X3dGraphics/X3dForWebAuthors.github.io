from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("KelpTankExternalLight.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Topside light for Kelp Forest Exhibit.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Todd Gagnon and Mark A. Boyd") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("Xeena VRML importer, X3D-Edit 3.1, http://www.web3d.org/x3d/content/README.X3D-Edit.html") \
     .setName("translator") \
    ) \
    .addMeta(meta() \
     .setContent("17 May 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("20 December 2002") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("6 June 2012") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("KelpTankExternalLights.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTankExternalLight.x3d") \
     .setName("identifier") \
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
    .addChild(WorldInfo() \
     .setInfo(["Model of light from top floor of the Monterey Bay Aquarium Kelp Forest DTG of last updated: 172230May98 Added: Updated: Modeled by: Todd Gagnon and Mark A. Boyd"]) \
     .setTitle("light1.0.wrl") \
    ) \
    .addChild(Group() \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setDEF("Structure") \
       .setMaterial(Material() \
        .setDiffuseColor([0.21569,0.21176,0.19608]) \
       ) \
      ) \
      .setGeometry(Cylinder(bottom = False, radius = 0.05) \
       .setTop(False) \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("Arm") \
      .setRotation([0.0,0.0,1.0,-1.57]) \
      .setTranslation([0.3,0.25,0.0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setUSE("Structure") \
       ) \
       .setGeometry(Cylinder(bottom = False, height = 0.6, radius = 0.05) \
        .setTop(False) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([0.0,0.31,0.0]) \
       .addChild(Shape() \
        .setAppearance(Appearance() \
         .setUSE("Structure") \
        ) \
        .setGeometry(Sphere(radius = 0.05) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setRotation([0.0,0.0,1.0,1.57]) \
       .setTranslation([-0.13,0.31,0.0]) \
       .addChild(Shape() \
        .setAppearance(Appearance() \
         .setUSE("Structure") \
        ) \
        .setGeometry(Cylinder(bottom = False, height = 0.25, radius = 0.05) \
         .setTop(False) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([0.0,1.0,0.0,3.14]) \
      .addChild(Transform() \
       .setUSE("Arm") \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([0.0,-1.0,0.0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setUSE("Structure") \
       ) \
       .setGeometry(Box(size = [0.4,0.3,0.4]) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setDEF("Light") \
      .setRotation([1.0,0.0,0.0,0.7]) \
      .setTranslation([0.0,1.1,0.1]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.7843,0.8078,0.7922]) \
        ) \
       ) \
       .setGeometry(Box(size = [0.5,0.35,0.2]) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([0.6,-0.5,0.0]) \
      .addChild(Transform() \
       .setUSE("Light") \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-0.6,-0.5,0.0]) \
      .addChild(Transform() \
       .setUSE("Light") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//KelpTankExternalLight_RoundTrip.x3d")
