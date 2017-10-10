/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#ifndef _switchPointCross_simulation_H_
#define _switchPointCross_simulation_H_

#include "kcg_types.h"
#include "mergeGlobalData_simulation.h"
#include "kcg_imported_functions.h"
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  dataLocal_simulation output_straight_rear /* simulation::switchPointCross::output_straight_rear */;
  dataLocal_simulation output_turn_rear /* simulation::switchPointCross::output_turn_rear */;
  dataAll_simulation output_straight_front /* simulation::switchPointCross::output_straight_front */;
  dataAll_simulation output_turn_front /* simulation::switchPointCross::output_turn_front */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  /*     ------------------------ local memories  ------------------------   */
  
  kcg_bool _L404 /* simulation::switchPointCross::_L404 */;
  kcg_bool _L414 /* simulation::switchPointCross::_L414 */;
  kcg_bool _L249 /* simulation::switchPointCross::_L249 */;
  kcg_bool _L251 /* simulation::switchPointCross::_L251 */;
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} outC_switchPointCross_simulation;
/* simulation::switchPointCross */
/*   =======================  state vector type  =======================   */

typedef struct {
  /*     --------------------- no memorised outputs  ---------------------   */
  
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  /*     ------------------------ local memories  ------------------------   */
  
  kcg_bool _L404 /* simulation::switchPointCross::_L404 */;
  kcg_bool _L414 /* simulation::switchPointCross::_L414 */;
  kcg_bool _L249 /* simulation::switchPointCross::_L249 */;
  kcg_bool _L251 /* simulation::switchPointCross::_L251 */;
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} switchPointCross_SV_simulation;

/* macro for state saving and restoring */
#ifndef copy_switchPointCross_SV_simulation
#define copy_switchPointCross_SV_simulation(x, y)                               \
  do {                                                                          \
  {                                                                             \
    (x).init = (y).init;                                                        \
    (x)._L404 = (y)._L404;                                                      \
    (x)._L414 = (y)._L414;                                                      \
    (x)._L249 = (y)._L249;                                                      \
    (x)._L251 = (y)._L251;                                                      \
  }                                                                             \
}                                                                               \
while(kcg_false)
#endif /* copy_switchPointCross_SV_simulation */
/*   ============  node initialisation and cycle functions  ============   */
extern void switchPointCross_reset_simulation(
  outC_switchPointCross_simulation *outC /* simulation::switchPointCross */);
extern void switchPointCross_simulation(
  dataAll_simulation *input_straight_front /* simulation::switchPointCross::input_straight_front */,
  dataAll_simulation *input_turn_front /* simulation::switchPointCross::input_turn_front */,
  dataLocal_simulation *input_straight_rear /* simulation::switchPointCross::input_straight_rear */,
  dataLocal_simulation *input_turn_rear /* simulation::switchPointCross::input_turn_rear */,
  kcg_int switch_nr1 /* simulation::switchPointCross::switch_nr1 */,
  kcg_int switch_nr2 /* simulation::switchPointCross::switch_nr2 */,
  kcg_int belongs_to_track /* simulation::switchPointCross::belongs_to_track */,
  outC_switchPointCross_simulation *outC /* simulation::switchPointCross */);
#endif /* _switchPointCross_simulation_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** switchPointCross_simulation.h
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
