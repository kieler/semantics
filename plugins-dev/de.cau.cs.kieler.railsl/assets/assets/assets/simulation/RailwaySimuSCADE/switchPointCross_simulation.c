/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "switchPointCross_simulation.h"
void switchPointCross_reset_simulation(
  outC_switchPointCross_simulation *outC /* simulation::switchPointCross */)
{
  outC->init = kcg_true;
}
void switchPointCross_simulation(
  dataAll_simulation *input_straight_front /* simulation::switchPointCross::input_straight_front */,
  dataAll_simulation *input_turn_front /* simulation::switchPointCross::input_turn_front */,
  dataLocal_simulation *input_straight_rear /* simulation::switchPointCross::input_straight_rear */,
  dataLocal_simulation *input_turn_rear /* simulation::switchPointCross::input_turn_rear */,
  kcg_int switch_nr1 /* simulation::switchPointCross::switch_nr1 */,
  kcg_int switch_nr2 /* simulation::switchPointCross::switch_nr2 */,
  kcg_int belongs_to_track /* simulation::switchPointCross::belongs_to_track */,
  outC_switchPointCross_simulation *outC /* simulation::switchPointCross */)
{
  
  PointStatus_simulation tmp;
  
  kcg_real _1_tmp;
  /* simulation::switchPointCross::_L77 */
  kcg_bool _L77;
  /* simulation::switchPointCross::_L65 */
  kcg_bool _L65;
  /* simulation::switchPointCross::_L63 */
  dataLocal_simulation _L63;
  /* simulation::switchPointCross::_L147 */
  errorType_simulation _L147;
  /* simulation::switchPointCross::_L201 */
  errorType_simulation _L201;
  /* simulation::switchPointCross::_L133 */
  dataLocal_simulation _L133;
  /* simulation::switchPointCross::_L380 */
  kcg_bool _L380;
  /* simulation::switchPointCross::_L252 */
  kcg_bool _L252;
  /* simulation::switchPointCross::_L250 */
  kcg_bool _L250;
  /* simulation::switchPointCross::_L416 */
  errorType_simulation _L416;
  /* simulation::switchPointCross::_L248 */
  dataGlobal_simulation _L248;
  /* simulation::switchPointCross::_L124 */
  dataLocal_simulation _L124;
  /* simulation::switchPointCross::_L172 */
  errorArray_simulation _L172;
  /* simulation::switchPointCross::_L415 */
  kcg_bool _L415;
  /* simulation::switchPointCross::_L170 */
  errorArray_simulation _L170;
  /* simulation::switchPointCross::_L410 */
  errorType_simulation _L410;
  /* simulation::switchPointCross::_L119 */
  dataLocal_simulation _L119;
  /* simulation::switchPointCross::_L405 */
  kcg_bool _L405;
  /* simulation::switchPointCross::_L162 */
  controllerFeedback_simulation _L162;
  /* simulation::switchPointCross::_L116 */
  dataLocal_simulation _L116;
  /* simulation::switchPointCross::_L97 */
  dataLocal_simulation _L97;
  /* simulation::switchPointCross::_L398 */
  speedValue_simulation _L398;
  /* simulation::switchPointCross::_L397 */
  speedValue_simulation _L397;
  /* simulation::switchPointCross::_L156 */
  dataGlobal_simulation _L156;
  
  _L415 = ((kcg_true ^outC->init)) & (outC->_L414);
  _L405 = ((kcg_true ^outC->init)) & (outC->_L404);
  outC->_L404 = _L405;
  if ((*input_straight_rear).enters)
    {
      _L397 = (*input_straight_rear).curSpeed;
    }
  else
    {
      _L397 = (*input_turn_rear).curSpeed;
    }
  if ((*input_straight_front).d_local.enters)
    {
      _1_tmp = (*input_straight_front).d_local.curSpeed;
    }
  else
    {
      _1_tmp = (*input_turn_front).d_local.curSpeed;
    }
  _L380 = ((*input_straight_front).d_local.enters) | ((*input_turn_front).d_local.enters);
  _L252 = ((kcg_true ^outC->init)) & (outC->_L251);
  _L250 = ((kcg_true ^outC->init)) & (outC->_L249);
  /* 1 */
   mergeGlobalData_simulation(
    &(*input_straight_front).d_global,
    &(*input_turn_front).d_global,
    &_L248);
  if ((switch_nr2 >= 0) & (switch_nr2 < 48))
    {
      tmp = _L248.commands.points[switch_nr2];
    }
  else
    {
      tmp = P_STRAIGHT_simulation;
    }
  _L77 = P_STRAIGHT_simulation == tmp;
  if ((switch_nr1 >= 0) & (switch_nr1 < 48))
    {
      tmp = _L248.commands.points[switch_nr1];
    }
  else
    {
      tmp = P_STRAIGHT_simulation;
    }
  _L65 = tmp == P_STRAIGHT_simulation;
  if (_L77)
    {
      copy_struct_7 ( &_L63 , &(*input_straight_front).d_local );
    }
  else
    {
      copy_struct_7 ( &_L63 , (struct_7*) &INIT_DATA_LOCAL_simulation );
    }
  if (_L380)
    {
      _L398 = _1_tmp;
    }
  else
    {
      _L398 = _L397;
    }
  outC->_L251 = _L252 | (_L77 & ((kcg_true ^_L65)));
  outC->_L249 = _L250 | (((((_L77 & ((*input_turn_front).d_local.enters)) | (((*input_turn_front).d_local.enters) & _L65)) | (((*input_turn_rear).enters) & _L77)) | ((((kcg_true ^_L77)) & ((*input_straight_rear).enters)) | (((*input_straight_rear).enters) & ((kcg_true ^_L65))))) | (((*input_straight_front).d_local.enters) & ((kcg_true ^_L65))));
  if (_L65)
    {
      copy_struct_7 ( &_L133 , (struct_7*) &INIT_DATA_LOCAL_simulation );
    }
  else
    {
      copy_struct_7 ( &_L133 , input_turn_rear );
    }
  if (_L77)
    {
      copy_struct_7 ( &outC->output_turn_rear , (struct_7*)
        &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L124 , input_straight_rear );
    }
  else
    {
      copy_struct_7 ( &outC->output_turn_rear , &_L133 );
      copy_struct_7 ( &_L124 , input_turn_rear );
    }
  if (_L65)
    {
      copy_struct_7 ( &_L119 , &(*input_straight_front).d_local );
      copy_struct_7 ( &_L116 , &_L63 );
    }
  else
    {
      copy_struct_7 ( &_L119 , &(*input_turn_front).d_local );
      copy_struct_7 ( &_L116 , (struct_7*) &INIT_DATA_LOCAL_simulation );
    }
  if (_L77)
    {
      copy_struct_7 ( &_L97 , (struct_7*) &INIT_DATA_LOCAL_simulation );
    }
  else
    {
      copy_struct_7 ( &_L97 , &_L119 );
    }
  if ((belongs_to_track >= 0) & (belongs_to_track < 48))
    {
      _1_tmp = _L248.commands.speeds[belongs_to_track];
    }
  else
    {
      _1_tmp = INIT_SPEED_simulation;
    }
  outC->_L414 = _L415 | ((_L380 | (((*input_straight_rear).enters) | ((*input_turn_rear).enters))) & (_1_tmp != _L398));
  if (_L65)
    {
      copy_struct_7 ( &outC->output_straight_rear , &_L124 );
    }
  else
    {
      copy_struct_7 ( &outC->output_straight_rear , (struct_7*)
        &INIT_DATA_LOCAL_simulation );
    }
  if (outC->_L414)
    {
      _L416 = E_SPEED_MISMATCH_simulation;
    }
  else
    {
      _L416 = E_OK_simulation;
    }
  if (outC->_L404)
    {
      _L410 = E_MOTORMODE_MISMATCH_simulation;
    }
  else
    {
      _L410 = _L416;
    }
  if (outC->_L249)
    {
      _L201 = E_WRONG_SWITCHPOINT_DIRECTION_simulation;
    }
  else
    {
      _L201 = _L410;
    }
  if (outC->_L251)
    {
      _L147 = E_FORBIDDEN_SWITCHCROSS_SETTING_simulation;
    }
  else
    {
      _L147 = _L201;
    }
  /* 1 */
   ErrorCodeModifier_simulation(
    &_L248.feedback.pointErrors,
    _L147,
    switch_nr1,
    &_L170);
  /* 1 */
   ErrorCodeModifier_simulation(&_L170, _L147, switch_nr2, &_L172);
  copy_array_6 ( &_L162.contacts , &_L248.feedback.contacts );
  copy_array_3 ( &_L162.positionHead , &_L248.feedback.positionHead );
  copy_array_3 ( &_L162.positionTail , &_L248.feedback.positionTail );
  copy_array_7 ( &_L162.blockErrors , &_L248.feedback.blockErrors );
  copy_array_7 ( &_L162.pointErrors , &_L172 );
  copy_array_8 ( &_L162.extTrackData , &_L248.feedback.extTrackData );
  copy_struct_4 ( &_L156.commands , &_L248.commands );
  copy_struct_5 ( &_L156.feedback , &_L162 );
  copy_struct_6 ( &outC->output_turn_front.d_global , &_L156 );
  copy_struct_7 ( &outC->output_turn_front.d_local , &_L97 );
  copy_struct_6 ( &outC->output_straight_front.d_global , &_L156 );
  copy_struct_7 ( &outC->output_straight_front.d_local , &_L116 );
  outC->init = kcg_false;
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** switchPointCross_simulation.c
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
