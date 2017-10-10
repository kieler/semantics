/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#ifndef _KCG_TYPES_H__H_
#define _KCG_TYPES_H__H_

#define MAPW_CPY
#ifndef kcg_bool
#define kcg_bool kcg_bool

typedef int kcg_bool;
#endif /* kcg_bool */

#ifndef kcg_int
#define kcg_int kcg_int

typedef int kcg_int;
#endif /* kcg_int */

#ifndef kcg_real
#define kcg_real kcg_real

typedef double kcg_real;
#endif /* kcg_real */

#ifndef kcg_char
#define kcg_char kcg_char

typedef unsigned char kcg_char;
#endif /* kcg_char */

#ifndef kcg_true
#define kcg_true (kcg_bool)1
#endif /* kcg_true */

#ifndef kcg_false
#define kcg_false (kcg_bool)0
#endif /* kcg_false */


typedef enum {
  SSM_SM3_no_trans__simulation,
  SSM_SM3_tr_enters__simulation,
  _1_SSM_SM3_tr_enters__simulation
} SSM_track_occupied_SM3_TR;
/* simulation::track::SM2::track_occupied::SSM_SM3_Transitions */

typedef enum {
  SSM_SM3_eh_track_empty__simulation,
  SSM_SM3_eh_occupied__simulation
} SSM_track_SM3_ST;
/* simulation::track::SSM_SM3_States */

typedef enum {
  SSM_SM2_track_empty__simulation,
  SSM_SM2_track_occupied__simulation
} SSM_track_SM2_ST;
/* simulation::track::SSM_SM2_States */

typedef enum {
  SSM_SM3_entered_front__simulation,
  SSM_SM3_entered_rear__simulation,
  SSM_SM3_enters__simulation
} SSM_track_occupied_SM3_ST;
/* simulation::track::SM2::track_occupied::SSM_SM3_States */

typedef enum { SSM_SM4_no_trans__simulation, SSM_SM4_tr_startup__simulation } SSM_track_SM4_TR;
/* simulation::track::SSM_SM4_Transitions */

typedef enum {
  D_UNKNOWN_simulation,
  D_PRIMARY_simulation,
  D_SECONDARY_simulation
} TrainDirectionType_simulation;
/* simulation::TrainDirectionType */

typedef enum { P_STRAIGHT_simulation, P_TURN_simulation } PointStatus_simulation;
/* simulation::PointStatus */

typedef enum {
  SSM_SM2_no_trans__simulation,
  SSM_SM2_tr_track_empty__simulation,
  SSM_SM2_tr_track_occupied__simulation
} SSM_track_SM2_TR;
/* simulation::track::SSM_SM2_Transitions */

typedef enum {
  M_OFF_simulation,
  M_PRIMARY_simulation,
  M_SECONDARY_simulation,
  M_BRAKE_simulation
} MotormodeType_simulation;
/* simulation::MotormodeType */

typedef enum { SSM_SM4_startup__simulation, SSM_SM4_running__simulation } SSM_track_SM4_ST;
/* simulation::track::SSM_SM4_States */

typedef enum {
  AL_NONE_simulation,
  AL_FORWARD_simulation,
  AL_BACKWARD_simulation
} TrainAlignmentType_simulation;
/* simulation::TrainAlignmentType */

typedef enum {
  SSM_SM1_no_trans__simulation,
  SSM_SM1_tr_idle__simulation,
  _1_SSM_SM1_tr_idle__simulation,
  SSM_SM1_tr_head_behind_prim__simulation,
  _1_SSM_SM1_tr_head_behind_prim__simulation,
  SSM_SM1_tr_tail_ahead__sek__simulation,
  _1_SSM_SM1_tr_tail_ahead__sek__simulation,
  SSM_SM1_tr_head_ahead_prim__simulation,
  _1_SSM_SM1_tr_head_ahead_prim__simulation,
  SSM_SM1_tr_tail_behind_sek__simulation,
  _1_SSM_SM1_tr_tail_behind_sek__simulation,
  SSM_SM1_tr_head_ahead_sek__simulation,
  SSM_SM1_tr_tail_behind_prim__simulation
} SSM_contactSetting_SM1_TR;
/* simulation::contactSetting::SSM_SM1_Transitions */

