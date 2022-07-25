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
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.KeyDeviceSensor.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Texturing.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> A collection of all of the user interactivity sensor nodes: TouchSensor, PlaceSensor, CylinderSensor, SphereSensor, KeySensor, and StringSensor. </p>
 <p> Related links: <a href="../../../Chapter08UserInteractivity/UserInteractivitySensorNodes.java">UserInteractivitySensorNodes.java</a> source, <a href="../../../Chapter08UserInteractivity/UserInteractivitySensorNodesIndex.html" target="_top">UserInteractivitySensorNodes catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter08UserInteractivity/UserInteractivitySensorNodes.x3d">UserInteractivitySensorNodes.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> A collection of all of the user interactivity sensor nodes: TouchSensor, PlaceSensor, CylinderSensor, SphereSensor, KeySensor, and StringSensor. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 30 April 2005 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> rights </i> </td>
			<td> Copyright 2006, Daly Realism and Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter08UserInteractivity/UserInteractivitySensorNodes.png">UserInteractivitySensorNodes.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter08UserInteractivity/UserInteractivitySensorNodesModified.png">UserInteractivitySensorNodesModified.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/UserInteractivitySensorNodes.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/UserInteractivitySensorNodes.x3d</a> </td>
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

	* @author Don Brutzman
 */

