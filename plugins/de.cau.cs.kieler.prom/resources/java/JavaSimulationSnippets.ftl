/*****************************************************************************/
/* MACROS TO SEND / RECEIVE A VARIABLE
/*****************************************************************************/
<#macro Simulate interface indices...>
    <@input>
    // Receive ${varName}
    if(json.has("${varName}")) {
      jsonVar = json.getJSONObject("${varName}");
      model.${varName} = jsonVar.<@value_getter />("value");
    }
    </@>
    <@output>
    // Send ${varName}
    jsonVar = new JSONObject();
    json.put("${varName}", jsonVar);
    jsonVar.put("value", model.${varName});
    // Set additional information about the variable only in initialization
    if(nextTick == 0) {
      jsonVar.put("type", "${varType}");
      jsonVar.put("interface", ${interface});
    }
    </@>
</#macro>

<#macro value_getter>
<#if varType == "int">
getInt<#t>
<#elseif varType ==  "float">
getFloat<#t>
<#elseif varType == "bool">
getBoolean<#t>
<#elseif varType == "string">
getString<#t>
</#if>
</#macro>