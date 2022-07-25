package X3dForWebAuthors.Chapter05AppearanceMaterialTextures;

/*
Copyright (c) 1995-2020 held by the author(s).  All rights reserved.

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

import java.util.*;
import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Demonstrate various FillProperties values. </p>
 <p> Related links: <a href="../../../Chapter05AppearanceMaterialTextures/FillProperties.java">FillProperties.java</a> source, <a href="../../../Chapter05AppearanceMaterialTextures/FillPropertiesIndex.html" target="_top">FillProperties catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter05AppearanceMaterialTextures/FillProperties.x3d">FillProperties.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Demonstrate various FillProperties values. </td>
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
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter05AppearanceMaterialTextures/FillPropertiesHatchStyle.png">FillPropertiesHatchStyle.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter05AppearanceMaterialTextures/FillPropertiesHatchStyleOctaga.png">FillPropertiesHatchStyleOctaga.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://X3dGraphics.com" target="_blank">http://X3dGraphics.com</a> </td>
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
			<td> <a href="http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/FillProperties.x3d" target="_blank">http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/FillProperties.x3d</a> </td>
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

public class FillProperties
{
	/** Default constructor to create this object. */
	public FillProperties ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addComments(" The following component tag is needed since FillProperties node is not part of the default Immersive profile ")
    .addComponent(new component().setName("Shape").setLevel(3))
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("FillProperties.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Demonstrate various FillProperties values."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("20 August 2008"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("FillPropertiesHatchStyle.png"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("FillPropertiesHatchStyleOctaga.png"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://X3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/FillProperties.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("FillProperties.x3d"))
    .addChild(new Viewpoint().setDescription("FillProperties hatchStyle examples").setPosition(0.0f,0.0f,24.0f))
    .addChild(new Transform("OverallAdjustment")
      .addChild(new Transform("FirstRowBoxes").setTranslation(0.0f,7.0f,0.0f)
        .addChild(new Transform().setTranslation(-9.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance1")
              .setMaterial(new Material().setDiffuseColor(1.0f,0.0f,0.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties()
                .addComments(" hatchStyle='1' horizontal equally-spaced parallel lines ")))))
        .addChild(new Transform().setTranslation(-6.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance2")
              .setMaterial(new Material().setDiffuseColor(1.0f,0.5f,0.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(2)
                .addComments(" hatchStyle='2' vertical equally-spaced parallel lines ")))))
        .addChild(new Transform().setTranslation(-3.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance3")
              .setMaterial(new Material().setDiffuseColor(1.0f,1.0f,0.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(3)
                .addComments(" hatchStyle='3' positive slope equally-spaced parallel lines ")))))
        .addChild(new Transform()
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance4")
              .setMaterial(new Material().setDiffuseColor(0.0f,1.0f,0.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(4)
                .addComments(" hatchStyle='4' negative slope equally-spaced parallel lines ")))))
        .addChild(new Transform().setTranslation(3.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance5")
              .setMaterial(new Material().setDiffuseColor(0.0f,0.0f,1.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(5)
                .addComments(" hatchStyle='5' horizontal/vertical crosshatch ")))))
        .addChild(new Transform().setTranslation(6.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance6")
              .setMaterial(new Material().setDiffuseColor(0.0f,1.0f,1.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(6)
                .addComments(" hatchStyle='6' positive slope / negative slope crosshatch "))))))
      .addChild(new Transform("SecondRowText").setTranslation(0.0f,5.0f,0.0f)
        .addChild(new Transform().setTranslation(-9.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"1"})
              .setFontStyle(new FontStyle("Middle").setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(2f).setStyle("BOLD")))
            .setAppearance(new Appearance().setUSE("FillAppearance1"))))
        .addChild(new Transform().setTranslation(-6.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"2"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance2"))))
        .addChild(new Transform().setTranslation(-3.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"3"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance3"))))
        .addChild(new Transform()
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"4"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance4"))))
        .addChild(new Transform().setTranslation(3.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"5"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance5"))))
        .addChild(new Transform().setTranslation(6.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"6"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance6")))))
      .addChild(new Transform("ThirdRowBoxes").setTranslation(0.0f,2.0f,0.0f)
        .addChild(new Transform().setTranslation(-9.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance7")
              .setMaterial(new Material().setDiffuseColor(1.0f,0.0f,0.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(7)
                .addComments(" hatchStyle='7' (optional support) cast iron or malleable iron and general use for all materials ")))))
        .addChild(new Transform().setTranslation(-6.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance8")
              .setMaterial(new Material().setDiffuseColor(1.0f,0.5f,0.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(8)
                .addComments(" hatchStyle='8' (optional support) steel ")))))
        .addChild(new Transform().setTranslation(-3.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance9")
              .setMaterial(new Material().setDiffuseColor(1.0f,1.0f,0.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(9)
                .addComments(" hatchStyle='9' (optional support) bronze, brass, copper, and compositions ")))))
        .addChild(new Transform()
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance10")
              .setMaterial(new Material().setDiffuseColor(0.0f,1.0f,0.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(10)
                .addComments(" hatchStyle='10' (optional support) white metal, zinc, lead, babbit, and alloys ")))))
        .addChild(new Transform().setTranslation(3.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance11")
              .setMaterial(new Material().setDiffuseColor(0.0f,0.0f,1.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(11)
                .addComments(" hatchStyle='11' (optional support) magnesium, aluminum, and aluminum alloys ")))))
        .addChild(new Transform().setTranslation(6.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance12")
              .setMaterial(new Material().setDiffuseColor(0.0f,1.0f,1.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(12)
                .addComments(" hatchStyle='12' (optional support) rubber, plastic, and electrical insulation "))))))
      .addChild(new Transform("FourthRowText")
        .addChild(new Transform().setTranslation(-9.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"7"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance7"))))
        .addChild(new Transform().setTranslation(-6.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"8"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance8"))))
        .addChild(new Transform().setTranslation(-3.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"9"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance9"))))
        .addChild(new Transform()
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"10"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance10"))))
        .addChild(new Transform().setTranslation(3.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"11"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance11"))))
        .addChild(new Transform().setTranslation(6.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"12"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance12")))))
      .addChild(new Transform("FifthRowBoxes").setTranslation(0.0f,-3.0f,0.0f)
        .addChild(new Transform().setTranslation(-9.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance13")
              .setMaterial(new Material().setDiffuseColor(1.0f,0.0f,0.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(13)
                .addComments(" hatchStyle='13' (optional support) cork, felt, fabric, leather, and fibre ")))))
        .addChild(new Transform().setTranslation(-6.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance14")
              .setMaterial(new Material().setDiffuseColor(1.0f,0.5f,0.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(14)
                .addComments(" hatchStyle='14' (optional support) thermal insulation ")))))
        .addChild(new Transform().setTranslation(-3.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance15")
              .setMaterial(new Material().setDiffuseColor(1.0f,1.0f,0.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(15)
                .addComments(" hatchStyle='15' (optional support) titanium and refractory material ")))))
        .addChild(new Transform()
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance16")
              .setMaterial(new Material().setDiffuseColor(0.0f,1.0f,0.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(16)
                .addComments(" hatchStyle='16' (optional support) marble, slate, porcelain, glass, etc. ")))))
        .addChild(new Transform().setTranslation(3.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance17")
              .setMaterial(new Material().setDiffuseColor(0.0f,0.0f,1.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(17)
                .addComments(" hatchStyle='17' (optional support) earth ")))))
        .addChild(new Transform().setTranslation(6.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance18")
              .setMaterial(new Material().setDiffuseColor(0.0f,1.0f,1.0f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(18)
                .addComments(" hatchStyle='18' (optional support) sand ")))))
        .addChild(new Transform().setTranslation(9.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Box())
            .setAppearance(new Appearance("FillAppearance19")
              .setMaterial(new Material().setDiffuseColor(0.3f,0.3f,0.3f))
              .setFillProperties(new /*avoid name collision with file name*/org.web3d.x3d.jsail.FillProperties().setHatchStyle(19)
                .addComments(" hatchStyle='19' (optional support) repeating dot "))))))
      .addChild(new Transform("SixthRowText").setTranslation(0.0f,-5.0f,0.0f)
        .addChild(new Transform().setTranslation(-9.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"13"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance13"))))
        .addChild(new Transform().setTranslation(-6.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"14"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance14"))))
        .addChild(new Transform().setTranslation(-3.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"15"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance15"))))
        .addChild(new Transform()
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"16"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance16"))))
        .addChild(new Transform().setTranslation(3.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"17"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance17"))))
        .addChild(new Transform().setTranslation(6.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"18"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance18"))))
        .addChild(new Transform().setTranslation(9.0f,0.0f,0.0f)
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"19"})
              .setFontStyle(new FontStyle().setUSE("Middle")))
            .setAppearance(new Appearance().setUSE("FillAppearance19")))))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return FillProperties model
	 */
	public X3D getX3dModel()
	{	  
		return x3dModel;
	}
	   
    /** Default main() method provided for test purposes, uses CommandLine to set global ConfigurationProperties for this object.
     * @param args array of input parameters, provided as arguments
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html#handleArguments-java.lang.String:A-">X3D.handleArguments(args)</a>
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html#validationReport--">X3D.validationReport()</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/CommandLine.html">CommandLine</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/CommandLine.html#USAGE">CommandLine.USAGE</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/ConfigurationProperties.html">ConfigurationProperties</a>
     */
    public static void main(String args[])
    {
        X3D thisExampleX3dModel = new FillProperties().getX3dModel();

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
			System.out.println("WARNING: \"FillProperties\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"FillProperties\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
			System.out.println(validationResults);
		}
    }
}
