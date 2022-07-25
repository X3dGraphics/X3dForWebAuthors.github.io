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
    meta(content='WorldInfoExample.x3d',name='title'),
    meta(content='Simple examples of meta statements, comments, a WorldInfo node and a MetadataString node.',name='description'),
    meta(content='Don Brutzman',name='creator'),
    meta(content='3 March 2018',name='created'),
    meta(content='31 January 2022',name='revised'),
    meta(content='Information in head and meta elements is retained after a scene is parsed and loaded, and can be referenced via the Scene Access Interface (SAI) or Document Object Model (DOM)',name='info'),
    meta(content='The following referenced chapter is published online but was not included in the printed book.',name='reference'),
    meta(content='Chapter15MetadataInformation.html',name='reference'),
    meta(content='https://x3dgraphics.com/chapters/Chapter15MetadataInformation.html',name='reference'),
    meta(content='https://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata',name='reference'),
    meta(content='Copyright 2018, Daly Realism and Don Brutzman',name='rights'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/WorldInfoExample.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  Comments can appear between nodes (XML elements) but are not retained after a scene is parsed, loaded and playing 
    children=[
    WorldInfo(DEF='MyWorldInfo',info=["Metadata strings","can go here","as string array values"],title='WorldInfo.x3d Example Scene',
      #  WorldInfo can contain Metadata nodes in X3D but not in VRML97. 
      #  WorldInfo single available child field of interest is 'metadata' and so contained MetadataString must have containerField='metadata' which IS the default in X3D3' 
      metadata=MetadataString(DEF='MyMetadataStringNode',name='TestNode',reference='X3D',value=["Hello","WorldInfo"])),
    Background(skyColor=[(0,0.439216,0.760784)]),
    Viewpoint(description='View scene source to see metadata examples',position=(0,0,9)),
    Anchor(description='Load scene index page',parameter=["target=_blank"],url=["WorldInfoExampleIndex.html","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter15Metadata/WorldInfoExampleIndex.html"],
      children=[
      Shape(
        geometry=Text(string=["View scene source","to see","WorldInfoExample"],
          fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"])),
        appearance=Appearance(
          material=Material(diffuseColor=(1,0.992157,0.039216))))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for WorldInfoExample.py:')
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

print("python WorldInfoExample.py load and self-test diagnostics complete.")