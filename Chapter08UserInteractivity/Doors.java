package X3dForWebAuthors.Chapter08UserInteractivity;

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
import org.web3d.x3d.jsail.EventUtilities.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Two doors activated by different fields from a TouchSensor node. </p>
 <p> Related links: <a href="../../../Chapter08UserInteractivity/Doors.java">Doors.java</a> source, <a href="../../../Chapter08UserInteractivity/DoorsIndex.html" target="_top">Doors catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter08UserInteractivity/Doors.x3d">Doors.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Two doors activated by different fields from a TouchSensor node. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Leonard Daly and Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 6 June 2006 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com" target="_blank">https://X3dGraphics.com</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">https://www.web3d.org/x3d/content/examples/X3dResources.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> rights </i> </td>
			<td> Copyright 2006, Daly Realism and Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D book, X3D graphics, X3D-Edit, <a href="http://www.x3dGraphics.com" target="_blank">http://www.x3dGraphics.com</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/Doors.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/Doors.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter08UserInteractivity/../license.html">../license.html</a> </td>
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

public class Doors
{
	/** Default constructor to create this object. */
	public Doors ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERACTIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Doors.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Two doors activated by different fields from a TouchSensor node."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Leonard Daly and Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("6 June 2006"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_RIGHTS     ).setContent("Copyright 2006, Daly Realism and Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/Doors.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("Doors.x3d"))
    .addChild(new Background().setSkyColor(new MFColor(new double[] {1.0,1.0,1.0})))
    .addChild(new NavigationInfo().setType("\"WALK\" \"ANY\""))
    .addChild(new Viewpoint().setDescription("Initial default").setPosition(0.0,1.4,10.0))
    .addChild(new Viewpoint().setDescription("Book View").setPosition(0.0,1.4,4.5))
    .addChild(new Transform()
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(.6,.2,0.0).setShininess(0))
          .setTexture(new ImageTexture().setUrl(new String[] {"brick_3.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/brick_3.jpg","http://www.dei.isep.ipp.pt/~losa/public/cg/UniversalMedia/textures/urban/brick_3.jpg"})))
        .setGeometry(new IndexedFaceSet("Wall").setDEF("Wall").setCoordIndex(new int[] {0,1,2,3,-1,0,3,8,11,-1,4,5,6,7,-1,8,9,10,11,-1,12,15,14,13,-1,12,23,20,15,-1,16,19,18,17,-1,20,23,22,21,-1,0,1,13,12,-1,2,14,15,3,-1,4,16,17,5,-1,7,6,18,19,-1,8,20,21,9,-1,11,10,22,23,-1,0,11,23,12,-1,1,13,14,2,-1,3,15,16,4,-1,7,19,20,8,-1,5,17,18,6,-1,9,21,22,10,-1})
          .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-2.0,3.0,0.0,-2.0,0.0,0.0,-1.5,0.0,0.0,-1.5,2.25,0.0,-.5,2.25,0.0,-.5,0.0,0.0,.5,0.0,0.0,.5,2.25,0.0,1.5,2.25,0.0,1.5,0.0,0.0,2.0,0.0,0.0,2.0,3.0,0.0,-2.0,3.0,-.1,-2.0,0.0,-.1,-1.5,0.0,-.1,-1.5,2.25,-.1,-.5,2.25,-.1,-.5,0.0,-.1,.5,0.0,-.1,.5,2.25,-.1,1.5,2.25,-.1,1.5,0.0,-.1,2.0,0.0,-.1,2.0,3.0,-.1}))))))
    .addChild(new Transform("DoorLeftTransform").setCenter(-.5,0.0,0.0).setTranslation(-1.0,1.125,-.05)
      .addChild(new Group("Door")
        .addChild(new Shape("DoorShape")
          .setAppearance(new Appearance("DoorApp")
            .setMaterial(new Material("DoorMat").setDiffuseColor(0.0,.7,0.0))
            .setTexture(new ImageTexture("DoorImage").setUrl(new String[] {"door_1.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/door_1.jpg","http://www.dei.isep.ipp.pt/~losa/public/cg/UniversalMedia/textures/urban/door_1.jpg"})))
          .setGeometry(new IndexedFaceSet("DoorGeometry").setDEF("DoorGeometry").setCoordIndex(new int[] {0,1,2,3,-1,4,7,6,5,-1,0,1,5,4,-1,1,5,6,2,-1,2,6,7,3,-1,3,7,6,4,-1})
            .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-.5,-1.125,.05,.5,-1.125,.05,.5,1.125,.05,-.5,1.125,.05,-.5,-1.125,-.05,.5,-1.125,-.05,.5,1.125,-.05,-.5,1.125,-.05})))
            .setTexCoord(new TextureCoordinate().setPoint(new MFVec2f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,1.0,0.0,0.0,1.0,0.0,1.0,1.0,0.0,1.0,1.0,0.0,.95,0.0,1.0,.95,.95,.95,1.0,0.0,.95,0.0,1.0,.95,.95,.95,1.0,0.0,.95,0.0,1.0,.95,.95,.95,1.0,0.0,.95,0.0,1.0,.95,.95,.95}))))))
      .addChild(new OrientationInterpolator("MoverLeft").setKey(new double[] {0.0,1.0}).setKeyValue(new MFRotation(new double[] {0.0,1.0,0.0,0.0,0.0,1.0,0.0,-1.0})))
      .addChild(new TimeSensor("TimerLeft").setCycleInterval(3))
      .addChild(new TimeTrigger("TriggerLeft"))
      .addChild(new BooleanFilter("FilterLeft"))
      .addChild(new TouchSensor("TouchLeft").setDescription("touch to activate"))
      .addChild(new ROUTE().setFromNode("TouchLeft").setFromField("isActive").setToNode("FilterLeft").setToField("set_boolean"))
      .addChild(new ROUTE().setFromNode("FilterLeft").setFromField("inputTrue").setToNode("TriggerLeft").setToField("set_boolean"))
      .addChild(new ROUTE().setFromNode("TriggerLeft").setFromField("triggerTime").setToNode("TimerLeft").setToField("startTime"))
      .addChild(new ROUTE().setFromNode("TimerLeft").setFromField("fraction_changed").setToNode("MoverLeft").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("MoverLeft").setFromField("value_changed").setToNode("DoorLeftTransform").setToField("rotation")))
    .addChild(new Transform("DoorRight").setCenter(-.5,0.0,0.0).setTranslation(1.0,1.125,-.05)
      .addChild(new Group().setUSE("Door"))
      .addChild(new OrientationInterpolator("MoverRight").setKey(new double[] {0.0,1.0}).setKeyValue(new MFRotation(new double[] {0.0,1.0,0.0,0.0,0.0,1.0,0.0,-1.0})))
      .addChild(new TimeSensor("TimerRight").setCycleInterval(3))
      .addChild(new TouchSensor("TouchRight").setDescription("touch to activate"))
      .addChild(new ROUTE().setFromNode("TouchRight").setFromField("touchTime").setToNode("TimerRight").setToField("startTime"))
      .addChild(new ROUTE().setFromNode("TimerRight").setFromField("fraction_changed").setToNode("MoverRight").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("MoverRight").setFromField("value_changed").setToNode("DoorRight").setToField("rotation"))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return Doors model
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
        X3D thisExampleX3dModel = new Doors().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter08UserInteractivity.Doors\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter08UserInteractivity.Doors\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
