/*****************************************************************************/
/* MACROS TO SEND / RECEIVE A VARIABLE
/*****************************************************************************/
<#macro Simulate interface indices...>
    <#-- host types are not supported -->
    <#if varType != "host">
    <@sim_input>
    // Receive ${varName}
    if(json.has("${varName}")) {
      jsonVar = json.getJSONObject("${varName}");
      <#if indices?has_content>
      arrayObject = jsonVar.getJSONObject("value");
      jsonArray = arrayObject.getJSONArray("values");
      int oneDimIndex = 0;
      <#assign index = 0>
      <#list indices as s>
      for(int i${index} = 0; i${index} < ${s}; i${index}++) {
      <#assign index = index+1>
      </#list>
          <@array_elem indices /> = jsonArray.<@value_getter />(oneDimIndex);
          oneDimIndex++;
      <#list indices as s>
      }
      </#list>
      <#else>
      model.${varName} = jsonVar.<@value_getter />("value");
      </#if>
    }
    </@>
    <@sim_output>
    // Send ${varName}
    jsonVar = new JSONObject();
    json.put("${varName}", jsonVar);
    <#if indices?has_content>
    arrayObject = new JSONObject();
    jsonArray = new JSONArray();
    <#list indices as s>
    jsonArray.put(${s});
    </#list>
    arrayObject.put("indices", jsonArray);
    arrayObject.put("values", model.${varName});
    jsonVar.put("value", arrayObject);
    <#else>
    jsonVar.put("value", model.${varName});
    </#if>
    // Set additional information about the variable only in initialization
    if(nextTick == 0) {
      jsonVar.put("type", "${varType}");
      jsonVar.put("interface", ${interface});
    }
    </@>
    </#if>
</#macro>

<#macro value_getter>
<#if varType == "int">
getInt<#t>
<#elseif varType ==  "unsigned">
getLong<#t>
<#elseif varType ==  "float">
getFloat<#t>
<#elseif varType == "bool" || varType == "pure">
getBoolean<#t>
<#elseif varType == "string">
getString<#t>
</#if>
</#macro>

<#macro array_elem indices>
model.${varName}<#assign index = 0><#list indices as s>[i${index}]<#assign index = index+1></#list><#t>
</#macro>
