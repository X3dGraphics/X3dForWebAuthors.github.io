from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("WhereAmIPrototype.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Prototype node declaration for displaying current viewpoint location and orientation in the player console.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("1 January 1999") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("5 May 2006") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("17 April 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("WhereAmIExample.x3d") \
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
     .setContent("Copyright 1999, 2006, Daly Realism, Inc.") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/WhereAmIPrototype.x3d") \
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
    .addChild(ProtoDeclare() \
     .setAppinfo("Prototype node for displaying current viewpoint location and orientation") \
     .setName("WhereAmI") \
# No ProtoInterface fields are needed for this prototype 
     .setProtoBody(ProtoBody() \
      .addChild(ProximitySensor(size = [100000,100000,100000]) \
       .setDEF("WhereSensor") \
      ) \
# no geometry is rendered in the current scene by the prototype 
      .addChild(Script() \
       .setDEF("WhereDump") \
       .setUrl(["WhereAmIPrototypeScript.js","../Chapter14Prototypes/WhereAmIPrototypeScript.js","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/WhereAmIPrototypeScript.js"]) \
       .addField(field() \
        .setAccessType("inputOnly") \
        .setName("position") \
        .setType("SFVec3f") \
       ) \
       .addField(field() \
        .setAccessType("inputOnly") \
        .setName("orientation") \
        .setType("SFRotation") \
       ) \
      ) \
      .addChild(ROUTE() \
       .setFromField("orientation_changed") \
       .setFromNode("WhereSensor") \
       .setToField("orientation") \
       .setToNode("WhereDump") \
      ) \
      .addChild(ROUTE() \
       .setFromField("position_changed") \
       .setFromNode("WhereSensor") \
       .setToField("position") \
       .setToNode("WhereDump") \
      ) \
     ) \
    ) \
# ProtoInstance instantiates (creates) a new node using the ProtoDeclare prototype definition 
    .addChild(ProtoInstance() \
     .setName("WhereAmI") \
    ) \
    .addChild(Viewpoint() \
     .setDescription("WhereAmI prototype test") \
    ) \
    .addChild(Shape() \
     .setGeometry(Text() \
      .setString(["Check X3D console","while navigating for","current viewpoint","position, orientation"]) \
      .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"]) \
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
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter14Prototypes//WhereAmIPrototype_RoundTrip.x3d")
