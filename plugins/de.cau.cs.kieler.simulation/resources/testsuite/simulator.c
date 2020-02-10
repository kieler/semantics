
#include <stdlib.h>

#include <signal.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

#include <math.h>
#include <stdio.h>
#include <string.h>

#include "lib/cJSON.h"

typedef struct {
	int fd;
	char *buffer;
	size_t length;
	size_t offset;
} ReadBuffer;

typedef struct {
	pid_t pid;
	int writefd;
	int readfd;
	ReadBuffer reader;
} Model;

typedef struct _struct_ModelStack{
	Model model;
	struct _struct_ModelStack *next;
} ModelStack;


#define EXIT_MALLOC_ERROR    2

#define SIG_MASK_CHILDTERM   1
#define SIG_MASK_PIPETERM    2
#define SIG_MASK_PRINTED   128

#define MODE_ANALYSIS  0
#define MODE_TRACE_OUT 1

#define TRUE  1
#define FALSE 0

// boolean: should a "*_val" value of the expected output
// be ignored if model doesnt provide one
static int ignore_noneexistent_val;
// boolean: should a "*_val" value of the expected output with value 1
// be ignored if model doesnt provide one
static int ignore_noneexistent_val1;
// boolean: use the "_val" variant of the expected output
// if there is one in the expected output but not in the model output.
static int overwrite_with_val;
// boolean: fuzzy-boolean: allow 0 and 1 to be equal to false and true resp..
static int fuzzy_bool;

static int err = 0;
static volatile int signals = 0;

/**
 * Handler for the signal SIGCHILD
 */
void sigchild_handler(int sig) {
	(void) sig;
	signals |= SIG_MASK_CHILDTERM;
}
/**
 * Handler for the signal SIGPIPE to catch read errors
 */
void sigpipe_handler(int sig) {
	(void) sig;
	signals |= SIG_MASK_PIPETERM;
}

/**
 * This function returs a ReadBuffer initialized for the use with the provided file handler.
 */
static ReadBuffer init_read_buffer(int fd) {
	ReadBuffer buffer = {fd, malloc(1024), 1024, 0};
	if (!buffer.buffer) {
		fprintf(stderr, "ERROR: could not allocate read buffer.\n");
		exit(EXIT_MALLOC_ERROR);
	}
	buffer.buffer[0] = '\0';
	return buffer;
}

/**
 * This function gets a NULL terminated list of '\0' terminated Strings of arguments for a model program to execute,
 * where the first argument also represents the model program to execute.
 * This function runs and redirects the input and output into local file handles and returns a Model for interaction.
 * The pid is -1 in case of an error.
 */
static Model startModel(char **argv) {
	Model retval = {-1, -1, -1, {-1, NULL, 0, 0}};
	// crate pipes
	int model_pipes[2][2];
	
	if (pipe(model_pipes[0]) != 0 || pipe(model_pipes[1]) != 0) {
		fprintf(stderr, "ERROR: could not create communication pipes for the model.\n");
		err = 1;
		return retval;
	}
	
	// fork the process
	pid_t child_pid = fork();
	if (child_pid == -1) { // error
		fprintf(stderr, "ERROR: could not fork\n");
		err = 1;
	} else if (child_pid == 0) { // child
		// set pipes to correct filedescriptor
		close(model_pipes[0][1]); // close stdin-pipe write end
		close(model_pipes[1][0]); // close stdout-pipe read end
		
		if (dup2(model_pipes[0][0], STDIN_FILENO) == -1 || dup2(model_pipes[1][1], STDOUT_FILENO) == -1) {
			fprintf(stderr, "ERROR: could replace child stdin and/or stdout.\n");
			err = 1;
			exit(1);
		}
		
		// save execution path and extract filename
		char *file = argv[0];
		// argv[0] should only contain the filename of the executeable
		//for (char *c = argv[0]; *c; c++) {
		//	if (*c == '/' || *c == '\\') argv[0] = c;
		//}
		
		// run the model
		execvp(file, argv);
		
		// should not be reachable
		fprintf(stderr, "ERROR: could not run the model.\n");
		exit(1);
	} else { // parent
		close(model_pipes[0][0]); // close stdin-pipe read end
		close(model_pipes[1][1]); // close stdout-pipe write end
		
		retval.pid = child_pid;
		retval.writefd = model_pipes[0][1];
		retval.readfd  = model_pipes[1][0];
		retval.reader = init_read_buffer(retval.readfd);
	}
	
	return retval;
}




