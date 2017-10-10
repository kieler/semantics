/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#ifndef _switchPoint2_simulation_H_
#define _switchPoint2_simulation_H_

#include "kcg_types.h"
#include "kcg_imported_functions.h"
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  dataLocal_simulation output_front /* simulation::switchPoint2::output_front */;
  dataAll_simulation output_straight /* simulation::switchPoint2::output_straight */;
  dataAll_simulation output_turn /* simulation::switchPoint2::output_turn */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  /*     ------------------------ local memories  ------------------------   */
  
  kcg_bool _L70 /* simulation::switchPoint2::_L70 */;
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} outC_switchPoint2_simulation;
/* simulation::switchPoint2 */
/*   =======================  state vector type  =======================   */

typedef struct {
  /*     --------------------- no memorised outputs  ---------------------   */
  
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  /*     ------------------------ local memories  ------------------------   */
  
  kcg_bool _L70 /* simulation::switchPoint2::_L70 */;
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} switchPoint2_SV_simulation;

/* macro for state saving and restoring */
#ifndef copy_switchPoint2_SV_simulation
#define copy_switchPoint2_SV_simulation(x, y)                                   \
  do { { (x).init = (y).init; (x)._L70 = (y)._L70; } }                          \
while(kcg_false)
#endif /* copy_switchPoint2_SV_simulation */
/*   ============  node initialisation and cycle functions  ============   */
extern void switchPoint2_reset_simulation(
  outC_switchPoint2_simulation *outC /* simulation::switchPoint2 */);
extern void switchPoint2_simulation(
  dataAll_simulation *input_front /* simulation::switchPoint2::input_front */,
  dataLocal_simulation *input_straight /* simulation::switchPoint2::input_straight */,
  dataLocal_simulation *input_turn /* simulation::switchPoint2::input_turn */,
  kcg_int switch_nr /* simulation::switchPoint2::switch_nr */,
  outC_switchPoint2_simulation *outC /* simulation::switchPoint2 */);
#endif /* _switchPoint2_simulation_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** switchPoint2_simulation.h
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
