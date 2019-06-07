
<#-- GetMotorSpeed -->
<#-- As input variable, reads the speed of the motor, that is attached to the given port.
     
     Example for SCCharts:
         output int 
         @macro "MotorSpeed", "A", speedLeft
-->
<#macro GetMotorSpeed position>
<#if position=="input">
<#list parameters["GetMotorSpeed"] as parameters>
        // Motor ${parameters.parameter1}
        scchart.${parameters.varName} = Motor.${parameters.parameter1}.getSpeed();
</#list>        
</#if>
</#macro>

<#-- MotorSpeed -->
<#-- As output variable, sets the speed of the motor.
     If the speed is zero and brake is true, the motor will stop nearly immediately.
     If brake is false, the motor will only lose all power, setting it to roll / float.
     
     Example for SCCharts:
         output int 
         @macro "MotorSpeed", "A", speedLeft
     Optional:
         bool: use brake
-->
<#macro MotorSpeed position>
<#if position=="init">
<#list parameters["MotorSpeed"] as parameters>
        // Motor ${parameters.parameter1}
        int lastMotor${parameters.parameter1}_${parameters.varName} = -900000;
</#list>        
</#if>
<#if position=="output">
<#list parameters["MotorSpeed"] as parameters>
        // Motor ${parameters.parameter1}
        if (lastMotor${parameters.parameter1}_${parameters.varName} != scchart.${parameters.varName}) {
            lastMotor${parameters.parameter1}_${parameters.varName} = scchart.${parameters.varName};
            Motor.${parameters.parameter1}.setSpeed(Math.abs(scchart.${parameters.varName}));
            if(scchart.${parameters.varName} == 0)
                <#if (parameters.parameter2!"false")=="true">
                Motor.${parameters.parameter1}.stop(true);
                <#else>
                Motor.${parameters.parameter1}.flt(true);
                </#if>
            else if(scchart.${parameters.varName} > 0)
                Motor.${parameters.parameter1}.forward();
            else 
                Motor.${parameters.parameter1}.backward();
        }
</#list>        
</#if>
</#macro>

<#-- MotorRotationSpeed -->
<#-- As output variable, sets the speed of the motor while rotating.
     Setting this does not move the motor.
     
     Example for SCCharts:
         output int 
         @macro "MotorRotationSpeed", "A", speedLeft
-->
<#macro MotorRotationSpeed position>
<#if position=="output">
<#list parameters["MotorRotationSpeed"] as parameters>
        // Motor ${parameters.parameter1}
        if (scchart.${parameters.varName} != 0) {
            Motor.${parameters.parameter1}.setSpeed(Math.abs(scchart.${parameters.varName}));
            scchart.${parameters.varName} = 0;
        }
</#list>        
</#if>
</#macro>

<#-- MotorIsMoving -->
<#-- As input variable, sets a boolean to true, iff the motor on the given port is moving.
     
     Example for SCCharts:
         input bool 
         @macro "MotorIsMoving", "A" isMotorMoving
-->
<#macro MotorIsMoving position>
<#if position=="input">
<#list parameters["MotorIsMoving"] as parameters>
        // Motor ${parameters.parameter1}
        scchart.${parameters.varName} = Motor.${parameters.parameter1}.isMoving();
</#list>        
</#if>
</#macro>

<#-- GetMotorRotation -->
<#-- As input variable, reads the motor rotation in degrees.
     As output variable, commands the motor, that is attached to the given port,
            to rotate the variable's value in degrees.
        This is done only if the variable's value is unequal zero
        and afterwards the variable is set back to zero.
     
     Example for SCCharts:
         output int 
         @macro "GetMotorRotation", "A" rotateToDegrees
-->
<#macro GetMotorRotation position>
<#if position=="input">
<#list parameters["GetMotorRotation"] as parameters>
        // Motor ${parameters.parameter1}
        scchart.${parameters.varName} = Motor.${parameters.parameter1}.getTachoCount();
</#list>        
</#if>
</#macro>

<#-- MotorRotation -->
<#-- As output variable, commands the motor, that is attached to the given port,
            to rotate the variable's value in degrees.
        This is done only if the variable's value is unequal zero
        and afterwards the variable is set back to zero.
     
     Example for SCCharts:
         output int 
         @macro "MotorRotation", "A" rotateToDegrees
-->
<#macro MotorRotation position>
<#if position=="output">
<#list parameters["MotorRotation"] as parameters>
        // Motor ${parameters.parameter1}
        if(scchart.${parameters.varName} != 0){
            Motor.${parameters.parameter1}.rotate(scchart.${parameters.varName}, true);
            scchart.${parameters.varName} = 0;
        }
</#list>        
</#if>
</#macro>