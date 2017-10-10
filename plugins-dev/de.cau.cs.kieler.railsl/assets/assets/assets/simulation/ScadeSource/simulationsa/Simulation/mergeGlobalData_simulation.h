/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#ifndef _mergeGlobalData_simulation_H_
#define _mergeGlobalData_simulation_H_

#include "kcg_types.h"
#include "mergeSingleDataArrays_simulation.h"
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  dataGlobal_simulation outputData /* simulation::mergeGlobalData::outputData */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     -----------------  no initialisation variables  -----------------   */
  
  /*     ----------------------  no local memories  ----------------------   */
  
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} outC_mergeGlobalData_simulation;
/* simulation::mergeGlobalData */
/*   =============  stateless node : no state vector type  =============   */
/*   ============  node initialisation and cycle functions  ============   */
extern void mergeGlobalData_simulation(
  dataGlobal_simulation *globalData1 /* simulation::mergeGlobalData::globalData1 */,
  dataGlobal_simulation *globalData2 /* simulation::mergeGlobalData::globalData2 */,
  dataGlobal_simulation *outputData /* simulation::mergeGlobalData::outputData */);
#endif /* _mergeGlobalData_simulation_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** mergeGlobalData_simulation.h
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
