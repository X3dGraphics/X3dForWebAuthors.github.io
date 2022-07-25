function initialize () {
  scriptLoaded = TRUE;
}
function shutdown () {
  scriptLoaded = FALSE;
}
function displayEventTimeBool (value, time) {
  Browser.print ('Boolean event with value = ' + value + ' at ' + time);
}
function buttonMotionDone (value) {
  if (! value) {
    if (buttonDown) {
      motion = new MFVec3f (new SFVec3f(0, .05, 0), new SFVec3f(0, .25, 0));
      buttonDown = false;
      lightColor = new SFColor (1, 1, 0);

     } else {
      motion = new MFVec3f (new SFVec3f(0, .25, 0), new SFVec3f(0, .05, 0));
      buttonDown = true;
      lightColor = new SFColor (.4, .4, .4);
    }
  }
}
