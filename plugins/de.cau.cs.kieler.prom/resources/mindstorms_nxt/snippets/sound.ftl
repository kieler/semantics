<#-- Beep -->
<#-- As output variable, plays a warning beep as long as the variable is true.

     Example for SCCharts:
         @Wrapper Beep
         ouput bool warningBeep; -->
<#macro Beep volume=10>
    <@output>
        // Play beep sound
        if(scchart.${varname}) {
            int lastVolume = Sound.getVolume();
            Sound.setVolume(${volume});
            Sound.beep();
            Sound.setVolume(lastVolume);
        }
    </@>
</#macro>

<#-- Buzz -->
<#-- As output variable, plays a low buzz sound as long as the variable is true.

     Example for SCCharts:
         @Wrapper Beep
         ouput bool warningBeep; -->
<#macro Buzz volume="10">
    <@output>
        // Play buzz sound
        if(scchart.${varname}) {
            int lastVolume = Sound.getVolume();
            Sound.setVolume(${volume});
            Sound.buzz();
            Sound.setVolume(lastVolume);
        }
    </@>
</#macro>

<#-- BeepSequence -->
<#-- As output variable, plays a beep sequence if the variable is true and afterwards sets the variable to false.
     The direction of the beep sequence can either be up or down.
     
     Example for SCCharts:
         @Wrapper BeepSequence, Up
         ouput bool playBeepSequence; -->
<#macro BeepSequence direction="Down" volume=10>
    <@output>
        // Play sequence of beep tones
        if(scchart.${varname}) {
            scchart.${varname} = false;
            int lastVolume = Sound.getVolume();
            Sound.setVolume(${volume});
            <#if direction == "Up">
            Sound.beepSequenceUp();
            <#elseif direction == "Down">
            Sound.beepSequence();
            </#if>
            Sound.setVolume(lastVolume);
        }
    </@>
</#macro>
