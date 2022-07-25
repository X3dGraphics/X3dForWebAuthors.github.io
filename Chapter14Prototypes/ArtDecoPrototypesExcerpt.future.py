from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ArtDecoPrototypesExcerpt.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Prototype declarations defining values for X3D/VRML materials, originally converted from SGI's Open Inventor material examples. Excerpted from original.") \
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
     .setContent("27 March 2009") \
     .setName("modified") \
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
     .setContent("http://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials/ArtDecoPrototypes.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.x3d") \
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
# note some url addresses changed to reference local excerpt 
    .addChild(ProtoDeclare() \
     .setAppinfo("UniversalMediaMaterials prototype") \
     .setDocumentation("http://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials") \
     .setName("ArtDeco00") \
     .setProtoBody(ProtoBody() \
      .addChild(Material() \
       .setAmbientIntensity(0.25) \
       .setDiffuseColor([0.282435,0.085159,0.134462]) \
       .setShininess(0.127273) \
       .setSpecularColor([0.276305,0.11431,0.139857]) \
      ) \
     ) \
    ) \
    .addChild(ProtoDeclare() \
     .setAppinfo("UniversalMediaMaterials prototype") \
     .setDocumentation("http://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials") \
     .setName("ArtDeco01") \
     .setProtoBody(ProtoBody() \
      .addChild(Material() \
       .setAmbientIntensity(0.254777) \
       .setDiffuseColor([0.685208,0.134679,0.332385]) \
       .setShininess(0.071429) \
       .setSpecularColor([0.122449,0.050035,0.050035]) \
      ) \
     ) \
    ) \
    .addChild(ProtoDeclare() \
     .setAppinfo("UniversalMediaMaterials prototype") \
     .setDocumentation("http://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials") \
     .setName("ArtDeco02") \
# computed conversion ambientIntensity=1.745282, normalized to 1.0 
     .setProtoBody(ProtoBody() \
      .addChild(Material() \
       .setAmbientIntensity(1.0) \
       .setDiffuseColor([0.536861,0.0529,0.245479]) \
       .setShininess(0.832432) \
       .setSpecularColor([0.805292,0.765198,0.747416]) \
      ) \
     ) \
    ) \
    .addChild(Anchor() \
     .setDescription("ArtDecoPrototypeExample") \
     .setParameter(["target=_blank"]) \
     .setUrl(["ArtDecoExamplesExcerpt.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.x3d"]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
# replace Material node with a corresponding Prototype 
       .setMaterial(ProtoInstance() \
        .setName("ArtDeco00") \
       ) \
      ) \
      .setGeometry(Text() \
       .setString(["ArtDecoPrototypesExcerpt.x3d","is a Materials Prototype declaration file.","","For an example scene using these nodes,","click this text and view","ArtDecoExamplesExcerpt.x3d"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.8) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter14Prototypes//ArtDecoPrototypesExcerpt_RoundTrip.x3d")
