package X3dForWebAuthors.Chapter11LightingEnvironmentalEffects;

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
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Added fog to the KelpForest world to simulate the typical weather pattern in June in Monterey, CA. </p>
 <p> Related links: <a href="../../../Chapter11LightingEnvironmentalEffects/FogKelpForestMain.java">FogKelpForestMain.java</a> source, <a href="../../../Chapter11LightingEnvironmentalEffects/FogKelpForestMainIndex.html" target="_top">FogKelpForestMain catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter11LightingEnvironmentalEffects/FogKelpForestMain.x3d">FogKelpForestMain.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Added fog to the KelpForest world to simulate the typical weather pattern in June in Monterey, CA. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman Revised: Leonard Daly for X3D Book </td>
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
			<td> <a href="http://faculty.nps.edu/brutzman/kelp" target="_blank">http://faculty.nps.edu/brutzman/kelp</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://faculty.nps.edu/brutzman/kelp/KelpForestDesignPaper.pdf" target="_blank">http://faculty.nps.edu/brutzman/kelp/KelpForestDesignPaper.pdf</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> Kelp Forest 3D models </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> accessRights </i> </td>
			<td> All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestMain.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestMain.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/FogKelpForestMain.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/FogKelpForestMain.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter11LightingEnvironmentalEffects/../license.html">../license.html</a> </td>
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

	* @author Don Brutzman Revised: Leonard Daly for X3D Book
 */

