from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("HeadsUpDisplayPrototype.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Reusable Prototype definition that applies a ProximitySensor for a simple HeadsUpDisplay (HUD) prototype that maintains a stable position for its children on the screen.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("15 July 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("24 October 2016") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("HeadsUpDisplayExample.x3d") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/HeadsUpDisplayPrototype.x3d") \
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
     .setAppinfo("Heads-up display (HUD) keeps child geometry aligned on screen in a consistent location") \
     .setName("HeadsUpDisplay") \
     .setProtoInterface(ProtoInterface() \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("offset position for HUD relative to current view location, default 0 0 -5") \
       .setName("screenOffset") \
       .setType("SFVec3f") \
       .setValue("0 0 -5") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("X3D content positioned at HUD offset") \
       .setName("children") \
       .setType("MFNode") \
# initialization nodes (if any) go here 
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setAppinfo("HUD position update (in world coordinates) relative to original location") \
       .setName("position_changed") \
       .setType("SFVec3f") \
      ) \
      .addField(field() \
       .setAccessType("outputOnly") \
       .setAppinfo("HUD orientation update relative to original location") \
       .setName("orientation_changed") \
       .setType("SFRotation") \
      ) \
     ) \
     .setProtoBody(ProtoBody() \
      .addChild(Group() \
       .addChild(Transform() \
        .setDEF("HudContainer") \
        .addChild(Transform() \
         .setIS(IS() \
          .addConnect(connect() \
           .setNodeField("translation") \
           .setProtoField("screenOffset") \
          ) \
         ) \
         .addChild(Group() \
          .setIS(IS() \
           .addConnect(connect() \
            .setNodeField("children") \
            .setProtoField("children") \
           ) \
          ) \
         ) \
        ) \
       ) \
       .addChild(ProximitySensor(size = [10000000,10000000,10000000]) \
        .setDEF("HereIAm") \
        .setIS(IS() \
         .addConnect(connect() \
          .setNodeField("position_changed") \
          .setProtoField("position_changed") \
         ) \
         .addConnect(connect() \
          .setNodeField("orientation_changed") \
          .setProtoField("orientation_changed") \
         ) \
        ) \
       ) \
       .addChild(ROUTE() \
        .setFromField("orientation_changed") \
        .setFromNode("HereIAm") \
        .setToField("rotation") \
        .setToNode("HudContainer") \
       ) \
       .addChild(ROUTE() \
        .setFromField("position_changed") \
        .setFromNode("HereIAm") \
        .setToField("translation") \
        .setToNode("HudContainer") \
       ) \
      ) \
     ) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Heads-up display (HUD)") \
    ) \
# ProtoDeclare is the \"cookie cutter\" template, ProtoInstance creates an actual occurrence 
# Example use is in separate scene 
    .addChild(Anchor() \
     .setDescription("HeadsUpDisplay Example") \
     .setParameter(["target=_blank"]) \
     .setUrl(["HeadsUpDisplayExample.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/HeadsUpDisplayExample.x3d","HeadsUpDisplayExample.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/HeadsUpDisplayExample.wrl"]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0.8,0.4,0]) \
       ) \
      ) \
      .setGeometry(Text() \
       .setString(["HeadsUpDisplayExample.x3d","is a Prototype declaration file.","","For an example scene using this node,","click this text and view","HeadsUpDisplayExample.x3d"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.8) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter14Prototypes//HeadsUpDisplayPrototype_RoundTrip.x3d")
