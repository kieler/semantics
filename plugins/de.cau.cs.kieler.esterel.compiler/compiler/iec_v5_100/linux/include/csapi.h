/*
 * csapi.h version p40
 */
#ifndef __CSAPI_H__
#define __CSAPI_H__

#include <stdio.h>
#ifdef  __cplusplus
extern "C" {
#endif

/*
 * Macro for function prototypes, for ANSI C compilers or
 * old compilers
 */
#ifndef _CS_ARGS
#  if defined(__stdc__) || defined(__STDC__) || defined(_MSC_VER) || defined(__GNUC__)
#    define _CS_ARGS(arguments)   arguments
#  else
#    define _CS_ARGS(arguments)   ()
#  endif
#endif
typedef struct __CSList CSList;

/*--------------------------------------------------------------
**
 * Return list length
 * Parameter: CList* list
 */
extern int CSListGetLength(CSList* pList);

/**
 *  CSList iterator.
 * <pre>
 * Usage:
 * type* pData;
 * mCSListForeach(type, list, pData) {
 *     // body. Can use pData
 * }
 * DOES NOT SUPPORT EMBBED CALLS ON SAME LIST
 *
 * Parameters: type : type of stored element
 *             CSList* list: 
 *             type* pData
 * </pre>
 */
#define mCSListForeach(type, pList, pData) \
   for(__CSListInitIte(pList); \
       __CSListGetNext(pList, (void**)(&pData)); \
      /* incr done in __CSListGetNext */ )

/* private */
extern void __CSListInitIte _CS_ARGS((CSList* pList));

/* private */
extern int  __CSListGetNext _CS_ARGS((CSList* pList, void** ppData));

/**
 * Iterator for integer arrays whose first element
 * is the size of the array.
 *<pre>
 * Arguments: 
 * - int* list : list of integers
 * - int index : Current element index. can be used in the iterator body.
 * - int value : Current element value. can be used in the iterator body.
 *</pre>
 */
#define mForeachIntList(list, index, value) \
   index = 0; \
   while (((index) < (list)[0]) && (value = (list)[++(index)], index)) 


/** Variable access check.
 *If 1, no variable initialization check. Default 0. */
extern int   __NoVarCheckFlag;

/** Sensors in event.
 * If 1, an event composed of sensors only
 * activate the automaton. Else, a event made of signals or empty is
 * mandatory. Default is 0 (csimul specification).
 */
extern int   __AllowSensorsOnlyModeFlag;

/** Csimul compatibility.
 * If 1, csimul command are not prefixed by '!'.
 * Default 0 */
extern int   __OldCsimulFlag;

/** Full csimul commands enabling.
 * If 1, allows Csimul commands other than
 * those related to event (input event, load, reset)
 * Default: 0.
 */
extern int   __AllowCsimulCommandsFlag;
/**
 * Pure evalution mode, action are not executed
 */
extern int __PureEvalMode;

/**
 * Return __PureEvalMode status.
 */
extern int __CSIsPureEvalMode();

/**
 * ECL: when a variable is read, it will also be
 * set written. Used in conjunction with __NoVarCheckFlag
 */
extern int __EclMode;

/**
 * Set simulator in ECL mode, .i.e __NoVarCheckFlag = __EclMode = 1
 */
extern void __CSSetEclMode();

/**
 * Tells simulator that it is a console simulator
 */
extern int __ConsoleMode;

/*===========================================================================*
 *                         Definition of constants
 *===========================================================================*/

#define MAX_LINE_SIZE   1025

/**
 *@name Signal Codes
 * Indicate type of signal by a combination of the following codes.
 */
/*@{*/
/** */
#define INPUT_BIT          1
/** */
#define OUTPUT_BIT         2
/** */
#define SENSOR_BIT         4
/** */
#define LOCAL_BIT          8
/** */
#define EXCEPTION_BIT     16
/** */
#define PURE_BIT          32
/** */
#define MULTIPLE_BIT      64
/** */
#define RET_BIT          128

/*@}*/



/**
 *@name Variable Codes
 * Values of field "comment kind" of structure __VariableEntry
 */
/*@{*/
/** User variable */
#define SOURCE_TAG       0
/** Signal value variable */
#define SIGVAL_TAG       1
/** Signal boolean variable */
#define SIGBOOL_TAG      2
/** Counter variable */
#define COUNTER_TAG      3
/** Sensor value variable */
#define SENSORVAL_TAG    4
/** Sensor boolean variable */
#define SENSORBOOL_TAG   5
/** Return signal boolean variable */
#define RETBOOL_TAG      6
/** Return signal value variable */
#define RETVAL_TAG       7
/** Reserved */
#define WIRE_TAG         8
/** Reserved */
#define REGISTER_TAG     9
/** Previous value variable */
#define PREVAL_TAG      10
/*@}*/


/**@name Type codes for predefined types
 */
/*@{*/
/** */
#define PURE_TYPE_CODE    -1
/** */
#define BOOLEAN_TYPE_CODE -2
/** */
#define INTEGER_TYPE_CODE -3
/** */
#define STRING_TYPE_CODE  -4
/** */
#define FLOAT_TYPE_CODE   -5
/** */
#define DOUBLE_TYPE_CODE  -6
/*@}*/

/**@name Net codes
 * Values for sc code
 */
/*@{*/
/** */
#define ZERO_VALUE 0
/** */
#define ONE_VALUE 1
/** */
#define UNKNOWN_VALUE 2
/*@}*/


/**@name Run-time error codes
 */
/*@{*/
/** No error */
#define __NO_ERROR_CODE                          0
/** A variable has been read without beeing initialized*/
#define __UNINITIALIZED_VARIABLE_ERROR_CODE      1
/** */
#define __SINGLE_SIGNAL_EMITTED_TWICE_ERROR_CODE 2
/** */
#define __CAUSALITY_ERROR_CODE                   3
/** Reserved */
#define __STATIC_CYCLES_ERROR_CODE               4
/** */
#define __BAD_SENSOR_VALUE_ERROR_CODE            5
/** Used in conjunction with sccausal */
#define __ACTION_ORDER_CYCLES_ERROR_CODE         6
/** Wrong input event */
#define __INPUT_ERROR_CODE                       7
/** Module in error state; waiting for reset */
#define __RESET_AWAITED_ERROR_CODE               8
/** Input must be pure */
#define __INPUT_NOT_PURE_ERROR_CODE             10
/** */
#define __BAD_INPUT_VALUE_ERROR_CODE            11
/** */
#define __INPUT_EMITTED_TWICE_ERROR_CODE        12
/** */
#define __BAD_TASK_REF_ARG_SIZE_ERROR_CODE      13
/** */
#define __BAD_TASK_ARGUMENT_ERROR_CODE          14
/** */
#define __BAD_RELATION_ERROR_CODE               15
/** Unkown input */
#define __NOT_AN_INPUT_ERROR_CODE               16
/** Halt undefined (breakpoints)*/
#define __NOT_A_HALT_ERROR_CODE                 17
/** An incorrect test num has been set */
#define __BAD_TEST_NET_NUM_ERROR_CODE           18
/** Forced test set while not in pure evaluation mode */
#define __NOT_IN_PURE_EVAL_MODE                 19
/** Bad check sum */
#define __BAD_CHECKSUM_ERROR_CODE               20
/** */
#define __MODULE_TERMINATED                     -1
/*@}*/

/*===========================================================================*
 *                             Data Structures
 *===========================================================================*/

/** Index type*/
typedef unsigned short __indextype;
typedef unsigned short *__indextypelist;

typedef struct __SourcePoint __SourcePoint;

/*---------------------------------------------------------------------------*
 *                           struct __InstanceEntry
 *---------------------------------------------------------------------------*/

typedef struct __InstanceEntry __InstanceEntry;

/*---------------------------------------------------------------------------*
 *                           Signal structures
 *---------------------------------------------------------------------------*/


typedef struct __InputEntry __InputEntry;

typedef struct __ReturnEntry __ReturnEntry;

typedef struct __SignalEntry __SignalEntry;

/*---------------------------------------------------------------------------*
 *                     Signal relation structures
 *---------------------------------------------------------------------------*/

typedef struct __ImplicationEntry __ImplicationEntry;

typedef struct __ExclusionEntry __ExclusionEntry;

/*---------------------------------------------------------------------------*
 *                          struct __VariableEntry
 *---------------------------------------------------------------------------*/

typedef struct __VariableEntry  __VariableEntry;

/*---------------------------------------------------------------------------*
 *                   struct __TaskEntry and __ExecEntry
 *---------------------------------------------------------------------------*/

typedef struct __TaskEntry __TaskEntry;

typedef struct __ExecEntry __ExecEntry;

/*---------------------------------------------------------------------------*
 *                           struct __HaltEntry
 *---------------------------------------------------------------------------*/

typedef struct __HaltEntry __HaltEntry;

/*---------------------------------------------------------------------------*
 *                           struct __NetEntry (sc code)
 *---------------------------------------------------------------------------*/

typedef struct __NetEntry __NetEntry;

/*---------------------------------------------------------------------------*
 *                           struct __ModuleEntry
 *---------------------------------------------------------------------------*/

typedef struct __ModuleEntry __ModuleEntry;

/*===========================================================================*
 *                     Module Related Global Variables
 *===========================================================================*/
/**@name Module global information
 * Information on module tables*/
/*@{*/
/** */
extern char*          CSModuleName _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfInstances _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfTasks _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfSignals _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfInputs _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfReturns _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfSensors _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfOutputs _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfLocals _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfExceptions _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfImplications _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfExclusions _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfVariables _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfExecs _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfHalts _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfNets _CS_ARGS((__ModuleEntry*));
/** */
extern int            CSNumberOfStates _CS_ARGS((__ModuleEntry*));
/*@}*/


/*===========================================================================*
 *                          Access Functions
 *===========================================================================*/

/**@name Source point functions*/
/*@{*/
/** Allocate anew source point.
 * Return NULL on error
 */
extern __SourcePoint* CSSourcePointAllocate _CS_ARGS((int line,
                                                      int col,
                                                      int instanceIndex));
/** Returns 1 if source points are equals */
extern int            CSSourcePointEq       _CS_ARGS((__SourcePoint*,
                                                      __SourcePoint*));
/** Returns source point line.*/
extern int   CSSourcePointLine                _CS_ARGS((__SourcePoint*));
/** Returns source point column.*/
extern int   CSSourcePointColumn              _CS_ARGS((__SourcePoint*));
/** Returns source point instance file name*/
extern char* CSSourcePointFileName            _CS_ARGS((__ModuleEntry* ,
                                                        __SourcePoint*));
/** Returns source point instance directory name*/
extern char* CSSourcePointDirectoryName       _CS_ARGS((__ModuleEntry*,
                                                        __SourcePoint*));
/** Returns source point instance module name */
extern char* CSSourcePointModuleName          _CS_ARGS((__ModuleEntry*,
                                                        __SourcePoint*));
/** Returns source point instance module name */
extern char* CSSourcePointOriginalModuleName  _CS_ARGS((__ModuleEntry*,
                                                        __SourcePoint*));
/** Returns source point instance */
extern int   CSSourcePointInstanceIndex       _CS_ARGS((__SourcePoint*));
/** Returns instance caller of source point instance */
extern int   CSSourcePointFatherInstanceIndex _CS_ARGS((__ModuleEntry*,
                                                        __SourcePoint*));
/*@}*/

/**@name Module activation*/
/*@{*/
/** Check simulation interface version.
 * Returns NULL if version is ok, else a string that gives
 * the accepted version.
 * RETURN VALUE MUST BE FREED */
extern char*        CSCheckVersion               _CS_ARGS((__ModuleEntry*));
/**
 * Internal data initialization.
 * This function must be called before any use of the
 * __ModuleEntry* argument. It allocates some internal data that
 * are required for simulation.
 * Return 1 if ok, 0 else
*/
extern int          CSUseModuleEntry             _CS_ARGS((__ModuleEntry*));
/**
 * Internal data cleanup.
 * This function should be called when the __ModuleEntry is no
 * more simulated.
*/
extern void          CSReleaseModuleEntry         _CS_ARGS((__ModuleEntry*));

/**
 * Call the run function of the generated automaton
*/
extern int          CSModuleRun                  _CS_ARGS((__ModuleEntry*));
/**
 * Call input functions from the __Input list given as argument.
 * Then call automaton and set error message according to
 * result
 * Parameters:
 * - __ModuleEntry* pM:
 * - CSList* pInputList:
 * Return:
 *   __NO_ERROR_CODE
 *   __UNINITIALIZED_VARIABLE_ERROR_CODE
 *   __SINGLE_SIGNAL_EMITTED_TWICE_ERROR_CODE
 *   __CAUSALITY_ERROR_CODE
 *
 * Side effects:
 *   Set error message. See CSGetAndResetErrorMessage() function
 */
int                 CSActivateModule             _CS_ARGS((__ModuleEntry*,
                                                           CSList*));
/**
 * Call module reset function
 */
extern void         CSModuleReset                _CS_ARGS((__ModuleEntry*));
/** Return run time error code */
extern int          CSModuleRunTimeErrorCode     _CS_ARGS((__ModuleEntry*));
/** Return run time error code */
extern int          CSModuleRunTimeErrorCode     _CS_ARGS((__ModuleEntry*));
/** Return auxiliary error info, such as variable index or signal index
 */
extern int          CSModuleErrorInfo            _CS_ARGS((__ModuleEntry*));
/** Return current state */
extern int          CSModuleState                _CS_ARGS((__ModuleEntry*));
/** Return list of emitted signals */
extern __indextype* CSModuleEmittedList          _CS_ARGS((__ModuleEntry*));
/** Return list of awaited signals */
extern __indextype* CSModuleAwaitedList          _CS_ARGS((__ModuleEntry*));
/** Return list of active halts*/
extern __indextype* CSModuleHaltList             _CS_ARGS((__ModuleEntry*));
/** Return list of started execs*/
extern __indextype* CSModuleStartedList          _CS_ARGS((__ModuleEntry*));
/** Return list of killed execs*/
extern __indextype* CSModuleKilledList           _CS_ARGS((__ModuleEntry*));
/** Return list of suspended execs*/
extern __indextype* CSModuleSuspendedList        _CS_ARGS((__ModuleEntry*));
/** Return list of active execs*/
extern __indextype* CSModuleActiveList           _CS_ARGS((__ModuleEntry*));
/** Return 1 if module has reached break points */
extern int CSModuleHasReachedBkp                 _CS_ARGS((__ModuleEntry*));
/*@}*/

/**@name Signals management*/
/*@{*/

/**@name Inputs related functions.
   All the signals are stored in a signal table. Input signals
   are also stored in a separated table as __InputEntry. The reason
   is that for input one must have access to the set input function,
   check function, and we need to test if input is present or not for
   relation checking. For a given input, one has the correspondance
   between its index as an input and its index a a signal.
   @see __InputEntry
 */
/*@{*/
/** Return index of input in input table given its name  */
extern int          CSIndexOfInputEntryOfName    _CS_ARGS((__ModuleEntry*,
                                                           char* signalName));
/** Return index of input in input table given its signal index */
extern int          CSInputIndexOfSignalIndex    _CS_ARGS((__ModuleEntry*,
                                                           int signalIndex));
/** Return signal index of input of index inputIndex */
extern int          CSSignalIndexOfInputIndex    _CS_ARGS((__ModuleEntry*,
                                                           int inputIndex));
/** Return signal index of return of index returnIndex */
extern int          CSSignalIndexOfReturnIndex   _CS_ARGS((__ModuleEntry*,
                                                           int returnIndex));
/** Return input name of input of index inputIndex */
extern char*        CSInputName                  _CS_ARGS((__ModuleEntry*,
                                                           int inputIndex));
/** Return input type name of input of index inputIndex */
extern char*        CSInputTypeName              _CS_ARGS((__ModuleEntry*,
                                                           int inputIndex));
/** return 1 if input of index inputIndex is pure */
extern int          CSIsPureInput                _CS_ARGS((__ModuleEntry*,
                                                           int inputIndex));
/** return 1 if input of index inputIndex is multiple */
extern int          CSIsMultipleInput            _CS_ARGS((__ModuleEntry*,
                                                           int inputIndex));
/** return 1 if input of index inputIndex is a sensor */
extern int          CSIsSensorInput              _CS_ARGS((__ModuleEntry*,
                                                           int inputIndex));
/** return 1 if input is present */
extern int          CSIsPresentInput             _CS_ARGS((__ModuleEntry*,
                                                           int inputIndex));
/** return 1 if value is an expression of the type of
    valued input of index inputIndex.*/
extern int          CSCheckInputString      	 _CS_ARGS((__ModuleEntry*,
                                                           int inputIndex,
                                                           char* value));
/** set input as present */
extern void         CSMarkInputAsPresent    	 _CS_ARGS((__ModuleEntry*,
                                                           int inputIndex));
/** actually send pure input*/
extern void         CSPerformPureInput      	 _CS_ARGS((__ModuleEntry*,
                                                           int inputIndex));
/** actually send valued input*/
extern void         CSPerformValuedInput    	 _CS_ARGS((__ModuleEntry*,
                                                           int inputIndex,
                                                           char* value));
/** reset input event */
extern void         CSResetInput            	 _CS_ARGS((__ModuleEntry*));
/** return input declaration source point*/
extern __SourcePoint* CSPInputSourcePoint        _CS_ARGS((__ModuleEntry*,
                                                           int inputIndex));
/**
 * Given a valid __Input event list, return the corresponding
 * csimul event as a string.
 *
 * Parameters:
 * - __ModuleEntry* pM:
 * - CSList* pInputList: list of __Input*
 * Return:
 *  a string
 * Side effects:
 *  returned string is allocated and shoud be freed
 */
extern char* CSInputEventAsCsimulString _CS_ARGS((__ModuleEntry* pM,
                                                  CSList* pInputList));
/*@}*/

/**@name Returns related function.
   Returns are a special kind of inputs*/
/*@{*/
/** return returnIndex of signal of index signalIndex */
extern int            CSReturnIndexOfSignalIndex   _CS_ARGS((__ModuleEntry*,
                                                             int signalIndex));
/** return returnIndex of return of name returnName*/
extern int            CSIndexOfReturnEntryOfName  _CS_ARGS((__ModuleEntry*,
                                                            char* returnName));
/** return 1 if return is present */
extern int            CSIsPresentReturn            _CS_ARGS((__ModuleEntry*,
                                                             int returnIndex));
/** return return type name*/
extern char*          CSReturnTypeName             _CS_ARGS((__ModuleEntry*,
                                                             int returnIndex));
/** return 1 if return is pure */
extern int            CSIsPureReturn               _CS_ARGS((__ModuleEntry*,
                                                             int returnIndex));
/** mark return as present */
extern void           CSMarkReturnAsPresent        _CS_ARGS((__ModuleEntry*,
                                                             int returnIndex));
/** return 1 if value is an expression of type of return type */
extern int            CSCheckReturnString     	   _CS_ARGS((__ModuleEntry*,
                                                             int returnIndex,
                                                             char* value));
/** actually send return*/
extern void           CSPerformPureReturn     	   _CS_ARGS((__ModuleEntry*,
                                                             int returnIndex));
/** actually send valued return*/
extern void           CSPerformValuedReturn   	   _CS_ARGS((__ModuleEntry*,
                                                             int returnIndex,
                                                             char* value));
/** return return declaration source point*/
extern __SourcePoint* CSPReturnSourcePoint         _CS_ARGS((__ModuleEntry*,
                                                             int returnIndex));

/** return return name */
extern char*          CSReturnName                 _CS_ARGS((__ModuleEntry*,
                                                             int returnIndex));
/** reset all returns*/
extern void           CSResetReturn                _CS_ARGS((__ModuleEntry*));

/*@}*/

/**@name Signals related functions.*/
/*@{*/
/** */
extern char*          CSSignalName                 _CS_ARGS((__ModuleEntry*,
                                                             int signalIndex));
/** */
extern char*          CSSignalModuleName           _CS_ARGS((__ModuleEntry*,
                                                             int signalIndex));
/** */
extern int            CSSignalVariableIndex        _CS_ARGS((__ModuleEntry*,
                                                             int signalIndex));
/** */
extern int            CSSignalTypeCode             _CS_ARGS((__ModuleEntry*,
                                                             int index));
/** */
extern int            CSIsPureSignal               _CS_ARGS((__ModuleEntry*,
                                                             int signalIndex));
/** */
extern int            CSIsReturnSignal             _CS_ARGS((__ModuleEntry*,
                                                             int signalIndex));
/** */
extern int            CSIsInputSignal              _CS_ARGS((__ModuleEntry*,
                                                             int signalIndex));
/** */
extern int            CSIsOutputSignal             _CS_ARGS((__ModuleEntry*,
                                                             int signalIndex));
/** */
extern int            CSIsSensorSignal             _CS_ARGS((__ModuleEntry*,
                                                             int signalIndex));
/** */
extern int            CSIsLocalSignal              _CS_ARGS((__ModuleEntry*,
                                                             int signalIndex));
/** */
extern int            CSIsExceptionSignal          _CS_ARGS((__ModuleEntry*,
                                                             int signalIndex));
/** return signal declaration source point */
extern __SourcePoint* CSPSignalSourcePoint         _CS_ARGS((__ModuleEntry*,
                                                             int signalIndex));
/** return size of array of source points of instructions that
    test a signal (present, every, ...).
 */
extern int       CSNumberOfSignalTestSourcePoints  _CS_ARGS((__ModuleEntry*,
                                                             int signalIndex));
/** the array of source point of signal test instructions*/
extern __SourcePoint* CSSourcePointArrayOfSignalTest
                                                  _CS_ARGS((__ModuleEntry*,
                                                            int signalIndex));
/** return size of array of source points of instructions that
    test a signal (emit, sustain).
 */
extern int            CSNumberOfSignalEmissionSourcePoints
                                                _CS_ARGS((__ModuleEntry*,
                                                          int signalIndex));
/** the array of source point of signal emission instructions*/
extern __SourcePoint* CSSourcePointArrayOfSignalEmission
                                                _CS_ARGS((__ModuleEntry*,
                                                          int signalIndex));
/** return size of array of source points of instructions that
    use signal value (? operator).
 */
extern int            CSNumberOfSignalAccessSourcePoints
                                                _CS_ARGS((__ModuleEntry*,
                                                          int signalIndex));
/** the array of source point of signal value access instructions*/
extern __SourcePoint* CSSourcePointArrayOfSignalAccess
                                                _CS_ARGS((__ModuleEntry*,
                                                          int signalIndex));
/**
 * Returns a the csimul string that corresponds to the event
 * input signal of index sigIndex set.
 *
 * Parameters:
 * - __ModuleEntry* pM:
 * - int sigIndex:
 * Return:
 *   a string
 * Side effects:
 *   Returned string is allocated and should be freed
 */
extern char*          CSSignalAsCsimulString       _CS_ARGS((__ModuleEntry*,
                                                             int sigIndex));
/*@}*/

/*@}*/


/**@name Relations management
 */
/*@{*/
/** Return the implication of index relationIndex as a string.
    This string is dynamically allocated and should be freed.
 */
extern char*          CSImplicationText         _CS_ARGS((__ModuleEntry*,
                                                          int relationIndex));
/** Return 1 if implication is satisfied.*/
extern int            CSCheckImplication        _CS_ARGS((__ModuleEntry*,
                                                          int relationIndex));
/** Return implication source point definition.*/
extern __SourcePoint* CSPImplicationSourcePoint _CS_ARGS((__ModuleEntry*,
                                                          int relationIndex));

/** Return the exclusion of index relationIndex as a string.
    This string is dynamically allocated and should be freed.
 */
extern char*          CSExclusionText           _CS_ARGS((__ModuleEntry*,
                                                          int relationIndex));
/** return 1 if exclusion is satisfied.*/
extern int            CSCheckExclusion          _CS_ARGS((__ModuleEntry*,
                                                          int relationIndex));
/** return exclusion source point definition.*/
extern __SourcePoint* CSPExclusionSourcePoint   _CS_ARGS((__ModuleEntry*,
                                                          int relationIndex));
/*@}*/

/**@name Variables management
 */
/*@{*/
/** return variable type code.*/
extern int            CSVariableTypeCode           _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return variable type name.*/
extern char*          CSVariableTypeName           _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return name as __MODULE_VXX*/
extern char*          CSVariableFullName           _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return name os VXX*/
extern char*          CSVariableShortName          _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return value of variable as a string (after conversion).*/
extern char*          CSVariableValueString        _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return variable usage string (counter, value of signal,...).
    RETURN VALUE MUST BE FREED 
 */
extern char*          CSVariableCommentString      _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return 1 if variable is a user variable.*/
extern int            CSIsSourceVariable           _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return variable name in source.*/
extern char*          CSVariableSourceName         _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return variable name in source with instance path.
    If variable is a source variable, use its source name
    else use its internal short name. Returned value should be freed.
 */
extern char*          CSVariablePathName         _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return 1 if variable is value of a signal.*/
extern int            CSIsSignalVariable           _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return 1 if variable is used for counter.*/
extern int            CSIsCounterVariable          _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return 1 if variable is printable (not an internal one).*/
extern int            CSVariableToPrint            _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return 1 if variable is written in transition.*/
extern int            CSIsWrittenVariable          _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return 1 if variable is source variable and is written in transition.*/
extern int            CSIsWrittenSourceVariable    _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return 1 if variable is signal var and is written in transition.*/
extern int            CSIsWrittenSignalVariable    _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return 1 if variable is written (not uninitialized)*/
extern int            CSVariableWrittenp           _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return 1 if variable read in transition */
extern int            CSIsReadVariable             _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return 1 if variable is source var and read in transition */
extern int            CSIsReadSourceVariable       _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** return 1 if variable is signal var and read in transition */
extern int            CSIsReadSignalVariable       _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/** variable declaration source point.*/
extern __SourcePoint* CSPVariableSourcePoint       _CS_ARGS((__ModuleEntry*,
                                                             int varIndex));
/*@}*/

/**@name Halt management
 */
/*@{*/
/** halt source point*/
extern __SourcePoint* CSPHaltSourcePoint           _CS_ARGS((__ModuleEntry*,
                                                             int haltIndex));
/*@}*/

/**@name Tasks management
 */
/*@{*/
/** */
extern __SourcePoint* CSPExecSourcePoint           _CS_ARGS((__ModuleEntry*,
                                                             int execIndex));
/** */
extern int            CSIsActiveExec               _CS_ARGS((__ModuleEntry*,
                                                             int execIndex));
/** */
extern int            CSIsStartedExec              _CS_ARGS((__ModuleEntry*,
                                                             int execIndex));
/** */
extern int            CSIsKilledExec               _CS_ARGS((__ModuleEntry*,
                                                             int execIndex));
/** */
extern int            CSIsSuspendedExec            _CS_ARGS((__ModuleEntry*,
                                                             int execIndex));


/** */
extern __SourcePoint* CSPTaskSourcePoint           _CS_ARGS((__ModuleEntry*,
                                                             int taskIndex));
/** */
extern char*          CSTaskNameOfExecIndex        _CS_ARGS((__ModuleEntry*,
                                                             int execIndex));
/** */
extern int          CSCheckTaskReferenceArgSize _CS_ARGS((__ModuleEntry*,
                                                          int returnIndex,
                                                          int numberOfArg));
/** */
extern int          CSCheckAndSetTaskReferenceArg _CS_ARGS((__ModuleEntry*,
                                                            int returnIndex,
                                                            int argNum,
                                                            char* value));
/** */
extern int          CSCheckTaskReferenceArg      _CS_ARGS((__ModuleEntry*,
                                                           int returnIndex,
                                                           int argNum,
                                                           char* value));
/** */
extern void         CSSetTaskReferenceArg        _CS_ARGS((__ModuleEntry*,
                                                           int returnIndex,
                                                           int argNum,
                                                           char* value));
/** */
extern int            CSExecIndexOfReturnIndex     _CS_ARGS((__ModuleEntry*,
                                                             int returnIndex));
/** */
extern int            CSReturnIndexOfExecIndex     _CS_ARGS((__ModuleEntry*,
                                                             int execIndex));
/** */
extern int            CSTaskNbArgRefOfExecIndex    _CS_ARGS((__ModuleEntry*,
                                                             int execIndex));
/** */
extern int            CSTaskNbArgValOfExecIndex    _CS_ARGS((__ModuleEntry*,
                                                             int execIndex));
/** */
extern char**         CSArgValuesOfExecIndex       _CS_ARGS((__ModuleEntry*,
                                                             int execIndex));
/** Array of index of reference variables. Nota Bene: the size 
 * of the array is given by CSTaskNbArgRefOfExecIndex() and not
 * by the first element of the list.*/
extern int*           CSVarIndexesOfExecIndex      _CS_ARGS((__ModuleEntry*,
                                                             int execIndex));
/** Alias of CSVarIndexesOfExecIndex(). */
extern int*           CSVarIndexesArrayOfExecIndex _CS_ARGS((__ModuleEntry*,
                                                             int execIndex));
/** */
extern void           CSFreeExpressionsOfExec      _CS_ARGS((__ModuleEntry*,
                                                             int execIndex));
/*@}*/

/**@name Nets management
 */
/*@{*/
/** return 1 if net of index netIndex is known */
extern int            CSIsKnownNet                 _CS_ARGS((__ModuleEntry*,
                                                             int netIndex));
/** return value of net */
extern int            CSValueOfNet                 _CS_ARGS((__ModuleEntry*,
                                                             int netIndex));
/** return number of source points of a net.*/
extern int            CSNumberOfSourcePointsOfNet  _CS_ARGS((__ModuleEntry*,
                                                             int netIndex));
/** source point array of net. */
extern __SourcePoint* CSSourcePointArrayOfNet      _CS_ARGS((__ModuleEntry*,
                                                             int netIndex));
/*@}*/

/**@name Instances management
 */
/*@{*/
/** return root instance index.*/
extern int            CSRootInstanceIndex          _CS_ARGS((__ModuleEntry*));
/** return instance start source point.*/
extern __SourcePoint* CSPInstanceSourcePoint       _CS_ARGS((__ModuleEntry*,
                                                             int instIndex));
/** return instance end source point.*/
extern __SourcePoint* CSPInstanceEndPoint          _CS_ARGS((__ModuleEntry*,
                                                             int instIndex));
/** return instance call source point.*/
extern __SourcePoint* CSPInstanceInstancePoint     _CS_ARGS((__ModuleEntry*,
                                                             int instIndex));
/** */
extern char*          CSInstanceFileName           _CS_ARGS((__ModuleEntry*,
                                                             int instIndex));
/** */
extern char*          CSInstanceDirectoryName      _CS_ARGS((__ModuleEntry*,
                                                             int instIndex));
/** */
extern char*          CSInstanceModuleName         _CS_ARGS((__ModuleEntry*,
                                                             int instIndex));
/** */
extern char*          CSInstanceOriginalModuleName _CS_ARGS((__ModuleEntry*,
                                                             int instIndex));
/** return index of instance father*/
extern int            CSInstanceFatherInstanceIndex _CS_ARGS((__ModuleEntry*,
                                                              int instIndex));
/** return instance name as a path from root instance.
    RETURN VALUE MUST BE FREED */
extern char*          CSInstancePath               _CS_ARGS((__ModuleEntry*,
                                                             int instIndex));
/*@}*/


/* RETURN VALUE MUST BE FREED */
extern char*          CSQuoteStringForCsimul _CS_ARGS((char*));
/* RETURN VALUE MUST BE FREED */
extern char*          CSUnquoteCsimulString _CS_ARGS((char*));

/*---------------------------------------------------------------------------*
 *                           struct __SourcePoint
 *---------------------------------------------------------------------------*/
/**@name Structures definitions*/
/*@{*/

/** Source Points*/
struct __SourcePoint {
    /** Reserved */
    int linkback;
    /** Line number*/
    int line;
    /** Column number*/
    int column;
    /** Instance index*/
    int instance_index;
};

/*---------------------------------------------------------------------------*
 *                           struct __InstanceEntry
 *---------------------------------------------------------------------------*/

/** Instance */
struct __InstanceEntry {
    /** Module name */
    char          *module_name;
    /** Orignal module name */
    char          *original_module_name;
    /** Father index (calling instance)*/
    int            father_index;
    /** Directory of source file */
    char          *directory_name;
    /** Source file name */
    char          *file_name;
    /** Source point of instance start */
    __SourcePoint source_point;
    /** Source point of instance end */
    __SourcePoint end_point;
    /** Source point of instance call */
    __SourcePoint instance_point;
};

/*---------------------------------------------------------------------------*
 *                           Signal structures
 *---------------------------------------------------------------------------*/


/** Input signal entry.
 * This structure defines characteristics of an input, and binds
 * an input with its check and set functions. It refines the
 * __SignalEntry structure.
 */
struct __InputEntry {
    /** signal name */
    char         *name;
    /** Hashed name value ( (char sum)%101 )*/
    int           hash;
    /** Name of signal type */
    char         *type_name;
    /** 1 if signal is a sensor */
    int           is_a_sensor;
    /** Type code (i.e type index)*/
    int           type_code;
    /** 1 if input is multiple */
    int           multiple;
    /** Corresponding signal index*/
    int           signal_index;
    /** Pointer on check input value function */
    int         (*p_check_input)();
    /** Pointer on set input function */
    void        (*p_input_function)();
    /** 1 if input is present. Used for relation check */
    int           present;
    /** Signal declaration source point*/
    __SourcePoint source_point;
};

/** Return signal.
 * Refine __SignalEntry for return signals.
 **/
struct __ReturnEntry {
    /** Signal name */
    char         *name;
    /** Hash name value ( (char sum)%101) */
    int           hash;
    /** Type name */
    char         *type_name;
    /** Type index */
    int           type_code;
    /** Corresponding signal index*/
    int           signal_index;
    /** Associated exec index */
    int           exec_index;
    /** Check value function */
    int         (*p_check_input) ();
    /** Set function */
    void        (*p_input_function)();
    /** 1 if return is present. Used for relation check */
    int           present;
    /** Declaration source point*/
    __SourcePoint source_point;
};

/** General signal structure */
struct __SignalEntry {
    /** Signal name */
    char          *name;
    /** Signal code.
     * A combination of codes describing the signal.
     *@see <a href="SignalCodes.html">Signal Codes</a>
     */
    int            code;
    /** Index of variable for valued signals */
    int            variable_index;
    /** Signal status */
    int            present;
    /** Declaration source point*/
    __SourcePoint  source_point;
    /** Number of emission source points */
    int            number_of_emit_source_points;
    /** Array of emission source points */
    __SourcePoint *emit_source_point_array;
    /** Number of test source points*/
    int            number_of_test_source_points;
    /** Array of test source points*/
    __SourcePoint *test_source_point_array;
    /** Number of value access  source points*/
    int            number_of_access_source_points;
    /** Array of value access  source points*/
    __SourcePoint *access_source_point_array;
};

/*---------------------------------------------------------------------------*
 *                     Signal relation structures
 *---------------------------------------------------------------------------*/

/** Implication relation.
 * An implication is master => slave.
 */
struct __ImplicationEntry {
    /** Master signal index */
    int           master;
    /** Slave signal index */
    int           slave;
    /** Relation definition source point*/
    __SourcePoint source_point;
};

/** Exclusion relation */
struct __ExclusionEntry {
    /** List of index of exclusive signals */
    int          *exclusion_list;
    /** Relation definition source point */
    __SourcePoint source_point;
};

/*---------------------------------------------------------------------------*
 *                          struct __VariableEntry
 *---------------------------------------------------------------------------*/

/** Variable structure */
struct __VariableEntry {
    /** Full simulation name: __Module_Vxx */
    char         *full_name;
    /** Short simulation name: Vxx */
    char         *short_name;
    /** Variable type name */
    char         *type_name;
    /** Type index */
    int           type_code;
    /** Variable class.
     * Code describing the variable (i.e counter var, user var).
     *@see Variable Codes*/
    int           comment_kind;
    /** Variable state
     * 1 if variable is initialized.*/
    int           is_initialized;
    /** Pointer to the actual variable */
    char         *p_variable;
    /** Source code name */
    char         *source_name;
    /** 1 if variable is written */
    int           written;
    /** 1 if variable written during the transition */
    unsigned char written_in_transition;
    /** 1 if variable is read during the transition */
    unsigned char read_in_transition;
    /** Variable declaration source point */
    __SourcePoint source_point;
};

/*---------------------------------------------------------------------------*
 *                   struct __TaskEntry and __ExecEntry
 *---------------------------------------------------------------------------*/

/** Task structure */
struct __TaskEntry {
    /** Task name */
    char         *name;
    /** Number of reference arguments*/
    int           nb_args_ref;
    /** Number of value arguments */
    int           nb_args_val;
    /** Array of arguments types */
    int          *type_codes_array;
    /** Task declaration source point */
    __SourcePoint source_point;
};

/** Exec Structure */
struct __ExecEntry {
    /** Task index */
    int           task_index;
    /** Array of reference variable index */
    int          *var_indexes_array;
    /** Array of values of expressions */
    char        **p_values_array;
    /** Exec declaration source point */
    __SourcePoint source_point;
};

/*---------------------------------------------------------------------------*
 *                           struct __HaltEntry
 *---------------------------------------------------------------------------*/

/** Halt structure */
struct __HaltEntry {
    /** Halt occurrence source point*/
    __SourcePoint source_point;
};

/*---------------------------------------------------------------------------*
 *                           struct __NetEntry (sc code)
 *---------------------------------------------------------------------------*/

/** Net simulation structure */
struct __NetEntry {
    /** Net status */
    int            known;
    /** Net value */
    int            value;
    /** Net source point number.
     * A net can has several source points.*/
    int            number_of_source_points;
    /** Net source point array */
    __SourcePoint* source_point_array;
};

/*---------------------------------------------------------------------------*
 *                           struct __ModuleEntry
 *---------------------------------------------------------------------------*/

/** Simulation module structure.
 * This the main structure through which one has access to
 * all the information.
 */
struct __ModuleEntry {
    /** Version identification */
    char               *version_id;
    /** Compilation identification */
    char               *compilation_type;
    /** Module name */
    char               *name;
   /**@name Internal table sizes.*/
   /*@{*/
    /** */
    int                 number_of_instances;
    /** */
    int                 number_of_tasks;
    /** */
    int                 number_of_signals;
    /** */
    int                 number_of_inputs;
    /** */
    int                 number_of_returns;
    /** */
    int                 number_of_sensors;
    /** */
    int                 number_of_outputs;
    /** */
    int                 number_of_locals;
    /** */
    int                 number_of_exceptions;
    /** */
    int                 number_of_implications;
    /** */
    int                 number_of_exclusions;
    /** */
    int                 number_of_variables;
    /** */
    int                 number_of_execs;
    /** */
    int                 number_of_halts;
    /** */
    int                 number_of_nets;
    /** */
    int                 number_of_states;
   /*@}*/
   /**@name Automaton status*/
   /*@{*/
    /** Current state */
    int                 state;
    /** List of active halts.
     * First elt is the list size*/
    __indextype        *halt_list;
    /** List of awaited signals.
     * First elt is the list size*/
    __indextype        *awaited_list;
    /** List of emitted signals.
     * First elt is the list size*/
    __indextype        *emitted_list;
    /** List of started execs.
     * First elt is the list size*/
    __indextype        *started_list;
    /** List of killed execs.
     * First elt is the list size*/
    __indextype        *killed_list;
    /** List of suspended execs.
     * First elt is the list size*/
    __indextype        *suspended_list;
    /** List of active execs.
     * First elt is the list size*/
    __indextype        *active_list;
    /** Run time error returned after a transition.*/
    int                 run_time_error_code;
    /** Possible additionnal error code returned in case of error.*/
    int                 error_info;
   /*@}*/
   /**@name Automaton interaction*/
   /*@{*/
    /** Reserved */
    void*                p_data;
    /** Pointer to the automaton run function */
    int                (*run) ();
    /** Pointer to the automaton reset function */
    int                (*reset) ();
    /** Pointer on function returning a variable value as a string.*/
    char               *(*show_variable) ();
    /** Pointer on function setting a variable from a string*/
    void               (*set_variable)   ();
    /** Pointer on function checking a string value*/
    int                (*check_value)    ();
    /** Reserved */
    int                (*execute_action) ();
   /*@}*/
   /**@name Internal tables*/
   /*@{*/
    /** */
    __InstanceEntry    *instance_table;
    /** */
    __TaskEntry        *task_table;
    /** */
    __SignalEntry      *signal_table;
    /** */
    __InputEntry       *input_table;
    /** */
    __ReturnEntry      *return_table;
    /** */
    __ImplicationEntry *implication_table;
    /** */
    __ExclusionEntry   *exclusion_table;
    /** */
    __VariableEntry    *variable_table;
    /** */
    __ExecEntry        *exec_table;
    /** */
    __HaltEntry        *halt_table;
    /** */
    __NetEntry         *net_table;
   /*@}*/
};

/*@}*/

/** Possible states of a source point related to several nets.
 * Conjunction of states of nets using the same source point.
 * This enum defines the type __NetSPState.
 */
enum __NetSPStateEnum {
   /** undefined net */
   __NETSP_UNDEF   = 0,
   /** unknown net */
   __NETSP_UNKNOWN = 1,
   /** known net */
   __NETSP_KNOWN   = 2,
   /** known net has 1 value */
   __NETSP_HIGH    = 4,
   /** known net has 0 value */
   __NETSP_LOW     = 8
};
typedef enum __NetSPStateEnum __NetSPState;


/** return 1 if net of source point netSP is known. */
extern int CSNetSourcePointIsKnown    _CS_ARGS((__ModuleEntry*,
                                                __SourcePoint* netSP));
/** return 1 if net of source point netSP is unknown. */
extern int CSNetSourcePointIsUnknown  _CS_ARGS((__ModuleEntry*,
                                                __SourcePoint* netSP));
/** return 1 if net of source point netSP is high. */
extern int CSNetSourcePointIsHigh     _CS_ARGS((__ModuleEntry*,
                                                __SourcePoint* netSP));
/** return 1 if net of source point netSP is low. */
extern int CSNetSourcePointIsLow      _CS_ARGS((__ModuleEntry*,
                                                __SourcePoint* netSP));
/** return 1 if net of source point netSP has change since last execution. */
extern int CSNetSourcePointHasChanged _CS_ARGS((__ModuleEntry*,
                                                __SourcePoint* netSP));
/** Check validity of source point.
 * If {line, column, instance} refers to an existing source 
 * point, returns a pointer to the memorized __SourcePoint, else
 * returns NULL.
 * DO NOT DELETE RETURNED OBJECT.
 */
extern __SourcePoint* CSIsValidSourcePoint _CS_ARGS((__ModuleEntry* pM, 
                                                     int line,
                                                     int column,
                                                     int instance));
/** return 1 if source point is associated with a signal.
 * The source point is a signal declaration or signal use source point. 
*/
extern int CSIsSignalSP            _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));
/** return 1 if source point corresponds to a signal declaration.
 */
