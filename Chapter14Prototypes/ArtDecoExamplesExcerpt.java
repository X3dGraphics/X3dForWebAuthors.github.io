package X3dForWebAuthors.Chapter14Prototypes;

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
import org.web3d.x3d.jsail.Lighting.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Example ExternProtoDeclare/ProtoInstance usage of X3D/VRML materials, originally converted from SGI's Open Inventor material examples. Excerpted from original. </p>
 <p> Related links: <a href="../../../Chapter14Prototypes/ArtDecoExamplesExcerpt.java">ArtDecoExamplesExcerpt.java</a> source, <a href="../../../Chapter14Prototypes/ArtDecoExamplesExcerptIndex.html" target="_top">ArtDecoExamplesExcerpt catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter14Prototypes/ArtDecoExamplesExcerpt.x3d">ArtDecoExamplesExcerpt.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Example ExternProtoDeclare/ProtoInstance usage of X3D/VRML materials, originally converted from SGI's Open Inventor material examples. Excerpted from original. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> David Roussel </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> James Harney, Don Brutzman NPS </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 7 April 2002 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> TODO </i> </td>
			<td> Xj3D not displaying materials loaded from ExternProtoDeclare ProtoInstance nodes </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://vrmlstuff.free.fr/materials" target="_blank">http://vrmlstuff.free.fr/materials</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> Universal Media Material Library </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials/ArtDecoExamples.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials/ArtDecoExamples.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoExamplesExcerpt.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoExamplesExcerpt.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> Vrml97ToX3dNist, <a href="http://ovrt.nist.gov/v2_x3d.html" target="_blank">http://ovrt.nist.gov/v2_x3d.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter14Prototypes/../license.html">../license.html</a> </td>
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

	* @author David Roussel
 */

