package X3dForWebAuthors.Chapter15Metadata;

/*
Copyright (c) 1995-2017 held by the author(s).  All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer
      in the documentation and/or other materials provided with the
      distribution.
    * Neither the name of the Web3D Consortium (http://www.web3D.org)
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
import org.web3d.x3d.jsail.EnvironmentalEffects.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Simple examples of meta statements, comments, WorldInfo node and typed metadata nodes. </p>
 <p> Related links: <a href="../../../Chapter15Metadata/MetadataExamples.java">MetadataExamples.java</a> source, <a href="../../../Chapter15Metadata/MetadataExamplesIndex.html" target="_top">MetadataExamples catalog page</a>, <a href="http://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a> and <a href="http://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;" summary="Scene Metadata">
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter15Metadata/MetadataExamples.x3d">MetadataExamples.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Simple examples of meta statements, comments, WorldInfo node and typed metadata nodes. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 30 September 2011 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 24 February 2016 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> info </i> </td>
			<td> Information in head and meta elements is retained after a scene is parsed and loaded, and can be referenced via the Scene Access Interface (SAI) or Document Object Model (DOM) </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> info </i> </td>
			<td> Authoring note: MetadataBoolean requires X3D version 3.3, as used in this example scene </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> The following referenced chapter is published online but was not included in the printed book. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter15Metadata/Chapter15MetadataInformation.html">Chapter15MetadataInformation.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://x3dgraphics.com/chapters/Chapter15MetadataInformation.html" target="_blank">http://x3dgraphics.com/chapters/Chapter15MetadataInformation.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://X3dGraphics.com" target="_blank">http://X3dGraphics.com</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">http://www.web3d.org/x3d/content/examples/X3dResources.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> rights </i> </td>
			<td> Copyright 2006, Daly Realism and Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D book, X3D graphics, X3D-Edit, <a href="http://www.x3dGraphics.com" target="_blank">http://www.x3dGraphics.com</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/MetadataExamples.x3d" target="_blank">http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/MetadataExamples.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter15Metadata/../license.html">../license.html</a> </td>
		</tr>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center;" colspan="2">  &nbsp; </td>
		</tr>
	</table>

	<p>
		This program uses the
		<a href="http://www.web3d.org/specifications/java/X3DJSAIL.html" target="_blank">X3D Java Scene Access Interface Library (X3DJSAIL)</a>.
		It has been produced using the 
		<a href="http://www.web3d.org/x3d/stylesheets/X3dToJava.xslt" target="_blank">X3dToJava.xslt</a>
		stylesheet to create Java source code from an <code>.x3d</code> scene.
	</p>

	* @author Don Brutzman
 */

public class MetadataExamples
{
  /** Default constructor to create this object. */
  public MetadataExamples ()
  {
    initialize();
  }
	