extern int CSIsSignalDeclarationSP _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));
/** return 1 if source point corresponds to a signal test.
 */
extern int CSIsSignalTestSP        _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));
/** return 1 if source point corresponds to a signal emission.
 */
extern int CSIsSignalEmissionSP    _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));
/** return 1 if source point corresponds to a signal access.
 */
extern int CSIsSignalAccessSP      _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));
/** return 1 if source point corresponds to a net.
 */
extern int CSIsNetSP               _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));
/** return 1 if source point corresponds to a halt point.
 */
extern int CSIsHaltSP              _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));
/** return 1 if source point corresponds to an instance point, that
 * is instance beginning, instance end, or instance call.
 */
extern int CSIsInstanceSP          _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));
/** return 1 if source point corresponds to an instance call. */
extern int CSIsInstanceRunSP       _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));
/** return 1 if source point corresponds to an instance beginning. */
extern int CSIsInstanceBegin       _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));
/** return 1 if source point corresponds to an instance end. */
extern int CSIsInstanceEndSP       _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));
/** return 1 if source point corresponds to a variable point.
 */
extern int CSIsVariableSP              _CS_ARGS((__ModuleEntry* pM, 
                                                 __SourcePoint* pSP));
/** return 1 if source point corresponds to an exec point.
 */
