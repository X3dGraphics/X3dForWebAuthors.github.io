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
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Moving water surface for KelpTank - initial view is perpendicular, rotate viewpoint up to see motion. Cycle time is 5.5 seconds to match pump, with slight time lag to indicate inertia of quasi-steady-state equilibrium.. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/KelpTankWaterSurface.java">KelpTankWaterSurface.java</a> source, <a href="../../../KelpForestExhibit/KelpTankWaterSurfaceIndex.html" target="_top">KelpTankWaterSurface catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/KelpTankWaterSurface.x3d">KelpTankWaterSurface.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Moving water surface for KelpTank - initial view is perpendicular, rotate viewpoint up to see motion. Cycle time is 5.5 seconds to match pump, with slight time lag to indicate inertia of quasi-steady-state equilibrium.. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Todd Gagnon </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Xeena VRML importer, X3D-Edit 3.1, <a href="https://www.web3d.org/x3d/content/README.X3D-Edit.html" target="_blank">https://www.web3d.org/x3d/content/README.X3D-Edit.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 9 June 1998 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translated </i> </td>
			<td> 20 December 2002 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../KelpForestExhibit/KelpTank.x3d">KelpTank.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTankWaterSurface.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTankWaterSurface.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> Vrml97ToX3dNist, <a href="http://ovrt.nist.gov/v2_x3d.html" target="_blank">http://ovrt.nist.gov/v2_x3d.html</a> </td>
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

	* @author Todd Gagnon
 */

public class KelpTankWaterSurface
{
	/** Default constructor to create this object. */
	public KelpTankWaterSurface ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERCHANGE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("KelpTankWaterSurface.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Moving water surface for KelpTank - initial view is perpendicular, rotate viewpoint up to see motion. Cycle time is 5.5 seconds to match pump, with slight time lag to indicate inertia of quasi-steady-state equilibrium.."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Todd Gagnon"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Xeena VRML importer, X3D-Edit 3.1, https://www.web3d.org/x3d/content/README.X3D-Edit.html"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("9 June 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("20 December 2002"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("KelpTank.x3d"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTankWaterSurface.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setInfo(new String[] {"DTG of last update: 091030Jun98 Added: Updated: comment out PointLight Modeled by: Todd Gagnon"}).setTitle("surface1.4.wrl"))
    .addChild(new Group()
      .addChild(new Transform()
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setAmbientIntensity(1.0).setDiffuseColor(0.03,0.12,0.24).setEmissiveColor(0.0,0.16,0.36).setShininess(0.35).setSpecularColor(0.2,0.5,0.8).setTransparency(0.15)))
          .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,1,6,7,-1,1,2,5,6,-1,2,3,4,5,-1,11,12,9,10,-1,12,13,8,9,-1,13,0,7,8,-1})
            .setCoord(new Coordinate("SURFACE").setPoint(new MFVec3f(new double[] {0.0,0.0,0.0,2.5,0.0,1.0,4.5,0.0,3.0,7.625,0.0,3.0,10.25,0.0,0.375,10.25,0.0,-4.375,6.375,0.0,-8.0,0.0,0.0,-8.0,-5.5,0.0,-8.0,-10.5,0.0,-2.875,-10.5,0.0,0.25,-7.625,0.0,3.0,-4.5,0.0,3.0,-2.5,0.0,1.0})))))))
    .addChild(new TimeSensor("SURFACEClock").setCycleInterval(5.5).setLoop(true))
    .addChild(new CoordinateInterpolator("SURFACEHeight").setKey(new double[] {0.0,0.2,0.45,0.7,0.95}).setKeyValue(getSURFACEHeight_3_23_keyValue()))
    .addChild(new ROUTE().setFromNode("SURFACEClock").setFromField("fraction_changed").setToNode("SURFACEHeight").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("SURFACEHeight").setFromField("value_changed").setToNode("SURFACE").setToField("set_point")));
    }
	// end of initialize() method

		/** Large attribute array: CoordinateInterpolator DEF='SURFACEHeight' keyValue field, scene-graph level=3, element #23, 210 total numbers made up of 70 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getSURFACEHeight_3_23_keyValue()
		{
			MFVec3f SURFACEHeight_3_23_keyValue = new MFVec3f(new double[] {0.0,0.0,0.0,2.5,0.05,1.0,4.5,0.1,3.0,7.625,0.15,3.0,10.25,0.15,0.375,10.25,0.15,-4.375,6.375,0.1,-8.0,0.0,0.0,-8.0,-5.5,-0.1,-8.0,-10.5,-0.15,-2.875,-10.5,-0.15,0.25,-7.625,-0.15,3.0,-4.5,-0.1,3.0,-2.5,-0.05,1.0,0.0,0.0,0.0,2.5,0.0,1.0,4.5,0.0,3.0,7.625,0.0,3.0,10.25,0.0,0.375,10.25,0.0,-4.375,6.375,0.0,-8.0,0.0,0.0,-8.0,-5.5,0.0,-8.0,-10.5,0.0,-2.875,-10.5,0.0,0.25,-7.625,0.0,3.0,-4.5,0.0,3.0,-2.5,0.0,1.0,0.0,-0.0,0.0,2.5,-0.05,1.0,4.5,-0.1,3.0,7.625,-0.15,3.0,10.25,-0.15,0.375,10.25,-0.15,-4.375,6.375,-0.1,-8.0,0.0,-0.0,-8.0,-5.5,0.1,-8.0,-10.5,0.15,-2.875,-10.5,0.15,0.25,-7.625,0.15,3.0,-4.5,0.1,3.0,-2.5,0.05,1.0,0.0,0.0,0.0,2.5,0.0,1.0,4.5,0.0,3.0,7.625,0.0,3.0,10.25,0.0,0.375,10.25,0.0,-4.375,6.375,0.0,-8.0,0.0,0.0,-8.0,-5.5,0.0,-8.0,-10.5,0.0,-2.875,-10.5,0.0,0.25,-7.625,0.0,3.0,-4.5,0.0,3.0,-2.5,0.0,1.0,0.0,0.0,0.0,2.5,0.05,1.0,4.5,0.1,3.0,7.625,0.15,3.0,10.25,0.15,0.375,10.25,0.15,-4.375,6.375,0.1,-8.0,0.0,0.0,-8.0,-5.5,-0.1,-8.0,-10.5,-0.15,-2.875,-10.5,-0.15,0.25,-7.625,-0.15,3.0,-4.5,-0.1,3.0,-2.5,-0.05,1.0});
			return SURFACEHeight_3_23_keyValue;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return KelpTankWaterSurface model
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
        X3D thisExampleX3dModel = new KelpTankWaterSurface().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.KelpTankWaterSurface\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.KelpTankWaterSurface\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
