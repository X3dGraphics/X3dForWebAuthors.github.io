from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
# The following component tag is needed since LineProperties node is not part of the default Immersive profile 
    .addComponent(component() \
     .setLevel(2) \
     .setName("Shape") \
    ) \
    .addMeta(meta() \
     .setContent("LineProperties.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Demonstrate various LineProperties values.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("20 August 2008") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("26 December 2013") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("LinePropertiesLinetypeExample.png") \
     .setName("Image") \
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
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/LineProperties.x3d") \
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
     .setDescription("LineProperties linetype examples") \
     .setPosition([0,0,22]) \
    ) \
    .addChild(Transform() \
     .setTranslation([1,-6,0]) \
     .addChild(Transform() \
      .setTranslation([-4,14,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["1 Solid"]) \
        .setFontStyle(FontStyle(justify = ["BEGIN","MIDDLE"]) \
         .setDEF("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0,0]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1]) \
         .setCoord(Coordinate() \
          .setDEF("Segment") \
          .setPoint([0,0,0,2,0,0]) \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([1,0,0]) \
         ) \
         .setLineProperties(LineProperties() \
# linetype='1' solid 
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,13,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["2 Dashed"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0.5,0]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
         .setCoord(Coordinate() \
          .setUSE("Segment") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([1,0.5,0]) \
         ) \
         .setLineProperties(LineProperties() \
          .setLinetype(2) \
# linetype='2' dashed 
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,12,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["3 Dotted"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,1,0]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
         .setCoord(Coordinate() \
          .setUSE("Segment") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([1,1,0]) \
         ) \
         .setLineProperties(LineProperties() \
          .setLinetype(3) \
# linetype='3' dotted 
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,11,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["4 Dashed-dotted"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,1,0]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
         .setCoord(Coordinate() \
          .setUSE("Segment") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([0,1,0]) \
         ) \
         .setLineProperties(LineProperties() \
          .setLinetype(4) \
# linetype='4' dashed-dotted 
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,10,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["5 Dash-dot-dot"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.2,0.2,1]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
         .setCoord(Coordinate() \
          .setUSE("Segment") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([0,0,1]) \
         ) \
         .setLineProperties(LineProperties() \
          .setLinetype(5) \
# linetype='5' dash-dot-dot 
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,9,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["6 (single arrow)"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,0,1]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
         .setCoord(Coordinate() \
          .setUSE("Segment") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([1,0,1]) \
         ) \
         .setLineProperties(LineProperties() \
          .setLinetype(6) \
# linetype='6' (optional support) single arrow, meainging single arrowhead at final vertex, in this case pointing to right 
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,8,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["7 (single dot)"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,1,1]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
         .setCoord(Coordinate() \
          .setUSE("Segment") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([0,1,1]) \
         ) \
         .setLineProperties(LineProperties() \
          .setLinetype(7) \
# linetype='7' (optional support) single dot 
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,7,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["8 (double arrow)"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([1,1,1]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
         .setCoord(Coordinate() \
          .setUSE("Segment") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([1,1,1]) \
         ) \
         .setLineProperties(LineProperties() \
          .setLinetype(8) \
# linetype='8' (optional support) double arrow, meaning arrow heads at each end 
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,6,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["9 [no entry]"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.2,0.2,0.2]) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,5,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["10 (chain line)"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.5,0.5,0.5]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
         .setCoord(Coordinate() \
          .setUSE("Segment") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([1,0,0]) \
         ) \
         .setLineProperties(LineProperties() \
          .setLinetype(10) \
# linetype='10' (optional support) chain line 
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,4,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["11 (center line)"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.8,0.2,0.2]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
         .setCoord(Coordinate() \
          .setUSE("Segment") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([0.8,0.2,0.2]) \
         ) \
         .setLineProperties(LineProperties() \
          .setLinetype(11) \
# linetype='11' (optional support) center line 
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,3,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["12 (hidden line)"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.5,0.5,0.1]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
         .setCoord(Coordinate() \
          .setUSE("Segment") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([0.5,0.5,0.1]) \
         ) \
         .setLineProperties(LineProperties() \
          .setLinetype(12) \
# linetype='12' (optional support) hidden line 
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,2,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["13 (phantom line)"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.8,0.8,0.2]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
         .setCoord(Coordinate() \
          .setUSE("Segment") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([0.8,0.8,0.2]) \
         ) \
         .setLineProperties(LineProperties() \
          .setLinetype(13) \
# linetype='13' (optional support) phantom line 
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,1,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["14 (break line 1)"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.2,0.8,0.2]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
         .setCoord(Coordinate() \
          .setUSE("Segment") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([0.2,0.8,0.2]) \
         ) \
         .setLineProperties(LineProperties() \
          .setLinetype(14) \
# linetype='14' (optional support) break line 1 
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,0,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["15 (break line 2)"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.2,0.2,0.8]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
         .setCoord(Coordinate() \
          .setUSE("Segment") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([0.2,0.2,0.8]) \
         ) \
         .setLineProperties(LineProperties() \
          .setLinetype(15) \
# linetype='15' (optional support) break line 2 
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Transform() \
      .setTranslation([-4,-1,0]) \
      .addChild(Shape() \
       .setGeometry(Text() \
        .setString(["16 (user-specified dash pattern)"]) \
        .setFontStyle(FontStyle() \
         .setUSE("LeftJustify") \
        ) \
       ) \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0.7,0.7,0.7]) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([-4,0,0]) \
       .addChild(Shape() \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,-1]) \
         .setCoord(Coordinate() \
          .setUSE("Segment") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([0.7,0.7,0.7]) \
         ) \
         .setLineProperties(LineProperties() \
          .setLinetype(16) \
# linetype='16' (optional support) user-specified dash pattern 
         ) \
        ) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures//LineProperties_RoundTrip.x3d")
