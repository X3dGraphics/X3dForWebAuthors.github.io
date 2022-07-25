package X3dForWebAuthors.Chapter11LightingEnvironmentalEffects;

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
import org.web3d.x3d.jsail.Lighting.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Create outline geometry to show SpotLight coverage. Author TODO: use the X3D-Edit SpotLight editor to modify and re-visualize the first SpotLight. </p>
 <p> Related links: <a href="../../../Chapter11LightingEnvironmentalEffects/SpotLightVisualization.java">SpotLightVisualization.java</a> source, <a href="../../../Chapter11LightingEnvironmentalEffects/SpotLightVisualizationIndex.html" target="_top">SpotLightVisualization catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter11LightingEnvironmentalEffects/SpotLightVisualization.x3d">SpotLightVisualization.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Create outline geometry to show SpotLight coverage. Author TODO: use the X3D-Edit SpotLight editor to modify and re-visualize the first SpotLight. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 14 November 2009 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generated </i> </td>
			<td> 14 November 2009 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> SpotLightVisualization.png </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/SpotLightVisualization.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/SpotLightVisualization.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> ../Chapter09EventUtilitiesScripting/CircleLines.java </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter11LightingEnvironmentalEffects/../license.html">../license.html</a> </td>
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

public class SpotLightVisualization
{
	/** Default constructor to create this object. */
	public SpotLightVisualization ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("SpotLightVisualization.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Create outline geometry to show SpotLight coverage. Author TODO: use the X3D-Edit SpotLight editor to modify and re-visualize the first SpotLight."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("14 November 2009"))
    .addMeta(new meta().setName("generated").setContent("14 November 2009"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("SpotLightVisualization.png"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/SpotLightVisualization.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("../Chapter09EventUtilitiesScripting/CircleLines.java"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("SpotLightVisualization.x3d"))
    .addChild(new NavigationInfo().setHeadlight(false))
    .addChild(new Background().setSkyColor(new MFColor(new double[] {0.05,0.1,0.2})))
    .addChild(new Viewpoint().setDescription("Two examples of a single SpotLight").setCenterOfRotation(0.0,0.0,-5.0).setPosition(0.0,0.0,15.0))
    .addChild(new Viewpoint().setDescription("View from above").setCenterOfRotation(0.0,0.0,-5.0).setOrientation(1.0,0.0,0.0,-0.588).setPosition(0.0,10.0,10.0))
    .addChild(new Transform("RightSide").setTranslation(6.0,0.0,0.0)
      .addComments(" Author TODO: use the X3D-Edit SpotLight editor to modify and re-visualize the first SpotLight ")
      .addChild(new SpotLight().setBeamWidth(0.1745).setColor(0.8,0.8,0.2).setCutOffAngle(0.7837).setRadius(10))
      .addChild(new Viewpoint().setDescription("View from behind DirectionalLight").setOrientation(-0.8932,0.4488,0.0279,0.1389).setPosition(0.5,1.0,8.0))
      .addChild(new Inline("CoordinateAxes").setUrl(new String[] {"../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d","../../X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.wrl"}))
      .addChild(new Transform("PolygonalWall").setRotation(1.0,0.0,0.0,1.57079).setTranslation(-5.0,5.0,-5.0)
        .addChild(new Shape()
          .setGeometry(new ElevationGrid().setSolid(false).setXDimension(11).setZDimension(11).setHeight(new double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0}))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,1.0,1.0))))))
    .addChild(new Transform("LeftSide").setTranslation(-6.0,0.0,0.0)
      .addComments(" Watch out for global scope bugs if you copy a light by DEF/USE ")
      .addChild(new SpotLight().setBeamWidth(0.1745).setColor(0.8,0.8,0.2).setCutOffAngle(0.7837).setRadius(10))
      .addChild(new Viewpoint().setDescription("View from behind SpotLight").setOrientation(-0.8932,0.4488,0.0279,0.1389).setPosition(0.5,1.0,8.0))
      .addChild(new Viewpoint().setDescription("Side view of SpotLight outline").setOrientation(0.0,1.0,0.0,1.57079).setPosition(12.0,0.0,-2.5))
      .addChild(new Transform("BeamLines").setScale(1.0,1.0,5.0)
        .addComments(" CircleLines made out of 24 line segments, turned into a cone with 8 side lines ")
        .addChild(new Shape()
          .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,-1,25,0,-1,25,3,-1,25,6,-1,25,9,-1,25,12,-1,25,15,-1,25,18,-1,25,21,-1})
            .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {0.0,1.0,-1.0,0.259,0.966,-1.0,0.5,0.866,-1.0,0.707,0.707,-1.0,0.866,0.5,-1.0,0.966,0.259,-1.0,1.0,0.0,-1.0,0.966,-0.259,-1.0,0.866,-0.5,-1.0,0.707,-0.707,-1.0,0.5,-0.866,-1.0,0.259,-0.966,-1.0,0.0,-1.0,-1.0,-0.259,-0.966,-1.0,-0.5,-0.866,-1.0,-0.707,-0.707,-1.0,-0.866,-0.5,-1.0,-0.966,-0.259,-1.0,-1.0,-0.0,-1.0,-0.966,0.259,-1.0,-0.866,0.5,-1.0,-0.707,0.707,-1.0,-0.5,0.866,-1.0,-0.259,0.966,-1.0,0.0,1.0,-1.0,0.0,0.0,0.0,0.0,0.0,-1.0}))))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setEmissiveColor(0.8,0.8,0.2))))
        .addChild(new Shape()
          .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
            .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {0.0,0.0,0.0,0.0,0.0,-1.0}))))
          .setAppearance(new Appearance()
            .setMaterial(new Material()))))
      .addChild(new Transform("CutOffCone").setScale(5.0,5.0,5.0)
        .addChild(new Transform().setRotation(1.0,0.0,0.0,1.57079).setTranslation(0.0,0.0,-0.5)
          .addChild(new Shape()
            .setGeometry(new Cone().setBottom(false).setHeight(1))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0).setEmissiveColor(0.4,0.4,0.1).setTransparency(0.75))))))
      .addChild(new Inline().setUSE("CoordinateAxes"))
      .addChild(new Transform().setUSE("PolygonalWall"))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return SpotLightVisualization model
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
        X3D thisExampleX3dModel = new SpotLightVisualization().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter11LightingEnvironmentalEffects.SpotLightVisualization\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter11LightingEnvironmentalEffects.SpotLightVisualization\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
