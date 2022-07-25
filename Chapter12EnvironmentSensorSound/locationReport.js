function position (value) {
  x = setDigits (value[0], 100);
  y = setDigits (value[1], 100);
  z = setDigits (value[2], 100);
  positionText = new MFString ('Position  ' + x + '  ' + y + '  ' + z);

  Browser.print (positionText[0]+'\n');
}
function orientation (value) {
  x = setDigits (value[0], 1000);
  y = setDigits (value[1], 1000);
  z = setDigits (value[2], 1000);
  r = setDigits (value[3], 100);
  orientationText = new MFString ('Rotation  ' + x + '  ' + y + '  ' + z + '  ' + r);

  Browser.print (orientationText[0]+'\n');
}

function setDigits (v, p) {
  return Math.floor (v*p + .5) / p;
}
