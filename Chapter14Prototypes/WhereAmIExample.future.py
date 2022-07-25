from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("WhereAmIExample.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example use of prototype node for displaying current viewpoint location and orientation in the player console.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("28 March 2016") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("15 April 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("WhereAmIPrototype.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("WhereAmIExample.console.txt") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://savage.nps.edu/Savage/Tools/Authoring/ViewPositionOrientationExample.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("https://savage.nps.edu/Savage/Tools/Authoring/ViewPositionOrientationPrototype.x3d") \
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
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/WhereAmIExample.x3d") \
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
# ==================== 
# Only one copy of a given ExternProtoDeclare is needed in a scene. 
    .addChild(ExternProtoDeclare() \
     .setName("WhereAmI") \
     .setUrl(["../Chapter14Prototypes/WhereAmIPrototype.x3d#WhereAmI","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/WhereAmIPrototype.x3d#WhereAmI","../Chapter14Prototypes/WhereAmIPrototype.wrl#WhereAmI","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/WhereAmI.wrl#WhereAmI"]) \
    ) \
    .addChild(ProtoInstance() \
     .setName("WhereAmI") \
    ) \
# ==================== 
    .addChild(Viewpoint() \
     .setDescription("WhereAmI prototype test") \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Viewpoint 2") \
     .setOrientation([0,1,0,1.570796]) \
     .setPosition([10,0,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Viewpoint 3") \
     .setOrientation([0,1,0,-3.141593]) \
     .setPosition([0,0,-10]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Viewpoint 4") \
     .setOrientation([0,1,0,-1.570796]) \
     .setPosition([-10,0,0]) \
    ) \
    .addChild(Shape() \
     .setGeometry(Text() \
      .setString(["Check X3D console","while navigating to see","current viewpoint values"]) \
      .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.9) \
       .setSpacing(0.9) \
      ) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setAmbientIntensity(0.23) \
       .setDiffuseColor([0.5,0.243312,0.127417]) \
       .setEmissiveColor([0.015957,0.015957,0.015957]) \
       .setShininess(0.03) \
       .setSpecularColor([0.276596,0.055086,0.01524]) \
      ) \
     ) \
    ) \
    .addChild(Shape() \
     .setGeometry(Box(size = [8.5,3,0.5]) \
     ) \
     .setAppearance(Appearance() \
      .setMaterial(Material() \
       .setDiffuseColor([0.9,0.9,0.9]) \
       .setTransparency(0.8) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter14Prototypes//WhereAmIExample_RoundTrip.x3d")
