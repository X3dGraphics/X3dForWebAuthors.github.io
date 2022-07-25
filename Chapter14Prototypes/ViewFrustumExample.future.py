from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ViewFrustumExample.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Display view frustum associated with a given pair of Viewpoint and NavigationInfo nodes, illustrating ProtoInstance reuse of a separately declared prototype.") \
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
     .setContent("ViewFrustumPrototype.x3d") \
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
     .setContent("ViewpointCalculator.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("ViewpointCalculatorComposed.png") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("view culling frustum") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ViewFrustumExample.x3d") \
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
     .setDescription("ViewFrustum from above, looking down") \
     .setOrientation([1,0,0,-1.57]) \
     .setPosition([0,40,0]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("ViewFrustum from point of view") \
    ) \
    .addChild(Viewpoint() \
     .setDescription("ViewFrustum behind point of view") \
     .setPosition([0,0,15]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("ViewFrustum oblique side view") \
     .setOrientation([0.8005,0.5926,0.0898,-0.3743]) \
     .setPosition([-5,5,20]) \
    ) \
    .addChild(NavigationInfo() \
     .setType(["EXAMINE","FLY","ANY"]) \
    ) \
    .addChild(ExternProtoDeclare() \
     .setAppinfo("Display view frustum associated with a given pair of Viewpoint NavigationInfo nodes") \
     .setName("ViewFrustum") \
     .setUrl(["ViewFrustumPrototype.x3d#ViewFrustum","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ViewFrustumPrototype.x3d#ViewFrustum","ViewFrustumPrototype.wrl#ViewFrustum","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ViewFrustumPrototype.wrl#ViewFrustum"]) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("required: insert Viewpoint DEF or USE node for view of interest") \
      .setName("ViewpointNode") \
      .setType("SFNode") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("required: insert NavigationInfo DEF or USE node of interest") \
      .setName("NavigationInfoNode") \
      .setType("SFNode") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("whether or not frustum geometry is rendered") \
      .setName("visible") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("RGB color of ViewFrustum outline, default value 0.9 0.9 0.9") \
      .setName("lineColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("RGB color of ViewFrustum hull geometry, default value 0.8 0.8 0.8") \
      .setName("frustumColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("transparency of ViewFrustum hull geometry, default value 0.5") \
      .setName("transparency") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("assumed ratio height/width, default value 0.75") \
      .setName("aspectRatio") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("debug support, default false") \
      .setName("trace") \
      .setType("SFBool") \
     ) \
    ) \
# Example use 
    .addChild(ProtoInstance() \
     .setName("ViewFrustum") \
     .addFieldValue(fieldValue() \
      .setName("ViewpointNode") \
# prefer empty description to prevent entry in player's ViewpointList 
      .addChild(Viewpoint() \
       .setDescription("ViewFrustum ViewpointNode") \
      ) \
     ) \
     .addFieldValue(fieldValue() \
      .setName("NavigationInfoNode") \
      .addChild(NavigationInfo() \
       .setVisibilityLimit(15) \
      ) \
     ) \
     .addFieldValue(fieldValue() \
      .setName("visible") \
      .setValue("true") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("lineColor") \
      .setValue("0.9 0.9 0.9") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("frustumColor") \
      .setValue("0.8 0.8 0.8") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("transparency") \
      .setValue("0.75") \
     ) \
     .addFieldValue(fieldValue() \
      .setName("trace") \
      .setValue("true") \
     ) \
    ) \
# Visualization assists 
    .addChild(Inline() \
     .setDEF("GridXZ") \
     .setUrl(["../../Savage/Tools/Authoring/GridXZ_20x20Fixed.x3d","https://savage.nps.edu/Savage/Tools/Authoring/GridXZ_20x20Fixed.x3d"]) \
    ) \
    .addChild(Transform() \
     .setScale([5,5,5]) \
     .addChild(Inline() \
      .setDEF("CoordinateAxes") \
      .setUrl(["../Chapter03Grouping/CoordinateAxes.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d"]) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter14Prototypes//ViewFrustumExample_RoundTrip.x3d")
