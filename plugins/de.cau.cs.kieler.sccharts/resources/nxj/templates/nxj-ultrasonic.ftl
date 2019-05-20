<#-- UltrasonicSensor -->
<#-- As an input variable, sets variable to the measured distance. 

     Example for SCCharts:
         input float 
         @Wrapper "UltrasonicSensor", "S1" distance
-->
<#macro UltrasonicSensor position>
<#if position=="init">
<#list parameters["UltrasonicSensor"] as parameters>
        UltrasonicSensor usSensor${parameters.parameter1} = new UltrasonicSensor(SensorPort.${parameters.parameter1});
</#list>
</#if>
<#if position=="input">
<#list parameters["UltrasonicSensor"] as parameters>
        // Ultrasonic sensor
        scchart.${parameters.varName} = usSensor${parameters.parameter1}.getDistance();
</#list>
</#if>
</#macro>
