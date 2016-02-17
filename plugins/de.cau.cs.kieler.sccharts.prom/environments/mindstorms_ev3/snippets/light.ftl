<#-- LightSensor -->
<#-- As input variable, reads the value of the light sensor, that is attached to the given port.
     The modes are:
         Red : Measures the intensity of a reflected red light
         Ambient : Measures the ambient light level

     Example for SCCharts:
         @Wrapper LightSensor, S3
         input float light; -->
 <#macro LightSensor port mode = "Ambient">
    <@init>
        <@InitLightSensor port />
        float lightSensor${port}Samples[] = new float[lightSensor${port}.sampleSize()];
    </@>
    <@input>
        // Light
        lightSensor${port}.getMode("${mode}").fetchSample(lightSensor${port}Samples, 0);
        scchart.${varname} = lightSensor${port}Samples[0];
    </@>
    <@release>
        // Light ${port}
        lightSensor${port}.close();
    </@>
</#macro>

<#-- Floodlight -->
<#-- The Floodlight is the red lamp of a light sensor, that can be turned on and off.
     As input variable, reads the Floodlight state (on or off), that is attached to the given port.
     As output variable, turns the lamp on (true) or off (false).
     
     Note: Switching the floodlight state on the new EV3ColorSensor is much slower than on the old NXT light sensor  (seconds vs milliseconds).
     
     Example for SCCharts:
         @Wrapper Floodlight, S3 
         output bool floodlight; -->
<#macro Floodlight port>
    <@init>
        <@InitLightSensor port />
    </@>
    <@input>
        // Floodlight ${port}
        scchart.${varname} = (lightSensor${port}.getFloodlight() != Color.NONE);
    </@>
    <@output>
        // Floodlight ${port}
        if(scchart.${varname}) {
            if(lightSensor${port}.getFloodlight() != Color.RED){
                lightSensor${port}.setFloodlight(Color.RED);
            }
        } else {
            if(lightSensor${port}.getFloodlight() != Color.NONE){
                lightSensor${port}.setFloodlight(Color.NONE);
            }
        }
    </@>
    <@release>
        // Floodlight ${port}
        lightSensor${port}.close();
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
        <@InitRCXMotor port />
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
    <@release>
        // RCX Motor for RCX lamp
        rcxMotor${port}.close();
    </@>
</#macro>

<#-- EV3ButtonLED -->
<#-- As output variable, set pattern of button LED.
     Values are 0-9:
         0: turn off button lights
         1: static green light
         2: static red light
         3: static yellow light
         4: slowly blinking green light
         5: slowly blinking red light
         6: slowly blinking yellow light
         7: fast blinking green light
         8: fast blinking red light
         9: fast blinking yellow light
         
    Example for SCCharts:
        @Wrapper EV3ButtonLED
        output int ledPattern -->
<#macro EV3ButtonLED>
    <@output>
        // Pattern for on-board LED of EV3 brick.
        Button.LEDPattern(scchart.${varname});
    </@>
</#macro>



<#-- Auxiliary macro to initialize a light sensor if it is not yet initialized.
     This macro is not meant to be used in a model file. -->
<#macro InitLightSensor port>
        <#if !((initializedLights![])?seq_contains(port))>
        <#assign initializedLights = (initializedLights![]) + [port]>
        EV3ColorSensor lightSensor${port} = new EV3ColorSensor(SensorPort.${port});
        </#if>
</#macro>