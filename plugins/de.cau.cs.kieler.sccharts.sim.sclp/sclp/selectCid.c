/*! \file selectCid.c 
 *
 * Auxiliary file for using SyncChart C macros.
 * selectCid.c is a fragment of sc.c.
 * It should be linked in by programs that do not need the main() function
 * provided by sc.c, such as PCO.
 *
 * See README.txt for general information.
 * See LICENSE.txt for licensing information.
 * For further information, see
 * http://www.informatik.uni-kiel.de/rtsys/sc/ .
 *
 * @author Reinhard v. Hanxleden,
 * rvh@informatik.uni-kiel.de
 */

#include "sc.h"

// ===================================================================
//! Computing the id of next thread to be dispatched.
/*! Uses obvious algorithm, run time linear in position of highest bit.
 * Note that there are also alternatives that run logarithmic to bit vector size.
 * See eg http://graphics.stanford.edu/~seander/bithacks.html#IntegerLog .
 * Which is actually faster depends on application.
 */
void selectCid() {
  int act;
  
  _cid = 0;
  for (act = active; act > 1; act >>= 1) //shift right
    _cid++;
}

