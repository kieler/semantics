
<#-- Dynamic loading of registered templates  -->
<#list inject_templates as template >
    <#include template>
</#list>

<#-- Dynamic invocation of registered macros  -->
<#--  Please refer to de.cau.cs.kieler.kicool.deploy.TemplateInjection for common positions -->
<#macro inject position>
    <#if inject_macros[position]?? >
        <#list inject_macros[position] as macroName>
            <#-- Invoke registered macros  -->
            <@.vars[macroName] position=position />
        </#list>
    </#if>
</#macro>
