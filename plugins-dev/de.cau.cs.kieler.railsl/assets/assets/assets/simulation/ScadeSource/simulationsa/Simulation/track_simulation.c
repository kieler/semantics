/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "track_simulation.h"
void track_reset_simulation(outC_track_simulation *outC /* simulation::track */)
{
  outC->_1_init = kcg_true;
  outC->init = kcg_true;
  /* 1 */
   countDownEvent_reset_simulation(&outC->Context_countDownEvent);
  contactSetting_reset_simulation(&outC->_1_Context_contactSetting);
  /* 1 */
   contactSetting_reset_simulation(&outC->Context_contactSetting);
  /* 1 */
   RisingEdge_reset_digital(&outC->_3_Context_RisingEdge);
  /* 2 */
   RisingEdge_reset_digital(&outC->_2_Context_RisingEdge);
  /* 3 */
   RisingEdge_reset_digital(&outC->_1_Context_RisingEdge);
  /* 4 */
   RisingEdge_reset_digital(&outC->Context_RisingEdge);
}
void track_simulation(
  dataAll_simulation *input_front /* simulation::track::input_front */,
  dataLocal_simulation *input_rear /* simulation::track::input_rear */,
  kcg_int track_nr /* simulation::track::track_nr */,
  outC_track_simulation *outC /* simulation::track */)
{
  
  TrainAlignmentType_simulation tmp;
  /* simulation::track::_L409 */
  kcg_bool _L409;
  /* simulation::track::SM2::track_occupied::SM3::SSM_SM3_dispatch_sel */
  SSM_track_occupied_SM3_ST SSM_SM3_dispatch_sel;
  /* simulation::track::s_E_TRACK_OCCUPIED */
  kcg_bool s_E_TRACK_OCCUPIED;
  /* simulation::track::initial_train */
  kcg_bool initial_train;
  /* simulation::track::track_got_empty */
  kcg_bool track_got_empty;
  /* simulation::track::SM2::track_occupied::SM3::SSM_SM3_dispatch_act */
  SSM_track_occupied_SM3_ST SSM_SM3_dispatch_act;
  /* simulation::track::_L230 */
  kcg_real _L230;
  /* simulation::track::_L229 */
  kcg_real _L229;
  /* simulation::track::_L399 */
  positionType_simulation _L399;
  /* simulation::track::_L398 */
  positionType_simulation _L398;
  /* simulation::track::_L226 */
  ReedContactValue_simulation _L226;
  /* simulation::track::_L225 */
  ReedContactValue_simulation _L225;
  /* simulation::track::SM4::SSM_SM4_dispatch_sel */
  SSM_track_SM4_ST SSM_SM4_dispatch_sel;
  /* simulation::track::_L391 */
  TrainAlignmentType_simulation _L391;
  /* simulation::track::SM2::track_occupied::strong 14::::SSM_SM2_guard_ */
  kcg_bool SSM_SM2_guard;
  /* simulation::track::SM2::track_empty::strong 13::::SSM_SM2_guard_ */
  kcg_bool _1_SSM_SM2_guard;
  /* simulation::track::_L382 */
  kcg_bool _L382;
  /* simulation::track::_L192 */
  kcg_bool _L192;
  /* simulation::track::_L380 */
  kcg_real _L380;
  /* simulation::track::_L191 */
  kcg_bool _L191;
  /* simulation::track::_L379 */
  kcg_real _L379;
  /* simulation::track::_L190 */
  kcg_bool _L190;
  /* simulation::track::_L189 */
  kcg_bool _L189;
  /* simulation::track::SM2::SSM_SM2_dispatch_sel */
  SSM_track_SM2_ST SSM_SM2_dispatch_sel;
  /* simulation::track::_L375 */
  trackExtDataArray_simulation _L375;
  /* simulation::track::SM2::SSM_SM2_dispatch_act */
  SSM_track_SM2_ST SSM_SM2_dispatch_act;
  /* simulation::track::_L372 */
  kcg_bool _L372;
  /* simulation::track::_L131 */
  kcg_real _L131;
  /* simulation::track::_L366 */
  kcg_real _L366;
  /* simulation::track::_L360 */
  trackExtData_simulation _L360;
  /* simulation::track::_L104 */
  contactPair_simulation _L104;
  /* simulation::track::_L91 */
  speedValue_simulation _L91;
  /* simulation::track::_L75 */
  positionArray_simulation _L75;
  /* simulation::track::_L74 */
  positionArray_simulation _L74;
  /* simulation::track::SM3::SSM_SM3_Selected::SSM_SM3_eh_occupied::Cb_SSM_SM3_Selected_partial_SSM_SM3_dispatch_act_SSM_SM3_eh_occupied */
  SSM_track_SM3_ST SSM_SM3_selec_dispatch_act;
  /* simulation::track::_L342 */
  errorType_simulation _L342;
  /* simulation::track::_L50 */
  speedValue_simulation _L50;
  /* simulation::track::_L49 */
  MotormodeType_simulation _L49;
  /* simulation::track::_L340 */
  errorType_simulation _L340;
  /* simulation::track::SM3::SSM_SM3_Selected::SSM_SM3_eh_track_empty::Cb_SSM_SM3_Selected_partial_SSM_SM3_dispatch_act_SSM_SM3_eh_track_empty */
  SSM_track_SM3_ST _1_SSM_SM3_selec_dispatch_act;
  /* simulation::track::_L338 */
  kcg_bool _L338;
  /* simulation::track::_L337 */
  kcg_bool _L337;
  /* simulation::track::_L29 */
  contactArray_simulation _L29;
  /* simulation::track::_L23 */
  controllerFeedback_simulation _L23;
  /* simulation::track::SM2::SSM_SM2_Active::SSM_SM2_track_occupied::Cb_SSM_SM2_Active_partial_position_head_SSM_SM2_track_occupied */
  positionType_simulation SSM_SM2_activ_position_head;
  /* simulation::track::_L12 */
  controllerCommands_simulation _L12;
  /* simulation::track::_L11 */
  dataGlobal_simulation _L11;
  /* simulation::track::_L10 */
  dataLocal_simulation _L10;
  /* simulation::track::SM3::eh_occupied::strong 18::::SSM_SM3_guard_ */
  kcg_bool SSM_SM3_guard;
  /* simulation::track::SM3::eh_occupied::strong 19::::SSM_SM3_guard_ */
  kcg_bool _1_SSM_SM3_guard;
  /* simulation::track::SM3::eh_track_empty::strong 17::::SSM_SM3_guard_ */
  kcg_bool _2_SSM_SM3_guard;
  /* simulation::track::_L312 */
  speedValue_simulation _L312;
  /* simulation::track::_L308 */
  speedValue_simulation _L308;
  /* simulation::track::_L295 */
  kcg_bool _L295;
  /* simulation::track::SM3::SSM_SM3_dispatch_sel */
  SSM_track_SM3_ST _1_SSM_SM3_dispatch_sel;
  /* simulation::track::SM3::SSM_SM3_dispatch_act */
  SSM_track_SM3_ST _1_SSM_SM3_dispatch_act;
  /* simulation::track::_L292 */
  kcg_bool _L292;
  /* simulation::track::position_head */
  positionType_simulation position_head;
  /* simulation::track::SM2::track_occupied::SM3::SSM_SM3_Selected::SSM_SM3_enters::Cb_SSM_SM3_Selected_partial_SSM_SM3_dispatch_act_SSM_SM3_enters */
  SSM_track_occupied_SM3_ST _2_SSM_SM3_selec_dispatch_act;
  /* simulation::track::_L278 */
  kcg_bool _L278;
  /* simulation::track::_L275 */
  kcg_bool _L275;
  /* simulation::track::_L274 */
  kcg_bool _L274;
  /* simulation::track::_L429 */
  TrainDirectionType_simulation _L429;
  /* simulation::track::_L270 */
  errorType_simulation _L270;
  /* simulation::track::_L426 */
  TrainDirectionType_simulation _L426;
  /* simulation::track::_L257 */
  errorType_simulation _L257;
  /* simulation::track::SM2::SSM_SM2_Selected::SSM_SM2_track_occupied::Cb_SSM_SM2_Selected_partial_SSM_SM2_dispatch_act_SSM_SM2_track_occupied */
  SSM_track_SM2_ST SSM_SM2_selec_dispatch_act;
  /* simulation::track::SM2::track_occupied::SM3::enters::strong 16::::SSM_SM3_guard_ */
  kcg_bool _3_SSM_SM3_guard;
  /* simulation::track::_L249 */
  errorArray_simulation _L249;
  /* simulation::track::_L420 */
  kcg_bool _L420;
  /* simulation::track::SM2::track_occupied::_L13 */
  kcg_real _L13;
  /* simulation::track::SM2::SSM_SM2_Selected::SSM_SM2_track_empty::Cb_SSM_SM2_Selected_partial_SSM_SM2_dispatch_act_SSM_SM2_track_empty */
  SSM_track_SM2_ST _1_SSM_SM2_selec_dispatch_act;
  /* simulation::track::_L410 */
  TrainAlignmentType_simulation _L410;
  
  if (outC->init)
    {
      _L429 = D_UNKNOWN_simulation;
      _L410 = AL_NONE_simulation;
    }
  else
    {
      _L429 = outC->_L425;
      _L410 = outC->_L393;
    }
  _L409 = ((*input_front).d_local.enters) | ((*input_rear).enters);
  if ((*input_front).d_local.enters)
    {
      _L391 = (*input_front).d_local.curAlignment;
    }
  else
    {
      _L391 = (*input_rear).curAlignment;
    }
  if (outC->init)
    {
      SSM_SM4_dispatch_sel = SSM_SM4_startup__simulation;
    }
  else
    {
      SSM_SM4_dispatch_sel = outC->SSM_SM4_dispatch_nxt;
    }
  _L372 = ((kcg_true ^outC->init)) & (outC->_2_M_pre_);
  /* 1 */
   countDownEvent_simulation(
    _L372,
    UPDATENEWSPEED_simulation,
    TIME_CYCLE_simulation,
    kcg_true,
    &outC->Context_countDownEvent);
  _L366 = outC->Context_countDownEvent.cpt;
  _L338 = ((kcg_true ^outC->init)) & (outC->_L341);
  _L337 = ((kcg_true ^outC->init)) & (outC->_L339);
  if ((*input_rear).enters)
    {
      _L312 = (*input_rear).curSpeed;
    }
  else
    {
      _L312 = INIT_SPEED_simulation;
    }
  if ((*input_front).d_local.enters)
    {
      _L308 = (*input_front).d_local.curSpeed;
    }
  else
    {
      _L308 = _L312;
    }
  _L295 = ((kcg_true ^outC->init)) & (outC->_L294);
  _L292 = ((kcg_true ^outC->init)) & (outC->_L293);
  _L275 = ((kcg_true ^outC->init)) & (outC->_1_M_pre_);
  _L274 = ((kcg_true ^outC->init)) & (outC->M_pre_);
  if (outC->init)
    {
      _1_SSM_SM3_dispatch_sel = SSM_SM3_eh_track_empty__simulation;
      SSM_SM2_dispatch_sel = SSM_SM2_track_empty__simulation;
    }
  else
    {
      _1_SSM_SM3_dispatch_sel = outC->SSM_SM3_dispatch_nxt;
      SSM_SM2_dispatch_sel = outC->SSM_SM2_dispatch_nxt;
    }
  if ((track_nr >= 0) & (track_nr < 48))
    {
      _L50 = (*input_front).d_global.commands.speeds[track_nr];
      _L49 = (*input_front).d_global.commands.motormodes[track_nr];
    }
  else
    {
      _L50 = INIT_SPEED_simulation;
      _L49 = INIT_MOTORMODE_simulation;
    }
  copy_array_1 ( &_L12.points , &(*input_front).d_global.commands.points );
  copy_array_2 ( &_L12.motormodes , &(*input_front).d_global.commands.motormodes );
  copy_array_3 ( &_L12.speeds , &(*input_front).d_global.commands.speeds );
  copy_array_4 ( &_L12.signals0 , &(*input_front).d_global.commands.signals0 );
  copy_array_4 ( &_L12.signals1 , &(*input_front).d_global.commands.signals1 );
  copy_array_5 ( &_L12.inittrains , &(*input_front).d_global.commands.inittrains );
  switch (SSM_SM4_dispatch_sel) {
    case SSM_SM4_startup__simulation :
      if ((track_nr >= 0) & (track_nr < 48))
        {
          tmp = (*input_front).d_global.commands.inittrains[track_nr];
        }
      else
        {
          tmp = AL_NONE_simulation;
        }
      initial_train = (kcg_true ^(tmp == AL_NONE_simulation));
      break;
    case SSM_SM4_running__simulation :
      initial_train = kcg_false;
      break;
    
  }
  if (_L49 == M_SECONDARY_simulation)
    {
      _L426 = D_SECONDARY_simulation;
    }
  else
    {
      _L426 = _L429;
    }
  _L420 = M_PRIMARY_simulation == _L49;
  if (_L409)
    {
      tmp = _L391;
    }
  else
    {
      tmp = _L410;
    }
  if (initial_train)
    {
      if ((track_nr >= 0) & (track_nr < 48))
        {
          outC->_L393 = (*input_front).d_global.commands.inittrains[track_nr];
        }
      else
        {
          outC->_L393 = AL_NONE_simulation;
        }
    }
  else
    {
      outC->_L393 = tmp;
    }
  switch (SSM_SM4_dispatch_sel) {
    case SSM_SM4_startup__simulation :
      outC->SSM_SM4_reset_nxt = kcg_true;
      outC->SSM_SM4_dispatch_nxt = SSM_SM4_running__simulation;
      break;
    case SSM_SM4_running__simulation :
      outC->SSM_SM4_reset_nxt = kcg_false;
      outC->SSM_SM4_dispatch_nxt = SSM_SM4_running__simulation;
      break;
    
  }
  _L382 = outC->_L393 == AL_BACKWARD_simulation;
  outC->_L341 = _L338 | (_L409 & (_L50 != _L308));
  outC->_L339 = _L337 | (((((*input_rear).enters) & _L420) | (((kcg_true ^_L420)) & ((*input_front).d_local.enters))) | ((M_BRAKE_simulation == _L49) & _L409));
  outC->_L293 = _L292 | (((*input_front).d_local.enters) & ((*input_rear).enters));
  _L278 = _L49 == M_PRIMARY_simulation;
  switch (_1_SSM_SM3_dispatch_sel) {
    case SSM_SM3_eh_track_empty__simulation :
      _2_SSM_SM3_guard = (((*input_front).d_local.enters) | ((*input_rear).enters)) | initial_train;
      outC->SSM_SM3_reset_act = _2_SSM_SM3_guard;
      break;
    case SSM_SM3_eh_occupied__simulation :
      _1_SSM_SM3_guard = _L275 | _L274;
      SSM_SM3_guard = ((*input_front).d_local.enters) | ((*input_rear).enters);
      outC->SSM_SM3_reset_act = SSM_SM3_guard | _1_SSM_SM3_guard;
      break;
    
  }
  switch (SSM_SM2_dispatch_sel) {
    case SSM_SM2_track_empty__simulation :
      _1_SSM_SM2_guard = (((*input_rear).enters) | ((*input_front).d_local.enters)) | initial_train;
      outC->SSM_SM2_reset_act = _1_SSM_SM2_guard;
      break;
    case SSM_SM2_track_occupied__simulation :
      SSM_SM2_guard = _L274 | _L275;
      outC->SSM_SM2_reset_act = SSM_SM2_guard;
      break;
    
  }
  switch (_L49) {
    case M_PRIMARY_simulation :
      _L91 = _L50;
      break;
    case M_SECONDARY_simulation :
      _L91 = (-_L50);
      break;
    
    default :
      _L91 = INIT_SPEED_simulation;
  }
  switch (_1_SSM_SM3_dispatch_sel) {
    case SSM_SM3_eh_track_empty__simulation :
      s_E_TRACK_OCCUPIED = kcg_false;
      break;
    case SSM_SM3_eh_occupied__simulation :
      s_E_TRACK_OCCUPIED = SSM_SM3_guard;
      break;
    
  }
  switch (SSM_SM2_dispatch_sel) {
    case SSM_SM2_track_empty__simulation :
      track_got_empty = kcg_false;
      break;
    case SSM_SM2_track_occupied__simulation :
      track_got_empty = SSM_SM2_guard;
      break;
    
  }
  if (_L420)
    {
      outC->_L425 = D_PRIMARY_simulation;
    }
  else
    {
      outC->_L425 = _L426;
    }
  if (outC->_L341)
    {
      _L342 = E_SPEED_MISMATCH_simulation;
    }
  else
    {
      _L342 = E_OK_simulation;
    }
  if (outC->_L339)
    {
      _L340 = E_MOTORMODE_MISMATCH_simulation;
    }
  else
    {
      _L340 = _L342;
    }
  outC->_L294 = _L295 | s_E_TRACK_OCCUPIED;
  if (outC->_L294)
    {
      _L270 = E_TRACK_OCCUPIED_simulation;
    }
  else
    {
      _L270 = _L340;
    }
  if (outC->_L293)
    {
      _L257 = E_TRACK_DOUBLE_ENTRY_simulation;
    }
  else
    {
      _L257 = _L270;
    }
  switch (_1_SSM_SM3_dispatch_sel) {
    case SSM_SM3_eh_track_empty__simulation :
      if (_2_SSM_SM3_guard)
        {
          _1_SSM_SM3_selec_dispatch_act = SSM_SM3_eh_occupied__simulation;
        }
      else
        {
          _1_SSM_SM3_selec_dispatch_act = SSM_SM3_eh_track_empty__simulation;
        }
      _1_SSM_SM3_dispatch_act = _1_SSM_SM3_selec_dispatch_act;
      break;
    case SSM_SM3_eh_occupied__simulation :
      if (SSM_SM3_guard)
        {
          SSM_SM3_selec_dispatch_act = SSM_SM3_eh_occupied__simulation;
        }
      else
        {
          if (_1_SSM_SM3_guard)
            {
              SSM_SM3_selec_dispatch_act = SSM_SM3_eh_track_empty__simulation;
            }
          else
            {
              SSM_SM3_selec_dispatch_act = SSM_SM3_eh_occupied__simulation;
            }
        }
      _1_SSM_SM3_dispatch_act = SSM_SM3_selec_dispatch_act;
      break;
    
  }
  switch (SSM_SM2_dispatch_sel) {
    case SSM_SM2_track_empty__simulation :
      if (_1_SSM_SM2_guard)
        {
          _1_SSM_SM2_selec_dispatch_act = SSM_SM2_track_occupied__simulation;
        }
      else
        {
          _1_SSM_SM2_selec_dispatch_act = SSM_SM2_track_empty__simulation;
        }
      SSM_SM2_dispatch_act = _1_SSM_SM2_selec_dispatch_act;
      break;
    case SSM_SM2_track_occupied__simulation :
      if (SSM_SM2_guard)
        {
          SSM_SM2_selec_dispatch_act = SSM_SM2_track_empty__simulation;
        }
      else
        {
          SSM_SM2_selec_dispatch_act = SSM_SM2_track_occupied__simulation;
        }
      SSM_SM2_dispatch_act = SSM_SM2_selec_dispatch_act;
      break;
    
  }
  switch (SSM_SM2_dispatch_act) {
    case SSM_SM2_track_occupied__simulation :
      if (outC->SSM_SM2_reset_act)
        {
          outC->_1_init = kcg_true;
        }
      break;
    
  }
  /* 1 */
   ErrorCodeModifier_simulation(
    &(*input_front).d_global.feedback.blockErrors,
    _L257,
    track_nr,
    &_L249);
  switch (_1_SSM_SM3_dispatch_act) {
    case SSM_SM3_eh_track_empty__simulation :
      outC->SSM_SM3_reset_nxt = kcg_false;
      outC->SSM_SM3_dispatch_nxt = SSM_SM3_eh_track_empty__simulation;
      break;
    case SSM_SM3_eh_occupied__simulation :
      outC->SSM_SM3_reset_nxt = kcg_false;
      outC->SSM_SM3_dispatch_nxt = SSM_SM3_eh_occupied__simulation;
      break;
    
  }
  switch (SSM_SM2_dispatch_act) {
    case SSM_SM2_track_empty__simulation :
      outC->SSM_SM2_reset_nxt = kcg_false;
      outC->SSM_SM2_dispatch_nxt = SSM_SM2_track_empty__simulation;
      position_head = (-1.0);
      break;
    case SSM_SM2_track_occupied__simulation :
      if (initial_train)
        {
          _L13 = MAX_TRACK_LENGTH_simulation - CONTACT_POSITION_simulation - 1.0;
        }
      else
        {
          if (outC->_1_init)
            {
              _L13 = 0.0;
            }
          else
            {
              _L13 = outC->_L11;
            }
        }
      outC->_L11 = _L91 * TIME_CYCLE_simulation + _L13;
      if (outC->_1_init)
        {
          SSM_SM3_dispatch_sel = SSM_SM3_enters__simulation;
        }
      else
        {
          SSM_SM3_dispatch_sel = outC->_1_SSM_SM3_dispatch_nxt;
        }
      outC->SSM_SM2_reset_nxt = kcg_false;
      outC->SSM_SM2_dispatch_nxt = SSM_SM2_track_occupied__simulation;
      switch (SSM_SM3_dispatch_sel) {
        case SSM_SM3_entered_rear__simulation :
          SSM_SM3_dispatch_act = SSM_SM3_entered_rear__simulation;
          break;
        case SSM_SM3_entered_front__simulation :
          SSM_SM3_dispatch_act = SSM_SM3_entered_front__simulation;
          break;
        case SSM_SM3_enters__simulation :
          _3_SSM_SM3_guard = ((*input_front).d_local.enters) | initial_train;
          if ((*input_rear).enters)
            {
              _2_SSM_SM3_selec_dispatch_act = SSM_SM3_entered_rear__simulation;
            }
          else
            {
              if (_3_SSM_SM3_guard)
                {
                  _2_SSM_SM3_selec_dispatch_act = SSM_SM3_entered_front__simulation;
                }
              else
                {
                  _2_SSM_SM3_selec_dispatch_act = SSM_SM3_enters__simulation;
                }
            }
          SSM_SM3_dispatch_act = _2_SSM_SM3_selec_dispatch_act;
          break;
        
      }
      switch (SSM_SM3_dispatch_act) {
        case SSM_SM3_entered_rear__simulation :
          outC->_1_SSM_SM3_dispatch_nxt = SSM_SM3_entered_rear__simulation;
          SSM_SM2_activ_position_head = MAX_TRACK_LENGTH_simulation + MAX_TRAIN_LENGTH_simulation + outC->_L11;
          break;
        case SSM_SM3_entered_front__simulation :
          outC->_1_SSM_SM3_dispatch_nxt = SSM_SM3_entered_front__simulation;
          SSM_SM2_activ_position_head = outC->_L11;
          break;
        case SSM_SM3_enters__simulation :
          outC->_1_SSM_SM3_dispatch_nxt = SSM_SM3_enters__simulation;
          SSM_SM2_activ_position_head = (-1.0);
          break;
        
      }
      position_head = SSM_SM2_activ_position_head;
      break;
    
  }
  /* 3 */
   RisingEdge_digital(position_head <= 0.0, &outC->_1_Context_RisingEdge);
  _L191 = outC->_1_Context_RisingEdge.RE_Output;
  /* 1 */
   RisingEdge_digital(
    position_head >= MAX_TRACK_LENGTH_simulation,
    &outC->_3_Context_RisingEdge);
  _L189 = outC->_3_Context_RisingEdge.RE_Output;
  _L131 = position_head - MAX_TRAIN_LENGTH_simulation;
  _L10.enters = _L189 & _L278;
  _L10.curSpeed = _L50;
  _L10.curAlignment = outC->_L393;
  _L230 = /* 1 */
     limiterWithDefault_simulation(
      position_head,
      MAX_TRACK_LENGTH_simulation,
      0.0,
      (-1.0));
  _L229 = /* 2 */
     limiterWithDefault_simulation(
      _L131,
      MAX_TRACK_LENGTH_simulation,
      0.0,
      (-1.0));
  /* 4 */
   RisingEdge_digital(
    _L131 >= MAX_TRACK_LENGTH_simulation,
    &outC->Context_RisingEdge);
  _L192 = outC->Context_RisingEdge.RE_Output;
  /* 2 */
   RisingEdge_digital(_L131 <= 0.0, &outC->_2_Context_RisingEdge);
  _L190 = outC->_2_Context_RisingEdge.RE_Output;
  outC->output_rear.enters = (_L190 & ((kcg_true ^track_got_empty))) & ((kcg_true ^_L278));
  outC->output_rear.curSpeed = _L50;
  outC->output_rear.curAlignment = outC->_L393;
  if (_L382)
    {
      _L380 = _L229;
      _L379 = _L230;
    }
  else
    {
      _L380 = _L230;
      _L379 = _L229;
    }
  _L360.track_occupied = _L380 != (-1.0);
  _L360.speed_out = _L91;
  _L360.track_shutdown = kcg_false;
  _L360.speed_newdata = _L372;
  /* 2 */
   PositionModifier_simulation(
    &(*input_front).d_global.feedback.positionTail,
    _L379,
    track_nr,
    &_L75);
  /* 1 */
   PositionModifier_simulation(
    &(*input_front).d_global.feedback.positionHead,
    _L380,
    track_nr,
    &_L74);
  if (_L382)
    {
      _L399 = _L380;
      _L398 = _L379;
    }
  else
    {
      _L399 = _L379;
      _L398 = _L380;
    }
  /* 2 */
   ExtDataModifier_simulation(
    &(*input_front).d_global.feedback.extTrackData,
    &_L360,
    track_nr,
    &_L375);
  /* 1 */
   contactSetting_simulation(
    _L398,
    _L399,
    MAX_TRACK_LENGTH_simulation - CONTACT_POSITION_simulation,
    outC->_L425,
    &outC->Context_contactSetting);
  copy_struct_1 ( &_L226 , &outC->Context_contactSetting.contactSignal );
  contactSetting_simulation(
    _L398,
    _L399,
    CONTACT_POSITION_simulation,
    outC->_L425,
    &outC->_1_Context_contactSetting);
  copy_struct_1 ( &_L225 , &outC->_1_Context_contactSetting.contactSignal );
  copy_struct_1 ( &_L104.c_first , &_L225 );
  copy_struct_1 ( &_L104.c_second , &_L226 );
  /* 1 */
   ContactPairModifier_simulation(
    &(*input_front).d_global.feedback.contacts,
    &_L104,
    track_nr,
    &_L29);
  copy_array_6 ( &_L23.contacts , &_L29 );
  copy_array_3 ( &_L23.positionHead , &_L74 );
  copy_array_3 ( &_L23.positionTail , &_L75 );
  copy_array_7 ( &_L23.blockErrors , &_L249 );
  copy_array_7 ( &_L23.pointErrors , &(*input_front).d_global.feedback.pointErrors );
  copy_array_8 ( &_L23.extTrackData , &_L375 );
  copy_struct_4 ( &_L11.commands , &_L12 );
  copy_struct_5 ( &_L11.feedback , &_L23 );
  copy_struct_6 ( &outC->output_front.d_global , &_L11 );
  copy_struct_7 ( &outC->output_front.d_local , &_L10 );
  outC->_2_M_pre_ = _L366 <= 0.0;
  outC->_1_M_pre_ = _L192 & _L278;
  outC->M_pre_ = (_L191 & ((kcg_true ^track_got_empty))) & ((kcg_true ^_L278));
  switch (SSM_SM2_dispatch_act) {
    case SSM_SM2_track_occupied__simulation :
      outC->_1_init = kcg_false;
      break;
    
  }
  outC->init = kcg_false;
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** track_simulation.c
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
