from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ViewFrustumPrototype.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Define a view frustum associated with a given pair of Viewpoint and NavigationInfo nodes, provided as a reusable prototype.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("16 August 2008") \
     .setName("translated") \
    ) \
    .addMeta(meta() \
     .setContent("15 April 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("ViewFrustumExample.x3d") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("ViewFrustumComputation.png") \
     .setName("drawing") \
    ) \
    .addMeta(meta() \
     .setContent("ViewFrustumOverheadView.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("ViewFrustumObliqueView.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("view culling frustum") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ViewFrustumPrototype.x3d") \
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
    .addChild(ProtoDeclare() \
     .setAppinfo("Display view frustum associated with a given pair of Viewpoint NavigationInfo nodes") \
     .setName("ViewFrustum") \
     .setProtoInterface(ProtoInterface() \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("required: insert Viewpoint DEF or USE node for view of interest") \
       .setName("ViewpointNode") \
       .setType("SFNode") \
# NULL node, ProtoInstance must provide 
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("required: insert NavigationInfo DEF or USE node of interest") \
       .setName("NavigationInfoNode") \
       .setType("SFNode") \
# NULL node, ProtoInstance must provide 
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("whether or not frustum geometry is rendered") \
       .setName("visible") \
       .setType("SFBool") \
       .setValue("true") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("RGB color of ViewFrustum outline, default value 0.9 0.9 0.9") \
       .setName("lineColor") \
       .setType("SFColor") \
       .setValue("0.9 0.9 0.9") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("RGB color of ViewFrustum hull geometry, default value 0.8 0.8 0.8") \
       .setName("frustumColor") \
       .setType("SFColor") \
       .setValue("0.8 0.8 0.8") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("transparency of ViewFrustum hull geometry, default value 0.5") \
       .setName("transparency") \
       .setType("SFFloat") \
       .setValue("0.5") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("assumed ratio height/width, default value 0.75") \
       .setName("aspectRatio") \
       .setType("SFFloat") \
       .setValue("0.75") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("debug support, default false") \
       .setName("trace") \
       .setType("SFBool") \
       .setValue("false") \
      ) \
     ) \
     .setProtoBody(ProtoBody() \
      .addChild(Switch() \
       .setDEF("VisibilitySwitch") \
       .setWhichChoice(-1) \
       .addChild(Transform() \
        .setDEF("PositionTransform") \
        .setRotation([0,1,0,3.14159]) \
        .addChild(Transform() \
         .setDEF("OrientationTransform") \
         .addChild(Shape() \
          .setGeometry(IndexedLineSet(coordIndex = [0,1,2,3,0,-1,4,5,6,7,4,-1,0,4,-1,1,5,-1,2,6,-1,3,7,-1]) \
           .setDEF("FrustumLines") \
           .setCoord(Coordinate() \
            .setDEF("FrustumCoordinate") \
            .setPoint([0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]) \
           ) \
          ) \
          .setAppearance(Appearance() \
           .setMaterial(Material() \
            .setIS(IS() \
             .addConnect(connect() \
              .setNodeField("emissiveColor") \
              .setProtoField("lineColor") \
             ) \
            ) \
           ) \
          ) \
         ) \
         .addChild(Shape() \
          .setGeometry(Extrusion() \
           .setDEF("FrustumExtrusion") \
          ) \
          .setAppearance(Appearance() \
           .setDEF("FrustumAppearance") \
           .setMaterial(Material() \
            .setIS(IS() \
             .addConnect(connect() \
              .setNodeField("diffuseColor") \
              .setProtoField("frustumColor") \
             ) \
             .addConnect(connect() \
              .setNodeField("transparency") \
              .setProtoField("transparency") \
             ) \
            ) \
           ) \
          ) \
         ) \
         .addChild(Shape() \
          .setGeometry(Sphere(radius = 0.08) \
          ) \
          .setAppearance(Appearance() \
           .setUSE("FrustumAppearance") \
          ) \
         ) \
        ) \
       ) \
      ) \
      .addChild(Script(directOutput = True) \
       .setDEF("GeometryComputationScript") \
       .setUrl(["ViewFrustumPrototypeScript.js","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ViewFrustumPrototypeScript.js"]) \
       .addField(field() \
        .setAccessType("inputOutput") \
        .setAppinfo("Whether or not frustum geometry is rendered") \
        .setName("visible") \
        .setType("SFBool") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setAppinfo("Adjust Switch selection to make geometry visible or not") \
        .setName("visibilitySwitchSelection") \
        .setType("SFInt32") \
       ) \
       .addField(field() \
        .setAccessType("initializeOnly") \
        .setName("ViewpointNode") \
        .setType("SFNode") \
# initialization node (if any) goes here 
       ) \
       .addField(field() \
        .setAccessType("initializeOnly") \
        .setName("NavigationInfoNode") \
        .setType("SFNode") \
# initialization node (if any) goes here 
       ) \
       .addField(field() \
        .setAccessType("initializeOnly") \
        .setName("FrustumCoordinate") \
        .setType("SFNode") \
        .addChild(Coordinate() \
         .setUSE("FrustumCoordinate") \
        ) \
       ) \
       .addField(field() \
        .setAccessType("initializeOnly") \
        .setName("FrustumExtrusion") \
        .setType("SFNode") \
        .addChild(Extrusion() \
         .setUSE("FrustumExtrusion") \
        ) \
       ) \
       .addField(field() \
        .setAccessType("inputOnly") \
        .setName("recompute") \
        .setType("SFBool") \
       ) \
       .addField(field() \
        .setAccessType("inputOutput") \
        .setAppinfo("assumed ratio height/width") \
        .setName("aspectRatio") \
        .setType("SFFloat") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("position_changed") \
        .setType("SFVec3f") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("orientation_changed") \
        .setType("SFRotation") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("spine_changed") \
        .setType("MFVec3f") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("scale_changed") \
        .setType("MFVec2f") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("point_changed") \
        .setType("MFVec3f") \
       ) \
       .addField(field() \
        .setAccessType("initializeOnly") \
        .setName("trace") \
        .setType("SFBool") \
       ) \
       .setIS(IS() \
        .addConnect(connect() \
         .setNodeField("visible") \
         .setProtoField("visible") \
        ) \
        .addConnect(connect() \
         .setNodeField("ViewpointNode") \
         .setProtoField("ViewpointNode") \
        ) \
        .addConnect(connect() \
         .setNodeField("NavigationInfoNode") \
         .setProtoField("NavigationInfoNode") \
        ) \
        .addConnect(connect() \
         .setNodeField("aspectRatio") \
         .setProtoField("aspectRatio") \
        ) \
        .addConnect(connect() \
         .setNodeField("trace") \
         .setProtoField("trace") \
        ) \
       ) \
      ) \
      .addChild(ROUTE() \
       .setFromField("visibilitySwitchSelection") \
       .setFromNode("GeometryComputationScript") \
       .setToField("whichChoice") \
       .setToNode("VisibilitySwitch") \
      ) \
      .addChild(ROUTE() \
       .setFromField("position_changed") \
       .setFromNode("GeometryComputationScript") \
       .setToField("translation") \
       .setToNode("PositionTransform") \
      ) \
      .addChild(ROUTE() \
       .setFromField("orientation_changed") \
       .setFromNode("GeometryComputationScript") \
       .setToField("rotation") \
       .setToNode("OrientationTransform") \
      ) \
      .addChild(ROUTE() \
       .setFromField("spine_changed") \
       .setFromNode("GeometryComputationScript") \
       .setToField("set_spine") \
       .setToNode("FrustumExtrusion") \
      ) \
      .addChild(ROUTE() \
       .setFromField("scale_changed") \
       .setFromNode("GeometryComputationScript") \
       .setToField("set_scale") \
       .setToNode("FrustumExtrusion") \
      ) \
      .addChild(ROUTE() \
       .setFromField("point_changed") \
       .setFromNode("GeometryComputationScript") \
       .setToField("point") \
       .setToNode("FrustumCoordinate") \
      ) \
     ) \
    ) \
# Example use is in separate scene 
    .addChild(Anchor() \
     .setDescription("ViewFrustum Example") \
     .setUrl(["ViewFrustumExample.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ViewFrustumExample.x3d","ViewFrustumExample.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ViewFrustumExample.wrl"]) \
     .addChild(Shape() \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0.8,0.4,0]) \
       ) \
      ) \
      .setGeometry(Text() \
       .setString(["ViewFrustumPrototype.x3d","is a Prototype declaration file.","For an example scene using the prototype,","click this text and view","ViewFrustumExample.x3d"]) \
       .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.8) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter14Prototypes//ViewFrustumPrototype_RoundTrip.x3d")
