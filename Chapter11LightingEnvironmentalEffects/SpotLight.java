package X3dForWebAuthors.Chapter11LightingEnvironmentalEffects;

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
import org.web3d.x3d.jsail.EnvironmentalEffects.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Lighting.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Example SpotLight node showing effects of beamWidth and cutOffAngle. </p>
 <p> Related links: <a href="../../../Chapter11LightingEnvironmentalEffects/SpotLight.java">SpotLight.java</a> source, <a href="../../../Chapter11LightingEnvironmentalEffects/SpotLightIndex.html" target="_top">SpotLight catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter11LightingEnvironmentalEffects/SpotLight.x3d">SpotLight.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Example SpotLight node showing effects of beamWidth and cutOffAngle </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Leonard Daly and Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 24 April 2006 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
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
			<td style="text-align:right; vertical-align: text-top;"> <i> rights </i> </td>
			<td> Copyright 2006, Daly Realism and Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D book, X3D graphics, X3D-Edit, <a href="http://www.x3dGraphics.com" target="_blank">http://www.x3dGraphics.com</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/SpotLight.x3d" target="_blank">http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/SpotLight.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter11LightingEnvironmentalEffects/../license.html">../license.html</a> </td>
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

	* @author Leonard Daly and Don Brutzman
 */

