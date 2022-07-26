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
    meta(content='OrderOfOperations2.x3d',name='title'),
    meta(content='Illustration of Order of Operations: initial, intermediate and final results for scale, rotation, and translation operations.',name='description'),
    meta(content='Leonard Daly',name='creator'),
    meta(content='22 May 2006',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='https://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='Copyright (c) 2006, Daly Realism and Don Brutzman',name='rights'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/OrderOfOperations2.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='OrderOfOperations2.x3d'),
    Background(skyColor=[(1,1,1)]),
    Viewpoint(description='Order of operations 2',orientation=(0.66238,-0.73267,0.15637,0.623402),position=(-2,-2,4)),
    Shape(DEF='OriginSphere',
      appearance=Appearance(
        material=Material(diffuseColor=(1,0.2,0.2))),
      geometry=Sphere(radius=0.2)),
    Shape(DEF='InitialBox',
      appearance=Appearance(
        material=Material(),),
      geometry=Box(DEF='Box.3.6.9',size=(0.3,0.6,0.9))),
    Transform(scale=(3,2,1.5),
      children=[
      Shape(DEF='ScaledBox',
        appearance=Appearance(
          material=Material(diffuseColor=(1,0.5,0),transparency=0.8)),
        geometry=Box(USE='Box.3.6.9'))]),
    Transform(rotation=(0.3,0.3,0.3,1),scale=(3,2,1.5),
      children=[
      Shape(DEF='RotatedScaledBox',
        appearance=Appearance(
          material=Material(diffuseColor=(1,.5,0),transparency=.85)),
        geometry=Box(USE='Box.3.6.9'))]),
    Transform(rotation=(0.3,0.3,0.3,1),scale=(3,2,1.5),translation=(1,1,0),
      children=[
      Shape(DEF='TransformedBox',
        appearance=Appearance(
          material=Material(diffuseColor=(1,.5,0))),
        geometry=Box(USE='Box.3.6.9'))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for OrderOfOperations2.py:')
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

print("python OrderOfOperations2.py load and self-test diagnostics complete.")
