from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("X3dBookWebsiteLogo.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Extrusion of X3D book used for x3dGraphics.com website logo") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("26 February 2007") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("29 October 2012") \
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
     .setContent("Copyright Don Brutzman and Leonard Daly 2007") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("X3dBookLogo.jpg") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/X3dBookWebsiteLogo.x3d") \
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
    .addMeta(meta() \
     .setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit") \
     .setName("generator") \
    ) \
   ) \
   .setScene(Scene() \
    .addChild(Background() \
     .setSkyColor([.6,.8,1]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("front view") \
     .setOrientation([1,0,0,-1.25]) \
     .setPosition([0,0.8,.6]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("bottom view") \
     .setPosition([0,0,2]) \
    ) \
    .addChild(Transform() \
     .addChild(Shape() \
      .setGeometry(Extrusion(ccw = False, creaseAngle = 1, crossSection = [0,.04,.028,.025,.05,0,.3,0,.25,.1,.07,.1,.035,.088,0,.06,-.035,.088,-.07,.1,-.25,.1,-.3,0,-.05,0,-.025,.028,0,.04], spine = [0,0,.25,0,0,-.25]) \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([.8,.9,.8]) \
       ) \
       .setTexture(ImageTexture(repeatS = False, repeatT = False) \
        .setUrl(["X3dImageRotated.png","X3dImageRotated.gif","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/X3dImageRotated.png","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/X3dImageRotated.gif"]) \
       ) \
       .setTextureTransform(TextureTransform() \
        .setCenter([-.5,0]) \
        .setScale([2,1]) \
       ) \
# TODO restore image, use TextureTransform rotation instead 
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons//X3dBookWebsiteLogo_RoundTrip.x3d")
