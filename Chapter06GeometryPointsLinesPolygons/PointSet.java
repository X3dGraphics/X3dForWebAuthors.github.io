package X3dForWebAuthors.Chapter06GeometryPointsLinesPolygons;

/*
Copyright (c) 1995-2020 held by the author(s).  All rights reserved.

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

import java.util.*;
import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.jsail.EnvironmentalEffects.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Way points for the animated shark Lucy traversing the tank. </p>
 <p> Related links: <a href="../../../Chapter06GeometryPointsLinesPolygons/PointSet.java">PointSet.java</a> source, <a href="../../../Chapter06GeometryPointsLinesPolygons/PointSetIndex.html" target="_top">PointSet catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter06GeometryPointsLinesPolygons/PointSet.x3d">PointSet.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Way points for the animated shark Lucy traversing the tank. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Tim McLean </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Don Brutzman </td>
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
			<td> <a href="http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucyLocale.x3d" target="_blank">http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucyLocale.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/PointSet.x3d" target="_blank">http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/PointSet.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter06GeometryPointsLinesPolygons/../license.html">../license.html</a> </td>
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

	* @author Tim McLean
 */

public class PointSet
{
	/** Default constructor to create this object. */
	public PointSet ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("PointSet.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Way points for the animated shark Lucy traversing the tank."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Tim McLean"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 June 1998"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://faculty.nps.edu/brutzman/kelp"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucyLocale.x3d"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/PointSet.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("PointSet.x3d"))
    .addChild(new Background())
    .addChild(new Viewpoint().setDescription("Book View").setOrientation(0.939f,0.335f,0.075f,-0.57f).setPosition(-0.89f,1.91f,9.26f))
    .addChild(new Transform("_0").setTranslation(0.0f,-8.0f,-1.0f)
      .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/SharkLucy.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucy.x3d","../KelpForestExhibit/SharkLucy.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucy.wrl"}))
      .addChild(new Group()
        .addChild(new TimeSensor("SHARK1_CLOCK").setCycleInterval(220.0).setLoop(true))
        .addChild(new PositionInterpolator("SHARK1_POSITION").setKey(new float[] {0.0f,0.048f,0.112f,0.155f,0.184f,0.263f,0.3f,0.342f,0.375f,0.404f,0.457f,0.497f,0.57f,0.65f,0.702f,0.796f,0.888f,0.938f,1.0f}).setKeyValue(new MFVec3f(new float[] {0.0f,-7.0f,-1.0f,-1.75f,-7.0f,-0.5f,-4.0f,-7.0f,0.5f,-5.0f,-6.5f,1.5f,-5.5f,-6.25f,0.75f,-5.25f,-5.5f,-2.25f,-4.25f,-5.0f,-3.25f,-2.75f,-4.5f,-3.75f,-1.5f,-4.5f,-4.0f,-0.5f,-4.25f,-4.5f,1.5f,-3.75f,-4.75f,3.0f,-3.75f,-4.5f,5.75f,-4.5f,-4.5f,8.75f,-4.5f,-4.0f,9.25f,-4.5f,-2.25f,7.5f,-5.5f,0.0f,4.0f,-6.5f,-0.25f,2.25f,-7.0f,-0.25f,0.0f,-7.0f,-1.0f})))
        .addChild(new OrientationInterpolator("SHARK1_ORIENTATION").setKey(new float[] {0.0f,0.048f,0.112f,0.155f,0.184f,0.263f,0.3f,0.342f,0.375f,0.404f,0.457f,0.497f,0.57f,0.65f,0.702f,0.796f,0.888f,0.938f,1.0f}).setKeyValue(new MFRotation(new float[] {0.0f,1.0f,0.0f,3.4208f,0.0f,1.0f,0.0f,3.5605f,0.1504f,0.986f,0.0717f,4.0208f,0.1095f,0.9918f,-0.0658f,2.0667f,-0.1207f,0.9836f,0.134f,1.4825f,-0.1565f,0.9125f,0.3779f,0.8522f,-0.1099f,0.7118f,0.6937f,0.4379f,0.0f,1.0f,0.0f,0.192f,-0.0956f,0.8656f,0.4916f,0.4418f,-0.0606f,0.4959f,0.8663f,0.2802f,0.0f,1.0f,0.0f,6.161f,0.0f,0.0f,-1.0f,0.2618f,0.0f,1.0f,0.0f,6.0388f,0.0f,1.0f,0.0f,5.236f,-0.1388f,0.9878f,-0.0707f,4.0742f,-0.1392f,0.9903f,0.0f,3.1416f,-0.1305f,0.9911f,0.0265f,3.0f,0.0f,1.0f,0.0f,2.827f,0.0f,1.0f,0.0f,3.4208f})))))
    .addComments(" TODO move PointSet to top ")
    .addChild(new Transform()
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setEmissiveColor(1.0f,1.0f,0.0f)))
        .setGeometry(new /*avoid name collision with file name*/org.web3d.x3d.jsail.Rendering.PointSet()
          .setCoord(new Coordinate("TurnPoints").setPoint(new MFVec3f(new float[] {0.0f,-7.0f,-1.0f,-1.75f,-7.0f,-0.5f,-4.0f,-7.0f,0.5f,-5.0f,-6.5f,1.5f,-5.5f,-6.25f,0.75f,-5.25f,-5.5f,-2.25f,-4.25f,-5.0f,-3.25f,-2.75f,-4.5f,-3.75f,-1.5f,-4.5f,-4.0f,-0.5f,-4.25f,-4.5f,1.5f,-3.75f,-4.75f,3.0f,-3.75f,-4.5f,5.75f,-4.5f,-4.5f,8.75f,-4.5f,-4.0f,9.25f,-4.5f,-2.25f,7.5f,-5.5f,0.0f,4.0f,-6.5f,-0.25f,2.25f,-7.0f,-0.25f,0.0f,-7.0f,-1.0f}))))))
    .addChild(new TimeSensor("_4").setLoop(true))
    .addChild(new Script("sharkSwimmingInTankTrigger_5").setSourceCode("\n" + 
"      " + "\n" + 
"ecmascript:" + "\n" + 
"\n" + 
"function triggerIn (value, time)" + "\n" + 
"{" + "\n" + 
"	startTime = value;" + "\n" + 
"	firstTime = false;" + "\n" + 
"}" + "\n")
      .addField(new field().setName("triggerIn").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addField(new field().setName("startTime").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
      .addField(new field().setName("firstTime").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_OUTPUTONLY)))
    .addChild(new ROUTE().setFromNode("sharkSwimmingInTankTrigger_5").setFromField("startTime").setToNode("SHARK1_CLOCK").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("SHARK1_CLOCK").setFromField("fraction_changed").setToNode("SHARK1_POSITION").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("SHARK1_CLOCK").setFromField("fraction_changed").setToNode("SHARK1_ORIENTATION").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("SHARK1_POSITION").setFromField("value_changed").setToNode("_0").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("SHARK1_ORIENTATION").setFromField("value_changed").setToNode("_0").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("sharkSwimmingInTankTrigger_5").setFromField("firstTime").setToNode("_4").setToField("set_enabled"))
    .addChild(new ROUTE().setFromNode("_4").setFromField("time").setToNode("sharkSwimmingInTankTrigger_5").setToField("triggerIn")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return PointSet model
	 */
	public X3D getX3dModel()
	{	  
		return x3dModel;
	}
	   
    /** Default main() method provided for test purposes, uses CommandLine to set global ConfigurationProperties for this object.
     * @param args array of input parameters, provided as arguments
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html#handleArguments-java.lang.String:A-">X3D.handleArguments(args)</a>
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html#validationReport--">X3D.validationReport()</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/CommandLine.html">CommandLine</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/CommandLine.html#USAGE">CommandLine.USAGE</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/ConfigurationProperties.html">ConfigurationProperties</a>
     */
    public static void main(String args[])
    {
        X3D thisExampleX3dModel = new PointSet().getX3dModel();

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
			System.out.println("WARNING: \"PointSet\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"PointSet\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
			System.out.println(validationResults);
		}
    }
}