extern int CSIsExecSP              _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));
/** return 1 if source point corresponds to a task point.
 */
extern int CSIsTaskSP              _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));

/** return net index list associated with source point.
 * First element is list length
 */
extern int* CSSourcePointNetList   _CS_ARGS((__ModuleEntry* pM,
                                             __SourcePoint* pSP));
/** return signal index list associated with source point.
 * First element is list length
 */
extern int* CSSourcePointSignalList   _CS_ARGS((__ModuleEntry* pM,
                                                __SourcePoint* pSP));
/** return halt index list associated with source point.
 * First element is list length
 */
extern int* CSSourcePointHaltList   _CS_ARGS((__ModuleEntry* pM,
                                              __SourcePoint* pSP));
/** return variable index associated with source point.
 * There can be only one variable, since source point is
 * variable declaration. returns -1 if no associated variable.
 */
extern int CSSourcePointVariable   _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));
/** return exec index associated with source point.
 * There can be only one exec, since source point is
 * exec call. returns -1 if no associated exec.
 */
extern int CSSourcePointExec       _CS_ARGS((__ModuleEntry* pM,
                                             __SourcePoint* pSP));
/** return task index associated with source point.
 * There can be only one task, since source point is
 * task declaration. returns -1 if no associated task.
 */
extern int CSSourcePointTask       _CS_ARGS((__ModuleEntry* pM, 
                                             __SourcePoint* pSP));