/**
 * This function reads the next JSON Elemant from the provided ReadBuffer, reading more data when necissary from the file handle.
 * If the JSON Parser runs into an error before reaching EOF, then one input character is dropped and the parsing is retried.
 * If a larger buffer is required and realloc fails or EOF is reached without being able to parsa a new value, then NULL is returned.
 * Calling cJSON_Delete on the returned JSON is subject to the calling Function.
 */
static cJSON* get_data(ReadBuffer * read_buffer) {
	// extract data to local vars
	char *buffer  = read_buffer->buffer;
	size_t length = read_buffer->length-1; // -1 for trailing '\0'
	int fd        = read_buffer->fd;
	
	ssize_t read_num;
	cJSON *json = NULL;
	const char *end;
	const char *buffer_start = buffer;
	char *buffer_end = buffer + read_buffer->offset;
	
	while (TRUE) { // abort with 'break' (or 'return' in case of error)
		// Only read JSON-Objects/Strings.
		while (
			buffer_start < buffer_end &&
			*buffer_start != '{' &&
			*buffer_start != '"'
		) { buffer_start++; }
		
		// Try to read next json element.
		if ((json = cJSON_ParseWithOpts(buffer_start, &end, 0)) != NULL) {
			if (end == buffer_end) {
				buffer_end = buffer;
				*buffer_end = '\0';
			} else {
				memmove(buffer, end, buffer_end - end + 1);
				
				// update pointer
				buffer_end = buffer_end - end + buffer;
			}
			
			break;
		}
		
		// can't differenciate from errors vs not enought data
		// since the end marker is at the beginning of the last unfinished token
		// so the input is always expected to be correct and more data is read.

		// need more data
		
		// Is there data to be removed?
		if (buffer < buffer_start) {
			memmove(buffer, buffer_start, buffer_end - buffer_start + 1);
			//offset = buffer_end - buffer_start;
			
			// update pointer
			buffer_end = buffer_end - buffer_start + buffer;
			buffer_start = buffer;
			
		// is a larger buffer needed?
		} else if (length == (unsigned)(buffer_end - buffer)) { // note: length doesn't count trailing '\0'
			buffer = realloc(buffer, (length + 1) * 2);
			if (!buffer) { // error in realloc?
				// save offset to keep data valid/correct
				read_buffer->offset = buffer_end - read_buffer->buffer;
				return NULL;
			} else {
				length = length * 2 + 1; // (length + 1) * 2 - 1 // 1 subtracted for trailing '\0'
				
				// update pointer (read points to old buffer)
				buffer_end = buffer_end - buffer_start + buffer;
				buffer_start = buffer;
				
				// save status back into the read_buffer
				read_buffer->buffer = buffer;
				read_buffer->length = length + 1;
			}
		}
		
		// get more data
		read_num = read(fd, buffer_end, length - (buffer_end - buffer));
		if (read_num < 0) {
			fprintf(stderr, "ERROR: reading input\n");
			break;
		}
		
		buffer_end += read_num;
		// always terminate buffer with '\0'
		*buffer_end = '\0';
		
		if (read_num == 0) { // EOF
			break;
		}
	}
	
	// save status back into the read_buffer
	read_buffer->offset = buffer_end - buffer;
	
	return json;
}

/**
 * This function executes a tick by sending the inputs to the model over stdin and reads the outputs from stdout.
 * The sending part is skipped when stdin is closed.
 * The outputs JSON is returned or NULL on error/EOF.
 * Calling cJSON_Delete on the returned JSON is subject to the calling Function.
 */
