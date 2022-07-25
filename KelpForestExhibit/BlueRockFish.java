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
import org.web3d.x3d.jsail.Navigation.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Create a new fish type through configuration of the CircleFishLod prototype. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/BlueRockFish.java">BlueRockFish.java</a> source, <a href="../../../KelpForestExhibit/BlueRockFishIndex.html" target="_top">BlueRockFish catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/BlueRockFish.x3d">BlueRockFish.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Create a new fish type through configuration of the CircleFishLod prototype. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Ildeniz Duman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Jeff Weekley </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 1 May 1998 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translated </i> </td>
			<td> 25 February 2001 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/BlueRockFish.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/BlueRockFish.x3d</a> </td>
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

	* @author Ildeniz Duman
 */

public class BlueRockFish
{
	/** Default constructor to create this object. */
	public BlueRockFish ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("BlueRockFish.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Create a new fish type through configuration of the CircleFishLod prototype."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Ildeniz Duman"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Jeff Weekley"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 May 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("25 February 2001"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/BlueRockFish.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("BlueRockFish.x3d"))
    .addChild(new ExternProtoDeclare("CircleFishLod").setName("CircleFishLod").setAppinfo("CircleFish prototype with LOD added").setUrl(new String[] {"CircleFishLodPrototype.x3d#CircleFishLod","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishLodPrototype.x3d#CircleFishLod","CircleFishLodPrototype.wrl#CircleFishLod","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishLodPrototype.wrl#CircleFishLod"})
      .addField(new field().setName("skinTextureUrl").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("fishScale").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("fishColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("finColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("positionKey").setType(field.TYPE_MFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("positionKeyValue").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("orientationKey").setType(field.TYPE_MFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("orientationKeyValue").setType(field.TYPE_MFROTATION).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("orbitTime").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INPUTOUTPUT)))
    .addChild(new Viewpoint().setDescription("Blue Rockfish").setPosition(-1.0,1.0,8.0))
    .addChild(new Transform()
      .addChild(new ProtoInstance("CircleFishLod", "BlueRockfish").setContainerField("children")
        .addFieldValue(new fieldValue().setName("skinTextureUrl").setValue(new String[] {"blueRockfishPatch.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/blueRockfishPatch.jpg"}))
        .addFieldValue(new fieldValue().setName("fishScale").setValue(new SFVec3f(0.5,0.53,0.2)))
        .addFieldValue(new fieldValue().setName("fishColor").setValue(new SFColor(0.2,0.6,0.8)))
        .addFieldValue(new fieldValue().setName("positionKey").setValue(new double[] {0.0,0.3,0.6,1.0}))
        .addFieldValue(new fieldValue().setName("positionKeyValue").setValue(new MFVec3f(new MFVec3f(new double[] {0.0,0.0,1.0,1.0,0.0,0.0,0.0,0.0,-1.0,0.0,0.0,1.0}))))
        .addFieldValue(new fieldValue().setName("orbitTime").setValue(60))))
    .addChild(new Transform().setRotation(0.0,1.0,0.0,1.05).setTranslation(0.0,0.5,0.0)
      .addComments(" rotation 60 degrees ")
      .addChild(new ProtoInstance("CircleFishLod", "BlueRockfish1").setContainerField("children")
        .addFieldValue(new fieldValue().setName("skinTextureUrl").setValue(new String[] {"blueRockfishPatch.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/blueRockfishPatch.jpg"}))
        .addFieldValue(new fieldValue().setName("fishScale").setValue(new SFVec3f(0.5,0.53,0.2)))
        .addFieldValue(new fieldValue().setName("fishColor").setValue(new SFColor(0.2,0.6,0.8)))
        .addFieldValue(new fieldValue().setName("positionKey").setValue(new double[] {0.0,0.3,0.6,1.0}))
        .addFieldValue(new fieldValue().setName("positionKeyValue").setValue(new MFVec3f(new MFVec3f(new double[] {0.0,0.0,1.0,1.0,0.0,0.0,0.0,0.0,-1.0,0.0,0.0,1.0}))))
        .addFieldValue(new fieldValue().setName("orbitTime").setValue(60))))
    .addChild(new Transform().setTranslation(0.0,1.5,1.0)
      .addChild(new ProtoInstance("CircleFishLod", "BlueRockfish2").setContainerField("children")
        .addFieldValue(new fieldValue().setName("skinTextureUrl").setValue(new String[] {"blueRockfishPatch.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/blueRockfishPatch.jpg"}))
        .addFieldValue(new fieldValue().setName("fishScale").setValue(new SFVec3f(0.5,0.53,0.2)))
        .addFieldValue(new fieldValue().setName("fishColor").setValue(new SFColor(0.2,0.6,0.8)))
        .addFieldValue(new fieldValue().setName("positionKey").setValue(new double[] {0.0,0.3,0.6,1.0}))
        .addFieldValue(new fieldValue().setName("positionKeyValue").setValue(new MFVec3f(new MFVec3f(new double[] {0.0,0.0,1.0,1.0,0.0,0.0,0.0,0.0,-1.0,0.0,0.0,1.0}))))
        .addFieldValue(new fieldValue().setName("orbitTime").setValue(40))))
    .addChild(new Transform().setRotation(0.0,1.0,0.0,0.78).setTranslation(-0.5,1.0,0.0)
      .addComments(" rotation 45 degrees ")
      .addChild(new ProtoInstance("CircleFishLod", "BlueRockfish3").setContainerField("children")
        .addFieldValue(new fieldValue().setName("skinTextureUrl").setValue(new String[] {"blueRockfishPatch.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/blueRockfishPatch.jpg"}))
        .addFieldValue(new fieldValue().setName("fishScale").setValue(new SFVec3f(0.5,0.53,0.2)))
        .addFieldValue(new fieldValue().setName("fishColor").setValue(new SFColor(0.2,0.6,0.8)))
        .addFieldValue(new fieldValue().setName("positionKey").setValue(new double[] {0.0,0.4,0.7,0.95,1.0}))
        .addFieldValue(new fieldValue().setName("positionKeyValue").setValue(new MFVec3f(new MFVec3f(new double[] {0.0,0.0,0.0,1.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0,0.3,0.0,0.0}))))
        .addFieldValue(new fieldValue().setName("orientationKey").setValue(new double[] {0.0,0.5,1.0}))
        .addFieldValue(new fieldValue().setName("orientationKeyValue").setValue(new MFRotation(new MFRotation(new double[] {0.0,1.0,0.0,0.0,0.0,1.0,0.0,1.57,0.0,1.0,0.0,0.0}))))
        .addFieldValue(new fieldValue().setName("orbitTime").setValue(80))))
    .addChild(new Transform().setTranslation(0.0,1.8,2.0)
      .addChild(new ProtoInstance("CircleFishLod", "BlueRockfish4").setContainerField("children")
        .addFieldValue(new fieldValue().setName("skinTextureUrl").setValue(new String[] {"blueRockfishPatch.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/blueRockfishPatch.jpg"}))
        .addFieldValue(new fieldValue().setName("fishScale").setValue(new SFVec3f(0.5,0.53,0.2)))
        .addFieldValue(new fieldValue().setName("fishColor").setValue(new SFColor(0.2,0.6,0.8)))
        .addFieldValue(new fieldValue().setName("positionKey").setValue(new double[] {0.0,0.3,0.6,1.0}))
        .addFieldValue(new fieldValue().setName("positionKeyValue").setValue(new MFVec3f(new MFVec3f(new double[] {0.0,0.0,1.0,1.0,0.0,0.0,0.0,0.0,-3.0,0.0,0.0,1.0}))))
        .addFieldValue(new fieldValue().setName("orbitTime").setValue(40)))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return BlueRockFish model
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
        X3D thisExampleX3dModel = new BlueRockFish().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.BlueRockFish\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.BlueRockFish\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
