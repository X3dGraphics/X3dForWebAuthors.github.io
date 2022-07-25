package X3dForWebAuthors.Chapter03Grouping;

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
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> X Y Z axis arrows and labels in X3D coordinate system. See CoordinateAxesExample for use as an Inline coordinate-system reference frame. </p>
 <p> Related links: <a href="../../../Chapter03Grouping/CoordinateAxesNSEW.java">CoordinateAxesNSEW.java</a> source, <a href="../../../Chapter03Grouping/CoordinateAxesNSEWIndex.html" target="_top">CoordinateAxesNSEW catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter03Grouping/CoordinateAxesNSEW.x3d">CoordinateAxesNSEW.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman and Byounghyun Yoo </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 14 July 2000 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> X Y Z axis arrows and labels in X3D coordinate system. See CoordinateAxesExample for use as an Inline coordinate-system reference frame. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter03Grouping/CoordinateAxesNSEW.png">CoordinateAxesNSEW.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter03Grouping/CoordinateAxesNSEW.WhiteBackground.png">CoordinateAxesNSEW.WhiteBackground.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter03Grouping/CoordinateAxes.x3d">CoordinateAxes.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter03Grouping/CoordinateAxesInlineExample.x3d">CoordinateAxesInlineExample.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxesNSEW.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxesNSEW.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d" target="_blank">https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxesNSEW.x3d" target="_blank">https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxesNSEW.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxesNSEW.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxesNSEW.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/x3d/specifications/ISO-IEC-FDIS-19775-1.2-X3D-AbstractSpecification/Part01/components/geodata.html#GeoLocation" target="_blank">https://www.web3d.org/x3d/specifications/ISO-IEC-FDIS-19775-1.2-X3D-AbstractSpecification/Part01/components/geodata.html#GeoLocation</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter03Grouping/../license.html">../license.html</a> </td>
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

	* @author Don Brutzman and Byounghyun Yoo
 */

