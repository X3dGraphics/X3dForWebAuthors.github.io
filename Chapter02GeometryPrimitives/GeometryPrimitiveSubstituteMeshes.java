package X3dForWebAuthors.Chapter02GeometryPrimitives;

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
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Substitute IndexedFaceSet mesh versions of Geometry Primitive Nodes: Shape, Box, Cone, Cylinder, Sphere. </p>
 <p> Related links: <a href="../../../Chapter02GeometryPrimitives/GeometryPrimitiveSubstituteMeshes.java">GeometryPrimitiveSubstituteMeshes.java</a> source, <a href="../../../Chapter02GeometryPrimitives/GeometryPrimitiveSubstituteMeshesIndex.html" target="_top">GeometryPrimitiveSubstituteMeshes catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter02GeometryPrimitives/GeometryPrimitiveSubstituteMeshes.x3d">GeometryPrimitiveSubstituteMeshes.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Substitute IndexedFaceSet mesh versions of Geometry Primitive Nodes: Shape, Box, Cone, Cylinder, Sphere. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 14 July 2018 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> TODO </i> </td>
			<td> Fix Cone and Cylinder IFS, add Sphere IFS </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> TODO </i> </td>
			<td> Meshlab: submit issue to support import of Box Cone Cylinder Sphere </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> TODO </i> </td>
			<td> X3D-Edit authoring tool Shape wizard: fix height value and endpoint stitching on Cone and Cylinder, add Sphere </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> hint </i> </td>
			<td> Default values have been added to geometry nodes for clarity, ordinarily default values are omitted. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/GeometryPrimitiveSubstituteMeshes.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/GeometryPrimitiveSubstituteMeshes.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter02GeometryPrimitives/../license.html">../license.html</a> </td>
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

