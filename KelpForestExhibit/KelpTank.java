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
import org.web3d.x3d.jsail.EnvironmentalEffects.*;
import org.web3d.x3d.jsail.EnvironmentalSensor.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Kelp Forest Tank at the Monterey Bay Aquarium. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/KelpTank.java">KelpTank.java</a> source, <a href="../../../KelpForestExhibit/KelpTankIndex.html" target="_top">KelpTank catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/KelpTank.x3d">KelpTank.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Kelp Forest Tank at the Monterey Bay Aquarium. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Mark Boyd </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 11 June 1998 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Jeffrey Weekley, using NIST VRML to X3D Translator, with review and editing in Xeena. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translated </i> </td>
			<td> 22 December 2002 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTank.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTank.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> Vrml97ToX3dNist, <a href="http://ovrt.nist.gov/v2_x3d.html" target="_blank">http://ovrt.nist.gov/v2_x3d.html</a> </td>
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

	* @author Mark Boyd
 */

public class KelpTank
{
	/** Default constructor to create this object. */
	public KelpTank ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("KelpTank.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Kelp Forest Tank at the Monterey Bay Aquarium."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Mark Boyd"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("11 June 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Jeffrey Weekley, using NIST VRML to X3D Translator, with review and editing in Xeena."))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("22 December 2002"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTank.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("KelpTank.x3d"))
    .addChild(new Group("FogSwitching")
      .addChild(new Fog("FogOffVisibilityRange0"))
      .addChild(new Fog("InsideTankFog").setColor(0.1,0.4,0.4).setVisibilityRange(25.0))
      .addChild(new ProximitySensor("CameraInsideTankSensor").setCenter(0.0,-4.0,-5.0).setSize(25.0,10.0,20.0))
      .addChild(new ROUTE().setFromNode("CameraInsideTankSensor").setFromField("isActive").setToNode("InsideTankFog").setToField("set_bind")))
    .addChild(new Collision().setEnabled(false)
      .addChild(new Transform()
        .addChild(new Inline().setUrl(new String[] {"KelpTankWaterSurface.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTankWaterSurface.x3d","KelpTankWaterSurface.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTankWaterSurface.wrl"})))
      .addChild(new Transform()
        .addChild(new Inline().setUrl(new String[] {"KelpTankExternalLights.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTankExternalLights.x3d","KelpTankExternalLights.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTankExternalLights.wrl"})))
      .addChild(new Transform().setRotation(0.0,1.0,0.0,1.5785398).setTranslation(-10.35,1.0,-0.5)
        .addChild(new Inline().setUrl(new String[] {"PumpHouse.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/PumpHouse.x3d","PumpHouse.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/PumpHouse.wrl"})))
      .addChild(new Shape()
        .setAppearance(new Appearance("WallAppearance")
          .setMaterial(new Material().setDiffuseColor(0.251,0.239,0.212)))
        .setGeometry(new IndexedFaceSet().setCoordIndex(new int[] {0,1,2,3,-1,4,5,6,7,-1,8,9,10,11,-1,16,17,18,19,-1,11,10,3,2,-1,5,4,17,16,-1,20,0,3,21,-1,22,4,7,23,-1,9,24,25,10,-1,17,28,29,18,-1,10,25,21,3,-1,4,22,28,17,-1,30,20,21,31,-1,32,22,23,33,-1,24,34,35,25,-1,28,38,39,29,-1,25,35,31,21,-1,22,32,38,28,-1,40,30,31,41,-1,42,32,33,43,-1,34,44,45,35,-1,38,48,49,39,-1,35,45,41,31,-1,32,42,48,38,-1})
          .setCoord(new Coordinate("WindowCoordinates").setPoint(new MFVec3f(new double[] {-2.5,-8.5344,0.7,-4.5,-8.5344,2.7,-4.5,-7.21,2.7,-2.5,-7.21,0.7,-2.5,-0.5,0.7,-4.5,-0.5,2.7,-4.5,0.9144,2.7,-2.5,0.9144,0.7,-4.5,-8.5344,3.0,-2.5,-8.5344,1.0,-2.5,-7.21,1.0,-4.5,-7.21,3.0,-4.5,-7.21,2.8,-2.5,-7.21,0.8,-2.5,-0.5,0.8,-4.5,-0.5,2.8,-4.5,-0.5,3.0,-2.5,-0.5,1.0,-2.5,0.9144,1.0,-4.5,0.9144,3.0,0.0,-8.5344,-0.3,0.0,-7.21,-0.3,0.0,-0.5,-0.3,0.0,0.9144,-0.3,0.0,-8.5344,0.0,0.0,-7.21,0.0,0.0,-7.21,-0.2,0.0,-0.5,-0.2,0.0,-0.5,0.0,0.0,0.9144,0.0,2.5,-8.5344,0.7,2.5,-7.21,0.7,2.5,-0.5,0.7,2.5,0.9144,0.7,2.5,-8.5344,1.0,2.5,-7.21,1.0,2.5,-7.21,0.8,2.5,-0.5,0.8,2.5,-0.5,1.0,2.5,0.9144,1.0,4.5,-8.5344,2.7,4.5,-7.21,2.7,4.5,-0.5,2.7,4.5,0.9144,2.7,4.5,-8.5344,3.0,4.5,-7.21,3.0,4.5,-7.21,2.8,4.5,-0.5,2.8,4.5,-0.5,3.0,4.5,0.9144,3.0})))))
      .addChild(new Transform()
        .addChild(new Shape()
          .setAppearance(new Appearance("Glass")
            .setMaterial(new Material().setDiffuseColor(0.275,0.655,0.62).setTransparency(0.63)))
          .setGeometry(new IndexedFaceSet().setCoordIndex(new int[] {3,2,5,4,-1,12,13,14,15,-1,21,3,4,22,-1,13,26,27,14,-1,31,21,22,32,-1,26,36,37,27,-1,41,31,32,42,-1,36,46,47,37,-1})
            .setCoord(new Coordinate().setUSE("WindowCoordinates")))))
      .addChild(new Shape()
        .setAppearance(new Appearance().setUSE("WallAppearance"))
        .setGeometry(new IndexedFaceSet().setCoordIndex(getIndexedFaceSet_5_37_coordIndex())
          .setCoord(new Coordinate("WallCoordinates").setPoint(getWallCoordinates_6_37_point()))))
      .addChild(new Transform()
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.0,0.0)))
          .setGeometry(new IndexedFaceSet()
            .setCoord(new Coordinate().setUSE("WallCoordinates")))))
      .addChild(new Transform()
        .addChild(new Shape()
          .setAppearance(new Appearance().setUSE("Glass"))
          .setGeometry(new IndexedFaceSet().setCoordIndex(new int[] {151,150,149,148,147,146,145,144,-1,159,158,157,156,155,154,153,152,-1,128,129,130,131,132,133,134,135,-1,136,137,138,139,140,141,142,143,-1,75,74,73,72,-1,79,78,77,76,-1,42,43,44,45,-1,46,47,48,49,-1,83,82,81,80,-1,87,86,85,84,-1,52,53,54,55,-1,56,57,58,59,-1})
            .setCoord(new Coordinate().setUSE("WallCoordinates")))))
      .addChild(new Shape("Beam")
        .setAppearance(new Appearance("BeamAppearance")
          .setMaterial(new Material().setAmbientIntensity(0.0).setDiffuseColor(0.0,0.0,0.0).setShininess(0.19)))
        .setGeometry(new IndexedFaceSet().setCoordIndex(new int[] {0,1,2,3,-1,7,6,5,4,-1,4,5,1,0,-1,5,6,2,1,-1,6,7,3,2,-1,0,3,7,4,-1})
          .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-0.1,0.91,0.1,0.1,0.91,0.1,0.1,0.91,-0.1,-0.1,0.91,-0.1,-0.1,-7.21,0.1,0.1,-7.21,0.1,0.1,-7.21,-0.1,-0.1,-7.21,-0.1})))))
      .addChild(new Transform("RightBeam").setRotation(0.0,1.0,0.0,-0.4).setTranslation(2.5,0.0,1.0)
        .addChild(new Shape().setUSE("Beam")))
      .addChild(new Transform("LeftBeam").setRotation(0.0,1.0,0.0,0.4).setTranslation(-2.5,0.0,1.0)
        .addChild(new Shape().setUSE("Beam")))
      .addChild(new Shape()
        .setAppearance(new Appearance().setUSE("BeamAppearance"))
        .setGeometry(new IndexedFaceSet().setCoordIndex(new int[] {0,5,6,1,-1,1,6,7,2,-1,2,7,8,3,-1,3,8,9,4,-1,10,0,1,11,-1,11,1,2,12,-1,12,2,3,13,-1,13,3,4,14,-1,14,19,18,13,-1,13,18,17,12,-1,12,17,16,11,-1,11,16,15,10,-1,9,8,18,19,-1,8,7,17,18,-1,7,6,16,17,-1,6,5,15,16,-1})
          .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-4.5,-2.8,3.0,-2.5,-2.8,1.0,0.0,-2.8,0.0,2.5,-2.8,1.0,4.5,-2.8,3.0,-4.5,-3.0,3.0,-2.5,-3.0,1.0,0.0,-3.0,0.0,2.5,-3.0,1.0,4.5,-3.0,3.0,-4.4,-2.8,2.875,-2.5,-2.8,0.75,0.0,-2.8,-0.25,2.5,-2.8,0.75,4.5,-2.8,2.875,-4.5,-3.0,2.875,-2.5,-3.0,0.75,0.0,-3.0,-0.25,2.5,-3.0,0.75,4.5,-3.0,2.875})))))
      .addChild(new Transform().setTranslation(0.0,-8.5344,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.4,0.2,0.1)))
          .setGeometry(new Box().setSize(40.0,0.1,40.0))))
      .addChild(new Transform().setTranslation(0.0,0.015,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.6,0.545,0.502)))
          .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,13,1,-1,1,13,2,-1,2,13,3,-1,3,13,14,-1,3,14,4,-1,4,14,15,-1,4,15,5,-1,5,15,16,-1,5,16,6,-1,6,16,17,-1,6,17,7,-1,7,17,18,-1,7,18,8,-1,8,18,19,-1,8,19,9,-1,9,19,20,-1,9,20,10,-1,10,20,11,-1,11,20,13,-1,11,13,12,-1,12,13,0,-1})
            .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {0.0,0.915,-0.3,2.5,0.915,0.7,4.5,0.915,2.7,7.625,0.915,2.7,9.95,0.915,0.375,9.95,0.915,-4.375,6.375,0.915,-7.7,-5.5,0.915,-7.7,-10.2,0.915,-2.875,-10.2,0.915,0.25,-7.625,0.915,2.7,-4.5,0.915,2.7,-2.5,0.915,0.7,0.0,1.01,10.0,15.0,1.01,10.0,15.0,1.01,0.0,15.0,1.01,-15.0,0.0,1.01,-15.0,-15.0,1.01,-15.0,-15.0,1.01,0.0,-15.0,1.01,10.0}))))))
      .addChild(new Transform().setTranslation(-5.125,0.5,-6.875)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.5451,0.5333,0.4745).setShininess(0.0)))
          .setGeometry(new Cylinder().setHeight(3.0))))));
    }
	// end of initialize() method

		/** Define subarrays using type int[] */
		private int[] getIndexedFaceSet_5_37_coordIndex_1()
		{
			int[] value = {0,88,114,115,99,-1,88,89,113,114,-1,89,1,90,112,113,-1,90,91,111,112,-1,91,92,104,105,110,111,-1,92,93,103,104,-1,93,2,94,102,103,-1,94,95,101,102,-1,95,3,96,100,101,-1,96,97,107,100,-1,97,98,108,109,106,107,-1,98,99,115,108,-1,106,109,110,105,-1,118,37,117,141,140,-1,117,116,142,141,-1,116,36,127,143,142,-1,127,126,136,143,-1,126,125,135,134,137,136,-1,125,124,128,135,-1,124,39,123,129,128,-1,123,122,130,129,-1,122,38,121,131,130,-1,121,120,132,131,-1,120,119,139,138,133,132,-1,119,118,140,139,-1,133,138,137,134,-1,0,3,39,36,-1,106,105,133,134,-1,105,104,132,133,-1,104,103,131,132,-1,103,102,130,131,-1,102,101,129,130,-1,101,100,128,129,-1,100,107,135,128,-1,107,106,134,135,-1,115,114,142,143,-1,114,113,141,142,-1,113,112,140,141,-1,112,111,139,140,-1,111,110,138,139,-1,110,109,137,138,-1,109,108,136,137,-1,108,115,143,136,-1,1,4,12,13,-1,4,5,7,12,-1,5,2,6,7,-1,1,13,6,2,-1,8,9,10,11,-1,40,37,49,48,-1,37,38,42,49,-1,38,41,43,42,-1,40,48,43,41,-1,47,46,45,44,-1,9,8,44,45,-1,8,7,43,44,-1,7,6,42,43,-1,6,9,45,42,-1,13,12,48,49,-1,12,11,47,48,-1,11,10,46,47,-1,10,13,49,46,-1,4,14,22,23,-1,14,15,17,22,-1,15,5,16,17,-1,4,23,16,5,-1,18,19,20,21,-1,50,40,59,58,-1,40,41,52,59,-1,51,53,52,41,-1,50,58,53,51,-1,54,57,56,55,-1,19,18,54,55,-1,18,17,53,54,-1,17,16,52,53,-1,16,19,55,52,-1,23,22,58,59,-1,22,21,57,58,-1,21,20,56,57,-1,20,23,59,56,-1,14,24,25,15,-1,60,50,51,61,-1,24,26,27,25,-1,62,60,61,63,-1,26,28,29,27,-1,64,62,63,65,-1,28,30,31,29,-1,66,64,65,67,-1,30,32,33,31,-1,68,66,67,69,-1,32,34,35,33,-1,70,68,69,71,-1,35,34,70,71,-1};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getWallCoordinates_6_37_point_1()
		{
			double[] value = {4.5,-8.5344,3.0,7.625,-8.5344,3.0,7.625,0.9144,3.0,4.5,0.9144,3.0,10.25,-8.5344,0.375,10.25,0.9144,0.375,7.9834,-0.1024,2.6421,9.8989,-0.1024,0.7328,9.8989,-3.0484,0.7328,7.9834,-3.0484,2.6421,7.9834,-4.3684,2.6421,9.8989,-4.3684,0.7328,9.8989,-6.7054,0.7328,7.9834,-6.7054,2.6421,10.25,-8.5344,-4.375,10.25,0.9144,-4.375,10.25,0.0,-0.425,10.25,0.0,-3.575,10.25,-2.7432,-3.575,10.25,-2.7432,-0.425,10.25,-4.5752,-0.425,10.25,-4.5752,-3.575,10.25,-7.3152,-3.575,10.25,-7.3152,-0.425,6.375,-8.5344,-8.0,6.375,0.9144,-8.0,-5.5,-8.5344,-8.0,-5.5,0.9144,-8.0,-10.5,-8.5344,-2.875,-10.5,0.9144,-2.875,-10.5,-8.5344,0.25,-10.5,0.9144,0.25,-7.625,-8.5344,3.0,-7.625,0.9144,3.0,-4.5,-8.5344,3.0,-4.5,0.9144,3.0,4.5,-8.5344,2.7,7.625,-8.5344,2.7,7.625,0.9144,2.7,4.5,0.9144,2.7,9.95,-8.5344,0.375,9.95,0.9144,0.375,7.942,-0.1024,2.383,9.633,-0.1024,0.692,9.633,-3.0484,0.692,7.942,-3.0484,2.383,7.942,-4.3684,2.383,9.633,-4.3684,0.692,9.633,-6.7054,0.692,7.942,-6.7054,2.383,9.95,-8.5344,-4.375,9.95,0.9144,-4.375,9.95,0.0,-0.425,9.95,0.0,-3.575,9.95,-2.7432,-3.575,9.95,-2.7432,-0.425,9.95,-4.5752,-0.425,9.95,-4.5752,-3.575,9.95,-7.3152,-3.575,9.95,-7.3152,-0.425,6.375,-8.5344,-7.7,6.375,0.9144,-7.7,-5.5,-8.5344,-7.7,-5.5,0.9144,-7.7,-10.2,-8.5344,-2.875,-10.2,0.9144,-2.875,-10.2,-8.5344,0.25,-10.2,0.9144,0.25,-7.625,-8.5344,2.7,-7.625,0.9144,2.7,-4.5,-8.5344,2.7,-4.5,0.9144,2.7,7.9556,-0.1024,2.4694,9.7194,-0.1024,0.70562,9.7194,-3.0484,0.70562,7.9556,-3.048,2.4694,7.9556,-4.3684,2.4694,9.7194,-4.3684,0.70562,9.7194,-6.7054,0.70562,7.9556,-6.7054,2.4694,10.05,0.0,-0.425,10.05,0.0,-3.575,10.05,-2.7432,-3.575,10.05,-2.7432,-0.425,10.05,-4.5752,-0.425,10.05,-4.5752,-3.575,10.05,-7.3152,-3.575,10.05,-7.3152,-0.425,5.3025,-8.5344,3.0,6.8225,-8.5344,3.0,7.625,-6.5939,3.0,7.625,-5.9639,3.0,7.625,-2.2977,3.0,7.625,-1.6677,3.0,6.8225,0.9144,3.0,5.3025,0.9144,3.0,4.5,-1.6677,3.0,4.5,-2.2977,3.0,4.5,-5.9639,3.0,4.5,-6.5939,3.0};
			return value;
		}
		private double[] getWallCoordinates_6_37_point_2()
		{
			double[] value = {5.3025,-1.6677,3.0,5.7484,-1.2222,3.0,6.378,-1.2222,3.0,6.8225,-1.6677,3.0,6.8225,-2.2977,3.0,6.378,-2.7432,3.0,5.7484,-2.7432,3.0,5.3025,-2.2977,3.0,5.3025,-5.9639,3.0,5.748,-5.5184,3.0,6.378,-5.5184,3.0,6.8225,-5.9639,3.0,6.8225,-6.5939,3.0,6.378,-7.0394,3.0,5.748,-7.0394,3.0,5.3025,-6.5939,3.0,5.3025,-8.5344,2.7,6.8225,-8.5344,2.7,7.625,-6.5939,2.7,7.625,-5.9639,2.7,7.625,-2.2977,2.7,7.625,-1.6677,2.7,6.8225,0.9144,2.7,5.3025,0.9144,2.7,4.5,-1.6677,2.7,4.5,-2.2977,2.7,4.5,-5.9639,2.7,4.5,-6.5939,2.7,5.3025,-1.6677,2.7,5.7484,-1.2222,2.7,6.378,-1.2222,2.7,6.8225,-1.6677,2.7,6.8225,-2.2977,2.7,6.378,-2.7432,2.7,5.7484,-2.7432,2.7,5.3025,-2.2977,2.7,5.3025,-5.9639,2.7,5.748,-5.5184,2.7,6.378,-5.5184,2.7,6.8225,-5.9639,2.7,6.8225,-6.5939,2.7,6.378,-7.0394,2.7,5.748,-7.0394,2.7,5.3025,-6.5939,2.7,5.3025,-1.6677,2.9,5.7484,-1.2222,2.9,6.378,-1.2222,2.9,6.8225,-1.6677,2.9,6.8225,-2.2977,2.9,6.378,-2.7432,2.9,5.7484,-2.7432,2.9,5.3025,-2.2977,2.9,5.3025,-5.9639,2.9,5.748,-5.5184,2.9,6.378,-5.5184,2.9,6.8225,-5.9639,2.9,6.8225,-6.5939,2.9,6.378,-7.0394,2.9,5.748,-7.0394,2.9,5.3025,-6.5939,2.9};
			return value;
		}

		/** Large attribute array: IndexedFaceSet coordIndex field, scene-graph level=5, element #37, 476 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFInt32 getIndexedFaceSet_5_37_coordIndex()
		{
			MFInt32 IndexedFaceSet_5_37_coordIndex = new MFInt32()/*2.finalize*/
				.append(new MFInt32(getIndexedFaceSet_5_37_coordIndex_1()));
			return IndexedFaceSet_5_37_coordIndex;
		}
		/** Large attribute array: Coordinate DEF='WallCoordinates' point field, scene-graph level=6, element #37, 480 total numbers made up of 160 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getWallCoordinates_6_37_point()
		{
			MFVec3f WallCoordinates_6_37_point = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getWallCoordinates_6_37_point_1()))
				.append(new MFVec3f(getWallCoordinates_6_37_point_2()));
			return WallCoordinates_6_37_point;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return KelpTank model
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
        X3D thisExampleX3dModel = new KelpTank().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.KelpTank\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.KelpTank\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
