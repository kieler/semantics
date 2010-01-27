/*! \file sc.h
 *
 * Definition of SyncChart C macros.
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


/*! Check whether externflags has been defined (eg from gcc command line).
 * If so, suppress tracing and instruction counting.
 * This then results in compact macro-expanded source code and executable.
 */
#ifndef externflags
// Comment the following line out to surpress detailed tracing.
#define mytrace
#define instrCnt
#endif


/* Definition of the macros for a minimum and a maximum function.
 * MAX(a, b) returns a if it is greater than b, otherwise b.
 * MIN(a, b) returns a if it is less than b, otherwise b.
 */

#define MAX(a, b) a > b ? a : b
#define MIN(a, b) a < b ? a : b

// ===================================================================
// Type definitions

#ifdef _SC_SWITCHLOGIC
typedef int            labeltype;     //!< switch/case
#else
typedef void          *labeltype;     //!< Computed goto - a la gcc
#endif

typedef unsigned int   bitvector;     //!< 32 bits on IA32
typedef bitvector      signalvector;  //!< 32 signals on IA32
typedef int            threadtype;    //!< Thread id/priority
typedef bitvector      threadvector;  //!< 32 threads on IA32

// ===================================================================
// Global variables

signalvector signals;                //!< Bit mask for signals
threadvector enabled;                //!< Bit mask for enabled threads
threadvector active;                 //!< Bit mask for active threads

#define      _idMax 8*sizeof(threadvector) //!< Number of threads

int          runCnt;                 //!< Counts program runs
int          tickCnt;                //!< Counts program ticks
int          tickInstrCnt;           //!< Instructions in one tick
threadtype   _cid;                   //!< Id of current thread
labeltype    _pc[_idMax];            //!< Pseudo program counters
threadvector _descs[_idMax];         //!< Descendants of thread
threadtype   _parent[_idMax];        //!< Parent of thread
labeltype    _returnAddress;         //!< For function calls (eg Exit Actions)


// ===================================================================
// Manipulating the coarse program counters

#ifdef mytrace
char    *statePrev[_idMax];           //!< State where thread resumed previous tick
char    *state[_idMax];               //!< State where thread resumed current tick


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

#else                               // No tracing
#define clearPC(id)
#define initPC(id, label) _pc[id] = _ref(label)
#define setPC(id, label)  _pc[id] = _ref(label)
#endif 	// mytrace					


// ===================================================================
// Declarations of constants and variables

// Constants defined in <application>.c
int runMax;               //!< # of runs to execute
int tickMax;              //!< # of ticks to execute

extern const char *s2signame[];        //!< Names of signals


// ===================================================================
// Declarations of functions defined in <application>.c:

//! Initialize signals to inputs for one tick.
void getInputs();

//! Set reference outputs and check valued signals, if there are any.
int checkOutputs(signalvector *tickOutputs);

//! Print value of a signal, if it has one.
void printVal(int id);

//! Compute one tick.
/*! Returns 1 if some thread is still active in current tick.
 */
int tick(int isInit);

//! Functions defined in sc.c
void selectCid();


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
#define _goto(label)     _state = label; goto _L_SWITCH
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

/* Two variants for selecting the next thread to be used, depending on
 * whether we have a BSR assembler instruction at our disposal or not.
 */

#if ((defined __i386__ || defined __amd64__ || defined __x86_64__) && defined __GNUC__ && !defined _SC_NOASSEMBLER)
// Version 1: x86 + gcc available.
// Use fast Bit Scan Reverse assembler instruction.
#define selectCid_()				\
  __asm volatile("bsrl %1,%0\n"			\
		 : "=r" (_cid)			\
		 : "c" (active)			\
		 )

#else
// Version 2: x86 + gcc not available.
// Call function, defined in sc.c.
#define selectCid_()   selectCid()
#endif

#define dispatch()       selectCid_(); _goto(_deref(_pc[_cid]))


// ===================================================================
// Low-level routines

//! Encoding of signal/thread 'u' (some non-negative int) in bitvector.
/*! This implementation is fast and simple, BUT limits the max thread
 * ID and max signal ID to the word width of the machine (eg 32).
 */
#define u2b(u)         (1 << u)


// ===================================================================
// Keeping track of the thread status

//! Thread enabling/disabling
#define enable(id) 				\
  enabled |= u2b(id);				\
  active  |= u2b(id)

