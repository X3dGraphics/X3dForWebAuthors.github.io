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
    meta(content='BackgroundSequencer.x3d',name='title'),
    meta(content='Cycle through four Background nodes to show a time-of-day effect.',name='description'),
    meta(content='Dale Tourtelotte, Don Brutzman and MV4205 class',name='creator'),
    meta(content='20 April 2009',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundColorsOnly.x3d',name='reference'),
    meta(content='X3D Background example',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundSequencer.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='BackgroundSequencer.x3d'),
    Transform(translation=(0,3,0),
      children=[
      Shape(
        geometry=Text(string=["Background Sequencer"],
          fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"])),
        appearance=Appearance(
          material=Material(),))]),
    TimeSensor(DEF='TimeOfDayClock',cycleInterval=12,loop=True),
    IntegerSequencer(DEF='BackgroundSequencer',key=[0,0.25,0.5,0.75,1],keyValue=[0,1,2,3,0]),
    ROUTE(fromField='fraction_changed',fromNode='TimeOfDayClock',toField='set_fraction',toNode='BackgroundSequencer'),
    Script(DEF='SelectorScript',
      field=[
      field(accessType='inputOnly',name='whichBackground',type='SFInt32'),
      field(accessType='inputOutput',name='currentBackground',type='SFInt32',value=-1),
      field(accessType='outputOnly',name='bind0',type='SFBool'),
      field(accessType='outputOnly',name='bind1',type='SFBool'),
      field(accessType='outputOnly',name='bind2',type='SFBool'),
      field(accessType='outputOnly',name='bind3',type='SFBool')],

    sourceCode="""
ecmascript:
function whichBackground (inputValue)
{
    if (currentBackground == inputValue)
        return; // avoid rapid Background binding (probably overcautious)
    currentBackground = inputValue; // remember state
    Browser.println ("currentBackground=" + currentBackground);
    if      (inputValue == 0) bind0 = true; // send event
    else if (inputValue == 1) bind1 = true; // send event
    else if (inputValue == 2) bind2 = true; // send event
    else if (inputValue == 3) bind3 = true; // send event
}
"""),
    ROUTE(fromField='value_changed',fromNode='BackgroundSequencer',toField='whichBackground',toNode='SelectorScript'),
    Background(DEF='SunRiseSky',groundAngle=[0.75,1.2,1.25,1.26,1.5,1.57],groundColor=[(0.133333,0.419608,0),(0.36,0.1,0),(1,0.74,0.4),(1,0.74,0.4),(0,0,0.5),(0,0,0.2),(0,0.231373,0.380392)],skyAngle=[0.5,0.7,1.35,1.45,1.57],skyColor=[(0,0.035,0.34),(0,0.015,0.44),(0,0.05,0.5),(0,0.1,0.6),(0.44,0.8,1),(1,1,0.7)]),
    Background(DEF='HighNoonSky',groundAngle=[0.75,1.2,1.25,1.26,1.57],groundColor=[(0.133333,0.419608,0),(0.36,0.1,0),(1,0.74,0.4),(1,0.74,0.4),(0,0.2,0.75),(0,0.1,0.5)],skyAngle=[0.05,0.07,1.57],skyColor=[(1,1,0.2),(1,1,0),(0.36,0.63,1),(0,0.4,1)]),
    Background(DEF='SunsetSky',groundAngle=[0.75,1.2,1.25,1.26,1.57],groundColor=[(0.133333,0.419608,0),(0.36,0.1,0),(1,0.74,0.4),(1,0.74,0.4),(0,0,0.5),(0,0,0.2)],skyAngle=[0.5,0.7,1.2,1.4,1.57],skyColor=[(0,0,0.38),(0,0,0.68),(0.5,0.2,1),(0.5,0.2,1),(1,0.3,0),(1,0.2,0.8)]),
    Background(DEF='NightSky',groundAngle=[0.75,1.2,1.25,1.26,1.57],groundColor=[(0.133333,0.419608,0),(0.36,0.1,0),(1,0.74,0.4),(1,0.74,0.4),(0,0,0.5),(0,0,0.2)],skyAngle=[0.03,0.05,1.57],skyColor=[(1,1,1),(0.8,0.8,0.8),(0.1,0.1,0.1),(0,0,0)]),
    ROUTE(fromField='bind0',fromNode='SelectorScript',toField='set_bind',toNode='SunRiseSky'),
    ROUTE(fromField='bind1',fromNode='SelectorScript',toField='set_bind',toNode='HighNoonSky'),
    ROUTE(fromField='bind2',fromNode='SelectorScript',toField='set_bind',toNode='SunsetSky'),
    ROUTE(fromField='bind3',fromNode='SelectorScript',toField='set_bind',toNode='NightSky')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for BackgroundSequencer.py:')
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

print("python BackgroundSequencer.py load and self-test diagnostics complete.")
