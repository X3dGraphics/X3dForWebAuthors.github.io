package X3dForWebAuthors.Chapter04ViewingNavigation;

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
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Anchor-node examples comparing HTML page launch, shifting Viewpoints, and loading another X3D scene. </p>
 <p> Related links: <a href="../../../Chapter04ViewingNavigation/AnchorComparison.java">AnchorComparison.java</a> source, <a href="../../../Chapter04ViewingNavigation/AnchorComparisonIndex.html" target="_top">AnchorComparison catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter04ViewingNavigation/AnchorComparison.x3d">AnchorComparison.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Anchor-node examples comparing HTML page launch, shifting Viewpoints, and loading another X3D scene. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Leonard Daly and Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 21 April 2011 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter04ViewingNavigation/AnchorComparisonFrontViewpoint.png">AnchorComparisonFrontViewpoint.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter04ViewingNavigation/AnchorComparisonObliqueViewpoint.png">AnchorComparisonObliqueViewpoint.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> Show Anchor link to Monterey Bay Aquarium web site for Kelp Forest exhibit </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.mbayaq.org/efc/kelp.asp" target="_blank">http://www.mbayaq.org/efc/kelp.asp</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">https://www.web3d.org/x3d/content/examples/X3dResources.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> rights </i> </td>
			<td> Copyright (c) 2005, Daly Realism and Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D book, X3D graphics, X3D-Edit, <a href="http://www.x3dGraphics.com" target="_blank">http://www.x3dGraphics.com</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/AnchorComparison.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/AnchorComparison.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter04ViewingNavigation/../license.html">../license.html</a> </td>
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

	* @author Leonard Daly and Don Brutzman
 */

public class AnchorComparison
{
	/** Default constructor to create this object. */
	public AnchorComparison ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("AnchorComparison.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Anchor-node examples comparing HTML page launch, shifting Viewpoints, and loading another X3D scene."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Leonard Daly and Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("21 April 2011"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("AnchorComparisonFrontViewpoint.png"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("AnchorComparisonObliqueViewpoint.png"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("Show Anchor link to Monterey Bay Aquarium web site for Kelp Forest exhibit"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.mbayaq.org/efc/kelp.asp"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_RIGHTS     ).setContent("Copyright (c) 2005, Daly Realism and Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/AnchorComparison.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("AnchorComparison.x3d"))
    .addChild(new Viewpoint("FrontView").setDescription("Front view Anchor text").setPosition(0.0,0.0,8.0))
    .addChild(new Viewpoint("AngledView").setDescription("Side view Anchor text").setOrientation(0.0,1.0,0.0,0.7854).setPosition(6.0,0.0,6.0))
    .addChild(new Transform().setTranslation(0.0,2.0,0.0)
      .addComments(" First Anchor loads a web page ")
      .addChild(new Anchor("AnchorExample").setDescription("Aquarium Exhibit Web Site").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"http://www.montereybayaquarium.org/efc/kelp.asp"})
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"Click orange text to launch","Monterey Bay Aquarium","kelp forest HTML page"})
            .setFontStyle(new FontStyle("LocalFontStyle").setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.6)))
          .setAppearance(new Appearance()
            .setMaterial(new Material("Autumn11").setAmbientIntensity(0.25641).setDiffuseColor(0.795918,0.273554,0.006861).setShininess(1).setSpecularColor(0.48655,0.319155,0.444036)
              .addComments(" Universal Media Library: Autumn 11 "))))
        .addComments(" Add transparent geometry over the text to make clicking (i.e. Anchor selection) easier ")
        .addChild(new Shape("TransparentBoxForEasierUserSelection")
          .setGeometry(new Box().setSize(6.0,2.0,0.02))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setTransparency(1))))))
    .addComments(" Second Anchor brings user to a different viewpoint ")
    .addChild(new Transform().setTranslation(0.0,-0.25,0.0)
      .addChild(new Anchor().setDescription("Move view to diagonal Viewpoint").setUrl(new String[] {"#AngledView"})
        .addChild(new Shape("AnchorMessage2")
          .setGeometry(new Text().setString(new String[] {"Click yellow text to move","to a diagonal Viewpoint"})
            .setFontStyle(new FontStyle().setUSE("LocalFontStyle")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setAmbientIntensity(0.25641).setDiffuseColor(0.222308,0.15428,0.0).setShininess(0.02).setSpecularColor(0.678571,0.661796,0.528818)
              .addComments(" Universal Media Library: Metals 16 "))))
        .addChild(new Shape().setUSE("TransparentBoxForEasierUserSelection"))))
    .addComments(" Third Anchor Launches Kelp Forest scene ")
    .addChild(new Transform().setTranslation(0.0,-2.0,0.0)
      .addChild(new Anchor().setUrl(new String[] {"../Chapter03Grouping/CoordinateAxes.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d","../Chapter03Grouping/CoordinateAxes.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.wrl"})
        .addChild(new Shape("AnchorMessage3")
          .setGeometry(new Text().setString(new String[] {"Click green text to load X3D","CoordinateAxes.x3d scene"})
            .setFontStyle(new FontStyle().setUSE("LocalFontStyle")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setAmbientIntensity(0.25).setDiffuseColor(0.315389,0.544,0.258052).setShininess(0.5).setSpecularColor(0.456,0.456,0.456)
              .addComments(" Universal Media Library: Autumn 28 "))))
        .addChild(new Shape().setUSE("TransparentBoxForEasierUserSelection")))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return AnchorComparison model
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
        X3D thisExampleX3dModel = new AnchorComparison().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter04ViewingNavigation.AnchorComparison\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter04ViewingNavigation.AnchorComparison\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
