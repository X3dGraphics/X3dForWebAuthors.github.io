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
import org.web3d.x3d.jsail.EnvironmentalEffects.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Lighting.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Sound.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Fish Schooling Demo. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/FishSchool.java">FishSchool.java</a> source, <a href="../../../KelpForestExhibit/FishSchoolIndex.html" target="_top">FishSchool catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/FishSchool.x3d">FishSchool.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Fish Schooling Demo </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Stewart Liles, Sean Hynes </td>
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
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/FishSchool.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/FishSchool.x3d</a> </td>
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

	* @author Stewart Liles, Sean Hynes
 */

public class FishSchool
{
	/** Default constructor to create this object. */
	public FishSchool ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("FishSchool.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Fish Schooling Demo"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Stewart Liles, Sean Hynes"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("25 September 1998"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf"))
    .addMeta(new meta().setName(meta.NAME_ACCESSRIGHTS).setContent("All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/FishSchool.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("FishSchool.x3d"))
    .addChild(new NavigationInfo().setSpeed(5.0).setType("\"EXAMINE\"").setVisibilityLimit(250.0))
    .addChild(new Viewpoint().setDescription("Close to School - FS").setPosition(0.0,1.0,75.0))
    .addChild(new Viewpoint().setDescription("Nose on Glass - FS").setFieldOfView(1.0).setPosition(0.0,1.0,30.0))
    .addChild(new Viewpoint().setDescription("Fish Feeding - FS").setFieldOfView(1.0).setOrientation(1.0,0.0,0.0,-1.57).setPosition(0.0,40.0,0.0))
    .addChild(new Viewpoint().setDescription("Left Side - FS").setFieldOfView(1.0).setOrientation(0.0,1.0,0.0,-1.57).setPosition(-40.0,0.0,0.0))
    .addChild(new Viewpoint().setDescription("Right Side - FS").setFieldOfView(1.0).setOrientation(0.0,1.0,0.0,1.57).setPosition(40.0,0.0,0.0))
    .addChild(new Viewpoint().setDescription("Middle Looking Out - FS").setJump(false).setOrientation(0.0,1.0,0.0,2.2).setPosition(0.0,0.0,0.0))
    .addChild(new SpotLight().setAmbientIntensity(1.0).setDirection(0.0,-1.0,0.0).setLocation(0.0,50.0,0.0))
    .addChild(new Sound().setLocation(0.0,0.1,0.0).setMaxBack(50).setMaxFront(50).setMinBack(50).setMinFront(50)
      .setSource(new AudioClip().setDescription("Sound for Fish").setLoop(true).setUrl(new String[] {"Sound2.wav","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Sound2.wav"})))
    .addChild(new TimeSensor("GlobalClock").setLoop(true))
    .addChild(new Shape()
      .setAppearance(new Appearance()
        .setMaterial(new Material()))
      .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,2,3,0,-1,4,5,6,7,4,-1,0,4,-1,1,5,-1,2,6,-1,3,7})
        .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-30.0,30.0,30.0,30.0,30.0,30.0,30.0,30.0,-30.0,-30.0,30.0,-30.0,-30.0,-30.0,30.0,30.0,-30.0,30.0,30.0,-30.0,-30.0,-30.0,-30.0,-30.0})))))
    .addChild(new Fog().setColor(0.1,0.3,0.1).setVisibilityRange(70.0))
    .addChild(new Transform("Fish0").setTranslation(-5.0,0.0,0.0)
      .addChild(new Viewpoint().setDescription("Fish 0 view").setFieldOfView(1.8).setPosition(0.0,1.0,-0.5))
      .addChild(new Inline("FishIN").setUrl(new String[] {"Fish.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Fish.x3d","Fish.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Fish.wrl"})))
    .addChild(new Transform("Fish1").setTranslation(-4.0,0.0,0.0)
      .addChild(new Viewpoint().setDescription("Fish 1 view").setFieldOfView(1.8).setPosition(0.0,1.0,-0.5))
      .addChild(new Inline().setUSE("FishIN")))
    .addChild(new Transform("Fish2").setTranslation(-3.0,0.0,0.0)
      .addChild(new Viewpoint().setDescription("Fish 2 view").setFieldOfView(1.8).setPosition(0.0,1.0,-0.5))
      .addChild(new Inline().setUSE("FishIN")))
    .addChild(new Transform("Fish3").setTranslation(-2.0,0.0,0.0)
      .addChild(new Viewpoint().setDescription("Fish 3 view").setFieldOfView(1.8).setPosition(0.0,1.0,-0.5))
      .addChild(new Inline().setUSE("FishIN")))
    .addChild(new Transform("Fish4").setTranslation(-1.0,0.0,0.0)
      .addChild(new Viewpoint().setDescription("Fish 4 view").setFieldOfView(1.8).setPosition(0.0,1.0,-0.5))
      .addChild(new Inline().setUSE("FishIN")))
    .addChild(new Transform("Fish5")
      .addChild(new Viewpoint().setDescription("Fish 5 view").setFieldOfView(1.8).setPosition(0.0,1.0,-0.5))
      .addChild(new Inline().setUSE("FishIN")))
    .addChild(new Transform("Fish6").setTranslation(1.0,0.0,0.0)
      .addChild(new Viewpoint().setDescription("Fish 6 view").setFieldOfView(1.8).setPosition(0.0,1.0,-0.5))
      .addChild(new Inline().setUSE("FishIN")))
    .addChild(new Transform("Fish7").setTranslation(2.0,0.0,0.0)
      .addChild(new Viewpoint().setDescription("Fish 7 view").setFieldOfView(1.8).setPosition(0.0,1.0,-0.5))
      .addChild(new Inline().setUSE("FishIN")))
    .addChild(new Transform("Fish8").setTranslation(3.0,0.0,0.0)
      .addChild(new Viewpoint().setDescription("Fish 8 view").setFieldOfView(1.8).setPosition(0.0,1.0,-0.5))
      .addChild(new Inline().setUSE("FishIN")))
    .addChild(new Transform("Fish9").setTranslation(4.0,0.0,0.0)
      .addChild(new Viewpoint().setDescription("Fish 9 view").setFieldOfView(1.8).setPosition(0.0,1.0,-0.5))
      .addChild(new Inline().setUSE("FishIN")))
    .addComments(" Warning: VRML97-style scripting, not X3D Scene Authoring Interface (SAI) ")
    .addChild(new Script("BoidScript").setDirectOutput(true).setMustEvaluate(true).setUrl(new String[] {"FishSchoolCode/Demo.class","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/FishSchoolCode/Demo.class"})
      .addField(new field().setName("GlobalTick").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addField(new field().setName("B9").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
        .addChild(new Transform().setUSE("Fish9")))
      .addField(new field().setName("B8").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
        .addChild(new Transform().setUSE("Fish8")))
      .addField(new field().setName("B7").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
        .addChild(new Transform().setUSE("Fish7")))
      .addField(new field().setName("B6").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
        .addChild(new Transform().setUSE("Fish6")))
      .addField(new field().setName("B5").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
        .addChild(new Transform().setUSE("Fish5")))
      .addField(new field().setName("B4").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
        .addChild(new Transform().setUSE("Fish4")))
      .addField(new field().setName("B3").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
        .addChild(new Transform().setUSE("Fish3")))
      .addField(new field().setName("B2").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
        .addChild(new Transform().setUSE("Fish2")))
      .addField(new field().setName("B1").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
        .addChild(new Transform().setUSE("Fish1")))
      .addField(new field().setName("B0").setType(field.TYPE_SFNODE).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)
        .addChild(new Transform().setUSE("Fish0"))))
    .addChild(new ROUTE().setFromNode("GlobalClock").setFromField("fraction_changed").setToNode("BoidScript").setToField("GlobalTick")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return FishSchool model
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
        X3D thisExampleX3dModel = new FishSchool().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.FishSchool\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.FishSchool\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
