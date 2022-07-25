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
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Demonstrates use of a ProximitySensor in building a HUD, with display values showing current view location. </p>
 <p> Related links: <a href="../../../Chapter14Prototypes/HudKelpForest.java">HudKelpForest.java</a> source, <a href="../../../Chapter14Prototypes/HudKelpForestIndex.html" target="_top">HudKelpForest catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter14Prototypes/HudKelpForest.x3d">HudKelpForest.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Demonstrates use of a ProximitySensor in building a HUD, with display values showing current view location. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Leonard Daly and Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 15 July 2006 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter14Prototypes/HudKelpForestScreenshot.png">HudKelpForestScreenshot.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com" target="_blank">https://X3dGraphics.com</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">https://www.web3d.org/x3d/content/examples/X3dResources.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> rights </i> </td>
			<td> Copyright 2006, Daly Realism and Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D book, X3D graphics, X3D-Edit, <a href="http://www.x3dGraphics.com" target="_blank">http://www.x3dGraphics.com</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/HudKelpForest.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/HudKelpForest.x3d</a> </td>
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

	* @author Leonard Daly and Don Brutzman
 */

public class HudKelpForest
{
	/** Default constructor to create this object. */
	public HudKelpForest ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("HudKelpForest.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Demonstrates use of a ProximitySensor in building a HUD, with display values showing current view location."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Leonard Daly and Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("15 July 2006"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("HudKelpForestScreenshot.png"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_RIGHTS     ).setContent("Copyright 2006, Daly Realism and Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/HudKelpForest.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("HudKelpForest.x3d"))
    .addChild(new ExternProtoDeclare("HeadsUpDisplay").setName("HeadsUpDisplay").setAppinfo("Heads-up display (HUD) keeps child geometry aligned on screen in a consistent location").setUrl(new String[] {"HeadsUpDisplayPrototype.x3d#HeadsUpDisplay","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/HeadsUpDisplayPrototype.x3d#HeadsUpDisplay","HeadsUpDisplayPrototype.wrl#HeadsUpDisplay","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/HeadsUpDisplayPrototype.wrl#HeadsUpDisplay"})
      .addField(new field().setName("screenOffset").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("offset position for HUD relative to current view location, default 0 0 -5"))
      .addField(new field().setName("children").setType(field.TYPE_MFNODE).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("X3D content positioned at HUD offset"))
      .addField(new field().setName("position_changed").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_OUTPUTONLY).setAppinfo("HUD position update (in world coordinates) relative to original location"))
      .addField(new field().setName("orientation_changed").setType(field.TYPE_SFROTATION).setAccessType(field.ACCESSTYPE_OUTPUTONLY).setAppinfo("HUD orientation update relative to original location")))
    .addChild(new ExternProtoDeclare("TextString").setName("TextString").setUrl(new String[] {"TextStringPrototype.x3d#TextString","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/TextStringPrototype.x3d#TextString","TextStringPrototype.wrl#TextString","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/TextStringPrototype.wrl#TextString"})
      .addField(new field().setName("offset").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("string").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("color").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("size").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
      .addField(new field().setName("justify").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
      .addField(new field().setName("style").setType(field.TYPE_SFSTRING).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
      .addField(new field().setName("family").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INITIALIZEONLY)))
    .addChild(new Background().setGroundAngle(new double[] {1.309,1.5707}).setGroundColor(new MFColor(new double[] {0.1,0.1,0.0,0.4,0.25,0.2,0.6,0.6,0.6})).setSkyAngle(new double[] {1.309,1.5707}).setSkyColor(new MFColor(new double[] {0.0,0.5,1.0,0.0,0.0,1.0,0.0,0.0,1.0})).setBackUrl(new String[] {"urn:web3d:media:textures/panoramas/horizon_3_back.jpg","horizon_3_back.jpg","../../Basic/UniversalMediaPanoramas/horizon_3_back.jpg","https://www.web3d.org/WorkingGroups/media/textures/panoramas/horizon_3_back.jpg","https://www.web3d.org/x3d/content/examples/UniversalMediaPanoramas/horizon_3_back.jpg","http://www.web3dmedia.com/UniversalMedia/textures/panoramas/horizon_3_back.jpg","http://www.officetowers.com/UniversalMedia/textures/panoramas/horizon_3_back.jpg","http://geometrek.com/UniversalMedia/textures/panoramas/horizon_3_back.jpg","http://www.sc.ehu.es/ccwgamoa/UniversalMedia/textures/panoramas/horizon_3_back.jpg"}).setBottomUrl(new String[] {"urn:web3d:media:textures/panoramas/horizon_3_bottom.jpg","horizon_3_bottom.jpg","../../Basic/UniversalMediaPanoramas/horizon_3_bottom.jpg","https://www.web3d.org/WorkingGroups/media/textures/panoramas/horizon_3_bottom.jpg","https://www.web3d.org/x3d/content/examples/UniversalMediaPanoramas/horizon_3_bottom.jpg","http://www.web3dmedia.com/UniversalMedia/textures/panoramas/horizon_3_bottom.jpg","http://www.officetowers.com/UniversalMedia/textures/panoramas/horizon_3_bottom.jpg","http://geometrek.com/UniversalMedia/textures/panoramas/horizon_3_bottom.jpg","http://www.sc.ehu.es/ccwgamoa/UniversalMedia/textures/panoramas/horizon_3_bottom.jpg"}).setFrontUrl(new String[] {"urn:web3d:media:textures/panoramas/horizon_3_front.jpg","horizon_3_front.jpg","../../Basic/UniversalMediaPanoramas/horizon_3_front.jpg","https://www.web3d.org/WorkingGroups/media/textures/panoramas/horizon_3_front.jpg","https://www.web3d.org/x3d/content/examples/UniversalMediaPanoramas/horizon_3_front.jpg","http://www.web3dmedia.com/UniversalMedia/textures/panoramas/horizon_3_front.jpg","http://www.officetowers.com/UniversalMedia/textures/panoramas/horizon_3_front.jpg","http://geometrek.com/UniversalMedia/textures/panoramas/horizon_3_front.jpg","http://www.sc.ehu.es/ccwgamoa/UniversalMedia/textures/panoramas/horizon_3_front.jpg"}).setLeftUrl(new String[] {"urn:web3d:media:textures/panoramas/horizon_3_left.jpg","horizon_3_left.jpg","../../Basic/UniversalMediaPanoramas/horizon_3_left.jpg","https://www.web3d.org/WorkingGroups/media/textures/panoramas/horizon_3_left.jpg","https://www.web3d.org/x3d/content/examples/UniversalMediaPanoramas/horizon_3_left.jpg","http://www.web3dmedia.com/UniversalMedia/textures/panoramas/horizon_3_left.jpg","http://www.officetowers.com/UniversalMedia/textures/panoramas/horizon_3_left.jpg","http://geometrek.com/UniversalMedia/textures/panoramas/horizon_3_left.jpg","http://www.sc.ehu.es/ccwgamoa/UniversalMedia/textures/panoramas/horizon_3_left.jpg"}).setRightUrl(new String[] {"urn:web3d:media:textures/panoramas/horizon_3_right.jpg","horizon_3_right.jpg","../../Basic/UniversalMediaPanoramas/horizon_3_right.jpg","https://www.web3d.org/WorkingGroups/media/textures/panoramas/horizon_3_right.jpg","https://www.web3d.org/x3d/content/examples/UniversalMediaPanoramas/horizon_3_right.jpg","http://www.web3dmedia.com/UniversalMedia/textures/panoramas/horizon_3_right.jpg","http://www.officetowers.com/UniversalMedia/textures/panoramas/horizon_3_right.jpg","http://geometrek.com/UniversalMedia/textures/panoramas/horizon_3_right.jpg","http://www.sc.ehu.es/ccwgamoa/UniversalMedia/textures/panoramas/horizon_3_right.jpg"}).setTopUrl(new String[] {"urn:web3d:media:textures/panoramas/horizon_3_top.jpg","horizon_3_top.jpg","../../Basic/UniversalMediaPanoramas/horizon_3_top.jpg","https://www.web3d.org/WorkingGroups/media/textures/panoramas/horizon_3_top.jpg","https://www.web3d.org/x3d/content/examples/UniversalMediaPanoramas/horizon_3_top.jpg","http://www.web3dmedia.com/UniversalMedia/textures/panoramas/horizon_3_top.jpg","http://www.officetowers.com/UniversalMedia/textures/panoramas/horizon_3_top.jpg","http://geometrek.com/UniversalMedia/textures/panoramas/horizon_3_top.jpg","http://www.sc.ehu.es/ccwgamoa/UniversalMedia/textures/panoramas/horizon_3_top.jpg"}))
    .addChild(new Switch().setWhichChoice(-1)
      .addChild(new Transform("HudContent").setTranslation(-0.5,-0.5,.1)
        .addChild(new ProtoInstance("TextString", "TopLabel").setContainerField("children")
          .addFieldValue(new fieldValue().setName("offset").setValue(new SFVec3f(-0.07,-.2,0.0)))
          .addFieldValue(new fieldValue().setName("string").setValue(new String[] {"Position: "}))
          .addFieldValue(new fieldValue().setName("color").setValue(new SFColor(0.0,0.0,0.0)))
          .addFieldValue(new fieldValue().setName("size").setValue(.1)))
        .addChild(new ProtoInstance("TextString", "BottomLabel").setContainerField("children")
          .addFieldValue(new fieldValue().setName("offset").setValue(new SFVec3f(-0.13,-.3,0.0)))
          .addFieldValue(new fieldValue().setName("string").setValue(new String[] {"Orientation: "}))
          .addFieldValue(new fieldValue().setName("color").setValue(new SFColor(0.0,0.0,0.0)))
          .addFieldValue(new fieldValue().setName("size").setValue(.1)))
        .addChild(new ProtoInstance("TextString", "TopLine").setContainerField("children")
          .addFieldValue(new fieldValue().setName("offset").setValue(new SFVec3f(.5,-.2,0.0)))
          .addFieldValue(new fieldValue().setName("string").setValue(new String[] {""}))
          .addFieldValue(new fieldValue().setName("color").setValue(new SFColor(0.0,0.0,1.0)))
          .addFieldValue(new fieldValue().setName("size").setValue(.1)))
        .addChild(new ProtoInstance("TextString", "BottomLine").setContainerField("children")
          .addFieldValue(new fieldValue().setName("offset").setValue(new SFVec3f(.5,-.3,0.0)))
          .addFieldValue(new fieldValue().setName("string").setValue(new String[] {"0 1 0 0"}))
          .addFieldValue(new fieldValue().setName("color").setValue(new SFColor(0.1,.7,0.1)))
          .addFieldValue(new fieldValue().setName("size").setValue(.1)))
        .addChild(new Transform().setTranslation(0.27,-0.25,-0.1)
          .addChild(new Shape()
            .setGeometry(new Box().setSize(1.4,0.25,0.01))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.9,0.9,0.9).setTransparency(0.5)))))))
    .addChild(new ProtoInstance("HeadsUpDisplay", "HeadsUpDisplayInstance").setContainerField("children")
      .addFieldValue(new fieldValue().setName("screenOffset").setValue(new SFVec3f(0.2,0.5,-2.0)))
      .addFieldValue(new fieldValue().setName("children")
        .addChild(new Transform().setUSE("HudContent"))))
    .addChild(new Script("ConvertValueScript").setUrl(new String[] {"HudKelpForestScriptConvert.js","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/HudKelpForestScriptConvert.js"})
      .addField(new field().setName("sfVec3f").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addField(new field().setName("sfRotation").setType(field.TYPE_SFROTATION).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addField(new field().setName("sfVec3fString").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
      .addField(new field().setName("sfRotationString").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_OUTPUTONLY)))
    .addChild(new ROUTE().setFromNode("HeadsUpDisplayInstance").setFromField("position_changed").setToNode("ConvertValueScript").setToField("sfVec3f"))
    .addChild(new ROUTE().setFromNode("HeadsUpDisplayInstance").setFromField("orientation_changed").setToNode("ConvertValueScript").setToField("sfRotation"))
    .addChild(new ROUTE().setFromNode("ConvertValueScript").setFromField("sfVec3fString").setToNode("TopLine").setToField("string"))
    .addChild(new ROUTE().setFromNode("ConvertValueScript").setFromField("sfRotationString").setToNode("BottomLine").setToField("string"))
    .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/KelpForestMain.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestMain.x3d","../KelpForestExhibit//KelpForestMain.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestMain.wrl"})));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return HudKelpForest model
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
        X3D thisExampleX3dModel = new HudKelpForest().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter14Prototypes.HudKelpForest\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter14Prototypes.HudKelpForest\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
