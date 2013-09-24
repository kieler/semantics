/*! \file sc-generic.h
 *
 * Header file to be included by sc.h and by generic SC files.
 * 
 * See README.txt for general information.
 * See LICENSE.txt for licensing information.
 * For further information, see
 * http://www.informatik.uni-kiel.de/rtsys/sc/ .
 *
 * @author Reinhard v. Hanxleden,
 * rvh@informatik.uni-kiel.de
 */
#include <stdio.h>
#include <limits.h>


// ===================================================================
// Type definitions

typedef int            idtype;        //!< Thread id/priority
typedef int            sigtype;       //!< Signal id


// ===================================================================
// Global variables

int          tickInstrCnt;           //!< Instructions in one tick
int          _notInitial;            //!< Flag that indicates not-initial tick
idtype       _cid;                   //!< Id of current thread


// ===================================================================
/*! SC works with two types of sets,
 * 1) thread ids, represented by the type 'idset', and
 * 2) signal ids, represented by the type 'sigset'.
 *
 * These types are defined as scalars or arrays, depending on the
 * application requirements and on the machine architecture. These
 * scalars/arrays are interpreted as bit vectors. A set represented by
 * a variable v contains element i iff bit i is set in v.
 *
 *
 * An SC application can specify its requirements with two constants:
 * 1) _SC_ID_MAX, specifying the highest thread id in use, and
 * 2) _SC_SIG_MAX, specifying the highest signal id in use.
 * These constants must be defined _before_ including sc.h.
 *
 * The number of bits to represent ids 0..MAX is MAX + 1. The number
 * of bits to represent sets of ids or signals is given by '_idCnt' or
 * '_sigCnt', respectively.
 *
 * If the application does not specifiy the thread/signal
 * requirements, the default is to use WORD_BIT - 1, where WORD_BIT is
 * the number of bits to represent an int (typically 32), defined in
 * limits.h.
 *
 *
 * Array representations of sets work with arrays of '_setPartType',
 * currently defined as unsigned long.
 *
 * A '_setPartType' holds '_setPartSize' bits, currently equal to
 * LONG_BIT (defined in limits.h).
 *
 *
 * The type to represent a set that must accomodate highest id MAX
 * (_SC_ID_MAX or _SC_SIG_MAX) is determined as follows:
 *
 * - If MAX >= _setPartSize, then use an array _setPartType[_idsetSize].
 * 
 * - If _setPartSize >= MAX >= WORD_BIT, use a scalar _setPartType.
 *
 * - Else (_setPartSize < WORD_BIT), use a scalar unsigned int.
 *
 *
 * Notes:
 *
 * 1) The defintion of _SC_ID_MAX and _SC_SIG_MAX is
 * optional. However, it may improve performance if they are
 * defined. Eg, the run time of PRIO() depends on _SC_ID_MAX.
 *
 * 2) One complication is that _SC_ID_MAX/_SC_SIG_MAX may be defined
 * in the file 'application.c' that defines the tick function of the
 * application. These constants are not defined in sc.c and sc-main.c,
 * as the functions defined in these files are generic (not specific
 * to an application). However, main() in sc-main.c also makes use of
 * sets of thread ids/signals (specifically when calling
 * id2names()/sig2names()). This conflict is resolved as follows:
 *
 * - In sc.c/sc-main.c, access sets only indirectly, via pointers.
 *
 * - Communicate the actual set sizes via _idMax/_sigMax.
 */


// ===================================================================
// Representing sets of thread ids
#ifndef LONG_BIT
#define LONG_BIT 32
#endif

typedef unsigned long _setPartType;
#define _setPartSize LONG_BIT


// ===================================================================
// Manipulating the coarse program counters

/*! Check whether _SC_NOTRACE has been defined (eg from gcc command line).
 * If so, suppress tracing and instruction counting.
 * This then results in compact macro-expanded source code and executable.
 */
#ifdef _SC_NOTRACE                   // Tracing off
#define clearPC(id)
#define initPC(id, label) _pc[id] = _ref(label)
#define setPC(id, label)  _pc[id] = _ref(label)

#else                                // Tracing on

extern char    *statePrev[];          //!< State where thread resumed previous tick
extern char    *state[];              //!< State where thread resumed current tick

#define clearPC(id) 							\
  statePrev[id] = "_L_INIT";						\
  state[id] = "_L_INIT"

#define initPC(p, label) 						\
  _pc[p] = _ref(label);							\
  statePrev[p] = "_L_INIT";						\
  state[p] = #label

#define setPC(id, label) 						\
  _pc[id] = _ref(label);						\
  statePrev[id] = state[id];						\
  state[id] = #label
#endif 	// _SC_NOTRACE					


// ===================================================================
// Declarations of constants and variables

// Constants defined in <application>.c
extern const int _runMax;              //!< # of runs to execute
extern const int _tickMax;             //!< # of ticks to execute
extern const int _idMax;               //!< Highest thread id in use
extern const int _sigMax;              //!< Highest signal id in use

extern const char *s2signame[];        //!< Names of signals

char *_set2str(char *str, int max, _setPartType *setPtr);   // Defined in sc.c

#define _idPtr2str(setPtr)           _set2str(_setstr, _idMax, setPtr)
#define _idPtr2str2(setPtr)          _set2str(_setstr2, _idMax, setPtr)

#define _sigPtr2str(setPtr)          _set2str(_setstr, _sigMax, setPtr)
#define _sigPtr2str2(setPtr)         _set2str(_setstr2, _sigMax, setPtr)


// ===================================================================
// Low-level routines

//! Encoding of signal/thread 'u' (some non-negative int) in bitvector.
/*! This implementation is fast and simple, BUT limits the max thread
 * ID and max signal ID to the word width of the machine (eg 32).
 */
#define u2b(u)                       (1 << (u))


// ===================================================================
// Set operations based on bit vectors presented by a scalar of type idset/sigset 
// (eg int or long int)

#define _setIsEmpty(set)             (set == 0)
#define _setClear(set)               (set = 0)
#define _setInit(set, i)             (set = u2b(i))
#define _setAdd(set, i)              (set |= u2b(i))
#define _setDel(set, i)              (set &= ~u2b(i))
#define _setAddSet(set1, set2)       (set1 |= set2)
#define _setDelSet(set1, set2)       (set1 &= ~set2)
#define _setContains(set, i)         (set & u2b(i))
#define _setNotOnlyElem0(set)        (set != u2b(0))
#define _setIsDisjoint(set1, set2)   ((set1 & set2) == 0)
//#define _setIsNotDisjoint(set1, set2) ((set1 & set2) != 0)
#define _setCopyFrom(set1, set2)     (set1 = set2)

