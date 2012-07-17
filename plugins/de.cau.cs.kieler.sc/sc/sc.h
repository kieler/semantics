/*! \file sc.h
 *
 * Header file to be included by SC applications.
 * 
 * See README.txt for general information.
 * See LICENSE.txt for licensing information.
 * For further information, see
 * http://www.informatik.uni-kiel.de/rtsys/sc/ .
 *
 * @author Reinhard v. Hanxleden,
 * rvh@informatik.uni-kiel.de
 */

/* Note: This header file makes use of the following
 * application-specific macros. If the application sets these macros,
 * it must do so _before_ including this header file.
 *
 * _SC_ID_MAX          // Highest thread id in use
 * _SC_SIG_MAX         // Highest signal id in use
 * _SC_valSigInt_SIZE  // Number of integer signals
 *
 * RUNMAX              // # of runs to execute
 * TICKMAX             // # of ticks to execute
 */

#include "sc-generic.h"


// ===================================================================
// Representing continuation labels

#ifdef _SC_SWITCHLOGIC
typedef int            labeltype;     //!< switch/case
#else
typedef void          *labeltype;     //!< Computed goto - a la gcc
#endif

// ===================================================================
// Set representations

// If application does not specify highest thread id, use word size

#ifndef _SC_ID_MAX
#define _SC_ID_MAX   (WORD_BIT - 1)
#endif

#define _idCnt       (_SC_ID_MAX + 1)             //!< Number of threads

// Determine storage requirements for sets of thread ids
#if _SC_ID_MAX < WORD_BIT               // Is one unsigned int big enough?
typedef unsigned int   idset;
#elif _SC_ID_MAX < _setPartSize          // Is one _setPartType big enough?
typedef _setPartType  idset;
#else
#define _idsetSize  ((_SC_ID_MAX / _setPartSize) + 1)
typedef _setPartType  idset[_idsetSize];
#endif

// ===================================================================
// Representing sets of signals

// If application does not specify highest signal id, use word size
#ifndef _SC_SIG_MAX
#define _SC_SIG_MAX   WORD_BIT - 1
#endif

#define _sigCnt       _SC_SIG_MAX + 1             //!< Number of signals

// Determine storage requirements for sets of thread ids
#if _SC_SIG_MAX < WORD_BIT               // Is one unsigned int big enough?
typedef unsigned int   sigset;
#elif _SC_SIG_MAX < _setPartSize          // Is one _setPartType big enough?
typedef _setPartType  sigset;
#else
#define _sigsetSize  ((_SC_ID_MAX / _setPartSize) + 1)
typedef _setPartType  sigset[_sigsetSize];
#endif

#ifdef _SC_USE_PRE
sigset sigsPre;     //!< Signals from previous tick
sigset sigsFreeze;  //!< Signals that are frozen, due to suspension
#endif

// ===================================================================
// Set operations for sets of ids

#ifdef _idsetSize
_DEF_setIsEmpty(_id)
_DEF_setClear(_id)
_DEF_setInit(_id)
_DEF_setAdd(_id)
_DEF_setDel(_id)
_DEF_setAddSet(_id)
_DEF_setDelSet(_id)
_DEF_setContains(_id)
_DEF_setNotOnlyElem0(_id)
_DEF_setIsDisjoint(_id)
_DEF_setCopyFrom(_id)

#else
#define _idIsEmpty(set)              _setIsEmpty(set)
#define _idClear(set)                _setClear(set)
#define _idInit(set, i)              _setInit(set, i)
#define _idAdd(set, i)               _setAdd(set, i)
#define _idDel(set, i)               _setDel(set, i)
#define _idAddSet(set1, set2)        _setAddSet(set1, set2)
#define _idDelSet(set1, set2)        _setDelSet(set1, set2)
#define _idContains(set, i)          _setContains(set, i)
#define _idNotOnlyElem0(set)         _setNotOnlyElem0(set)
#define _idIsDisjoint(set1, set2)    _setIsDisjoint(set1, set2)
#define _idCopyFrom(set1, set2)      _setCopyFrom(set1, set2)
#endif

