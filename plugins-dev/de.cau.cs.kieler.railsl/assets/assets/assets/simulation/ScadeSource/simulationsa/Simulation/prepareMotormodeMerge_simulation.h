/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#ifndef _prepareMotormodeMerge_simulation_H_
#define _prepareMotormodeMerge_simulation_H_

#include "kcg_types.h"
#include "prepareMotormode_simulation.h"
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  motormodeArray_simulation PreparedMotormodes /* simulation::prepareMotormodeMerge::PreparedMotormodes */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     -----------------  no initialisation variables  -----------------   */
  
  /*     ----------------------  no local memories  ----------------------   */
  
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} outC_prepareMotormodeMerge_simulation;
/* simulation::prepareMotormodeMerge */
/*   =============  stateless node : no state vector type  =============   */
/*   ============  node initialisation and cycle functions  ============   */
extern void prepareMotormodeMerge_simulation(
  motormodeArray_simulation *Motormodes /* simulation::prepareMotormodeMerge::Motormodes */,
  speedArray_simulation *Speeds /* simulation::prepareMotormodeMerge::Speeds */,
  motormodeArray_simulation *PreparedMotormodes /* simulation::prepareMotormodeMerge::PreparedMotormodes */);
#endif /* _prepareMotormodeMerge_simulation_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** prepareMotormodeMerge_simulation.h
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
