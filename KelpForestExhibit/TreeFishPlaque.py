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

newModel=X3D(profile='Interactive',version='3.3',
  head=head(
    children=[
    meta(content='TreeFishPlaque.x3d',name='title'),
    meta(content='Michael Collins',name='creator'),
    meta(content='18 February 2001',name='created'),
    meta(content='25 March 2020',name='modified'),
    meta(content='unfinished',name='warning'),
    meta(content='One fish plaque with lithograph on one side and actual picture on the back. Click on plaque to go to picture or click on buttons to change picture.',name='description'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/TreeFishPlaque.x3d',name='identifier'),
    meta(content='Treefish.jpg',name='Image'),
    meta(content='https://en.wikipedia.org/wiki/Treefish',name='reference'),
    meta(content='http://faculty.nps.edu/brutzman/kelp/fish.html#Treefish',name='reference'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='TreeFishPlaque.x3d'),
    Viewpoint(DEF='treefish',description='Tree Fish',position=(0,0,4)),
    #  Fish Plaques 
    Group(
      children=[
      TouchSensor(DEF='BlueRockfishTouchSensor',description='touch to rotate'),
      TimeSensor(DEF='BLUEROCKFISHCLOCK',cycleInterval=2),
      OrientationInterpolator(DEF='BlueRockfishPathInterpolator',key=[0.0,0.50,1.0],keyValue=[(0.0,1.0,0.0,0.0),(0.0,1.0,0.0,1.57),(0.0,1.0,0.0,3.14)]),
      Transform(DEF='BLUEROCKFISH_TRANSFORM',
        children=[
        Shape(
          geometry=Box(size=(4,2,.1)),
          appearance=Appearance(
            texture=ImageTexture(url=["TreeFish.jpg","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/TreeFish.jpg"])))]),
      Group(
        children=[
        Transform(DEF='BASE_TRANSFORM',translation=(0,0,-.3),
          children=[
          Shape(
            geometry=Box(size=(8,6,.3)),
            appearance=Appearance(
              material=Material(diffuseColor=(.3,.3,.6))))]),
        TouchSensor(DEF='BaseTouchSensor',description='touch to rotate'),
        Group(
          children=[
          Transform(translation=(0,-2.6,0),
            children=[
            Shape(
              geometry=Box(size=(8,1,1)),
              appearance=Appearance(
                material=Material(diffuseColor=(0.8,0.8,0.2))))])]),
        Group(
          children=[
          Transform(translation=(0,2.6,0),
            children=[
            Shape(
              geometry=Box(size=(8,1,1)),
              appearance=Appearance(
                material=Material(diffuseColor=(0.8,0.8,0.2))))])]),
        Group(
          children=[
          Transform(rotation=(0,0,1,1.58),translation=(3.6,0,0),
            children=[
            Shape(
              geometry=Box(size=(6.2,1,1)),
              appearance=Appearance(
                material=Material(diffuseColor=(0.8,0.8,0.2))))])]),
        Group(
          children=[
          Transform(rotation=(0,0,1,1.58),translation=(-3.6,0,0),
            children=[
            Shape(
              geometry=Box(size=(6.2,1,1)),
              appearance=Appearance(
                material=Material(diffuseColor=(0.8,0.8,0.2))))])])])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for TreeFishPlaque.py:')
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

print("python TreeFishPlaque.py load and self-test diagnostics complete.")
