/*****************************************************************************/
/* MACROS TO SEND / RECEIVE A VARIABLE
/*****************************************************************************/
<#macro Simulate isInput isOutput indices...>
    <@input>
    // Receive ${varname}
    var = vars.getJSONObject(i);
    model.${varname} = var.<@value_getter />("value");
    i++;
    </@>
    <@output>
    // Send ${varname}
    var = new JSONObject();
    var.put("name", "${varname}");
    var.put("value", model.${varname});
    var.put("type", "${vartype}");
    var.put("in", ${isInput?c});
    var.put("out", ${isOutput?c});
    vars.put(var);
    </@>
</#macro>

<#macro value_getter>
<#if vartype == "int">
getInt<#t>
<#elseif vartype ==  "float">
getFloat<#t>
<#elseif vartype == "bool">
getBoolean<#t>
<#elseif vartype == "string">
getString<#t>
</#if>
</#macro>