_setPartType *enabledPtr, *signalsPtr, *tickInputsPtr, *tickOutputsPtr, *tickSignalsPtr;

extern char _setstr[], _setstr2[];   // Strings for printing sets


// ===================================================================
// Declarations of functions defined in <application>.c:

//! Initialize signals to inputs for one tick.
void getInputs(int runCnt, int tickCnt);

//! Set reference outputs and check valued signals, if there are any.
int checkOutputs(int runCnt, int tickCnt, _setPartType *tickOutputs);

//! Print value of a signal, if it has one.
void printVal(int id);

//! Compute one tick.
/*! Returns 1 if some thread is still active in current tick.
 */
int tick();



// ===================================================================
// Set operations based on bit vectors presented by an array of type
// idset[_idsetSize]/sigset[_sigsetSize]

// TYPE is '_id' or '_sig'

//#define _setIsEmpty(set)             (set == 0)
#define _DEF_setIsEmpty(TYPE)						\
  int TYPE ## IsEmpty(_setPartType set[]) {				\
    int flag = 0;							\
    int i;								\
    for (i = TYPE ## setSize - 1; i >= 0; i--) {			\
      flag = set[i];							\
      if (!flag) break;							\
    }									\
    return flag;							\
  }

//#define _setClear(set)               set = 0
#define _DEF_setClear(TYPE)						\
  void TYPE ## Clear(_setPartType set[]) {				\
    int i;								\
    for (i = TYPE ## setSize - 1; i >= 0; i--) {			\
      set[i] = 0;							\
    }									\
  }

//#define _setInit(set, i)             set = u2b(i)
#define _DEF_setInit(TYPE)						\
  void TYPE ## Init(_setPartType set[], int i) {			\
    int j;								\
    for (j = TYPE ## setSize - 1; j >= 0; j--) {			\
      set[j] = 0;							\
    }									\
    set[i / _setPartSize] = u2b(i % _setPartSize);			\
  }

//#define _setAdd(set, i)              set |= u2b(i)
#define _DEF_setAdd(TYPE)						\
  void TYPE ## Add(_setPartType set[], int i) {				\
    set[i / _setPartSize] |= u2b(i % _setPartSize);			\
  }

//#define _setDel(set, i)              set &= ~u2b(i)
#define _DEF_setDel(TYPE)						\
  void TYPE ## Del(_setPartType set[], int i) {				\
    set[i / _setPartSize] &= ~u2b(i % _setPartSize);			\
  }

//#define _setAddSet(set1, set2)       set1 |= set2
#define _DEF_setAddSet(TYPE)						\
  void TYPE ## AddSet(_setPartType set1[], _setPartType set2[]) {	\
    int i;								\
    for (i = TYPE ## setSize - 1; i >= 0; i--) {			\
      set1[i] |= set2[i];						\
    }									\
  }

//#define _setDelSet(set1, set2)       set1 &= ~set2
#define _DEF_setDelSet(TYPE)						\
  void TYPE ## DelSet(_setPartType set1[], _setPartType set2[]) {	\
    int i;								\
    for (i = TYPE ## setSize - 1; i >= 0; i--) {			\
      set1[i] &= ~set2[i];						\
    }									\
  }

//#define _setContains(set, i)         (set & u2b(i))
#define _DEF_setContains(TYPE)						\
  int TYPE ## Contains(_setPartType set[], int i) {			\
    return set[i / _setPartSize] & u2b(i % _setPartSize);		\
  }

//#define _setNotOnlyElem0(set, i)  (set != u2b(0))
#define _DEF_setNotOnlyElem0(TYPE)					\
  int TYPE ## NotOnlyElem0(_setPartType set[]) {			\
    int flag = (set[0] != u2b(0));					\
    int i;								\
    if (!flag) {							\
      for (i = TYPE ## setSize - 1; i > 0; i--) {			\
	flag = (set[i] != 0);						\
	if (flag) break;						\
      }									\
    }									\
    return flag;							\
  }

//#define _setIsDisjoint(set1, set2)   ((set1 & set2) == 0)
#define _DEF_setIsDisjoint(TYPE)					\
  int TYPE ## IsDisjoint(_setPartType set1[], _setPartType set2[]) {	\
    int flag;								\
    int i;								\
    for (i = TYPE ## setSize - 1; i >= 0; i--) {			\
      flag = ((set1[i] & set2[i]) == 0);				\
      if (!flag) break;							\
    }									\
    return flag;							\
  }

//#define _setCopyFrom(set1, set2)     set1 = set2
#define _DEF_setCopyFrom(TYPE)						\
  void TYPE ## CopyFrom(_setPartType set1[], _setPartType set2[]) {	\
    int i;								\
    for (i = TYPE ## setSize - 1; i>=0; i--) {				\
      set1[i] = set2[i];						\
    }									\
  }



// ===================================================================
// If we don't have gcc, then assume we can't use computed goto and
// fall back to switch logic
#ifndef __GNUC__
#define _SC_SWITCHLOGIC
#endif


// ===================================================================
//! Dispatcher
/*! When using switch-case logic, embed the tick function into a
 * switch statement, in turn embedded in an infinite while loop.
 */
#ifdef _SC_SWITCHLOGIC
#define _declState       static labeltype _state;
#define _BEGIN_SWITCH    while (1) {					\
                            _L_SWITCH: switch (_state) {		\
                             case _L_INIT:
#define _END_SWITCH1       }
#define _END_SWITCH2     }
#define _case            case
#define _break           break
#define _goto(label)     do { _state = label; goto _L_SWITCH; } while (0)
#define _deref(label)    label
#define _ref(label)      label
#define _setStateInit    _state = _L_INIT;

#else
#define _declState
#define _BEGIN_SWITCH 
#define _END_SWITCH1
#define _END_SWITCH2
#define _case
#define _break           
#define _goto(label)       goto label
#define _deref(label)      *label
#define _ref(label)        &&label
#define _setStateInit
#endif

/* To select next thread to be used, assign '_cid' the highest set bit in 'active'.
 * NOTE: In 'active', the lowest bit, corresponding to the _TickEnd thread,
 *   will always be set. Hence we safely use the BSR instruction
 *   (which returns an undefined value in case it is handed a word
 *   with no bits set).
 *
 * Two variants for this, depending on whether we have a BSR assembler
 * instruction at our disposal or not.
 */

#if ((defined __i386__ || defined __amd64__ || defined __x86_64__) && defined __GNUC__ && !defined _SC_NOASSEMBLER)
// Version 1: x86 + gcc available.
// Use fast Bit Scan Reverse assembler instruction.
// NOTES:
// - This requires 'set' to be a plain integer (not, eg, an array reference such as _descs[...])
// - If 'set' is 0, the result of 'i' is undefined!
// - Compare also with "63 - __builtin_clzll(set)"
#define _BitScanReverse(set, i)			\
  __asm volatile("bsrl %1,%0\n"			\
		 : "=r" (i)			\
		 : "c" (set)			\
		 )

#else  // Version 2: x86 + gcc not available.

// ===================================================================
//! Compute the highest bit (largest element) in a set.
/*! Uses obvious algorithm, run time linear in position of highest bit.
 * Note that there are also alternatives that run logarithmic to bit vector size.
 * See eg http://graphics.stanford.edu/~seander/bithacks.html#IntegerLog .
 * Which is actually faster depends on application.
 */

#define _BitScanReverse(set, bit) {	      \
    int i;				      \
    bit = 0;				      \
    for (i = set; i > 1; i >>= 1)	      \
      bit++;				      \
  }
