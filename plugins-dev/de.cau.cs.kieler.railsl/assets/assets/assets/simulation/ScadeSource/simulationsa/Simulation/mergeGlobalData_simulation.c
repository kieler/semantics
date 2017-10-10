/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "mergeGlobalData_simulation.h"
void mergeGlobalData_simulation(
  dataGlobal_simulation *globalData1 /* simulation::mergeGlobalData::globalData1 */,
  dataGlobal_simulation *globalData2 /* simulation::mergeGlobalData::globalData2 */,
  dataGlobal_simulation *outputData /* simulation::mergeGlobalData::outputData */)
{
  /* simulation::mergeGlobalData::_L43 */
  errorArray_simulation _L43;
  /* simulation::mergeGlobalData::_L42 */
  errorArray_simulation _L42;
  /* simulation::mergeGlobalData::_L41 */
  positionArray_simulation _L41;
  /* simulation::mergeGlobalData::_L30 */
  controllerFeedback_simulation _L30;
  /* simulation::mergeGlobalData::_L40 */
  positionArray_simulation _L40;
  /* simulation::mergeGlobalData::_L39 */
  contactArray_simulation _L39;
  /* simulation::mergeGlobalData::_L46 */
  trackExtDataArray_simulation _L46;
  
  /* 1 */
   mergeSingleDataArrays_simulation(
    &(*globalData1).feedback.contacts,
    &(*globalData1).feedback.positionHead,
    &(*globalData1).feedback.positionTail,
    &(*globalData1).feedback.blockErrors,
    &(*globalData1).feedback.pointErrors,
    &(*globalData1).feedback.extTrackData,
    &(*globalData2).feedback.contacts,
    &(*globalData2).feedback.positionHead,
    &(*globalData2).feedback.positionTail,
    &(*globalData2).feedback.blockErrors,
    &(*globalData2).feedback.pointErrors,
    &(*globalData2).feedback.extTrackData,
    &_L39,
    &_L40,
    &_L41,
    &_L42,
    &_L43,
    &_L46);
  copy_array_6 ( &_L30.contacts , &_L39 );
  copy_array_3 ( &_L30.positionHead , &_L40 );
  copy_array_3 ( &_L30.positionTail , &_L41 );
  copy_array_7 ( &_L30.blockErrors , &_L42 );
  copy_array_7 ( &_L30.pointErrors , &_L43 );
  copy_array_8 ( &_L30.extTrackData , &_L46 );
  copy_struct_4 ( &(*outputData).commands , &(*globalData1).commands );
  copy_struct_5 ( &(*outputData).feedback , &_L30 );
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** mergeGlobalData_simulation.c
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
