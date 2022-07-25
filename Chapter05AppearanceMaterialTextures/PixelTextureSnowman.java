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
import org.web3d.x3d.jsail.EnvironmentalEffects.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Sound.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> This snowman example shows a colorful PixelTexture applied to X3D primitive shapes - happy holidays!. </p>
 <p> Related links: <a href="../../../Chapter05AppearanceMaterialTextures/PixelTextureSnowman.java">PixelTextureSnowman.java</a> source, <a href="../../../Chapter05AppearanceMaterialTextures/PixelTextureSnowmanIndex.html" target="_top">PixelTextureSnowman catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter05AppearanceMaterialTextures/PixelTextureSnowman.x3d">PixelTextureSnowman.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> This snowman example shows a colorful PixelTexture applied to X3D primitive shapes - happy holidays! </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Craig Schwetje, Leonard Daly and Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 2 February 2006 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translated </i> </td>
			<td> 25 August 2008 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 29 September 2020 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://en.wikipedia.org/wiki/Snowman" target="_blank">https://en.wikipedia.org/wiki/Snowman</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Sound </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/frosty2.mid" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/frosty2.mid</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.the-north-pole.com/carols/frosty.html" target="_blank">http://www.the-north-pole.com/carols/frosty.html</a> </td>
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
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/PixelTextureSnowman.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/PixelTextureSnowman.x3d</a> </td>
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

	* @author Craig Schwetje, Leonard Daly and Don Brutzman
 */

