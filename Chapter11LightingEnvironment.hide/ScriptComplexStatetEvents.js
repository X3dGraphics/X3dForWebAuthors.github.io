function buttonMotionDone (value) {
  if (value) {
    motion = new MFVec3f (new SFVec3f(0, .25, 0), new SFVec3f(0, .05, 0));
   } else {

    buttonDown ++;
    if (buttonDown > 3) {
      buttonDown = 0;
    }
    motion = new MFVec3f (new SFVec3f(0, .05, 0), new SFVec3f(0, .25, 0));
    if (buttonDown == 0) {
      lightColor = new SFColor (.4, .4, .4);
     } else if (buttonDown == 1) {
      lightColor = new SFColor (.7, .7, .2);
     } else if (buttonDown == 2) {
      lightColor = new SFColor (1, 1, 0);
     } else if (buttonDown == 3) {
      lightColor = new SFColor (.9, .9, 1);
    }
  }
}
