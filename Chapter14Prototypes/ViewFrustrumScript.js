// Description: Perform geometric computations for ViewFrustrum prototype
// Filename:    ViewFrustrumScript.js
// Author:      Don Brutzman
// Identifier:  http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14-Prototypes/ViewFrustrumScript.js
// Created:     16 August 2008
// Revised:     17 August 2008
// Reference:   ViewFrustrumPrototype.x3d
// Reference:   ViewFrustrumExample.x3d
// Drawing:     ViewFrustrumComputation.png
// License:     ../license.html

function initialize ()
{
    var scriptName = 'ViewFrustrumScript';

    if ((ViewpointNode == null) || (NavigationInfoNode == null))
    {
        Browser.println ('[' + scriptName + '] ' + 'Viewpoint and/or NavigationInfo undefined, no ViewFrustrum drawn');
        return;
    }        
    if (trace) Browser.println ('[' + scriptName + '] ' + 'input  ' +
        '<Viewpoint position="'        + ViewpointNode.position.toString() + '"' +
               ' orientation="'        + ViewpointNode.orientation.toString() + '"' +
               ' fieldOfView="'        + ViewpointNode.fieldOfView.toString() + '"' + '/>');
    position_changed    = ViewpointNode.position;
    orientation_changed = ViewpointNode.orientation_changed;

    if (trace) Browser.println ('[' + scriptName + '] ' + 'input  ' +
        '<NavigationInfo avatarSize="' + NavigationInfoNode.avatarSize.toString() + '"' +
                  ' visibilityLimit="' + NavigationInfoNode.visibilityLimit.toString() + '"/>');
    var nearClipPlaneDistance = NavigationInfoNode.avatarSize[0];
    var  farClipPlaneDistance = NavigationInfoNode.visibilityLimit;
    if  (farClipPlaneDistance == 0) 
    {
        farClipPlaneDistance = 10000.0;
        Browser.println ('[' + scriptName + '] ' + 'visibilityLimit="0" unlimited, drawing farClipPlaneDistance at 10000m');
    }    
    var nearHalfWidth  = Math.tan(ViewpointNode.fieldOfView / 2.0) * nearClipPlaneDistance;
    var  farHalfWidth  = Math.tan(ViewpointNode.fieldOfView / 2.0) *  farClipPlaneDistance;
    
    spine_changed = new MFVec3f (new SFVec3f (0.0, 0.0, nearClipPlaneDistance), 
                                 new SFVec3f (0.0, 0.0,  farClipPlaneDistance));
    scale_changed        = new MFVec2f (new SFVec2f (nearHalfWidth, aspectRatio * nearHalfWidth),
                                        new SFVec2f ( farHalfWidth, aspectRatio *  farHalfWidth));
    if (trace) Browser.println ('[' + scriptName + '] ' + 'output ' +
        '<Extrusion DEF="FrustrumExtrusion"' +
               ' spine="' + spine_changed.toString() + '"' +
               ' scale="' + scale_changed.toString() + '"' + '/>');  // default crossSection used

    point_changed = new MFVec3f (
      new SFVec3f ( nearHalfWidth,  aspectRatio * nearHalfWidth, nearClipPlaneDistance),
      new SFVec3f ( nearHalfWidth, -aspectRatio * nearHalfWidth, nearClipPlaneDistance),
      new SFVec3f (-nearHalfWidth, -aspectRatio * nearHalfWidth, nearClipPlaneDistance),
      new SFVec3f (-nearHalfWidth,  aspectRatio * nearHalfWidth, nearClipPlaneDistance),
      new SFVec3f (  farHalfWidth,  aspectRatio *  farHalfWidth,  farClipPlaneDistance),
      new SFVec3f (  farHalfWidth,  aspectRatio * -farHalfWidth,  farClipPlaneDistance),
      new SFVec3f ( -farHalfWidth,  aspectRatio * -farHalfWidth,  farClipPlaneDistance),
      new SFVec3f ( -farHalfWidth,  aspectRatio *  farHalfWidth,  farClipPlaneDistance));
    if (trace) Browser.println ('[' + scriptName + '] ' + 'output ' +
        '<Coordinate DEF="FrustrumCoordinate"' +
               ' point="' + point_changed.toString() + '"' + '/>');
}

function recompute (value)
{
    if (value == true) initialize();
}