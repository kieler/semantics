<#-- UltrasonicSensor -->
<#-- As an input variable, sets variable to the measured distance. 

     Example for SCCharts:
         @Wrapper UltraSonic, S1
         input float distance;
-->
<#macro UltrasonicSensor port >
    <@init>
        <@InitUltrasonicSensor port/>
        float usSensor${port}Samples[] = new float[usSensor${port}.sampleSize()];
    </@>
    <@input>
        usSensor${port}.getDistanceMode().fetchSample(usSensor${port}Samples, 0);
        scchart.${varname} = usSensor${port}Samples[0];
    </@>
</#macro>



<#-- Auxiliary macro to initialize an ultrasonic sensor if it is not yet initialized.
     This macro is not meant to be used in a model file. -->
<#macro InitUltrasonicSensor port>
        <#if !((initializedUltrasonicSensors![])?seq_contains(port))>
        <#assign initializedUltrasonicSensors = (initializedUltrasonicSensors![]) + [port]>
        EV3UltrasonicSensor usSensor${port} = new EV3UltrasonicSensor(SensorPort.${port});
        </#if>
</#macro>