from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("SeaStarHighResolutionExample.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example instance of a SeaStar high-resolution prototype using default settings.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Charles Adams") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("19 December 2002") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("21 March 2009") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Copyright (c) c h a productions 2002") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarHighResolutionExample.x3d") \
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
     .setDescription("Sea star, high resolution") \
     .setOrientation([1,0,0,-1.57]) \
     .setPosition([0,0.2,0]) \
    ) \
# note mismatch between filename SeaStarHighResolutionPrototype.x3d and prototype name SeaStar 
    .addChild(ExternProtoDeclare() \
     .setName("SeaStar") \
     .setUrl(["SeaStarHighResolutionPrototype.x3d#SeaStar","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarHighResolutionPrototype.x3d#SeaStar","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarHighResolutionPrototype.wrl#SeaStar","SeaStarHighResolutionPrototype.wrl#SeaStar"]) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("scale") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setName("Appearance") \
      .setType("SFNode") \
     ) \
    ) \
    .addChild(ProtoInstance() \
     .setName("SeaStar") \
     .addFieldValue(fieldValue() \
      .setName("Appearance") \
      .addChild(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,0.490196,0.380392]) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/KelpForestExhibit//SeaStarHighResolutionExample_RoundTrip.x3d")
