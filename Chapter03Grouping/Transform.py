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

newModel=X3D(profile='Interchange',version='3.3',
  head=head(
    children=[
    meta(content='Transform.x3d',name='title'),
    meta(content='Example for Transform node',name='description'),
    meta(content='Leonard Daly and Don Brutzman',name='creator'),
    meta(content='13 November 2005',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='http://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='Copyright (c) 2005, Daly Realism and Don Brutzman',name='rights'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter03Grouping/Transform.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Transform.x3d'),
    Background(skyColor=[(1,1,1)]),
    Viewpoint(description='Book View',orientation=(-0.682,-0.707,-0.187,0.68),position=(-3.42,3.73,6.04)),
    Transform(rotation=(0.577,0.577,0.577,1),translation=(2,0,1),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(1,0,0))),
        geometry=Box(),)]),
    Transform(translation=(0,2,0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(1,1,0))),
        geometry=Sphere(),)]),
    Transform(rotation=(1,0,0,.707),translation=(-2,0,-1),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0,1,0))),
        geometry=Cylinder(),)]),
    Transform(rotation=(1,0,0,-.707),translation=(0,-2,0),
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0,0,1))),
        geometry=Cone(),)])])
) # X3D model complete

###############################################
# Self-test diagnostics
###############################################

if        metaDiagnostics(newModel): # built-in utility method in X3D class
    print(metaDiagnostics(newModel))
print('checking newModel.toXML() serialization...')
newModelXML = newModel.toXML() # test toXML() for exceptions
# print(newModelXML) # debug

print ("python x3d.py load successful for Transform.py")
