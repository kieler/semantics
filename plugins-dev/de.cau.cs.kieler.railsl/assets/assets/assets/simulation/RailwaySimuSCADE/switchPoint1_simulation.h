/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#ifndef _switchPoint1_simulation_H_
#define _switchPoint1_simulation_H_

#include "kcg_types.h"
#include "mergeGlobalData_simulation.h"
#include "kcg_imported_functions.h"
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  dataLocal_simulation output_straight /* simulation::switchPoint1::output_straight */;
  dataLocal_simulation output_turn /* simulation::switchPoint1::output_turn */;
  dataAll_simulation output_rear /* simulation::switchPoint1::output_rear */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  /*     ------------------------ local memories  ------------------------   */
  
  kcg_bool _L88 /* simulation::switchPoint1::_L88 */;
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} outC_switchPoint1_simulation;
/* simulation::switchPoint1 */
/*   =======================  state vector type  =======================   */

typedef struct {
  /*     --------------------- no memorised outputs  ---------------------   */
  
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  /*     ------------------------ local memories  ------------------------   */
  
  kcg_bool _L88 /* simulation::switchPoint1::_L88 */;
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} switchPoint1_SV_simulation;

/* macro for state saving and restoring */
#ifndef copy_switchPoint1_SV_simulation
#define copy_switchPoint1_SV_simulation(x, y)                                   \
  do { { (x).init = (y).init; (x)._L88 = (y)._L88; } }                          \
while(kcg_false)
#endif /* copy_switchPoint1_SV_simulation */
/*   ============  node initialisation and cycle functions  ============   */
extern void switchPoint1_reset_simulation(
  outC_switchPoint1_simulation *outC /* simulation::switchPoint1 */);
extern void switchPoint1_simulation(
  dataAll_simulation *input_straight /* simulation::switchPoint1::input_straight */,
  dataAll_simulation *input_turn /* simulation::switchPoint1::input_turn */,
  dataLocal_simulation *input_rear /* simulation::switchPoint1::input_rear */,
  kcg_int switch_nr /* simulation::switchPoint1::switch_nr */,
  outC_switchPoint1_simulation *outC /* simulation::switchPoint1 */);
#endif /* _switchPoint1_simulation_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** switchPoint1_simulation.h
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
