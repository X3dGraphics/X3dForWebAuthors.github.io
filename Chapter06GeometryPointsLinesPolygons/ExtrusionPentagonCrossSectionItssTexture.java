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
import org.web3d.x3d.jsail.EnvironmentalEffects.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Texturing.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Comparison of Extrusion, ExtrusionCrossSectionPrototype, ExtrusionCrossSectionITSSPrototype for Texture Mapping. </p>
 <p> Related links: <a href="../../../Chapter06GeometryPointsLinesPolygons/ExtrusionPentagonCrossSectionItssTexture.java">ExtrusionPentagonCrossSectionItssTexture.java</a> source, <a href="../../../Chapter06GeometryPointsLinesPolygons/ExtrusionPentagonCrossSectionItssTextureIndex.html" target="_top">ExtrusionPentagonCrossSectionItssTexture catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter06GeometryPointsLinesPolygons/ExtrusionPentagonCrossSectionItssTexture.x3d">ExtrusionPentagonCrossSectionItssTexture.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Comparison of Extrusion, ExtrusionCrossSectionPrototype, ExtrusionCrossSectionITSSPrototype for Texture Mapping. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman and Sungmin Kwon </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> contributor </i> </td>
			<td> Naval Postgraduate School </td>
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
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> Extrusion, ExtrusionCrossSectionPrototype, ExtrusionCrossSectionITSSPrototype with Textrue Image </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionPentagonCrossSectionItssTexture.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionPentagonCrossSectionItssTexture.x3d</a> </td>
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

	* @author Don Brutzman and Sungmin Kwon
 */

