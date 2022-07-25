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
    meta(content='TimeTriggerTest.x3d',name='title'),
    meta(content='Test of TimeTrigger node.',name='description'),
    meta(content='8 October 2007',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='Leonard Daly and Don Brutzman',name='creator'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/TimeTriggerTest.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='TimeTriggerTest.x3d'),
    Background(skyColor=[(1,1,1)]),
    Viewpoint(description='TimeTrigger test',position=(0,0,7)),
    Transform(
      children=[
      Shape(
        appearance=Appearance(
          material=Material(diffuseColor=(.6,0,.8))),
        geometry=Text(string=["Touch text to print","output values on console"],
          fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"]))),
      #  Selectable Text design pattern has transparent Box and TouchSensor description as a tooltip 
      Shape(
        geometry=Box(size=(9,2,.001)),
        appearance=Appearance(
          material=Material(transparency=1))),
      #  This TouchSensor only reacts to user clicking on the sibling Shape and Text, because it is under a parent Transform grouping node 
      TouchSensor(DEF='TextTouched',description='touch to activate')]),
    BooleanFilter(DEF='Filter'),
    ROUTE(fromField='isActive',fromNode='TextTouched',toField='set_boolean',toNode='Filter'),
    TimeTrigger(DEF='Trigger'),
    ROUTE(fromField='inputTrue',fromNode='Filter',toField='set_boolean',toNode='Trigger'),
    Script(DEF='TraceScript',
      field=[
      field(accessType='inputOnly',name='printBoolean',type='SFBool'),
      field(accessType='inputOnly',name='printTimestamp',type='SFTime')],

    sourceCode="""
ecmascript:
    function printBoolean (value) {
      Browser.print ('TouchSensor isActive="' + value + '"\n');
    }
    function printTimestamp (value) {
      Browser.print ('====================================' +  '\n');
      Browser.print ('Trigger triggerTime="' + value + '"\n');
    }
"""),
    ROUTE(fromField='triggerTime',fromNode='Trigger',toField='printTimestamp',toNode='TraceScript'),
    ROUTE(fromField='isActive',fromNode='TextTouched',toField='printBoolean',toNode='TraceScript')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for TimeTriggerTest.py:')
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

print("python TimeTriggerTest.py load and self-test diagnostics complete.")