#define enableInit(id) 				\
  enabled = u2b(id);				\
  active  = enabled

#define disable(id)             enabled &= ~u2b(id)
#define disableSet(idset)       enabled &= ~idset
#define isEnabled(id)           (enabled & u2b(id))
#define isEnabledNotOnly(id)    (enabled != u2b(id))
#define isEnabledNoneOf(idset)  ((enabled & idset) == 0)
#define isEnabledAnyOf(idset)   ((enabled & idset) != 0)

//! Thread (de-)activation
#define activate(id)            active |= u2b(id)
#define deactivate(id)          active &= ~u2b(id)
#define deactivateSet(idset)    active  &= ~idset
#define isActive(id)            (active & u2b(id))


// ===================================================================
// Tick start and end

#define _TickEnd 0                    // Priority of TickEnd thread

//! Start a tick (an instant). 'p' denotes the main thread.
/*! IF this is the initial tick ('isIni' is set),
 *   THEN initialize things and continue with following instruction,
 *   ELSE call dispatcher to resume where we left off.
 *
 * This also initializes the _TickEnd thread. Note that
 * _parent[_TickEnd] is undefined. Note also that _descs[_TickEnd]
 * does not matter, as that thread should never perform an ABORT
 * (TRANS) or JOIN.
 */
#define TICKSTART(isIni, p)				\
  static threadtype _pid, _ppid;			\
  static threadvector _forkdescs = 0;			\
  _declindex						\
  _declState						\
  freezePreClear					\
  if (isIni) {						\
    tickCnt = 0;					\
    initPC(_TickEnd, _L_TICKEND);			\
    enableInit(_TickEnd);				\
    _cid = p;						\
    _parent[_cid] = _TickEnd;				\
    clearPC(_cid);					\
    enable(_cid);					\
    _setStateInit					\
    _setPreInit						\
    _setValInit					        \
      } else {						\
    active = enabled;					\
    dispatch_;						\
  }							\
  _BEGIN_SWITCH

//    dispatch_init_;					

//! Complete a tick.
/*! Return 0 iff computation has terminated
 */
#define TICKEND						\
  _case _L_TICKEND: setPre				\
  return isEnabledNotOnly(_TickEnd);                	\
  _END_SWITCH1			                        \
  mergedDispatch		                        \
  _END_SWITCH2
 

//! If inlineDispatch is defined, call dispatcher at each operator that needs it.
//! Otherwise, create shared code block for TERM/PAUSE/dispatch.
/*! This can be included by TICKEND
 */
#ifdef inlineDispatch
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
 *
 * Note also that the ## preprocessing macro, which concatenates
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
    trace1t("PAUSE:", "pauses, active = 0%o\n", active)			\
    PAUSEG_(__LABEL__); _case __LABEL__: (void) 0;			\
  } while (0)

//! Shorthand for 'PAUSE; GOTO(label)'.
/*! Pause a thread, resume at 'label'.
 */
#define PAUSEG(label) do {						\
    trace1t("PAUSEG:", "pauses, active = 0%o\n", active)		\
    PAUSEG_(label);							\
  } while (0)

//! Helper function (if/else-unsafe)
#ifdef inlineDispatch
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
    _case __LABEL__: trace1t("HALT:", "pauses, active = 0%o\n", active)	\
    PAUSEG_(__LABEL__);						        \
  } while (0)
 

//! Suspend current thread if 'cond' is true.
/*! Note: suspension is implemented by deactivating the current thread
 * as well as its descendants. This exploits that the PCs of the descendants
 * must reside at tick boundaries.
 */
#define SUSPEND(cond) do {						\
    _case __LABEL__: if (cond) {					\
    trace1t("SUSPEND:", "suspends itself and descendants 0%o\n", _descs[_cid]) \
    active &= ~_descs[_cid];						\
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
    trace1t("SUSPENDGOT:", "suspends itself and descendants 0%o\n", _descs[_cid]) \
    active &= ~_descs[_cid];						\
    freezePre								\
    instrCntDecr  							\
    PAUSEG_(label);							\
  } while (0)


//! Transition to 'label', kill descendant threads (implements abortion).
/*! Shorthand for 'ABORT; GOTO(label)'.
 */
