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
    meta(content='HelloTriangle.x3d',name='title'),
    meta(content='Simplest possible triangle definition. Note that head metadata is optional. Provides interesting comparison to OpenGL definitions.',name='description'),
    meta(content='Don Brutzman',name='creator'),
    meta(content='5 August 2009',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter01TechnicalOverview/HelloTriangle.x3d',name='identifier'),
    meta(content='HelloWorld.x3d',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/HelloWorld.x3d',name='reference'),
    meta(content='create corresponding shader-based example',name='TODO'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='HelloTriangle.x3d'),
    WorldInfo(title='HelloTriangle.x3d'),
    Shape(
      geometry=IndexedFaceSet(coordIndex=[0,1,2],
        coord=Coordinate(point=[(0,0,0),(1,0,0),(0.5,1,0)])),
      #  default polygons are single-sided, applies default Appearance and Material 
      )])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for HelloTriangle.py:')
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

print("python HelloTriangle.py load and self-test diagnostics complete.")
