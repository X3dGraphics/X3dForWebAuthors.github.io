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
    meta(content='LodWithDifferentShapes.x3d',name='title'),
    meta(content='Example to demonstrate LOD forceTransitions field for animating different shapes, navigate in/out or else check Viewpoints to see each separate Shape',name='description'),
    meta(content='Leonard Daly and Don Brutzman',name='creator'),
    meta(content='21 July 2011',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='LOD.x3d',name='reference'),
    meta(content='https://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='Copyright (c) 2005, Daly Realism and Don Brutzman',name='rights'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/LodWithDifferentShapes.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='LodWithDifferentShapes.x3d'),
    Background(skyColor=[(1,1,1)]),
    NavigationInfo(type='"FLY" "ANY"'),
    Viewpoint(description='LOD at 4m shows Box',position=(0,0,4)),
    Viewpoint(description='LOD at 8m shows Cone',position=(0,0,8)),
    Viewpoint(description='LOD at 12m shows Cylinder',position=(0,0,12)),
    Viewpoint(description='LOD at 16m shows Sphere',position=(0,0,16)),
    LOD(DEF='Switcher',forceTransitions=True,range=[5,10,15],
      children=[
      Shape(DEF='BoxShape',
        geometry=Box(),
        appearance=Appearance(
          material=Material(diffuseColor=(1,0,0)))),
      Shape(DEF='ConeShape',
        geometry=Cone(),
        appearance=Appearance(
          material=Material(diffuseColor=(1,1,0)))),
      Shape(DEF='CylinderShape',
        geometry=Cylinder(),
        appearance=Appearance(
          material=Material(diffuseColor=(0,1,0)))),
      Shape(DEF='SphereShape',
        geometry=Sphere(),
        appearance=Appearance(
          material=Material(diffuseColor=(0,0,1))))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for LodWithDifferentShapes.py:')
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

print("python LodWithDifferentShapes.py load and self-test diagnostics complete.")
