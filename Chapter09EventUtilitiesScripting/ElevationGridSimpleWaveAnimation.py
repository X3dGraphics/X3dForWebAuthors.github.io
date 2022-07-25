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
    meta(content='ElevationGridSimpleWaveAnimation.x3d',name='title'),
    meta(content='Simple Javascript animation of ElevationGrid',name='description'),
    meta(content='Don Brutzman',name='creator'),
    meta(content='2 December 2012',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='ElevationGridSimpleWaveAnimation.png',name='Image'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/ElevationGridSimpleWaveAnimation.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='ElevationGridSimpleWaveAnimation.x3d'),
    Viewpoint(description='Wave view',orientation=(1,0,0,-0.358771),position=(0,3,8)),
    Background(groundColor=[(1,1,1)],skyColor=[(1,1,1)]),
    #  Shift zero-based ElevationGrid to left, centering it 
    Transform(translation=(-4,0,0),
      children=[
      Shape(
        geometry=ElevationGrid(DEF='GridSurface',height=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],solid=False,xDimension=9,zDimension=3),
        appearance=Appearance(
          material=Material(diffuseColor=(0,0.5,1))))]),
    TimeSensor(DEF='Clock',cycleInterval=5,loop=True),
    Script(DEF='WaveGenerationScript',
      field=[
      field(accessType='inputOnly',appinfo='provide value and trigger new computation',name='newInputValue',type='SFFloat'),
      field(accessType='outputOnly',appinfo='provide values to ElevationGrid',name='gridOutput',type='MFFloat'),
      field(accessType='initializeOnly',appinfo='wave variation',name='waveStep',type='SFTime',value=0.1)],

    sourceCode="""
ecmascript:

function newInputValue (eventValue)
{
   fraction = eventValue; // connected by ROUTE, receives values from TimeSensor Clock fraction_changed
   
   value0 = 0.2 * Math.sin (2 * Math.PI * (fraction - 4*waveStep));
   value1 = 0.2 * Math.sin (2 * Math.PI * (fraction - 3*waveStep));
   value2 = 0.2 * Math.sin (2 * Math.PI * (fraction - 2*waveStep));
   value3 = 0.2 * Math.sin (2 * Math.PI * (fraction -   waveStep));
   value4 = 0.2 * Math.sin (2 * Math.PI * (fraction             ));
   value5 = 0.2 * Math.sin (2 * Math.PI * (fraction +   waveStep));
   value6 = 0.2 * Math.sin (2 * Math.PI * (fraction + 2*waveStep));
   value7 = 0.2 * Math.sin (2 * Math.PI * (fraction + 3*waveStep));
   value8 = 0.2 * Math.sin (2 * Math.PI * (fraction + 4*waveStep));
   
   // setting the gridOutput value creates an output event that is connected via ROUTE to the ElevationGrid set_height field.
   // note that types match (MFFloat) and accessTypes also match (output_only connects to inputOnly).
   gridOutput = new MFFloat (
		value0, value1, value2, value3, value4, value5, value6, value7, value8,
		value0, value1, value2, value3, value4, value5, value6, value7, value8,
		value0, value1, value2, value3, value4, value5, value6, value7, value8 );
}
"""),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='newInputValue',toNode='WaveGenerationScript'),
    ROUTE(fromField='gridOutput',fromNode='WaveGenerationScript',toField='set_height',toNode='GridSurface')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for ElevationGridSimpleWaveAnimation.py:')
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

print("python ElevationGridSimpleWaveAnimation.py load and self-test diagnostics complete.")
