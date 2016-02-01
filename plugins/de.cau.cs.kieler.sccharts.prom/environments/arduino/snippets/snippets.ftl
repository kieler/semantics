<#-- Delay -->
<#-- As output variable, delays the execution in milliseconds of the variable value.

     Example for SCCharts:
         @Wrapper "Delay"
         output int delay = 500; -->
<#macro Delay>
    <@declaration>
        extern int ${varname};
    </@>
    <@output>
        if(${varname} > 0)
            delay(${varname});
    </@>
</#macro>

<#-- SerialRate -->
<#-- As output variable, sets the rate for serial communication.
     This is done only once in the initialization.

     Example for SCCharts:
         @Wrapper "SerialRate"
         output int serialRate = 9600; -->
<#macro SerialRate>
    <@decl>
        extern int ${varname};
    </@>
    <@init>
        Serial.begin(${varname});
    </@>
</#macro>

<#-- DigitalWrite port -->
<#-- As output variable, sets the value of the given IO pin to HIGH (variable is true) or LOW (variable is false).

     Example for SCCharts:
         @Wrapper "DigitalWrite", "13"
         output bool pinState = true; -->
<#macro DigitalWrite port>
    <@declaration>
        extern char ${varname};
    </@>
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

<#-- DigitalRead port -->
<#-- As input variable, reads the value of the given IO pin.
     If the IO pin has the value LOW, the variable will be false.
     Otherwise it will be true.

     Example for SCCharts:
         @Wrapper "DigitalRead", "10"
         input bool pinState; -->
<#macro DigitalRead port>
    <@declaration>
        extern char ${varname};
    </@>
    <@init>
        pinMode(${port}, INPUT);
    </@>
    <@input>
        ${varname} = digitalRead(${port}) ? HIGH : LOW;
    </@>
</#macro>

<#-- AnalogRead port -->
<#-- As input variable, reads the value of the given analog IO pin.
     Voltage from 0V to 5V is linearly mapped to an integer value from 0 to 1023.  

     Example for SCCharts:
         @Wrapper "AnalogRead", "A1"
         input int pinValue; -->
<#macro AnalogRead port>
    <@declaration>
        extern int ${varname};
    </@>
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
         @Wrapper "AnalogWrite", "A1"
         output int pinValue = 512; -->
<#macro AnalogWrite port>
    <@declaration>
        extern int ${varname};
    </@>
    <@init>
        pinMode(${port}, OUTPUT);
    </@>
    <@output>
        analogWrite(${port}, ${varname});
    </@>
</#macro>