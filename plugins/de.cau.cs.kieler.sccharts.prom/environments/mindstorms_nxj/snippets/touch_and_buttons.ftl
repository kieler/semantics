<#-- Button -->
<#-- As input variable, sets the variable to true, iff the corresponding button on the Mindstorms brick is down.
     The buttons are ENTER, LEFT, RIGHT.

     Example for SCCharts:
         @Wrapper Button, ENTER 
         input bool isEnterDown; -->
<#macro Button buttonId>
    <@input>
        // Button
        scchart.${varname} = Button.${buttonId}.isDown();
    </@>
</#macro>

<#-- TouchSensor -->
<#-- As input variable, reads the touch sensor, that is attached to the given port.

     Example for SCCharts:
         @Wrapper TouchSensor, S3 
         input bool isTouchSensorPressed; -->
<#macro TouchSensor port>
    <@init>
        TouchSensor touchSensor${port} = new TouchSensor(SensorPort.${port});
    </@>
    <@input>
        // Touch
        scchart.${varname} = touchSensor${port}.isPressed();
    </@>
</#macro>