typedef enum {
  _1_SSM_SM3_no_trans__simulation,
  SSM_SM3_tr_eh_track_empty__simulation,
  SSM_SM3_tr_eh_occupied__simulation,
  _1_SSM_SM3_tr_eh_occupied__simulation
} SSM_track_SM3_TR;
/* simulation::track::SSM_SM3_Transitions */

typedef enum {
  E_OK_simulation,
  E_FORBIDDEN_SWITCHCROSS_SETTING_simulation,
  E_WRONG_SWITCHPOINT_DIRECTION_simulation,
  E_TRACK_OCCUPIED_simulation,
  E_TRACK_DOUBLE_ENTRY_simulation,
  E_MOTORMODE_MISMATCH_simulation,
  E_SPEED_MISMATCH_simulation
} errorType_simulation;
/* simulation::errorType */

typedef enum { T_truthtables, F_truthtables, X_truthtables } TruthTableValues_truthtables;
/* truthtables::TruthTableValues */

typedef enum {
  S_OFF_simulation,
  S_RED_simulation,
  S_YELLOW_simulation,
  S_GREEN_simulation
} signalValue_simulation;
/* simulation::signalValue */

typedef enum {
  SSM_SM1_idle__simulation,
  SSM_SM1_head_behind_prim__simulation,
  SSM_SM1_tail_ahead__sek__simulation,
  SSM_SM1_head_ahead_prim__simulation,
  SSM_SM1_tail_behind_sek__simulation,
  SSM_SM1_head_ahead_sek__simulation,
  SSM_SM1_tail_behind_prim__simulation
} SSM_contactSetting_SM1_ST;
/* simulation::contactSetting::SSM_SM1_States */

typedef MotormodeType_simulation array_2[48];

#ifndef kcg_assign
#include "string.h"
#define kcg_assign(C1, C2, size) (void)memcpy((C1), (C2), size)
#endif /* kcg_assign */

#ifndef kcg_assign_struct
#define kcg_assign_struct(C1, C2, size) kcg_assign((C1), (C2), size)
#endif /* kcg_assign_struct */

#ifndef kcg_assign_array
#define kcg_assign_array(C1, C2, size) kcg_assign((C1), (C2), size)
#endif /* kcg_assign_array */

#ifndef copy_array_2
#define copy_array_2(C1, C2) kcg_assign_array(C1, C2, sizeof ( array_2 ))
#endif /* copy_array_2 */
#ifndef kcg_comp_array_2
extern kcg_bool kcg_comp_array_2(array_2 *C1, array_2 *C2);
#endif /* kcg_comp_array_2 */


typedef TrainAlignmentType_simulation array_5[48];

#ifndef copy_array_5
#define copy_array_5(C1, C2) kcg_assign_array(C1, C2, sizeof ( array_5 ))
#endif /* copy_array_5 */
#ifndef kcg_comp_array_5
extern kcg_bool kcg_comp_array_5(array_5 *C1, array_5 *C2);
#endif /* kcg_comp_array_5 */


typedef array_5 initialTrainArray_simulation;
/* simulation::initialTrainArray */
#define copy_initialTrainArray_simulation(C1, C2) copy_array_5((C1), (C2))
#define kcg_comp_initialTrainArray_simulation(C1, C2) kcg_comp_array_5((C1),(C2))


typedef PointStatus_simulation array_1[48];

#ifndef copy_array_1
#define copy_array_1(C1, C2) kcg_assign_array(C1, C2, sizeof ( array_1 ))
#endif /* copy_array_1 */
#ifndef kcg_comp_array_1
extern kcg_bool kcg_comp_array_1(array_1 *C1, array_1 *C2);
#endif /* kcg_comp_array_1 */


typedef kcg_real array_3[48];

#ifndef copy_array_3
#define copy_array_3(C1, C2) kcg_assign_array(C1, C2, sizeof ( array_3 ))
#endif /* copy_array_3 */
#ifndef kcg_comp_array_3
extern kcg_bool kcg_comp_array_3(array_3 *C1, array_3 *C2);
#endif /* kcg_comp_array_3 */


typedef signalValue_simulation array_4[49];