/** return instance index of run associated with source point.
 * There can be only one task, since source point is
 * task declaration. returns -1 if no associated task.
 */
extern int CSSourcePointRunOf _CS_ARGS((__ModuleEntry* pM, 
                                        __SourcePoint* pSP));

/** Get all objects related to a source point as a string.
 * Build a string that describes all the objects that use
 * the source point given as argument.
 * The returned string should be freed by the caller.
 */
extern char* CSDumpSourcePointInfo _CS_ARGS((__ModuleEntry* pM,
                                             int line,
                                             int column,
                                             int instNum));

/** return 1 if signal is emitted */
extern int  CSIsEmittedSignal                _CS_ARGS((__ModuleEntry*, 
                                                       int signalIndex));
/** return 1 if signal is selected for browsing. */
extern int  CSSignalIsSelectedForBrowsing    _CS_ARGS((__ModuleEntry*, 
                                                       int signalIndex));
/** mark signal of index signalIndex for browsing.
 * This is a logical information. It is the responsability of the
 * user to decide how to display this information
 */
extern void CSMarkSignalForBrowsing          _CS_ARGS((__ModuleEntry*, 
                                                       int signalIndex));
/** mark signal for browsing from a source point.
 * The source point is a signal related source point, as emission
 * source point, test source point, access source point.
 * This is a logical information. It is the responsability of the
 * user to decide how to display this information
 */
