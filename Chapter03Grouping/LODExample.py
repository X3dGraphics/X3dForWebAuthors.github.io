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
    meta(content='LODExample.x3d',name='title'),
    meta(content='Example for LOD node',name='description'),
    meta(content='Leonard Daly and Don Brutzman',name='creator'),
    meta(content='14 November 2005',name='created'),
    meta(content='14 June 2020',name='modified'),
    meta(content='https://github.com/create3000/x_ite/issues/38',name='reference'),
    meta(content='https://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='Copyright 2006, Daly Realism and Don Brutzman',name='rights'),
    meta(content='X3DJSAIL: Warning: NavigationInfo type newValue=""FLY" "ANY"" has an unrecognized value not matching any of the optional string tokens.',name='warning'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/LODExample.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    Background(skyColor=[(1,1,1)]),
    NavigationInfo(type='"FLY" "ANY"'),
    Viewpoint(description='Book View - Near, all shapes shown',orientation=(0.866,-0.497,0.058,-0.59),position=(1.2,1.98,3.4)),
    Viewpoint(description='Book View - Farther, texture shown',orientation=(0.866,-0.497,0.058,-0.59),position=(1.47,2.43,4.18)),
    Viewpoint(description='Book View - Farthest, nothing shown',position=(0,0,12)),
    LOD(range=[5,9],
      children=[
      Group(DEF='View3dModelAtCloseRange',
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(1,0,0))),
          geometry=Box(),),
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0,0,1))),
          geometry=Sphere(radius=1.4))]),
      Group(DEF='View2dImageAtLongerRange',
        children=[
        Shape(
          appearance=Appearance(
            material=Material(),
            #  https://github.com/create3000/x_ite/issues/38 
            texture=ImageTexture(url=["LOD.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/LOD.jpg"])),
          geometry=Box(),)]),
      WorldInfo(info=["Not visible at farthest range"])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for LODExample.py:')
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

print("python LODExample.py load and self-test diagnostics complete.")
