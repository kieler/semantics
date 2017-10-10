/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "switchPoint2_simulation.h"
void switchPoint2_reset_simulation(
  outC_switchPoint2_simulation *outC /* simulation::switchPoint2 */)
{
  outC->init = kcg_true;
}
void switchPoint2_simulation(
  dataAll_simulation *input_front /* simulation::switchPoint2::input_front */,
  dataLocal_simulation *input_straight /* simulation::switchPoint2::input_straight */,
  dataLocal_simulation *input_turn /* simulation::switchPoint2::input_turn */,
  kcg_int switch_nr /* simulation::switchPoint2::switch_nr */,
  outC_switchPoint2_simulation *outC /* simulation::switchPoint2 */)
{
  /* simulation::switchPoint2::_L60 */
  dataAll_simulation _L60;
  /* simulation::switchPoint2::_L31 */
  kcg_bool _L31;
  /* simulation::switchPoint2::_L55 */
  errorArray_simulation _L55;
  /* simulation::switchPoint2::_L69 */
  kcg_bool _L69;
  /* simulation::switchPoint2::_L54 */
  controllerFeedback_simulation _L54;
  /* simulation::switchPoint2::_L9 */
  PointStatus_simulation _L9;
  /* simulation::switchPoint2::_L53 */
  dataGlobal_simulation _L53;
  /* simulation::switchPoint2::_L65 */
  dataAll_simulation _L65;
  /* simulation::switchPoint2::_L37 */
  errorType_simulation _L37;
  
  _L69 = ((kcg_true ^outC->init)) & (outC->_L70);
  if ((switch_nr >= 0) & (switch_nr < 48))
    {
      _L9 = (*input_front).d_global.commands.points[switch_nr];
    }
  else
    {
      _L9 = P_STRAIGHT_simulation;
    }
  _L31 = _L9 == P_STRAIGHT_simulation;
  switch (_L9) {
    case P_STRAIGHT_simulation :
      copy_struct_7 ( &outC->output_front , input_straight );
      break;
    case P_TURN_simulation :
      copy_struct_7 ( &outC->output_front , input_turn );
      break;
    
  }
  outC->_L70 = _L69 | ((((*input_turn).enters) & _L31) | (((*input_straight).enters) & ((kcg_true ^_L31))));
  if (outC->_L70)
    {
      _L37 = E_WRONG_SWITCHPOINT_DIRECTION_simulation;
    }
  else
    {
      _L37 = E_OK_simulation;
    }
  /* 1 */
   ErrorCodeModifier_simulation(
    &(*input_front).d_global.feedback.pointErrors,
    _L37,
    switch_nr,
    &_L55);
  copy_array_6 ( &_L54.contacts , &(*input_front).d_global.feedback.contacts );
  copy_array_3 ( &_L54.positionHead , &(*input_front).d_global.feedback.positionHead );
  copy_array_3 ( &_L54.positionTail , &(*input_front).d_global.feedback.positionTail );
  copy_array_7 ( &_L54.blockErrors , &(*input_front).d_global.feedback.blockErrors );
  copy_array_7 ( &_L54.pointErrors , &_L55 );
  copy_array_8 ( &_L54.extTrackData , &(*input_front).d_global.feedback.extTrackData );
  copy_struct_4 ( &_L53.commands , &(*input_front).d_global.commands );
  copy_struct_5 ( &_L53.feedback , &_L54 );
  copy_struct_6 ( &_L60.d_global , &_L53 );
  copy_struct_7 ( &_L60.d_local , (struct_7*) &INIT_DATA_LOCAL_simulation );
  copy_struct_6 ( &_L65.d_global , &_L53 );
  copy_struct_7 ( &_L65.d_local , &(*input_front).d_local );
  switch (_L9) {
    case P_STRAIGHT_simulation :
      copy_struct_8 ( &outC->output_turn , &_L60 );
      copy_struct_8 ( &outC->output_straight , &_L65 );
      break;
    case P_TURN_simulation :
      copy_struct_8 ( &outC->output_turn , &_L65 );
      copy_struct_8 ( &outC->output_straight , &_L60 );
      break;
    
  }
  outC->init = kcg_false;
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** switchPoint2_simulation.c
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
