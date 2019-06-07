<#-- Delay -->
<#-- The integer value in the output variable delays the execution by the variable value in milliseconds.

     Example for SCCharts:
         output int
         @macro "Delay" delayTime = 500; 

-->
         
<#macro Delay position>
<#if position=="output">
<#list parameters["Delay"] as parameters>
if(${tickdata_name}${parameters.varName} > 0) {
    delay(${tickdata_name}${parameters.varName});
}
</#list>
</#if>
</#macro>


<#-- Clock -->
<#-- Sets a boolean input variable to true after the given time (in milliseconds) has passed.

     Example for SCCharts:
         input bool 
         @macro "Clock", "1000" second; 
        
-->

<#macro Clock position>
<#if position=="global-decl">
<#list parameters["Clock"] as parameters>
unsigned long clock_${parameters.voName};
</#list>
</#if>

<#if position=="init">
<#list parameters["Clock"] as parameters>
clock_${parameters.voName} = millis();
</#list>
</#if>

<#if position=="input">
<#list parameters["Clock"] as parameters>
// Clock
${tickdata_name}${parameters.varName} = false;
if((millis() - clock_${parameters.voName}) > ${parameters.parameter1}){
    clock_${parameters.voName} = millis();
    ${tickdata_name}${parameters.varName} = true;
}
</#list>
</#if>
</#macro>



<#-- Time -->
<#-- The input variable contains the elapsed time since program start in milliseconds.

    Example:
    input int 
    @macro "Time" time; -->
    
<#macro Time position>
<#if position=="input">
<#list parameters["Time"] as parameters>
// Time
${tickdata_name}${parameters.varName} = millis();
</#list>
</#if>
</#macro>


<#-- TimeMicros -->
<#-- The input variable contains the elapsed time since program start in milliseconds.

    Example:
    input int 
    @macro "TimeMicros" time; -->
    
<#macro TimeMicros position>
<#if position=="input">
<#list parameters["TimeMicros"] as parameters>
// Time
${tickdata_name}${parameters.varName} = micros();
</#list>
</#if>
</#macro>