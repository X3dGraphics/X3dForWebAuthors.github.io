function angle (value) {
  posRed = new SFVec3f (Math.cos (value), 1.5 * Math.sin(value), .5);
  posGrn = new SFVec3f (Math.cos (value+2.094), 1.5 * Math.sin(value+2.094),   0);
  posTuq = new SFVec3f (Math.cos (value+4.189), 1.5 * Math.sin(value+4.189), -.5);

  orRed = new SFRotation (0, 0, 1, -2*value);
  orGrn = new SFRotation (0, 0, 1, -2*(value+2.094));
  orTuq = new SFRotation (0, 0, 1, -2*(value+4.189));

}