static cJSON* run_tick(Model *model, cJSON *setInput) {
	
	// only send inputs if model still accepts inputs (but keep evaluateing output)
	if (model->writefd != -1 && setInput != NULL) {
		char *out = cJSON_PrintUnformatted(setInput);
		
		ssize_t length = (signed) strlen(out) + 1;
		ssize_t wrote;
		out[length-1] = '\n';
		if (length != (wrote = write(model->writefd, out, length))) {
			close(model->writefd);
			model->writefd = -1;
		}
		out[length-1] = '\0'; // just in case cJSON_free uses the string
		cJSON_free(out);
	}
	
	// get ouptuts
	cJSON *json = get_data(&(model->reader));
	
	return json;
}

/**
 * This function returns a boolean expressing wether the given
 * variable is a value-variable
 */
static int isValueVariable(const char* name) {
	int len = strlen(name);
	return len>4 && strcmp(name+len-4, "_val") == 0;
}
/**
 * This function gets the cJSON value of a variable from a cJSON-Object.
 * This function returns NULL if no value was found.
 */
static cJSON *getVariable(cJSON *object, const char* name) {
	return cJSON_GetObjectItemCaseSensitive(object, name);
}
/**
 * This function gets the cJSON value of the value-variable
 * for the given variable from a cJSON-Object
 * This function returns NULL if no value was found.
 */
static cJSON *getVariableValue(cJSON *object, const char* name) {
	int len = strlen(name);
	char* valname = malloc(sizeof(char)*len+sizeof("_val"));
	memcpy(valname, name, len);
	memcpy(valname+len, "_val", sizeof("_val"));
	cJSON *val = cJSON_GetObjectItemCaseSensitive(object, valname);
	free(valname);
	return val;
}

/**
 * This function gets two JSON Objects and check if each element in the expectedOutput is the same in the output JSON.
 * The return value is the number of missing or different values, or -1 if one of the arguments isn't a JSON object.
 */
static int validate_data(cJSON* output, cJSON* expectedOutput, int tick_num) {
	if (!cJSON_IsObject(output) || !cJSON_IsObject(expectedOutput)) return -1;
	
	int errors = 0;
	cJSON *expectedElem = expectedOutput->child;
	
	// loop thru all expected element entries
	while (expectedElem) {
		// get actual result for current key
		cJSON *compareExpected = expectedElem;
		cJSON *outputElem = getVariable(output, expectedElem->string);
		int valueVariable = isValueVariable(expectedElem->string);

		// check if expected variable should be overwritten by the value-variable
		if (overwrite_with_val && !valueVariable) {
			cJSON *expectedElemVal = getVariableValue(expectedOutput, expectedElem->string);
			cJSON *outputElemVal = getVariableValue(output, expectedElem->string);

			if (outputElemVal == NULL && expectedElemVal != NULL) {
				// perform the overwrite

				compareExpected = expectedElemVal;
			}
		}

		if (!outputElem) {
			if (
				valueVariable && (
					ignore_noneexistent_val ||
					(ignore_noneexistent_val1 &&
						cJSON_IsNumber(expectedElem) &&
						expectedElem->valuedouble == 1.0
					)
				)
			) {
				// ignore "*_val" outputs with value 1 if this output doesn't exist
				// (this happens when booleans are traced in an .eso file)
			} else {
				errors++;
				char *outE = cJSON_PrintUnformatted(compareExpected);
				fprintf(
					stderr,
					"OUTPUT ERROR: expected some output for '%s'%s. Got none instead of %s in tick %d.\n",
					expectedElem->string,
					expectedElem == compareExpected ? "" : "_val overwrite",
					outE,
					tick_num
				);
				cJSON_free(outE);
			}
		} else {
			int fuzzyEqual = FALSE;
			if (
				compareExpected->type != outputElem->type &&
				(cJSON_IsBool(compareExpected) || cJSON_IsBool(outputElem))
			) {
				if (cJSON_IsNumber(compareExpected)) {
					if (compareExpected->valuedouble == 0.0 && cJSON_IsFalse(outputElem)) {
						fuzzyEqual = TRUE;
					} else if (compareExpected->valuedouble == 1.0 && cJSON_IsTrue(outputElem)) {
						fuzzyEqual = TRUE;
					}
				} else if (cJSON_IsNumber(outputElem)) {
					if (outputElem->valuedouble == 0.0 && cJSON_IsFalse(compareExpected)) {
						fuzzyEqual = TRUE;
					} else if (outputElem->valuedouble == 1.0 && cJSON_IsTrue(compareExpected)) {
						fuzzyEqual = TRUE;
					}
				}
			}

			if (!fuzzyEqual && !cJSON_Compare(compareExpected, outputElem, 1)) {
				errors++;
				char *outO = cJSON_PrintUnformatted(outputElem);
				char *outE = cJSON_PrintUnformatted(compareExpected);
				fprintf(stderr, "OUTPUT ERROR: different outputs for '%s'. Got %s instead of %s in tick %d.\n",
						expectedElem->string, outO, outE, tick_num);
				cJSON_free(outO);
				cJSON_free(outE);
			}
			
		}
		
		expectedElem = expectedElem->next;
	}
	
	return errors;
}

