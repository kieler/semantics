<#-- MotorSpeed -->
<#-- As input variable, reads the speed of the motor, that is attached to the given port.
     As output variable, sets the speed of the motor.
     
     If the speed is zero and brake is true, the motor will stop nearly immediately.
     If brake is false, the motor will only lose all power, setting it to roll / float.
     
     Example for SCCharts:
         @Wrapper MotorSpeed, A
         @Wrapper MotorSpeed, B
         output int speed; -->
<#macro MotorSpeed port brake='true'>
    <@init>
        <@InitMotor port />
    </@>
    <@input>
        // Motor ${port}
        scchart.${varname} = motor${port}.getSpeed();
    </@>
    <@output>
        // Motor ${port}
        if (Math.abs(scchart.${varname}) != motor${port}.getSpeed()) {
            motor${port}.setSpeed(Math.abs(scchart.${varname}));
            if(scchart.${varname} == 0)
                <#if brake='true'>
                motor${port}.stop(true);
                <#else>
                motor${port}.flt(true);
                </#if>
            else if(scchart.${varname} > 0)
                motor${port}.forward();
            else if(scchart.${varname} < 0)
                motor${port}.backward();
        }
    </@>
    <@release>
        // Motor ${port}
        motor${port}.close();
    </@>
</#macro>

<#-- MotorIsMoving -->
<#-- As input variable, sets a boolean to true, iff the motor on the given port is moving.
     
     Example for SCCharts:
         @Wrapper MotorIsMoving, A
         input bool isMotorMoving; -->
<#macro MotorIsMoving port>
    <@init>
        <@InitMotor port />
    </@>
    <@input>
        // Motor ${port}
        scchart.${varname} = motor${port}.isMoving();
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
    <@init>
        <@InitMotor port />
    </@>
    <@input>
        // Motor ${port}
        scchart.${varname} = motor${port}.getTachoCount();
    </@>
    <@output>
        // Motor ${port}
        if(scchart.${varname} != 0){
            motor${port}.rotate(scchart.${varname}, true);
            scchart.${varname} = 0;
        }
    </@>
    <@release>
        // Motor ${port}
        motor${port}.close();
    </@>
</#macro>



<#-- Auxiliary macro to initialize a motor if it is not yet initialized.
     This macro is not meant to be used in a model file. -->
<#macro InitMotor port>
        <#if !((initializedMotors![])?seq_contains(port))>
        <#assign initializedMotors = (initializedMotors![]) + [port]>
        RegulatedMotor motor${port} = new EV3LargeRegulatedMotor(MotorPort.${port});
        </#if>
</#macro>

<#-- Auxiliary macro to initialize an RCX motor if it is not yet initialized.
     This macro is not meant to be used in a model file. -->
<#macro InitRCXMotor port>
        <#if !((initializedRCXMotors![])?seq_contains(port))>
        <#assign initializedRCXMotors = (initializedRCXMotors![]) + [port]>
        RCXMotor rcxMotor${port} = new RCXMotor(MotorPort.${port});
        </#if>
</#macro>