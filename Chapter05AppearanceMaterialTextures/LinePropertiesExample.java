package X3dForWebAuthors.Chapter05AppearanceMaterialTextures;

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
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Demonstrate each of the various LineProperties enumeration values. </p>
 <p> Related links: <a href="../../../Chapter05AppearanceMaterialTextures/LinePropertiesExample.java">LinePropertiesExample.java</a> source, <a href="../../../Chapter05AppearanceMaterialTextures/LinePropertiesExampleIndex.html" target="_top">LinePropertiesExample catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter05AppearanceMaterialTextures/LinePropertiesExample.x3d">LinePropertiesExample.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Demonstrate each of the various LineProperties enumeration values. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 20 August 2008 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 26 July 2021 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter05AppearanceMaterialTextures/LinePropertiesLinetypeExample.png">LinePropertiesLinetypeExample.png</a> </td>
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
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D book, X3D graphics, X3D-Edit, <a href="http://www.x3dGraphics.com" target="_blank">http://www.x3dGraphics.com</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/LinePropertiesExample.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/LinePropertiesExample.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter05AppearanceMaterialTextures/../license.html">../license.html</a> </td>
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

public class LinePropertiesExample
{
	/** Default constructor to create this object. */
	public LinePropertiesExample ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addComments(" The following component tag is needed since LineProperties node is not part of the default Immersive profile ")
    .addComponent(new component().setName("Shape").setLevel(2))
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("LinePropertiesExample.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Demonstrate each of the various LineProperties enumeration values."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("20 August 2008"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("26 July 2021"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("LinePropertiesLinetypeExample.png"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/LinePropertiesExample.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("LineProperties.x3d"))
    .addChild(new Viewpoint().setDescription("LineProperties linetype examples").setPosition(0.0,0.0,22.0))
    .addChild(new Transform().setTranslation(1.0,-6.0,0.0)
      .addChild(new Transform().setTranslation(-4.0,14.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"1 Solid"})
            .setFontStyle(new FontStyle("LeftJustify").setJustify(FontStyle.JUSTIFY_BEGIN_MIDDLE)))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.0,0.0))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1})
              .setCoord(new Coordinate("Segment").setPoint(new MFVec3f(new double[] {0.0,0.0,0.0,2.0,0.0,0.0}))))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(1.0,0.0,0.0))
              .setLineProperties(new LineProperties()
                .addComments(" linetype='1' solid "))))))
      .addChild(new Transform().setTranslation(-4.0,13.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"2 Dashed"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.5,0.0))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
              .setCoord(new Coordinate().setUSE("Segment")))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(1.0,0.5,0.0))
              .setLineProperties(new LineProperties().setLinetype(2)
                .addComments(" linetype='2' dashed "))))))
      .addChild(new Transform().setTranslation(-4.0,12.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"3 Dotted"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,1.0,0.0))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
              .setCoord(new Coordinate().setUSE("Segment")))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(1.0,1.0,0.0))
              .setLineProperties(new LineProperties().setLinetype(3)
                .addComments(" linetype='3' dotted "))))))
      .addChild(new Transform().setTranslation(-4.0,11.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"4 Dashed-dotted"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,1.0,0.0))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
              .setCoord(new Coordinate().setUSE("Segment")))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(0.0,1.0,0.0))
              .setLineProperties(new LineProperties().setLinetype(4)
                .addComments(" linetype='4' dashed-dotted "))))))
      .addChild(new Transform().setTranslation(-4.0,10.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"5 Dash-dot-dot"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.2,0.2,1.0))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
              .setCoord(new Coordinate().setUSE("Segment")))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(0.0,0.0,1.0))
              .setLineProperties(new LineProperties().setLinetype(5)
                .addComments(" linetype='5' dash-dot-dot "))))))
      .addChild(new Transform().setTranslation(-4.0,9.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"6 (single arrow)"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.0,1.0))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
              .setCoord(new Coordinate().setUSE("Segment")))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(1.0,0.0,1.0))
              .setLineProperties(new LineProperties().setLinetype(6)
                .addComments(" linetype='6' (optional support) single arrow, meainging single arrowhead at final vertex, in this case pointing to right "))))))
      .addChild(new Transform().setTranslation(-4.0,8.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"7 (single dot)"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,1.0,1.0))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
              .setCoord(new Coordinate().setUSE("Segment")))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(0.0,1.0,1.0))
              .setLineProperties(new LineProperties().setLinetype(7)
                .addComments(" linetype='7' (optional support) single dot "))))))
      .addChild(new Transform().setTranslation(-4.0,7.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"8 (double arrow)"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,1.0,1.0))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
              .setCoord(new Coordinate().setUSE("Segment")))
            .setAppearance(new Appearance()
              .setMaterial(new Material())
              .setLineProperties(new LineProperties().setLinetype(8)
                .addComments(" linetype='8' (optional support) double arrow, meaning arrow heads at each end "))))))
      .addChild(new Transform().setTranslation(-4.0,6.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"9 [no entry]"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.2,0.2,0.2)))))
      .addChild(new Transform().setTranslation(-4.0,5.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"10 (chain line)"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.5,0.5,0.5))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
              .setCoord(new Coordinate().setUSE("Segment")))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(1.0,0.0,0.0))
              .setLineProperties(new LineProperties().setLinetype(10)
                .addComments(" linetype='10' (optional support) chain line "))))))
      .addChild(new Transform().setTranslation(-4.0,4.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"11 (center line)"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.8,0.2,0.2))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
              .setCoord(new Coordinate().setUSE("Segment")))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(0.8,0.2,0.2))
              .setLineProperties(new LineProperties().setLinetype(11)
                .addComments(" linetype='11' (optional support) center line "))))))
      .addChild(new Transform().setTranslation(-4.0,3.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"12 (hidden line)"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.5,0.5,0.1))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
              .setCoord(new Coordinate().setUSE("Segment")))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(0.5,0.5,0.1))
              .setLineProperties(new LineProperties().setLinetype(12)
                .addComments(" linetype='12' (optional support) hidden line "))))))
      .addChild(new Transform().setTranslation(-4.0,2.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"13 (phantom line)"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.8,0.8,0.2))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
              .setCoord(new Coordinate().setUSE("Segment")))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(0.8,0.8,0.2))
              .setLineProperties(new LineProperties().setLinetype(13)
                .addComments(" linetype='13' (optional support) phantom line "))))))
      .addChild(new Transform().setTranslation(-4.0,1.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"14 (break line 1)"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.2,0.8,0.2))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
              .setCoord(new Coordinate().setUSE("Segment")))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(0.2,0.8,0.2))
              .setLineProperties(new LineProperties().setLinetype(14)
                .addComments(" linetype='14' (optional support) break line 1 "))))))
      .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"15 (break line 2)"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.2,0.2,0.8))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
              .setCoord(new Coordinate().setUSE("Segment")))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(0.2,0.2,0.8))
              .setLineProperties(new LineProperties().setLinetype(15)
                .addComments(" linetype='15' (optional support) break line 2 "))))))
      .addChild(new Transform().setTranslation(-4.0,-1.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"16 (user-specified dash pattern)"})
            .setFontStyle(new FontStyle().setUSE("LeftJustify")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.7,0.7,0.7))))
        .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
          .addChild(new Shape()
            .setGeometry(new IndexedLineSet().setCoordIndex(new int[] {0,1,-1})
              .setCoord(new Coordinate().setUSE("Segment")))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setEmissiveColor(0.7,0.7,0.7))
              .setLineProperties(new LineProperties().setLinetype(16)
                .addComments(" linetype='16' (optional support) user-specified dash pattern "))))))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return LinePropertiesExample model
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
        X3D thisExampleX3dModel = new LinePropertiesExample().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter05AppearanceMaterialTextures.LinePropertiesExample\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter05AppearanceMaterialTextures.LinePropertiesExample\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
