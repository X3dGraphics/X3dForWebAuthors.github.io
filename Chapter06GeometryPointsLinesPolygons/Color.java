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
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Vertex color applied to IndexedFaceSet built positive-displacement cylinder pump house. Note that this scene is not really static because the PositionInterpolators contain an initial offest of the piston and rocker arm. </p>
 <p> Related links: <a href="../../../Chapter06GeometryPointsLinesPolygons/Color.java">Color.java</a> source, <a href="../../../Chapter06GeometryPointsLinesPolygons/ColorIndex.html" target="_top">Color catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter06GeometryPointsLinesPolygons/Color.x3d">Color.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Vertex color applied to IndexedFaceSet built positive-displacement cylinder pump house. Note that this scene is not really static because the PositionInterpolators contain an initial offest of the piston and rocker arm. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Todd Gagnon and Mark A. Boyd </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Xeena VRML importer, X3D-Edit 3.1, <a href="https://www.web3d.org/x3d/content/README.X3D-Edit.html" target="_blank">https://www.web3d.org/x3d/content/README.X3D-Edit.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 8 June 1998 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translated </i> </td>
			<td> 20 December 2002 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/Color.x3d" target="_blank">http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/Color.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter06GeometryPointsLinesPolygons/KelpTank.x3d">KelpTank.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/PumpHouse.x3d" target="_blank">http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/PumpHouse.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> Vrml97ToX3dNist, <a href="http://ovrt.nist.gov/v2_x3d.html" target="_blank">http://ovrt.nist.gov/v2_x3d.html</a> </td>
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

	* @author Todd Gagnon and Mark A. Boyd
 */