#define TRANS(label) do {						\
    ABORT_;								\
    trace3t("TRANS:", "disables 0%o, transfers to %s, enabled = 0%o\n",	\
	    _descs[_cid], #label, enabled)				\
    _goto(label);							\
  } while (0)


//! Abort (terminate) descendant threads.
#define ABORT do {							\
    ABORT_;								\
    trace2t("ABORT:", "disables 0%o, enabled = 0%o\n",			\
	    _descs[_cid], enabled)					\
  } while (0)


//!  Helper function (if/else-unsafe)
#define ABORT_								\
    disableSet(_descs[_cid]);						\
    deactivateSet(_descs[_cid])


//! Terminate a thread.
/* Compare to definition of HALT, which lets a thread idle at current position.
 */
#define TERM do {						\
    trace1t("TERM:", "terminates, enabled = 0%o\n", enabled)	\
    TERM_;							\
  } while (0)


//! Helper function (if/else-unsafe)
#ifdef inlineDispatch
#define TERM_							\
    disable(_cid);						\
    deactivate(_cid);						\
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
    trace3t("FORK:", "forks %d/%s, active = 0%o\n", p, #label, active)	\
  } while (0)


//! Helper function (if/else-unsafe)
#define FORK_(label, p)							\
  initPC(p, label);							\
  _parent[p] = _cid;							\
  _forkdescs |= u2b(p);							\
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
  _descs[_cid] = _forkdescs;						\
  _forkdescs = 0;							\
  _pid = _cid;								\
  while ((_ppid = _parent[_pid]) != _TickEnd)	{			\
    _descs[_ppid] |= _descs[_pid];					\
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


//! Set priority of a thread.
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


//! Helper function (if/else-unsafe)
#define PRIO_(p)							\
  deactivate(_cid);							\
  disable(_cid);							\
  _descs[p] = _descs[_cid];						\
  _pid = _cid;								\
  while ((_ppid = _parent[_pid]) != _TickEnd) {				\
    _descs[_ppid] &= ~u2b(_cid);					\
    _descs[_ppid] |= u2b(p);						\
    _pid = _ppid;							\
  }									\
  _cid = p;								\
  enable(_cid);


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
#define PPAUSEG_(p, label) 				\
  PRIO_(p);						\
  instrCntDecr						\
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
  if (isEnabledNoneOf(_descs[_cid])) 				        \
    _goto(thenlabel);							\
  instrCntDecr  							\
  PPAUSEG_(p, elselabel)


//! Shorthand for 'JOINELSE(label); GOTO thenlabel; label: PRIO(p); PAUSE; GOTO(elselabel); thenlabel:'.
/*! IF all descendants have terminated,
 *   THEN proceed,
 *   ELSE set priority, pause, and continue at 'elselabel'.
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
#define SIGNAL(s) do {						\
    trace2t("SIGNAL:", "initializes %s/%d\n", s2signame[s], s)		\
    signals &= ~u2b(s);						        \
  } while (0)


//! Emission of a pure signal 's'
#define EMIT(s) do {					        	\
    trace2t("EMIT:", "emits %s/%d\n", s2signame[s], s)			\
    signals |= u2b(s);						        \
  } while (0)


//! Sustain a pure signal 's'
#define SUSTAIN(s) do {							\
    _case __LABEL__: trace2t("SUSTAIN:", "emits %s/%d\n", s2signame[s], s) \
    EMIT(s); PAUSEG_(__LABEL__);					\
  } while (0)


//! Test for presence of signal 's'.
/*! IF 's' is present,
 *   THEN return 1,
 *   ELSE return 0.
 */
#define PRESENT(s)							\
  (trace3tc("PRESENT:", "determines %s/%d %s\n",			\
	   s2signame[s], s, (signals & u2b(s)) ? "present" : "absent")	\
   (signals & u2b(s)))


//! Test for presence of signal 's'.
/*! IF 's' is present,
 *   THEN proceed to next instruction,
 *   ELSE jump to 'label'
 */
#define PRESENTELSE(s, label) do {					\
    if (!(signals & u2b(s))) {						\
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
    if (signals & u2b(s)) {						\
      trace4t("PRESENTEMIT:", "determines %s/%d present, emits %s/%d\n", \
	      s2signame[s], s, s2signame[t], t)				\
      signals |= u2b(t);						\
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
    _case __LABEL__: if (!(signals & u2b(s))) {				\
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
_case __LABEL__: if (!(signals & u2b(s))) {			\
      trace2t("AWAIT:", "determines %s/%d absent, waits\n",		\
	    s2signame[s], s)						\
	__LABELL__: PAUSEG_(__LABEL__);			\
    }									\
    trace2t("AWAIT:", "determines %s/%d present, proceeds\n", s2signame[s], s) \
  } while (0)


// ===================================================================
// Handling valued signals.
// The following is compiled conditionally depending on valSigIntCnt.
// <application>.c must define valSigIntCnt if valued signals are used.

#ifdef valSigIntCnt
//! At beginning of initial tick:
//! Initialize valued signals (-1 is for "undefined").
#define _declindex static int _i;

#define _setValInit						        \
  for (_i = 0; _i < valSigIntCnt; _i++) 		                \
    valSigInt[_i] = -1;

#else     // #ifdef valSigIntCnt
#define _declindex
#define _setValInit
#endif

//! Emission of a valued signal 's', type integer.
#define EMITINT(s, val) do {						\
    valSigInt[s] = val;							\
    trace3t("EMITINT:", "emits %s/%d, value %d\n",			\
	    s2signame[s], s, val)					\
    signals |= u2b(s);						        \
  } while (0)


//! Emission of a valued signal 's', type integer, combined with * .
#define EMITINTMUL(s, val) do {					\
    valSigInt[s] *= val;						\
    trace4t("EMITINTMUL:", "emits %s/%d, value %d, result %d\n",		\
	    s2signame[s], s, val, valSigInt[s])			\
    signals |= u2b(s);						        \
  } while (0)


//! Emission of a valued signal 's', type integer, combined with + .
#define EMITINTADD(s, val) do {					\
    valSigInt[s] += val;						\
    trace4t("EMITINTADD:", "emits %s/%d, value %d, result %d\n",		\
	    s2signame[s], s, val, valSigInt[s])			\
    signals |= u2b(s);						        \
  } while (0)