#endif

#define dispatch()       selectCid(); _goto(_deref(_pc[_cid]))


// ===================================================================
// Automaton reset, tick start and end

//! Reset automaton. Should be called before first call of tick function.
void RESET();                         // Defined in sc.c

#define _TickEnd 0                    // Priority of TickEnd thread
#define isEnabledNotOnly_TickEnd()  _idNotOnlyElem0(enabled)


//! Start a tick (an instant). 'p' denotes the main thread.
/*! IF this is the initial tick ('_notInitial' is not set),
 *   THEN initialize things and continue with following instruction,
 *   ELSE call dispatcher to resume where we left off.
 *
 * This also initializes the _TickEnd thread. Note that
 * _parent[_TickEnd] is undefined. Note also that _descs[_TickEnd]
 * does not matter, as that thread should never perform an ABORT
 * (TRANS) or JOIN.
 *
 * The flag _notInitial is set to some exotic value ("12345678") to
 * catch (most) cases where an automaton reset has been forgotten.
 */
#ifdef _SC_SUPPRESS_ERROR_DETECT
#define _SC_ERROR_DETECT_NORESET
#else
#define _SC_ERROR_DETECT_NORESET					\
  if (_notInitial != 12345678) {					\
  _SC_ERROR0(_SC_ERROR_NORESET,						\
 "SC ERROR (Missing Reset): RESET() must be called before initial tick!\n");\
  }
#endif

//int _descsarr[2];

#define TICKSTART(p)							\
  static idtype _pid, _ppid;						\
  static idset _forkdescs;						\
  static int _i;							\
  _idClear(_forkdescs);							\
  _declState								\
  freezePreClear							\
  _checkTickInit							\
  if (_notInitial) {							\
    _SC_ERROR_DETECT_NORESET						\
    _idCopyFrom(active, enabled);					\
    dispatch_;								\
  } else {								\
    initPC(_TickEnd, _L_TICKEND);					\
    enableInit(_TickEnd);						\
    _SC_ERROR_DETECT_PRIO(p)						\
    _cid = p;								\
    _parent[_cid] = _TickEnd;						\
    clearPC(_cid);							\
    enable(_cid);							\
    _setStateInit							\
    _setPreInit						 	        \
    _notInitial = 12345678;						\
  }									\
  _BEGIN_SWITCH

//    dispatch_init_;					

//! Complete a tick.
/*! Return 0 iff computation has terminated.
 * This starts with TERM_, to properly terminate a thread that runs into TICKEND.
 */
#define TICKEND						\
  TERM_;						\
  _case _L_TICKEND: setPre				\
  return isEnabledNotOnly_TickEnd();                	\
  _END_SWITCH1			                        \
  mergedDispatch		                        \
  _END_SWITCH2
 

//! If _SC_INLINE_DISPATCH is defined, call dispatcher at each operator that needs it.
//! Otherwise, create shared code block for TERM/PAUSE/dispatch.
/*! This can be included by TICKEND
 */
#ifdef _SC_INLINE_DISPATCH
#define dispatch_ dispatch()
#define mergedDispatch

#else                             // Shared dispatch
#define dispatch_ goto _L_DISPATCH
#define mergedDispatch							\
  _L_TERM:   disable(_cid);						\
_L_PAUSEG:   deactivate(_cid);						\
_L_DISPATCH: dispatch();

#endif



// ===================================================================
// Pausing, suspending, aborting and terminating a thread}

//! Construct a label, of the form "_L'line in source file'".

/*! Origindally contributed by Nicolas Berthier (nicolas.berthier@imag.fr)
 *
 * To avoid label clashes, one must
 * - not generate multiple labels at the same line (this could be, eg,
 *   "PAUSE; PAUSE" in one line)
 * - not include another files within a function (this appears
 *   unlikely anyway)
 * 
 * Note that goto labels have function scope, hence it is ok to have
 * identical labels in different files, as long as they belong to
 * different functions.
 */

/* Note that the ## preprocessing macro, which concatenates
 * strings, prevents macro expansion of it arguments. Thus the
 * construction using _CONCAT and _CONCAT_helper.
 */
#define _CONCAT_helper(a, b)  a ## b
#define _CONCAT(a, b)         _CONCAT_helper(a, b)

#define __LABELL__            _CONCAT(_LL, __LINE__)

#ifdef _SC_SWITCHLOGIC
#define __LABEL__             __LINE__
#else
#define __LABEL__             _CONCAT(_L, __LINE__)
#endif

//! Pause a thread, resume at subsequent statement.
/*! Semantically, this is the primitive operator.
 * In terms of implementation, it is built with PAUSEG.
 */
#define PAUSE								\
  do {									\
    trace1t("PAUSE:", "pauses, active = %s\n", _id2str(active))		\
    PAUSEG_(__LABEL__); _case __LABEL__: (void) 0;			\
  } while (0)

//! Shorthand for 'PAUSE; GOTO(label)'.
/*! Pause a thread, resume at 'label'.
 */
#define PAUSEG(label) do {						\
    trace1t("PAUSEG:", "pauses, active = %s\n", _id2str(active))	\
    PAUSEG_(label);							\
  } while (0)

//! Helper function (if/else-unsafe)
#ifdef _SC_INLINE_DISPATCH
#define PAUSEG_(label)							\
  setPC(_cid, label);							\
  deactivate(_cid);							\
  dispatch_

#else
#define PAUSEG_(label)							\
    setPC(_cid, label);							\
    goto _L_PAUSEG
#endif


//! Shorthand for 'label: PAUSE; GOTO(label)'.
/* Halts a thread, but does not terminate it (compare with TERM).
 */
