#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>

// Include JSON library and file to be simulated.
#include "../lib/cJSON.c"
#include "${compiled_model_loc}"

// Determines if a simin file with the json object should be generated,
// which can be used to feed the simulation when starting the executable not from within KIELER.
// #define WRITE_SIMIN_FILE

cJSON* output = 0;

int tickTime = 0;

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
        
${inputs}    

    // Add additional variable to data pool
    // Receive tickTime
        variable = cJSON_GetArrayItem(variables, i);
        if(variable != NULL) {
            cJSON *value_item = cJSON_GetObjectItemCaseSensitive(variable, "value");
            tickTime = value_item->valueint;

        } else {
            printf("WARNING: Did not receive variable I\n");
        }
        i++;

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
    
    // Add additional variable to data pool
    // Send tickTime
        variable = cJSON_CreateObject();
        cJSON_AddItemToArray(variables, variable);
        cJSON_AddStringToObject(variable, "name", "tickTime");
            cJSON_AddItemToObject(variable, "value", cJSON_CreateNumber(tickTime));
        cJSON_AddStringToObject(variable, "type", "int");
        cJSON_AddBoolToObject(variable, "in", false);
        cJSON_AddBoolToObject(variable, "out", true);
        
    // Get JSON object as string
    char* outString = cJSON_Print(root);
    cJSON_Minify(outString);
    // Flush to stdout
    printf("%s\n", outString);
    fflush(stdout);
    
#ifdef WRITE_SIMIN_FILE
    // Flush to simin file
    FILE *file = fopen("json_output.simin", "w");
    if(file != NULL) {
      fprintf(file, "%s\n", outString);
      fclose(file);
    }
#endif

    cJSON_Delete(root);
}

int main(int argc, const char* argv[]) {
    // Initialize 
    reset();
    sendVariables();
    
    while (1) {
        // Receive variables
        receiveVariables();
        
        struct timespec _start, _end;
        
        // Reaction of model
        clock_gettime(CLOCK_REALTIME, &_start);
        tick();
        clock_gettime(CLOCK_REALTIME, &_end);
        tickTime = (int)_end.tv_nsec - (int)_start.tv_nsec;        
         
        // Send variables
        sendVariables();
    }
}