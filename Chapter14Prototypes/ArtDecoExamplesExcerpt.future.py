from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ArtDecoExamplesExcerpt.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example ExternProtoDeclare/ProtoInstance usage of X3D/VRML materials, originally converted from SGI's Open Inventor material examples. Excerpted from original.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("David Roussel") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("James Harney, Don Brutzman NPS") \
     .setName("translator") \
    ) \
    .addMeta(meta() \
     .setContent("7 April 2002") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("5 September 2011") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Xj3D not displaying materials loaded from ExternProtoDeclare ProtoInstance nodes") \
     .setName("TODO") \
    ) \
    .addMeta(meta() \
     .setContent("http://vrmlstuff.free.fr/materials") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Universal Media Material Library") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials/ArtDecoExamples.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoExamplesExcerpt.x3d") \
     .setName("identifier") \
    ) \
    .addMeta(meta() \
     .setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html") \
     .setName("generator") \
    ) \
    .addMeta(meta() \
     .setContent("../license.html") \
     .setName("license") \
    ) \
   ) \
   .setScene(Scene() \
# Note that these url address references were changed from original collection in Basic X3D Examples Archive and instead reference local excerpt 
    .addChild(ExternProtoDeclare() \
     .setAppinfo("UniversalMediaMaterials prototype") \
     .setDocumentation("http://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials") \
     .setName("ArtDeco00") \
     .setUrl(["ArtDecoPrototypesExcerpt.x3d#ArtDeco00","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.x3d#ArtDeco00","ArtDecoPrototypesExcerpt.wrl#ArtDeco00","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.wrl#ArtDeco00"]) \
    ) \
    .addChild(ExternProtoDeclare() \
     .setAppinfo("UniversalMediaMaterials prototype") \
     .setDocumentation("http://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials") \
     .setName("ArtDeco01") \
     .setUrl(["ArtDecoPrototypesExcerpt.x3d#ArtDeco01","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.x3d#ArtDeco01","ArtDecoPrototypesExcerpt.wrl#ArtDeco01","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.wrl#ArtDeco01"]) \
    ) \
    .addChild(ExternProtoDeclare() \
     .setAppinfo("UniversalMediaMaterials prototype") \
     .setDocumentation("http://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials") \
     .setName("ArtDeco02") \
     .setUrl(["ArtDecoPrototypesExcerpt.x3d#ArtDeco02","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.x3d#ArtDeco02","ArtDecoPrototypesExcerpt.wrl#ArtDeco02","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.wrl#ArtDeco02"]) \
    ) \
    .addChild(Group() \
     .addChild(NavigationInfo() \
      .setHeadlight(False) \
     ) \
     .addChild(Viewpoint() \
      .setDEF("Front") \
      .setDescription("Front view") \
      .setPosition([0.0,0.0,12.0]) \
     ) \
     .addChild(Viewpoint() \
      .setDEF("PersRight") \
      .setDescription("Low Right") \
      .setOrientation([0.74291,0.30772,0.59447,1.2171]) \
      .setPosition([6.9282,-6.9282,6.9282]) \
     ) \
     .addChild(Viewpoint() \
      .setDEF("PersLeft") \
      .setDescription("Low Left") \
      .setOrientation([0.74291,-0.30772,-0.59447,1.2171]) \
      .setPosition([-6.9282,-6.9282,6.9282]) \
     ) \
     .addChild(Viewpoint() \
      .setDEF("Back") \
      .setDescription("Back view") \
      .setOrientation([0.0,1.0,0.0,3.1416]) \
      .setPosition([0.0,0.0,-12.0]) \
     ) \
     .addChild(Transform() \
      .setDEF("Close_travel") \
      .addChild(PositionInterpolator() \
       .setDEF("Close_Mover") \
       .setKey([0.0,0.25,0.5,0.75,1.0]) \
       .setKeyValue([0.0,2.5,0.0,0.0,0.0,0.0,0.0,-2.5,0.0,0.0,0.0,0.0,0.0,2.5,0.0]) \
      ) \
      .addChild(TimeSensor() \
       .setDEF("Close_Time") \
       .setCycleInterval(12.0) \
       .setLoop(True) \
      ) \
      .addChild(Viewpoint() \
       .setDEF("Close") \
       .setDescription("Close Front") \
       .setPosition([0.0,0.0,6.0]) \
      ) \
     ) \
     .addChild(DirectionalLight() \
      .setDirection([1.0,-1.0,-1.0]) \
     ) \
     .addChild(DirectionalLight() \
      .setDirection([0.0,1.0,-0.5]) \
      .setIntensity(0.5) \
     ) \
     .addChild(Anchor() \
      .setDescription("Back to front view") \
      .setUrl(["#Front"]) \
      .addChild(Transform() \
       .setTranslation([0.0,0.0,-0.5]) \
       .addChild(Inline() \
        .setUrl(["../../Basic/UniversalMediaMaterials/gridBack.x3d","http://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials/gridBack.x3d","../../Basic/UniversalMediaMaterials/gridBack.wrl","http://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials/gridBack.wrl"]) \
       ) \
      ) \
     ) \
     .addChild(Viewpoint() \
      .setDEF("View00") \
      .setDescription("ArtDeco00") \
      .setPosition([-3.75,3.75,3.0]) \
     ) \
     .addChild(Transform() \
      .setTranslation([-3.75,3.75,0.0]) \
      .addChild(Anchor() \
       .setDescription("ArtDeco00 view") \
       .setUrl(["#View00"]) \
       .addChild(Shape() \
        .setAppearance(Appearance() \
         .setMaterial(ProtoInstance() \
          .setName("ArtDeco00") \
         ) \
        ) \
        .setGeometry(Sphere(radius = 0.5) \
         .setDEF("Ball") \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([0.0,0.3,0.5]) \
       .addChild(Anchor() \
        .setDescription("ArtDeco") \
        .setParameter(["target=_source"]) \
        .setUrl(["ArtDecoPrototypesExcerpt.html#ProtoDeclare_ArtDeco00","http://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials/ArtDecoPrototypesExcerpt.html#ProtoDeclare_ArtDeco"]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setDEF("TextMat") \
           .setDiffuseColor([1.0,1.0,1.0]) \
          ) \
         ) \
         .setGeometry(Text() \
          .setString(["ArtDeco00"]) \
          .setFontStyle(FontStyle(family = ["SANS"], justify = ["MIDDLE","MIDDLE"], size = 0.3, style = "BOLD") \
           .setDEF("Style") \
          ) \
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Viewpoint() \
      .setDEF("View01") \
      .setDescription("ArtDeco01") \
      .setPosition([-2.25,3.75,3.0]) \
     ) \
     .addChild(Transform() \
      .setTranslation([-2.25,3.75,0.0]) \
      .addChild(Anchor() \
       .setDescription("ArtDeco01 view") \
       .setUrl(["#View01"]) \
       .addChild(Shape() \
        .setAppearance(Appearance() \
         .setMaterial(ProtoInstance() \
          .setName("ArtDeco01") \
         ) \
        ) \
        .setGeometry(Sphere() \
         .setUSE("Ball") \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([0.0,0.3,0.5]) \
       .addChild(Anchor() \
        .setDescription("ArtDeco01") \
        .setParameter(["target=_source"]) \
        .setUrl(["ArtDecoPrototypesExcerpt.html#ProtoDeclare_ArtDeco01","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.html#ProtoDeclare_ArtDeco01"]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setUSE("TextMat") \
          ) \
         ) \
         .setGeometry(Text() \
          .setString(["ArtDeco01"]) \
          .setFontStyle(FontStyle() \
           .setUSE("Style") \
          ) \
         ) \
        ) \
       ) \
      ) \
     ) \
     .addChild(Viewpoint() \
      .setDEF("View02") \
      .setDescription("ArtDeco02") \
      .setPosition([-0.75,3.75,3.0]) \
     ) \
     .addChild(Transform() \
      .setTranslation([-0.75,3.75,0.0]) \
      .addChild(Anchor() \
       .setDescription("ArtDeco02 view") \
       .setUrl(["#View02"]) \
       .addChild(Shape() \
        .setAppearance(Appearance() \
         .setMaterial(ProtoInstance() \
          .setName("ArtDeco02") \
         ) \
        ) \
        .setGeometry(Sphere() \
         .setUSE("Ball") \
        ) \
       ) \
      ) \
      .addChild(Transform() \
       .setTranslation([0.0,0.3,0.5]) \
       .addChild(Anchor() \
        .setDescription("ArtDeco02") \
        .setParameter(["target=_source"]) \
        .setUrl(["ArtDecoPrototypesExcerpt.html#ProtoDeclare_ArtDeco02","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.html#ProtoDeclare_ArtDeco02"]) \
        .addChild(Shape() \
         .setAppearance(Appearance() \
          .setMaterial(Material() \
           .setUSE("TextMat") \
          ) \
         ) \
         .setGeometry(Text() \
          .setString(["ArtDeco02"]) \
          .setFontStyle(FontStyle() \
           .setUSE("Style") \
          ) \
         ) \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("fraction_changed") \
     .setFromNode("Close_Time") \
     .setToField("set_fraction") \
     .setToNode("Close_Mover") \
    ) \
    .addChild(ROUTE() \
     .setFromField("value_changed") \
     .setFromNode("Close_Mover") \
     .setToField("set_translation") \
     .setToNode("Close_travel") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter14Prototypes//ArtDecoExamplesExcerpt_RoundTrip.x3d")
