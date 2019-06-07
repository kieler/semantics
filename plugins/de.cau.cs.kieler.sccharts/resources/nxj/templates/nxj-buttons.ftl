<#-- Button -->
<#-- As input variable, sets the variable to true, iff the corresponding button on the Mindstorms brick is down.
     The buttons are ENTER, LEFT, RIGHT.

     Example for SCCharts:
         input bool 
         @macro "Button", "ENTER" isEnterDown
-->
<#macro Button position>
<#if position=="input">
<#list parameters["Button"] as parameters>
        // Button
        scchart.${parameters.varName} = Button.${parameters.parameter1}.isDown();
</#list>
</#if>
</#macro>