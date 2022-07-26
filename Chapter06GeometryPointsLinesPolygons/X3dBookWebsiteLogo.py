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
    meta(content='X3dBookWebsiteLogo.x3d',name='title'),
    meta(content='Extrusion of X3D book used for x3dGraphics.com website logo',name='description'),
    meta(content='Leonard Daly and Don Brutzman',name='creator'),
    meta(content='26 February 2007',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='https://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='Copyright Don Brutzman and Leonard Daly 2007',name='rights'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='X3dBookLogo.jpg',name='Image'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/X3dBookWebsiteLogo.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='X3dBookWebsiteLogo.x3d'),
    Background(skyColor=[(.6,.8,1)]),
    Viewpoint(description='front view',orientation=(1,0,0,-1.25),position=(0,0.8,.6)),
    Viewpoint(description='bottom view',position=(0,0,2)),
    Transform(
      children=[
      Shape(
        geometry=Extrusion(ccw=False,creaseAngle=1,crossSection=[(0,.04),(.028,.025),(.05,0),(.3,0),(.25,.1),(.07,.1),(.035,.088),(0,.06),(-.035,.088),(-.07,.1),(-.25,.1),(-.3,0),(-.05,0),(-.025,.028),(0,.04)],spine=[(0,0,.25),(0,0,-.25)]),
        appearance=Appearance(
          material=Material(diffuseColor=(.8,.9,.8)),
          texture=ImageTexture(repeatS=False,repeatT=False,url=["X3dImageRotated.png","X3dImageRotated.gif","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/X3dImageRotated.png","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/X3dImageRotated.gif"]),
          textureTransform=TextureTransform(center=(-.5,0),scale=(2,1)),
          #  TODO restore image, use TextureTransform rotation instead 
          ))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for X3dBookWebsiteLogo.py:')
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

print("python X3dBookWebsiteLogo.py load and self-test diagnostics complete.")
