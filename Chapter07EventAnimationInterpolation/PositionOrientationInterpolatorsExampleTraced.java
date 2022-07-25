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
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Text.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc annotations follow, see below for source.
/**
 * <p> Demonstrate use of PositionInterpolator and OrientationInterpolator to animate object motion, with console output tracing added for PositionInterpolator and ROUTE events. </p>
 <p> Related links: <a href="../../../Chapter07EventAnimationInterpolation/PositionOrientationInterpolatorsExampleTraced.java">PositionOrientationInterpolatorsExampleTraced.java</a> source, <a href="../../../Chapter07EventAnimationInterpolation/PositionOrientationInterpolatorsExampleTracedIndex.html" target="_top">PositionOrientationInterpolatorsExampleTraced catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter07EventAnimationInterpolation/PositionOrientationInterpolatorsExampleTraced.x3d">PositionOrientationInterpolatorsExampleTraced.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Demonstrate use of PositionInterpolator and OrientationInterpolator to animate object motion, with console output tracing added for PositionInterpolator and ROUTE events. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 5 August 2011 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter07EventAnimationInterpolation/Chapter07EventAnimationInterpolation-EventTracing.pdf">Chapter07EventAnimationInterpolation-EventTracing.pdf</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> PositionOrientationInterpolatorsExampleTracedConsole.txt </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> MovingImage </i> </td>
			<td> <a href="../../../Chapter07EventAnimationInterpolation/PositionOrientationInterpolatorsExample.mp4">PositionOrientationInterpolatorsExample.mp4</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Chapter07EventAnimationInterpolation/PositionOrientationInterpolatorsExample.x3d">PositionOrientationInterpolatorsExample.x3d</a> </td>
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
			<td style="text-align:right; vertical-align: text-top;"> <i> rights </i> </td>
			<td> Copyright Don Brutzman and Leonard Daly 2007 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> subject </i> </td>
			<td> X3D book, X3D graphics, X3D-Edit, <a href="http://www.x3dGraphics.com" target="_blank">http://www.x3dGraphics.com</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://savage.nps.edu/Savage/Tools/Animation/WaypointInterpolatorExample.x3d" target="_blank">https://savage.nps.edu/Savage/Tools/Animation/WaypointInterpolatorExample.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/PositionOrientationInterpolatorsExampleTraced.x3d" target="_blank">https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/PositionOrientationInterpolatorsExampleTraced.x3d</a> </td>
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

	* @author Don Brutzman
 */

