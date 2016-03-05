<#-- LightSensor -->
<#-- As input variable, reads the value of the light sensor, that is attached to the given port.

     Example for SCCharts:
         @Wrapper LightSensor, S3
         input int light; -->
 <#macro LightSensor port getPerCentValue='false'>
    <@init>
        LightSensor lightSensor${port} = new LightSensor(SensorPort.${port});
    </@>
    <@input>
        // Light
        <#if getPerCentValue=='true'>
        scchart.${varname} = lightSensor${port}.readNormalizedValue();
        <#else>
        scchart.${varname} = lightSensor${port}.getLightValue();
        </#if>
    </@>
</#macro>

<#-- CalibrateLightSensor -->
<#-- As output variable, calibrates the light sensor if the variable is true.
     A light sensor can return percent values where 0% is returned for the calibrated low value
     and 100% is returned for the calibrated high value. 
       
     To calibrate, signal has to be either "High" or "Low". 

     Example for SCCharts:
         @Wrapper CalibrateLightSensor, S3, High
         output bool calibrateWhite; -->
 <#macro CalibrateLightSensor port signal>
    <@output>
        // Calibrate light sensor
        if (scchart.${varname}) {
            scchart.${varname} = false;
            lightSensor${port}.calibrate${signal}();
        }
    </@>
</#macro>

<#-- Floodlight -->
<#-- The Floodlight is the red lamp of a light sensor, that can be turned on and off.
     As input variable, reads the Floodlight state (on or off), that is attached to the given port.
     As output variable, turns the lamp on (true) or off (false).
     
     Example for SCCharts:
         @Wrapper Floodlight, S3 
         output bool floodlight; -->
<#macro Floodlight port>
    <@init>
        LightSensor lightSensorFloodlight${port} = new LightSensor(SensorPort.${port});
    </@>
    <@input>
        // Floodlight ${port}
        scchart.${varname} = lightSensorFloodlight${port}.getFloodlight();
    </@>
    <@output>
        // Floodlight ${port}
        lightSensorFloodlight${port}.setFloodlight(scchart.${varname});
    </@>
</#macro>

<#-- RCXLamp -->
<#-- As output variable, turns an RCX lamp on (variable is true) or off (variable is false).
     RCX lamps can be connected to the ports A, B, C and D.

     Example for SCCharts:
         @Wrapper RCXLamp, A 
         output bool lamp; -->
<#macro RCXLamp port>
    <@init>
        RCXMotor rcxMotor${port} = new RCXMotor(MotorPort.${port});
        // Provide base power for RCX lamp
        rcxMotor${port}.setPower(100);
        rcxMotor${port}.flt();
    </@>
    <@output>
        // RCX lamp ${port}
        if(scchart.${varname})
            rcxMotor${port}.forward();
        else
            rcxMotor${port}.flt();
    </@>
</#macro>