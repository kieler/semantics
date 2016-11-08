// SCL Macros
// rvh 30 Nov 2012

// Time measurements
#ifdef _SC_NOTRACE             // Tracing off -> Timing off
#define _SC_NOTIMER
#endif

#ifdef _SC_NOTIMER             // Timing off
#define _starttimer
#define _starttimer1
#define _stoptimer
#define _stoptimer1

#else                          // Timing on
#include <sys/time.h>
#include "cycle.h"
ticks t0, t1;
int _i;
#ifdef _SC_SSA
static const int _iterMax = 1e6;
#else
static const int _iterMax = 1;
#endif
double _t, _tSum, _tMax, _tMin, _usecs;
struct timeval _tp1, _tp2;

#define _starttimer gettimeofday(&_tp1, NULL);	\
  _tSum = _tMax = _tMin = 0;			\
  for (_i = 0; _i < _iterMax; _i++) {		\
  t0 = getticks();

#define _starttimer1	\
  t0 = getticks();

#define _stoptimer  t1 = getticks();					\
  _t = elapsed(t1, t0);							\
  _tSum += _t;								\
  if ((_tMin == 0) || (_t < _tMin)) _tMin = _t;				\
  if ((_tMax == 0) || (_t > _tMax)) _tMax = _t;				\
  };									\
  gettimeofday(&_tp2, NULL);						\
  _usecs = (_tp2.tv_sec - _tp1.tv_sec) * 1e6 +  (_tp2.tv_usec - _tp1.tv_usec); \
  printf("Wall-clock time: %.0f usecs for %d iterations, %f usecs per iteration\n",	\
	 _usecs, _iterMax, _usecs / _iterMax);				\
  printf("Clock cycles per tick: Avg = %.2f, Min = %.0f, Max = %.0f\n",			\
	 _tSum/_iterMax, _tMin, _tMax);

#define _stoptimer1  t1 = getticks();					\
  _t = elapsed(t1, t0);							\
  gettimeofday(&_tp2, NULL);						\
  _usecs = (_tp2.tv_sec - _tp1.tv_sec) * 1e6 +  (_tp2.tv_usec - _tp1.tv_usec); \
  printf("Wall-clock time: %.0f usecs \n",				\
	 _usecs);							\
  printf("Clock cycles per tick: %.0f\n",				\
	 _t);
#endif

// Using char instead of ints may reduce memory requirements, but
// increases code size and introduces conditional jumps!
typedef int bool;
//typedef char bool;
//typedef unsigned char bool;

#define false 0
#define true 1

// SCL Macros

#ifndef _SC_NO_SIGNALS2VARS
#define _signals2vars signals2vars(); _starttimer
#define _vars2signals _stoptimer vars2signals();
#else
#define _signals2vars _starttimer
#define _vars2signals _stoptimer
#endif

#ifndef _SC_NO_SIGNALS2VARS
#define _signals2vars signals2vars(); _starttimer
#define _vars2signals _stoptimer vars2signals();
#define _signals2varsOnly signals2vars();
#define _vars2signalsOnly vars2signals();
#else
#define _signals2vars _starttimer
#define _vars2signals _stoptimer
#define _signals2varsOnly
#define _vars2signalsOnly
#endif

// Begin a tick
#define tickstart(p)			\
  _declState				\
  freezePreClear			\
  _checkTickInit			\
  _signals2varsOnly			\
  _starttimer1				\
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
  _stoptimer1				\
  _vars2signalsOnly			\
  return isEnabledNotOnly_TickEnd();    \
  _END_SWITCH1		                \
  mergedDispatch	                \
  _END_SWITCH2

// Fork off sibling threads
#define fork1(label, p)			\
  initPC(p, label); enable(p);

#define fork2(label1, p1, label2, p2)	\
  initPC(p1, label1); enable(p1);	\
  initPC(p2, label2); enable(p2);

#define fork3(label1, p1, label2, p2, label3, p3)	\
  initPC(p1, label1); enable(p1);	\
  initPC(p2, label2); enable(p2);	\
  initPC(p3, label3); enable(p3);

// Join sibling threads
// Note: when joining siblings, one must cover all sibling prioIDs.
// Eg, if we join just one sibling thread with a fixed priority, we must use join1;
// if that sibling has 2 possible priority, must use join2, etc.
#define join1(sib1)			\
  _case __LABEL__: if (isEnabled(sib1)) {	\
    PAUSEG_(__LABEL__); }

#define join2(sib1, sib2)					\
  _case __LABEL__: if (isEnabledAnyOf(u2b(sib1) | u2b(sib2))) {	\
    PAUSEG_(__LABEL__); }

#define join3(sib1, sib2, sib3)						\
  _case __LABEL__: if (isEnabledAnyOf(u2b(sib1) | u2b(sib2) | u2b(sib3))) {	\
    PAUSEG_(__LABEL__); }

#define join4(sib1, sib2, sib3, sib4)					\
  _case __LABEL__: if (isEnabledAnyOf(u2b(sib1) | u2b(sib2) | u2b(sib3) | u2b(sib4))) { \
    PAUSEG_(__LABEL__); }

// Terminate the thread leading up to "par"
#define par TERM_;

// pause reuses PAUSE from sc
#define pause PAUSE

// The following is not tested yet:
#define prio(p)								\
  deactivate(_cid);							\
  disable(_cid);							\
  _cid = p;								\
  enable(_cid);								\
  setPC(_cid, __LABEL__);						\
  dispatch_;								\
__LABEL__:
