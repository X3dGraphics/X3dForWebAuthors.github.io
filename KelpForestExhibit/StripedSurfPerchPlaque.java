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
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> One fish plaque with lithograph on one side and actual picture on the back. Click on plaque to go to picture or click on buttons to change picture. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/StripedSurfPerchPlaque.java">StripedSurfPerchPlaque.java</a> source, <a href="../../../KelpForestExhibit/StripedSurfPerchPlaqueIndex.html" target="_top">StripedSurfPerchPlaque catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/StripedSurfPerchPlaque.x3d">StripedSurfPerchPlaque.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Michael Collins </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 18 February 2001 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr style="color:burntorange">
			<td style="text-align:right; vertical-align: text-top;"> <i> warning </i> </td>
			<td> under development </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> One fish plaque with lithograph on one side and actual picture on the back. Click on plaque to go to picture or click on buttons to change picture. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/StripedSurfPerchPlaque.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/StripedSurfPerchPlaque.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../KelpForestExhibit/StripedSurfPerchPatch.jpg">StripedSurfPerchPatch.jpg</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../KelpForestExhibit/RainbowSurfPerch002.jpg">RainbowSurfPerch002.jpg</a> </td>
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

	* @author Michael Collins
 */

public class StripedSurfPerchPlaque
{
	/** Default constructor to create this object. */
	public StripedSurfPerchPlaque ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERACTIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("StripedSurfPerchPlaque.x3d"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Michael Collins"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("18 February 2001"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_WARNING    ).setContent("under development"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("One fish plaque with lithograph on one side and actual picture on the back. Click on plaque to go to picture or click on buttons to change picture."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/StripedSurfPerchPlaque.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("StripedSurfPerchPatch.jpg"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("RainbowSurfPerch002.jpg"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("StripedSurfPerchPlaque.x3d"))
    .addChild(new Viewpoint("stripedsurfperch").setDescription("Striped Surf Perch").setPosition(0.0,0.0,4.0))
    .addComments(" Fish Plaques ")
    .addChild(new Group()
      .addChild(new TouchSensor("BlueRockfishTouchSensor").setDescription("touch to rotate"))
      .addChild(new TimeSensor("BLUEROCKFISHCLOCK").setCycleInterval(2))
      .addChild(new OrientationInterpolator("BlueRockfishPathInterpolator").setKey(new double[] {0.0,0.50,1.0}).setKeyValue(new MFRotation(new double[] {0.0,1.0,0.0,0.0,0.0,1.0,0.0,1.57,0.0,1.0,0.0,3.14})))
      .addChild(new Transform("BLUEROCKFISH_TRANSFORM")
        .addChild(new Shape()
          .setGeometry(new Box().setSize(4.0,2.0,.1))
          .setAppearance(new Appearance()
            .setTexture(new ImageTexture().setUrl(new String[] {"StripedSurfPerchPatch.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/StripedSurfPerchPatch.jpg"}))))
        .addChild(new Transform().setTranslation(0.0,0.0,-.1)
          .addChild(new Shape()
            .setGeometry(new Box().setSize(4.0,2.0,.2))
            .setAppearance(new Appearance()
              .setTexture(new ImageTexture().setUrl(new String[] {"RainbowSurfPerch002.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RainbowSurfPerch002.jpg"}))))))
      .addChild(new Group()
        .addChild(new Transform("BUTTON_TRANSFORM").setTranslation(1.0,2.0,0.0)
          .addChild(new Shape()
            .setGeometry(new Sphere().setRadius(.5))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.0,1.0,0.0)))))
        .addChild(new TouchSensor("FrontTouchSensor").setDescription("front TouchSensor"))
        .addChild(new TimeSensor("FRONTTOUCHSENSORCLOCK").setCycleInterval(2))
        .addChild(new OrientationInterpolator("PlaqueToPictureInterpolator").setKey(new double[] {0.0,0.50,1.0}).setKeyValue(new MFRotation(new double[] {0.0,1.0,0.0,3.14,0.0,1.0,0.0,1.57,0.0,1.0,0.0,0.00}))))
      .addChild(new Group()
        .addChild(new Transform("BUTTON_TRANSFORM2").setTranslation(-1.0,2.0,0.0)
          .addChild(new Shape()
            .setGeometry(new Sphere().setRadius(.5))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(1.0,0.0,0.0)))))
        .addChild(new TouchSensor("PictureTouchSensor").setDescription("picture TouchSensor")))
      .addChild(new Group()
        .addChild(new Transform("BASE_TRANSFORM").setTranslation(0.0,0.0,-.3)
          .addChild(new Shape()
            .setGeometry(new Box().setSize(8.0,6.0,.3))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(.3,.3,.6)))))
        .addChild(new TouchSensor("BaseTouchSensor").setDescription("touch to rotate"))
        .addChild(new Group()
          .addChild(new Transform().setTranslation(0.0,-2.6,0.0)
            .addChild(new Shape()
              .setGeometry(new Box().setSize(8.0,1.0,1.0))
              .setAppearance(new Appearance()
                .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.2))))))
        .addChild(new Group()
          .addChild(new Transform().setTranslation(0.0,2.6,0.0)
            .addChild(new Shape()
              .setGeometry(new Box().setSize(8.0,1.0,1.0))
              .setAppearance(new Appearance()
                .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.2))))))
        .addChild(new Group()
          .addChild(new Transform().setRotation(0.0,0.0,1.0,1.58).setTranslation(3.6,0.0,0.0)
            .addChild(new Shape()
              .setGeometry(new Box().setSize(6.2,1.0,1.0))
              .setAppearance(new Appearance()
                .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.2))))))
        .addChild(new Group()
          .addChild(new Transform().setRotation(0.0,0.0,1.0,1.58).setTranslation(-3.6,0.0,0.0)
            .addChild(new Shape()
              .setGeometry(new Box().setSize(6.2,1.0,1.0))
              .setAppearance(new Appearance()
                .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.2))))))))
    .addChild(new ROUTE().setFromNode("BlueRockfishTouchSensor").setFromField("touchTime").setToNode("BLUEROCKFISHCLOCK").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("BLUEROCKFISHCLOCK").setFromField("fraction_changed").setToNode("BlueRockfishPathInterpolator").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("BlueRockfishPathInterpolator").setFromField("value_changed").setToNode("BLUEROCKFISH_TRANSFORM").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("FrontTouchSensor").setFromField("touchTime").setToNode("FRONTTOUCHSENSORCLOCK").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("FRONTTOUCHSENSORCLOCK").setFromField("fraction_changed").setToNode("PlaqueToPictureInterpolator").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("PlaqueToPictureInterpolator").setFromField("value_changed").setToNode("BLUEROCKFISH_TRANSFORM").setToField("set_rotation"))
    .addComments(" Picture touch sensor only has to tie into the BLUEROCKFISHCLOCK so that it will turn picture. ")
    .addChild(new ROUTE().setFromNode("PictureTouchSensor").setFromField("touchTime").setToNode("BLUEROCKFISHCLOCK").setToField("set_startTime")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return StripedSurfPerchPlaque model
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
        X3D thisExampleX3dModel = new StripedSurfPerchPlaque().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.StripedSurfPerchPlaque\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.StripedSurfPerchPlaque\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
