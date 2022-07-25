package X3dForWebAuthors.Chapter05AppearanceMaterialTextures;

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
import org.web3d.x3d.jsail.Navigation.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> The Garibaldi with a PixelTexture instead of a file texture. </p>
 <p> Related links: <a href="../../../Chapter05AppearanceMaterialTextures/PixelTextureGaribaldi.java">PixelTextureGaribaldi.java</a> source, <a href="../../../Chapter05AppearanceMaterialTextures/PixelTextureGaribaldiIndex.html" target="_top">PixelTextureGaribaldi catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter05AppearanceMaterialTextures/PixelTextureGaribaldi.x3d">PixelTextureGaribaldi.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> The Garibaldi with a PixelTexture instead of a file texture. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Ildeniz Duman </td>
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
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Garibaldi.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Garibaldi.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/PixelTextureGaribaldi.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/PixelTextureGaribaldi.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter05AppearanceMaterialTextures/../license.html">../license.html</a> </td>
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

	* @author Ildeniz Duman
 */

public class PixelTextureGaribaldi
{
	/** Default constructor to create this object. */
	public PixelTextureGaribaldi ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("PixelTextureGaribaldi.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("The Garibaldi with a PixelTexture instead of a file texture."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Ildeniz Duman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 June 1998"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Garibaldi.x3d"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/PixelTextureGaribaldi.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("PixelTextureGaribaldi.x3d"))
    .addChild(new ExternProtoDeclare("CircleFishPT").setName("CircleFishPT").setUrl(new String[] {"CircleFishPTPrototype.x3d#CircleFishPT","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPTPrototype.x3d#CircleFishPT","CircleFishPTPrototype.wrl#CircleFishPT","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPTPrototype.wrl#CircleFishPT"})
      .addField(new field().setName("skinPixelTexture").setType(field.TYPE_SFIMAGE).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("fishScale").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("fishColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("finColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("positionKey").setType(field.TYPE_MFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("positionKeyValue").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("orientationKey").setType(field.TYPE_MFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("orientationKeyValue").setType(field.TYPE_MFROTATION).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("orbitTime").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INPUTOUTPUT)))
    .addChild(new ExternProtoDeclare("CircleFish").setName("CircleFish").setUrl(new String[] {"CircleFishPrototype.x3d#CircleFish","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPrototype.x3d#CircleFish","CircleFishPrototype.wrl#CircleFish","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPrototype.wrl#CircleFish"})
      .addField(new field().setName("skinTextureUrl").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("fishScale").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("fishColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("finColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("positionKey").setType(field.TYPE_MFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("positionKeyValue").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("orientationKey").setType(field.TYPE_MFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("orientationKeyValue").setType(field.TYPE_MFROTATION).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("orbitTime").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INPUTOUTPUT)))
    .addChild(new Background().setSkyColor(new MFColor(new double[] {1.0,1.0,1.0})))
    .addChild(new Viewpoint().setDescription("Book View").setOrientation(0.0,1.0,0.0,0.229).setPosition(0.62,0.03,1.28))
    .addChild(new Transform().setTranslation(-.3,.3,0.0)
      .addChild(new ProtoInstance("CircleFishPT").setContainerField("children")
        .addFieldValue(new fieldValue().setName("skinPixelTexture").setValue(new int[] {12,7,3,0xEFAA55,0xF9BD5B,0xFCC55A,0xFCC75D,0xFCC75A,0xFCC859,0xFBCB5B,0xFCCA5C,0xFDCF5E,0xFCD263,0xFDD76C,0xF2CD77,0xF4B356,0xF9BE58,0xFBC458,0xFBC558,0xFCC75A,0xFCCA5B,0xFCCC60,0xFDCF5C,0xFDCF5E,0xFDD05D,0xFDD15E,0xFDD060,0xF5B655,0xF9C056,0xF8BD53,0xFABE54,0xFABF53,0xFBC254,0xFBC353,0xFBC453,0xFBC555,0xFBC753,0xFBC855,0xFDCC5A,0xF9C659,0xF6BE54,0xF4B954,0xF2B651,0xF2B752,0xF5BC53,0xF6BF50,0xFAC452,0xFBC753,0xFAC551,0xF9C753,0xF5BE53,0xF1B453,0xEFB253,0xEBAB52,0xEBAA53,0xECAD50,0xF0B24F,0xF3B84E,0xF7BF51,0xF8C453,0xF9C955,0xF7C453,0xF5BB54,0xE3A152,0xDE9B53,0xDE9C55,0xE09C52,0xE5A251,0xE9A950,0xF1AD50,0xF2AD51,0xF5BA50,0xF5BF53,0xF9C455,0xF5C557,0xB07950,0xB3784F,0xBB7C4F,0xC4824F,0xD28C4E,0xE18C4E,0xE47C4A,0xE17B4C,0xDC844A,0xE5954D,0xF2B550,0xF4C354}))
        .addFieldValue(new fieldValue().setName("fishScale").setValue(new SFVec3f(1.0,0.39,0.4)))
        .addFieldValue(new fieldValue().setName("finColor").setValue(new SFColor(0.9,0.66,0.4)))
        .addFieldValue(new fieldValue().setName("fishColor").setValue(new SFColor(.97,.75,.3)))
        .addFieldValue(new fieldValue().setName("positionKey").setValue(new double[] {0.0,0.4,0.7,0.95,1.0}))
        .addFieldValue(new fieldValue().setName("positionKeyValue").setValue(new MFVec3f(new MFVec3f(new double[] {0.0,0.0,0.0,0.5,0.0,0.0,0.0,0.0,0.0,0.5,0.0,0.0,0.2,0.0,0.0}))))
        .addFieldValue(new fieldValue().setName("orientationKey").setValue(new double[] {0.0,1.0}))
        .addFieldValue(new fieldValue().setName("orientationKeyValue").setValue(new MFRotation(new MFRotation(new double[] {0.0,1.0,0.0,90.0,0.0,1.0,0.0,90.0}))))
        .addFieldValue(new fieldValue().setName("orbitTime").setValue(80.0))))
    .addChild(new Transform().setTranslation(.3,.3,0.0)
      .addChild(new ProtoInstance("CircleFishPT").setContainerField("children")
        .addFieldValue(new fieldValue().setName("skinPixelTexture").setValue(new int[] {8,8,1,0xcc,0x00,0xcc,0x00,0xcc,0x00,0xcc,0x00,0x00,0xcc,0x00,0xcc,0x00,0xcc,0x00,0xcc,0xcc,0x00,0xcc,0x00,0xcc,0x00,0xcc,0x00,0x00,0xcc,0x00,0xcc,0x00,0xcc,0x00,0xcc,0xcc,0x00,0xcc,0x00,0xcc,0x00,0xcc,0x00,0x00,0xcc,0x00,0xcc,0x00,0xcc,0x00,0xcc,0xcc,0x00,0xcc,0x00,0xcc,0x00,0xcc,0x00,0x00,0xcc,0x00,0xcc,0x00,0xcc,0x00,0xcc}))
        .addFieldValue(new fieldValue().setName("fishScale").setValue(new SFVec3f(1.0,0.39,0.4)))
        .addFieldValue(new fieldValue().setName("finColor").setValue(new SFColor(0.9,0.66,0.4)))
        .addFieldValue(new fieldValue().setName("fishColor").setValue(new SFColor(.97,.75,.3)))
        .addFieldValue(new fieldValue().setName("positionKey").setValue(new double[] {0.0,0.4,0.7,0.95,1.0}))
        .addFieldValue(new fieldValue().setName("positionKeyValue").setValue(new MFVec3f(new MFVec3f(new double[] {0.0,0.0,0.0,0.5,0.0,0.0,0.0,0.0,0.0,0.5,0.0,0.0,0.2,0.0,0.0}))))
        .addFieldValue(new fieldValue().setName("orientationKey").setValue(new double[] {0.0,1.0}))
        .addFieldValue(new fieldValue().setName("orientationKeyValue").setValue(new MFRotation(new MFRotation(new double[] {0.0,1.0,0.0,90.0,0.0,1.0,0.0,90.0}))))
        .addFieldValue(new fieldValue().setName("orbitTime").setValue(80.0))))
    .addChild(new Transform().setTranslation(-.3,-.3,0.0)
      .addChild(new ProtoInstance("CircleFishPT").setContainerField("children")
        .addFieldValue(new fieldValue().setName("skinPixelTexture").setValue(new int[] {2,4,3,0xff0000,0xffff00,0x007700,0xff0077,0x0000ff,0xff7700,0x00ff77,0x888888}))
        .addFieldValue(new fieldValue().setName("fishScale").setValue(new SFVec3f(1.0,0.39,0.4)))
        .addFieldValue(new fieldValue().setName("finColor").setValue(new SFColor(0.9,0.66,0.4)))
        .addFieldValue(new fieldValue().setName("fishColor").setValue(new SFColor(.97,.75,.3)))
        .addFieldValue(new fieldValue().setName("positionKey").setValue(new double[] {0.0,0.4,0.7,0.95,1.0}))
        .addFieldValue(new fieldValue().setName("positionKeyValue").setValue(new MFVec3f(new MFVec3f(new double[] {0.0,0.0,0.0,0.5,0.0,0.0,0.0,0.0,0.0,0.5,0.0,0.0,0.2,0.0,0.0}))))
        .addFieldValue(new fieldValue().setName("orientationKey").setValue(new double[] {0.0,1.0}))
        .addFieldValue(new fieldValue().setName("orientationKeyValue").setValue(new MFRotation(new MFRotation(new double[] {0.0,1.0,0.0,90.0,0.0,1.0,0.0,90.0}))))
        .addFieldValue(new fieldValue().setName("orbitTime").setValue(80.0))))
    .addChild(new Transform().setTranslation(.3,-.3,0.0)
      .addChild(new ProtoInstance("CircleFish").setContainerField("children")
        .addFieldValue(new fieldValue().setName("skinTextureUrl").setValue(new String[] {"GaribaldiPatch.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/GaribaldiPatch.jpg"}))
        .addFieldValue(new fieldValue().setName("fishScale").setValue(new SFVec3f(1.0,0.39,0.4)))
        .addFieldValue(new fieldValue().setName("finColor").setValue(new SFColor(0.9,0.66,0.4)))
        .addFieldValue(new fieldValue().setName("fishColor").setValue(new SFColor(.97,.75,.3)))
        .addFieldValue(new fieldValue().setName("positionKey").setValue(new double[] {0.0,0.4,0.7,0.95,1.0}))
        .addFieldValue(new fieldValue().setName("positionKeyValue").setValue(new MFVec3f(new MFVec3f(new double[] {0.0,0.0,0.0,0.5,0.0,0.0,0.0,0.0,0.0,0.5,0.0,0.0,0.2,0.0,0.0}))))
        .addFieldValue(new fieldValue().setName("orientationKey").setValue(new double[] {0.0,1.0}))
        .addFieldValue(new fieldValue().setName("orientationKeyValue").setValue(new MFRotation(new MFRotation(new double[] {0.0,1.0,0.0,90.0,0.0,1.0,0.0,90.0}))))
        .addFieldValue(new fieldValue().setName("orbitTime").setValue(80.0)))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return PixelTextureGaribaldi model
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
        X3D thisExampleX3dModel = new PixelTextureGaribaldi().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter05AppearanceMaterialTextures.PixelTextureGaribaldi\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter05AppearanceMaterialTextures.PixelTextureGaribaldi\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
