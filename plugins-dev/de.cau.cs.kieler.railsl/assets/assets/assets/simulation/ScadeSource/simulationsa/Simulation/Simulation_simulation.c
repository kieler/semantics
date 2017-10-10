/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "Simulation_simulation.h"
void Simulation_reset_simulation(
  outC_Simulation_simulation *outC /* simulation::Simulation */)
{
  /* 1 */
   tracksimulator_reset_simulation(&outC->Context_tracksimulator);
}
void Simulation_simulation(
  inC_Simulation_simulation *inC /* simulation::Simulation */,
  outC_Simulation_simulation *outC /* simulation::Simulation */)
{
  /* simulation::Simulation::_L16 */
  controllerFeedbackDebug_simulation _L16;
  
  /* 1 */
   tracksimulator_simulation(
    &inC->in_controllerCommands,
    &outC->Context_tracksimulator);
  copy_struct_10 ( &outC->out_controllerFeedbackSensor , &outC->Context_tracksimulator.feedback_sensors );
  copy_struct_9 ( &_L16 , &outC->Context_tracksimulator.feedback_debug );
  /* 1 */
   prepareDisplayData_simulation(
    &_L16,
    &outC->out_controllerFeedbackSensor,
    &inC->in_controllerCommands,
    &outC->displayData);
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** Simulation_simulation.c
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
