from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("KelpTankWaterSurface.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Moving water surface for KelpTank - initial view is perpendicular, rotate viewpoint up to see motion. Cycle time is 5.5 seconds to match pump, with slight time lag to indicate inertia of quasi-steady-state equilibrium..") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Todd Gagnon") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("Xeena VRML importer, X3D-Edit 3.1, http://www.web3d.org/x3d/content/README.X3D-Edit.html") \
     .setName("translator") \
    ) \
    .addMeta(meta() \
     .setContent("9 June 1998") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTankWaterSurface.x3d") \
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
     .setInfo(["DTG of last update: 091030Jun98 Added: Updated: comment out PointLight Modeled by: Todd Gagnon"]) \
     .setTitle("surface1.4.wrl") \
    ) \
    .addChild(Group() \
     .addChild(Transform() \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setAmbientIntensity(1.0) \
         .setDiffuseColor([0.03,0.12,0.24]) \
         .setEmissiveColor([0.0,0.16,0.36]) \
         .setShininess(0.35) \
         .setSpecularColor([0.2,0.5,0.8]) \
         .setTransparency(0.15) \
        ) \
       ) \
       .setGeometry(IndexedFaceSet(coordIndex = [0,1,6,7,-1,1,2,5,6,-1,2,3,4,5,-1,11,12,9,10,-1,12,13,8,9,-1,13,0,7,8,-1], solid = False) \
        .setCoord(Coordinate() \
         .setDEF("SURFACE") \
         .setPoint([0.0,0.0,0.0,2.5,0.0,1.0,4.5,0.0,3.0,7.625,0.0,3.0,10.25,0.0,0.375,10.25,0.0,-4.375,6.375,0.0,-8.0,0.0,0.0,-8.0,-5.5,0.0,-8.0,-10.5,0.0,-2.875,-10.5,0.0,0.25,-7.625,0.0,3.0,-4.5,0.0,3.0,-2.5,0.0,1.0]) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(TimeSensor() \
     .setDEF("SURFACEClock") \
     .setCycleInterval(5.5) \
     .setLoop(True) \
    ) \
    .addChild(CoordinateInterpolator() \
     .setDEF("SURFACEHeight") \
     .setKey([0.0,0.2,0.45,0.7,0.95]) \
     .setKeyValue([0.0,0.0,0.0,2.5,0.05,1.0,4.5,0.1,3.0,7.625,0.15,3.0,10.25,0.15,0.375,10.25,0.15,-4.375,6.375,0.1,-8.0,0.0,0.0,-8.0,-5.5,-0.1,-8.0,-10.5,-0.15,-2.875,-10.5,-0.15,0.25,-7.625,-0.15,3.0,-4.5,-0.1,3.0,-2.5,-0.05,1.0,0.0,0.0,0.0,2.5,0.0,1.0,4.5,0.0,3.0,7.625,0.0,3.0,10.25,0.0,0.375,10.25,0.0,-4.375,6.375,0.0,-8.0,0.0,0.0,-8.0,-5.5,0.0,-8.0,-10.5,0.0,-2.875,-10.5,0.0,0.25,-7.625,0.0,3.0,-4.5,0.0,3.0,-2.5,0.0,1.0,0.0,-0.0,0.0,2.5,-0.05,1.0,4.5,-0.1,3.0,7.625,-0.15,3.0,10.25,-0.15,0.375,10.25,-0.15,-4.375,6.375,-0.1,-8.0,0.0,-0.0,-8.0,-5.5,0.1,-8.0,-10.5,0.15,-2.875,-10.5,0.15,0.25,-7.625,0.15,3.0,-4.5,0.1,3.0,-2.5,0.05,1.0,0.0,0.0,0.0,2.5,0.0,1.0,4.5,0.0,3.0,7.625,0.0,3.0,10.25,0.0,0.375,10.25,0.0,-4.375,6.375,0.0,-8.0,0.0,0.0,-8.0,-5.5,0.0,-8.0,-10.5,0.0,-2.875,-10.5,0.0,0.25,-7.625,0.0,3.0,-4.5,0.0,3.0,-2.5,0.0,1.0,0.0,0.0,0.0,2.5,0.05,1.0,4.5,0.1,3.0,7.625,0.15,3.0,10.25,0.15,0.375,10.25,0.15,-4.375,6.375,0.1,-8.0,0.0,0.0,-8.0,-5.5,-0.1,-8.0,-10.5,-0.15,-2.875,-10.5,-0.15,0.25,-7.625,-0.15,3.0,-4.5,-0.1,3.0,-2.5,-0.05,1.0]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("SURFACEClock") \
     .setToField("set_fraction") \
     .setToNode("SURFACEHeight") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("SURFACEHeight") \
     .setToField("set_point") \
     .setToNode("SURFACE") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//KelpTankWaterSurface_RoundTrip.x3d")
