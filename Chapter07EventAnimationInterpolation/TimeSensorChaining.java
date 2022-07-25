package X3dForWebAuthors.Chapter07EventAnimationInterpolation;

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
import org.web3d.x3d.jsail.EventUtilities.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Connecting TimeSensor nodes so that the completion of one behavior chain triggers another. </p>
 <p> Related links: <a href="../../../Chapter07EventAnimationInterpolation/TimeSensorChaining.java">TimeSensorChaining.java</a> source, <a href="../../../Chapter07EventAnimationInterpolation/TimeSensorChainingIndex.html" target="_top">TimeSensorChaining catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter07EventAnimationInterpolation/TimeSensorChaining.x3d">TimeSensorChaining.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Connecting TimeSensor nodes so that the completion of one behavior chain triggers another. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman and MV3204 class </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 2 September 2009 </td>
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
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/TimeSensorChaining.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/TimeSensorChaining.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter07EventAnimationInterpolation/../license.html">../license.html</a> </td>
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

public class TimeSensorChaining
{
	/** Default constructor to create this object. */
	public TimeSensorChaining ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("TimeSensorChaining.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Connecting TimeSensor nodes so that the completion of one behavior chain triggers another."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman and MV3204 class"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("2 September 2009"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_WARNING    ).setContent("under development"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/TimeSensorChaining.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("TimeSensorChaining.x3d"))
    .addChild(new Viewpoint().setDescription("TimeSensor chaining example").setPosition(0.0,1.0,6.0))
    .addChild(new Transform("DoorHingeTransform").setCenter(-0.65,0.0,0.0).setTranslation(0.0,1.0,0.0)
      .addChild(new TouchSensor("UserClick").setDescription("click to operate door"))
      .addChild(new Shape()
        .setGeometry(new Box().setSize(1.3,2.5,0.08))
        .setAppearance(new Appearance()
          .setMaterial(new Material("DoorColor").setDiffuseColor(1.0,0.0,0.0)))))
    .addChild(new Transform().setScale(0.6,0.6,0.6).setTranslation(0.0,-1.0,0.0)
      .addChild(new Switch("TextSwitcher").setWhichChoice(0)
        .addChild(new Group()
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"Door is closed"})
              .setFontStyle(new FontStyle("MiddleJustify").setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
            .setAppearance(new Appearance("TextAppearance")
              .setMaterial(new Material()))))
        .addChild(new Group()
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"Door in motion..."})
              .setFontStyle(new FontStyle().setUSE("MiddleJustify")))
            .setAppearance(new Appearance().setUSE("TextAppearance"))))
        .addChild(new Group()
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"Door is open"})
              .setFontStyle(new FontStyle().setUSE("MiddleJustify")))
            .setAppearance(new Appearance().setUSE("TextAppearance"))))))
    .addComments(" ===== open the door ===== ")
    .addChild(new TimeSensor("ClockNumber1").setCycleInterval(2))
    .addChild(new ROUTE().setFromNode("UserClick").setFromField("touchTime").setToNode("ClockNumber1").setToField("startTime"))
    .addChild(new OrientationInterpolator("DoorOpener").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,1.0,0.0,0.0,0.0,1.0,0.0,4.7124,0.0,1.0,0.0,3.0})))
    .addChild(new ROUTE().setFromNode("ClockNumber1").setFromField("fraction_changed").setToNode("DoorOpener").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("DoorOpener").setFromField("value_changed").setToNode("DoorHingeTransform").setToField("rotation"))
    .addChild(new IntegerTrigger("SetTextInMotion").setIntegerKey(1))
    .addChild(new ROUTE().setFromNode("UserClick").setFromField("isActive").setToNode("SetTextInMotion").setToField("set_boolean"))
    .addChild(new ROUTE().setFromNode("SetTextInMotion").setFromField("triggerValue").setToNode("TextSwitcher").setToField("whichChoice"))
    .addComments(" ===== door is now open ===== ")
    .addChild(new BooleanFilter("DoorOpenComplete"))
    .addChild(new ROUTE().setFromNode("ClockNumber1").setFromField("isActive").setToNode("DoorOpenComplete").setToField("set_boolean"))
    .addComments(" disable ClockNumber1 by turning itself off when complete ")
    .addChild(new ROUTE().setFromNode("ClockNumber1").setFromField("isActive").setToNode("ClockNumber1").setToField("enabled"))
    .addChild(new TimeTrigger("TriggerOpeningAnimation"))
    .addChild(new ROUTE().setFromNode("DoorOpenComplete").setFromField("inputFalse").setToNode("TriggerOpeningAnimation").setToField("set_boolean"))
    .addChild(new TimeSensor("ClockNumber2").setCycleInterval(0.5))
    .addChild(new ROUTE().setFromNode("TriggerOpeningAnimation").setFromField("triggerTime").setToNode("ClockNumber2").setToField("startTime"))
    .addChild(new IntegerTrigger("SetTextOpen").setIntegerKey(2))
    .addChild(new ROUTE().setFromNode("DoorOpenComplete").setFromField("inputFalse").setToNode("SetTextOpen").setToField("set_boolean"))
    .addChild(new ROUTE().setFromNode("SetTextOpen").setFromField("triggerValue").setToNode("TextSwitcher").setToField("whichChoice"))
    .addChild(new ColorInterpolator("DoorColorInterpolator").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFColor(new double[] {1.0,0.0,0.0,0.1,0.1,0.1,0.203922,0.701961,0.0})))
    .addChild(new ROUTE().setFromNode("ClockNumber2").setFromField("fraction_changed").setToNode("DoorColorInterpolator").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("DoorColorInterpolator").setFromField("value_changed").setToNode("DoorColor").setToField("diffuseColor"))
    .addComments(" ===== shut the door ===== ")
    .addChild(new TimeSensor("ClockNumber3").setCycleInterval(2).setEnabled(false))
    .addChild(new ROUTE().setFromNode("UserClick").setFromField("touchTime").setToNode("ClockNumber3").setToField("startTime"))
    .addComments(" enable ClockNumber3 once door is fully open ")
    .addChild(new ROUTE().setFromNode("DoorOpenComplete").setFromField("inputFalse").setToNode("ClockNumber3").setToField("enabled"))
    .addComments(" disable ClockNumber3 by turning itself off when complete ")
    .addChild(new ROUTE().setFromNode("ClockNumber3").setFromField("isActive").setToNode("ClockNumber3").setToField("enabled"))
    .addChild(new ScalarInterpolator("ClockReversal").setKey(new double[] {0.0,1.0}).setKeyValue(new double[] {1.0,0.0}))
    .addChild(new ROUTE().setFromNode("ClockNumber3").setFromField("fraction_changed").setToNode("ClockReversal").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("ClockReversal").setFromField("value_changed").setToNode("DoorOpener").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("ClockReversal").setFromField("value_changed").setToNode("DoorColorInterpolator").setToField("set_fraction"))
    .addComments(" enable ClockNumber1 when door is fully shut ")
    .addChild(new BooleanTrigger("Clock3CompleteTrigger"))
    .addChild(new ROUTE().setFromNode("ClockNumber3").setFromField("stopTime").setToNode("Clock3CompleteTrigger").setToField("set_triggerTime"))
    .addChild(new IntegerTrigger("SetTextShut").setIntegerKey(0))
    .addChild(new ROUTE().setFromNode("Clock3CompleteTrigger").setFromField("triggerTrue").setToNode("SetTextShut").setToField("set_boolean"))
    .addChild(new ROUTE().setFromNode("SetTextShut").setFromField("triggerValue").setToNode("TextSwitcher").setToField("whichChoice")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return TimeSensorChaining model
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
        X3D thisExampleX3dModel = new TimeSensorChaining().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter07EventAnimationInterpolation.TimeSensorChaining\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter07EventAnimationInterpolation.TimeSensorChaining\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
