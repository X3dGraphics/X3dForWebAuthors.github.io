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
 * <p> One simple Fish with three levels of detail. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/Fish.java">Fish.java</a> source, <a href="../../../KelpForestExhibit/FishIndex.html" target="_top">Fish catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/Fish.x3d">Fish.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> One simple Fish with three levels of detail. </td>
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
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Fish.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Fish.x3d</a> </td>
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

public class Fish
{
	/** Default constructor to create this object. */
	public Fish ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Fish.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("One simple Fish with three levels of detail."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Stewart Liles, Sean Hynes"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("25 September 1998"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf"))
    .addMeta(new meta().setName(meta.NAME_ACCESSRIGHTS).setContent("All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Fish.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new Group("Viewpoints")
      .addChild(new Viewpoint().setDescription("Fish High Resolution"))
      .addChild(new Viewpoint().setDescription("Fish Medium Resolution").setPosition(0.0,0.0,35.0))
      .addChild(new Viewpoint().setDescription("Fish Low Resolution").setPosition(0.0,0.0,65.0))
      .addChild(new Viewpoint().setDescription("Fish No Resolution").setPosition(0.0,0.0,105.0)))
    .addComments(" Align fish with X axis ")
    .addChild(new Transform().setRotation(0.0,1.0,0.0,-1.57)
      .addChild(new LOD("FishLOD").setRange(new double[] {30.0,60.0,100.0})
        .addComments(" Three levels of visible detail, then disappears. ")
        .addChild(new Group("Near")
          .addComments(" High resolution fish. ")
          .addChild(new Transform("Fish1").setScale(0.1,0.1,0.1)
            .addChild(new Shape()
              .setAppearance(new Appearance("FishAppear")
                .setMaterial(new Material().setDiffuseColor(0.6,0.65,0.7).setShininess(0.8))
                .setTexture(new ImageTexture("FishJPG").setUrl(new String[] {"Fish2Patch.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Fish2Patch.jpg"})))
              .setGeometry(new IndexedFaceSet("FishIndex").setDEF("FishIndex").setCcw(false).setCreaseAngle(3.14).setSolid(false).setCoordIndex(new int[] {0,2,1,-1,0,3,2,-1,0,4,3,-1,0,5,4,-1,0,1,8,-1,0,8,7,-1,0,7,6,-1,0,6,5,-1,1,2,10,9,-1,2,3,11,10,-1,3,4,12,11,-1,4,5,13,12,-1,1,9,16,8,-1,8,16,15,7,-1,7,15,14,6,-1,6,14,13,5,-1,9,10,18,17,-1,10,11,19,18,-1,11,12,20,19,-1,12,13,21,20,-1,9,17,24,16,-1,16,24,23,15,-1,15,23,22,14,-1,14,22,21,13,-1,17,18,26,25,-1,18,19,27,26,-1,19,20,28,27,-1,20,21,29,28,-1,17,25,32,24,-1,24,32,31,23,-1,23,31,30,22,-1,22,30,29,21,-1,25,26,34,33,-1,26,27,35,34,-1,27,28,36,35,-1,28,29,37,36,-1,25,33,40,32,-1,32,40,39,31,-1,31,39,38,30,-1,30,38,37,29,-1,33,34,41,-1,34,35,41,-1,35,42,41,-1,35,43,42,-1,36,43,35,-1,36,37,43,-1,33,41,40,-1,40,41,39,-1,39,41,42,-1,39,42,43,-1,39,43,37,-1,38,43,37,-1})
                .setCoord(new Coordinate("Fish").setPoint(new MFVec3f(new double[] {0.0,0.0,-1.5,0.0,0.5,-1.0,-0.12,0.25,-1.0,-0.25,0.0,-1.0,-0.12,-0.25,-1.0,0.0,-0.5,-1.0,0.12,-0.25,-1.0,0.25,0.0,-1.0,0.12,0.25,-1.0,0.0,1.0,0.0,-0.25,0.5,0.0,-0.5,0.0,0.0,-0.25,-0.5,0.0,0.0,-1.0,0.0,0.25,-0.5,0.0,0.5,0.0,0.0,0.25,0.5,0.0,0.0,0.88,0.9,-0.19,0.44,0.9,-0.37,0.0,0.9,-0.19,-0.44,0.9,0.0,-0.88,0.9,0.19,-0.44,0.9,0.37,0.0,0.9,0.19,0.44,0.9,0.0,0.75,1.75,-0.12,0.35,1.75,-0.25,0.0,1.75,-0.12,-0.35,1.75,0.0,-0.75,1.75,0.12,-0.35,1.75,0.25,0.0,1.75,0.12,0.35,1.75,0.0,0.5,2.5,-0.05,0.25,2.5,-0.1,0.0,2.5,-0.05,-0.25,2.5,0.0,-0.5,2.5,0.05,-0.25,2.5,0.1,0.0,2.5,0.05,0.25,2.5,0.0,1.25,3.25,0.0,0.0,3.0,0.0,-1.25,3.25})))))))
        .addChild(new Group("Medium")
          .addComments(" Medium resolution fish. ")
          .addChild(new Transform("Fish2").setScale(0.1,0.1,0.1)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("FishAppear"))
              .setGeometry(new IndexedFaceSet().setCcw(false).setCoordIndex(new int[] {0,2,3,-1,0,3,4,-1,0,4,1,-1,0,1,2,-1,1,4,5,-1,2,1,5,-1,3,5,4,-1,3,2,5,-1,5,7,6,-1,5,6,7,-1})
                .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {0.0,0.0,-2.0,0.0,-1.25,0.0,0.5,0.0,0.0,0.0,1.25,0.0,-0.5,0.0,0.0,0.0,0.0,2.25,0.0,1.25,3.0,0.0,-1.25,3.0})))))))
        .addChild(new Group("Far")
          .addComments(" Low resolution fish. ")
          .addChild(new Transform("Fish3").setScale(0.1,0.1,0.1)
            .addChild(new Shape()
              .setAppearance(new Appearance()
                .setMaterial(new Material().setDiffuseColor(0.6,0.9,0.9)))
              .setGeometry(new IndexedFaceSet().setCcw(false).setCreaseAngle(1.57).setCoordIndex(new int[] {0,2,3,-1,0,3,4,-1,0,4,1,-1,0,1,2,-1,1,4,5,-1,2,1,5,-1,3,5,4,-1,3,2,5,-1,5,7,6,-1,5,6,7,-1})
                .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {0.0,0.0,-2.0,0.0,-1.25,0.0,0.3,0.0,0.0,0.0,1.25,0.0,-0.3,0.0,0.0,0.0,0.0,2.25,0.0,1.25,3.0,0.0,-1.25,3.0})))))))
        .addChild(new WorldInfo().setInfo(new String[] {"null"})
          .addComments(" Lowest resolution node is nothing. "))))
    .addChild(new TimeSensor("Clock").setCycleInterval(2.0).setLoop(true))
    .addChild(new CoordinateInterpolator("FishWiggle").setKey(new double[] {0.0,0.25,0.5,0.75,1.0}).setKeyValue(getFishWiggle_3_43_keyValue()))
    .addChild(new ROUTE().setFromNode("Clock").setFromField("fraction_changed").setToNode("FishWiggle").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("FishWiggle").setFromField("value_changed").setToNode("Fish").setToField("set_point")));
    }
	// end of initialize() method

		/** Define subarrays using type double[] */
		private double[] getFishWiggle_3_43_keyValue_1()
		{
			double[] value = {0.0,0.0,-1.5,0.0,0.5,-1.0,-0.12,0.25,-1.0,-0.25,0.0,-1.0,-0.12,-0.25,-1.0,0.0,-0.5,-1.0,0.12,-0.25,-1.0,0.25,0.0,-1.0,0.12,0.25,-1.0,0.0,1.0,0.0,-0.25,0.5,0.0,-0.5,0.0,0.0,-0.25,-0.5,0.0,0.0,-1.0,0.0,0.25,-0.5,0.0,0.5,0.0,0.0,0.25,0.5,0.0,0.0,0.88,0.9,-0.19,0.44,0.9,-0.37,0.0,0.9,-0.19,-0.44,0.9,0.0,-0.88,0.9,0.19,-0.44,0.9,0.37,0.0,0.9,0.19,0.44,0.9,0.0,0.75,1.75,-0.12,0.35,1.75,-0.25,0.0,1.75,-0.12,-0.35,1.75,0.0,-0.75,1.75,0.12,-0.35,1.75,0.25,0.0,1.75,0.12,0.35,1.75,0.0,0.5,2.5,-0.05,0.25,2.5,-0.1,0.0,2.5,-0.05,-0.25,2.5,0.0,-0.5,2.5,0.05,-0.25,2.5,0.1,0.0,2.5,0.05,0.25,2.5,0.0,1.25,3.25,0.0,0.0,3.0,0.0,-1.25,3.25,0.0,0.0,-1.5,0.0,0.5,-1.0,-0.12,0.25,-1.0,-0.25,0.0,-1.0,-0.12,-0.25,-1.0,0.0,-0.5,-1.0,0.12,-0.25,-1.0,0.25,0.0,-1.0,0.12,0.25,-1.0,0.0,1.0,0.0,-0.25,0.5,0.0,-0.5,0.0,0.0,-0.25,-0.5,0.0,0.0,-1.0,0.0,0.25,-0.5,0.0,0.5,0.0,0.0,0.25,0.5,0.0,0.0,0.88,0.9,-0.19,0.44,0.9,-0.37,0.0,0.9,-0.19,-0.44,0.9,0.0,-0.88,0.9,0.19,-0.44,0.9,0.37,0.0,0.9,0.19,0.44,0.9,0.2,0.75,1.75,0.08,0.35,1.75,-0.05,0.0,1.75,0.08,-0.35,1.75,0.2,-0.75,1.75,0.32,-0.35,1.75,0.45,0.0,1.75,0.32,0.35,1.75,0.3,0.5,2.5,0.25,0.25,2.5,0.15,0.0,2.5,0.25,-0.25,2.5,0.3,-0.5,2.5,0.35,-0.25,2.5,0.4,0.0,2.5,0.35,0.25,2.5,0.5,1.25,3.25,0.5,0.0,3.0,0.5,-1.25,3.25,0.0,0.0,-1.5,0.0,0.5,-1.0,-0.12,0.25,-1.0,-0.25,0.0,-1.0,-0.12,-0.25,-1.0,0.0,-0.5,-1.0,0.12,-0.25,-1.0,0.25,0.0,-1.0,0.12,0.25,-1.0,0.0,1.0,0.0,-0.25,0.5,0.0,-0.5,0.0,0.0};
			return value;
		}
		private double[] getFishWiggle_3_43_keyValue_2()
		{
			double[] value = {-0.25,-0.5,0.0,0.0,-1.0,0.0,0.25,-0.5,0.0,0.5,0.0,0.0,0.25,0.5,0.0,0.0,0.88,0.9,-0.19,0.44,0.9,-0.37,0.0,0.9,-0.19,-0.44,0.9,0.0,-0.88,0.9,0.19,-0.44,0.9,0.37,0.0,0.9,0.19,0.44,0.9,0.0,0.75,1.75,-0.12,0.35,1.75,-0.25,0.0,1.75,-0.12,-0.35,1.75,0.0,-0.75,1.75,0.12,-0.35,1.75,0.25,0.0,1.75,0.12,0.35,1.75,0.0,0.5,2.5,-0.05,0.25,2.5,-0.1,0.0,2.5,-0.05,-0.25,2.5,0.0,-0.5,2.5,0.05,-0.25,2.5,0.1,0.0,2.5,0.05,0.25,2.5,0.0,1.25,3.25,0.0,0.0,3.0,0.0,-1.25,3.25,0.0,0.0,-1.5,0.0,0.5,-1.0,-0.12,0.25,-1.0,-0.25,0.0,-1.0,-0.12,-0.25,-1.0,0.0,-0.5,-1.0,0.12,-0.25,-1.0,0.25,0.0,-1.0,0.12,0.25,-1.0,0.0,1.0,0.0,-0.25,0.5,0.0,-0.5,0.0,0.0,-0.25,-0.5,0.0,0.0,-1.0,0.0,0.25,-0.5,0.0,0.5,0.0,0.0,0.25,0.5,0.0,0.0,0.88,0.9,-0.19,0.44,0.9,-0.37,0.0,0.9,-0.19,-0.44,0.9,0.0,-0.88,0.9,0.19,-0.44,0.9,0.37,0.0,0.9,0.19,0.44,0.9,-0.2,0.75,1.75,-0.32,0.35,1.75,-0.45,0.0,1.75,-0.32,-0.35,1.75,-0.2,-0.75,1.75,-0.08,-0.35,1.75,0.05,0.0,1.75,-0.08,0.35,1.75,-0.3,0.5,2.5,-0.35,0.25,2.5,-0.4,0.0,2.5,-0.35,-0.25,2.5,-0.3,-0.5,2.5,-0.25,-0.25,2.5,-0.2,0.0,2.5,-0.25,0.25,2.5,-0.5,1.25,3.25,-0.5,0.0,3.0,-0.5,-1.25,3.25,0.0,0.0,-1.5,0.0,0.5,-1.0,-0.12,0.25,-1.0,-0.25,0.0,-1.0,-0.12,-0.25,-1.0,0.0,-0.5,-1.0,0.12,-0.25,-1.0,0.25,0.0,-1.0,0.12,0.25,-1.0,0.0,1.0,0.0,-0.25,0.5,0.0,-0.5,0.0,0.0,-0.25,-0.5,0.0,0.0,-1.0,0.0,0.25,-0.5,0.0,0.5,0.0,0.0,0.25,0.5,0.0,0.0,0.88,0.9,-0.19,0.44,0.9,-0.37,0.0,0.9,-0.19,-0.44,0.9,0.0,-0.88,0.9,0.19,-0.44,0.9,0.37,0.0,0.9};
			return value;
		}
		private double[] getFishWiggle_3_43_keyValue_3()
		{
			double[] value = {0.19,0.44,0.9,0.0,0.75,1.75,-0.12,0.35,1.75,-0.25,0.0,1.75,-0.12,-0.35,1.75,0.0,-0.75,1.75,0.12,-0.35,1.75,0.25,0.0,1.75,0.12,0.35,1.75,0.0,0.5,2.5,-0.05,0.25,2.5,-0.1,0.0,2.5,-0.05,-0.25,2.5,0.0,-0.5,2.5,0.05,-0.25,2.5,0.1,0.0,2.5,0.05,0.25,2.5,0.0,1.25,3.25,0.0,0.0,3.0,0.0,-1.25,3.25};
			return value;
		}

		/** Large attribute array: CoordinateInterpolator DEF='FishWiggle' keyValue field, scene-graph level=3, element #43, 660 total numbers made up of 220 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getFishWiggle_3_43_keyValue()
		{
			MFVec3f FishWiggle_3_43_keyValue = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getFishWiggle_3_43_keyValue_1()))
				.append(new MFVec3f(getFishWiggle_3_43_keyValue_2()))
				.append(new MFVec3f(getFishWiggle_3_43_keyValue_3()));
			return FishWiggle_3_43_keyValue;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return Fish model
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
        X3D thisExampleX3dModel = new Fish().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.Fish\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.Fish\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
