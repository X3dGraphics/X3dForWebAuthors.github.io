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
    meta(content='TextureTransformTranslation.x3d',name='title'),
    meta(content='3 Boxes with the same PixelTexture and different TextureTransform translation values.',name='description'),
    meta(content='Leonard Daly and Don Brutzman',name='creator'),
    meta(content='2 February 2006',name='created'),
    meta(content='2 February 2006',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='https://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='Copyright (c) 2006, Daly Realism and Don Brutzman',name='rights'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/TextureTransformTranslation.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='TextureTransformTranslation.x3d'),
    Background(skyColor=[(1,1,1)]),
    Viewpoint(description='Book View',orientation=(-0.893,0.449,0.032,0.16),position=(0.5,1.27,9.24)),
    Transform(translation=(0,2,0),
      children=[
      Shape(
        appearance=Appearance(
          texture=PixelTexture(DEF='Coloring',image=[2,4,3,0xff0000,0xffff00,0x007700,0xff0077,0x0000ff,0xff7700,0x00ff77,0xffffff]),
          textureTransform=TextureTransform(),),
        geometry=Box(),)]),
    Transform(translation=(2,-2,0),
      children=[
      Shape(
        appearance=Appearance(
          texture=PixelTexture(USE='Coloring'),
          textureTransform=TextureTransform(translation=(.33,.5))),
        geometry=Box(),)]),
    Transform(translation=(-2,-2,0),
      children=[
      Shape(
        appearance=Appearance(
          texture=PixelTexture(USE='Coloring'),
          textureTransform=TextureTransform(translation=(.25,.33))),
        geometry=Box(),)]),
    Transform(translation=(0,2,0),
      children=[
      Shape(
        appearance=Appearance(
          texture=PixelTexture(USE='Coloring')),
        geometry=Box(),)])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for TextureTransformTranslation.py:')
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

print("python TextureTransformTranslation.py load and self-test diagnostics complete.")