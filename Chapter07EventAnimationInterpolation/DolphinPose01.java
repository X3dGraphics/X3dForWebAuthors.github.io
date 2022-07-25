package X3dForWebAuthors.Chapter07EventAnimationInterpolation;

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
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> First pose for bottlenose dolphin is neutral position, exported from Maya with values used in DolphinMorpher. </p>
 <p> Related links: <a href="../../../Chapter07EventAnimationInterpolation/DolphinPose01.java">DolphinPose01.java</a> source, <a href="../../../Chapter07EventAnimationInterpolation/DolphinPose01Index.html" target="_top">DolphinPose01 catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter07EventAnimationInterpolation/DolphinPose01.x3d">DolphinPose01.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> First pose for bottlenose dolphin is neutral position, exported from Maya with values used in DolphinMorpher. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Chris Lang </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 1 August 2007 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 1 April 2020 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter07EventAnimationInterpolation/DolphinMorpher.x3d">DolphinMorpher.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter07EventAnimationInterpolation/DolphinPose02.x3d">DolphinPose02.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter07EventAnimationInterpolation/DolphinPose03.x3d">DolphinPose03.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter07EventAnimationInterpolation/DolphinSwitcher.x3d">DolphinSwitcher.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://en.wikipedia.org/wiki/Dolphin" target="_blank">https://en.wikipedia.org/wiki/Dolphin</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/DolphinPose01.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/DolphinPose01.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://savage.nps.edu/Savage/Biologics/Dolphin/DolphinPose01.x3d" target="_blank">https://savage.nps.edu/Savage/Biologics/Dolphin/DolphinPose01.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> RawKee, <a href="http://rawkee.sourceforge.net" target="_blank">http://rawkee.sourceforge.net</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter07EventAnimationInterpolation/../license.html">../license.html</a> </td>
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

	* @author Chris Lang
 */

