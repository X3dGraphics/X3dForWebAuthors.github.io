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
    meta(content='IndexedTriangleStripSet.x3d',name='title'),
    meta(content='An example of the use of the IndexedTriangleStripSet node.',name='description'),
    meta(content='22 May 2006',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Leonard Daly and Don Brutzman',name='creator'),
    meta(content='http://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='Copyright 2006, Daly Realism and Don Brutzman',name='rights'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter13GeometryTrianglesQuadrilaterals/IndexedTriangleStripSet.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='IndexedTriangleStripSet.x3d'),
    Viewpoint(description='IndexedTriangleStripSet view',orientation=(0,-1,0,0.07),position=(-0.06,1.4,11.24)),
    Background(skyColor=[(1,1,1)]),
    Shape(
      geometry=IndexedTriangleStripSet(ccw=True,colorPerVertex=True,index=[9,10,11,12,13,-1,14,15,16,17,-1],normalPerVertex=True,solid=False,
        coord=Coordinate(point=[(-4,1,3),(-2,2,1.5),(-3,4,0.5),(-2,3,1.5),(0,4,0.0),(2,3,1.5),(5,5,-2.5),(4,3,1.5),(6,4,2.0),(-4,1,3),(-2,2,1.0),(-3,4,0.0),(-2,3,1.0),(0,4,0.0),(2,3,1.0),(5,5,-2.0),(4,3,1.5),(6,4,2.0),(0,-2,4),(1,-3,3.5),(1.5,-1.5,3),(0,-1,2),(-.5,0,2.5),(-1.5,1,3),(-2,0,3.5),(-3,-2,2),(-3,-4,3),(2,-4,-2),(0,-3,-.5),(1.3,-1.5,-1),(4,-2,-1.5),(4.2,-4.2,-1),(3,-6,-.5)]),
        color=Color(color=[(0,.8,0),(0,1,1),(1,0,0),(1,.5,0),(.8,0,1),(1,1,0),(.6,.3,.1),(1,0,.5),(0,1,.5),(1,0,0),(.8,0,1),(1,1,0),(0,1,1),(1,.5,0),(.6,.3,.1),(1,0,.5),(0,.8,0),(0,1,.5)])))])
) # X3D model complete

###############################################
# Self-test diagnostics
###############################################

if        metaDiagnostics(newModel): # built-in utility method in X3D class
    print(metaDiagnostics(newModel))
print('checking newModel.toXML() serialization...')
newModelXML = newModel.toXML() # test toXML() for exceptions
# print(newModelXML) # debug

print ("python x3d.py load successful for IndexedTriangleStripSet.py")
