// Description: Script that converts typed values
// Filename:    Convert.js
// Author:      Leonard Daly
// Identifier:  http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14-Prototypes/Convert.js
// Created:     1 January 1999
// Revised:     13 March 2008
// Reference:   http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Scripts
// License:     ../license.html

function setDigits (v, p) {
  return Math.floor (v*p + .5) / p;
}

function sfVec3f (value) {
  x = setDigits (value[0], 100);
  y = setDigits (value[1], 100);
  z = setDigits (value[2], 100);
  sfVec3fString = new MFString (x + '  ' + y + '  ' + z);
}

function sfRotation (value) {
  x = setDigits (value[0], 100);
  y = setDigits (value[1], 100);
  z = setDigits (value[2], 100);
  r = setDigits (value[3], 1000);
  sfRotationString = new MFString (x + '  ' + y + '  ' + z + '  ' + r);
}
