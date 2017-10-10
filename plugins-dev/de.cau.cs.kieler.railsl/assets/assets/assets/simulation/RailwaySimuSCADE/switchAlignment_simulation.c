/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "switchAlignment_simulation.h"
void switchAlignment_simulation(
  dataLocal_simulation *in_dataLocal /* simulation::switchAlignment::in_dataLocal */,
  kcg_bool in_switch /* simulation::switchAlignment::in_switch */,
  dataLocal_simulation *out_dataLocal /* simulation::switchAlignment::out_dataLocal */)
{
  /* simulation::switchAlignment::_L9 */
  TrainAlignmentType_simulation _L9;
  /* simulation::switchAlignment::_L14 */
  TrainAlignmentType_simulation _L14;
  /* simulation::switchAlignment::_L8 */
  dataLocal_simulation _L8;
  
  if ((*in_dataLocal).curAlignment == AL_BACKWARD_simulation)
    {
      _L14 = AL_FORWARD_simulation;
    }
  else
    {
      _L14 = AL_NONE_simulation;
    }
  if ((*in_dataLocal).curAlignment == AL_FORWARD_simulation)
    {
      _L9 = AL_BACKWARD_simulation;
    }
  else
    {
      _L9 = _L14;
    }
  _L8.enters = (*in_dataLocal).enters;
  _L8.curSpeed = (*in_dataLocal).curSpeed;
  _L8.curAlignment = _L9;
  if (in_switch)
    {
      copy_struct_7 ( out_dataLocal , &_L8 );
    }
  else
    {
      copy_struct_7 ( out_dataLocal , in_dataLocal );
    }
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** switchAlignment_simulation.c
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
