/*! \file sc.c 
 *
 * Auxiliary file for using SC macros
 *
 * See README.txt for general information.
 * See LICENSE.txt for licensing information.
 * For further information, see
 * http://www.informatik.uni-kiel.de/rtsys/sc/ .
 *
 * @author Reinhard v. Hanxleden,
 * rvh@informatik.uni-kiel.de
 */

#include <string.h>

#include "sc-generic.h"

// ===================================================================
//! Reset automaton. Should be called before first call of tick function.

void RESET()
{
  trace0t("RESET:", "reset automaton\n")
  _notInitial = 0;
}


// ===================================================================
//! Print octal representation of set into 'str'.

char *_set2str(char *str, int setmax, _setPartType *setPtr) {
  int          i;
  int          first = 1;
  _setPartType setPart;

  if (setmax < WORD_BIT) {
    sprintf(str, "0%o", (unsigned int) *setPtr);
  }
  else if (setmax < _setPartSize) {
    sprintf(str, "0%lo", (_setPartType) *setPtr);
  }
  else {
    for (i = setmax / _setPartSize; i >= 0; i--) {
      setPart = setPtr[i];
      if (first) {
	if ((setPart != 0) || (i == 0)) {
	  sprintf(str, "0%lo", setPart);
	  first = 0;
	}
      }
      else {
	sprintf(&str[strlen(str)], " %0*lo", _setPartSize/3 + 1, setPart);
      }
    } 
  } 
  
  return str;
}


// ===================================================================
//! Define _setarrayContains()

_DEF_setContains(_setarray) 

// ===================================================================
//! Print sets.

void set2names(char *prefix, char* suffix, void *setPtr, int setmax, char *names[], void (*printValFunc)(int))
{
  int i;
  int first = 1;
 
  printf("%s", prefix);
  for (i = 0; i <= setmax; i++) {
    if ((setmax < _setPartSize)
	? _setContains(*(_setPartType *) setPtr, i)
	: _setarrayContains((_setPartType *) setPtr, i)) {
      if (first) {
	first = 0;
      } else {
	printf(", ");
      }
      printf("%d/%s", i, names[i]);
      if (printValFunc) {
	printValFunc(i);
      }
    }
  }

  if (first) {
    printf("<init>");
  }
  printf("%s", suffix);
}


// ===================================================================
//! Error detection routines (see also sc.h for other in-line error checking).

#ifndef _SC_SUPPRESS_ERROR_DETECT
void _checkSIG_ID(sigtype s, sigtype max) {
  if (s < 0) {			
    _SC_ERROR1(_SC_ERROR_SIGID,	
	       "SC ERROR (Signal ID): Got signal id = %d, must be >= 0!\n",
	       s)	
      }

  if (s > max) {
    _SC_ERROR2(_SC_ERROR_SIGID,
	       "SC ERROR (Signal ID): Signal id must <= %d (= _SC_SIG_MAX), but got id = %d! You should define _SC_SIG_MAX accordingly.\n",
	       max, s)
      }
}
#endif
