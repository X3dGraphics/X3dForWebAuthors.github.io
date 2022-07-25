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
