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

newModel=X3D(profile='Interactive',version='3.3',
  head=head(
    children=[
    meta(content='ElevationGrid.x3d',name='title'),
    meta(content='Simple ElevationGrid example.',name='description'),
    meta(content='Don Brutzman',name='creator'),
    meta(content='U.S. Naval Postgraduate School (NPS)',name='organization'),
    meta(content='8 May 2008',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter06GeometryPointsLinesPolygons/ElevationGrid.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='ElevationGrid.x3d'),
    Background(skyColor=[(1,1,1)]),
    NavigationInfo(),
    Viewpoint(description='ElevationGrid oblique view',orientation=(1,0,0,-0.588003),position=(0,4,6)),
    Viewpoint(description='ElevationGrid overhead view',orientation=(1,0,0,-1.570796),position=(0,8,0)),
    Viewpoint(description='ElevationGrid ground-level view',position=(0,0.2,6)),
    Transform(translation=(-2.5,0,-2.5),
      children=[
      Shape(DEF='ExampleElevationGridShape',
        geometry=ElevationGrid(height=[0,0,0,0,0,0,0,1,1,1,1,0,0,1,2,2,1,0,0,1,2,2,1,0,0,1,1,1,1,0,0,0,0,0,0,0],solid=False,xDimension=6,zDimension=6),
        appearance=Appearance(DEF='DiffuseRedAppearance',
          material=Material(diffuseColor=(0.9,0.1,0.1))))])])
) # X3D model complete

###############################################
# Self-test diagnostics
###############################################

if        metaDiagnostics(newModel): # built-in utility method in X3D class
    print(metaDiagnostics(newModel))
print('checking newModel.toXML() serialization...')
newModelXML = newModel.toXML() # test toXML() for exceptions
# print(newModelXML) # debug

print ("python x3d.py load successful for ElevationGrid.py")
