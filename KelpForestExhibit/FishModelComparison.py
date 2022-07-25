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
    meta(content='FishModelComparison.x3d',name='title'),
    meta(content='This file compares all of the fish prototypes.',name='description'),
    meta(content='Scott Tufts',name='creator'),
    meta(content='17 December 2001',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/FishModelComparison.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='FishModelComparison.x3d'),
    ExternProtoDeclare(name='SeaStar',url=["SeaStarPrototype.x3d#SeaStar","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarPrototype.x3d#SeaStar","SeaStarPrototype.wrl#SeaStar","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/SeaStarPrototype.wrl#SeaStar"],
      field=[
      field(accessType='inputOutput',name='skinDifColor',type='SFColor')]),
    ExternProtoDeclare(appinfo='HalfMoon fish',name='HalfMoon',url=["HalfMoonPrototype.x3d#HalfMoon","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonPrototype.x3d#HalfMoon","HalfMoonPrototype.wrl#HalfMoon","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonPrototype.wrl#HalfMoon"],
      field=[
      field(accessType='inputOutput',name='skinTextureUrl',type='MFString'),
      field(accessType='inputOutput',name='fishScale',type='SFVec3f'),
      field(accessType='inputOutput',name='fishColor',type='SFColor')]),
    Transform(rotation=(1,0,0,3.14),
      children=[
      Transform(translation=(2,0,0),
        children=[
        ProtoInstance(name='SeaStar')]),
      Transform(translation=(1,0,0),
        children=[
        Inline(url=["BlackSurfPerch.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/BlackSurfPerch.x3d","BlackSurfPerch.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/BlackSurfPerch.wrl"])]),
      Transform(
        children=[
        ProtoInstance(name='HalfMoon')]),
      Transform(rotation=(1,0,0,3.14),translation=(-1,0,0),
        children=[
        Inline(url=["CircleFish.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFish.x3d","CircleFish.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFish.wrl"])]),
      Transform(translation=(-2,0,0),
        children=[
        Inline(url=["Garibaldi.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Garibaldi.x3d","Garibaldi.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Garibaldi.wrl"])]),
      Transform(rotation=(1,0,0,3.14),translation=(0,1,0),
        children=[
        Inline(url=["HalfMoonGroup.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonGroup.x3d","HalfMoonGroup.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/HalfMoonGroup.wrl"])]),
      Transform(translation=(0,-1,0),
        children=[
        Inline(url=["KelpBass.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBass.x3d","KelpBass.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpBass.wrl"])]),
      Transform(translation=(0,0,1),
        children=[
        Inline(url=["KelpSurfPerch.x3d","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpSurfPerch.x3d","KelpSurfPerch.wrl","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/KelpSurfPerch.wrl"])])])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for FishModelComparison.py:')
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

print("python FishModelComparison.py load and self-test diagnostics complete.")
