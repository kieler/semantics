<#-- initOnce -->
<#-- Inserts the initialization code identified by the given flag
     only if it was not done yet.
     
     You can use this instead of <@init>...</@init>.
     
     example usage:
     <@initOnce "motor">
        ONE TIME MOTOR CODE
     </@> -->
<#macro initOnce flag>
    <@init>
        <@singleton flag>
        <#nested>
        </@singleton>
    </@init>
</#macro>

<#-- singleton -->
<#-- Inserts the following code identified by the given flag
     only once, even if there are multiple annotations using it.
     
     example usage:
     <@singleton "motor">
        ONE TIME MOTOR CODE
     </@> -->
<#macro singleton flag>
    <#if !singletons??> <#-- If singletons list does not exist, create it -->
    <#assign singletons = []>
    </#if>
    <#if !(singletons?seq_contains(flag))> <#-- Check if flag is new -->
    <#assign singletons = singletons + [flag]> <#-- Remember flag -->
    <#nested> <#-- Add nested code -->
    </#if>
</#macro>