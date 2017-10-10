/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "contactSetting_simulation.h"
void contactSetting_reset_simulation(
  outC_contactSetting_simulation *outC /* simulation::contactSetting */)
{
  outC->init = kcg_true;
}
void contactSetting_simulation(
  positionType_simulation head_pos /* simulation::contactSetting::head_pos */,
  positionType_simulation tail_pos /* simulation::contactSetting::tail_pos */,
  positionType_simulation contact_pos /* simulation::contactSetting::contact_pos */,
  TrainDirectionType_simulation in_direction /* simulation::contactSetting::in_direction */,
  outC_contactSetting_simulation *outC /* simulation::contactSetting */)
{
  /* simulation::contactSetting::passed */
  kcg_bool passed;
  /* simulation::contactSetting::_L73 */
  kcg_bool _L73;
  /* simulation::contactSetting::SM1::SSM_SM1_dispatch_sel */
  SSM_contactSetting_SM1_ST SSM_SM1_dispatch_sel;
  /* simulation::contactSetting::SM1::SSM_SM1_Selected::SSM_SM1_tail_behind_sek::Cb_SSM_SM1_Selected_partial_SSM_SM1_dispatch_act_SSM_SM1_tail_behind_sek */
  SSM_contactSetting_SM1_ST SSM_SM1_selec_dispatch_act;
  /* simulation::contactSetting::SM1::SSM_SM1_dispatch_act */
  SSM_contactSetting_SM1_ST SSM_SM1_dispatch_act;
  /* simulation::contactSetting::direction */
  TrainDirectionType_simulation direction;
  /* simulation::contactSetting::SM1::SSM_SM1_Selected::SSM_SM1_head_ahead_prim::Cb_SSM_SM1_Selected_partial_SSM_SM1_dispatch_act_SSM_SM1_head_ahead_prim */
  SSM_contactSetting_SM1_ST _1_SSM_SM1_selec_dispatch_act;
  /* simulation::contactSetting::_L59 */
  kcg_bool _L59;
  /* simulation::contactSetting::SM1::SSM_SM1_Selected::SSM_SM1_tail_ahead__sek::Cb_SSM_SM1_Selected_partial_SSM_SM1_dispatch_act_SSM_SM1_tail_ahead__sek */
  SSM_contactSetting_SM1_ST _2_SSM_SM1_selec_dispatch_act;
  /* simulation::contactSetting::_L56 */
  kcg_bool _L56;
  /* simulation::contactSetting::_L50 */
  kcg_bool _L50;
  /* simulation::contactSetting::SM1::SSM_SM1_Selected::SSM_SM1_head_behind_prim::Cb_SSM_SM1_Selected_partial_SSM_SM1_dispatch_act_SSM_SM1_head_behind_prim */
  SSM_contactSetting_SM1_ST _3_SSM_SM1_selec_dispatch_act;
  /* simulation::contactSetting::_L49 */
  kcg_bool _L49;
  /* simulation::contactSetting::SM1::SSM_SM1_Selected::SSM_SM1_idle::Cb_SSM_SM1_Selected_partial_SSM_SM1_dispatch_act_SSM_SM1_idle */
  SSM_contactSetting_SM1_ST _4_SSM_SM1_selec_dispatch_act;
  
  _L73 = (head_pos == INIT_POSITION_simulation) & (INIT_POSITION_simulation == tail_pos);
  _L59 = tail_pos >= contact_pos;
  _L56 = (head_pos >= contact_pos) & (head_pos < MAX_TRACK_LENGTH_simulation);
  if (outC->init)
    {
      SSM_SM1_dispatch_sel = SSM_SM1_idle__simulation;
    }
  else
    {
      SSM_SM1_dispatch_sel = outC->SSM_SM1_dispatch_nxt;
    }
  _L50 = (INIT_POSITION_simulation != tail_pos) & (tail_pos <= contact_pos);
  _L49 = (head_pos <= contact_pos) & (head_pos != INIT_POSITION_simulation);
  switch (SSM_SM1_dispatch_sel) {
    case SSM_SM1_head_ahead_sek__simulation :
      passed = kcg_false;
      outC->SSM_SM1_reset_act = kcg_true;
      SSM_SM1_dispatch_act = SSM_SM1_idle__simulation;
      break;
    case SSM_SM1_head_ahead_prim__simulation :
      passed = _L56;
      if (_L56)
        {
          _1_SSM_SM1_selec_dispatch_act = SSM_SM1_head_behind_prim__simulation;
        }
      else
        {
          if (_L73)
            {
              _1_SSM_SM1_selec_dispatch_act = SSM_SM1_idle__simulation;
            }
          else
            {
              _1_SSM_SM1_selec_dispatch_act = SSM_SM1_head_ahead_prim__simulation;
            }
        }
      outC->SSM_SM1_reset_act = _L56 | _L73;
      SSM_SM1_dispatch_act = _1_SSM_SM1_selec_dispatch_act;
      break;
    case SSM_SM1_head_behind_prim__simulation :
      if (_L49)
        {
          passed = kcg_true;
          _3_SSM_SM1_selec_dispatch_act = SSM_SM1_head_ahead_sek__simulation;
        }
      else
        {
          passed = _L59;
          if (_L59)
            {
              _3_SSM_SM1_selec_dispatch_act = SSM_SM1_tail_behind_prim__simulation;
            }
          else
            {
              _3_SSM_SM1_selec_dispatch_act = SSM_SM1_head_behind_prim__simulation;
            }
        }
      outC->SSM_SM1_reset_act = _L49 | _L59;
      SSM_SM1_dispatch_act = _3_SSM_SM1_selec_dispatch_act;
      break;
    case SSM_SM1_idle__simulation :
      passed = kcg_false;
      if (_L49)
        {
          _4_SSM_SM1_selec_dispatch_act = SSM_SM1_head_ahead_prim__simulation;
        }
      else
        {
          if (_L59)
            {
              _4_SSM_SM1_selec_dispatch_act = SSM_SM1_tail_behind_sek__simulation;
            }
          else
            {
              _4_SSM_SM1_selec_dispatch_act = SSM_SM1_idle__simulation;
            }
        }
      outC->SSM_SM1_reset_act = _L49 | _L59;
      SSM_SM1_dispatch_act = _4_SSM_SM1_selec_dispatch_act;
      break;
    case SSM_SM1_tail_ahead__sek__simulation :
      if (_L59)
        {
          passed = kcg_true;
          _2_SSM_SM1_selec_dispatch_act = SSM_SM1_tail_behind_prim__simulation;
        }
      else
        {
          passed = _L49;
          if (_L49)
            {
              _2_SSM_SM1_selec_dispatch_act = SSM_SM1_head_ahead_sek__simulation;
            }
          else
            {
              _2_SSM_SM1_selec_dispatch_act = SSM_SM1_tail_ahead__sek__simulation;
            }
        }
      outC->SSM_SM1_reset_act = _L59 | _L49;
      SSM_SM1_dispatch_act = _2_SSM_SM1_selec_dispatch_act;
      break;
    case SSM_SM1_tail_behind_sek__simulation :
      passed = _L50;
      if (_L50)
        {
          SSM_SM1_selec_dispatch_act = SSM_SM1_tail_ahead__sek__simulation;
        }
      else
        {
          if (_L73)
            {
              SSM_SM1_selec_dispatch_act = SSM_SM1_idle__simulation;
            }
          else
            {
              SSM_SM1_selec_dispatch_act = SSM_SM1_tail_behind_sek__simulation;
            }
        }
      outC->SSM_SM1_reset_act = _L50 | _L73;
      SSM_SM1_dispatch_act = SSM_SM1_selec_dispatch_act;
      break;
    case SSM_SM1_tail_behind_prim__simulation :
      passed = kcg_false;
      outC->SSM_SM1_reset_act = kcg_true;
      SSM_SM1_dispatch_act = SSM_SM1_idle__simulation;
      break;
    
  }
  switch (SSM_SM1_dispatch_act) {
    case SSM_SM1_head_ahead_sek__simulation :
      outC->SSM_SM1_reset_nxt = kcg_false;
      outC->SSM_SM1_dispatch_nxt = SSM_SM1_head_ahead_sek__simulation;
      direction = in_direction;
      break;
    case SSM_SM1_head_ahead_prim__simulation :
      outC->SSM_SM1_reset_nxt = kcg_false;
      outC->SSM_SM1_dispatch_nxt = SSM_SM1_head_ahead_prim__simulation;
      direction = in_direction;
      break;
    case SSM_SM1_head_behind_prim__simulation :
      outC->SSM_SM1_reset_nxt = kcg_false;
      outC->SSM_SM1_dispatch_nxt = SSM_SM1_head_behind_prim__simulation;
      direction = in_direction;
      break;
    case SSM_SM1_idle__simulation :
      outC->SSM_SM1_reset_nxt = kcg_false;
      outC->SSM_SM1_dispatch_nxt = SSM_SM1_idle__simulation;
      direction = D_UNKNOWN_simulation;
      break;
    case SSM_SM1_tail_ahead__sek__simulation :
      outC->SSM_SM1_reset_nxt = kcg_false;
      outC->SSM_SM1_dispatch_nxt = SSM_SM1_tail_ahead__sek__simulation;
      direction = in_direction;
      break;
    case SSM_SM1_tail_behind_sek__simulation :
      outC->SSM_SM1_reset_nxt = kcg_false;
      outC->SSM_SM1_dispatch_nxt = SSM_SM1_tail_behind_sek__simulation;
      direction = in_direction;
      break;
    case SSM_SM1_tail_behind_prim__simulation :
      outC->SSM_SM1_reset_nxt = kcg_false;
      outC->SSM_SM1_dispatch_nxt = SSM_SM1_tail_behind_prim__simulation;
      direction = in_direction;
      break;
    
  }
  outC->contactSignal.Triggered = passed;
  outC->contactSignal.Direction = direction;
  outC->init = kcg_false;
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** contactSetting_simulation.c
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
