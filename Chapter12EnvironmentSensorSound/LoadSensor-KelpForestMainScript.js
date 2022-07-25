// Filename:    LoadSensor-KelpForestMainScript.js
// Description: Report LoadSensor progress
// Author:      Leonard Daly and Don Brutzman
// Identifier:  http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12-EnvironmentSensorSound/LoadSensor-KelpForestMainScript.js
// Created:     10 June 2006
// Revised:     17 October 2015
// Reference:   http://X3dGraphics.com/examples/X3dForWebAuthors/Chapter12-EnvironmentSensorSound/LoadSensor-KelpForestMain.x3d
// License:     http://X3dGraphics.com/examples/X3dForWebAuthors/license.html

// <field accessType='inputOnly' name='progress' type='SFFloat'/>

function initialize () {
  Browser.print ('*************************   LoadSensor initialize()  *************');
}

function progress (value, time) {
  Browser.print ('***** New Entry ****');
  Browser.print (time.toString() + ':  Progress = ' + value.toString());
}
