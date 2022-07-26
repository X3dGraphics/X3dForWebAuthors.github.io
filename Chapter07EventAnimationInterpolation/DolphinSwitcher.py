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
    meta(content='DolphinSwitcher.x3d',name='title'),
    meta(content='Switch animation among three different dolphin poses in a freeze-frame style.',name='description'),
    meta(content='Chris Lang',name='creator'),
    meta(content='1 August 2007',name='created'),
    meta(content='1 April 2020',name='modified'),
    meta(content='DolphinMorpher.x3d',name='reference'),
    meta(content='DolphinPose01.x3d',name='reference'),
    meta(content='DolphinPose02.x3d',name='reference'),
    meta(content='DolphinPose03.x3d',name='reference'),
    meta(content='https://savage.nps.edu/Savage/Biologics/Dolphin/DolphinSwitcher.x3d',name='reference'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/DolphinSwitcher.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='DolphinSwitcher.x3d'),
    Background(groundColor=[(1,1,1)],skyColor=[(1,1,1)]),
    Viewpoint(description='Dolphin switcher, 2m away',position=(0,0,2)),
    #  Modify the whichChoice value in this Switch to 0, 1 or 2 to see the various versions of the model. Select whichChoice= -1 to show nothing. 
    Switch(DEF='Switch',whichChoice=2,
      #  whichChoice values are 0, 1, 2 for these three children 
      children=[
      Group(DEF='CurvedUpwardPose',
        children=[
        Inline(url=["DolphinPose02.x3d","https://savage.nps.edu/Savage/Biologics/Dolphin/DolphinPose02.x3d"])]),
      Group(DEF='NeutralPose',
        children=[
        Inline(url=["DolphinPose01.x3d","https://savage.nps.edu/Savage/Biologics/Dolphin/DolphinPose01.x3d"])]),
      Group(DEF='CurvedDownwardPose',
        children=[
        Inline(url=["DolphinPose03.x3d","https://savage.nps.edu/Savage/Biologics/Dolphin/DolphinPose03.x3d"])])]),
    IntegerSequencer(DEF='Sequencer',key=[0,0.25,0.5,0.75,1],keyValue=[0,1,2,1,0]),
    TimeSensor(DEF='Time',cycleInterval=4,loop=True),
    ROUTE(fromField='value_changed',fromNode='Sequencer',toField='whichChoice',toNode='Switch'),
    ROUTE(fromField='fraction_changed',fromNode='Time',toField='set_fraction',toNode='Sequencer')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for DolphinSwitcher.py:')
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

print("python DolphinSwitcher.py load and self-test diagnostics complete.")
