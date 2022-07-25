from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Interchange") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("NormalInterpolator.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example normal (perpendicular vector) animation, where orange vectors show normal direction at each polygon vertex.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("3 May 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("19 December 2013") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter19-NormalsShading/Figure19.27SquareFaceAnimatingNormals.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("X3D NormalInterpolator example") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/NormalInterpolator.x3d") \
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
     .setDescription("Animating normals on right vertices of a quadrilateral") \
     .setPosition([0,0,8]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Other side - note difference in animated shading") \
     .setOrientation([0,1,0,3.14159]) \
     .setPosition([0,0,-7]) \
    ) \
    .addChild(Shape() \
     .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,3], normalIndex = [0,1,2,3], solid = False) \
      .setDEF("FlatSquare") \
      .setCoord(Coordinate() \
       .setPoint([-2,-2,0,2,-2,0,2,2,0,-2,2,0]) \
      ) \
# Normal vector with 4 SFVec3f triplet values, one for each corner of quadrilateral 
      .setNormal(Normal() \
       .setDEF("AnimatedNormalNode") \
       .setVector([0,0,1,0,0,1,0,0,1,0,0,1]) \
      ) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setDEF("LightBlue") \
       .setDiffuseColor([0.3,0.6,0.9]) \
      ) \
     ) \
    ) \
# NormalInterpolator keyValue array must match sizes of target Normal vector and key arrays 
# Thus this keyValue array has 4 * 3 = 12 total SFVec3f triplet values 
    .addChild(NormalInterpolator() \
     .setDEF("NormalPath") \
     .setKey([0,0.5,1]) \
     .setKeyValue([0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,1,0,0,1,0,0,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("NormalPath") \
     .setToField("set_vector") \
     .setToNode("AnimatedNormalNode") \
    ) \
    .addChild(TimeSensor() \
     .setDEF("Clock") \
     .setCycleInterval(8) \
     .setLoop(True) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("Clock") \
     .setToField("set_fraction") \
     .setToNode("NormalPath") \
    ) \
# This block above completes the primary functionality of this scene. More to follow, however! 
# ============================================================================================================== 
# Note that a Normal is not rendered - it is invisible. So this scene adds some lines to visualize what is happening. 
    .addChild(Shape() \
     .setGeometry(IndexedLineSet(coordIndex = [0,1,-1,2,3,-1,4,5,-1,6,7,-1]) \
      .setCoord(Coordinate() \
       .setDEF("NormalVectors") \
       .setPoint([-2,-2,0,-2,-2,1,2,-2,0,2,-2,1,2,2,0,2,2,1,-2,2,0,-2,2,1]) \
      ) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setEmissiveColor([0.9,0.6,0.1]) \
      ) \
     ) \
    ) \
    .addChild(CoordinateInterpolator() \
     .setDEF("NormalVectorsAnimation") \
     .setKey([0,0.5,1]) \
     .setKeyValue([-2,-2,0,-2,-2,1,2,-2,0,2,-2,1,2,2,0,2,2,1,-2,2,0,-2,2,1,-2,-2,0,-2,-2,1,2,-2,0,3,-2,0,2,2,0,3,2,0,-2,2,0,-2,2,1,-2,-2,0,-2,-2,1,2,-2,0,2,-2,1,2,2,0,2,2,1,-2,2,0,-2,2,1]) \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("NormalVectorsAnimation") \
     .setToField("point") \
     .setToNode("NormalVectors") \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("Clock") \
     .setToField("set_fraction") \
     .setToNode("NormalVectorsAnimation") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation//NormalInterpolator_RoundTrip.x3d")
