package X3dForWebAuthors.Chapter11LightingEnvironmentalEffects;

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
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Cycle through four Background nodes to show a time-of-day effect. </p>
 <p> Related links: <a href="../../../Chapter11LightingEnvironmentalEffects/BackgroundSequencer.java">BackgroundSequencer.java</a> source, <a href="../../../Chapter11LightingEnvironmentalEffects/BackgroundSequencerIndex.html" target="_top">BackgroundSequencer catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter11LightingEnvironmentalEffects/BackgroundSequencer.x3d">BackgroundSequencer.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Cycle through four Background nodes to show a time-of-day effect. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Dale Tourtelotte, Don Brutzman and MV4205 class </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 20 April 2009 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundColorsOnly.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundColorsOnly.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D Background example </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundSequencer.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundSequencer.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter11LightingEnvironmentalEffects/../license.html">../license.html</a> </td>
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

	* @author Dale Tourtelotte, Don Brutzman and MV4205 class
 */

public class BackgroundSequencer
{
	/** Default constructor to create this object. */
	public BackgroundSequencer ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("BackgroundSequencer.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Cycle through four Background nodes to show a time-of-day effect."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Dale Tourtelotte, Don Brutzman and MV4205 class"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("20 April 2009"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundColorsOnly.x3d"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D Background example"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundSequencer.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("BackgroundSequencer.x3d"))
    .addChild(new Transform().setTranslation(0.0,3.0,0.0)
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Background Sequencer"})
          .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
        .setAppearance(new Appearance()
          .setMaterial(new Material()))))
    .addChild(new TimeSensor("TimeOfDayClock").setCycleInterval(12).setLoop(true))
    .addChild(new IntegerSequencer("BackgroundSequencer").setKey(new double[] {0.0,0.25,0.5,0.75,1.0}).setKeyValue(new int[] {0,1,2,3,0}))
    .addChild(new ROUTE().setFromNode("TimeOfDayClock").setFromField("fraction_changed").setToNode("BackgroundSequencer").setToField("set_fraction"))
    .addChild(new Script("SelectorScript").setSourceCode("""
ecmascript:
function whichBackground (inputValue)
{
    if (currentBackground == inputValue)
        return; // avoid rapid Background binding (probably overcautious)
    currentBackground = inputValue; // remember state
    Browser.println ("currentBackground=" + currentBackground);
    if      (inputValue == 0) bind0 = true; // send event
    else if (inputValue == 1) bind1 = true; // send event
    else if (inputValue == 2) bind2 = true; // send event
    else if (inputValue == 3) bind3 = true; // send event
}
""")
      .addField(new field().setName("whichBackground").setType(field.TYPE_SFINT32).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addField(new field().setName("currentBackground").setType(field.TYPE_SFINT32).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(-1))
      .addField(new field().setName("bind0").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
      .addField(new field().setName("bind1").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
      .addField(new field().setName("bind2").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
      .addField(new field().setName("bind3").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_OUTPUTONLY)))
    .addChild(new ROUTE().setFromNode("BackgroundSequencer").setFromField("value_changed").setToNode("SelectorScript").setToField("whichBackground"))
    .addChild(new Background("SunRiseSky").setGroundAngle(new double[] {0.75,1.2,1.25,1.26,1.5,1.57}).setGroundColor(new MFColor(new double[] {0.133333,0.419608,0.0,0.36,0.1,0.0,1.0,0.74,0.4,1.0,0.74,0.4,0.0,0.0,0.5,0.0,0.0,0.2,0.0,0.231373,0.380392})).setSkyAngle(new double[] {0.5,0.7,1.35,1.45,1.57}).setSkyColor(new MFColor(new double[] {0.0,0.035,0.34,0.0,0.015,0.44,0.0,0.05,0.5,0.0,0.1,0.6,0.44,0.8,1.0,1.0,1.0,0.7})))
    .addChild(new Background("HighNoonSky").setGroundAngle(new double[] {0.75,1.2,1.25,1.26,1.57}).setGroundColor(new MFColor(new double[] {0.133333,0.419608,0.0,0.36,0.1,0.0,1.0,0.74,0.4,1.0,0.74,0.4,0.0,0.2,0.75,0.0,0.1,0.5})).setSkyAngle(new double[] {0.05,0.07,1.57}).setSkyColor(new MFColor(new double[] {1.0,1.0,0.2,1.0,1.0,0.0,0.36,0.63,1.0,0.0,0.4,1.0})))
    .addChild(new Background("SunsetSky").setGroundAngle(new double[] {0.75,1.2,1.25,1.26,1.57}).setGroundColor(new MFColor(new double[] {0.133333,0.419608,0.0,0.36,0.1,0.0,1.0,0.74,0.4,1.0,0.74,0.4,0.0,0.0,0.5,0.0,0.0,0.2})).setSkyAngle(new double[] {0.5,0.7,1.2,1.4,1.57}).setSkyColor(new MFColor(new double[] {0.0,0.0,0.38,0.0,0.0,0.68,0.5,0.2,1.0,0.5,0.2,1.0,1.0,0.3,0.0,1.0,0.2,0.8})))
    .addChild(new Background("NightSky").setGroundAngle(new double[] {0.75,1.2,1.25,1.26,1.57}).setGroundColor(new MFColor(new double[] {0.133333,0.419608,0.0,0.36,0.1,0.0,1.0,0.74,0.4,1.0,0.74,0.4,0.0,0.0,0.5,0.0,0.0,0.2})).setSkyAngle(new double[] {0.03,0.05,1.57}).setSkyColor(new MFColor(new double[] {1.0,1.0,1.0,0.8,0.8,0.8,0.1,0.1,0.1,0.0,0.0,0.0})))
    .addChild(new ROUTE().setFromNode("SelectorScript").setFromField("bind0").setToNode("SunRiseSky").setToField("set_bind"))
    .addChild(new ROUTE().setFromNode("SelectorScript").setFromField("bind1").setToNode("HighNoonSky").setToField("set_bind"))
    .addChild(new ROUTE().setFromNode("SelectorScript").setFromField("bind2").setToNode("SunsetSky").setToField("set_bind"))
    .addChild(new ROUTE().setFromNode("SelectorScript").setFromField("bind3").setToNode("NightSky").setToField("set_bind")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return BackgroundSequencer model
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
        X3D thisExampleX3dModel = new BackgroundSequencer().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter11LightingEnvironmentalEffects.BackgroundSequencer\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter11LightingEnvironmentalEffects.BackgroundSequencer\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
