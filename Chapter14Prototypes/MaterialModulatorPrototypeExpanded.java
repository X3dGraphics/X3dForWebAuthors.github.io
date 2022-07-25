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
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Provide example for expansion of a MaterialModulator as regular X3D nodes, rather than a ProtoDeclare/ProtoInstance combination. MaterialModulator mimics a Material node and modulates diffuseColor field as an animation effect. </p>
 <p> Related links: <a href="../../../Chapter14Prototypes/MaterialModulatorPrototypeExpanded.java">MaterialModulatorPrototypeExpanded.java</a> source, <a href="../../../Chapter14Prototypes/MaterialModulatorPrototypeExpandedIndex.html" target="_top">MaterialModulatorPrototypeExpanded catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter14Prototypes/MaterialModulatorPrototypeExpanded.x3d">MaterialModulatorPrototypeExpanded.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Provide example for expansion of a MaterialModulator as regular X3D nodes, rather than a ProtoDeclare/ProtoInstance combination. MaterialModulator mimics a Material node and modulates diffuseColor field as an animation effect. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman, John Carlson, Roy Walmsley </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 2 July 2016 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D prototype expander, IS/connect, Script inputOutput field </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter14Prototypes/MaterialModulator.png">MaterialModulator.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter14Prototypes/MaterialModulator.x3d">MaterialModulator.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> JSON prototype expander <a href="https://github.com/coderextreme/X3DJSONLD" target="_blank">https://github.com/coderextreme/X3DJSONLD</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> TODO </i> </td>
			<td> Create corresponding web page describing Prototype Expander design. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> TODO </i> </td>
			<td> Create stylesheet converter matching this Prototype Expander design pattern. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> TODO </i> </td>
			<td> Add external ROUTEs to original example as a further test case for Prototype Expander design. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://github.com/coderextreme/X3DJSONLD/blob/master/PrototypeExpander.js" target="_blank">https://github.com/coderextreme/X3DJSONLD/blob/master/PrototypeExpander.js</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://github.com/coderextreme/X3DJSONLD/blob/master/ServerPrototypeExpander.js" target="_blank">https://github.com/coderextreme/X3DJSONLD/blob/master/ServerPrototypeExpander.js</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> X3D Tooltips: ProtoBody <a href="https://www.web3d.org/x3d/content/X3dTooltips.html#ProtoBody" target="_blank">https://www.web3d.org/x3d/content/X3dTooltips.html#ProtoBody</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> 4.4.4.3 PROTO definition semantics <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#PROTOdefinitionsemantics" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#PROTOdefinitionsemantics</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> [x3d-public] Prototype Expander, Question on design of instance expansions: <a href="http://web3d.org/pipermail/x3d-public_web3d.org/2016-July/004982.html" target="_blank">http://web3d.org/pipermail/x3d-public_web3d.org/2016-July/004982.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulatorPrototypeExpanded.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulatorPrototypeExpanded.x3d</a> </td>
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

	* @author Don Brutzman, John Carlson, Roy Walmsley
 */

public class MaterialModulatorPrototypeExpanded
{
	/** Default constructor to create this object. */
	public MaterialModulatorPrototypeExpanded ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("MaterialModulatorPrototypeExpanded.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Provide example for expansion of a MaterialModulator as regular X3D nodes, rather than a ProtoDeclare/ProtoInstance combination. MaterialModulator mimics a Material node and modulates diffuseColor field as an animation effect."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman, John Carlson, Roy Walmsley"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("2 July 2016"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D prototype expander, IS/connect, Script inputOutput field"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("MaterialModulator.png"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("MaterialModulator.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("JSON prototype expander https://github.com/coderextreme/X3DJSONLD"))
    .addMeta(new meta().setName(meta.NAME_TODO       ).setContent("Create corresponding web page describing Prototype Expander design."))
    .addMeta(new meta().setName(meta.NAME_TODO       ).setContent("Create stylesheet converter matching this Prototype Expander design pattern."))
    .addMeta(new meta().setName(meta.NAME_TODO       ).setContent("Add external ROUTEs to original example as a further test case for Prototype Expander design."))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://github.com/coderextreme/X3DJSONLD/blob/master/PrototypeExpander.js"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://github.com/coderextreme/X3DJSONLD/blob/master/ServerPrototypeExpander.js"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("X3D Tooltips: ProtoBody https://www.web3d.org/x3d/content/X3dTooltips.html#ProtoBody"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("4.4.4.3 PROTO definition semantics https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#PROTOdefinitionsemantics"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("[x3d-public] Prototype Expander, Question on design of instance expansions: http://web3d.org/pipermail/x3d-public_web3d.org/2016-July/004982.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/MaterialModulatorPrototypeExpanded.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("MaterialModulatorPrototypeExpanded.x3d"))
    .addChild(new Shape()
      .setGeometry(new Sphere())
      .setAppearance(new Appearance()
        .addComments(" Prototype Expander design note: only first node (the node type) of the prototype is substituted here. ")
        .setMaterial(new Material("MaterialModulatorNodeExpanded1").setDiffuseColor(0.5,0.1,0.1)
          .addComments(" Prototype Expander design note: no children nodes found in originally defined initial ProtoBody node, so no contained child nodes appear here "))))
    .addComments(" Prototype Expander design note: only first node (the node type) of the prototype is renderable above. when Switch is first allowed ")
    .addChild(new Switch("HideAdditionalPrototypeBodyNodesExpanded1").setWhichChoice(-1)
      .addComments(" Prototype Expander design note: all children inside a Switch continue to receive/send events. ")
      .addChild(new Group()
        .addComments(" Prototype Expander design note: additional follow-on nodes from the original ProtoBody are placed here. ")
        .addChild(new Script("MaterialModulatorScriptExpanded1").setSourceCode("""
ecmascript:
function initialize ()
{
    newColor = diffuseColor; // start with correct color
}
function clockTrigger (timeValue)
{
    if (!enabled) return;
    red   = newColor.r;
    green = newColor.g;
    blue  = newColor.b;
    
    // note different modulation rates for each color component, % is modulus operator
    newColor = new SFColor ((red + 0.02) % 1, (green + 0.03) % 1, (blue + 0.04) % 1);   
    Browser.print ('diffuseColor=(' + red +',' + green + ',' + blue + ') newColor=' + newColor.toString() + '\n');
}
""")
          .addField(new field().setName("enabled").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(true))
          .addField(new field().setName("diffuseColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFColor(0.5,0.1,0.1)))
          .addField(new field().setName("newColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
          .addField(new field().setName("clockTrigger").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INPUTONLY)))
        .addComments(" Clock tickles Script to wake up and compute a new value ")
        .addChild(new ROUTE().setFromNode("MaterialModulatorScriptExpanded1").setFromField("newColor").setToNode("MaterialModulatorNodeExpanded1").setToField("diffuseColor"))
        .addChild(new TimeSensor("ModulationClockExpanded1").setCycleInterval(0.1).setLoop(true))
        .addChild(new ROUTE().setFromNode("ModulationClockExpanded1").setFromField("cycleTime").setToNode("MaterialModulatorScriptExpanded1").setToField("clockTrigger")))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return MaterialModulatorPrototypeExpanded model
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
        X3D thisExampleX3dModel = new MaterialModulatorPrototypeExpanded().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter14Prototypes.MaterialModulatorPrototypeExpanded\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter14Prototypes.MaterialModulatorPrototypeExpanded\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
