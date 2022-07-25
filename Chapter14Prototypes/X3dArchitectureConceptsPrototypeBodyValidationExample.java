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
import org.web3d.x3d.jsail.EnvironmentalEffects.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Prototype example to illustrate why additional non-rendering nodes might be needed after first node in ProtoBody. </p>
 <p> Related links: <a href="../../../Chapter14Prototypes/X3dArchitectureConceptsPrototypeBodyValidationExample.java">X3dArchitectureConceptsPrototypeBodyValidationExample.java</a> source, <a href="../../../Chapter14Prototypes/X3dArchitectureConceptsPrototypeBodyValidationExampleIndex.html" target="_top">X3dArchitectureConceptsPrototypeBodyValidationExample catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter14Prototypes/X3dArchitectureConceptsPrototypeBodyValidationExample.x3d">X3dArchitectureConceptsPrototypeBodyValidationExample.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Prototype example to illustrate why additional non-rendering nodes might be needed after first node in ProtoBody </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> *Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 10 September 2021 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> version </i> </td>
			<td> 19 September 2021 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> drawing </i> </td>
			<td> <a href="../../../Chapter14Prototypes/X3dArchitectureConceptsPrototypeBodyValidationDiagram.png">X3dArchitectureConceptsPrototypeBodyValidationDiagram.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> drawing </i> </td>
			<td> <a href="../../../Chapter14Prototypes/X3dArchitectureConceptsPrototypeBodyValidationDiagram.vsdx">X3dArchitectureConceptsPrototypeBodyValidationDiagram.vsdx</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter14Prototypes/X3dArchitectureConceptsPrototypeBodyValidationExampleX_ITE.png">X3dArchitectureConceptsPrototypeBodyValidationExampleX_ITE.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/member-only/mantis/view.php?id=1372" target="_blank">https://www.web3d.org/member-only/mantis/view.php?id=1372</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> specificationSection </i> </td>
			<td> X3D Architecture, ISO/IEC 19775-1: 202x, Clause 4 Concepts, 4.4.4.3 PROTO definition semantics </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> specificationUrl </i> </td>
			<td> <a href="https://www.web3d.org/specifications/X3Dv4Draft/ISO-IEC19775-1v4-CD1/Part01/concepts.html#PROTOdefinitionsemantics" target="_blank">https://www.web3d.org/specifications/X3Dv4Draft/ISO-IEC19775-1v4-CD1/Part01/concepts.html#PROTOdefinitionsemantics</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> rights </i> </td>
			<td> (c) Web3D Consortium Inc. 2021 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D prototype specification </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/X3dArchitectureConceptsPrototypeBodyValidationExample.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/X3dArchitectureConceptsPrototypeBodyValidationExample.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 4.0, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
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

	* @author *Don Brutzman
 */

public class X3dArchitectureConceptsPrototypeBodyValidationExample
{
	/** Default constructor to create this object. */
	public X3dArchitectureConceptsPrototypeBodyValidationExample ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_4_0)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("X3dArchitectureConceptsPrototypeBodyValidationExample.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Prototype example to illustrate why additional non-rendering nodes might be needed after first node in ProtoBody"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("*Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("10 September 2021"))
    .addMeta(new meta().setName(meta.NAME_VERSION    ).setContent("19 September 2021"))
    .addMeta(new meta().setName(meta.NAME_DRAWING    ).setContent("X3dArchitectureConceptsPrototypeBodyValidationDiagram.png"))
    .addMeta(new meta().setName(meta.NAME_DRAWING    ).setContent("X3dArchitectureConceptsPrototypeBodyValidationDiagram.vsdx"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("X3dArchitectureConceptsPrototypeBodyValidationExampleX_ITE.png"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/member-only/mantis/view.php?id=1372"))
    .addMeta(new meta().setName(meta.NAME_SPECIFICATIONSECTION).setContent("X3D Architecture, ISO/IEC 19775-1: 202x, Clause 4 Concepts, 4.4.4.3 PROTO definition semantics"))
    .addMeta(new meta().setName(meta.NAME_SPECIFICATIONURL).setContent("https://www.web3d.org/specifications/X3Dv4Draft/ISO-IEC19775-1v4-CD1/Part01/concepts.html#PROTOdefinitionsemantics"))
    .addMeta(new meta().setName(meta.NAME_RIGHTS     ).setContent("(c) Web3D Consortium Inc. 2021"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D prototype specification"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/X3dArchitectureConceptsPrototypeBodyValidationExample.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 4.0, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new Background().setSkyColor(new MFColor(new double[] {0.058824,0.886275,1.0})))
    .addChild(new NavigationInfo())
    .addChild(new ProtoDeclare("PulsingBoxShape").setName("PulsingBoxShape")
      .setProtoInterface(new ProtoInterface()
        .addField(new field().setName("boxColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFColor(1.0,0.0,0.0))))
      .setProtoBody(new ProtoBody()
        .addComments(" First node in ProtoBody determines node type of this Prototype ")
        .addChild(new Shape("PrototypeRootNode")
          .setAppearance(new Appearance()
            .setMaterial(new Material("BoxMaterial").setDiffuseColor(0.980392,0.0,0.0)
              .setIS(new IS()
                .addConnect(new connect().setNodeField("diffuseColor").setProtoField("boxColor")))))
          .setGeometry(new Box("PulsingBox").setSize(4.0,4.0,4.0)))
        .addComments(" ====================================================================== ")
        .addComments(" Subsequent nodes do not render, but still must be a valid X3D subgraph ")
        .addComments(" Note if these move into the Shape node, scene graph is no longer valid ")
        .addChild(new ScalarInterpolator("TransparencyInterpolator").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new double[] {1.0,0.0,1.0}))
        .addChild(new TimeSensor("Timer").setCycleInterval(10).setLoop(true))
        .addComments(" ROUTEs ")
        .addChild(new ROUTE().setFromNode("Timer").setFromField("fraction_changed").setToNode("TransparencyInterpolator").setToField("set_fraction"))
        .addChild(new ROUTE().setFromNode("TransparencyInterpolator").setFromField("value_changed").setToNode("BoxMaterial").setToField("transparency"))
        .addComments(" ====================================================================== ")))
    .addChild(new ProtoInstance("PulsingBoxShape", "MyBox").setContainerField("children")
      .addComments(" NavyBlue TODO need appinfo/documentation fields on fieldValue to match field expressivity ")
      .addFieldValue(new fieldValue().setName("boxColor").setValue(new SFColor(0.0,0.0,0.5)))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return X3dArchitectureConceptsPrototypeBodyValidationExample model
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
        X3D thisExampleX3dModel = new X3dArchitectureConceptsPrototypeBodyValidationExample().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter14Prototypes.X3dArchitectureConceptsPrototypeBodyValidationExample\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter14Prototypes.X3dArchitectureConceptsPrototypeBodyValidationExample\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
