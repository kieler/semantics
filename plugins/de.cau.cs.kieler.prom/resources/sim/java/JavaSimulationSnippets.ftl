
/*****************************************************************************/
/* MACROS TO SEND / RECEIVE A VARIABLE
/*****************************************************************************/

<#macro Simulate isInput isOutput isSignal>
    <@input>
    </@>
    <@output>
    // Send ${varname}
    if(json.endsWith("}"))
        json += ",";
    json += "\"${varname}\":{";
    <#if vartype == "int" || vartype == "float">
    json += "\"value\":"+String.valueOf(model.${varname});
    <#elseif vartype == "bool">
    json += "\"value\":"+String.valueOf(model.${varname});
    <#elseif vartype == "string">
    json += "\"value\":\""+model.${varname}+"\"";
    </#if>
    json += ",";
    json += "\"type\":\"${vartype}\"";
    json += ",";
    json += "\"input\":${isInput?c}";
    json += ",";
    json += "\"output\":${isOutput?c}";
    json += ",";
    json += "\"signal\":${isSignal?c}";
    json += "}";
    </@>
</#macro>