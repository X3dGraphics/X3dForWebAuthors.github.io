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
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Lefty Shark with animation to traverse the tank. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/SharkLeftyLocale.java">SharkLeftyLocale.java</a> source, <a href="../../../KelpForestExhibit/SharkLeftyLocaleIndex.html" target="_top">SharkLeftyLocale catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/SharkLeftyLocale.x3d">SharkLeftyLocale.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Lefty Shark with animation to traverse the tank </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Tim McLean </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 1 June 1998 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://faculty.nps.edu/brutzman/kelp" target="_blank">http://faculty.nps.edu/brutzman/kelp</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLeftyLocale.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLeftyLocale.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
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

	* @author Tim McLean
 */

public class SharkLeftyLocale
{
	/** Default constructor to create this object. */
	public SharkLeftyLocale ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("SharkLeftyLocale.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Lefty Shark with animation to traverse the tank"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Tim McLean"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 June 1998"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://faculty.nps.edu/brutzman/kelp"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLeftyLocale.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("SharkLeftyLocale.x3d"))
    .addChild(new Transform("_0").setTranslation(0.0,-5.5,-1.0)
      .addChild(new Inline().setUrl(new String[] {"SharkLefty.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLefty.x3d","SharkLefty.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLefty.wrl"}))
      .addChild(new Group()
        .addChild(new TimeSensor("SHARK2_CLOCK").setCycleInterval(110.0).setLoop(true))
        .addChild(new PositionInterpolator("SHARK2_POSITION").setKey(new double[] {0.0,0.152,0.194,0.224,0.288,0.35,0.427,0.549,0.632,0.7,0.813,1.0}).setKeyValue(new MFVec3f(new double[] {0.0,-4.25,-1.0,3.75,-4.5,-0.75,4.75,-4.5,-1.0,4.75,-4.5,-2.0,3.25,-4.0,-2.5,1.75,-4.0,-2.75,0.0,-4.0,-3.25,-3.0,-3.5,-4.0,-5.0,-4.0,-2.5,-5.75,-4.5,0.0,-4.5,-4.5,0.25,0.0,-4.25,-1.0})))
        .addChild(new OrientationInterpolator("SHARK2_ORIENTATION").setKey(new double[] {0.0,0.152,0.194,0.224,0.288,0.35,0.427,0.549,0.632,0.7,0.813,1.0}).setKeyValue(new MFRotation(new double[] {0.0,1.0,0.0,6.2134,0.0,1.0,0.0,0.244,0.0,1.0,0.0,1.57,0.1564,0.9974,-0.0262,2.8141,0.0,1.0,0.0,2.967,0.0,1.0,0.0,2.7227,0.0872,0.9961,-0.0107,2.8982,-0.1218,0.9917,-0.0407,3.7824,-0.1469,0.9832,-0.1087,4.3995,0.0,1.0,0.0,6.0912,0.0,1.0,0.0,0.2618,0.0,1.0,0.0,6.2134})))))
    .addChild(new TimeSensor("_4").setLoop(true))
    .addChild(new Script("sharkSwimmingInTankTrigger_5").setSourceCode("""
ecmascript:

function triggerIn (value, time) 
{
	startTime = value;
	firstTime = false;
}
""")
      .addField(new field().setName("triggerIn").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addField(new field().setName("startTime").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
      .addField(new field().setName("firstTime").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_OUTPUTONLY)))
    .addChild(new ROUTE().setFromNode("sharkSwimmingInTankTrigger_5").setFromField("startTime").setToNode("SHARK2_CLOCK").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("SHARK2_CLOCK").setFromField("fraction_changed").setToNode("SHARK2_POSITION").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("SHARK2_CLOCK").setFromField("fraction_changed").setToNode("SHARK2_ORIENTATION").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("SHARK2_POSITION").setFromField("value_changed").setToNode("_0").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("SHARK2_ORIENTATION").setFromField("value_changed").setToNode("_0").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("sharkSwimmingInTankTrigger_5").setFromField("firstTime").setToNode("_4").setToField("set_enabled"))
    .addChild(new ROUTE().setFromNode("_4").setFromField("time").setToNode("sharkSwimmingInTankTrigger_5").setToField("triggerIn")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return SharkLeftyLocale model
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
        X3D thisExampleX3dModel = new SharkLeftyLocale().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.SharkLeftyLocale\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.SharkLeftyLocale\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