public class Color
{
	/** Default constructor to create this object. */
	public Color ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERCHANGE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Color.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Vertex color applied to IndexedFaceSet built positive-displacement cylinder pump house. Note that this scene is not really static because the PositionInterpolators contain an initial offest of the piston and rocker arm."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Todd Gagnon and Mark A. Boyd"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Xeena VRML importer, X3D-Edit 3.1, https://www.web3d.org/x3d/content/README.X3D-Edit.html"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("8 June 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("20 December 2002"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/Color.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("KelpTank.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/PumpHouse.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("Color.x3d"))
    .addChild(new Background().setSkyColor(new MFColor(new float[] {1.0f,1.0f,1.0f})))
    .addChild(new Viewpoint().setDescription("Book View").setOrientation(0.0f,-1.0f,0.0f,0.53f).setPosition(-2.28f,0.29f,4.06f))
    .addChild(new Group()
      .addChild(new Shape()
        .setAppearance(new Appearance("PumpHouseAppearance")
          .setMaterial(new Material().setDiffuseColor(0.82f,0.78f,0.74f)))
        .setGeometry(new IndexedFaceSet().setColorIndex(new int[] {0,0,0,0,-1,0,0,1,1,-1,1,1,1,1,-1,1,0,0,1,-1,0,0,1,1,-1,1,1,1,-1,0,0,1,1,-1,0,0,1,1,-1,1,1,1,-1,0,0,0,0,-1,0,0,0,0,-1,0,0,0,0,-1,0,0,0,0,-1,0,0,0,0,-1,1,1,1,1,-1,1,1,1,1,-1}).setCoordIndex(new int[] {0,1,5,4,-1,5,1,2,6,-1,6,2,3,7,-1,3,0,4,7,-1,1,12,13,2,-1,2,13,14,-1,12,15,16,13,-1,15,0,3,16,-1,16,3,17,-1,9,5,6,10,-1,8,9,10,11,-1,4,8,11,7,-1,4,5,9,8,-1,11,10,6,7,-1,3,2,14,17,-1,13,16,17,14,-1})
          .setCoord(new Coordinate("CoordinateNodeExample").setPoint(new MFVec3f(new float[] {0.0f,0.0f,0.0f,2.0f,0.0f,0.0f,2.0f,1.75f,0.0f,0.0f,1.75f,0.0f,0.625f,0.75f,0.0f,1.0f,0.75f,0.0f,1.0f,1.6f,0.0f,0.625f,1.6f,0.0f,0.625f,0.75f,-0.65f,1.0f,0.75f,-0.65f,1.0f,1.6f,-0.65f,0.625f,1.6f,-0.65f,2.0f,0.0f,-2.7f,2.0f,1.75f,-2.7f,2.0f,2.5f,-1.0f,0.0f,0.0f,-2.7f,0.0f,1.75f,-2.7f,0.0f,2.5f,-1.0f})))
          .setColor(new /*avoid name collision with file name*/org.web3d.x3d.jsail.Rendering.Color("ColorNodeExample").setColor(new MFColor(new float[] {.82f,.78f,.74f,.66f,.37f,.02f})))))
      .addChild(new Transform().setScale(0.91f,0.6f,0.3f).setTranslation(0.8f,-0.65f,0.5f)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.749f,0.694f,0.651f)))
          .setGeometry(new Cylinder().setBottom(false).setTop(false)))))
    .addChild(new Group()
      .addChild(new Transform().setScale(0.5f,0.5f,0.5f).setTranslation(1.0f,1.1f,-1.5f)
        .addChild(new Transform("PistonTransform")
          .addChild(new Transform().setScale(1.8f,1.2f,0.6f).setTranslation(0.0f,-0.2f,0.0f)
            .addChild(new Shape()
              .setAppearance(new Appearance()
                .setMaterial(new Material().setDiffuseColor(0.427f,0.427f,0.42f)))
              .setGeometry(new Cylinder().setHeight(1.0f).setRadius(0.98f))))
          .addChild(new Transform("CylinderRod").setRotation(0.0f,0.0f,-1.0f,0.523599f).setTranslation(-0.25f,0.75f,0.0f)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("PumpHouseAppearance"))
              .setGeometry(new Cylinder().setHeight(1.0f).setRadius(0.1f))))
          .addChild(new Transform().setRotation(0.0f,0.0f,1.0f,1.047198f).setTranslation(1.0f,0.6f,0.0f)
            .addChild(new Transform().setUSE("CylinderRod")))
          .addChild(new Transform().setTranslation(0.0f,1.2f,0.0f)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("PumpHouseAppearance"))
              .setGeometry(new Sphere().setRadius(0.15f))))
          .addChild(new Transform("RockerArm1").setCenter(0.0f,-0.4f,0.0f)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("PumpHouseAppearance"))
              .setGeometry(new Cylinder().setHeight(1.8f).setRadius(0.1f)))
            .addChild(new Transform().setTranslation(0.0f,0.95f,0.0f)
              .addChild(new Shape()
                .setAppearance(new Appearance().setUSE("PumpHouseAppearance"))
                .setGeometry(new Sphere().setRadius(0.15f))))
            .addChild(new PositionInterpolator("Rocker1Path").setKey(new float[] {0.0f,0.3f,0.32f,0.5f,0.75f,1.0f}).setKeyValue(new MFVec3f(new float[] {0.0f,2.0f,-0.25f,0.0f,1.8f,-0.35f,0.0f,1.8f,-0.35f,0.0f,2.0f,-0.25f,0.0f,2.0f,-0.12f,0.0f,2.0f,-0.25f})))
            .addChild(new OrientationInterpolator("Rocker1Rotation").setKey(new float[] {0.0f,0.3f,0.32f,0.5f,0.75f,1.0f}).setKeyValue(new MFRotation(new float[] {-1.0f,0.0f,0.0f,0.523599f,-1.0f,0.0f,0.0f,1.0471976f,-1.0f,0.0f,0.0f,1.0471976f,-1.0f,0.0f,0.0f,0.523599f,-1.0f,0.0f,0.0f,0.2617994f,-1.0f,0.0f,0.0f,0.523599f}))))
          .addChild(new Transform("RockerArm2").setCenter(0.0f,0.7f,0.0f)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("PumpHouseAppearance"))
              .setGeometry(new Cylinder().setHeight(1.8f).setRadius(0.1f)))
            .addChild(new Transform().setTranslation(0.0f,-0.95f,0.0f)
              .addChild(new Shape()
                .setAppearance(new Appearance().setUSE("PumpHouseAppearance"))
                .setGeometry(new Sphere().setRadius(0.15f))))
            .addChild(new PositionInterpolator("Rocker2Path").setKey(new float[] {0.0f,0.3f,0.32f,0.5f,0.75f,1.0f}).setKeyValue(new MFVec3f(new float[] {0.0f,1.95f,-1.0f,0.0f,1.2f,-1.6f,0.0f,1.2f,-1.6f,0.0f,1.95f,-1.0f,0.0f,2.2f,-0.65f,0.0f,1.95f,-1.0f})))
            .addChild(new OrientationInterpolator("Rocker2Rotation").setKey(new float[] {0.0f,0.3f,0.32f,0.5f,0.75f,1.0f}).setKeyValue(new MFRotation(new float[] {1.0f,0.0f,0.0f,0.523599f,1.0f,0.0f,0.0f,0.4f,1.0f,0.0f,0.0f,0.4f,1.0f,0.0f,0.0f,0.523599f,1.0f,0.0f,0.0f,1.570796f,1.0f,0.0f,0.0f,0.523599f})))))
        .addChild(new TimeSensor("PistonClock").setCycleInterval(5500).setLoop(true))
        .addChild(new PositionInterpolator("PistonPath").setKey(new float[] {0.0f,0.3f,0.32f,0.5f,0.75f,1.0f}).setKeyValue(new MFVec3f(new float[] {-0.4f,-2.3f,4.0f,-0.4f,-1.5f,4.0f,-0.4f,-1.5f,4.0f,-0.4f,-2.3f,4.0f,-0.4f,-3.3f,4.0f,-0.4f,-2.3f,4.0f})))))
    .addChild(new ROUTE().setFromNode("PistonClock").setFromField("fraction_changed").setToNode("PistonPath").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("PistonPath").setFromField("value_changed").setToNode("PistonTransform").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("PistonClock").setFromField("fraction_changed").setToNode("Rocker1Path").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Rocker1Path").setFromField("value_changed").setToNode("RockerArm1").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("PistonClock").setFromField("fraction_changed").setToNode("Rocker1Rotation").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Rocker1Rotation").setFromField("value_changed").setToNode("RockerArm1").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("PistonClock").setFromField("fraction_changed").setToNode("Rocker2Path").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Rocker2Path").setFromField("value_changed").setToNode("RockerArm2").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("PistonClock").setFromField("fraction_changed").setToNode("Rocker2Rotation").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Rocker2Rotation").setFromField("value_changed").setToNode("RockerArm2").setToField("set_rotation")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return Color model
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
        X3D thisExampleX3dModel = new Color().getX3dModel();

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
			System.out.println("WARNING: \"Color\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"Color\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
			System.out.println(validationResults);
		}
    }
}
