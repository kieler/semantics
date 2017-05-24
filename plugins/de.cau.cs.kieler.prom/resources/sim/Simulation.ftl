/*****************************************************************************/
/* SIMULATION WRAPPER CODE
/*****************************************************************************/

#include <string.h>
#include <stdlib.h>
#include <stdio.h>

#include "cJSON.c"
#include "${compiled_model_loc}"

/*****************************************************************************/
/* SIMULATION WRAPPER CODE
/*****************************************************************************/

cJSON* output = 0;

void receiveVariables() {
    char buffer[10000];
    int i = 0;
    char c;
    // read next line
    for (i = 0; (c = getchar()) != '\n'; i++) {
        buffer[i] = c;
    }
    buffer[i] = 0;

    cJSON * root = cJSON_Parse(buffer);
    cJSON* variables = cJSON_GetObjectItemCaseSensitive(root, "variables");
    if(cJSON_IsArray(variables)) {
        cJSON* variable = 0;
        int i = 0;
    

    } else {
        printf("WARNING: Did not receive JSON input\n");
    }
  
    cJSON_Delete(root);
}

void sendVariables() {
    cJSON* root = cJSON_CreateObject();
    
    cJSON* variables = cJSON_CreateArray();
    cJSON_AddItemToObject(root, "variables", variables);
  
    cJSON* variable = 0;
    cJSON* arr = 0;
    cJSON* arrIndices = 0;
    cJSON* arrValues = 0;
    
${outputs}

    char* outString = cJSON_Print(root);
    cJSON_Minify(outString);
    printf("%s\n", outString);
    fflush(stdout);
    
    cJSON_Delete(root);
}

int main(int argc, const char* argv[]) {
    // Initialize 
    reset();
    sendVariables();
    
    while (1) {
        // Receive variables
        receiveVariables();
  
        // Reaction of model
        tick();
         
        // Send variables
        sendVariables();
    }
}