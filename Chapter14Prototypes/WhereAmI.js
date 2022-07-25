// Description: Script that writes current view position and orientation to X3C browser console
// Filename:    WhereAmI.js
// Author:      Leonard Daly
// Identifier:  http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter14-Prototypes/WhereAmI.js
// Created:     1 January 1999
// Revised:     13 March 2008
// Reference:   http://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Scripts
// License:     ../license.html

function position (value) {
  x = setDigits (value[0], 100);
  y = setDigits (value[1], 100);
  z = setDigits (value[2], 100);

  Browser.print ('Position (X,Y,Z) = ' + x + ' ' + y + ' ' + z + '\n');
}

function orientation (value) {
  x = setDigits (value[0], 1000);
  y = setDigits (value[1], 1000);
  z = setDigits (value[2], 1000);
  r = setDigits (value[3], 100);
  Browser.print ('Orientation (X,Y,Z,R) = ' + x + ' ' + y + ' ' + z + ' ' + r + '\n');
}

function setDigits (v, p) {
  return Math.floor (v*p + .5) / p;
}
