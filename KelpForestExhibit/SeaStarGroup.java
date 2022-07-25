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
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Shape.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> SeaStar used in the kelp forest project. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/SeaStarGroup.java">SeaStarGroup.java</a> source, <a href="../../../KelpForestExhibit/SeaStarGroupIndex.html" target="_top">SeaStarGroup catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/SeaStarGroup.x3d">SeaStarGroup.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> SeaStar used in the kelp forest project </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Karl Tenney </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Scott Tufts </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 1 June 1998 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translated </i> </td>
			<td> 13 December 2001 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarGroup.x3d" target="_blank">https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarGroup.x3d</a> </td>
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

	* @author Karl Tenney
 */

public class SeaStarGroup
{
	/** Default constructor to create this object. */
	public SeaStarGroup ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("SeaStarGroup.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("SeaStar used in the kelp forest project"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Karl Tenney"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Scott Tufts"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 June 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("13 December 2001"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarGroup.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new Transform("Stars")
      .addChild(new LOD().setRange(new double[] {25.0})
        .addChild(new Transform().setRotation(0.00284295,-0.117658,-0.99305,1.40621).setScale(0.501645,0.501645,0.501645).setScaleOrientation(0.599706,0.727936,-0.332359,0.508576).setTranslation(-0.812513,0.185385,-0.905324)
          .addChild(new Transform().setRotation(0.749116,-0.639071,0.174397,2.97944).setScaleOrientation(0.49262,-0.0627393,-0.86798,0.83046).setTranslation(-0.792837,0.269129,-1.06333)
            .addChild(new Transform("_O").setScale(0.659575,0.659575,0.659575).setTranslation(0.609729,0.00350194,-0.205184)
              .addChild(new Transform().setRotation(-1.14191e-007,-1,-5.32201e-006,0.814114).setScale(0.0276058,0.0102856,0.0774523).setTranslation(-0.0454274,0.0102855,0.0416858)
                .addChild(new Shape()
                  .setAppearance(new Appearance()
                    .setMaterial(new Material("_1").setAmbientIntensity(0.25)))
                  .setGeometry(new Sphere())))
              .addChild(new Transform().setRotation(1.6646e-007,1,6.79179e-007,0.915243).setScale(0.0276058,0.0102856,0.118301).setTranslation(-0.0731081,0.0102856,-0.047631)
                .addChild(new Shape()
                  .setAppearance(new Appearance()
                    .setMaterial(new Material().setUSE("_1")))
                  .setGeometry(new Sphere())))
              .addChild(new Transform().setScale(0.0276058,0.0102856,0.118301).setTranslation(-1.21519e-009,0.0102856,-0.086997)
                .addChild(new Shape()
                  .setAppearance(new Appearance()
                    .setMaterial(new Material().setUSE("_1")))
                  .setGeometry(new Sphere())))
              .addChild(new Transform().setRotation(7.02699e-008,1,-9.67549e-009,4.71239).setScale(0.0276058,0.0102856,0.118301).setTranslation(0.0943676,0.0102856,-9.2235e-010)
                .addChild(new Shape()
                  .setAppearance(new Appearance()
                    .setMaterial(new Material().setUSE("_1")))
                  .setGeometry(new Sphere())))
              .addChild(new Transform().setRotation(-2.28035e-007,1,-1.9708e-007,0.399743).setScale(0.0276058,0.0102856,0.118301).setTranslation(0.0273156,0.0102856,0.0869062)
                .addChild(new Shape()
                  .setAppearance(new Appearance()
                    .setMaterial(new Material().setUSE("_1")))
                  .setGeometry(new Sphere())))
              .addChild(new Transform().setRotation(1.74007e-006,-1,-1.7261e-007,0.240595).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.12392,0.00994368,0.0707975)
                .addChild(new Shape()
                  .setAppearance(new Appearance()
                    .setMaterial(new Material().setUSE("_1")))
                  .setGeometry(new Sphere())))))
          .addChild(new Transform().setRotation(0.00284286,-0.117657,-0.99305,1.40621).setScaleOrientation(0.510123,-0.709858,0.48567,0.155947).setTranslation(-1.13874,1.52467,-0.123565)
            .addChild(new Transform().setUSE("_O")))
          .addChild(new Transform().setRotation(0.528326,0.818819,0.224514,3.53479).setScaleOrientation(0.448831,0.876981,-0.171628,1.58567).setTranslation(-0.629386,0.0675117,-1.5183)
            .addChild(new Transform().setUSE("_O")))
          .addChild(new Transform().setRotation(0.486797,0.486306,0.725628,4.34197).setScaleOrientation(0.0307922,0.0594577,0.997756,3.92155).setTranslation(-0.80193,0.586843,-0.848469)
            .addChild(new Transform().setUSE("_O")))
          .addChild(new Transform().setRotation(0.0028429,-0.117657,-0.99305,1.40621).setScale(0.521406,0.521406,0.521406).setScaleOrientation(0.973919,-0.14782,-0.172137,0.289729).setTranslation(-0.861705,-0.0343103,0.030513)
            .addChild(new Transform("_2").setRotation(0.00284286,-0.117657,-0.99305,1.40621).setScaleOrientation(0.510123,-0.709858,0.48567,0.155947).setTranslation(-0.85937,0.397126,-0.511331)
              .addChild(new Transform().setRotation(0.48655,0.87342,-0.0201627,1.21112).setScale(0.709989,0.709989,0.709989).setTranslation(-0.194527,-0.18028,0.656123)
                .addChild(new Transform().setScale(0.659575,0.659575,0.659575).setTranslation(0.609729,0.00350194,-0.205184)
                  .addChild(new Transform().setRotation(-1.14191e-007,-1,-5.32201e-006,0.814114).setScale(0.0276058,0.0102856,0.0774523).setTranslation(-0.0454274,0.0102855,0.0416858)
                    .addChild(new Shape()
                      .setAppearance(new Appearance()
                        .setMaterial(new Material("_3").setAmbientIntensity(0.25).setDiffuseColor(0.8,0.51,0.09).setShininess(0.4).setSpecularColor(0.92,0.43,0.01)))
                      .setGeometry(new Sphere())))
                  .addChild(new Transform().setRotation(1.6646e-007,1,6.79179e-007,0.915243).setScale(0.0276058,0.0102856,0.118301).setTranslation(-0.0731081,0.0102856,-0.047631)
                    .addChild(new Shape()
                      .setAppearance(new Appearance()
                        .setMaterial(new Material().setUSE("_3")))
                      .setGeometry(new Sphere())))
                  .addChild(new Transform().setScale(0.0276058,0.0102856,0.118301).setTranslation(-1.21519e-009,0.0102856,-0.086997)
                    .addChild(new Shape()
                      .setAppearance(new Appearance()
                        .setMaterial(new Material().setUSE("_3")))
                      .setGeometry(new Sphere())))
                  .addChild(new Transform().setRotation(7.02699e-008,1,-9.67549e-009,4.71239).setScale(0.0276058,0.0102856,0.118301).setTranslation(0.0943676,0.0102856,-9.2235e-010)
                    .addChild(new Shape()
                      .setAppearance(new Appearance()
                        .setMaterial(new Material().setUSE("_3")))
                      .setGeometry(new Sphere())))
                  .addChild(new Transform().setRotation(-2.28035e-007,1,-1.9708e-007,0.399743).setScale(0.0276058,0.0102856,0.118301).setTranslation(0.0273156,0.0102856,0.0869062)
                    .addChild(new Shape()
                      .setAppearance(new Appearance()
                        .setMaterial(new Material().setUSE("_3")))
                      .setGeometry(new Sphere())))
                  .addChild(new Transform().setRotation(1.74007e-006,-1,-1.7261e-007,0.240595).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.12392,0.00994368,0.0707975)
                    .addChild(new Shape()
                      .setAppearance(new Appearance()
                        .setMaterial(new Material().setUSE("_3")))
                      .setGeometry(new Sphere()))))))
            .addChild(new Transform().setRotation(0.758872,-0.613643,-0.218072,3.62512).setScaleOrientation(0.183361,0.515897,-0.836797,0.680897).setTranslation(-0.785972,-0.272973,0.109283)
              .addChild(new Transform().setUSE("_2")))
            .addChild(new Transform().setRotation(0.0160324,0.999622,0.0223337,0.494856).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.359698,0.00994363,1.36377)
              .addChild(new Shape("SeaStar_leg_4")
                .setAppearance(new Appearance()
                  .setMaterial(new Material("_4").setAmbientIntensity(0.252747).setDiffuseColor(0.91,0.44,0.35).setSpecularColor(0.35,0.14,0.0)))
                .setGeometry(new Sphere())))
            .addChild(new Transform().setScale(0.0276058,0.0102856,0.0691647).setTranslation(-0.45535,0.0102856,1.22615)
              .addChild(new Shape().setUSE("SeaStar_leg_4")))
            .addChild(new Transform().setRotation(6.36314e-008,1,-7.41821e-009,0.631741).setScale(0.0276058,0.0102856,0.0691647).setTranslation(-0.426702,0.0102856,1.34188)
              .addChild(new Shape().setUSE("SeaStar_leg_4")))
            .addChild(new Transform().setRotation(-2.40082e-007,-1,3.43709e-007,0.712123).setScale(0.0276058,0.0102856,0.0691647).setTranslation(-0.5,0.0102856,1.32509)
              .addChild(new Shape().setUSE("SeaStar_leg_4")))
            .addChild(new Transform().setRotation(1.85515e-008,-1,-1.05709e-007,0.919461).setScale(0.0276058,0.0102856,0.0691647).setTranslation(-0.39858,0.0102856,1.25)
              .addChild(new Shape().setUSE("SeaStar_leg_4")))
            .addChild(new Transform().setRotation(3.53588e-007,1,1.0134e-006,0.84627).setScale(0.0276058,0.0102856,0.0691647).setTranslation(-0.5,0.0102858,1.25)
              .addChild(new Shape().setUSE("SeaStar_leg_4")))
            .addChild(new Transform().setRotation(1.48158e-008,1,-3.7903e-008,1.57079).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.364396,0.00994358,1.19351)
              .addChild(new Shape().setUSE("SeaStar_leg_4")))
            .addChild(new Transform()
              .addChild(new Transform().setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.569653,0.00994355,1.21309)
                .addChild(new Shape().setUSE("SeaStar_leg_4")))
              .addChild(new Transform().setRotation(4.05455e-007,-1,1.915e-007,1.02836).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.464063,0.00994362,1.1596)
                .addChild(new Shape().setUSE("SeaStar_leg_4")))
              .addChild(new Transform().setRotation(-5.59581e-009,-1,-9.59606e-009,0.878147).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.510391,0.00994369,1.40221)
                .addChild(new Shape().setUSE("SeaStar_leg_4")))))
          .addChild(new Transform("_5").setTranslation(0.46739,-3.72529e-009,-1.27889)
            .addChild(new Transform().setRotation(0.0160324,0.999622,0.0223337,0.494856).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.359698,0.00994363,1.36377)
              .addChild(new Shape("_6")
                .setAppearance(new Appearance()
                  .setMaterial(new Material().setAmbientIntensity(0.252747).setDiffuseColor(0.91,0.44,0.35).setShininess(0.13).setSpecularColor(0.35,0.14,0.0)))
                .setGeometry(new Sphere())))
            .addChild(new Transform().setScale(0.0276058,0.0102856,0.0691647).setTranslation(-0.45535,0.0102856,1.22615)
              .addChild(new Shape().setUSE("_6")))
            .addChild(new Transform().setRotation(6.36314e-008,1,-7.41821e-009,0.631741).setScale(0.0276058,0.0102856,0.0691647).setTranslation(-0.426702,0.0102856,1.34188)
              .addChild(new Shape().setUSE("_6")))
            .addChild(new Transform().setRotation(-2.40082e-007,-1,3.43709e-007,0.712123).setScale(0.0276058,0.0102856,0.0691647).setTranslation(-0.5,0.0102856,1.32509)
              .addChild(new Shape().setUSE("_6")))
            .addChild(new Transform().setRotation(1.85515e-008,-1,-1.05709e-007,0.919461).setScale(0.0276058,0.0102856,0.0691647).setTranslation(-0.39858,0.0102856,1.25)
              .addChild(new Shape().setUSE("_6")))
            .addChild(new Transform().setRotation(3.53588e-007,1,1.0134e-006,0.84627).setScale(0.0276058,0.0102856,0.0691647).setTranslation(-0.5,0.0102858,1.25)
              .addChild(new Shape().setUSE("_6")))
            .addChild(new Transform().setRotation(1.48158e-008,1,-3.7903e-008,1.57079).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.364396,0.00994358,1.19351)
              .addChild(new Shape().setUSE("_6")))
            .addChild(new Transform().setRotation(0.0160324,0.999622,0.0223337,0.494856).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.359698,0.00994363,1.36377)
              .addChild(new Shape().setUSE("_6")))
            .addChild(new Transform()
              .addChild(new Transform().setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.569653,0.00994355,1.21309)
                .addChild(new Shape().setUSE("_6"))))
            .addChild(new Transform().setRotation(4.05455e-007,-1,1.915e-007,1.02836).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.464063,0.00994362,1.1596)
              .addChild(new Shape().setUSE("_6")))
            .addChild(new Transform().setRotation(-5.59581e-009,-1,-9.59606e-009,0.878147).setScale(0.0564878,0.00994367,0.0245735).setTranslation(-0.510391,0.00994369,1.40221)
              .addChild(new Shape().setUSE("_6")))))
        .addChild(new WorldInfo().setInfo(new String[] {"null node"})))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return SeaStarGroup model
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
        X3D thisExampleX3dModel = new SeaStarGroup().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.SeaStarGroup\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.SeaStarGroup\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
