package X3dForWebAuthors.Chapter06GeometryPointsLinesPolygons;

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
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> The way points and path of the animated shark Lucy traversing the tank, using IndexedLineSet node. </p>
 <p> Related links: <a href="../../../Chapter06GeometryPointsLinesPolygons/IndexedLineSetExample.java">IndexedLineSetExample.java</a> source, <a href="../../../Chapter06GeometryPointsLinesPolygons/IndexedLineSetExampleIndex.html" target="_top">IndexedLineSetExample catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter06GeometryPointsLinesPolygons/IndexedLineSetExample.x3d">IndexedLineSetExample.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> The way points and path of the animated shark Lucy traversing the tank, using IndexedLineSet node. </td>
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
			<td> 14 June 2020 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter06GeometryPointsLinesPolygons/LineSetExample.x3d">LineSetExample.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://faculty.nps.edu/brutzman/kelp" target="_blank">http://faculty.nps.edu/brutzman/kelp</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucyLocale.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucyLocale.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/IndexedLineSetExample.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/IndexedLineSetExample.x3d</a> </td>
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

public class IndexedLineSetExample
{
	/** Default constructor to create this object. */
	public IndexedLineSetExample ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("IndexedLineSetExample.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("The way points and path of the animated shark Lucy traversing the tank, using IndexedLineSet node."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Tim McLean"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 June 1998"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("14 June 2020"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("LineSetExample.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://faculty.nps.edu/brutzman/kelp"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucyLocale.x3d"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/IndexedLineSetExample.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("IndexedLineSet.x3d"))
    .addChild(new Background().setSkyColor(new MFColor(new double[] {1.0,1.0,1.0})))
    .addChild(new Viewpoint().setDescription("Book View").setOrientation(0.939,0.335,0.075,-0.57).setPosition(-0.89,1.91,9.26))
    .addChild(new Transform()
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setEmissiveColor(0.0,0.0,1.0)))
        .addComments(" Note that index=0 for the first and last points are the same (coincident) in order to close the loop. ")
        .addComments(" Compare to no indexing scheme in LineSet.x3d example, which creates the exact same path. ")
        .setGeometry(new IndexedLineSet("ILS").setDEF("ILS").setCoordIndex(new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,0,-1})
          .setCoord(new Coordinate("TurnPoints").setPoint(new MFVec3f(new double[] {0.0,-7.0,-1.0,-1.75,-7.0,-0.5,-4.0,-7.0,0.5,-5.0,-6.5,1.5,-5.5,-6.25,0.75,-5.25,-5.5,-2.25,-4.25,-5.0,-3.25,-2.75,-4.5,-3.75,-1.5,-4.5,-4.0,-0.5,-4.25,-4.5,1.5,-3.75,-4.75,3.0,-3.75,-4.5,5.75,-4.5,-4.5,8.75,-4.5,-4.0,9.25,-4.5,-2.25,7.5,-5.5,0.0,4.0,-6.5,-0.25,2.25,-7.0,-0.25}))))))
    .addChild(new Transform("_0").setTranslation(0.0,-8.0,-1.0)
      .addChild(new Inline().setUrl(new String[] {"../KelpForestExhibit/SharkLucy.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucy.x3d","../KelpForestExhibit/SharkLucy.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SharkLucy.wrl"}))
      .addChild(new Group()
        .addChild(new TimeSensor("SHARK1_CLOCK").setCycleInterval(220.0).setLoop(true))
        .addChild(new PositionInterpolator("SHARK1_POSITION").setKey(new double[] {0.0,0.048,0.112,0.155,0.184,0.263,0.3,0.342,0.375,0.404,0.457,0.497,0.57,0.65,0.702,0.796,0.888,0.938,1.0}).setKeyValue(new MFVec3f(new double[] {0.0,-7.0,-1.0,-1.75,-7.0,-0.5,-4.0,-7.0,0.5,-5.0,-6.5,1.5,-5.5,-6.25,0.75,-5.25,-5.5,-2.25,-4.25,-5.0,-3.25,-2.75,-4.5,-3.75,-1.5,-4.5,-4.0,-0.5,-4.25,-4.5,1.5,-3.75,-4.75,3.0,-3.75,-4.5,5.75,-4.5,-4.5,8.75,-4.5,-4.0,9.25,-4.5,-2.25,7.5,-5.5,0.0,4.0,-6.5,-0.25,2.25,-7.0,-0.25,0.0,-7.0,-1.0})))
        .addChild(new OrientationInterpolator("SHARK1_ORIENTATION").setKey(new double[] {0.0,0.048,0.112,0.155,0.184,0.263,0.3,0.342,0.375,0.404,0.457,0.497,0.57,0.65,0.702,0.796,0.888,0.938,1.0}).setKeyValue(new MFRotation(new double[] {0.0,1.0,0.0,3.4208,0.0,1.0,0.0,3.5605,0.1504,0.986,0.0717,4.0208,0.1095,0.9918,-0.0658,2.0667,-0.1207,0.9836,0.134,1.4825,-0.1565,0.9125,0.3779,0.8522,-0.1099,0.7118,0.6937,0.4379,0.0,1.0,0.0,0.192,-0.0956,0.8656,0.4916,0.4418,-0.0606,0.4959,0.8663,0.2802,0.0,1.0,0.0,6.161,0.0,0.0,-1.0,0.2618,0.0,1.0,0.0,6.0388,0.0,1.0,0.0,5.236,-0.1388,0.9878,-0.0707,4.0742,-0.1392,0.9903,0.0,3.1416,-0.1305,0.9911,0.0265,3.0,0.0,1.0,0.0,2.827,0.0,1.0,0.0,3.4208})))))
    .addChild(new TimeSensor("_4").setLoop(true))
    .addChild(new Script("sharkSwimmingInTankTrigger_5").setSourceCode("""
ecmascript:

function triggerIn (value, time)
{
	startTime = value;
	firstTime = false;
}
""")
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

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return IndexedLineSetExample model
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
        X3D thisExampleX3dModel = new IndexedLineSetExample().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter06GeometryPointsLinesPolygons.IndexedLineSetExample\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter06GeometryPointsLinesPolygons.IndexedLineSetExample\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
