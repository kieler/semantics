/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
#ifndef _RisingEdge_digital_H_
#define _RisingEdge_digital_H_

#include "kcg_types.h"
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  kcg_bool RE_Output /* digital::RisingEdge::RE_Output */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  /*     ------------------------ local memories  ------------------------   */
  
  kcg_bool M_pre_;
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} outC_RisingEdge_digital;
/* digital::RisingEdge */
/*   =======================  state vector type  =======================   */

typedef struct {
  /*     --------------------- no memorised outputs  ---------------------   */
  
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  /*     ------------------------ local memories  ------------------------   */
  
  kcg_bool M_pre_;
  /*     -------------------- no sub nodes' contexts  --------------------   */
  
} RisingEdge_SV_digital;

/* macro for state saving and restoring */
#ifndef copy_RisingEdge_SV_digital
#define copy_RisingEdge_SV_digital(x, y)                                        \
  do { { (x).init = (y).init; (x).M_pre_ = (y).M_pre_; } }                      \
while(kcg_false)
#endif /* copy_RisingEdge_SV_digital */
/*   ============  node initialisation and cycle functions  ============   */
extern void RisingEdge_reset_digital(
  outC_RisingEdge_digital *outC /* digital::RisingEdge */);
extern void RisingEdge_digital(
  kcg_bool RE_Input /* digital::RisingEdge::RE_Input */,
  outC_RisingEdge_digital *outC /* digital::RisingEdge */);
#endif /* _RisingEdge_digital_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** RisingEdge_digital.h
** Generation date: 2009-02-24T01:42:11
*************************************************************$ */
