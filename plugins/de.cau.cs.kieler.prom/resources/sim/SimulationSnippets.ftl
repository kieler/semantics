
/*****************************************************************************/
/* MACROS TO SEND / RECEIVE A VARIABLE
/*****************************************************************************/

<#macro Simulate isInput isOutput isSignal>
    <@input>
    // Receive ${varname} 
    variable = cJSON_GetObjectItemCaseSensitive(root, "${varname}");
    if(variable != NULL) {
        cJSON *value_item = cJSON_GetObjectItemCaseSensitive(variable, "value");
        <#if vartype == "int" || vartype == "float">
        ${varname} = value_item->valuedouble;
        <#elseif vartype == "bool">
        ${varname} = value_item->valueint;
        <#elseif vartype == "string">
        ${varname} = value_item->valuestring;
        </#if>
    } else {
        printf("WARNING: Did not receive variable ${varname}\n");
    }
    </@>
    <@output>
    // Send ${varname} 
    variable = cJSON_CreateObject();
    cJSON_AddItemToObject(root, "${varname}", variable);
    <#if vartype == "int" || vartype == "float">
    cJSON_AddNumberToObject(variable, "value", ${varname});
    <#elseif vartype == "bool">
    cJSON_AddBoolToObject(variable, "value", ${varname});
    <#elseif vartype == "string">
    cJSON_AddStringToObject(variable, "value", ${varname});
    </#if>
    cJSON_AddStringToObject(variable, "type", "${vartype}");
    cJSON_AddBoolToObject(variable, "input", ${isInput?c});
    cJSON_AddBoolToObject(variable, "output", ${isOutput?c});
    cJSON_AddBoolToObject(variable, "signal", ${isSignal?c});
    </@>
</#macro>