public class PixelTextureSnowman
{
	/** Default constructor to create this object. */
	public PixelTextureSnowman ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("PixelTextureSnowman.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("This snowman example shows a colorful PixelTexture applied to X3D primitive shapes - happy holidays!"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Craig Schwetje, Leonard Daly and Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("2 February 2006"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("25 August 2008"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("29 September 2020"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://en.wikipedia.org/wiki/Snowman"))
    .addMeta(new meta().setName(meta.NAME_SOUND      ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/frosty2.mid"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.the-north-pole.com/carols/frosty.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/PixelTextureSnowman.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("PixelTextureSnowman.x3d"))
    .addChild(new Background().setSkyColor(new MFColor(new double[] {1.0,1.0,1.0})))
    .addChild(new Viewpoint().setDescription("PixelTexture Snowman").setOrientation(1.0,0.0,0.0,-0.17985).setPosition(0.0,2.0,11.0))
    .addChild(new Sound().setLocation(0.0,1.6,0.0).setMaxBack(50).setMaxFront(50).setMinBack(5).setMinFront(5).setPriority(1)
      .setSource(new AudioClip().setDescription("Frosty the Snowman").setLoop(true).setUrl(new String[] {"frosty2.mid","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/frosty2.mid"})))
    .addChild(new Transform().setTranslation(0.0,-2.5,2.0)
      .addChild(new Billboard()
        .addChild(new Anchor("WikipediaAnchorLink").setDescription("Wikipedia Snowman entry").setParameter(new String[] {"target=_blank"}).setUrl(new String[] {"https://en.wikipedia.org/wiki/Snowman"})
          .addChild(new Shape()
            .setGeometry(new Text().setString(new String[] {"Click here to learn more","about snowmen"})
              .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.6)))
            .setAppearance(new Appearance()
              .setMaterial(new Material("Autumn11").setAmbientIntensity(0.25641).setDiffuseColor(1.0,0.160784,0.764706).setShininess(1).setSpecularColor(0.48655,0.319155,0.444036))))
          .addComments(" Add transparent geometry over the text to make clicking (i.e. Anchor selection) easier ")
          .addChild(new Shape()
            .setGeometry(new Box().setSize(6.0,1.5,0.02))
            .setAppearance(new Appearance()
              .setMaterial(new Material().setTransparency(1)))))))
    .addChild(new Transform("SnowmanRoot")
      .addChild(new OrientationInterpolator("TwistInterpolator").setKey(new double[] {0.0,0.22,0.25,0.5,0.73,0.75,1.0}).setKeyValue(new MFRotation(new double[] {0.0,1.0,0.0,0.0,0.0,1.0,0.0,5.75959,0.0,1.0,0.0,5.75959,0.0,1.0,0.0,0.0,0.0,1.0,0.0,0.5236,0.0,1.0,0.0,0.5236,0.0,1.0,0.0,0.0})))
      .addChild(new TimeSensor("Clock").setCycleInterval(6).setLoop(true))
      .addChild(new ROUTE().setFromNode("TwistInterpolator").setFromField("value_changed").setToNode("SnowmanRoot").setToField("rotation"))
      .addChild(new ROUTE().setFromNode("Clock").setFromField("fraction_changed").setToNode("TwistInterpolator").setToField("set_fraction"))
      .addComments(" Hat ")
      .addChild(new Transform().setTranslation(0.0,3.6,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.003922,0.003922,0.003922)))
          .setGeometry(new Cylinder().setHeight(1).setRadius(0.5))))
      .addChild(new Transform().setTranslation(0.0,3.2,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.003922,0.003922,0.003922)))
          .setGeometry(new Cylinder().setHeight(0.2))))
      .addComments(" Head ")
      .addChild(new Transform().setTranslation(0.0,2.6,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setTexture(new PixelTexture("PixelColors").setImage(new int[] {2,4,3,0xff0000,0xffff00,0x007700,0xff0077,0x0000ff,0xff7700,0x00ff77,0x888888}).setRepeatS(false).setRepeatT(false)))
          .setGeometry(new Sphere().setRadius(.75))))
      .addComments(" Eyes ")
      .addChild(new Transform().setTranslation(0.3,2.7,.55)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0)))
          .setGeometry(new Sphere().setRadius(.18))))
      .addChild(new Transform().setTranslation(-0.3,2.7,.55)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0)))
          .setGeometry(new Sphere().setRadius(.18))))
      .addComments(" Nose ")
      .addChild(new Transform().setRotation(1.0,0.0,0.0,1.57).setTranslation(0.0,2.5,0.55)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.901961,0.403922,0.0).setEmissiveColor(1.0,0.145098,0.058824).setSpecularColor(1.0,0.454902,0.360784)))
          .setGeometry(new Cone().setBottomRadius(0.3).setHeight(1.75))))
      .addComments(" Scarf ")
      .addChild(new Transform().setTranslation(0.0,1.975,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Cylinder().setHeight(0.175).setRadius(0.8))))
      .addChild(new Transform().setTranslation(.7,1.1,.8)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(.725,1.2,.85)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(.7,1.3,.8)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(.7,1.4,.75)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(.7,1.5,.75)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(.7,1.6,.7)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(.7,1.7,.65)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(.6,1.8,.65)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(.55,1.9,.65)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(.55,2.0,.65)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addComments(" Backside of scarf ")
      .addChild(new Transform().setTranslation(-.7,1.1,-.8)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(-.725,1.2,-.85)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(-.7,1.3,-.8)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(-.7,1.4,-.75)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(-.7,1.5,-.75)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(-.7,1.6,-.7)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(-.7,1.7,-.65)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(-.6,1.8,-.65)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(-.55,1.9,-.65)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(-.55,2.0,-.65)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addComments(" Mouth ")
      .addComments(" Middle Mouthpiece ")
      .addChild(new Transform().setTranslation(0.0,2.2,.55)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(0.1,2.2,.55)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(0.2,2.2,.55)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(-0.1,2.2,.55)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(-0.2,2.2,.55)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addComments(" Pipe ")
      .addChild(new Transform().setRotation(0.96225,0.19245,-0.19245,1.57).setTranslation(0.1,2.2,0.55)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.219608,0.137255,0.0)))
          .setGeometry(new Cylinder().setRadius(0.03))))
      .addChild(new Transform().setTranslation(.45,2.3,1.5)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.219608,0.137255,0.0)))
          .setGeometry(new Cylinder().setHeight(.2).setRadius(.1))))
      .addComments(" Body ")
      .addChild(new Transform().setTranslation(0.0,1.15,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setTexture(new PixelTexture().setUSE("PixelColors")))
          .setGeometry(new Sphere().setRadius(1.1))))
      .addComments(" Arms ")
      .addChild(new Transform().setRotation(0.0,0.0,1.0,1.57).setTranslation(0.0,1.5,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(.5,.25,.05)))
          .setGeometry(new Cylinder().setHeight(4.9).setRadius(0.1))))
      .addChild(new Transform().setRotation(0.0,0.92848,0.37139,1.57).setTranslation(2.0,1.5,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(.5,.25,.05)))
          .setGeometry(new Cylinder().setHeight(.9).setRadius(0.05))))
      .addChild(new Transform().setRotation(0.84515,-0.50709,0.16903,1.57).setTranslation(1.5,1.5,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(.5,.25,.05)))
          .setGeometry(new Cylinder().setHeight(.7).setRadius(0.03))))
      .addChild(new Transform().setRotation(0.0,0.64018,0.76822,1.57).setTranslation(-1.0,1.5,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(.5,.25,.05)))
          .setGeometry(new Cylinder().setHeight(1).setRadius(0.05))))
      .addChild(new Transform().setRotation(0.0,0.70711,-0.70711,1.0).setTranslation(-1.9,1.5,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(.5,.25,.05)))
          .setGeometry(new Cylinder().setHeight(.5).setRadius(0.04))))
      .addComments(" Left Glove ")
      .addChild(new Transform().setRotation(0.0,0.0,1.0,1.57).setTranslation(2.45,1.5,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Box().setSize(0.5,0.5,0.25))))
      .addChild(new Transform().setRotation(0.95285,0.0,0.30345,1.57).setTranslation(2.75,1.5,0.05)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Cylinder().setHeight(.25).setRadius(0.25))))
      .addChild(new Transform().setRotation(0.96352,0.0,0.26764,1.57).setTranslation(2.55,1.85,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Cylinder().setHeight(.15).setRadius(0.15))))
      .addComments(" Right Glove ")
      .addChild(new Transform().setRotation(0.0,0.0,1.0,1.57).setTranslation(-2.45,1.5,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Box().setSize(0.5,0.5,0.25))))
      .addChild(new Transform().setRotation(-0.95285,0.0,0.30345,1.57).setTranslation(-2.75,1.5,0.05)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Cylinder().setHeight(.25).setRadius(0.25))))
      .addChild(new Transform().setRotation(-0.96352,0.0,0.26764,1.57).setTranslation(-2.55,1.85,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.039216,0.243137)))
          .setGeometry(new Cylinder().setHeight(.15).setRadius(0.15))))
      .addComments(" Buttons ")
      .addChild(new Transform().setTranslation(0.0,1.7,.95)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(0.0,1.25,1.05)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addChild(new Transform().setTranslation(0.0,.8,1.05)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0)))
          .setGeometry(new Sphere().setRadius(.1))))
      .addComments(" Lower Body ")
      .addChild(new Transform().setTranslation(0.0,-1.0,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setTexture(new PixelTexture().setUSE("PixelColors")))
          .setGeometry(new Sphere().setRadius(1.75))))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return PixelTextureSnowman model
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
        X3D thisExampleX3dModel = new PixelTextureSnowman().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter05AppearanceMaterialTextures.PixelTextureSnowman\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter05AppearanceMaterialTextures.PixelTextureSnowman\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
