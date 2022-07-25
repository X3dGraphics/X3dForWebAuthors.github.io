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
    meta(content='HalfMoonGroup.x3d',name='title'),
    meta(content='This is a group of HalfMoon fish implemented as ProtoInstances.',name='description'),
    meta(content='Ildeniz Duman',name='creator'),
    meta(content='Scott Tufts',name='translator'),
    meta(content='1 June 1998',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonGroup.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='HalfMoonGroup.x3d'),
    ExternProtoDeclare(name='HalfMoon',url=["HalfMoonPrototype.x3d#HalfMoon","https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonPrototype.x3d#HalfMoon","HalfMoonPrototype.wrl#HalfMoon","https://x3dgraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonPrototype.wrl#HalfMoon"],
      field=[
      field(accessType='inputOutput',name='skinTextureUrl',type='MFString'),
      field(accessType='inputOutput',name='fishScale',type='SFVec3f'),
      field(accessType='inputOutput',name='fishColor',type='SFColor')]),
    Viewpoint(description='HalfMoon Group',orientation=(0,1,0,1.57),position=(20,0,0)),
    Transform(translation=(14,1,0),
      children=[
      ProtoInstance(name='HalfMoon',
        fieldValue=[
        fieldValue(name='fishColor',value=(1,0,0))])]),
    Transform(translation=(14.5,0,0),
      children=[
      ProtoInstance(name='HalfMoon',
        fieldValue=[
        fieldValue(name='fishColor',value=(1,1,0))])]),
    Transform(translation=(14,-1,0),
      children=[
      ProtoInstance(name='HalfMoon',
        fieldValue=[
        fieldValue(name='fishColor',value=(1,1,0))])]),
    Transform(translation=(13.5,0,0),
      children=[
      ProtoInstance(name='HalfMoon',
        fieldValue=[
        fieldValue(name='fishColor',value=(1,1,0))])]),
    Transform(translation=(15.5,0,0),
      children=[
      ProtoInstance(name='HalfMoon',
        fieldValue=[
        fieldValue(name='fishColor',value=(1,1,0))])]),
    Transform(translation=(12.5,0,0),
      children=[
      ProtoInstance(name='HalfMoon',
        fieldValue=[
        fieldValue(name='fishColor',value=(1,1,0))])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for HalfMoonGroup.py:')
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

print("python HalfMoonGroup.py load and self-test diagnostics complete.")
