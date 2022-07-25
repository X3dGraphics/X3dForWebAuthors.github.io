package X3dForWebAuthors.Chapter06GeometryPointsLinesPolygons;

/*
Copyright (c) 1995-2022 held by the author(s).  All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer
      in the documentation and/or other materials provided with the
      distribution.
    * Neither the name of the Web3D Consortium (https://www.web3d.org)
      nor the names of its contributors may be used to endorse or
      promote products derived from this software without specific
      prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
*/

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Shape prototype for Enclosing IndexedTriangleStripSet that also draws spine line plus oriented, scaled cross sections at each spine point. </p>
 <p> Related links: <a href="../../..ExtrusionCrossSectionITSSPrototype.java">ExtrusionCrossSectionITSSPrototype.java</a> source, <a href="../../..ExtrusionCrossSectionITSSPrototypeIndex.html" target="_top">ExtrusionCrossSectionITSSPrototype catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../..ExtrusionCrossSectionITSSPrototype.x3d">ExtrusionCrossSectionITSSPrototype.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman and Sungmin Kwon </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 23 October 2017 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Shape prototype for Enclosing IndexedTriangleStripSet that also draws spine line plus oriented, scaled cross sections at each spine point. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> hint </i> </td>
			<td> Utilize ExtrusionCrossSectionITSS ProtoInstance as if it is a Shape node (with containerField="children") rather than an Extrusion node (with containerField="geometry") under a Shape. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> VRML 97 Specification, 6.18 Extrusion </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/technicalinfo/specifications/vrml97/part1/nodesRef.html#Extrusion" target="_blank">https://www.web3d.org/technicalinfo/specifications/vrml97/part1/nodesRef.html#Extrusion</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> VRML 97 Specification, Figure 6.6 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="https://www.web3d.org/technicalinfo/specifications/vrml97/Images/Extrusion.gif" target="_blank">https://www.web3d.org/technicalinfo/specifications/vrml97/Images/Extrusion.gif</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://realism.com/x3d/examples/Extrusion/_frame.html" target="_blank">http://realism.com/x3d/examples/Extrusion/_frame.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.cs.brown.edu/~gss/vrml/drawpoly.html" target="_blank">http://www.cs.brown.edu/~gss/vrml/drawpoly.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../..ExtrusionXj3dGoldberg1999.java">ExtrusionXj3dGoldberg1999.java</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://web3d.metrolink.com/cgi-bin/cvsweb.cgi/x3d/src/com/sun/j3d/loaders/vrml97/impl/Attic/Extrusion.java" target="_blank">http://web3d.metrolink.com/cgi-bin/cvsweb.cgi/x3d/src/com/sun/j3d/loaders/vrml97/impl/Attic/Extrusion.java</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../..../license.html">../license.html</a> </td>
		</tr>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center;" colspan="2">  &nbsp; </td>
		</tr>
	</table>

	<p>
		This program uses the
		<a href="https://www.web3d.org/specifications/java/X3DJSAIL.html" target="_blank">X3D Java Scene Access Interface Library (X3DJSAIL)</a>.
		It has been produced using the 
		<a href="https://www.web3d.org/x3d/stylesheets/X3dToJava.xslt" target="_blank">X3dToJava.xslt</a>
		stylesheet to create Java source code from an <code>.x3d</code> model.
	</p>

	* @author Don Brutzman and Sungmin Kwon
 */

