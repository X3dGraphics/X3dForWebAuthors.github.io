package X3dForWebAuthors.Chapter09EventUtilitiesScripting;

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
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Pump house animation activated by a TimeTrigger node. </p>
 <p> Related links: <a href="../../../Chapter09EventUtilitiesScripting/TimeTriggerPumpHouse.java">TimeTriggerPumpHouse.java</a> source, <a href="../../../Chapter09EventUtilitiesScripting/TimeTriggerPumpHouseIndex.html" target="_top">TimeTriggerPumpHouse catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter09EventUtilitiesScripting/TimeTriggerPumpHouse.x3d">TimeTriggerPumpHouse.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Pump house animation activated by a TimeTrigger node. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Todd Gagnon and Mark A. Boyd </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Xeena VRML importer, X3D-Edit 3.1, <a href="https://www.web3d.org/x3d/content/README.X3D-Edit.html" target="_blank">https://www.web3d.org/x3d/content/README.X3D-Edit.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 8 June 1998 </td>
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
			<td> <a href="../../../Chapter09EventUtilitiesScripting/KelpTank.x3d">KelpTank.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/PumpHouse.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/PumpHouse.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/TimeTriggerPumpHouse.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/TimeTriggerPumpHouse.x3d</a> </td>
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
			<td> <a href="../../../Chapter09EventUtilitiesScripting/../license.html">../license.html</a> </td>
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

	* @author Todd Gagnon and Mark A. Boyd
 */