public class PositionOrientationInterpolatorsExampleTraced
{
	/** Default constructor to create this object. */
	public PositionOrientationInterpolatorsExampleTraced ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("PositionOrientationInterpolatorsExampleTraced.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Demonstrate use of PositionInterpolator and OrientationInterpolator to animate object motion, with console output tracing added for PositionInterpolator and ROUTE events."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("5 August 2011"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("Chapter07EventAnimationInterpolation-EventTracing.pdf"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("PositionOrientationInterpolatorsExampleTracedConsole.txt"))
    .addMeta(new meta().setName(meta.NAME_MOVINGIMAGE).setContent("PositionOrientationInterpolatorsExample.mp4"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("PositionOrientationInterpolatorsExample.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://X3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_RIGHTS     ).setContent("Copyright Don Brutzman and Leonard Daly 2007"))
    .addMeta(new meta().setName(meta.NAME_SUBJECT    ).setContent("X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://savage.nps.edu/Savage/Tools/Animation/WaypointInterpolatorExample.x3d"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/PositionOrientationInterpolatorsExampleTraced.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("PositionOrientationInterpolatorsExampleTraced.x3d"))
    .addChild(new Viewpoint().setDescription("Animation demo").setOrientation(1.0,0.0,0.0,-0.588003).setPosition(0.0,8.0,12.0))
    .addChild(new Viewpoint().setDescription("View from above").setCenterOfRotation(5.0,0.1,5.0).setOrientation(1.0,0.0,0.0,-1.570796).setPosition(0.0,15.0,0.0))
    .addChild(new Transform("Pointer").setTranslation(1.0,0.0,1.0)
      .addChild(new Transform().setRotation(1.0,0.0,0.0,1.57)
        .addChild(new Shape()
          .setGeometry(new Cone().setBottomRadius(0.5).setHeight(1.5))
          .setAppearance(new Appearance()
            .setMaterial(new Material("ConeMaterial").setDiffuseColor(0.427451,1.0,0.160784))))))
    .addChild(new Shape("Floor")
      .setGeometry(new Box().setSize(12.0,0.05,12.0))
      .setAppearance(new Appearance()
        .setMaterial(new Material().setDiffuseColor(0.0,0.262745,0.941176))))
    .addComments(" note that final value equals first value in keyValue array in order to support smooth looping ")
    .addComments(" first drive around the location ")
    .addChild(new PositionInterpolator("PositionAnimator").setKey(new double[] {0.0,0.2,0.25,0.45,0.5,0.7,0.75,0.95,1.0}).setKeyValue(new MFVec3f(new double[] {-4.0,0.0,-4.0,-4.0,0.0,4.0,-4.0,0.0,4.0,4.0,0.0,4.0,4.0,0.0,4.0,4.0,0.0,-4.0,4.0,0.0,-4.0,-4.0,0.0,-4.0,-4.0,0.0,-4.0})))
    .addChild(new Group()
      .addComments(" ======= PositionInterpolator Trace ============================================== ")
      .addChild(new Script("Trace_PositionInterpolator_PositionAnimator").setMustEvaluate(true).setSourceCode("""
ecmascript:
    function value_changed (eventValue, timeStamp) {
      if (timeStamp - timeStampPreviousReport >= reportInterval) {
        Browser.print ('Trace_PositionInterpolator_PositionAnimator type=SFVec3f value_changed=' + eventValue.toString() + '\n');
        timeStampPreviousReport = timeStamp;
      }
    }
    function key (eventValue) {
      Browser.print ('Trace_PositionInterpolator_PositionAnimator type=MFFloat key=' + eventValue.toString() + '\n');
    }
    function keyValue (eventValue) {
      Browser.print ('Trace_PositionInterpolator_PositionAnimator type=MFVec3f keyValue=' + eventValue.toString() + '\n');
    }
""")
        .addField(new field().setName("reportInterval").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(1.0).setAppinfo("Sampling frequency in seconds (0 means all values)"))
        .addComments(" Trace ROUTEd values on X3D browser console ")
        .addField(new field().setName("value_changed").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("key").setType(field.TYPE_MFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("keyValue").setType(field.TYPE_MFVEC3F).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("timeStampPreviousReport").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(-1)))
      .addChild(new ROUTE().setFromNode("PositionAnimator").setFromField("value_changed").setToNode("Trace_PositionInterpolator_PositionAnimator").setToField("value_changed"))
      .addChild(new ROUTE().setFromNode("PositionAnimator").setFromField("key").setToNode("Trace_PositionInterpolator_PositionAnimator").setToField("key"))
      .addChild(new ROUTE().setFromNode("PositionAnimator").setFromField("keyValue").setToNode("Trace_PositionInterpolator_PositionAnimator").setToField("keyValue"))
      .addComments(" ======= PositionInterpolator Trace block complete ===================================================== "))
    .addChild(new ROUTE().setFromNode("PositionAnimator").setFromField("value_changed").setToNode("Pointer").setToField("translation"))
    .addChild(new Group()
      .addComments(" ======= ROUTE Trace ============================================== ")
      .addChild(new Script("Trace_ROUTE_PositionAnimator.value_changed_TO_Pointer.translation").setMustEvaluate(true).setSourceCode("""
ecmascript:
    function traceValue (eventValue, timeStamp) {
      // input eventValue received for trace field
      if (timeStamp - timeStampPreviousReport >= reportInterval) {
        Browser.print ('Trace_ROUTE_PositionAnimator.value_changed_TO_Pointer.translation type=SFVec3f value=' + eventValue.toString() + '\n');
        timeStampPreviousReport = timeStamp;
      }
    }
    function timeOfDay (someTime) {
      hh = Math.floor (someTime /(60*60)) % 24;
      mm = Math.floor (someTime / 60)     % 60;
      ss = Math.floor (someTime)          % 60;
      if (hh < 9) hour   = '0' + hh;
      else        hour   =       hh;
      if (mm < 9) minute = '0' + mm;
      else        minute =       mm;
      if (ss < 9) second = '0' + ss;
      else        second =       ss;
      return '(' + hour + ':' + minute + ':' + second + ' GMT)';
    }
""")
        .addComments(" Trace ROUTEd values on X3D browser console ")
        .addField(new field().setName("reportInterval").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(1.0).setAppinfo("Sampling frequency in seconds (0 means all values)"))
        .addField(new field().setName("traceValue").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("timeStampPreviousReport").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(-1)))
      .addChild(new ROUTE().setFromNode("PositionAnimator").setFromField("value_changed").setToNode("Trace_ROUTE_PositionAnimator.value_changed_TO_Pointer.translation").setToField("traceValue"))
      .addComments(" ======= ROUTE Trace block complete ===================================================== "))
    .addComments(" then rotate the pointer to match next direction while paused at each position ")
    .addChild(new OrientationInterpolator("OrientationAnimator").setKey(new double[] {0.0,0.2,0.25,0.45,0.5,0.7,0.75,0.95,1.0}).setKeyValue(new MFRotation(new double[] {0.0,1.0,0.0,0.0,0.0,1.0,0.0,0.0,0.0,1.0,0.0,1.57,0.0,1.0,0.0,1.57,0.0,1.0,0.0,3.14,0.0,1.0,0.0,3.14,0.0,1.0,0.0,4.71,0.0,1.0,0.0,4.71,0.0,1.0,0.0,6.283})))
    .addComments(" final rotation value is 2pi rather than 0 so that rotation animation is smooth, not flip-flopping ")
    .addChild(new ROUTE().setFromNode("OrientationAnimator").setFromField("value_changed").setToNode("Pointer").setToField("set_rotation"))
    .addComments(" put TimeSensor clock last so that animation design pattern and ROUTE events flow upward ")
    .addChild(new TimeSensor("AnimationClock").setCycleInterval(10).setLoop(true))
    .addChild(new ROUTE().setFromNode("AnimationClock").setFromField("fraction_changed").setToNode("PositionAnimator").setToField("set_fraction"))
    .addChild(new Group()
      .addComments(" ======= ROUTE Trace ============================================== ")
      .addChild(new Script("Trace_ROUTE_AnimationClock.fraction_changed_TO_PositionAnimator.set_fraction").setMustEvaluate(true).setSourceCode("""
ecmascript:
    function traceValue (eventValue, timeStamp) {
      // input eventValue received for trace field
      if (timeStamp - timeStampPreviousReport >= reportInterval) {
        Browser.print ('Trace_ROUTE_AnimationClock.fraction_changed_TO_PositionAnimator.set_fraction type=SFFloat value=' + eventValue + '\n');
        timeStampPreviousReport = timeStamp;
      }
    }
    function timeOfDay (someTime) {
      hh = Math.floor (someTime /(60*60)) % 24;
      mm = Math.floor (someTime / 60)     % 60;
      ss = Math.floor (someTime)          % 60;
      if (hh < 9) hour   = '0' + hh;
      else        hour   =       hh;
      if (mm < 9) minute = '0' + mm;
      else        minute =       mm;
      if (ss < 9) second = '0' + ss;
      else        second =       ss;
      return '(' + hour + ':' + minute + ':' + second + ' GMT)';
    }
""")
        .addComments(" Trace ROUTEd values on X3D browser console ")
        .addField(new field().setName("reportInterval").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(1.0).setAppinfo("Sampling frequency in seconds (0 means all values)"))
        .addField(new field().setName("traceValue").setType(field.TYPE_SFFLOAT).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("timeStampPreviousReport").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(-1)))
      .addChild(new ROUTE().setFromNode("AnimationClock").setFromField("fraction_changed").setToNode("Trace_ROUTE_AnimationClock.fraction_changed_TO_PositionAnimator.set_fraction").setToField("traceValue"))
      .addComments(" ======= ROUTE Trace block complete ===================================================== "))
    .addChild(new ROUTE().setFromNode("AnimationClock").setFromField("fraction_changed").setToNode("OrientationAnimator").setToField("set_fraction"))
    .addComments(" notice that explanatory Text is placed later in scene although it is graphically located above driving plane ")
    .addChild(new Transform().setTranslation(0.0,4.0,0.0)
      .addChild(new Billboard().setAxisOfRotation(0.0,0.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"Animation using PositionInterpolator","and OrientationInterpolator"})
            .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.6)))
          .setAppearance(new Appearance()
            .setMaterial(new Material()))))));
    }
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return PositionOrientationInterpolatorsExampleTraced model
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
        X3D thisExampleX3dModel = new PositionOrientationInterpolatorsExampleTraced().getX3dModel();

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
			System.out.println("WARNING: \"X3dForWebAuthors.Chapter07EventAnimationInterpolation.PositionOrientationInterpolatorsExampleTraced\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
		else if (hasArguments) // if no arguments provided, this method produces usage warning
			thisExampleX3dModel.handleArguments(args);

		if (validate)
		{
			System.out.print("Java program \"X3dForWebAuthors.Chapter07EventAnimationInterpolation.PositionOrientationInterpolatorsExampleTraced\" self-validation test results: ");
			String validationResults = thisExampleX3dModel.validationReport();
            if (validationResults.startsWith("\n"))
                System.out.println();
			System.out.println(validationResults.trim());
		}
    }
}