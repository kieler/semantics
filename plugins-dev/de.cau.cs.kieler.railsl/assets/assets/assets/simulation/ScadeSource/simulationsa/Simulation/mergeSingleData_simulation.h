/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#ifndef _mergeSingleData_simulation_H_
#define _mergeSingleData_simulation_H_

#include "kcg_types.h"
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  contactPair_simulation merged_contacts /* simulation::mergeSingleData::merged_contacts */;
  positionType_simulation merged_head_pos /* simulation::mergeSingleData::merged_head_pos */;
  positionType_simulation merged_tail_pos /* simulation::mergeSingleData::merged_tail_pos */;
  errorType_simulation merged_errorBlock /* simulation::mergeSingleData::merged_errorBlock */;
  errorType_simulation merged_errorPoint /* simulation::mergeSingleData::merged_errorPoint */;
  trackExtData_simulation merged_trackExtData /* simulation::mergeSingleData::merged_trackExtData */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     -----------------  no initialisation variables  -----------------   */
  
  /*     ----------------------  no local memories  ----------------------   */
  
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} outC_mergeSingleData_simulation;
/* simulation::mergeSingleData */
/*   =============  stateless node : no state vector type  =============   */
/*   ============  node initialisation and cycle functions  ============   */
extern void mergeSingleData_simulation(
  contactPair_simulation *contacts_1 /* simulation::mergeSingleData::contacts_1 */,
  positionType_simulation head_pos_1 /* simulation::mergeSingleData::head_pos_1 */,
  positionType_simulation tail_pos_1 /* simulation::mergeSingleData::tail_pos_1 */,
  errorType_simulation errorBlock_1 /* simulation::mergeSingleData::errorBlock_1 */,
  errorType_simulation errorPoint_1 /* simulation::mergeSingleData::errorPoint_1 */,
  contactPair_simulation *contacts_2 /* simulation::mergeSingleData::contacts_2 */,
  positionType_simulation head_pos_2 /* simulation::mergeSingleData::head_pos_2 */,
  positionType_simulation tail_pos_2 /* simulation::mergeSingleData::tail_pos_2 */,
  errorType_simulation errorBlock_2 /* simulation::mergeSingleData::errorBlock_2 */,
  errorType_simulation errorPoint_2 /* simulation::mergeSingleData::errorPoint_2 */,
  trackExtData_simulation *trackExtData_1 /* simulation::mergeSingleData::trackExtData_1 */,
  trackExtData_simulation *trackExtData_2 /* simulation::mergeSingleData::trackExtData_2 */,
  contactPair_simulation *merged_contacts /* simulation::mergeSingleData::merged_contacts */,
  positionType_simulation *merged_head_pos /* simulation::mergeSingleData::merged_head_pos */,
  positionType_simulation *merged_tail_pos /* simulation::mergeSingleData::merged_tail_pos */,
  errorType_simulation *merged_errorBlock /* simulation::mergeSingleData::merged_errorBlock */,
  errorType_simulation *merged_errorPoint /* simulation::mergeSingleData::merged_errorPoint */,
  trackExtData_simulation *merged_trackExtData /* simulation::mergeSingleData::merged_trackExtData */);
#endif /* _mergeSingleData_simulation_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** mergeSingleData_simulation.h
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
