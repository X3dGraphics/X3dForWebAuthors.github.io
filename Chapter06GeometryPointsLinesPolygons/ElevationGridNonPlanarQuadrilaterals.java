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
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Show how a single nonplanar quadrilateral can be tesselated in 2 different ways. </p>
 <p> Related links: <a href="../../../Chapter06GeometryPointsLinesPolygons/ElevationGridNonPlanarQuadrilaterals.java">ElevationGridNonPlanarQuadrilaterals.java</a> source, <a href="../../../Chapter06GeometryPointsLinesPolygons/ElevationGridNonPlanarQuadrilateralsIndex.html" target="_top">ElevationGridNonPlanarQuadrilaterals catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter06GeometryPointsLinesPolygons/ElevationGridNonPlanarQuadrilaterals.x3d">ElevationGridNonPlanarQuadrilaterals.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Show how a single nonplanar quadrilateral can be tesselated in 2 different ways. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> contributor </i> </td>
			<td> U.S. Naval Postgraduate School (NPS) </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 28 August 2005 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ElevationGridNonPlanarQuadrilaterals.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ElevationGridNonPlanarQuadrilaterals.x3d</a> </td>
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

	* @author Don Brutzman
 */

public class ElevationGridNonPlanarQuadrilaterals
{
	/** Default constructor to create this object. */
	public ElevationGridNonPlanarQuadrilaterals ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("ElevationGridNonPlanarQuadrilaterals.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Show how a single nonplanar quadrilateral can be tesselated in 2 different ways."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CONTRIBUTOR).setContent("U.S. Naval Postgraduate School (NPS)"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("28 August 2005"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ElevationGridNonPlanarQuadrilaterals.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("ElevationGridNonPlanarQuadrilaterals.x3d"))
    .addChild(new NavigationInfo("ExamineMode"))
    .addChild(new NavigationInfo("FlyPanNavigation").setType("\"FLY\" \"ANY\""))
    .addChild(new Background().setSkyColor(new MFColor(new double[] {1.0,1.0,1.0})))
    .addChild(new Viewpoint().setDescription("Book View").setOrientation(0.0,1.0,0.0,0.01).setPosition(0.13,0.2,7.71))
    .addChild(new Viewpoint("DefaultView").setDescription("ElevationGrid tessellation examples").setPosition(0.0,0.2,10.0))
    .addChild(new ROUTE().setFromNode("DefaultView").setFromField("isBound").setToNode("FlyPanNavigation").setToField("set_bind"))
    .addChild(new Transform().setTranslation(0.0,-0.75,0.0)
      .addChild(new Transform("FigureElevationGridBack").setTranslation(-4.0,0.0,0.0)
        .addComments(" Note that the base of each piece of polygonal geometry is based at (1 0 1) ")
        .addChild(new Viewpoint().setDescription("Default brower ElevationGrid tessellation, front view").setPosition(1.5,0.4,4.0))
        .addChild(new Transform().setCenter(1.0,0.0,1.0).setRotation(0.0,1.0,0.0,3.2)
          .addChild(new Group("DefaultElevationGrid")
            .addChild(new Shape("ExampleElevationGridShape")
              .setGeometry(new ElevationGrid().setSolid(false).setHeight(new double[] {0.0,0.5,0.0,0.0}))
              .setAppearance(new Appearance("DiffuseRedAppearance")
                .setMaterial(new Material().setDiffuseColor(0.9,0.1,0.1).setTransparency(0.1))))
            .addChild(new Transform("FigureLabelBrowserElevationGrid").setTranslation(0.5,1.0,0.5)
              .addChild(new Billboard()
                .addChild(new Shape()
                  .setGeometry(new Text().setString(new String[] {"Browser","ElevationGrid"})
                    .setFontStyle(new FontStyle("CenterFS").setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.25)))
                  .setAppearance(new Appearance("LabelAppearance")
                    .setMaterial(new Material().setDiffuseColor(0.2,0.1,0.8))))))
            .addChild(new Group("CommonFigureElements")
              .addChild(new Shape("QuadOutlineShape")
                .setGeometry(new IndexedLineSet().setColorPerVertex(false).setColorIndex(new int[] {0,0,0,0}).setCoordIndex(new int[] {0,1,3,2,0,-1})
                  .addComments(" first iterate on x-axis, then z-xis ")
                  .setCoord(new Coordinate("QuadrilateralPoints").setPoint(new MFVec3f(new double[] {0.0,0.0,0.0,1.0,0.5,0.0,0.0,0.0,1.0,1.0,0.0,1.0,1.0,0.0,0.0})))
                  .setColor(new Color("White").setColor(new MFColor(new double[] {1.0,1.0,1.0})))))
              .addChild(new Shape("FloorShape")
                .addComments(" setting all height values to zero is a simple way to get a square outline. A more efficient way is to use an IndexedFaceSet. ")
                .setGeometry(new ElevationGrid().setSolid(false))
                .setAppearance(new Appearance("TransparentGreyAppearance")
                  .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0).setTransparency(0.8))))
              .addChild(new Transform("PointLabels").setTranslation(0.0,-0.2,0.0)
                .addChild(new Billboard()
                  .addChild(new Shape()
                    .setGeometry(new Text().setString(new String[] {"h0"})
                      .setFontStyle(new FontStyle().setUSE("CenterFS")))
                    .setAppearance(new Appearance().setUSE("LabelAppearance"))))
                .addChild(new Transform().setTranslation(1.0,0.0,0.0)
                  .addChild(new Billboard()
                    .addChild(new Shape()
                      .setGeometry(new Text().setString(new String[] {"h1"})
                        .setFontStyle(new FontStyle().setUSE("CenterFS")))
                      .setAppearance(new Appearance().setUSE("LabelAppearance")))))
                .addChild(new Transform().setTranslation(0.0,0.0,1.0)
                  .addChild(new Billboard()
                    .addChild(new Shape()
                      .setGeometry(new Text().setString(new String[] {"h2"})
                        .setFontStyle(new FontStyle().setUSE("CenterFS")))
                      .setAppearance(new Appearance().setUSE("LabelAppearance")))))
                .addChild(new Transform().setTranslation(1.0,0.0,1.0)
                  .addChild(new Billboard()
                    .addChild(new Shape()
                      .setGeometry(new Text().setString(new String[] {"h3"})
                        .setFontStyle(new FontStyle().setUSE("CenterFS")))
                      .setAppearance(new Appearance().setUSE("LabelAppearance"))))))
              .addChild(new Shape("QuadVerticalLineShape")
                .setGeometry(new IndexedLineSet().setColorPerVertex(false).setColorIndex(new int[] {0,0,0,0}).setCoordIndex(new int[] {1,4,-1})
                  .setCoord(new Coordinate().setUSE("QuadrilateralPoints"))
                  .setColor(new Color().setUSE("White")))))
            .addChild(new Shape("QuadCrossDiagonalLineShape")
              .setGeometry(new IndexedLineSet().setColorPerVertex(false).setColorIndex(new int[] {0,0,0,0}).setCoordIndex(new int[] {2,1,-1})
                .setCoord(new Coordinate().setUSE("QuadrilateralPoints"))
                .setColor(new Color().setUSE("White"))))
            .addChild(new Shape("QuadCenterDiagonalLineShape")
              .setGeometry(new IndexedLineSet().setColorPerVertex(false).setColorIndex(new int[] {0,0,0,0}).setCoordIndex(new int[] {0,3,-1})
                .setCoord(new Coordinate().setUSE("QuadrilateralPoints"))
                .setColor(new Color().setUSE("White")))))))
      .addChild(new Transform("FigureElevationGridFront").setTranslation(-1.0,0.0,0.0)
        .addChild(new Viewpoint().setDescription("Default brower ElevationGrid tessellation, back view").setPosition(0.5,0.4,4.0))
        .addChild(new Transform().setCenter(1.0,0.0,1.0).setRotation(0.0,1.0,0.0,0.8)
          .addChild(new Group().setUSE("DefaultElevationGrid"))))
      .addChild(new Transform("FigureIfsCenterDiagonal").setTranslation(1.0,0.0,0.0)
        .addChild(new Viewpoint().setDescription("Center-diagonal tessellation").setPosition(0.5,0.4,4.0))
        .addChild(new Transform().setCenter(1.0,0.0,1.0).setRotation(0.0,1.0,0.0,0.4)
          .addChild(new Shape()
            .setGeometry(new IndexedFaceSet().setCoordIndex(new int[] {0,3,1,-1,0,2,3,-1})
              .setCoord(new Coordinate().setUSE("QuadrilateralPoints")))
            .setAppearance(new Appearance().setUSE("DiffuseRedAppearance")))
          .addChild(new Transform("FigureLabelCenterDiagonalTessellation").setTranslation(0.5,1.0,0.5)
            .addChild(new Billboard()
              .addChild(new Shape()
                .setGeometry(new Text().setString(new String[] {"Center Diagonal","Tessellation"})
                  .setFontStyle(new FontStyle().setUSE("CenterFS")))
                .setAppearance(new Appearance().setUSE("LabelAppearance")))))
          .addChild(new Group().setUSE("CommonFigureElements"))
          .addChild(new Shape().setUSE("QuadCenterDiagonalLineShape"))))
      .addChild(new Transform("FigureIfsCrossDiagonal").setTranslation(3.0,0.0,0.0)
        .addChild(new Viewpoint().setDescription("Cross-diagonal tessellation").setPosition(0.5,0.4,4.0))
        .addChild(new Transform().setCenter(1.0,0.0,1.0)
          .addChild(new Shape()
            .setGeometry(new IndexedFaceSet().setCoordIndex(new int[] {0,2,1,-1,2,3,1,-1})
              .setCoord(new Coordinate().setUSE("QuadrilateralPoints")))
            .setAppearance(new Appearance().setUSE("DiffuseRedAppearance")))
          .addChild(new Transform("FigureLabelCrossDiagonalTessellation").setTranslation(0.5,1.0,0.5)
            .addChild(new Billboard()
              .addChild(new Shape()
                .setGeometry(new Text().setString(new String[] {"Cross Diagonal","Tessellation"})
                  .setFontStyle(new FontStyle().setUSE("CenterFS")))
                .setAppearance(new Appearance().setUSE("LabelAppearance")))))
          .addChild(new Group().setUSE("CommonFigureElements"))
          .addChild(new Shape().setUSE("QuadCrossDiagonalLineShape"))))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return ElevationGridNonPlanarQuadrilaterals model
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
        X3D thisExampleX3dModel = new ElevationGridNonPlanarQuadrilaterals().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter06GeometryPointsLinesPolygons.ElevationGridNonPlanarQuadrilaterals\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter06GeometryPointsLinesPolygons.ElevationGridNonPlanarQuadrilaterals\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
