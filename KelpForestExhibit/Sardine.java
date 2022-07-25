package X3dForWebAuthors.KelpForestExhibit;

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
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> One Sardine, three levels of detail. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/Sardine.java">Sardine.java</a> source, <a href="../../../KelpForestExhibit/SardineIndex.html" target="_top">Sardine catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/Sardine.x3d">Sardine.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> One Sardine, three levels of detail. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Stewart Liles, Sean Hynes </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 25 September 1998 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> accessRights </i> </td>
			<td> All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Sardine.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Sardine.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../KelpForestExhibit/../license.html">../license.html</a> </td>
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

	* @author Stewart Liles, Sean Hynes
 */

public class Sardine
{
	/** Default constructor to create this object. */
	public Sardine ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addComponent(new component().setName("Navigation").setLevel(3))
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Sardine.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("One Sardine, three levels of detail."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Stewart Liles, Sean Hynes"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("25 September 1998"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf"))
    .addMeta(new meta().setName(meta.NAME_ACCESSRIGHTS).setContent("All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Sardine.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new LOD("Sardines").setRange(new double[] {15.0,30.0,60.0})
      .addComments(" Three levels of detail, then disappears. ")
      .addChild(new Group("Near")
        .addComments(" High resolution sardine. ")
        .addChild(new Transform().setScale(.25,.1,.25)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(.61,.61,.61).setEmissiveColor(.5,.5,.5).setShininess(.8).setSpecularColor(.76,.76,.76)))
            .setGeometry(new IndexedFaceSet("SardineIndex").setDEF("SardineIndex").setCcw(false).setCreaseAngle(3.14).setSolid(false).setCoordIndex(new int[] {0,2,1,-1,0,3,2,-1,0,4,3,-1,0,5,4,-1,0,1,8,-1,0,8,7,-1,0,7,6,-1,0,6,5,-1,1,2,10,9,-1,2,3,11,10,-1,3,4,12,11,-1,4,5,13,12,-1,1,9,16,8,-1,8,16,15,7,-1,7,15,14,6,-1,6,14,13,5,-1,9,10,18,17,-1,10,11,19,18,-1,11,12,20,19,-1,12,13,21,20,-1,9,17,24,16,-1,16,24,23,15,-1,15,23,22,14,-1,14,22,21,13,-1,17,18,26,25,-1,18,19,27,26,-1,19,20,28,27,-1,20,21,29,28,-1,17,25,32,24,-1,24,32,31,23,-1,23,31,30,22,-1,22,30,29,21,-1,25,26,34,33,-1,26,27,35,34,-1,27,28,36,35,-1,28,29,37,36,-1,25,33,40,32,-1,32,40,39,31,-1,31,39,38,30,-1,30,38,37,29,-1,33,34,41,-1,34,35,41,-1,35,42,41,-1,35,43,42,-1,36,43,35,-1,36,37,43,-1,33,41,40,-1,40,41,39,-1,39,41,42,-1,39,42,43,-1,39,43,37,-1,38,43,37,-1,50,49,48,47,46,45,44,-1,57,56,55,54,53,52,51,-1,44,45,52,51,-1,45,46,53,52,-1,46,47,54,53,-1,47,48,55,54,-1,48,49,56,55,-1,49,50,57,56,-1})
              .setCoord(new Coordinate("Sardine").setPoint(new MFVec3f(new double[] {0.0,0.0,-1.5,0.0,.5,-1.0,-.12,.25,-1.0,-.25,0.0,-1.0,-.12,-.25,-1.0,0.0,-.5,-1.0,.12,-.25,-1.0,.25,0.0,-1.0,.12,.25,-1.0,0.0,1.0,0.0,-.25,.5,0.0,-.5,0.0,0.0,-.25,-.5,0.0,0.0,-1.0,0.0,.25,-.5,0.0,.5,0.0,0.0,.25,.5,0.0,0.0,.88,.9,-.19,.44,.9,-.37,0.0,.9,-.19,-.44,.9,0.0,-.88,.9,.19,-.44,.9,.37,0.0,.9,.19,.44,.9,0.0,.75,1.75,-.12,.35,1.75,-.25,0.0,1.75,-.12,-.35,1.75,0.0,-.75,1.75,.12,-.35,1.75,.25,0.0,1.75,.12,.35,1.75,0.0,.5,2.5,-.05,.25,2.5,-.1,0.0,2.5,-.05,-.25,2.5,0.0,-.5,2.5,.05,-.25,2.5,.1,0.0,2.5,.05,.25,2.5,1.0,1.25,3.25,0.0,0.0,3.0,0.0,-1.25,3.25,.01,-.7,-1.7,.01,-.75,-2.3,.01,-.74,-2.325,.01,-.72,-2.35,.01,-.7,-2.36,.01,-.67,-2.35,.01,-.54,-2.29,-.01,-.7,-1.7,-.01,-.75,-2.3,-.01,-.74,-2.325,-.01,-.72,-2.35,-.01,-.7,-2.36,-.01,-.67,-2.35,-.01,-.54,-2.29})))))
          .addChild(new Transform("LeftEye").setTranslation(-.25,.2,-.55)
            .addChild(new Shape("Eye")
              .setAppearance(new Appearance()
                .setMaterial(new Material().setDiffuseColor(.1,.1,.1).setShininess(.5)))
              .setGeometry(new Sphere().setRadius(.1))))
          .addChild(new Transform("RightEye").setTranslation(.25,.2,-.55)
            .addChild(new Shape().setUSE("Eye")))
          .addChild(new Transform("DorsalFin")
            .addChild(new Shape()
              .setAppearance(new Appearance()
                .setMaterial(new Material().setDiffuseColor(.61,.61,.61).setEmissiveColor(.4,.4,.4).setShininess(.7).setSpecularColor(.75,.75,.75)))
              .setGeometry(new Extrusion().setConvex(false).setCrossSection(new MFVec2f(new double[] {0.0,.9,.25,0.0,1.3,.5,0.0,1.6,.6,0.0,1.3,.7,0.0,1.1,.8,0.0,1.0,.9,0.0,.95,1.0,0.0,.7,1.0})).setOrientation(new MFRotation(new double[] {0.0,1.0,0.0,0.0,0.0,1.0,0.0,0.0})).setScale(new MFVec2f(new double[] {1.0,1.0,1.0,1.0})).setSolid(false).setSpine(new MFVec3f(new double[] {.02,0.0,0.0,-.02,0.0,0.0})))))
          .addChild(new Transform()
            .addChild(new Shape()
              .setAppearance(new Appearance()
                .setMaterial(new Material().setDiffuseColor(.61,.61,.61).setEmissiveColor(.4,.4,.4).setShininess(.4).setSpecularColor(.75,.75,.75)))
              .setGeometry(new IndexedFaceSet().setCoordIndex(new int[] {0,3,2,-1,1,3,0,-1,1,0,2,-1,3,1,2,-1})
                .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {.1,-.65,.5,.1,-.7,.5,.1,-.7,.8,.15,-1.1,1.2})))))
            .addChild(new Shape()
              .setAppearance(new Appearance()
                .setMaterial(new Material().setDiffuseColor(.61,.61,.61).setEmissiveColor(.4,.4,.4).setShininess(.4).setSpecularColor(.75,.75,.75)))
              .setGeometry(new IndexedFaceSet().setCoordIndex(new int[] {0,3,2,-1,1,3,0,-1,1,0,2,-1,3,1,2,-1})
                .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-.1,-.65,.5,-.1,-.7,.5,-.1,-.7,.8,-.15,-1.1,1.2}))))))))
      .addChild(new Group("Medium")
        .addComments(" Medium resolution sardine. ")
        .addChild(new Transform().setScale(.25,.1,.25)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(.61,.61,.61).setShininess(.9).setSpecularColor(.76,.76,.76)))
            .setGeometry(new IndexedFaceSet().setUSE("SardineIndex")))))
      .addChild(new Group("Far")
        .addComments(" Low resolution sardine. ")
        .addChild(new Transform().setRotation(1.0,0.0,0.0,-1.57).setScale(.3,.25,.25)
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(.7,.7,.7))
              .setTexture(new ImageTexture().setUrl(new String[] {"SardineScalesPatch.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SardineScalesPatch.jpg"})))
            .setGeometry(new Extrusion().setCreaseAngle(1.57).setCrossSection(new MFVec2f(new double[] {-0.1,1.0,0.1,1.0,0.5,0.5,0.5,-0.5,0.1,-1.0,-0.1,-1.0,-0.5,-0.5,-0.5,0.5,-0.1,1.0})).setScale(new MFVec2f(new double[] {0.03,0.03,0.3,0.4,0.1,0.2,0.1,0.15,0.03,0.4})).setSpine(new MFVec3f(new double[] {0.0,2.51,0.0,0.0,1.80,0.0,0.0,0.5,0.0,0.0,0.0,0.0,0.0,-0.6,0.0}))))))
      .addChild(new WorldInfo().setInfo(new String[] {"null"})
        .addComments(" Lowest resolution node is nothing. ")))
    .addComments(" <Group DEF='TestViewpoints'> <Viewpoint description='Hi Res' orientation='0 1 0 1.57' position='2 0 0'/> <Viewpoint description='Med Res' orientation='0 1 0 1.57' position='15 0 0'/> <Viewpoint description='Low Res' orientation='0 1 0 1.57' position='30 0 0'/> </Group> ")
    .addChild(new ViewpointGroup("HideViewpointsWhenDistant").setDescription("Sardine views up close").setSize(20.0,20.0,20.0)
      .addComments(" Viewpoints around sardine at very close range, one good viewpoint fairly close to sardine, and no viewpoints further away. ")
      .addChild(new Viewpoint().setDescription("Closeup view right").setOrientation(0.0,1.0,0.0,1.57).setPosition(2.0,0.0,0.0))
      .addChild(new Viewpoint().setDescription("Closeup view right face").setOrientation(0.0,1.0,0.0,2.355).setPosition(2.0,0.0,-2.0))
      .addChild(new Viewpoint().setDescription("Closeup view face to face").setOrientation(0.0,1.0,0.0,3.14).setPosition(0.0,0.0,-2.0))
      .addChild(new Viewpoint().setDescription("Closeup view left face").setOrientation(0.0,1.0,0.0,3.825).setPosition(-2.0,0.0,-2.0))
      .addChild(new Viewpoint().setDescription("Closeup view left").setOrientation(0.0,1.0,0.0,-1.57).setPosition(-2.0,0.0,0.0))
      .addChild(new Viewpoint().setDescription("Closeup view left tail").setOrientation(0.0,1.0,0.0,-0.785).setPosition(-2.0,0.0,2.0))
      .addChild(new Viewpoint().setDescription("Closeup view tail").setPosition(0.0,0.0,2.0))
      .addChild(new Viewpoint().setDescription("Closeup view right tail").setOrientation(0.0,1.0,0.0,0.785).setPosition(2.0,0.0,2.0))
      .addChild(new Viewpoint().setDescription("Closeup view top looking down").setOrientation(1.0,0.0,0.0,-1.57).setPosition(0.0,2.0,0.0))
      .addChild(new Viewpoint().setDescription("Closeup view bottom looking up").setOrientation(1.0,0.0,0.0,1.57).setPosition(0.0,-2.0,0.0)))
    .addChild(new Viewpoint().setDescription("Single viewpoint when fairly close to sardine").setOrientation(0.0,1.0,0.0,1.57).setPosition(10.0,0.0,0.0))
    .addChild(new TimeSensor("Clock").setCycleInterval(0.5).setLoop(true))
    .addChild(new CoordinateInterpolator("FishWiggle").setKey(new double[] {0.0,0.25,0.50,0.75,1.0}).setKeyValue(getFishWiggle_3_72_keyValue()))
    .addChild(new ROUTE().setFromNode("Clock").setFromField("fraction_changed").setToNode("FishWiggle").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("FishWiggle").setFromField("value_changed").setToNode("Sardine").setToField("set_point")));
    }
	// end of initialize() method

		/** Define subarrays using type double[] */
		private double[] getFishWiggle_3_72_keyValue_1()
		{
			double[] value = {0.0,0.0,-1.5,0.0,.5,-1.0,-.12,.25,-1.0,-.25,0.0,-1.0,-.12,-.25,-1.0,0.0,-.5,-1.0,.12,-.25,-1.0,.25,0.0,-1.0,.12,.25,-1.0,0.0,1.0,0.0,-.25,.5,0.0,-.5,0.0,0.0,-.25,-.5,0.0,0.0,-1.0,0.0,.25,-.5,0.0,.5,0.0,0.0,.25,0.5,0.0,0.0,.88,.9,-.19,.44,.9,-.37,0.0,.9,-.19,-.44,.9,0.0,-.88,.9,.19,-.44,.9,.37,0.0,.9,.19,.44,.9,0.0,.75,1.75,-.12,.35,1.75,-.25,0.0,1.75,-.12,-.35,1.75,0.0,-.75,1.75,.12,-.35,1.75,.25,0.0,1.75,.12,.35,1.75,0.0,.5,2.5,-.05,.25,2.5,-.1,0.0,2.5,-.05,-.25,2.5,0.0,-.5,2.5,.05,-.25,2.5,.1,0.0,2.5,.05,.25,2.5,0.0,1.25,3.25,0.0,0.0,3.0,0.0,-1.25,3.25,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,0.0,-1.5,0.0,.5,-1.0,-.12,.25,-1.0,-.25,0.0,-1.0,-.12,-.25,-1.0,0.0,-.5,-1.0,.12,-.25,-1.0,.25,0.0,-1.0,.12,.25,-1.0,0.0,1.0,0.0,-.25,.5,0.0,-.5,0.0,0.0,-.25,-.5,0.0,0.0,-1.0,0.0,.25,-.5,0.0,.5,0.0,0.0,.25,0.5,0.0,0.0,.88,.9,-.19,.44,.9,-.37,0.0,.9,-.19,-.44,.9,0.0,-.88,.9,.19,-.44,.9,.37,0.0,.9,.19,.44,.9,.2,.75,1.75,.08,.35,1.75,-.05,0.0,1.75,.08,-.35,1.75,.2,-.75,1.75,.32,-.35,1.75,.45,0.0,1.75,.32,.35,1.75,.3,.5,2.5,.25,.25,2.5,.15,0.0,2.5,.25,-.25,2.5,.30,-.5,2.5,.35,-.25,2.5,.4,0.0,2.5,.35,.25,2.5,.50,1.25,3.25};
			return value;
		}
		private double[] getFishWiggle_3_72_keyValue_2()
		{
			double[] value = {.50,0.0,3.0,.50,-1.25,3.25,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,.3,-.5,2.5,0.0,0.0,-1.5,0.0,.5,-1.0,-.12,.25,-1.0,-.25,0.0,-1.0,-.12,-.25,-1.0,0.0,-.5,-1.0,.12,-.25,-1.0,.25,0.0,-1.0,.12,.25,-1.0,0.0,1.0,0.0,-.25,.5,0.0,-.5,0.0,0.0,-.25,-.5,0.0,0.0,-1.0,0.0,.25,-.5,0.0,.5,0.0,0.0,.25,0.5,0.0,0.0,.88,.9,-.19,.44,.9,-.37,0.0,.9,-.19,-.44,.9,0.0,-.88,.9,.19,-.44,.9,.37,0.0,.9,.19,.44,.9,0.0,.75,1.75,-.12,.35,1.75,-.25,0.0,1.75,-.12,-.35,1.75,0.0,-.75,1.75,.12,-.35,1.75,.25,0.0,1.75,.12,.35,1.75,0.0,.5,2.5,-.05,.25,2.5,-.1,0.0,2.5,-.05,-.25,2.5,0.0,-.5,2.5,.05,-.25,2.5,.1,0.0,2.5,.05,.25,2.5,0.0,1.25,3.25,0.0,0.0,3.0,0.0,-1.25,3.25,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,0.0,-1.5,0.0,.5,-1.0,-.12,.25,-1.0,-.25,0.0,-1.0,-.12,-.25,-1.0,0.0,-.5,-1.0,.12,-.25,-1.0,.25,0.0,-1.0,.12,.25,-1.0,0.0,1.0,0.0,-.25,.5,0.0,-.5,0.0,0.0,-.25,-.5,0.0,0.0,-1.0,0.0,.25,-.5,0.0,.5,0.0,0.0,.25,0.5,0.0,0.0,.88,.9,-.19,.44,.9,-.37,0.0,.9,-.19,-.44,.9,0.0,-.88,.9,.19,-.44,.9,.37,0.0,.9,.19,.44,.9,-.20,.75,1.75};
			return value;
		}
		private double[] getFishWiggle_3_72_keyValue_3()
		{
			double[] value = {-.32,.35,1.75,-.45,0.0,1.75,-.32,-.35,1.75,-.20,-.75,1.75,-.08,-.35,1.75,.05,0.0,1.75,-.08,.35,1.75,-.30,.5,2.5,-.35,.25,2.5,-.4,0.0,2.5,-.35,-.25,2.5,-.30,-.5,2.5,-.25,-.25,2.5,-.2,0.0,2.5,-.25,.25,2.5,-.50,1.25,3.25,-.50,0.0,3.0,-.50,-1.25,3.25,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,-.3,-.5,2.5,0.0,0.0,-1.5,0.0,.5,-1.0,-.12,.25,-1.0,-.25,0.0,-1.0,-.12,-.25,-1.0,0.0,-.5,-1.0,.12,-.25,-1.0,.25,0.0,-1.0,.12,.25,-1.0,0.0,1.0,0.0,-.25,.5,0.0,-.5,0.0,0.0,-.25,-.5,0.0,0.0,-1.0,0.0,.25,-.5,0.0,.5,0.0,0.0,.25,0.5,0.0,0.0,.88,.9,-.19,.44,.9,-.37,0.0,.9,-.19,-.44,.9,0.0,-.88,.9,.19,-.44,.9,.37,0.0,.9,.19,.44,.9,0.0,.75,1.75,-.12,.35,1.75,-.25,0.0,1.75,-.12,-.35,1.75,0.0,-.75,1.75,.12,-.35,1.75,.25,0.0,1.75,.12,.35,1.75,0.0,.5,2.5,-.05,.25,2.5,-.1,0.0,2.5,-.05,-.25,2.5,0.0,-.5,2.5,.05,-.25,2.5,.1,0.0,2.5,.05,.25,2.5,0.0,1.25,3.25,0.0,0.0,3.0,0.0,-1.25,3.25,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5,0.0,-.5,2.5};
			return value;
		}

		/** Large attribute array: CoordinateInterpolator DEF='FishWiggle' keyValue field, scene-graph level=3, element #72, 870 total numbers made up of 290 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getFishWiggle_3_72_keyValue()
		{
			MFVec3f FishWiggle_3_72_keyValue = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getFishWiggle_3_72_keyValue_1()))
				.append(new MFVec3f(getFishWiggle_3_72_keyValue_2()))
				.append(new MFVec3f(getFishWiggle_3_72_keyValue_3()));
			return FishWiggle_3_72_keyValue;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return Sardine model
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
        X3D thisExampleX3dModel = new Sardine().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.Sardine\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.Sardine\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
