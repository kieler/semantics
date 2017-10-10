/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#ifndef _prepareDisplayData_simulation_H_
#define _prepareDisplayData_simulation_H_

#include "kcg_types.h"
#include "prepareMotormodeMerge_simulation.h"
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  displayDataT_simulation out_displayData /* simulation::prepareDisplayData::out_displayData */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     -----------------  no initialisation variables  -----------------   */
  
  /*     ----------------------  no local memories  ----------------------   */
  
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} outC_prepareDisplayData_simulation;
/* simulation::prepareDisplayData */
/*   =============  stateless node : no state vector type  =============   */
/*   ============  node initialisation and cycle functions  ============   */
extern void prepareDisplayData_simulation(
  controllerFeedbackDebug_simulation *environment_feedback_debug /* simulation::prepareDisplayData::environment_feedback_debug */,
  controllerFeedbackSensor_simulation *environment_feedback_sensors /* simulation::prepareDisplayData::environment_feedback_sensors */,
  controllerCommands_simulation *controllerCommand /* simulation::prepareDisplayData::controllerCommand */,
  displayDataT_simulation *out_displayData /* simulation::prepareDisplayData::out_displayData */);
#endif /* _prepareDisplayData_simulation_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** prepareDisplayData_simulation.h
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