//! Emission of a valued signal 's', type integer, combined with the maximum function .
#define EMITINTMAX(s, val) do {					\
    valSigInt[s] = MAX(val, valSigInt[s]);						\
    trace4t("EMITINTMAX:", "emits %s/%d, value %d, result %d\n",		\
	    s2signame[s], s, val, valSigInt[s])			\
    signals |= u2b(s);						        \
  } while (0)


//! Emission of a valued signal 's', type integer, combined with the minimum function .
#define EMITINTMIN(s, val) do {					\
    valSigInt[s] = MIN(val, valSigInt[s]);						\
    trace4t("EMITINTMIN:", "emits %s/%d, value %d, result %d\n",		\
	    s2signame[s], s, val, valSigInt[s])			\
    signals |= u2b(s);						        \
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
// The following is compiled conditionally depending on usePRE
// <application>.c must define usePRE if PRE is used

#ifdef usePRE
signalvector sigsPre;     //!< Signals from previous tick
signalvector sigsFreeze;  //!< Signals that are frozen, due to suspension

//! At beginning of initial tick:
//! Initialize previous signals.
#define _setPreInit   \
  sigsPre = 0;       \
  setPreValInit;

//! At end of tick:
//! Copy current signals (unless frozen) to previous signals.
#define setPre							        \
  sigsPre = (sigsPre & sigsFreeze) | (signals & ~sigsFreeze);		\
  setPreVal

//! When suspending current thread:
//! Add signals local to current thread or its descendants
//! to list of signals to freeze.
#define freezePre       sigsFreeze |= sigsDescs[_cid];

//! At beginning of tick:
//! Clear list of signals to freeze.
#define freezePreClear  sigsFreeze = 0;

#else     // #ifdef usePRE
#define _setPreInit
#define setPre
#define freezePre
#define freezePreClear
#endif     // #ifdef usePRE


//! Test for presence of signal in previous tick.
/*! IF 's' was present in previous tick,
 *   THEN return 1,
 *   ELSE return 0.
 */
#define PRESENTPRE(s)							\
  (trace3tc("PRESENTPRE:", "determines %s/%d %s\n",			\
	   s2signame[s], s, (sigsPre & u2b(s)) ? "present" : "absent")	\
   (sigsPre & u2b(s)))


