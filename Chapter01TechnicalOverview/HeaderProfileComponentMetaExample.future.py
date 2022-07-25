from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addComponent(component() \
     .setLevel(1) \
     .setName("DIS") \
    ) \
    .addComponent(component() \
     .setLevel(1) \
     .setName("Geospatial") \
    ) \
    .addComponent(component() \
     .setLevel(1) \
     .setName("H-Anim") \
    ) \
    .addComponent(component() \
     .setLevel(3) \
     .setName("NURBS") \
    ) \
    .addMeta(meta() \
     .setContent("HeaderProfileComponentMetaExample.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simple scene demonstrating X3D header, profile, component and meta-tag definitions. The component tags raise the support level from Immersive profile to include other components included in the X3D 3.0 Full profile.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("11 October 2005") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("1 October 2011") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Separate example newScene.x3d presents other example meta tags for potential use, authors can delete unused name-value pairs.") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("newScene.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("../Chapter15Metadata/MetadataExamples.x3d") \
     .setName("reference") \
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
     .setContent("Copyright 2006, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter01TechnicalOverview/HeaderProfileComponentMetaExample.x3d") \
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
# Scene graph nodes are added here 
    .addChild(Background() \
     .setGroundColor([0.2,0.4,0.6]) \
     .setSkyColor([0.2,0.4,0.6]) \
    ) \
    .addChild(Shape() \
     .setGeometry(Text() \
      .setString(["HeaderProfileComponentMetaExample.x3d","shows example use of","header, profile, component and meta tags"]) \
      .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.6) \
      ) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setDiffuseColor([0.6,0.8,1]) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter01TechnicalOverview//HeaderProfileComponentMetaExample_RoundTrip.x3d")
