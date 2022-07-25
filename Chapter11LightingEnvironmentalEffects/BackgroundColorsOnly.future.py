from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("BackgroundColorsOnly.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Added a Background node to the KelpForest world.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("20 April 2009") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("20 November 2011") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("X3D Background example") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundColorsOnly.x3d") \
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
    .addChild(Background() \
     .setDEF("SandyShallowBottom") \
     .setGroundAngle([0.05,1.52,1.56,1.5707]) \
     .setGroundColor([0.2,0.2,0,0.3,0.3,0,0.5,0.5,0.3,0.1,0.3,0.4,0,0.2,0.4]) \
     .setSkyAngle([0.04,0.05,0.1,1.309,1.570]) \
     .setSkyColor([0.8,0.8,0.2,0.8,0.8,0.2,0.1,0.1,0.6,0.1,0.1,0.6,0.1,0.25,0.8,0.6,0.6,0.9]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Background colors view") \
    ) \
    .addChild(Shape() \
     .setGeometry(Text() \
      .setString(["Background node using","sky and, ground colors"]) \
      .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], style = "BOLD") \
      ) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setDiffuseColor([1,1,1]) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects//BackgroundColorsOnly_RoundTrip.x3d")
