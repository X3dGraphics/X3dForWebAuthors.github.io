package X3dForWebAuthors.Chapter15Metadata;

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
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Test target for python x3d package development. Can x3d.py package generate this valid X3D file? This scene contains MetadataSet with a non-null metadata field. </p>
 <p> Related links: <a href="../../../Chapter15Metadata/WorldInfoExampleMetadataSetX3D3.java">WorldInfoExampleMetadataSetX3D3.java</a> source, <a href="../../../Chapter15Metadata/WorldInfoExampleMetadataSetX3D3Index.html" target="_top">WorldInfoExampleMetadataSetX3D3 catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter15Metadata/WorldInfoExampleMetadataSetX3D3.x3d">WorldInfoExampleMetadataSetX3D3.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Test target for python x3d package development. Can x3d.py package generate this valid X3D file? This scene contains MetadataSet with a non-null metadata field. </td>
		</tr>
		<tr style="color:burntorange">
			<td style="text-align:right; vertical-align: text-top;"> <i> warning </i> </td>
			<td> Metadata nodes are not allowed at top level of scene in X3D3, but one is allowed as field within WorldInfo </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Vincent Marchetti </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter15Metadata/WorldInfoExampleMetadataSetX3D4.x3d">WorldInfoExampleMetadataSetX3D4.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> info </i> </td>
			<td> Original name MetadataSetWithMetadata.x3d </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Vincent Marchetti </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 16 November 2021 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> revised </i> </td>
			<td> 2 February 2022 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/WorldInfoExampleMetadataSetX3D3.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/WorldInfoExampleMetadataSetX3D3.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="https://creativecommons.org/licenses/by/4.0" target="_blank">https://creativecommons.org/licenses/by/4.0</a> </td>
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

	* @author Vincent Marchetti
	* @author Vincent Marchetti
	* @author Don Brutzman
 */

public class WorldInfoExampleMetadataSetX3D3
{
	/** Default constructor to create this object. */
	public WorldInfoExampleMetadataSetX3D3 ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERCHANGE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("WorldInfoExampleMetadataSetX3D3.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Test target for python x3d package development. Can x3d.py package generate this valid X3D file? This scene contains MetadataSet with a non-null metadata field."))
    .addMeta(new meta().setName(meta.NAME_WARNING    ).setContent("Metadata nodes are not allowed at top level of scene in X3D3, but one is allowed as field within WorldInfo"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Vincent Marchetti"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("WorldInfoExampleMetadataSetX3D4.x3d"))
    .addMeta(new meta().setName(meta.NAME_INFO       ).setContent("Original name MetadataSetWithMetadata.x3d"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Vincent Marchetti"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("16 November 2021"))
    .addMeta(new meta().setName("revised").setContent("2 February 2022"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/WorldInfoExampleMetadataSetX3D3.x3d"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("https://creativecommons.org/licenses/by/4.0")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("WorldInfoExampleMetadataSetX3D3.x3d Example Scene")
      .addComments(" WorldInfo single available child field of interest is 'metadata' and so contained MetadataSet must have containerField='metadata' which IS the default in X3D3' ")
      .setMetadata(new MetadataSet().setName("birthday").setReference("http://www.americaslibrary.gov/jb/colonial/jb_colonial_washingtn_2.html")
        .setMetadata(new MetadataString().setName("calendar").setReference("this node describes nature of parent node, and is not intended as a data value").setValue(new String[] {"Julian"}))
        .addComments(" MetadataSet next field of interest is 'value' and so contained Metadata nodes must have containerField='value' which IS NOT default in X3D3 ")
        .setMetadata(new MetadataInteger().setName("day").setValue(new int[] {11}))
        .setMetadata(new MetadataInteger().setName("month").setValue(new int[] {2}))
        .setMetadata(new MetadataInteger().setName("year").setValue(new int[] {1731}))))
    .addChild(new Background().setSkyColor(new MFColor(new double[] {0.0,0.439216,0.760784})))
    .addChild(new Viewpoint().setDescription("View scene source to see metadata examples").setPosition(0.0,0.0,12.0))
    .addChild(new Anchor().setDescription("Load scene index page").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"WorldInfoExampleMetadataSetX3D3.html","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/WorldInfoExampleMetadataSetX3D3.html"})
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"View scene source","to see","WorldInfoExampleMetadataSetX3D3"})
          .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.992157))))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return WorldInfoExampleMetadataSetX3D3 model
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
        X3D thisExampleX3dModel = new WorldInfoExampleMetadataSetX3D3().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter15Metadata.WorldInfoExampleMetadataSetX3D3\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter15Metadata.WorldInfoExampleMetadataSetX3D3\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
