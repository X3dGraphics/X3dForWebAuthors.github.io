from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ProximitySensorSingle.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Example of a single ProximitySensor region") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Leonard Daly and Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("15 July 2006") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("5 July 2014") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("ProximitySensorMultiple.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("ProximitySensorNoOverlap.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("ProximitySensorOverlap.x3d") \
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
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/ProximitySensorSingle.x3d") \
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
    .addChild(ExternProtoDeclare() \
     .setName("WhereAmI") \
     .setUrl(["../Chapter14Prototypes/WhereAmIPrototype.x3d#WhereAmI","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/WhereAmIPrototype.x3d#WhereAmI","../Chapter14Prototypes/WhereAmIPrototype.wrl#WhereAmI","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/WhereAmI.wrl#WhereAmI"]) \
    ) \
    .addChild(ProtoInstance() \
     .setName("WhereAmI") \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Book Viewpoint") \
     .setOrientation([0,1,0,-0.06]) \
     .setPosition([0.05,0,8.71]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Inside proximity box") \
     .setOrientation([0,1,0,-0.78]) \
     .setPosition([0,0,0.5]) \
    ) \
    .addChild(NavigationInfo() \
     .setAvatarSize([0.05,1.6,0.75]) \
     .setType(["WALK","ANY"]) \
    ) \
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Collision() \
     .setEnabled(False) \
     .setProxy(Transform() \
      .addChild(ProximitySensor(size = [2,2,2]) \
       .setDEF("HereIAm") \
      ) \
      .addChild(Transform() \
       .setDEF("SensorSize") \
       .addChild(Shape() \
        .setDEF("BoxOutline") \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setEmissiveColor([0.8,0.8,0.8]) \
         ) \
        ) \
        .setGeometry(IndexedLineSet(coordIndex = [0,1,2,3,0,-1,4,5,6,7,4,-1,0,4,-1,1,5,-1,2,6,-1,3,7,-1]) \
         .setCoord(Coordinate() \
          .setPoint([1,1,1,1,1,-1,1,-1,-1,1,-1,1,-1,1,1,-1,1,-1,-1,-1,-1,-1,-1,1]) \
         ) \
        ) \
       ) \
       .addChild(Shape() \
        .setDEF("BoxSurface") \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDiffuseColor([1,.5,0]) \
          .setTransparency(.8) \
         ) \
        ) \
        .setGeometry(Box() \
        ) \
       ) \
      ) \
     ) \
    ) \
    .addChild(Script() \
     .setDEF("LocationReport") \
     .setUrl(["ProximitySensorSingleScriptLocationReport.js","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/ProximitySensorSingleScriptLocationReport.js"]) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("position") \
      .setType("SFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setName("orientation") \
      .setType("SFRotation") \
     ) \
    ) \
    .addChild(ROUTE() \
     .setFromField("position_changed") \
     .setFromNode("HereIAm") \
     .setToField("position") \
     .setToNode("LocationReport") \
    ) \
    .addChild(ROUTE() \
     .setFromField("orientation_changed") \
     .setFromNode("HereIAm") \
     .setToField("orientation") \
     .setToNode("LocationReport") \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound//ProximitySensorSingle_RoundTrip.x3d")
