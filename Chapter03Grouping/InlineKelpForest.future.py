from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("InlineKelpForest.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Inline example that loads the Kelp Forest world.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("19 October 2005") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("12 October 2013") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("X3D profile must be Immersive, rather than Interactive, in order to set up the X3D player to properly support the contained Inline scene KelpForestMain.x3d which has profile Immersive.") \
     .setName("info") \
    ) \
    .addMeta(meta() \
     .setContent("../KelpForestExhibit/KelpForestMain.x3d") \
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
     .setContent("Copyright Don Brutzman and Leonard Daly 2007") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/InlineKelpForest.x3d") \
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
# The following url is an ordered list of multiple addresses that support the following use cases. 
# Use case: (1a) .x3d on local disk or (1b) web server query looks on local server 
# Use case: (2) Older VRML97 browser unable to read X3D, reads .wrl version instead (backwards compatibility) 
# Use case: (3) local copy not available, retrieve from permanent server address 
# Use case: (4) combination of cases (2) and (3), VRML97 on remote server 
# TODO consider simpler scene to illustrate Inline, also consider adding Viewpoint 
    .addChild(Inline() \
     .setUrl(["../KelpForestExhibit/KelpForestMain.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestMain.x3d","../KelpForestExhibit/KelpForestMain.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestMain.wrl"]) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter03Grouping//InlineKelpForest_RoundTrip.x3d")
