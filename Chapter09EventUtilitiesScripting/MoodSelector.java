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
import org.web3d.x3d.jsail.EventUtilities.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Texturing.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Design pattern demonstrating multiple TouchSensor, IntegerTrigger, Shape and ROUTE combinations for selecting a Switch. </p>
 <p> Related links: <a href="../../../Chapter09EventUtilitiesScripting/MoodSelector.java">MoodSelector.java</a> source, <a href="../../../Chapter09EventUtilitiesScripting/MoodSelectorIndex.html" target="_top">MoodSelector catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter09EventUtilitiesScripting/MoodSelector.x3d">MoodSelector.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Design pattern demonstrating multiple TouchSensor, IntegerTrigger, Shape and ROUTE combinations for selecting a Switch </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Jason Nelson and MV4205 class </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 6 April 2009 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> smiley images are open source </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://openclipart.org/media/tags/smiley" target="_blank">http://openclipart.org/media/tags/smiley</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/MoodSelector.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/MoodSelector.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
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

	* @author Jason Nelson and MV4205 class
 */

public class MoodSelector
{
	/** Default constructor to create this object. */
	public MoodSelector ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("MoodSelector.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Design pattern demonstrating multiple TouchSensor, IntegerTrigger, Shape and ROUTE combinations for selecting a Switch"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Jason Nelson and MV4205 class"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("6 April 2009"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("smiley images are open source"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://openclipart.org/media/tags/smiley"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/MoodSelector.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("MoodSelector.x3d"))
    .addChild(new Viewpoint().setDescription("How do you feel today?").setPosition(0.0,0.0,15.0))
    .addChild(new Transform().setTranslation(0.0,3.0,0.0)
      .addChild(new TouchSensor("howFeelText").setDescription("Touch to select your mood face"))
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"How do you feel today?"})
          .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
        .setAppearance(new Appearance()
          .setMaterial(new Material()))))
    .addChild(new Transform().setTranslation(-5.0,0.0,0.0)
      .addChild(new TouchSensor("happyText").setDescription("I feel happy I feel happy..."))
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Happy"})
          .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.129412,1.0,0.019608))))
      .addChild(new Shape()
        .setGeometry(new Box().setSize(2.5,1.0,0.1))
        .setAppearance(new Appearance("TransparentAppearance")
          .setMaterial(new Material().setTransparency(1)))))
    .addChild(new Transform().setTranslation(-1.3,0.0,0.0)
      .addChild(new TouchSensor("notBadText").setDescription("OK mediocre just plain average no comment"))
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Average"})
          .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(1.0,0.960784,0.019608))))
      .addChild(new Shape()
        .setGeometry(new Box().setSize(3.0,1.0,0.1))
        .setAppearance(new Appearance().setUSE("TransparentAppearance"))))
    .addChild(new Transform().setTranslation(2.2,0.0,0.0)
      .addChild(new TouchSensor("sadText").setDescription("Poor poor pitiful me"))
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Sad"})
          .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.180392,0.705882,1.0))))
      .addChild(new Shape()
        .setGeometry(new Box().setSize(2.0,1.0,0.1))
        .setAppearance(new Appearance().setUSE("TransparentAppearance"))))
    .addChild(new Transform().setTranslation(5.0,0.0,0.0)
      .addChild(new TouchSensor("badText").setDescription("Look out below!"))
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Bad"})
          .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(1.0,0.019608,0.05098))))
      .addChild(new Shape()
        .setGeometry(new Box().setSize(4.5,1.0,0.1))
        .setAppearance(new Appearance().setUSE("TransparentAppearance"))))
    .addChild(new Switch("display").setWhichChoice(-1)
      .addChild(new Transform().setTranslation(-5.0,-3.0,0.0)
        .addChild(new Shape("happyimg")
          .setGeometry(new Box())
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.819608,0.156863))
            .setTexture(new ImageTexture().setUrl(new String[] {"images/nicubunu_Emoticons_Laughing_face.png","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/images/nicubunu_Emoticons_Laughing_face.png"})))))
      .addChild(new Transform().setTranslation(-1.3,-3.0,0.0)
        .addChild(new Shape("nbimg")
          .setGeometry(new Box())
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.066667,0.941176))
            .setTexture(new ImageTexture().setUrl(new String[] {"images/nicubunu_Emoticons_Worried_face.png","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/images/nicubunu_Emoticons_Worried_face.png"})))))
      .addChild(new Transform().setTranslation(2.2,-3.0,0.0)
        .addChild(new Shape("sadimg")
          .setGeometry(new Box())
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.980392,0.968627,0.0))
            .setTexture(new ImageTexture().setUrl(new String[] {"images/nicubunu_Emoticons_Crying_face.png","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/images/nicubunu_Emoticons_Crying_face.png"})))))
      .addChild(new Transform().setTranslation(4.7,-3.0,0.0)
        .addChild(new Shape("bullimg")
          .setGeometry(new Box())
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.101961,0.180392))
            .setTexture(new ImageTexture().setUrl(new String[] {"images/nicubunu_Emoticons_Devil_face.png","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/images/nicubunu_Emoticons_Devil_face.png"}))))))
    .addChild(new IntegerTrigger("nodisplay"))
    .addChild(new IntegerTrigger("happydisplay").setIntegerKey(0))
    .addChild(new IntegerTrigger("nbdisplay").setIntegerKey(1))
    .addChild(new IntegerTrigger("saddisplay").setIntegerKey(2))
    .addChild(new IntegerTrigger("bulldisplay").setIntegerKey(3))
    .addChild(new ROUTE().setFromNode("howFeelText").setFromField("isActive").setToNode("nodisplay").setToField("set_boolean"))
    .addChild(new ROUTE().setFromNode("happyText").setFromField("isActive").setToNode("happydisplay").setToField("set_boolean"))
    .addChild(new ROUTE().setFromNode("notBadText").setFromField("isActive").setToNode("nbdisplay").setToField("set_boolean"))
    .addChild(new ROUTE().setFromNode("sadText").setFromField("isActive").setToNode("saddisplay").setToField("set_boolean"))
    .addChild(new ROUTE().setFromNode("badText").setFromField("isActive").setToNode("bulldisplay").setToField("set_boolean"))
    .addComments(" Note that Switch \"which choice\" has FAN IN ")
    .addChild(new ROUTE().setFromNode("nodisplay").setFromField("triggerValue").setToNode("display").setToField("whichChoice"))
    .addChild(new ROUTE().setFromNode("happydisplay").setFromField("triggerValue").setToNode("display").setToField("whichChoice"))
    .addChild(new ROUTE().setFromNode("nbdisplay").setFromField("triggerValue").setToNode("display").setToField("whichChoice"))
    .addChild(new ROUTE().setFromNode("saddisplay").setFromField("triggerValue").setToNode("display").setToField("whichChoice"))
    .addChild(new ROUTE().setFromNode("bulldisplay").setFromField("triggerValue").setToNode("display").setToField("whichChoice")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return MoodSelector model
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
        X3D thisExampleX3dModel = new MoodSelector().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter09EventUtilitiesScripting.MoodSelector\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter09EventUtilitiesScripting.MoodSelector\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