#ifndef copy_array_4
#define copy_array_4(C1, C2) kcg_assign_array(C1, C2, sizeof ( array_4 ))
#endif /* copy_array_4 */
#ifndef kcg_comp_array_4
extern kcg_bool kcg_comp_array_4(array_4 *C1, array_4 *C2);
#endif /* kcg_comp_array_4 */


typedef struct {
  array_1 points;
  array_2 motormodes;
  array_3 speeds;
  array_4 signals0;
  array_4 signals1;
  array_5 inittrains;
} struct_4;

#ifndef copy_struct_4
#define copy_struct_4(C1, C2) kcg_assign_struct(C1, C2, sizeof ( struct_4 ))
#endif /* copy_struct_4 */
#ifndef kcg_comp_struct_4
#define kcg_comp_struct_4(C1, C2)                                               \
(kcg_comp_array_1((&((C1)->points)),(&((C2)->points))) & (kcg_comp_array_2((&((C1)->motormodes)),(&((C2)->motormodes))) & (kcg_comp_array_3((&((C1)->speeds)),(&((C2)->speeds))) & (kcg_comp_array_4((&((C1)->signals0)),(&((C2)->signals0))) & (kcg_comp_array_4((&((C1)->signals1)),(&((C2)->signals1))) & (kcg_comp_array_5((&((C1)->inittrains)),(&((C2)->inittrains))))))))\
  )                                                                             \

#endif /* kcg_comp_struct_4 */


typedef struct { kcg_bool Triggered; TrainDirectionType_simulation Direction; } struct_1;

#ifndef copy_struct_1
#define copy_struct_1(C1, C2) kcg_assign_struct(C1, C2, sizeof ( struct_1 ))
#endif /* copy_struct_1 */
#ifndef kcg_comp_struct_1
#define kcg_comp_struct_1(C1, C2)                                               \
((*&((C1)->Triggered) == *&((C2)->Triggered)) & ((*&((C1)->Direction)) == (*&((C2)->Direction)))\
  )                                                                             \

#endif /* kcg_comp_struct_1 */


typedef struct { struct_1 c_first; struct_1 c_second; } struct_2;

#ifndef copy_struct_2
#define copy_struct_2(C1, C2) kcg_assign_struct(C1, C2, sizeof ( struct_2 ))
#endif /* copy_struct_2 */
#ifndef kcg_comp_struct_2
#define kcg_comp_struct_2(C1, C2)                                               \
(kcg_comp_struct_1((&((C1)->c_first)),(&((C2)->c_first))) & (kcg_comp_struct_1((&((C1)->c_second)),(&((C2)->c_second))))\
  )                                                                             \

#endif /* kcg_comp_struct_2 */


typedef struct_2 array_6[48];

#ifndef copy_array_6
#define copy_array_6(C1, C2) kcg_assign_array(C1, C2, sizeof ( array_6 ))
#endif /* copy_array_6 */
#ifndef kcg_comp_array_6
extern kcg_bool kcg_comp_array_6(array_6 *C1, array_6 *C2);
#endif /* kcg_comp_array_6 */


typedef errorType_simulation array_7[48];

#ifndef copy_array_7
#define copy_array_7(C1, C2) kcg_assign_array(C1, C2, sizeof ( array_7 ))
#endif /* copy_array_7 */
#ifndef kcg_comp_array_7
extern kcg_bool kcg_comp_array_7(array_7 *C1, array_7 *C2);
#endif /* kcg_comp_array_7 */


typedef struct {
  kcg_bool track_occupied;
  kcg_real speed_out;
  kcg_bool track_shutdown;
  kcg_bool speed_newdata;
} struct_3;

#ifndef copy_struct_3
#define copy_struct_3(C1, C2) kcg_assign_struct(C1, C2, sizeof ( struct_3 ))
#endif /* copy_struct_3 */
#ifndef kcg_comp_struct_3
#define kcg_comp_struct_3(C1, C2)                                               \
((*&((C1)->track_occupied) == *&((C2)->track_occupied)) & ((*&((C1)->speed_out) == *&((C2)->speed_out)) & ((*&((C1)->track_shutdown) == *&((C2)->track_shutdown)) & ((*&((C1)->speed_newdata) == *&((C2)->speed_newdata)))))\
  )                                                                             \

