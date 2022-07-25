package X3dForWebAuthors.Chapter14Prototypes;

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
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Mimic a Material node and modulate the diffuseColor field as an animation effect, provided as a prototype for reusability. </p>
 <p> Related links: <a href="../../../Chapter14Prototypes/MaterialModulator.java">MaterialModulator.java</a> source, <a href="../../../Chapter14Prototypes/MaterialModulatorIndex.html" target="_top">MaterialModulator catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter14Prototypes/MaterialModulator.x3d">MaterialModulator.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Mimic a Material node and modulate the diffuseColor field as an animation effect, provided as a prototype for reusability. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> hint </i> </td>
			<td> Learning suggestion for authors: try changing the modulation script so that it goes from [0 ... 1] and then [1 ... 0] alternating, rather than abruptly shifting from 1 immediately back to 0. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 10 March 2008 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D prototype requiring Script inputOutput fields </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter14Prototypes/MaterialModulator.png">MaterialModulator.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulator.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulator.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter14Prototypes/../license.html">../license.html</a> </td>
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

public class MaterialModulator
{
	/** Default constructor to create this object. */
	public MaterialModulator ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("MaterialModulator.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Mimic a Material node and modulate the diffuseColor field as an animation effect, provided as a prototype for reusability."))
    .addMeta(new meta().setName(meta.NAME_HINT       ).setContent("Learning suggestion for authors: try changing the modulation script so that it goes from [0 ... 1] and then [1 ... 0] alternating, rather than abruptly shifting from 1 immediately back to 0."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("10 March 2008"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D prototype requiring Script inputOutput fields"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("MaterialModulator.png"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulator.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("MaterialModulator.x3d"))
    .addChild(new ProtoDeclare("MaterialModulator").setName("MaterialModulator").setAppinfo("mimic a Material node and modulate the diffuseColor field as an animation effect").setDocumentation("https://x3dgraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulatorIndex.html")
      .setProtoInterface(new ProtoInterface()
        .addField(new field().setName("enabled").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(true).setAppinfo("default value true"))
        .addField(new field().setName("diffuseColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFColor(0.8,0.8,0.8)).setAppinfo("default value 0.8 0.8 0.8"))
        .addField(new field().setName("emissiveColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFColor(0.0,0.0,0.0)).setAppinfo("default value 0 0 0"))
        .addField(new field().setName("specularColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFColor(0.0,0.0,0.0)).setAppinfo("default value 0 0 0"))
        .addField(new field().setName("transparency").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(0.0).setAppinfo("default value 0.0"))
        .addField(new field().setName("shininess").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(0.2).setAppinfo("default value 0.2"))
        .addField(new field().setName("ambientIntensity").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(0.2).setAppinfo("default value 0.2")))
      .setProtoBody(new ProtoBody()
        .addChild(new Material("MaterialNode")
          .setIS(new IS()
            .addConnect(new connect().setNodeField("diffuseColor").setProtoField("diffuseColor"))
            .addConnect(new connect().setNodeField("emissiveColor").setProtoField("emissiveColor"))
            .addConnect(new connect().setNodeField("specularColor").setProtoField("specularColor"))
            .addConnect(new connect().setNodeField("transparency").setProtoField("transparency"))
            .addConnect(new connect().setNodeField("shininess").setProtoField("shininess"))
            .addConnect(new connect().setNodeField("ambientIntensity").setProtoField("ambientIntensity"))))
        .addComments(" Only first node (the node type) is renderable, others are along for the ride ")
        .addChild(new Script("MaterialModulatorScript").setSourceCode("""
ecmascript:
function initialize ()
{
    newColor = diffuseColor; // start with original color
}
function clockTrigger (timeValue)
{
    if (!enabled) return;
    red   = newColor.r;
    green = newColor.g;
    blue  = newColor.b;
    
    // note different modulation rates for each color component, % is modulus operator
    newColor = new SFColor ((red + 0.02) % 1, (green + 0.03) % 1, (blue + 0.04) % 1);
	if (enabled)
	{
		Browser.print ('diffuseColor=(' + red +',' + green + ',' + blue + ') newColor=' + newColor.toString() + '\n');
	}
}
function set_enabled (newValue)
{
	enabled = newValue;
}
""")
          .addField(new field().setName("enabled").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
          .addField(new field().setName("diffuseColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
          .addField(new field().setName("newColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
          .addField(new field().setName("clockTrigger").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INPUTONLY))
          .setIS(new IS()
            .addConnect(new connect().setNodeField("enabled").setProtoField("enabled"))
            .addConnect(new connect().setNodeField("diffuseColor").setProtoField("diffuseColor"))))
        .addComments(" Clock tickles Script to wake up and compute a new value ")
        .addChild(new ROUTE().setFromNode("MaterialModulatorScript").setFromField("newColor").setToNode("MaterialNode").setToField("diffuseColor"))
        .addChild(new TimeSensor("ModulationClock").setCycleInterval(0.1).setLoop(true)
          .setIS(new IS()
            .addConnect(new connect().setNodeField("enabled").setProtoField("enabled"))))
        .addChild(new ROUTE().setFromNode("ModulationClock").setFromField("cycleTime").setToNode("MaterialModulatorScript").setToField("clockTrigger"))))
    .addComments(" Rendered geometry for the ProtoInstance now follows prototype declaration ")
    .addChild(new Transform().setTranslation(0.0,1.0,0.0)
      .addChild(new Shape()
        .setGeometry(new Sphere())
        .setAppearance(new Appearance()
          .setMaterial(new ProtoInstance("MaterialModulator", "MaterialModulatorInstance").setContainerField("material")
            .addFieldValue(new fieldValue().setName("enabled").setValue(true))
            .addFieldValue(new fieldValue().setName("diffuseColor").setValue(new SFColor(0.5,0.1,0.1)))
            .addComments(" fieldValue declarations for other Material attributes can appear here ")))))
    .addComments(" Selectable Text design pattern has transparent Box and TouchSensor description as a tooltip ")
    .addChild(new Transform().setTranslation(0.0,-2.0,0.0)
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"enable/disable","MaterialModulator"})
          .setFontStyle(new FontStyle().setFamily(new String[] {"SANS"}).setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setCssStyle("BOLD")))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.9,0.9,0.9))))
      .addChild(new Shape()
        .setGeometry(new Box().setSize(8.0,2.0,.001))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setTransparency(1))))
      .addComments(" Toggle text to enable/disable MaterialModulator ")
      .addChild(new TouchSensor("TouchTextInterface").setDescription("Select to enable/disable MaterialModulator"))
      .addChild(new BooleanToggle("EventToggler"))
      .addChild(new ROUTE().setFromNode("TouchTextInterface").setFromField("isActive").setToNode("EventToggler").setToField("set_boolean"))
      .addChild(new ROUTE().setFromNode("EventToggler").setFromField("toggle").setToNode("MaterialModulatorInstance").setToField("enabled"))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return MaterialModulator model
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
        X3D thisExampleX3dModel = new MaterialModulator().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter14Prototypes.MaterialModulator\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter14Prototypes.MaterialModulator\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