extern void CSMarkSignalForBrowsingFromSP  _CS_ARGS((__ModuleEntry*, 
                                                     __SourcePoint* instSP));
/** return 1 if source point correspond to a selected signal for browsing.*/
extern int  CSIsSourcePointOfSelectedSignal _CS_ARGS((__ModuleEntry*, 
                                                      __SourcePoint*));
/** reset all signals marked for browsing.*/
extern void CSResetMarkedSignals             _CS_ARGS((__ModuleEntry*));

/** return instance index of halt.*/
extern int   CSHaltInstanceIndex  _CS_ARGS((__ModuleEntry*, int haltIndex));
/** return 1 if halt is active.*/
extern int   CSHaltIsActive       _CS_ARGS((__ModuleEntry*, int haltIndex));
/** return 1 if halt is a possible breakpoint.*/
extern int   CSHaltIsMarkedForBkp _CS_ARGS((__ModuleEntry*, int haltIndex));
/** return 1 if halt is a reached breakpoint.*/
#define      mCSHaltIsReached(pM, i) \
   (CSHaltIsActive(pM, i) && CSHaltIsMarkedForBkp(pM, i))
/** Set halt as breakpoint. 
 * Return __NOT_A_HALT_ERROR_CODE if haltIndex is not a halt index.
*/
extern int  CSHaltSetBkp         _CS_ARGS((__ModuleEntry*, int haltIndex));
/** Remove breakpoint on halt. 
 * Return __NOT_A_HALT_ERROR_CODE if haltIndex is not a halt index.
*/
extern int  CSHaltDeleteBkp      _CS_ARGS((__ModuleEntry*, int haltIndex));
/* Set a breakpoint at line,col,instNum source point.
 * Return __NOT_A_HALT_ERROR_CODE if haltIndex is not a halt index.
*/
extern int CSHaltSetBkpFromSP      _CS_ARGS((__ModuleEntry* pM,
                                             int line,
                                             int col,
                                             int instNum));