#endif /* kcg_comp_struct_3 */


typedef struct_3 array_8[48];

#ifndef copy_array_8
#define copy_array_8(C1, C2) kcg_assign_array(C1, C2, sizeof ( array_8 ))
#endif /* copy_array_8 */
#ifndef kcg_comp_array_8
extern kcg_bool kcg_comp_array_8(array_8 *C1, array_8 *C2);
#endif /* kcg_comp_array_8 */


typedef struct {
  array_6 contacts;
  array_3 positionHead;
  array_3 positionTail;
  array_7 blockErrors;
  array_7 pointErrors;
  array_8 extTrackData;
} struct_5;

#ifndef copy_struct_5
#define copy_struct_5(C1, C2) kcg_assign_struct(C1, C2, sizeof ( struct_5 ))
#endif /* copy_struct_5 */
#ifndef kcg_comp_struct_5
#define kcg_comp_struct_5(C1, C2)                                               \
(kcg_comp_array_6((&((C1)->contacts)),(&((C2)->contacts))) & (kcg_comp_array_3((&((C1)->positionHead)),(&((C2)->positionHead))) & (kcg_comp_array_3((&((C1)->positionTail)),(&((C2)->positionTail))) & (kcg_comp_array_7((&((C1)->blockErrors)),(&((C2)->blockErrors))) & (kcg_comp_array_7((&((C1)->pointErrors)),(&((C2)->pointErrors))) & (kcg_comp_array_8((&((C1)->extTrackData)),(&((C2)->extTrackData))))))))\
  )                                                                             \

#endif /* kcg_comp_struct_5 */


typedef struct { struct_4 commands; struct_5 feedback; } struct_6;

#ifndef copy_struct_6
#define copy_struct_6(C1, C2) kcg_assign_struct(C1, C2, sizeof ( struct_6 ))
#endif /* copy_struct_6 */
#ifndef kcg_comp_struct_6
#define kcg_comp_struct_6(C1, C2)                                               \
(kcg_comp_struct_4((&((C1)->commands)),(&((C2)->commands))) & (kcg_comp_struct_5((&((C1)->feedback)),(&((C2)->feedback))))\
  )                                                                             \

#endif /* kcg_comp_struct_6 */


typedef struct {
  kcg_bool enters;
  kcg_real curSpeed;
  TrainAlignmentType_simulation curAlignment;
} struct_7;

#ifndef copy_struct_7
#define copy_struct_7(C1, C2) kcg_assign_struct(C1, C2, sizeof ( struct_7 ))
#endif /* copy_struct_7 */
#ifndef kcg_comp_struct_7
#define kcg_comp_struct_7(C1, C2)                                               \
((*&((C1)->enters) == *&((C2)->enters)) & ((*&((C1)->curSpeed) == *&((C2)->curSpeed)) & ((*&((C1)->curAlignment)) == (*&((C2)->curAlignment))))\
  )                                                                             \

#endif /* kcg_comp_struct_7 */


typedef struct { struct_6 d_global; struct_7 d_local; } struct_8;

#ifndef copy_struct_8
#define copy_struct_8(C1, C2) kcg_assign_struct(C1, C2, sizeof ( struct_8 ))
#endif /* copy_struct_8 */
#ifndef kcg_comp_struct_8
#define kcg_comp_struct_8(C1, C2)                                               \
(kcg_comp_struct_6((&((C1)->d_global)),(&((C2)->d_global))) & (kcg_comp_struct_7((&((C1)->d_local)),(&((C2)->d_local))))\
  )                                                                             \

#endif /* kcg_comp_struct_8 */


typedef array_3 speedArray_simulation;
/* simulation::speedArray */
#define copy_speedArray_simulation(C1, C2) copy_array_3((C1), (C2))
#define kcg_comp_speedArray_simulation(C1, C2) kcg_comp_array_3((C1),(C2))


typedef struct_4 controllerCommands_simulation;
/* simulation::controllerCommands */
#define copy_controllerCommands_simulation(C1, C2) copy_struct_4((C1), (C2))
#define kcg_comp_controllerCommands_simulation(C1, C2) kcg_comp_struct_4((C1),(C2))


