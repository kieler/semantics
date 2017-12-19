<#--
/*****************************************************************************/
/* MACROS TO SEND / RECEIVE A VARIABLE
/*****************************************************************************/
-->
<#macro Simulate interface indices...>
    <@input>
      <#-- setting strings is not supported at the moment -->
      <#if varType != "string">
        // Receive ${varName}
        variable = cJSON_GetObjectItemCaseSensitive(root, "${varName}");
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
            tickData.${varName} = <@value_of_item "value_item" />
            </#if>
        }
      </#if>
    </@>
    <@output>
        // Send ${varName}
        variable = cJSON_CreateObject();
        cJSON_AddItemToObject(root, "${varName}", variable);
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
            cJSON_AddItemToObject(variable, "value", <@cJSON_value varName />);
        </#if>
        // Send additional information about variable only in first tick
        if(nextTick == 0) {
          cJSON_AddStringToObject(variable, "type", "${varType}");
          cJSON_AddNumberToObject(variable, "interface", ${interface});
        }
    </@>
</#macro>

<#macro array_elem indices>
tickData.${varName}<#assign index = 0><#list indices as s>[i${index}]<#assign index = index+1></#list><#t>
</#macro>

<#macro cJSON_value var>
<#if varType == "string">
<@cJSON_value_method />((tickData.${var} != NULL) ? tickData.${var} : "")<#t>
<#else>
<@cJSON_value_method />(tickData.${var})<#t>
</#if>
</#macro>

<#macro value_of_item item>
<#if varType == "bool" || varType == "pure" || varType == "int">
${item}->valueint;
<#elseif varType == "double" || varType == "float">
${item}->valuedouble;
<#elseif varType == "string">
${item}->valuestring;
</#if>
</#macro>

<#macro cJSON_value_method>
<#if varType == "int" || varType == "float" || varType == "double">
cJSON_CreateNumber<#t>
<#elseif varType == "bool" || varType == "pure">
cJSON_CreateBool<#t>
<#elseif varType == "string">
cJSON_CreateString<#t>
</#if>
</#macro>