/**
 * This Function creates a (shallow)copy of an cJSON Object which only contains the items where the key exists and
 * it doesn't start with a underscore. If the supplied json isn't a Object then NULL is returned.
 * All values with keys starting with '#' are also omitted, if the 'allow_hash' value is false.
 * The caller has to delete the returned cJSON object.
 * The returned cJSON object should not be used after the input cJSON value got changed/deleted. (Since it's a shallow copy)
 */
static cJSON* createShallowObject(const cJSON const * json, char allow_hash) {
	if (!cJSON_IsObject(json)) return NULL;
	
	cJSON* resultObject = cJSON_CreateObject();
	
	for (cJSON* item = json->child; item; item = item->next) {
		if (item->string && item->string[0] != '_' && (allow_hash || item->string[0] != '#')) {
			cJSON_AddItemReferenceToObject(resultObject, item->string, item);
		}
	}
	
	return resultObject;
}

/**
 * This Function prints "<at> Got:\n<PrettyPrinted JSON>" to stderr, replaceing <> with parameter values.
 */
static void verbose_JSON_output(cJSON* json, char* at, int verbose_lvl) {
	if (json != NULL) {
		char *out = NULL;
		if (verbose_lvl < 2 && cJSON_IsObject(json)) {
			cJSON* tmpObject = createShallowObject(json, TRUE);
			out = cJSON_Print(tmpObject);
			cJSON_Delete(tmpObject); // delete shallow copy
		} else {
			out = cJSON_Print(json);
		}
		
		fprintf(stderr, "%s Got:\n%s\n", at, out);
		cJSON_free(out);
	} else {
		printf("%s Got nothing.\n", at);
	}
}

static Model getNewModel(char **args, int verbose_lvl) {
	Model model = startModel(args);
	if (err) {
		exit(1);
	}
	// get initial state
	cJSON* json_result = run_tick(&model, NULL);
	if (verbose_lvl) verbose_JSON_output(json_result, "Boot Output", verbose_lvl);
	cJSON_Delete(json_result);
	return model;
}

