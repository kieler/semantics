<#-- Gyro -->
<#-- As input variable, read the value of the gyro sensor at the given port.
     
     Possible modes are:
         Angle : Measures the orientation of the sensor in degrees.
         Rate : Measures the angular velocity of the sensor in (degrees / second).
     
     Example:
     @Wrapper Gyro, S3, Angle
     input float angle; -->
<#macro Gyro port mode = "Angle">
    <@init>
        <@InitGyroSensor port />
        float gyroSensor${port}Samples[] = new float[gyroSensor${port}.sampleSize()];
    </@>
    <@input>
        // Gyro sensor
        gyroSensor${port}.getMode("${mode}").fetchSample(gyroSensor${port}Samples, 0);
        scchart.${varname} = gyroSensor${port}Samples[0];
    </@>
    <@release>
        // Gyro ${port}
        gyroSensor${port}.close();
    </@>
</#macro>

<#-- CalibrateGyro -->
<#-- As output variable, if the value is true, reset the gyro sensor at given port.
     The sensor should be motionless during calibration.
     
     If autoReset is set to true, the reset variable is set to false automatically. 
     
     Example for SCCharts:
         @Wrapper CalibrateGyro, S3;
         output bool resetGyro; -->
<#macro CalibrateGyro port autoReset = 'true'>
    <@init>
        <@InitGyroSensor port />
    </@>
    <@output>
        // Reset gyro sensor
        if(scchart.${varname}){
            gyroSensor${port}.reset();
            <#if autoReset == 'true'>
            scchart.${varname} = false;
            </#if>
        }
    </@>
</#macro>



<#-- Auxiliary macro to initialize a gyro sensor if it is not yet initialized.
     This macro is not meant to be used in a model file. -->
<#macro InitGyroSensor port>
        <#if !((initializedLights![])?seq_contains(port))>
        <#assign initializedLights = (initializedLights![]) + [port]>
        EV3GyroSensor gyroSensor${port} = new EV3GyroSensor(SensorPort.${port});
        </#if>
</#macro>