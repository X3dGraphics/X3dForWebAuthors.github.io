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

newModel=X3D(profile='Immersive',version='4.0',
  head=head(
    children=[
    meta(content='X3dArchitectureConceptsPrototypeBodyValidationExample.x3d',name='title'),
    meta(content='Prototype example to illustrate why additional non-rendering nodes might be needed after first node in ProtoBody',name='description'),
    meta(content='*Don Brutzman',name='creator'),
    meta(content='10 September 2021',name='created'),
    meta(content='19 September 2021',name='version'),
    meta(content='X3dArchitectureConceptsPrototypeBodyValidationDiagram.png',name='drawing'),
    meta(content='X3dArchitectureConceptsPrototypeBodyValidationDiagram.vsdx',name='drawing'),
    meta(content='X3dArchitectureConceptsPrototypeBodyValidationExampleX_ITE.png',name='Image'),
    meta(content='https://www.web3d.org/member-only/mantis/view.php?id=1372',name='reference'),
    meta(content='X3D Architecture, ISO/IEC 19775-1: 202x, Clause 4 Concepts, 4.4.4.3 PROTO definition semantics',name='specificationSection'),
    meta(content='https://www.web3d.org/specifications/X3Dv4Draft/ISO-IEC19775-1v4-CD1/Part01/concepts.html#PROTOdefinitionsemantics',name='specificationUrl'),
    meta(content='(c) Web3D Consortium Inc. 2021',name='rights'),
    meta(content='X3D prototype specification',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14Prototypes/X3dArchitectureConceptsPrototypeBodyValidationExample.x3d',name='identifier'),
    meta(content='X3D-Edit 4.0, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    Background(skyColor=[(0.058824,0.886275,1)]),
    NavigationInfo(),
    ProtoDeclare(name='PulsingBoxShape',
      ProtoInterface=ProtoInterface(
        field=[
        field(accessType='inputOutput',name='boxColor',type='SFColor',value=(1,0,0))]),
      ProtoBody=ProtoBody(
        #  First node in ProtoBody determines node type of this Prototype 
        children=[
        Shape(DEF='PrototypeRootNode',
          appearance=Appearance(
            material=Material(DEF='BoxMaterial',diffuseColor=(0.980392,0,0),
              IS=IS(
                connect=[
                connect(nodeField='diffuseColor',protoField='boxColor')]))),
          geometry=Box(DEF='PulsingBox',size=(4,4,4))),
        #  ====================================================================== 
        #  Subsequent nodes do not render, but still must be a valid X3D subgraph 
        #  Note if these move into the Shape node, scene graph is no longer valid 
        ScalarInterpolator(DEF='TransparencyInterpolator',key=[0,0.5,1],keyValue=[1,0,1]),
        TimeSensor(DEF='Timer',cycleInterval=10,loop=True),
        #  ROUTEs 
        ROUTE(fromField='fraction_changed',fromNode='Timer',toField='set_fraction',toNode='TransparencyInterpolator'),
        ROUTE(fromField='value_changed',fromNode='TransparencyInterpolator',toField='transparency',toNode='BoxMaterial')]
        #  ====================================================================== 
        )),
    ProtoInstance(DEF='MyBox',name='PulsingBoxShape',
      #  NavyBlue TODO need appinfo/documentation fields on fieldValue to match field expressivity 
      fieldValue=[
      fieldValue(name='boxColor',value=(0,0,0.5))])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for X3dArchitectureConceptsPrototypeBodyValidationExample.py:')
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

print("python X3dArchitectureConceptsPrototypeBodyValidationExample.py load and self-test diagnostics complete.")
