from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ExtrusionRoomWalls.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Wall definition for a room, defined as a cross section and extruded vertically.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("U.S. Naval Postgraduate School (NPS)") \
     .setName("organization") \
    ) \
    .addMeta(meta() \
     .setContent("3 September 2005") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("16 November 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Extrusion example") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionRoomWalls.x3d") \
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
     .setDescription("Extrusion Room Walls") \
     .setOrientation([1,0,0,-0.2]) \
     .setPosition([5,4,15]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Oblique view from above") \
     .setOrientation([1,0,0,-0.78]) \
     .setPosition([5,10,13]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Overhead view") \
     .setOrientation([1,0,0,-1.57]) \
     .setPosition([5,12,3]) \
    ) \
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Transform() \
     .addChild(Shape() \
# be sure to order cross-section points so that normal is upward 
      .setGeometry(Extrusion(convex = False, crossSection = [0,0,0,6,3,6,3,5,1,5,1,1,9,1,9,5,5,5,5,6,10,6,10,0,0,0], spine = [0,0,0,0,2.5,0]) \
# spine is open, crossSection is closed 
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0.8,0.8,0.3]) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons//ExtrusionRoomWalls_RoundTrip.x3d")
