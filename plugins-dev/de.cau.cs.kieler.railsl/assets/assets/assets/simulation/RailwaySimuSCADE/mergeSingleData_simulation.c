/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "mergeSingleData_simulation.h"
void mergeSingleData_simulation(
  contactPair_simulation *contacts_1 /* simulation::mergeSingleData::contacts_1 */,
  positionType_simulation head_pos_1 /* simulation::mergeSingleData::head_pos_1 */,
  positionType_simulation tail_pos_1 /* simulation::mergeSingleData::tail_pos_1 */,
  errorType_simulation errorBlock_1 /* simulation::mergeSingleData::errorBlock_1 */,
  errorType_simulation errorPoint_1 /* simulation::mergeSingleData::errorPoint_1 */,
  contactPair_simulation *contacts_2 /* simulation::mergeSingleData::contacts_2 */,
  positionType_simulation head_pos_2 /* simulation::mergeSingleData::head_pos_2 */,
  positionType_simulation tail_pos_2 /* simulation::mergeSingleData::tail_pos_2 */,
  errorType_simulation errorBlock_2 /* simulation::mergeSingleData::errorBlock_2 */,
  errorType_simulation errorPoint_2 /* simulation::mergeSingleData::errorPoint_2 */,
  trackExtData_simulation *trackExtData_1 /* simulation::mergeSingleData::trackExtData_1 */,
  trackExtData_simulation *trackExtData_2 /* simulation::mergeSingleData::trackExtData_2 */,
  contactPair_simulation *merged_contacts /* simulation::mergeSingleData::merged_contacts */,
  positionType_simulation *merged_head_pos /* simulation::mergeSingleData::merged_head_pos */,
  positionType_simulation *merged_tail_pos /* simulation::mergeSingleData::merged_tail_pos */,
  errorType_simulation *merged_errorBlock /* simulation::mergeSingleData::merged_errorBlock */,
  errorType_simulation *merged_errorPoint /* simulation::mergeSingleData::merged_errorPoint */,
  trackExtData_simulation *merged_trackExtData /* simulation::mergeSingleData::merged_trackExtData */)
{
  if (((((*trackExtData_1).track_occupied != INIT_TRACKEXTDATA_simulation.track_occupied) | ((*trackExtData_1).speed_out != INIT_TRACKEXTDATA_simulation.speed_out)) | ((*trackExtData_1).track_shutdown != INIT_TRACKEXTDATA_simulation.track_shutdown)) | ((*trackExtData_1).speed_newdata != INIT_TRACKEXTDATA_simulation.speed_newdata))
    {
      copy_struct_3 ( merged_trackExtData , trackExtData_1 );
    }
  else
    {
      copy_struct_3 ( merged_trackExtData , trackExtData_2 );
    }
  if (errorPoint_1 != INIT_ERROR_simulation)
    {
      *merged_errorPoint = errorPoint_1;
    }
  else
    {
      *merged_errorPoint = errorPoint_2;
    }
  if (errorBlock_1 != INIT_ERROR_simulation)
    {
      *merged_errorBlock = errorBlock_1;
    }
  else
    {
      *merged_errorBlock = errorBlock_2;
    }
  if (tail_pos_1 != INIT_POSITION_simulation)
    {
      *merged_tail_pos = tail_pos_1;
    }
  else
    {
      *merged_tail_pos = tail_pos_2;
    }
  if (head_pos_1 != INIT_POSITION_simulation)
    {
      *merged_head_pos = head_pos_1;
    }
  else
    {
      *merged_head_pos = head_pos_2;
    }
  if (((((*contacts_1).c_first.Triggered != INIT_CONTACT_PAIR_simulation.c_first.Triggered) | ((*contacts_1).c_first.Direction != INIT_CONTACT_PAIR_simulation.c_first.Direction)) | ((*contacts_1).c_second.Triggered != INIT_CONTACT_PAIR_simulation.c_second.Triggered)) | ((*contacts_1).c_second.Direction != INIT_CONTACT_PAIR_simulation.c_second.Direction))
    {
      copy_struct_2 ( merged_contacts , contacts_1 );
    }
  else
    {
      copy_struct_2 ( merged_contacts , contacts_2 );
    }
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** mergeSingleData_simulation.c
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
