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
import org.web3d.x3d.jsail.EnvironmentalSensor.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> A Fog node that adjusts as the viewer's orientation and position changes. This is a good candidate to become a Prototype since Fog does not automatically bind when inlined. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/ChangingFog.java">ChangingFog.java</a> source, <a href="../../../KelpForestExhibit/ChangingFogIndex.html" target="_top">ChangingFog catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/ChangingFog.x3d">ChangingFog.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> A Fog node that adjusts as the viewer's orientation and position changes. This is a good candidate to become a Prototype since Fog does not automatically bind when inlined. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Matthew Braun </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 20 September 2001 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://astronomy.swin.edu.au/pbourke/geometry/rotate/" target="_blank">http://astronomy.swin.edu.au/pbourke/geometry/rotate/</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> rights </i> </td>
			<td> Copyright (c) Matthew Braun 2001 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> Fog </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/ChangingFog.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/ChangingFog.x3d</a> </td>
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

	* @author Matthew Braun
 */

public class ChangingFog
{
	/** Default constructor to create this object. */
	public ChangingFog ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addComments(" javascript code for rotation calculations was derived from: ")
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("ChangingFog.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("A Fog node that adjusts as the viewer's orientation and position changes. This is a good candidate to become a Prototype since Fog does not automatically bind when inlined."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Matthew Braun"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("20 September 2001"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://astronomy.swin.edu.au/pbourke/geometry/rotate/"))
    .addMeta(new meta().setName(meta.NAME_RIGHTS     ).setContent("Copyright (c) Matthew Braun 2001"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("Fog"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/ChangingFog.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("ChangingFog.x3d"))
    .addChild(new NavigationInfo().setAvatarSize(new double[] {0.01,0.0,0.0}))
    .addChild(new Viewpoint().setDescription("Start").setFieldOfView(0.9).setPosition(0.0,0.0,0.0))
    .addChild(new Viewpoint().setDescription("Looking up from start").setOrientation(1.0,0.0,0.0,1.57).setPosition(0.0,0.0,0.0))
    .addChild(new Viewpoint().setDescription("10m above, looking straight up").setOrientation(1.0,0.0,0.0,1.57).setPosition(0.0,10.0,0.0))
    .addChild(new Viewpoint().setDescription("10m above start").setPosition(0.0,10.0,0.0))
    .addChild(new Viewpoint().setDescription("10m above, looking straight down").setOrientation(1.0,0.0,0.0,-1.57).setPosition(0.0,10.0,0.0))
    .addChild(new Viewpoint().setDescription("10m below, looking down").setOrientation(1.0,0.0,0.0,-1.57).setPosition(0.0,-10.0,0.0))
    .addChild(new Viewpoint().setDescription("10m below start").setPosition(0.0,-10.0,0.0))
    .addChild(new Viewpoint().setDescription("10m below, looking up").setOrientation(1.0,0.0,0.0,1.57).setPosition(0.0,-10.0,0.0))
    .addChild(new Fog("Water").setColor(0.2,0.2,0.4).setFogType("EXPONENTIAL"))
    .addComments(" Proximity sensor must be large enough to encompass the entire scene ")
    .addChild(new ProximitySensor("ProxSensor").setSize(1000.0,1000.0,1000.0))
    .addComments(" TimeSensor triggering reduces frequency of calculations for performance reasons. ")
    .addChild(new TimeSensor("Clock").setLoop(true))
    .addChild(new Script("ChangeVisibility").setSourceCode("""
ecmascript:
// REF: http://astronomy.swin.edu.au/pbourke/geometry/rotate/

function initialize () {
   visibility = 20;
   depth = 0;
   pos = (0,0,0);
   Browser.print ('Position output from ProximitySensor.');
}

function get_clock_hit (clock_msg) {
     run_script = true;
}

function get_depth ( position ) {

   pos = position;
   depth = position[1] - 30;   

}

function set_visibility( rotation ) {

 if (run_script) {

//z coordinate of the default viewpoint direction(0,0,-1)
   initZ = -1;  

   rX = rotation[0];  // x coordinate of the rotation
   rY = rotation[1];  // y coordinate of the rotation
   rZ = rotation[2];  // z coordinate of the rotation

   theta = rotation[3];  // angle of rotation in radians
	
Browser.print ('theta:' + theta);
     
   cosTheta = Math.cos(theta);
   sinTheta = Math.sin(theta);

Browser.print ('cosTheta:' + cosTheta + ' sinTheta:'+ sinTheta);


// calculate the y coordinate of the point after rotation
/* there are 8 other terms in the full conversion, but 6 are equal
to zero because of the choice of a starting point on the z-axis. The
other two are not calculated since all we need is the y coordinate
*/
   finalY = ((1 - cosTheta) * rY * rZ - rX * sinTheta) * initZ;

Browser.print ('final y:' + finalY);

//calculate the elevation/depression angle of the final point location

   elevation = Math.asin(finalY);

Browser.print ('elevation:' + elevation);

   directionFactor = 1 + 0.2 * (4 * elevation / Math.PI);
   depthAdjust = (60 + depth)/60
   depthFactor = Math.max(depthAdjust,0.05);

   visibility_changed =  60 * depthFactor * directionFactor; 
   Browser.print ('depth=' + depth + ', elevation=' + elevation + 
        ', visibility_changed=' + visibility_changed);
   run_script = false;
   
 }
}
""")
      .addField(new field().setName("get_clock_hit").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addField(new field().setName("run_script").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(false))
      .addField(new field().setName("get_depth").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addField(new field().setName("visibility_changed").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
      .addField(new field().setName("set_visibility").setType(field.TYPE_SFROTATION).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addComments(" <field accessType='initializeOnly' name='checked' type='SFBool' value='false'/> <field accessType='initializeOnly' name='moved' type='SFBool' value='false'/> "))
    .addChild(new ROUTE().setFromNode("Clock").setFromField("cycleTime").setToNode("ChangeVisibility").setToField("get_clock_hit"))
    .addChild(new ROUTE().setFromNode("ProxSensor").setFromField("position_changed").setToNode("ChangeVisibility").setToField("get_depth"))
    .addChild(new ROUTE().setFromNode("ProxSensor").setFromField("orientation_changed").setToNode("ChangeVisibility").setToField("set_visibility"))
    .addChild(new ROUTE().setFromNode("ChangeVisibility").setFromField("visibility_changed").setToNode("Water").setToField("visibilityRange"))
    .addComments(" A set of arrows is used to show visibility and direction ")
    .addChild(new Transform("Pointer").setTranslation(0.0,0.0,-15.0)
      .addChild(new Transform().setTranslation(0.0,4.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Cone().setBottomRadius(0.4))
          .setAppearance(new Appearance("ShapeApp")
            .setMaterial(new Material().setAmbientIntensity(0.8).setDiffuseColor(1.0,1.0,0.3).setShininess(0.6)))))
      .addChild(new Shape()
        .setGeometry(new Cylinder().setHeight(6).setRadius(0.2))
        .setAppearance(new Appearance().setUSE("ShapeApp"))))
    .addChild(new Transform().setTranslation(0.0,10.0,0.0)
      .addChild(new Transform().setUSE("Pointer")))
    .addChild(new Transform().setTranslation(0.0,-10.0,0.0)
      .addChild(new Transform().setUSE("Pointer")))
    .addComments(" A pair of disks used to show visibility ")
    .addChild(new Transform().setTranslation(0.0,15.0,0.0)
      .addChild(new Shape("Disk")
        .setGeometry(new Cylinder().setHeight(0.01))
        .setAppearance(new Appearance().setUSE("ShapeApp"))))
    .addChild(new Transform().setTranslation(0.0,-15.0,0.0)
      .addChild(new Shape().setUSE("Disk")))
    .addComments(" An indexed face set box used to bound the working area ")
    .addChild(new Transform().setScale(20.0,20.0,20.0)
      .addChild(new Shape("IFSBox")
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(1.0,1.0,1.0)))
        .setGeometry(new IndexedFaceSet().setCcw(false).setColorPerVertex(false).setColorIndex(new int[] {0,2,2,2,2,1}).setCoordIndex(new int[] {0,1,2,3,-1,7,6,5,4,-1,0,4,5,1,-1,1,5,6,2,-1,2,6,7,3,-1,3,7,4,0})
          .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,-1.0,-1.0,1.0,-1.0,-1.0,-1.0,1.0,1.0,-1.0,1.0,1.0,-1.0,-1.0,-1.0,-1.0,-1.0})))
          .setColor(new Color().setColor(new MFColor(new double[] {1.0,1.0,1.0,0.0,0.0,0.0,0.2,0.2,0.8})))))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return ChangingFog model
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
        X3D thisExampleX3dModel = new ChangingFog().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.ChangingFog\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.ChangingFog\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
