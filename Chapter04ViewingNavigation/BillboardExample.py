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
    meta(content='BillboardExample.x3d',name='title'),
    meta(content='Illustrates Billboard operation using Kelp Forest example scenes for Figure 4.4, X3D for Web Authors.',name='description'),
    meta(content='Don Brutzman and Leonard Daly',name='creator'),
    meta(content='13 June 2004',name='created'),
    meta(content='14 June 2020',name='modified'),
    meta(content='Contained Inline scenes each have profile Immersive',name='info'),
    meta(content='http://faculty.nps.edu/brutzman/kelp',name='reference'),
    meta(content='http://faculty.nps.edu/brutzman/kelp/KelpForestDesignPaper.pdf',name='reference'),
    meta(content='Kelp Forest 3D models',name='subject'),
    meta(content='Revisions Copyright (c) 2006, Daly Realism and Don Brutzman. Original content has permissions for free use. Please provide credit to the Naval Postgraduate School (NPS) Modeling Virtual Environments and Simulation (MOVES) Institute.',name='accessRights'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/BillboardExample.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='Billboard.x3d'),
    Background(groundAngle=[1.309,1.5707],groundColor=[(0.1,0.1,0.0),(0.4,0.25,0.2),(0.6,0.6,0.6)],skyAngle=[1.309,1.5707],skyColor=[(0.0,0.5,1.0),(0.0,0.0,1.0),(0.0,0.0,1.0)]),
    Viewpoint(description='Entry view from ahead, no rotations',position=(0,-5,45)),
    Viewpoint(description='Observe Billboard effect: text remains visible while navigating around',orientation=(0,1,0,0.86),position=(37.01,-5,29.59)),
    Billboard(axisOfRotation=(0,1.0,0),
      children=[
      Inline(url=["../KelpForestExhibit/IntroductionMessage.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/../KelpForestExhibit/IntroductionMessage.x3d","../KelpForestExhibit/IntroductionMessage.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/IntroductionMessage.x3d"])]),
    Inline(url=["../KelpForestExhibit/KelpTank.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter04ViewingNavigation/../KelpForestExhibit/KelpTank.x3d","../KelpForestExhibit/KelpTank.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpTank.x3d"])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for BillboardExample.py:')
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

print("python BillboardExample.py load and self-test diagnostics complete.")
