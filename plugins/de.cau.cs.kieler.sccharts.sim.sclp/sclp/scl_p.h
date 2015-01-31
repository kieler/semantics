// SCL Macros -- now called SCL_P Macros -- cbu
// rvh 30 Nov 2012
//#include "sc-generic.h"

typedef int bool;
#define false 0
#define true 1

// SCL_P Macros

// #ifndef _SC_NO_SIGNALS2VARS
// #define _signals2vars signals2vars();
// #define _vars2signals vars2signals();
// #else
#define _signals2vars
#define _vars2signals
// #endif

#define _notInitialDetect 12345678;

extern int _i;

// Begin a tick
#define tickstart(p)			\
  _declState				\
  _checkTickInit			\
  _signals2vars				\
  if (_notInitial) {			\
    _SC_ERROR_DETECT_NORESET		\
    active = enabled;	\
    dispatch_;				\
  } else {				\
    initPC(_TickEnd, _L_TICKEND);	\
    enableInit(_TickEnd);		\
    _cid = p;				\
    clearPC(_cid);			\
    enable(_cid);			\
    _setStateInit			\
    _notInitial = _notInitialDetect;	\
  }

// End a tick
#define tickreturn()			\
  mergedDispatch		        \
  _case _L_TICKEND:			\
  _vars2signals				\
  return isEnabledNotOnly(_TickEnd);

// Fork off sibling threads
#define fork1(label, p)			\
  initPC(p, label); enable(p);          

//#define fork2(label1, p1, label2, p2)	\
//  initPC(p1, label1); enable(p1);	\
//  initPC(p2, label2); enable(p2);

// #define fork2(label1, p1, label2, p2)   \
//   fork1(label1, p1);                    \
//   fork1(label2, p2);

//#define fork3(label1, p1, label2, p2)	\
//  initPC(p1, label1); enable(p1);	\
//  initPC(p2, label2); enable(p2);	\
//  initPC(p3, label3); enable(p3)

// Join sibling threads
// Note: when joining siblings, one must cover all sibling prioIDs.
// Eg, if we join just one sibling thread with a fixed priority, we must use join1;
// if that sibling has 2 possible priority, must use join2, etc.
#define join1(sib1)	\
  __LABEL__: if (isEnabled(sib1)) {	\
    PAUSEG_(__LABEL__); }

// #define join2(sib1, sib2)					\
//     trace0t("JOIN:", (isEnabledAnyOf(((u2b(sib1)) | (u2b(sib2))))) ? "waits\n" : "joins\n") \
//     __LABEL__: if (isEnabledAnyOf(((u2b(sib1)) | (u2b(sib2))))) {	\
//     PAUSEG_(__LABEL__); }                                          
// 
// #define join3(sib1, sib2, sib3)						\
//   __LABEL__: if (isEnabledAnyOf(u2b(sib1) | u2b(sib2) | u2b(sib3))) {	\
//     PAUSEG_(__LABEL__); }
// 
// #define join4(sib1, sib2, sib3, sib4)					\
//   __LABEL__: if (isEnabledAnyOf(u2b(sib1) | u2b(sib2) | u2b(sib3) | u2b(sib4))) { \
//     PAUSEG_(__LABEL__); }

// Terminate the thread leading up to "par"
#define par 								\
  TERM_;

// pause reuses PAUSE from sc
#define pause PAUSE

// The following is not tested yet:
#define prio(p)								\
  if (p != _cid) {							\
    _SC_ERROR_DETECT_PRIO(p);						\
    deactivate(_cid);							\
    disable(_cid);							\
    _cid = p;								\
    enable(_cid);							\
    setPC(_cid, __LABEL__);						\
    dispatch_;								\
  }									\
__LABEL__:								


// Append generated additional Macros here -- cbu
// Compiler searches through file. If required forkN or joinN already exists, 
// there is nothing to do. Otherwise the required macro is generated.