public class DolphinPose01
{
	/** Default constructor to create this object. */
	public DolphinPose01 ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERACTIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("DolphinPose01.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("First pose for bottlenose dolphin is neutral position, exported from Maya with values used in DolphinMorpher."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Chris Lang"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 August 2007"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("1 April 2020"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("DolphinMorpher.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("DolphinPose02.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("DolphinPose03.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("DolphinSwitcher.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://en.wikipedia.org/wiki/Dolphin"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/DolphinPose01.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://savage.nps.edu/Savage/Biologics/Dolphin/DolphinPose01.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("RawKee, http://rawkee.sourceforge.net"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("DolphinPose01.x3d"))
    .addChild(new Background().setGroundColor(new MFColor(new double[] {1.0,1.0,1.0})).setSkyColor(new MFColor(new double[] {1.0,1.0,1.0})))
    .addChild(new Viewpoint().setDescription("Dolphin at 2m").setPosition(0.0,0.0,2.0))
    .addChild(new Transform().setRotation(0.0,1.0,0.0,1.57).setScale(0.1,0.1,0.1).setTranslation(0.12,-0.22,0.0)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,0.5,1.0)))
        .setGeometry(new IndexedFaceSet().setCreaseAngle(3.141593).setCoordIndex(getIndexedFaceSet_5_22_coordIndex())
          .setCoord(new Coordinate().setPoint(getCoordinate_6_22_point())))))
    .addChild(new Switch("DiagnosticToolsForSizeAndDirection").setWhichChoice(-1)
      .addChild(new Inline().setUrl(new String[] {"../../Savage/Tools/Authoring/CoordinateAxes.x3d","https://savage.nps.edu/Savage/Tools/Authoring/CoordinateAxes.x3d"}))
      .addChild(new Inline().setUrl(new String[] {"../../Savage/Tools/Authoring/GridXZ_20x20Fixed.x3d","https://savage.nps.edu/Savage/Tools/Authoring/GridXZ_20x20Fixed.x3d"}))));
    }
	// end of initialize() method

		/** Define subarrays using type int[] */
		private int[] getIndexedFaceSet_5_22_coordIndex_1()
		{
			int[] value = {78,62,145,144,-1,160,82,39,-1,196,161,163,-1,167,164,166,-1,287,173,172,-1,183,298,181,-1,185,2,295,-1,327,77,186,-1,192,2,185,-1,23,70,194,195,-1,198,196,197,-1,197,196,199,-1,201,151,200,68,-1,202,149,152,-1,174,173,203,-1,204,207,206,-1,226,33,210,211,-1,215,13,212,214,-1,213,28,216,218,-1,217,29,220,-1,223,31,214,-1,221,213,218,224,-1,217,220,226,-1,227,32,222,-1,212,13,231,230,-1,236,38,71,235,-1,240,82,147,40,-1,241,18,37,-1,248,4,247,-1,255,251,250,-1,256,243,242,254,-1,46,253,264,-1,261,269,258,257,-1,259,48,255,262,-1,262,250,41,270,-1,264,42,272,-1,263,44,260,-1,258,269,256,-1,269,261,264,-1,271,50,262,-1,273,256,269,-1,274,271,270,-1,275,79,326,-1,76,54,191,-1,192,80,278,-1,279,76,22,-1,280,53,276,-1,281,335,277,-1,333,277,193,-1,162,58,282,-1,284,69,166,-1,196,198,161,-1,194,70,285,-1,289,65,177,-1,291,29,216,-1,320,292,293,-1,297,20,325,-1,300,15,298,183,-1,298,15,301,302,-1,302,64,303,173,-1,232,36,304,305,-1,307,60,69,306,-1,308,11,167,-1,496,485,72,-1,485,504,180,-1,310,19,311,-1,208,67,233,312,-1,173,14,314,203,-1,145,62,285,316,-1,313,35,322,-1,170,3,324,160,-1,162,282,324,-1,164,163,165,-1,182,74,176,73,-1,326,188,182,-1,326,75,275,-1,279,55,76,-1,55,327,76,-1,190,1,328,327,-1,288,63,329,-1,175,7,330,329,-1,205,27,330,-1,209,5,323,331,-1,195,0,198,-1,198,0,286,-1,75,193,275,-1,332,334,184,-1,191,54,335,-1,187,9,336,192,-1,290,66,337,-1,66,202,337,-1,10,39,238,-1,39,82,240,-1,58,78,148,-1,342,124,138,338,-1,143,353,101,-1,357,391,355,-1,361,358,359,-1,369,474,366,-1,296,16,386,-1,504,373,387,-1,481,375,374,-1,476,85,378,-1,380,137,499,-1,378,85,385,-1,388,131,23,387,-1,391,389,390,-1,391,390,392,-1,394,343,393,129,-1,345,395,348,-1,478,369,368,-1,401,397,398,-1,210,33,413,402,-1,405,13,215,403,-1,408,97,404,406,-1,98,407,409,-1,403,31,223,-1,406,404,411,412,-1,409,407,413,-1,410,32,227,-1,231,13,405,415,-1,132,100,420,419,-1,340,143,424,102,-1,37,18,425,-1,432,87,431,-1,105,426,440,437,-1,436,439,448,-1,445,455,442,441,-1,107,110,444,446,-1,103,433,446,447,-1,104,448,453,-1,443,108,449,-1,455,445,440,-1,442,455,448,-1,450,115,453,-1,446,113,457,-1,453,448,450,-1,455,440,447,-1,497,139,458,-1,118,498,384,-1,385,140,460,-1,461,141,505,-1,386,16,460,-1,498,465,462,-1,136,463,464,-1,459,117,464,-1,460,140,466,-1,386,460,467,-1,468,122,356,-1,359,130,469,-1,389,391,357,-1,472,131,388,-1,371,126,475,-1,408,98,478,-1,292,492,479,-1,325,20,480,-1,481,15,300,375,-1,301,15,481,482,-1,303,64,482,369,-1,304,36,418,483,-1,130,60,307,484,-1,358,11,308,-1,485,496,133,-1,311,19,486,-1,417,128,400,487,-1,314,14,369,478,-1,472,124,342,490,-1,494,99,488,-1,495,86,363,353,-1,468,356,495,-1,355,361,360,-1,370,135,376,134,-1,381,497,376,-1,458,136,497,-1,498,119,465,-1,499,119,498,-1,500,84,383,499,-1,501,125,473,-1,502,90,367,501,-1,502,96,396,-1,493,88,399,503,-1,389,83,387,-1,471,83,389,-1,386,136,458,-1,505,118,384,-1,506,92,379,505,-1,507,127,477,-1,507,395,127,-1,422,101,93,-1,143,101,424,-1,339,138,122,-1,145,4,146,144,-1,146,147,144,-1,147,82,148,144,-1,148,78,144,-1,149,202,157,-1,157,81,150,149,-1,150,6,151,149,-1,152,8,153,-1,153,65,154,152,-1,155,202,66,-1,156,10,157,158,-1,157,202,158,-1,159,160,39,-1,161,58,162,163,-1,163,164,196,-1,164,165,166,-1,165,59,166,-1,166,69,167,-1,169,3,170,168,-1,170,35,171,168,-1,173,174,172,-1,174,7,175,172,-1,175,63,287,172,-1,297,73,176,-1,296,297,176,-1,176,74,296,-1,68,293,177,-1,177,65,153,-1,153,8,68,177,-1,241,285,178,-1,178,61,179,-1,179,18,241,178,-1,195,24,180,-1,180,24,72,-1,298,1,182,181,-1,182,299,181,-1,299,183,181,-1,279,56,276,-1,56,57,280,276,-1,295,16,185,-1,186,9,187,327,-1};
			return value;
		}
		private int[] getIndexedFaceSet_5_22_coordIndex_2()
		{
			int[] value = {187,54,327,-1,326,79,188,-1,182,1,190,189,-1,190,55,189,-1,55,53,182,189,-1,281,191,335,-1,16,277,185,-1,277,335,192,185,-1,194,0,195,-1,197,24,195,-1,195,198,197,-1,196,164,199,-1,199,72,24,-1,24,197,199,-1,164,167,199,-1,200,320,68,-1,68,8,201,-1,149,151,201,152,-1,201,8,152,-1,152,337,202,-1,158,202,155,-1,203,204,174,-1,204,27,205,174,-1,205,7,174,-1,207,67,208,206,-1,208,5,209,206,-1,209,27,204,206,-1,210,34,211,-1,211,221,224,-1,224,226,211,-1,212,28,213,214,-1,214,31,215,-1,216,29,217,218,-1,29,25,219,220,-1,219,30,220,-1,214,213,221,-1,221,222,214,-1,222,32,223,214,-1,218,217,224,-1,220,30,225,226,-1,221,211,222,-1,211,34,227,222,-1,224,217,226,-1,226,225,228,-1,228,33,226,-1,151,6,229,200,-1,229,318,200,-1,318,320,200,-1,231,36,232,230,-1,232,171,233,230,-1,233,67,234,230,-1,234,28,212,230,-1,71,318,229,235,-1,229,6,236,235,-1,238,40,38,237,-1,38,236,237,-1,236,6,150,237,-1,150,81,238,237,-1,159,39,10,239,-1,10,156,239,-1,147,146,40,-1,238,240,40,-1,146,4,242,243,-1,38,40,244,-1,40,41,244,-1,40,146,243,-1,243,41,40,-1,315,71,245,-1,245,42,315,-1,71,38,246,245,-1,247,315,248,-1,315,42,253,248,-1,41,250,244,-1,250,251,244,-1,245,252,42,-1,245,246,252,-1,246,43,252,-1,242,249,254,-1,252,44,42,-1,252,43,44,-1,43,45,44,-1,41,243,256,-1,45,49,260,44,-1,253,42,264,-1,258,47,48,257,-1,48,259,257,-1,259,50,260,257,-1,260,49,257,-1,49,46,261,257,-1,255,250,262,-1,262,50,259,-1,41,256,270,-1,42,44,263,272,-1,260,50,263,-1,254,47,258,256,-1,261,46,264,-1,52,51,272,-1,274,270,273,-1,264,272,269,-1,272,265,269,-1,272,263,266,-1,263,50,267,-1,267,266,263,-1,270,271,262,-1,51,265,272,-1,266,52,272,-1,267,52,266,-1,268,273,269,-1,270,256,273,-1,191,22,76,-1,55,276,53,-1,278,2,192,-1,296,74,188,-1,188,79,193,296,-1,193,277,16,296,-1,22,56,279,-1,280,57,75,-1,276,55,279,-1,333,184,277,-1,184,281,277,-1,193,75,333,-1,166,59,283,284,-1,283,3,169,284,-1,198,78,58,161,-1,285,62,286,194,-1,286,0,194,-1,287,63,288,-1,288,1,298,287,-1,177,293,295,289,-1,295,2,289,-1,154,65,289,-1,289,2,278,154,-1,278,80,290,154,-1,290,9,186,-1,186,77,290,-1,216,28,234,-1,234,67,207,216,-1,207,204,291,216,-1,292,294,293,-1,68,320,293,-1,294,16,295,293,-1,296,20,297,-1,325,73,297,-1,299,21,300,183,-1,301,64,302,-1,287,298,302,-1,303,14,173,-1,173,287,302,-1,304,12,305,-1,305,169,168,-1,168,171,232,305,-1,69,284,306,-1,284,169,305,306,-1,305,12,307,306,-1,69,60,308,167,-1,167,11,309,199,-1,309,496,72,199,-1,485,180,72,-1,504,195,180,-1,310,70,23,-1,23,19,310,-1,311,61,178,310,-1,178,285,310,-1,285,70,310,-1,233,171,312,-1,171,35,313,312,-1,313,5,208,312,-1,314,25,29,203,-1,29,291,203,-1,291,204,203,-1,241,71,315,-1,285,241,316,-1,241,315,316,-1,315,247,316,-1,247,4,145,316,-1,71,241,318,-1,241,37,317,318,-1,317,17,318,-1,318,17,319,-1,319,26,320,318,-1,320,26,321,-1,321,292,320,-1,322,159,239,-1,239,156,323,322,-1,323,5,313,322,-1,324,82,160,-1,160,159,322,-1,322,35,170,160,-1,282,82,324,-1,324,3,283,-1,283,59,162,324,-1,163,162,165,-1,162,59,165,-1,325,21,299,73,-1,299,182,73,-1,188,74,182,-1,182,53,326,-1,280,75,326,-1,326,53,280,-1,327,54,76,-1,328,77,327,-1,327,55,190,-1,329,66,290,288,-1,290,77,328,288,-1,328,1,288,-1,330,155,66,329,-1,329,63,175,-1,330,158,155,-1,330,7,205,-1,323,156,158,331,-1,158,330,331,-1,330,27,209,331,-1,504,23,195,-1,286,62,78,198,-1,193,79,275,-1,332,333,75,-1,333,332,184,-1,281,184,22,-1,184,334,22,-1,191,281,22,-1,336,80,192,-1,335,54,187,192,-1,337,154,290,-1,290,80,336,-1,336,9,290,-1,152,154,337,-1,157,10,81,-1,81,10,238,-1,238,39,240,-1,82,282,148,-1,282,58,148,-1,138,339,338};
			return value;
		}
		private int[] getIndexedFaceSet_5_22_coordIndex_3()
		{
			int[] value = {-1,339,143,340,338,-1,340,341,338,-1,341,87,342,338,-1,343,89,344,345,-1,344,142,351,345,-1,351,395,345,-1,346,126,347,348,-1,347,91,348,-1,127,395,349,-1,350,395,351,-1,351,93,352,350,-1,353,354,101,-1,391,361,355,-1,356,122,357,355,-1,358,130,359,-1,359,123,360,-1,360,361,359,-1,362,99,363,365,-1,363,86,364,365,-1,474,125,367,366,-1,367,90,368,366,-1,368,369,366,-1,370,134,480,-1,386,135,370,-1,370,480,296,386,-1,129,91,347,371,-1,347,126,371,-1,371,479,129,-1,425,18,179,372,-1,179,61,372,-1,372,472,425,-1,373,95,387,-1,95,373,133,-1,375,21,374,-1,21,376,374,-1,376,84,481,374,-1,464,463,462,459,-1,462,465,459,-1,377,467,466,-1,16,476,378,-1,118,379,499,-1,379,92,380,499,-1,381,139,497,-1,376,117,119,382,-1,119,383,382,-1,383,84,376,382,-1,384,140,505,-1,140,385,505,-1,385,460,378,-1,460,16,378,-1,387,83,388,-1,389,387,390,-1,387,95,390,-1,390,95,392,-1,95,133,392,-1,392,361,391,-1,392,358,361,-1,393,91,129,-1,492,394,129,-1,395,507,348,-1,348,91,393,-1,393,343,345,348,-1,395,350,349,-1,368,90,396,-1,396,96,397,368,-1,397,478,368,-1,397,96,399,398,-1,399,88,400,398,-1,400,128,401,398,-1,413,412,402,-1,412,411,402,-1,402,34,210,-1,215,31,403,-1,404,97,405,403,-1,407,98,408,406,-1,409,30,219,-1,219,25,98,409,-1,223,32,410,403,-1,410,411,403,-1,411,404,403,-1,407,406,412,-1,225,30,409,413,-1,227,34,402,410,-1,402,411,410,-1,413,407,412,-1,413,33,228,-1,228,225,413,-1,394,492,491,-1,491,414,394,-1,414,89,343,394,-1,405,97,416,415,-1,416,128,417,415,-1,417,362,418,415,-1,418,36,231,415,-1,420,89,414,419,-1,414,491,132,419,-1,422,142,344,421,-1,344,89,420,421,-1,420,100,421,-1,100,102,422,421,-1,352,93,423,-1,93,101,354,423,-1,424,422,102,-1,102,341,340,-1,105,427,426,-1,427,87,341,426,-1,428,103,102,-1,102,100,428,-1,103,426,102,-1,426,341,102,-1,489,104,429,-1,132,489,429,-1,430,100,132,429,-1,436,104,489,431,-1,489,432,431,-1,428,106,433,-1,433,103,428,-1,434,429,104,-1,435,430,429,434,-1,106,107,433,-1,104,108,434,-1,438,435,434,108,-1,440,426,103,-1,443,111,438,108,-1,439,112,448,-1,104,436,448,-1,442,112,111,441,-1,111,443,441,-1,443,113,444,441,-1,444,110,441,-1,110,109,445,441,-1,444,113,446,-1,446,433,107,-1,446,114,447,-1,440,103,447,-1,449,108,104,453,-1,449,113,443,-1,445,109,437,440,-1,448,112,442,-1,451,447,116,-1,453,454,449,-1,454,113,449,-1,457,114,446,-1,452,450,455,-1,450,448,455,-1,453,115,454,-1,447,451,456,455,-1,457,116,114,-1,114,116,447,-1,498,94,384,-1,459,119,117,-1,385,85,461,505,-1,386,139,381,-1,381,135,386,-1,462,94,498,-1,465,119,459,-1,466,467,460,-1,467,136,386,-1,364,86,470,469,-1,470,123,359,469,-1,122,138,389,357,-1,388,83,471,-1,471,124,472,388,-1,481,84,473,474,-1,473,125,474,-1,475,85,476,-1,476,479,371,475,-1,477,141,461,346,-1,461,85,475,346,-1,475,126,346,-1,477,137,380,-1,380,92,477,-1,478,397,401,408,-1,401,128,416,408,-1,416,97,408,-1,492,129,479,-1,479,294,292,-1,16,294,476,-1,294,479,476,-1,480,20,296,-1,300,21,375,-1,481,474,482,-1,482,64,301,-1,482,474,369,-1,369,14,303,-1,418,362,365,483,-1,365,364,483,-1,483,12,304,-1,307,12,483,484,-1,483,364,469,484,-1,469,130,484,-1,308,60,130,358,-1,133,496,309,392,-1,309,11,358,392,-1,133,373,485,-1,485,373,504,-1,19,23,486,-1,23,131,486,-1,486,131,472,311,-1,472,372,311,-1,372,61,311,-1,400,88,488,487,-1,488,99,362,487,-1,362,417,487,-1,98,25,314,478,-1,132,425,489,-1,342,87,432,490,-1,432,489,490,-1,489,425,490,-1,425,472,490,-1,491,17,317,-1,317,37,425,491,-1,425,132,491,-1,492,26,319,491,-1,319,17,491,-1,492,292,321,-1,321,26,492,-1,488,88,493,494,-1,493,352,423,494,-1,423,354,494,-1,363,99,494,353,-1,494,354,353,-1,353,143,495,-1,356,123,470,495,-1,470,86,495,-1,495,143,468,-1,360,123,356,-1,356,355,360,-1,21,325,134,-1,325,480};
			return value;
		}
		private int[] getIndexedFaceSet_5_22_coordIndex_4()
		{
			int[] value = {134,-1,376,21,134,-1,497,117,376,-1,376,135,381,-1,464,117,497,-1,497,136,464,-1,498,118,499,-1,383,119,499,-1,499,137,500,-1,473,84,500,-1,500,137,477,473,-1,477,127,501,473,-1,367,125,501,-1,127,349,502,501,-1,396,90,502,-1,349,350,502,-1,399,96,502,503,-1,502,350,503,-1,350,352,493,503,-1,387,23,504,-1,138,124,471,389,-1,139,386,458,-1,467,121,136,-1,120,121,467,377,-1,94,120,377,-1,377,466,94,-1,466,140,94,-1,94,140,384,-1,379,118,505,-1,505,141,506,-1,477,92,506,-1,506,141,477,-1,477,346,507,-1,507,346,348,-1,142,93,351,-1,93,142,422,-1,101,422,424,-1,122,468,339,-1,468,143,339,-1};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getCoordinate_6_22_point_1()
		{
			double[] value = {0.406,0.431,7.729,0.595,1.561,-10.422,0.592,0.769,-10.422,1.246,2.580,5.322,1.352,0.670,5.216,1.336,3.003,-1.028,1.311,0.633,-1.014,1.094,2.428,-4.614,1.092,0.629,-4.612,0.731,1.187,-10.147,1.609,1.746,-0.340,0.000,1.113,8.550,0.000,3.207,5.322,0.000,3.848,-0.860,0.000,3.028,-4.612,0.000,2.040,-10.362,0.000,0.886,-12.299,0.000,0.136,-1.026,0.000,0.152,5.257,0.000,0.379,7.698,0.000,1.065,-12.565,-0.000,1.374,-12.292,2.230,1.059,-11.085,0.000,0.392,9.855,0.244,0.553,9.919,0.000,3.483,-3.428,0.000,0.197,-3.217,1.254,2.808,-3.215,0.288,3.777,-1.600,0.214,3.435,-3.395,0.000,4.020,-3.239,0.000,4.438,-1.976,0.000,5.045,-2.584,0.000,5.251,-3.530,0.000,5.399,-3.333,1.351,2.814,3.536,0.000,3.469,3.545,0.000,0.137,4.670,1.420,0.636,4.214,1.604,1.671,4.578,1.474,0.838,4.580,1.615,0.744,4.738,2.012,0.605,5.197,1.891,0.680,4.511,2.315,0.613,4.392,2.320,0.658,4.365,2.762,0.671,5.234,2.762,0.671,5.234,2.573,0.658,4.345,2.573,0.658,4.345,3.547,0.659,4.257,4.976,0.668,4.557,4.865,0.659,4.356,1.565,1.128,-12.158,1.492,1.084,-10.816,1.564,1.210,-11.129,3.827,0.976,-12.272,3.827,0.982,-12.578,1.128,1.068,6.698,0.877,2.107,6.850,0.000,2.493,6.857,0.000,0.237,6.317,0.903,0.501,6.417,0.760,1.988,-7.525,0.000,2.581,-7.523,0.759,0.704,-7.520,0.948,1.515,-7.250,0.794,3.480,-1.028,0.820,0.463,-4.395,0.307,2.445,6.855,0.212,0.393,7.706,1.254,0.521,4.411,0.133,0.618,10.238,0.261,1.198,-12.564,0.578,1.055,-12.541,2.366,1.024,-12.423,2.104,1.141,-11.057,0.707,1.377,-10.148,1.003,0.639,6.475,1.337,1.029,-12.400,0.703,0.957,-10.145,1.569,1.470,-1.024,1.518,1.506,5.354,-0.406,0.431,7.729,-0.595,1.561,-10.422,-0.592,0.769,-10.422,-1.246,2.580,5.322,-1.352,0.670,5.216,-1.336,3.003,-1.028,-1.311,0.633,-1.014,-1.094,2.428,-4.614,-1.092,0.629,-4.612,-0.731,1.187,-10.147,-1.609,1.746,-0.340,-2.230,1.059,-11.085,-0.244,0.553,9.919,-1.254,2.808,-3.215,-0.288,3.777,-1.600,-0.214,3.435,-3.395,-1.351,2.814,3.536};
			return value;
		}
		private double[] getCoordinate_6_22_point_2()
		{
			double[] value = {-1.420,0.636,4.214,-1.604,1.671,4.578,-1.473,0.836,4.576,-1.615,0.744,4.738,-2.012,0.605,5.197,-2.234,0.673,5.350,-1.890,0.680,4.511,-2.320,0.658,4.365,-2.315,0.613,4.392,-2.762,0.671,5.234,-2.573,0.658,4.345,-2.573,0.658,4.345,-2.762,0.671,5.234,-3.547,0.659,4.257,-4.261,0.725,4.286,-4.864,0.659,4.356,-4.863,0.665,4.338,-1.565,1.128,-12.158,-1.492,1.084,-10.816,-1.563,1.210,-11.129,-3.827,0.976,-12.272,-3.827,0.982,-12.578,-1.128,1.068,6.698,-0.877,2.107,6.850,-0.902,0.501,6.417,-0.759,1.988,-7.525,-0.759,0.704,-7.520,-0.948,1.515,-7.250,-0.794,3.480,-1.028,-0.819,0.463,-4.395,-0.307,2.445,6.855,-0.212,0.393,7.706,-1.254,0.521,4.411,-0.137,0.615,10.244,-0.261,1.198,-12.564,-0.578,1.055,-12.541,-2.366,1.024,-12.423,-0.707,1.377,-10.148,-1.003,0.639,6.475,-1.337,1.029,-12.400,-2.279,0.934,-11.170,-0.703,0.957,-10.145,-1.569,1.470,-1.024,-1.518,1.506,5.354,1.233,0.778,5.854,1.109,0.588,5.817,1.438,0.739,5.328,1.396,0.917,5.267,1.295,1.084,6.077,1.405,0.892,-2.699,1.454,0.898,-1.018,1.236,0.634,-3.216,1.270,0.860,-4.084,0.936,0.662,-5.934,0.694,0.829,-8.669,1.379,1.957,-4.058,1.568,2.080,-1.032,1.558,1.624,-2.313,1.508,2.086,-2.805,1.589,2.017,3.535,1.463,2.430,4.673,0.797,0.864,7.352,1.013,1.760,6.828,0.751,1.109,7.521,0.381,1.058,8.491,0.617,1.586,7.661,0.646,2.303,6.847,0.106,1.125,8.519,0.981,2.986,4.668,0.910,2.855,5.330,1.324,2.705,4.681,0.976,3.127,3.434,0.727,2.392,-5.922,0.335,2.916,-4.634,0.966,2.573,-4.485,0.935,2.209,-5.943,0.382,1.062,-12.565,0.621,0.628,-7.359,0.282,0.263,6.203,0.000,0.184,5.782,0.166,0.528,10.234,0.396,1.504,-11.480,0.649,1.167,-12.481,0.260,1.546,-11.710,3.826,0.914,-12.348,0.726,0.854,-11.610,0.721,1.285,-10.145,1.037,1.121,-10.645,0.906,1.042,-12.467,0.923,1.290,-11.505,0.990,1.355,-10.861,1.878,1.065,-10.958,1.003,0.861,-10.643,1.651,0.954,-12.386,0.321,0.404,7.701,0.129,0.403,10.192,0.568,0.753,7.966,0.376,0.628,8.977,0.452,0.474,7.716,0.243,0.765,9.388};
			return value;
		}
		private double[] getCoordinate_6_22_point_3()
		{
			double[] value = {0.958,0.464,-3.212,1.183,0.626,-3.826,1.487,1.651,-3.429,0.495,3.088,-3.826,0.922,3.111,-3.174,1.192,2.632,-3.828,1.072,3.194,-2.389,0.789,3.383,-2.403,1.095,3.269,-1.023,1.303,2.947,-2.396,0.000,5.392,-3.498,0.128,5.385,-3.462,0.191,3.821,-0.863,0.219,4.008,-1.909,0.126,4.143,-1.749,0.000,4.131,-1.732,0.328,3.588,-2.446,0.206,3.787,-2.996,0.248,3.828,-2.467,0.000,3.741,-3.260,0.109,3.788,-3.231,0.226,5.068,-2.873,0.135,5.104,-2.721,0.000,4.755,-2.253,0.232,5.201,-3.339,0.000,4.368,-3.296,0.167,5.139,-3.511,0.000,5.272,-2.986,0.000,4.982,-3.473,1.003,0.446,-1.011,0.385,3.554,1.285,0.000,3.616,1.293,0.367,3.401,3.541,0.755,3.400,1.295,0.492,3.614,-1.030,1.014,0.450,1.353,1.328,0.645,1.350,1.474,0.907,1.335,1.604,1.488,3.209,1.590,2.063,1.573,1.561,1.381,4.755,0.297,0.190,4.913,1.964,0.671,5.324,1.614,0.728,5.244,1.413,0.658,4.519,1.430,0.579,4.514,1.413,0.641,4.485,1.240,0.557,5.386,1.964,0.671,5.324,2.211,0.671,5.324,1.924,0.731,4.517,1.891,0.680,4.511,1.833,0.628,4.515,2.214,0.671,5.326,2.523,0.671,5.282,2.320,0.658,4.365,3.611,0.726,5.012,3.127,0.666,4.787,3.381,0.678,5.036,3.076,0.670,4.423,3.098,0.624,4.397,3.381,0.661,5.036,3.123,0.722,4.376,3.490,0.627,4.263,3.551,0.609,5.030,4.481,0.672,4.853,4.358,0.603,4.306,4.071,0.659,4.210,4.481,0.672,4.853,4.170,0.672,5.005,4.568,0.733,4.344,4.071,0.659,4.210,4.838,0.602,4.544,4.994,0.691,4.570,4.865,0.659,4.356,1.835,1.024,-12.395,3.820,1.043,-12.422,1.577,0.925,-12.144,0.684,0.847,-10.138,3.518,1.067,-12.052,3.620,1.035,-12.527,2.659,0.927,-11.399,1.361,1.436,6.015,1.093,2.412,6.052,0.781,2.632,6.137,0.630,0.369,6.267,0.653,0.456,6.971,0.355,2.259,-8.187,0.618,1.788,-9.010,0.615,0.734,-9.002,0.737,1.306,-9.055,0.458,3.318,-3.210,0.000,0.289,-4.582,0.269,0.595,-7.825,0.000,0.556,-7.641,0.270,0.732,-10.030,0.000,0.940,-12.597,0.240,1.063,-12.566,0.241,1.942,-10.437,0.195,1.321,-12.350};
			return value;
		}
		private double[] getCoordinate_6_22_point_4()
		{
			double[] value = {0.000,1.683,-11.509,0.000,2.334,-9.004,0.129,2.330,-8.812,0.000,2.812,-5.943,0.000,3.357,4.687,0.317,3.261,4.931,0.291,2.903,6.023,0.000,2.946,6.044,0.000,1.799,7.681,0.000,0.784,9.395,0.106,0.383,7.689,0.000,0.312,6.892,1.095,3.189,1.301,1.353,2.936,1.287,0.000,3.237,-3.817,1.211,0.512,5.154,0.882,0.444,5.769,0.000,0.131,1.305,0.295,0.189,-1.395,0.000,0.162,-2.408,0.236,0.226,-3.221,0.000,0.230,-3.825,1.495,2.559,3.122,1.457,2.704,-1.029,1.311,2.240,5.697,0.000,1.220,-12.566,1.442,1.093,-12.386,1.014,1.322,-10.644,0.686,1.478,-10.145,0.906,1.889,-6.966,1.349,2.495,-3.479,1.420,2.673,-2.376,3.827,0.982,-12.578,3.639,0.929,-12.522,3.827,0.976,-12.272,1.637,0.930,-10.874,0.717,1.074,-10.141,0.969,1.264,-6.931,-1.233,0.778,5.854,-1.295,1.084,6.077,-1.396,0.917,5.267,-1.438,0.739,5.328,-1.109,0.588,5.817,-1.236,0.634,-3.216,-1.454,0.898,-1.018,-1.405,0.892,-2.699,-0.694,0.829,-8.669,-0.936,0.662,-5.934,-1.270,0.860,-4.084,-1.376,1.957,-4.068,-1.508,2.086,-2.805,-1.558,1.624,-2.313,-1.568,2.080,-1.032,-1.462,2.430,4.673,-1.589,2.017,3.535,-0.751,1.109,7.521,-1.013,1.760,6.828,-0.797,0.864,7.352,-0.095,1.122,8.527,-0.646,2.303,6.847,-0.617,1.586,7.661,-0.381,1.058,8.491,-0.976,3.127,3.434,-1.323,2.705,4.681,-0.910,2.855,5.330,-0.981,2.986,4.668,-0.727,2.392,-5.922,-0.935,2.209,-5.943,-0.966,2.573,-4.485,-0.313,2.931,-4.622,-0.382,1.062,-12.565,-0.621,0.628,-7.359,-0.282,0.263,6.203,-0.166,0.528,10.234,-0.396,1.504,-11.480,-0.260,1.546,-11.710,-0.649,1.167,-12.481,-3.839,0.962,-12.367,-0.726,0.854,-11.610,-1.037,1.121,-10.645,-0.721,1.285,-10.145,-0.906,1.042,-12.467,-0.923,1.290,-11.505,-0.990,1.355,-10.861,-1.878,1.065,-10.958,-1.205,0.880,-10.984,-1.383,0.958,-12.384,-0.130,0.403,10.191,-0.321,0.404,7.701,-0.452,0.474,7.716,-0.376,0.628,8.977,-0.568,0.753,7.966,-0.243,0.765,9.388,-1.183,0.626,-3.826,-0.958,0.464,-3.212,-1.487,1.651,-3.429,-1.192,2.632,-3.828,-0.922,3.111,-3.174,-1.072,3.194,-2.389,-1.303,2.947,-2.396};
			return value;
		}
		private double[] getCoordinate_6_22_point_5()
		{
			double[] value = {-1.095,3.269,-1.023,-0.789,3.383,-2.403,-0.128,5.385,-3.462,-0.126,4.143,-1.749,-0.219,4.008,-1.909,-0.191,3.821,-0.863,-0.248,3.828,-2.467,-0.206,3.787,-2.996,-0.328,3.588,-2.446,-0.109,3.788,-3.231,-0.135,5.104,-2.721,-0.226,5.068,-2.873,-0.232,5.201,-3.339,-0.167,5.139,-3.511,-1.003,0.446,-1.011,-0.385,3.554,1.285,-0.492,3.614,-1.030,-0.755,3.400,1.295,-0.367,3.401,3.541,-1.014,0.450,1.353,-1.328,0.645,1.350,-1.474,0.907,1.335,-1.604,1.488,3.209,-1.590,2.063,1.573,-1.561,1.381,4.755,-0.297,0.190,4.913,-1.614,0.728,5.244,-1.963,0.671,5.324,-1.413,0.658,4.519,-1.430,0.579,4.514,-1.413,0.641,4.485,-1.964,0.671,5.324,-1.240,0.557,5.386,-1.924,0.731,4.517,-1.832,0.628,4.515,-1.890,0.680,4.511,-2.219,0.670,5.328,-2.523,0.671,5.282,-2.320,0.658,4.365,-2.519,0.671,5.283,-3.611,0.726,5.012,-3.127,0.666,4.787,-3.381,0.661,5.036,-3.098,0.624,4.397,-3.076,0.670,4.423,-3.380,0.678,5.036,-3.123,0.722,4.376,-4.809,0.732,4.510,-3.551,0.609,5.030,-3.490,0.627,4.263,-4.975,0.669,4.556,-4.968,0.672,4.551,-4.481,0.672,4.853,-4.709,0.599,4.385,-4.071,0.659,4.210,-4.170,0.672,5.005,-4.481,0.672,4.853,-4.071,0.659,4.210,-1.835,1.024,-12.395,-3.819,1.043,-12.422,-1.585,0.924,-12.120,-0.684,0.847,-10.138,-3.827,0.976,-12.272,-3.827,0.982,-12.578,-3.606,1.036,-12.530,-3.518,1.067,-12.052,-3.747,0.906,-12.227,-3.634,0.931,-12.524,-1.361,1.436,6.015,-0.781,2.632,6.137,-1.093,2.412,6.052,-0.653,0.456,6.971,-0.630,0.369,6.267,-0.618,1.788,-9.010,-0.338,2.251,-8.323,-0.615,0.734,-9.002,-0.266,0.716,-9.729,-0.737,1.306,-9.055,-0.495,3.120,-3.747,-0.275,0.585,-7.679,-0.255,1.063,-12.566,-0.241,1.942,-10.437,-0.129,2.330,-8.812,-0.317,3.261,4.931,-0.291,2.903,6.023,0.000,0.528,10.234,-0.107,0.383,7.689,-1.095,3.189,1.301,-1.353,2.936,1.287,-1.211,0.512,5.154,-0.882,0.444,5.769,-0.295,0.189,-1.395,-0.211,0.218,-3.221,-1.457,2.704,-1.029,-1.495,2.559,3.123,-1.311,2.240,5.697,0.000,0.612,10.243,-1.442,1.093,-12.386,-2.152,1.139,-11.083,-1.014,1.322,-10.644};
			return value;
		}
		private double[] getCoordinate_6_22_point_6()
		{
			double[] value = {-0.686,1.478,-10.145,-0.906,1.889,-6.966,-1.349,2.495,-3.479,-1.420,2.673,-2.376,0.000,0.424,10.208,-1.015,0.899,-10.640,-0.717,1.074,-10.141,-0.969,1.264,-6.931};
			return value;
		}

		/** Large attribute array: IndexedFaceSet coordIndex field, scene-graph level=5, element #22, 3161 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFInt32 getIndexedFaceSet_5_22_coordIndex()
		{
			MFInt32 IndexedFaceSet_5_22_coordIndex = new MFInt32()/*2.finalize*/
				.append(new MFInt32(getIndexedFaceSet_5_22_coordIndex_1()))
				.append(new MFInt32(getIndexedFaceSet_5_22_coordIndex_2()))
				.append(new MFInt32(getIndexedFaceSet_5_22_coordIndex_3()))
				.append(new MFInt32(getIndexedFaceSet_5_22_coordIndex_4()));
			return IndexedFaceSet_5_22_coordIndex;
		}
		/** Large attribute array: Coordinate point field, scene-graph level=6, element #22, 1524 total numbers made up of 508 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getCoordinate_6_22_point()
		{
			MFVec3f Coordinate_6_22_point = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getCoordinate_6_22_point_1()))
				.append(new MFVec3f(getCoordinate_6_22_point_2()))
				.append(new MFVec3f(getCoordinate_6_22_point_3()))
				.append(new MFVec3f(getCoordinate_6_22_point_4()))
				.append(new MFVec3f(getCoordinate_6_22_point_5()))
				.append(new MFVec3f(getCoordinate_6_22_point_6()));
			return Coordinate_6_22_point;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return DolphinPose01 model
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
        X3D thisExampleX3dModel = new DolphinPose01().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter07EventAnimationInterpolation.DolphinPose01\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter07EventAnimationInterpolation.DolphinPose01\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
