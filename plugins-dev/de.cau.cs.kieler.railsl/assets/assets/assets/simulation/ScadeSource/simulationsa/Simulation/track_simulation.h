/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#ifndef _track_simulation_H_
#define _track_simulation_H_

#include "kcg_types.h"
#include "countDownEvent_simulation.h"
#include "kcg_imported_functions.h"
#include "limiterWithDefault_simulation.h"
#include "contactSetting_simulation.h"
#include "RisingEdge_digital.h"
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  dataAll_simulation output_front /* simulation::track::output_front */;
  dataLocal_simulation output_rear /* simulation::track::output_rear */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  kcg_bool _1_init;
  /*     ------------------------ local memories  ------------------------   */
  
  kcg_real _L11 /* simulation::track::SM2::track_occupied::_L11 */;
  TrainDirectionType_simulation _L425 /* simulation::track::_L425 */;
  kcg_bool _L293 /* simulation::track::_L293 */;
  SSM_track_SM3_ST SSM_SM3_dispatch_nxt /* simulation::track::SM3::SSM_SM3_dispatch_nxt */;
  kcg_bool _L294 /* simulation::track::_L294 */;
  kcg_bool SSM_SM3_reset_act /* simulation::track::SM3::SSM_SM3_reset_act */;
  kcg_bool SSM_SM3_reset_nxt /* simulation::track::SM3::SSM_SM3_reset_nxt */;
  kcg_bool _L339 /* simulation::track::_L339 */;
  kcg_bool _L341 /* simulation::track::_L341 */;
  SSM_track_SM2_ST SSM_SM2_dispatch_nxt /* simulation::track::SM2::SSM_SM2_dispatch_nxt */;
  kcg_bool SSM_SM2_reset_act /* simulation::track::SM2::SSM_SM2_reset_act */;
  kcg_bool SSM_SM2_reset_nxt /* simulation::track::SM2::SSM_SM2_reset_nxt */;
  SSM_track_SM4_ST SSM_SM4_dispatch_nxt /* simulation::track::SM4::SSM_SM4_dispatch_nxt */;
  TrainAlignmentType_simulation _L393 /* simulation::track::_L393 */;
  kcg_bool SSM_SM4_reset_nxt /* simulation::track::SM4::SSM_SM4_reset_nxt */;
  SSM_track_occupied_SM3_ST _1_SSM_SM3_dispatch_nxt /* simulation::track::SM2::track_occupied::SM3::SSM_SM3_dispatch_nxt */;
  kcg_bool M_pre_;
  kcg_bool _1_M_pre_;
  kcg_bool _2_M_pre_;
  /*     ---------------------  sub nodes' contexts  ---------------------   */
  
  outC_RisingEdge_digital Context_RisingEdge /* digital::RisingEdge */;
  outC_RisingEdge_digital _1_Context_RisingEdge /* digital::RisingEdge */;
  outC_RisingEdge_digital _2_Context_RisingEdge /* digital::RisingEdge */;
  outC_RisingEdge_digital _3_Context_RisingEdge /* digital::RisingEdge */;
  outC_contactSetting_simulation Context_contactSetting /* simulation::contactSetting */;
  outC_contactSetting_simulation _1_Context_contactSetting /* simulation::contactSetting */;
  outC_countDownEvent_simulation Context_countDownEvent /* simulation::countDownEvent */;
} outC_track_simulation;
/* simulation::track */
/*   =======================  state vector type  =======================   */

