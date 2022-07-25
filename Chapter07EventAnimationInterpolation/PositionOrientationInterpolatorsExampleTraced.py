####################################################################################################
#
# Now available: developmental python x3d.py package on PyPi for import.
#   This approach simplifies Python X3D deployment and use.
#   https://pypi.org/project/x3d
#
# Installation:
#       pip install x3d
# or
#       python -m pip install x3d
#
# Developer options for loading x3d package:
#
#    from x3d import *  # preferred approach, terser source that avoids x3d.* class prefixes
#
# or
#    import x3d         # traditional way to subclass x3d package, all classes require x3d.* prefix,
#                       # but python source is very verbose, for example x3d.Material x3d.Shape etc.
#                       # X3dToPython.xslt stylesheet insertPackagePrefix=true supports this option.
#
####################################################################################################

from x3d import *

newModel=X3D(profile='Immersive',version='3.3',
  head=head(
    children=[
    meta(content='PositionOrientationInterpolatorsExampleTraced.x3d',name='title'),
    meta(content='Demonstrate use of PositionInterpolator and OrientationInterpolator to animate object motion, with console output tracing added for PositionInterpolator and ROUTE events.',name='description'),
    meta(content='Don Brutzman',name='creator'),
    meta(content='5 August 2011',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Chapter07EventAnimationInterpolation-EventTracing.pdf',name='reference'),
    meta(content='PositionOrientationInterpolatorsExampleTracedConsole.txt',name='reference'),
    meta(content='PositionOrientationInterpolatorsExample.mp4',name='MovingImage'),
    meta(content='PositionOrientationInterpolatorsExample.x3d',name='reference'),
    meta(content='https://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='Copyright Don Brutzman and Leonard Daly 2007',name='rights'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='https://savage.nps.edu/Savage/Tools/Animation/WaypointInterpolatorExample.x3d',name='reference'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/PositionOrientationInterpolatorsExampleTraced.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='PositionOrientationInterpolatorsExampleTraced.x3d'),
    Viewpoint(description='Animation demo',orientation=(1,0,0,-0.588003),position=(0,8,12)),
    Viewpoint(centerOfRotation=(5,0.1,5),description='View from above',orientation=(1,0,0,-1.570796),position=(0,15,0)),
    Transform(DEF='Pointer',translation=(1,0,1),
      children=[
      Transform(rotation=(1,0,0,1.57),
        children=[
        Shape(
          geometry=Cone(bottomRadius=0.5,height=1.5),
          appearance=Appearance(
            material=Material(DEF='ConeMaterial',diffuseColor=(0.427451,1,0.160784))))])]),
    Shape(DEF='Floor',
      geometry=Box(size=(12,0.05,12)),
      appearance=Appearance(
        material=Material(diffuseColor=(0,0.262745,0.941176)))),
    #  note that final value equals first value in keyValue array in order to support smooth looping 
    #  first drive around the location 
    PositionInterpolator(DEF='PositionAnimator',key=[0,0.2,0.25,0.45,0.5,0.7,0.75,0.95,1],keyValue=[(-4,0,-4),(-4,0,4),(-4,0,4),(4,0,4),(4,0,4),(4,0,-4),(4,0,-4),(-4,0,-4),(-4,0,-4)]),
    Group(
      #  ======= PositionInterpolator Trace ============================================== 
      children=[
      Script(DEF='Trace_PositionInterpolator_PositionAnimator',mustEvaluate=True,
        field=[
        field(accessType='initializeOnly',appinfo='Sampling frequency in seconds (0 means all values)',name='reportInterval',type='SFTime',value=1.0),
        #  Trace ROUTEd values on X3D browser console 
        field(accessType='inputOnly',name='value_changed',type='SFVec3f'),
        field(accessType='inputOnly',name='key',type='MFFloat'),
        field(accessType='inputOnly',name='keyValue',type='MFVec3f'),
        field(accessType='initializeOnly',name='timeStampPreviousReport',type='SFTime',value=-1)],

      sourceCode="""
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
"""),
      ROUTE(fromField='value_changed',fromNode='PositionAnimator',toField='value_changed',toNode='Trace_PositionInterpolator_PositionAnimator'),
      ROUTE(fromField='key',fromNode='PositionAnimator',toField='key',toNode='Trace_PositionInterpolator_PositionAnimator'),
      ROUTE(fromField='keyValue',fromNode='PositionAnimator',toField='keyValue',toNode='Trace_PositionInterpolator_PositionAnimator')]
      #  ======= PositionInterpolator Trace block complete ===================================================== 
      ),
    ROUTE(fromField='value_changed',fromNode='PositionAnimator',toField='translation',toNode='Pointer'),
    Group(
      #  ======= ROUTE Trace ============================================== 
      children=[
      Script(DEF='Trace_ROUTE_PositionAnimator.value_changed_TO_Pointer.translation',mustEvaluate=True,
        #  Trace ROUTEd values on X3D browser console 
        field=[
        field(accessType='initializeOnly',appinfo='Sampling frequency in seconds (0 means all values)',name='reportInterval',type='SFTime',value=1.0),
        field(accessType='inputOnly',name='traceValue',type='SFVec3f'),
        field(accessType='initializeOnly',name='timeStampPreviousReport',type='SFTime',value=-1)],

      sourceCode="""
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
"""),
      ROUTE(fromField='value_changed',fromNode='PositionAnimator',toField='traceValue',toNode='Trace_ROUTE_PositionAnimator.value_changed_TO_Pointer.translation')]
      #  ======= ROUTE Trace block complete ===================================================== 
      ),
    #  then rotate the pointer to match next direction while paused at each position 
    OrientationInterpolator(DEF='OrientationAnimator',key=[0,0.2,0.25,0.45,0.5,0.7,0.75,0.95,1],keyValue=[(0,1,0,0),(0,1,0,0),(0,1,0,1.57),(0,1,0,1.57),(0,1,0,3.14),(0,1,0,3.14),(0,1,0,4.71),(0,1,0,4.71),(0,1,0,6.283)]),
    #  final rotation value is 2pi rather than 0 so that rotation animation is smooth, not flip-flopping 
    ROUTE(fromField='value_changed',fromNode='OrientationAnimator',toField='set_rotation',toNode='Pointer'),
    #  put TimeSensor clock last so that animation design pattern and ROUTE events flow upward 
    TimeSensor(DEF='AnimationClock',cycleInterval=10,loop=True),
    ROUTE(fromField='fraction_changed',fromNode='AnimationClock',toField='set_fraction',toNode='PositionAnimator'),
    Group(
      #  ======= ROUTE Trace ============================================== 
      children=[
      Script(DEF='Trace_ROUTE_AnimationClock.fraction_changed_TO_PositionAnimator.set_fraction',mustEvaluate=True,
        #  Trace ROUTEd values on X3D browser console 
        field=[
        field(accessType='initializeOnly',appinfo='Sampling frequency in seconds (0 means all values)',name='reportInterval',type='SFTime',value=1.0),
        field(accessType='inputOnly',name='traceValue',type='SFFloat'),
        field(accessType='initializeOnly',name='timeStampPreviousReport',type='SFTime',value=-1)],

      sourceCode="""
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
"""),
      ROUTE(fromField='fraction_changed',fromNode='AnimationClock',toField='traceValue',toNode='Trace_ROUTE_AnimationClock.fraction_changed_TO_PositionAnimator.set_fraction')]
      #  ======= ROUTE Trace block complete ===================================================== 
      ),
    ROUTE(fromField='fraction_changed',fromNode='AnimationClock',toField='set_fraction',toNode='OrientationAnimator'),
    #  notice that explanatory Text is placed later in scene although it is graphically located above driving plane 
    Transform(translation=(0,4,0),
      children=[
      Billboard(axisOfRotation=(0,0,0),
        children=[
        Shape(
          geometry=Text(string=["Animation using PositionInterpolator","and OrientationInterpolator"],
            fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.6)),
          appearance=Appearance(
            material=Material(),))])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for PositionOrientationInterpolatorsExampleTraced.py:')
if        metaDiagnostics(newModel): # built-in utility method in X3D class
    print(metaDiagnostics(newModel)) # display meta info, hint, warning, error, TODO values in this model
# print('check newModel.XML() serialization...')
newModelXML= newModel.XML() # test export method XML() for exceptions during export
newModel.XMLvalidate()
# print(newModelXML) # diagnostic

try:
#   print('check newModel.VRML() serialization...')
    newModelVRML=newModel.VRML() # test export method VRML() for exceptions during export
    # print(prependLineNumbers(newModelVRML)) # debug
    print("Python-to-VRML export of VRML output successful", flush=True)
except Exception as err: # usually BaseException
    # https://stackoverflow.com/questions/18176602/how-to-get-the-name-of-an-exception-that-was-caught-in-python
    print("*** Python-to-VRML export of VRML output failed:", type(err).__name__, err)
    if newModelVRML: # may have failed to generate
        print(prependLineNumbers(newModelVRML, err.lineno))

try:
#   print('check newModel.JSON() serialization...')
    newModelJSON=newModel.JSON() # test export method JSON() for exceptions during export
#   print(prependLineNumbers(newModelJSON)) # debug
    print("Python-to-JSON export of JSON output successful (under development)")
except Exception as err: # usually SyntaxError
    print("*** Python-to-JSON export of JSON output failed:", type(err).__name__, err)
    if newModelJSON: # may have failed to generate
        print(prependLineNumbers(newModelJSON,err.lineno))

print("python PositionOrientationInterpolatorsExampleTraced.py load and self-test diagnostics complete.")
