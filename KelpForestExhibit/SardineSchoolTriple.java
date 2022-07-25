package X3dForWebAuthors.KelpForestExhibit;

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
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> sardine school - 30 fish. </p>
 <p> Related links: <a href="../../../KelpForestExhibit/SardineSchoolTriple.java">SardineSchoolTriple.java</a> source, <a href="../../../KelpForestExhibit/SardineSchoolTripleIndex.html" target="_top">SardineSchoolTriple catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../KelpForestExhibit/SardineSchoolTriple.x3d">SardineSchoolTriple.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> sardine school - 30 fish </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Stewart Liles </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Sean Hynes </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 25 September 1998 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SardineSchoolTriple.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SardineSchoolTriple.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../KelpForestExhibit/../license.html">../license.html</a> </td>
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

	* @author Stewart Liles
 */

public class SardineSchoolTriple
{
	/** Default constructor to create this object. */
	public SardineSchoolTriple ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERACTIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("SardineSchoolTriple.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("sardine school - 30 fish"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Stewart Liles"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Sean Hynes"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("25 September 1998"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SardineSchoolTriple.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new NavigationInfo().setSpeed(5).setType("\"EXAMINE\"").setVisibilityLimit(250))
    .addChild(new WorldInfo("Sardine_School_original").setTitle("Sardine School Demo"))
    .addChild(new Viewpoint("Original").setDescription("Original Viewpoint in original file").setPosition(-1.0,4.0,15.0))
    .addChild(new TimeSensor("SchoolClock").setCycleInterval(120).setLoop(true))
    .addChild(new Group("SardineSchoolGroup")
      .addChild(new Transform("Sardine0")
        .addChild(new Viewpoint("SardineRide").setDescription("Sardine ride").setFieldOfView(1.8).setPosition(0.0,1.0,-5.0))
        .addChild(new Inline("Sardine").setUrl(new String[] {"Sardine.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Sardine.x3d","Sardine.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Sardine.wrl"})))
      .addChild(new PositionInterpolator("Sardine0PosnInterp").setKey(getSardine0PosnInterp_4_18_key()).setKeyValue(getSardine0PosnInterp_4_18_keyValue()))
      .addChild(new OrientationInterpolator("Sardine0OrientInterp").setKey(getSardine0OrientInterp_4_19_key()).setKeyValue(getSardine0OrientInterp_4_19_keyValue()))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine0PosnInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine0PosnInterp").setFromField("value_changed").setToNode("Sardine0").setToField("set_translation"))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine0OrientInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine0OrientInterp").setFromField("value_changed").setToNode("Sardine0").setToField("set_rotation"))
      .addChild(new Transform("Sardine1")
        .addChild(new Inline().setUSE("Sardine")))
      .addChild(new PositionInterpolator("Sardine1PosnInterp").setKey(getSardine1PosnInterp_4_26_key()).setKeyValue(getSardine1PosnInterp_4_26_keyValue()))
      .addChild(new OrientationInterpolator("Sardine1OrientInterp").setKey(getSardine1OrientInterp_4_27_key()).setKeyValue(getSardine1OrientInterp_4_27_keyValue()))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine1PosnInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine1PosnInterp").setFromField("value_changed").setToNode("Sardine1").setToField("set_translation"))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine1OrientInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine1OrientInterp").setFromField("value_changed").setToNode("Sardine1").setToField("set_rotation"))
      .addChild(new Transform("Sardine2")
        .addChild(new Inline().setUSE("Sardine")))
      .addChild(new PositionInterpolator("Sardine2PosnInterp").setKey(getSardine2PosnInterp_4_34_key()).setKeyValue(getSardine2PosnInterp_4_34_keyValue()))
      .addChild(new OrientationInterpolator("Sardine2OrientInterp").setKey(getSardine2OrientInterp_4_35_key()).setKeyValue(getSardine2OrientInterp_4_35_keyValue()))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine2PosnInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine2PosnInterp").setFromField("value_changed").setToNode("Sardine2").setToField("set_translation"))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine2OrientInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine2OrientInterp").setFromField("value_changed").setToNode("Sardine2").setToField("set_rotation"))
      .addChild(new Transform("Sardine3")
        .addChild(new Inline().setUSE("Sardine")))
      .addChild(new PositionInterpolator("Sardine3PosnInterp").setKey(getSardine3PosnInterp_4_42_key()).setKeyValue(getSardine3PosnInterp_4_42_keyValue()))
      .addChild(new OrientationInterpolator("Sardine3OrientInterp").setKey(getSardine3OrientInterp_4_43_key()).setKeyValue(getSardine3OrientInterp_4_43_keyValue()))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine3PosnInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine3PosnInterp").setFromField("value_changed").setToNode("Sardine3").setToField("set_translation"))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine3OrientInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine3OrientInterp").setFromField("value_changed").setToNode("Sardine3").setToField("set_rotation"))
      .addChild(new Transform("Sardine4")
        .addChild(new Inline().setUSE("Sardine")))
      .addChild(new PositionInterpolator("Sardine4PosnInterp").setKey(getSardine4PosnInterp_4_50_key()).setKeyValue(getSardine4PosnInterp_4_50_keyValue()))
      .addChild(new OrientationInterpolator("Sardine4OrientInterp").setKey(getSardine4OrientInterp_4_51_key()).setKeyValue(getSardine4OrientInterp_4_51_keyValue()))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine4PosnInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine4PosnInterp").setFromField("value_changed").setToNode("Sardine4").setToField("set_translation"))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine4OrientInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine4OrientInterp").setFromField("value_changed").setToNode("Sardine4").setToField("set_rotation"))
      .addChild(new Transform("Sardine5")
        .addChild(new Inline().setUSE("Sardine")))
      .addChild(new PositionInterpolator("Sardine5PosnInterp").setKey(getSardine5PosnInterp_4_58_key()).setKeyValue(getSardine5PosnInterp_4_58_keyValue()))
      .addChild(new OrientationInterpolator("Sardine5OrientInterp").setKey(getSardine5OrientInterp_4_59_key()).setKeyValue(getSardine5OrientInterp_4_59_keyValue()))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine5PosnInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine5PosnInterp").setFromField("value_changed").setToNode("Sardine5").setToField("set_translation"))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine5OrientInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine5OrientInterp").setFromField("value_changed").setToNode("Sardine5").setToField("set_rotation"))
      .addChild(new Transform("Sardine6")
        .addChild(new Inline().setUSE("Sardine")))
      .addChild(new PositionInterpolator("Sardine6PosnInterp").setKey(getSardine6PosnInterp_4_66_key()).setKeyValue(getSardine6PosnInterp_4_66_keyValue()))
      .addChild(new OrientationInterpolator("Sardine6OrientInterp").setKey(getSardine6OrientInterp_4_67_key()).setKeyValue(getSardine6OrientInterp_4_67_keyValue()))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine6PosnInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine6PosnInterp").setFromField("value_changed").setToNode("Sardine6").setToField("set_translation"))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine6OrientInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine6OrientInterp").setFromField("value_changed").setToNode("Sardine6").setToField("set_rotation"))
      .addChild(new Transform("Sardine7")
        .addChild(new Inline().setUSE("Sardine")))
      .addChild(new PositionInterpolator("Sardine7PosnInterp").setKey(getSardine7PosnInterp_4_74_key()).setKeyValue(getSardine7PosnInterp_4_74_keyValue()))
      .addChild(new OrientationInterpolator("Sardine7OrientInterp").setKey(getSardine7OrientInterp_4_75_key()).setKeyValue(getSardine7OrientInterp_4_75_keyValue()))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine7PosnInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine7PosnInterp").setFromField("value_changed").setToNode("Sardine7").setToField("set_translation"))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine7OrientInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine7OrientInterp").setFromField("value_changed").setToNode("Sardine7").setToField("set_rotation"))
      .addChild(new Transform("Sardine8")
        .addChild(new Inline().setUSE("Sardine")))
      .addChild(new PositionInterpolator("Sardine8PosnInterp").setKey(getSardine8PosnInterp_4_82_key()).setKeyValue(getSardine8PosnInterp_4_82_keyValue()))
      .addChild(new OrientationInterpolator("Sardine8OrientInterp").setKey(getSardine8OrientInterp_4_83_key()).setKeyValue(getSardine8OrientInterp_4_83_keyValue()))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine8PosnInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine8PosnInterp").setFromField("value_changed").setToNode("Sardine8").setToField("set_translation"))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine8OrientInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine8OrientInterp").setFromField("value_changed").setToNode("Sardine8").setToField("set_rotation"))
      .addChild(new Transform("Sardine9")
        .addChild(new Inline().setUSE("Sardine")))
      .addChild(new PositionInterpolator("Sardine9PosnInterp").setKey(getSardine9PosnInterp_4_90_key()).setKeyValue(getSardine9PosnInterp_4_90_keyValue()))
      .addChild(new OrientationInterpolator("Sardine9OrientInterp").setKey(getSardine9OrientInterp_4_91_key()).setKeyValue(getSardine9OrientInterp_4_91_keyValue()))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine9PosnInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine9PosnInterp").setFromField("value_changed").setToNode("Sardine9").setToField("set_translation"))
      .addChild(new ROUTE().setFromNode("SchoolClock").setFromField("fraction_changed").setToNode("Sardine9OrientInterp").setToField("set_fraction"))
      .addChild(new ROUTE().setFromNode("Sardine9OrientInterp").setFromField("value_changed").setToNode("Sardine9").setToField("set_rotation")))
    .addChild(new Transform().setTranslation(1.0,0.0,0.0)
      .addChild(new Group().setUSE("SardineSchoolGroup")))
    .addChild(new Transform().setTranslation(-1.0,0.0,0.0)
      .addChild(new Group().setUSE("SardineSchoolGroup"))));
    }
	// end of initialize() method

		/** Define subarrays using type double[] */
		private double[] getSardine0PosnInterp_4_18_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine0PosnInterp_4_18_keyValue_1()
		{
			double[] value = {4.536764,-6.6402636,1.1044078,4.0290575,-6.5670834,1.5988054,3.4400282,-6.2635913,2.1240969,2.7767565,-5.710862,2.6664877,2.102135,-4.941773,3.165574,1.4478769,-3.9906015,3.5915484,0.81843156,-2.8703003,3.9355981,0.18267316,-1.5643182,4.186181,-0.4486977,-0.09787595,4.3341036,-1.0279334,1.3699557,4.377647,-1.5445087,2.6821346,4.326506,-1.9908111,3.7825637,4.1959014,-2.3640974,4.6354823,3.9874165,-2.7017994,5.3547425,3.7049131,-3.0086455,6.071666,3.3438725,-3.2791867,6.6558805,2.9066367,-3.5110073,7.0978365,2.3901567,-3.70068,7.3849983,1.7902293,-3.843113,7.5008106,1.1036445,-3.9314132,7.425796,0.33144295,-3.9576848,7.14043,-0.51896423,-3.9142551,6.6290784,-1.4341381,-3.7990122,5.93585,-2.2988026,-3.6145682,5.078251,-3.0932086,-3.3980956,4.0684156,-3.8089337,-3.1502147,2.9210067,-4.4370055,-2.8726408,1.904069,-4.9687614,-2.5717888,1.0679559,-5.3940372,-2.1988926,0.07508016,-5.7409024,-1.785426,-0.7399142,-5.978654,-1.2927154,-1.6826248,-6.138504,-0.78277594,-2.4438617,-6.2097406,-0.23518378,-3.0621576,-6.1957803,0.3528816,-3.5217493,-6.0876145,0.98190427,-3.8049045,-5.87843,1.6808203,-3.9567666,-5.5815916,2.4423504,-3.9271479,-5.1948237,3.2207632,-3.6777666,-4.7053065,3.9852238,-3.2068973,-4.127873,4.6380816,-2.5934634,-3.5277402,5.173179,-1.9775733,-2.9140058,5.606542,-1.2196219,-2.2738338,5.916053,-0.3058473,-1.6274874,6.103309,0.74419165,-0.9833978,6.1729918,1.6603864,-0.34993988,6.13156,2.429862,0.26003212,5.9848905,3.0711374,0.8840061,5.7271805,3.855861,1.5460726,5.3886976,4.4139276,2.1459515,4.93459,4.8217435,2.7536817,4.3612947,5.0632553,3.3637152,3.667153,5.1210737,3.9677446,2.889039,4.9778447,4.554089,2.07131,4.6255755,5.0812035,1.2639804,4.0791006,5.5124173,0.4981913,3.38499,5.8431334,-0.2177586,2.5580733,6.0711565,-0.8763978,1.8646157,6.1958947,-1.5309067,0.99213475,6.2310762,-2.1083696,0.2786774,6.168233,-2.6768446,-0.5780992,6.0056996,-3.1664555,-1.2328396,5.7566304,-3.628406,-1.7572007,5.3998327,-4.056858,-2.136764,4.9290786,-4.4441,-2.354614,4.337494,-4.7812233,-2.5727232,3.6086502,-5.050748,-2.6005383,2.7578807,-5.2381835,-2.4189253,1.7914813,-5.316538,-2.024682,0.7842308,-5.2745457,-1.4429181,-0.19006497,-5.114315,-0.69007117,-1.1176641,-4.8403306,0.21462601,-1.9853697,-4.461184,1.2497914,-2.7812,-4.0251546,2.1434963,-3.4962287,-3.5135174,2.881939,-4.12227,-2.9445422,3.4580636,-4.6533937,-2.2808886,4.1752872,-5.137872,-1.6257172,4.718112,-5.5263567,-0.9072296,5.409986,-5.870382,-0.21620327,5.923061,-6.126053,0.5239361,6.578173,-6.329097,1.2509058,7.0798197,-6.461521,2.0144868,7.7188997,-6.5358715,2.758897,8.208209,-6.545547,3.5284202,8.832122,-6.4934125,4.2706394,9.289274,-6.394204,5.0278187,9.605941,-6.2436304,5.79795,9.774755,-6.040224,6.578856,9.784796,-5.781641,7.3653526,9.625295,-5.4661617,8.150137,9.249594,-5.0925417,8.914538,8.685699,-4.6652875,9.577826,7.9797716,-4.2244062,10.125476,7.1182,-3.7807906,10.559588,6.1108,-3.3358755,10.8814125,4.965826,-2.891199,11.09149,3.6919966,-2.4486475,11.229366,2.607957,-1.9997474,11.258108,1.7205998,-1.5510206,11.182745,0.6908641,-1.0788401};
			return value;
		}
		private double[] getSardine0PosnInterp_4_18_keyValue_2()
		{
			double[] value = {11.005213,-0.16035098,-0.6143366,10.717421,-1.1435399,-0.1277546,10.337416,-1.9371196,0.33933955,9.84847,-2.590175,0.81200415,9.214302,-3.4051943,1.2955065,8.501022,-4.037715,1.7290156,7.7086997,-4.4944787,2.1138577,6.8024364,-4.798874,2.4668813,5.8103285,-4.933298,2.772421,4.766001,-4.8674135,3.0296638,3.7283506,-4.6047783,3.2305403,2.705197,-4.1520214,3.371016,1.7041717,-3.5165565,3.4463928,0.73420596,-2.7069964,3.4505951,-0.228333,-1.7018692,3.376285,-1.1651225,-0.5209596,3.2150257,-2.0523288,0.8033322,2.965842,-2.8364978,1.9825737,2.6439238,-3.507742,2.994403,2.2726405,-4.063086,3.8274653,1.872545,-4.5013046,4.4425836,1.4614358,4.536764,-6.6402636,1.1044078};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine0OrientInterp_4_19_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine0OrientInterp_4_19_keyValue_1()
		{
			double[] value = {-0.077150874,0.9929227,0.09028928,2.3884974,-0.014165558,0.99768865,-0.06645785,2.3482666,0.055669885,0.9796268,-0.19295692,2.323921,0.12578389,0.950823,-0.28304428,2.2987902,0.18685497,0.9165692,-0.35353372,2.2704082,0.23712339,0.8799659,-0.41162184,2.2405348,0.28645417,0.8425756,-0.4560815,2.200864,0.34836373,0.80460256,-0.48089224,2.1199598,0.41313776,0.76602256,-0.49246988,2.0285904,0.4776964,0.72949773,-0.4895295,1.9299074,0.54259014,0.69798267,-0.4673501,1.8060445,0.5738409,0.6775535,-0.4600305,1.7009283,0.64155763,0.6444597,-0.41602322,1.5158149,0.6993308,0.6138711,-0.36619475,1.3366601,0.7994274,0.53377515,-0.27568105,1.1891629,0.8341818,0.50950056,-0.21106748,0.9987098,0.8513534,0.50738555,-0.13325576,0.77553135,0.82815033,0.55920225,-0.038210917,0.5212077,0.63876164,0.757447,0.13512038,0.26369458,-0.57919747,0.7247737,0.37314245,0.1605488,-0.97834617,0.11806071,0.17000075,0.32987645,0.9956471,0.06779352,-0.06395335,5.7710466,0.98683953,0.16155265,-0.0069473446,5.600711,0.9707476,0.23372276,0.054984473,5.446949,0.96211547,0.25619358,0.09327014,5.313821,0.9470731,0.28955442,0.13860412,5.1919756,0.89938986,0.38158613,0.21328413,5.1504593,0.8378619,0.47800255,0.26363084,5.1122093,0.7833443,0.53685814,0.3132969,4.950473,0.6559425,0.6561824,0.3730472,4.843582,0.5871506,0.70066714,0.40536362,4.6935873,0.47781858,0.776841,0.410131,4.603138,0.3733519,0.84644616,0.37965405,4.5231023,0.25803754,0.9145539,0.31146097,4.442873,0.13820243,0.9696389,0.20174356,4.360217,0.063778736,0.99302495,0.09916498,4.3040733,-0.014244648,0.9997843,-0.015115625,4.242388,-0.076145485,0.9886065,-0.12984177,4.14225,-0.117024966,0.9678458,-0.22266486,4.041979,-0.14340532,0.94620794,-0.29004377,3.937635,-0.12281886,0.94129694,-0.31444502,3.8227708,-0.12915318,0.91923267,-0.37192836,3.7025044,-0.11805137,0.8942019,-0.43181813,3.560913,-0.08656789,0.8744933,-0.4772499,3.4094431,-0.022803966,0.8860173,-0.4630912,3.2359874,0.01726807,0.90047,-0.43457502,3.0780823,0.049760826,0.9228746,-0.38187203,2.9239006,0.051115643,0.91152215,-0.4080619,2.8245986,0.09711921,0.9388392,-0.33037683,2.6511445,0.07742416,0.96657985,-0.24439523,2.5216784,0.040575292,0.98853105,-0.14546524,2.3992803,-0.017790332,0.998786,-0.04593535,2.2898211,-0.06346041,0.9962156,0.05938941,2.2156215,-0.124705136,0.9798974,0.15572348,2.1495073,-0.19191624,0.95071846,0.24352132,2.0863967,-0.24911886,0.9160423,0.31433457,2.0351136,-0.31296906,0.87435734,0.37087655,1.978082,-0.29491886,0.87677103,0.37986243,1.8962795,-0.41523317,0.8200244,0.39388007,1.7944456,-0.41864365,0.8165017,0.3975709,1.6776059,-0.5460515,0.7483654,0.37653273,1.5540665,-0.56180406,0.74764735,0.35411784,1.3798064,-0.5903927,0.75434285,0.2870596,1.1529846,-0.5817422,0.7911563,0.18880598,0.8998675,-0.46640718,0.88124233,0.07665837,0.6461473,-0.51255083,0.8499589,0.121905856,0.5074081,-0.12546048,0.97977984,-0.15584365,0.3121722,0.6398603,0.7143778,-0.28328046,0.2751066,0.9422699,0.23416823,-0.23936126,0.3912093,-0.990177,0.033872083,0.13565391,5.738587,-0.980002,0.1960896,0.033845052,5.5901303,-0.94861704,0.31186497,-0.053527392,5.4537654,-0.9060208,0.40272862,-0.13013954,5.328877,-0.8131216,0.53176373,-0.2367703,5.305667,-0.7129421,0.654235,-0.25236875,5.2859206,-0.59209824,0.7685965,-0.24223751,5.2596188,-0.5953392,0.76319385,-0.25120988,5.131299,-0.48799735,0.83731574,-0.24649659,5.099512,-0.48382115,0.81912696,-0.30813715,4.9706,-0.41759822,0.87389284,-0.24884292,4.952228,-0.40975153,0.85479033,-0.31849232,4.823666,-0.35485134,0.8997026,-0.254196,4.801943,-0.34785697,0.88066703,-0.3215919,4.6800833,-0.30151528,0.91862404,-0.25537866,4.6542063,-0.29475772,0.9001709,-0.32064012,4.538346,-0.25233454,0.93577427,-0.24627988,4.5263667,-0.18024991,0.9683326,-0.17274795,4.4938927,-0.10527856,0.99082977,-0.084693834,4.4505644,-0.031167217,0.9994267,0.013228817,4.3924036,0.036161304,0.99323344,0.110362135,4.319669,0.10151843,0.97111106,0.21595727,4.231249,0.14747751,0.94661146,0.28666574,4.146138,0.17438523,0.9188117,0.35408348,4.047478,0.19273698,0.8856899,0.42238104,3.933875,0.19064891,0.85678256,0.4791416,3.8083355,0.16814254,0.83404464,0.52544993,3.666883,0.12571786,0.8177171,0.56172395,3.5048559,0.064821795,0.83348095,0.5487327,3.3678064,-0.005621884,0.85184604,0.523762,3.1686015,-0.04347538,0.8421797,0.53744125,3.0071313};
			return value;
		}
		private double[] getSardine0OrientInterp_4_19_keyValue_2()
		{
			double[] value = {-0.11104071,0.8629729,0.4928972,2.803245,-0.13639882,0.85754275,0.49599987,2.6799304,-0.17372896,0.8838833,0.4342449,2.5153697,-0.17584954,0.9155743,0.36166385,2.3850892,-0.18772109,0.9052855,0.38107625,2.2995703,-0.18606447,0.93274957,0.3088013,2.1687887,-0.15670505,0.9608396,0.2285404,2.0536869,-0.11414141,0.9831601,0.14271656,1.9545416,-0.055668548,0.9967492,0.058240097,1.8716004,0.015130559,0.9991829,-0.03748066,1.8136463,0.09342164,0.98762995,-0.12593448,1.7757658,0.17244545,0.9634809,-0.20485906,1.745522,0.24930502,0.92996454,-0.270209,1.7185379,0.32327,0.8901532,-0.32112914,1.6897665,0.3945872,0.84662294,-0.3571143,1.6559572,0.46322018,0.80144286,-0.3783071,1.6136878,0.5293458,0.75443196,-0.38810495,1.566295,0.57678807,0.7317078,-0.3632069,1.467231,0.61244136,0.7117441,-0.34399936,1.3720514,0.6469368,0.69200087,-0.3203242,1.26697,0.6319245,0.69718385,-0.33853573,1.1477534,-0.077150874,0.9929227,0.09028928,2.3884974};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine1PosnInterp_4_26_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine1PosnInterp_4_26_keyValue_1()
		{
			double[] value = {3.0382698,-6.1371408,1.7000476,2.548246,-5.596786,2.1694937,1.9887669,-4.790156,2.6892328,1.4556425,-3.8094635,3.1847591,0.9364333,-2.6735945,3.6422908,0.4181059,-1.4081478,4.0393524,-0.11630499,-0.0150619745,4.3559546,-0.6690941,1.2376399,4.5567946,-1.2180781,2.3590193,4.626848,-1.7360425,3.3135529,4.5720067,-2.2008755,4.1338124,4.4065237,-2.6497853,5.119151,4.1235104,-3.025472,5.9033704,3.739784,-3.360528,6.855797,3.2242227,-3.6051707,7.569839,2.6394672,-3.791058,8.104834,1.9592669,-3.9220276,8.453915,1.1846211,-3.9951181,8.608659,0.33552372,-4.0068088,8.531436,-0.5915591,-3.952521,8.2123375,-1.5832477,-3.8332317,7.6693707,-2.5218198,-3.6528697,6.899444,-3.3926265,-3.4134321,5.916155,-4.1880608,-3.1178548,4.733,-4.8996587,-2.769999,3.3652213,-5.517296,-2.3755229,1.8334192,-6.027618,-1.9463935,0.171646,-6.40803,-1.498714,-1.3056152,-6.637726,-1.0389519,-2.5645041,-6.7330375,-0.5725833,-3.5776513,-6.7117953,-0.105846584,-4.328639,-6.5922656,0.41725022,-4.8938656,-6.3639846,1.0000676,-5.2224574,-6.028385,1.649456,-5.2903833,-5.582673,2.3644662,-5.1013923,-5.0259104,3.1305547,-4.6451917,-4.374547,3.846035,-3.9294128,-3.7188697,4.508278,-2.9973807,-3.064755,5.109618,-1.8790786,-2.4315343,5.635826,-0.6133797,-1.838645,6.070502,0.48766005,-1.2687447,6.401832,1.4022421,-0.72395504,6.6175723,2.1212525,-0.2133838,6.733825,2.9955206,0.32946593,6.731377,3.6862493,0.85169405,6.6138487,4.5182114,1.4112742,6.3536844,5.179166,1.9638993,5.9375496,5.8399096,2.5495298,5.38388,6.3333044,3.1384792,4.6820984,6.6603055,3.74354,3.861944,6.7673645,4.322484,2.955661,6.6404862,4.851209,2.017656,6.282686,5.298102,1.0670123,5.7050595,5.6569247,0.117281914,4.9185276,5.9242992,-0.8172483,3.9350173,6.096499,-1.6856964,2.791175,6.1819506,-2.4719403,1.5048466,6.177343,-3.1919312,0.35017192,6.081072,-3.821597,-0.65149367,5.894405,-4.3377185,-1.4722126,5.6205745,-4.7543435,-2.1273026,5.248227,-5.0998096,-2.6383471,4.7439303,-5.3730884,-3.0011625,4.0954833,-5.5706906,-3.1898007,3.2948418,-5.687818,-3.1748629,2.3422148,-5.7154293,-2.930641,1.2707363,-5.6449785,-2.4646642,0.2015903,-5.478697,-1.7869394,-0.8455503,-5.184524,-0.9369035,-1.8644109,-4.7689943,0.06923425,-2.8324325,-4.2440805,1.2113065,-3.7273402,-3.661122,2.2169166,-4.526611,-3.0052366,3.065784,-5.205552,-2.3016794,3.7334151,-5.742529,-1.5740917,4.2193227,-6.1373715,-0.76824963,4.7043004,-6.4374676,0.07912737,5.055668,-6.6389546,0.9949509,5.540468,-6.7594614,1.8690327,5.86606,-6.791068,2.7863665,6.323113,-6.7503605,3.6539555,6.627964,-6.6458936,4.547604,7.115382,-6.464856,5.37123,7.748543,-6.2287235,6.0958886,8.218164,-5.95535,6.8152905,8.839391,-5.6207066,7.464962,9.313211,-5.258674,8.08888,9.785402,-4.855613,8.684396,10.126398,-4.4233785,9.269629,10.291947,-3.9555542,9.857466,10.256732,-3.4417953,10.449203,10.013226,-2.8755393,11.037853,9.545755,-2.257891,11.590375,8.859802,-1.6168029,12.050697,8.009363,-1.011257,12.417355,7.004907,-0.44246018,12.688417,5.8568697,0.08764011,12.860645,4.5766172,0.5761951,12.930643,3.4261293,1.021132,12.894858,2.4155555,1.4170831};
			return value;
		}
		private double[] getSardine1PosnInterp_4_26_keyValue_2()
		{
			double[] value = {12.753386,1.553005,1.7613316,12.489879,0.4825642,2.0977113,12.120801,-0.4198519,2.3834982,11.633107,-1.1882252,2.632346,10.988058,-2.1228836,2.8631809,10.2454815,-2.8622613,3.0468729,9.411373,-3.3982155,3.183877,8.415177,-3.7597737,3.295195,7.314111,-3.9115348,3.3732316,6.1135626,-3.8857732,3.4176645,4.817489,-3.6790366,3.4260654,3.4313388,-3.2861729,3.3938293,1.998346,-2.6979365,3.3061926,0.537508,-1.906614,3.15305,-0.9167222,-0.9095595,2.9214025,-2.3100448,0.27826977,2.6058543,-3.5930624,1.6230273,2.2248914,-4.7346764,2.969937,1.8058475,-5.702568,4.164071,1.3724309,-6.476655,5.198019,0.9389939,3.0382698,-6.1371408,1.7000476};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine1OrientInterp_4_27_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine1OrientInterp_4_27_keyValue_1()
		{
			double[] value = {-0.016339662,0.9972099,-0.07283799,2.3549752,0.07438436,0.97041637,-0.22969379,2.3714433,0.1402706,0.9347651,-0.32640216,2.3817527,0.17984255,0.9048321,-0.38592163,2.3815322,0.20101377,0.87617487,-0.4380765,2.403257,0.22644135,0.8505361,-0.474671,2.3962831,0.2615172,0.8259042,-0.49949083,2.3517635,0.31174228,0.7991529,-0.513976,2.2667263,0.33106783,0.7930206,-0.5113827,2.1539233,0.396661,0.7744909,-0.4927716,1.9765177,0.46644178,0.75379103,-0.46285105,1.7807913,0.5443035,0.7215218,-0.4279485,1.5833596,0.6902424,0.6245389,-0.36539912,1.4325995,0.76452655,0.5757373,-0.2898717,1.214265,0.85543793,0.45793292,-0.2419161,1.136376,0.91610485,0.38005558,-0.12770647,0.91976,0.9384912,0.34260044,-0.043117248,0.695008,0.9393349,0.3374526,0.061438926,0.44944465,0.88314706,0.3880566,0.2635618,0.2062027,-0.7554945,0.14157741,0.6396748,0.10936683,0.97650456,0.13964891,-0.16412805,5.963317,0.97832733,0.1974123,-0.062488034,5.747374,0.9724371,0.23282158,0.012651803,5.545857,0.9589237,0.27265143,0.078274004,5.375534,0.9388512,0.315787,0.13724877,5.2296033,0.9105458,0.36391702,0.1961389,5.098891,0.8706151,0.41857266,0.25850704,4.9727373,0.81309676,0.4813504,0.32737717,4.835028,0.7078382,0.57902133,0.40459746,4.69264,0.5893767,0.6670826,0.45567095,4.5390015,0.4699606,0.7459036,0.47197935,4.3960266,0.355357,0.8215428,0.44585738,4.2841024,0.24369888,0.89728767,0.36808366,4.2055097,0.118137255,0.9661534,0.22932774,4.155259,0.008336843,0.99868965,0.050493218,4.1085668,-0.057216145,0.9934361,-0.09905081,4.0470695,-0.10363979,0.97272015,-0.20754343,3.989631,-0.15887232,0.94044334,-0.3005426,3.9411635,-0.17653629,0.91144705,-0.37161696,3.8846965,-0.19100757,0.88434887,-0.42596117,3.8384335,-0.19974592,0.8592723,-0.47090617,3.7933013,-0.15633462,0.8680119,-0.47129056,3.709208,-0.12457661,0.8793071,-0.4596735,3.6205912,-0.08547,0.893868,-0.44010788,3.4963856,-0.06623639,0.8749231,-0.47971067,3.3431525,0.005089146,0.8952818,-0.44547123,3.1333706,0.029824998,0.884022,-0.46649274,2.9779007,0.08866732,0.9125107,-0.3993274,2.7395396,0.09736048,0.92563236,-0.36568508,2.581067,0.097218834,0.95724624,-0.27244857,2.421796,0.054682102,0.98247683,-0.178183,2.3033216,-0.006170047,0.997499,-0.07041158,2.1910958,-0.06790577,0.9968508,0.040953964,2.0976198,-0.13890482,0.97999287,0.14254676,2.021776,-0.20711854,0.9507487,0.23060547,1.9610308,-0.27343512,0.9138409,0.30021343,1.9091634,-0.33824867,0.8726939,0.35212678,1.8600962,-0.39895156,0.82798153,0.39406094,1.8277583,-0.46638903,0.7776581,0.42157927,1.7848545,-0.46863583,0.7692062,0.43439913,1.7169229,-0.57360554,0.73189193,0.36784628,1.5470465,-0.6442101,0.69348466,0.3226023,1.382466,-0.72319096,0.64470506,0.24769005,1.1643454,-0.77315396,0.6138646,0.15938216,0.89775676,-0.78774124,0.6138193,0.051864777,0.6118944,-0.69973266,0.7045035,-0.11853485,0.3311786,0.076881066,0.85396004,-0.5146273,0.14385948,0.9211104,0.1452913,-0.361172,0.24188063,-0.9758599,0.10698244,0.1903954,5.8601613,-0.97359574,0.21471947,0.07750519,5.6935334,-0.94272655,0.33312547,-0.01717629,5.5598164,-0.9040064,0.41766873,-0.09124285,5.4354773,-0.86082715,0.48431435,-0.1562558,5.3182654,-0.75805956,0.5978703,-0.2605713,5.2769303,-0.6631197,0.69886756,-0.26806083,5.234578,-0.551914,0.79557925,-0.24988842,5.179172,-0.43185887,0.8794455,-0.20018467,5.109512,-0.36858767,0.9061813,-0.20731334,4.988605,-0.26521188,0.9525958,-0.14907728,4.910356,-0.25665393,0.936868,-0.23750228,4.7750716,-0.20937048,0.9668509,-0.14616168,4.7251644,-0.20939961,0.9510054,-0.22746564,4.6158223,-0.17090113,0.97463244,-0.14451435,4.575347,-0.1944226,0.951433,-0.23869452,4.4637375,-0.23352812,0.9243027,-0.301876,4.361073,-0.20252067,0.9461963,-0.2523844,4.3113446,-0.20513055,0.9255024,-0.31838146,4.209055,-0.18030477,0.94682175,-0.26649356,4.1674404,-0.14521018,0.9493299,-0.27872324,4.092753,-0.12865932,0.9703695,-0.20452337,4.0690403,-0.080356665,0.99223644,-0.094918564,4.0381165,-0.0222535,0.99905765,0.03726184,3.991961,0.042354755,0.98753107,0.15161918,3.934422,0.10349604,0.9639791,0.24501577,3.8804064,0.13526274,0.93512344,0.32748762,3.8188386,0.14416765,0.90411067,0.4022433,3.7400513,0.14499138,0.87418175,0.46344766,3.6538787,0.13172345,0.84756976,0.51407635,3.553545,0.10223661,0.8251383,0.5556029,3.4315786,0.036363993,0.82530516,0.5635149,3.260001};
			return value;
		}
		private double[] getSardine1OrientInterp_4_27_keyValue_2()
		{
			double[] value = {-0.033568308,0.8260928,0.5625333,3.0559657,-0.117144786,0.8302382,0.54496026,2.8043954,-0.185223,0.81314355,0.55180603,2.6010208,-0.25569797,0.826955,0.50076336,2.3604727,-0.2806499,0.8549764,0.43617773,2.1659942,-0.29984763,0.8502347,0.4326574,2.0661798,-0.29142922,0.8889332,0.3533652,1.9176935,-0.24209203,0.9340705,0.26249516,1.7936532,-0.16647005,0.9732905,0.15809333,1.7039658,-0.075914435,0.99550605,0.056609266,1.6443404,0.0028479004,0.9998352,-0.01792695,1.608115,0.07322934,0.99379754,-0.08368901,1.5842959,0.13697723,0.9808114,-0.13873102,1.5676123,0.20165734,0.96108794,-0.18879654,1.5491836,0.26484674,0.93564594,-0.23328729,1.5312704,0.33013448,0.9038245,-0.27223596,1.5101182,0.39736575,0.86477494,-0.3070253,1.4872588,0.45972538,0.8208258,-0.33896524,1.4735951,0.50570107,0.7893478,-0.34813288,1.4456145,0.5388318,0.76991326,-0.34189746,1.3949533,0.58146966,0.7396875,-0.33875558,1.3389726,0.58146966,0.7396875,-0.33875558,1.3389726};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine2PosnInterp_4_34_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine2PosnInterp_4_34_keyValue_1()
		{
			double[] value = {6.5387926,-5.4408135,2.4402792,6.061559,-6.094796,2.388382,5.431891,-6.568479,2.3081949,4.644802,-6.8363595,2.198522,3.7097023,-6.8555164,2.066479,2.6497192,-6.5923896,1.9155675,1.5659446,-6.0344,1.7812195,0.47381544,-5.1856837,1.6608988,-0.61010206,-4.072552,1.5370159,-1.6607143,-2.6759748,1.4119128,-2.6432738,-1.0159545,1.2801161,-3.5195494,0.8574976,1.1434468,-4.278699,2.882132,1.0170169,-4.925948,4.764331,0.91685504,-5.461662,6.4750056,0.85136575,-5.884409,7.985967,0.8205116,-6.1965632,9.242954,0.7934477,-6.4047737,10.22348,0.7558816,-6.53253,10.94194,0.69678473,-6.598023,11.45292,0.5980988,-6.60337,11.805618,0.45723027,-6.5459933,11.9397335,0.24555741,-6.413592,11.881286,-0.053464428,-6.197151,11.583475,-0.44237947,-5.898014,11.020365,-0.90635824,-5.4845247,10.18688,-1.435571,-5.0051904,9.17383,-1.955856,-4.460585,7.982627,-2.4642727,-3.8511553,6.615428,-2.95527,-3.1771405,5.0761447,-3.420701,-2.4393473,3.3719015,-3.8482933,-1.6404607,1.5172172,-4.2215943,-0.78819424,-0.2092216,-4.5229397,0.098974824,-1.7711222,-4.7448034,0.9741227,-3.130079,-4.890163,1.8320751,-4.256076,-4.975601,2.6763668,-5.106145,-4.99728,3.4611192,-5.671813,-4.94668,4.274782,-5.9565425,-4.809109,5.1358776,-5.995324,-4.5780325,6.0316143,-5.7710285,-4.2500024,6.904487,-5.302104,-3.8510585,7.6730113,-4.5694876,-3.4070153,8.332001,-3.5935736,-2.9231596,8.876914,-2.3941934,-2.403204,9.302589,-0.99210954,-1.8504168,9.603766,0.589069,-1.2678957,9.777435,2.323515,-0.6596819,9.822765,4.056378,-0.030659914,9.743177,5.6325636,0.6120983,9.546785,7.0266824,1.258873,9.245053,8.219199,1.8994353,8.851154,9.1963825,2.523835,8.378976,9.949524,3.1225324,7.842726,10.474396,3.6864204,7.1853156,10.840014,4.2815323,6.420238,11.018716,4.8893147,5.5772862,10.988771,5.4804196,4.6941648,10.743771,6.024501,3.8062794,10.293235,6.497376,2.918942,9.627907,6.883443,2.036833,8.721524,7.178995,1.1630361,7.5834966,7.3794217,0.26578122,6.2809286,7.490052,-0.6478181,4.8236485,7.50145,-1.5685122,3.2256768,7.402413,-2.4846563,1.7577816,7.1805925,-3.3781683,0.44367874,6.827188,-4.1942544,-0.8716612,6.327259,-4.9176507,-2.0282214,5.6857996,-5.5329456,-2.9957812,4.918496,-6.0306454,-3.688499,4.058487,-6.401605,-4.093779,3.1328044,-6.640047,-4.21139,2.167714,-6.758078,-4.0925045,1.1268637,-6.7411294,-3.7400336,0.08020306,-6.5889187,-3.1680622,-0.94835436,-6.30227,-2.3911471,-1.9453883,-5.8820457,-1.450522,-2.9130623,-5.331349,-0.3624866,-3.8365529,-4.656989,0.853958,-4.701092,-3.8695953,1.9273828,-5.4943895,-2.9887328,3.154388,-6.1900606,-2.0285265,4.516004,-6.7848873,-0.997283,5.7057447,-7.280869,0.08952677,6.7141776,-7.676151,1.217216,7.5349655,-7.969069,2.3714023,8.163692,-8.158082,3.5375168,8.632879,-8.242047,4.701638,8.94006,-8.220744,5.849866,9.0831,-8.095365,6.96951,9.06441,-7.870548,8.047542,8.883459,-7.550948,9.071326,8.541103,-7.1428876,10.029048,8.039703,-6.654292,10.909897,7.383019,-6.0942388,11.704247,6.576251,-5.4725733,12.403984,5.627565,-4.7976685,13.00109,4.547363,-4.0766687,13.488464,3.5987377,-3.3152614};
			return value;
		}
		private double[] getSardine2PosnInterp_4_34_keyValue_2()
		{
			double[] value = {13.857074,2.7885213,-2.5261958,14.101733,2.1211793,-1.724278,14.219917,1.5987129,-0.9250409,14.224682,0.9176289,-0.05954379,14.105473,0.3693918,0.76773757,13.860541,-0.18063766,1.6094193,13.49446,-0.5835974,2.4256706,12.989674,-0.9853724,3.2501664,12.373941,-1.2277725,4.019862,11.632777,-1.318479,4.7498636,10.788702,-1.2507799,5.409821,9.860962,-1.0274642,5.980848,8.855393,-0.6535529,6.4576097,7.7774706,-0.13264734,6.8326483,6.633612,0.52880204,7.101002,5.396079,1.3227265,7.2593684,4.0750093,2.1167521,7.302325,2.7214756,2.7812066,7.2245665,1.3543062,3.3132942,7.0226173,-0.005611539,3.711634,6.695481,-1.369221,3.9567318,6.2335877,6.5387926,-5.4408135,2.4402792};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine2OrientInterp_4_35_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine2OrientInterp_4_35_keyValue_1()
		{
			double[] value = {-0.50099427,0.7234017,0.47507328,1.8519343,-0.46260875,0.79446095,0.39347798,1.678501,-0.3576828,0.89180064,0.2770461,1.5442675,-0.20368336,0.96949595,0.13634841,1.456235,-0.031822376,0.9994082,-0.013059918,1.4306936,0.119728334,0.9831028,-0.13847017,1.4505022,0.23270594,0.94003063,-0.24937956,1.5202746,0.3199638,0.8913802,-0.32103682,1.5890825,0.38598016,0.8469961,-0.36553636,1.6333202,0.43609828,0.80248517,-0.40722948,1.6842477,0.4817753,0.75952256,-0.4370561,1.7232481,0.5212069,0.7189704,-0.45980957,1.7563555,0.5473322,0.6868849,-0.47813854,1.7933301,0.55405474,0.6772878,-0.48405024,1.8135365,0.5478944,0.673241,-0.49654627,1.8533266,0.5367763,0.67099214,-0.51150817,1.9046918,0.55474377,0.6552092,-0.5127966,1.9054414,0.60059816,0.6221086,-0.5022577,1.8621858,0.7076323,0.5459784,-0.4485132,1.7221476,0.9036075,0.33660656,-0.26493275,1.4435962,0.9995651,0.02535187,-0.015050733,1.1909989,-0.8986963,0.42330503,-0.11470856,5.675645,0.34490713,0.9105958,0.2277125,5.8200336,0.7199439,0.64694476,0.25128466,5.4987283,0.78149444,0.5662076,0.26205844,5.30439,0.7394602,0.5841306,0.33464953,5.157601,0.7368111,0.5863318,0.33663687,5.0668497,0.7264256,0.59324557,0.34693733,4.9905005,0.7077336,0.60491866,0.36494732,4.919787,0.6835667,0.6196322,0.38573623,4.8516254,0.6448565,0.64065623,0.41679725,4.773736,0.65185404,0.6438267,0.40071598,4.7376494,0.5973485,0.6880509,0.4120201,4.6941667,0.5445153,0.7297306,0.41351673,4.653955,0.49649245,0.7652424,0.40975553,4.6181126,0.44089,0.8052365,0.39649758,4.5970807,0.36397654,0.8592025,0.3595722,4.5843263,0.2716724,0.9149031,0.29857403,4.5565405,0.12558146,0.97669107,0.17407995,4.517387,0.008135263,0.99956715,0.028268741,4.4494247,-0.086371355,0.9901006,-0.11063757,4.35344,-0.15166852,0.96411,-0.21791832,4.2545996,-0.20765442,0.92301446,-0.32391977,4.1320825,-0.22351155,0.8852523,-0.4078858,3.9975648,-0.21506947,0.85616326,-0.46981865,3.857688,-0.18732587,0.83609,-0.51561856,3.709656,-0.14363639,0.8235678,-0.5487301,3.5500243,-0.088935934,0.81638396,-0.5706205,3.3816614,-0.022836205,0.818949,-0.57341176,3.2035968,0.039882675,0.8301105,-0.5561709,3.0318274,0.08518127,0.8446153,-0.52855396,2.8838184,0.117821895,0.8635127,-0.49037096,2.7510111,0.13645704,0.8875782,-0.4399823,2.6306376,0.13821493,0.91693103,-0.3743447,2.5194592,0.11633415,0.94984204,-0.29028684,2.4159307,0.070349805,0.9772418,-0.20012283,2.3295863,0.019830113,0.99463403,-0.101537295,2.2506294,-0.034289427,0.9994118,6.3082E-4,2.182053,-0.093818806,0.99062556,0.099292524,2.1241295,-0.15550809,0.9694608,0.18963894,2.074099,-0.22319077,0.93600553,0.27217573,2.0209022,-0.29345766,0.891716,0.3445655,1.9746073,-0.35763425,0.84640396,0.39458597,1.9265214,-0.4013037,0.816621,0.41483206,1.8672507,-0.45334935,0.7852588,0.4217143,1.7970955,-0.50818896,0.75199497,0.41981825,1.7202115,-0.4993,0.75413406,0.42659253,1.6378698,-0.5306961,0.7477887,0.39896563,1.501862,-0.66005665,0.6810605,0.3169888,1.3387616,-0.72560257,0.6410734,0.2500513,1.1731912,-0.7734421,0.6071326,0.1821464,0.99927175,-0.7915053,0.60657513,0.07474008,0.78360116,-0.74867684,0.6592282,-0.07001935,0.53699905,-0.45601544,0.8157431,-0.35582766,0.28777164,0.57109416,0.62672603,-0.5301584,0.18828785,-0.9548209,-0.002889737,0.29716778,5.942475,-0.96703994,0.22373582,0.12155803,5.757024,-0.939167,0.34336132,0.008186557,5.590054,-0.89447504,0.43923056,-0.08361496,5.463447,-0.8468683,0.51089466,-0.1476496,5.349509,-0.79687315,0.5696514,-0.20122339,5.2452383,-0.67002356,0.6879772,-0.27884775,5.202534,-0.6705956,0.69203985,-0.26717487,5.0952997,-0.6348872,0.7101557,-0.30429736,4.9842143,-0.548353,0.7765257,-0.3103495,4.9402575,-0.4729187,0.83324313,-0.2864507,4.9048295,-0.39287692,0.88490474,-0.250183,4.8654675,-0.30809724,0.9298564,-0.20110482,4.8187876,-0.23078471,0.96066725,-0.15445703,4.7562437,-0.15729456,0.98278344,-0.09692862,4.6850424,-0.08775079,0.99561834,-0.032310225,4.6032887,-0.025486724,0.9990785,0.034535974,4.5127997,0.027646484,0.99430466,0.10292697,4.413625,0.071285866,0.98308057,0.16873357,4.308221,0.106588505,0.9676387,0.22872318,4.2005343,0.13471882,0.9499946,0.28171104,4.0942793,0.15207992,0.93174183,0.32974055,3.9888954,0.15571271,0.9146092,0.37315375,3.8808067,0.14701916,0.8996581,0.4110969,3.7676318,0.08159396,0.9133184,0.39898854,3.635706};
			return value;
		}
		private double[] getSardine2OrientInterp_4_35_keyValue_2()
		{
			double[] value = {0.04659816,0.9274255,0.37109357,3.5207071,0.014137317,0.9425103,0.33387765,3.396441,-0.013857351,0.9583667,0.2852038,3.2618349,0.0066272826,0.94493306,0.3271965,3.1507607,-0.043609515,0.9576693,0.2845481,2.990723,-0.049693435,0.96017414,0.27494746,2.8636172,-0.06728794,0.97640514,0.2051956,2.7200446,-0.06450039,0.979114,0.19280918,2.599379,-0.056675103,0.991731,0.115142256,2.4685235,-0.03348682,0.9987514,0.03707146,2.348166,0.0069108554,0.99933994,-0.035661664,2.235439,0.053852636,0.99331415,-0.10211177,2.1287365,0.10348221,0.98178434,-0.15934561,2.02944,0.15662572,0.9661031,-0.20521526,1.9348326,0.20907626,0.948006,-0.23994115,1.8465549,0.25483027,0.9316138,-0.25914735,1.7586918,0.2252103,0.9332581,-0.27983868,1.6862413,0.20090838,0.9472713,-0.24962519,1.5823267,0.17434584,0.9612508,-0.21354243,1.4755462,0.1394779,0.97444344,-0.17608471,1.3692961,0.079931684,0.9878447,-0.13331838,1.2620124,-0.50099427,0.7234017,0.47507328,1.8519343};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine3PosnInterp_4_42_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine3PosnInterp_4_42_keyValue_1()
		{
			double[] value = {8.265151,-6.8517284,-0.684391,7.812146,-7.4970284,-0.2582609,7.2212462,-7.979398,0.23307139,6.489232,-8.270073,0.788746,5.6369076,-8.33062,1.3888032,4.7369957,-8.133032,1.9780542,3.815425,-7.679361,2.5376089,2.88133,-6.9737196,3.059083,1.9431515,-6.0207405,3.5330484,1.0098109,-4.8264136,3.9482155,0.09182185,-3.4002395,4.2907176,-0.79693377,-1.7586625,4.544219,-1.6389121,0.07008147,4.6937284,-2.417212,2.082134,4.7339125,-3.122081,4.2392015,4.6699944,-3.749128,6.258444,4.504415,-4.3239975,8.060816,4.2244167,-4.8381205,9.63324,3.8423307,-5.289637,10.9200535,3.3846478,-5.642234,11.914239,2.873738,-5.931138,12.6102,2.3237994,-6.192848,13.133507,1.6761258,-6.424715,13.467438,0.92998874,-6.6200404,13.594952,0.08779949,-6.774643,13.497547,-0.84513897,-6.8808613,13.159828,-1.8462021,-6.924095,12.611227,-2.8031826,-6.905273,11.862763,-3.7090254,-6.827461,10.874306,-4.5753465,-6.6895366,9.654114,-5.397971,-6.4895744,8.210416,-6.1707034,-6.2247305,6.5530863,-6.8853235,-5.8914866,4.6951523,-7.531662,-5.4844265,2.8356354,-8.081501,-5.001714,1.1220126,-8.522654,-4.445219,-0.4437685,-8.856778,-3.8237672,-1.8716666,-9.079468,-3.146308,-3.136495,-9.186701,-2.4251518,-4.215119,-9.178772,-1.6752558,-5.0890155,-9.059503,-0.9128191,-5.7459216,-8.835349,-0.13096374,-6.199284,-8.507896,0.7138702,-6.475258,-8.058929,1.5818639,-6.5458145,-7.5018926,2.463199,-6.375947,-6.8467264,3.322212,-5.970584,-6.114626,4.1473293,-5.337048,-5.3099236,4.9253407,-4.4483156,-4.4371552,5.6415443,-3.315836,-3.5008714,6.278862,-1.9551673,-2.5073366,6.8193135,-0.38844085,-1.4656558,7.247166,1.354437,-0.38808644,7.552393,3.237018,0.7109016,7.732814,4.9690313,1.8157486,7.754824,6.4830194,2.904986,7.630243,7.755396,3.958729,7.3736243,8.771272,4.9592104,6.9998417,9.558322,5.89087,6.5595284,10.112677,6.7407017,6.066796,10.435284,7.4968753,5.4844265,10.562673,8.230575,4.8080587,10.486013,8.942227,4.030859,10.207126,9.595941,3.2092738,9.740475,10.137937,2.3584924,9.099627,10.559919,1.48583,8.295353,10.859549,0.5980237,7.3386226,11.03378,-0.2980405,6.2413006,11.078571,-1.1946951,5.1419096,10.989183,-2.0804162,4.1781025,10.761753,-2.9400172,3.3603039,10.39566,-3.7578804,2.6979058,9.89399,-4.5189056,2.1984584,9.263418,-5.20955,1.8657165,8.513588,-5.818144,1.6993831,7.6558247,-6.296224,1.7054703,6.697383,-6.636867,1.8789145,5.6532717,-6.835337,2.211365,4.5378494,-6.8882556,2.6934118,3.3655472,-6.793612,3.3134089,2.1512928,-6.5513945,3.9341662,0.9117068,-6.1993866,4.4231033,-0.3330245,-5.7419767,4.7805724,-1.5592732,-5.185877,4.9735293,-2.7445385,-4.5407295,5.009566,-3.8669672,-3.8212347,5.186772,-4.9047194,-3.0408149,5.4989643,-5.8436604,-2.2126052,5.8131824,-6.6730433,-1.3500828,6.1266966,-7.384028,-0.46605575,6.3104343,-7.9704766,0.42590916,6.3443832,-8.439771,1.3609142,6.2352166,-8.813643,2.3248305,5.9468646,-9.08368,3.2803164,5.4878225,-9.236973,4.198955,4.872739,-9.269519,5.072725,4.1095705,-9.183531,5.8941464,3.2057588,-8.981832,6.6562495,2.1708968,-8.667847,7.3509574,1.2656649,-8.245739,7.966588,0.4940108,-7.723244};
			return value;
		}
		private double[] getSardine3PosnInterp_4_42_keyValue_2()
		{
			double[] value = {8.492775,-0.14181817,-7.1101284,8.937936,-0.9154335,-6.397449,9.28092,-1.5453141,-5.611257,9.514478,-2.032718,-4.765944,9.646027,-2.6617785,-3.8250344,9.657079,-3.143951,-2.8460183,9.542005,-3.4460309,-1.8440725,9.294882,-3.5764215,-0.8267331,8.911409,-3.5401251,0.18683612,8.391391,-3.3427393,1.1725224,7.7348185,-2.990428,2.11379,6.9436607,-2.4889195,2.9941115,6.0193243,-1.841016,3.7916336,4.9701176,-1.0545759,4.488611,3.808049,-0.13945228,5.066939,2.5503273,0.6417044,5.5095496,1.2238916,1.2867465,5.801482,-0.14012146,1.7952313,5.934278,-1.5086489,2.169757,5.906532,-2.8492556,2.6883385,5.7357883,-4.13605,3.3405151,5.4312296,8.265151,-6.8517284,-0.684391};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine3OrientInterp_4_43_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine3OrientInterp_4_43_keyValue_1()
		{
			double[] value = {-0.20807563,0.8572621,0.47096315,2.4838848,-0.1967928,0.9060145,0.37471357,2.3695493,-0.16219002,0.9519484,0.25978553,2.2824373,-0.1110109,0.9846252,0.13486913,2.2214296,-0.048176244,0.99876916,0.011805659,2.1833022,0.026572516,0.99437404,-0.102538645,2.1593244,0.098308004,0.9741921,-0.20318787,2.1436539,0.16464204,0.9444809,-0.28433916,2.130172,0.22197014,0.9106549,-0.3484783,2.115843,0.27196997,0.87581486,-0.39872375,2.0980241,0.31954446,0.84079605,-0.43698218,2.0722306,0.3695361,0.80480814,-0.46446413,2.0338087,0.42520988,0.7664909,-0.48134008,1.9800732,0.4875237,0.7231054,-0.4893254,1.9169751,0.5537037,0.6769396,-0.48493794,1.8448743,0.62547576,0.6342555,-0.45442277,1.7333604,0.6519249,0.6126415,-0.44683817,1.6373866,0.71208495,0.5726919,-0.40615103,1.4987893,0.7609526,0.54052556,-0.35886365,1.3516642,0.85864776,0.45781556,-0.2304978,1.1546369,0.8139618,0.5003195,-0.2952062,0.9880486,0.8705773,0.4806507,-0.10521484,0.7389811,0.82194763,0.56955004,0.003786091,0.4988886,0.55816364,0.80518526,0.20032124,0.27582464,-0.45494264,0.7950852,0.40108487,0.2112051,-0.9076997,0.33172202,0.25699043,0.3518594,-0.98273563,0.116042905,0.14409645,0.52749926,0.9973639,-0.0010303315,-0.07255584,5.5905776,0.9974142,0.06822868,-0.022581534,5.4302697,0.9910899,0.12927148,0.032103054,5.3020835,0.9788533,0.18655594,0.08392595,5.195628,0.95969415,0.24525017,0.13725603,5.102265,0.93121666,0.30822954,0.19449955,5.014326,0.87739664,0.39814377,0.26768687,4.935984,0.7983239,0.49898154,0.33718893,4.8559756,0.70980376,0.5885912,0.38696134,4.7681484,0.6191938,0.6647648,0.4179557,4.67224,0.52554625,0.73413146,0.42994446,4.5766296,0.43354324,0.7975476,0.4194739,4.489605,0.34279922,0.85685456,0.38508305,4.4128633,0.25031573,0.91191447,0.32519823,4.3426504,0.1594556,0.95755774,0.24011911,4.276,0.08667189,0.98666155,0.1377933,4.2129035,0.01696803,0.999241,0.035060763,4.1410794,-0.043647453,0.9963002,-0.07403248,4.070958,-0.08676882,0.98204213,-0.16752449,3.995598,-0.11121804,0.9632309,-0.24457498,3.916621,-0.12980072,0.9405493,-0.31387684,3.835888,-0.13396466,0.9201284,-0.36799094,3.7525277,-0.12938392,0.90284175,-0.4100447,3.6669073,-0.117598206,0.8887393,-0.44307226,3.5777097,-0.09975678,0.87759256,-0.4689134,3.4846833,-0.07712406,0.8690731,-0.48863456,3.3890731,-0.029942589,0.87769765,-0.47827852,3.2741458,0.007811047,0.8899041,-0.45608088,3.1468465,0.041639723,0.90517366,-0.42299753,3.019443,0.07057561,0.92398745,-0.3758538,2.8907468,0.08554243,0.94295365,-0.3217467,2.765713,0.09196992,0.9632658,-0.2523105,2.66499,0.07727725,0.9836183,-0.16285945,2.563821,0.025468968,0.99743855,-0.06684115,2.4720092,-0.048523087,0.9984895,0.025773885,2.3800807,-0.102831535,0.988073,0.11461913,2.268276,-0.15605035,0.9676558,0.1982189,2.1637595,-0.21422708,0.9393717,0.26774496,2.0646152,-0.27609986,0.9062149,0.3202243,1.9682006,-0.3406557,0.87033546,0.35562617,1.8715651,-0.4070291,0.8326815,0.37545815,1.773061,-0.45092732,0.8133035,0.3676982,1.6545194,-0.43312183,0.82157135,0.37071028,1.5316527,-0.4525824,0.82858056,0.3295808,1.3603368,-0.4621644,0.8438893,0.27249745,1.1760381,-0.44547662,0.8720933,0.20249549,0.98719627,-0.3821595,0.91545135,0.12610659,0.8032458,-0.25053114,0.96725506,0.040643703,0.6347219,-0.0068812044,0.9965199,-0.08306218,0.46436182,0.41331515,0.8889152,-0.19748452,0.358078,0.8150569,0.5317586,-0.23003396,0.34340513,0.97429854,0.14191942,-0.1749293,0.39845717,-0.98706186,0.12643868,0.09860165,5.8040338,-0.92668766,0.3733189,-0.043404423,5.789476,-0.7753504,0.60722923,-0.17350489,5.8253417,-0.5750245,0.7993729,-0.1742067,5.8340483,-0.28788564,0.9442049,-0.15999483,5.8161197,-0.029444851,0.9947914,-0.097581245,5.7582803,-0.22471632,0.97336066,-0.045507174,5.662434,-0.33013177,0.9376016,-0.109163634,5.5484266,-0.28811565,0.9454267,-0.15217373,5.454668,-0.26309353,0.95162183,-0.15873973,5.3589106,-0.16715918,0.9836349,-0.067231975,5.285951,-0.06146149,0.99735224,0.038879547,5.1955132,0.04748452,0.993823,0.100302264,5.0835586,0.14608528,0.9725837,0.1809429,4.948728,0.21358268,0.94439536,0.24999973,4.798493,0.25344187,0.9168542,0.3084566,4.6396956,0.27057895,0.8940846,0.3569309,4.4795833,0.26956514,0.87733525,0.39701042,4.322009,0.25520426,0.8665149,0.42897874,4.1697755,0.20605056,0.89089936,0.40477332,4.0552306,0.14226298,0.9150953,0.37730864,3.9208202};
			return value;
		}
		private double[] getSardine3OrientInterp_4_43_keyValue_2()
		{
			double[] value = {0.09075495,0.9380796,0.3343207,3.789725,0.105274394,0.92653793,0.36117145,3.6620655,0.029259263,0.9478919,0.31724563,3.5087337,-0.0022212393,0.9668845,0.2552048,3.3835464,0.02710175,0.9573185,0.28776163,3.2788372,-0.035573475,0.9732782,0.22685698,3.1354141,-0.049803708,0.98853505,0.14254092,3.0163884,-0.046438657,0.99728143,0.057210445,2.8990974,-0.031770043,0.9992284,-0.023095613,2.7813373,-0.007331183,0.9954886,-0.09459723,2.6633377,0.02279794,0.98757845,-0.1554637,2.546776,0.057333875,0.97701937,-0.20529471,2.4325154,0.096116476,0.96450704,-0.24594256,2.3166056,0.1372554,0.95107526,-0.27679753,2.2034378,0.18070847,0.93702835,-0.29886854,2.0920236,0.14758499,0.9487528,-0.27944005,1.9772816,0.13584566,0.9600728,-0.24455315,1.8443141,0.11873847,0.9708878,-0.20803423,1.7114521,0.094989374,0.98075676,-0.1705671,1.5806239,0.22052059,0.9622856,-0.15930168,1.4756633,0.29226378,0.9352149,-0.19988751,1.3963734,-0.20807563,0.8572621,0.47096315,2.4838848};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine4PosnInterp_4_50_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine4PosnInterp_4_50_keyValue_1()
		{
			double[] value = {5.267289,-7.428637,1.7656875,4.922397,-7.5821996,2.134564,4.4134035,-7.4647794,2.5280113,3.7401037,-7.0768695,2.933041,2.947132,-6.394127,3.3361871,2.1393127,-5.4389195,3.6825652,1.3238033,-4.2180176,3.9668088,0.50966084,-2.7407246,4.1789904,-0.2905448,-1.0243027,4.3050013,-1.0597034,0.89934874,4.3324947,-1.7808459,2.9521394,4.2632833,-2.4462466,4.8490705,4.112035,-3.017795,6.4959536,3.872491,-3.4979076,7.875237,3.5800924,-3.884473,8.984558,3.2530346,-4.178197,9.822196,2.9011235,-4.4135866,10.482995,2.493386,-4.5957694,10.942063,2.0165179,-4.723698,11.166802,1.4469323,-4.79354,11.136487,0.77180964,-4.797353,10.82294,-0.013291955,-4.759773,10.246007,-0.8924548,-4.676367,9.454426,-1.7598622,-4.5444503,8.419566,-2.6048813,-4.332288,7.143676,-3.4217958,-4.038928,5.6350956,-4.2015247,-3.6624925,3.9053693,-4.9320383,-3.234542,2.0301614,-5.585745,-2.7510927,0.28642583,-6.145046,-2.2072666,-1.2900115,-6.5905213,-1.6063907,-2.677022,-6.915148,-0.9677891,-3.8573942,-7.10923,-0.32306927,-4.8000555,-7.1816382,0.3055557,-5.455609,-7.1437373,0.9863582,-5.9120164,-7.0016212,1.7189726,-6.130547,-6.738433,2.5022113,-6.1467757,-6.3603106,3.326816,-5.941639,-5.86385,4.139292,-5.4719453,-5.271841,4.8668885,-4.7656355,-4.6294756,5.5022564,-3.834876,-3.940051,6.0366445,-2.6706805,-3.194357,6.459374,-1.2891449,-2.397234,6.789423,0.23228014,-1.5668247,7.0141687,1.6144384,-0.71025056,7.1196327,2.8269348,0.15805298,7.0964403,3.8343372,1.0172387,6.9482155,4.654713,1.8411944,6.683837,5.2729955,2.607525,6.3043246,5.673666,3.3302078,5.783492,5.8875394,4.0622406,5.1181703,5.8944435,4.791699,4.342686,5.6969304,5.478331,3.5150833,5.301038,6.064084,2.6536384,4.717231,6.537877,1.7698346,3.955274,6.8948655,0.87563026,3.0604815,7.131386,-0.019627512,2.29873,7.241501,-0.8944214,1.6705775,7.2226686,-1.7274988,1.1759024,7.076361,-2.5648236,0.51640654,6.7996283,-3.3217885,-0.003805101,6.4109325,-4.028982,-0.66723377,5.89586,-4.6254616,-1.1722043,5.2856154,-5.138681,-1.5471092,4.5471296,-5.5943685,-1.7878318,3.6727264,-5.9534683,-1.8675156,2.7035933,-6.192354,-1.7715042,1.6724323,-6.2945323,-1.492405,0.6215532,-6.257173,-1.0275393,-0.42836154,-6.0823445,-0.4136672,-1.4553317,-5.7772217,0.34525323,-2.4366946,-5.3536916,1.2406703,-3.3517404,-4.8231854,2.0044217,-4.185203,-4.2019463,2.6281915,-4.9190745,-3.5081944,3.0841494,-5.550984,-2.754482,3.3896596,-6.0829515,-1.9073136,3.8238955,-6.547805,-1.0558932,4.1052938,-6.8981857,-0.13690478,4.5194607,-7.1705,0.75931966,4.7888784,-7.339064,1.7031388,5.1945114,-7.425329,2.6066282,5.4568167,-7.418936,3.5413146,5.8564916,-7.3260565,4.418547,6.119728,-7.154882,5.3068066,6.521474,-6.8975873,6.1298995,6.791067,-6.574414,6.981747,7.1948543,-6.1694617,7.777561,7.4510336,-5.721785,8.575286,7.7062616,-5.2035656,9.333735,8.094626,-4.627015,9.995754,8.339895,-4.0297155,10.614807,8.413777,-3.378098,11.20817,8.28669,-2.6695912,11.739021,7.889856,-1.9175477,12.162134,7.269759,-1.1787755,12.452637,6.4603257,-0.49581176,12.610289,5.4815106,0.12264365,12.637356,4.346849,0.674908,12.535745,3.0687044,1.1613401};
			return value;
		}
		private double[] getSardine4PosnInterp_4_50_keyValue_2()
		{
			double[] value = {12.305139,1.660421,1.5808856,11.9443245,0.40852022,1.9454734,11.455423,-0.6754235,2.2500596,10.841586,-1.6160002,2.4922457,10.108042,-2.4076576,2.6746652,9.262163,-3.0478892,2.8003664,8.309731,-3.5223334,2.8615355,7.2556973,-3.8305573,2.8658607,6.1043553,-3.9717658,2.822562,4.86048,-3.9431987,2.7418044,3.567851,-3.7373893,2.636603,2.2417078,-3.3459086,2.518061,0.9091314,-2.7572489,2.3935523,-0.38793337,-1.9620364,2.2598886,-1.5965791,-0.99878573,2.103931,-2.737114,0.116737604,1.9662564,-3.7431078,1.3715641,1.8058836,-4.5694914,2.4456098,1.6334615,-5.2103815,3.3450963,1.4654561,-5.663844,4.0590577,1.2998563,-6.0303144,4.9308844,1.1061119,5.267289,-7.428637,1.7656875};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine4OrientInterp_4_51_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine4OrientInterp_4_51_keyValue_1()
		{
			double[] value = {-0.12826966,0.92183363,0.36574528,2.649163,-0.10488254,0.98614264,0.12853904,2.3853197,-4.4725795E-4,0.9937506,-0.11162257,2.2418942,0.10374595,0.96574324,-0.23785855,2.1530492,0.18884249,0.9291344,-0.3178801,2.108692,0.2622317,0.88481575,-0.3851437,2.080009,0.31941074,0.84333044,-0.4321697,2.052609,0.3726,0.8043694,-0.4627733,2.0167768,0.42825937,0.7656452,-0.4799807,1.9666667,0.48905978,0.72493327,-0.48506936,1.9018523,0.5494424,0.684688,-0.47886893,1.8299819,0.59930617,0.6581645,-0.45568797,1.7389702,0.6684603,0.6162861,-0.41635582,1.6158351,0.7156639,0.58296496,-0.38467774,1.5140332,0.76920813,0.5412609,-0.33963996,1.397142,0.8246081,0.49117592,-0.28065586,1.2508059,0.87578094,0.43709055,-0.20484014,1.0692922,0.90434897,0.41116384,-0.114443526,0.808557,0.87346804,0.4839719,0.05315261,0.4267983,-0.30497283,0.7797969,0.54673654,0.1341506,-0.9848176,0.04425741,0.16784634,0.38552764,0.99687105,0.045554843,-0.06460062,5.7002187,0.9950754,0.09715773,-0.01964453,5.540562,0.9905556,0.13570066,0.019618526,5.393014,0.9745247,0.20838556,0.0829311,5.2719064,0.9523168,0.27184355,0.1385406,5.169927,0.92306966,0.3328639,0.1927275,5.0780897,0.8949916,0.3781302,0.23665875,4.997799,0.8359743,0.46037573,0.29866576,4.940655,0.76366717,0.5448231,0.34638137,4.869974,0.6732359,0.6310453,0.3854028,4.7846074,0.57421464,0.7107131,0.40640423,4.6859894,0.4713493,0.78328675,0.4053292,4.591217,0.34803766,0.86293435,0.36635193,4.5077877,0.22436437,0.9332635,0.2804994,4.438134,0.088862695,0.98610955,0.14032665,4.3525395,0.0042861197,0.9999376,0.010313068,4.2625365,-0.058692865,0.99275374,-0.10485771,4.164147,-0.11626295,0.97026193,-0.21230836,4.0614643,-0.15199587,0.94148153,-0.3008485,3.9537852,-0.1598259,0.91409796,-0.37266695,3.83777,-0.15013428,0.8905694,-0.42935506,3.709914,-0.12847231,0.87293637,-0.47061327,3.5810196,-0.10246643,0.8637446,-0.49340215,3.4782598,-0.0513182,0.8757951,-0.47994727,3.3551495,-0.016181562,0.88991576,-0.45583785,3.2375464,0.019260997,0.90792096,-0.41869855,3.1045356,0.0443307,0.92517334,-0.37694708,2.9681869,0.06691319,0.94587255,-0.31756517,2.818058,0.0712289,0.9724023,-0.22217113,2.6636708,0.037769135,0.9924918,-0.116333894,2.527424,-0.013937005,0.9998584,-0.009422243,2.4023478,-0.08320163,0.9936559,0.07566514,2.2925305,-0.13424066,0.9771649,0.16470619,2.1907957,-0.19074903,0.9513825,0.24183911,2.0969675,-0.25157827,0.9191633,0.3030627,2.007842,-0.30750698,0.88826084,0.3412215,1.9174786,-0.27576852,0.899289,0.33945698,1.8086879,-0.28333074,0.9090976,0.30539396,1.6544704,-0.2843226,0.9219562,0.2629779,1.4845772,-0.42920253,0.8659397,0.25677574,1.3710164,-0.4069263,0.8797575,0.24584071,1.2127192,-0.5453767,0.8002946,0.24918428,1.1219103,-0.5711622,0.80303925,0.1700049,0.92228955,-0.5475877,0.8275299,0.123865776,0.7164,-0.449908,0.8905865,0.06663153,0.5337947,-0.23168458,0.96870524,-0.08905988,0.36421722,0.32328558,0.90037817,-0.29120648,0.25582024,0.87379915,0.36701593,-0.31902373,0.29092777,-0.9816872,0.03922796,0.18640976,5.8575993,-0.9645415,0.2574628,0.058070276,5.7261276,-0.92351305,0.38249356,-0.02868884,5.5880537,-0.8788339,0.46577355,-0.10346797,5.45347,-0.73611695,0.6364981,-0.23022206,5.418417,-0.60557586,0.7597011,-0.2369223,5.379753,-0.45272598,0.8690033,-0.19968165,5.342582,-0.31335276,0.9423304,-0.117574535,5.284082,-0.33950987,0.92138267,-0.18917595,5.143584,-0.24657452,0.9639378,-0.10012442,5.077979,-0.25856194,0.945203,-0.19934084,4.944686,-0.20019975,0.97399575,-0.10607646,4.8810925,-0.20960788,0.9568119,-0.20143291,4.75733,-0.16722795,0.9795638,-0.111755654,4.6928587,-0.17234823,0.9642283,-0.2013947,4.5748467,-0.14311191,0.98232776,-0.12062838,4.509812,-0.14676262,0.9678582,-0.20423278,4.3973866,-0.12527256,0.98358274,-0.12989222,4.3304224,-0.1217124,0.97183913,-0.20177871,4.2412686,-0.10272717,0.9871274,-0.122584015,4.1951094,-0.058674127,0.988864,-0.13676754,4.1237283,-0.09884619,0.9768694,-0.18962027,4.045437,-0.0914151,0.98861116,-0.11954633,3.9785094,-0.044836592,0.998555,-0.029624052,3.9027092,0.018389145,0.99733704,0.07057413,3.8361862,0.08669703,0.9770131,0.19475377,3.7523255,0.0989294,0.9473726,0.30446362,3.6464236,0.095606945,0.9120119,0.3988652,3.5213535,0.07267753,0.8774154,0.47419432,3.3749628,0.025006069,0.8477722,0.52977073,3.198145,-0.047295406,0.8241354,0.56441474,2.9866734};
			return value;
		}
		private double[] getSardine4OrientInterp_4_51_keyValue_2()
		{
			double[] value = {-0.13760048,0.8046498,0.5775854,2.748878,-0.22865887,0.8089371,0.541605,2.492192,-0.28069144,0.8234817,0.49304166,2.2770534,-0.3037763,0.84608877,0.4380111,2.0923471,-0.29914203,0.8784037,0.3727209,1.9335817,-0.26859647,0.91519505,0.30045602,1.8014113,-0.21468444,0.9517579,0.21924247,1.6818085,-0.14513779,0.9801234,0.13525282,1.5934442,-0.06851736,0.99611723,0.05527905,1.5364388,0.006654468,0.9998266,-0.017395865,1.5062639,0.07745321,0.99324965,-0.08634755,1.4975262,0.14472432,0.97797036,-0.15042865,1.5065092,0.20944586,0.95467734,-0.21148016,1.528458,0.27618626,0.9225805,-0.26938125,1.5546753,0.34219134,0.8854721,-0.314395,1.5690712,0.37706143,0.85445076,-0.35740536,1.6186924,0.4428011,0.8073959,-0.38992184,1.6331215,0.4759642,0.79174316,-0.38288516,1.594686,0.5030876,0.77083033,-0.3907987,1.5735548,0.554811,0.73412937,-0.39145735,1.5248345,0.65310884,0.63697976,-0.40951875,1.5311474,-0.12826966,0.92183363,0.36574528,2.649163};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine5PosnInterp_4_58_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine5PosnInterp_4_58_keyValue_1()
		{
			double[] value = {7.0834765,-4.3679824,-4.0738344,6.96879,-5.278329,-4.2520494,6.7657175,-6.3183613,-4.354713,6.4971156,-7.0949664,-4.3634863,6.1336174,-7.711126,-4.286273,5.6675305,-8.145577,-4.117928,5.090565,-8.371228,-3.8526113,4.398939,-8.354268,-3.4865878,3.5976043,-8.060631,-3.0212946,2.7264514,-7.473141,-2.479179,1.8630472,-6.6229835,-1.9089901,1.010622,-5.512022,-1.3153399,0.17451245,-4.14048,-0.7031152,-0.63472617,-2.5075788,-0.07948583,-1.406259,-0.6765003,0.53830457,-2.1190376,1.3317578,1.1340705,-2.7781756,3.4838777,1.6999044,-3.3564417,5.4752884,2.2051528,-3.861257,7.268509,2.6218395,-4.285666,8.841951,2.9198456,-4.6250224,10.139548,3.120755,-4.880732,11.126574,3.2221377,-5.0621257,11.833444,3.2349033,-5.1905622,12.340501,3.1648502,-5.265227,12.643565,3.004329,-5.2834673,12.754892,2.7471364,-5.2349095,12.640676,2.366289,-5.106427,12.253429,1.8624246,-4.891518,11.56893,1.251294,-4.5874653,10.578922,0.5503919,-4.2202187,9.37177,-0.15985197,-3.7875693,7.9485435,-0.8747116,-3.2863588,6.31108,-1.5868282,-2.712178,4.4633207,-2.28489,-2.059188,2.4147553,-2.9508305,-1.3218846,0.19053936,-3.5564127,-0.5030884,-1.9018564,-4.0748124,0.3581118,-3.7488313,-4.492127,1.2452903,-5.3491554,-4.819831,2.1299877,-6.620901,-5.0496583,2.9850163,-7.549903,-5.184449,3.7874527,-8.167379,-5.2284036,4.5556645,-8.505744,-5.1896963,5.3456154,-8.595513,-5.068351,6.1495714,-8.417829,-4.859774,6.952826,-7.976495,-4.572507,7.7542644,-7.250916,-4.1985106,8.463114,-6.304102,-3.7724001,9.076362,-5.1543207,-3.296669,9.586962,-3.8165197,-2.7738311,9.98695,-2.308004,-2.20674,10.268269,-0.6146312,-1.5989925,10.424342,1.2379377,-0.9548925,10.451808,3.2194228,-0.27995616,10.348682,4.989667,0.40457904,10.1215105,6.5207357,1.0873079,9.780803,7.7905617,1.75597,9.339175,8.783951,2.3981977,8.811119,9.525698,3.001553,8.212038,10.011187,3.554751,7.4868784,10.299397,4.1135983,6.645281,10.368837,4.662934,5.7317863,10.201596,5.16597,4.796292,9.806682,5.5946474,3.8502772,9.195127,5.940387,2.8983464,8.376292,6.197296,1.9445782,7.359291,6.358156,0.9936446,6.154058,6.4136243,0.05138105,4.7734337,6.3519335,-0.8739201,3.2356777,6.158948,-1.7693942,1.5678833,5.819679,-2.616458,-0.10022712,5.323492,-3.3918486,-1.5959015,4.673823,-4.0696554,-2.821309,3.9008179,-4.6331363,-3.7842212,3.03315,-5.070062,-4.4318204,2.1018653,-5.3735046,-4.7958503,1.1387863,-5.5439506,-4.8482265,0.17105848,-5.5958652,-4.60784,-0.85413474,-5.5183525,-4.121873,-1.848825,-5.314214,-3.4094305,-2.7902532,-4.986699,-2.488436,-3.666068,-4.5399055,-1.377844,-4.4644713,-3.9794753,-0.099131584,-5.1745515,-3.3136306,1.3236569,-5.787972,-2.5511441,2.583681,-6.3196473,-1.7080047,3.6660357,-6.764746,-0.8003573,4.582555,-7.108606,0.15654266,5.3262277,-7.3512583,1.1484679,5.8919983,-7.493786,2.1619558,6.2769165,-7.5378785,3.1842232,6.515317,-7.485755,4.2149587,6.608673,-7.3397503,5.2489142,6.555695,-7.1013455,6.2232594,6.3207865,-6.7734456,7.1353846,5.905553,-6.3592134,8.004553,5.3166637,-5.8667917,8.821667,4.5596166,-5.3015294,9.577732,3.6424894,-4.6679516,10.262387,2.573415,-3.9712577};
			return value;
		}
		private double[] getSardine5PosnInterp_4_58_keyValue_2()
		{
			double[] value = {10.864509,1.3636748,-3.21617,11.371055,0.02596283,-2.4092457,11.76785,-1.1710169,-1.5571907,12.039131,-2.210165,-0.6756939,12.175959,-3.079206,0.21372473,12.176267,-3.7683918,1.0893557,12.043408,-4.2716823,1.9311978,11.774845,-4.624482,2.7838612,11.361069,-4.8281693,3.660753,10.810325,-4.863336,4.5226765,10.141493,-4.7214265,5.328603,9.381061,-4.4067025,6.0415163,8.540823,-3.927032,6.65081,7.6281843,-3.2898884,7.1515393,6.6141796,-2.5042286,7.5392046,5.507169,-1.5763472,7.8093104,4.3167486,-0.5137472,7.956554,3.0532804,0.42072105,7.9752264,1.7349938,1.5054376,7.8602157,0.37820303,2.7245057,7.608708,-0.9610275,3.8110888,7.222607,7.0834765,-4.3679824,-4.0738344};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine5OrientInterp_4_59_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine5OrientInterp_4_59_keyValue_1()
		{
			double[] value = {-0.9972891,0.06157698,0.040284857,1.3319736,-0.9160722,0.3182034,0.2440455,1.4309281,-0.7318479,0.5342267,0.42308462,1.6715391,-0.5420096,0.68986785,0.47990415,1.8601686,-0.401815,0.8039547,0.43840814,1.9506375,-0.27936414,0.90589076,0.31830397,1.9790212,-0.15268907,0.97813565,0.14119679,2.0064778,-0.037126515,0.9986217,-0.037097692,2.0597126,0.054744683,0.9838407,-0.17047113,2.121087,0.12867579,0.95674103,-0.26093897,2.171318,0.17932874,0.92630696,-0.33135578,2.2163427,0.21161649,0.8977482,-0.38635042,2.2578418,0.23140848,0.87250715,-0.43032712,2.2974274,0.24347383,0.85002863,-0.46708864,2.3366704,0.24823819,0.8330911,-0.49430457,2.3691952,0.2528658,0.81621414,-0.51947415,2.40141,0.25703877,0.80198246,-0.5392171,2.4244788,0.24852455,0.7986467,-0.54808664,2.4461281,0.26577252,0.7904797,-0.55182135,2.421399,0.30270752,0.7734682,-0.55687994,2.3606575,0.32991013,0.759328,-0.56087464,2.311886,0.3977653,0.7328277,-0.55203825,2.1903093,0.509073,0.6821295,-0.52492297,1.9872159,0.72113913,0.55587727,-0.4134717,1.616911,0.9217745,0.34195074,-0.18276031,1.1167619,0.9873385,0.15707411,0.02211101,0.41345918,0.92057043,0.3905502,-0.0047373665,5.968156,0.9330295,0.3461669,0.09810439,5.5990934,0.921242,0.3602566,0.14672501,5.4078193,0.90771806,0.37887213,0.1802887,5.2896347,0.8970081,0.39460188,0.19916181,5.2010865,0.87946564,0.41753703,0.22847985,5.126007,0.8599049,0.441713,0.25583827,5.0601826,0.8371686,0.46814558,0.28282234,4.9981875,0.8092275,0.49848732,0.31090394,4.9347267,0.77297884,0.53475374,0.3413831,4.8642817,0.70737666,0.59831846,0.3763426,4.809445,0.64573574,0.6547607,0.39282808,4.767166,0.58519936,0.706026,0.39883438,4.7328677,0.5113084,0.76570827,0.390198,4.705891,0.42287996,0.8309305,0.361562,4.6841173,0.3185798,0.8966664,0.3074024,4.6558976,0.18128037,0.96046644,0.21128596,4.6173034,0.035074495,0.9971513,0.06677525,4.555712,-0.092853256,0.9910518,-0.095888734,4.452341,-0.1733725,0.95826024,-0.2273305,4.333506,-0.21495943,0.9204383,-0.32647476,4.205755,-0.23710507,0.88598907,-0.39850274,4.079206,-0.23174596,0.8600582,-0.4545258,3.94727,-0.21032527,0.8415851,-0.49749136,3.8101995,-0.17501977,0.82952845,-0.5303307,3.6643078,-0.13052994,0.8203121,-0.55682135,3.509437,-0.07580469,0.8154188,-0.57388663,3.345883,-0.018644772,0.8131154,-0.58180386,3.18441,0.050439026,0.82499444,-0.5628855,3.006906,0.09627382,0.8406964,-0.5328799,2.8584766,0.12976554,0.86201143,-0.48999715,2.7201946,0.14729017,0.8905924,-0.4302915,2.5894878,0.1422958,0.9223609,-0.35916883,2.469153,0.10821451,0.9577739,-0.26638046,2.3515565,0.04935624,0.98532003,-0.16342677,2.2467833,-0.01014982,0.9986959,-0.05003466,2.1521697,-0.07852762,0.99506086,0.06072375,2.0734456,-0.1493474,0.9756834,0.16042839,2.0104392,-0.21672168,0.9450684,0.2446986,1.956047,-0.28139812,0.90836596,0.3093319,1.9044216,-0.34442,0.8691012,0.35501826,1.8497561,-0.40755966,0.82856166,0.3839019,1.7876977,-0.47266585,0.7864719,0.3975536,1.7152098,-0.54126036,0.7414477,0.39660102,1.6306117,-0.61377305,0.69143224,0.38105646,1.5342779,-0.6843344,0.6434608,0.34299368,1.4129357,-0.74916124,0.60197914,0.27636653,1.2589059,-0.788829,0.5777448,0.20966494,1.0933621,-0.8244238,0.55236036,0.12338244,0.9173325,-0.82885116,0.5594702,5.831891E-4,0.697986,-0.7811437,0.6075619,-0.14382094,0.46218452,-0.29033783,0.76676464,-0.57251364,0.2223925,0.85646623,0.24024418,-0.45688897,0.2648392,-0.97450423,0.10899651,0.1961095,5.81449,-0.9648338,0.2575976,0.052339815,5.6153345,-0.93288743,0.3563951,-0.051995184,5.4417677,-0.88864577,0.4372515,-0.13827454,5.290194,-0.83453697,0.5082185,-0.21274716,5.1540294,-0.7737978,0.5701913,-0.2758964,5.028974,-0.66745424,0.6702256,-0.3245027,4.9773,-0.5828402,0.747543,-0.318554,4.944978,-0.49788013,0.81465787,-0.29740193,4.899018,-0.40728584,0.8747481,-0.2625527,4.849645,-0.31337997,0.9258401,-0.21121791,4.795423,-0.21821071,0.9651533,-0.14444004,4.7325864,-0.13826096,0.9867311,-0.08512053,4.6551027,-0.06887154,0.99745256,-0.018577708,4.5718427,-0.009792437,0.9987772,0.04846075,4.4831023,0.046661876,0.98970705,0.1352869,4.370377,0.09475372,0.97270083,0.21183674,4.2490773,0.13302225,0.95364136,0.2699507,4.1459646,0.15666781,0.9345812,0.31939498,4.0467825,0.16655959,0.91746336,0.3612741,3.949359,0.16418104,0.9027639,0.39757007,3.850371};
			return value;
		}
		private double[] getSardine5OrientInterp_4_59_keyValue_2()
		{
			double[] value = {0.15161163,0.89082956,0.42829502,3.7474384,0.13122687,0.88120645,0.45415294,3.6389258,0.06437686,0.89535004,0.4406856,3.5018694,0.02704437,0.91020584,0.413272,3.3826346,-0.0062826686,0.92638475,0.37652594,3.2548091,-0.034007568,0.9443854,0.32707736,3.11833,-0.052904427,0.96388316,0.261018,2.9730859,-0.060720358,0.9814375,0.18191569,2.8298697,-0.05589953,0.9938104,0.09600016,2.6965425,-0.032606576,0.99942666,0.009116766,2.5723703,0.0044272905,0.9972203,-0.07437923,2.4533422,0.052463982,0.9872464,-0.15030709,2.3364377,0.1043642,0.97087204,-0.21567483,2.2239184,0.16128415,0.9503122,-0.26625976,2.1151657,0.21345668,0.93044764,-0.2978311,1.9985044,0.26938817,0.9103533,-0.3141448,1.8895968,0.31893617,0.89070016,-0.32393357,1.7925006,0.26127747,0.9084608,-0.32624054,1.703593,0.3657302,0.88195425,-0.29731795,1.5940342,0.41356754,0.8579032,-0.30490014,1.5226749,0.363028,0.8703531,-0.3327107,1.4493067,-0.9972891,0.06157698,0.040284857,1.3319736};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine6PosnInterp_4_66_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine6PosnInterp_4_66_keyValue_1()
		{
			double[] value = {5.557633,-6.9195433,-3.4846835,5.4148602,-8.053435,-3.295813,5.1916375,-8.906258,-3.0300956,4.8666863,-9.582217,-2.6671472,4.432861,-10.061567,-2.2056894,3.883089,-10.319562,-1.6443908,3.2141857,-10.326159,-0.9854084,2.4308434,-10.051242,-0.23825568,1.6291398,-9.5008335,0.5006066,0.8158532,-8.681585,1.2226629,-0.0022061467,-7.5992928,1.9191589,-0.8167704,-6.259864,2.5795867,-1.6167268,-4.6715026,3.190307,-2.3870823,-2.8488812,3.7337346,-3.1101391,-0.8194082,4.190728,-3.7717214,1.37591,4.54821,-4.3667026,3.5694387,4.802106,-4.8600287,5.5999327,4.94401,-5.251226,7.430396,4.968654,-5.5426235,9.023967,4.8795557,-5.7741942,10.355878,4.6970267,-5.9498158,11.411181,4.435569,-6.0723343,12.181601,4.1095114,-6.1619873,12.812656,3.6855466,-6.2175794,13.292647,3.1566079,-6.235405,13.60186,2.5131354,-6.209968,13.713751,1.7521687,-6.1363287,13.603995,0.87829757,-6.0102773,13.229586,-0.11042583,-5.8429384,12.618211,-1.083173,-5.634086,11.779915,-2.0343738,-5.3825436,10.7229805,-2.95856,-5.0862355,9.454865,-3.8490372,-4.742221,7.9834356,-4.6970506,-4.346727,6.318488,-5.4911494,-3.8953216,4.473817,-6.2168264,-3.3475595,2.492784,-6.843574,-2.736261,0.65564764,-7.3532205,-2.0648115,-1.0016092,-7.7294765,-1.3432078,-2.4415238,-7.963168,-0.58732474,-3.6316538,-8.05256,0.18337029,-4.5468893,-8.001775,0.9474179,-5.170717,-7.819425,1.7280202,-5.555577,-7.5193563,2.5658827,-5.7180934,-7.084591,3.4292774,-5.631438,-6.5208607,4.2356634,-5.321993,-5.871081,4.9502387,-4.80292,-5.15963,5.56327,-4.0865874,-4.3940296,6.0652547,-3.1865594,-3.58068,6.44608,-2.118425,-2.725825,6.694468,-0.9000354,-1.838805,6.800471,0.31937063,-0.92808175,6.757141,1.3891727,-0.0068341494,6.5629263,2.286048,0.9076209,6.2222586,3.0120487,1.8091202,5.7401443,3.5242815,2.6675365,5.1305327,3.8131223,3.4639254,4.3992653,3.8795385,4.1957474,3.5565026,3.722704,4.852909,2.63788,3.3464506,5.405306,1.6968286,2.7571821,5.8424797,0.7468949,1.970099,6.1552052,-0.199256,1.0039562,6.3351226,-1.1292613,-0.11789191,6.374724,-2.0297794,-1.3675703,6.268431,-2.8865006,-2.4609003,6.014263,-3.6787066,-3.3689713,5.617981,-4.3861966,-4.0344043,5.0938573,-5.025366,-4.458859,4.4751935,-5.63076,-4.674152,3.735124,-6.191812,-4.6352396,2.8805375,-6.6340585,-4.389188,1.9446577,-6.931455,-3.9120471,0.97721726,-7.0813723,-3.1949902,0.004479587,-7.116384,-2.2539992,-0.9621752,-7.0327773,-1.1062843,-1.9109044,-6.828296,0.2275281,-2.8294485,-6.5042205,1.7239089,-3.7056482,-6.0318937,3.0834727,-4.5431485,-5.4234633,4.289078,-5.328684,-4.6934495,5.3279314,-6.0510745,-3.8581383,6.193258,-6.7007127,-2.9336872,6.8812637,-7.2701764,-1.9369143,7.3936,-7.753555,-0.8840382,7.7345037,-8.146359,0.20961905,7.875288,-8.445444,1.3294327,7.8262305,-8.648628,2.46249,7.621129,-8.742353,3.5972366,7.2698493,-8.727107,4.7232475,6.7813845,-8.603981,5.8305116,6.4308057,-8.386222,6.9060388,6.2107663,-8.076487,7.93815,5.824618,-7.6784863,8.917926,5.275655,-7.195411,9.834879,4.5866404,-6.619703,10.67859,3.7594664,-5.957219,11.438337,2.8000095,-5.2146735,12.102365,1.9687524,-4.3992133,12.655908,1.2655587,-3.525574};
			return value;
		}
		private double[] getSardine6PosnInterp_4_66_keyValue_2()
		{
			double[] value = {13.086208,0.6901237,-2.6118376,13.385511,0.113391936,-1.6796279,13.551006,-0.33484071,-0.7468299,13.54642,-0.935882,0.1671719,13.375391,-1.6702347,1.0393615,13.043469,-2.2736547,1.8621389,12.561663,-2.720872,2.6360574,11.917211,-3.033778,3.3863146,11.125985,-3.2010114,4.087023,10.247996,-3.1797562,4.7148447,9.289735,-2.9749334,5.263139,8.256323,-2.5925214,5.725649,7.1524725,-2.0389216,6.0959926,5.9483128,-1.321299,6.3672447,4.6510305,-0.46952093,6.5191426,3.2711868,0.38318455,6.5434227,1.8259488,1.10715,6.4319425,0.33956409,1.7015237,6.1789646,-1.1600697,2.165666,5.7831364,-2.6416812,2.466561,5.2489004,-4.0374455,2.63406,4.5997357,5.557633,-6.9195433,-3.4846835};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine6OrientInterp_4_67_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine6OrientInterp_4_67_keyValue_1()
		{
			double[] value = {-0.19374241,0.7217007,0.664539,2.7338517,-0.2334417,0.7559895,0.61154294,2.6018972,-0.23209523,0.8099917,0.5385585,2.5235908,-0.20791554,0.87469465,0.43781322,2.4591436,-0.16764988,0.93893445,0.3004922,2.4007185,-0.111519076,0.984034,0.13870999,2.3626847,-0.049021408,0.9986631,-0.01639759,2.3493419,0.015805759,0.9901123,-0.13938351,2.3490336,0.09832767,0.96784097,-0.23155014,2.3404722,0.15718159,0.93843645,-0.30762148,2.3326278,0.19617175,0.9080272,-0.37013954,2.329485,0.22561246,0.87874883,-0.42059416,2.327588,0.25180078,0.8506424,-0.46152344,2.3231323,0.27874368,0.8228885,-0.49513286,2.3125968,0.3091877,0.7946782,-0.52238816,2.2925262,0.34444162,0.76597065,-0.5428158,2.2602782,0.38242128,0.7418185,-0.55087143,2.2081304,0.4340589,0.7125563,-0.5512317,2.133901,0.524835,0.6639999,-0.5325902,1.9980229,0.6702186,0.57456684,-0.46976587,1.7851368,0.8077571,0.46355304,-0.36420763,1.5694634,0.905723,0.3458048,-0.24512216,1.3810005,0.9600667,0.24443808,-0.13609578,1.1874297,0.9836123,0.17087409,-0.057523496,0.9856193,0.99397624,0.10812453,0.017912496,0.7403623,0.9927124,0.030591,0.11656149,0.45173714,-0.89114374,0.23254323,-0.38958505,6.1206565,0.8003599,0.5081901,-0.31806603,6.124837,0.94958377,0.30476025,-0.07356675,5.902009,0.9660702,0.25721917,-0.023389472,5.705509,0.966474,0.2544561,0.03433286,5.5453787,0.96126574,0.26491794,0.0760721,5.41457,0.9525109,0.28319833,0.11190098,5.305475,0.9400402,0.30794078,0.14661917,5.2109623,0.9226146,0.33940673,0.18326354,5.124782,0.89803797,0.3785686,0.22408397,5.041231,0.8452038,0.45236388,0.28460032,4.94369,0.7722408,0.53514904,0.3424324,4.8685536,0.6901925,0.61438024,0.38232356,4.782414,0.59410506,0.693018,0.408369,4.6845737,0.4898228,0.76861477,0.4114668,4.584402,0.37876546,0.842232,0.38364327,4.4882083,0.2562912,0.91362476,0.3156019,4.394542,0.14301208,0.96647155,0.21326137,4.3127036,0.052081496,0.99503714,0.08478588,4.229396,-0.024003679,0.9988632,-0.04118387,4.1331205,-0.07710963,0.9870645,-0.14056312,4.0263844,-0.1095422,0.96710366,-0.22958869,3.911653,-0.120775126,0.9448506,-0.30441853,3.790266,-0.11685117,0.92418796,-0.363624,3.6646504,-0.10063266,0.90697193,-0.40899268,3.5346034,-0.075247034,0.89332926,-0.44305843,3.3998954,-0.029865846,0.8943686,-0.44633272,3.2492096,0.019068778,0.9090063,-0.4163458,3.0903664,0.050555713,0.9269565,-0.3717469,2.938336,0.06978496,0.94661343,-0.31472677,2.7912078,0.07993018,0.969265,-0.2326725,2.6361907,0.06324435,0.988923,-0.13428043,2.4905038,0.009121966,0.9993884,-0.033760086,2.357272,-0.0806129,0.99545217,0.050758995,2.2300885,-0.13521294,0.98017013,0.14485796,2.1154306,-0.19871986,0.95277077,0.22964787,2.029105,-0.26666594,0.9173271,0.29563585,1.9444607,-0.33728674,0.87704605,0.34209335,1.8565754,-0.4106704,0.83357376,0.3694652,1.7614945,-0.48695257,0.7869176,0.37899595,1.6582487,-0.47398418,0.7878548,0.3932223,1.5407779,-0.5169864,0.783085,0.34569237,1.3499397,-0.5385601,0.8008063,0.26203486,1.11944,-0.48061532,0.8621857,0.16014057,0.90473783,-0.30836973,0.94846386,0.072964504,0.7169694,0.045343164,0.99584234,-0.07901715,0.58392394,0.43516433,0.88036054,-0.18867868,0.5049834,0.7845047,0.5679963,-0.24886408,0.54397696,0.9445408,0.2641425,-0.1951189,0.65859944,0.9902682,0.08245702,-0.112113416,0.7774532,-0.99779695,0.055486385,0.036373924,5.4012313,-0.98444676,0.17144531,-0.0383505,5.3092704,-0.9559233,0.27225718,-0.10993733,5.2250953,-0.86893487,0.43992585,-0.22675465,5.2084875,-0.78039443,0.56560516,-0.26659906,5.1957636,-0.6798405,0.6774185,-0.28092906,5.180498,-0.5738713,0.77452016,-0.26606357,5.1627245,-0.4654609,0.8567071,-0.22225983,5.139322,-0.35284248,0.9213341,-0.16323443,5.1016507,-0.23830788,0.9659948,-0.100319855,5.046285,-0.11522059,0.99320483,-0.016380537,4.977045,-0.007914252,0.99805826,0.061780583,4.888514,0.063444346,0.99029976,0.12361659,4.7793074,0.11460106,0.97746336,0.17729083,4.6666703,0.14875996,0.9633155,0.22336882,4.55416,0.12941922,0.98116654,0.14339715,4.50169,0.07836427,0.9926259,0.092480585,4.4259806,0.08494192,0.9790598,0.1850046,4.3148293,0.11835536,0.9630388,0.24196737,4.209576,0.13881752,0.9489506,0.2832358,4.0998526,0.15093645,0.93518984,0.32037193,3.9923997,0.15047593,0.9228029,0.35467124,3.8833878,0.090194955,0.93825537,0.33397877,3.7678075,0.056271557,0.9521169,0.30051112,3.6629107};
			return value;
		}
		private double[] getSardine6OrientInterp_4_67_keyValue_2()
		{
			double[] value = {0.025332002,0.9646999,0.26213065,3.5497582,0.028247152,0.96392596,0.2646677,3.4341867,-0.015543897,0.97494286,0.22191162,3.297151,0.009996142,0.9579475,0.2867694,3.1432014,-0.022150772,0.9404666,0.33916363,2.9671197,-0.07418136,0.95394766,0.29065618,2.7648394,-0.082450256,0.9718511,0.22069727,2.5913274,-0.074612275,0.9864995,0.14577933,2.4351168,-0.047595263,0.9962091,0.072816916,2.2964988,-0.0037534547,0.99988955,-0.01437774,2.1918273,0.04811903,0.9943819,-0.09428227,2.0962946,0.10464049,0.9813634,-0.16117166,2.0086746,0.16207823,0.9633907,-0.21356256,1.927061,0.21473636,0.94494236,-0.24692573,1.8413328,0.2638363,0.9282895,-0.262048,1.7500815,0.23192431,0.9294375,-0.28697914,1.677055,0.20560224,0.94448996,-0.2562547,1.5674388,0.17995903,0.95853126,-0.22098121,1.4577886,0.14865689,0.9711861,-0.18627523,1.3517088,0.095138095,0.9848021,-0.14530426,1.2463415,0.048136942,0.9927435,-0.11019645,1.1460361,-0.19374241,0.7217007,0.664539,2.7338517};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine7PosnInterp_4_74_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine7PosnInterp_4_74_keyValue_1()
		{
			double[] value = {6.204567,-4.666419,-1.0014626,5.9647837,-5.464005,-0.71440613,5.5732484,-6.1229105,-0.35821903,5.021298,-6.6067076,0.06899992,4.3055897,-6.8769503,0.5638639,3.4298067,-6.8958087,1.1173284,2.4888558,-6.6278396,1.6622418,1.5209926,-6.077506,2.172292,0.5403265,-5.2515635,2.6355252,-0.43841487,-4.1935697,3.0391588,-1.3967443,-2.9155903,3.3688002,-2.312314,-1.4389551,3.6104708,-3.1623785,0.20308733,3.7559936,-3.9308898,1.8470695,3.8072968,-4.608012,3.3375669,3.7714028,-5.1852655,4.688,3.656359,-5.6553087,5.87833,3.4639726,-6.0133133,6.8860407,3.195056,-6.2599497,7.652745,2.853559,-6.4367723,8.417607,2.416361,-6.54403,9.012966,1.8705621,-6.578755,9.440238,1.2197801,-6.5361466,9.674456,0.4593268,-6.413624,9.678118,-0.40792733,-6.2088065,9.426249,-1.3703504,-5.93576,8.918612,-2.3365495,-5.607747,8.155927,-3.2658541,-5.226316,7.1847634,-4.1508675,-4.7926946,6.0150256,-4.982116,-4.307327,4.6582956,-5.7485247,-3.7711017,3.1290734,-6.43721,-3.1854177,1.4466199,-7.034407,-2.5518894,-0.36353266,-7.5270224,-1.8725437,-2.0188794,-7.903637,-1.1502337,-3.4793432,-8.149605,-0.397731,-4.708172,-8.261081,0.36691147,-5.6756396,-8.242925,1.1230388,-6.36215,-8.1050415,1.905075,-6.8313503,-7.865101,2.7366104,-7.122221,-7.509977,3.603241,-7.1796265,-7.04051,4.4955606,-6.9834623,-6.474373,5.3378334,-6.5400763,-5.8554187,6.080922,-5.882824,-5.188192,6.716852,-5.0245285,-4.4789295,7.2381086,-3.9786365,-3.7327282,7.636906,-2.7600603,-2.954111,7.906695,-1.3287395,-2.1351535,8.039896,0.29389393,-1.2815552,8.03019,2.080759,-0.39944834,7.874057,3.9986727,0.50405514,7.572518,5.723833,1.4195564,7.1354146,7.222286,2.331861,6.5789537,8.468781,3.2243338,5.922029,9.44764,4.081272,5.183262,10.150376,4.8888707,4.380129,10.574223,5.6337576,3.5304215,10.723833,6.3054667,2.6502872,10.643642,6.895978,1.7528565,10.344223,7.3999243,0.84882766,9.837093,7.813617,-0.05329925,9.1336355,8.134177,-0.9465323,8.244926,8.358595,-1.8247846,7.1822686,8.483106,-2.6815875,5.9576554,8.5026045,-3.5093365,4.584855,8.410907,-4.299922,3.081595,8.200638,-5.0438366,1.7211093,7.8641634,-5.726252,0.5267776,7.399107,-6.3330913,-0.47703302,6.8093953,-6.8516083,-1.2683597,6.1059237,-7.271476,-1.8302491,5.3052487,-7.5850286,-2.1527689,4.4275274,-7.811585,-2.2597327,3.4254718,-7.9296823,-2.1344328,2.3574367,-7.930085,-1.7833345,1.268962,-7.811065,-1.2179618,0.17526197,-7.571465,-0.45222628,-0.9096186,-7.211671,0.49831337,-1.9713923,-6.7342186,1.6153457,-2.9958067,-6.1454067,2.8793068,-3.9689803,-5.422582,4.270842,-4.8786144,-4.5790873,5.520827,-5.71601,-3.6613798,6.5783887,-6.4728765,-2.685484,7.437109,-7.1399508,-1.667345,8.093913,-7.709212,-0.62290156,8.583439,-8.1739025,0.4324975,8.906343,-8.52919,1.5154892,9.076317,-8.772779,2.6132286,9.097655,-8.904231,3.7141063,8.974483,-8.924465,4.80761,8.675652,-8.835511,5.8843126,8.20751,-8.639818,6.9353943,7.588663,-8.352659,7.95134,6.823591,-7.9761004,8.921795,5.916603,-7.512812,9.835609,4.872422,-6.966584,10.681607,3.6993294,-6.3414054,11.448062,2.6595006,-5.6413074,12.119178,1.7570493,-4.876899};
			return value;
		}
		private double[] getSardine7PosnInterp_4_74_keyValue_2()
		{
			double[] value = {12.680377,0.9955366,-4.0615816,13.119783,0.3746528,-3.2127204,13.429346,-0.08367476,-2.3363626,13.61311,-0.3941889,-1.4296751,13.642098,-0.8853005,-0.46380746,13.50415,-1.5164704,0.46878344,13.238423,-2.1470466,1.3597494,12.848676,-2.6424253,2.198222,12.3361845,-3.0045815,2.982836,11.688153,-3.1886513,3.752538,10.91699,-3.2061944,4.469532,10.048406,-3.053481,5.10229,9.096156,-2.7348511,5.637823,8.066461,-2.255614,6.070548,6.9652395,-1.6212187,6.3950324,5.7989025,-0.837643,6.6054173,4.575348,-0.19714856,6.6951957,3.3099923,0.3024009,6.6570044,2.0220554,0.9509654,6.4873333,0.7276207,1.7365689,6.182336,-0.554862,2.392629,5.7411537,6.204567,-4.666419,-1.0014626};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine7OrientInterp_4_75_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine7OrientInterp_4_75_keyValue_1()
		{
			double[] value = {-0.15140642,0.7860855,0.5992877,2.7744775,-0.21887319,0.82614183,0.5192151,2.5238822,-0.2200825,0.8837493,0.41297793,2.3655753,-0.1822328,0.9429612,0.27859533,2.2517462,-0.11794047,0.98457885,0.12920706,2.176488,-0.042429782,0.999033,-0.01152396,2.134525,0.046413176,0.9900123,-0.13312188,2.1099415,0.12837863,0.963698,-0.23410466,2.0927987,0.19960833,0.92862374,-0.31275314,2.0772269,0.25505793,0.89467937,-0.36673453,2.0566647,0.30647233,0.8590038,-0.41010636,2.0321527,0.3582086,0.8215701,-0.44351882,2.0002615,0.41191292,0.782347,-0.46718398,1.960122,0.46157077,0.75133324,-0.47164685,1.8990979,0.5104688,0.72639304,-0.4601898,1.8140515,0.5686366,0.691346,-0.4457501,1.7218726,0.6482525,0.6390992,-0.41390935,1.5981482,0.7514479,0.5581212,-0.35189033,1.4333563,0.85983616,0.44753632,-0.24575064,1.2119598,0.93445903,0.3155456,-0.16497691,1.0790292,0.9808706,0.19178087,-0.033358015,0.8372446,0.9961292,0.06231379,0.061987508,0.58363354,-0.9570342,0.20583679,-0.2042511,5.973212,-0.0027220931,0.9337281,-0.35795382,6.1327925,0.7802119,0.62327164,-0.0528907,5.9573984,0.87738174,0.47922775,0.023336703,5.745138,0.9022099,0.42299873,0.08420088,5.551315,0.8971677,0.42015207,0.1362461,5.4071198,0.8854436,0.42954022,0.1774392,5.282847,0.86744654,0.4481755,0.21604368,5.1720243,0.84257066,0.47431988,0.25513884,5.0686054,0.809074,0.5074732,0.29642898,4.967265,0.76491207,0.5470937,0.33999655,4.8635616,0.6856705,0.6183103,0.38412073,4.7809715,0.60032904,0.6881088,0.40756774,4.692194,0.50496453,0.7577773,0.41326106,4.599208,0.40268883,0.8266613,0.3930299,4.510924,0.2901076,0.89522356,0.33824915,4.428309,0.18575557,0.94927615,0.2537118,4.3646855,0.10341238,0.9827751,0.15316238,4.293345,0.014009751,0.9994197,0.031049056,4.215226,-0.05622266,0.9945048,-0.08831302,4.143459,-0.114267856,0.97481626,-0.19151004,4.063913,-0.14010732,0.9499335,-0.27927792,3.9510455,-0.14902654,0.92449677,-0.35085168,3.8317118,-0.14227596,0.9020178,-0.40757987,3.706541,-0.12227652,0.8839497,-0.45131078,3.5748682,-0.09325184,0.86751944,-0.48858374,3.4346814,-0.054214697,0.85636264,-0.5135209,3.2914214,-0.011152596,0.84924394,-0.52788275,3.1497223,0.032074496,0.84521323,-0.5334659,3.014026,0.09274619,0.85930383,-0.50298613,2.8537195,0.12215084,0.8775074,-0.4637456,2.7308888,0.14111641,0.89960957,-0.41326612,2.6177301,0.14639564,0.9253122,-0.34980798,2.5139134,0.13210869,0.9533363,-0.27147236,2.418636,0.08384661,0.97984934,-0.18128689,2.3319151,-0.003683476,0.9962696,-0.08621567,2.24773,-0.05842669,0.9981417,0.017308474,2.1603966,-0.11872412,0.9856891,0.11967304,2.0846055,-0.1822894,0.9604127,0.21066101,2.020085,-0.24630174,0.9264324,0.28470755,1.9625729,-0.30966,0.88775164,0.3405991,1.9066638,-0.37287858,0.84678435,0.3793649,1.8474977,-0.43764117,0.8039868,0.40258583,1.7813419,-0.50555444,0.75844216,0.411315,1.7061014,-0.577566,0.7085748,0.40538776,1.6204524,-0.5869637,0.6979637,0.4102685,1.5181774,-0.6687646,0.6619082,0.33857244,1.3363812,-0.7406797,0.6251275,0.24618953,1.1443528,-0.7775123,0.6073853,0.1629651,0.9450669,-0.78451246,0.6167042,0.06493191,0.7210163,-0.727652,0.6816671,-0.07651976,0.47500154,-0.4410043,0.86238456,-0.24860747,0.25298423,0.59226197,0.61545193,-0.52004236,0.18720941,0.9545228,0.047393482,-0.29435197,0.32661435,-0.9755825,0.1702134,0.13879912,5.7923336,-0.9573638,0.2863355,0.03829351,5.6459084,-0.92881745,0.3684464,-0.039310765,5.519018,-0.8942312,0.43517464,-0.104756184,5.4078245,-0.85598695,0.4913262,-0.16088772,5.3079286,-0.8059287,0.5540378,-0.20861706,5.2120314,-0.6860029,0.667879,-0.28868297,5.166548,-0.5940314,0.7483808,-0.2950474,5.151903,-0.50785184,0.82031924,-0.26298755,5.1416326,-0.41591665,0.8858111,-0.20579654,5.1237125,-0.3230579,0.9338148,-0.15369855,5.079076,-0.22428495,0.9698734,-0.09508649,5.017181,-0.1281786,0.9911776,-0.03372434,4.930126,-0.044259105,0.99862784,0.027993968,4.830851,0.02396595,0.9957869,0.08850813,4.7229004,0.087206036,0.9829621,0.16180485,4.6049647,0.13353288,0.9657518,0.22246873,4.485404,0.1656067,0.94899887,0.2682827,4.381912,0.18380173,0.9329674,0.30949748,4.279041,0.19403397,0.9184236,0.3447447,4.178805,0.1975616,0.90553296,0.37547246,4.080676,0.19360745,0.8947203,0.402482,3.982514,0.14105941,0.91125095,0.38694152,3.8845415,0.10297795,0.9267859,0.3611974,3.7908788};
			return value;
		}
		private double[] getSardine7OrientInterp_4_75_keyValue_2()
		{
			double[] value = {0.06704737,0.941861,0.32924524,3.6891077,0.034029152,0.9561197,0.29099327,3.5782876,-0.00132772,0.9724193,0.23323567,3.4531837,-0.021932911,0.98608464,0.16479078,3.3263438,0.015417994,0.9724117,0.23276094,3.1764808,-0.0101364385,0.9565489,0.29139566,3.0079322,-0.04492737,0.95504457,0.29303804,2.8633046,-0.06894819,0.96834266,0.23991396,2.712206,-0.068010904,0.9814648,0.17916833,2.5680976,-0.05693224,0.9950383,0.08159368,2.4406526,-0.018041253,0.9998352,0.0020492407,2.319691,0.029118784,0.9968419,-0.07387974,2.2038972,0.081463076,0.98658293,-0.141484,2.0951114,0.13717903,0.97084135,-0.19659375,1.9938558,0.19397005,0.9515948,-0.23841724,1.8992332,0.24891724,0.93042654,-0.26897356,1.8107061,0.18286881,0.94807637,-0.26021206,1.7134895,0.15436035,0.96402234,-0.21641153,1.5904912,0.27034962,0.94083214,-0.2043189,1.4923335,0.3347557,0.9138987,-0.22962599,1.4174055,0.26318863,0.9301677,-0.25596812,1.3250787,-0.15140642,0.7860855,0.5992877,2.7744775};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine8PosnInterp_4_82_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine8PosnInterp_4_82_keyValue_1()
		{
			double[] value = {6.01013,-7.453341,1.2850097,5.3379245,-7.6963673,1.5401913,4.5223174,-7.6827755,1.8144882,3.569123,-7.430716,2.0938647,2.5773807,-6.912155,2.3618577,1.5957305,-6.1402755,2.6059325,0.63704556,-5.084554,2.8216455,-0.28578633,-3.7521644,3.0011196,-1.1561189,-2.1552954,3.131769,-1.9503775,-0.3200668,3.1990478,-2.6439643,1.7051259,3.2000995,-3.2241204,3.8687143,3.1549778,-3.7134154,5.814236,3.079395,-4.106179,7.5075197,2.9785202,-4.4185176,8.916494,2.8425925,-4.66292,10.018734,2.6820328,-4.8462176,10.809748,2.4946208,-4.99959,11.44098,2.2518985,-5.1254835,11.905662,1.941338,-5.192059,12.1812525,1.5436354,-5.195764,12.216147,1.0405095,-5.1293287,11.977691,0.42067325,-4.9775414,11.48695,-0.2968347,-4.735745,10.726544,-1.0964028,-4.4284396,9.736298,-1.8729588,-4.057044,8.499316,-2.6351562,-3.6218605,7.0211368,-3.3769617,-3.1227825,5.308776,-4.089158,-2.559995,3.3732085,-4.7578115,-1.9351419,1.2341454,-5.3654265,-1.2536821,-1.0759544,-5.8956256,-0.55469984,-3.2080414,-6.330327,0.18183875,-5.051872,-6.6416445,0.93097085,-6.558406,-6.8420243,1.6765157,-7.753378,-6.940391,2.4070446,-8.653926,-6.955927,3.1112082,-9.258935,-6.8946443,3.8321795,-9.666777,-6.762867,4.6091204,-9.865057,-6.5565825,5.4426303,-9.835504,-6.271635,6.325728,-9.555534,-5.904063,7.190535,-9.02424,-5.4744606,7.972088,-8.273998,-5.010867,8.665668,-7.3186054,-4.5161095,9.273472,-6.1223207,-3.9799385,9.78408,-4.7507915,-3.4126427,10.189867,-3.2191427,-2.8163242,10.483421,-1.5448296,-2.1940088,10.657835,0.0010447502,-1.5493308,10.707815,1.3981477,-0.8900047,10.635653,2.9342432,-0.21348172,10.443096,4.333251,0.47729468,10.1353,5.55122,1.1597319,9.721375,6.5697255,1.8237345,9.177237,7.3986936,2.4686906,8.517977,8.029005,3.0849156,7.7595186,8.4560995,3.6637263,6.904277,8.652391,4.2075777,5.9534326,8.621586,4.71669,4.9758773,8.329434,5.1562047,3.9811172,7.7854037,5.5204654,2.975623,7.0342402,5.8042407,1.9653955,6.0489774,6.0006595,0.9556006,4.839924,6.1016555,-0.047345757,3.454916,6.096445,-1.0334082,1.9111588,5.97196,-1.9904001,0.23565245,5.714293,-2.9035032,-1.4414306,5.3126307,-3.7536812,-2.946303,4.767323,-4.519996,-4.2352877,4.094936,-5.187383,-5.2159657,3.3320818,-5.742465,-5.908511,2.5076509,-6.1760216,-6.3090754,1.6488829,-6.490514,-6.460023,0.7501178,-6.7079854,-6.379047,-0.24294305,-6.8055005,-6.060424,-1.2625716,-6.810379,-5.521948,-2.2528536,-6.727271,-4.786873,-3.205277,-6.5554175,-3.8325624,-4.1106405,-6.2938137,-2.6742141,-4.960117,-5.942461,-1.3288995,-5.7442303,-5.502714,0.18328178,-6.453907,-4.978493,1.8399824,-7.081745,-4.3755903,3.3672156,-7.6231527,-3.7045038,4.746813,-8.073748,-2.9758592,5.963341,-8.432062,-2.16522,6.9981213,-8.703332,-1.2859876,7.8435583,-8.887686,-0.3520713,8.495239,-8.985939,0.6227561,8.950502,-8.9997835,1.6250527,9.209013,-8.931545,2.6665766,9.30179,-8.769799,3.7170389,9.171298,-8.527572,4.761959,8.823166,-8.208726,5.757266,8.2995615,-7.814666,6.6941056,7.6046,-7.348604,7.563601,6.7426796,-6.814222,8.357412,5.7205305,-6.2148232,9.067304,4.5472255,-5.553108,9.68413,3.2326164,-4.832451};
			return value;
		}
		private double[] getSardine8PosnInterp_4_82_keyValue_2()
		{
			double[] value = {10.19862,1.789746,-4.055886,10.600609,0.48342,-3.2276666,10.9130335,-0.68748546,-2.3466685,11.122516,-1.7105088,-1.4248841,11.217174,-2.5766935,-0.48029506,11.18913,-3.2776794,0.4659446,11.036038,-3.8066876,1.3916101,10.761012,-4.1248436,2.275998,10.347916,-4.2616982,3.1760345,9.802742,-4.2039714,4.0582027,9.109745,-3.966453,4.8606057,8.2921715,-3.5573878,5.5544395,7.358375,-2.9981565,6.1449018,6.317517,-2.2948313,6.6253076,5.179295,-1.4537745,6.988585,3.9558244,-0.46898127,7.2151804,2.6604779,0.6491511,7.2983937,1.3088076,1.6344744,7.232881,-0.074629664,2.4787893,7.0164227,-1.4633962,3.1409793,6.651382,-2.797789,3.6354349,6.1554112,6.01013,-7.453341,1.2850097};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine8OrientInterp_4_83_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine8OrientInterp_4_83_keyValue_1()
		{
			double[] value = {-0.23316829,0.921699,0.31000584,2.0523648,-0.14350182,0.97974545,0.13966438,1.9420699,-0.025281828,0.9992261,-0.030135993,1.8964465,0.073198974,0.98780495,-0.137417,1.8724673,0.16031049,0.957928,-0.23806404,1.8827847,0.23455174,0.91928196,-0.31607947,1.9008658,0.29966897,0.8737528,-0.38308564,1.9254704,0.35402146,0.8302091,-0.43060592,1.9420066,0.4036654,0.78827494,-0.4644102,1.9458716,0.45497748,0.7456019,-0.48690176,1.9335133,0.5072303,0.7021586,-0.49969062,1.9107448,0.55144143,0.66239995,-0.5070885,1.8955082,0.58710355,0.6399508,-0.4957544,1.8503654,0.6287166,0.6113644,-0.48057172,1.797709,0.6948116,0.566782,-0.44271338,1.6982846,0.7544762,0.5215142,-0.39848283,1.5921869,0.8039065,0.47669974,-0.35565653,1.4579005,0.8596031,0.4183479,-0.29337326,1.2778194,0.9215201,0.3475102,-0.17331219,1.0146767,0.9709429,0.23894024,-0.0133244665,0.6193819,0.79048645,0.06259475,0.60924685,0.08782441,0.9645139,0.25520787,-0.06768729,5.902346,0.94790196,0.31303915,0.059066106,5.6607313,0.93202776,0.34478813,0.11155805,5.4936175,0.92443514,0.3570505,0.1339204,5.346122,0.9077642,0.3793259,0.17909834,5.2267146,0.88916844,0.4033399,0.21609396,5.1304893,0.8679089,0.42929175,0.24988529,5.0475564,0.84287363,0.4577468,0.282899,4.9704885,0.81233525,0.48953092,0.3169714,4.894135,0.7756743,0.5238363,0.35202944,4.816521,0.72314274,0.5724972,0.38640866,4.760476,0.6482996,0.63954264,0.4131503,4.693348,0.5685365,0.7042992,0.42512226,4.6360655,0.4888793,0.76528686,0.4187281,4.583907,0.40333658,0.8263988,0.39291835,4.544878,0.2975527,0.89426506,0.3342941,4.5110655,0.19853683,0.94749373,0.25067675,4.4754806,0.08192174,0.9883916,0.1279497,4.439058,-0.021334393,0.9997215,-0.010085067,4.3830304,-0.10092682,0.9854303,-0.13689806,4.306384,-0.16233562,0.95702887,-0.24029751,4.217475,-0.20271553,0.9235578,-0.32549557,4.1197705,-0.21816562,0.89235705,-0.39509815,4.0140095,-0.21793114,0.86361456,-0.45461637,3.8966382,-0.19955967,0.84562683,-0.49506682,3.7793503,-0.1708372,0.8326465,-0.5267964,3.653863,-0.13146359,0.8239202,-0.5512467,3.5169587,-0.06682699,0.8335683,-0.54835933,3.3543792,-0.014167382,0.84477496,-0.53493416,3.1978273,0.015866175,0.8378547,-0.5456627,3.0696251,0.07647967,0.850977,-0.51960474,2.9033341,0.11063505,0.8678565,-0.4843397,2.7655423,0.13268948,0.88967574,-0.43688756,2.6359072,0.13794997,0.91681474,-0.37472713,2.4942071,0.12416712,0.94595397,-0.29958934,2.3654594,0.083934784,0.9726501,-0.2165791,2.252586,0.02026906,0.9934203,-0.11271736,2.1489253,-0.038211685,0.9992636,-0.0034950695,2.0621881,-0.12112154,0.9865757,0.109535046,1.9960806,-0.19506387,0.9579685,0.21034877,1.9458579,-0.25464156,0.9256977,0.27971664,1.9008926,-0.32256636,0.88465846,0.33664557,1.8580295,-0.38457105,0.8431566,0.37575534,1.8120348,-0.4412895,0.80575657,0.3949935,1.7530553,-0.50305605,0.765694,0.4008083,1.6816393,-0.56896263,0.7219445,0.39379907,1.5976837,-0.6321911,0.6827271,0.36635816,1.4879766,-0.65223724,0.66883487,0.35671625,1.3705162,-0.71927124,0.6368138,0.2776993,1.2027789,-0.726325,0.64717436,0.231554,1.0299201,-0.74638057,0.6571201,0.1053988,0.82713395,-0.6842006,0.72884405,-0.025592465,0.6023889,-0.45615432,0.8705956,-0.18435541,0.37676927,0.28952396,0.8921306,-0.3467997,0.24482511,0.88864714,0.3257341,-0.32280728,0.33388546,0.98205864,0.054787807,-0.18044533,0.5065496,-0.99322724,0.08495909,0.07925147,5.620643,-0.985017,0.172033,0.012120714,5.4634457,-0.966116,0.25065345,-0.061585933,5.331377,-0.93697137,0.32386848,-0.13112533,5.215676,-0.89760417,0.39402115,-0.19762175,5.109662,-0.8494652,0.45960867,-0.25916958,5.0089936,-0.76823825,0.5534391,-0.3217379,4.948419,-0.6970403,0.62764746,-0.34668893,4.8971276,-0.62222975,0.69671506,-0.3569571,4.8475304,-0.53405076,0.7729302,-0.3425911,4.808545,-0.44171014,0.84240144,-0.30862898,4.7723203,-0.34577143,0.9032046,-0.25429046,4.7351575,-0.24689333,0.9519093,-0.18141769,4.6916595,-0.14908086,0.9842521,-0.09498772,4.6368318,-0.06934905,0.99745363,-0.016652118,4.558597,0.014248204,0.99614084,0.08660466,4.477937,0.08287686,0.9812502,0.1740103,4.3887863,0.12573636,0.9628426,0.23900768,4.288511,0.15629353,0.94252735,0.29532093,4.186445,0.1761625,0.92256606,0.34327635,4.0849824,0.1838613,0.9046553,0.3844396,3.9827924,0.1792101,0.8897945,0.4197016,3.8773644,0.16422026,0.87799156,0.44962502,3.7672567};
			return value;
		}
		private double[] getSardine8OrientInterp_4_83_keyValue_2()
		{
			double[] value = {0.14042959,0.86928624,0.47394198,3.6513932,0.07438312,0.88314974,0.46315625,3.5100937,0.044338197,0.89864576,0.43642867,3.4194372,0.01270919,0.9149996,0.4032546,3.317986,-0.0148381675,0.9318187,0.36262068,3.209156,-0.037016805,0.94912213,0.3127249,3.0921102,-0.051426098,0.966525,0.2513659,2.967107,-0.058473017,0.9854483,0.15960094,2.8332458,-0.051316697,0.9968389,0.060651645,2.7076213,-0.023702392,0.9990433,-0.03675216,2.590309,0.021110095,0.9928952,-0.117105044,2.43825,0.07291726,0.97997034,-0.18531321,2.2937675,0.12101137,0.9648551,-0.2332615,2.1673765,0.17289978,0.94813395,-0.2667355,2.0500927,0.22601652,0.9305792,-0.2879914,1.9407303,0.28413728,0.909847,-0.30239794,1.8315592,0.33458757,0.8891573,-0.31217068,1.7332993,0.27204415,0.9053773,-0.3260119,1.6460004,0.26078722,0.9198215,-0.29311845,1.5199451,0.22725327,0.9405103,-0.25257903,1.3913956,0.19526057,0.95784444,-0.21073098,1.2682706,-0.23316829,0.921699,0.31000584,2.0523648};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine9PosnInterp_4_90_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine9PosnInterp_4_90_keyValue_1()
		{
			double[] value = {5.292841,-8.402231,1.4285055,5.0145187,-8.924968,1.4011786,4.63799,-9.251361,1.3631221,4.1202946,-9.346113,1.3338168,3.454159,-9.173946,1.3173754,2.6489406,-8.724689,1.3040248,1.7208997,-7.978091,1.2937332,0.8200013,-7.000345,1.2861327,-0.046847284,-5.7943993,1.2775829,-0.8698952,-4.3633018,1.2633595,-1.6332885,-2.712649,1.2372098,-2.3095558,-0.85909474,1.1906632,-2.9165425,1.1267974,1.1461066,-3.3977613,2.9463348,1.0886574,-3.7659676,4.5661077,1.0332009,-4.0638123,5.966708,0.9842167,-4.2911158,7.1319695,0.94893223,-4.4363008,8.03341,0.9305095,-4.5128856,8.790684,0.9019267,-4.541323,9.386633,0.82711524,-4.4932613,9.782827,0.6936544,-4.3640594,9.974104,0.48894015,-4.1368403,9.939559,0.1928314,-3.8025992,9.631955,-0.19815236,-3.3675187,9.057392,-0.66945094,-2.8386135,8.204072,-1.2070843,-2.2792892,7.12507,-1.7387443,-1.6918763,5.825069,-2.259504,-1.0798662,4.309418,-2.7600996,-0.4495669,2.58841,-3.2263215,0.18798554,0.68492293,-3.637147,0.813815,-1.3522215,-3.9781685,1.4085476,-3.2105894,-4.2646446,1.9565613,-4.8368278,-4.5198326,2.4582548,-6.132664,-4.73652,2.9198189,-7.102647,-4.899263,3.347278,-7.742545,-4.9991546,3.8060622,-8.155106,-5.045297,4.275675,-8.360461,-5.0463433,4.765556,-8.281685,-4.9802523,5.307126,-7.931078,-4.8415856,5.885394,-7.2524405,-4.622769,6.478582,-6.2607374,-4.313136,7.003169,-5.0599117,-3.9427223,7.451869,-3.6277602,-3.511586,7.8156505,-1.9810284,-3.0194836,8.084308,-0.14217687,-2.4665973,8.249177,1.8380159,-1.8678515,8.305034,3.67482,-1.2271447,8.251468,5.3346663,-0.5540038,8.093522,6.788122,0.13839757,7.8402004,8.012459,0.8353558,7.5027976,8.992416,1.5219637,7.0936823,9.719142,2.1839335,6.5893774,10.15302,2.807924,5.9367523,10.3581085,3.4670937,5.142442,10.307961,4.144068,4.281912,9.987979,4.7649307,3.3773582,9.409484,5.312983,2.435217,8.581857,5.783557,1.4617355,7.5129814,6.1707053,0.46256268,6.2698336,6.479066,-0.55283284,4.8611317,6.698085,-1.5730959,3.3000426,6.815551,-2.58508,1.6064683,6.8181796,-3.57364,-0.22623432,6.693424,-4.5232725,-1.9075434,6.4316278,-5.4163094,-3.357066,6.0334244,-6.235065,-4.5386825,5.5141964,-6.96603,-5.4300003,4.8958516,-7.5986195,-6.0551014,4.201421,-8.125065,-6.4104466,3.453431,-8.583047,-6.503174,2.612225,-8.973388,-6.3259187,1.6696906,-9.256691,-5.8794937,0.7024761,-9.421713,-5.184395,-0.25499707,-9.468051,-4.255596,-1.1949337,-9.394571,-3.1081238,-2.110226,-9.200142,-1.757483,-2.9929209,-8.883967,-0.22173667,-3.8345191,-8.447334,1.4786925,-4.626213,-7.894087,3.3205512,-5.359979,-7.2316637,5.0300355,-6.0294,-6.4713626,6.5876226,-6.627889,-5.6263204,7.9786367,-7.1503725,-4.710172,9.191438,-7.5930066,-3.7365465,10.216925,-7.9528875,-2.7192717,11.048397,-8.227925,-1.672355,11.681453,-8.416867,-0.6098608,12.114034,-8.5194025,0.45434964,12.34632,-8.536293,1.5071707,12.381277,-8.46926,2.5440135,12.2236,-8.320589,3.5512261,11.878213,-8.093499,4.517317,11.329258,-7.804131,5.4352393,10.583737,-7.454532,6.2981358,9.64793,-7.046459,7.0994315,8.528838,-6.580893,7.83212,7.2345266,-6.0580792,8.487735,5.773835,-5.478485};
			return value;
		}
		private double[] getSardine9PosnInterp_4_90_keyValue_2()
		{
			double[] value = {9.057069,4.158208,-4.842284,9.530074,2.4021173,-4.149723,9.89668,0.77456045,-3.4010897,10.181293,-0.67982304,-2.586266,10.370126,-1.9460907,-1.7165437,10.450658,-3.0079653,-0.80620223,10.412786,-3.8502162,0.12553239,10.251373,-4.4958963,1.055056,9.96764,-4.9365897,1.9585114,9.562465,-5.200796,2.8168697,9.018689,-5.30113,3.6641397,8.317206,-5.2251806,4.4613514,7.4982677,-4.9720464,5.155381,6.6089354,-4.5469794,5.7384644,5.6591983,-3.956305,6.203669,4.6585913,-3.2069218,6.5450683,3.6150548,-2.2866719,6.7691317,2.5375385,-1.2086549,6.8689637,1.4378031,0.012385964,6.8376017,0.33008373,1.2317835,6.6698723,-0.7675607,2.3032017,6.364837,5.292841,-8.402231,1.4285055};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine9OrientInterp_4_91_key_1()
		{
			double[] value = {0.0,0.007851239,0.015702479,0.023553718,0.031404957,0.039256196,0.047107436,0.054958675,0.062809914,0.07066116,0.0785124,0.08636364,0.09421489,0.10206613,0.10991737,0.117768615,0.12561986,0.1334711,0.14132234,0.14917359,0.15702483,0.16487607,0.17272732,0.18057856,0.1884298,0.19628105,0.20413229,0.21198353,0.21983477,0.22768602,0.23553726,0.2433885,0.25123975,0.259091,0.26694223,0.27479348,0.28264472,0.29049596,0.2983472,0.30619845,0.3140497,0.32190093,0.32975218,0.33760342,0.34545466,0.3533059,0.36115715,0.3690084,0.37685964,0.38471088,0.39256212,0.40041336,0.4082646,0.41611585,0.4239671,0.43181834,0.43966958,0.44752082,0.45537207,0.4632233,0.47107455,0.4789258,0.48677704,0.49462828,0.5024795,0.51033074,0.518182,0.5260332,0.53388447,0.5417357,0.54958695,0.5574382,0.56528944,0.5731407,0.5809919,0.58884317,0.5966944,0.60454565,0.6123969,0.62024814,0.6280994,0.6359506,0.64380187,0.6516531,0.65950435,0.6673556,0.67520684,0.6830581,0.6909093,0.69876057,0.7066118,0.71446306,0.7223143,0.73016554,0.7380168,0.745868,0.7537193,0.7615705,0.76942176,0.777273,0.78512424,0.7929755,0.8008267,0.808678,0.8165292,0.82438046,0.8322317,0.84008294,0.8479342,0.8557854,0.8636367,0.8714879,0.87933916,0.8871904,0.89504164,0.9028929,0.91074413,0.9185954,0.9264466,0.93429786,0.9421491,1.0};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getSardine9OrientInterp_4_91_keyValue_1()
		{
			double[] value = {-0.57098883,0.6498834,0.5016207,1.8755349,-0.5131048,0.741288,0.4326841,1.7453072,-0.38809115,0.8715527,0.29963538,1.5857722,-0.13191803,0.98993564,0.051236138,1.5176607,0.099472605,0.98315555,-0.15333092,1.5704081,0.23035334,0.93786234,-0.25952193,1.6275192,0.30572742,0.89476883,-0.32545274,1.6798158,0.36243492,0.8502008,-0.38183683,1.7355334,0.4086033,0.8096358,-0.42134684,1.7812005,0.44649187,0.77273905,-0.4511313,1.8180137,0.48137912,0.73733526,-0.47393128,1.8453662,0.5193514,0.6996393,-0.49069238,1.860925,0.533856,0.6789759,-0.5039738,1.8877869,0.56545305,0.6538875,-0.50268644,1.8726737,0.5837865,0.6347834,-0.50620484,1.8751359,0.59364915,0.62592787,-0.50576186,1.8731582,0.59274644,0.6218357,-0.51183194,1.8909476,0.5875614,0.6157615,-0.5249851,1.9311686,0.69079155,0.5377646,-0.48333856,1.8295375,0.9651746,0.1975578,-0.17148994,1.4727533,-0.9570014,0.2372046,-0.16698109,5.0145216,-0.76501006,0.6169714,-0.18467954,5.4221387,0.098336235,0.9840861,0.1479997,5.6155114,0.5649146,0.7853403,0.2532055,5.39207,0.66413903,0.69307905,0.28028676,5.2460723,0.70039445,0.6467865,0.30185205,5.144918,0.7134586,0.61593837,0.33406138,5.0439415,0.723574,0.59522384,0.3494981,4.966601,0.7243028,0.5843517,0.36594862,4.896922,0.7171434,0.58114564,0.38467577,4.8283153,0.70092934,0.58541,0.40742284,4.7537727,0.68114984,0.5926843,0.42983735,4.679571,0.6811255,0.59938484,0.42048308,4.674061,0.66632754,0.6120695,0.42588553,4.6704855,0.63904905,0.6396182,0.4272055,4.6776075,0.59050786,0.68592465,0.42521498,4.6745186,0.49673873,0.76497626,0.40995374,4.66509,0.35094902,0.8702029,0.3458057,4.6612496,0.17993413,0.9588203,0.2197435,4.663777,-0.09902431,0.9936972,-0.052536406,4.5768056,-0.22374202,0.9391625,-0.26060188,4.4094687,-0.27752376,0.8804582,-0.3844137,4.2421775,-0.2758783,0.8490952,-0.4504759,4.0945153,-0.2614066,0.8285175,-0.49520236,3.9573917,-0.23187672,0.8138882,-0.53274685,3.8148108,-0.18814525,0.8066726,-0.5602505,3.665768,-0.1357589,0.80410886,-0.57877314,3.5110981,-0.08268056,0.80331975,-0.5897806,3.362206,-0.015612603,0.81542176,-0.57865655,3.1989622,0.032887492,0.82936835,-0.5577334,3.0613027,0.07175521,0.84642714,-0.5276478,2.9362793,0.10038393,0.86755234,-0.48710975,2.822326,0.11791118,0.89358014,-0.43314135,2.7159288,0.121073656,0.92484736,-0.36055306,2.6140177,0.09387238,0.96573514,-0.24195787,2.4797256,0.018606853,0.9927227,-0.11897666,2.3719943,-0.042882375,0.9990367,0.009313784,2.275818,-0.11081918,0.9856611,0.12724553,2.196739,-0.17208453,0.95846903,0.22742923,2.1340842,-0.22870703,0.9248612,0.30385008,2.0814857,-0.2825369,0.88963723,0.35877347,2.0315478,-0.31978112,0.86347747,0.39006,1.9859575,-0.36487672,0.83598375,0.40987307,1.9308438,-0.41328028,0.80693823,0.4219599,1.8682628,-0.4663053,0.77537996,0.4258467,1.7958348,-0.5275479,0.7369049,0.422687,1.7160215,-0.52121335,0.73296845,0.43714306,1.6410038,-0.5586555,0.72291493,0.4065686,1.4959164,-0.5903467,0.720242,0.3643384,1.3298277,-0.6142186,0.7319502,0.2949306,1.1346265,-0.6269332,0.7583483,0.17849994,0.92380655,-0.5432776,0.83803207,0.050516073,0.70493454,-0.21679391,0.97336507,-0.07458884,0.50848985,0.3629023,0.9082792,-0.20816472,0.4365845,0.774939,0.5726887,-0.2673907,0.5196022,0.9337773,0.2921813,-0.20661484,0.6556928,0.98723155,0.10021663,-0.12381758,0.78643936,-0.9981614,0.04354821,0.042165417,5.383846,-0.98606795,0.16220748,-0.03685502,5.2858205,-0.95746565,0.26575994,-0.11238806,5.197365,-0.9163916,0.35659492,-0.18184274,5.114052,-0.8670523,0.43505272,-0.2427957,5.034074,-0.78540707,0.5362457,-0.30915377,4.989478,-0.7169854,0.613075,-0.3317691,4.957923,-0.6471389,0.68268526,-0.33934087,4.929383,-0.5755999,0.7472052,-0.33221835,4.903785,-0.50053036,0.8081032,-0.31054607,4.8793964,-0.41967615,0.86529785,-0.27410108,4.8531594,-0.33172628,0.916828,-0.22222534,4.821209,-0.23750894,0.95896256,-0.15485561,4.779082,-0.14076121,0.98726267,-0.07415212,4.7224503,-0.048187997,0.99873877,0.014093497,4.648628,0.03280113,0.9942808,0.10163365,4.5595365,0.09756167,0.9784199,0.18214338,4.4596534,0.15492764,0.95313996,0.2598489,4.362628,0.19422975,0.92605805,0.3235605,4.2639155,0.218081,0.900874,0.37532198,4.1663632,0.22802363,0.8794773,0.41776177,4.069405,0.22551647,0.8624904,0.4530481,3.9707017,0.21230926,0.84962344,0.4827677,3.8677723};
			return value;
		}
		private double[] getSardine9OrientInterp_4_91_keyValue_2()
		{
			double[] value = {0.18949851,0.84057444,0.5074691,3.758343,0.1582473,0.8348467,0.52724653,3.6409009,0.094880626,0.8477378,0.5218603,3.4987602,0.0525465,0.86628264,0.4967828,3.3979404,0.015363393,0.8862233,0.46300346,3.29583,-0.01840954,0.90829283,0.41792968,3.187963,-0.045924634,0.9325417,0.35812992,3.0739882,-0.059061766,0.9543792,0.29269797,2.956683,-0.06484015,0.97528976,0.21120073,2.8306656,-0.05489714,0.99001765,0.12981276,2.698118,-0.041602906,0.99826324,0.041708604,2.5692558,-0.0077147856,0.9990167,-0.04365945,2.4221456,0.04481276,0.9918466,-0.11929788,2.2820616,0.100689396,0.9769074,-0.18845099,2.1708705,0.1615951,0.9558999,-0.24523997,2.0630493,0.22564888,0.93064934,-0.2880529,1.9581789,0.2865626,0.9013433,-0.32474923,1.8709143,0.34704098,0.87116665,-0.34731984,1.7839092,0.40601674,0.8402251,-0.35940522,1.6975561,0.43606505,0.82757145,-0.35351458,1.5978646,0.4014214,0.84004456,-0.3649464,1.4993699,-0.57098883,0.6498834,0.5016207,1.8755349};
			return value;
		}

		/** Large attribute array: PositionInterpolator DEF='Sardine0PosnInterp' key field, scene-graph level=4, element #18, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine0PosnInterp_4_18_key()
		{
			MFFloat Sardine0PosnInterp_4_18_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine0PosnInterp_4_18_key_1()));
			return Sardine0PosnInterp_4_18_key;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine0PosnInterp' keyValue field, scene-graph level=4, element #18, 366 total numbers made up of 122 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getSardine0PosnInterp_4_18_keyValue()
		{
			MFVec3f Sardine0PosnInterp_4_18_keyValue = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getSardine0PosnInterp_4_18_keyValue_1()))
				.append(new MFVec3f(getSardine0PosnInterp_4_18_keyValue_2()));
			return Sardine0PosnInterp_4_18_keyValue;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine0OrientInterp' key field, scene-graph level=4, element #19, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine0OrientInterp_4_19_key()
		{
			MFFloat Sardine0OrientInterp_4_19_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine0OrientInterp_4_19_key_1()));
			return Sardine0OrientInterp_4_19_key;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine0OrientInterp' keyValue field, scene-graph level=4, element #19, 488 total numbers made up of 122 4-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFRotation getSardine0OrientInterp_4_19_keyValue()
		{
			MFRotation Sardine0OrientInterp_4_19_keyValue = new MFRotation()/*2.finalize*/
				.append(new MFRotation(getSardine0OrientInterp_4_19_keyValue_1()))
				.append(new MFRotation(getSardine0OrientInterp_4_19_keyValue_2()));
			return Sardine0OrientInterp_4_19_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine1PosnInterp' key field, scene-graph level=4, element #26, 121 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine1PosnInterp_4_26_key()
		{
			MFFloat Sardine1PosnInterp_4_26_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine1PosnInterp_4_26_key_1()));
			return Sardine1PosnInterp_4_26_key;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine1PosnInterp' keyValue field, scene-graph level=4, element #26, 363 total numbers made up of 121 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getSardine1PosnInterp_4_26_keyValue()
		{
			MFVec3f Sardine1PosnInterp_4_26_keyValue = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getSardine1PosnInterp_4_26_keyValue_1()))
				.append(new MFVec3f(getSardine1PosnInterp_4_26_keyValue_2()));
			return Sardine1PosnInterp_4_26_keyValue;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine1OrientInterp' key field, scene-graph level=4, element #27, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine1OrientInterp_4_27_key()
		{
			MFFloat Sardine1OrientInterp_4_27_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine1OrientInterp_4_27_key_1()));
			return Sardine1OrientInterp_4_27_key;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine1OrientInterp' keyValue field, scene-graph level=4, element #27, 488 total numbers made up of 122 4-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFRotation getSardine1OrientInterp_4_27_keyValue()
		{
			MFRotation Sardine1OrientInterp_4_27_keyValue = new MFRotation()/*2.finalize*/
				.append(new MFRotation(getSardine1OrientInterp_4_27_keyValue_1()))
				.append(new MFRotation(getSardine1OrientInterp_4_27_keyValue_2()));
			return Sardine1OrientInterp_4_27_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine2PosnInterp' key field, scene-graph level=4, element #34, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine2PosnInterp_4_34_key()
		{
			MFFloat Sardine2PosnInterp_4_34_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine2PosnInterp_4_34_key_1()));
			return Sardine2PosnInterp_4_34_key;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine2PosnInterp' keyValue field, scene-graph level=4, element #34, 366 total numbers made up of 122 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getSardine2PosnInterp_4_34_keyValue()
		{
			MFVec3f Sardine2PosnInterp_4_34_keyValue = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getSardine2PosnInterp_4_34_keyValue_1()))
				.append(new MFVec3f(getSardine2PosnInterp_4_34_keyValue_2()));
			return Sardine2PosnInterp_4_34_keyValue;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine2OrientInterp' key field, scene-graph level=4, element #35, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine2OrientInterp_4_35_key()
		{
			MFFloat Sardine2OrientInterp_4_35_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine2OrientInterp_4_35_key_1()));
			return Sardine2OrientInterp_4_35_key;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine2OrientInterp' keyValue field, scene-graph level=4, element #35, 488 total numbers made up of 122 4-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFRotation getSardine2OrientInterp_4_35_keyValue()
		{
			MFRotation Sardine2OrientInterp_4_35_keyValue = new MFRotation()/*2.finalize*/
				.append(new MFRotation(getSardine2OrientInterp_4_35_keyValue_1()))
				.append(new MFRotation(getSardine2OrientInterp_4_35_keyValue_2()));
			return Sardine2OrientInterp_4_35_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine3PosnInterp' key field, scene-graph level=4, element #42, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine3PosnInterp_4_42_key()
		{
			MFFloat Sardine3PosnInterp_4_42_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine3PosnInterp_4_42_key_1()));
			return Sardine3PosnInterp_4_42_key;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine3PosnInterp' keyValue field, scene-graph level=4, element #42, 366 total numbers made up of 122 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getSardine3PosnInterp_4_42_keyValue()
		{
			MFVec3f Sardine3PosnInterp_4_42_keyValue = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getSardine3PosnInterp_4_42_keyValue_1()))
				.append(new MFVec3f(getSardine3PosnInterp_4_42_keyValue_2()));
			return Sardine3PosnInterp_4_42_keyValue;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine3OrientInterp' key field, scene-graph level=4, element #43, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine3OrientInterp_4_43_key()
		{
			MFFloat Sardine3OrientInterp_4_43_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine3OrientInterp_4_43_key_1()));
			return Sardine3OrientInterp_4_43_key;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine3OrientInterp' keyValue field, scene-graph level=4, element #43, 488 total numbers made up of 122 4-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFRotation getSardine3OrientInterp_4_43_keyValue()
		{
			MFRotation Sardine3OrientInterp_4_43_keyValue = new MFRotation()/*2.finalize*/
				.append(new MFRotation(getSardine3OrientInterp_4_43_keyValue_1()))
				.append(new MFRotation(getSardine3OrientInterp_4_43_keyValue_2()));
			return Sardine3OrientInterp_4_43_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine4PosnInterp' key field, scene-graph level=4, element #50, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine4PosnInterp_4_50_key()
		{
			MFFloat Sardine4PosnInterp_4_50_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine4PosnInterp_4_50_key_1()));
			return Sardine4PosnInterp_4_50_key;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine4PosnInterp' keyValue field, scene-graph level=4, element #50, 366 total numbers made up of 122 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getSardine4PosnInterp_4_50_keyValue()
		{
			MFVec3f Sardine4PosnInterp_4_50_keyValue = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getSardine4PosnInterp_4_50_keyValue_1()))
				.append(new MFVec3f(getSardine4PosnInterp_4_50_keyValue_2()));
			return Sardine4PosnInterp_4_50_keyValue;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine4OrientInterp' key field, scene-graph level=4, element #51, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine4OrientInterp_4_51_key()
		{
			MFFloat Sardine4OrientInterp_4_51_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine4OrientInterp_4_51_key_1()));
			return Sardine4OrientInterp_4_51_key;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine4OrientInterp' keyValue field, scene-graph level=4, element #51, 488 total numbers made up of 122 4-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFRotation getSardine4OrientInterp_4_51_keyValue()
		{
			MFRotation Sardine4OrientInterp_4_51_keyValue = new MFRotation()/*2.finalize*/
				.append(new MFRotation(getSardine4OrientInterp_4_51_keyValue_1()))
				.append(new MFRotation(getSardine4OrientInterp_4_51_keyValue_2()));
			return Sardine4OrientInterp_4_51_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine5PosnInterp' key field, scene-graph level=4, element #58, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine5PosnInterp_4_58_key()
		{
			MFFloat Sardine5PosnInterp_4_58_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine5PosnInterp_4_58_key_1()));
			return Sardine5PosnInterp_4_58_key;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine5PosnInterp' keyValue field, scene-graph level=4, element #58, 366 total numbers made up of 122 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getSardine5PosnInterp_4_58_keyValue()
		{
			MFVec3f Sardine5PosnInterp_4_58_keyValue = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getSardine5PosnInterp_4_58_keyValue_1()))
				.append(new MFVec3f(getSardine5PosnInterp_4_58_keyValue_2()));
			return Sardine5PosnInterp_4_58_keyValue;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine5OrientInterp' key field, scene-graph level=4, element #59, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine5OrientInterp_4_59_key()
		{
			MFFloat Sardine5OrientInterp_4_59_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine5OrientInterp_4_59_key_1()));
			return Sardine5OrientInterp_4_59_key;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine5OrientInterp' keyValue field, scene-graph level=4, element #59, 488 total numbers made up of 122 4-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFRotation getSardine5OrientInterp_4_59_keyValue()
		{
			MFRotation Sardine5OrientInterp_4_59_keyValue = new MFRotation()/*2.finalize*/
				.append(new MFRotation(getSardine5OrientInterp_4_59_keyValue_1()))
				.append(new MFRotation(getSardine5OrientInterp_4_59_keyValue_2()));
			return Sardine5OrientInterp_4_59_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine6PosnInterp' key field, scene-graph level=4, element #66, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine6PosnInterp_4_66_key()
		{
			MFFloat Sardine6PosnInterp_4_66_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine6PosnInterp_4_66_key_1()));
			return Sardine6PosnInterp_4_66_key;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine6PosnInterp' keyValue field, scene-graph level=4, element #66, 366 total numbers made up of 122 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getSardine6PosnInterp_4_66_keyValue()
		{
			MFVec3f Sardine6PosnInterp_4_66_keyValue = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getSardine6PosnInterp_4_66_keyValue_1()))
				.append(new MFVec3f(getSardine6PosnInterp_4_66_keyValue_2()));
			return Sardine6PosnInterp_4_66_keyValue;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine6OrientInterp' key field, scene-graph level=4, element #67, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine6OrientInterp_4_67_key()
		{
			MFFloat Sardine6OrientInterp_4_67_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine6OrientInterp_4_67_key_1()));
			return Sardine6OrientInterp_4_67_key;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine6OrientInterp' keyValue field, scene-graph level=4, element #67, 488 total numbers made up of 122 4-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFRotation getSardine6OrientInterp_4_67_keyValue()
		{
			MFRotation Sardine6OrientInterp_4_67_keyValue = new MFRotation()/*2.finalize*/
				.append(new MFRotation(getSardine6OrientInterp_4_67_keyValue_1()))
				.append(new MFRotation(getSardine6OrientInterp_4_67_keyValue_2()));
			return Sardine6OrientInterp_4_67_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine7PosnInterp' key field, scene-graph level=4, element #74, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine7PosnInterp_4_74_key()
		{
			MFFloat Sardine7PosnInterp_4_74_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine7PosnInterp_4_74_key_1()));
			return Sardine7PosnInterp_4_74_key;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine7PosnInterp' keyValue field, scene-graph level=4, element #74, 366 total numbers made up of 122 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getSardine7PosnInterp_4_74_keyValue()
		{
			MFVec3f Sardine7PosnInterp_4_74_keyValue = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getSardine7PosnInterp_4_74_keyValue_1()))
				.append(new MFVec3f(getSardine7PosnInterp_4_74_keyValue_2()));
			return Sardine7PosnInterp_4_74_keyValue;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine7OrientInterp' key field, scene-graph level=4, element #75, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine7OrientInterp_4_75_key()
		{
			MFFloat Sardine7OrientInterp_4_75_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine7OrientInterp_4_75_key_1()));
			return Sardine7OrientInterp_4_75_key;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine7OrientInterp' keyValue field, scene-graph level=4, element #75, 488 total numbers made up of 122 4-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFRotation getSardine7OrientInterp_4_75_keyValue()
		{
			MFRotation Sardine7OrientInterp_4_75_keyValue = new MFRotation()/*2.finalize*/
				.append(new MFRotation(getSardine7OrientInterp_4_75_keyValue_1()))
				.append(new MFRotation(getSardine7OrientInterp_4_75_keyValue_2()));
			return Sardine7OrientInterp_4_75_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine8PosnInterp' key field, scene-graph level=4, element #82, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine8PosnInterp_4_82_key()
		{
			MFFloat Sardine8PosnInterp_4_82_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine8PosnInterp_4_82_key_1()));
			return Sardine8PosnInterp_4_82_key;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine8PosnInterp' keyValue field, scene-graph level=4, element #82, 366 total numbers made up of 122 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getSardine8PosnInterp_4_82_keyValue()
		{
			MFVec3f Sardine8PosnInterp_4_82_keyValue = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getSardine8PosnInterp_4_82_keyValue_1()))
				.append(new MFVec3f(getSardine8PosnInterp_4_82_keyValue_2()));
			return Sardine8PosnInterp_4_82_keyValue;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine8OrientInterp' key field, scene-graph level=4, element #83, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine8OrientInterp_4_83_key()
		{
			MFFloat Sardine8OrientInterp_4_83_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine8OrientInterp_4_83_key_1()));
			return Sardine8OrientInterp_4_83_key;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine8OrientInterp' keyValue field, scene-graph level=4, element #83, 488 total numbers made up of 122 4-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFRotation getSardine8OrientInterp_4_83_keyValue()
		{
			MFRotation Sardine8OrientInterp_4_83_keyValue = new MFRotation()/*2.finalize*/
				.append(new MFRotation(getSardine8OrientInterp_4_83_keyValue_1()))
				.append(new MFRotation(getSardine8OrientInterp_4_83_keyValue_2()));
			return Sardine8OrientInterp_4_83_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine9PosnInterp' key field, scene-graph level=4, element #90, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine9PosnInterp_4_90_key()
		{
			MFFloat Sardine9PosnInterp_4_90_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine9PosnInterp_4_90_key_1()));
			return Sardine9PosnInterp_4_90_key;
		}
		/** Large attribute array: PositionInterpolator DEF='Sardine9PosnInterp' keyValue field, scene-graph level=4, element #90, 366 total numbers made up of 122 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getSardine9PosnInterp_4_90_keyValue()
		{
			MFVec3f Sardine9PosnInterp_4_90_keyValue = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getSardine9PosnInterp_4_90_keyValue_1()))
				.append(new MFVec3f(getSardine9PosnInterp_4_90_keyValue_2()));
			return Sardine9PosnInterp_4_90_keyValue;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine9OrientInterp' key field, scene-graph level=4, element #91, 122 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getSardine9OrientInterp_4_91_key()
		{
			MFFloat Sardine9OrientInterp_4_91_key = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getSardine9OrientInterp_4_91_key_1()));
			return Sardine9OrientInterp_4_91_key;
		}
		/** Large attribute array: OrientationInterpolator DEF='Sardine9OrientInterp' keyValue field, scene-graph level=4, element #91, 488 total numbers made up of 122 4-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFRotation getSardine9OrientInterp_4_91_keyValue()
		{
			MFRotation Sardine9OrientInterp_4_91_keyValue = new MFRotation()/*2.finalize*/
				.append(new MFRotation(getSardine9OrientInterp_4_91_keyValue_1()))
				.append(new MFRotation(getSardine9OrientInterp_4_91_keyValue_2()));
			return Sardine9OrientInterp_4_91_keyValue;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return SardineSchoolTriple model
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
        X3D thisExampleX3dModel = new SardineSchoolTriple().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.KelpForestExhibit.SardineSchoolTriple\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.KelpForestExhibit.SardineSchoolTriple\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}
