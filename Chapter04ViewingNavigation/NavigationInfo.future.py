from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("NavigationInfo.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("NavigationInfo override example for Kelp Forest world.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("14 November 2005") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("10 January 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Contained Inline scene has profile Immersive") \
     .setName("info") \
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
     .setContent("Copyright (c) 2005, Daly Realism and Don Brutzman") \
     .setName("rights") \
    ) \
    .addMeta(meta() \
     .setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/NavigationInfo.x3d") \
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
# Because these NavigationInfo nodes are here in the parent scene, the first one is bound at load time, and thus governs the active navigation modes 
# Note that an author can control what choices a user has available, and initial type selected, while the user can select among navigation choices from available options 
# Author TODO: Experiment by swapping order of these NavigationInfo nodes, first one is bound at load time 
    .addChild(NavigationInfo() \
     .setDEF("DEFAULT_EXAMINE_FIRST") \
    ) \
    .addChild(NavigationInfo() \
     .setDEF("FLY_FIRST") \
     .setType(["FLY","ANY"]) \
    ) \
    .addChild(NavigationInfo() \
     .setDEF("SIT_TIGHT") \
     .setType(["NONE"]) \
    ) \
# Also note that this scene does not provide a way to select a different NavigationInfo node during run time 
    .addChild(Inline() \
     .setUrl(["../HelloWorld.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/HelloWorld.x3d","../HelloWorld.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/HelloWorld.wrl"]) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter04ViewingNavigation//NavigationInfo_RoundTrip.x3d")