// entry point of the simulator
int main(int argc, char **argv) {
	int verbose_lvl = 0;
	int mode = MODE_ANALYSIS;

	ignore_noneexistent_val  = TRUE;
	ignore_noneexistent_val1 = TRUE;
	overwrite_with_val = TRUE;
	fuzzy_bool = TRUE;
	
	// extract the command to run (started by '--')
	int run_args = -1;
	for (int i = 1; i<argc; i++) {
		if (strcmp(argv[i], "-v") == 0) {
			verbose_lvl = 1;
			run_args = i+1;
		} else if (strcmp(argv[i], "-vv") == 0) {
			verbose_lvl = 2;
			run_args = i+1;
		} else if (strcmp(argv[i], "--overwrite-val") == 0) {
			run_args = i+1;
			ignore_noneexistent_val  = TRUE;
			ignore_noneexistent_val1 = FALSE;
			overwrite_with_val = TRUE;
		} else if (strcmp(argv[i], "--enforce-output-match") == 0) {
			run_args = i+1;
			ignore_noneexistent_val  = FALSE;
			ignore_noneexistent_val1 = FALSE;
			overwrite_with_val = FALSE;
		} else if (strcmp(argv[i], "--lazy-val") == 0) {
			run_args = i+1;
			ignore_noneexistent_val  = TRUE;
		} else if (strcmp(argv[i], "--trace") == 0) {
			run_args = i+1;
			mode = MODE_TRACE_OUT;
		} else if (strcmp(argv[i], "-?") == 0 || strcmp(argv[i], "--help") == 0) {
			printf("usage: %s [-?|--help|-v|-vv|--trace|--enforce-output-match|--lazy-val] <ModelExecuteable> [<model params> ...]\n\n", argv[0]);
			printf("This simulator expects a multiple of 2 JSON-Objects on stdin.\n");
			printf("The first of every 2 Objects is passed to the model over stdin.\n");
			printf("The model is expected to respond with a JSON-Object on stdout.\n");
			printf("The second JSON-Object is compared to the output of the model.\n");
			printf("Between those tuples of JSON-Objects the JSON-String \"reset\" may occur\n");
			printf("which causes a new model to be started.\n");
			printf("The model is expected to output a JSON-Object on startup which is ignored.\n");
			printf("For timing the model is expected to output it's reaction time as a number\n");
			printf("in the output JSON-Object with the key \"#ticktime\".\n\n");
			printf(" -? -help: shows this help\n");
			printf(" -v: all JSON values get printed to stderr. (without values which key starts with '_' or '#')\n");
			printf(" -vv: all JSON values get printed to stderr.\n");
			printf(" --trace: outputs a new valid tracefile which expects all given model outputs.\n");
			printf(" matching: by default \"*_val\" outputs with value 1 must not match if the model doesn't provide them.\n");
			printf(" --enforce-output-match: every given output has to exist and match.\n");
			printf(" --lazy-val: \"*_val\" outpus may be omitted by the model.\n");
			return 0;
		} else {
			break; // don't read model parameters
		}
	}
	if (run_args < 0) run_args = 1;
	
	if (err) {
		exit(1);
		return 1;
	}
	
	ReadBuffer read_stdin = init_read_buffer(STDIN_FILENO);
	
	
	signal(SIGCHLD, sigchild_handler);
	signal(SIGPIPE, sigpipe_handler);
	
	
	int output_errors = 0;
	int tick_num      = 0;
	double time       = 0.0;
	double minTime    = INFINITY;
	double maxTime    = 0.0;
	cJSON *json;
	cJSON *json_result;
	
	ModelStack *modelStack = NULL;
	Model model = getNewModel(&argv[run_args], verbose_lvl);
	
	while (TRUE) {
		// get inputs to set
		json = get_data(&read_stdin);
		
		if (cJSON_IsString(json) && strcmp("reset", json->valuestring) == 0) {
			if (mode == MODE_TRACE_OUT) {
				printf("\"reset\"\n");
			}
			// push old model onto stack
			ModelStack *newEntry = malloc(sizeof(ModelStack));
			newEntry->model = model;
			newEntry->next = modelStack;
			modelStack = newEntry;
			model = getNewModel(&argv[run_args], verbose_lvl);
			continue;
		}
		
		if (mode == MODE_TRACE_OUT) {
			cJSON* tmpObject = createShallowObject(json, FALSE);
			char* out = NULL;
			if (tmpObject) {
				out = cJSON_PrintUnformatted(tmpObject);
			} else {
				out = cJSON_PrintUnformatted(json);
			}
			printf("%s => ", out);
			cJSON_free(out);
			cJSON_Delete(tmpObject);
		}
		
		if (signals && !(signals&SIG_MASK_PRINTED)) {
			if (signals&SIG_MASK_CHILDTERM) {
				fprintf(stderr, "ERROR: Model terminated before end of simulation.\n");
			} else if (signals&SIG_MASK_PIPETERM) {
				fprintf(stderr, "ERROR: Model closed communication before end of simulation.\n");
			}
			signals |= SIG_MASK_PRINTED;
		}
		if (!json) {
			break;
		}
		
		if (verbose_lvl) verbose_JSON_output(json, "Input", verbose_lvl);
		
		
		// get tick result
		tick_num++;
		json_result = run_tick(&model, json);
		cJSON_Delete(json);
		
		if (mode == MODE_TRACE_OUT) {
			cJSON* tmpObject = createShallowObject(json_result, FALSE);
			char* out = NULL;
			if (tmpObject) {
				out = cJSON_PrintUnformatted(tmpObject);
			} else {
				out = cJSON_PrintUnformatted(json_result);
			}
			printf("%s\n", out);
			cJSON_free(out);
			cJSON_Delete(tmpObject);
		}
		
		if (signals && !(signals&SIG_MASK_PRINTED)) {
			if (signals&SIG_MASK_CHILDTERM) {
				fprintf(stderr, "ERROR: Model terminated before end of simulation.\n");
			} else if (signals&SIG_MASK_PIPETERM) {
				fprintf(stderr, "ERROR: Model closed communication before end of simulation.\n");
			}
			signals |= SIG_MASK_PRINTED;
		}
		
		if (!json_result) {
			fprintf(stderr, "ERROR: Model terminated response stream.\n");
			break;
		}
		
		// get ticktime from simulation interface
		cJSON *timeElem = cJSON_GetObjectItemCaseSensitive(json_result, "#ticktime");
		if (!cJSON_IsNumber(timeElem)) {
			fprintf(stderr, "ERROR: simulation interface didn't provide tick-time.\n");
		} else {
			double currentTime = timeElem->valuedouble;
			time += currentTime;
			if (currentTime > maxTime) maxTime = currentTime;
			if (currentTime < minTime) minTime = currentTime;
		}
		
		if (verbose_lvl) verbose_JSON_output(json_result, "Output", verbose_lvl);
		
		
		// get data to compare
		json = get_data(&read_stdin);
		if (!json) {
			cJSON_Delete(json_result);
			break;
		}
		if (verbose_lvl) verbose_JSON_output(json, "Expected Output", verbose_lvl);
		
		
		if (mode == MODE_ANALYSIS) {
			// validate output
			int errors = validate_data(json_result, json, tick_num);
			if (errors != 0) {
				// error
				if (errors>0) output_errors += errors;
			}
			
			
			
			double avgTime = time/tick_num;
			
			// print the statistics line for this simulation
			printf("%d;%lf;%lf;%lf;%lf;%d;%s\n",
					tick_num,
					time,
					avgTime,
					minTime,
					maxTime,
					output_errors,
					signals&SIG_MASK_CHILDTERM ? "x" : ""
				);
		}
		
		cJSON_Delete(json);
		cJSON_Delete(json_result);
	}
	
	if (mode == MODE_ANALYSIS) {
		double avgTime = time/tick_num;
		
		// print the statistics line for this simulation
		printf("%d;%lf;%lf;%lf;%lf;%d;%s\n",
				tick_num,
				time,
				avgTime,
				minTime,
				maxTime,
				output_errors,
				signals&SIG_MASK_CHILDTERM ? "x" : ""
			);
	}
	
	
	close(model.readfd);
	close(model.writefd);
	
	// close all model instances
	kill(model.pid, SIGTERM);
	waitpid(model.pid, NULL, 0);
	
	// closed here, so no sig child is send TODO: filter SIGCHILD by child id so models can be terminated sooner
	while (modelStack != NULL) {
		kill(modelStack->model.pid, SIGTERM);
		waitpid(modelStack->model.pid, NULL, 0);
		
		ModelStack *next = modelStack->next;
		free(modelStack);
		modelStack = next;
	}
	// success
	exit(0);
	return 0;
}

