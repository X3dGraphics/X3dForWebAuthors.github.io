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
import org.web3d.x3d.jsail.EnvironmentalSensor.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Example multiple ProximitySensor non-overlapping regions. </p>
 <p> Related links: <a href="../../../Chapter12EnvironmentSensorSound/ProximitySensorMultiple.java">ProximitySensorMultiple.java</a> source, <a href="../../../Chapter12EnvironmentSensorSound/ProximitySensorMultipleIndex.html" target="_top">ProximitySensorMultiple catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter12EnvironmentSensorSound/ProximitySensorMultiple.x3d">ProximitySensorMultiple.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Example multiple ProximitySensor non-overlapping regions </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Leonard Daly and Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 15 July 2006 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter12EnvironmentSensorSound/ProximitySensorNoOverlap.x3d">ProximitySensorNoOverlap.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter12EnvironmentSensorSound/ProximitySensorOverlap.x3d">ProximitySensorOverlap.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter12EnvironmentSensorSound/ProximitySensorSingle.x3d">ProximitySensorSingle.x3d</a> </td>
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
			<td style="text-align:right; vertical-align: text-top;"> <i> rights </i> </td>
			<td> Copyright Don Brutzman and Leonard Daly 2007 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D book, X3D graphics, X3D-Edit, <a href="http://www.x3dGraphics.com" target="_blank">http://www.x3dGraphics.com</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/ProximitySensorMultiple.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/ProximitySensorMultiple.x3d</a> </td>
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

	* @author Leonard Daly and Don Brutzman
 */

public class ProximitySensorMultiple
{
	/** Default constructor to create this object. */
	public ProximitySensorMultiple ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("ProximitySensorMultiple.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Example multiple ProximitySensor non-overlapping regions"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Leonard Daly and Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("15 July 2006"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("ProximitySensorNoOverlap.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("ProximitySensorOverlap.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("ProximitySensorSingle.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_RIGHTS     ).setContent("Copyright Don Brutzman and Leonard Daly 2007"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/ProximitySensorMultiple.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("ProximitySensorMultiple.x3d"))
    .addChild(new ExternProtoDeclare("WhereAmI").setName("WhereAmI").setUrl(new String[] {"../Chapter14Prototypes/WhereAmIPrototype.x3d#WhereAmI","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/WhereAmIPrototype.x3d#WhereAmI","../Chapter14Prototypes/WhereAmIPrototype.wrl#WhereAmI","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/WhereAmI.wrl#WhereAmI"}))
    .addChild(new ProtoInstance("WhereAmI").setContainerField("children"))
    .addChild(new Viewpoint().setDescription("Book Viewpoint").setOrientation(0.0,1.0,0.0,-0.06).setPosition(0.05,0.0,8.71))
    .addChild(new NavigationInfo().setAvatarSize(new double[] {0.05,1.6,0.75}).setType("\"WALK\" \"ANY\""))
    .addChild(new Background().setSkyColor(new MFColor(new double[] {1.0,1.0,1.0})))
    .addChild(new Collision().setEnabled(false)
      .addChild(new Transform()
        .addChild(new Viewpoint().setDescription("Inside proximity box 1").setOrientation(0.0,1.0,0.0,-0.78).setPosition(0.0,0.0,0.5))
        .addChild(new ProximitySensor("HereIAm1").setSize(2.0,2.0,2.0))
        .addChild(new Transform("SensorSize")
          .addChild(new Shape("BoxOutline")
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(0.8,0.8,0.8)))
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,2,3,0,-1,4,5,6,7,4,-1,0,4,-1,1,5,-1,2,6,-1,3,7,-1})
              .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {1.0,1.0,1.0,1.0,1.0,-1.0,1.0,-1.0,-1.0,1.0,-1.0,1.0,-1.0,1.0,1.0,-1.0,1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,1.0})))))
          .addChild(new Shape("BoxSurface")
            .setAppearance(new Appearance()
              .setMaterial(new Material().setDiffuseColor(1.0,.5,0.0).setTransparency(.8)))
            .setGeometry(new Box())))))
    .addChild(new Collision().setEnabled(false)
      .addChild(new Transform().setRotation(.707,.707,0.0,1.0).setTranslation(3.0,1.0,2.0)
        .addChild(new Viewpoint().setDescription("Inside proximity box 2").setOrientation(0.0,1.0,0.0,-0.78).setPosition(0.0,0.0,0.5))
        .addChild(new ProximitySensor("HereIAm2").setSize(2.0,2.0,2.0))
        .addChild(new Transform().setUSE("SensorSize"))))
    .addChild(new Collision().setEnabled(false)
      .addChild(new Transform().setTranslation(-1.0,.5,-.5)
        .addChild(new Viewpoint().setDescription("Inside proximity box 3").setOrientation(0.0,1.0,0.0,-0.78).setPosition(0.0,0.0,0.5))
        .addChild(new ProximitySensor("HereIAm3").setSize(2.0,2.0,2.0))
        .addChild(new Transform().setUSE("SensorSize"))))
    .addChild(new Collision().setEnabled(false)
      .addChild(new Transform().setTranslation(-2.0,-1.0,.5)
        .addChild(new Viewpoint().setDescription("Inside proximity box 4").setOrientation(0.0,1.0,0.0,-0.78).setPosition(0.0,0.0,0.5))
        .addChild(new ProximitySensor("HereIAm4").setSize(2.0,2.0,2.0))
        .addChild(new Transform().setUSE("SensorSize"))))
    .addChild(new Script("LocationReport").setUrl(new String[] {"ProximitySensorSingleScriptLocationReport.js","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12EnvironmentSensorSound/ProximitySensorSingleScriptLocationReport.js"})
      .addField(new field().setName("position").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTONLY))
      .addField(new field().setName("orientation").setType(field.TYPE_SFROTATION).setAccessType(field.ACCESSTYPE_INPUTONLY)))
    .addChild(new ROUTE().setFromNode("HereIAm1").setFromField("position_changed").setToNode("LocationReport").setToField("position"))
    .addChild(new ROUTE().setFromNode("HereIAm2").setFromField("position_changed").setToNode("LocationReport").setToField("position"))
    .addChild(new ROUTE().setFromNode("HereIAm3").setFromField("position_changed").setToNode("LocationReport").setToField("position"))
    .addChild(new ROUTE().setFromNode("HereIAm4").setFromField("position_changed").setToNode("LocationReport").setToField("position"))
    .addChild(new ROUTE().setFromNode("HereIAm1").setFromField("orientation_changed").setToNode("LocationReport").setToField("orientation"))
    .addChild(new ROUTE().setFromNode("HereIAm2").setFromField("orientation_changed").setToNode("LocationReport").setToField("orientation"))
    .addChild(new ROUTE().setFromNode("HereIAm3").setFromField("orientation_changed").setToNode("LocationReport").setToField("orientation"))
    .addChild(new ROUTE().setFromNode("HereIAm4").setFromField("orientation_changed").setToNode("LocationReport").setToField("orientation")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return ProximitySensorMultiple model
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
        X3D thisExampleX3dModel = new ProximitySensorMultiple().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter12EnvironmentSensorSound.ProximitySensorMultiple\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter12EnvironmentSensorSound.ProximitySensorMultiple\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