typedef struct_5 controllerFeedback_simulation;
/* simulation::controllerFeedback */
#define copy_controllerFeedback_simulation(C1, C2) copy_struct_5((C1), (C2))
#define kcg_comp_controllerFeedback_simulation(C1, C2) kcg_comp_struct_5((C1),(C2))


typedef struct_6 dataGlobal_simulation;
/* simulation::dataGlobal */
#define copy_dataGlobal_simulation(C1, C2) copy_struct_6((C1), (C2))
#define kcg_comp_dataGlobal_simulation(C1, C2) kcg_comp_struct_6((C1),(C2))


typedef struct_7 dataLocal_simulation;
/* simulation::dataLocal */
#define copy_dataLocal_simulation(C1, C2) copy_struct_7((C1), (C2))
#define kcg_comp_dataLocal_simulation(C1, C2) kcg_comp_struct_7((C1),(C2))


typedef struct {
  array_3 startPosition;
  array_3 endPosition;
  array_2 motormodes;
  array_7 blockErrors;
  array_1 points;
  array_7 pointErrors;
  array_4 signals0;
  array_4 signals1;
} struct_11;

#ifndef copy_struct_11
#define copy_struct_11(C1, C2) kcg_assign_struct(C1, C2, sizeof ( struct_11 ))
#endif /* copy_struct_11 */
#ifndef kcg_comp_struct_11
#define kcg_comp_struct_11(C1, C2)                                              \
(kcg_comp_array_3((&((C1)->startPosition)),(&((C2)->startPosition))) & (kcg_comp_array_3((&((C1)->endPosition)),(&((C2)->endPosition))) & (kcg_comp_array_2((&((C1)->motormodes)),(&((C2)->motormodes))) & (kcg_comp_array_7((&((C1)->blockErrors)),(&((C2)->blockErrors))) & (kcg_comp_array_1((&((C1)->points)),(&((C2)->points))) & (kcg_comp_array_7((&((C1)->pointErrors)),(&((C2)->pointErrors))) & (kcg_comp_array_4((&((C1)->signals0)),(&((C2)->signals0))) & (kcg_comp_array_4((&((C1)->signals1)),(&((C2)->signals1))))))))))\
  )                                                                             \

#endif /* kcg_comp_struct_11 */


typedef struct { array_6 contacts; array_8 extTrackData; } struct_10;

#ifndef copy_struct_10
#define copy_struct_10(C1, C2) kcg_assign_struct(C1, C2, sizeof ( struct_10 ))
#endif /* copy_struct_10 */
#ifndef kcg_comp_struct_10
#define kcg_comp_struct_10(C1, C2)                                              \
(kcg_comp_array_6((&((C1)->contacts)),(&((C2)->contacts))) & (kcg_comp_array_8((&((C1)->extTrackData)),(&((C2)->extTrackData))))\
  )                                                                             \

#endif /* kcg_comp_struct_10 */


typedef struct_8 dataAll_simulation;
/* simulation::dataAll */
#define copy_dataAll_simulation(C1, C2) copy_struct_8((C1), (C2))
#define kcg_comp_dataAll_simulation(C1, C2) kcg_comp_struct_8((C1),(C2))


typedef kcg_real positionType_simulation;
/* simulation::positionType */

typedef array_3 positionArray_simulation;
/* simulation::positionArray */
#define copy_positionArray_simulation(C1, C2) copy_array_3((C1), (C2))
#define kcg_comp_positionArray_simulation(C1, C2) kcg_comp_array_3((C1),(C2))


typedef array_7 errorArray_simulation;
/* simulation::errorArray */
#define copy_errorArray_simulation(C1, C2) copy_array_7((C1), (C2))
#define kcg_comp_errorArray_simulation(C1, C2) kcg_comp_array_7((C1),(C2))


typedef struct {
  array_3 positionHead;
  array_3 positionTail;
  array_7 blockErrors;
  array_7 pointErrors;
} struct_9;