  /** Create and initialize the X3D model. */
  public final void initialize()
  {
  x3dModel = new X3DObject().setProfile("Immersive").setVersion("3.3")
  .setHead(new headObject()
    .addMeta(new metaObject().setName("title").setContent("MetadataExamples.x3d"))
    .addMeta(new metaObject().setName("description").setContent("Simple examples of meta statements, comments, WorldInfo node and typed metadata nodes."))
    .addMeta(new metaObject().setName("creator").setContent("Don Brutzman"))
    .addMeta(new metaObject().setName("created").setContent("30 September 2011"))
    .addMeta(new metaObject().setName("modified").setContent("24 February 2016"))
    .addMeta(new metaObject().setName("info").setContent("Information in head and meta elements is retained after a scene is parsed and loaded, and can be referenced via the Scene Access Interface (SAI) or Document Object Model (DOM)"))
    .addMeta(new metaObject().setName("info").setContent("Authoring note: MetadataBoolean requires X3D version 3.3, as used in this example scene"))
    .addMeta(new metaObject().setName("reference").setContent("The following referenced chapter is published online but was not included in the printed book."))
    .addMeta(new metaObject().setName("reference").setContent("Chapter15MetadataInformation.html"))
    .addMeta(new metaObject().setName("reference").setContent("http://x3dgraphics.com/chapters/Chapter15MetadataInformation.html"))
    .addMeta(new metaObject().setName("reference").setContent("http://X3dGraphics.com"))
    .addMeta(new metaObject().setName("reference").setContent("http://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new metaObject().setName("rights").setContent("Copyright 2006, Daly Realism and Don Brutzman"))
    .addMeta(new metaObject().setName("subject").setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com"))
    .addMeta(new metaObject().setName("identifier").setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/MetadataExamples.x3d"))
    .addMeta(new metaObject().setName("generator").setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new metaObject().setName("license").setContent("../license.html")))
  .setScene(new SceneObject()
    .addComments(" Comments can appear between nodes (XML elements) but are not retained after a scene is parsed and loaded ")
    .addComments(" No Metadata nodes are allowed at top level of Scene graph ")
    .addChild(new WorldInfoObject("MyWorldInfo").setInfo(new MFStringObject("\"Metadata strings\" \"can go here\" \"as string array values\"")).setTitle("MetadataExamples.x3d Example Scene")
      .addComments(" Structured information can go in Metadata nodes. Note that any X3D node can contain a single Metadata node with containerField='metadata' ")
      .setMetadata(new MetadataSetObject("MyMetadataSetNode").setName("Metadata_name").setReference("Standard 1.2.3c")
        .addComments(" MetadataSet can also contain multiple Metadata nodes with containerField='value' ")
        .addValue(new MetadataBooleanObject("MyMetadataBooleanNode").setName("Coin Flip").setReference("MetadataBoolean allowed in X3D v3.3 and later").setValue(new boolean[] {true,false,true,false}))
        .addValue(new MetadataDoubleObject("MyMetadataDoubleNode").setName("Metadata_name").setValue(new double[] {3.141592658,2.71812181}).setReference("Standard 1.2.3c"))
        .addValue(new MetadataFloatObject("MyMetadataFloatNode").setName("Metadata_name").setValue(new float[] {9.8f,6.023e+23f}).setReference("Standard 1.2.3c"))
        .addValue(new MetadataIntegerObject("MyMetadataIntegerNode").setName("Metadata_name").setValue(new int[] {6,28,496}).setReference("Standard 1.2.3c"))
        .addValue(new MetadataStringObject("MyMetadataStringNode").setName("Metadata_name").setValue(new MFStringObject("\"Part 27\" \"P27\" \"p27\"")).setReference("Standard 1.2.3c"))
        .setMetadata(new MetadataSetObject("NestedMetadataSetNode").setName("TestNestedMetadataSetNodes")
          .addValue(new MetadataStringObject().setUSE("MyMetadataStringNode"))
          .addValue(new MetadataIntegerObject().setUSE("MyMetadataIntegerNode"))
          .addValue(new MetadataFloatObject().setUSE("MyMetadataFloatNode"))
          .addValue(new MetadataFloatObject().setName("coefficients").setValue(new float[] {3.141592653f,2.7128f,1.0f,0.0f})))))
    .addChild(new BackgroundObject().setSkyColor(new MFColorObject(new float[] {0.0f,0.439216f,0.760784f})))
    .addChild(new ViewpointObject().setDescription("View scene source to see metadata examples").setPosition(0.0f,0.0f,9.0f))
    .addChild(new AnchorObject().setDescription("view pretty-print scene source").setParameter(new MFStringObject("\"target=_blank\"")).setUrl(new MFStringObject("\"MetadataExamples.html\" \"http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/MetadataExamples.html\""))
      .addChild(new ShapeObject()
        .setGeometry(new TextObject().setString(new MFStringObject("\"View scene source\" \"to see\" \"metadata examples\""))
          .setFontStyle(new FontStyleObject().setJustify(new MFStringObject("\"MIDDLE\" \"MIDDLE\""))))
        .setAppearance(new AppearanceObject()
          .setMaterial(new MaterialObject().setDiffuseColor(1.0f,0.992157f,0.039216f))))));
  }
  // end of initialize() method

  /** The initialized model object, created within initialize() method. */
  private X3DObject x3dModel;
  
  /** Provide a shallow copy of the X3D model.
   * @return MetadataExamples model
   */
  public X3DObject getX3dModel()
  {	  
	  return x3dModel;
  }
  
  /** Indicate X3DJSAIL validation results for this X3D model.
   * @return validation results plus exception information, if any
   */
  public String validateSelf()
  {
	String       metaResult = new String();
	String validationResult = new String();
	String  exceptionResult = new String();
	try
	{
		initialize();
		
		if ((getX3dModel() == null) || (getX3dModel().getHead() == null))
		{
			validationResult = "empty scene, nothing to validate. " + x3dModel.validate();
			return validationResult;
		}
		// first list informational meta elements of interest
		for (metaObject meta : getX3dModel().getHead().getMetaList())
		{
			if (meta.getName().equals(metaObject.NAME_ERROR) ||
				meta.getName().equals(metaObject.NAME_WARNING) ||
				meta.getName().equals(metaObject.NAME_HINT) ||
				meta.getName().equals(metaObject.NAME_INFO) ||
				meta.getName().equals(metaObject.NAME_TODO))
			{
				metaResult += meta.toStringX3D();
			}
		}
		validationResult += x3dModel.validate(); // walk entire tree to validate correctness
	}
	catch (Exception e)
	{
		exceptionResult = e.getMessage(); // report exception failures, if any
	}
	if  (metaResult.isEmpty() && exceptionResult.isEmpty() && validationResult.isEmpty())
	     return "success";
	else
	{
		String returnMessage = metaResult;
		if  (!exceptionResult.isEmpty() && !validationResult.isEmpty())
			returnMessage += "\n*** ";
		returnMessage += exceptionResult;
		if  (exceptionResult.isEmpty() && !validationResult.isEmpty())
			returnMessage = "\n" + returnMessage; // skip line before meta tags, etc.
		returnMessage += validationResult;
		return returnMessage;
	}
  }
    /** Default main() method provided for test purposes.
     * @param argv input parameters
     */
    public static void main(String argv[])
    {
		MetadataExamples testObject = new MetadataExamples();
		System.out.println ("MetadataExamples execution self-validation test results: " + testObject.validateSelf());
	}
}
