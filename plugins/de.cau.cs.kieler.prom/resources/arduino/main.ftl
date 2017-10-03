<#include "/assets/snippets/read_and_write.ftl">
<#include "/assets/snippets/serial.ftl">
<#include "/assets/snippets/timing.ftl">
#include "Arduino.h"
#import "kieler-gen/${model_name}.c"

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