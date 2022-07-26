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
    meta(content='BooleanSequencerIntegerSequencer.x3d',name='title'),
    meta(content='Show synchronized use of BooleanSequencer and IntegerSequencer nodes for SpotLight enabled and Switch whichChoice control, respectively',name='description'),
    meta(content='Don Brutzman',name='creator'),
    meta(content='6 September 2006',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/BooleanSequencerIntegerSequencer.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='BooleanSequencerIntegerSequencer.x3d'),
    NavigationInfo(),
    TimeSensor(DEF='Clock',cycleInterval=10,loop=True),
    BooleanSequencer(DEF='OnOffSequencer',key=[0,0.2,0.4,0.6,0.8,1],keyValue=[True,False,True,False,True,True]),
    SpotLight(DEF='RedSpotLight',color=(1,0.0,0.0),location=(0,0,10)),
    #  Note no red or pink materials, only grey 
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='OnOffSequencer'),
    ROUTE(fromField='value_changed',fromNode='OnOffSequencer',toField='on',toNode='RedSpotLight'),
    IntegerSequencer(DEF='ChildSequencer',key=[0,0.2,0.4,0.6,0.8,1],keyValue=[0,1,2,3,-1,0]),
    Transform(translation=(-3.5,1,0),
      children=[
      Switch(DEF='ShapeSwitcher',whichChoice=-1,
        children=[
        Shape(DEF='Child0',
          geometry=Text(string=["Grey child 0","headlight plus red light"]),
          appearance=Appearance(DEF='GreyAppearance',
            material=Material(diffuseColor=(0.7,0.7,0.7)))),
        Shape(DEF='Child1',
          geometry=Text(string=["Grey child 1","headlight only"]),
          appearance=Appearance(USE='GreyAppearance')),
        Shape(DEF='Child2',
          geometry=Text(string=["Grey child 2","headlight plus red light"]),
          appearance=Appearance(USE='GreyAppearance')),
        Shape(DEF='Child3',
          geometry=Text(string=["Grey child 3","headlight only"]),
          appearance=Appearance(USE='GreyAppearance'))])]),
    ROUTE(fromField='fraction_changed',fromNode='Clock',toField='set_fraction',toNode='ChildSequencer'),
    ROUTE(fromField='value_changed',fromNode='ChildSequencer',toField='whichChoice',toNode='ShapeSwitcher')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for BooleanSequencerIntegerSequencer.py:')
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

print("python BooleanSequencerIntegerSequencer.py load and self-test diagnostics complete.")
