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
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Creates Kelp Prototype - this file uses Bulb and is used by KelpExamplesNoBase. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/KelpPrototype.java">KelpPrototype.java</a> source, <a href="../../../KelpForestExhibit/KelpPrototypeIndex.html" target="_top">KelpPrototype catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/KelpPrototype.x3d">KelpPrototype.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Creates Kelp Prototype - this file uses Bulb and is used by KelpExamplesNoBase. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Joseph Cannon, Dan DeVos </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 18 March 1999 </td>
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
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf">KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> accessRights </i> </td>
			<td> All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpPrototype.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpPrototype.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> Vrml97ToX3dNist, <a href="http://ovrt.nist.gov/v2_x3d.html" target="_blank">http://ovrt.nist.gov/v2_x3d.html</a> </td>
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

	* @author Joseph Cannon, Dan DeVos
 */

public class KelpPrototype
{
	/** Default constructor to create this object. */
	public KelpPrototype ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("KelpPrototype.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Creates Kelp Prototype - this file uses Bulb and is used by KelpExamplesNoBase."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Joseph Cannon, Dan DeVos"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("18 March 1999"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://faculty.nps.edu/brutzman/kelp"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf"))
    .addMeta(new meta().setName(meta.NAME_ACCESSRIGHTS).setContent("All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpPrototype.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("KelpPrototype.x3d"))
    .addChild(new ProtoDeclare("Kelp").setName("Kelp").setAppinfo("Kelp strands and bulbs with no base")
      .setProtoInterface(new ProtoInterface()
        .addField(new field().setName("frontBladeSize").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFVec3f(0.7,0.7,0.7)))
        .addField(new field().setName("frontSideBladeHeight").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFVec3f(0.0,4.0,0.0)))
        .addField(new field().setName("rightBladeSize").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFVec3f(0.7,0.7,0.7)))
        .addField(new field().setName("rightSideBladeHeight").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFVec3f(0.0,12.0,0.0)))
        .addField(new field().setName("rearBladeSize").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFVec3f(0.4,0.4,0.4)))
        .addField(new field().setName("rearSideBladeHeight").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFVec3f(0.0,20.0,0.0)))
        .addField(new field().setName("leftBladeSize").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFVec3f(0.4,0.4,0.4)))
        .addField(new field().setName("leftSideBladeHeight").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFVec3f(0.0,24.0,0.0))))
      .setProtoBody(new ProtoBody()
        .addChild(new Group()
          .addChild(new Transform("stipe").setCenter(0.0,-16.0,0.0).setTranslation(0.0,14.0,0.0)
            .addChild(new Shape("stemShape")
              .setAppearance(new Appearance("kelpColor")
                .setMaterial(new Material().setDiffuseColor(0.882,0.757,0.184)))
              .setGeometry(new Cylinder().setBottom(false).setHeight(28.0).setRadius(0.2).setTop(false)))
            .addChild(new Transform("horizontalStipe").setCenter(0.0,16.0,0.0).setRotation(0.0,0.0,1.0,1.5707).setScale(0.5,0.3,0.5).setTranslation(1.3,0.0,0.0)
              .addChild(new Transform()
                .addChild(new Shape().setUSE("stemShape")))
              .addChild(new Transform("blade_X1").setRotation(0.0,1.0,0.0,1.0).setTranslation(0.0,12.0,0.0)
                .addChild(new Transform("bladeRotateZ").setRotation(0.0,0.0,1.0,-1.2)
                  .addChild(new Transform("BLADE").setCenter(-0.5,0.0,0.0).setTranslation(1.0,0.0,0.0)
                    .addChild(new Inline("bulb").setUrl(new String[] {"KelpBulb.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBulb.x3d","KelpBulb.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBulb.wrl"})))))
              .addChild(new Transform("blade_X2").setRotation(0.0,1.0,0.0,-1.0)
                .addChild(new Transform().setUSE("bladeRotateZ")))
              .addChild(new Transform("blade_X3").setRotation(0.0,1.0,0.0,4.342).setTranslation(0.0,-12.0,0.0)
                .addChild(new Transform().setUSE("bladeRotateZ"))))
            .addChild(new Transform().setTranslation(0.0,14.0,0.0)
              .addChild(new Shape()
                .setAppearance(new Appearance().setUSE("kelpColor"))
                .setGeometry(new Extrusion().setCreaseAngle(1.57).setCrossSection(new MFVec2f(new double[] {0.2,0.0,0.184,-0.076,0.142,-0.142,0.076,-0.184,0.0,-0.2,-0.076,-0.184,-0.142,-0.142,-0.184,-0.076,-0.2,-0.0,-0.184,0.076,-0.142,0.142,-0.076,0.184,0.0,0.2,0.076,0.184,0.142,0.142,0.184,0.076,0.2,0.0})).setScale(new MFVec2f(new double[] {1.0,1.0,0.8,0.8,0.7,0.7,0.6,0.6,0.5,0.5})).setSpine(new MFVec3f(new double[] {0.0,0.0,0.0,0.15,0.77,0.0,0.59,1.41,0.0,1.23,1.85,0.0,2.0,2.0,0.0}))))))
          .addChild(new Transform("blade_Y1").setRotation(0.0,0.0,1.0,1.2)
            .setIS(new IS()
              .addConnect(new connect().setNodeField("scale").setProtoField("frontBladeSize"))
              .addConnect(new connect().setNodeField("translation").setProtoField("frontSideBladeHeight")))
            .addChild(new Transform().setUSE("BLADE")))
          .addChild(new Transform("blade_Y2").setRotation(0.0,1.0,0.0,4.2)
            .setIS(new IS()
              .addConnect(new connect().setNodeField("scale").setProtoField("rightBladeSize"))
              .addConnect(new connect().setNodeField("translation").setProtoField("rightSideBladeHeight")))
            .addChild(new Transform("bladeToTheSide").setRotation(1.0,0.0,0.0,3.142)
              .addChild(new Transform().setRotation(0.0,0.0,1.0,-1.2)
                .addChild(new Transform("rotateBlade90").setCenter(-0.5,0.0,0.0).setRotation(1.0,0.0,0.0,1.5707).setTranslation(1.0,0.0,0.0)
                  .addChild(new Inline().setUSE("bulb"))))))
          .addChild(new Transform("blade_Y3").setRotation(0.0,1.0,0.0,3.2)
            .setIS(new IS()
              .addConnect(new connect().setNodeField("scale").setProtoField("rearBladeSize"))
              .addConnect(new connect().setNodeField("translation").setProtoField("rearSideBladeHeight")))
            .addChild(new Transform("Blade-Z").setRotation(1.0,0.0,0.0,3.142)
              .addChild(new Transform().setRotation(0.0,0.0,1.0,-1.2)
                .addChild(new Transform().setUSE("BLADE")))))
          .addChild(new Transform("blade_Y4").setRotation(0.0,1.0,0.0,1.2)
            .setIS(new IS()
              .addConnect(new connect().setNodeField("scale").setProtoField("leftBladeSize"))
              .addConnect(new connect().setNodeField("translation").setProtoField("leftSideBladeHeight")))
            .addChild(new Transform().setUSE("bladeToTheSide")))
          .addChild(new TimeSensor("Clock").setCycleInterval(5.5).setLoop(true))
          .addChild(new OrientationInterpolator("horizontalStipeMover").setKey(new double[] {0.0,0.25,0.5,0.75,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,1.471,0.0,0.0,1.0,1.571,0.0,0.0,1.0,1.671,0.0,0.0,1.0,1.571,0.0,0.0,1.0,1.471}))))
        .addChild(new ROUTE().setFromNode("Clock").setFromField("fraction_changed").setToNode("horizontalStipeMover").setToField("set_fraction"))
        .addChild(new ROUTE().setFromNode("horizontalStipeMover").setFromField("value_changed").setToNode("horizontalStipe").setToField("set_rotation"))))
    .addComments(" Example use of this prototype is in KelpNoBase.x3d, .wrl ")
    .addChild(new Viewpoint().setDescription("click message to view example").setPosition(0.0,0.0,8.0))
    .addComments(" Redirection text in case a user examines this PROTO file via a 3D browser: ")
    .addChild(new Anchor("TouchTextForExample").setDescription("KelpNoBase").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"KelpExamplesNoBase.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpExamplesNoBase.x3d","KelpExamplesNoBase.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpExamplesNoBase.wrl"})
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,1.0,1.0).setEmissiveColor(0.0,1.0,1.0)))
        .setGeometry(new Text().setString(new String[] {"KelpPrototype","is a Prototype declaration file.","","To see an example using 3 instances of","this new node, click this text and view","KelpNoBase scene"})
          .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.5))))
      .addComments(" Selectable Text design pattern has transparent Box and TouchSensor description as a tooltip ")
      .addChild(new Shape()
        .setGeometry(new Box().setSize(8.0,3.0,.001))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setTransparency(1))))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return KelpPrototype model
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
        X3D thisExampleX3dModel = new KelpPrototype().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.KelpPrototype\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.KelpPrototype\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
