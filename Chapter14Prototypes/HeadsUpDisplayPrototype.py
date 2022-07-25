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
    meta(content='HeadsUpDisplayPrototype.x3d',name='title'),
    meta(content='Reusable Prototype definition that applies a ProximitySensor for a simple HeadsUpDisplay (HUD) prototype that maintains a stable position for its children on the screen.',name='description'),
    meta(content='Leonard Daly and Don Brutzman',name='creator'),
    meta(content='15 July 2006',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='HeadsUpDisplayExample.x3d',name='reference'),
    meta(content='https://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='Copyright 2006, Daly Realism and Don Brutzman',name='rights'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/HeadsUpDisplayPrototype.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='HeadsUpDisplayPrototype.x3d'),
    ProtoDeclare(appinfo='Heads-up display (HUD) keeps child geometry aligned on screen in a consistent location',name='HeadsUpDisplay',
      ProtoInterface=ProtoInterface(
        field=[
        field(accessType='inputOutput',appinfo='offset position for HUD relative to current view location, default 0 0 -5',name='screenOffset',type='SFVec3f',value=(0,0,-5)),
        field(accessType='inputOutput',appinfo='X3D content positioned at HUD offset',name='children',type='MFNode',
          #  initialization nodes (if any) go here 
          ),
        field(accessType='outputOnly',appinfo='HUD position update (in world coordinates) relative to original location',name='position_changed',type='SFVec3f'),
        field(accessType='outputOnly',appinfo='HUD orientation update relative to original location',name='orientation_changed',type='SFRotation')]),
      ProtoBody=ProtoBody(
        children=[
        Group(
          children=[
          Transform(DEF='HudContainer',
            children=[
            Transform(
              IS=IS(
                connect=[
                connect(nodeField='translation',protoField='screenOffset')]),
              children=[
              Group(
                IS=IS(
                  connect=[
                  connect(nodeField='children',protoField='children')]))])]),
          ProximitySensor(DEF='HereIAm',size=(10000000,10000000,10000000),
            IS=IS(
              connect=[
              connect(nodeField='position_changed',protoField='position_changed'),
              connect(nodeField='orientation_changed',protoField='orientation_changed')])),
          ROUTE(fromField='orientation_changed',fromNode='HereIAm',toField='rotation',toNode='HudContainer'),
          ROUTE(fromField='position_changed',fromNode='HereIAm',toField='translation',toNode='HudContainer')])])),
    Viewpoint(description='Heads-up display (HUD)'),
    #  ProtoDeclare is the "cookie cutter" template, ProtoInstance creates an actual occurrence 
    #  Example use is in separate scene 
    Anchor(description='HeadsUpDisplay Example',parameter=["target=_blank"],url=["HeadsUpDisplayExample.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/HeadsUpDisplayExample.x3d","HeadsUpDisplayExample.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/HeadsUpDisplayExample.wrl"],
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(0.8,0.4,0))),
        geometry=Text(string=["HeadsUpDisplayExample.x3d","is a Prototype declaration file.","","For an example scene using this node,","click this text and view","HeadsUpDisplayExample.x3d"],
          fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"],size=0.8)))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for HeadsUpDisplayPrototype.py:')
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

print("python HeadsUpDisplayPrototype.py load and self-test diagnostics complete.")
