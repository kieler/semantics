/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "switchPoint1_simulation.h"
void switchPoint1_reset_simulation(
  outC_switchPoint1_simulation *outC /* simulation::switchPoint1 */)
{
  outC->init = kcg_true;
}
void switchPoint1_simulation(
  dataAll_simulation *input_straight /* simulation::switchPoint1::input_straight */,
  dataAll_simulation *input_turn /* simulation::switchPoint1::input_turn */,
  dataLocal_simulation *input_rear /* simulation::switchPoint1::input_rear */,
  kcg_int switch_nr /* simulation::switchPoint1::switch_nr */,
  outC_switchPoint1_simulation *outC /* simulation::switchPoint1 */)
{
  /* simulation::switchPoint1::_L79 */
  controllerFeedback_simulation _L79;
  /* simulation::switchPoint1::_L60 */
  kcg_bool _L60;
  /* simulation::switchPoint1::_L41 */
  dataLocal_simulation _L41;
  /* simulation::switchPoint1::_L89 */
  kcg_bool _L89;
  /* simulation::switchPoint1::_L73 */
  dataGlobal_simulation _L73;
  /* simulation::switchPoint1::_L87 */
  dataGlobal_simulation _L87;
  /* simulation::switchPoint1::_L23 */
  PointStatus_simulation _L23;
  /* simulation::switchPoint1::_L81 */
  errorArray_simulation _L81;
  /* simulation::switchPoint1::_L57 */
  errorType_simulation _L57;
  
  _L89 = ((kcg_true ^outC->init)) & (outC->_L88);
  /* 1 */
   mergeGlobalData_simulation(
    &(*input_straight).d_global,
    &(*input_turn).d_global,
    &_L87);
  if ((switch_nr >= 0) & (switch_nr < 48))
    {
      _L23 = (*input_straight).d_global.commands.points[switch_nr];
    }
  else
    {
      _L23 = P_STRAIGHT_simulation;
    }
  _L60 = _L23 == P_STRAIGHT_simulation;
  switch (_L23) {
    case P_STRAIGHT_simulation :
      copy_struct_7 ( &outC->output_turn , (struct_7*)
        &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &outC->output_straight , input_rear );
      copy_struct_7 ( &_L41 , &(*input_straight).d_local );
      break;
    case P_TURN_simulation :
      copy_struct_7 ( &outC->output_turn , input_rear );
      copy_struct_7 ( &outC->output_straight , (struct_7*)
        &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L41 , &(*input_turn).d_local );
      break;
    
  }
  outC->_L88 = _L89 | ((((*input_turn).d_local.enters) & _L60) | (((*input_straight).d_local.enters) & ((kcg_true ^_L60))));
  if (outC->_L88)
    {
      _L57 = E_WRONG_SWITCHPOINT_DIRECTION_simulation;
    }
  else
    {
      _L57 = E_OK_simulation;
    }
  /* 1 */
   ErrorCodeModifier_simulation(
    &_L87.feedback.pointErrors,
    _L57,
    switch_nr,
    &_L81);
  copy_array_6 ( &_L79.contacts , &_L87.feedback.contacts );
  copy_array_3 ( &_L79.positionHead , &_L87.feedback.positionHead );
  copy_array_3 ( &_L79.positionTail , &_L87.feedback.positionTail );
  copy_array_7 ( &_L79.blockErrors , &_L87.feedback.blockErrors );
  copy_array_7 ( &_L79.pointErrors , &_L81 );
  copy_array_8 ( &_L79.extTrackData , &_L87.feedback.extTrackData );
  copy_struct_4 ( &_L73.commands , &_L87.commands );
  copy_struct_5 ( &_L73.feedback , &_L79 );
  copy_struct_6 ( &outC->output_rear.d_global , &_L73 );
  copy_struct_7 ( &outC->output_rear.d_local , &_L41 );
  outC->init = kcg_false;
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** switchPoint1_simulation.c
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