public class ExtrusionPentagonCrossSectionItssTexture
{
	/** Default constructor to create this object. */
	public ExtrusionPentagonCrossSectionItssTexture ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("ExtrusionPentagonCrossSectionItssTexture.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Comparison of Extrusion, ExtrusionCrossSectionPrototype, ExtrusionCrossSectionITSSPrototype for Texture Mapping."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman and Sungmin Kwon"))
    .addMeta(new meta().setName(meta.NAME_CONTRIBUTOR).setContent("Naval Postgraduate School"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("23 October 2017"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("Extrusion, ExtrusionCrossSectionPrototype, ExtrusionCrossSectionITSSPrototype with Textrue Image"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionPentagonCrossSectionItssTexture.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("ExtrusionPentagonCrossSectionItssTexture.x3d"))
    .addChild(new NavigationInfo("ExamineMode"))
    .addChild(new NavigationInfo("FlyPanNavigation").setType("\"FLY\" \"ANY\""))
    .addChild(new Background().setSkyColor(new MFColor(new double[] {1.0,1.0,1.0})))
    .addChild(new Viewpoint().setDescription("Oblique view from above").setOrientation(-1.0,0.015,-0.006,0.78).setPosition(0.25,14.0,14.0))
    .addChild(new Viewpoint().setDescription("Extrusion Pentagon").setOrientation(-1.0,0.0,0.0,0.2).setPosition(0.0,4.0,16.0))
    .addChild(new Viewpoint().setDescription("Overhead view").setOrientation(1.0,0.0,0.0,-1.57).setPosition(0.0,27.0,0.0))
    .addChild(new Background().setGroundColor(new MFColor(new double[] {0.9,0.9,0.9})).setSkyColor(new MFColor(new double[] {0.9,0.9,0.9})))
    .addComments(" Title ")
    .addChild(new Transform().setRotation(1.0,0.0,0.0,-1.3).setTranslation(0.0,2.0,-9.0)
      .addChild(new Shape()
        .setGeometry(new Text("Title").setString(new String[] {"Comparison of Extrusion Based Structure with Texture Map"})
          .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0)))))
    .addComments(" Extrusion Node ")
    .addChild(new Transform().setTranslation(-4.0,0.0,-4.0)
      .addChild(new Shape()
        .setGeometry(new Extrusion().setBeginCap(false).setCrossSection(new MFVec2f(new double[] {-3.5,-1.0,-2.1,2.9,2.2,2.9,3.6,-1.0,0.0,-3.5,-3.5,-1.0})).setEndCap(false).setScale(new MFVec2f(new double[] {1.0,1.0,1.0,1.0,0.2,0.2})).setSpine(new MFVec3f(new double[] {0.0,0.0,0.0,0.0,1.0,0.0,0.0,1.6,0.0})))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.2,0.6,0.5))
          .setTexture(new ImageTexture().setUrl(new String[] {"../earth-topo.png","https://X3dGraphics.com/examples/X3dForWebAuthors/earth-topo.png"}))))
      .addChild(new Transform().setRotation(1.0,0.0,0.0,-1.3).setTranslation(0.0,0.0,2.9)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"Extrusion Node"})
            .setFontStyle(new FontStyle("CenterFontStyle").setJustify(FontStyle.JUSTIFY_MIDDLE_BEGIN).setSize(0.6).setCssStyle("BOLD")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0))))))
    .addComments(" ExtrusionCrossSection Prototype Node ")
    .addChild(new ExternProtoDeclare("ExtrusionCrossSection").setName("ExtrusionCrossSection").setAppinfo("Shape prototype for Extrusion node that also draws spine line plus oriented scaled cross sections at each spine point").setDocumentation("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.x3d").setUrl(new String[] {"ExtrusionCrossSectionPrototype.x3d#ExtrusionCrossSection","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.x3d#ExtrusionCrossSection","ExtrusionCrossSectionPrototype.wrl#ExtrusionCrossSection","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionPrototype.wrl#ExtrusionCrossSection"})
      .addField(new field().setName("name").setType(field.TYPE_SFSTRING).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion name"))
      .addField(new field().setName("crossSection").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("spine").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("scale").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("orientation").setType(field.TYPE_MFROTATION).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("beginCap").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("endCap").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("ccw").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("convex").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("creaseAngle").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("solid").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("extrusionImageTexture").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Image to apply to Extrusion"))
      .addField(new field().setName("extrusionTextureTransform").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("TextureTransform coordinates of image applied to Extrusion"))
      .addField(new field().setName("set_crossSection").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("set_spine").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("set_scale").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("set_orientation").setType(field.TYPE_MFROTATION).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("traceEnabled").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Whether to provide initialization trace statements showing node construction"))
      .addField(new field().setName("spineColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("emissiveColor of spine"))
      .addField(new field().setName("crossSectionColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("diffuseColor of crossSection"))
      .addField(new field().setName("crossSectionTransparency").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("transparency of crossSection"))
      .addField(new field().setName("extrusionColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("diffuseColor of extrusion hull"))
      .addField(new field().setName("extrusionTransparency").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("transparency of extrusion hull")))
    .addChild(new Transform().setTranslation(4.0,0.0,-4.0)
      .addChild(new ProtoInstance("ExtrusionCrossSection", "PentagonExtrusion").setContainerField("children")
        .addFieldValue(new fieldValue().setName("name").setValue("PentagonExtrusion"))
        .addFieldValue(new fieldValue().setName("crossSection").setValue(new MFVec2f(new MFVec2f(new double[] {-3.5,-1.0,-2.1,2.9,2.2,2.9,3.6,-1.0,0.0,-3.5,-3.5,-1.0}))))
        .addFieldValue(new fieldValue().setName("spine").setValue(new MFVec3f(new MFVec3f(new double[] {0.0,0.0,0.0,0.0,1.0,0.0,0.0,1.6,0.0}))))
        .addFieldValue(new fieldValue().setName("scale").setValue(new MFVec2f(new MFVec2f(new double[] {1.0,1.0,1.0,1.0,0.2,0.2}))))
        .addFieldValue(new fieldValue().setName("creaseAngle").setValue(3))
        .addFieldValue(new fieldValue().setName("ccw").setValue(true))
        .addFieldValue(new fieldValue().setName("extrusionImageTexture")
          .addChild(new ImageTexture().setUrl(new String[] {"../earth-topo.png","https://X3dGraphics.com/examples/X3dForWebAuthors/earth-topo.png"})))
        .addFieldValue(new fieldValue().setName("spineColor").setValue(new SFColor(0.7,0.7,0.0)))
        .addFieldValue(new fieldValue().setName("crossSectionColor").setValue(new SFColor(0.6,0.6,0.2)))
        .addFieldValue(new fieldValue().setName("extrusionColor").setValue(new SFColor(0.2,0.6,0.5)))
        .addFieldValue(new fieldValue().setName("extrusionTransparency").setValue(0.0))
        .addFieldValue(new fieldValue().setName("traceEnabled").setValue(false)))
      .addChild(new Transform().setRotation(1.0,0.0,0.0,-1.3).setTranslation(0.0,0.0,3.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"ExtrusionCrossSection","Prototype"})
            .setFontStyle(new FontStyle().setUSE("CenterFontStyle")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0))))))
    .addComments(" ExtrusionCrossSectionITSS Prototype Node ")
    .addChild(new ExternProtoDeclare("ExtrusionCrossSectionITSS").setName("ExtrusionCrossSectionITSS").setUrl(new String[] {"ExtrusionCrossSectionITSSPrototype.x3d#ExtrusionCrossSectionITSS","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionITSSPrototype.x3d#ExtrusionCrossSectionITSS","ExtrusionCrossSectionITSSPrototype.wrl#ExtrusionCrossSectionITSS","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ExtrusionCrossSectionITSSPrototype.wrl#ExtrusionCrossSectionITSS"})
      .addField(new field().setName("name").setType(field.TYPE_SFSTRING).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion name"))
      .addField(new field().setName("crossSection").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("spine").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("scale").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("orientation").setType(field.TYPE_MFROTATION).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("beginCap").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("endCap").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("ccw").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("convex").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("creaseAngle").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("solid").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("extrusionImageTexture").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Image to apply to Extrusion"))
      .addField(new field().setName("extrusionTextureTransform").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("TextureTransform coordinates of image applied to Extrusion"))
      .addField(new field().setName("set_crossSection").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("set_spine").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("set_scale").setType(field.TYPE_MFVEC2F).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("set_orientation").setType(field.TYPE_MFROTATION).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Extrusion field"))
      .addField(new field().setName("traceEnabled").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Whether to provide initialization trace statements showing node construction"))
      .addField(new field().setName("spineColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("emissiveColor of spine"))
      .addField(new field().setName("crossSectionColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("diffuseColor of crossSection"))
      .addField(new field().setName("crossSectionTransparency").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("transparency of crossSection"))
      .addField(new field().setName("extrusionColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("diffuseColor of extrusion hull"))
      .addField(new field().setName("extrusionTransparency").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("transparency of extrusion hull")))
    .addChild(new Transform().setTranslation(0.0,0.0,3.5)
      .addChild(new ProtoInstance("ExtrusionCrossSectionITSS", "PentagonExtrusionITSS").setContainerField("children")
        .addFieldValue(new fieldValue().setName("name").setValue("PentagonExtrusionITSS"))
        .addFieldValue(new fieldValue().setName("crossSection").setValue(new MFVec2f(new MFVec2f(new double[] {-3.5,-1.0,-2.1,2.9,2.2,2.9,3.6,-1.0,0.0,-3.5,-3.5,-1.0}))))
        .addFieldValue(new fieldValue().setName("spine").setValue(new MFVec3f(new MFVec3f(new double[] {0.0,0.0,0.0,0.0,1.0,0.0,0.0,1.6,0.0}))))
        .addFieldValue(new fieldValue().setName("scale").setValue(new MFVec2f(new MFVec2f(new double[] {1.0,1.0,1.0,1.0,0.2,0.2}))))
        .addFieldValue(new fieldValue().setName("ccw").setValue(true))
        .addFieldValue(new fieldValue().setName("extrusionImageTexture")
          .addChild(new ImageTexture().setUrl(new String[] {"../earth-topo.png","https://X3dGraphics.com/examples/X3dForWebAuthors/earth-topo.png"})))
        .addFieldValue(new fieldValue().setName("spineColor").setValue(new SFColor(0.7,0.7,0.0)))
        .addFieldValue(new fieldValue().setName("crossSectionColor").setValue(new SFColor(0.6,0.6,0.2)))
        .addFieldValue(new fieldValue().setName("extrusionColor").setValue(new SFColor(0.2,0.6,0.5)))
        .addFieldValue(new fieldValue().setName("extrusionTransparency").setValue(0.0))
        .addFieldValue(new fieldValue().setName("traceEnabled").setValue(false)))
      .addChild(new Transform().setRotation(1.0,0.0,0.0,-1.5).setTranslation(0.0,0.0,3.2)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"ExtrusionCrossSectionITSS Prototype"})
            .setFontStyle(new FontStyle().setUSE("CenterFontStyle")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0)))))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return ExtrusionPentagonCrossSectionItssTexture model
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
        X3D thisExampleX3dModel = new ExtrusionPentagonCrossSectionItssTexture().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter06GeometryPointsLinesPolygons.ExtrusionPentagonCrossSectionItssTexture\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter06GeometryPointsLinesPolygons.ExtrusionPentagonCrossSectionItssTexture\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
