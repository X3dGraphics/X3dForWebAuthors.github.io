package X3dForWebAuthors.Chapter07EventAnimationInterpolation;

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
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Example normal (perpendicular vector) animation, where orange vectors show normal direction at each polygon vertex. </p>
 <p> Related links: <a href="../../../Chapter07EventAnimationInterpolation/NormalInterpolator.java">NormalInterpolator.java</a> source, <a href="../../../Chapter07EventAnimationInterpolation/NormalInterpolatorIndex.html" target="_top">NormalInterpolator catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter07EventAnimationInterpolation/NormalInterpolator.x3d">NormalInterpolator.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Example normal (perpendicular vector) animation, where orange vectors show normal direction at each polygon vertex. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 3 May 2008 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter19-NormalsShading/Figure19.27SquareFaceAnimatingNormals.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter19-NormalsShading/Figure19.27SquareFaceAnimatingNormals.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D NormalInterpolator example </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/NormalInterpolator.x3d" target="_blank">http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/NormalInterpolator.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter07EventAnimationInterpolation/../license.html">../license.html</a> </td>
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

public class NormalInterpolator
{
	/** Default constructor to create this object. */
	public NormalInterpolator ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERCHANGE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("NormalInterpolator.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Example normal (perpendicular vector) animation, where orange vectors show normal direction at each polygon vertex."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("3 May 2008"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter19-NormalsShading/Figure19.27SquareFaceAnimatingNormals.x3d"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D NormalInterpolator example"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/NormalInterpolator.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("NormalInterpolator.x3d"))
    .addChild(new Viewpoint().setDescription("Animating normals on right vertices of a quadrilateral").setPosition(0.0f,0.0f,8.0f))
    .addChild(new Viewpoint().setDescription("Other side - note difference in animated shading").setOrientation(0.0f,1.0f,0.0f,3.14159f).setPosition(0.0f,0.0f,-7.0f))
    .addChild(new Shape()
      .setGeometry(new IndexedFaceSet("FlatSquare").setDEF("FlatSquare").setSolid(false).setCoordIndex(new int[] {0,1,2,3}).setNormalIndex(new int[] {0,1,2,3})
        .setCoord(new Coordinate().setPoint(new MFVec3f(new float[] {-2.0f,-2.0f,0.0f,2.0f,-2.0f,0.0f,2.0f,2.0f,0.0f,-2.0f,2.0f,0.0f})))
        .addComments(" Normal vector with 4 SFVec3f triplet values, one for each corner of quadrilateral ")
        .setNormal(new Normal("AnimatedNormalNode").setVector(new MFVec3f(new float[] {0.0f,0.0f,1.0f,0.0f,0.0f,1.0f,0.0f,0.0f,1.0f,0.0f,0.0f,1.0f}))))
      .setAppearance(new Appearance()
        .setMaterial(new Material("LightBlue").setDiffuseColor(0.3f,0.6f,0.9f))))
    .addComments(" NormalInterpolator keyValue array must match sizes of target Normal vector and key arrays ")
    .addComments(" Thus this keyValue array has 4 * 3 = 12 total SFVec3f triplet values ")
    .addChild(new /*avoid name collision with file name*/org.web3d.x3d.jsail.Interpolation.NormalInterpolator("NormalPath").setKey(new float[] {0.0f,0.5f,1.0f}).setKeyValue(new MFVec3f(new float[] {0.0f,0.0f,1.0f,0.0f,0.0f,1.0f,0.0f,0.0f,1.0f,0.0f,0.0f,1.0f,0.0f,0.0f,1.0f,1.0f,0.0f,0.0f,1.0f,0.0f,0.0f,0.0f,0.0f,1.0f,0.0f,0.0f,1.0f,0.0f,0.0f,1.0f,0.0f,0.0f,1.0f,0.0f,0.0f,1.0f})))
    .addChild(new ROUTE().setFromNode("NormalPath").setFromField("value_changed").setToNode("AnimatedNormalNode").setToField("set_vector"))
    .addChild(new TimeSensor("Clock").setCycleInterval(8).setLoop(true))
    .addChild(new ROUTE().setFromNode("Clock").setFromField("fraction_changed").setToNode("NormalPath").setToField("set_fraction"))
    .addComments(" This block above completes the primary functionality of this scene. More to follow, however! ")
    .addComments(" ============================================================================================================== ")
    .addComments(" Note that a Normal is not rendered - it is invisible. So this scene adds some lines to visualize what is happening. ")
    .addChild(new Shape()
      .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1,2,3,-1,4,5,-1,6,7,-1})
        .setCoord(new Coordinate("NormalVectors").setPoint(new MFVec3f(new float[] {-2.0f,-2.0f,0.0f,-2.0f,-2.0f,1.0f,2.0f,-2.0f,0.0f,2.0f,-2.0f,1.0f,2.0f,2.0f,0.0f,2.0f,2.0f,1.0f,-2.0f,2.0f,0.0f,-2.0f,2.0f,1.0f}))))
      .setAppearance(new Appearance()
        .setMaterial(new Material().setEmissiveColor(0.9f,0.6f,0.1f))))
    .addChild(new CoordinateInterpolator("NormalVectorsAnimation").setKey(new float[] {0.0f,0.5f,1.0f}).setKeyValue(new MFVec3f(new float[] {-2.0f,-2.0f,0.0f,-2.0f,-2.0f,1.0f,2.0f,-2.0f,0.0f,2.0f,-2.0f,1.0f,2.0f,2.0f,0.0f,2.0f,2.0f,1.0f,-2.0f,2.0f,0.0f,-2.0f,2.0f,1.0f,-2.0f,-2.0f,0.0f,-2.0f,-2.0f,1.0f,2.0f,-2.0f,0.0f,3.0f,-2.0f,0.0f,2.0f,2.0f,0.0f,3.0f,2.0f,0.0f,-2.0f,2.0f,0.0f,-2.0f,2.0f,1.0f,-2.0f,-2.0f,0.0f,-2.0f,-2.0f,1.0f,2.0f,-2.0f,0.0f,2.0f,-2.0f,1.0f,2.0f,2.0f,0.0f,2.0f,2.0f,1.0f,-2.0f,2.0f,0.0f,-2.0f,2.0f,1.0f})))
    .addChild(new ROUTE().setFromNode("NormalVectorsAnimation").setFromField("value_changed").setToNode("NormalVectors").setToField("point"))
    .addChild(new ROUTE().setFromNode("Clock").setFromField("fraction_changed").setToNode("NormalVectorsAnimation").setToField("set_fraction")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return NormalInterpolator model
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
        X3D thisExampleX3dModel = new NormalInterpolator().getX3dModel();

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
			System.out.println("WARNING: \"NormalInterpolator\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"NormalInterpolator\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
			System.out.println(validationResults);
		}
    }
}
