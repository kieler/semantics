/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#ifndef _Simulation_simulation_H_
#define _Simulation_simulation_H_

#include "kcg_types.h"
#include "prepareDisplayData_simulation.h"
#include "tracksimulator_simulation.h"
/*   ========================  input structure  ========================   */

typedef struct {
  controllerCommands_simulation in_controllerCommands /* simulation::Simulation::in_controllerCommands */;
} inC_Simulation_simulation;
/* simulation::Simulation */
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  displayDataT_simulation displayData /* simulation::Simulation::displayData */;
  controllerFeedbackSensor_simulation out_controllerFeedbackSensor /* simulation::Simulation::out_controllerFeedbackSensor */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     -----------------  no initialisation variables  -----------------   */
  
  /*     ----------------------  no local memories  ----------------------   */
  
  /*     ---------------------  sub nodes' contexts  ---------------------   */
  
  outC_tracksimulator_simulation Context_tracksimulator /* simulation::tracksimulator */;
} outC_Simulation_simulation;
/* simulation::Simulation */
/*   =======================  state vector type  =======================   */

typedef struct {
  /*     --------------------- no memorised outputs  ---------------------   */
  
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     -----------------  no initialisation variables  -----------------   */
  
  /*     ----------------------  no local memories  ----------------------   */
  
  /*     ---------------------  sub nodes' contexts  ---------------------   */
  
  tracksimulator_SV_simulation Context_tracksimulator /* simulation::tracksimulator */;
} Simulation_SV_simulation;

/* macro for state saving and restoring */
#ifndef copy_Simulation_SV_simulation
#define copy_Simulation_SV_simulation(x, y)                                     \
  do {                                                                          \
  {                                                                             \
    copy_tracksimulator_SV_simulation ( (x).Context_tracksimulator , (y).Context_tracksimulator );\
  }                                                                             \
}                                                                               \
while(kcg_false)
#endif /* copy_Simulation_SV_simulation */
/*   ============  node initialisation and cycle functions  ============   */
extern void Simulation_reset_simulation(
  outC_Simulation_simulation *outC /* simulation::Simulation */);
extern void Simulation_simulation(
  inC_Simulation_simulation *inC /* simulation::Simulation */,
  outC_Simulation_simulation *outC /* simulation::Simulation */);
#endif /* _Simulation_simulation_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** Simulation_simulation.h
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
