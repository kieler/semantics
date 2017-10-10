/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "countDownEvent_simulation.h"
void countDownEvent_reset_simulation(
  outC_countDownEvent_simulation *outC /* simulation::countDownEvent */)
{
  outC->init = kcg_true;
}
void countDownEvent_simulation(
  kcg_bool Reset /* simulation::countDownEvent::Reset */,
  kcg_real N /* simulation::countDownEvent::N */,
  kcg_real step /* simulation::countDownEvent::step */,
  kcg_bool Event /* simulation::countDownEvent::Event */,
  outC_countDownEvent_simulation *outC /* simulation::countDownEvent */)
{
  /* simulation::countDownEvent::_L6 */
  kcg_real _L6;
  /* simulation::countDownEvent::_L9 */
  kcg_real _L9;
  
  if (Event)
    {
      _L9 = step;
    }
  else
    {
      _L9 = 0.0;
    }
  if (outC->init)
    {
      _L6 = N;
    }
  else
    {
      _L6 = outC->M_pre_;
    }
  if (Reset)
    {
      outC->cpt = N;
    }
  else
    {
      outC->cpt = _L6;
    }
  outC->M_pre_ = outC->cpt - _L9;
  outC->init = kcg_false;
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** countDownEvent_simulation.c
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
