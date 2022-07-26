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
    component(level=4,name='Shape'),
    meta(content='TwoSidedMaterialExample.x3d',name='title'),
    meta(content='A Sphere colored red on outside and orange on inside using TwoSidedMaterial',name='description'),
    meta(content='Don Brutzman and MV3204 class',name='creator'),
    meta(content='18 February 2009',name='created'),
    meta(content='22 May 2021',name='modified'),
    meta(content='X3D4 Architecture has deprecated TwoSidedMaterial, preferring use of child backMaterial node in parent Appearance.',name='warning'),
    meta(content='https://www.web3d.org/x3d/tooltips/X3dTooltips.html#TwoSidedMaterial',name='reference'),
    meta(content='https://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='Copyright (c) 2006, Daly Realism and Don Brutzman',name='rights'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/TwoSidedMaterialExample.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='TwoSidedMaterial.x3d'),
    Background(skyColor=[(1,1,1)]),
    Viewpoint(description='Outside, front face material',position=(0,0,4)),
    Viewpoint(description='Inside, back face material',position=(0,0,0)),
    Viewpoint(description='Above, looking down on two shapes',orientation=(1,0,0,-1.57),position=(0,8,-2)),
    NavigationInfo(),
    #  Disable collision between viewpoint and sphere to facilitate viewing 
    Collision(enabled=False,
      children=[
      Shape(DEF='RedOutsideOrangeInside',
        appearance=Appearance(
          material=TwoSidedMaterial(backDiffuseColor=(1,0.5,0),backTransparency=0.5,diffuseColor=(1,0,0),separateBackColor=True,transparency=0.5)),
        #  Must have solid='false' to see inside of Sphere 
        geometry=Sphere(solid=False))]),
    Transform(translation=(0,0,-4),
      children=[
      Shape(
        geometry=Box(DEF='BackgroundBox'),
        appearance=Appearance(
          material=Material(diffuseColor=(0,0.007843,0.839216))))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for TwoSidedMaterialExample.py:')
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

print("python TwoSidedMaterialExample.py load and self-test diagnostics complete.")
