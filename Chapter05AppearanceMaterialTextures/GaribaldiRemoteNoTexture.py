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
    meta(content='GaribaldiRemoteNoTexture.x3d',name='title'),
    meta(content='Instantiate the Garibaldi fish prototype using a remote skin texture file.',name='description'),
    meta(content='Ildeniz Duman',name='creator'),
    meta(content='1 June 1998',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/Garibaldi.x3d',name='reference'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/GaribaldiRemoteNoTexture.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='GaribaldiRemoteNoTexture.x3d'),
    ExternProtoDeclare(name='CircleFish',url=["CircleFishPrototype.x3d#CircleFish","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/CircleFishPrototype.x3d#CircleFish","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPrototype.x3d#CircleFish","CircleFishPrototype.wrl#CircleFish","https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter05AppearanceMaterialTextures/CircleFishPrototype.wrl#CircleFish","https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/CircleFishPrototype.wrl#CircleFish"],
      field=[
      field(accessType='inputOutput',name='skinTextureUrl',type='MFString'),
      field(accessType='inputOutput',name='fishScale',type='SFVec3f'),
      field(accessType='inputOutput',name='fishColor',type='SFColor'),
      field(accessType='inputOutput',name='finColor',type='SFColor'),
      field(accessType='inputOutput',name='positionKey',type='MFFloat'),
      field(accessType='inputOutput',name='positionKeyValue',type='MFVec3f'),
      field(accessType='inputOutput',name='orientationKey',type='MFFloat'),
      field(accessType='inputOutput',name='orientationKeyValue',type='MFRotation'),
      field(accessType='inputOutput',name='orbitTime',type='SFTime')]),
    Viewpoint(description='Garibaldi',orientation=(0.0,1.0,0.0,120.0),position=(2.0,0.0,2.0)),
    ProtoInstance(name='CircleFish',
      fieldValue=[
      fieldValue(name='skinTextureUrl',value=["https://X3dGraphics.com/examples/X3dForWebAuthors/KelpForestExhibit/GaribaldiPatch.jpg"]),
      fieldValue(name='fishScale',value=(1.0,0.39,0.4)),
      fieldValue(name='finColor',value=(0.9,0.66,0.4)),
      fieldValue(name='fishColor',value=(.97,.75,.3)),
      fieldValue(name='positionKey',value=[0.0,0.4,0.7,0.95,1.0]),
      fieldValue(name='positionKeyValue',value=[(0.0,0.0,0.0),(0.5,0.0,0.0),(0.0,0.0,0.0),(0.5,0.0,0.0),(0.2,0.0,0.0)]),
      fieldValue(name='orientationKey',value=[0.0,1.0]),
      fieldValue(name='orientationKeyValue',value=[(0.0,1.0,0.0,90.0),(0.0,1.0,0.0,90.0)]),
      fieldValue(name='orbitTime',value=80.0)])])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for GaribaldiRemoteNoTexture.py:')
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

print("python GaribaldiRemoteNoTexture.py load and self-test diagnostics complete.")
