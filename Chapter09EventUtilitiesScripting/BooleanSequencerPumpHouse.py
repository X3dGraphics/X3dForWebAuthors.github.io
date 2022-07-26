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
    meta(content='BooleanSequencerPumpHouse.x3d',name='title'),
    meta(content='A BooleanSequencer node intermittently interrupts animation of the pump house.',name='description'),
    meta(content='Leonard Daly, Don Brutzman, Todd Gagnon and Mark A. Boyd',name='creator'),
    meta(content='Xeena VRML importer, X3D-Edit 3.1, https://www.web3d.org/x3d/content/README.X3D-Edit.html',name='translator'),
    meta(content='8 June 1998',name='created'),
    meta(content='20 December 2002',name='translated'),
    meta(content='20 October 2019',name='modified'),
    meta(content='KelpTank.x3d',name='reference'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/PumpHouse.x3d',name='reference'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/BooleanSequencerPumpHouse.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='BooleanSequencerPumpHouse.x3d'),
    Background(skyColor=[(1,1,1)]),
    Viewpoint(description='touch and hold to interrupt pump operation',orientation=(-0.969,0.239,0.056,0.13),position=(1.66,1.34,5.95)),
    Group(DEF='PumpHouseGroup',
      children=[
      Transform(scale=(0.91,0.6,0.3),translation=(0.8,-0.65,0.5),
        children=[
        Shape(
          appearance=Appearance(
            material=Material(diffuseColor=(0.749,0.694,0.651))),
          geometry=Cylinder(bottom=False,top=False))]),
      Group(
        children=[
        Shape(
          appearance=Appearance(DEF='PumpHouseAppearance',
            material=Material(diffuseColor=(0.82,0.78,0.74))),
          geometry=IndexedFaceSet(coordIndex=[0,1,5,4,-1,5,1,2,6,-1,6,2,3,7,-1,3,0,4,7,-1,1,12,13,2,-1,2,13,14,-1,12,15,16,13,-1,15,0,3,16,-1,16,3,17,-1,9,5,6,10,-1,8,9,10,11,-1,4,8,11,7,-1,4,5,9,8,-1,11,10,6,7,-1,3,2,14,17,-1,13,16,17,14,-1],
            coord=Coordinate(point=[(0.0,0.0,0.0),(2.0,0.0,0.0),(2.0,1.75,0.0),(0.0,1.75,0.0),(0.625,0.75,0.0),(1.0,0.75,0.0),(1.0,1.6,0.0),(0.625,1.6,0.0),(0.625,0.75,-0.65),(1.0,0.75,-0.65),(1.0,1.6,-0.65),(0.625,1.6,-0.65),(2.0,0.0,-2.7),(2.0,1.75,-2.7),(2.0,2.5,-1.0),(0.0,0.0,-2.7),(0.0,1.75,-2.7),(0.0,2.5,-1.0)]))),
        TouchSensor(DEF='InterruptPump',description='touch and hold to interrupt pump operation')])]),
    Group(
      children=[
      Transform(scale=(0.5,0.5,0.5),translation=(1.0,1.1,-1.5),
        children=[
        Transform(DEF='PistonTransform',
          children=[
          PositionInterpolator(DEF='PistonPath',key=[0.0,0.3,0.32,0.5,0.75,1.0],keyValue=[(-0.4,-2.3,4.0),(-0.4,-1.5,4.0),(-0.4,-1.5,4.0),(-0.4,-2.3,4.0),(-0.4,-3.3,4.0),(-0.4,-2.3,4.0)]),
          TimeSensor(DEF='PistonClock',cycleInterval=5.5,loop=True),
          BooleanSequencer(DEF='OnOffSequencer',key=[0,0.25,0.33,0.5,0.625,0.67,0.75,0.9,1],keyValue=[True,False,True,False,True,False,True,False,True]),
          TimeSensor(DEF='InterruptTimer',cycleInterval=6,startTime=1),
          ROUTE(fromField='value_changed',fromNode='PistonPath',toField='set_translation',toNode='PistonTransform'),
          ROUTE(fromField='fraction_changed',fromNode='PistonClock',toField='set_fraction',toNode='PistonPath'),
          ROUTE(fromField='value_changed',fromNode='OnOffSequencer',toField='enabled',toNode='PistonClock'),
          ROUTE(fromField='fraction_changed',fromNode='InterruptTimer',toField='set_fraction',toNode='OnOffSequencer'),
          ROUTE(fromField='isActive',fromNode='InterruptPump',toField='enabled',toNode='InterruptTimer'),
          Transform(scale=(1.8,1.2,0.6),translation=(0.0,-0.2,0.0),
            children=[
            Shape(
              appearance=Appearance(
                material=Material(diffuseColor=(0.427,0.427,0.42))),
              geometry=Cylinder(height=1.0,radius=0.98))]),
          Transform(DEF='CylinderRod',rotation=(0.0,0.0,-1.0,0.523599),translation=(-0.25,0.75,0.0),
            children=[
            Shape(
              appearance=Appearance(USE='PumpHouseAppearance'),
              geometry=Cylinder(height=1.0,radius=0.1))]),
          Transform(rotation=(0.0,0.0,1.0,1.047198),translation=(1.0,0.6,0.0),
            children=[
            Transform(USE='CylinderRod')]),
          Transform(translation=(0.0,1.2,0.0),
            children=[
            Shape(
              appearance=Appearance(USE='PumpHouseAppearance'),
              geometry=Sphere(radius=0.15))]),
          Transform(DEF='RockerArm1',center=(0.0,-0.4,0.0),
            children=[
            Shape(
              appearance=Appearance(USE='PumpHouseAppearance'),
              geometry=Cylinder(height=1.8,radius=0.1)),
            Transform(translation=(0.0,0.95,0.0),
              children=[
              Shape(
                appearance=Appearance(USE='PumpHouseAppearance'),
                geometry=Sphere(radius=0.15))]),
            PositionInterpolator(DEF='Rocker1Path',key=[0.0,0.3,0.32,0.5,0.75,1.0],keyValue=[(0.0,2.0,-0.25),(0.0,1.8,-0.35),(0.0,1.8,-0.35),(0.0,2.0,-0.25),(0.0,2.0,-0.12),(0.0,2.0,-0.25)]),
            OrientationInterpolator(DEF='Rocker1Rotation',key=[0.0,0.3,0.32,0.5,0.75,1.0],keyValue=[(-1.0,0.0,0.0,0.523599),(-1.0,0.0,0.0,1.0471976),(-1.0,0.0,0.0,1.0471976),(-1.0,0.0,0.0,0.523599),(-1.0,0.0,0.0,0.2617994),(-1.0,0.0,0.0,0.523599)])]),
          Transform(DEF='RockerArm2',center=(0.0,0.7,0.0),
            children=[
            Shape(
              appearance=Appearance(USE='PumpHouseAppearance'),
              geometry=Cylinder(height=1.8,radius=0.1)),
            Transform(translation=(0.0,-0.95,0.0),
              children=[
              Shape(
                appearance=Appearance(USE='PumpHouseAppearance'),
                geometry=Sphere(radius=0.15))]),
            PositionInterpolator(DEF='Rocker2Path',key=[0.0,0.3,0.32,0.5,0.75,1.0],keyValue=[(0.0,1.95,-1.0),(0.0,1.2,-1.6),(0.0,1.2,-1.6),(0.0,1.95,-1.0),(0.0,2.2,-0.65),(0.0,1.95,-1.0)]),
            OrientationInterpolator(DEF='Rocker2Rotation',key=[0.0,0.3,0.32,0.5,0.75,1.0],keyValue=[(1.0,0.0,0.0,0.523599),(1.0,0.0,0.0,0.4),(1.0,0.0,0.0,0.4),(1.0,0.0,0.0,0.523599),(1.0,0.0,0.0,1.570796),(1.0,0.0,0.0,0.523599)])])])])]),
    ROUTE(fromField='fraction_changed',fromNode='PistonClock',toField='set_fraction',toNode='Rocker1Path'),
    ROUTE(fromField='value_changed',fromNode='Rocker1Path',toField='set_translation',toNode='RockerArm1'),
    ROUTE(fromField='fraction_changed',fromNode='PistonClock',toField='set_fraction',toNode='Rocker1Rotation'),
    ROUTE(fromField='value_changed',fromNode='Rocker1Rotation',toField='set_rotation',toNode='RockerArm1'),
    ROUTE(fromField='fraction_changed',fromNode='PistonClock',toField='set_fraction',toNode='Rocker2Path'),
    ROUTE(fromField='value_changed',fromNode='Rocker2Path',toField='set_translation',toNode='RockerArm2'),
    ROUTE(fromField='fraction_changed',fromNode='PistonClock',toField='set_fraction',toNode='Rocker2Rotation'),
    ROUTE(fromField='value_changed',fromNode='Rocker2Rotation',toField='set_rotation',toNode='RockerArm2')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for BooleanSequencerPumpHouse.py:')
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

print("python BooleanSequencerPumpHouse.py load and self-test diagnostics complete.")