//! Test for presence of signal in previous tick.
/*! IF 's' was present in previous tick,
 *   THEN proceed to next instruction,
 *   ELSE jump to 'label'
 */
#define PRESENTPREELSE(s, label) do {					\
    if (!(sigsPre & u2b(s))) {						\
      trace3t("PRESENTPRE:", "determines previous %s/%d absent, transfers to %s\n", \
	      s2signame[s], s, #label)					\
      _goto(label);							\
    }									\
    trace2t("PRESENTPRE:", "determines previous %s/%d present\n",	\
	    s2signame[s], s)						\
  } while (0)


// ===================================================================
// Handling valued signals in conjunction with PRE

#ifdef usePRE
#ifdef valSigIntCnt
//! At beginning of initial tick:
//! Initialize previous signal values.
#define setPreValInit					\
  for (_i = 0; _i < valSigIntCnt; _i++) 		\
    valSigIntPre[_i] = -1;

//! At end of tick:
//! Copy values of current signals (unless frozen) to previous signals.
#define setPreVal					\
  for (_i = 0; _i < valSigIntCnt; _i++) 		\
    if (!(sigsFreeze & u2b(_i)))			\
      valSigIntPre[_i] = valSigInt[_i];

#else     // #ifdef valSigIntCnt
#define setPreValInit
#define setPreVal
#endif    // #ifdef valSigIntCnt
#endif    // #ifdef usePRE


//! Retrieve previous value of signal 's'.
#define VALPRE(s) (						\
    trace3tc("VALPRE:", "determines value of %s/%d as %d\n",	\
	    s2signame[s], s, valSigIntPre[s])			\
    valSigIntPre[s])


//! Retrieve previous value of signal 's' into 'reg'.
#define VALPREREG(s, reg) do {				\
    trace3t("VALPREREG:", "determines value of %s/%d as %d\n",	\
	    s2signame[s], s, valSigIntPre[s])			\
    reg = valSigIntPre[s];					\
  } while (0)


// ===================================================================
// Control flow: jumps

//! Just a goto that also gets counted as instruction.
#define GOTO(label) do {					\
    trace1t("GOTO:", "transfer to %s\n",	#label)		\
    instrCntIncr						\
       _goto(label);						\
  } while (0)


// ===================================================================
// Support for Exit Actions

//! Test whether an Exit Action has to be performed.
/*! IF thread 'id' is active and at state 'statelabel',
 *   THEN proceed to next instruction,
 *   ELSE jump to 'label'
 */
#define ISAT(id, statelabel, label) {					\
  if (isEnabled(id) && (_pc[id] == _ref(statelabel))) {			\
    trace1t("ISAT:", "_is_ at %s\n", #statelabel)			\
  } else {								\
    trace2t("ISAT:", "is _not_ at %s, transfer to %s\n",		\
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
  _case __LABEL__: (void) 0;					\
  } while (0)


//! Return from a function call
#define RET do {							\
    trace0t("RET:", "returns\n")		                        \
      _goto(_deref(_returnAddress));					\
  } while (0)


//! Conditionally call a function.
/*! IF thread 'id' is active and at state 'statelabel',
 *   THEN call function at 'label';
 * Return to 'retlabel'
 * Use this if an Exit Action _may_ have to be performed
 * Shorthand for ISAT(id, statelabel, retlabel); CALL(label, retlabel);
 */
#define ISATCALL(id, statelabel, label) do {				\
    if (isEnabled(id) && (_pc[id] == _ref(statelabel))) {		\
      trace1t("ISATCALL:", "calls %s\n", #label)			\
      _returnAddress = _ref(__LABEL__);					\
      _goto(label);							\
    }									\
    trace1t("ISATCALL:", "does _not_ call %s\n", #label)		\
    _case __LABEL__: (void) 0;					\
  } while (0)


// ===================================================================
//! Instruction counting/Tracing

//! Increment/decrement SC instruction counter.

/*! Decrement is needed in some places to avoid duplicate counting.
 */
#ifdef instrCnt
  #define instrCntIncr tickInstrCnt++;
  #define instrCntIncrc tickInstrCnt++,
  #define instrCntDecr tickInstrCnt--;
#else
  #define instrCntIncr
  #define instrCntIncrc
  #define instrCntDecr
#endif


//! If tracing is turned on, print trace string.
#ifdef mytrace
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
#else
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