public class SpotLight
{
	/** Default constructor to create this object. */
	public SpotLight ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERACTIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("SpotLight.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Example SpotLight node showing effects of beamWidth and cutOffAngle"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Leonard Daly and Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("24 April 2006"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://X3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_RIGHTS     ).setContent("Copyright 2006, Daly Realism and Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/SpotLight.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("SpotLight.x3d"))
    .addChild(new Background().setSkyColor(new MFColor(new float[] {1.0f,1.0f,1.0f})))
    .addChild(new NavigationInfo().setHeadlight(false))
    .addChild(new Viewpoint().setDescription("Book Viewpoint").setPosition(0.0f,0.0f,30.0f))
    .addChild(new /*avoid name collision with file name*/org.web3d.x3d.jsail.Lighting.SpotLight("Lamp").setBeamWidth(0.35f).setColor(1.0f,1.0f,0.0f).setCutOffAngle(0.78f).setLocation(0.0f,0.0f,12.0f).setRadius(18f))
    .addChild(new Transform()
      .addChild(new Transform("Box")
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0f,1.0f,1.0f)))
          .addComments(" flat box with many subpolygons to ensure smooth shading by light source ")
          .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(getIndexedFaceSet_6_21_coordIndex())
            .setCoord(new Coordinate().setPoint(getCoordinate_7_21_point())))))));
    }
	// end of initialize() method

		/** Define subarrays using type int[] */
		private int[] getIndexedFaceSet_6_21_coordIndex_1()
		{
			int[] value = {0,1,22,21,-1,1,2,23,22,-1,2,3,24,23,-1,3,4,25,24,-1,4,5,26,25,-1,5,6,27,26,-1,6,7,28,27,-1,7,8,29,28,-1,8,9,30,29,-1,9,10,31,30,-1,10,11,32,31,-1,11,12,33,32,-1,12,13,34,33,-1,13,14,35,34,-1,14,15,36,35,-1,15,16,37,36,-1,16,17,38,37,-1,17,18,39,38,-1,18,19,40,39,-1,19,20,41,40,-1,21,22,43,42,-1,22,23,44,43,-1,23,24,45,44,-1,24,25,46,45,-1,25,26,47,46,-1,26,27,48,47,-1,27,28,49,48,-1,28,29,50,49,-1,29,30,51,50,-1,30,31,52,51,-1,31,32,53,52,-1,32,33,54,53,-1,33,34,55,54,-1,34,35,56,55,-1,35,36,57,56,-1,36,37,58,57,-1,37,38,59,58,-1,38,39,60,59,-1,39,40,61,60,-1,40,41,62,61,-1,42,43,64,63,-1,43,44,65,64,-1,44,45,66,65,-1,45,46,67,66,-1,46,47,68,67,-1,47,48,69,68,-1,48,49,70,69,-1,49,50,71,70,-1,50,51,72,71,-1,51,52,73,72,-1,52,53,74,73,-1,53,54,75,74,-1,54,55,76,75,-1,55,56,77,76,-1,56,57,78,77,-1,57,58,79,78,-1,58,59,80,79,-1,59,60,81,80,-1,60,61,82,81,-1,61,62,83,82,-1,63,64,85,84,-1,64,65,86,85,-1,65,66,87,86,-1,66,67,88,87,-1,67,68,89,88,-1,68,69,90,89,-1,69,70,91,90,-1,70,71,92,91,-1,71,72,93,92,-1,72,73,94,93,-1,73,74,95,94,-1,74,75,96,95,-1,75,76,97,96,-1,76,77,98,97,-1,77,78,99,98,-1,78,79,100,99,-1,79,80,101,100,-1,80,81,102,101,-1,81,82,103,102,-1,82,83,104,103,-1,84,85,106,105,-1,85,86,107,106,-1,86,87,108,107,-1,87,88,109,108,-1,88,89,110,109,-1,89,90,111,110,-1,90,91,112,111,-1,91,92,113,112,-1,92,93,114,113,-1,93,94,115,114,-1,94,95,116,115,-1,95,96,117,116,-1,96,97,118,117,-1,97,98,119,118,-1,98,99,120,119,-1,99,100,121,120,-1,100,101,122,121,-1,101,102,123,122,-1,102,103,124,123,-1,103,104,125,124,-1,105,106,127,126,-1,106,107,128,127,-1,107,108,129,128,-1,108,109,130,129,-1,109,110,131,130,-1,110,111,132,131,-1,111,112,133,132,-1,112,113,134,133,-1,113,114,135,134,-1,114,115,136,135,-1,115,116,137,136,-1,116,117,138,137,-1,117,118,139,138,-1,118,119,140,139,-1,119,120,141,140,-1,120,121,142,141,-1,121,122,143,142,-1,122,123,144,143,-1,123,124,145,144,-1,124,125,146,145,-1,126,127,148,147,-1,127,128,149,148,-1,128,129,150,149,-1,129,130,151,150,-1,130,131,152,151,-1,131,132,153,152,-1,132,133,154,153,-1,133,134,155,154,-1,134,135,156,155,-1,135,136,157,156,-1,136,137,158,157,-1,137,138,159,158,-1,138,139,160,159,-1,139,140,161,160,-1,140,141,162,161,-1,141,142,163,162,-1,142,143,164,163,-1,143,144,165,164,-1,144,145,166,165,-1,145,146,167,166,-1,147,148,169,168,-1,148,149,170,169,-1,149,150,171,170,-1,150,151,172,171,-1,151,152,173,172,-1,152,153,174,173,-1,153,154,175,174,-1,154,155,176,175,-1,155,156,177,176,-1,156,157,178,177,-1,157,158,179,178,-1,158,159,180,179,-1,159,160,181,180,-1,160,161,182,181,-1,161,162,183,182,-1,162,163,184,183,-1,163,164,185,184,-1,164,165,186,185,-1,165,166,187,186,-1,166,167,188,187,-1,168,169,190,189,-1,169,170,191,190,-1,170,171,192,191,-1,171,172,193,192,-1,172,173,194,193,-1,173,174,195,194,-1,174,175,196,195,-1,175,176,197,196,-1,176,177,198,197,-1,177,178,199,198,-1,178,179,200,199,-1,179,180,201,200,-1,180,181,202,201,-1,181,182,203,202,-1,182,183,204,203,-1,183,184,205,204,-1,184,185,206,205,-1,185,186,207,206,-1,186,187,208,207,-1,187,188,209,208,-1,189,190,211,210,-1,190,191,212,211,-1,191,192,213,212,-1,192,193,214,213,-1,193,194,215,214,-1,194,195,216,215,-1,195,196,217,216,-1,196,197,218,217,-1,197,198,219,218,-1,198,199,220,219,-1,199,200,221,220,-1,200,201,222,221,-1,201,202,223,222,-1,202,203,224,223,-1,203,204,225,224,-1,204,205,226,225,-1,205,206,227,226,-1,206,207,228,227,-1,207,208,229,228,-1,208,209,230,229,-1};
			return value;
		}
		private int[] getIndexedFaceSet_6_21_coordIndex_2()
		{
			int[] value = {210,211,232,231,-1,211,212,233,232,-1,212,213,234,233,-1,213,214,235,234,-1,214,215,236,235,-1,215,216,237,236,-1,216,217,238,237,-1,217,218,239,238,-1,218,219,240,239,-1,219,220,241,240,-1,220,221,242,241,-1,221,222,243,242,-1,222,223,244,243,-1,223,224,245,244,-1,224,225,246,245,-1,225,226,247,246,-1,226,227,248,247,-1,227,228,249,248,-1,228,229,250,249,-1,229,230,251,250,-1,231,232,253,252,-1,232,233,254,253,-1,233,234,255,254,-1,234,235,256,255,-1,235,236,257,256,-1,236,237,258,257,-1,237,238,259,258,-1,238,239,260,259,-1,239,240,261,260,-1,240,241,262,261,-1,241,242,263,262,-1,242,243,264,263,-1,243,244,265,264,-1,244,245,266,265,-1,245,246,267,266,-1,246,247,268,267,-1,247,248,269,268,-1,248,249,270,269,-1,249,250,271,270,-1,250,251,272,271,-1,252,253,274,273,-1,253,254,275,274,-1,254,255,276,275,-1,255,256,277,276,-1,256,257,278,277,-1,257,258,279,278,-1,258,259,280,279,-1,259,260,281,280,-1,260,261,282,281,-1,261,262,283,282,-1,262,263,284,283,-1,263,264,285,284,-1,264,265,286,285,-1,265,266,287,286,-1,266,267,288,287,-1,267,268,289,288,-1,268,269,290,289,-1,269,270,291,290,-1,270,271,292,291,-1,271,272,293,292,-1,273,274,295,294,-1,274,275,296,295,-1,275,276,297,296,-1,276,277,298,297,-1,277,278,299,298,-1,278,279,300,299,-1,279,280,301,300,-1,280,281,302,301,-1,281,282,303,302,-1,282,283,304,303,-1,283,284,305,304,-1,284,285,306,305,-1,285,286,307,306,-1,286,287,308,307,-1,287,288,309,308,-1,288,289,310,309,-1,289,290,311,310,-1,290,291,312,311,-1,291,292,313,312,-1,292,293,314,313,-1,294,295,316,315,-1,295,296,317,316,-1,296,297,318,317,-1,297,298,319,318,-1,298,299,320,319,-1,299,300,321,320,-1,300,301,322,321,-1,301,302,323,322,-1,302,303,324,323,-1,303,304,325,324,-1,304,305,326,325,-1,305,306,327,326,-1,306,307,328,327,-1,307,308,329,328,-1,308,309,330,329,-1,309,310,331,330,-1,310,311,332,331,-1,311,312,333,332,-1,312,313,334,333,-1,313,314,335,334,-1,315,316,337,336,-1,316,317,338,337,-1,317,318,339,338,-1,318,319,340,339,-1,319,320,341,340,-1,320,321,342,341,-1,321,322,343,342,-1,322,323,344,343,-1,323,324,345,344,-1,324,325,346,345,-1,325,326,347,346,-1,326,327,348,347,-1,327,328,349,348,-1,328,329,350,349,-1,329,330,351,350,-1,330,331,352,351,-1,331,332,353,352,-1,332,333,354,353,-1,333,334,355,354,-1,334,335,356,355,-1,336,337,358,357,-1,337,338,359,358,-1,338,339,360,359,-1,339,340,361,360,-1,340,341,362,361,-1,341,342,363,362,-1,342,343,364,363,-1,343,344,365,364,-1,344,345,366,365,-1,345,346,367,366,-1,346,347,368,367,-1,347,348,369,368,-1,348,349,370,369,-1,349,350,371,370,-1,350,351,372,371,-1,351,352,373,372,-1,352,353,374,373,-1,353,354,375,374,-1,354,355,376,375,-1,355,356,377,376,-1,357,358,379,378,-1,358,359,380,379,-1,359,360,381,380,-1,360,361,382,381,-1,361,362,383,382,-1,362,363,384,383,-1,363,364,385,384,-1,364,365,386,385,-1,365,366,387,386,-1,366,367,388,387,-1,367,368,389,388,-1,368,369,390,389,-1,369,370,391,390,-1,370,371,392,391,-1,371,372,393,392,-1,372,373,394,393,-1,373,374,395,394,-1,374,375,396,395,-1,375,376,397,396,-1,376,377,398,397,-1,378,379,400,399,-1,379,380,401,400,-1,380,381,402,401,-1,381,382,403,402,-1,382,383,404,403,-1,383,384,405,404,-1,384,385,406,405,-1,385,386,407,406,-1,386,387,408,407,-1,387,388,409,408,-1,388,389,410,409,-1,389,390,411,410,-1,390,391,412,411,-1,391,392,413,412,-1,392,393,414,413,-1,393,394,415,414,-1,394,395,416,415,-1,395,396,417,416,-1,396,397,418,417,-1,397,398,419,418,-1,399,400,421,420,-1,400,401,422,421,-1,401,402,423,422,-1,402,403,424,423,-1,403,404,425,424,-1,404,405,426,425,-1,405,406,427,426,-1,406,407,428,427,-1,407,408,429,428,-1,408,409,430,429,-1,409,410,431,430,-1,410,411,432,431,-1,411,412,433,432,-1,412,413,434,433,-1,413,414,435,434,-1,414,415,436,435,-1,415,416,437,436,-1,416,417,438,437,-1,417,418,439,438,-1,418,419,440,439,-1};
			return value;
		}


		/** Define subarrays using type float[] */
		private float[] getCoordinate_7_21_point_1()
		{
			float[] value = {10.0f,10.0f,0.0f,9.0f,10.0f,0.0f,8.0f,10.0f,0.0f,7.0f,10.0f,0.0f,6.0f,10.0f,0.0f,5.0f,10.0f,0.0f,4.0f,10.0f,0.0f,3.0f,10.0f,0.0f,2.0f,10.0f,0.0f,1.0f,10.0f,0.0f,0.0f,10.0f,0.0f,-1.0f,10.0f,0.0f,-2.0f,10.0f,0.0f,-3.0f,10.0f,0.0f,-4.0f,10.0f,0.0f,-5.0f,10.0f,0.0f,-6.0f,10.0f,0.0f,-7.0f,10.0f,0.0f,-8.0f,10.0f,0.0f,-9.0f,10.0f,0.0f,-10.0f,10.0f,0.0f,10.0f,9.0f,0.0f,9.0f,9.0f,0.0f,8.0f,9.0f,0.0f,7.0f,9.0f,0.0f,6.0f,9.0f,0.0f,5.0f,9.0f,0.0f,4.0f,9.0f,0.0f,3.0f,9.0f,0.0f,2.0f,9.0f,0.0f,1.0f,9.0f,0.0f,0.0f,9.0f,0.0f,-1.0f,9.0f,0.0f,-2.0f,9.0f,0.0f,-3.0f,9.0f,0.0f,-4.0f,9.0f,0.0f,-5.0f,9.0f,0.0f,-6.0f,9.0f,0.0f,-7.0f,9.0f,0.0f,-8.0f,9.0f,0.0f,-9.0f,9.0f,0.0f,-10.0f,9.0f,0.0f,10.0f,8.0f,0.0f,9.0f,8.0f,0.0f,8.0f,8.0f,0.0f,7.0f,8.0f,0.0f,6.0f,8.0f,0.0f,5.0f,8.0f,0.0f,4.0f,8.0f,0.0f,3.0f,8.0f,0.0f,2.0f,8.0f,0.0f,1.0f,8.0f,0.0f,0.0f,8.0f,0.0f,-1.0f,8.0f,0.0f,-2.0f,8.0f,0.0f,-3.0f,8.0f,0.0f,-4.0f,8.0f,0.0f,-5.0f,8.0f,0.0f,-6.0f,8.0f,0.0f,-7.0f,8.0f,0.0f,-8.0f,8.0f,0.0f,-9.0f,8.0f,0.0f,-10.0f,8.0f,0.0f,10.0f,7.0f,0.0f,9.0f,7.0f,0.0f,8.0f,7.0f,0.0f,7.0f,7.0f,0.0f,6.0f,7.0f,0.0f,5.0f,7.0f,0.0f,4.0f,7.0f,0.0f,3.0f,7.0f,0.0f,2.0f,7.0f,0.0f,1.0f,7.0f,0.0f,0.0f,7.0f,0.0f,-1.0f,7.0f,0.0f,-2.0f,7.0f,0.0f,-3.0f,7.0f,0.0f,-4.0f,7.0f,0.0f,-5.0f,7.0f,0.0f,-6.0f,7.0f,0.0f,-7.0f,7.0f,0.0f,-8.0f,7.0f,0.0f,-9.0f,7.0f,0.0f,-10.0f,7.0f,0.0f,10.0f,6.0f,0.0f,9.0f,6.0f,0.0f,8.0f,6.0f,0.0f,7.0f,6.0f,0.0f,6.0f,6.0f,0.0f,5.0f,6.0f,0.0f,4.0f,6.0f,0.0f,3.0f,6.0f,0.0f,2.0f,6.0f,0.0f,1.0f,6.0f,0.0f,0.0f,6.0f,0.0f,-1.0f,6.0f,0.0f,-2.0f,6.0f,0.0f,-3.0f,6.0f,0.0f,-4.0f,6.0f,0.0f,-5.0f,6.0f,0.0f};
			return value;
		}
		private float[] getCoordinate_7_21_point_2()
		{
			float[] value = {-6.0f,6.0f,0.0f,-7.0f,6.0f,0.0f,-8.0f,6.0f,0.0f,-9.0f,6.0f,0.0f,-10.0f,6.0f,0.0f,10.0f,5.0f,0.0f,9.0f,5.0f,0.0f,8.0f,5.0f,0.0f,7.0f,5.0f,0.0f,6.0f,5.0f,0.0f,5.0f,5.0f,0.0f,4.0f,5.0f,0.0f,3.0f,5.0f,0.0f,2.0f,5.0f,0.0f,1.0f,5.0f,0.0f,0.0f,5.0f,0.0f,-1.0f,5.0f,0.0f,-2.0f,5.0f,0.0f,-3.0f,5.0f,0.0f,-4.0f,5.0f,0.0f,-5.0f,5.0f,0.0f,-6.0f,5.0f,0.0f,-7.0f,5.0f,0.0f,-8.0f,5.0f,0.0f,-9.0f,5.0f,0.0f,-10.0f,5.0f,0.0f,10.0f,4.0f,0.0f,9.0f,4.0f,0.0f,8.0f,4.0f,0.0f,7.0f,4.0f,0.0f,6.0f,4.0f,0.0f,5.0f,4.0f,0.0f,4.0f,4.0f,0.0f,3.0f,4.0f,0.0f,2.0f,4.0f,0.0f,1.0f,4.0f,0.0f,0.0f,4.0f,0.0f,-1.0f,4.0f,0.0f,-2.0f,4.0f,0.0f,-3.0f,4.0f,0.0f,-4.0f,4.0f,0.0f,-5.0f,4.0f,0.0f,-6.0f,4.0f,0.0f,-7.0f,4.0f,0.0f,-8.0f,4.0f,0.0f,-9.0f,4.0f,0.0f,-10.0f,4.0f,0.0f,10.0f,3.0f,0.0f,9.0f,3.0f,0.0f,8.0f,3.0f,0.0f,7.0f,3.0f,0.0f,6.0f,3.0f,0.0f,5.0f,3.0f,0.0f,4.0f,3.0f,0.0f,3.0f,3.0f,0.0f,2.0f,3.0f,0.0f,1.0f,3.0f,0.0f,0.0f,3.0f,0.0f,-1.0f,3.0f,0.0f,-2.0f,3.0f,0.0f,-3.0f,3.0f,0.0f,-4.0f,3.0f,0.0f,-5.0f,3.0f,0.0f,-6.0f,3.0f,0.0f,-7.0f,3.0f,0.0f,-8.0f,3.0f,0.0f,-9.0f,3.0f,0.0f,-10.0f,3.0f,0.0f,10.0f,2.0f,0.0f,9.0f,2.0f,0.0f,8.0f,2.0f,0.0f,7.0f,2.0f,0.0f,6.0f,2.0f,0.0f,5.0f,2.0f,0.0f,4.0f,2.0f,0.0f,3.0f,2.0f,0.0f,2.0f,2.0f,0.0f,1.0f,2.0f,0.0f,0.0f,2.0f,0.0f,-1.0f,2.0f,0.0f,-2.0f,2.0f,0.0f,-3.0f,2.0f,0.0f,-4.0f,2.0f,0.0f,-5.0f,2.0f,0.0f,-6.0f,2.0f,0.0f,-7.0f,2.0f,0.0f,-8.0f,2.0f,0.0f,-9.0f,2.0f,0.0f,-10.0f,2.0f,0.0f,10.0f,1.0f,0.0f,9.0f,1.0f,0.0f,8.0f,1.0f,0.0f,7.0f,1.0f,0.0f,6.0f,1.0f,0.0f,5.0f,1.0f,0.0f,4.0f,1.0f,0.0f,3.0f,1.0f,0.0f,2.0f,1.0f,0.0f,1.0f,1.0f,0.0f,0.0f,1.0f,0.0f};
			return value;
		}
		private float[] getCoordinate_7_21_point_3()
		{
			float[] value = {-1.0f,1.0f,0.0f,-2.0f,1.0f,0.0f,-3.0f,1.0f,0.0f,-4.0f,1.0f,0.0f,-5.0f,1.0f,0.0f,-6.0f,1.0f,0.0f,-7.0f,1.0f,0.0f,-8.0f,1.0f,0.0f,-9.0f,1.0f,0.0f,-10.0f,1.0f,0.0f,10.0f,0.0f,0.0f,9.0f,0.0f,0.0f,8.0f,0.0f,0.0f,7.0f,0.0f,0.0f,6.0f,0.0f,0.0f,5.0f,0.0f,0.0f,4.0f,0.0f,0.0f,3.0f,0.0f,0.0f,2.0f,0.0f,0.0f,1.0f,0.0f,0.0f,0.0f,0.0f,0.0f,-1.0f,0.0f,0.0f,-2.0f,0.0f,0.0f,-3.0f,0.0f,0.0f,-4.0f,0.0f,0.0f,-5.0f,0.0f,0.0f,-6.0f,0.0f,0.0f,-7.0f,0.0f,0.0f,-8.0f,0.0f,0.0f,-9.0f,0.0f,0.0f,-10.0f,0.0f,0.0f,10.0f,-1.0f,0.0f,9.0f,-1.0f,0.0f,8.0f,-1.0f,0.0f,7.0f,-1.0f,0.0f,6.0f,-1.0f,0.0f,5.0f,-1.0f,0.0f,4.0f,-1.0f,0.0f,3.0f,-1.0f,0.0f,2.0f,-1.0f,0.0f,1.0f,-1.0f,0.0f,0.0f,-1.0f,0.0f,-1.0f,-1.0f,0.0f,-2.0f,-1.0f,0.0f,-3.0f,-1.0f,0.0f,-4.0f,-1.0f,0.0f,-5.0f,-1.0f,0.0f,-6.0f,-1.0f,0.0f,-7.0f,-1.0f,0.0f,-8.0f,-1.0f,0.0f,-9.0f,-1.0f,0.0f,-10.0f,-1.0f,0.0f,10.0f,-2.0f,0.0f,9.0f,-2.0f,0.0f,8.0f,-2.0f,0.0f,7.0f,-2.0f,0.0f,6.0f,-2.0f,0.0f,5.0f,-2.0f,0.0f,4.0f,-2.0f,0.0f,3.0f,-2.0f,0.0f,2.0f,-2.0f,0.0f,1.0f,-2.0f,0.0f,0.0f,-2.0f,0.0f,-1.0f,-2.0f,0.0f,-2.0f,-2.0f,0.0f,-3.0f,-2.0f,0.0f,-4.0f,-2.0f,0.0f,-5.0f,-2.0f,0.0f,-6.0f,-2.0f,0.0f,-7.0f,-2.0f,0.0f,-8.0f,-2.0f,0.0f,-9.0f,-2.0f,0.0f,-10.0f,-2.0f,0.0f,10.0f,-3.0f,0.0f,9.0f,-3.0f,0.0f,8.0f,-3.0f,0.0f,7.0f,-3.0f,0.0f,6.0f,-3.0f,0.0f,5.0f,-3.0f,0.0f,4.0f,-3.0f,0.0f,3.0f,-3.0f,0.0f,2.0f,-3.0f,0.0f,1.0f,-3.0f,0.0f,0.0f,-3.0f,0.0f,-1.0f,-3.0f,0.0f,-2.0f,-3.0f,0.0f,-3.0f,-3.0f,0.0f,-4.0f,-3.0f,0.0f,-5.0f,-3.0f,0.0f,-6.0f,-3.0f,0.0f,-7.0f,-3.0f,0.0f,-8.0f,-3.0f,0.0f,-9.0f,-3.0f,0.0f,-10.0f,-3.0f,0.0f,10.0f,-4.0f,0.0f,9.0f,-4.0f,0.0f,8.0f,-4.0f,0.0f,7.0f,-4.0f,0.0f,6.0f,-4.0f,0.0f,5.0f,-4.0f,0.0f};
			return value;
		}
		private float[] getCoordinate_7_21_point_4()
		{
			float[] value = {4.0f,-4.0f,0.0f,3.0f,-4.0f,0.0f,2.0f,-4.0f,0.0f,1.0f,-4.0f,0.0f,0.0f,-4.0f,0.0f,-1.0f,-4.0f,0.0f,-2.0f,-4.0f,0.0f,-3.0f,-4.0f,0.0f,-4.0f,-4.0f,0.0f,-5.0f,-4.0f,0.0f,-6.0f,-4.0f,0.0f,-7.0f,-4.0f,0.0f,-8.0f,-4.0f,0.0f,-9.0f,-4.0f,0.0f,-10.0f,-4.0f,0.0f,10.0f,-5.0f,0.0f,9.0f,-5.0f,0.0f,8.0f,-5.0f,0.0f,7.0f,-5.0f,0.0f,6.0f,-5.0f,0.0f,5.0f,-5.0f,0.0f,4.0f,-5.0f,0.0f,3.0f,-5.0f,0.0f,2.0f,-5.0f,0.0f,1.0f,-5.0f,0.0f,0.0f,-5.0f,0.0f,-1.0f,-5.0f,0.0f,-2.0f,-5.0f,0.0f,-3.0f,-5.0f,0.0f,-4.0f,-5.0f,0.0f,-5.0f,-5.0f,0.0f,-6.0f,-5.0f,0.0f,-7.0f,-5.0f,0.0f,-8.0f,-5.0f,0.0f,-9.0f,-5.0f,0.0f,-10.0f,-5.0f,0.0f,10.0f,-6.0f,0.0f,9.0f,-6.0f,0.0f,8.0f,-6.0f,0.0f,7.0f,-6.0f,0.0f,6.0f,-6.0f,0.0f,5.0f,-6.0f,0.0f,4.0f,-6.0f,0.0f,3.0f,-6.0f,0.0f,2.0f,-6.0f,0.0f,1.0f,-6.0f,0.0f,0.0f,-6.0f,0.0f,-1.0f,-6.0f,0.0f,-2.0f,-6.0f,0.0f,-3.0f,-6.0f,0.0f,-4.0f,-6.0f,0.0f,-5.0f,-6.0f,0.0f,-6.0f,-6.0f,0.0f,-7.0f,-6.0f,0.0f,-8.0f,-6.0f,0.0f,-9.0f,-6.0f,0.0f,-10.0f,-6.0f,0.0f,10.0f,-7.0f,0.0f,9.0f,-7.0f,0.0f,8.0f,-7.0f,0.0f,7.0f,-7.0f,0.0f,6.0f,-7.0f,0.0f,5.0f,-7.0f,0.0f,4.0f,-7.0f,0.0f,3.0f,-7.0f,0.0f,2.0f,-7.0f,0.0f,1.0f,-7.0f,0.0f,0.0f,-7.0f,0.0f,-1.0f,-7.0f,0.0f,-2.0f,-7.0f,0.0f,-3.0f,-7.0f,0.0f,-4.0f,-7.0f,0.0f,-5.0f,-7.0f,0.0f,-6.0f,-7.0f,0.0f,-7.0f,-7.0f,0.0f,-8.0f,-7.0f,0.0f,-9.0f,-7.0f,0.0f,-10.0f,-7.0f,0.0f,10.0f,-8.0f,0.0f,9.0f,-8.0f,0.0f,8.0f,-8.0f,0.0f,7.0f,-8.0f,0.0f,6.0f,-8.0f,0.0f,5.0f,-8.0f,0.0f,4.0f,-8.0f,0.0f,3.0f,-8.0f,0.0f,2.0f,-8.0f,0.0f,1.0f,-8.0f,0.0f,0.0f,-8.0f,0.0f,-1.0f,-8.0f,0.0f,-2.0f,-8.0f,0.0f,-3.0f,-8.0f,0.0f,-4.0f,-8.0f,0.0f,-5.0f,-8.0f,0.0f,-6.0f,-8.0f,0.0f,-7.0f,-8.0f,0.0f,-8.0f,-8.0f,0.0f,-9.0f,-8.0f,0.0f,-10.0f,-8.0f,0.0f,10.0f,-9.0f,0.0f};
			return value;
		}
		private float[] getCoordinate_7_21_point_5()
		{
			float[] value = {9.0f,-9.0f,0.0f,8.0f,-9.0f,0.0f,7.0f,-9.0f,0.0f,6.0f,-9.0f,0.0f,5.0f,-9.0f,0.0f,4.0f,-9.0f,0.0f,3.0f,-9.0f,0.0f,2.0f,-9.0f,0.0f,1.0f,-9.0f,0.0f,0.0f,-9.0f,0.0f,-1.0f,-9.0f,0.0f,-2.0f,-9.0f,0.0f,-3.0f,-9.0f,0.0f,-4.0f,-9.0f,0.0f,-5.0f,-9.0f,0.0f,-6.0f,-9.0f,0.0f,-7.0f,-9.0f,0.0f,-8.0f,-9.0f,0.0f,-9.0f,-9.0f,0.0f,-10.0f,-9.0f,0.0f,10.0f,-10.0f,0.0f,9.0f,-10.0f,0.0f,8.0f,-10.0f,0.0f,7.0f,-10.0f,0.0f,6.0f,-10.0f,0.0f,5.0f,-10.0f,0.0f,4.0f,-10.0f,0.0f,3.0f,-10.0f,0.0f,2.0f,-10.0f,0.0f,1.0f,-10.0f,0.0f,0.0f,-10.0f,0.0f,-1.0f,-10.0f,0.0f,-2.0f,-10.0f,0.0f,-3.0f,-10.0f,0.0f,-4.0f,-10.0f,0.0f,-5.0f,-10.0f,0.0f,-6.0f,-10.0f,0.0f,-7.0f,-10.0f,0.0f,-8.0f,-10.0f,0.0f,-9.0f,-10.0f,0.0f,-10.0f,-10.0f,0.0f};
			return value;
		}

		/** Large attribute array: IndexedFaceSet coordIndex field, scene-graph level=6, element #21, 2000 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFInt32 getIndexedFaceSet_6_21_coordIndex()
		{
			MFInt32 IndexedFaceSet_6_21_coordIndex = new MFInt32()/*2.finalize*/
				.append(new MFInt32(getIndexedFaceSet_6_21_coordIndex_1()))
				.append(new MFInt32(getIndexedFaceSet_6_21_coordIndex_2()));
			return IndexedFaceSet_6_21_coordIndex;
		}
		/** Large attribute array: Coordinate point field, scene-graph level=7, element #21, 1323 total numbers made up of 441 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getCoordinate_7_21_point()
		{
			MFVec3f Coordinate_7_21_point = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getCoordinate_7_21_point_1()))
				.append(new MFVec3f(getCoordinate_7_21_point_2()))
				.append(new MFVec3f(getCoordinate_7_21_point_3()))
				.append(new MFVec3f(getCoordinate_7_21_point_4()))
				.append(new MFVec3f(getCoordinate_7_21_point_5()));
			return Coordinate_7_21_point;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return SpotLight model
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
        X3D thisExampleX3dModel = new SpotLight().getX3dModel();

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
			System.out.println("WARNING: \"SpotLight\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"SpotLight\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
			System.out.println(validationResults);
		}
    }
}
