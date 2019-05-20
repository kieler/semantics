<#-- LightSensor -->
<#-- As input variable, reads the value of the light sensor, that is attached to the given port.

     Example for SCCharts:
         input int 
         @macro "LightSensor", "port" light
     Optional:
         boolean: Normalized value         
-->
<#macro LightSensor position>
<#if position=="init">
<#list parameters["LightSensor"] as parameters>
        LightSensor lightSensor${parameters.parameter1} = new LightSensor(SensorPort.${parameters.parameter1});
</#list>        
</#if>
<#if position=="input">
<#list parameters["LightSensor"] as parameters>
        // Light
        <#if (parameters.parameter2!"false")=="true">
        scchart.${parameters.varName} = lightSensor${parameters.parameter1}.readNormalizedValue();
        <#else>
        scchart.${parameters.varName} = lightSensor${parameters.parameter1}.getLightValue();
        </#if>
</#list>        
</#if>
</#macro>

<#-- CalibrateLightSensor -->
<#-- As output variable, calibrates the light sensor if the variable is true.
     A light sensor can return percent values where 0% is returned for the calibrated low value
     and 100% is returned for the calibrated high value. 
       
     To calibrate, signal has to be either "High" or "Low". 

     Example for SCCharts:
         output bool 
         @macro "CalibrateLightSensor", "S3", "High" calibrateWhite
-->
 <#macro CalibrateLightSensor position>
<#if position=="output">
<#list parameters["CalibrateLightSensor"] as parameters>
        // Calibrate light sensor
        if (scchart.${parameters.varName}) {
            scchart.${parameters.varName} = false;
            lightSensor${parameters.parameter1}.calibrate${parameters.parameter2}();
        }
</#list>        
</#if>
</#macro>

<#-- GetFloodlight -->
<#-- The Floodlight is the red lamp of a light sensor, that can be turned on and off.
     As input variable, reads the Floodlight state (on or off), that is attached to the given port.
     As output variable, turns the lamp on (true) or off (false).
     
     Example for SCCharts:
         output bool 
         @macro "Floodlight", "S3" floodlight
-->
<#macro Floodlight position>
<#if position=="input">
<#list parameters["Floodlight"] as parameters>
        // Floodlight ${parameters.parameter1}
        scchart.${parameters.varName} = lightSensorFloodlight${parameters.parameter1}.getFloodlight();
</#list>        
</#if>
</#macro>

<#-- Floodlight -->
<#-- The Floodlight is the red lamp of a light sensor, that can be turned on and off.
     As input variable, reads the Floodlight state (on or off), that is attached to the given port.
     As output variable, turns the lamp on (true) or off (false).
     
     Example for SCCharts:
         output bool 
         @macro "Floodlight", "S3" floodlight
-->
<#macro Floodlight position>
<#if position=="init">
<#list parameters["Floodlight"] as parameters>
        LightSensor lightSensorFloodlight${parameters.parameter1} = new LightSensor(SensorPort.${parameters.parameter1}, true);
        boolean floodlightIsOn${parameters.parameter1} = false;
</#list>        
</#if>
<#if position=="output">
<#list parameters["Floodlight"] as parameters>
        // Floodlight ${parameters.parameter1}
        if (scchart.${parameters.varName} != floodlightIsOn${parameters.parameter1}) {
            lightSensorFloodlight${parameters.parameter1}.setFloodlight(scchart.${parameters.varName});
            System.out.println(scchart.${parameters.varName});
            floodlightIsOn${parameters.parameter1} = scchart.${parameters.varName};
        }
</#list>        
</#if>
</#macro>

<#-- RCXLamp -->
<#-- As output variable, turns an RCX lamp on (variable is true) or off (variable is false).
     RCX lamps can be connected to the ports A, B, C and D.

     Example for SCCharts:
         output bool 
         @macro "RCXLamp", "A" lamp
 -->
<#macro RCXLamp position>
<#if position=="init">
<#list parameters["RCXLamp"] as parameters>
        RCXMotor rcxMotor${parameters.parameter1} = new RCXMotor(MotorPort.${parameters.parameter1});
        // Provide base power for RCX lamp
        rcxMotor${parameters.parameter1}.setPower(100);
        rcxMotor${parameters.parameter1}.flt();
</#list>        
</#if>
<#if position=="output">
<#list parameters["RCXLamp"] as parameters>
        // RCX lamp ${parameters.parameter1}
        if(scchart.${parameters.varName})
            rcxMotor${parameters.parameter1}.forward();
        else
            rcxMotor${parameters.parameter1}.flt();
</#list>        
</#if>
</#macro>