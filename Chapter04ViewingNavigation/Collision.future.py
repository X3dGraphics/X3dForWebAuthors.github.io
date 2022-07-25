from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("Collision.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Illustrate Collision node operation: set Collision enabled=\"true\" to block user navigation through the Kelp Forest tank glass.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman and Leonard Daly") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("1 June 1998") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("13 June 2004") \
     .setName("translated") \
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
     .setContent("http://faculty.nps.edu/brutzman/kelp") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://faculty.nps.edu/brutzman/kelp/KelpForestDesignPaper.pdf") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("Kelp Forest 3D models") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("Revisions Copyright (c) 2006, Daly Realism and Don Brutzman. Original content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute.") \
     .setName("permissions") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestMain.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/Collision.x3d") \
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
    .addChild(NavigationInfo() \
     .setSpeed(3) \
     .setType(["FLY","WALK","ANY"]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Outside Tank, Outside Collision Geometry, Blocked") \
     .setPosition([0,2,40]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Outside Tank, Below Collision Geometry, Can Fly In") \
     .setPosition([0,-4,15]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Inside Tank") \
     .setOrientation([0.21,0.97,-0.14,1.202]) \
     .setPosition([-1.37,-6.94,0.22]) \
    ) \
    .addChild(Collision() \
     .setProxy(Shape() \
# Proxy geometry is not rendered, so we follow it with a duplicate USE node to help see it 
      .setGeometry(Cylinder(bottom = False, height = 6, radius = 12) \
       .setDEF("CollisionProxy") \
       .setTop(False) \
      ) \
     ) \
     .setProxy(Shape() \
      .setDEF("CollisionProxyVisualization") \
      .setGeometry(Cylinder() \
       .setUSE("CollisionProxy") \
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setTransparency(0.5) \
       ) \
      ) \
     ) \
     .setProxy(Inline() \
      .setUrl(["../KelpForestExhibit/KelpTank.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTank.x3d","../KelpForestExhibit/KelpTank.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTank.wrl"]) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter04ViewingNavigation//Collision_RoundTrip.x3d")
