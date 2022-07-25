package X3dForWebAuthors.Chapter12EnvironmentSensorSound;

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
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Sound.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> An example of the Sound and AudioClip node showing the effect of the various volume regions. </p>
 <p> Related links: <a href="../../../Chapter12EnvironmentSensorSound/SoundAudioClip.java">SoundAudioClip.java</a> source, <a href="../../../Chapter12EnvironmentSensorSound/SoundAudioClipIndex.html" target="_top">SoundAudioClip catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter12EnvironmentSensorSound/SoundAudioClip.x3d">SoundAudioClip.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> An example of the Sound and AudioClip node showing the effect of the various volume regions </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 1 May 2006 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 13 May 2020 </td>
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
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
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
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/SoundAudioClip.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/SoundAudioClip.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter12EnvironmentSensorSound/../license.html">../license.html</a> </td>
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

public class SoundAudioClip
{
	/** Default constructor to create this object. */
	public SoundAudioClip ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("SoundAudioClip.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("An example of the Sound and AudioClip node showing the effect of the various volume regions"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 May 2006"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("13 May 2020"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_RIGHTS     ).setContent("Copyright 2006, Daly Realism and Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/SoundAudioClip.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("SoundAudioClip.x3d"))
    .addChild(new Viewpoint().setDescription("Sound spheroid approximating ellipsoid volume").setOrientation(1.0,0.0,0.0,-0.2).setPosition(0.0,40.0,200.0))
    .addChild(new Viewpoint().setDescription("100m distant").setOrientation(1.0,0.0,0.0,-0.2).setPosition(0.0,20.0,100.0))
    .addChild(new Viewpoint().setDescription("50m distant").setOrientation(1.0,0.0,0.0,-0.2).setPosition(0.0,10.0,50.0))
    .addChild(new Viewpoint().setDescription("25m distant").setOrientation(1.0,0.0,0.0,-0.2).setPosition(0.0,5.0,25.0))
    .addChild(new Viewpoint().setDescription("10m distant").setOrientation(1.0,0.0,0.0,-0.2).setPosition(0.0,2.0,10.0))
    .addChild(new Viewpoint().setDescription("center").setOrientation(0.0,1.0,0.0,-1.57).setPosition(0.0,2.0,0.0))
    .addChild(new NavigationInfo().setSpeed(10).setType("\"WALK\" \"ANY\""))
    .addComments(" Sound node is positioned and oriented in local coordinate reference frame of scene graph at origin of sound ")
    .addComments(" Sound location y-value is 1.6 in order to match typical avatar height (in meters) ")
    .addChild(new Sound("Audible").setLocation(0.0,1.6,0.0).setMaxBack(20).setMaxFront(100).setMinBack(10).setMinFront(10).setPriority(1)
      .setSource(new AudioClip("WaterSounds").setDescription("Running Water").setLoop(true).setUrl(new String[] {"aqua.wav","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/aqua.wav"})))
    .addComments(" minWidth = sqrt (minBack * minFront) = 10 ")
    .addComments(" maxWidth = sqrt (maxBack * maxFront) = 45 ")
    .addComments(" Approximate ellipsoidal footprints and envelope using Cylinders and Spheres, respectively ")
    .addComments(" Minimum attenuation parameters 10, 10, 10 produce a Cylinder and Sphere with uniform scale ")
    .addChild(new Transform("minShapes").setScale(10.0,10.0,10.0)
      .addChild(new Shape()
        .setGeometry(new Cylinder().setHeight(0.05))
        .setAppearance(new Appearance()
          .setMaterial(new Material("MinFootprintMaterial").setDiffuseColor(0.8,0.0,0.0))))
      .addChild(new Collision().setEnabled(false)
        .addChild(new Shape()
          .setGeometry(new Sphere())
          .setAppearance(new Appearance()
            .setMaterial(new Material("MinSpheroidMaterial").setDiffuseColor(0.8,0.0,0.0).setTransparency(0.5))))))
    .addComments(" Maximum attenuation parameters 20, 100, 45 produce a Cylinder and Sphere with non-uniform scale ")
    .addComments(" Sound direction is x axis, so maximum-attenuation length = (100 + 20) = 120 and radius = 120 / 2 = 60 along x axis ")
    .addComments(" and so width, height dimensions ~= maximum-attenuation halfwidth = maxWidth ~= 45 along y, z axes ")
    .addComments(" Ellipsoid focus is (0 0 0) but geometric center of spheroidal approximation is (-maxBack + x radius) = (-20 + 60) = 40 along x axis ")
    .addChild(new Transform("maxShapes").setScale(60.0,45.0,45.0).setTranslation(40.0,0.0,0.0)
      .addChild(new Shape()
        .setGeometry(new Cylinder().setHeight(0.002))
        .setAppearance(new Appearance()
          .setMaterial(new Material("MaxFootprintMaterial").setDiffuseColor(1.0,0.894118,0.341176))))
      .addChild(new Collision().setEnabled(false)
        .addChild(new Shape()
          .setGeometry(new Sphere())
          .setAppearance(new Appearance()
            .setMaterial(new Material("MaxSpheroidMaterial").setDiffuseColor(1.0,0.5,0.0).setTransparency(0.75))))))
    .addComments(" Author-assist prototype from Savage X3D model archive ")
    .addChild(new ExternProtoDeclare("GridXZ").setName("GridXZ").setUrl(new String[] {"../../Savage/Tools/Authoring/GridXZPrototype.x3d#GridXZ","https://savage.nps.edu/Savage/Tools/Authoring/GridXZPrototype.x3d#GridXZ","../../Savage/Tools/Authoring/GridXZPrototype.wrl#GridXZ","https://savage.nps.edu/Savage/Tools/Authoring/GridXZPrototype.wrl#GridXZ"})
      .addField(new field().setName("description").setType(field.TYPE_SFSTRING).setAccessType(field.ACCESSTYPE_INITIALIZEONLY))
      .addField(new field().setName("labelColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("scale").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("default unscaled size: 10m by 10m"))
      .addField(new field().setName("labelsOffset").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("label location offset (in meters) to improve readability"))
      .addField(new field().setName("originLabel").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("WestLabel").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("-Z axis"))
      .addField(new field().setName("NorthWestLabel").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("NorthLabel").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("+X axis"))
      .addField(new field().setName("NorthEastLabel").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("EastLabel").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("+Z axis"))
      .addField(new field().setName("SouthEastLabel").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTOUTPUT))
      .addField(new field().setName("SouthLabel").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("-X axis"))
      .addField(new field().setName("SouthWestLabel").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_INPUTOUTPUT)))
    .addComments(" default values scaled up by factor of 10 in this instance ")
    .addChild(new ProtoInstance("GridXZ").setContainerField("children")
      .addFieldValue(new fieldValue().setName("description").setValue("GridXZ"))
      .addFieldValue(new fieldValue().setName("labelColor").setValue(new SFColor(1.0,1.0,1.0)))
      .addFieldValue(new fieldValue().setName("scale").setValue(new SFVec3f(10.0,10.0,10.0)))
      .addFieldValue(new fieldValue().setName("labelsOffset").setValue(new SFVec3f(0.0,-0.5,0.0)))
      .addFieldValue(new fieldValue().setName("originLabel").setValue(new String[] {"origin","0 0 0"}))
      .addFieldValue(new fieldValue().setName("NorthLabel").setValue(new String[] {"North","-Z"}))
      .addFieldValue(new fieldValue().setName("NorthEastLabel").setValue(new String[] {"100 0 -100"}))
      .addFieldValue(new fieldValue().setName("EastLabel").setValue(new String[] {"East","+X"}))
      .addFieldValue(new fieldValue().setName("SouthEastLabel").setValue(new String[] {"100 0 100"}))
      .addFieldValue(new fieldValue().setName("SouthLabel").setValue(new String[] {"South","+Z"}))
      .addFieldValue(new fieldValue().setName("SouthWestLabel").setValue(new String[] {"-100 0 100"}))
      .addFieldValue(new fieldValue().setName("WestLabel").setValue(new String[] {"West","-X"}))
      .addFieldValue(new fieldValue().setName("NorthWestLabel").setValue(new String[] {"-100 0 -100"}))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return SoundAudioClip model
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
        X3D thisExampleX3dModel = new SoundAudioClip().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter12EnvironmentSensorSound.SoundAudioClip\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter12EnvironmentSensorSound.SoundAudioClip\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
