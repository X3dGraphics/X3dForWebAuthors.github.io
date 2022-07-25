function initialize () {
  Browser.print ('*************************   LoadSensor initialize()  *************');
}

function progress (value, time) {
  Browser.print ('***** New Entry ****');
  Browser.print (time + ':  Progress = ' + value);
}
