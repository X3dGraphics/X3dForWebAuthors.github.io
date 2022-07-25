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
    meta(content='BackgroundTimeOfDay.x3d',name='title'),
    meta(content='Interpolate between Background color arrays to show a gradually changing time-of-day effect.',name='description'),
    meta(content='Don Brutzman and MV4205 class',name='creator'),
    meta(content='22 April 2009',name='created'),
    meta(content='20 October 2019',name='modified'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironment/BackgroundSelector.x3d',name='reference'),
    meta(content='X3D Background example',name='subject'),
    meta(content='https://X3dGraphics.com/examples/X3dForWebAuthors/Chapter11LightingEnvironmentalEffects/BackgroundTimeOfDay.x3d',name='identifier'),
    meta(content='X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit',name='generator'),
    meta(content='../license.html',name='license')]),
  Scene=Scene(
    children=[
    WorldInfo(title='BackgroundTimeOfDay.x3d'),
    Transform(translation=(0,3,0),
      children=[
      Shape(
        geometry=Text(string=["Background Time Of Day"],
          fontStyle=FontStyle(justify=["MIDDLE","MIDDLE"])),
        appearance=Appearance(
          material=Material(),))]),
    TimeSensor(DEF='TimeOfDayClock',cycleInterval=6,loop=True),
    Script(DEF='BackgroundColorInterpolator',
      field=[
      field(accessType='inputOnly',name='set_fraction',type='SFFloat'),
      field(accessType='initializeOnly',name='groundColorSunrise',type='MFColor',value=[(0.133,0.419,0),(0.36,0.1,0),(1,0.74,0.4),(1,0.74,0.4),(0,0.2,0.75),(0,0.1,0.5)]),
      field(accessType='initializeOnly',name='groundColorNoon',type='MFColor',value=[(0.133,0.419,0),(0.36,0.1,0),(1,0.74,0.4),(1,0.74,0.4),(0,0,0.5),(0,0,0.2)]),
      field(accessType='initializeOnly',name='groundColorSunset',type='MFColor',value=[(0.133,0.419,0),(0.36,0.1,0),(1,0.74,0.4),(1,0.74,0.4),(0,0,0.5),(0,0,0.2)]),
      field(accessType='initializeOnly',name='groundColorNight',type='MFColor',value=[(0.133,0.419,0),(0.36,0.1,0),(1,0.74,0.4),(1,0.74,0.4),(0,0,0.5),(0,0,0.2)]),
      field(accessType='initializeOnly',name='skyColorSunrise',type='MFColor',value=[(1,1,0.2),(1,1,0),(0.36,0.63,1),(0,0.4,1),(0,0.4,1)]),
      field(accessType='initializeOnly',name='skyColorNoon',type='MFColor',value=[(0,0.035,0.34),(0,0.015,0.44),(0,0.05,0.5),(0,0.1,0.6),(0.44,0.8,1),(1,1,0.7)]),
      field(accessType='initializeOnly',name='skyColorSunset',type='MFColor',value=[(0,0,0.38),(0,0,0.68),(0.5,0.2,1),(0.5,0.2,1),(1,0.3,0),(1,0.2,0.8)]),
      field(accessType='initializeOnly',name='skyColorNight',type='MFColor',value=[(1,1,1),(0.8,0.8,0.8),(0.1,0.1,0.1),(0,0,0),(0,0,0)]),
      field(accessType='outputOnly',name='groundColor_changed',type='MFColor'),
      field(accessType='outputOnly',name='skyColor_changed',type='MFColor')],

    sourceCode="""
ecmascript:

function initialize()
{
    Browser.print ('groundColorSunrise length=' + groundColorSunrise.length + ' '  + groundColorSunrise.toString() + '\n');
    Browser.print ('groundColorNoon    length=' +    groundColorNoon.length +    ' '  + groundColorNoon.toString() + '\n');
    Browser.print ('groundColorSunset  length=' +  groundColorSunset.length +  ' '  + groundColorSunset.toString() + '\n');
    Browser.print ('groundColorNight   length=' +   groundColorNight.length +   ' '  + groundColorNight.toString() + '\n');
    Browser.print ('skyColorSunrise    length=' +    skyColorSunrise.length +    ' '  + skyColorSunrise.toString() + '\n');
    Browser.print ('skyColorNoon       length=' +       skyColorNoon.length +       ' '  + skyColorNoon.toString() + '\n');
    Browser.print ('skyColorSunset     length=' +     skyColorSunset.length +     ' '  + skyColorSunset.toString() + '\n');
    Browser.print ('skyColorNight      length=' +      skyColorNight.length +      ' '  + skyColorNight.toString() + '\n');
}
function set_fraction (fraction) // fraction is input value sent by TimeSensor clock
{
    // Sunrise to Noon, fraction 0.0 to 0.25, interval=0.25
    if      (fraction < 0.25)
    {
        groundColor_changed = interpolate (groundColorSunrise, groundColorNoon, fraction, 0.00, 0.25);
           skyColor_changed = interpolate (   skyColorSunrise,    skyColorNoon, fraction, 0.00, 0.25);
    }
    // Noon to Evening, fraction 0.25 to 0.5, interval=0.25
    else if (fraction < 0.5)
    {
        groundColor_changed = interpolate (groundColorNoon, groundColorSunset, fraction, 0.25, 0.25);
           skyColor_changed = interpolate (   skyColorNoon,    skyColorSunset, fraction, 0.25, 0.25);
    }
    // Evening to Night, fraction 0.5 to 0.6, interval=0.1
    else if (fraction < 0.6)
    {
        groundColor_changed = interpolate (groundColorSunset, groundColorNight, fraction, 0.5, 0.1);
           skyColor_changed = interpolate (   skyColorSunset,    skyColorNight, fraction, 0.5, 0.1);
    }
    // Night (unchanging), fraction 0.6 to 0.95, interval=0.35
    else if (fraction < 0.95)
    {
        groundColor_changed = groundColorNight;
           skyColor_changed = skyColorNight;
    }
    // Night to Sunrise, fraction 0.95 to 1.0, interval=0.05
    else // (fraction < 1.0)
    {
        groundColor_changed = interpolate (groundColorNight, groundColorSunrise, fraction, 0.95, 0.05);
           skyColor_changed = interpolate (   skyColorNight,    skyColorSunrise, fraction, 0.95, 0.05);
    }
//    Browser.print ('groundColor_changed=' + groundColor_changed.toString() + '\n');
//    Browser.print ('   skyColor_changed=' +    skyColor_changed.toString() + '\n');
}
function interpolate (firstColorArray, secondColorArray, fraction, initialFraction, interval)
{
    f = (fraction - initialFraction) / interval; // f should range from 0 to 1
//  Browser.print ('initialFraction=' + initialFraction + ', fraction=' + fraction + ', f=' + f + '\n');

    color0 = firstColorArray[0] + (secondColorArray[0] - firstColorArray[0]) * f;
    color1 = firstColorArray[1] + (secondColorArray[1] - firstColorArray[1]) * f;
    color2 = firstColorArray[2] + (secondColorArray[2] - firstColorArray[2]) * f;
    color3 = firstColorArray[3] + (secondColorArray[3] - firstColorArray[3]) * f;
    color4 = firstColorArray[4] + (secondColorArray[4] - firstColorArray[4]) * f;
    return new MFColor (color0, color1, color2, color3, color4);
}
"""),
    ROUTE(fromField='fraction_changed',fromNode='TimeOfDayClock',toField='set_fraction',toNode='BackgroundColorInterpolator'),
    Background(DEF='AnimatedBackground',groundAngle=[0.03,1.26,1.5,1.57],groundColor=[(0.133333,0.419608,0),(0.36,0.1,0),(1,0.74,0.4),(0,0,0.5),(0,0,0.2)],skyAngle=[0.03,0.05,1.5,1.57],skyColor=[(1,1,1),(0.8,0.8,0.8),(0.1,0.1,0.1),(0,0,0),(0,0,0)]),
    ROUTE(fromField='groundColor_changed',fromNode='BackgroundColorInterpolator',toField='groundColor',toNode='AnimatedBackground'),
    ROUTE(fromField='skyColor_changed',fromNode='BackgroundColorInterpolator',toField='skyColor',toNode='AnimatedBackground')])
) # X3D model complete

####################################################################################################
# Self-test diagnostics
####################################################################################################

print('Self-test diagnostics for BackgroundTimeOfDay.py:')
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

print("python BackgroundTimeOfDay.py load and self-test diagnostics complete.")
