package X3dForWebAuthors.Chapter05AppearanceMaterialTextures;

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
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Texturing.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Provide examples of helpful MovieTexture usage. </p>
 <p> Related links: <a href="../../../Chapter05AppearanceMaterialTextures/MovieTextureAuthoringOptions.java">MovieTextureAuthoringOptions.java</a> source, <a href="../../../Chapter05AppearanceMaterialTextures/MovieTextureAuthoringOptionsIndex.html" target="_top">MovieTextureAuthoringOptions catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter05AppearanceMaterialTextures/MovieTextureAuthoringOptions.x3d">MovieTextureAuthoringOptions.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Provide examples of helpful MovieTexture usage </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman and MV3204 class </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 21 August 2008 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 10 June 2021 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> MovieTexture examples </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter05AppearanceMaterialTextures/MovieTextureFigure.png">MovieTextureFigure.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter05AppearanceMaterialTextures/MovieTextureAuthoringOptions.png">MovieTextureAuthoringOptions.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/MovieTextureAuthoringOptions.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/MovieTextureAuthoringOptions.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter05AppearanceMaterialTextures/../license.html">../license.html</a> </td>
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

	* @author Don Brutzman and MV3204 class
 */

public class MovieTextureAuthoringOptions
{
	/** Default constructor to create this object. */
	public MovieTextureAuthoringOptions ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("MovieTextureAuthoringOptions.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Provide examples of helpful MovieTexture usage"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman and MV3204 class"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("21 August 2008"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("10 June 2021"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("MovieTexture examples"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("MovieTextureFigure.png"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("MovieTextureAuthoringOptions.png"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/MovieTextureAuthoringOptions.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("MovieTextureAuthoringOptions.x3d"))
    .addChild(new Viewpoint().setDescription("MovieTexture authoring options").setPosition(0.0,0.0,18.0))
    .addChild(new Group("TopGroupTextures")
      .addComments(" First row: standard definition ")
      .addChild(new Transform().setTranslation(-6.0,3.0,0.0)
        .addComments(" Flat-surface movie, with fixed position and orientation ")
        .addChild(new Viewpoint().setDescription("Movie #1, standard definition").setPosition(0.0,0.0,5.0))
        .addChild(new Shape("MovieShapeStandardDefinition")
          .setGeometry(new IndexedFaceSet("Quadrilateral320x240").setDEF("Quadrilateral320x240").setSolid(false).setCoordIndex(new int[] {0,1,2,3})
            .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-1.6,-1.2,0.0,1.6,-1.2,0.0,1.6,1.2,0.0,-1.6,1.2,0.0})))
            .setTexCoord(new TextureCoordinate("FullImageMapping").setPoint(new MFVec2f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,1.0}))))
          .setAppearance(new Appearance()
            .setTexture(new MovieTexture("X3dQuipMovieStandardDefinition").setDescription("click to start movie, standard definition").setRepeatS(false).setRepeatT(false).setUrl(new String[] {"X3dQuipBrutzmanStandardDefinitionMPEG1.mpg","X3dQuipBrutzmanStandardDefinitionMPEG1.mov","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanStandardDefinitionMPEG1.mpg","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanStandardDefinitionMPEG1.mov"})))))
      .addChild(new Transform().setTranslation(0.0,3.0,0.0)
        .addComments(" movie under a Billboard to always face user ")
        .addChild(new Viewpoint().setDescription("Billboarded movie #2 offset view location, standard definition").setOrientation(0.0,1.0,0.0,0.8).setPosition(4.0,0.0,4.0))
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape().setUSE("MovieShapeStandardDefinition"))))
      .addChild(new TouchSensor("MovieTouchStandardDefinition").setDescription("click to start movie, standard definition"))
      .addChild(new ROUTE().setFromNode("MovieTouchStandardDefinition").setFromField("touchTime").setToNode("X3dQuipMovieStandardDefinition").setToField("startTime")))
    .addChild(new Transform("TopGroupTextureLaunch").setTranslation(6.0,3.0,0.0)
      .addComments(" Launch movie into external browser ")
      .addChild(new Viewpoint().setDescription("Image #3 launches movie externally, standard definition").setPosition(0.0,0.0,5.0))
      .addChild(new Anchor().setDescription("Click to launch in external browser, standard definition").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"X3dQuipBrutzmanStandardDefinitionMPEG1.mpg","X3dQuipBrutzmanStandardDefinitionMPEG1.mov","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanStandardDefinitionMPEG1.mpg","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanStandardDefinitionMPEG1.mov"})
        .addChild(new Shape()
          .setGeometry(new IndexedFaceSet().setUSE("Quadrilateral320x240"))
          .setAppearance(new Appearance()
            .setTexture(new ImageTexture().setRepeatS(false).setRepeatT(false).setUrl(new String[] {"X3dQuipBrutzmanStandardDefinitionInitialFrame.png","X3dQuipBrutzmanStandardDefinitionInitialFrame.gif","X3dQuipBrutzmanStandardDefinitionInitialFrame.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanStandardDefinitionInitialFrame.png","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanStandardDefinitionInitialFrame.gif","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanStandardDefinitionInitialFrame.jpg"}))))))
    .addChild(new Transform("CenterGroupText").setTranslation(0.0,0.25,0.0)
      .addComments(" Text descriptions for user ")
      .addChild(new Transform().setTranslation(-6.0,0.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"Select to run","MovieTexture"})
            .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
          .setAppearance(new Appearance("TextAppearance")
            .setMaterial(new Material().setDiffuseColor(0.0,0.7,0.7)))))
      .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"Billboarded","MovieTexture"})
            .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
          .setAppearance(new Appearance().setUSE("TextAppearance"))))
      .addChild(new Transform().setTranslation(6.0,0.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"Select image","to launch"})
            .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
          .setAppearance(new Appearance().setUSE("TextAppearance")))))
    .addChild(new Group("BottomGroupTextures")
      .addComments(" Third row: high definition ")
      .addChild(new Transform().setTranslation(-6.0,-3.0,0.0)
        .addChild(new Viewpoint().setDescription("Movie #4, high definition").setPosition(0.0,0.0,5.0))
        .addChild(new Shape("MovieShapeHighDefinition")
          .setGeometry(new IndexedFaceSet("Quadrilateral480x270").setDEF("Quadrilateral480x270").setSolid(false).setCoordIndex(new int[] {0,1,2,3})
            .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-2.4,-1.35,0.0,2.4,-1.35,0.0,2.4,1.35,0.0,-2.4,1.35,0.0})))
            .setTexCoord(new TextureCoordinate().setUSE("FullImageMapping")))
          .setAppearance(new Appearance()
            .setTexture(new MovieTexture("X3dQuipMovieHighDefinition").setDescription("click to start movie, high definition").setRepeatS(false).setRepeatT(false).setUrl(new String[] {"X3dQuipBrutzmanH264MPEG1Mash.mpg","X3dQuipBrutzmanH264.mov","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanH264MPEG1Mash.mpg","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanH264.mov"})))))
      .addChild(new Transform().setTranslation(0.0,-3.0,0.0)
        .addComments(" movie under a Billboard to always face user ")
        .addChild(new Viewpoint().setDescription("Billboarded movie #5 offset view location, high definition").setOrientation(0.0,1.0,0.0,0.8).setPosition(4.0,0.0,4.0))
        .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
          .addChild(new Shape().setUSE("MovieShapeHighDefinition"))))
      .addChild(new TouchSensor("MovieTouchHighDefinition").setDescription("click to start movie, high definition"))
      .addChild(new ROUTE().setFromNode("MovieTouchHighDefinition").setFromField("touchTime").setToNode("X3dQuipMovieHighDefinition").setToField("startTime")))
    .addChild(new Transform("BottomGroupTextureLaunch").setTranslation(6.0,-3.0,0.0)
      .addComments(" Launch movie into external browser ")
      .addChild(new Viewpoint().setDescription("Image #6 launches movie externally, high definition").setPosition(0.0,0.0,5.0))
      .addChild(new Anchor().setDescription("Click to launch in external browser, high definition").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"X3dQuipBrutzmanH264MPEG1Mash.mpg","X3dQuipBrutzmanH264.mov","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanH264MPEG1Mash.mpg","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanH264.mov"})
        .addChild(new Shape()
          .setGeometry(new IndexedFaceSet().setUSE("Quadrilateral480x270"))
          .setAppearance(new Appearance()
            .setTexture(new ImageTexture().setRepeatS(false).setRepeatT(false).setUrl(new String[] {"X3dQuipBrutzmanH264InitialFrame.png","X3dQuipBrutzmanH264InitialFrame.gif","X3dQuipBrutzmanH264InitialFrame.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanH264InitialFrame.png","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanH264InitialFrame.gif","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/X3dQuipBrutzmanH264InitialFrame.jpg"}))))))
    .addChild(new Transform("Backdrop").setTranslation(0.0,0.0,-3.0)
      .addChild(new Shape()
        .setGeometry(new Box().setSize(22.0,16.0,0.5))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,0.501961,0.27451))))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return MovieTextureAuthoringOptions model
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
        X3D thisExampleX3dModel = new MovieTextureAuthoringOptions().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter05AppearanceMaterialTextures.MovieTextureAuthoringOptions\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter05AppearanceMaterialTextures.MovieTextureAuthoringOptions\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
