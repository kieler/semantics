/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "prepareDisplayData_simulation.h"
void prepareDisplayData_simulation(
  controllerFeedbackDebug_simulation *environment_feedback_debug /* simulation::prepareDisplayData::environment_feedback_debug */,
  controllerFeedbackSensor_simulation *environment_feedback_sensors /* simulation::prepareDisplayData::environment_feedback_sensors */,
  controllerCommands_simulation *controllerCommand /* simulation::prepareDisplayData::controllerCommand */,
  displayDataT_simulation *out_displayData /* simulation::prepareDisplayData::out_displayData */)
{
  /* simulation::prepareDisplayData::_L23 */
  motormodeArray_simulation _L23;
  
  /* 1 */
   prepareMotormodeMerge_simulation(
    &(*controllerCommand).motormodes,
    &(*controllerCommand).speeds,
    &_L23);
  copy_array_3 ( &(*out_displayData).startPosition , &(*environment_feedback_debug).positionHead );
  copy_array_3 ( &(*out_displayData).endPosition , &(*environment_feedback_debug).positionTail );
  copy_array_2 ( &(*out_displayData).motormodes , &_L23 );
  copy_array_7 ( &(*out_displayData).blockErrors , &(*environment_feedback_debug).blockErrors );
  copy_array_1 ( &(*out_displayData).points , &(*controllerCommand).points );
  copy_array_7 ( &(*out_displayData).pointErrors , &(*environment_feedback_debug).pointErrors );
  copy_array_4 ( &(*out_displayData).signals0 , &(*controllerCommand).signals0 );
  copy_array_4 ( &(*out_displayData).signals1 , &(*controllerCommand).signals1 );
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** prepareDisplayData_simulation.c
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