public class TimeTriggerPumpHouse
{
	/** Default constructor to create this object. */
	public TimeTriggerPumpHouse ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERACTIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("TimeTriggerPumpHouse.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Pump house animation activated by a TimeTrigger node."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Todd Gagnon and Mark A. Boyd"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Xeena VRML importer, X3D-Edit 3.1, https://www.web3d.org/x3d/content/README.X3D-Edit.html"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("8 June 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("20 December 2002"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("KelpTank.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/PumpHouse.x3d"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/TimeTriggerPumpHouse.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setInfo(new String[] {"DTG of last update: 081200Jun98 Added: Updated: cycleInterval to 5.5 Modeled by: Todd Gagnon and Mark A. Boyd"}).setTitle("pumpHouse1.4.wrl"))
    .addChild(new Background().setSkyColor(new MFColor(new double[] {1.0,1.0,1.0})))
    .addChild(new Viewpoint().setDescription("Book View").setOrientation(-0.969,0.239,0.056,0.13).setPosition(1.66,1.34,5.95))
    .addChild(new Group()
      .addChild(new Transform().setScale(0.91,0.6,0.3).setTranslation(0.8,-0.65,0.5)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.749,0.694,0.651)))
          .setGeometry(new Cylinder().setBottom(false).setTop(false))))
      .addChild(new Group()
        .addChild(new Shape()
          .setAppearance(new Appearance("PumpHouseAppearance")
            .setMaterial(new Material().setDiffuseColor(0.82,0.78,0.74)))
          .setGeometry(new IndexedFaceSet().setCoordIndex(new int[] {0,1,5,4,-1,5,1,2,6,-1,6,2,3,7,-1,3,0,4,7,-1,1,12,13,2,-1,2,13,14,-1,12,15,16,13,-1,15,0,3,16,-1,16,3,17,-1,9,5,6,10,-1,8,9,10,11,-1,4,8,11,7,-1,4,5,9,8,-1,11,10,6,7,-1,3,2,14,17,-1,13,16,17,14,-1})
            .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {0.0,0.0,0.0,2.0,0.0,0.0,2.0,1.75,0.0,0.0,1.75,0.0,0.625,0.75,0.0,1.0,0.75,0.0,1.0,1.6,0.0,0.625,1.6,0.0,0.625,0.75,-0.65,1.0,0.75,-0.65,1.0,1.6,-0.65,0.625,1.6,-0.65,2.0,0.0,-2.7,2.0,1.75,-2.7,2.0,2.5,-1.0,0.0,0.0,-2.7,0.0,1.75,-2.7,0.0,2.5,-1.0})))))
        .addChild(new TouchSensor("PumpTouched").setDescription("touch to activate"))))
    .addChild(new Group()
      .addChild(new Transform().setScale(0.5,0.5,0.5).setTranslation(1.0,1.1,-1.5)
        .addChild(new Transform("PistonTransform")
          .addChild(new Transform().setScale(1.8,1.2,0.6).setTranslation(0.0,-0.2,0.0)
            .addChild(new Shape()
              .setAppearance(new Appearance()
                .setMaterial(new Material().setDiffuseColor(0.427,0.427,0.42)))
              .setGeometry(new Cylinder().setHeight(1.0).setRadius(0.98))))
          .addChild(new Transform("CylinderRod").setRotation(0.0,0.0,-1.0,0.523599).setTranslation(-0.25,0.75,0.0)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("PumpHouseAppearance"))
              .setGeometry(new Cylinder().setHeight(1.0).setRadius(0.1))))
          .addChild(new Transform().setRotation(0.0,0.0,1.0,1.047198).setTranslation(1.0,0.6,0.0)
            .addChild(new Transform().setUSE("CylinderRod")))
          .addChild(new Transform().setTranslation(0.0,1.2,0.0)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("PumpHouseAppearance"))
              .setGeometry(new Sphere().setRadius(0.15))))
          .addChild(new Transform("RockerArm1").setCenter(0.0,-0.4,0.0)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("PumpHouseAppearance"))
              .setGeometry(new Cylinder().setHeight(1.8).setRadius(0.1)))
            .addChild(new Transform().setTranslation(0.0,0.95,0.0)
              .addChild(new Shape()
                .setAppearance(new Appearance().setUSE("PumpHouseAppearance"))
                .setGeometry(new Sphere().setRadius(0.15))))
            .addChild(new PositionInterpolator("Rocker1Path").setKey(new double[] {0.0,0.3,0.32,0.5,0.75,1.0}).setKeyValue(new MFVec3f(new double[] {0.0,2.0,-0.25,0.0,1.8,-0.35,0.0,1.8,-0.35,0.0,2.0,-0.25,0.0,2.0,-0.12,0.0,2.0,-0.25})))
            .addChild(new OrientationInterpolator("Rocker1Rotation").setKey(new double[] {0.0,0.3,0.32,0.5,0.75,1.0}).setKeyValue(new MFRotation(new double[] {-1.0,0.0,0.0,0.523599,-1.0,0.0,0.0,1.0471976,-1.0,0.0,0.0,1.0471976,-1.0,0.0,0.0,0.523599,-1.0,0.0,0.0,0.2617994,-1.0,0.0,0.0,0.523599}))))
          .addChild(new Transform("RockerArm2").setCenter(0.0,0.7,0.0)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("PumpHouseAppearance"))
              .setGeometry(new Cylinder().setHeight(1.8).setRadius(0.1)))
            .addChild(new Transform().setTranslation(0.0,-0.95,0.0)
              .addChild(new Shape()
                .setAppearance(new Appearance().setUSE("PumpHouseAppearance"))
                .setGeometry(new Sphere().setRadius(0.15))))
            .addChild(new PositionInterpolator("Rocker2Path").setKey(new double[] {0.0,0.3,0.32,0.5,0.75,1.0}).setKeyValue(new MFVec3f(new double[] {0.0,1.95,-1.0,0.0,1.2,-1.6,0.0,1.2,-1.6,0.0,1.95,-1.0,0.0,2.2,-0.65,0.0,1.95,-1.0})))
            .addChild(new OrientationInterpolator("Rocker2Rotation").setKey(new double[] {0.0,0.3,0.32,0.5,0.75,1.0}).setKeyValue(new MFRotation(new double[] {1.0,0.0,0.0,0.523599,1.0,0.0,0.0,0.4,1.0,0.0,0.0,0.4,1.0,0.0,0.0,0.523599,1.0,0.0,0.0,1.570796,1.0,0.0,0.0,0.523599})))))
        .addChild(new TimeSensor("PistonClock").setCycleInterval(5.5))
        .addChild(new PositionInterpolator("PistonPath").setKey(new double[] {0.0,0.3,0.32,0.5,0.75,1.0}).setKeyValue(new MFVec3f(new double[] {-0.4,-2.3,4.0,-0.4,-1.5,4.0,-0.4,-1.5,4.0,-0.4,-2.3,4.0,-0.4,-3.3,4.0,-0.4,-2.3,4.0})))
        .addChild(new TimeTrigger("Filter"))))
    .addChild(new ROUTE().setFromNode("PumpTouched").setFromField("isActive").setToNode("Filter").setToField("set_boolean"))
    .addChild(new ROUTE().setFromNode("Filter").setFromField("triggerTime").setToNode("PistonClock").setToField("startTime"))
    .addChild(new ROUTE().setFromNode("PistonClock").setFromField("fraction_changed").setToNode("PistonPath").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("PistonPath").setFromField("value_changed").setToNode("PistonTransform").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("PistonClock").setFromField("fraction_changed").setToNode("Rocker1Path").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Rocker1Path").setFromField("value_changed").setToNode("RockerArm1").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("PistonClock").setFromField("fraction_changed").setToNode("Rocker1Rotation").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Rocker1Rotation").setFromField("value_changed").setToNode("RockerArm1").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("PistonClock").setFromField("fraction_changed").setToNode("Rocker2Path").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Rocker2Path").setFromField("value_changed").setToNode("RockerArm2").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("PistonClock").setFromField("fraction_changed").setToNode("Rocker2Rotation").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Rocker2Rotation").setFromField("value_changed").setToNode("RockerArm2").setToField("set_rotation")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return TimeTriggerPumpHouse model
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
        X3D thisExampleX3dModel = new TimeTriggerPumpHouse().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter09EventUtilitiesScripting.TimeTriggerPumpHouse\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter09EventUtilitiesScripting.TimeTriggerPumpHouse\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
