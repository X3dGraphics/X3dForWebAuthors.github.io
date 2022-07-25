from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("Billboard.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Illustrates Billboard operation using Kelp Forest example scenes for Figure 4.4, X3D for Web Authors.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman and Leonard Daly") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("13 June 2004") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("2 October 2016") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Contained Inline scenes each have profile Immersive") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/Billboard.x3d") \
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
     .setGroundAngle([1.309,1.5707]) \
     .setGroundColor([0.1,0.1,0.0,0.4,0.25,0.2,0.6,0.6,0.6]) \
     .setSkyAngle([1.309,1.5707]) \
     .setSkyColor([0.0,0.5,1.0,0.0,0.0,1.0,0.0,0.0,1.0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Entry view from ahead, no rotations") \
     .setPosition([0,-5,45]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Observe Billboard effect: text remains visible while navigating around") \
     .setOrientation([0,1,0,0.86]) \
     .setPosition([37.01,-5,29.59]) \
    ) \
    .addChild(Billboard() \
     .setAxisOfRotation([0,1.0,0]) \
     .addChild(Inline() \
      .setUrl(["../KelpForestExhibit/IntroductionMessage.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/../KelpForestExhibit/IntroductionMessage.x3d","../KelpForestExhibit/IntroductionMessage.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/IntroductionMessage.x3d"]) \
     ) \
    ) \
    .addChild(Inline() \
     .setUrl(["../KelpForestExhibit/KelpTank.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/../KelpForestExhibit/KelpTank.x3d","../KelpForestExhibit/KelpTank.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTank.x3d"]) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter04ViewingNavigation//Billboard_RoundTrip.x3d")