public class CoordinateAxesNSEW
{
	/** Default constructor to create this object. */
	public CoordinateAxesNSEW ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("CoordinateAxesNSEW.x3d"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman and Byounghyun Yoo"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("14 July 2000"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("X Y Z axis arrows and labels in X3D coordinate system. See CoordinateAxesExample for use as an Inline coordinate-system reference frame."))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("CoordinateAxesNSEW.png"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("CoordinateAxesNSEW.WhiteBackground.png"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("CoordinateAxes.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("CoordinateAxesInlineExample.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxes.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxesNSEW.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxesNSEW.x3d"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/CoordinateAxesNSEW.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/specifications/ISO-IEC-FDIS-19775-1.2-X3D-AbstractSpecification/Part01/components/geodata.html#GeoLocation"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("CoordinateAxesNSEW.x3d"))
    .addChild(new Collision("DoNotCollideWithVisualizationWidget").setEnabled(false)
      .addComments(" Invoke CoordinateAxes in other scenes as an Inline child inside a scaling Transform node, at the topmost level of the scene graph. ")
      .addComments(" This NavigationInfo allows examine mode and will be overridden by any parent scene. ")
      .addComments(" Each arrow goes from +1m to -1m to allow linear scaling to fit a scene ")
      .addComments(" Note each label rotates about the scene's vertical Y axis for consistency, enabling local orientation by user ")
      .addComments(" From X3D Abstract Specification Section 25.3.3 GeoLocation: \"In addition to placing a X3D model at the correct geospatial location, the GeoLocation node will also adjust the orientation of the model appropriately. The standard X3D coordinate system specifies that the +Y axis = up, +Z = out of the screen, and +X = towards the right. The GeoLocation node will set the orientation so that the +Y axis is the up direction for that local area (the normal to the tangent plane on the ellipsoid), -Z points towards the north pole, and +X is east.\" ")
      .addChild(new Group()
        .addComments(" Vertical Y arrow and label ")
        .addChild(new Group("ArrowGreen")
          .addChild(new Shape()
            .setGeometry(new Cylinder("ArrowCylinder").setBottom(false).setRadius(.025).setTop(false))
            .setAppearance(new Appearance("Green")
              .setMaterial(new Material().setDiffuseColor(.1,.6,.1).setEmissiveColor(.05,.2,.05))))
          .addChild(new Transform().setTranslation(0.0,1.0,0.0)
            .addChild(new Shape()
              .setGeometry(new Cone("ArrowCone").setBottomRadius(.05).setHeight(.1))
              .setAppearance(new Appearance().setUSE("Green")))))
        .addChild(new Transform().setTranslation(0.0,1.08,0.0)
          .addChild(new Billboard()
            .addChild(new Shape()
              .setAppearance(new Appearance("LABEL_APPEARANCE")
                .setMaterial(new Material().setDiffuseColor(1.0,1.0,.3).setEmissiveColor(.33,.33,.1)))
              .setGeometry(new Text().setString(new String[] {"+Y","Up"})
                .setFontStyle(new FontStyle("LABEL_FONT_TOP").setFamily(new String[] {"SANS"}).setJustify(FontStyle.JUSTIFY_MIDDLE_END).setSize(.2))))))
        .addChild(new Transform().setTranslation(0.0,-1.08,0.0)
          .addChild(new Billboard()
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("LABEL_APPEARANCE"))
              .setGeometry(new Text().setString(new String[] {"-Y","Down"})
                .setFontStyle(new FontStyle().setUSE("LABEL_FONT_TOP")))))))
      .addChild(new Transform().setRotation(0.0,0.0,1.0,-1.57079)
        .addComments(" Horizontal X arrow and label ")
        .addChild(new Group()
          .addChild(new Group("ArrowRed")
            .addChild(new Shape()
              .setGeometry(new Cylinder().setUSE("ArrowCylinder"))
              .setAppearance(new Appearance("Red")
                .setMaterial(new Material().setDiffuseColor(.7,.1,.1).setEmissiveColor(.33,0.0,0.0))))
            .addChild(new Transform().setTranslation(0.0,1.0,0.0)
              .addChild(new Shape()
                .setGeometry(new Cone().setUSE("ArrowCone"))
                .setAppearance(new Appearance().setUSE("Red")))))
          .addChild(new Transform().setRotation(0.0,0.0,1.0,1.57079).setTranslation(.072,1.1,0.0)
            .addComments(" note label rotated back to original coordinate frame ")
            .addChild(new Billboard()
              .addChild(new Shape()
                .setAppearance(new Appearance().setUSE("LABEL_APPEARANCE"))
                .setGeometry(new Text().setString(new String[] {"+X","East"})
                  .setFontStyle(new FontStyle("LABEL_FONT").setFamily(new String[] {"SANS"}).setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(.2))))))
          .addChild(new Transform().setRotation(0.0,0.0,1.0,1.57079).setTranslation(.072,-1.1,0.0)
            .addComments(" note label rotated back to original coordinate frame ")
            .addChild(new Billboard()
              .addChild(new Shape()
                .setAppearance(new Appearance().setUSE("LABEL_APPEARANCE"))
                .setGeometry(new Text().setString(new String[] {"-X","West"})
                  .setFontStyle(new FontStyle().setUSE("LABEL_FONT"))))))))
      .addChild(new Transform().setRotation(1.0,0.0,0.0,1.57079)
        .addComments(" Perpendicular Z arrow and label, note right-hand rule ")
        .addChild(new Group()
          .addChild(new Group("ArrowBlue")
            .addChild(new Shape()
              .setGeometry(new Cylinder().setUSE("ArrowCylinder"))
              .setAppearance(new Appearance("Blue")
                .setMaterial(new Material().setDiffuseColor(.3,.3,1.0).setEmissiveColor(.1,.1,.33))))
            .addChild(new Transform().setTranslation(0.0,1.0,0.0)
              .addChild(new Shape()
                .setGeometry(new Cone().setUSE("ArrowCone"))
                .setAppearance(new Appearance().setUSE("Blue")))))
          .addChild(new Transform().setRotation(1.0,0.0,0.0,-1.57079).setTranslation(0.0,1.1,.072)
            .addComments(" note label rotated back to original coordinate frame ")
            .addChild(new Billboard()
              .addChild(new Shape()
                .setAppearance(new Appearance().setUSE("LABEL_APPEARANCE"))
                .setGeometry(new Text().setString(new String[] {"+Z","South"})
                  .setFontStyle(new FontStyle().setUSE("LABEL_FONT"))))))
          .addChild(new Transform().setRotation(1.0,0.0,0.0,-1.57079).setTranslation(0.0,-1.1,.072)
            .addComments(" note label rotated back to original coordinate frame ")
            .addChild(new Billboard()
              .addChild(new Shape()
                .setAppearance(new Appearance().setUSE("LABEL_APPEARANCE"))
                .setGeometry(new Text().setString(new String[] {"-Z","North"})
                  .setFontStyle(new FontStyle().setUSE("LABEL_FONT"))))))))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return CoordinateAxesNSEW model
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
        X3D thisExampleX3dModel = new CoordinateAxesNSEW().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter03Grouping.CoordinateAxesNSEW\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter03Grouping.CoordinateAxesNSEW\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