#define HALT do {							\
    _case __LABEL__: trace1t("HALT:", "pauses, active = %s\n", _id2str(active))	\
    PAUSEG_(__LABEL__);						        \
  } while (0)
 

//! Suspend current thread if 'cond' is true.
/*! Note: suspension is implemented by deactivating the current thread
 * as well as its descendants. This exploits that the PCs of the descendants
 * must reside at tick boundaries.
 */
#define SUSPEND(cond) do {						\
    _case __LABEL__: if (cond) {					\
    trace1t("SUSPEND:", "suspends itself and descendants %s\n", _id2str(_descs[_cid])) \
    _idDelSet(active, _descs[_cid]);					\
    freezePre								\
    instrCntDecr  							\
    PAUSEG_(__LABEL__);							\
  }									\
 } while (0)


//! Suspend current thread, goto 'label'.
/*! Note: suspension is implemented by deactivating the current thread
 * as well as its descendants. This exploits that the PCs of the descendants
 * must reside at tick boundaries.
 */
#define SUSPENDG(label) do {						\
    trace1t("SUSPENDGOT:", "suspends itself and descendants %s\n", _id2str(_descs[_cid])) \
    _idDelSet(active, _descs[_cid]);					\
    freezePre								\
    instrCntDecr  							\
    PAUSEG_(label);							\
  } while (0)


//! Transition to 'label', kill descendant threads (implements abortion).
/*! Shorthand for 'ABORT; GOTO(label)'.
 */
#define TRANS(label) do {						\
    ABORT_;								\
    trace3t("TRANS:", "disables %s, transfers to %s, enabled = %s\n",	\
	    _id2str(_descs[_cid]), #label, _id2str2(enabled))		\
    _goto(label);							\
  } while (0)


//! Abort (terminate) descendant threads.
#define ABORT do {							\
    ABORT_;								\
    trace2t("ABORT:", "disables %s, enabled = %s\n",			\
	    _id2str(_descs[_cid]), _id2str2(enabled))			\
  } while (0)


//!  Helper function (if/else-unsafe)
#define ABORT_								\
    disableSet(_descs[_cid]);						\
    deactivateSet(_descs[_cid])


//! Terminate a thread.
/* Compare to definition of HALT, which lets a thread idle at current position.
 */
#define TERM do {							\
    TERM_;								\
  } while (0)


//  disable(_cid);							\
//  deactivate(_cid);							\
//  disableSet(_descs[_cid]);						\
//  deactivateSet(_descs[_cid]); \


//! Helper function (if/else-unsafe)
#ifdef _SC_INLINE_DISPATCH
#define TERM_								\
  trace1t("TERM:", "terminates, enabled = %s\n", _id2str(enabled, _cid)) \
  dispatch_
#else
#define TERM_ goto _L_TERM
#endif

// ===================================================================
// Handling concurrency

//! Spawn a thread at 'label', with priority 'p'.
/*! 
 */
#define FORK(label, p) do {						\
    FORK_(label, p);							\
    trace3t("FORK:", "forks %d/%s, active = %s\n", p, #label, _id2str(active)) \
  } while (0)

//! Helper function (if/else-unsafe)
#define FORK_(label, p)							\
  initPC(p, label);							\
  _parent[p] = _cid;							\
  _idAdd(_forkdescs, p);						\
  enable(p)


//! Denote parent thread, starting at 'label'.
/*! Must also calculate descendants.
 * Descendants are used
 * - to check for termination (with JOIN)
 * - to be disabled upon abortion (with TRANS)
 */
#define FORKE(label) do {						\
  trace1t("FORKE:", "continues at %s\n", #label)			\
    FORKE_(label);							\
  } while (0)


//! Helper function (if/else-unsafe)
#define FORKE_(label)							\
  setPC(_cid, label);							\
  _idCopyFrom(_descs[_cid], _forkdescs);				\
  _idClear(_forkdescs);							\
  _pid = _cid;								\
  while ((_ppid = _parent[_pid]) != _TickEnd)	{			\
    _idAddSet(_descs[_ppid], _descs[_pid]);				\
    _pid = _ppid;							\
  }									\
  dispatch_

//! Join completed child threads.
/*! IF all descendants have terminated,
 *   THEN proceed after JOINELSE,
 *   ELSE pause, resume at 'elselabel'.
 *
 * Semantically, this is the primitive Join-operator, from which the
 * others can be derived; hence JOINELSE appears first, and the other
 * operators are considered shorthands.
 *
 * In terms of implementation, the operators are built from JOINELSEG,
 * which semantically corresponds to JOINELSE + GOTO.
 */
#define JOINELSE(elselabel) do {					\
  JOINELSEG_(__LABEL__, elselabel);					\
_case __LABEL__: (void) 0;						\
  } while (0)


//! Shorthand for 'JOINELSE(elselabel); GOTO(thenlabel)'.
/*! IF all descendants have terminated,
 *   THEN jump to 'thenlabel',
 *   ELSE pause, resume at 'elselabel'
 */
#define JOINELSEG(thenlabel, elselabel) do {				\
    JOINELSEG_(thenlabel, elselabel);					\
  } while (0)


//! Helper function (if/else-unsafe)
#define JOINELSEG_(thenlabel, elselabel)				\
  if (isEnabledNoneOf(_descs[_cid])) {					\
    trace1t("JOINELSEG:", "joins, transfers to %s\n", #thenlabel)	\
    _goto(thenlabel);							\
  }									\
  trace1t("JOINELSEG:", "does not join, pauses at %s\n", #elselabel)	\
  instrCntDecr								\
  PAUSEG_(elselabel)


//! Shorthand for 'elselabel: JOINELSE(elselabel)'. Join completed child threads.
/*! IF all descendants have terminated,
 *   THEN proceed,
 *   ELSE pause, resume at JOIN.
 */
#define JOIN do {		  				        \
    _case __LABEL__:							\
    trace0t("JOIN:", isEnabledAnyOf(_descs[_cid]) ? "waits\n" : "joins\n") \
    if (isEnabledAnyOf(_descs[_cid])) {				        \
      PAUSEG_(__LABEL__);						\
    }									\
  } while (0)


//! Change priority of a thread, from '_cid' to 'p'
/*! Semantically, this is the primitive operator.
 * In terms of implementation, PRIOG is the basic operator.
 */
#define PRIO(p)	do {			                                \
    trace1t("PRIO:", "set to priority %d\n", p)				\
    PRIOG_(p, __LABEL__);						\
    _case __LABEL__: (void) 0;						\
  } while (0)


