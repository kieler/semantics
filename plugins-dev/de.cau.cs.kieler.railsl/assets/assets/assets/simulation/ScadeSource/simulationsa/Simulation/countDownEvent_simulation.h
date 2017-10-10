/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#ifndef _countDownEvent_simulation_H_
#define _countDownEvent_simulation_H_

#include "kcg_types.h"
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  kcg_real cpt /* simulation::countDownEvent::cpt */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  /*     ------------------------ local memories  ------------------------   */
  
  kcg_real M_pre_;
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} outC_countDownEvent_simulation;
/* simulation::countDownEvent */
/*   =======================  state vector type  =======================   */

typedef struct {
  /*     --------------------- no memorised outputs  ---------------------   */
  
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  /*     ------------------------ local memories  ------------------------   */
  
  kcg_real M_pre_;
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} countDownEvent_SV_simulation;

/* macro for state saving and restoring */
#ifndef copy_countDownEvent_SV_simulation
#define copy_countDownEvent_SV_simulation(x, y)                                 \
  do { { (x).init = (y).init; (x).M_pre_ = (y).M_pre_; } }                      \
while(kcg_false)
#endif /* copy_countDownEvent_SV_simulation */
/*   ============  node initialisation and cycle functions  ============   */
extern void countDownEvent_reset_simulation(
  outC_countDownEvent_simulation *outC /* simulation::countDownEvent */);
extern void countDownEvent_simulation(
  kcg_bool Reset /* simulation::countDownEvent::Reset */,
  kcg_real N /* simulation::countDownEvent::N */,
  kcg_real step /* simulation::countDownEvent::step */,
  kcg_bool Event /* simulation::countDownEvent::Event */,
  outC_countDownEvent_simulation *outC /* simulation::countDownEvent */);
#endif /* _countDownEvent_simulation_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** countDownEvent_simulation.h
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
