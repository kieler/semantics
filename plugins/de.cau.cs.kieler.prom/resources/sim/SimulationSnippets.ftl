
/*****************************************************************************/
/* MACROS TO SEND / RECEIVE A VARIABLE
/*****************************************************************************/

<#macro Simulate isInput isOutput indices...>
    <@input>
        // Receive ${varname}
        variable = cJSON_GetArrayItem(variables, i);
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
        i++;
    </@>
    <@output>
        // Send ${varname} 
        variable = cJSON_CreateObject();
        cJSON_AddItemToArray(variables, variable);
        cJSON_AddStringToObject(variable, "name", "${varname}");
        <#if indices?has_content>
            // Send array as object
            arr = cJSON_CreateObject();
            cJSON_AddItemToObject(variable, "value", arr);
            // Add indices
            arrIndices = cJSON_CreateArray();
            cJSON_AddItemToObject(arr, "indices", arrIndices);
            <#list indices as s>
            cJSON_AddItemToArray(arrIndices, cJSON_CreateNumber(${s}));
            </#list>
            // Add values of (multidimensional) array in single row.
            arrValues = cJSON_CreateArray();
            cJSON_AddItemToObject(arr, "values", arrValues);
            <#list indices as s>
            for(int i${s?index} = 0; i${s?index} < ${s}; i${s?index}++) {
            </#list>
                cJSON_AddItemToArray(arrValues, <@cJSON_value_method />(<@array_elem indices />));
            <#list indices as s>
            }
            </#list>
        <#else>
        cJSON_AddItemToObject(variable, "value", <@cJSON_value varname />);
        </#if>
        cJSON_AddStringToObject(variable, "type", "${vartype}");
        cJSON_AddBoolToObject(variable, "input", ${isInput?c});
        cJSON_AddBoolToObject(variable, "output", ${isOutput?c});
    </@>
</#macro>

<#macro array_elem indices>
${varname}<#list indices as s>[i${s?index}]</#list><#t>
</#macro>

<#macro cJSON_value var>
<@cJSON_value_method />(${var})<#t>
</#macro>

<#macro cJSON_value_method>
<#if vartype == "int" || vartype == "float">
cJSON_CreateNumber<#t>
<#elseif vartype == "bool">
cJSON_CreateBool<#t>
<#elseif vartype == "string">
cJSON_CreateString<#t>
</#if>
</#macro>