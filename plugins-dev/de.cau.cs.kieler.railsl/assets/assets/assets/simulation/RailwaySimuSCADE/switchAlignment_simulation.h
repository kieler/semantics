/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#ifndef _switchAlignment_simulation_H_
#define _switchAlignment_simulation_H_

#include "kcg_types.h"
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  dataLocal_simulation out_dataLocal /* simulation::switchAlignment::out_dataLocal */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     -----------------  no initialisation variables  -----------------   */
  
  /*     ----------------------  no local memories  ----------------------   */
  
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} outC_switchAlignment_simulation;
/* simulation::switchAlignment */
/*   =============  stateless node : no state vector type  =============   */
/*   ============  node initialisation and cycle functions  ============   */
extern void switchAlignment_simulation(
  dataLocal_simulation *in_dataLocal /* simulation::switchAlignment::in_dataLocal */,
  kcg_bool in_switch /* simulation::switchAlignment::in_switch */,
  dataLocal_simulation *out_dataLocal /* simulation::switchAlignment::out_dataLocal */);
#endif /* _switchAlignment_simulation_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** switchAlignment_simulation.h
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