public class ExtrusionCrossSectionITSSPrototype
{
	/** Default constructor to create this object. */
	public ExtrusionCrossSectionITSSPrototype ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("ExtrusionCrossSectionITSSPrototype.x3d"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman and Sungmin Kwon"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("23 October 2017"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Shape prototype for Enclosing IndexedTriangleStripSet that also draws spine line plus oriented, scaled cross sections at each spine point."))
    .addMeta(new meta().setName(meta.NAME_HINT       ).setContent("Utilize ExtrusionCrossSectionITSS ProtoInstance as if it is a Shape node (with containerField=\"children\") rather than an Extrusion node (with containerField=\"geometry\") under a Shape."))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("VRML 97 Specification, 6.18 Extrusion"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/technicalinfo/specifications/vrml97/part1/nodesRef.html#Extrusion"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("VRML 97 Specification, Figure 6.6"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("https://www.web3d.org/technicalinfo/specifications/vrml97/Images/Extrusion.gif"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://realism.com/x3d/examples/Extrusion/_frame.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.cs.brown.edu/~gss/vrml/drawpoly.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("ExtrusionXj3dGoldberg1999.java"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://web3d.metrolink.com/cgi-bin/cvsweb.cgi/x3d/src/com/sun/j3d/loaders/vrml97/impl/Attic/Extrusion.java"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("ExtrusionCrossSectionITSSPrototype.x3d"))
    .addChild(new ProtoDeclare("ExtrusionCrossSectionITSS").setName("ExtrusionCrossSectionITSS").setAppinfo("Shape prototype for Extrusion node that also draws spine line plus oriented scaled cross sections at each spine point").setDocumentation("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.x3d")
      .setProtoInterface(new ProtoInterface()
        .addField(new field().setName("name").setType(field.TYPE_SFSTRING).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion name"))
        .addField(new field().setName("crossSection").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(new MFVec2f(new MFVec2f(new double[] {1.0,1.0,1.0,-1.0,-1.0,-1.0,-1.0,1.0,1.0,1.0}))).setAppinfo("Extrusion field"))
        .addField(new field().setName("spine").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(new MFVec3f(new MFVec3f(new double[] {0.0,0.0,0.0,0.0,1.0,0.0}))).setAppinfo("Extrusion field"))
        .addField(new field().setName("scale").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(new MFVec2f(new MFVec2f(new double[] {1.0,1.0}))).setAppinfo("Extrusion field"))
        .addField(new field().setName("orientation").setType(field.TYPE_MFROTATION).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(new MFRotation(new MFRotation(new double[] {0.0,0.0,1.0,0.0}))).setAppinfo("Extrusion field"))
        .addField(new field().setName("beginCap").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(false).setAppinfo("Extrusion field"))
        .addField(new field().setName("endCap").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(false).setAppinfo("Extrusion field"))
        .addField(new field().setName("ccw").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(true).setAppinfo("Extrusion field"))
        .addField(new field().setName("convex").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(true).setAppinfo("Extrusion field"))
        .addField(new field().setName("creaseAngle").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(0).setAppinfo("Extrusion field"))
        .addField(new field().setName("solid").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(true).setAppinfo("Extrusion field"))
        .addField(new field().setName("spineColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFColor(0.0,0.9,0.8)).setAppinfo("emissiveColor of spine"))
        .addField(new field().setName("crossSectionColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFColor(0.2,0.8,0.3)).setAppinfo("diffuseColor of crossSection"))
        .addField(new field().setName("crossSectionTransparency").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(0.2).setAppinfo("transparency of crossSection"))
        .addField(new field().setName("extrusionColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFColor(0.3,0.3,0.3)).setAppinfo("diffuseColor of extrusion hull"))
        .addField(new field().setName("extrusionTransparency").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(0.7).setAppinfo("transparency of extrusion hull"))
        .addField(new field().setName("extrusionImageTexture").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Image to apply to Extrusion")
          .addComments(" initialization node (if any) goes here "))
        .addField(new field().setName("extrusionTextureTransform").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("TextureTransform coordinates of image applied to Extrusion")
          .addComments(" initialization node (if any) goes here "))
        .addField(new field().setName("set_crossSection").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Extrusion field"))
        .addField(new field().setName("set_spine").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Extrusion field"))
        .addField(new field().setName("set_scale").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Extrusion field"))
        .addField(new field().setName("set_orientation").setType(field.TYPE_MFROTATION).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Extrusion field"))
        .addField(new field().setName("traceEnabled").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(false).setAppinfo("Whether to provide initialization trace statements showing node construction")))
      .setProtoBody(new ProtoBody()
        .addChild(new Group()
          .addChild(new Shape("Spine")
            .setGeometry(new IndexedLineSet("SpineLine").setDEF("SpineLine").setColorPerVertex(false)
              .setCoord(new Coordinate("SpineCoordinates")
                .setIS(new IS()
                  .addConnect(new connect().setNodeField("point").setProtoField("spine"))
                  .addConnect(new connect().setNodeField("point").setProtoField("set_spine")))))
            .setAppearance(new Appearance()
              .setMaterial(new Material("SpineMaterial")
                .setIS(new IS()
                  .addConnect(new connect().setNodeField("emissiveColor").setProtoField("spineColor"))))))
          .addChild(new Shape("InternalCrossSections")
            .setGeometry(new IndexedTriangleFanSet("CrossSectionFaces").setCcw(true).setColorPerVertex(true).setNormalPerVertex(true).setSolid(false)
              .setCoord(new Coordinate("CrossSectionFacesCoordinates")))
            .setAppearance(new Appearance()
              .setMaterial(new Material("CrossSectionMaterial")
                .setIS(new IS()
                  .addConnect(new connect().setNodeField("diffuseColor").setProtoField("crossSectionColor"))
                  .addConnect(new connect().setNodeField("transparency").setProtoField("crossSectionTransparency"))))))
          .addChild(new Shape("ExternalExtrusion2")
            .setAppearance(new Appearance("ExtrusionAppearance2")
              .setIS(new IS()
                .addConnect(new connect().setNodeField("texture").setProtoField("extrusionImageTexture"))
                .addConnect(new connect().setNodeField("textureTransform").setProtoField("extrusionTextureTransform")))
              .setMaterial(new Material("ExtrusionMaterial2")
                .setIS(new IS()
                  .addConnect(new connect().setNodeField("diffuseColor").setProtoField("extrusionColor"))
                  .addConnect(new connect().setNodeField("transparency").setProtoField("extrusionTransparency")))))
            .setGeometry(new IndexedTriangleStripSet("EnclosingExtrusion2").setCcw(true).setColorPerVertex(true).setIndex(new int[] {0,1,2}).setNormalPerVertex(true).setSolid(true)
              .setCoord(new Coordinate("ExtrusionCoordinates2"))))
          .addComments(" <Shape DEF='ExternalExtrusion'> <Extrusion DEF='EnclosingExtrusion' convex='false' solid='false'> <IS> <connect nodeField='crossSection' protoField='crossSection'/> <connect nodeField='spine' protoField='spine'/> <connect nodeField='scale' protoField='scale'/> <connect nodeField='orientation' protoField='orientation'/> <connect nodeField='set_crossSection' protoField='set_crossSection'/> <connect nodeField='set_spine' protoField='set_spine'/> <connect nodeField='set_scale' protoField='set_scale'/> <connect nodeField='set_orientation' protoField='set_orientation'/> <connect nodeField='beginCap' protoField='beginCap'/> <connect nodeField='endCap' protoField='endCap'/> <connect nodeField='ccw' protoField='ccw'/> <connect nodeField='convex' protoField='convex'/> <connect nodeField='creaseAngle' protoField='creaseAngle'/> <connect nodeField='solid' protoField='solid'/> </IS> </Extrusion> <Appearance DEF='ExtrusionAppearance'> <IS> <connect nodeField='texture' protoField='extrusionImageTexture'/> <connect nodeField='textureTransform' protoField='extrusionTextureTransform'/> </IS> <Material DEF='ExtrusionMaterial'> <IS> <connect nodeField='diffuseColor' protoField='extrusionColor'/> <connect nodeField='transparency' protoField='extrusionTransparency'/> </IS> </Material> </Appearance> </Shape> "))
        .addComments(" TODO hardwired local Script path to workaround BS Contact bug ")
        .addChild(new Script("CrossSectionScript").setUrl(new String[] {"ExtrusionCrossSectionITSSPrototype.js","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionITSSPrototype.js"})
          .addField(new field().setName("name").setType(field.TYPE_SFSTRING).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("crossSection").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("spine").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("scale").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("orientation").setType(field.TYPE_MFROTATION).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("spineColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
          .addField(new field().setName("crossSectionColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
          .addField(new field().setName("crossSectionTransparency").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
          .addField(new field().setName("extrusionColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
          .addField(new field().setName("extrusionTransparency").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
          .addField(new field().setName("set_crossSection").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INPUTONLY))
          .addField(new field().setName("set_spine").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INPUTONLY))
          .addField(new field().setName("set_scale").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INPUTONLY))
          .addField(new field().setName("set_orientation").setType(field.TYPE_MFROTATION).setAccessType(field.ACCESSTYPE_INPUTONLY))
          .addField(new field().setName("spineIndex").setType(field.TYPE_MFINT32).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
          .addField(new field().setName("facesIndex").setType(field.TYPE_MFINT32).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
          .addField(new field().setName("facePoints").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
          .addField(new field().setName("triStripIndex").setType(field.TYPE_MFINT32).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
          .addField(new field().setName("traceEnabled").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addComments(" local variables ")
          .addField(new field().setName("computedFacesIndex").setType(field.TYPE_MFINT32).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("computedFacePoints").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("computedTriStripIndex").setType(field.TYPE_MFINT32).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .setIS(new IS()
            .addConnect(new connect().setNodeField("name").setProtoField("name"))
            .addConnect(new connect().setNodeField("crossSection").setProtoField("crossSection"))
            .addConnect(new connect().setNodeField("spine").setProtoField("spine"))
            .addConnect(new connect().setNodeField("scale").setProtoField("scale"))
            .addConnect(new connect().setNodeField("spineColor").setProtoField("spineColor"))
            .addConnect(new connect().setNodeField("crossSectionColor").setProtoField("crossSectionColor"))
            .addConnect(new connect().setNodeField("crossSectionTransparency").setProtoField("crossSectionTransparency"))
            .addConnect(new connect().setNodeField("extrusionColor").setProtoField("extrusionColor"))
            .addConnect(new connect().setNodeField("extrusionTransparency").setProtoField("extrusionTransparency"))
            .addConnect(new connect().setNodeField("orientation").setProtoField("orientation"))
            .addConnect(new connect().setNodeField("set_crossSection").setProtoField("set_crossSection"))
            .addConnect(new connect().setNodeField("set_spine").setProtoField("set_spine"))
            .addConnect(new connect().setNodeField("set_scale").setProtoField("set_scale"))
            .addConnect(new connect().setNodeField("set_orientation").setProtoField("set_orientation"))
            .addConnect(new connect().setNodeField("traceEnabled").setProtoField("traceEnabled"))))
        .addChild(new ROUTE().setFromNode("CrossSectionScript").setFromField("spineIndex").setToNode("SpineLine").setToField("set_coordIndex"))
        .addChild(new ROUTE().setFromNode("CrossSectionScript").setFromField("facesIndex").setToNode("CrossSectionFaces").setToField("set_index"))
        .addChild(new ROUTE().setFromNode("CrossSectionScript").setFromField("facePoints").setToNode("CrossSectionFacesCoordinates").setToField("point"))
        .addChild(new ROUTE().setFromNode("CrossSectionScript").setFromField("triStripIndex").setToNode("EnclosingExtrusion2").setToField("set_index"))
        .addChild(new Group()
          .addComments(" ======= ROUTE Trace ============================================== ")
          .addChild(new Script("Trace_ROUTE_CrossSectionScript.triStripIndex_TO_EnclosingExtrusion2.set_index").setMustEvaluate(true).setSourceCode("""
ecmascript:
    function traceValue (eventValue, timeStamp) {
      // input eventValue received for trace field
      if (timeStamp - timeStampPreviousReport >= reportInterval) {
        Browser.print ('Trace_ROUTE_CrossSectionScript.triStripIndex_TO_EnclosingExtrusion2.set_index type=MFInt32 value=' + eventValue.toString() + '\n');
        timeStampPreviousReport = timeStamp;
      }
    }
    function timeOfDay (someTime) {
      hh = Math.floor (someTime /(60*60)) % 24;
      mm = Math.floor (someTime / 60)     % 60;
      ss = Math.floor (someTime)          % 60;
      if (hh < 9) hour   = '0' + hh;
      else        hour   =       hh;
      if (mm < 9) minute = '0' + mm;
      else        minute =       mm;
      if (ss < 9) second = '0' + ss;
      else        second =       ss;
      return '(' + hour + ':' + minute + ':' + second + ' GMT)';
    }
""")
            .addComments(" Trace ROUTEd event values on X3D browser console ")
            .addField(new field().setName("reportInterval").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(1.0).setAppinfo("Sampling frequency in seconds (0 means all values)"))
            .addField(new field().setName("traceValue").setType(field.TYPE_MFINT32).setAccessType(field.ACCESSTYPE_INPUTONLY))
            .addField(new field().setName("timeStampPreviousReport").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(-1)))
          .addChild(new ROUTE().setFromNode("CrossSectionScript").setFromField("triStripIndex").setToNode("Trace_ROUTE_CrossSectionScript.triStripIndex_TO_EnclosingExtrusion2.set_index").setToField("traceValue"))
          .addComments(" ======= ROUTE Trace block complete ===================================================== "))
        .addChild(new ROUTE().setFromNode("CrossSectionScript").setFromField("facePoints").setToNode("ExtrusionCoordinates2").setToField("point"))
        .addComments(" ")))
    .addComments(" ==================== ")
    .addComments(" Example instance adapted from Figure15.12Torus.x3d ")
    .addComments(" https://www.web3d.org/x3d/content/examples/Basic/Vrml2Sourcebook/Chapter15-Extrusion/Figure15.12Torus.x3d ")
    .addComments(" Redirection text in case a user examines this PROTO file via a 3D browser: ")
    .addChild(new Group()
      .addChild(new Transform().setTranslation(0.0,0.5,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,1.0,1.0).setEmissiveColor(0.0,1.0,1.0)))
          .setGeometry(new Text().setString(new String[] {"ExtrusionCrossSectionITSS","is a Prototype definition scene"})
            .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.7)))))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return ExtrusionCrossSectionITSSPrototype model
	 */
	public X3D getX3dModel()
	{	  
		return x3dModel;
	}
	   
    /** 
	 * Default main() method provided for test purposes, uses CommandLine to set global ConfigurationProperties for this object.
     * @param args array of input parameters, provided as arguments
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html#handleArguments-java.lang.String:A-">X3D.handleArguments(args)</a>
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html#validationReport--">X3D.validationReport()</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/CommandLine.html">CommandLine</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/CommandLine.html#USAGE">CommandLine.USAGE</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/ConfigurationProperties.html">ConfigurationProperties</a>
     */
    public static void main(String args[])
    {
        X3D thisExampleX3dModel = new ExtrusionCrossSectionITSSPrototype().getX3dModel();

		boolean hasArguments = (args != null) && (args.length > 0);
		boolean validate = true; // default
		boolean argumentsLoadNewModel = false;
		String  fileName = new String();

		if (args != null)
		{
			for (String arg : args)
			{
				if (arg.toLowerCase().startsWith("-v") || arg.toLowerCase().contains("validate"))
				{
					validate = true; // making sure
				}
				if (arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_X3D) ||
					arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_CLASSICVRML) ||
					arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_X3DB) ||
					arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_VRML97) ||
					arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_EXI) ||
					arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_GZIP) ||
					arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_ZIP) ||
					arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_HTML) ||
					arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_XHTML))
				{
					argumentsLoadNewModel = true;
					fileName = arg;
				}
			}
		}
		if      (argumentsLoadNewModel)
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter06GeometryPointsLinesPolygons.ExtrusionCrossSectionITSSPrototype\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter06GeometryPointsLinesPolygons.ExtrusionCrossSectionITSSPrototype\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