/* Remove a breakpoint at line,col,instNum source point.
 * Return __NOT_A_HALT_ERROR_CODE if haltIndex is not a halt index.
*/
extern int CSHaltDeleteBkpFromSP      _CS_ARGS((__ModuleEntry* pM,
                                                int line,
                                                int col,
                                                int instNum));
/** Remove all breakpoints of an instance.
 *  Remove all breakpoints of instance of index instIndex. If removeRecursively
 * is true, the also remove recursively all breakpoints of sub instances.*/
extern void  CSInstanceRemoveBkp  _CS_ARGS((__ModuleEntry*, 
                                            int instIndex, 
                                            int removeRecursively)); 
/** return halt index of halt at source point pSP. 
 * If there is no such halt, return -1.
 */
extern int   CSHaltFromSourcePoint _CS_ARGS((__ModuleEntry*, 
                                             __SourcePoint* pSP));
/** return list of halts marked as breakpoints.
 * First element of list is its size
 */
extern int* CSGetBreakpointList    _CS_ARGS((__ModuleEntry* pM));

/** return list of reached breakpoints.
 * First element of list is its size
 */
extern int* CSGetReachedBkpList _CS_ARGS((__ModuleEntry* pM));
/**
 * Parse Esterel source of instance of number instNum to recover
 * watchdog information.
 * Use altFileName if it is not the same as the one defined by the 
 * instance.
 * return 1 in case of error (as yyparse()).
 */
extern int             CSInstanceParseForWatchs  _CS_ARGS((__ModuleEntry*,
                                                           int instNum, 
                                                           char* altFileName));
/** Return NULL terminated list  of watchdog source points.
 */
extern CSList* CSInstanceWatchSPList       _CS_ARGS((__ModuleEntry*,
                                                     int instNum));
/** Return NULL terminated list of active watchdog source points. */
extern CSList* CSInstanceActiveWatchSPList _CS_ARGS((__ModuleEntry*,
                                                     int instNum));


/*
 * Instance information
 */

/** return 1 if instance is active.
 * An instance is active is at least one halt is active or
 * one of its sub instances.
 */
extern int  CSInstanceIsActive            _CS_ARGS((__ModuleEntry*,
                                                    int instIndex));
/** return 1 if instance has halts marked as breakpoints. */
extern int  CSInstanceHasBkp              _CS_ARGS((__ModuleEntry*,
                                                    int instIndex));
/** return 1 if instance has halts marked as breakpoints that are reached.*/
extern int  CSInstanceHasReachedBkp       _CS_ARGS((__ModuleEntry*,
                                                    int instIndex));
/** return 1 if instance has known nets with value 1.*/
extern int  CSInstanceHasHighNets         _CS_ARGS((__ModuleEntry*, 
                                                    int instIndex));
/** return 1 if instance has known emission nets with value 1.*/
extern int  CSInstanceHasHighEmissionNets         _CS_ARGS((__ModuleEntry*, 
                                                    int instIndex));
/** return 1 if instance has unknown nets.*/
extern int  CSInstanceHasUnknownNets      _CS_ARGS((__ModuleEntry*, 
                                                    int instIndex));
/** return 1 if instance has selected signals for browsing. */
extern int  CSInstanceHasBrowsedSignals   _CS_ARGS((__ModuleEntry*, 
                                                    int instIndex));
/** return 1 if any sub instances of instance has halt(s) 
 * marked for breakpoint.*/
extern int  CSInstanceHasInheritedBkp     _CS_ARGS((__ModuleEntry*, 
                                                    int instIndex));
/** return 1 if any sub instances of instance has halt(s) marked 
    for breakpoint that is/are reached.*/
extern int  CSInstanceHasInheritedReachedBkp  _CS_ARGS((__ModuleEntry*, 
                                                        int instIndex));
/** return 1 if any sub instance of instance has known nets with value 1.*/
extern int  CSInstanceHasInheritedHighNets _CS_ARGS((__ModuleEntry*, 
                                                     int instIndex));
/** return 1 if any sub instance of instance has known emission nets with value 1.*/
extern int  CSInstanceHasInheritedHighEmissionNets _CS_ARGS((__ModuleEntry*, 
                                                     int instIndex));
/** return 1 if any sub instance of instance has unknown nets.*/
extern int  CSInstanceHasInheritedUnknownNets _CS_ARGS((__ModuleEntry*, 
                                                        int instIndex));
/** return 1 if any sub instance of instance has selected 
    signals for browsing.*/
extern int  CSInstanceHasInheritedBrowsedSignals _CS_ARGS((__ModuleEntry*, 
                                                           int instIndex));
/** return NULL terminated list of source points coming from instance.*/
extern CSList* CSInstanceNetSourcePointsList _CS_ARGS((__ModuleEntry*,
                                                       int instIndex));
/** return list of index of halts belonging to instance. 
    First element of list is its size. */
extern int*            CSInstanceHaltsList           _CS_ARGS((__ModuleEntry*,
                                                               int instIndex));
/** return list of index of instances called from instance. 
    First element of list is its size. */
extern int*            CSInstanceChildrenList        _CS_ARGS((__ModuleEntry*,
                                                               int instIndex));
/** return list of index of signals defined in instance. 
    First element of list is its size. */
extern int*            CSInstanceSignalsList         _CS_ARGS((__ModuleEntry*,
                                                               int instIndex));
/** return NULL terminated list of source points of signal emissions
    in instance. */
extern CSList* CSInstanceEmissionSPList      _CS_ARGS((__ModuleEntry*,
                                                       int instIndex));