//! Shorthand for 'PRIO(p); GOTO(label)'.
#define PRIOG(p, label) do {						\
    trace2t("PRIOG:", "set to priority %d, goto %s\n", p, #label)	\
    PRIOG_(p, label);							\
  } while (0)


//! Check whether PRIO tries to acquire priority that is already in use
#ifdef _SC_SUPPRESS_ERROR_DETECT
#define _SC_ERROR_DETECT_PRIO(p)
#else
#define _SC_ERROR_DETECT_PRIO(p)					\
  if ((p < 0) || (p > _SC_ID_MAX)) {					\
    _SC_ERROR2(_SC_ERROR_PRIORITY_RANGE,				\
	       "SC ERROR (Priority Range): Priority %d not in range 0 .. %d!\n", \
	       p, _SC_ID_MAX)						\
      } else								\
    if (isEnabled(p)) {							\
      _SC_ERROR1(_SC_ERROR_PRIORITY_IN_USE,				\
		 "SC ERROR (Priority Uniqueness): Priority %d already in use!\n", \
		 p)							\
      }
#endif


//! Helper function (if/else-unsafe) to change priority of a thread, from '_cid' to 'p'
/*! IF p == _cid,
 *    THEN we do not have to do anything. ELSE:
 *
 * IF p is already in use by another thread,
 *   THEN report an error. ELSE:
 *
 * // Update parent pointers
 * FOR ALL descendants _pid of current thread with _parent[_pid] == _cid:
 *   Change _parent[_pid] to p
 *
 * // Update descendant lists
 * FOR parent _ppid of current thread:
 *   Delete _cid from _descs[_ppid]
 *   Add p to _descs[_ppid]
 *   REPEAT recursively for parent of _ppid, until _TickEnd (root parent) is reached
 *
 * Deactivate and disable _cid
 * Set _cid = p
 * Enable (and hence implicitly activate) _cid
 */
#define PRIO_(p)							\
  if (p != _cid) {							\
    _SC_ERROR_DETECT_PRIO(p);						\
    _parent[p] = _parent[_cid];						\
    if (!_idIsEmpty(_descs[_cid])) {					\
      for (_pid = _SC_ID_MAX; _pid > 0; _pid--) {			\
	if (_parent[_pid] == _cid)					\
	  _parent[_pid] = p;						\
      }									\
    }									\
    _idCopyFrom(_descs[p], _descs[_cid]);				\
    _pid = _cid;							\
    while ((_ppid = _parent[_pid]) != _TickEnd) {			\
      _idDel(_descs[_ppid], _cid);					\
      _idAdd(_descs[_ppid], p);						\
      _pid = _ppid;							\
    }									\
    deactivate(_cid);							\
    disable(_cid);							\
    _cid = p;								\
    enable(_cid);							\
  }


//! Helper function (if/else-unsafe)
#define PRIOG_(p, label) 						\
  PRIO_(p);								\
  setPC(_cid, label);							\
  dispatch_



// ===================================================================
// Efficient shorthands for thread handling

//! Efficient shorthand for 'PRIO(p); PAUSE; GOTO(label)'.
/*! Set a priority, then pause (this sets "prionext"), resume at 'label'.
 *
 * This shorthand avoids the context switch immediately before the PAUSE.
 */
#define PPAUSEG(p, label) do {						\
    trace2t("PPAUSEG:", "sets prio to %d, pauses, resumes at %s\n", p, #label) \
    PPAUSEG_(p, label);						        \
  } while (0)


//! Helper function (if/else-unsafe)
#define PPAUSEG_(p, label) 			      	                \
  PRIO_(p);								\
  instrCntDecr								\
  PAUSEG_(label)


//! Efficient shorthand for 'PRIO(p); PAUSE'.
/*! Set a priority, then pause (this sets "prionext").
 *
 * This shorthand avoids the context switch immediately before the PAUSE.
 */
#define PPAUSE(p) do {							\
    trace1t("PPAUSE:", "sets prio to %d, pauses\n", p)			\
    PPAUSEG_(__LABEL__);						\
    _case __LABEL__: (void) 0;						\
  } while (0)


//! Efficient shorthand for 'JOINELSE(label); GOTO thenlabel; label: PRIO(p); PAUSE; GOTO(elselabel)'.
/*! IF all descendants have terminated,
 *   THEN jump to 'thenlabel',
 *   ELSE set priority, pause, and continue at 'elselabel'.
 *
 * This shorthand avoids the context switch immediately before the PAUSE.
 */
#define JPPAUSEG(p, thenlabel, elselabel) do {				\
    trace2t("JPPAUSEG:", "%s, prio = %d\n",				\
	    isEnabledNoneOf(_descs[_cid]) ? "joins" : "does not join", p) \
    JPPAUSEG_(p, thenlabel, elselabel);					\
  } while (0)


//! Helper function (if/else-unsafe)
#define JPPAUSEG_(p, thenlabel, elselabel) 				\
  if (isEnabledNoneOf(_descs[_cid])) {					\
    _goto(thenlabel); }							\
  instrCntDecr  							\
  PPAUSEG_(p, elselabel)


//! Shorthand for 'JOINELSE(label); GOTO thenlabel; label: PRIO(p); PAUSE; GOTO(elselabel); thenlabel:'.
/*! IF all descendants have terminated,
 *   THEN proceed,
 *   ELSE set priority to 'p', pause, and continue at 'elselabel'.
 *
 * This shorthand avoids the context switch immediately before the PAUSE.
 */
#define JPPAUSE(p, elselabel) do {					\
    trace2t("JPPAUSE:", "%s, prio = %d\n",				\
	    isEnabledNoneOf(_descs[_cid]) ? "joins" : "does not join", p) \
    JPPAUSEG_(p, __LABEL__, elselabel);			                \
    _case __LABEL__: (void) 0;						\
  } while (0)


// ===================================================================
// Signal initialization, emission and testing

//! Initialize a local signal (handles reincarnation)
#define SIGNAL(s) do {							\
    trace2t("SIGNAL:", "initializes %s/%d\n", s2signame[s], s)		\
    _sigDel(signals, s);						\
  } while (0)


#ifdef _SC_SUPPRESS_ERROR_DETECT
#define _checkTickInit
#define _checkSIG_ID(s)
#define _checkPRESENT(s)
#define _checkPRESENTc(s)
#define _checkEMIT(s)
#else

#define _checkTickInit      _sigClear(_presence_tested);

void _checkSIG_ID(sigtype s, sigtype max);      // Defined in sc.c

#define _checkPRESENT(s)    _checkSIG_ID(s, _SC_SIG_MAX); if (!_sigContains(signals, s)) _sigAdd(_presence_tested, s);

