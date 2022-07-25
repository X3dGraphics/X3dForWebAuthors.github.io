// Functions for ProximitySensor

function position (value) {
  x = Math.floor (value[0] * precision + .5) / precision;
  y = Math.floor (value[1] * precision + .5) / precision;
  z = Math.floor (value[2] * precision + .5) / precision;
  print ('position: ' + x + ' ' + y + ' ' + z);
}

function orientation (value) {
  x = Math.floor (value[0] * precision + .5) / precision;
  y = Math.floor (value[1] * precision + .5) / precision;
  z = Math.floor (value[2] * precision + .5) / precision;
  a = Math.floor (value[3] * precision + .5) / precision;
  print ('orientation: ' + x + ' ' + y + ' ' + z + ' ' + a);
}

// Functions for VisibilitySensor

function isVisible (value) {
  print ('The region is visible: ' + value);
}
