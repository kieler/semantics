<#-- TouchSensor -->
<#-- As input variable, reads the touch sensor, that is attached to the given port.

     Example for SCCharts:
         input bool 
         @macro "TouchSensor", "S3" isTouchSensorPressed
-->
<#macro TouchSensor position>
<#if position=="init">
<#list parameters["TouchSensor"] as parameters>
        TouchSensor touchSensor${parameters.parameter1} = new TouchSensor(SensorPort.${parameters.parameter1});
</#list>
</#if>
<#if position=="input">
<#list parameters["TouchSensor"] as parameters>
        // Touch
        scchart.${parameters.varName} = touchSensor${parameters.parameter1}.isPressed();
</#list>
</#if>
</#macro>