typedef struct {
  /*     --------------------- no memorised outputs  ---------------------   */
  
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  kcg_bool _1_init;
  /*     ------------------------ local memories  ------------------------   */
  
  kcg_real _L11 /* simulation::track::SM2::track_occupied::_L11 */;
  TrainDirectionType_simulation _L425 /* simulation::track::_L425 */;
  kcg_bool _L293 /* simulation::track::_L293 */;
  SSM_track_SM3_ST SSM_SM3_dispatch_nxt /* simulation::track::SM3::SSM_SM3_dispatch_nxt */;
  kcg_bool _L294 /* simulation::track::_L294 */;
  kcg_bool SSM_SM3_reset_act /* simulation::track::SM3::SSM_SM3_reset_act */;
  kcg_bool SSM_SM3_reset_nxt /* simulation::track::SM3::SSM_SM3_reset_nxt */;
  kcg_bool _L339 /* simulation::track::_L339 */;
  kcg_bool _L341 /* simulation::track::_L341 */;
  SSM_track_SM2_ST SSM_SM2_dispatch_nxt /* simulation::track::SM2::SSM_SM2_dispatch_nxt */;
  kcg_bool SSM_SM2_reset_act /* simulation::track::SM2::SSM_SM2_reset_act */;
  kcg_bool SSM_SM2_reset_nxt /* simulation::track::SM2::SSM_SM2_reset_nxt */;
  SSM_track_SM4_ST SSM_SM4_dispatch_nxt /* simulation::track::SM4::SSM_SM4_dispatch_nxt */;
  TrainAlignmentType_simulation _L393 /* simulation::track::_L393 */;
  kcg_bool SSM_SM4_reset_nxt /* simulation::track::SM4::SSM_SM4_reset_nxt */;
  SSM_track_occupied_SM3_ST _1_SSM_SM3_dispatch_nxt /* simulation::track::SM2::track_occupied::SM3::SSM_SM3_dispatch_nxt */;
  kcg_bool M_pre_;
  kcg_bool _1_M_pre_;
  kcg_bool _2_M_pre_;
  /*     ---------------------  sub nodes' contexts  ---------------------   */
  
  RisingEdge_SV_digital Context_RisingEdge /* digital::RisingEdge */;
  RisingEdge_SV_digital _1_Context_RisingEdge /* digital::RisingEdge */;
  RisingEdge_SV_digital _2_Context_RisingEdge /* digital::RisingEdge */;
  RisingEdge_SV_digital _3_Context_RisingEdge /* digital::RisingEdge */;
  contactSetting_SV_simulation Context_contactSetting /* simulation::contactSetting */;
  contactSetting_SV_simulation _1_Context_contactSetting /* simulation::contactSetting */;
  countDownEvent_SV_simulation Context_countDownEvent /* simulation::countDownEvent */;
} track_SV_simulation;

/* macro for state saving and restoring */
#ifndef copy_track_SV_simulation
#define copy_track_SV_simulation(x, y)                                          \
  do {                                                                          \
  {                                                                             \
    (x).init = (y).init;                                                        \
    (x)._1_init = (y)._1_init;                                                  \
    (x)._L11 = (y)._L11;                                                        \
    (x)._L425 = (y)._L425;                                                      \
    (x)._L293 = (y)._L293;                                                      \
    (x).SSM_SM3_dispatch_nxt = (y).SSM_SM3_dispatch_nxt;                        \
    (x)._L294 = (y)._L294;                                                      \
    (x).SSM_SM3_reset_act = (y).SSM_SM3_reset_act;                              \
    (x).SSM_SM3_reset_nxt = (y).SSM_SM3_reset_nxt;                              \
    (x)._L339 = (y)._L339;                                                      \
    (x)._L341 = (y)._L341;                                                      \
    (x).SSM_SM2_dispatch_nxt = (y).SSM_SM2_dispatch_nxt;                        \
    (x).SSM_SM2_reset_act = (y).SSM_SM2_reset_act;                              \
    (x).SSM_SM2_reset_nxt = (y).SSM_SM2_reset_nxt;                              \
    (x).SSM_SM4_dispatch_nxt = (y).SSM_SM4_dispatch_nxt;                        \
    (x)._L393 = (y)._L393;                                                      \
    (x).SSM_SM4_reset_nxt = (y).SSM_SM4_reset_nxt;                              \
    (x)._1_SSM_SM3_dispatch_nxt = (y)._1_SSM_SM3_dispatch_nxt;                  \
    (x).M_pre_ = (y).M_pre_;                                                    \
    (x)._1_M_pre_ = (y)._1_M_pre_;                                              \
    (x)._2_M_pre_ = (y)._2_M_pre_;                                              \
    copy_RisingEdge_SV_digital ( (x).Context_RisingEdge , (y).Context_RisingEdge );\
    copy_RisingEdge_SV_digital ( (x)._1_Context_RisingEdge , (y)._1_Context_RisingEdge );\
    copy_RisingEdge_SV_digital ( (x)._2_Context_RisingEdge , (y)._2_Context_RisingEdge );\
    copy_RisingEdge_SV_digital ( (x)._3_Context_RisingEdge , (y)._3_Context_RisingEdge );\
    copy_contactSetting_SV_simulation ( (x).Context_contactSetting , (y).Context_contactSetting );\
    copy_contactSetting_SV_simulation ( (x)._1_Context_contactSetting , (y)._1_Context_contactSetting );\
    copy_countDownEvent_SV_simulation ( (x).Context_countDownEvent , (y).Context_countDownEvent );\
  }                                                                             \
}                                                                               \
while(kcg_false)
#endif /* copy_track_SV_simulation */
/*   ============  node initialisation and cycle functions  ============   */
extern void track_reset_simulation(
  outC_track_simulation *outC /* simulation::track */);
extern void track_simulation(
  dataAll_simulation *input_front /* simulation::track::input_front */,
  dataLocal_simulation *input_rear /* simulation::track::input_rear */,
  kcg_int track_nr /* simulation::track::track_nr */,
  outC_track_simulation *outC /* simulation::track */);
#endif /* _track_simulation_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** track_simulation.h
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
