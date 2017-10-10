/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "RisingEdge_digital.h"
void RisingEdge_reset_digital(
  outC_RisingEdge_digital *outC /* digital::RisingEdge */)
{
  outC->init = kcg_true;
}
void RisingEdge_digital(
  kcg_bool RE_Input /* digital::RisingEdge::RE_Input */,
  outC_RisingEdge_digital *outC /* digital::RisingEdge */)
{
  /* digital::RisingEdge::_L3 */
  kcg_bool _L3;
  
  if (outC->init)
    {
      _L3 = RE_Input;
    }
  else
    {
      _L3 = outC->M_pre_;
    }
  outC->RE_Output = ((kcg_true ^_L3)) & RE_Input;
  outC->M_pre_ = RE_Input;
  outC->init = kcg_false;
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** RisingEdge_digital.c
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
