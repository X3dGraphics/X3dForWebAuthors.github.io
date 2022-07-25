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
    meta(content='TextStringPrototype.x3d',name='title'),
    meta(content='Simple Prototype for the display of text strings, combining functionality of Text and FontStyle nodes.',name='description'),
    meta(content='Leonard Daly and Don Brutzman',name='creator'),
    meta(content='16 July 2006',name='created'),
    meta(content='22 February 2022',name='modified'),
    meta(content='https://X3dGraphics.com',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/X3dResources.html',name='reference'),
    meta(content='Copyright 2006, Daly Realism and Don Brutzman',name='rights'),
    meta(content='X3D book, X3D graphics, X3D-Edit, http://www.x3dGraphics.com',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/TextStringPrototype.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='TextStringPrototype.x3d'),
    ProtoDeclare(name='TextString',
      ProtoInterface=ProtoInterface(
        field=[
        field(accessType='inputOutput',name='offset',type='SFVec3f',value=(0,0,0)),
        field(accessType='inputOutput',name='string',type='MFString'),
        field(accessType='initializeOnly',name='size',type='SFFloat',value=1.0),
        field(accessType='inputOutput',name='color',type='SFColor',value=(0.2,0.6,1)),
        field(accessType='initializeOnly',name='justify',type='MFString',value=["MIDDLE","MIDDLE"]),
        field(accessType='initializeOnly',name='style',type='SFString',value='PLAIN'),
        field(accessType='initializeOnly',name='family',type='MFString',value=["SANS","SERIF"])]),
      ProtoBody=ProtoBody(
        children=[
        Transform(
          IS=IS(
            connect=[
            connect(nodeField='translation',protoField='offset')]),
          children=[
          Shape(
            appearance=Appearance(
              material=Material(
                IS=IS(
                  connect=[
                  connect(nodeField='diffuseColor',protoField='color')]))),
            geometry=Text(
              IS=IS(
                connect=[
                connect(nodeField='string',protoField='string')]),
              fontStyle=FontStyle(
                IS=IS(
                  connect=[
                  connect(nodeField='family',protoField='family'),
                  connect(nodeField='justify',protoField='justify'),
                  connect(nodeField='size',protoField='size'),
                  connect(nodeField='style',protoField='style')]))))])])),
    ProtoInstance(DEF='MyTextStringInstance',name='TextString',
      fieldValue=[
      fieldValue(name='color',value=(0.3,0.7,1)),
      fieldValue(name='string',value=["This example TextString node","creates a prototype instance","that combines functionality","of Text and FontStyle nodes"]),
      fieldValue(name='size',value=0.8),
      fieldValue(name='style',value='BOLD')])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for TextStringPrototype.py:')
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

print("python TextStringPrototype.py load and self-test diagnostics complete.")
