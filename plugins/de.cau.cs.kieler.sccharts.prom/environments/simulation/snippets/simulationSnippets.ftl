<#macro Simulate>
	<@input>
	child = cJSON_GetObjectItem(object, "${varname}");
	if (child != NULL) {
		present = cJSON_GetObjectItem(child, "present");
		value = cJSON_GetObjectItem(child, "value");
		if (present != NULL && present->type) {
			${varname} = 1;
		} else if (value != NULL && value->type) {
			${varname} = value->valueint;
		} else {
			${varname} = 0;
		}
	}
	</@>
	<@output>
	value = cJSON_CreateObject();
    cJSON_AddItemToObject(value, "value", cJSON_CreateNumber(${varname}));
   	cJSON_AddItemToObject(output, "${varname}", value);
	</@>
</#macro>