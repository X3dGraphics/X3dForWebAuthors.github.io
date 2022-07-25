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
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> One leaf of Kelp moving around a Bulb. Cycle time is 11 seconds, which is twice the cycle time of tank surface motion. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/KelpBulb.java">KelpBulb.java</a> source, <a href="../../../KelpForestExhibit/KelpBulbIndex.html" target="_top">KelpBulb catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/KelpBulb.x3d">KelpBulb.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> One leaf of Kelp moving around a Bulb. Cycle time is 11 seconds, which is twice the cycle time of tank surface motion. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Joseph Cannon, Dan DeVos </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 25 September 1998 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../KelpForestExhibit/KelpPrototype.x3d">KelpPrototype.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://faculty.nps.edu/brutzman/kelp" target="_blank">http://faculty.nps.edu/brutzman/kelp</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf">KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> accessRights </i> </td>
			<td> All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBulb.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBulb.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> Vrml97ToX3dNist, <a href="http://ovrt.nist.gov/v2_x3d.html" target="_blank">http://ovrt.nist.gov/v2_x3d.html</a> </td>
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

	* @author Joseph Cannon, Dan DeVos
 */

public class KelpBulb
{
	/** Default constructor to create this object. */
	public KelpBulb ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("KelpBulb.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("One leaf of Kelp moving around a Bulb. Cycle time is 11 seconds, which is twice the cycle time of tank surface motion."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Joseph Cannon, Dan DeVos"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("25 September 1998"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("KelpPrototype.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://faculty.nps.edu/brutzman/kelp"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpForestDesignPaperWeb3dSymposiumFebruary2002.pdf"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Teaching3d-KelpForestCaseStudy.pdf"))
    .addMeta(new meta().setName(meta.NAME_ACCESSRIGHTS).setContent("All content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBulb.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("KelpBulb.x3d"))
    .addChild(new Group()
      .addChild(new Group()
        .addChild(new Transform().setRotation(0.0,0.0,1.0,1.5707)
          .addChild(new Shape("Stem")
            .setAppearance(new Appearance()
              .setMaterial(new Material("stipeColor").setDiffuseColor(0.882,0.757,0.184)))
            .setGeometry(new Cylinder().setHeight(2.5).setRadius(0.15))))
        .addChild(new Transform().setScale(0.75,0.6,0.6).setTranslation(1.8,0.0,0.0)
          .addChild(new Shape("Bulb")
            .setAppearance(new Appearance()
              .setMaterial(new Material().setUSE("stipeColor")))
            .setGeometry(new Sphere()))))
      .addChild(new LOD("Leaf").setRange(new double[] {90.0})
        .addChild(new Transform()
          .addChild(new Shape("HighResolutionLeaf")
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.694,0.525,0.176)))
            .setGeometry(new Extrusion("BLADE_SHAPE").setBeginCap(false).setCreaseAngle(1.57).setCrossSection(new MFVec2f(new double[] {0.06,1.0,0.06,-1.0,-0.06,-1.0,-0.06,1.0})).setEndCap(false).setOrientation(new MFRotation(new double[] {0.0,1.0,0.0,0.0,0.0,1.0,0.0,0.0,0.0,1.0,0.0,0.2,0.0,1.0,0.0,0.9,0.0,1.0,0.0,0.45,0.0,1.0,0.0,0.0})).setScale(new MFVec2f(new double[] {1.0,0.1,1.0,0.3,1.0,0.55,1.0,0.75,1.0,0.4,1.0,0.01})).setSolid(false).setSpine(new MFVec3f(new double[] {1.9,0.0,0.0,2.5,0.0,0.0,4.0,0.0,0.0,7.0,0.0,0.0,16.0,0.0,0.0,21.0,0.0,0.0})))))
        .addChild(new Transform().setTranslation(1.0,0.0,0.0)
          .addChild(new Shape("LowResolutionLeaf")
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(0.694,0.525,0.176)))
            .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {1,0,9,-1,2,1,9,8,-1,3,2,8,7,-1,4,3,7,6,-1,5,4,6})
              .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {0.0,0.0,0.0,1.0,0.5,0.0,4.0,1.1,0.0,7.0,1.5,0.0,16.0,0.8,0.0,21.0,0.0,0.0,16.0,-0.8,0.0,7.0,-1.5,0.0,4.0,-1.1,0.0,1.0,-0.5,0.0}))))))))
    .addChild(new TimeSensor("ANIMATOR").setCycleInterval(11.0).setLoop(true))
    .addChild(new CoordinateInterpolator("BLADE_MOTION").setKey(new double[] {0.0,0.25,0.5,0.75,1.0}).setKeyValue(new MFVec3f(new double[] {1.9,0.0,0.0,2.5,0.0,0.0,4.0,0.0,0.0,7.0,0.0,0.0,16.0,0.0,0.0,21.0,0.0,0.0,1.9,0.0,0.0,2.5,0.6,0.0,4.0,1.0,0.0,7.0,3.0,0.0,16.0,3.5,0.0,21.0,0.0,0.0,1.9,0.0,0.0,2.5,0.0,0.0,4.0,0.0,0.0,7.0,0.0,0.0,16.0,0.6,0.0,21.0,2.0,0.0,1.9,0.0,0.0,2.5,-0.6,0.0,4.0,-1.0,0.0,7.0,-3.0,0.0,16.0,-3.5,0.0,21.0,0.0,0.0,1.9,0.0,0.0,2.5,0.0,0.0,4.0,0.0,0.0,7.0,0.0,0.0,16.0,0.0,0.0,21.0,0.0,0.0})))
    .addChild(new ROUTE().setFromNode("ANIMATOR").setFromField("fraction_changed").setToNode("BLADE_MOTION").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("BLADE_MOTION").setFromField("value_changed").setToNode("BLADE_SHAPE").setToField("set_spine")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return KelpBulb model
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
        X3D thisExampleX3dModel = new KelpBulb().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.KelpBulb\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.KelpBulb\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
