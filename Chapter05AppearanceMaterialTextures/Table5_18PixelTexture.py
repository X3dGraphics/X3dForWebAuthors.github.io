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
    meta(content='Table5_18PixelTexture',name='title'),
    meta(content='PixelTexture example for Table 5.18',name='description'),
    meta(content='Leonard Daly and Don Brutzman',name='creator'),
    meta(content='18 December 2006',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='https://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='Copyright 2006, Daly Realism and Don Brutzman',name='rights'),
    meta(content='X3D, PixelTexture',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/Table5_18PixelTexture',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Table5_18PixelTexture'),
    Background(skyColor=[(0,0,1)]),
    Transform(DEF='Checkerboard',translation=(0,0,-10),
      children=[
      Shape(
        appearance=Appearance(
          textureTransform=TextureTransform(scale=(500,500)),
          texture=PixelTexture(image=[2,2,3,0xE6B5FD,0xFFDBB7,0xFFDBB7,0xE6B5FD])),
        geometry=Box(size=(1000,1000,.01)))]),
    Viewpoint(description='View All',position=(0,0,20)),
    Viewpoint(description='Empty Image',position=(0,5,5)),
    Transform(DEF='EmptyImage',rotation=(1,1,0,1),translation=(0,5,0),
      children=[
      Shape(
        appearance=Appearance(
          texture=PixelTexture(),),
        geometry=Box(DEF='StandardBox'))]),
    Viewpoint(description='Black and white PixelTexture',position=(-5,0,5)),
    Transform(DEF='BW',rotation=(1,1,0,1),translation=(-5,0,0),
      children=[
      Shape(
        appearance=Appearance(
          texture=PixelTexture(image=[1,2,1,0xFF,0x00])),
        geometry=Box(USE='StandardBox'))]),
    Viewpoint(description='Black and white with Alpha PixelTexture',position=(5,0,5)),
    Transform(DEF='AlphaBW',rotation=(1,1,0,1),translation=(5,0,0),
      children=[
      Shape(
        appearance=Appearance(
          texture=PixelTexture(image=[2,1,2,0xCCFF,0x2277])),
        geometry=Box(USE='StandardBox'))]),
    Viewpoint(description='RGB PixelTexture',position=(-5,-5,5)),
    Transform(DEF='RGB',rotation=(1,1,0,1),translation=(-5,-5,0),
      children=[
      Shape(
        appearance=Appearance(
          texture=PixelTexture(image=[2,4,3,0xFF0000,0x00FF00,0,0,0,0,0xFFFFFF,0xFFFF00])),
        geometry=Box(USE='StandardBox'))]),
    Viewpoint(description='RGB with Alpha PixelTexture',position=(5,-5,5)),
    Transform(DEF='AlphaRGB',rotation=(1,1,0,1),translation=(5,-5,0),
      children=[
      Shape(
        appearance=Appearance(
          texture=PixelTexture(image=[3,2,4,0xFF0000FF,0x00FF00FF,0x0000FFFF,0xFF00007F,0x00FF007F,0x0000FF7F])),
        geometry=Box(USE='StandardBox'))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for .py:')
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

print("python .py load and self-test diagnostics complete.")
