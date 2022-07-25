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

newModel=X3D(profile='Interchange',version='4.0',
  head=head(
    children=[
    meta(content='WorldInfoExampleMetadataSetX3D4.x3d',name='title'),
    meta(content='Test target for python x3d package development. Can x3d.py package generate this valid X3D file? This scene contains MetadataSet with a non-null metadata field.',name='description'),
    meta(content='Metadata nodes are not allowed at top level of scene in X3D3, but one is allowed as field within WorldInfo',name='warning'),
    meta(content='WorldInfoExampleMetadataSetX3D3.x3d',name='reference'),
    meta(content='Original name MetadataSetWithMetadata.x3d',name='info'),
    meta(content='Vincent Marchetti',name='creator'),
    meta(content='Don Brutzman',name='creator'),
    meta(content='16 November 2021',name='created'),
    meta(content='2 February 2022',name='revised'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/WorldInfoExampleMetadataSetX3D4.x3d',name='identifier'),
    meta(content='https://creativecommons.org/licenses/by/4.0',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='WorldInfoExampleMetadataSetX3D4.x3d Example Scene',
      #  WorldInfo single available child field of interest is 'metadata' so contained MetadataSet must have containerField='metadata' which IS NOT default in X3D4 
      metadata=MetadataSet(name='birthday',reference='http://www.americaslibrary.gov/jb/colonial/jb_colonial_washingtn_2.html',
        metadata=MetadataString(name='calendar',reference='this node describes nature of parent node, and is not intended as a data value',value=["Julian"]),
        #  MetadataSet next field of interest is 'value' and so contained Metadata nodes must have containerField='value' which IS the default in X3D4' 
        value=[
        MetadataInteger(name='day',value=[11]),
        MetadataInteger(name='month',value=[2]),
        MetadataInteger(name='year',value=[1731])])),
    Background(skyColor=[(0,0.439216,0.760784)]),
    Viewpoint(description='View scene source to see metadata examples',position=(0,0,12)),
    Anchor(description='Load scene index page',parameter=["target=_blank"],url=["WorldInfoExampleMetadataSetX3D4.html","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/WorldInfoExampleMetadataSetX3D4.html"],
      children=[
      Shape(
        geometry=Text(string=["View scene source","to see","WorldInfoExampleMetadataSetX3D4"],
          fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"])),
        appearance=Appearance(
          material=Material(diffuseColor=(1,0.039216,0.992157))))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for WorldInfoExampleMetadataSetX3D4.py:')
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

print("python WorldInfoExampleMetadataSetX3D4.py load and self-test diagnostics complete.")
