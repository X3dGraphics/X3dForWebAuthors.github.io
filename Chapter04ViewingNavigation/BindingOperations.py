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
    meta(content='BindingOperations.x3d',name='title'),
    meta(content='Illustrate Viewpoint binding operations (in gory detail!) as described in Chapter 4 concepts. Scene design: a TimeSensor clock drives and IntegerSequencer for each t0/t1/etc. event, and a customized Script node sends bind/unbind events to the correct Viewpoint. Display the browser console to see occurrence of each event.',name='description'),
    meta(content='Don Brutzman',name='creator'),
    meta(content='5 January 2008',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='BindingOperations.console.txt',name='reference'),
    meta(content='BindingStackOperations.png',name='reference'),
    meta(content='X3D for Web Authors, Section 2.5.1, Figure 4.1',name='reference'),
    meta(content='https://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='Copyright Don Brutzman and Leonard Daly 2007',name='rights'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/BindingOperations.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='BindingOperations.x3d'),
    Viewpoint(DEF='View1',centerOfRotation=(-6,0,0),description='Viewpoint 1',position=(-6,0,5)),
    Viewpoint(DEF='View2',centerOfRotation=(-2,0,0),description='Viewpoint 2',position=(-2,0,5)),
    Viewpoint(DEF='View3',centerOfRotation=(2,0,0),description='Viewpoint 3',position=(2,0,5)),
    Viewpoint(DEF='View4',centerOfRotation=(6,0,0),description='Viewpoint 4',position=(6,0,5)),
    #  Script initialization ought to first bind view5 below. 
    Group(
      children=[
      Transform(DEF='Text1',translation=(-6,0,0),
        children=[
        Shape(
          geometry=Text(string=["View","# 1"],
            fontStyle=FontStyle(DEF='CenterJustify',justify=["MIDDLE","MIDDLE"])),
          appearance=Appearance(
            material=Material(diffuseColor=(1,0,0))))]),
      Transform(DEF='Text2',translation=(-2,0,0),
        children=[
        Shape(
          geometry=Text(string=["View","# 2"],
            fontStyle=FontStyle(USE='CenterJustify')),
          appearance=Appearance(
            material=Material(diffuseColor=(0,1,0))))]),
      Transform(DEF='Text3',translation=(2,0,0),
        children=[
        Shape(
          geometry=Text(string=["View","# 3"],
            fontStyle=FontStyle(USE='CenterJustify')),
          appearance=Appearance(
            material=Material(diffuseColor=(0,0,1))))]),
      Transform(DEF='Text4',translation=(6,0,0),
        children=[
        Shape(
          geometry=Text(string=["View","# 4"],
            fontStyle=FontStyle(USE='CenterJustify')),
          appearance=Appearance(
            material=Material(),))])]),
    #  The following advanced animation sequence uses nodes covered in Chapters 7, 8 and 9. 
    #  It does not need to be studied in this chapter. 
    Transform(translation=(0,-3,8),
      #  notice this next Viewpoint has been transformed with the text, so its position is relative. it is called view5 in the Script. 
      children=[
      Viewpoint(DEF='ClickToAnimateView',description='Select animation sequence',position=(0,0,7)),
      Shape(
        geometry=Text(string=["Click here to animate"],
          fontStyle=FontStyle(justify=["MIDDLE","BEGIN"])),
        appearance=Appearance(
          material=Material(diffuseColor=(0.8,0.4,0)))),
      Shape(
        geometry=Box(size=(7,1,0.02)),
        appearance=Appearance(
          material=Material(transparency=1))),
      TouchSensor(DEF='TextTouchSensor',description='Click to begin animating viewpoint selections'),
      TimeSensor(DEF='Clock',cycleInterval=10),
      ROUTE(fromField='touchTime',fromNode='TextTouchSensor',toField='set_startTime',toNode='Clock'),
      IntegerSequencer(DEF='TimingSequencer',key=[0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,1.0],keyValue=[0,1,2,3,4,5,6,7,8,10]),
      ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='TimingSequencer'),
      Script(DEF='BindingSequencerEngine',
        field=[
        field(accessType='inputOnly',name='set_timeEvent',type='SFInt32'),
        field(accessType='outputOnly',name='bindView1',type='SFBool'),
        field(accessType='outputOnly',name='bindView2',type='SFBool'),
        field(accessType='outputOnly',name='bindView3',type='SFBool'),
        field(accessType='outputOnly',name='bindView4',type='SFBool'),
        field(accessType='outputOnly',name='bindView5',type='SFBool'),
        field(accessType='inputOnly',name='view1Bound',type='SFBool'),
        field(accessType='inputOnly',name='view2Bound',type='SFBool'),
        field(accessType='inputOnly',name='view3Bound',type='SFBool'),
        field(accessType='inputOnly',name='view4Bound',type='SFBool'),
        field(accessType='initializeOnly',name='priorInputvalue',type='SFInt32',value=-1)],

      sourceCode="""
ecmascript:

function initialize ()
{
    bindView5 = true;
    Browser.print ('Timing script initialized and ready for activation');
}
function set_timeEvent (inputValue)
{
    if (inputValue == priorInputvalue)
    {
        return; // ignore repeated inputs
    }
    // new value provided
    priorInputvalue = inputValue;
    // Browser.print ('\ntimeEvent inputValue=' + inputValue);
        
    // mimics user execution of Figure 4.1 steps t_0 through t_8
    if (inputValue == 0)
    {
        Browser.print ('\n===========\n time t0');
        bindView1 = true;
    }
    else if (inputValue == 1)
    {
        Browser.print ('\n===========\n time t1');
        bindView2 = true;
    }
    else if (inputValue == 2)
    {
        Browser.print ('\n===========\n time t2');
        bindView3 = true;
    }
    else if (inputValue == 3)
    {
        Browser.print ('\n===========\n time t3');
        bindView3 = false;
    }
    else if (inputValue == 4)
    {
        Browser.print ('\n===========\n time t4');
        bindView1 = true;
    }
    else if (inputValue == 5)
    {
        Browser.print ('\n===========\n time t5');
        bindView2 = false;
    }
    else if (inputValue == 6)
    {
        Browser.print ('\n===========\n time t6');
        bindView1 = false;
    }
    else if (inputValue == 7)
    {
        Browser.print ('\n===========\n time t7');
        bindView4 = true;

    }
    else if (inputValue == 8)
    {
        Browser.print ('\n===========\n time t8');
        Browser.print (', no action, all done');
        Browser.print ('\n\n');
    }
}

function view1Bound (inputValue)
{
    Browser.print (', view1Bound ' + (inputValue));
    if (priorInputvalue == -1) Browser.print ('\n');
}
function view2Bound (inputValue)
{
    Browser.print (', view2Bound ' + (inputValue));
}
function view3Bound (inputValue)
{
    Browser.print (', view3Bound ' + (inputValue));
}
function view4Bound (inputValue)
{
    Browser.print (', view4Bound ' + (inputValue));
}
function view5Bound (inputValue)
{
    Browser.print (', view5Bound ' + (inputValue));
}
"""),
      #  drive Script with TimeSensor clock 
      ROUTE(fromField='value_changed',fromNode='TimingSequencer',toField='set_timeEvent',toNode='BindingSequencerEngine'),
      #  Script will bind and unbind Viewpoint nodes 
      ROUTE(fromField='bindView1',fromNode='BindingSequencerEngine',toField='set_bind',toNode='View1'),
      ROUTE(fromField='bindView2',fromNode='BindingSequencerEngine',toField='set_bind',toNode='View2'),
      ROUTE(fromField='bindView3',fromNode='BindingSequencerEngine',toField='set_bind',toNode='View3'),
      ROUTE(fromField='bindView4',fromNode='BindingSequencerEngine',toField='set_bind',toNode='View4'),
      ROUTE(fromField='bindView5',fromNode='BindingSequencerEngine',toField='set_bind',toNode='ClickToAnimateView'),
      #  Viewpoint nodes report bind and unbind events 
      ROUTE(fromField='isBound',fromNode='View1',toField='view1Bound',toNode='BindingSequencerEngine'),
      ROUTE(fromField='isBound',fromNode='View2',toField='view2Bound',toNode='BindingSequencerEngine'),
      ROUTE(fromField='isBound',fromNode='View3',toField='view3Bound',toNode='BindingSequencerEngine'),
      ROUTE(fromField='isBound',fromNode='View4',toField='view4Bound',toNode='BindingSequencerEngine')])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for BindingOperations.py:')
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

print("python BindingOperations.py load and self-test diagnostics complete.")
