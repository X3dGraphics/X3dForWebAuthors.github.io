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
import org.web3d.x3d.jsail.EnvironmentalEffects.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Sound.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Provide a test scene for sound files using various audio formats. </p>
 <p> Related links: <a href="../../../Chapter12EnvironmentSensorSound/SoundFileFormats.java">SoundFileFormats.java</a> source, <a href="../../../Chapter12EnvironmentSensorSound/SoundFileFormatsIndex.html" target="_top">SoundFileFormats catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter12EnvironmentSensorSound/SoundFileFormats.x3d">SoundFileFormats.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Provide a test scene for sound files using various audio formats. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 10 November 2013 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter12EnvironmentSensorSound/SoundFileFormats.png">SoundFileFormats.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Sound </i> </td>
			<td> <a href="../../../Chapter12EnvironmentSensorSound/audio/Testing123stereo.wav">audio/Testing123stereo.wav</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Sound </i> </td>
			<td> <a href="../../../Chapter12EnvironmentSensorSound/audio/Testing123stereo.aiff">audio/Testing123stereo.aiff</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Sound </i> </td>
			<td> <a href="../../../Chapter12EnvironmentSensorSound/audio/Testing123stereo.mp3">audio/Testing123stereo.mp3</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Sound </i> </td>
			<td> <a href="../../../Chapter12EnvironmentSensorSound/audio/Testing123original.wav">audio/Testing123original.wav</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Sound </i> </td>
			<td> Reunion by Marc Sabatella, distributed with MuseScore </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Sound </i> </td>
			<td> <a href="../../../Chapter12EnvironmentSensorSound/audio/Reunion_Example.mid">audio/Reunion_Example.mid</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> requires </i> </td>
			<td> File type requirements, <a href="https://www.web3d.org/files/specifications/19775-1/V3.3/Part01/components/sound.html#AudioClip" target="_blank">https://www.web3d.org/files/specifications/19775-1/V3.3/Part01/components/sound.html#AudioClip</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D audio formats test </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/SoundFileFormats.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/SoundFileFormats.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> ZOOM H2next Handy Recorder, <a href="http://www.zoom.co.jp/products/h2n" target="_blank">http://www.zoom.co.jp/products/h2n</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> Audacity, <a href="http://audacity.sourceforge.net" target="_blank">http://audacity.sourceforge.net</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> MuseScore, <a href="http://musescore.org" target="_blank">http://musescore.org</a> </td>
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