#define _id2str(set)                 _set2str(_setstr, _SC_ID_MAX, (void *) &set)
#define _id2str2(set)                _set2str(_setstr2, _SC_ID_MAX, (void *) &set)

// ===================================================================
// Set operations for sets of signals

#ifdef _sigsetSize
_DEF_setIsEmpty(_sig)
_DEF_setClear(_sig)
_DEF_setInit(_sig)
_DEF_setAdd(_sig)
_DEF_setDel(_sig)
_DEF_setAddSet(_sig)
_DEF_setDelSet(_sig)
_DEF_setContains(_sig)
_DEF_setNotOnlyElem0(_sig)
_DEF_setIsDisjoint(_sig)
_DEF_setCopyFrom(_sig)

#define _sigCopyFromUnionIntersectInvert(set1, set2, set3, set4, set5) { \
    int i;								\
    for (i = _sigsetSize - 1; i>=0; i--) {				\
      set1[i] = ((set2[i] & set3[i]) | (set4[i] & ~set5[i]));	\
    }}

#else
#define _sigIsEmpty(set)              _setIsEmpty(set)
#define _sigClear(set)                _setClear(set)
#define _sigInit(set, i)              _setInit(set, i)
#define _sigAdd(set, i)               _setAdd(set, i)
#define _sigDel(set, i)               _setDel(set, i)
#define _sigAddSet(set1, set2)        _setAddSet(set1, set2)
#define _sigDelSet(set1, set2)        _setDelSet(set1, set2)
#define _sigContains(set, i)          _setContains(set, i)
#define _sigNotOnlyElem0(set)         _setNotOnlyElem0(set)
#define _sigIsDisjoint(set1, set2)    _setIsDisjoint(set1, set2)
#define _sigCopyFrom(set1, set2)      _setCopyFrom(set1, set2)
#define _sigCopyFromUnionIntersectInvert(set1, set2, set3, set4, set5)   set1 = ((set2 & set3) | (set4 & ~set5))
#endif

#define _sig2str(set)                _set2str(_setstr, _SC_SIG_MAX, (void *) &set)
#define _sig2str2(set)               _set2str(_setstr2, _SC_SIG_MAX, (void *) &set)


// Calculate size required for strings representing sets of ids or signals, as octals
/* Format for set represented by scalar: 0x...x
 * Format for set represented by array:  0x...x xxxxxxxxxxx ... xxxxxxxxxxx   (32 bit size array elements)
 * 
 * Max index of elements to be represented: max   := (_SC_ID_MAX > _SC_SIG_MAX) ? _SC_ID_MAX : _SC_SIG_MAX
 * Number of string parts:                 parts := max / _setPartSize + 1
 * Max. length of one string part:         partlength := (_setPartSize - 1) / 3 + 2
 * Resulting max. string length, incl. \n: parts * partlength + 1
 */
#define _SETSTRSIZE ((((_SC_ID_MAX > _SC_SIG_MAX) ? _SC_ID_MAX : _SC_SIG_MAX) / _setPartSize + 1) * ((_setPartSize - 1) / 3 + 2) + 1)

char _setstr[_SETSTRSIZE], _setstr2[_SETSTRSIZE];


//! Thread enabling/disabling
#define enable(id) 				\
  _idAdd(enabled, id);				\
  _idAdd(active, id)

#define enableInit(id) 				\
  _idInit(enabled, id);				\
  _idCopyFrom(active, enabled);

#define disable(id)             _idDel(enabled, id)
#define disableSet(idset)       _idDelSet(enabled, idset)
#define isEnabled(id)           _idContains(enabled, id)
#define isEnabledNoneOf(idset)  _idIsDisjoint(enabled, idset)
#define isEnabledAnyOf(idset)   (!_idIsDisjoint(enabled, idset))

//! Thread (de-)activation
#define activate(id)            _idAdd(active, id)
#define deactivate(id)          _idDel(active, id)
#define deactivateSet(idset)    _idDelSet(active , idset)
#define isActive(id)            _idContains(active, id)


