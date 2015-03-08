// SCL Macros
// rvh 30 Nov 2012

// Using char instead of ints may reduce memory requirements, but
// increases code size and introduces conditional jumps!
typedef int bool;
//typedef char bool;
//typedef unsigned char bool;

#define false 0
#define true 1

// SCL Macros

#ifndef _SC_NO_SIGNALS2VARS
#define _signals2vars signals2vars(); _starttimerN
#define _vars2signals _stoptimerN vars2signals();
#else
#define _signals2vars _starttimerN
#define _vars2signals _stoptimerN
#endif

#ifndef _SC_NO_SIGNALS2VARS
#define _signals2vars signals2vars(); _starttimerN
#define _vars2signals _stoptimerN vars2signals();
#define _signals2varsOnly signals2vars();
#define _vars2signalsOnly vars2signals();
#else
#define _signals2vars _starttimerN
#define _vars2signals _stoptimerN
#define _signals2varsOnly
#define _vars2signalsOnly
#endif

// Begin a tick
#define tickstart(p)			\
  _declState				\
  freezePreClear			\
  _checkTickInit			\
  _signals2varsOnly			\
  _starttimer				\
  if (_notInitial) {			\
    _SC_ERROR_DETECT_NORESET		\
    _idCopyFrom(active, enabled);	\
    initdispatch_;			\
  } else {				\
    initPC(_TickEnd, _L_TICKEND);	\
    enableInit(_TickEnd);		\
    _cid = p;				\
    clearPC(_cid);			\
    enable(_cid);			\
    _setStateInit			\
    _notInitial = _notInitialDetect;	\
  }					\
  _BEGIN_SWITCH

// End a tick
#define tickreturn()			\
  TERM_;				\
  _case _L_TICKEND:			\
  _stoptimer				\
  _vars2signalsOnly			\
  return isEnabledNotOnly_TickEnd();    \
  _END_SWITCH1		                \
  mergedDispatch	                \
  _END_SWITCH2

// Fork off sibling threads
#define fork1(label, p)			\
  initPC(p, label); enable(p);

// #define fork2(label1, p1, label2, p2)	\
//   initPC(p1, label1); enable(p1);	\
//   initPC(p2, label2); enable(p2);
// 
// #define fork3(label1, p1, label2, p2, label3, p3)	\
//   initPC(p1, label1); enable(p1);	\
//   initPC(p2, label2); enable(p2);	\
//   initPC(p3, label3); enable(p3)

// Join sibling threads
// Note: when joining siblings, one must cover all sibling prioIDs.
// Eg, if we join just one sibling thread with a fixed priority, we must use join1;
// if that sibling has 2 possible priority, must use join2, etc.
#define join1(sib1)			\
  _case __LABEL__: if (isEnabled(sib1)) {	\
    PAUSEG_(__LABEL__); }
    
//-- added by cbu    
#define join0()				

// #define join2(sib1, sib2)					\
//   _case __LABEL__: if (isEnabledAnyOf(u2b(sib1) | u2b(sib2))) {	\
//     PAUSEG_(__LABEL__); }
// 
// #define join3(sib1, sib2, sib3)						\
//   _case __LABEL__: if (isEnabledAnyOf(u2b(sib1) | u2b(sib2) | u2b(sib3))) {	\
//     PAUSEG_(__LABEL__); }
// 
// #define join4(sib1, sib2, sib3, sib4)					\
//   _case __LABEL__: if (isEnabledAnyOf(u2b(sib1) | u2b(sib2) | u2b(sib3) | u2b(sib4))) { \
//     PAUSEG_(__LABEL__); }

// Terminate the thread leading up to "par"
#define par TERM_;

// pause reuses PAUSE from sc
#define pause PAUSE

// Change priority of a thread
#define prio(p)								\
  deactivate(_cid);							\
  disable(_cid);							\
  _cid = p;								\
  enable(_cid);								\
  setPC(_cid, __LABEL__);						\
  dispatch_;								\
__LABEL__:
