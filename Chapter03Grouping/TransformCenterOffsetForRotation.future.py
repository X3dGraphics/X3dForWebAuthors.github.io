from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("TransformCenterOffsetForRotation.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Use Transform center field to compare original Cylinder (left) to rotation about middle of object (middle Cylinder) to rotation about bottom of object (right Cylinder).") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("28 January 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("15 March 2009") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/X3dResources.html") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright Don Brutzman and Leonard Daly 2007") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/TransformCenterOffsetForRotation.x3d") \
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
# leftmost cylinder is vertical 
    .addChild(Transform() \
     .setTranslation([-3.5,0,0]) \
     .addChild(Shape() \
      .setDEF("TallCylinder") \
      .setGeometry(Cylinder(height = 4) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0.941176,0.027451,0]) \
       ) \
      ) \
     ) \
    ) \
# center cylinder rotated -45 degrees about center 
    .addChild(Transform() \
     .setRotation([0,0,1,-0.78]) \
     .addChild(Shape() \
      .setUSE("TallCylinder") \
     ) \
    ) \
# rightmost cylinder rotated -45 degrees about base 
    .addChild(Transform() \
     .setCenter([0,-2,0]) \
     .setRotation([0,0,1,-0.78]) \
     .setTranslation([3.5,0,0]) \
     .addChild(Shape() \
      .setUSE("TallCylinder") \
     ) \
    ) \
    .addChild(Shape() \
     .setDEF("FlatBox") \
     .setGeometry(Box(size = [7,0.1,2]) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setDiffuseColor([0,0.643137,0.960784]) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,-2,0]) \
     .addChild(Shape() \
      .setUSE("FlatBox") \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping//TransformCenterOffsetForRotation_RoundTrip.x3d")
