package X3dForWebAuthors.Chapter09EventUtilitiesScripting;

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
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Simple Javascript animation of ElevationGrid. </p>
 <p> Related links: <a href="../../../Chapter09EventUtilitiesScripting/ElevationGridSimpleWaveAnimation.java">ElevationGridSimpleWaveAnimation.java</a> source, <a href="../../../Chapter09EventUtilitiesScripting/ElevationGridSimpleWaveAnimationIndex.html" target="_top">ElevationGridSimpleWaveAnimation catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter09EventUtilitiesScripting/ElevationGridSimpleWaveAnimation.x3d">ElevationGridSimpleWaveAnimation.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Simple Javascript animation of ElevationGrid </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 2 December 2012 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter09EventUtilitiesScripting/ElevationGridSimpleWaveAnimation.png">ElevationGridSimpleWaveAnimation.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/ElevationGridSimpleWaveAnimation.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/ElevationGridSimpleWaveAnimation.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter09EventUtilitiesScripting/../license.html">../license.html</a> </td>
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

public class ElevationGridSimpleWaveAnimation
{
	/** Default constructor to create this object. */
	public ElevationGridSimpleWaveAnimation ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("ElevationGridSimpleWaveAnimation.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Simple Javascript animation of ElevationGrid"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("2 December 2012"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("ElevationGridSimpleWaveAnimation.png"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/ElevationGridSimpleWaveAnimation.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("ElevationGridSimpleWaveAnimation.x3d"))
    .addChild(new Viewpoint().setDescription("Wave view").setOrientation(1.0,0.0,0.0,-0.358771).setPosition(0.0,3.0,8.0))
    .addChild(new Background().setGroundColor(new MFColor(new double[] {1.0,1.0,1.0})).setSkyColor(new MFColor(new double[] {1.0,1.0,1.0})))
    .addComments(" Shift zero-based ElevationGrid to left, centering it ")
    .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
      .addChild(new Shape()
        .setGeometry(new ElevationGrid("GridSurface").setSolid(false).setXDimension(9).setZDimension(3).setHeight(new double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0}))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,0.5,1.0)))))
    .addChild(new TimeSensor("Clock").setCycleInterval(5).setLoop(true))
    .addChild(new Script("WaveGenerationScript").setSourceCode("""
ecmascript:

function newInputValue (eventValue)
{
   fraction = eventValue; // connected by ROUTE, receives values from TimeSensor Clock fraction_changed
   
   value0 = 0.2 * Math.sin (2 * Math.PI * (fraction - 4*waveStep));
   value1 = 0.2 * Math.sin (2 * Math.PI * (fraction - 3*waveStep));
   value2 = 0.2 * Math.sin (2 * Math.PI * (fraction - 2*waveStep));
   value3 = 0.2 * Math.sin (2 * Math.PI * (fraction -   waveStep));
   value4 = 0.2 * Math.sin (2 * Math.PI * (fraction             ));
   value5 = 0.2 * Math.sin (2 * Math.PI * (fraction +   waveStep));
   value6 = 0.2 * Math.sin (2 * Math.PI * (fraction + 2*waveStep));
   value7 = 0.2 * Math.sin (2 * Math.PI * (fraction + 3*waveStep));
   value8 = 0.2 * Math.sin (2 * Math.PI * (fraction + 4*waveStep));
   
   // setting the gridOutput value creates an output event that is connected via ROUTE to the ElevationGrid set_height field.
   // note that types match (MFFloat) and accessTypes also match (output_only connects to inputOnly).
   gridOutput = new MFFloat (
		value0, value1, value2, value3, value4, value5, value6, value7, value8,
		value0, value1, value2, value3, value4, value5, value6, value7, value8,
		value0, value1, value2, value3, value4, value5, value6, value7, value8 );
}
""")
      .addField(new field().setName("newInputValue").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("provide value and trigger new computation"))
      .addField(new field().setName("gridOutput").setType(field.TYPE_MFFLOAT).setAccessType(field.ACCESSTYPE_OUTPUTONLY).setAppinfo("provide values to ElevationGrid"))
      .addField(new field().setName("waveStep").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(0.1).setAppinfo("wave variation")))
    .addChild(new ROUTE().setFromNode("Clock").setFromField("fraction_changed").setToNode("WaveGenerationScript").setToField("newInputValue"))
    .addChild(new ROUTE().setFromNode("WaveGenerationScript").setFromField("gridOutput").setToNode("GridSurface").setToField("set_height")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return ElevationGridSimpleWaveAnimation model
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
        X3D thisExampleX3dModel = new ElevationGridSimpleWaveAnimation().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter09EventUtilitiesScripting.ElevationGridSimpleWaveAnimation\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter09EventUtilitiesScripting.ElevationGridSimpleWaveAnimation\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
