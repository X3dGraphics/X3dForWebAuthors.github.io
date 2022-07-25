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
    meta(content='Text.x3d',name='title'),
    meta(content='Simple Text node: hello X3D!',name='description'),
    meta(content='Don Brutzman',name='creator'),
    meta(content='25 March 2005',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Copyright (c) Don Brutzman and Leonard Daly, 2005',name='rights'),
    meta(content='http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter02GeometryPrimitives/Text.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Text.x3d'),
    Background(skyColor=[(1,1,1)]),
    Viewpoint(description='Text example',position=(0,0,3)),
    Viewpoint(description='Book view',position=(0.89,-1.11,2.33)),
    Shape(
      geometry=Text(DEF='HelloText',string=["hello","X3D!"],
        fontStyle=FontStyle(DEF='CenteredFontStyle',justify=["MIDDLE","MIDDLE"])),
      appearance=Appearance(
        material=Material(DEF='DefaultMaterial',diffuseColor=(.2,.2,.2))))])
) # X3D model complete

###############################################
# Self-test diagnostics
###############################################

if        metaDiagnostics(newModel): # built-in utility method in X3D class
    print(metaDiagnostics(newModel))
print('checking newModel.toXML() serialization...')
newModelXML = newModel.toXML() # test toXML() for exceptions
# print(newModelXML) # debug

print ("python x3d.py load successful for Text.py")