public class FogKelpForestMain
{
	/** Default constructor to create this object. */
	public FogKelpForestMain ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("FogKelpForestMain.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Added fog to the KelpForest world to simulate the typical weather pattern in June in Monterey, CA."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman Revised: Leonard Daly for X3D Book"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 June 1998"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://faculty.nps.edu/brutzman/kelp"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://faculty.nps.edu/brutzman/kelp/KelpForestDesignPaper.pdf"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("Kelp Forest 3D models"))
    .addMeta(new meta().setName(meta.NAME_ACCESSRIGHTS).setContent("All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute."))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestMain.x3d"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/FogKelpForestMain.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new Fog().setColor(.8,.8,.8).setVisibilityRange(60))
    .addChild(new WorldInfo().setInfo(new String[] {"kelpForestMain3.4.wrl","Model of the Monterey Bay Aquarium Kelp Forest","DTG of last updated: 111500Jun98","Updated: kelpTank2.9.wrl; ","Created by Naval Postgraduate School students under the supervision of Don Brutzman","Feel free to copy anything you wish - just give credit where it is due","http://faculty.nps.edu/brutzman/kelp"}).setTitle("NPS Virtual Kelp Forest Exhibit"))
    .addChild(new NavigationInfo().setSpeed(3.0))
    .addChild(new ExternProtoDeclare("ViewPositionOrientation").setName("ViewPositionOrientation").setAppinfo("ViewPositionOrientation prototype provides local position and orientation as user navigates with optional console output").setUrl(new String[] {"../../Savage/Tools/Authoring/ViewPositionOrientationPrototype.x3d#ViewPositionOrientation","https://savage.nps.edu/Savage/Tools/Authoring/ViewPositionOrientationPrototype.x3d#ViewPositionOrientation","../../Savage/Tools/Authoring//ViewPositionOrientationPrototype.wrl#ViewPositionOrientation","https://savage.nps.edu/Savage/Tools/Authoring/ViewPositionOrientationPrototype.wrl#ViewPositionOrientation"})
      .addField(new field().setName("enabled").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("Whether or not ViewPositionOrientation sends output to console."))
      .addField(new field().setName("traceEnabled").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Output internal trace messages for debugging this node - developer use only can be ignored."))
      .addField(new field().setName("set_traceEnabled").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Ability to turn output tracing on/off at runtime."))
      .addField(new field().setName("position_changed").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_OUTPUTONLY).setAppinfo("Output local position."))
      .addField(new field().setName("orientation_changed").setType(field.TYPE_SFROTATION).setAccessType(field.ACCESSTYPE_OUTPUTONLY).setAppinfo("Output local orientation."))
      .addField(new field().setName("outputViewpointString").setType(field.TYPE_MFSTRING).setAccessType(field.ACCESSTYPE_OUTPUTONLY).setAppinfo("MFString value of new Viewpoint for example: <Viewpoint position=\"20 15 20\" orientation=\"-0.516 0.83 0.212 0.9195\"/>")))
    .addChild(new ProtoInstance("ViewPositionOrientation").setContainerField("children")
      .addFieldValue(new fieldValue().setName("enabled").setValue(false)))
    .addChild(new ExternProtoDeclare("WaypointInterpolator").setName("WaypointInterpolator").setAppinfo("Reads waypoints and legSpeeds/legDurations/defaultSpeed to provide a customizable position/orientation interpolator.").setUrl(new String[] {"../../../Savage/Tools/Animation/WaypointInterpolatorPrototype.x3d#WaypointInterpolator","https://savage.nps.edu/Savage/Tools/Animation/WaypointInterpolatorPrototype.x3d#WaypointInterpolator","../../../Savage/Tools/Animation/WaypointInterpolatorPrototype.wrl#WaypointInterpolator","https://savage.nps.edu/Savage/Tools/Animation/WaypointInterpolatorPrototype.wrl#WaypointInterpolator"})
      .addComments(" Priority of use: legSpeeds (m/sec), legDurations (seconds), defaultSpeed (m/sec) ")
      .addField(new field().setName("description").setType(field.TYPE_SFSTRING).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Short description of what is animated by this WaypointInterpolator."))
      .addField(new field().setName("waypoints").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Waypoints being traversed with interpolation of intermediate positions and orientations."))
      .addField(new field().setName("add_waypoint").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Add another single waypoint to array of waypoints recalculate interpolator values."))
      .addField(new field().setName("set_waypoints").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("Replace all waypoints recalculate interpolator values."))
      .addField(new field().setName("pitchUpDownForVerticalWaypoints").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Whether to pitch child geometry (such as a vehicle) up or down to match vertical slope"))
      .addField(new field().setName("legSpeeds").setType(field.TYPE_MFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Units m/sec. If used array lengths for legSpeeds and legDurations must be one less than number of waypoints."))
      .addField(new field().setName("legDurations").setType(field.TYPE_MFTIME).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Units in seconds. If used array lengths for legSpeeds and legDurations must be one less than number of waypoints."))
      .addField(new field().setName("defaultSpeed").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Units m/sec."))
      .addField(new field().setName("turningRate").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("turningRate (degrees/second) also determines standoff distance prior to waypoint where turn commences. If 0 turns are instantaneous."))
      .addField(new field().setName("totalDuration").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_OUTPUTONLY).setAppinfo("Output calculation summing all leg durations, useful for setting TimeSensor cycleInterval. Units in seconds."))
      .addComments(" interpolation fields ")
      .addField(new field().setName("set_fraction").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("exposed PositionInterpolator and OrientationInterpolator setting"))
      .addField(new field().setName("position_changed").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_OUTPUTONLY).setAppinfo("exposed PositionInterpolator setting"))
      .addField(new field().setName("orientation_changed").setType(field.TYPE_SFROTATION).setAccessType(field.ACCESSTYPE_OUTPUTONLY).setAppinfo("exposed OrientationInterpolator setting"))
      .addComments(" display-related fields ")
      .addField(new field().setName("lineColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("default color for non-active line segments"))
      .addField(new field().setName("highlightSegmentColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("highlightSegmentColors must contain two color values for each endpoint of the highlight segment."))
      .addField(new field().setName("transparency").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("1.0 is completely transparent, 0.0 is completely opaque."))
      .addField(new field().setName("labelDisplayMode").setType(field.TYPE_SFSTRING).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("allowed values: none; waypoints (produce labels at each waypoint); or interpolation (produce single moving label at interpolator time course speed location)"))
      .addField(new field().setName("heightLabel").setType(field.TYPE_SFSTRING).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("allowed values: altitude depth (negate Y value) none"))
      .addField(new field().setName("labelOffset").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("heightLabel relative location"))
      .addField(new field().setName("labelFontSize").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("heightLabel text size"))
      .addField(new field().setName("labelColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("heightLabel text color"))
      .addField(new field().setName("traceEnabled").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("enable console output to trace script computations and prototype progress"))
      .addField(new field().setName("outputInitializationComputations").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setAppinfo("Output the number of waypoints totalDistance and totalDuration to console upon initialization"))
      .addField(new field().setName("verticalDropLineColor").setType(field.TYPE_SFCOLOR).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("default color for vertical drop-line segments"))
      .addField(new field().setName("verticalDropLineTransparency").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setAppinfo("1.0 is completely transparent, 0.0 is completely opaque.")))
    .addChild(new Group("Viewpoints")
      .addChild(new Viewpoint().setDescription("Kelp Forest Monterey Bay Aquarium").setPosition(0.0,-5.0,45.0))
      .addChild(new Viewpoint().setDescription("Side Windows").setFieldOfView(0.5).setOrientation(0.0,1.0,0.0,0.9).setPosition(25.0,-4.0,15.0))
      .addChild(new Viewpoint().setDescription("Star Fish").setOrientation(0.0,1.0,0.0,1.25).setPosition(14.0,-5.75,1.0))
      .addChild(new Viewpoint().setDescription("Inside Tank").setOrientation(0.0,1.0,0.0,3.14).setPosition(0.0,-5.0,-7.0))
      .addChild(new Viewpoint().setDescription("Top floor").setFieldOfView(1.04719).setOrientation(-0.3,1.0,0.3,1.57079).setPosition(12.5,5.0,-2.0))
      .addChild(new Viewpoint().setDescription("Bird's Eye View").setOrientation(1.0,0.0,0.0,-1.57).setPosition(0.0,19.0,-3.5))
      .addChild(new Viewpoint().setDescription("Pump House").setFieldOfView(0.6).setOrientation(0.0,1.0,0.0,1.3).setPosition(-5.0,1.0,0.0)))
    .addChild(new Group("Root")
      .addChild(new Background().setSkyColor(new MFColor(new double[] {.8,.8,.8})))
      .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/IntroductionMessage.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/IntroductionMessage.x3d","../KelpForestExhibit/IntroductionMessage.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/IntroductionMessage.wrl"}))
      .addChild(new Collision().setEnabled(false)
        .addChild(new Transform()
          .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/SharkLeftyLocale.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLeftyLocale.x3d","../KelpForestExhibit/SharkLeftyLocale.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLeftyLocale.wrl"})))
        .addChild(new Transform()
          .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/SharkLucyLocale.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucyLocale.x3d","../KelpForestExhibit/SharkLucyLocale.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucyLocale.wrl"})))
        .addChild(new Transform()
          .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/KelpTank.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTank.x3d","../KelpForestExhibit/KelpTank.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTank.wrl"})))
        .addChild(new Transform().setScale(0.54,0.75,0.52).setTranslation(0.3,-2.88,7.3)
          .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/RockFloor.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RockFloor.x3d","../KelpForestExhibit/RockFloor.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RockFloor.wrl"})))
        .addChild(new Transform("K2_LOCALE").setTranslation(-4.0,0.0,1.0)
          .addChild(new Transform("K2_MIDWATER").setScale(0.2,0.2,0.2).setTranslation(-1.0,-4.0,-4.0)
            .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/SardineSchool.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SardineSchool.x3d","../KelpForestExhibit/SardineSchool.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SardineSchool.wrl"})))
          .addChild(new Transform("K2_FLOOR").setRotation(0.0,1.0,0.0,0.44).setScale(0.5,0.9,0.5).setTranslation(-1.9,-8.5,-1.5)
            .addChild(new Inline("KelpExamplesNoBase").setUrl(new String[] {"../KelpForestExhibit/KelpExamplesNoBase.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpExamplesNoBase.x3d","../KelpForestExhibit/KelpExamplesNoBase.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpExamplesNoBase.wrl"}))))
        .addChild(new Transform("K4_LOCALE").setTranslation(-2.5,0.0,-2.5)
          .addChild(new Transform("K4_MIDWATER").setTranslation(-10.0,-2.0,-2.0)
            .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/HalfMoonGroup.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonGroup.x3d","../KelpForestExhibit/HalfMoonGroup.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonGroup.wrl"})))
          .addChild(new Transform("K4_FLOOR").setRotation(0.0,1.0,0.0,-0.3).setScale(0.5,0.8,0.5).setTranslation(-1.5,-7.5,0.5)
            .addChild(new Inline().setUSE("KelpExamplesNoBase"))))
        .addChild(new Transform("K7_LOCALE").setTranslation(2.0,0.0,-2.5)
          .addChild(new Transform("K7_MIDWATER").setScale(0.25,0.25,0.25).setTranslation(2.0,-4.0,0.0)
            .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/RubberLipGroup.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RubberLipGroup.x3d","../KelpForestExhibit/RubberLipGroup.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/RubberLipGroup.wrl"})))
          .addChild(new Transform("K7_FLOOR").setScale(0.5,0.85,0.5).setTranslation(0.0,-7.75,0.0)
            .addChild(new Inline().setUSE("KelpExamplesNoBase"))))
        .addChild(new Transform("K10_LOCALE").setTranslation(7.0,0.0,2.0)
          .addChild(new Transform("K10_DEEP").setTranslation(0.0,-5.0,0.0)
            .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/StripedSurfPerch.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/StripedSurfPerch.x3d","../KelpForestExhibit/StripedSurfPerch.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/StripedSurfPerch.wrl"})))
          .addChild(new Transform("K10_FLOOR").setRotation(0.0,1.0,0.0,0.16).setScale(0.5,0.75,0.5).setTranslation(-1.0,-7.0,-1.0)
            .addChild(new Inline().setUSE("KelpExamplesNoBase"))))
        .addChild(new Transform("K11_LOCALE").setTranslation(8.0,0.0,-2.0)
          .addChild(new Transform("K11_MIDWATER").setRotation(0.0,1.0,0.0,0.3).setTranslation(2.19,-7.0,0.15)
            .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/SeaStarSimple.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarSimple.x3d","../KelpForestExhibit/SeaStarSimple.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarSimple.wrl"})))
          .addChild(new Transform("K11_DEEP").setRotation(0.0,1.0,0.0,0.9).setTranslation(1.0,-5.0,0.0)
            .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/BlackSurfPerch.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/BlackSurfPerch.x3d","../KelpForestExhibit/BlackSurfPerch.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/BlackSurfPerch.wrl"})))
          .addChild(new Transform("K11_FLOOR").setRotation(0.0,1.0,0.0,0.3).setScale(0.5,0.75,0.5).setTranslation(-0.3,-7.0,0.0)
            .addChild(new Inline().setUSE("KelpExamplesNoBase")))
          .addChild(new Transform().setTranslation(1.3,-5.0,3.0)
            .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/SeaStarGroup.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarGroup.x3d","../KelpForestExhibit/SeaStarGroup.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarGroup.wrl"}))))
        .addChild(new Transform("R2_LOCALE").setTranslation(-1.0,0.0,-1.0)
          .addChild(new Transform("R2_MIDWATER").setTranslation(-1.0,-6.0,-2.0)
            .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/BlueRockFish.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/BlueRockFish.x3d","../KelpForestExhibit/BlueRockFish.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/BlueRockFish.wrl"})))
          .addChild(new Transform("R2_DEEP").setTranslation(1.0,-6.5,-1.0)
            .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/KelpSurfPerch.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpSurfPerch.x3d","../KelpForestExhibit/KelpSurfPerch.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpSurfPerch.wrl"}))))
        .addChild(new Transform("R3_LOCALE").setTranslation(3.0,0.0,-4.0)
          .addChild(new Transform("R3_MIDWATER").setTranslation(0.0,-6.0,0.0)
            .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/Garibaldi.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Garibaldi.x3d","../KelpForestExhibit/Garibaldi.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Garibaldi.wrl"}))))
        .addChild(new Transform("R5_LOCALE").setTranslation(8.0,0.0,-2.0)
          .addChild(new Transform("R5_SHALLOW").setTranslation(-2.0,-2.0,0.0)
            .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/KelpBass.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBass.x3d","../KelpForestExhibit/KelpBass.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBass.wrl"}))))
        .addChild(new TimeSensor("WAVE_CLOCK").setCycleInterval(5.5).setEnabled(false).setLoop(true))
        .addChild(new PositionInterpolator("LEFT_SHALLOW_WAVE").setKey(new double[] {0.0,0.125,0.25,0.375,0.5,0.625,0.75,0.875,1.0}).setKeyValue(new MFVec3f(new double[] {0.0,0.0,0.0,0.056,-0.085,0.0,0.08,-0.12,0.0,0.056,-0.085,0.0,0.0,0.0,0.0,-0.056,0.085,0.0,-0.08,0.12,0.0,-0.056,0.085,0.0,0.0,0.0,0.0})))
        .addChild(new PositionInterpolator("LEFT_DEEP_WAVE").setKey(new double[] {0.0,0.125,0.25,0.375,0.5,0.625,0.75,0.875,1.0}).setKeyValue(new MFVec3f(new double[] {0.0,0.0,0.0,0.035,-0.035,0.0,0.05,-0.05,0.0,0.035,-0.035,0.0,0.0,0.0,0.0,-0.035,0.035,0.0,-0.05,0.05,0.0,-0.035,0.035,0.0,0.0,0.0,0.0})))
        .addChild(new PositionInterpolator("CENTER_WAVE").setKey(new double[] {0.0,0.125,0.25,0.375,0.5,0.625,0.75,0.875,1.0}).setKeyValue(new MFVec3f(new double[] {0.0,0.0,0.0,0.106,0.0,0.0,0.15,0.0,0.0,0.106,0.0,0.0,0.0,0.0,0.0,-0.106,0.0,0.0,-0.15,0.0,0.0,-0.106,0.0,0.0,0.0,0.0,0.0})))
        .addChild(new PositionInterpolator("RIGHT_SHALLOW_WAVE").setKey(new double[] {0.0,0.125,0.25,0.375,0.5,0.625,0.75,0.875,1.0}).setKeyValue(new MFVec3f(new double[] {0.0,0.0,0.0,0.056,0.085,0.0,0.08,0.12,0.0,0.056,0.085,0.0,0.0,0.0,0.0,-0.056,-0.085,0.0,-0.08,-0.12,0.0,-0.056,-0.085,0.0,0.0,0.0,0.0})))
        .addChild(new PositionInterpolator("RIGHT_DEEP_WAVE").setKey(new double[] {0.0,0.125,0.25,0.375,0.5,0.625,0.75,0.875,1.0}).setKeyValue(new MFVec3f(new double[] {0.0,0.0,0.0,0.035,0.035,0.0,0.05,0.05,0.0,0.035,0.035,0.0,0.0,0.0,0.0,-0.035,-0.035,0.0,-0.05,-0.05,0.0,-0.035,-0.035,0.0,0.0,0.0,0.0})))))
    .addChild(new ROUTE().setFromNode("WAVE_CLOCK").setFromField("fraction_changed").setToNode("CENTER_WAVE").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("CENTER_WAVE").setFromField("value_changed").setToNode("K7_MIDWATER").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("RIGHT_DEEP_WAVE").setFromField("value_changed").setToNode("K2_MIDWATER").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("CENTER_WAVE").setFromField("value_changed").setToNode("K4_MIDWATER").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("LEFT_DEEP_WAVE").setFromField("value_changed").setToNode("K10_DEEP").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("LEFT_DEEP_WAVE").setFromField("value_changed").setToNode("K11_DEEP").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("RIGHT_SHALLOW_WAVE").setFromField("value_changed").setToNode("R2_MIDWATER").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("RIGHT_DEEP_WAVE").setFromField("value_changed").setToNode("R2_DEEP").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("CENTER_WAVE").setFromField("value_changed").setToNode("R3_MIDWATER").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("RIGHT_SHALLOW_WAVE").setFromField("value_changed").setToNode("R5_SHALLOW").setToField("set_translation"))
    .addChild(new TimeSensor("MasterClock").setLoop(true))
    .addChild(new Group("Nancy")
      .addComments(" Scale used on Nancy underwater to approximate the defraction magnification of the plexiglass window. ")
      .addChild(new Transform("NancyTransform").setRotation(-0.45,0.77,-0.45,1.82).setScale(1.3,1.3,1.3).setTranslation(3.0,-6.5,-2.0)
        .addChild(new Inline().setUrl(new String[] {"../../Basic/HumanoidAnimation/NancyDiving.x3d","https://www.web3d.org/x3d/content/examples/HumanoidAnimation/NancyDiving.x3d","../../Basic/HumanoidAnimation/NancyDiving.wrl","https://www.web3d.org/x3d/content/examples/HumanoidAnimation/NancyDiving.wrl"})))
      .addChild(new TimeSensor("JEFFSCLOCK").setCycleInterval(100).setLoop(true))
      .addChild(new ProtoInstance("WaypointInterpolator", "NancyInterpolator").setContainerField("children")
        .addFieldValue(new fieldValue().setName("description").setValue("Nancy track"))
        .addFieldValue(new fieldValue().setName("waypoints").setValue(new MFVec3f(new MFVec3f(new double[] {-5.5,-5.7,-.2,-7.7,-2.7,-1.7,6.0,-3.0,-3.0,2.0,-2.0,-2.0,1.0,-4.0,-1.0,-2.0,-2.0,-2.0,-5.5,-5.7,-.2}))))
        .addFieldValue(new fieldValue().setName("defaultSpeed").setValue(0.5))
        .addFieldValue(new fieldValue().setName("pitchUpDownForVerticalWaypoints").setValue(true))
        .addFieldValue(new fieldValue().setName("labelDisplayMode").setValue("none"))
        .addFieldValue(new fieldValue().setName("lineColor").setValue(new SFColor(0.0,0.0,0.0)))
        .addFieldValue(new fieldValue().setName("labelColor").setValue(new SFColor(0.0,0.8,0.8)))
        .addFieldValue(new fieldValue().setName("labelOffset").setValue(new SFVec3f(0.0,-1.6,0.0)))
        .addFieldValue(new fieldValue().setName("labelFontSize").setValue(6))
        .addFieldValue(new fieldValue().setName("traceEnabled").setValue(false))
        .addFieldValue(new fieldValue().setName("transparency").setValue(1))
        .addFieldValue(new fieldValue().setName("turningRate").setValue(18))
        .addComments(" totalDuration is a computed output ")))
    .addChild(new ROUTE().setFromNode("JEFFSCLOCK").setFromField("fraction_changed").setToNode("NancyInterpolator").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("NancyInterpolator").setFromField("position_changed").setToNode("NancyTransform").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("NancyInterpolator").setFromField("orientation_changed").setToNode("NancyTransform").setToField("set_rotation")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return FogKelpForestMain model
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
        X3D thisExampleX3dModel = new FogKelpForestMain().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter11LightingEnvironmentalEffects.FogKelpForestMain\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter11LightingEnvironmentalEffects.FogKelpForestMain\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
