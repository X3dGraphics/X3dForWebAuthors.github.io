from X3Dautoclass import *
X3D0 = X3D() \
   .setProfile("Immersive") \
   .setVersion("3.3") \
   .setHead(head() \
    .addMeta(meta() \
     .setContent("ExtrusionCrossSectionITSSPrototype.x3d") \
     .setName("title") \
    ) \
    .addMeta(meta() \
     .setContent("Don Brutzman and Sungmin Kwon") \
     .setName("creator") \
    ) \
    .addMeta(meta() \
     .setContent("23 October 2017") \
     .setName("created") \
    ) \
    .addMeta(meta() \
     .setContent("23 December 2017") \
     .setName("modified") \
    ) \
    .addMeta(meta() \
     .setContent("Shape prototype for Enclosing IndexedTriangleStripSet that also draws spine line plus oriented, scaled cross sections at each spine point.") \
     .setName("description") \
    ) \
    .addMeta(meta() \
     .setContent("Utilize ExtrusionCrossSectionITSS ProtoInstance as if it is a Shape node (with containerField=\"children\") rather than an Extrusion node (with containerField=\"geometry\") under a Shape.") \
     .setName("hint") \
    ) \
    .addMeta(meta() \
     .setContent("VRML 97 Specification, 6.18 Extrusion") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/technicalinfo/specifications/vrml97/part1/nodesRef.html#Extrusion") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("VRML 97 Specification, Figure 6.6") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.web3d.org/technicalinfo/specifications/vrml97/Images/Extrusion.gif") \
     .setName("Image") \
    ) \
    .addMeta(meta() \
     .setContent("http://realism.com/x3d/examples/Extrusion/_frame.html") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://www.cs.brown.edu/~gss/vrml/drawpoly.html") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("ExtrusionXj3dGoldberg1999.java") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://web3d.metrolink.com/cgi-bin/cvsweb.cgi/x3d/src/com/sun/j3d/loaders/vrml97/impl/Attic/Extrusion.java") \
     .setName("reference") \
    ) \
    .addMeta(meta() \
     .setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.x3d") \
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
     .setAppinfo("Shape prototype for Extrusion node that also draws spine line plus oriented scaled cross sections at each spine point") \
     .setDocumentation("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.x3d") \
     .setName("ExtrusionCrossSectionITSS") \
     .setProtoInterface(ProtoInterface() \
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
       .setValue("1 1 1 -1 -1 -1 -1 1 1 1") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("Extrusion field") \
       .setName("spine") \
       .setType("MFVec3f") \
       .setValue("0 0 0 0 1 0") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("Extrusion field") \
       .setName("scale") \
       .setType("MFVec2f") \
       .setValue("1 1") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("Extrusion field") \
       .setName("orientation") \
       .setType("MFRotation") \
       .setValue("0 0 1 0") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("Extrusion field") \
       .setName("beginCap") \
       .setType("SFBool") \
       .setValue("false") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("Extrusion field") \
       .setName("endCap") \
       .setType("SFBool") \
       .setValue("false") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("Extrusion field") \
       .setName("ccw") \
       .setType("SFBool") \
       .setValue("true") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("Extrusion field") \
       .setName("convex") \
       .setType("SFBool") \
       .setValue("true") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("Extrusion field") \
       .setName("creaseAngle") \
       .setType("SFFloat") \
       .setValue("0") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("Extrusion field") \
       .setName("solid") \
       .setType("SFBool") \
       .setValue("true") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("emissiveColor of spine") \
       .setName("spineColor") \
       .setType("SFColor") \
       .setValue("0 0.9 0.8") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("diffuseColor of crossSection") \
       .setName("crossSectionColor") \
       .setType("SFColor") \
       .setValue("0.2 0.8 0.3") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("transparency of crossSection") \
       .setName("crossSectionTransparency") \
       .setType("SFFloat") \
       .setValue("0.2") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("diffuseColor of extrusion hull") \
       .setName("extrusionColor") \
       .setType("SFColor") \
       .setValue("0.3 0.3 0.3") \
      ) \
      .addField(field() \
       .setAccessType("inputOutput") \
       .setAppinfo("transparency of extrusion hull") \
       .setName("extrusionTransparency") \
       .setType("SFFloat") \
       .setValue("0.7") \
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("Image to apply to Extrusion") \
       .setName("extrusionImageTexture") \
       .setType("SFNode") \
# initialization node (if any) goes here 
      ) \
      .addField(field() \
       .setAccessType("initializeOnly") \
       .setAppinfo("TextureTransform coordinates of image applied to Extrusion") \
       .setName("extrusionTextureTransform") \
       .setType("SFNode") \
# initialization node (if any) goes here 
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
       .setValue("false") \
      ) \
     ) \
     .setProtoBody(ProtoBody() \
      .addChild(Group() \
       .addChild(Shape() \
        .setDEF("Spine") \
        .setGeometry(IndexedLineSet(colorPerVertex = False) \
         .setDEF("SpineLine") \
         .setCoord(Coordinate() \
          .setDEF("SpineCoordinates") \
          .setIS(IS() \
           .addConnect(connect() \
            .setNodeField("point") \
            .setProtoField("spine") \
           ) \
           .addConnect(connect() \
            .setNodeField("point") \
            .setProtoField("set_spine") \
           ) \
          ) \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDEF("SpineMaterial") \
          .setIS(IS() \
           .addConnect(connect() \
            .setNodeField("emissiveColor") \
            .setProtoField("spineColor") \
           ) \
          ) \
         ) \
        ) \
       ) \
       .addChild(Shape() \
        .setDEF("InternalCrossSections") \
        .setGeometry(IndexedTriangleFanSet(solid = False) \
         .setDEF("CrossSectionFaces") \
         .setCoord(Coordinate() \
          .setDEF("CrossSectionFacesCoordinates") \
         ) \
        ) \
        .setAppearance(Appearance() \
         .setMaterial(Material() \
          .setDEF("CrossSectionMaterial") \
          .setIS(IS() \
           .addConnect(connect() \
            .setNodeField("diffuseColor") \
            .setProtoField("crossSectionColor") \
           ) \
           .addConnect(connect() \
            .setNodeField("transparency") \
            .setProtoField("crossSectionTransparency") \
           ) \
          ) \
         ) \
        ) \
       ) \
       .addChild(Shape() \
        .setDEF("ExternalExtrusion2") \
        .setAppearance(Appearance() \
         .setDEF("ExtrusionAppearance2") \
         .setIS(IS() \
          .addConnect(connect() \
           .setNodeField("texture") \
           .setProtoField("extrusionImageTexture") \
          ) \
          .addConnect(connect() \
           .setNodeField("textureTransform") \
           .setProtoField("extrusionTextureTransform") \
          ) \
         ) \
         .setMaterial(Material() \
          .setDEF("ExtrusionMaterial2") \
          .setIS(IS() \
           .addConnect(connect() \
            .setNodeField("diffuseColor") \
            .setProtoField("extrusionColor") \
           ) \
           .addConnect(connect() \
            .setNodeField("transparency") \
            .setProtoField("extrusionTransparency") \
           ) \
          ) \
         ) \
        ) \
        .setGeometry(IndexedTriangleStripSet(ccw = True) \
         .setDEF("EnclosingExtrusion2") \
         .setIndex([0,1,2]) \
         .setCoord(Coordinate() \
          .setDEF("ExtrusionCoordinates2") \
         ) \
        ) \
       ) \
# <Shape DEF='ExternalExtrusion'> <Extrusion DEF='EnclosingExtrusion' convex='false' solid='false'> <IS> <connect nodeField='crossSection' protoField='crossSection'/> <connect nodeField='spine' protoField='spine'/> <connect nodeField='scale' protoField='scale'/> <connect nodeField='orientation' protoField='orientation'/> <connect nodeField='set_crossSection' protoField='set_crossSection'/> <connect nodeField='set_spine' protoField='set_spine'/> <connect nodeField='set_scale' protoField='set_scale'/> <connect nodeField='set_orientation' protoField='set_orientation'/> <connect nodeField='beginCap' protoField='beginCap'/> <connect nodeField='endCap' protoField='endCap'/> <connect nodeField='ccw' protoField='ccw'/> <connect nodeField='convex' protoField='convex'/> <connect nodeField='creaseAngle' protoField='creaseAngle'/> <connect nodeField='solid' protoField='solid'/> </IS> </Extrusion> <Appearance DEF='ExtrusionAppearance'> <IS> <connect nodeField='texture' protoField='extrusionImageTexture'/> <connect nodeField='textureTransform' protoField='extrusionTextureTransform'/> </IS> <Material DEF='ExtrusionMaterial'> <IS> <connect nodeField='diffuseColor' protoField='extrusionColor'/> <connect nodeField='transparency' protoField='extrusionTransparency'/> </IS> </Material> </Appearance> </Shape> 
      ) \
# TODO hardwired local Script path to workaround BS Contact bug 
      .addChild(Script() \
       .setDEF("CrossSectionScript") \
       .setUrl(["ExtrusionCrossSectionITSSPrototype.js"]) \
       .addField(field() \
        .setAccessType("initializeOnly") \
        .setName("name") \
        .setType("SFString") \
       ) \
       .addField(field() \
        .setAccessType("initializeOnly") \
        .setName("crossSection") \
        .setType("MFVec2f") \
       ) \
       .addField(field() \
        .setAccessType("initializeOnly") \
        .setName("spine") \
        .setType("MFVec3f") \
       ) \
       .addField(field() \
        .setAccessType("initializeOnly") \
        .setName("scale") \
        .setType("MFVec2f") \
       ) \
       .addField(field() \
        .setAccessType("initializeOnly") \
        .setName("orientation") \
        .setType("MFRotation") \
       ) \
       .addField(field() \
        .setAccessType("inputOutput") \
        .setName("spineColor") \
        .setType("SFColor") \
       ) \
       .addField(field() \
        .setAccessType("inputOutput") \
        .setName("crossSectionColor") \
        .setType("SFColor") \
       ) \
       .addField(field() \
        .setAccessType("inputOutput") \
        .setName("crossSectionTransparency") \
        .setType("SFFloat") \
       ) \
       .addField(field() \
        .setAccessType("inputOutput") \
        .setName("extrusionColor") \
        .setType("SFColor") \
       ) \
       .addField(field() \
        .setAccessType("inputOutput") \
        .setName("extrusionTransparency") \
        .setType("SFFloat") \
       ) \
       .addField(field() \
        .setAccessType("inputOnly") \
        .setName("set_crossSection") \
        .setType("MFVec2f") \
       ) \
       .addField(field() \
        .setAccessType("inputOnly") \
        .setName("set_spine") \
        .setType("MFVec3f") \
       ) \
       .addField(field() \
        .setAccessType("inputOnly") \
        .setName("set_scale") \
        .setType("MFVec2f") \
       ) \
       .addField(field() \
        .setAccessType("inputOnly") \
        .setName("set_orientation") \
        .setType("MFRotation") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("spineIndex") \
        .setType("MFInt32") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("facesIndex") \
        .setType("MFInt32") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("facePoints") \
        .setType("MFVec3f") \
       ) \
       .addField(field() \
        .setAccessType("outputOnly") \
        .setName("triStripIndex") \
        .setType("MFInt32") \
       ) \
       .addField(field() \
        .setAccessType("initializeOnly") \
        .setName("traceEnabled") \
        .setType("SFBool") \
       ) \
# local variables 
       .addField(field() \
        .setAccessType("initializeOnly") \
        .setName("computedFacesIndex") \
        .setType("MFInt32") \
       ) \
       .addField(field() \
        .setAccessType("initializeOnly") \
        .setName("computedFacePoints") \
        .setType("MFVec3f") \
       ) \
       .addField(field() \
        .setAccessType("initializeOnly") \
        .setName("computedTriStripIndex") \
        .setType("MFInt32") \
       ) \
       .setIS(IS() \
        .addConnect(connect() \
         .setNodeField("name") \
         .setProtoField("name") \
        ) \
        .addConnect(connect() \
         .setNodeField("crossSection") \
         .setProtoField("crossSection") \
        ) \
        .addConnect(connect() \
         .setNodeField("spine") \
         .setProtoField("spine") \
        ) \
        .addConnect(connect() \
         .setNodeField("scale") \
         .setProtoField("scale") \
        ) \
        .addConnect(connect() \
         .setNodeField("spineColor") \
         .setProtoField("spineColor") \
        ) \
        .addConnect(connect() \
         .setNodeField("crossSectionColor") \
         .setProtoField("crossSectionColor") \
        ) \
        .addConnect(connect() \
         .setNodeField("crossSectionTransparency") \
         .setProtoField("crossSectionTransparency") \
        ) \
        .addConnect(connect() \
         .setNodeField("extrusionColor") \
         .setProtoField("extrusionColor") \
        ) \
        .addConnect(connect() \
         .setNodeField("extrusionTransparency") \
         .setProtoField("extrusionTransparency") \
        ) \
        .addConnect(connect() \
         .setNodeField("orientation") \
         .setProtoField("orientation") \
        ) \
        .addConnect(connect() \
         .setNodeField("set_crossSection") \
         .setProtoField("set_crossSection") \
        ) \
        .addConnect(connect() \
         .setNodeField("set_spine") \
         .setProtoField("set_spine") \
        ) \
        .addConnect(connect() \
         .setNodeField("set_scale") \
         .setProtoField("set_scale") \
        ) \
        .addConnect(connect() \
         .setNodeField("set_orientation") \
         .setProtoField("set_orientation") \
        ) \
        .addConnect(connect() \
         .setNodeField("traceEnabled") \
         .setProtoField("traceEnabled") \
        ) \
       ) \
      ) \
      .addChild(ROUTE() \
       .setFromField("spineIndex") \
       .setFromNode("CrossSectionScript") \
       .setToField("set_coordIndex") \
       .setToNode("SpineLine") \
      ) \
      .addChild(ROUTE() \
       .setFromField("facesIndex") \
       .setFromNode("CrossSectionScript") \
       .setToField("set_index") \
       .setToNode("CrossSectionFaces") \
      ) \
      .addChild(ROUTE() \
       .setFromField("facePoints") \
       .setFromNode("CrossSectionScript") \
       .setToField("point") \
       .setToNode("CrossSectionFacesCoordinates") \
      ) \
      .addChild(ROUTE() \
       .setFromField("triStripIndex") \
       .setFromNode("CrossSectionScript") \
       .setToField("set_index") \
       .setToNode("EnclosingExtrusion2") \
      ) \
      .addChild(Group() \
# ======= ROUTE Trace ============================================== 
       .addChild(Script(mustEvaluate = True) \
        .setDEF("Trace_ROUTE_CrossSectionScript.triStripIndex_TO_EnclosingExtrusion2.set_index") \
# Trace ROUTEd event values on X3D browser console 
        .addField(field() \
         .setAccessType("initializeOnly") \
         .setAppinfo("Sampling frequency in seconds (0 means all values)") \
         .setName("reportInterval") \
         .setType("SFTime") \
         .setValue("1.0") \
        ) \
        .addField(field() \
         .setAccessType("inputOnly") \
         .setName("traceValue") \
         .setType("MFInt32") \
        ) \
        .addField(field() \
         .setAccessType("initializeOnly") \
         .setName("timeStampPreviousReport") \
         .setType("SFTime") \
         .setValue("-1") \
        ) \
.setSourceCode('''\n"+
"  ecmascript:\n"+
"    function traceValue (eventValue, timeStamp) {\n"+
"      // input eventValue received for trace field\n"+
"      if (timeStamp - timeStampPreviousReport >= reportInterval) {\n"+
"        Browser.print ('Trace_ROUTE_CrossSectionScript.triStripIndex_TO_EnclosingExtrusion2.set_index type=MFInt32 value=' + eventValue.toString() + '\\n');\n"+
"        timeStampPreviousReport = timeStamp;\n"+
"      }\n"+
"    }\n"+
"    function timeOfDay (someTime) {\n"+
"      hh = Math.floor (someTime /(60*60)) % 24;\n"+
"      mm = Math.floor (someTime / 60)     % 60;\n"+
"      ss = Math.floor (someTime)          % 60;\n"+
"      if (hh < 9) hour   = '0' + hh;\n"+
"      else        hour   =       hh;\n"+
"      if (mm < 9) minute = '0' + mm;\n"+
"      else        minute =       mm;\n"+
"      if (ss < 9) second = '0' + ss;\n"+
"      else        second =       ss;\n"+
"      return '(' + hour + ':' + minute + ':' + second + ' GMT)';\n"+
"    }\n"+
"  ''')
       ) \
       .addChild(ROUTE() \
        .setFromField("triStripIndex") \
        .setFromNode("CrossSectionScript") \
        .setToField("traceValue") \
        .setToNode("Trace_ROUTE_CrossSectionScript.triStripIndex_TO_EnclosingExtrusion2.set_index") \
       ) \
# ======= ROUTE Trace block complete ===================================================== 
      ) \
      .addChild(ROUTE() \
       .setFromField("facePoints") \
       .setFromNode("CrossSectionScript") \
       .setToField("point") \
       .setToNode("ExtrusionCoordinates2") \
      ) \
# 
     ) \
    ) \
# ==================== 
# Example instance adapted from Figure15.12Torus.x3d 
# http://www.web3d.org/x3d/content/examples/Basic/Vrml2Sourcebook/Chapter15-Extrusion/Figure15.12Torus.x3d 
# Redirection text in case a user examines this PROTO file via a 3D browser: 
    .addChild(Group() \
     .addChild(Transform() \
      .setTranslation([0,0.5,0]) \
      .addChild(Shape() \
       .setAppearance(Appearance() \
        .setMaterial(Material() \
         .setDiffuseColor([0,1,1]) \
         .setEmissiveColor([0,1,1]) \
        ) \
       ) \
       .setGeometry(Text() \
        .setString(["ExtrusionCrossSectionITSS","is a Prototype definition scene"]) \
        .setFontStyle(FontStyle(justify = ["MIDDLE","MIDDLE"], size = 0.7) \
        ) \
       ) \
      ) \
     ) \
    ) \
   ) \

X3D0.toFileX3D("/x3d-code/www.web3d.org/x3d/content/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons//ExtrusionCrossSectionITSSPrototype_RoundTrip.x3d")
