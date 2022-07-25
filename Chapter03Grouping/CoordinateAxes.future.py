from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("CoordinateAxes.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman, Byounghyun Yoo") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("14 July 2000") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("9 November 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("X Y Z axis arrows and labels in X3D coordinate system. See CoordinateAxesExample for use as an Inline coordinate-system reference frame.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxesNSEW.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxesNSEW.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d") \
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
    .addChild(Collision() \
     .setDEF("DoNotCollideWithVisualizationWidget") \
     .setEnabled(True) \
# Invoke CoordinateAxes in other scenes as an Inline child inside a scaling Transform node, at the topmost level of the scene graph. 
# This NavigationInfo allows examine mode and will be overridden by any parent scene. 
# Each arrow goes from +1m to -1m to allow linear scaling to fit a scene 
# Note each label rotates about the scene's vertical Y axis for consistency, enabling local orientation by user 
     .setProxy(Group() \
# Vertical Y arrow and label 
      .addChild(Group() \
       .setDEF("ArrowGreen") \
       .addChild(Shape() \
        .setGeometry(Cylinder(radius = .025) \
         .setDEF("ArrowCylinder") \
         .setTop(False) \
        ) \
        .setAppearance(Appearance() \
         .setDEF("Green") \
         .setMaterial(Material() \
          .setDiffuseColor([.1,.6,.1]) \
          .setEmissiveColor([.05,.2,.05]) \
         ) \
        ) \
       ) \
       .addChild(Transform() \
        .setTranslation([0,1,0]) \
        .addChild(Shape() \
         .setGeometry(Cone(bottomRadius = .05, height = .1) \
          .setDEF("ArrowCone") \
         ) \
         .setAppearance(Appearance() \
          .setUSE("Green") \
         ) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([0,1.08,0]) \
       .addChild(Billboard() \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setDEF("LABEL_APPEARANCE") \
          .setMaterial(Material() \
           .setDiffuseColor([1,1,.3]) \
           .setEmissiveColor([.33,.33,.1]) \
          ) \
         ) \
         .setGeometry(Text() \
          .setString(["Y"]) \
          .setFontStyle(FontStyle(family = ["SANS"], justify = ["MIDDLE","MIDDLE"], size = .2) \
           .setDEF("LABEL_FONT") \
          ) \
         ) \
        ) \
       ) \
      ) \
     ) \
     .setProxy(Transform() \
      .setRotation([0,0,1,-1.57079]) \
# Horizontal X arrow and label 
      .addChild(Group() \
       .addChild(Group() \
        .setDEF("ArrowRed") \
        .addChild(Shape() \
         .setGeometry(Cylinder() \
          .setUSE("ArrowCylinder") \
         ) \
         .setAppearance(Appearance() \
          .setDEF("Red") \
          .setMaterial(Material() \
           .setDiffuseColor([.7,.1,.1]) \
           .setEmissiveColor([.33,0,0]) \
          ) \
         ) \
        ) \
        .addChild(Transform() \
         .setTranslation([0,1,0]) \
         .addChild(Shape() \
          .setGeometry(Cone() \
           .setUSE("ArrowCone") \
          ) \
          .setAppearance(Appearance() \
           .setUSE("Red") \
          ) \
         ) \
        ) \
       ) \
       .addChild(Transform() \
        .setRotation([0,0,1,1.57079]) \
        .setTranslation([.072,1.1,0]) \
# note label rotated back to original coordinate frame 
        .addChild(Billboard() \
         .addChild(Shape() \
          .setAppearance(Appearance() \
           .setUSE("LABEL_APPEARANCE") \
          ) \
          .setGeometry(Text() \
           .setString(["X"]) \
           .setFontStyle(FontStyle() \
            .setUSE("LABEL_FONT") \
           ) \
          ) \
         ) \
        ) \
       ) \
      ) \
     ) \
     .setProxy(Transform() \
      .setRotation([1,0,0,1.57079]) \
# Perpendicular Z arrow and label, note right-hand rule 
      .addChild(Group() \
       .addChild(Group() \
        .setDEF("ArrowBlue") \
        .addChild(Shape() \
         .setGeometry(Cylinder() \
          .setUSE("ArrowCylinder") \
         ) \
         .setAppearance(Appearance() \
          .setDEF("Blue") \
          .setMaterial(Material() \
           .setDiffuseColor([.3,.3,1]) \
           .setEmissiveColor([.1,.1,.33]) \
          ) \
         ) \
        ) \
        .addChild(Transform() \
         .setTranslation([0,1,0]) \
         .addChild(Shape() \
          .setGeometry(Cone() \
           .setUSE("ArrowCone") \
          ) \
          .setAppearance(Appearance() \
           .setUSE("Blue") \
          ) \
         ) \
        ) \
       ) \
       .addChild(Transform() \
        .setRotation([1,0,0,-1.57079]) \
        .setTranslation([0,1.1,.072]) \
# note label rotated back to original coordinate frame 
        .addChild(Billboard() \
         .addChild(Shape() \
          .setAppearance(Appearance() \
           .setUSE("LABEL_APPEARANCE") \
          ) \
          .setGeometry(Text() \
           .setString(["Z"]) \
           .setFontStyle(FontStyle() \
            .setUSE("LABEL_FONT") \
           ) \
          ) \
         ) \
        ) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping//CoordinateAxes_RoundTrip.x3d")
