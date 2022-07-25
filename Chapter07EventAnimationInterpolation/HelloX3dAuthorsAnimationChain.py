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
    meta(content='HelloX3dAuthorsAnimationChain.x3d',name='title'),
    meta(content='Don Brutzman',name='creator'),
    meta(content='5 October 2000',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Fully developed animation-chain example showing spinning globe and text: Hello!',name='description'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter07EventAnimationInterpolation/HelloX3dAuthorsAnimationChain.x3d',name='identifier'),
    meta(content='https://www.web3d.org/x3d/content/examples/Basic/course/HelloX3dAuthorsAnimationChain.x3d',name='reference'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(info=["an introductory scene"],title='Hello X3D Authors Animation Chain'),
    Viewpoint(description='Hello, world',orientation=(0,1,0,3.14159),position=(0,0,-8)),
    #  change TimeSensor loop='true' to enable automatic animation when loaded, rather than TouchSensor trigger to start 
    TimeSensor(DEF='OrbitalTimeInterval',cycleInterval=12),
    OrientationInterpolator(DEF='SpinThoseThings',key=[0.00,0.25,0.50,0.75,1.00],keyValue=[(0,1,0,0),(0,1,0,1.57079),(0,1,0,3.14159),(0,1,0,4.7123889),(0,1,0,6.2831852)]),
    ROUTE(fromField='fraction_changed',fromNode='OrbitalTimeInterval',toField='set_fraction',toNode='SpinThoseThings'),
    Transform(DEF='EarthCoordinateSystem',
      children=[
      ROUTE(fromField='value_changed',fromNode='SpinThoseThings',toField='set_rotation',toNode='EarthCoordinateSystem'),
      Group(DEF='MiniWorld',
        children=[
        Shape(
          appearance=Appearance(
            texture=ImageTexture(url=["../../earth-topo.png","../../earth-topo.gif","../../earth-topo-small.gif","https://X3dGraphics.com/examples/X3dForWebAuthors/earth-topo.png","https://X3dGraphics.com/examples/X3dForWebAuthors/earth-topo.gif","https://X3dGraphics.com/examples/X3dForWebAuthors/earth-topo-small.gif"])),
          geometry=Sphere(),)]),
      Transform(DEF='SimpleGeoStationarySatellite',rotation=(1,0,0,.3),scale=(0.1,0.3,0.1),translation=(0,0,5),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.9,0.1,0.1),emissiveColor=(0.9,0.2,0.1))),
          geometry=Text(string=["Hello X3D Authors !!"],
            fontStyle=FontStyle(size=3)))]),
      TouchSensor(DEF='ClickTriggerTouchSensor',description='Click to start animation'),
      ROUTE(fromField='touchTime',fromNode='ClickTriggerTouchSensor',toField='startTime',toNode='OrbitalTimeInterval')])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for HelloX3dAuthorsAnimationChain.py:')
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

print("python HelloX3dAuthorsAnimationChain.py load and self-test diagnostics complete.")
