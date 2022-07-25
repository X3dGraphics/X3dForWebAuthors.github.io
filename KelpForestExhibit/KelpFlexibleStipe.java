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
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> An extruded piece of kelp for the Kelp Forest project. Bulb is separate. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/KelpFlexibleStipe.java">KelpFlexibleStipe.java</a> source, <a href="../../../KelpForestExhibit/KelpFlexibleStipeIndex.html" target="_top">KelpFlexibleStipe catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/KelpFlexibleStipe.x3d">KelpFlexibleStipe.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Matthew Braun </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 2 October 2001 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> An extruded piece of kelp for the Kelp Forest project. Bulb is separate. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpFlexibleStipe.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpFlexibleStipe.x3d</a> </td>
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

	* @author Matthew Braun
 */

public class KelpFlexibleStipe
{
	/** Default constructor to create this object. */
	public KelpFlexibleStipe ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("KelpFlexibleStipe.x3d"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Matthew Braun"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("2 October 2001"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("An extruded piece of kelp for the Kelp Forest project. Bulb is separate."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpFlexibleStipe.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("KelpFlexibleStipe.x3d"))
    .addChild(new Viewpoint().setDescription("Kelp stipe and holdfast").setPosition(0.0,5.0,13.0))
    .addComments(" Animation clock ")
    .addChild(new TimeSensor("CLOCK").setCycleInterval(4).setLoop(true))
    .addChild(new CoordinateInterpolator("KELP_BEND").setKey(new double[] {0.0,0.22,0.50,0.72,1.0}).setKeyValue(getKELP_BEND_3_13_keyValue()))
    .addComments(" Geometry ")
    .addChild(new Transform().setScale(0.5,0.5,0.5)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setAmbientIntensity(.25).setDiffuseColor(0.57,0.40,0.10).setShininess(0.92).setTransparency(0.50)))
        .setGeometry(new Extrusion("KELP").setCcw(false).setConvex(false).setCreaseAngle(.78).setCrossSection(new MFVec2f(new double[] {1.00,0.00,0.87,0.50,0.50,0.87,0.00,1.00,-0.50,0.87,-0.87,0.50,-1.00,0.00,-0.87,-0.50,-0.50,-0.87,0.00,-1.00,0.50,-0.87,0.87,-0.50,1.00,0.00})).setEndCap(false).setScale(new MFVec2f(new double[] {0.30,0.30,0.29,0.29,0.28,0.28,0.27,0.27,0.26,0.26,0.25,0.25,0.24,0.24,0.23,0.23,0.22,0.22,0.21,0.21,0.19,0.19,0.16,0.16,0.11,0.11,0.05,0.05,0.00,0.00})).setSpine(new MFVec3f(new double[] {0.00,1.00,0.00,0.00,0.00,0.00,0.00,1.00,0.00,0.00,2.00,0.00,0.00,3.00,0.00,0.00,4.00,0.00,0.00,5.00,0.00,0.00,6.00,0.00,0.00,7.00,0.00,0.00,8.00,0.00,0.00,9.00,0.00,0.13,9.50,0.00,0.50,9.87,0.00,1.00,10.00,0.00,5.00,10.00,0.00})))))
    .addChild(new Transform().setScale(0.5,0.5,0.5)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setAmbientIntensity(.25).setDiffuseColor(0.57,0.30,0.10).setEmissiveColor(0.52,0.30,0.10).setShininess(0.92).setTransparency(0.70)))
        .setGeometry(new Extrusion("INNER_KELP").setCcw(false).setConvex(false).setCreaseAngle(.78).setCrossSection(new MFVec2f(new double[] {0.80,0.00,0.69,0.40,0.40,0.69,0.00,0.80,-0.40,0.69,-0.69,0.40,-0.80,0.00,-0.69,-0.40,-0.40,-0.69,0.00,-0.80,0.40,-0.69,0.69,-0.40,0.80,0.00})).setEndCap(false).setScale(new MFVec2f(new double[] {0.30,0.30,0.29,0.29,0.28,0.28,0.27,0.27,0.26,0.26,0.25,0.25,0.24,0.24,0.23,0.23,0.22,0.22,0.21,0.21,0.19,0.19,0.16,0.16,0.11,0.11,0.00,0.00})).setSpine(new MFVec3f(new double[] {0.00,0.00,0.00,0.00,1.00,0.00,0.00,2.00,0.00,0.00,3.00,0.00,0.00,4.00,0.00,0.00,5.00,0.00,0.00,6.00,0.00,0.00,7.00,0.00,0.00,8.00,0.00,0.00,9.00,0.00,0.13,9.50,0.00,0.50,9.87,0.00,1.00,10.00,0.00,5.00,10.00,0.00})))))
    .addChild(new Transform()
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setAmbientIntensity(.25).setDiffuseColor(0.57,0.30,0.10).setShininess(0.92)))
        .setGeometry(new Cone().setBottomRadius(0.5).setHeight(0.5))))
    .addChild(new ROUTE().setFromNode("CLOCK").setFromField("fraction_changed").setToNode("KELP_BEND").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("KELP_BEND").setFromField("value_changed").setToNode("KELP").setToField("set_spine"))
    .addChild(new ROUTE().setFromNode("KELP_BEND").setFromField("value_changed").setToNode("INNER_KELP").setToField("set_spine")));
    }
	// end of initialize() method

		/** Large attribute array: CoordinateInterpolator DEF='KELP_BEND' keyValue field, scene-graph level=3, element #13, 210 total numbers made up of 70 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getKELP_BEND_3_13_keyValue()
		{
			MFVec3f KELP_BEND_3_13_keyValue = new MFVec3f(new double[] {0.00,0.00,0.00,0.00,2.00,0.00,0.00,4.00,0.00,0.00,6.00,0.00,0.00,8.00,0.00,0.00,10.00,0.00,0.00,12.00,0.00,0.00,14.00,0.00,0.00,16.00,0.00,0.00,18.00,0.00,0.26,19.00,0.00,1.00,19.74,0.00,2.00,20.00,0.00,7.00,20.00,0.00,0.00,0.00,0.00,0.02,2.00,0.00,0.06,4.00,0.00,0.14,6.00,0.00,0.24,8.00,0.00,0.36,10.00,0.00,0.50,12.00,0.00,0.66,14.00,0.00,0.83,16.00,0.00,1.02,18.00,0.00,1.24,19.00,0.00,1.75,19.74,0.00,3.25,20.00,0.00,8.25,20.00,0.00,0.00,0.00,0.00,0.00,2.00,0.00,0.00,4.00,0.00,0.00,6.00,0.00,0.00,8.00,0.00,0.00,10.00,0.00,0.00,12.00,0.00,0.00,14.00,0.00,0.00,16.00,0.00,0.00,18.00,0.00,0.26,19.00,0.00,1.00,19.74,0.00,2.00,20.00,0.00,7.00,20.00,0.00,0.00,0.00,0.00,-0.03,2.00,0.00,-0.12,4.00,0.00,-0.25,6.00,0.00,-0.41,8.00,0.00,-0.59,10.00,0.00,-0.75,12.00,0.00,-0.88,14.00,0.00,-0.97,16.00,0.00,-1.00,18.00,0.00,-0.74,19.00,0.00,0.00,19.74,0.00,1.00,20.00,0.00,6.00,20.00,0.00,0.00,0.00,0.00,0.00,2.00,0.00,0.00,4.00,0.00,0.00,6.00,0.00,0.00,8.00,0.00,0.00,10.00,0.00,0.00,12.00,0.00,0.00,14.00,0.00,0.00,16.00,0.00,0.00,18.00,0.00,0.26,19.00,0.00,1.00,19.74,0.00,2.00,20.00,0.00,7.00,20.00,0.00});
			return KELP_BEND_3_13_keyValue;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return KelpFlexibleStipe model
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
        X3D thisExampleX3dModel = new KelpFlexibleStipe().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.KelpFlexibleStipe\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.KelpFlexibleStipe\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
