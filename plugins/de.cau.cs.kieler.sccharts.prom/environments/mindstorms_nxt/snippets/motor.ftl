
<#-- MotorSpeed -->
<#-- As input variable, reads the speed of the motor, that is attached to the given port.
     As output variable, sets the speed of the motor.
     If the speed is zero and brake is true, the motor will stop nearly immediately.
     If brake is false, the motor will only lose all power, setting it to roll / float.
     
     Example for SCCharts:
         @Wrapper MotorSpeed, A
         @Wrapper MotorSpeed, B
         output int speed; -->
<#macro MotorSpeed port brake=true>
    <@input>
        // Motor ${port}
        scchart.${varname} = Motor.${port}.getSpeed();
    </@>
    <@output>
        // Motor ${port}
        if (Math.abs(scchart.${varname}) != Motor.${port}.getSpeed()) {
            Motor.${port}.setSpeed(Math.abs(scchart.${varname}));
            if(scchart.${varname} == 0)
                <#if brake>
                Motor.${port}.stop(true);
                <#else>
                Motor.${port}.flt(true);
                </#if>
            else if(scchart.${varname} > 0)
                Motor.${port}.forward();
            else if(scchart.${varname} < 0)
                Motor.${port}.backward();
        }
    </@>
</#macro>

<#-- MotorIsMoving -->
<#-- As input variable, sets a boolean to true, iff the motor on the given port is moving.
     
     Example for SCCharts:
         @Wrapper MotorIsMoving, A
         input bool isMotorMoving; -->
<#macro MotorIsMoving port>
    <@input>
        // Motor ${port}
        scchart.${varname} = Motor.${port}.isMoving();
    </@>
</#macro>

<#-- MotorRotation -->
<#-- As input variable, reads the motor rotation in degrees.
     As output variable, commands the motor, that is attached to the given port,
            to rotate the variable's value in degrees.
        This is done only if the variable's value is unequal zero
        and afterwards the variable is set back to zero.
     
     Example for SCCharts:
         @Wrapper MotorRotation, A
         output int rotateToDegrees; -->
<#macro MotorRotation port>
    <@input>
        // Motor ${port}
        scchart.${varname} = Motor.${port}.getTachoCount();
    </@>
    <@output>
        // Motor ${port}
        if(scchart.${varname} != 0){
            Motor.${port}.rotate(scchart.${varname}, true);
            scchart.${varname} = 0;
        }
    </@>
</#macro>