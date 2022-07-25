from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("GeometryPrimitiveSubstituteMeshes.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Substitute IndexedFaceSet mesh versions of Geometry Primitive Nodes: Shape, Box, Cone, Cylinder, Sphere.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("14 July 2018") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("9 April 2019") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Fix Cone and Cylinder IFS, add Sphere IFS") \
     .setName("TODO") \
    ) \
    .addMeta(meta() \
     .setContent("Meshlab: submit issue to support import of Box Cone Cylinder Sphere") \
     .setName("TODO") \
    ) \
    .addMeta(meta() \
     .setContent("X3D-Edit authoring tool Shape wizard: fix height value and endpoint stitching on Cone and Cylinder, add Sphere") \
     .setName("TODO") \
    ) \
    .addMeta(meta() \
     .setContent("Default values have been added to geometry nodes for clarity, ordinarily default values are omitted.") \
     .setName("hint") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/GeometryPrimitiveSubstituteMeshes.x3d") \
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
    .addChild(Transform() \
     .setTranslation([0,2,0]) \
     .addChild(Transform() \
      .setTranslation([-5,0,0]) \
      .addChild(Shape() \
# Box size='2 2 2'/ 
       .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,3,0,-1,7,6,5,4,7,-1,0,4,5,1,0,-1,1,5,6,2,1,-1,2,6,7,3,2,-1,3,7,4,0,3,-1]) \
        .setDEF("IfsMeshBox") \
        .setCoord(Coordinate() \
         .setPoint([1,1,1,1,1,-1,-1,1,-1,-1,1,1,1,-1,1,1,-1,-1,-1,-1,-1,-1,-1,1]) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.2,0.2]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-2.5,0,0]) \
      .addChild(Shape() \
# Cone bottom='true' bottomRadius='1' height='2' side='true'/ 
# Conical polygon with 64-sided base DEF='IfsMeshCone' 
       .setGeometry(IndexedFaceSet(coordIndex = [65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,-1,1,2,3,-1,1,3,4,-1,1,4,5,-1,1,5,6,-1,1,6,7,-1,1,7,8,-1,1,8,9,-1,1,9,10,-1,1,10,11,-1,1,11,12,-1,1,12,13,-1,1,13,14,-1,1,14,15,-1,1,15,16,-1,1,16,17,-1,1,17,18,-1,1,18,19,-1,1,19,20,-1,1,20,21,-1,1,21,22,-1,1,22,23,-1,1,23,24,-1,1,24,25,-1,1,25,26,-1,1,26,27,-1,1,27,28,-1,1,28,29,-1,1,29,30,-1,1,30,31,-1,1,31,32,-1,1,32,33,-1,1,33,34,-1,1,34,35,-1,1,35,36,-1,1,36,37,-1,1,37,38,-1,1,38,39,-1,1,39,40,-1,1,40,41,-1,1,41,42,-1,1,42,43,-1,1,43,44,-1,1,44,45,-1,1,45,46,-1,1,46,47,-1,1,47,48,-1,1,48,49,-1,1,49,50,-1,1,50,51,-1,1,51,52,-1,1,52,53,-1,1,53,54,-1,1,54,55,-1,1,55,56,-1,1,56,57,-1,1,57,58,-1,1,58,59,-1,1,59,60,-1,1,60,61,-1,1,61,62,-1,1,62,63,-1,1,63,64,-1,1,64,65,-1,1,65,66,-1], creaseAngle = 3.14159, solid = False) \
        .setCoord(Coordinate() \
         .setPoint([0,0,0,0,1,0,0.000,0.0,1.000,0.098,0.0,0.995,0.195,0.0,0.981,0.290,0.0,0.957,0.383,0.0,0.924,0.471,0.0,0.882,0.556,0.0,0.831,0.634,0.0,0.773,0.707,0.0,0.707,0.773,0.0,0.634,0.831,0.0,0.556,0.882,0.0,0.471,0.924,0.0,0.383,0.957,0.0,0.290,0.981,0.0,0.195,0.995,0.0,0.098,1.000,0.0,0.000,0.995,0.0,-0.098,0.981,0.0,-0.195,0.957,0.0,-0.290,0.924,0.0,-0.383,0.882,0.0,-0.471,0.831,0.0,-0.556,0.773,0.0,-0.634,0.707,0.0,-0.707,0.634,0.0,-0.773,0.556,0.0,-0.831,0.471,0.0,-0.882,0.383,0.0,-0.924,0.290,0.0,-0.957,0.195,0.0,-0.981,0.098,0.0,-0.995,0.000,0.0,-1.000,-0.098,0.0,-0.995,-0.195,0.0,-0.981,-0.290,0.0,-0.957,-0.383,0.0,-0.924,-0.471,0.0,-0.882,-0.556,0.0,-0.831,-0.634,0.0,-0.773,-0.707,0.0,-0.707,-0.773,0.0,-0.634,-0.831,0.0,-0.556,-0.882,0.0,-0.471,-0.924,0.0,-0.383,-0.957,0.0,-0.290,-0.981,0.0,-0.195,-0.995,0.0,-0.098,-1.000,0.0,-0.000,-0.995,0.0,0.098,-0.981,0.0,0.195,-0.957,0.0,0.290,-0.924,0.0,0.383,-0.882,0.0,0.471,-0.831,0.0,0.556,-0.773,0.0,0.634,-0.707,0.0,0.707,-0.634,0.0,0.773,-0.556,0.0,0.831,-0.471,0.0,0.882,-0.383,0.0,0.924,-0.290,0.0,0.957,-0.195,0.0,0.981,-0.098,0.0,0.995,0.000,0.0,1.000]) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.2,1,0.2]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .addChild(Shape() \
# Cylinder DEF='IfsMeshCylinder' bottom='true' height='2' radius='1' side='true' top='true'/ 
# Cylindrical 64-sided polygon 
       .setGeometry(IndexedFaceSet(coordIndex = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,0,-1,127,126,125,124,123,122,121,120,119,118,117,116,115,114,113,112,111,110,109,108,107,106,105,104,103,102,101,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,127,-1,1,65,64,0,1,-1,2,66,65,1,2,-1,3,67,66,2,3,-1,4,68,67,3,4,-1,5,69,68,4,5,-1,6,70,69,5,6,-1,7,71,70,6,7,-1,8,72,71,7,8,-1,9,73,72,8,9,-1,10,74,73,9,10,-1,11,75,74,10,11,-1,12,76,75,11,12,-1,13,77,76,12,13,-1,14,78,77,13,14,-1,15,79,78,14,15,-1,16,80,79,15,16,-1,17,81,80,16,17,-1,18,82,81,17,18,-1,19,83,82,18,19,-1,20,84,83,19,20,-1,21,85,84,20,21,-1,22,86,85,21,22,-1,23,87,86,22,23,-1,24,88,87,23,24,-1,25,89,88,24,25,-1,26,90,89,25,26,-1,27,91,90,26,27,-1,28,92,91,27,28,-1,29,93,92,28,29,-1,30,94,93,29,30,-1,31,95,94,30,31,-1,32,96,95,31,32,-1,33,97,96,32,33,-1,34,98,97,33,34,-1,35,99,98,34,35,-1,36,100,99,35,36,-1,37,101,100,36,37,-1,38,102,101,37,38,-1,39,103,102,38,39,-1,40,104,103,39,40,-1,41,105,104,40,41,-1,42,106,105,41,42,-1,43,107,106,42,43,-1,44,108,107,43,44,-1,45,109,108,44,45,-1,46,110,109,45,46,-1,47,111,110,46,47,-1,48,112,111,47,48,-1,49,113,112,48,49,-1,50,114,113,49,50,-1,51,115,114,50,51,-1,52,116,115,51,52,-1,53,117,116,52,53,-1,54,118,117,53,54,-1,55,119,118,54,55,-1,56,120,119,55,56,-1,57,121,120,56,57,-1,58,122,121,57,58,-1,59,123,122,58,59,-1,60,124,123,59,60,-1,61,125,124,60,61,-1,62,126,125,61,62,-1,63,127,126,62,63,-1,0,64,127,63,0,-1], creaseAngle = 3.14159, solid = False) \
        .setCoord(Coordinate() \
         .setPoint([0.000,1.0,1.000,0.098,1.0,0.995,0.195,1.0,0.981,0.290,1.0,0.957,0.383,1.0,0.924,0.471,1.0,0.882,0.556,1.0,0.831,0.634,1.0,0.773,0.707,1.0,0.707,0.773,1.0,0.634,0.831,1.0,0.556,0.882,1.0,0.471,0.924,1.0,0.383,0.957,1.0,0.290,0.981,1.0,0.195,0.995,1.0,0.098,1.000,1.0,0.000,0.995,1.0,-0.098,0.981,1.0,-0.195,0.957,1.0,-0.290,0.924,1.0,-0.383,0.882,1.0,-0.471,0.831,1.0,-0.556,0.773,1.0,-0.634,0.707,1.0,-0.707,0.634,1.0,-0.773,0.556,1.0,-0.831,0.471,1.0,-0.882,0.383,1.0,-0.924,0.290,1.0,-0.957,0.195,1.0,-0.981,0.098,1.0,-0.995,0.000,1.0,-1.000,-0.098,1.0,-0.995,-0.195,1.0,-0.981,-0.290,1.0,-0.957,-0.383,1.0,-0.924,-0.471,1.0,-0.882,-0.556,1.0,-0.831,-0.634,1.0,-0.773,-0.707,1.0,-0.707,-0.773,1.0,-0.634,-0.831,1.0,-0.556,-0.882,1.0,-0.471,-0.924,1.0,-0.383,-0.957,1.0,-0.290,-0.981,1.0,-0.195,-0.995,1.0,-0.098,-1.000,1.0,-0.000,-0.995,1.0,0.098,-0.981,1.0,0.195,-0.957,1.0,0.290,-0.924,1.0,0.383,-0.882,1.0,0.471,-0.831,1.0,0.556,-0.773,1.0,0.634,-0.707,1.0,0.707,-0.634,1.0,0.773,-0.556,1.0,0.831,-0.471,1.0,0.882,-0.383,1.0,0.924,-0.290,1.0,0.957,-0.195,1.0,0.981,-0.098,1.0,0.995,0.000,0.0,1.000,0.098,0.0,0.995,0.195,0.0,0.981,0.290,0.0,0.957,0.383,0.0,0.924,0.471,0.0,0.882,0.556,0.0,0.831,0.634,0.0,0.773,0.707,0.0,0.707,0.773,0.0,0.634,0.831,0.0,0.556,0.882,0.0,0.471,0.924,0.0,0.383,0.957,0.0,0.290,0.981,0.0,0.195,0.995,0.0,0.098,1.000,0.0,0.000,0.995,0.0,-0.098,0.981,0.0,-0.195,0.957,0.0,-0.290,0.924,0.0,-0.383,0.882,0.0,-0.471,0.831,0.0,-0.556,0.773,0.0,-0.634,0.707,0.0,-0.707,0.634,0.0,-0.773,0.556,0.0,-0.831,0.471,0.0,-0.882,0.383,0.0,-0.924,0.290,0.0,-0.957,0.195,0.0,-0.981,0.098,0.0,-0.995,0.000,0.0,-1.000,-0.098,0.0,-0.995,-0.195,0.0,-0.981,-0.290,0.0,-0.957,-0.383,0.0,-0.924,-0.471,0.0,-0.882,-0.556,0.0,-0.831,-0.634,0.0,-0.773,-0.707,0.0,-0.707,-0.773,0.0,-0.634,-0.831,0.0,-0.556,-0.882,0.0,-0.471,-0.924,0.0,-0.383,-0.957,0.0,-0.290,-0.981,0.0,-0.195,-0.995,0.0,-0.098,-1.000,0.0,-0.000,-0.995,0.0,0.098,-0.981,0.0,0.195,-0.957,0.0,0.290,-0.924,0.0,0.383,-0.882,0.0,0.471,-0.831,0.0,0.556,-0.773,0.0,0.634,-0.707,0.0,0.707,-0.634,0.0,0.773,-0.556,0.0,0.831,-0.471,0.0,0.882,-0.383,0.0,0.924,-0.290,0.0,0.957,-0.195,0.0,0.981,-0.098,0.0,0.995]) \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
        ) \
# TODO authors can add optional ImageTexture, MovieTexture, PixelTexture, TextureTransform, FillProperties, and/or LineProperties nodes here 
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([2.5,0,0]) \
      .addChild(Shape() \
       .setGeometry(Sphere(radius = 1) \
        .setDEF("IfsMeshSphere") \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,1,0.2]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([5.4,0,0]) \
# Selectable Text design pattern has transparent Box and TouchSensor description as a tooltip 
      .addChild(Group() \
       .addChild(Shape() \
        .setGeometry(Text() \
         .setDEF("IfsMeshText") \
         .setString(["IFS","Meshes"]) \
         .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.6, style = "BOLD") \
          .setDEF("MiddleFontStyle") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setDEF("DefaultAppearance") \
         .setMaterial(Material() \
          .setDEF("DefaultMaterial") \
         ) \
        ) \
       ) \
       .addChild(Shape() \
        .setGeometry(Box(size = [2.5,2,.001]) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setTransparency(1) \
         ) \
        ) \
       ) \
       .addChild(TouchSensor() \
        .setDescription("IndexedFaceSet Meshes") \
       ) \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,-2,0]) \
     .addChild(Transform() \
      .setTranslation([-5,0,0]) \
      .addChild(Shape() \
       .setGeometry(Box(size = [2,2,2]) \
        .setDEF("DefaultBox") \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.2,0.2]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-2.5,0,0]) \
      .addChild(Shape() \
       .setGeometry(Cone(bottom = True, bottomRadius = 1, height = 2, side = True) \
        .setDEF("DefaultCone") \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.2,1,0.2]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .addChild(Shape() \
       .setGeometry(Cylinder(bottom = True, height = 2, radius = 1, side = True) \
        .setDEF("DefaultCylinder") \
        .setTop(True) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.2,0.2,1]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([2.5,0,0]) \
      .addChild(Shape() \
       .setGeometry(Sphere(radius = 1) \
        .setDEF("DefaultSphere") \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,1,0.2]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([5.4,0,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setDEF("DefaultText") \
        .setString(["Geometry","Primitives"]) \
        .setFontStyle(FontStyle() \
         .setUSE("MiddleFontStyle") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setUSE("DefaultAppearance") \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter02GeometryPrimitives//GeometryPrimitiveSubstituteMeshes_RoundTrip.x3d")
