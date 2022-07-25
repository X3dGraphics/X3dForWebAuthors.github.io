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
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Interpolate between Background color arrays to show a gradually changing time-of-day effect. </p>
 <p> Related links: <a href="../../../Chapter11LightingEnvironmentalEffects/BackgroundTimeOfDay.java">BackgroundTimeOfDay.java</a> source, <a href="../../../Chapter11LightingEnvironmentalEffects/BackgroundTimeOfDayIndex.html" target="_top">BackgroundTimeOfDay catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter11LightingEnvironmentalEffects/BackgroundTimeOfDay.x3d">BackgroundTimeOfDay.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Interpolate between Background color arrays to show a gradually changing time-of-day effect. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman and MV4205 class </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 22 April 2009 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironment/BackgroundSelector.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironment/BackgroundSelector.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D Background example </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundTimeOfDay.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundTimeOfDay.x3d</a> </td>
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

	* @author Don Brutzman and MV4205 class
 */

public class BackgroundTimeOfDay
{
	/** Default constructor to create this object. */
	public BackgroundTimeOfDay ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("BackgroundTimeOfDay.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Interpolate between Background color arrays to show a gradually changing time-of-day effect."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman and MV4205 class"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("22 April 2009"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironment/BackgroundSelector.x3d"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D Background example"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundTimeOfDay.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("BackgroundTimeOfDay.x3d"))
    .addChild(new Transform().setTranslation(0.0,3.0,0.0)
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Background Time Of Day"})
          .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
        .setAppearance(new Appearance()
          .setMaterial(new Material()))))
    .addChild(new TimeSensor("TimeOfDayClock").setCycleInterval(6).setLoop(true))
    .addChild(new Script("BackgroundColorInterpolator").setSourceCode("""
ecmascript:

function initialize()
{
    Browser.print ('groundColorSunrise length=' + groundColorSunrise.length + ' '  + groundColorSunrise.toString() + '\n');
    Browser.print ('groundColorNoon    length=' +    groundColorNoon.length +    ' '  + groundColorNoon.toString() + '\n');
    Browser.print ('groundColorSunset  length=' +  groundColorSunset.length +  ' '  + groundColorSunset.toString() + '\n');
    Browser.print ('groundColorNight   length=' +   groundColorNight.length +   ' '  + groundColorNight.toString() + '\n');
    Browser.print ('skyColorSunrise    length=' +    skyColorSunrise.length +    ' '  + skyColorSunrise.toString() + '\n');
    Browser.print ('skyColorNoon       length=' +       skyColorNoon.length +       ' '  + skyColorNoon.toString() + '\n');
    Browser.print ('skyColorSunset     length=' +     skyColorSunset.length +     ' '  + skyColorSunset.toString() + '\n');
    Browser.print ('skyColorNight      length=' +      skyColorNight.length +      ' '  + skyColorNight.toString() + '\n');
}
function set_fraction (fraction) // fraction is input value sent by TimeSensor clock
{
    // Sunrise to Noon, fraction 0.0 to 0.25, interval=0.25
    if      (fraction < 0.25)
    {
        groundColor_changed = interpolate (groundColorSunrise, groundColorNoon, fraction, 0.00, 0.25);
           skyColor_changed = interpolate (   skyColorSunrise,    skyColorNoon, fraction, 0.00, 0.25);
    }
    // Noon to Evening, fraction 0.25 to 0.5, interval=0.25
    else if (fraction < 0.5)
    {
        groundColor_changed = interpolate (groundColorNoon, groundColorSunset, fraction, 0.25, 0.25);
           skyColor_changed = interpolate (   skyColorNoon,    skyColorSunset, fraction, 0.25, 0.25);
    }
    // Evening to Night, fraction 0.5 to 0.6, interval=0.1
    else if (fraction < 0.6)
    {
        groundColor_changed = interpolate (groundColorSunset, groundColorNight, fraction, 0.5, 0.1);
           skyColor_changed = interpolate (   skyColorSunset,    skyColorNight, fraction, 0.5, 0.1);
    }
    // Night (unchanging), fraction 0.6 to 0.95, interval=0.35
    else if (fraction < 0.95)
    {
        groundColor_changed = groundColorNight;
           skyColor_changed = skyColorNight;
    }
    // Night to Sunrise, fraction 0.95 to 1.0, interval=0.05
    else // (fraction < 1.0)
    {
        groundColor_changed = interpolate (groundColorNight, groundColorSunrise, fraction, 0.95, 0.05);
           skyColor_changed = interpolate (   skyColorNight,    skyColorSunrise, fraction, 0.95, 0.05);
    }
//    Browser.print ('groundColor_changed=' + groundColor_changed.toString() + '\n');
//    Browser.print ('   skyColor_changed=' +    skyColor_changed.toString() + '\n');
}
function interpolate (firstColorArray, secondColorArray, fraction, initialFraction, interval)
{
    f = (fraction - initialFraction) / interval; // f should range from 0 to 1
//  Browser.print ('initialFraction=' + initialFraction + ', fraction=' + fraction + ', f=' + f + '\n');

    color0 = firstColorArray[0] + (secondColorArray[0] - firstColorArray[0]) * f;
    color1 = firstColorArray[1] + (secondColorArray[1] - firstColorArray[1]) * f;
    color2 = firstColorArray[2] + (secondColorArray[2] - firstColorArray[2]) * f;
    color3 = firstColorArray[3] + (secondColorArray[3] - firstColorArray[3]) * f;
    color4 = firstColorArray[4] + (secondColorArray[4] - firstColorArray[4]) * f;
    return new MFColor (color0, color1, color2, color3, color4);
}
""")
      .addField(new field().setName("set_fraction").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addField(new field().setName("groundColorSunrise").setType(field.TYPE_MFCOLOR).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(new MFColor(new MFColor(new double[] {0.133,0.419,0.0,0.36,0.1,0.0,1.0,0.74,0.4,1.0,0.74,0.4,0.0,0.2,0.75,0.0,0.1,0.5}))))
      .addField(new field().setName("groundColorNoon").setType(field.TYPE_MFCOLOR).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(new MFColor(new MFColor(new double[] {0.133,0.419,0.0,0.36,0.1,0.0,1.0,0.74,0.4,1.0,0.74,0.4,0.0,0.0,0.5,0.0,0.0,0.2}))))
      .addField(new field().setName("groundColorSunset").setType(field.TYPE_MFCOLOR).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(new MFColor(new MFColor(new double[] {0.133,0.419,0.0,0.36,0.1,0.0,1.0,0.74,0.4,1.0,0.74,0.4,0.0,0.0,0.5,0.0,0.0,0.2}))))
      .addField(new field().setName("groundColorNight").setType(field.TYPE_MFCOLOR).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(new MFColor(new MFColor(new double[] {0.133,0.419,0.0,0.36,0.1,0.0,1.0,0.74,0.4,1.0,0.74,0.4,0.0,0.0,0.5,0.0,0.0,0.2}))))
      .addField(new field().setName("skyColorSunrise").setType(field.TYPE_MFCOLOR).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(new MFColor(new MFColor(new double[] {1.0,1.0,0.2,1.0,1.0,0.0,0.36,0.63,1.0,0.0,0.4,1.0,0.0,0.4,1.0}))))
      .addField(new field().setName("skyColorNoon").setType(field.TYPE_MFCOLOR).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(new MFColor(new MFColor(new double[] {0.0,0.035,0.34,0.0,0.015,0.44,0.0,0.05,0.5,0.0,0.1,0.6,0.44,0.8,1.0,1.0,1.0,0.7}))))
      .addField(new field().setName("skyColorSunset").setType(field.TYPE_MFCOLOR).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(new MFColor(new MFColor(new double[] {0.0,0.0,0.38,0.0,0.0,0.68,0.5,0.2,1.0,0.5,0.2,1.0,1.0,0.3,0.0,1.0,0.2,0.8}))))
      .addField(new field().setName("skyColorNight").setType(field.TYPE_MFCOLOR).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(new MFColor(new MFColor(new double[] {1.0,1.0,1.0,0.8,0.8,0.8,0.1,0.1,0.1,0.0,0.0,0.0,0.0,0.0,0.0}))))
      .addField(new field().setName("groundColor_changed").setType(field.TYPE_MFCOLOR).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
      .addField(new field().setName("skyColor_changed").setType(field.TYPE_MFCOLOR).setAccessType(field.ACCESSTYPE_OUTPUTONLY)))
    .addChild(new ROUTE().setFromNode("TimeOfDayClock").setFromField("fraction_changed").setToNode("BackgroundColorInterpolator").setToField("set_fraction"))
    .addChild(new Background("AnimatedBackground").setGroundAngle(new double[] {0.03,1.26,1.5,1.57}).setGroundColor(new MFColor(new double[] {0.133333,0.419608,0.0,0.36,0.1,0.0,1.0,0.74,0.4,0.0,0.0,0.5,0.0,0.0,0.2})).setSkyAngle(new double[] {0.03,0.05,1.5,1.57}).setSkyColor(new MFColor(new double[] {1.0,1.0,1.0,0.8,0.8,0.8,0.1,0.1,0.1,0.0,0.0,0.0,0.0,0.0,0.0})))
    .addChild(new ROUTE().setFromNode("BackgroundColorInterpolator").setFromField("groundColor_changed").setToNode("AnimatedBackground").setToField("groundColor"))
    .addChild(new ROUTE().setFromNode("BackgroundColorInterpolator").setFromField("skyColor_changed").setToNode("AnimatedBackground").setToField("skyColor")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return BackgroundTimeOfDay model
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
        X3D thisExampleX3dModel = new BackgroundTimeOfDay().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter11LightingEnvironmentalEffects.BackgroundTimeOfDay\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter11LightingEnvironmentalEffects.BackgroundTimeOfDay\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
