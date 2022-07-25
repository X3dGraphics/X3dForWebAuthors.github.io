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

newModel=X3D(profile='Interchange',version='3.3',
  head=head(
    children=[
    meta(content='TransformCenterOffsetForRotation.x3d',name='title'),
    meta(content='Use Transform center field to compare original Cylinder (left) to rotation about middle of object (middle Cylinder) to rotation about bottom of object (right Cylinder).',name='description'),
    meta(content='Don Brutzman',name='creator'),
    meta(content='28 January 2008',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='https://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='Copyright Don Brutzman and Leonard Daly 2007',name='rights'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/TransformCenterOffsetForRotation.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  leftmost cylinder is vertical 
    children=[
    WorldInfo(title='TransformCenterOffsetForRotation.x3d'),
    Transform(translation=(-3.5,0,0),
      children=[
      Shape(DEF='TallCylinder',
        geometry=Cylinder(height=4),
        appearance=Appearance(
          material=Material(diffuseColor=(0.941176,0.027451,0))))]),
    #  center cylinder rotated -45 degrees about center 
    Transform(rotation=(0,0,1,-0.78),
      children=[
      Shape(USE='TallCylinder')]),
    #  rightmost cylinder rotated -45 degrees about base 
    Transform(center=(0,-2,0),rotation=(0,0,1,-0.78),translation=(3.5,0,0),
      children=[
      Shape(USE='TallCylinder')]),
    Shape(DEF='FlatBox',
      geometry=Box(size=(7,0.1,2)),
      appearance=Appearance(
        material=Material(diffuseColor=(0,0.643137,0.960784)))),
    Transform(translation=(0,-2,0),
      children=[
      Shape(USE='FlatBox')])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for TransformCenterOffsetForRotation.py:')
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

print("python TransformCenterOffsetForRotation.py load and self-test diagnostics complete.")