public class UserInteractivitySensorNodes
{
	/** Default constructor to create this object. */
	public UserInteractivitySensorNodes ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("UserInteractivitySensorNodes.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("A collection of all of the user interactivity sensor nodes: TouchSensor, PlaceSensor, CylinderSensor, SphereSensor, KeySensor, and StringSensor."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("30 April 2005"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_RIGHTS     ).setContent("Copyright 2006, Daly Realism and Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("UserInteractivitySensorNodes.png"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("UserInteractivitySensorNodesModified.png"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter08UserInteractivity/UserInteractivitySensorNodes.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("UserInteractivitySensorNodes.x3d"))
    .addChild(new Viewpoint().setDescription("User interactivity sensor nodes").setPosition(0.0,0.0,12.0))
    .addChild(new Background("BackgroundDefault").setGroundColor(new MFColor(new double[] {0.2,0.4,0.6})).setSkyColor(new MFColor(new double[] {0.2,0.4,0.6})))
    .addChild(new Background("BackgroundTouchCone").setSkyColor(new MFColor(new double[] {0.5,0.7,0.9})))
    .addChild(new Transform().setTranslation(0.0,4.0,0.0)
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Sensor node examples"})
          .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(1.5)))
        .setAppearance(new Appearance()
          .setMaterial(new Material("DefaultMaterial").setDiffuseColor(0.8,0.6,0.4)))))
    .addChild(new Transform().setTranslation(0.0,1.0,0.0)
      .addChild(new Transform().setTranslation(-6.0,0.0,0.0)
        .addChild(new TouchSensor("DefaultTouchSensor").setDescription("click to activate TouchSensor bind alternate Background"))
        .addChild(new Shape()
          .setGeometry(new Cone())
          .setAppearance(new Appearance("RedAppearance")
            .setMaterial(new Material().setDiffuseColor(1.0,0.2,0.2))))
        .addChild(new Transform().setTranslation(0.0,-2.0,0.0)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"Touch","Sensor"})
              .setFontStyle(new FontStyle("JustifyMiddle").setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
            .setAppearance(new Appearance().setUSE("RedAppearance"))))
        .addChild(new ROUTE().setFromNode("DefaultTouchSensor").setFromField("isActive").setToNode("BackgroundTouchCone").setToField("set_bind")))
      .addChild(new Transform("TransformBox").setTranslation(-2.0,0.0,0.0)
        .addChild(new PlaneSensor("DefaultPlaneSensor").setDescription("drag Box to activate PlaneSensor"))
        .addChild(new Shape()
          .setGeometry(new Box())
          .setAppearance(new Appearance("GreenAppearance")
            .setMaterial(new Material().setDiffuseColor(0.2,1.0,0.2))))
        .addChild(new Transform().setTranslation(0.0,-2.0,0.0)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"Plane","Sensor"})
              .setFontStyle(new FontStyle().setUSE("JustifyMiddle")))
            .setAppearance(new Appearance().setUSE("GreenAppearance"))))
        .addChild(new ROUTE().setFromNode("DefaultPlaneSensor").setFromField("offset").setToNode("TransformBox").setToField("set_translation")))
      .addChild(new Transform("TransformCylinder").setTranslation(2.0,0.0,0.0)
        .addChild(new CylinderSensor("DefaultCylinderSensor").setDescription("drag to activate CylinderSensor"))
        .addChild(new Shape()
          .setGeometry(new Cylinder())
          .setAppearance(new Appearance()
            .setTexture(new ImageTexture("ReferenceTexture").setUrl(new String[] {"../Chapter05AppearanceMaterialTextures/ImageTextureFigure18.1X3dSpecification.png","../Chapter05AppearanceMaterialTextures/ImageTextureFigure18.1X3dSpecification.gif","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/ImageTextureFigure18.1X3dSpecification.png","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/ImageTextureFigure18.1X3dSpecification.gif"}))
            .setMaterial(new Material("DarkBlue").setDiffuseColor(0.0,0.0,0.9))))
        .addChild(new Transform().setTranslation(0.0,-2.0,0.0)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"Cylinder","Sensor"})
              .setFontStyle(new FontStyle().setUSE("JustifyMiddle")))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setUSE("DarkBlue")))))
        .addChild(new ROUTE().setFromNode("DefaultCylinderSensor").setFromField("rotation_changed").setToNode("TransformCylinder").setToField("set_rotation")))
      .addChild(new Transform("TransformSphere").setTranslation(6.0,0.0,0.0)
        .addChild(new SphereSensor("DefaultSphereSensor").setDescription("click to activate SphereSensor"))
        .addChild(new Shape()
          .setGeometry(new Sphere())
          .setAppearance(new Appearance()
            .setTexture(new ImageTexture().setUSE("ReferenceTexture"))))
        .addChild(new Transform("SphereSensorText").setTranslation(0.0,-2.0,0.0)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"Sphere","Sensor"})
              .setFontStyle(new FontStyle().setUSE("JustifyMiddle")))
            .setAppearance(new Appearance()
              .setMaterial(new Material("GreyMaterial")))))
        .addChild(new ROUTE().setFromNode("DefaultSphereSensor").setFromField("rotation_changed").setToNode("TransformSphere").setToField("set_rotation"))))
    .addChild(new Group()
      .addChild(new Transform().setTranslation(-4.0,-3.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text("KeyText").setString(new String[] {"?"})
            .setFontStyle(new FontStyle().setUSE("JustifyMiddle")))
          .setAppearance(new Appearance("LightBrownAppearance")
            .setMaterial(new Material().setDiffuseColor(1.0,0.862745,0.141176)))))
      .addChild(new Transform().setTranslation(-2.0,-3.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text("StringText").setString(new String[] {"Press keys then <Enter>"})
            .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_BEGIN_MIDDLE)))
          .setAppearance(new Appearance().setUSE("LightBrownAppearance"))))
      .addChild(new KeySensor("DefaultKeySensor"))
      .addChild(new StringSensor("DefaultStringSensor"))
      .addChild(new Script("KeyboardProcessor").setSourceCode("""
ecmascript:

function keyInput (inputValue)
{
//  Browser.print ('keyInput=' + inputValue + '\n'); // console output
    keyOutput = new MFString (inputValue); // type conversion
}
function finalTextInput (inputValue)
{
//  Browser.print ('finalText=' + inputValue + '\n'); // console output
    stringOutput = new MFString (inputValue); // type conversion
}
function enteredTextInput (inputValue)
{
    Browser.print ('enteredText=' + inputValue + '\n'); // console output
}
""")
        .addField(new field().setName("keyInput").setType(field.TYPE_SFSTRING).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("finalTextInput").setType(field.TYPE_SFSTRING).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("enteredTextInput").setType(field.TYPE_SFSTRING).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("keyOutput").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
        .addField(new field().setName("stringOutput").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_OUTPUTONLY)))
      .addChild(new ROUTE().setFromNode("DefaultKeySensor").setFromField("keyPress").setToNode("KeyboardProcessor").setToField("keyInput"))
      .addChild(new ROUTE().setFromNode("DefaultStringSensor").setFromField("finalText").setToNode("KeyboardProcessor").setToField("finalTextInput"))
      .addChild(new ROUTE().setFromNode("DefaultStringSensor").setFromField("enteredText").setToNode("KeyboardProcessor").setToField("enteredTextInput"))
      .addChild(new ROUTE().setFromNode("KeyboardProcessor").setFromField("keyOutput").setToNode("KeyText").setToField("string"))
      .addChild(new ROUTE().setFromNode("KeyboardProcessor").setFromField("stringOutput").setToNode("StringText").setToField("string"))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return UserInteractivitySensorNodes model
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
        X3D thisExampleX3dModel = new UserInteractivitySensorNodes().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter08UserInteractivity.UserInteractivitySensorNodes\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter08UserInteractivity.UserInteractivitySensorNodes\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