/** return NULL terminated list of source points of signal tests
    in instance. */
extern CSList* CSInstanceTestSPList         _CS_ARGS((__ModuleEntry*, 
                                                      int instIndex));
/** return NULL terminated list of source points of signal value accesses
    in instance. */
extern CSList* CSInstanceAccessSPList       _CS_ARGS((__ModuleEntry*, 
                                                      int instIndex));
/** return NULL terminated list of source points of signal declarations
    in instance. */
extern CSList* CSInstanceDeclarationSPList  _CS_ARGS((__ModuleEntry*, 
                                                      int instIndex));
/** return list of index of variables defined in instance. 
    First element of list is its size. */
extern int*            CSInstanceVariablesList      _CS_ARGS((__ModuleEntry*, 
                                                              int instIndex));

/** A hook function takes as argument the current simulated module
 * and a void* pointer on a user data.
 */
typedef void (__HookFunc) (__ModuleEntry*, void*);

/**
 * Add a hook function that will be called when automaton is reset.
 * The function will use the void* given as argument
 * Several hooks can be called (in order of creation)
 */
extern void CSAddResetHook      _CS_ARGS((__ModuleEntry*, __HookFunc, void*));
/**
 * Add a hook function that will be called just before the automaton is run.
 * The function will use the void* given as argument
 * Several hooks can be called (in order of creation)
 */
extern void CSAddBeforeRunHook  _CS_ARGS((__ModuleEntry*, __HookFunc, void*));
/** Add a hook function that will be called just after the automaton is run.
 * The function will use the void* given as argument
 * Several hooks can be called (in order of creation)
 */
extern void CSAddAfterRunHook   _CS_ARGS((__ModuleEntry*, __HookFunc, void*));

/**
 * an __ExternESIFunc is a function that can be used to extend the
 * Csimulator command. 
 * The Csimul syntax is
 * <pre>
 * ! extern command [arg ...]
 * </pre>
 * If an extern function is set using CSSetExternESIFunc, then it will called
 * with the current simulated automaton, a user data pointer (set at creation
 * time), and arguments as argc, argv. Note that argv[0] = "command".
 * argv array and its elements will be automatically freed. Do not modify
 * it.
 * Function should return __NO_ERROR_CODE if no error, else it should 
 * set module error message using CSSetErrorMessage()
 */
typedef int (*__ExternESIFunc) (__ModuleEntry*, 
                                void* pData, 
                                int argc, 
                                char** argv);
/** Set the __ExternESIFunc to call on Csimul '!extern' command. */
extern void CSSetExternESIFunc _CS_ARGS((__ModuleEntry*, 
                                         __ExternESIFunc, 
                                         void*));
/** Set the __ExternESIFunc to call on Csimul '!demo' command. */
extern void CSSetDemoESIFunc _CS_ARGS((__ModuleEntry*, 
                                       __ExternESIFunc, 
                                       void*));
/**
 * Structure used to pass inputs to the simulator from string inputs
 */
typedef struct __InputStruct __Input;

/**
 * allocate an input event for input of index sigIndex. If input
 * is pure, set value to NULL
 */
extern __Input*     CSInputAllocate         _CS_ARGS((__ModuleEntry*,
                                                      int inputIndex, 
                                                      char* value));

/**
 * allocate an input event for return of index sigIndex. If input
 * is pure, set value to NULL
 */
extern __Input*     CSReturnAllocate        _CS_ARGS((__ModuleEntry*,
                                                      int returnIndex,
                                                      char* value));
/** free an __Input structure */
extern void         CSInputFree             _CS_ARGS((__Input*));
/** return signal name */
extern char*        CSInputGetSignalName    _CS_ARGS((__Input*));
/** return signal index (either input or return index).*/
extern int          CSInputGetSignalIndex   _CS_ARGS((__ModuleEntry*, 
                                                      __Input*));
/** return input value.*/
extern char*        CSInputGetValue         _CS_ARGS((__Input*));
/** return 1 if input is pure.*/
extern  int         CSInputIsPureSimulInput  _CS_ARGS((__Input*));
/** return 1 if input is a return signal.*/
extern int          CSInputIsReturn         _CS_ARGS((__Input*));
/**  return task arguments a a NULL terminated list of char* */
extern CSList*      CSInputGetTaskArgs      _CS_ARGS((__Input*));

/** Check input function.
 * Return:
 * __BAD_INPUT_VALUE_ERROR_CODE (missing value, or bad value)
 * __INPUT_NOT_PURE_ERROR_CODE (input must be pure)
 * __INPUT_EMITTED_TWICE_ERROR_CODE.
 * __NO_ERROR_CODE
 *
 * Side effects. 
 *  Set error message 
 *  Mark input as present (for relation checking)
 */
extern int          CSCheckInput            _CS_ARGS((__ModuleEntry*,
                                                      __Input*));
/** Check return function.
 * Return:
 * __BAD_INPUT_VALUE_ERROR_CODE (missing value, or bad value)
 * __INPUT_NOT_PURE_ERROR_CODE (input must be pure)
 * __INPUT_EMITTED_TWICE_ERROR_CODE.
 * __BAD_TASK_REF_ARG_SIZE_ERROR_CODE : number of reference arguments
 *                                      does not match actual number of
 *                                      arguments
 * __BAD_TASK_ARGUMENT_ERROR_CODE
 * __NO_ERROR_CODE
 *
 * Side effects. 
 *  Set error message
 *  Mark input as present (for relation checking)
 */
extern int          CSCheckReturn           _CS_ARGS((__ModuleEntry*,
                                                      __Input*));
/**
 * Append a new task reference argument value to the __Input*
 * structure assoicated with a return signal.
 */
extern void         CSReturnAddTaskArgValue _CS_ARGS((__Input*, 
                                                      char* argValue));
/**
 * Check relations:
 * returns __NO_ERROR_CODE or __BAD_RELATION_ERROR_CODE
 */
extern int          CSCheckRelations        _CS_ARGS((__ModuleEntry*));

/**
 * Memorize input as the current module input event, which is a list
 * of __Input*.
 */
extern void         CSAddInputToInputEvent  _CS_ARGS((__ModuleEntry*,
                                                      __Input* pInput));
/**
 * Resets module input event list. To be done after an activation
 * or an input error
 */
extern void         CSInputEventReset       _CS_ARGS((__ModuleEntry*));
/**
 * retrieve input event as list of __Input* 
 */
extern CSList*      CSGetInputEvent         _CS_ARGS((__ModuleEntry*));



/**@name ESI error codes.
 * Error codes from csimul (Esterel Simulator Input format). An error 
 * message is also available with CSGetAndResetErrorMessage().
 */
/*@{*/
/** cannot open file. */
#define __CANNOT_OPEN_FILE_ERROR_CODE                     20
/** End Of Input (file or string) */
#define __CSIMUL_EOI_ERROR_CODE                           100
/** Unexpected end of input */
#define __CSIMUL_UNEXPECTED_EOI_ERROR_CODE                101
/** Syntax error */
#define __CSIMUL_SYNTAX_ERROR_CODE                        102
/** Syntax error recovered on end of input */
#define __CSIMUL_SYNTAX_ERROR_RECOVERED_ON_EOI_ERROR_CODE 103
/** Syntax error recovered on ';' */
#define __CSIMUL_SYNTAX_ERROR_RECOVERED_ERROR_CODE        104
/** Parsed a Csimul command */
#define __CSIMUL_COMMAND                                  105
/** Parsed and executed an input command */
#define __CSIMUL_INPUT_COMMAND                            106
/** No input seen */
#define __CSIMUL_NO_INPUT_ERROR_CODE                      107
/** reset command read */
#define __CSIMUL_RESET_COMMAND                            108
/** external command read */
#define __CSIMUL_EXTERN_COMMAND                           109
/** breakpoint command read */
#define __CSIMUL_BKP_COMMAND                              110
/** evaluation mode command read */
#define __CSIMUL_EVAL_MODE_COMMAND                        111
/** force test net command read */
#define __CSIMUL_FORCED_TEST_NET_COMMAND                  112
/** check sum command */
#define __CSIMUL_CHECKSUM_COMMAND                         113
/*@}*/

/**
 * An __EsiInput is the structure that is used internally for to
 * read Csimul commands from files/strings
 */
typedef struct __EsiInput __EsiInput;

/**
 * Create and initialize a new __EsiInput structure.
 */
extern __EsiInput* CSEsiInputAllocate _CS_ARGS((__ModuleEntry*));
/**
 * Initialize an __EsiInput structure
 */
extern void        CSEsiInputInit _CS_ARGS((__EsiInput* pInput, 
                                            __ModuleEntry*));
/**
 * Free an __EsiInput structure
 */
extern void        CSEsiInputFree _CS_ARGS((__EsiInput* pInput));
/**
 * Close (reset) an __EsiInput structure, by closing any memorized
 * files.
 */
extern void        CSEsiInputClose _CS_ARGS((__EsiInput* pInput));

/**
 * Push files in the __EsiInput structure.
 * At parsing time, files will be popped out, opened and read in
 * the order names[0], names[1], ...
 */
extern void        CSEsiPushArgumentFiles _CS_ARGS((__EsiInput*, 
                                                    int n, 
                                                    char** names));
