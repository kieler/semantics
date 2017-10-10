/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "limiterWithDefault_simulation.h"
kcg_real limiterWithDefault_simulation(
  kcg_real input /* simulation::limiterWithDefault::input */,
  kcg_real highLimit /* simulation::limiterWithDefault::highLimit */,
  kcg_real lowLimit /* simulation::limiterWithDefault::lowLimit */,
  kcg_real defaultVal /* simulation::limiterWithDefault::defaultVal */)
{
  /* simulation::limiterWithDefault::output */
  kcg_real output;
  /* simulation::limiterWithDefault::_L9 */
  kcg_real _L9;
  
  if (input < lowLimit)
    {
      _L9 = defaultVal;
    }
  else
    {
      _L9 = input;
    }
  if (input > highLimit)
    {
      output = defaultVal;
    }
  else
    {
      output = _L9;
    }
  return output;
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** limiterWithDefault_simulation.c
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
