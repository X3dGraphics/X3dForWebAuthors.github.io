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
 * <p> Simple XMP sidecar example: Hello XMP metadata!. </p>
 <p> Related links: <a href="../../../Chapter15Metadata/XmpMetadataEmbedded.java">XmpMetadataEmbedded.java</a> source, <a href="../../../Chapter15Metadata/XmpMetadataEmbeddedIndex.html" target="_top">XmpMetadataEmbedded catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter15Metadata/XmpMetadataEmbedded.x3d">XmpMetadataEmbedded.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Simple XMP sidecar example: Hello XMP metadata! </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 29 April 2021 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> revised </i> </td>
			<td> 21 February 2022 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman, Vince Marchetti, Jakub Flotynski, Dick Puk </td>
		</tr>
		<tr style="color:burntorange">
			<td style="text-align:right; vertical-align: text-top;"> <i> warning </i> </td>
			<td> Source model assumes default containerField=value for X3D4 Metadata nodes, specification resolution needed </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> Summary presentation XmpMetadataSupportX3D.pptx </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter15Metadata/XmpMetadataSidecar.xml">XmpMetadataSidecar.xml</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> XmpMetadataSidecar.rdf </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> XmpMetadataSidecar.ttl </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> Protege <a href="https://protege.stanford.edu" target="_blank">https://protege.stanford.edu</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter15Metadata/XmpMetadataEmbeddedX3dComparison.png">XmpMetadataEmbeddedX3dComparison.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/specifications/X3Dv4Draft/ISO-IEC19775-1v4-CD1/Part01/components/core.html#MetadataSet" target="_blank">https://www.web3d.org/specifications/X3Dv4Draft/ISO-IEC19775-1v4-CD1/Part01/components/core.html#MetadataSet</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter15Metadata/XmpMetadataExampleWikipedia.xml">XmpMetadataExampleWikipedia.xml</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> XmpMetadataExampleWikipedia.ttl </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://wwwimages2.adobe.com/content/dam/acom/en/devnet/xmp/pdfs/XMP%20SDK%20Release%20cc-2016-08/XMPSpecificationPart1.pdf" target="_blank">https://wwwimages2.adobe.com/content/dam/acom/en/devnet/xmp/pdfs/XMP%20SDK%20Release%20cc-2016-08/XMPSpecificationPart1.pdf</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> TODO </i> </td>
			<td> Once pattern OK, write conversion stylesheets XmpToX3dMetadata.xslt and X3dMetadataToXmp.xslt </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> info </i> </td>
			<td> X3D support for xml:lang attribute not provided in X3D XML Schema, instead use MetadataString as best practice. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> Wikipedia XMP <a href="https://en.wikipedia.org/wiki/Extensible_Metadata_Platform" target="_blank">https://en.wikipedia.org/wiki/Extensible_Metadata_Platform</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> Wikipedia Metadata <a href="https://en.wikipedia.org/wiki/Metadata" target="_blank">https://en.wikipedia.org/wiki/Metadata</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://en.wikipedia.org/wiki/Sidecar" target="_blank">https://en.wikipedia.org/wiki/Sidecar</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://experienceleague.adobe.com/docs/experience-manager-64/assets/administer/xmp.html" target="_blank">https://experienceleague.adobe.com/docs/experience-manager-64/assets/administer/xmp.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://en.wikipedia.org/wiki/Ontology_for_Media_Resources" target="_blank">https://en.wikipedia.org/wiki/Ontology_for_Media_Resources</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://en.wikipedia.org/wiki/Multimedia_Web_Ontology_Language" target="_blank">https://en.wikipedia.org/wiki/Multimedia_Web_Ontology_Language</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> W3C Ontology for Media Resources 1.0 <a href="https://www.w3.org/TR/mediaont-10" target="_blank">https://www.w3.org/TR/mediaont-10</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> ISO XMP ISO 16684-1:2019Part 1: Data model, serialization and core properties <a href="https://www.iso.org/standard/75163.html" target="_blank">https://www.iso.org/standard/75163.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> ISO XMP 16684-2:2014 Part 2: Description of XMP schemas using RELAX NG <a href="https://www.iso.org/standard/57422.html" target="_blank">https://www.iso.org/standard/57422.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> Adobe XMP <a href="https://www.adobe.com/devnet/xmp.html" target="_blank">https://www.adobe.com/devnet/xmp.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> Adobe XMP <a href="https://www.adobe.com/products/xmp.html" target="_blank">https://www.adobe.com/products/xmp.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> ExifTool XMP Tags <a href="https://exiftool.org/TagNames/XMP.html" target="_blank">https://exiftool.org/TagNames/XMP.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/XmpMetadataEmbedded.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/XmpMetadataEmbedded.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/license.html" target="_blank">https://www.web3d.org/x3d/content/examples/license.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 4.0, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
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

	* @author Don Brutzman, Vince Marchetti, Jakub Flotynski, Dick Puk
 */

