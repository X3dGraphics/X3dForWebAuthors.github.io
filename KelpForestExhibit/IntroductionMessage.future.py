from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("IntroductionMessage.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Welcome text message (positioned high and low) that introduces visitor to Kelp Forest Exhibit upon initial entry - zoom camera back beyond 40m range to make this text visible.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Todd Gagnon and Mark A. Boyd") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("1 June 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("17 December 2002") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("22 March 2009") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("http://faculty.nps.edu/brutzman/kelp") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Kelp Forest 3D models") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute.") \
     .setName("accessRights") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/IntroductionMessage.x3d") \
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
    .addChild(WorldInfo() \
     .setInfo(["Level of detail introduction message for model of the Monterey Bay Aquarium Kelp Forest","DTG of last Update: 021900Jun98","Added: ","Updated: messageTwo1.2.wrl","Modeled by: Todd Gagnon and Mark A. Boyd"]) \
     .setTitle("introductionMessage1.2.wrl") \
    ) \
# This is a sort of \"reverse\" LOD: text is hidden at close range to avoid distraction, but becomes visible when seen from entry viewpoint (behond LOD range 40m). 
    .addChild(NavigationInfo() \
     .setSpeed(10) \
     .setType(["FLY","ANY"]) \
    ) \
    .addChild(LOD() \
     .setForceTransitions(True) \
     .setRange([30]) \
     .addChild(WorldInfo() \
      .setInfo(["null node"]) \
     ) \
     .addChild(Group() \
      .addChild(Transform() \
       .setTranslation([0.0,30.0,-60.0]) \
       .addChild(Shape() \
        .setAppearance(Appearance() \
         .setDEF("WordsAppearance") \
         .setMaterial(Material() \
          .setDiffuseColor([0.9,0.9,0.9]) \
          .setEmissiveColor([1.0,1.0,1.0]) \
         ) \
        ) \
        .setGeometry(Text() \
         .setString(["Welcome to the NPS simulation of the","Monterey Bay Aquarium Kelp Forest"]) \
         .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 6.0, style = "BOLD") \
         ) \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([0.0,-30.0,-60.0]) \
       .addChild(Shape() \
        .setAppearance(Appearance() \
         .setUSE("WordsAppearance") \
        ) \
        .setGeometry(Text() \
         .setString(["Find sharks!  See new viewpoints!","Press PageDown, wait and watch."]) \
         .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 5.0, style = "BOLD") \
         ) \
        ) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//IntroductionMessage_RoundTrip.x3d")