public class ArtDecoExamplesExcerpt
{
	/** Default constructor to create this object. */
	public ArtDecoExamplesExcerpt ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("ArtDecoExamplesExcerpt.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Example ExternProtoDeclare/ProtoInstance usage of X3D/VRML materials, originally converted from SGI's Open Inventor material examples. Excerpted from original."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David Roussel"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("James Harney, Don Brutzman NPS"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("7 April 2002"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_TODO       ).setContent("Xj3D not displaying materials loaded from ExternProtoDeclare ProtoInstance nodes"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://vrmlstuff.free.fr/materials"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("Universal Media Material Library"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials/ArtDecoExamples.x3d"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoExamplesExcerpt.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addComments(" Note that these url address references were changed from original collection in Basic X3D Examples Archive and instead reference local excerpt ")
    .addChild(new WorldInfo().setTitle("ArtDecoExamplesExcerpt.x3d"))
    .addChild(new ExternProtoDeclare("ArtDeco00").setName("ArtDeco00").setAppinfo("UniversalMediaMaterials prototype").setDocumentation("https://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials").setUrl(new String[] {"ArtDecoPrototypesExcerpt.x3d#ArtDeco00","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.x3d#ArtDeco00","ArtDecoPrototypesExcerpt.wrl#ArtDeco00","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.wrl#ArtDeco00"}))
    .addChild(new ExternProtoDeclare("ArtDeco01").setName("ArtDeco01").setAppinfo("UniversalMediaMaterials prototype").setDocumentation("https://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials").setUrl(new String[] {"ArtDecoPrototypesExcerpt.x3d#ArtDeco01","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.x3d#ArtDeco01","ArtDecoPrototypesExcerpt.wrl#ArtDeco01","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.wrl#ArtDeco01"}))
    .addChild(new ExternProtoDeclare("ArtDeco02").setName("ArtDeco02").setAppinfo("UniversalMediaMaterials prototype").setDocumentation("https://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials").setUrl(new String[] {"ArtDecoPrototypesExcerpt.x3d#ArtDeco02","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.x3d#ArtDeco02","ArtDecoPrototypesExcerpt.wrl#ArtDeco02","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.wrl#ArtDeco02"}))
    .addChild(new Group()
      .addChild(new NavigationInfo().setHeadlight(false))
      .addChild(new Viewpoint("Front").setDescription("Front view").setPosition(0.0,0.0,12.0))
      .addChild(new Viewpoint("PersRight").setDescription("Low Right").setOrientation(0.74291,0.30772,0.59447,1.2171).setPosition(6.9282,-6.9282,6.9282))
      .addChild(new Viewpoint("PersLeft").setDescription("Low Left").setOrientation(0.74291,-0.30772,-0.59447,1.2171).setPosition(-6.9282,-6.9282,6.9282))
      .addChild(new Viewpoint("Back").setDescription("Back view").setOrientation(0.0,1.0,0.0,3.1416).setPosition(0.0,0.0,-12.0))
      .addChild(new Transform("Close_travel")
        .addChild(new PositionInterpolator("Close_Mover").setKey(new double[] {0.0,0.25,0.5,0.75,1.0}).setKeyValue(new MFVec3f(new double[] {0.0,2.5,0.0,0.0,0.0,0.0,0.0,-2.5,0.0,0.0,0.0,0.0,0.0,2.5,0.0})))
        .addChild(new TimeSensor("Close_Time").setCycleInterval(12.0).setLoop(true))
        .addChild(new Viewpoint("Close").setDescription("Close Front").setPosition(0.0,0.0,6.0)))
      .addChild(new DirectionalLight().setDirection(1.0,-1.0,-1.0))
      .addChild(new DirectionalLight().setDirection(0.0,1.0,-0.5).setIntensity(0.5))
      .addChild(new Anchor().setDescription("Back to front view").setUrl(new String[] {"#Front"})
        .addChild(new Transform().setTranslation(0.0,0.0,-0.5)
          .addChild(new Inline().setUrl(new String[] {"../../Basic/UniversalMediaMaterials/gridBack.x3d","https://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials/gridBack.x3d","../../Basic/UniversalMediaMaterials/gridBack.wrl","https://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials/gridBack.wrl"}))))
      .addChild(new Viewpoint("View00").setDescription("ArtDeco00").setPosition(-3.75,3.75,3.0))
      .addChild(new Transform().setTranslation(-3.75,3.75,0.0)
        .addChild(new Anchor().setDescription("ArtDeco00 view").setUrl(new String[] {"#View00"})
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new ProtoInstance("ArtDeco00").setContainerField("material")))
            .setGeometry(new Sphere("Ball").setRadius(0.5))))
        .addChild(new Transform().setTranslation(0.0,0.3,0.5)
          .addChild(new Anchor().setDescription("ArtDeco").setParameter(new String[] {"target=_source"}).setUrl(new String[] {"ArtDecoPrototypesExcerpt.html#ProtoDeclare_ArtDeco00","https://www.web3d.org/x3d/content/examples/Basic/UniversalMediaMaterials/ArtDecoPrototypesExcerpt.html#ProtoDeclare_ArtDeco"})
            .addChild(new Shape()
              .setAppearance(new Appearance()
                .setMaterial(new Material("TextMat").setDiffuseColor(1.0,1.0,1.0)))
              .setGeometry(new Text().setString(new String[] {"ArtDeco00"})
                .setFontStyle(new FontStyle("Style").setFamily(new String[] {"SANS"}).setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.3).setCssStyle("BOLD")))))))
      .addChild(new Viewpoint("View01").setDescription("ArtDeco01").setPosition(-2.25,3.75,3.0))
      .addChild(new Transform().setTranslation(-2.25,3.75,0.0)
        .addChild(new Anchor().setDescription("ArtDeco01 view").setUrl(new String[] {"#View01"})
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new ProtoInstance("ArtDeco01").setContainerField("material")))
            .setGeometry(new Sphere().setUSE("Ball"))))
        .addChild(new Transform().setTranslation(0.0,0.3,0.5)
          .addChild(new Anchor().setDescription("ArtDeco01").setParameter(new String[] {"target=_source"}).setUrl(new String[] {"ArtDecoPrototypesExcerpt.html#ProtoDeclare_ArtDeco01","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.html#ProtoDeclare_ArtDeco01"})
            .addChild(new Shape()
              .setAppearance(new Appearance()
                .setMaterial(new Material().setUSE("TextMat")))
              .setGeometry(new Text().setString(new String[] {"ArtDeco01"})
                .setFontStyle(new FontStyle().setUSE("Style")))))))
      .addChild(new Viewpoint("View02").setDescription("ArtDeco02").setPosition(-0.75,3.75,3.0))
      .addChild(new Transform().setTranslation(-0.75,3.75,0.0)
        .addChild(new Anchor().setDescription("ArtDeco02 view").setUrl(new String[] {"#View02"})
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setMaterial(new ProtoInstance("ArtDeco02").setContainerField("material")))
            .setGeometry(new Sphere().setUSE("Ball"))))
        .addChild(new Transform().setTranslation(0.0,0.3,0.5)
          .addChild(new Anchor().setDescription("ArtDeco02").setParameter(new String[] {"target=_source"}).setUrl(new String[] {"ArtDecoPrototypesExcerpt.html#ProtoDeclare_ArtDeco02","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/ArtDecoPrototypesExcerpt.html#ProtoDeclare_ArtDeco02"})
            .addChild(new Shape()
              .setAppearance(new Appearance()
                .setMaterial(new Material().setUSE("TextMat")))
              .setGeometry(new Text().setString(new String[] {"ArtDeco02"})
                .setFontStyle(new FontStyle().setUSE("Style"))))))))
    .addChild(new ROUTE().setFromNode("Close_Time").setFromField("fraction_changed").setToNode("Close_Mover").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Close_Mover").setFromField("value_changed").setToNode("Close_travel").setToField("set_translation")));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return ArtDecoExamplesExcerpt model
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
        X3D thisExampleX3dModel = new ArtDecoExamplesExcerpt().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter14Prototypes.ArtDecoExamplesExcerpt\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter14Prototypes.ArtDecoExamplesExcerpt\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