public class XmpMetadataEmbedded
{
	/** Default constructor to create this object. */
	public XmpMetadataEmbedded ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_4_0)
  .setHead(new head()
    .addComments(" of note is that name values for these document meta terms are defined by Dublin Core ")
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("XmpMetadataEmbedded.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Simple XMP sidecar example: Hello XMP metadata!"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("29 April 2021"))
    .addMeta(new meta().setName("revised").setContent("21 February 2022"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman, Vince Marchetti, Jakub Flotynski, Dick Puk"))
    .addMeta(new meta().setName(meta.NAME_WARNING    ).setContent("Source model assumes default containerField=value for X3D4 Metadata nodes, specification resolution needed"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("Summary presentation XmpMetadataSupportX3D.pptx"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("XmpMetadataSidecar.xml"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("XmpMetadataSidecar.rdf"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("XmpMetadataSidecar.ttl"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Protege https://protege.stanford.edu"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("XmpMetadataEmbeddedX3dComparison.png"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/specifications/X3Dv4Draft/ISO-IEC19775-1v4-CD1/Part01/components/core.html#MetadataSet"))
    .addComments(" Wikipedia example RDF XML plus Protege conversion to Turtle .ttl ")
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("XmpMetadataExampleWikipedia.xml"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("XmpMetadataExampleWikipedia.ttl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://wwwimages2.adobe.com/content/dam/acom/en/devnet/xmp/pdfs/XMP%20SDK%20Release%20cc-2016-08/XMPSpecificationPart1.pdf"))
    .addMeta(new meta().setName(meta.NAME_TODO       ).setContent("Once pattern OK, write conversion stylesheets XmpToX3dMetadata.xslt and X3dMetadataToXmp.xslt"))
    .addMeta(new meta().setName(meta.NAME_INFO       ).setContent("X3D support for xml:lang attribute not provided in X3D XML Schema, instead use MetadataString as best practice."))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("Wikipedia XMP https://en.wikipedia.org/wiki/Extensible_Metadata_Platform"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("Wikipedia Metadata https://en.wikipedia.org/wiki/Metadata"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://en.wikipedia.org/wiki/Sidecar"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://experienceleague.adobe.com/docs/experience-manager-64/assets/administer/xmp.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://en.wikipedia.org/wiki/Ontology_for_Media_Resources"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://en.wikipedia.org/wiki/Multimedia_Web_Ontology_Language"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("W3C Ontology for Media Resources 1.0 https://www.w3.org/TR/mediaont-10"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("ISO XMP ISO 16684-1:2019Part 1: Data model, serialization and core properties https://www.iso.org/standard/75163.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("ISO XMP 16684-2:2014 Part 2: Description of XMP schemas using RELAX NG https://www.iso.org/standard/57422.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("Adobe XMP https://www.adobe.com/devnet/xmp.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("Adobe XMP https://www.adobe.com/products/xmp.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("ExifTool XMP Tags https://exiftool.org/TagNames/XMP.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/XmpMetadataEmbedded.x3d"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("https://www.web3d.org/x3d/content/examples/license.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 4.0, https://savage.nps.edu/X3D-Edit")))
  .setScene(new Scene()
    .addComments(" Design considerations: ")
    .addComments(" a. avoid containerField='metadata' and containerField='value' wherever possible, note X3D4 XML schema revision is needed ")
    .addComments(" b. literal XMP values wherever possible, lossless ")
    .addComments(" c. avoid nested quotes/apostrophes by using MetadataString name/value pairs ")
    .addComments(" d. map XMP parent elements to MetadataSet, otherwise have typed Metadata* values wherever possible ")
    .addComments(" e. push shared properties as high as possible in MetadataSet hierarchy, since they apply to all children ")
    .addComments(" f. assumptions: unquoted MFString values equal a single SFString array element, default Metadata* node containerField='value' ")
    .addComments(" g. MetadataSet nodes contain other Metadata* nodes as the /value/ field, thus producing tree-like structured metadata information ")
    .addChild(new WorldInfo().setTitle("XmpMetadataEmbedded.x3d"))
    .addChild(new Background().setSkyColor(new MFColor(new double[] {0.0,0.439216,0.760784})))
    .addComments(" Sample (partial) XMP sidecar file XmpMetadataSidecar.xml generated manually by Vince Marchetti as part of the STEP Geometry Services Pilot Project ")
    .addMetadata(new MetadataSet().setName("rdf:RDF").setReference("TODO refer to XMP ISO specification document")
      .setMetadata(new MetadataSet().setName("namespaces")
        .setMetadata(new MetadataString().setName("xmlns:rdf").setValue(new String[] {"http://www.w3.org/1999/02/22-rdf-syntax-ns#"}))
        .setMetadata(new MetadataString().setName("xmlns:dc").setValue(new String[] {"http://purl.org/dc/elements/1.1/"}))
        .setMetadata(new MetadataString().setName("xmlns:xmp").setValue(new String[] {"http://ns.adobe.com/xap/1.0/"})))
      .setMetadata(new MetadataSet().setName("rdf:Description")
        .setMetadata(new MetadataString().setName("rdf:about").setValue(new String[] {"https://kshell.com/sgs/example_uri_0001/"}))
        .setMetadata(new MetadataSet().setName("dc:description")
          .setMetadata(new MetadataSet().setName("rdf:Alt")
            .setMetadata(new MetadataString().setName("rdf:li").setValue(new String[] {"VRML visualization"})
              .addComments(" discouraging direct use of xml:lang='en' as an attribute, since that is legal XML but invalid X3D ")
              .setMetadata(new MetadataString().setName("xml:lang").setReference("prefer using MetadataString to indicate xml:lang values").setValue(new String[] {"en"})))))
        .setMetadata(new MetadataString().setName("dc:format").setValue(new String[] {"model/x3d-vrml"}))
        .setMetadata(new MetadataString().setName("dc:rights").setValue(new String[] {""}))
        .setMetadata(new MetadataSet().setName("dc:title")
          .setMetadata(new MetadataSet().setName("rdf:Alt")
            .setMetadata(new MetadataString().setName("rdf:li").setReference("xml:lang='en'").setValue(new String[] {"l-bracket_20120725.134815"})
              .setMetadata(new MetadataString().setName("xml:lang").setValue(new String[] {"en"})))
            .setMetadata(new MetadataString().setName("rdf:li").setReference("xml:lang='gr'").setValue(new String[] {"aristsirra-bracket_20120725.134815"})
              .setMetadata(new MetadataString().setName("xml:lang").setReference("prefer using MetadataString to indicate xml:lang values").setValue(new String[] {"en"}))))
          .setMetadata(new MetadataSet().setName("dc:creator")
            .setMetadata(new MetadataSet().setName("rdf:Seq")
              .setMetadata(new MetadataString().setName("rdf:li").setValue(new String[] {"vmarchetti@kshell.com"}))))
          .setMetadata(new MetadataString().setName("xmp:CreateDate").setValue(new String[] {"2021-2-10"})))))
    .addChild(new Viewpoint().setDescription("View scene source to see metadata examples").setPosition(0.0,0.0,9.0))
    .addChild(new Anchor().setDescription("Load scene index page").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"XmpMetadataEmbeddedIndex.html","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/XmpMetadataEmbeddedIndex.html"})
      .addChild(new Shape()
        .setGeometry(new Text().setString(new String[] {"View scene source","to see","XmpMetadataEmbedded","example"})
          .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE)))
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(1.0,0.992157,0.039216))))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return XmpMetadataEmbedded model
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
        X3D thisExampleX3dModel = new XmpMetadataEmbedded().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter15Metadata.XmpMetadataEmbedded\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter15Metadata.XmpMetadataEmbedded\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
