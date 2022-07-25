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
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Shape prototype for Extrusion node that also draws spine line plus oriented, scaled cross sections at each spine point. </p>
 <p> Related links: <a href="../../../Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.java">ExtrusionCrossSectionPrototype.java</a> source, <a href="../../../Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototypeIndex.html" target="_top">ExtrusionCrossSectionPrototype catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.x3d">ExtrusionCrossSectionPrototype.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 22 November 2000 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter06GeometryPointsLinesPolygons/ExtrusionExampleShip.x3d">ExtrusionExampleShip.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionExampleShip.x3d">ExtrusionCrossSectionExampleShip.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionExampleTorus.x3d">ExtrusionCrossSectionExampleTorus.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Shape prototype for Extrusion node that also draws spine line plus oriented, scaled cross sections at each spine point. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> hint </i> </td>
			<td> Utilize ExtrusionCrossSection ProtoInstance as if it is a Shape node (with containerField="children") rather than an Extrusion node (with containerField="geometry") under a Shape. </td>
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
			<td> <a href="../../../Chapter06GeometryPointsLinesPolygons/ExtrusionXj3dGoldberg1999.java">ExtrusionXj3dGoldberg1999.java</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://web3d.metrolink.com/cgi-bin/cvsweb.cgi/x3d/src/com/sun/j3d/loaders/vrml97/impl/Attic/Extrusion.java" target="_blank">http://web3d.metrolink.com/cgi-bin/cvsweb.cgi/x3d/src/com/sun/j3d/loaders/vrml97/impl/Attic/Extrusion.java</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionCrossSectionPrototype.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionCrossSectionPrototype.x3d</a> </td>
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
			<td> <a href="../../../Chapter06GeometryPointsLinesPolygons/../license.html">../license.html</a> </td>
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

	* @author Don Brutzman
 */

