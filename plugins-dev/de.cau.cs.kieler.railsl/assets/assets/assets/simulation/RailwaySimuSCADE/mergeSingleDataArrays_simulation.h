/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#ifndef _mergeSingleDataArrays_simulation_H_
#define _mergeSingleDataArrays_simulation_H_

#include "kcg_types.h"
#include "mergeSingleData_simulation.h"
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  contactArray_simulation contactsArrayMerged /* simulation::mergeSingleDataArrays::contactsArrayMerged */;
  positionArray_simulation positionArrayHeadMerged /* simulation::mergeSingleDataArrays::positionArrayHeadMerged */;
  positionArray_simulation positionArrayTailMerged /* simulation::mergeSingleDataArrays::positionArrayTailMerged */;
  errorArray_simulation errorArrayBlocksMerged /* simulation::mergeSingleDataArrays::errorArrayBlocksMerged */;
  errorArray_simulation errorArrayPointsMerged /* simulation::mergeSingleDataArrays::errorArrayPointsMerged */;
  trackExtDataArray_simulation trackExtDataArrayMerged /* simulation::mergeSingleDataArrays::trackExtDataArrayMerged */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     -----------------  no initialisation variables  -----------------   */
  
  /*     ----------------------  no local memories  ----------------------   */
  
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} outC_mergeSingleDataArrays_simulation;
/* simulation::mergeSingleDataArrays */
/*   =============  stateless node : no state vector type  =============   */
/*   ============  node initialisation and cycle functions  ============   */
extern void mergeSingleDataArrays_simulation(
  contactArray_simulation *contactArray1 /* simulation::mergeSingleDataArrays::contactArray1 */,
  positionArray_simulation *positionArrayHead1 /* simulation::mergeSingleDataArrays::positionArrayHead1 */,
  positionArray_simulation *positionArrayTail1 /* simulation::mergeSingleDataArrays::positionArrayTail1 */,
  errorArray_simulation *errorArrayBlocks1 /* simulation::mergeSingleDataArrays::errorArrayBlocks1 */,
  errorArray_simulation *errorArrayPoints1 /* simulation::mergeSingleDataArrays::errorArrayPoints1 */,
  trackExtDataArray_simulation *trackExtDataArray1 /* simulation::mergeSingleDataArrays::trackExtDataArray1 */,
  contactArray_simulation *contactArray2 /* simulation::mergeSingleDataArrays::contactArray2 */,
  positionArray_simulation *positionArrayHead2 /* simulation::mergeSingleDataArrays::positionArrayHead2 */,
  positionArray_simulation *positionArrayTail2 /* simulation::mergeSingleDataArrays::positionArrayTail2 */,
  errorArray_simulation *errorArrayBlocks2 /* simulation::mergeSingleDataArrays::errorArrayBlocks2 */,
  errorArray_simulation *errorArrayPoints2 /* simulation::mergeSingleDataArrays::errorArrayPoints2 */,
  trackExtDataArray_simulation *trackExtDataArray2 /* simulation::mergeSingleDataArrays::trackExtDataArray2 */,
  contactArray_simulation *contactsArrayMerged /* simulation::mergeSingleDataArrays::contactsArrayMerged */,
  positionArray_simulation *positionArrayHeadMerged /* simulation::mergeSingleDataArrays::positionArrayHeadMerged */,
  positionArray_simulation *positionArrayTailMerged /* simulation::mergeSingleDataArrays::positionArrayTailMerged */,
  errorArray_simulation *errorArrayBlocksMerged /* simulation::mergeSingleDataArrays::errorArrayBlocksMerged */,
  errorArray_simulation *errorArrayPointsMerged /* simulation::mergeSingleDataArrays::errorArrayPointsMerged */,
  trackExtDataArray_simulation *trackExtDataArrayMerged /* simulation::mergeSingleDataArrays::trackExtDataArrayMerged */);
#endif /* _mergeSingleDataArrays_simulation_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** mergeSingleDataArrays_simulation.h
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
