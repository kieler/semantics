<#-- Button -->
<#-- As input variable, sets the variable to true, iff the corresponding button on the Mindstorms brick is down.
     The buttons are ENTER, LEFT, RIGHT, UP, DOWN.

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
        EV3TouchSensor touchSensor${port} = new EV3TouchSensor(SensorPort.${port});
        float touchSensor${port}Samples[] = new float[touchSensor${port}.sampleSize()];
    </@>
    <@input>
        // Touch
        touchSensor${port}.getTouchMode().fetchSample(touchSensor${port}Samples, 0);
        scchart.${varname} = touchSensor${port}Samples[0] > 0;
    </@>
    <@release>
        // Touch ${port}
        touchSensor${port}.close();
    </@>
</#macro>