#ifndef copy_struct_9
#define copy_struct_9(C1, C2) kcg_assign_struct(C1, C2, sizeof ( struct_9 ))
#endif /* copy_struct_9 */
#ifndef kcg_comp_struct_9
#define kcg_comp_struct_9(C1, C2)                                               \
(kcg_comp_array_3((&((C1)->positionHead)),(&((C2)->positionHead))) & (kcg_comp_array_3((&((C1)->positionTail)),(&((C2)->positionTail))) & (kcg_comp_array_7((&((C1)->blockErrors)),(&((C2)->blockErrors))) & (kcg_comp_array_7((&((C1)->pointErrors)),(&((C2)->pointErrors))))))\
  )                                                                             \

#endif /* kcg_comp_struct_9 */


typedef struct_9 controllerFeedbackDebug_simulation;
/* simulation::controllerFeedbackDebug */
#define copy_controllerFeedbackDebug_simulation(C1, C2) copy_struct_9((C1), (C2))
#define kcg_comp_controllerFeedbackDebug_simulation(C1, C2) kcg_comp_struct_9((C1),(C2))


typedef kcg_bool speedNewData_simulation;
/* simulation::speedNewData */

typedef kcg_bool trackShutdown_simulation;
/* simulation::trackShutdown */

typedef kcg_bool trackOccupied_simulation;
/* simulation::trackOccupied */

typedef kcg_real speedValue_simulation;
/* simulation::speedValue */

typedef struct_3 trackExtData_simulation;
/* simulation::trackExtData */
#define copy_trackExtData_simulation(C1, C2) copy_struct_3((C1), (C2))
#define kcg_comp_trackExtData_simulation(C1, C2) kcg_comp_struct_3((C1),(C2))


typedef array_8 trackExtDataArray_simulation;
/* simulation::trackExtDataArray */
#define copy_trackExtDataArray_simulation(C1, C2) copy_array_8((C1), (C2))
#define kcg_comp_trackExtDataArray_simulation(C1, C2) kcg_comp_array_8((C1),(C2))


typedef struct_1 ReedContactValue_simulation;
/* simulation::ReedContactValue */
#define copy_ReedContactValue_simulation(C1, C2) copy_struct_1((C1), (C2))
#define kcg_comp_ReedContactValue_simulation(C1, C2) kcg_comp_struct_1((C1),(C2))


typedef struct_2 contactPair_simulation;
/* simulation::contactPair */
#define copy_contactPair_simulation(C1, C2) copy_struct_2((C1), (C2))
#define kcg_comp_contactPair_simulation(C1, C2) kcg_comp_struct_2((C1),(C2))


typedef array_6 contactArray_simulation;
/* simulation::contactArray */
#define copy_contactArray_simulation(C1, C2) copy_array_6((C1), (C2))
#define kcg_comp_contactArray_simulation(C1, C2) kcg_comp_array_6((C1),(C2))


typedef struct_10 controllerFeedbackSensor_simulation;
/* simulation::controllerFeedbackSensor */
#define copy_controllerFeedbackSensor_simulation(C1, C2) copy_struct_10((C1), (C2))
#define kcg_comp_controllerFeedbackSensor_simulation(C1, C2) kcg_comp_struct_10((C1),(C2))


typedef array_4 signalArray_simulation;
/* simulation::signalArray */
#define copy_signalArray_simulation(C1, C2) copy_array_4((C1), (C2))
#define kcg_comp_signalArray_simulation(C1, C2) kcg_comp_array_4((C1),(C2))


typedef array_2 motormodeArray_simulation;
/* simulation::motormodeArray */
#define copy_motormodeArray_simulation(C1, C2) copy_array_2((C1), (C2))
#define kcg_comp_motormodeArray_simulation(C1, C2) kcg_comp_array_2((C1),(C2))


typedef array_1 pointArray_simulation;
/* simulation::pointArray */
#define copy_pointArray_simulation(C1, C2) copy_array_1((C1), (C2))
#define kcg_comp_pointArray_simulation(C1, C2) kcg_comp_array_1((C1),(C2))


typedef struct_11 displayDataT_simulation;
/* simulation::displayDataT */
#define copy_displayDataT_simulation(C1, C2) copy_struct_11((C1), (C2))
#define kcg_comp_displayDataT_simulation(C1, C2) kcg_comp_struct_11((C1),(C2))

#include "kcg_imported_functions.h"
#endif /* _KCG_TYPES_H__H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** kcg_types.h
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
