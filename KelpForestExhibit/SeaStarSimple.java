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
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Shape.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> A simple sea star constructed out of scaled Sphere primitives. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/SeaStarSimple.java">SeaStarSimple.java</a> source, <a href="../../../KelpForestExhibit/SeaStarSimpleIndex.html" target="_top">SeaStarSimple catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/SeaStarSimple.x3d">SeaStarSimple.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> A simple sea star constructed out of scaled Sphere primitives. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Karl Tenney </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Scott Tufts </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 1 June 1998 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translated </i> </td>
			<td> 13 December 2001 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarSimple.x3d" target="_blank">https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarSimple.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> Cosmo Worlds V2.0 </td>
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

	* @author Karl Tenney
 */

public class SeaStarSimple
{
	/** Default constructor to create this object. */
	public SeaStarSimple ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERCHANGE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("SeaStarSimple.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("A simple sea star constructed out of scaled Sphere primitives."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Karl Tenney"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Scott Tufts"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 June 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("13 December 2001"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarSimple.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Cosmo Worlds V2.0"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("SeaStarSimple.x3d"))
    .addChild(new Group("AuthoringViewpoints")
      .addChild(new Viewpoint().setDescription("SeaStarSimple default"))
      .addChild(new Viewpoint("Main").setDescription("SeaStarSimple main").setPosition(-0.079625,0.149682,2.32008))
      .addChild(new Viewpoint("Above").setDescription("SeaStarSimple from above").setOrientation(-0.999868,0.0140676,0.00816969,1.0524).setPosition(-0.0604298,2.20843,1.12432)))
    .addChild(new Transform()
      .addComments(" original translation 0.46739 0 -1.27889 ")
      .addChild(new Transform().setRotation(0.0160324,0.999622,0.0223337,0.494856).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.359698,0.00994363,1.36377)
        .addChild(new Shape("star_segment")
          .setAppearance(new Appearance()
            .addComments(" Universal Media Materials value used ")
            .setMaterial(new Material("SantaFe27").setAmbientIntensity(0.240502).setDiffuseColor(0.484043,0.338715,0.035729).setShininess(0.085106).setSpecularColor(0.223676,0.109052,0.033373)))
          .setGeometry(new Sphere())))
      .addChild(new Transform().setScale(.0276058,0.0102856,0.0691647).setTranslation(-0.45535,0.0102856,1.22615)
        .addChild(new Shape().setUSE("star_segment")))
      .addChild(new Transform().setRotation(6.36314e-008,1,-7.41821e-009,0.631741).setScale(0.0276058,0.0102856,0.0691647).setTranslation(-0.426702,0.0102856,1.34188)
        .addChild(new Shape().setUSE("star_segment")))
      .addChild(new Transform().setRotation(-2.40082e-007,-1,3.43709e-007,0.712123).setScale(0.0276058,0.0102856,0.0691647).setTranslation(-0.5,0.0102856,1.32509)
        .addChild(new Shape().setUSE("star_segment")))
      .addChild(new Transform().setRotation(1.85515e-008,-1,-1.05709e-007,0.919461).setScale(0.0276058,0.0102856,0.0691647).setTranslation(-0.39858,0.0102856,1.25)
        .addChild(new Shape().setUSE("star_segment")))
      .addChild(new Transform().setRotation(3.53588e-007,1,1.0134e-006,0.84627).setScale(0.0276058,0.0102856,0.0691647).setTranslation(-0.5,0.0102858,1.25)
        .addChild(new Shape().setUSE("star_segment")))
      .addChild(new Transform().setRotation(1.48158e-008,1,-3.7903e-008,1.57079).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.364396,0.00994358,1.19351)
        .addChild(new Shape().setUSE("star_segment")))
      .addChild(new Transform().setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.569653,0.00994355,1.21309)
        .addChild(new Shape().setUSE("star_segment")))
      .addChild(new Transform().setRotation(4.05455e-007,-1,1.915e-007,1.02836).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.464063,0.00994362,1.1596)
        .addChild(new Shape().setUSE("star_segment")))
      .addChild(new Transform().setRotation(-5.59581e-009,-1,-9.59606e-009,0.878147).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.510391,0.00994369,1.40221)
        .addChild(new Shape().setUSE("star_segment")))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return SeaStarSimple model
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
        X3D thisExampleX3dModel = new SeaStarSimple().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.SeaStarSimple\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.SeaStarSimple\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