// ===================================================================
// Global variables

sigset       signals;                //!< Bit mask for signals
idset        enabled;                //!< Bit mask for enabled threads
idset        active;                 //!< Bit mask for active threads

labeltype    _pc[_idCnt];            //!< Pseudo program counters
idset        _descs[_idCnt];         //!< Descendants of thread
idset        _tmpidset;              //!< Some set of ids
idtype       _parent[_idCnt];        //!< Parent of thread
labeltype    _returnAddress;         //!< For function calls (eg Exit Actions)

char    *statePrev[_idCnt];          //!< State where thread resumed previous tick
char    *state[_idCnt];              //!< State where thread resumed current tick

const int     _idMax         = _SC_ID_MAX;				
const int     _sigMax        = _SC_SIG_MAX;
	
_setPartType *enabledPtr     = (_setPartType *) &enabled;		
_setPartType *signalsPtr     = (_setPartType *) &signals;		
sigset        tickInputs;						
_setPartType* tickInputsPtr  = (_setPartType *) &tickInputs;		
sigset        tickOutputs;						
_setPartType* tickOutputsPtr = (_setPartType *) &tickOutputs;		
sigset        tickSignals;						
_setPartType* tickSignalsPtr = (_setPartType *) &tickSignals;

#ifndef _SC_SUPPRESS_ERROR_DETECT
sigset       _presence_tested;       //!< Signals that have been checked for presence in current tick
#endif

#ifdef RUNMAX
const int     _runMax        = RUNMAX;				
#endif

#ifdef TICKMAX
const int     _tickMax       = TICKMAX;				
#endif


#ifdef _SC_SUPPRESS_ERROR_DETECT
# define _SC_ERROR_DETECT_NONE_ACTIVE
#else
# ifdef _idsetSize
#  define _SC_ERROR_DETECT_NONE_ACTIVE					\
  if (_i < 0) {								\
    _SC_ERROR0(_SC_ERROR_NONE_ACTIVE,					\
	       "SC ERROR (None Active): No active thread!\n");		\
  }
# else
#  define _SC_ERROR_DETECT_NONE_ACTIVE					\
  if (active == 0) {							\
    _SC_ERROR0(_SC_ERROR_NONE_ACTIVE,					\
	       "SC ERROR (None Active): No active thread!\n");		\
  };
# endif
#endif

# if _SC_ID_MAX < WORD_BIT          // Is one _setPartType big enough?
unsigned int _setPart;
# else
_setPartType _setPart;
# endif

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
# if (((_SC_ID_MAX < WORD_BIT) && (WORD_BIT == 32)) ||	\
     ((_SC_ID_MAX < _setPartSize) && (_setPartSize == 32)))
#  define _BitScanReverse(set, bit)		\
  __asm volatile("bsrl %1,%0\n"			\
		 : "=r" (bit)			\
		 : "r" (set)			\
		 )
# elif   (((_SC_ID_MAX < WORD_BIT) && (WORD_BIT == 64)) ||	\
	 (_setPartSize == 64))
unsigned long _longBit;
#  define _BitScanReverse(set, bit)			\
  __asm volatile("bsrq %1,%0\n"				\
		 : "=r" (_longBit)			\
		 : "r" (set)				\
		 );					\
  bit = _longBit

# endif
#else
# define _BitScanReverse(set, bit)				      \
  bit = 0;							      \
  for (_setPart = set; _setPart > 1; _setPart >>= 1) {		      \
    bit++;							      \
  }
#endif

#if _SC_ID_MAX < _setPartSize          // Is one _setPartType big enough?
# define selectCid()   _SC_ERROR_DETECT_NONE_ACTIVE \
  _BitScanReverse(active, _cid)
#else
# define selectCid() {				\
    for (_i = _idsetSize - 1; ; _i--) {		\
      _SC_ERROR_DETECT_NONE_ACTIVE		\
	_setPart = active[_i];			\
      if (_setPart) {				\
	_BitScanReverse(_setPart, _cid);	\
	break;					\
      }}					\
    _cid += _i * _setPartSize;			\
  }
#endif

