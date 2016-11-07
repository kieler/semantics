<#-- DigitalWrite port -->
<#-- As output variable, sets the the given IO pin to HIGH (variable is true) or LOW (variable is false).

     Example for SCCharts:
         @Wrapper DigitalWrite, "13"
         output bool pinState = true; -->
<#macro DigitalWrite port>
    <@init>
        pinMode(${port}, OUTPUT);
    </@>
    <@output>
        if(${varname}) {
            digitalWrite(${port}, HIGH);
        } else {
            digitalWrite(${port}, LOW);
        }
    </@>
</#macro>

<#-- DigitalRead ports -->
<#-- As input variable, reads the given IO pins.
     If an IO pin has the value LOW, the corresponding variable will be false.
     Otherwise it will be true.
     
     This macro is suited for arrays as well as simple variables.

     Example for SCCharts:
         @Wrapper DigitalRead, "10"
         input bool pinState;
         @Wrapper DigitalRead, "11", "12", "13"
         input bool pinStates[3]; -->
<#macro DigitalRead ports...>
    <@init>
        <#list ports as port>
        pinMode(${port}, INPUT);
        </#list>
    </@>
    <@input>
        <#if (ports?size > 1)>
        <#list ports as port>
        ${varname}[${port?index}] = digitalRead(${port}) ? HIGH : LOW;
        </#list>
        <#else>
        ${varname} = digitalRead(${ports[0]}) ? HIGH : LOW;
        </#if>
    </@>
</#macro>

<#-- AnalogRead port -->
<#-- As input variable, reads the value of the given analog IO pin.
     Voltage from 0V to 5V is linearly mapped to an integer value from 0 to 1023.  

     Example for SCCharts:
         @Wrapper AnalogRead, A1
         input int pinValue; -->
<#macro AnalogRead port>
    <@init>
        pinMode(${port}, INPUT);
    </@>
    <@input>
        ${varname} = analogRead(${port});
    </@>
</#macro>

<#-- AnalogWrite port -->
<#-- As output variable, sets the voltage of the given analog IO pin via pulse-width modulation (PWM).
     Integers from 0 to 1023 are linearly mapped to an pseudo voltage 0V to 5V.  

     Example for SCCharts:
         @Wrapper AnalogWrite, A1
         output int pinValue = 512; -->
<#macro AnalogWrite port>
    <@init>
        pinMode(${port}, OUTPUT);
    </@>
    <@output>
        analogWrite(${port}, ${varname});
    </@>
</#macro>