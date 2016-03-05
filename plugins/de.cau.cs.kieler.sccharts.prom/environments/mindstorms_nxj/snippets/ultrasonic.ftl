<#-- UltrasonicSensor -->
<#-- As an input variable, sets variable to the measured distance. 

     Example for SCCharts:
         @Wrapper UltraSonic, S1
         input float distance;
-->
<#macro UltrasonicSensor port >
    <@init>
        UltrasonicSensor usSensor${port} = new UltrasonicSensor(SensorPort.${port});
    </@>
    <@input>
        // Ultrasonic sensor
        scchart.${varname} = usSensor${port}.getDistance();
    </@>
</#macro>
