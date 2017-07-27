<#--
/*****************************************************************************/
/* MACROS TO SEND / RECEIVE A VARIABLE
/*****************************************************************************/
-->
<#macro Simulate isInput isOutput indices...>
    <@input>
        // Receive ${varname}
        variable = cJSON_GetArrayItem(variables, i);
        if(variable != NULL) {
            cJSON *value_item = cJSON_GetObjectItemCaseSensitive(variable, "value");
            <#if indices?has_content>
            cJSON *array_values = cJSON_GetObjectItemCaseSensitive(value_item, "values");
            int oneDimIndex = 0;
            <#assign index = 0>
            <#list indices as s>
            for(int i${index} = 0; i${index} < ${s}; i${index}++) {
            <#assign index = index+1>
            </#list>
                cJSON *array_value = cJSON_GetArrayItem(array_values, oneDimIndex);
                <@array_elem indices /> = <@value_of_item "array_value" />
                oneDimIndex++;
            <#list indices as s>
            }
            </#list>
            <#else>
            ${varname} = <@value_of_item "value_item" />
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
            <#assign index = 0>
            <#list indices as s>
            for(int i${index} = 0; i${index} < ${s}; i${index}++) {
            <#assign index = index+1>
            </#list>
                cJSON_AddItemToArray(arrValues, <@cJSON_value_method />(<@array_elem indices />));
            <#list indices as s>
            }
            </#list>
        <#else>
            cJSON_AddItemToObject(variable, "value", <@cJSON_value varname />);
        </#if>
        cJSON_AddStringToObject(variable, "type", "${vartype}");
        cJSON_AddBoolToObject(variable, "in", ${isInput?c});
        cJSON_AddBoolToObject(variable, "out", ${isOutput?c});
    </@>
</#macro>

<#macro array_elem indices>
${varname}<#list indices as s>[i${index}]</#list><#t>
</#macro>

<#macro cJSON_value var>
<@cJSON_value_method />(${var})<#t>
</#macro>

<#macro value_of_item item>
<#if vartype == "int" || vartype == "float">
${item}->valuedouble;
<#elseif vartype == "bool">
${item}->valueint;
<#elseif vartype == "string">
${item}->valuestring;
</#if>
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