/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "prepareMotormode_simulation.h"
MotormodeType_simulation prepareMotormode_simulation(
  MotormodeType_simulation motormode /* simulation::prepareMotormode::motormode */,
  speedValue_simulation speed /* simulation::prepareMotormode::speed */)
{
  /* simulation::prepareMotormode::out_motormode */
  MotormodeType_simulation out_motormode;
  /* simulation::prepareMotormode::_L6 */
  kcg_bool _L6;
  /* simulation::prepareMotormode::_L11 */
  MotormodeType_simulation _L11;
  /* simulation::prepareMotormode::_L10 */
  MotormodeType_simulation _L10;
  
  _L6 = speed > 0.0;
  if (_L6)
    {
      _L11 = M_SECONDARY_simulation;
      _L10 = M_PRIMARY_simulation;
    }
  else
    {
      _L11 = M_OFF_simulation;
      _L10 = M_OFF_simulation;
    }
  switch (motormode) {
    case M_BRAKE_simulation :
      out_motormode = M_BRAKE_simulation;
      break;
    case M_PRIMARY_simulation :
      out_motormode = _L10;
      break;
    case M_SECONDARY_simulation :
      out_motormode = _L11;
      break;
    case M_OFF_simulation :
      out_motormode = M_OFF_simulation;
      break;
    
  }
  return out_motormode;
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** prepareMotormode_simulation.c
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
