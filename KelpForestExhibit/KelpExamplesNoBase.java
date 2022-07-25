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
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Creates 3 instances of Kelp that sway. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/KelpExamplesNoBase.java">KelpExamplesNoBase.java</a> source, <a href="../../../KelpForestExhibit/KelpExamplesNoBaseIndex.html" target="_top">KelpExamplesNoBase catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/KelpExamplesNoBase.x3d">KelpExamplesNoBase.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Creates 3 instances of Kelp that sway. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Joseph Cannon, Dan DeVos, Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 25 September 1998 </td>
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
			<td> <a href="https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf" target="_blank">https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf" target="_blank">https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> accessRights </i> </td>
			<td> All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpExamplesNoBase.x3d" target="_blank">https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpExamplesNoBase.x3d</a> </td>
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

	* @author Joseph Cannon, Dan DeVos, Don Brutzman
 */

public class KelpExamplesNoBase
{
	/** Default constructor to create this object. */
	public KelpExamplesNoBase ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("KelpExamplesNoBase.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Creates 3 instances of Kelp that sway."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Joseph Cannon, Dan DeVos, Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("25 September 1998"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://faculty.nps.edu/brutzman/kelp"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf"))
    .addMeta(new meta().setName(meta.NAME_ACCESSRIGHTS).setContent("All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpExamplesNoBase.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("KelpExamplesNoBase.x3d"))
    .addChild(new ExternProtoDeclare("Kelp").setName("Kelp").setAppinfo("Kelp strands and bulbs with no base").setUrl(new String[] {"KelpPrototype.x3d#Kelp","https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpPrototype.x3d#Kelp","KelpPrototype.wrl#Kelp","https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpPrototype.wrl#Kelp"})
      .addField(new field().setName("frontBladeSize").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("rearSideBladeHeight").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("frontSideBladeHeight").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("rightBladeSize").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("rightSideBladeHeight").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("leftBladeSize").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("rearBladeSize").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("leftSideBladeHeight").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT)))
    .addChild(new Group()
      .addChild(new Transform("KelpTransform0").setScale(0.3,0.3,0.3)
        .addChild(new ProtoInstance("Kelp").setContainerField("children")))
      .addChild(new Transform("KelpTransform1").setRotation(0.0,1.0,0.0,5.5).setScale(0.29,0.29,0.29).setTranslation(-0.5,0.0,0.0)
        .addChild(new ProtoInstance("Kelp").setContainerField("children")
          .addFieldValue(new fieldValue().setName("rearSideBladeHeight").setValue(new SFVec3f(0.0,15.0,0.0)))
          .addFieldValue(new fieldValue().setName("frontBladeSize").setValue(new SFVec3f(0.4,0.4,0.4)))
          .addFieldValue(new fieldValue().setName("frontSideBladeHeight").setValue(new SFVec3f(0.0,23.0,0.0)))
          .addFieldValue(new fieldValue().setName("rightBladeSize").setValue(new SFVec3f(0.4,0.4,0.4)))
          .addFieldValue(new fieldValue().setName("rightSideBladeHeight").setValue(new SFVec3f(0.0,20.0,0.0)))
          .addFieldValue(new fieldValue().setName("leftBladeSize").setValue(new SFVec3f(0.7,0.7,0.7)))
          .addFieldValue(new fieldValue().setName("rearBladeSize").setValue(new SFVec3f(0.7,0.7,0.7)))
          .addFieldValue(new fieldValue().setName("leftSideBladeHeight").setValue(new SFVec3f(0.0,6.0,0.0)))))
      .addChild(new Transform("KelpTransform2").setScale(0.3,0.3,0.3).setTranslation(0.5,0.0,0.5)
        .addChild(new ProtoInstance("Kelp").setContainerField("children")
          .addFieldValue(new fieldValue().setName("rearSideBladeHeight").setValue(new SFVec3f(0.0,18.0,0.0)))
          .addFieldValue(new fieldValue().setName("frontBladeSize").setValue(new SFVec3f(0.7,0.7,0.7)))
          .addFieldValue(new fieldValue().setName("frontSideBladeHeight").setValue(new SFVec3f(0.0,8.0,0.0)))
          .addFieldValue(new fieldValue().setName("rightBladeSize").setValue(new SFVec3f(0.7,0.7,0.7)))
          .addFieldValue(new fieldValue().setName("rightSideBladeHeight").setValue(new SFVec3f(0.0,16.0,0.0)))
          .addFieldValue(new fieldValue().setName("leftBladeSize").setValue(new SFVec3f(0.7,0.7,0.7)))
          .addFieldValue(new fieldValue().setName("rearBladeSize").setValue(new SFVec3f(0.4,0.4,0.4)))
          .addFieldValue(new fieldValue().setName("leftSideBladeHeight").setValue(new SFVec3f(0.0,13.0,0.0))))))
    .addChild(new Group()
      .addComments(" ==================== ")
      .addChild(new TimeSensor("Clock0").setCycleInterval(5.5).setLoop(true))
      .addComments(" ==================== ")
      .addChild(new OrientationInterpolator("KelpPath0").setKey(new double[] {0.0,0.05,0.25,0.45,0.5,0.55,0.75,0.95,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.1,0.0,0.0,1.0,0.095,0.0,0.0,1.0,0.0,0.0,0.0,1.0,-0.095,0.0,0.0,1.0,-0.1,0.0,0.0,1.0,-0.095,0.0,0.0,1.0,0.0,0.0,0.0,1.0,0.095,0.0,0.0,1.0,0.1})))
      .addChild(new ROUTE().setFromNode("Clock0").setFromField("fraction_changed").setToNode("KelpPath0").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("KelpPath0").setFromField("value_changed").setToNode("KelpTransform0").setToField("set_rotation"))
      .addComments(" ==================== ")
      .addChild(new Script("TimeDelay1").setSourceCode("""
ecmascript:

function set_fraction (value, timestamp)
{
	delay = 0.25;
	delayedValue = value + (delay/5.5); // delay/interval, seconds
	if (delayedValue > 1) delayedValue--;
	value_changed = delayedValue;

//	Browser.print ('TimeDelay1 value=' + value + ', value_changed=' + value_changed);
}
""")
        .addField(new field().setName("set_fraction").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("value_changed").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_OUTPUTONLY)))
      .addChild(new OrientationInterpolator("KelpPath1").setKey(new double[] {0.0,0.05,0.25,0.45,0.5,0.55,0.75,0.95,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.1,0.0,0.0,1.0,0.095,0.0,0.0,1.0,0.0,0.0,0.0,1.0,-0.095,0.0,0.0,1.0,-0.1,0.0,0.0,1.0,-0.095,0.0,0.0,1.0,0.0,0.0,0.0,1.0,0.095,0.0,0.0,1.0,0.1})))
      .addChild(new ROUTE().setFromNode("Clock0").setFromField("fraction_changed").setToNode("TimeDelay1").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("TimeDelay1").setFromField("value_changed").setToNode("KelpPath1").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("KelpPath1").setFromField("value_changed").setToNode("KelpTransform1").setToField("set_rotation"))
      .addComments(" ==================== ")
      .addChild(new Script("TimeDelay2").setSourceCode("""
ecmascript:

function set_fraction (value, timestamp)
{
	delay = 0.5;
	delayedValue = value + (delay/5.5); // delay/interval, seconds
	if (delayedValue > 1) delayedValue--;
	value_changed = delayedValue;

//	Browser.print ('TimeDelay2 value=' + value + ', value_changed=' + value_changed);
}
""")
        .addField(new field().setName("set_fraction").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("value_changed").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_OUTPUTONLY)))
      .addChild(new OrientationInterpolator("KelpPath2").setKey(new double[] {0.0,0.05,0.25,0.45,0.5,0.55,0.75,0.95,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.1,0.0,0.0,1.0,0.095,0.0,0.0,1.0,0.0,0.0,0.0,1.0,-0.095,0.0,0.0,1.0,-0.1,0.0,0.0,1.0,-0.095,0.0,0.0,1.0,0.0,0.0,0.0,1.0,0.095,0.0,0.0,1.0,0.1})))
      .addChild(new ROUTE().setFromNode("Clock0").setFromField("fraction_changed").setToNode("TimeDelay2").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("TimeDelay2").setFromField("value_changed").setToNode("KelpPath2").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("KelpPath2").setFromField("value_changed").setToNode("KelpTransform2").setToField("set_rotation"))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return KelpExamplesNoBase model
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
        X3D thisExampleX3dModel = new KelpExamplesNoBase().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.KelpExamplesNoBase\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.KelpExamplesNoBase\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
