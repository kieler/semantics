<#include "/assets/read_and_write.ftl">
<#include "/assets/serial.ftl">
<#include "/assets/timing.ftl">
#include "Arduino.h"
#include "kieler-gen/${model_name}.c"

// The data for the model
TickData tickData;

// Declaration snippets
${decls}

void setup() {
    // Initialization snippets
${inits}
    
    // Init model file
    reset(&tickData);
}

void loop() {
    // Input snippets
${inputs}
        
    // Reaction of model
    tick(&tickData);

    // Output snippets
${outputs}
}