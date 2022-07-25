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
    #  local, master and online versions of script template 
    meta(content='newECMAscriptTest.x3d',name='title'),
    meta(content='Example scene providing a unit test for newECMAscript template javascript source code, first load this scene and then see console for test output.',name='description'),
    meta(content='Don Brutzman',name='creator'),
    meta(content='3 November 2013',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='newECMAscriptTestConsole.txt',name='reference'),
    meta(content='newECMAscript.js',name='reference'),
    meta(content='../newECMAscript.js',name='reference'),
    meta(content='https://www.web3d.org/x3d/content/examples/newECMAscript.js',name='reference'),
    meta(content='../../build.xml#commonSetup',name='reference'),
    meta(content='X3D javascript ECMAscript',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter09EventUtilitiesScripting/newECMAscriptTest.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='newECMAscriptTest.x3d'),
    Background(skyColor=[(1,0.5,0)]),
    Viewpoint(description='Check X3D console to see output',position=(0,0,8)),
    Transform(scale=(0.4,0.4,0.4),
      children=[
      Shape(
        geometry=Text(string=["newECMAscriptTest.x3d","","to check newECMAscript.js","","(see browser console for output)"],
          fontStyle=FontStyle(family=["SANS"],justify=["MIDDLE","MIDDLE"],style_='BOLD')),
        appearance=Appearance(
          material=Material(diffuseColor=(1,1,1))))]),
    Script(DEF='TestScript',url=["newECMAscript.js","../newECMAscript.js","https://www.web3d.org/x3d/content/examples/newECMAscript.js"],
      #  initialize() method includes unit test with output on browser console 
      #  authors adding field definitions put them here 
      ,

    sourceCode="""
ecmascript:

""")])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for newECMAscriptTest.py:')
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

print("python newECMAscriptTest.py load and self-test diagnostics complete.")
