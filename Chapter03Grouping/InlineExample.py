###############################################
#
# Now available: developmental python x3d.py package on PyPi for import.
#   This approach greatly simplifies Python X3D deployment and use.
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
#    import x3d         # traditional way to subclass x3d package, all classes require x3d.* prefix
#                       # but python source is very verbose, for example x3d.Material x3d.Shape etc.
#                       # X3dToPython.xslt stylesheet insertPackagePrefix=true supports this option.

from x3d import *

###############################################

newModel=X3D(profile='Immersive',version='3.3',
  head=head(
    children=[
    meta(content='InlineExample.x3d',name='title'),
    meta(content='Inline example that loads Hello World example.',name='description'),
    meta(content='Don Brutzman',name='creator'),
    meta(content='12 October 2013',name='created'),
    meta(content='14 June 2020',name='modified'),
    meta(content='X3D profile in this scene must be suffient to support Inline scene in order to properly set up the X3D player.',name='info'),
    meta(content='http://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='../HelloWorld.x3d',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#InlinesPrototypes',name='reference'),
    meta(content='InlineKelpForest.x3d',name='reference'),
    meta(content='Copyright Don Brutzman and Leonard Daly 2007',name='rights'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/InlineExample.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    #  The following url is an ordered list of multiple addresses that support the following use cases. 
    #  Use case: (1a) .x3d on local disk or (1b) web server query looks on local server 
    #  Use case: (2) Older VRML97 browser unable to read X3D, reads .wrl version instead (backwards compatibility) 
    #  Use case: (3) local copy not available, retrieve from permanent server address 
    #  Use case: (4) combination of cases (2) and (3), VRML97 on remote server 
    #  TODO consider simpler scene to illustrate Inline, also consider adding Viewpoint 
    children=[
    WorldInfo(title='Inline.x3d'),
    Inline(DEF='HelloWorldInline',url=["../HelloWorld.x3d","http://X3dGraphics.com/examples/X3dForWebAuthors/HelloWorld.x3d","../HelloWorld.wrl","http://X3dGraphics.com/examples/X3dForWebAuthors/HelloWorld.wrl"]),
    #  Background nodes in the parent scene are automatically bound before any Background nodes from child Inline scenes 
    Background(skyColor=[(0.560784,0.654902,1)]),
    #  Viewpoints in the parent and children scenes appear in order of definition, allowing authors to predict results 
    Viewpoint(DEF='ViewFartherBack',centerOfRotation=(0,-1,0),description='Hello world!',position=(0,-1,9)),
    #  This box encloses the world but not the text found in the Inline scene HelloWorld.x3d 
    Shape(
      geometry=Box(size=(2.1,2.1,2.21)),
      appearance=Appearance(
        material=Material(diffuseColor=(1,1,1),transparency=0.5)))])
) # X3D model complete

###############################################
# Self-test diagnostics
###############################################

if        metaDiagnostics(newModel): # built-in utility method in X3D class
    print(metaDiagnostics(newModel))
print('check  newModel.XML() serialization...')
newModelXML = newModel.XML() # test export method XML() for exceptions
# print(newModelXML) # debug

print ("python x3d.py load successful for InlineExample.py")
