from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ExtrusionPentagon.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Simple regular pentagon extruded vertically, shown side-by-side with an ExtrusionCrossSection visualization.") \
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
     .setContent("23 December 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Extrusion pentagon") \
     .setName("subject") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionPentagon.x3d") \
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
     .setDEF("ExamineMode") \
    ) \
    .addChild(NavigationInfo() \
     .setDEF("FlyPanNavigation") \
     .setType(["FLY","ANY"]) \
    ) \
    .addChild(Background() \
     .setSkyColor([1,1,1]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Extrusion Pentagon") \
     .setOrientation([-1,0,0,0.2]) \
     .setPosition([0,3.17,12.85]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Oblique view from above") \
     .setOrientation([-1,0.015,-0.006,0.78]) \
     .setPosition([0.25,8.98,8.99]) \
    ) \
    .addChild(Viewpoint() \
     .setDescription("Overhead view") \
     .setOrientation([1,0,0,-1.57]) \
     .setPosition([0,13.15,0]) \
    ) \
    .addChild(Background() \
     .setGroundColor([0.9,0.9,0.9]) \
     .setSkyColor([0.9,0.9,0.9]) \
    ) \
    .addChild(Transform() \
     .setTranslation([-4,0,0]) \
     .addChild(Shape() \
# be sure to order cross-section points so that normal is upward 
      .setGeometry(Extrusion(crossSection = [-3.5,-1,-2.1,2.9,2.2,2.9,3.6,-1,0,-3.5,-3.5,-1], spine = [0,0,0,0,1,0,0,1.6,0]) \
       .setScale([1,1,1,1,0.2,0.2]) \
# spine is open, crossSection is closed 
      ) \
      .setAppearance(Appearance() \
       .setMaterial(Material() \
        .setDiffuseColor([0.2,0.6,0.5]) \
       ) \
      ) \
     ) \
    ) \
# Utilize ExtrusionCrossSection ProtoInstance as a Shape node (with containerField=\"children\") rather than an Extrusion node (with containerField=\"geometry\"). 
# ExtrusionCrossSection is a Prototype, which are explained in Chapter 14. 
# TODO update original version of ExtrusionCrossSectionPrototype.js at X3D Examples Archive Basic course 
    .addChild(ExternProtoDeclare() \
     .setAppinfo("Shape prototype for Extrusion node that also draws spine line plus oriented scaled cross sections at each spine point") \
     .setName("ExtrusionCrossSection") \
     .setUrl(["ExtrusionCrossSectionPrototype.x3d#ExtrusionCrossSection","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.x3d#ExtrusionCrossSection","ExtrusionCrossSectionPrototype.wrl#ExtrusionCrossSection","http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.wrl#ExtrusionCrossSection"]) \
# run-time eventIn Extrusion-modification interfaces for VRML 97 compatibility 
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Extrusion name") \
      .setName("name") \
      .setType("SFString") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Extrusion field") \
      .setName("crossSection") \
      .setType("MFVec2f") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Extrusion field") \
      .setName("spine") \
      .setType("MFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Extrusion field") \
      .setName("scale") \
      .setType("MFVec2f") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Extrusion field") \
      .setName("orientation") \
      .setType("MFRotation") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Extrusion field") \
      .setName("beginCap") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Extrusion field") \
      .setName("endCap") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Extrusion field") \
      .setName("ccw") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Extrusion field") \
      .setName("convex") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Extrusion field") \
      .setName("creaseAngle") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Extrusion field") \
      .setName("solid") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Image to apply to Extrusion") \
      .setName("extrusionImageTexture") \
      .setType("SFNode") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("TextureTransform coordinates of image applied to Extrusion") \
      .setName("extrusionTextureTransform") \
      .setType("SFNode") \
     ) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setAppinfo("Extrusion field") \
      .setName("set_crossSection") \
      .setType("MFVec2f") \
     ) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setAppinfo("Extrusion field") \
      .setName("set_spine") \
      .setType("MFVec3f") \
     ) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setAppinfo("Extrusion field") \
      .setName("set_scale") \
      .setType("MFVec2f") \
     ) \
     .addField(field() \
      .setAccessType("inputOnly") \
      .setAppinfo("Extrusion field") \
      .setName("set_orientation") \
      .setType("MFRotation") \
     ) \
     .addField(field() \
      .setAccessType("initializeOnly") \
      .setAppinfo("Whether to provide initialization trace statements showing node construction") \
      .setName("traceEnabled") \
      .setType("SFBool") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("emissiveColor of spine") \
      .setName("spineColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("diffuseColor of crossSection") \
      .setName("crossSectionColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("transparency of crossSection") \
      .setName("crossSectionTransparency") \
      .setType("SFFloat") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("diffuseColor of extrusion hull") \
      .setName("extrusionColor") \
      .setType("SFColor") \
     ) \
     .addField(field() \
      .setAccessType("inputOutput") \
      .setAppinfo("transparency of extrusion hull") \
      .setName("extrusionTransparency") \
      .setType("SFFloat") \
     ) \
    ) \
    .addChild(Transform() \
     .setTranslation([4,0,0]) \
     .addChild(ProtoInstance() \
      .setDEF("PentagonExtrusion") \
      .setName("ExtrusionCrossSection") \
      .addFieldValue(fieldValue() \
       .setName("name") \
       .setValue("PentagonExtrusion") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("crossSection") \
       .setValue("-3.5 -1 -2.1 2.9 2.2 2.9 3.6 -1 0 -3.5 -3.5 -1") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("spine") \
       .setValue("0 0 0 0 1 0 0 1.6 0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("scale") \
       .setValue("1 1 1 1 0.2 0.2") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("ccw") \
       .setValue("true") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("spineColor") \
       .setValue("0.7 0.7 0") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("crossSectionColor") \
       .setValue("0.6 0.6 0.2") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("extrusionColor") \
       .setValue("0.3 0.6 0.6") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("extrusionTransparency") \
       .setValue("0.6") \
      ) \
      .addFieldValue(fieldValue() \
       .setName("traceEnabled") \
       .setValue("false") \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons//ExtrusionPentagon_RoundTrip.x3d")