#define _checkPRESENTc(s)   _checkSIG_ID(s, _SC_SIG_MAX), (_sigContains(signals, s) ? 0 : _sigAdd(_presence_tested, s)),
//#define _checkPRESENTc(s)   _checkSIG_ID(s, _SC_SIG_MAX), _sigAdd(_presence_tested, s),

//! Check whether an emitted signal has already been checked for presence
#define _checkEMIT(s)							\
  _checkSIG_ID(s, _SC_SIG_MAX);						\
  if (_sigContains(_presence_tested, s)) {				\
  _SC_ERROR2(_SC_ERROR_CAUSALITY,					\
	     "SC ERROR (Causality): Signal %s/%d emitted after test for presence!\n",\
	     s2signame[s], s)						\
  }
#endif

//! Emission of a pure signal 's'
#define EMIT(s) do {					        	\
    trace2t("EMIT:", "emits %s/%d\n", s2signame[s], s)			\
    _checkEMIT(s)							\
    _sigAdd(signals, s);						\
  } while (0)


//! Sustain a pure signal 's'
#define SUSTAIN(s) do {							\
    _case __LABEL__: trace2t("SUSTAIN:", "emits %s/%d\n", s2signame[s], s) \
    EMIT(s); PAUSEG_(__LABEL__);					\
  } while (0)


//! Test for presence of signal 's' (predicate).
/*! IF 's' is present,
 *   THEN return 1,
 *   ELSE return 0.
 */
#define PRESENT(s)							\
  (trace3tc("PRESENT:", "determines %s/%d %s\n",			\
	    s2signame[s], s, _sigContains(signals, s) ? "present" : "absent") \
   (_checkPRESENTc(s) _sigContains(signals, s)))



//! Test for presence of signal 's' (control flow op).
/*! IF 's' is present,
 *   THEN proceed to next instruction,
 *   ELSE jump to 'label'
 */
#define PRESENTELSE(s, label) do {					\
    _checkPRESENT(s)							\
      if (!_sigContains(signals, s)) {					\
      trace3t("PRESENTELSE:", "determines %s/%d absent, transfers to %s\n", \
	      s2signame[s], s, #label)					\
      _goto(label);							\
    }									\
    trace2t("PRESENTELSE:", "determines %s/%d present\n", s2signame[s], s) \
  } while (0)


//! If signal 's' is present, emit 't'.
/*! Shorthand for 'PRESENTELSE(s, label); EMIT(t); label:'
 */
#define PRESENTEMIT(s, t) do {						\
    _checkPRESENT(s)							\
    if _sigContains(signals, s) {					\
      trace4t("PRESENTEMIT:", "determines %s/%d present, emits %s/%d\n", \
	      s2signame[s], s, s2signame[t], t)				\
	_checkEMIT(t)							\
      _sigAdd(signals, t);						\
    }									\
    elsetrace								\
      trace2t("PRESENTEMIT:", "determines %s/%d absent\n", s2signame[s], s) \
    elsetraceend							\
  } while (0)


//! Await (immediately) signal 's'.
/*! IF 's' is present,
 *   THEN proceed to next instruction,
 *   ELSE pause.
 *
 * Shorthand for 'GOTO(label); elselabel: PAUSE;  label: PRESENT(s, elselabel)'.
 */
#define AWAITI(s) do {							\
    _case __LABEL__:    _checkPRESENT(s)				\
      if (!_sigContains(signals, s)) {					\
      trace2t("AWAITI:", "determines %s/%d absent, waits\n",		\
	    s2signame[s], s)						\
      PAUSEG_(__LABEL__);						\
    }									\
    trace2t("AWAITI:", "determines %s/%d present, proceeds\n", s2signame[s], s) \
  } while (0)


//! Await (non-immediately) signal 's'.
/*! Pause; Then, IF 's' is present,
 *   THEN proceed to next instruction,
 *   ELSE pause.
 *
 * Shorthand for 'PAUSE; AWAITI(s)',
 * or, alternatively: 'elselabel: PAUSE;  PRESENT(s, elselabel)'.
 */
#define AWAIT(s) do {							\
    trace0t("AWAIT:", "initial pause\n")				\
    goto __LABELL__;							\
    _case __LABEL__:    _checkPRESENT(s)				\
      if (!_sigContains(signals, s)) {					\
      trace2t("AWAIT:", "determines %s/%d absent, waits\n",		\
	    s2signame[s], s)						\
	__LABELL__: PAUSEG_(__LABEL__);					\
    }									\
    trace2t("AWAIT:", "determines %s/%d present, proceeds\n", s2signame[s], s) \
  } while (0)


// ===================================================================
// Handling valued signals.

//! Emission of a valued signal 's', type integer.
#define EMITINT(s, val) do {						\
    valSigInt[s] = val;							\
    trace3t("EMITINT:", "emits %s/%d, value %d\n",			\
	    s2signame[s], s, val)					\
    _checkEMIT(s)							\
    _sigAdd(signals, s);						\
  } while (0)


//! Emission of a valued signal 's', type integer, combined with * .
#define EMITINTMUL(s, val) do {						\
    valSigInt[s] *= val;						\
    trace4t("EMITINTMUL:", "emits %s/%d, value %d, result %d\n",	\
	    s2signame[s], s, val, valSigInt[s])				\
    _checkEMIT(s)							\
    _sigAdd(signals, s);						\
  } while (0)


//! Emission of a valued signal 's', type integer, combined with + .
#define EMITINTADD(s, val) do {						\
    valSigInt[s] += val;						\
    trace4t("EMITINTADD:", "emits %s/%d, value %d, result %d\n",	\
	    s2signame[s], s, val, valSigInt[s])				\
    _checkEMIT(s)							\
    _sigAdd(signals, s);						\
  } while (0)


/* Definition of the macros for a minimum and a maximum function.
 * MAX(a, b) returns a if it is greater than b, otherwise b.
 * MIN(a, b) returns a if it is less than b, otherwise b.
 */

#define MAX(a, b) ((a > b) ? (a) : (b))
#define MIN(a, b) ((a < b) ? (a) : (b))


//! Emission of a valued signal 's', type integer, combined with the maximum function .
#define EMITINTMAX(s, val) do {						\
    valSigInt[s] = MAX(val, valSigInt[s]);				\
    trace4t("EMITINTMAX:", "emits %s/%d, value %d, result %d\n",	\
	    s2signame[s], s, val, valSigInt[s])				\
    _checkEMIT(s)							\
    _sigAdd(signals, s);						\
  } while (0)