public class GeometryPrimitiveSubstituteMeshes
{
	/** Default constructor to create this object. */
	public GeometryPrimitiveSubstituteMeshes ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("GeometryPrimitiveSubstituteMeshes.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Substitute IndexedFaceSet mesh versions of Geometry Primitive Nodes: Shape, Box, Cone, Cylinder, Sphere."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("14 July 2018"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_TODO       ).setContent("Fix Cone and Cylinder IFS, add Sphere IFS"))
    .addMeta(new meta().setName(meta.NAME_TODO       ).setContent("Meshlab: submit issue to support import of Box Cone Cylinder Sphere"))
    .addMeta(new meta().setName(meta.NAME_TODO       ).setContent("X3D-Edit authoring tool Shape wizard: fix height value and endpoint stitching on Cone and Cylinder, add Sphere"))
    .addMeta(new meta().setName(meta.NAME_HINT       ).setContent("Default values have been added to geometry nodes for clarity, ordinarily default values are omitted."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/GeometryPrimitiveSubstituteMeshes.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("GeometryPrimitiveSubstituteMeshes.x3d"))
    .addChild(new Transform().setTranslation(0.0,2.0,0.0)
      .addChild(new Transform().setTranslation(-5.0,0.0,0.0)
        .addChild(new Shape()
          .addComments(" Box size='2 2 2'/ ")
          .setGeometry(new IndexedFaceSet("IfsMeshBox").setDEF("IfsMeshBox").setCoordIndex(new int[] {0,1,2,3,0,-1,7,6,5,4,7,-1,0,4,5,1,0,-1,1,5,6,2,1,-1,2,6,7,3,2,-1,3,7,4,0,3,-1})
            .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {1.0,1.0,1.0,1.0,1.0,-1.0,-1.0,1.0,-1.0,-1.0,1.0,1.0,1.0,-1.0,1.0,1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,-1.0,1.0}))))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.2,0.2)))))
      .addChild(new Transform().setTranslation(-2.5,0.0,0.0)
        .addChild(new Shape()
          .addComments(" Cone bottom='true' bottomRadius='1' height='2' side='true'/ ")
          .addComments(" Conical polygon with 64-sided base DEF='IfsMeshCone' ")
          .setGeometry(new IndexedFaceSet().setCreaseAngle(3.14159).setSolid(false).setCoordIndex(new int[] {65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,-1,1,2,3,-1,1,3,4,-1,1,4,5,-1,1,5,6,-1,1,6,7,-1,1,7,8,-1,1,8,9,-1,1,9,10,-1,1,10,11,-1,1,11,12,-1,1,12,13,-1,1,13,14,-1,1,14,15,-1,1,15,16,-1,1,16,17,-1,1,17,18,-1,1,18,19,-1,1,19,20,-1,1,20,21,-1,1,21,22,-1,1,22,23,-1,1,23,24,-1,1,24,25,-1,1,25,26,-1,1,26,27,-1,1,27,28,-1,1,28,29,-1,1,29,30,-1,1,30,31,-1,1,31,32,-1,1,32,33,-1,1,33,34,-1,1,34,35,-1,1,35,36,-1,1,36,37,-1,1,37,38,-1,1,38,39,-1,1,39,40,-1,1,40,41,-1,1,41,42,-1,1,42,43,-1,1,43,44,-1,1,44,45,-1,1,45,46,-1,1,46,47,-1,1,47,48,-1,1,48,49,-1,1,49,50,-1,1,50,51,-1,1,51,52,-1,1,52,53,-1,1,53,54,-1,1,54,55,-1,1,55,56,-1,1,56,57,-1,1,57,58,-1,1,58,59,-1,1,59,60,-1,1,60,61,-1,1,61,62,-1,1,62,63,-1,1,63,64,-1,1,64,65,-1,1,65,66,-1})
            .setCoord(new Coordinate().setPoint(getCoordinate_7_21_point())))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.2,1.0,0.2)))))
      .addChild(new Transform()
        .addChild(new Shape()
          .addComments(" Cylinder DEF='IfsMeshCylinder' bottom='true' height='2' radius='1' side='true' top='true'/ ")
          .addComments(" Cylindrical 64-sided polygon ")
          .setGeometry(new IndexedFaceSet().setCreaseAngle(3.14159).setSolid(false).setCoordIndex(getIndexedFaceSet_6_27_coordIndex())
            .setCoord(new Coordinate().setPoint(getCoordinate_7_27_point())))
          .setAppearance(new Appearance()
            .setMaterial(new Material())
            .addComments(" TODO authors can add optional ImageTexture, MovieTexture, PixelTexture, TextureTransform, FillProperties, and/or LineProperties nodes here "))))
      .addChild(new Transform().setTranslation(2.5,0.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Sphere("IfsMeshSphere"))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,1.0,0.2)))))
      .addChild(new Transform().setTranslation(5.4,0.0,0.0)
        .addComments(" Selectable Text design pattern has transparent Box and TouchSensor description as a tooltip ")
        .addChild(new Group()
          .addChild(new Shape()
            .setGeometry(new Text("IfsMeshText").setString(new String[] {"IFS","Meshes"})
              .setFontStyle(new FontStyle("MiddleFontStyle").setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.6).setCssStyle("BOLD")))
            .setAppearance(new Appearance("DefaultAppearance")
              .setMaterial(new Material("DefaultMaterial"))))
          .addChild(new Shape()
            .setGeometry(new Box().setSize(2.5,2.0,.001))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setTransparency(1))))
          .addChild(new TouchSensor().setDescription("IndexedFaceSet Meshes")))))
    .addChild(new Transform().setTranslation(0.0,-2.0,0.0)
      .addChild(new Transform().setTranslation(-5.0,0.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Box("DefaultBox"))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.2,0.2)))))
      .addChild(new Transform().setTranslation(-2.5,0.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Cone("DefaultCone"))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.2,1.0,0.2)))))
      .addChild(new Transform()
        .addChild(new Shape()
          .setGeometry(new Cylinder("DefaultCylinder"))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.2,0.2,1.0)))))
      .addChild(new Transform().setTranslation(2.5,0.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Sphere("DefaultSphere"))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,1.0,0.2)))))
      .addChild(new Transform().setTranslation(5.4,0.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text("DefaultText").setString(new String[] {"Geometry","Primitives"})
            .setFontStyle(new FontStyle().setUSE("MiddleFontStyle")))
          .setAppearance(new Appearance().setUSE("DefaultAppearance"))))));
    }
	// end of initialize() method


		/** Define subarrays using type int[] */
		private int[] getIndexedFaceSet_6_27_coordIndex_1()
		{
			int[] value = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,0,-1,127,126,125,124,123,122,121,120,119,118,117,116,115,114,113,112,111,110,109,108,107,106,105,104,103,102,101,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,127,-1,1,65,64,0,1,-1,2,66,65,1,2,-1,3,67,66,2,3,-1,4,68,67,3,4,-1,5,69,68,4,5,-1,6,70,69,5,6,-1,7,71,70,6,7,-1,8,72,71,7,8,-1,9,73,72,8,9,-1,10,74,73,9,10,-1,11,75,74,10,11,-1,12,76,75,11,12,-1,13,77,76,12,13,-1,14,78,77,13,14,-1,15,79,78,14,15,-1,16,80,79,15,16,-1,17,81,80,16,17,-1,18,82,81,17,18,-1,19,83,82,18,19,-1,20,84,83,19,20,-1,21,85,84,20,21,-1,22,86,85,21,22,-1,23,87,86,22,23,-1,24,88,87,23,24,-1,25,89,88,24,25,-1,26,90,89,25,26,-1,27,91,90,26,27,-1,28,92,91,27,28,-1,29,93,92,28,29,-1,30,94,93,29,30,-1,31,95,94,30,31,-1,32,96,95,31,32,-1,33,97,96,32,33,-1,34,98,97,33,34,-1,35,99,98,34,35,-1,36,100,99,35,36,-1,37,101,100,36,37,-1,38,102,101,37,38,-1,39,103,102,38,39,-1,40,104,103,39,40,-1,41,105,104,40,41,-1,42,106,105,41,42,-1,43,107,106,42,43,-1,44,108,107,43,44,-1,45,109,108,44,45,-1,46,110,109,45,46,-1,47,111,110,46,47,-1,48,112,111,47,48,-1,49,113,112,48,49,-1,50,114,113,49,50,-1,51,115,114,50,51,-1,52,116,115,51,52,-1,53,117,116,52,53,-1,54,118,117,53,54,-1,55,119,118,54,55,-1,56,120,119,55,56,-1,57,121,120,56,57,-1,58,122,121,57,58,-1,59,123,122,58,59,-1,60,124,123,59,60,-1,61,125,124,60,61,-1,62,126,125,61,62,-1,63,127,126,62,63,-1,0,64,127,63,0,-1};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getCoordinate_7_27_point_1()
		{
			double[] value = {0.000,1.0,1.000,0.098,1.0,0.995,0.195,1.0,0.981,0.290,1.0,0.957,0.383,1.0,0.924,0.471,1.0,0.882,0.556,1.0,0.831,0.634,1.0,0.773,0.707,1.0,0.707,0.773,1.0,0.634,0.831,1.0,0.556,0.882,1.0,0.471,0.924,1.0,0.383,0.957,1.0,0.290,0.981,1.0,0.195,0.995,1.0,0.098,1.000,1.0,0.000,0.995,1.0,-0.098,0.981,1.0,-0.195,0.957,1.0,-0.290,0.924,1.0,-0.383,0.882,1.0,-0.471,0.831,1.0,-0.556,0.773,1.0,-0.634,0.707,1.0,-0.707,0.634,1.0,-0.773,0.556,1.0,-0.831,0.471,1.0,-0.882,0.383,1.0,-0.924,0.290,1.0,-0.957,0.195,1.0,-0.981,0.098,1.0,-0.995,0.000,1.0,-1.000,-0.098,1.0,-0.995,-0.195,1.0,-0.981,-0.290,1.0,-0.957,-0.383,1.0,-0.924,-0.471,1.0,-0.882,-0.556,1.0,-0.831,-0.634,1.0,-0.773,-0.707,1.0,-0.707,-0.773,1.0,-0.634,-0.831,1.0,-0.556,-0.882,1.0,-0.471,-0.924,1.0,-0.383,-0.957,1.0,-0.290,-0.981,1.0,-0.195,-0.995,1.0,-0.098,-1.000,1.0,-0.000,-0.995,1.0,0.098,-0.981,1.0,0.195,-0.957,1.0,0.290,-0.924,1.0,0.383,-0.882,1.0,0.471,-0.831,1.0,0.556,-0.773,1.0,0.634,-0.707,1.0,0.707,-0.634,1.0,0.773,-0.556,1.0,0.831,-0.471,1.0,0.882,-0.383,1.0,0.924,-0.290,1.0,0.957,-0.195,1.0,0.981,-0.098,1.0,0.995,0.000,0.0,1.000,0.098,0.0,0.995,0.195,0.0,0.981,0.290,0.0,0.957,0.383,0.0,0.924,0.471,0.0,0.882,0.556,0.0,0.831,0.634,0.0,0.773,0.707,0.0,0.707,0.773,0.0,0.634,0.831,0.0,0.556,0.882,0.0,0.471,0.924,0.0,0.383,0.957,0.0,0.290,0.981,0.0,0.195,0.995,0.0,0.098,1.000,0.0,0.000,0.995,0.0,-0.098,0.981,0.0,-0.195,0.957,0.0,-0.290,0.924,0.0,-0.383,0.882,0.0,-0.471,0.831,0.0,-0.556,0.773,0.0,-0.634,0.707,0.0,-0.707,0.634,0.0,-0.773,0.556,0.0,-0.831,0.471,0.0,-0.882,0.383,0.0,-0.924,0.290,0.0,-0.957,0.195,0.0,-0.981,0.098,0.0,-0.995,0.000,0.0,-1.000,-0.098,0.0,-0.995,-0.195,0.0,-0.981,-0.290,0.0,-0.957};
			return value;
		}
		private double[] getCoordinate_7_27_point_2()
		{
			double[] value = {-0.383,0.0,-0.924,-0.471,0.0,-0.882,-0.556,0.0,-0.831,-0.634,0.0,-0.773,-0.707,0.0,-0.707,-0.773,0.0,-0.634,-0.831,0.0,-0.556,-0.882,0.0,-0.471,-0.924,0.0,-0.383,-0.957,0.0,-0.290,-0.981,0.0,-0.195,-0.995,0.0,-0.098,-1.000,0.0,-0.000,-0.995,0.0,0.098,-0.981,0.0,0.195,-0.957,0.0,0.290,-0.924,0.0,0.383,-0.882,0.0,0.471,-0.831,0.0,0.556,-0.773,0.0,0.634,-0.707,0.0,0.707,-0.634,0.0,0.773,-0.556,0.0,0.831,-0.471,0.0,0.882,-0.383,0.0,0.924,-0.290,0.0,0.957,-0.195,0.0,0.981,-0.098,0.0,0.995};
			return value;
		}

		/** Large attribute array: Coordinate point field, scene-graph level=7, element #21, 201 total numbers made up of 67 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getCoordinate_7_21_point()
		{
			MFVec3f Coordinate_7_21_point = new MFVec3f(new double[] {0.0,0.0,0.0,0.0,1.0,0.0,0.000,0.0,1.000,0.098,0.0,0.995,0.195,0.0,0.981,0.290,0.0,0.957,0.383,0.0,0.924,0.471,0.0,0.882,0.556,0.0,0.831,0.634,0.0,0.773,0.707,0.0,0.707,0.773,0.0,0.634,0.831,0.0,0.556,0.882,0.0,0.471,0.924,0.0,0.383,0.957,0.0,0.290,0.981,0.0,0.195,0.995,0.0,0.098,1.000,0.0,0.000,0.995,0.0,-0.098,0.981,0.0,-0.195,0.957,0.0,-0.290,0.924,0.0,-0.383,0.882,0.0,-0.471,0.831,0.0,-0.556,0.773,0.0,-0.634,0.707,0.0,-0.707,0.634,0.0,-0.773,0.556,0.0,-0.831,0.471,0.0,-0.882,0.383,0.0,-0.924,0.290,0.0,-0.957,0.195,0.0,-0.981,0.098,0.0,-0.995,0.000,0.0,-1.000,-0.098,0.0,-0.995,-0.195,0.0,-0.981,-0.290,0.0,-0.957,-0.383,0.0,-0.924,-0.471,0.0,-0.882,-0.556,0.0,-0.831,-0.634,0.0,-0.773,-0.707,0.0,-0.707,-0.773,0.0,-0.634,-0.831,0.0,-0.556,-0.882,0.0,-0.471,-0.924,0.0,-0.383,-0.957,0.0,-0.290,-0.981,0.0,-0.195,-0.995,0.0,-0.098,-1.000,0.0,-0.000,-0.995,0.0,0.098,-0.981,0.0,0.195,-0.957,0.0,0.290,-0.924,0.0,0.383,-0.882,0.0,0.471,-0.831,0.0,0.556,-0.773,0.0,0.634,-0.707,0.0,0.707,-0.634,0.0,0.773,-0.556,0.0,0.831,-0.471,0.0,0.882,-0.383,0.0,0.924,-0.290,0.0,0.957,-0.195,0.0,0.981,-0.098,0.0,0.995,0.000,0.0,1.000});
			return Coordinate_7_21_point;
		}
		/** Large attribute array: IndexedFaceSet coordIndex field, scene-graph level=6, element #27, 516 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFInt32 getIndexedFaceSet_6_27_coordIndex()
		{
			MFInt32 IndexedFaceSet_6_27_coordIndex = new MFInt32()/*2.finalize*/
				.append(new MFInt32(getIndexedFaceSet_6_27_coordIndex_1()));
			return IndexedFaceSet_6_27_coordIndex;
		}
		/** Large attribute array: Coordinate point field, scene-graph level=7, element #27, 384 total numbers made up of 128 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getCoordinate_7_27_point()
		{
			MFVec3f Coordinate_7_27_point = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getCoordinate_7_27_point_1()))
				.append(new MFVec3f(getCoordinate_7_27_point_2()));
			return Coordinate_7_27_point;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return GeometryPrimitiveSubstituteMeshes model
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
        X3D thisExampleX3dModel = new GeometryPrimitiveSubstituteMeshes().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter02GeometryPrimitives.GeometryPrimitiveSubstituteMeshes\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter02GeometryPrimitives.GeometryPrimitiveSubstituteMeshes\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
