ecmascript:

// Description: Type conversion of position and orientation values to MFString
// Filename:    convertText.js
// Author:      Leonard Daly and Don Brutzman
// Identifier:  http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12-EnvironmentSensorSound/convertText.js
// Created:     15 July 2006
// Revised:     30 October 2008
// License:     ../license.html

function position (positionValue) {
  x = setDigits (positionValue[0], 100);
  y = setDigits (positionValue[1], 100);
  z = setDigits (positionValue[2], 100);

  positionText = new MFString ('Position  ' + x + '  ' + y + '  ' + z);
//  Browser.print (positionText[0]+'\n');
}
function orientation (orientationValue) {
  x = setDigits (orientationValue[0], 1000);
  y = setDigits (orientationValue[1], 1000);
  z = setDigits (orientationValue[2], 1000);
  r = setDigits (orientationValue[3], 100);
  orientationText = new MFString ('Orientation  ' + x + '  ' + y + '  ' + z + '  ' + r);
//  Browser.print (orientationText[0]+'\n');
}

function setDigits (val, precision) {
  return Math.floor (val*precision + .5) / precision;
}