//! Emission of a valued signal 's', type integer, combined with the minimum function .
#define EMITINTMIN(s, val) do {						\
    valSigInt[s] = MIN(val, valSigInt[s]);				\
    trace4t("EMITINTMIN:", "emits %s/%d, value %d, result %d\n",	\
	    s2signame[s], s, val, valSigInt[s])				\
    _checkEMIT(s)							\
    _sigAdd(signals, s);						\
  } while (0)


//! Retrieve value of signal 's'.
#define VAL(s) (							\
    trace3tc("VAL:", "determines value of %s/%d as %d\n",		\
	    s2signame[s], s, valSigInt[s])				\
    valSigInt[s])


//! Retrieve value of signal 's' into 'reg'.
#define VALREG(s, reg) do {						\
    trace3t("VALREG:", "determines value of %s/%d as %d\n",		\
	    s2signame[s], s, valSigInt[s])				\
    reg = valSigInt[s];						        \
  } while (0)


// ===================================================================
// Handling PRE.
// The following is compiled conditionally depending on _SC_USE_PRE
// <application>.c must define _SC_USE_PRE if PRE is used


#ifdef _SC_USE_PRE
//! At beginning of initial tick:
//! Initialize previous signals.
#define _setPreInit   \
  _sigClear(sigsPre); \
  setPreValInit;

//! At end of tick:
//! Copy current signals (unless frozen) to previous signals.
#define setPre							        \
  _sigCopyFromUnionIntersectInvert(sigsPre, sigsPre, sigsFreeze, signals, sigsFreeze); \
  setPreVal

//! When suspending current thread:
//! Add signals local to current thread or its descendants
//! to list of signals to freeze.
#define freezePre       _sigAddSet(sigsFreeze, sigsDescs[_cid]);

//! At beginning of tick:
//! Clear list of signals to freeze.
#define freezePreClear  _sigClear(sigsFreeze);

#else     // #ifdef _SC_USE_PRE
#define _setPreInit
#define setPre
#define freezePre
#define freezePreClear
#endif     // #ifdef _SC_USE_PRE


//! Test for presence of signal in previous tick.
/*! IF 's' was present in previous tick,
 *   THEN return 1,
 *   ELSE return 0.
 */
#define PRESENTPRE(s)							\
  (trace3tc("PRESENTPRE:", "determines %s/%d %s\n",			\
	    s2signame[s], s, _sigContains(sigsPre, s) ? "present" : "absent") \
   _sigContains(sigsPre, s))


//! Test for presence of signal in previous tick.
/*! IF 's' was present in previous tick,
 *   THEN proceed to next instruction,
 *   ELSE jump to 'label'
 */
#define PRESENTPREELSE(s, label) do {					\
    if (!_sigContains(sigsPre, s)) {					\
      trace3t("PRESENTPRE:", "determines previous %s/%d absent, transfers to %s\n", \
	      s2signame[s], s, #label)					\
      _goto(label);							\
    }									\
    trace2t("PRESENTPRE:", "determines previous %s/%d present\n",	\
	    s2signame[s], s)						\
  } while (0)


// ===================================================================
// Handling valued signals in conjunction with PRE

#ifdef _SC_USE_PRE

// The following is compiled conditionally depending on _SC_valSigInt_SIZE.
// <application>.c must define _SC_valSigInt_SIZE if valued signals are used.

#ifdef _SC_valSigInt_SIZE
//! At beginning of initial tick:
//! Initialize previous signal values.
#define setPreValInit					\
  for (_i = 0; _i < _SC_valSigInt_SIZE; _i++) 		\
    valSigIntPre[_i] = -1;

//! At end of tick:
//! Copy values of current signals (unless frozen) to previous signals.
#define setPreVal					\
  for (_i = 0; _i < _SC_valSigInt_SIZE; _i++) 		\
    if (!_sigContains(sigsFreeze, _i))			\
      valSigIntPre[_i] = valSigInt[_i];

#else     // #ifdef _SC_valSigInt_SIZE
#define setPreValInit
#define setPreVal
#endif    // #ifdef _SC_valSigInt_SIZE
#endif    // #ifdef _SC_USE_PRE


//! Retrieve previous value of signal 's'.
#define VALPRE(s) (						\
    trace3tc("VALPRE:", "determines value of %s/%d as %d\n",	\
	    s2signame[s], s, valSigIntPre[s])			\
    valSigIntPre[s])


//! Retrieve previous value of signal 's' into 'reg'.
#define VALPREREG(s, reg) do {					\
    trace3t("VALPREREG:", "determines value of %s/%d as %d\n",	\
	    s2signame[s], s, valSigIntPre[s])			\
    reg = valSigIntPre[s];					\
  } while (0)


// ===================================================================
// Control flow: jumps

//! Just a goto that also gets counted as instruction.
#define GOTO(label) do {					\
    trace1t("GOTO:", "transfer to %s\n", #label)		\
    instrCntIncr						\
    _goto(label);						\
  } while (0)


// ===================================================================
// Support for Exit Actions

//! Test whether an Exit Action has to be performed (predicate).
/*! IF thread 'id' is active and at state 'statelabel',
 *   THEN return 1,
 *   ELSE return 0.
 */