/**
 * Push strings in the __EsiInput structure.
 * At parsing time, string will be popped out and read in
 * the order strings[0], strings[1], ...
 */
extern void        CSEsiPushArgumentStrings _CS_ARGS((__EsiInput*, 
                                                      int n, 
                                                      char** strings));
/**
 * Tries to open first input in __EsiInput stack
 * returns 1 if success,  else 0. 
 * Failure can be caused by  __CSIMUL_EOI_ERROR_CODE (no more input) or
 * __CANNOT_OPEN_FILE_ERROR_CODE. See CSEsiInputErrorCode(). 
 * CSEsiOpenFirstBuffer can be useful if one wants to know if first 
 * input can be actually read during an initialization phase, different 
 * from a possible parsing loop phase for instance.
 */ 
extern int         CSEsiOpenFirstBuffer _CS_ARGS((__EsiInput* pInput));
/**
 * Call the ESI (csimul) parser.
 * Gets inputs from the __EsiInput* argument, popping out new input
 * when necessary.
 * If callByNeed if 1, then stops after each input read and returns
 * current state. Else, enter a parsing loop mode until input is over.
 *
 * Return codes are all the possible error codes prefixed by __CSIMUL.
 * In the parsing loop mode, errors are printed on stderr. 
 * See CSEsiInputErrorCode() and CSEsiInputErrorInfo()
 *
 */
extern int         CSEsiParser _CS_ARGS((__EsiInput*, int callByNeed));
/** return the __ModuleEntry associated with the input.*/
extern __ModuleEntry* CSEsiInputGetModule _CS_ARGS((__EsiInput*));
/**
 * Return error code associated with Csimul input handling (syntax error
 * cannot open file, etc....
 *
 */
extern int         CSEsiInputErrorCode _CS_ARGS((__EsiInput*));
/**
 * Return error code associated with current event submission
 * (input check error, relation error, run time error)
 */
extern int         CSEsiInputErrorInfo _CS_ARGS((__EsiInput*));
/**
 * Set global standard FILE* IOs use by __EsiInput 
 * to the  given arguments.
 */
extern void CSEsiSetIO _CS_ARGS((FILE* pfin, FILE* pfout, FILE* pferr));
/**
 * Set global standard FILE* IOs used by __EsiInput to stdin, stdout, stderr
 *
 */
extern void CSEsiSetStdIO _CS_ARGS(());





/**@name Error messages. */
/*@{*/

/**
 * Return the last error message as a new allocated string and reset
 * internal error message.
 * Returned valued should be freed.
 */
extern char*          CSGetAndResetErrorMessage    _CS_ARGS((__ModuleEntry*));

/**
 * Set internal error message to errMsg. String is copied. 
 * Previous message is destroyed.
 */
extern void           CSSetErrorMessage    _CS_ARGS((__ModuleEntry*,
                                                     char* errMsg));
/**
 * Append errMsg to current error message
 */
extern void           CSErrorMessageAppend  _CS_ARGS((__ModuleEntry*,
                                                      char* errMsg));
/**
 * Reset internal error message
 */
extern void           CSResetErrorMessage  _CS_ARGS((__ModuleEntry*));

/** How a net should be presented */

enum __NetDisplayStateEnum {
   __DISPLAY_LOW,      /* display net has high known with high value */
   __DISPLAY_HIGH,     /* display net has high known with low value */
   __DISPLAY_UNKNOWN   /* display net has unknown */
};
typedef enum __NetDisplayStateEnum __NetDisplayState;

/** priorities for net source point display */

enum __NetDisplayPriorityEnum {
   __DISPLAY_NO_NETS,          /* no net visible */
   __DISPLAY_ONLY_HIGH_NETS,   /* only known net set to 1 visible */
   __DISPLAY_ONLY_UNKNOWN_NETS,/* only unknown net visible */
   __DISPLAY_ALL_HIGH_NETS,    /* high net priority > unknown net priority */
   __DISPLAY_ALL_UNKNOWN_NETS  /* high net priority < unknown net priority */
};
typedef enum __NetDisplayPriorityEnum __NetDisplayPriority;

/** 
 * __NetDisplayPriorityFnc is a function that computes how a net
 * should be displayed given its current state and the current
 * priority. Returns value is of type __NetDisplayState
 */
typedef 
__NetDisplayState (*__NetDisplayPriorityFnc) _CS_ARGS((__NetSPState, 
                                                       __NetDisplayPriority));

/* 
 * priority function can be NULL. Then a default function will be
 * called.
 */
extern void  CSSetNetsDisplayState 
                          _CS_ARGS((__ModuleEntry*,
                                    __NetDisplayPriority priority, 
                                    __NetDisplayPriorityFnc priorityfunc));

/*
 * Returns display state of a net source point
 */
extern __NetDisplayState CSNetSourcePointDisplayStatus 
                                         _CS_ARGS((__ModuleEntry*,
                                                   __SourcePoint* netSP));
/* 
 * List of all nets that must be redisplayed
 */
extern CSList*   CSInstanceSourcePointToRedrawList 
                                         _CS_ARGS((__ModuleEntry*,
                                                   int instNum));
/**@name Old interface compatibility
 * The functions described in this section are used to <em>connect</em>
 * the C generated code with the simulator. They still use global internal
 * variables. This will change when the C generated code is reentrant.
 */
/*@{*/
extern int              __GetNumberOfModules();
extern __ModuleEntry**  __GetModuleTable();
extern int              __GetCheckSum(int*);

/** Used to access internally to the compiler module table.
 * Parameters should be set with values defined in the C generated code.
 * @param moduleTable : set with __ModuleTable.
 * @param numberOfModules : set with __NumberOfModules.
 * @param compilationType : set with CompilationType.
 * 
 * Return 0 in case of failure. */
extern int          __SetModuleTable   _CS_ARGS((__ModuleEntry** moduleTable, 
                                                 int numberOfModules));

/** Use module of given name. Return 1 if ok 0, else */	       
extern int __UseModule                  _CS_ARGS((char* moduleName));
/** Use module of given index. Return 1 if ok 0, else */
extern int __UseModuleIndex             _CS_ARGS((int moduleIndex));
/** Use first module.*/	       
extern void __UseFirstModule             _CS_ARGS(());
/** Return current used module.*/	       
extern __ModuleEntry* __CurrentModule();
/** Return name of module of index.*/
extern char *__ModuleNameOfIndex     _CS_ARGS((int index));

/**@name Unified API.
 * Definition of functions that define a unified API for
 * module calls in standard C code generation and in simulation
 * mode. The following functions are called by <module>_xxx functions
 * in C simulation code. Else, <module>_xxx functions have a default
 * behavior in C code
 */
/*@{*/
/** Initialize simulator.
 * called by <module>_init. In non instrumented code, returns 1.
 * Initialize the simulator and returns 1 in case of success, 0 else.
 * In case of failure, pError is set to a static string describing the error.
 * Default behavior is to set the module table and to initialize simulator
 * data. Once internal data are setup, the call pUserInitFunc if non-NULL
 * that performs some user initializations. This function must return
 * O in case of failure.
 *
 */
extern int __SimulatorInit _CS_ARGS((__ModuleEntry** moduleTable, 
                                     int numberOfModules,
                                     char** pError,
                                     int (*pUserInitFunc)()));

/** Terminates simulator.
 * called by <module>_end. In non instrumented code, does nothing.
 * Terminates the simulator by removing internal data. 
 * Once internal data have been removed, call pUserEndFunc if non-NULL
 * that performs some user initializations. This function must return
 * O in case of failure. Returns pUserEndFunc return value.
 *
 */
extern int __SimulatorEnd _CS_ARGS((int (*pUserEndFunc)()));


/** Module entry call.
 * Called by <module>_run in C generated code. In non instrumented code
 * <module>_run calls standard automaton.
 *
 * There is a difference when a module is run in simulation mode
 * or when it is run by itself.
 * When a module is run as embedded code, it returns:
 * 0 : module is terminated
 * 1 : module is still running
 * -1 : interpreted mode: there is a causality error
 * Any other errors are discarded.
 *
 * In simulation mode, the actual module call may returns 0 or 1
 * or -1 in case of error. Then the run_time_error_code is set. The
 * return value is based on this run_time_error, and is used by the
 * simulator. For the unified API, we want to return 0, 1, and may be -1.
 */
extern int __RunModuleEntry();

/** Return run time error code.
 * called by <module>_getError in simulation mode. In non instrumented code
 * <module>_getErrorMessage returns 0 (no error).
 */
extern int __GetModuleError _CS_ARGS(());

/** Return error message.
 * called by <module>_getErrorMessage in simulation mode. In non instrumented
 * code <module>_getErrorMessage returns a NULL pointer. In simulation
 * mode, returns the last error message as a new string, and clear the
 * internal error message.
 * Returned valued should be freed. 
*/
extern char *__GetModuleErrorMessage  _CS_ARGS(());
/*@}*/
/*@}*/


/* Main function to run a textual simulator
 * if simuAppInit is not NULL, then it is called to set for
 * instance hook functions, or extern csimul commands
 */
int CsimulMain(int  argc, 
               char *argv[],
               void (*simuAppInit)(__ModuleEntry*));


#ifdef  __cplusplus
}
#endif

#endif
