/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#ifndef _contactSetting_simulation_H_
#define _contactSetting_simulation_H_

#include "kcg_types.h"
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  ReedContactValue_simulation contactSignal /* simulation::contactSetting::contactSignal */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  /*     ------------------------ local memories  ------------------------   */
  
  SSM_contactSetting_SM1_ST SSM_SM1_dispatch_nxt /* simulation::contactSetting::SM1::SSM_SM1_dispatch_nxt */;
  kcg_bool SSM_SM1_reset_act /* simulation::contactSetting::SM1::SSM_SM1_reset_act */;
  kcg_bool SSM_SM1_reset_nxt /* simulation::contactSetting::SM1::SSM_SM1_reset_nxt */;
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} outC_contactSetting_simulation;
/* simulation::contactSetting */
/*   =======================  state vector type  =======================   */

typedef struct {
  /*     --------------------- no memorised outputs  ---------------------   */
  
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  /*     ------------------------ local memories  ------------------------   */
  
  SSM_contactSetting_SM1_ST SSM_SM1_dispatch_nxt /* simulation::contactSetting::SM1::SSM_SM1_dispatch_nxt */;
  kcg_bool SSM_SM1_reset_act /* simulation::contactSetting::SM1::SSM_SM1_reset_act */;
  kcg_bool SSM_SM1_reset_nxt /* simulation::contactSetting::SM1::SSM_SM1_reset_nxt */;
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} contactSetting_SV_simulation;

/* macro for state saving and restoring */
#ifndef copy_contactSetting_SV_simulation
#define copy_contactSetting_SV_simulation(x, y)                                 \
  do {                                                                          \
  {                                                                             \
    (x).init = (y).init;                                                        \
    (x).SSM_SM1_dispatch_nxt = (y).SSM_SM1_dispatch_nxt;                        \
    (x).SSM_SM1_reset_act = (y).SSM_SM1_reset_act;                              \
    (x).SSM_SM1_reset_nxt = (y).SSM_SM1_reset_nxt;                              \
  }                                                                             \
}                                                                               \
while(kcg_false)
#endif /* copy_contactSetting_SV_simulation */
/*   ============  node initialisation and cycle functions  ============   */
extern void contactSetting_reset_simulation(
  outC_contactSetting_simulation *outC /* simulation::contactSetting */);
extern void contactSetting_simulation(
  positionType_simulation head_pos /* simulation::contactSetting::head_pos */,
  positionType_simulation tail_pos /* simulation::contactSetting::tail_pos */,
  positionType_simulation contact_pos /* simulation::contactSetting::contact_pos */,
  TrainDirectionType_simulation in_direction /* simulation::contactSetting::in_direction */,
  outC_contactSetting_simulation *outC /* simulation::contactSetting */);
#endif /* _contactSetting_simulation_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** contactSetting_simulation.h
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
