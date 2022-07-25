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
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Script node interface between X3D and EcmaScript: this conformance example tests field-based X3D-EcmaScript functionality. </p>
 <p> Related links: <a href="../../../Chapter09EventUtilitiesScripting/ScriptNodeFieldControlEcmaScript.java">ScriptNodeFieldControlEcmaScript.java</a> source, <a href="../../../Chapter09EventUtilitiesScripting/ScriptNodeFieldControlEcmaScriptIndex.html" target="_top">ScriptNodeFieldControlEcmaScript catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter09EventUtilitiesScripting/ScriptNodeFieldControlEcmaScript.x3d">ScriptNodeFieldControlEcmaScript.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Script node interface between X3D and EcmaScript: this conformance example tests field-based X3D-EcmaScript functionality. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 30 November 1997 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translated </i> </td>
			<td> 13 May 2001 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/Basic/ScriptConformance/ScriptNodeFieldControlEcmaScript.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/ScriptConformance/ScriptNodeFieldControlEcmaScript.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/ScriptNodeFieldControlEcmaScript.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/ScriptNodeFieldControlEcmaScript.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> VRML 97 Specification, Annex C, ECMAScript scripting reference </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/technicalinfo/specifications/vrml97/part1/javascript.html" target="_blank">https://www.web3d.org/technicalinfo/specifications/vrml97/part1/javascript.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/technicalinfo/specifications/vrml97/part1/javascript.html#AccessingFields" target="_blank">https://www.web3d.org/technicalinfo/specifications/vrml97/part1/javascript.html#AccessingFields</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> Makefile </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> Makefile.out </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> ScriptNodeFieldControlEcmaScript-VrmlConsoleOutput.txt </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter09EventUtilitiesScripting/ScriptNodeFieldControlEcmaScriptSnapshots.html">ScriptNodeFieldControlEcmaScriptSnapshots.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter09EventUtilitiesScripting/ScriptNodeFieldControl-Java.x3d">ScriptNodeFieldControl-Java.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> VRML X3D EcmaScript Script conformance </td>
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

	* @author Don Brutzman
 */

public class ScriptNodeFieldControlEcmaScript
{
	/** Default constructor to create this object. */
	public ScriptNodeFieldControlEcmaScript ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("ScriptNodeFieldControlEcmaScript.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Script node interface between X3D and EcmaScript: this conformance example tests field-based X3D-EcmaScript functionality."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("30 November 1997"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("13 May 2001"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/Basic/ScriptConformance/ScriptNodeFieldControlEcmaScript.x3d"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/ScriptNodeFieldControlEcmaScript.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("VRML 97 Specification, Annex C, ECMAScript scripting reference"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/technicalinfo/specifications/vrml97/part1/javascript.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/technicalinfo/specifications/vrml97/part1/javascript.html#AccessingFields"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("Makefile"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("Makefile.out"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("ScriptNodeFieldControlEcmaScript-VrmlConsoleOutput.txt"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("ScriptNodeFieldControlEcmaScriptSnapshots.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("ScriptNodeFieldControl-Java.x3d"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("VRML X3D EcmaScript Script conformance"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("ScriptNodeFieldControlEcmaScript.x3d"))
    .addChild(new Viewpoint().setDescription("View test").setPosition(0.0,0.0,12.0))
    .addChild(new Group()
      .addChild(new TouchSensor("ClickTextToTest").setDescription("Click text to test"))
      .addChild(new Transform("TextPosition")
        .addComments(" TextPosition translation is modified by InterfaceScriptNode. ")
        .addChild(new Shape()
          .setGeometry(new Text("MessageToUser").setString(new String[] {"Default text in X3D scene will be replaced by","Java initialize() in Script using EventOut control.","This text appears first, if Java initialization fails.",""})
            .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.8)))
          .setAppearance(new Appearance()
            .setMaterial(new Material("TextMaterial").setDiffuseColor(0.8,0.2,0.2).setShininess(0.9)))))
      .addChild(new Script("InterfaceScriptNode").setDirectOutput(true).setSourceCode("""
ecmascript:

function initialize ()
{
	DEBUG = true;
	mode  = 1;
	if (DEBUG) Browser.print ('initialize ():');

	sceneText.string = new MFString (
	'EcmaScript initialize () with field control',
 	'has reinitialized the changedText node.',
 	'',
 	'Please click text for additional results.');
	sceneTransform.translation = new SFVec3f ( 0, 3, 0 );
	sceneMaterial.diffuseColor = new SFColor ( 0.8, 0.8, 0.2 );
	if (DEBUG) Browser.print ('sceneText.string           =' + sceneText.string);
	if (DEBUG) Browser.print ('sceneTransform.translation =' + sceneTransform.translation);
	if (DEBUG) Browser.print ('sceneMaterial.diffuseColor =' + sceneMaterial.diffuseColor);
}
function startTime (value, timestamp)
{
	if (DEBUG) Browser.print ('==============================');
	if (DEBUG) Browser.print ('touchEvent startTime =' + value);

	mode = (mode + 1) % 3;
	if (DEBUG) Browser.print ('mode =' + mode);
	switch (mode)
	{
	  case 0:	// pre-initialize error messsage
		sceneText.string = new MFString (
		'Default text in X3D scene will be replaced by',
 		'EcmaScript initialize() in Script using field control.',
 		'This text appears first, if EcmaScript initialization fails.',
 		'');
 		sceneTransform.translation = new SFVec3f ( 0, 1, 0 );
		sceneMaterial.diffuseColor = new SFColor ( 0.8, 0.2, 0.2 ); 
	  	break;

	  case 1:	// post-initialize ready-to-click message
		initialize ();
		break;

	  case 2:	// post-click all-done message
		sceneText.string = new MFString (
		'User click on text seen by EcmaScript',
 		'function via Script node eventIn.',
 		'Text & position successfully changed',
 		'via field control.  Test passed.');
	 	sceneTransform.translation = new SFVec3f ( 0, -1, 0 );
	 	sceneMaterial.diffuseColor = new SFColor ( 0.2, 0.8, 0.2 );
		break;
	}
		
	if (mode != 1)
	{
	 	if (DEBUG) Browser.print ('sceneText.string           =' + sceneText.string);
	 	if (DEBUG) Browser.print ('sceneTransform.translation =' + sceneTransform.translation);
	 	if (DEBUG) Browser.print ('sceneMaterial.diffuseColor =' + sceneMaterial.diffuseColor);
	 	if (DEBUG) Browser.print ();
 	}
}
function shutdown()
{
	if (DEBUG) Browser.print ('==============================');
  	if (DEBUG) Browser.print ('script shutdown.');
	if (DEBUG) Browser.print ('==============================');
}
""")
        .addComments(" No default values are allowed for eventIn or eventOut. ")
        .addField(new field().setName("startTime").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("sceneText").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
          .addChild(new Text().setUSE("MessageToUser")))
        .addField(new field().setName("sceneTransform").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
          .addChild(new Transform().setUSE("TextPosition")))
        .addField(new field().setName("sceneMaterial").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
          .addChild(new Material().setUSE("TextMaterial")))))
    .addChild(new ROUTE().setFromNode("ClickTextToTest").setFromField("touchTime").setToNode("InterfaceScriptNode").setToField("startTime")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return ScriptNodeFieldControlEcmaScript model
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
        X3D thisExampleX3dModel = new ScriptNodeFieldControlEcmaScript().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter09EventUtilitiesScripting.ScriptNodeFieldControlEcmaScript\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter09EventUtilitiesScripting.ScriptNodeFieldControlEcmaScript\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
