from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("AmbientIntensity.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("This example illustrates the effect of an ambientIntensity field from a Sphere on a Cone. Note that navigation reports of user position and orientation from the WhereAmI prototype appear in the player console.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("2 February 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("2 February 2006") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("17 April 2017") \
     .setName("modified") \
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
     .setContent("Copyright (c) 2006, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/AmbientIntensity.x3d") \
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
     .setDescription("Default Viewpoint") \
     .setPosition([0,0,10.00]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book Viewpoint") \
     .setOrientation([-1.,0.04,0.008,0.2406]) \
     .setPosition([-0.036,2.17,8.89]) \
    ) \
    .addChild(Transform() \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([1,0,0]) \
        .setSpecularColor([0,1,0]) \
        .setTransparency(.8) \
       ) \
      ) \
      .setGeometry(Cone() \
      ) \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([0,0,-6]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setAmbientIntensity(.8) \
        .setDiffuseColor([0,0,1]) \
       ) \
      ) \
      .setGeometry(Sphere() \
      ) \
     ) \
    ) \
    .addChild(ExternProtoDeclare() \
     .setName("WhereAmI") \
     .setUrl(["../Chapter14Prototypes/WhereAmIPrototype.x3d#WhereAmI","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/WhereAmIPrototype.x3d#WhereAmI","../Chapter14Prototypes/WhereAmIPrototype.wrl#WhereAmI","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/WhereAmI.wrl#WhereAmI"]) \
    ) \
    .addChild(ProtoInstance() \
     .setName("WhereAmI") \
    ) \
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures//AmbientIntensity_RoundTrip.x3d")
