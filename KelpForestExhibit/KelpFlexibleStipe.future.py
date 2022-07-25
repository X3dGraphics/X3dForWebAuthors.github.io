from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("KelpFlexibleStipe.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Matthew Braun") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("2 October 2001") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("An extruded piece of kelp for the Kelp Forest project. Bulb is separate.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpFlexibleStipe.x3d") \
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
     .setDescription("Kelp stipe and holdfast") \
     .setPosition([0,5,13]) \
    ) \
# Animation clock 
    .addChild(TimeSensor() \
     .setDEF("CLOCK") \
     .setCycleInterval(4) \
     .setLoop(True) \
    ) \
    .addChild(CoordinateInterpolator() \
     .setDEF("KELP_BEND") \
     .setKey([0.0,0.22,0.50,0.72,1.0]) \
     .setKeyValue([0.00,0.00,0.00,0.00,2.00,0.00,0.00,4.00,0.00,0.00,6.00,0.00,0.00,8.00,0.00,0.00,10.00,0.00,0.00,12.00,0.00,0.00,14.00,0.00,0.00,16.00,0.00,0.00,18.00,0.00,0.26,19.00,0.00,1.00,19.74,0.00,2.00,20.00,0.00,7.00,20.00,0.00,0.00,0.00,0.00,0.02,2.00,0.00,0.06,4.00,0.00,0.14,6.00,0.00,0.24,8.00,0.00,0.36,10.00,0.00,0.50,12.00,0.00,0.66,14.00,0.00,0.83,16.00,0.00,1.02,18.00,0.00,1.24,19.00,0.00,1.75,19.74,0.00,3.25,20.00,0.00,8.25,20.00,0.00,0.00,0.00,0.00,0.00,2.00,0.00,0.00,4.00,0.00,0.00,6.00,0.00,0.00,8.00,0.00,0.00,10.00,0.00,0.00,12.00,0.00,0.00,14.00,0.00,0.00,16.00,0.00,0.00,18.00,0.00,0.26,19.00,0.00,1.00,19.74,0.00,2.00,20.00,0.00,7.00,20.00,0.00,0.00,0.00,0.00,-0.03,2.00,0.00,-0.12,4.00,0.00,-0.25,6.00,0.00,-0.41,8.00,0.00,-0.59,10.00,0.00,-0.75,12.00,0.00,-0.88,14.00,0.00,-0.97,16.00,0.00,-1.00,18.00,0.00,-0.74,19.00,0.00,0.00,19.74,0.00,1.00,20.00,0.00,6.00,20.00,0.00,0.00,0.00,0.00,0.00,2.00,0.00,0.00,4.00,0.00,0.00,6.00,0.00,0.00,8.00,0.00,0.00,10.00,0.00,0.00,12.00,0.00,0.00,14.00,0.00,0.00,16.00,0.00,0.00,18.00,0.00,0.26,19.00,0.00,1.00,19.74,0.00,2.00,20.00,0.00,7.00,20.00,0.00]) \
    ) \
# Geometry 
    .addChild(Transform() \
     .setScale([0.5,0.5,0.5]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setAmbientIntensity(.25) \
        .setDiffuseColor([0.57,0.40,0.10]) \
        .setShininess(0.92) \
        .setTransparency(0.50) \
       ) \
      ) \
      .setGeometry(Extrusion(ccw = False, convex = False, creaseAngle = .78, crossSection = [1.00,0.00,0.87,0.50,0.50,0.87,0.00,1.00,-0.50,0.87,-0.87,0.50,-1.00,0.00,-0.87,-0.50,-0.50,-0.87,0.00,-1.00,0.50,-0.87,0.87,-0.50,1.00,0.00], spine = [0.00,1.00,0.00,0.00,0.00,0.00,0.00,1.00,0.00,0.00,2.00,0.00,0.00,3.00,0.00,0.00,4.00,0.00,0.00,5.00,0.00,0.00,6.00,0.00,0.00,7.00,0.00,0.00,8.00,0.00,0.00,9.00,0.00,0.13,9.50,0.00,0.50,9.87,0.00,1.00,10.00,0.00,5.00,10.00,0.00]) \
       .setDEF("KELP") \
       .setEndCap(False) \
       .setScale([0.30,0.30,0.29,0.29,0.28,0.28,0.27,0.27,0.26,0.26,0.25,0.25,0.24,0.24,0.23,0.23,0.22,0.22,0.21,0.21,0.19,0.19,0.16,0.16,0.11,0.11,0.05,0.05,0.00,0.00]) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setScale([0.5,0.5,0.5]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setAmbientIntensity(.25) \
        .setDiffuseColor([0.57,0.30,0.10]) \
        .setEmissiveColor([0.52,0.30,0.10]) \
        .setShininess(0.92) \
        .setTransparency(0.70) \
       ) \
      ) \
      .setGeometry(Extrusion(ccw = False, convex = False, creaseAngle = .78, crossSection = [0.80,0.00,0.69,0.40,0.40,0.69,0.00,0.80,-0.40,0.69,-0.69,0.40,-0.80,0.00,-0.69,-0.40,-0.40,-0.69,0.00,-0.80,0.40,-0.69,0.69,-0.40,0.80,0.00], spine = [0.00,0.00,0.00,0.00,1.00,0.00,0.00,2.00,0.00,0.00,3.00,0.00,0.00,4.00,0.00,0.00,5.00,0.00,0.00,6.00,0.00,0.00,7.00,0.00,0.00,8.00,0.00,0.00,9.00,0.00,0.13,9.50,0.00,0.50,9.87,0.00,1.00,10.00,0.00,5.00,10.00,0.00]) \
       .setDEF("INNER_KELP") \
       .setEndCap(False) \
       .setScale([0.30,0.30,0.29,0.29,0.28,0.28,0.27,0.27,0.26,0.26,0.25,0.25,0.24,0.24,0.23,0.23,0.22,0.22,0.21,0.21,0.19,0.19,0.16,0.16,0.11,0.11,0.00,0.00]) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setAmbientIntensity(.25) \
        .setDiffuseColor([0.57,0.30,0.10]) \
        .setShininess(0.92) \
       ) \
      ) \
      .setGeometry(Cone(bottomRadius = 0.5, height = 0.5) \
      ) \
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("CLOCK") \
     .setToField("set_fraction") \
     .setToNode("KELP_BEND") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("KELP_BEND") \
     .setToField("set_spine") \
     .setToNode("KELP") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("KELP_BEND") \
     .setToField("set_spine") \
     .setToNode("INNER_KELP") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//KelpFlexibleStipe_RoundTrip.x3d")
