from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("CoordinateAxesInlineExample.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("2 September 2000") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("2 September 2013") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("X Y Z axis arrows and labels in X3D/VRML coordinate system. Shows use of CoordinateAxesVrml as Inline for coordinate-system reference frames.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("CoordinateAxes.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("X3D profile must be Immersive, rather than Interactive, in order to set up the X3D player to properly support the contained Inline scene CoordinateAxes.x3d which has profile Immersive.") \
     .setName("warning") \
    ) \
    .addMeta(meta() \
     .setContent("https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxesInlineExample.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxesInlineExample.x3d") \
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
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Transform() \
     .setScale([2,2,2]) \
     .addChild(Inline() \
      .setDEF("CoordinateAxes") \
      .setUrl(["../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","../../../Savage/Tools/Authoring/CoordinateAxes.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d","../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","../../../Savage/Tools/Authoring/CoordinateAxes.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.wrl"]) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping//CoordinateAxesInlineExample_RoundTrip.x3d")