public class ExtrusionCrossSectionPrototype
{
	/** Default constructor to create this object. */
	public ExtrusionCrossSectionPrototype ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("ExtrusionCrossSectionPrototype.x3d"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("22 November 2000"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("ExtrusionExampleShip.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("ExtrusionCrossSectionExampleShip.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("ExtrusionCrossSectionExampleTorus.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Shape prototype for Extrusion node that also draws spine line plus oriented, scaled cross sections at each spine point."))
    .addMeta(new meta().setName(meta.NAME_HINT       ).setContent("Utilize ExtrusionCrossSection ProtoInstance as if it is a Shape node (with containerField=\"children\") rather than an Extrusion node (with containerField=\"geometry\") under a Shape."))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("VRML 97 Specification, 6.18 Extrusion"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/technicalinfo/specifications/vrml97/part1/nodesRef.html#Extrusion"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("VRML 97 Specification, Figure 6.6"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("https://www.web3d.org/technicalinfo/specifications/vrml97/Images/Extrusion.gif"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://realism.com/x3d/examples/Extrusion/_frame.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.cs.brown.edu/~gss/vrml/drawpoly.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("ExtrusionXj3dGoldberg1999.java"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://web3d.metrolink.com/cgi-bin/cvsweb.cgi/x3d/src/com/sun/j3d/loaders/vrml97/impl/Attic/Extrusion.java"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionCrossSectionPrototype.x3d"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("ExtrusionCrossSectionPrototype.x3d"))
    .addChild(new ProtoDeclare("ExtrusionCrossSection").setName("ExtrusionCrossSection").setAppinfo("Shape prototype for Extrusion node that also draws spine line plus oriented scaled cross sections at each spine point")
      .setProtoInterface(new ProtoInterface()
        .addComments(" run-time eventIn Extrusion-modification interfaces for VRML97 compatibility ")
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
                  .addConnect(new connect().setNodeField("set_point").setProtoField("set_spine")))))
            .setAppearance(new Appearance()
              .setMaterial(new Material("SpineMaterial")
                .setIS(new IS()
                  .addConnect(new connect().setNodeField("emissiveColor").setProtoField("spineColor"))))))
          .addChild(new Shape("InternalCrossSections")
            .addComments(" use most conservative polygon settings for reliable rendering: convex='false' solid='false' ")
            .setGeometry(new IndexedFaceSet("CrossSectionFaces").setDEF("CrossSectionFaces").setConvex(false).setSolid(false)
              .setCoord(new Coordinate("CrossSectionFacesCoordinates")))
            .setAppearance(new Appearance()
              .setMaterial(new Material("CrossSectionMaterial")
                .setIS(new IS()
                  .addConnect(new connect().setNodeField("diffuseColor").setProtoField("crossSectionColor"))
                  .addConnect(new connect().setNodeField("transparency").setProtoField("crossSectionTransparency"))))))
          .addChild(new Shape("ExternalExtrusion")
            .addComments(" use most conservative polygon settings: convex='false' solid='false' ")
            .setGeometry(new Extrusion("EnclosingExtrusion").setConvex(false).setSolid(false)
              .setIS(new IS()
                .addConnect(new connect().setNodeField("crossSection").setProtoField("crossSection"))
                .addConnect(new connect().setNodeField("spine").setProtoField("spine"))
                .addConnect(new connect().setNodeField("scale").setProtoField("scale"))
                .addConnect(new connect().setNodeField("orientation").setProtoField("orientation"))
                .addConnect(new connect().setNodeField("set_crossSection").setProtoField("set_crossSection"))
                .addConnect(new connect().setNodeField("set_spine").setProtoField("set_spine"))
                .addConnect(new connect().setNodeField("set_scale").setProtoField("set_scale"))
                .addConnect(new connect().setNodeField("set_orientation").setProtoField("set_orientation"))
                .addConnect(new connect().setNodeField("beginCap").setProtoField("beginCap"))
                .addConnect(new connect().setNodeField("endCap").setProtoField("endCap"))
                .addConnect(new connect().setNodeField("ccw").setProtoField("ccw"))
                .addConnect(new connect().setNodeField("convex").setProtoField("convex"))
                .addConnect(new connect().setNodeField("creaseAngle").setProtoField("creaseAngle"))
                .addConnect(new connect().setNodeField("solid").setProtoField("solid"))))
            .setAppearance(new Appearance("ExtrusionAppearance")
              .setIS(new IS()
                .addConnect(new connect().setNodeField("texture").setProtoField("extrusionImageTexture"))
                .addConnect(new connect().setNodeField("textureTransform").setProtoField("extrusionTextureTransform")))
              .setMaterial(new Material("ExtrusionMaterial")
                .setIS(new IS()
                  .addConnect(new connect().setNodeField("diffuseColor").setProtoField("extrusionColor"))
                  .addConnect(new connect().setNodeField("transparency").setProtoField("extrusionTransparency")))))))
        .addChild(new Script("CrossSectionScript").setUrl(new String[] {"ExtrusionCrossSectionPrototype.js","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.js"})
          .addComments(" local variables ")
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
          .addField(new field().setName("traceEnabled").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("computedFacesIndex").setType(field.TYPE_MFINT32).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
          .addField(new field().setName("computedFacePoints").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
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
        .addChild(new ROUTE().setFromNode("CrossSectionScript").setFromField("facesIndex").setToNode("CrossSectionFaces").setToField("set_coordIndex"))
        .addChild(new ROUTE().setFromNode("CrossSectionScript").setFromField("facePoints").setToNode("CrossSectionFacesCoordinates").setToField("point"))))
    .addComments(" ==================== ")
    .addComments(" Example instance adapted from Figure15.12Torus.x3d ")
    .addComments(" https://www.web3d.org/x3d/content/examples/Basic/Vrml2Sourcebook/Chapter15-Extrusion/Figure15.12Torus.x3d ")
    .addComments(" Redirection text in case a user examines this PROTO file via a 3D browser: ")
    .addChild(new Group()
      .addChild(new Transform().setTranslation(0.0,1.5,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,1.0,1.0).setEmissiveColor(0.0,1.0,1.0)))
          .setGeometry(new Text().setString(new String[] {"ExtrusionCrossSectionPrototype","is a Prototype definition scene.","","Example scenes using this node:"})
            .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.9)))))
      .addChild(new Transform().setTranslation(0.0,-0.8,0.0)
        .addChild(new Anchor().setDescription("Touch text for ExtrusionPentagon example").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"ExtrusionPentagon.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionPentagon.x3d","ExtrusionPentagon.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionPentagon.wrl"})
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.0,1.0,0.341176).setTransparency(0.2)))
            .setGeometry(new Text().setString(new String[] {"Pentagon"})
              .setFontStyle(new FontStyle("FontCenter").setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(1.2).setCssStyle("BOLD"))))
          .addChild(new Shape()
            .setGeometry(new Box().setSize(3.0,1.0,0.01))
            .setAppearance(new Appearance("TransparentAppearance")
              .setMaterial(new Material().setTransparency(1))))))
      .addChild(new Transform().setTranslation(-2.5,-2.0,0.0)
        .addChild(new Anchor().setDescription("Touch text for Torus example").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"../../Basic/course/ExtrusionCrossSectionExampleTorus.x3d","https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionCrossSectionExampleTorus.x3d","../../Basic/course/ExtrusionCrossSectionExampleTorus.wrl","https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionCrossSectionExampleTorus.wrl"})
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(1.0,0.0,1.0).setTransparency(0.2)))
            .setGeometry(new Text().setString(new String[] {"Torus"})
              .setFontStyle(new FontStyle().setUSE("FontCenter"))))
          .addChild(new Shape()
            .setGeometry(new Box().setSize(3.0,1.0,0.01))
            .setAppearance(new Appearance().setUSE("TransparentAppearance")))))
      .addChild(new Transform().setTranslation(2.5,-2.0,0.0)
        .addChild(new Anchor().setDescription("Touch text for Ship example").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"../../Basic/course/ExtrusionCrossSectionExampleShip.x3d","https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionCrossSectionExampleShip.x3d","../../Basic/course/ExtrusionCrossSectionExampleShip.wrl","https://www.web3d.org/x3d/content/examples/Basic/course/ExtrusionCrossSectionExampleShip.wrl"})
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.7,0.7,0.7).setTransparency(0.2)))
            .setGeometry(new Text().setString(new String[] {"Ship"})
              .setFontStyle(new FontStyle().setUSE("FontCenter"))))
          .addChild(new Shape()
            .setGeometry(new Box().setSize(2.0,1.0,0.01))
            .setAppearance(new Appearance().setUSE("TransparentAppearance")))))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return ExtrusionCrossSectionPrototype model
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
        X3D thisExampleX3dModel = new ExtrusionCrossSectionPrototype().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter06GeometryPointsLinesPolygons.ExtrusionCrossSectionPrototype\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter06GeometryPointsLinesPolygons.ExtrusionCrossSectionPrototype\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