public class SoundFileFormats
{
	/** Default constructor to create this object. */
	public SoundFileFormats ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("SoundFileFormats.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Provide a test scene for sound files using various audio formats."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("10 November 2013"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("SoundFileFormats.png"))
    .addMeta(new meta().setName(meta.NAME_SOUND      ).setContent("audio/Testing123stereo.wav"))
    .addMeta(new meta().setName(meta.NAME_SOUND      ).setContent("audio/Testing123stereo.aiff"))
    .addMeta(new meta().setName(meta.NAME_SOUND      ).setContent("audio/Testing123stereo.mp3"))
    .addMeta(new meta().setName(meta.NAME_SOUND      ).setContent("audio/Testing123original.wav"))
    .addMeta(new meta().setName(meta.NAME_SOUND      ).setContent("Reunion by Marc Sabatella, distributed with MuseScore"))
    .addMeta(new meta().setName(meta.NAME_SOUND      ).setContent("audio/Reunion_Example.mid"))
    .addMeta(new meta().setName(meta.NAME_REQUIRES   ).setContent("File type requirements, https://www.web3d.org/files/specifications/19775-1/V3.3/Part01/components/sound.html#AudioClip"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D audio formats test"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/SoundFileFormats.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("ZOOM H2next Handy Recorder, http://www.zoom.co.jp/products/h2n"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Audacity, http://audacity.sourceforge.net"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("MuseScore, http://musescore.org"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("SoundFileFormats.x3d"))
    .addChild(new Background().setSkyColor(new MFColor(new double[] {0.2,0.2,0.2})))
    .addComments(" ============================================================ ")
    .addChild(new Transform("WavPlay").setScale(0.4,0.4,0.4).setTranslation(-4.0,0.5,0.0)
      .addChild(new TouchSensor("WavTextClickedSensor").setDescription("Play file via Sound/AudioClip: Testing123stereo.wav"))
      .addChild(new Sound().setMaxBack(100).setMaxFront(100).setMinBack(20).setMinFront(20)
        .addComments(" Make sure the sound source AudioClip is audible at the user location ")
        .setSource(new AudioClip("Testing123stereoWavAudioClip").setDescription("Playing Testing123stereo.wav").setUrl(new String[] {"audio/Testing123stereo.wav","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Testing123stereo.wav"})))
      .addChild(new ROUTE().setFromNode("WavTextClickedSensor").setFromField("touchTime").setToNode("Testing123stereoWavAudioClip").setToField("startTime"))
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Testing123stereo.wav"})
          .setFontStyle(new FontStyle("MessageFont").setFamily(new String[] {"SANS"}).setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setCssStyle("BOLD")))
        .setAppearance(new Appearance("GreenAppearance")
          .setMaterial(new Material().setDiffuseColor(0.0,1.0,0.0))))
      .addChild(new Transform("TextClickSurface").setScale(5.0,0.5,1.0).setTranslation(0.0,0.3,0.0)
        .addChild(new Shape()
          .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,1,2,3,-1})
            .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {1.0,1.0,0.0,1.0,-1.0,0.0,-1.0,-1.0,0.0,-1.0,1.0,0.0}))))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setTransparency(1))))))
    .addChild(new Transform("WavLaunch").setScale(0.4,0.4,0.4).setTranslation(-4.0,-0.1,0.0)
      .addChild(new Anchor().setDescription("Launch audio file in Web browser: Testing123stereo.wav").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"audio/Testing123stereo.wav","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Testing123stereo.wav"})
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"(launch)"})
            .setFontStyle(new FontStyle().setUSE("MessageFont")))
          .setAppearance(new Appearance().setUSE("GreenAppearance")))
        .addChild(new Transform().setUSE("TextClickSurface"))))
    .addComments(" ============================================================ ")
    .addChild(new Transform("Mp3Play").setScale(0.4,0.4,0.4).setTranslation(0.0,0.5,0.0)
      .addChild(new TouchSensor("Mp3TextClickedSensor").setDescription("Play file via Sound/AudioClip: Testing123stereo.mp3"))
      .addChild(new Sound().setMaxBack(100).setMaxFront(100).setMinBack(20).setMinFront(20)
        .setSource(new AudioClip("Testing123stereoMp3AudioClip").setDescription("Play file via Sound/AudioClip: Testing123stereo.mp3").setUrl(new String[] {"audio/Testing123stereo.mp3","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Testing123stereo.mp3"})))
      .addChild(new ROUTE().setFromNode("Mp3TextClickedSensor").setFromField("touchTime").setToNode("Testing123stereoMp3AudioClip").setToField("startTime"))
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Testing123stereo.mp3"})
          .setFontStyle(new FontStyle().setUSE("MessageFont")))
        .setAppearance(new Appearance("TurquoiseAppearance")
          .setMaterial(new Material().setDiffuseColor(0.156863,0.878431,0.815686))))
      .addChild(new Transform().setUSE("TextClickSurface")))
    .addChild(new Transform("Mp3Launch").setScale(0.4,0.4,0.4).setTranslation(0.0,-0.1,0.0)
      .addChild(new Anchor().setDescription("Launch audio file in Web browser: Testing123stereo.mp3").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"audio/Testing123stereo.mp3","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Testing123stereo.mp3"})
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"(launch)"})
            .setFontStyle(new FontStyle().setUSE("MessageFont")))
          .setAppearance(new Appearance().setUSE("TurquoiseAppearance")))
        .addChild(new Transform().setUSE("TextClickSurface"))))
    .addComments(" ============================================================ ")
    .addChild(new Transform("MidiPlay").setScale(0.4,0.4,0.4).setTranslation(0.0,-2.0,0.0)
      .addChild(new TouchSensor("MidiTextClickedSensor").setDescription("Play file via Sound/AudioClip: Reunion_Example.mid"))
      .addChild(new Sound().setMaxBack(100).setMaxFront(100).setMinBack(20).setMinFront(20)
        .setSource(new AudioClip("Testing123stereoMidiAudioClip").setDescription("Play file via Sound/AudioClip: Reunion_Example.mid").setUrl(new String[] {"audio/Reunion_Example.mid","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Reunion_Example.mid"})))
      .addChild(new ROUTE().setFromNode("MidiTextClickedSensor").setFromField("touchTime").setToNode("Testing123stereoMidiAudioClip").setToField("startTime"))
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Reunion_Example.mid"})
          .setFontStyle(new FontStyle().setUSE("MessageFont")))
        .setAppearance(new Appearance().setUSE("TurquoiseAppearance")))
      .addChild(new Transform().setUSE("TextClickSurface")))
    .addChild(new Transform("MidiLaunch").setScale(0.4,0.4,0.4).setTranslation(0.0,-2.6,0.0)
      .addChild(new Anchor().setDescription("Launch audio file in Web browser: Reunion_Example.mid").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"audio/Reunion_Example.mid","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Reunion_Example.mid"})
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"(launch)"})
            .setFontStyle(new FontStyle().setUSE("MessageFont")))
          .setAppearance(new Appearance().setUSE("TurquoiseAppearance")))
        .addChild(new Transform().setUSE("TextClickSurface"))))
    .addComments(" ============================================================ ")
    .addChild(new Transform("AiffPlay").setScale(0.4,0.4,0.4).setTranslation(4.0,0.5,0.0)
      .addChild(new TouchSensor("AiffTextClickedSensor").setDescription("Play file via Sound/AudioClip: Testing123stereo.aiff"))
      .addChild(new Sound().setMaxBack(100).setMaxFront(100).setMinBack(20).setMinFront(20)
        .setSource(new AudioClip("Testing123stereoAiffAudioClip").setDescription("Play file via Sound/AudioClip: Testing123stereo.aiff").setUrl(new String[] {"audio/Testing123stereo.aiff","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Testing123stereo.aiff"})))
      .addChild(new ROUTE().setFromNode("AiffTextClickedSensor").setFromField("touchTime").setToNode("Testing123stereoAiffAudioClip").setToField("startTime"))
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Testing123stereo.aiff"})
          .setFontStyle(new FontStyle().setUSE("MessageFont")))
        .setAppearance(new Appearance("AmberAppearance")
          .setMaterial(new Material().setDiffuseColor(1.0,0.760784,0.0))))
      .addChild(new Transform().setUSE("TextClickSurface")))
    .addChild(new Transform("AiffLaunch").setScale(0.4,0.4,0.4).setTranslation(4.0,-0.1,0.0)
      .addChild(new Anchor().setDescription("Launch audio file in Web browser: Testing123stereo.aiff").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"audio/Testing123stereo.aiff","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/audio/Testing123stereo.aiff"})
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"(launch)"})
            .setFontStyle(new FontStyle().setUSE("MessageFont")))
          .setAppearance(new Appearance().setUSE("AmberAppearance")))
        .addChild(new Transform().setUSE("TextClickSurface"))))
    .addComments(" ============================================================ ")
    .addChild(new Transform("HeaderBox").setTranslation(0.0,2.0,-0.1)
      .addChild(new Shape()
        .setGeometry(new Box().setSize(12.0,1.0,0.1))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(1.0,1.0,1.0).setTransparency(0.75)))))
    .addChild(new Transform("WavRequired").setScale(0.4,0.4,0.4).setTranslation(-4.0,2.0,0.0)
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Required Support"})
          .setFontStyle(new FontStyle().setUSE("MessageFont")))
        .setAppearance(new Appearance().setUSE("GreenAppearance"))))
    .addChild(new Transform("Mp3Recommended").setScale(0.4,0.4,0.4).setTranslation(0.0,2.0,0.0)
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Recommended Support"})
          .setFontStyle(new FontStyle().setUSE("MessageFont")))
        .setAppearance(new Appearance().setUSE("TurquoiseAppearance"))))
    .addChild(new Transform("AiffOptional").setScale(0.4,0.4,0.4).setTranslation(4.0,2.0,0.0)
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"Optional Support"})
          .setFontStyle(new FontStyle().setUSE("MessageFont")))
        .setAppearance(new Appearance().setUSE("AmberAppearance")))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return SoundFileFormats model
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
        X3D thisExampleX3dModel = new SoundFileFormats().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter12EnvironmentSensorSound.SoundFileFormats\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter12EnvironmentSensorSound.SoundFileFormats\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