#define ISAT(id, statelabel)						\
  (trace2tc("ISAT:", "%s at %s\n",					\
	    (isEnabled(id) && (_pc[id] == _ref(statelabel))) ? "_is_" : "is _not_", #statelabel) \
   (isEnabled(id) && (_pc[id] == _ref(statelabel))))


//! Test whether an Exit Action has to be performed (control flow operation).
/*! IF thread 'id' is active and at state 'statelabel',
 *   THEN proceed to next instruction,
 *   ELSE jump to 'label'.
 *  Shorthand for 'if (!ISAT(id, statelabel)) goto label'.
 */
#define ISATELSE(id, statelabel, label) {				\
  if (isEnabled(id) && (_pc[id] == _ref(statelabel))) {			\
    trace1t("ISATELSE:", "_is_ at %s\n", #statelabel)			\
  } else {								\
    trace2t("ISATELSE:", "is _not_ at %s, transfer to %s\n",		\
	    #statelabel, #label)					\
    _goto(label);							\
  }}


//! Call a function at 'label'.
/*! Use this if an Exit Action _must_ be performed.
 */
#define CALL(label) do {						\
    trace1t("CALL:", "calls %s\n", #label)				\
      _returnAddress = _ref(__LABEL__);					\
    _goto(label);							\
    _case __LABEL__: (void) 0;						\
  } while (0)


//! Return from a function call
#define RET do {							\
    trace0t("RET:", "returns\n")		                        \
    _goto(_deref(_returnAddress));					\
  } while (0)


//! Conditionally call a function.
/*! IF thread 'id' is active and at state 'statelabel',
 *   THEN call function at 'label';
 * Use this if an Exit Action _may_ have to be performed
 * Shorthand for 'ISATELSE(id, l_state, l); CALL(l_call); l:'
 */
#define ISATCALL(id, l_state, l_call) do {				\
    if (isEnabled(id) && (_pc[id] == _ref(l_state))) {			\
      trace1t("ISATCALL:", "calls %s\n", #l_call)			\
      _returnAddress = _ref(__LABEL__);				        \
      _goto(l_call);							\
    }									\
    trace1t("ISATCALL:", "does _not_ call %s\n", #l_call)		\
    _case __LABEL__: (void) 0;					        \
  } while (0)


// ===================================================================
//! Instruction counting/Tracing

//! Increment/decrement SC instruction counter.

/*! Decrement is needed in some places to avoid duplicate counting.
 */
#ifndef _SC_NOTRACE
  #define instrCntIncr tickInstrCnt++;
  #define instrCntIncrc tickInstrCnt++,
  #define instrCntDecr tickInstrCnt--;
#else
  #define instrCntIncr
  #define instrCntIncrc
  #define instrCntDecr
#endif


//! If tracing is turned on, print trace string.
#ifdef _SC_NOTRACE
  #define trace0(f)
  #define trace1(f, a)
  #define trace2(f, a, b)
  #define trace3(f, a, b, c)
  #define trace4(f, a, b, c, d)
  #define trace5(f, a, b, c, d, e)
  #define trace6(f, a, b, c, d, e, g)
  #define trace7(f, a, b, c, d, e, g, h)
  #define trace8(f, a, b, c, d, e, g, h, i)
  #define trace0c(f)
  #define trace1c(f, a)
  #define trace2c(f, a, b)
  #define trace3c(f, a, b, c)
  #define elsetrace
  #define elsetraceend
#else
  #define trace0(f)                printf(f);
  #define trace1(f, a)             printf(f, a);
  #define trace2(f, a, b)          printf(f, a, b);
  #define trace3(f, a, b, c)       printf(f, a, b, c);
  #define trace4(f, a, b, c, d)    printf(f, a, b, c, d);
  #define trace5(f, a, b, c, d, e) printf(f, a, b, c, d, e);
  #define trace6(f, a, b, c, d, e, g) printf(f, a, b, c, d, e, g);
  #define trace7(f, a, b, c, d, e, g, h) printf(f, a, b, c, d, e, g, h);
  #define trace8(f, a, b, c, d, e, g, h, i) printf(f, a, b, c, d, e, g, h, i);
  #define trace0c(f)                printf(f),
  #define trace1c(f, a)             printf(f, a),
  #define trace2c(f, a, b)          printf(f, a, b),
  #define trace3c(f, a, b, c)       printf(f, a, b, c),
  #define elsetrace else {
  #define elsetraceend }
#endif


//! Count instruction (optionally), print trace string prefix (optionally).

/*! Trace string prefix takes a string s (typically denoting the instruction)
 * and identifies the executing thread, both by name and thread id.
 */
#define traceThread(s)							\
  instrCntIncr								\
  trace3("%-9s %d/%s ", s, _cid, state[_cid])

//  trace3("%-9s %d/%s ", s, _cid, state[_cid])

#define traceThreadc(s)							\
  instrCntIncrc								\
  trace3c("%-9s %d/%s ", s, _cid, state[_cid])


//! Print trace prefix + suffix

/*! s is string denoting instruction (eg, "PAUSE:")
 * f is format string for trace suffix
 * a, b, ... are arguments for format string
 */
#define trace0t(s, f)             traceThread(s) trace0(f)
#define trace1t(s, f, a)          traceThread(s) trace1(f, a)
#define trace2t(s, f, a, b)       traceThread(s) trace2(f, a, b)
#define trace3t(s, f, a, b, c)    traceThread(s) trace3(f, a, b, c)
#define trace4t(s, f, a, b, c, d) traceThread(s) trace4(f, a, b, c, d)
#define trace5t(s, f, a, b, c, d, e) traceThread(s) trace5(f, a, b, c, d, e)
#define trace6t(s, f, a, b, c, d, e, f1) traceThread(s) trace6(f, a, b, c, d, e, f1)
#define trace7t(s, f, a, b, c, d, e, f1, g) traceThread(s) trace7(f, a, b, c, d, e, f1, g)
#define trace8t(s, f, a, b, c, d, e, f1, g, h) traceThread(s) trace7(f, a, b, c, d, e, f1, g, h)


// Variants with trailig comma insted of semicolon:
#define trace0tc(s, f)             traceThreadc(s) trace0c(f)
#define trace1tc(s, f, a)          traceThreadc(s) trace1c(f, a)
#define trace2tc(s, f, a, b)       traceThreadc(s) trace2c(f, a, b)
#define trace3tc(s, f, a, b, c)    traceThreadc(s) trace3c(f, a, b, c)


// ===================================================================
//! Dump set of ids or signals

#ifdef _SC_NOTRACE 

#define id2names(prefix, suffix, setPtr)
#define sig2names(prefix, suffix, setPtr)

#else

void set2names(char *prefix, char* suffix, void *setPtr, int setmax, char *names[]);  // Defined in sc.c

#define id2names(prefix, suffix, setPtr)    set2names(prefix, suffix, setPtr, _idMax, state)
#define sig2names(prefix, suffix, setPtr)   set2names(prefix, suffix, setPtr, _sigMax, (char **) s2signame)
#endif


// ===================================================================
// Error handling

#define _SC_ERROR_NONE             0
#define _SC_ERROR_NORESET          1
#define _SC_ERROR_PRIORITY_IN_USE  2
#define _SC_ERROR_PRIORITY_RANGE   3
#define _SC_ERROR_CAUSALITY        4
#define _SC_ERROR_NONE_ACTIVE      5
#define _SC_ERROR_SIGID            6

//! Exit on errors
/*! code: error code
 * f: format string for error message
 * a, b, ...: arguments for f
 */
#ifndef _SC_SUPPRESS_ERROR_DETECT
#include <stdlib.h>
#define _SC_ERROR0(code, f)          fprintf(stderr, f); exit(code);
#define _SC_ERROR1(code, f, a)       fprintf(stderr, f, a); exit(code);
#define _SC_ERROR2(code, f, a, b)    fprintf(stderr, f, a, b); exit(code);
#define _SC_ERROR3(code, f, a, b, c) fprintf(stderr, f, a, b, c); exit(code);
#endif
