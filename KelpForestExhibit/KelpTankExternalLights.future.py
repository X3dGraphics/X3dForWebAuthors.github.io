from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("KelpTankExternalLights.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Topside lights which illuminate the Kelp Forest Exhibit at night.") \
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
     .setContent("3 June 1998") \
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
     .setContent("KelpTank.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTankExternalLights.x3d") \
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
     .setInfo(["Model of lights on top floor of the Monterey Bay Aquarium Kelp Forest DTG of last updated: 031200Jun98 Added: Updated: lifted first two lights a bit since I missed them in 1.3 Modeled by: Todd Gagnon and Mark A. Boyd"]) \
     .setTitle("externalLights1.4.wrl") \
    ) \
    .addChild(Group() \
     .addChild(Transform() \
      .setTranslation([0.0,2.08,-8.25]) \
      .addChild(Inline() \
       .setDEF("Light") \
       .setUrl(["KelpTankExternalLight.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTankExternalLight.x3d","KelpTankExternalLight.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTankExternalLight.wrl"]) \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([0.0,1.0,0.0,-0.7]) \
      .setTranslation([8.75,2.08,-6.25]) \
      .addChild(Inline() \
       .setUSE("Light") \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([0.0,1.0,0.0,3.14]) \
      .setTranslation([6.25,2.08,3.25]) \
      .addChild(Inline() \
       .setUSE("Light") \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([0.0,1.0,0.0,2.35]) \
      .setTranslation([2.5,2.08,1.3]) \
      .addChild(Inline() \
       .setUSE("Light") \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([0.0,1.0,0.0,-2.35]) \
      .setTranslation([-2.5,2.08,1.3]) \
      .addChild(Inline() \
       .setUSE("Light") \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([0.0,1.0,0.0,3.14]) \
      .setTranslation([-6.25,2.08,3.25]) \
      .addChild(Inline() \
       .setUSE("Light") \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([0.0,1.0,0.0,2.4]) \
      .setTranslation([-9.25,2.08,1.65]) \
      .addChild(Inline() \
       .setUSE("Light") \
      ) \
     ) \
     .addChild(Transform() \
      .setRotation([0.0,1.0,0.0,0.8]) \
      .setTranslation([-7.75,2.08,-6.25]) \
      .addChild(Inline() \
       .setUSE("Light") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//KelpTankExternalLights_RoundTrip.x3d")
