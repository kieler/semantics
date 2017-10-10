/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#ifndef _tracksimulator_simulation_H_
#define _tracksimulator_simulation_H_

#include "kcg_types.h"
#include "switchAlignment_simulation.h"
#include "switchPointCross_simulation.h"
#include "switchPoint2_simulation.h"
#include "switchPoint1_simulation.h"
#include "track_simulation.h"
/*   ========================== context type  ==========================   */

typedef struct {
  /*     ---------------------------  outputs  ---------------------------   */
  
  controllerFeedbackDebug_simulation feedback_debug /* simulation::tracksimulator::feedback_debug */;
  controllerFeedbackSensor_simulation feedback_sensors /* simulation::tracksimulator::feedback_sensors */;
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  /*     ------------------------ local memories  ------------------------   */
  
  dataLocal_simulation _L112_1 /* simulation::tracksimulator::kickingHorsePass_670__L112 */;
  dataLocal_simulation _L115_1 /* simulation::tracksimulator::kickingHorsePass_670__L115 */;
  dataLocal_simulation _L117_1 /* simulation::tracksimulator::kickingHorsePass_670__L117 */;
  dataLocal_simulation _L123_1 /* simulation::tracksimulator::kickingHorsePass_670__L123 */;
  dataLocal_simulation _L122_1 /* simulation::tracksimulator::kickingHorsePass_670__L122 */;
  dataLocal_simulation _L127_1 /* simulation::tracksimulator::kickingHorsePass_670__L127 */;
  dataLocal_simulation _L80_1 /* simulation::tracksimulator::outerCircle_700__L80 */;
  dataLocal_simulation _L130_1 /* simulation::tracksimulator::kickingHorsePass_670__L130 */;
  dataLocal_simulation _L75_1 /* simulation::tracksimulator::outerCircle_700__L75 */;
  dataLocal_simulation _L133_1 /* simulation::tracksimulator::kickingHorsePass_670__L133 */;
  dataLocal_simulation _L132_1 /* simulation::tracksimulator::kickingHorsePass_670__L132 */;
  dataLocal_simulation _L71_1 /* simulation::tracksimulator::outerCircle_700__L71 */;
  dataLocal_simulation _L69_1 /* simulation::tracksimulator::outerCircle_700__L69 */;
  dataLocal_simulation _L64_1 /* simulation::tracksimulator::outerCircle_700__L64 */;
  dataLocal_simulation _L65_1 /* simulation::tracksimulator::outerCircle_700__L65 */;
  dataLocal_simulation _L53_1 /* simulation::tracksimulator::outerCircle_700__L53 */;
  dataLocal_simulation _L88_1 /* simulation::tracksimulator::innerCircle_724__L88 */;
  dataLocal_simulation _L54_1 /* simulation::tracksimulator::outerCircle_700__L54 */;
  dataLocal_simulation _L86_1 /* simulation::tracksimulator::innerCircle_724__L86 */;
  dataLocal_simulation _L51_1 /* simulation::tracksimulator::outerCircle_700__L51 */;
  dataLocal_simulation _L84_1 /* simulation::tracksimulator::innerCircle_724__L84 */;
  dataLocal_simulation _L82_1 /* simulation::tracksimulator::innerCircle_724__L82 */;
  dataLocal_simulation _L44_1 /* simulation::tracksimulator::outerCircle_700__L44 */;
  dataLocal_simulation _L77_1 /* simulation::tracksimulator::innerCircle_724__L77 */;
  dataLocal_simulation _L72_1 /* simulation::tracksimulator::innerCircle_724__L72 */;
  dataLocal_simulation _L42_1 /* simulation::tracksimulator::outerCircle_700__L42 */;
  dataLocal_simulation _L73_1 /* simulation::tracksimulator::innerCircle_724__L73 */;
  dataLocal_simulation _L39_1 /* simulation::tracksimulator::outerCircle_700__L39 */;
  dataLocal_simulation _1__L69_1 /* simulation::tracksimulator::innerCircle_724__L69 */;
  dataLocal_simulation _L70_1 /* simulation::tracksimulator::innerCircle_724__L70 */;
  dataLocal_simulation _L35_1 /* simulation::tracksimulator::outerCircle_700__L35 */;
  dataLocal_simulation _L32_1 /* simulation::tracksimulator::outerCircle_700__L32 */;
  dataLocal_simulation _L68_1 /* simulation::tracksimulator::innerCircle_724__L68 */;
  dataLocal_simulation _L66_1 /* simulation::tracksimulator::innerCircle_724__L66 */;
  dataLocal_simulation _L28_1 /* simulation::tracksimulator::outerCircle_700__L28 */;
  dataLocal_simulation _L57_1 /* simulation::tracksimulator::innerCircle_724__L57 */;
  dataLocal_simulation _L26_1 /* simulation::tracksimulator::outerCircle_700__L26 */;
  dataLocal_simulation _1__L53_1 /* simulation::tracksimulator::innerCircle_724__L53 */;
  dataLocal_simulation _L15_1 /* simulation::tracksimulator::outerCircle_700__L15 */;
  dataLocal_simulation _L5_1 /* simulation::tracksimulator::outerCircle_700__L5 */;
  dataLocal_simulation _L48_1 /* simulation::tracksimulator::innerCircle_724__L48 */;
  dataLocal_simulation _L40_1 /* simulation::tracksimulator::innerCircle_724__L40 */;
  dataLocal_simulation _L2_1 /* simulation::tracksimulator::outerCircle_700__L2 */;
  dataLocal_simulation _1__L32_1 /* simulation::tracksimulator::innerCircle_724__L32 */;
  dataLocal_simulation _L91_1 /* simulation::tracksimulator::outerCircle_700__L91 */;
  dataLocal_simulation _1__L42_1 /* simulation::tracksimulator::kickingHorsePass_670__L42 */;
  dataLocal_simulation _L90_1 /* simulation::tracksimulator::outerCircle_700__L90 */;
  dataLocal_simulation _L29_1 /* simulation::tracksimulator::innerCircle_724__L29 */;
  dataLocal_simulation _L97_1 /* simulation::tracksimulator::outerCircle_700__L97 */;
  dataLocal_simulation _1__L51_1 /* simulation::tracksimulator::kickingHorsePass_670__L51 */;
  dataLocal_simulation _L24_1 /* simulation::tracksimulator::innerCircle_724__L24 */;
  dataLocal_simulation _L16_1 /* simulation::tracksimulator::innerCircle_724__L16 */;
  dataLocal_simulation _1__L54_1 /* simulation::tracksimulator::kickingHorsePass_670__L54 */;
  dataLocal_simulation _L17_1 /* simulation::tracksimulator::innerCircle_724__L17 */;
  dataLocal_simulation _1__L57_1 /* simulation::tracksimulator::kickingHorsePass_670__L57 */;
  dataLocal_simulation _L11_1 /* simulation::tracksimulator::innerCircle_724__L11 */;
  dataLocal_simulation _1__L2_1 /* simulation::tracksimulator::innerCircle_724__L2 */;
  dataLocal_simulation _1__L91_1 /* simulation::tracksimulator::kickingHorsePass_670__L91 */;
  dataLocal_simulation _L121_1 /* simulation::tracksimulator::innerCircle_724__L121 */;
  dataLocal_simulation _L107_1 /* simulation::tracksimulator::kickingHorsePass_670__L107 */;
  dataLocal_simulation _L163_1 /* simulation::tracksimulator::kickingHorsePass_670__L163 */;
  dataLocal_simulation _L20_1 /* simulation::tracksimulator::outerCircle_700__L20 */;
  dataLocal_simulation _L76_1 /* simulation::tracksimulator::outerCircle_700__L76 */;
  dataLocal_simulation _L93_1 /* simulation::tracksimulator::outerCircle_700__L93 */;
  dataLocal_simulation _L49_1 /* simulation::tracksimulator::innerCircle_724__L49 */;
  dataLocal_simulation _L61_1 /* simulation::tracksimulator::innerCircle_724__L61 */;
  dataLocal_simulation _L78_1 /* simulation::tracksimulator::innerCircle_724__L78 */;
  dataLocal_simulation _1__L132_1 /* simulation::tracksimulator::outerCircle_700__L132 */;
  dataLocal_simulation _L131_1 /* simulation::tracksimulator::outerCircle_700__L131 */;
  dataLocal_simulation _L89_1 /* simulation::tracksimulator::innerCircle_724__L89 */;
  dataLocal_simulation _L140_1 /* simulation::tracksimulator::innerCircle_724__L140 */;
  dataLocal_simulation _L141_1 /* simulation::tracksimulator::innerCircle_724__L141 */;
  dataLocal_simulation _1__L20_1 /* simulation::tracksimulator::kickingHorsePass_670__L20 */;
  dataLocal_simulation _L21_1 /* simulation::tracksimulator::kickingHorsePass_670__L21 */;
  dataLocal_simulation _L33_1 /* simulation::tracksimulator::kickingHorsePass_670__L33 */;
  dataLocal_simulation _1__L40_1 /* simulation::tracksimulator::kickingHorsePass_670__L40 */;
  dataLocal_simulation _1__L39_1 /* simulation::tracksimulator::kickingHorsePass_670__L39 */;
  dataLocal_simulation _1__L66_1 /* simulation::tracksimulator::kickingHorsePass_670__L66 */;
  dataLocal_simulation _1__L68_1 /* simulation::tracksimulator::kickingHorsePass_670__L68 */;
  dataLocal_simulation _1__L70_1 /* simulation::tracksimulator::kickingHorsePass_670__L70 */;
  dataLocal_simulation _1__L72_1 /* simulation::tracksimulator::kickingHorsePass_670__L72 */;
  dataLocal_simulation _1__L71_1 /* simulation::tracksimulator::kickingHorsePass_670__L71 */;
  dataLocal_simulation _1__L75_1 /* simulation::tracksimulator::kickingHorsePass_670__L75 */;
  dataLocal_simulation _L74_1 /* simulation::tracksimulator::kickingHorsePass_670__L74 */;
  dataLocal_simulation _1__L78_1 /* simulation::tracksimulator::kickingHorsePass_670__L78 */;
  dataLocal_simulation _1__L77_1 /* simulation::tracksimulator::kickingHorsePass_670__L77 */;
  dataLocal_simulation _1__L89_1 /* simulation::tracksimulator::kickingHorsePass_670__L89 */;
  dataLocal_simulation _L96_1 /* simulation::tracksimulator::kickingHorsePass_670__L96 */;
  dataLocal_simulation _L99_1 /* simulation::tracksimulator::kickingHorsePass_670__L99 */;
  dataLocal_simulation _L102_1 /* simulation::tracksimulator::kickingHorsePass_670__L102 */;
  dataLocal_simulation _L105_1 /* simulation::tracksimulator::kickingHorsePass_670__L105 */;
  struct_7 M_pre_;
  struct_7 _1_M_pre_;
  struct_7 _2_M_pre_;
  struct_7 _3_M_pre_;
  struct_7 _4_M_pre_;
  struct_7 _5_M_pre_;
  struct_7 _6_M_pre_;
  struct_7 _7_M_pre_;
  struct_7 _8_M_pre_;
  /*     ---------------------  sub nodes' contexts  ---------------------   */
  
  outC_track_simulation Context_track /* simulation::track */;
  outC_track_simulation _1_Context_track /* simulation::track */;
  outC_track_simulation _2_Context_track /* simulation::track */;
  outC_track_simulation _3_Context_track /* simulation::track */;
  outC_track_simulation _4_Context_track /* simulation::track */;
  outC_track_simulation _5_Context_track /* simulation::track */;
  outC_track_simulation _6_Context_track /* simulation::track */;
  outC_track_simulation _7_Context_track /* simulation::track */;
  outC_track_simulation _8_Context_track /* simulation::track */;
  outC_track_simulation _9_Context_track /* simulation::track */;
  outC_track_simulation _10_Context_track /* simulation::track */;
  outC_track_simulation _11_Context_track /* simulation::track */;
  outC_track_simulation _12_Context_track /* simulation::track */;
  outC_track_simulation _13_Context_track /* simulation::track */;
  outC_track_simulation _14_Context_track /* simulation::track */;
  outC_track_simulation _15_Context_track /* simulation::track */;
  outC_track_simulation _16_Context_track /* simulation::track */;
  outC_track_simulation _17_Context_track /* simulation::track */;
  outC_track_simulation _18_Context_track /* simulation::track */;
  outC_track_simulation _19_Context_track /* simulation::track */;
  outC_track_simulation _20_Context_track /* simulation::track */;
  outC_track_simulation _21_Context_track /* simulation::track */;
  outC_track_simulation _22_Context_track /* simulation::track */;
  outC_track_simulation _23_Context_track /* simulation::track */;
  outC_track_simulation _24_Context_track /* simulation::track */;
  outC_track_simulation _25_Context_track /* simulation::track */;
  outC_track_simulation _26_Context_track /* simulation::track */;
  outC_track_simulation _27_Context_track /* simulation::track */;
  outC_track_simulation _28_Context_track /* simulation::track */;
  outC_track_simulation _29_Context_track /* simulation::track */;
  outC_track_simulation _30_Context_track /* simulation::track */;
  outC_track_simulation _31_Context_track /* simulation::track */;
  outC_track_simulation _32_Context_track /* simulation::track */;
  outC_track_simulation _33_Context_track /* simulation::track */;
  outC_track_simulation _34_Context_track /* simulation::track */;
  outC_track_simulation _35_Context_track /* simulation::track */;
  outC_track_simulation _36_Context_track /* simulation::track */;
  outC_track_simulation _37_Context_track /* simulation::track */;
  outC_track_simulation _38_Context_track /* simulation::track */;
  outC_track_simulation _39_Context_track /* simulation::track */;
  outC_track_simulation _40_Context_track /* simulation::track */;
  outC_track_simulation _41_Context_track /* simulation::track */;
  outC_track_simulation _42_Context_track /* simulation::track */;
  outC_track_simulation _43_Context_track /* simulation::track */;
  outC_track_simulation _44_Context_track /* simulation::track */;
  outC_track_simulation _45_Context_track /* simulation::track */;
  outC_track_simulation _46_Context_track /* simulation::track */;
  outC_track_simulation _47_Context_track /* simulation::track */;
  outC_switchPoint1_simulation Context_switchPoint1 /* simulation::switchPoint1 */;
  outC_switchPoint1_simulation _1_Context_switchPoint1 /* simulation::switchPoint1 */;
  outC_switchPoint1_simulation _2_Context_switchPoint1 /* simulation::switchPoint1 */;
  outC_switchPoint1_simulation _3_Context_switchPoint1 /* simulation::switchPoint1 */;
  outC_switchPoint1_simulation _4_Context_switchPoint1 /* simulation::switchPoint1 */;
  outC_switchPoint1_simulation _5_Context_switchPoint1 /* simulation::switchPoint1 */;
  outC_switchPoint1_simulation _6_Context_switchPoint1 /* simulation::switchPoint1 */;
  outC_switchPoint1_simulation _7_Context_switchPoint1 /* simulation::switchPoint1 */;
  outC_switchPoint1_simulation _8_Context_switchPoint1 /* simulation::switchPoint1 */;
  outC_switchPoint1_simulation _9_Context_switchPoint1 /* simulation::switchPoint1 */;
  outC_switchPoint1_simulation _10_Context_switchPoint1 /* simulation::switchPoint1 */;
  outC_switchPoint1_simulation _11_Context_switchPoint1 /* simulation::switchPoint1 */;
  outC_switchPoint1_simulation _12_Context_switchPoint1 /* simulation::switchPoint1 */;
  outC_switchPoint2_simulation Context_switchPoint2 /* simulation::switchPoint2 */;
  outC_switchPoint2_simulation _1_Context_switchPoint2 /* simulation::switchPoint2 */;
  outC_switchPoint2_simulation _2_Context_switchPoint2 /* simulation::switchPoint2 */;
  outC_switchPoint2_simulation _3_Context_switchPoint2 /* simulation::switchPoint2 */;
  outC_switchPoint2_simulation _4_Context_switchPoint2 /* simulation::switchPoint2 */;
  outC_switchPoint2_simulation _5_Context_switchPoint2 /* simulation::switchPoint2 */;
  outC_switchPoint2_simulation _6_Context_switchPoint2 /* simulation::switchPoint2 */;
  outC_switchPoint2_simulation _7_Context_switchPoint2 /* simulation::switchPoint2 */;
  outC_switchPoint2_simulation _8_Context_switchPoint2 /* simulation::switchPoint2 */;
  outC_switchPoint2_simulation _9_Context_switchPoint2 /* simulation::switchPoint2 */;
  outC_switchPoint2_simulation _10_Context_switchPoint2 /* simulation::switchPoint2 */;
  outC_switchPoint2_simulation _11_Context_switchPoint2 /* simulation::switchPoint2 */;
  outC_switchPoint2_simulation _12_Context_switchPoint2 /* simulation::switchPoint2 */;
  outC_switchPointCross_simulation Context_switchPointCross /* simulation::switchPointCross */;
  outC_switchPointCross_simulation _1_Context_switchPointCross /* simulation::switchPointCross */;
} outC_tracksimulator_simulation;
/* simulation::tracksimulator */
/*   =======================  state vector type  =======================   */

typedef struct {
  /*     --------------------- no memorised outputs  ---------------------   */
  
  /*     -----------------------  no local probes  -----------------------   */
  
  /*     ------------------- initialisation variables  -------------------   */
  
  kcg_bool init;
  /*     ------------------------ local memories  ------------------------   */
  
  dataLocal_simulation _L112_1 /* simulation::tracksimulator::kickingHorsePass_670__L112 */;
  dataLocal_simulation _L115_1 /* simulation::tracksimulator::kickingHorsePass_670__L115 */;
  dataLocal_simulation _L117_1 /* simulation::tracksimulator::kickingHorsePass_670__L117 */;
  dataLocal_simulation _L123_1 /* simulation::tracksimulator::kickingHorsePass_670__L123 */;
  dataLocal_simulation _L122_1 /* simulation::tracksimulator::kickingHorsePass_670__L122 */;
  dataLocal_simulation _L127_1 /* simulation::tracksimulator::kickingHorsePass_670__L127 */;
  dataLocal_simulation _L80_1 /* simulation::tracksimulator::outerCircle_700__L80 */;
  dataLocal_simulation _L130_1 /* simulation::tracksimulator::kickingHorsePass_670__L130 */;
  dataLocal_simulation _L75_1 /* simulation::tracksimulator::outerCircle_700__L75 */;
  dataLocal_simulation _L133_1 /* simulation::tracksimulator::kickingHorsePass_670__L133 */;
  dataLocal_simulation _L132_1 /* simulation::tracksimulator::kickingHorsePass_670__L132 */;
  dataLocal_simulation _L71_1 /* simulation::tracksimulator::outerCircle_700__L71 */;
  dataLocal_simulation _L69_1 /* simulation::tracksimulator::outerCircle_700__L69 */;
  dataLocal_simulation _L64_1 /* simulation::tracksimulator::outerCircle_700__L64 */;
  dataLocal_simulation _L65_1 /* simulation::tracksimulator::outerCircle_700__L65 */;
  dataLocal_simulation _L53_1 /* simulation::tracksimulator::outerCircle_700__L53 */;
  dataLocal_simulation _L88_1 /* simulation::tracksimulator::innerCircle_724__L88 */;
  dataLocal_simulation _L54_1 /* simulation::tracksimulator::outerCircle_700__L54 */;
  dataLocal_simulation _L86_1 /* simulation::tracksimulator::innerCircle_724__L86 */;
  dataLocal_simulation _L51_1 /* simulation::tracksimulator::outerCircle_700__L51 */;
  dataLocal_simulation _L84_1 /* simulation::tracksimulator::innerCircle_724__L84 */;
  dataLocal_simulation _L82_1 /* simulation::tracksimulator::innerCircle_724__L82 */;
  dataLocal_simulation _L44_1 /* simulation::tracksimulator::outerCircle_700__L44 */;
  dataLocal_simulation _L77_1 /* simulation::tracksimulator::innerCircle_724__L77 */;
  dataLocal_simulation _L72_1 /* simulation::tracksimulator::innerCircle_724__L72 */;
  dataLocal_simulation _L42_1 /* simulation::tracksimulator::outerCircle_700__L42 */;
  dataLocal_simulation _L73_1 /* simulation::tracksimulator::innerCircle_724__L73 */;
  dataLocal_simulation _L39_1 /* simulation::tracksimulator::outerCircle_700__L39 */;
  dataLocal_simulation _1__L69_1 /* simulation::tracksimulator::innerCircle_724__L69 */;
  dataLocal_simulation _L70_1 /* simulation::tracksimulator::innerCircle_724__L70 */;
  dataLocal_simulation _L35_1 /* simulation::tracksimulator::outerCircle_700__L35 */;
  dataLocal_simulation _L32_1 /* simulation::tracksimulator::outerCircle_700__L32 */;
  dataLocal_simulation _L68_1 /* simulation::tracksimulator::innerCircle_724__L68 */;
  dataLocal_simulation _L66_1 /* simulation::tracksimulator::innerCircle_724__L66 */;
  dataLocal_simulation _L28_1 /* simulation::tracksimulator::outerCircle_700__L28 */;
  dataLocal_simulation _L57_1 /* simulation::tracksimulator::innerCircle_724__L57 */;
  dataLocal_simulation _L26_1 /* simulation::tracksimulator::outerCircle_700__L26 */;
  dataLocal_simulation _1__L53_1 /* simulation::tracksimulator::innerCircle_724__L53 */;
  dataLocal_simulation _L15_1 /* simulation::tracksimulator::outerCircle_700__L15 */;
  dataLocal_simulation _L5_1 /* simulation::tracksimulator::outerCircle_700__L5 */;
  dataLocal_simulation _L48_1 /* simulation::tracksimulator::innerCircle_724__L48 */;
  dataLocal_simulation _L40_1 /* simulation::tracksimulator::innerCircle_724__L40 */;
  dataLocal_simulation _L2_1 /* simulation::tracksimulator::outerCircle_700__L2 */;
  dataLocal_simulation _1__L32_1 /* simulation::tracksimulator::innerCircle_724__L32 */;
  dataLocal_simulation _L91_1 /* simulation::tracksimulator::outerCircle_700__L91 */;
  dataLocal_simulation _1__L42_1 /* simulation::tracksimulator::kickingHorsePass_670__L42 */;
  dataLocal_simulation _L90_1 /* simulation::tracksimulator::outerCircle_700__L90 */;
  dataLocal_simulation _L29_1 /* simulation::tracksimulator::innerCircle_724__L29 */;
  dataLocal_simulation _L97_1 /* simulation::tracksimulator::outerCircle_700__L97 */;
  dataLocal_simulation _1__L51_1 /* simulation::tracksimulator::kickingHorsePass_670__L51 */;
  dataLocal_simulation _L24_1 /* simulation::tracksimulator::innerCircle_724__L24 */;
  dataLocal_simulation _L16_1 /* simulation::tracksimulator::innerCircle_724__L16 */;
  dataLocal_simulation _1__L54_1 /* simulation::tracksimulator::kickingHorsePass_670__L54 */;
  dataLocal_simulation _L17_1 /* simulation::tracksimulator::innerCircle_724__L17 */;
  dataLocal_simulation _1__L57_1 /* simulation::tracksimulator::kickingHorsePass_670__L57 */;
  dataLocal_simulation _L11_1 /* simulation::tracksimulator::innerCircle_724__L11 */;
  dataLocal_simulation _1__L2_1 /* simulation::tracksimulator::innerCircle_724__L2 */;
  dataLocal_simulation _1__L91_1 /* simulation::tracksimulator::kickingHorsePass_670__L91 */;
  dataLocal_simulation _L121_1 /* simulation::tracksimulator::innerCircle_724__L121 */;
  dataLocal_simulation _L107_1 /* simulation::tracksimulator::kickingHorsePass_670__L107 */;
  dataLocal_simulation _L163_1 /* simulation::tracksimulator::kickingHorsePass_670__L163 */;
  dataLocal_simulation _L20_1 /* simulation::tracksimulator::outerCircle_700__L20 */;
  dataLocal_simulation _L76_1 /* simulation::tracksimulator::outerCircle_700__L76 */;
  dataLocal_simulation _L93_1 /* simulation::tracksimulator::outerCircle_700__L93 */;
  dataLocal_simulation _L49_1 /* simulation::tracksimulator::innerCircle_724__L49 */;
  dataLocal_simulation _L61_1 /* simulation::tracksimulator::innerCircle_724__L61 */;
  dataLocal_simulation _L78_1 /* simulation::tracksimulator::innerCircle_724__L78 */;
  dataLocal_simulation _1__L132_1 /* simulation::tracksimulator::outerCircle_700__L132 */;
  dataLocal_simulation _L131_1 /* simulation::tracksimulator::outerCircle_700__L131 */;
  dataLocal_simulation _L89_1 /* simulation::tracksimulator::innerCircle_724__L89 */;
  dataLocal_simulation _L140_1 /* simulation::tracksimulator::innerCircle_724__L140 */;
  dataLocal_simulation _L141_1 /* simulation::tracksimulator::innerCircle_724__L141 */;
  dataLocal_simulation _1__L20_1 /* simulation::tracksimulator::kickingHorsePass_670__L20 */;
  dataLocal_simulation _L21_1 /* simulation::tracksimulator::kickingHorsePass_670__L21 */;
  dataLocal_simulation _L33_1 /* simulation::tracksimulator::kickingHorsePass_670__L33 */;
  dataLocal_simulation _1__L40_1 /* simulation::tracksimulator::kickingHorsePass_670__L40 */;
  dataLocal_simulation _1__L39_1 /* simulation::tracksimulator::kickingHorsePass_670__L39 */;
  dataLocal_simulation _1__L66_1 /* simulation::tracksimulator::kickingHorsePass_670__L66 */;
  dataLocal_simulation _1__L68_1 /* simulation::tracksimulator::kickingHorsePass_670__L68 */;
  dataLocal_simulation _1__L70_1 /* simulation::tracksimulator::kickingHorsePass_670__L70 */;
  dataLocal_simulation _1__L72_1 /* simulation::tracksimulator::kickingHorsePass_670__L72 */;
  dataLocal_simulation _1__L71_1 /* simulation::tracksimulator::kickingHorsePass_670__L71 */;
  dataLocal_simulation _1__L75_1 /* simulation::tracksimulator::kickingHorsePass_670__L75 */;
  dataLocal_simulation _L74_1 /* simulation::tracksimulator::kickingHorsePass_670__L74 */;
  dataLocal_simulation _1__L78_1 /* simulation::tracksimulator::kickingHorsePass_670__L78 */;
  dataLocal_simulation _1__L77_1 /* simulation::tracksimulator::kickingHorsePass_670__L77 */;
  dataLocal_simulation _1__L89_1 /* simulation::tracksimulator::kickingHorsePass_670__L89 */;
  dataLocal_simulation _L96_1 /* simulation::tracksimulator::kickingHorsePass_670__L96 */;
  dataLocal_simulation _L99_1 /* simulation::tracksimulator::kickingHorsePass_670__L99 */;
  dataLocal_simulation _L102_1 /* simulation::tracksimulator::kickingHorsePass_670__L102 */;
  dataLocal_simulation _L105_1 /* simulation::tracksimulator::kickingHorsePass_670__L105 */;
  struct_7 M_pre_;
  struct_7 _1_M_pre_;
  struct_7 _2_M_pre_;
  struct_7 _3_M_pre_;
  struct_7 _4_M_pre_;
  struct_7 _5_M_pre_;
  struct_7 _6_M_pre_;
  struct_7 _7_M_pre_;
  struct_7 _8_M_pre_;
  /*     ---------------------  sub nodes' contexts  ---------------------   */
  
  track_SV_simulation Context_track /* simulation::track */;
  track_SV_simulation _1_Context_track /* simulation::track */;
  track_SV_simulation _2_Context_track /* simulation::track */;
  track_SV_simulation _3_Context_track /* simulation::track */;
  track_SV_simulation _4_Context_track /* simulation::track */;
  track_SV_simulation _5_Context_track /* simulation::track */;
  track_SV_simulation _6_Context_track /* simulation::track */;
  track_SV_simulation _7_Context_track /* simulation::track */;
  track_SV_simulation _8_Context_track /* simulation::track */;
  track_SV_simulation _9_Context_track /* simulation::track */;
  track_SV_simulation _10_Context_track /* simulation::track */;
  track_SV_simulation _11_Context_track /* simulation::track */;
  track_SV_simulation _12_Context_track /* simulation::track */;
  track_SV_simulation _13_Context_track /* simulation::track */;
  track_SV_simulation _14_Context_track /* simulation::track */;
  track_SV_simulation _15_Context_track /* simulation::track */;
  track_SV_simulation _16_Context_track /* simulation::track */;
  track_SV_simulation _17_Context_track /* simulation::track */;
  track_SV_simulation _18_Context_track /* simulation::track */;
  track_SV_simulation _19_Context_track /* simulation::track */;
  track_SV_simulation _20_Context_track /* simulation::track */;
  track_SV_simulation _21_Context_track /* simulation::track */;
  track_SV_simulation _22_Context_track /* simulation::track */;
  track_SV_simulation _23_Context_track /* simulation::track */;
  track_SV_simulation _24_Context_track /* simulation::track */;
  track_SV_simulation _25_Context_track /* simulation::track */;
  track_SV_simulation _26_Context_track /* simulation::track */;
  track_SV_simulation _27_Context_track /* simulation::track */;
  track_SV_simulation _28_Context_track /* simulation::track */;
  track_SV_simulation _29_Context_track /* simulation::track */;
  track_SV_simulation _30_Context_track /* simulation::track */;
  track_SV_simulation _31_Context_track /* simulation::track */;
  track_SV_simulation _32_Context_track /* simulation::track */;
  track_SV_simulation _33_Context_track /* simulation::track */;
  track_SV_simulation _34_Context_track /* simulation::track */;
  track_SV_simulation _35_Context_track /* simulation::track */;
  track_SV_simulation _36_Context_track /* simulation::track */;
  track_SV_simulation _37_Context_track /* simulation::track */;
  track_SV_simulation _38_Context_track /* simulation::track */;
  track_SV_simulation _39_Context_track /* simulation::track */;
  track_SV_simulation _40_Context_track /* simulation::track */;
  track_SV_simulation _41_Context_track /* simulation::track */;
  track_SV_simulation _42_Context_track /* simulation::track */;
  track_SV_simulation _43_Context_track /* simulation::track */;
  track_SV_simulation _44_Context_track /* simulation::track */;
  track_SV_simulation _45_Context_track /* simulation::track */;
  track_SV_simulation _46_Context_track /* simulation::track */;
  track_SV_simulation _47_Context_track /* simulation::track */;
  switchPoint1_SV_simulation Context_switchPoint1 /* simulation::switchPoint1 */;
  switchPoint1_SV_simulation _1_Context_switchPoint1 /* simulation::switchPoint1 */;
  switchPoint1_SV_simulation _2_Context_switchPoint1 /* simulation::switchPoint1 */;
  switchPoint1_SV_simulation _3_Context_switchPoint1 /* simulation::switchPoint1 */;
  switchPoint1_SV_simulation _4_Context_switchPoint1 /* simulation::switchPoint1 */;
  switchPoint1_SV_simulation _5_Context_switchPoint1 /* simulation::switchPoint1 */;
  switchPoint1_SV_simulation _6_Context_switchPoint1 /* simulation::switchPoint1 */;
  switchPoint1_SV_simulation _7_Context_switchPoint1 /* simulation::switchPoint1 */;
  switchPoint1_SV_simulation _8_Context_switchPoint1 /* simulation::switchPoint1 */;
  switchPoint1_SV_simulation _9_Context_switchPoint1 /* simulation::switchPoint1 */;
  switchPoint1_SV_simulation _10_Context_switchPoint1 /* simulation::switchPoint1 */;
  switchPoint1_SV_simulation _11_Context_switchPoint1 /* simulation::switchPoint1 */;
  switchPoint1_SV_simulation _12_Context_switchPoint1 /* simulation::switchPoint1 */;
  switchPoint2_SV_simulation Context_switchPoint2 /* simulation::switchPoint2 */;
  switchPoint2_SV_simulation _1_Context_switchPoint2 /* simulation::switchPoint2 */;
  switchPoint2_SV_simulation _2_Context_switchPoint2 /* simulation::switchPoint2 */;
  switchPoint2_SV_simulation _3_Context_switchPoint2 /* simulation::switchPoint2 */;
  switchPoint2_SV_simulation _4_Context_switchPoint2 /* simulation::switchPoint2 */;
  switchPoint2_SV_simulation _5_Context_switchPoint2 /* simulation::switchPoint2 */;
  switchPoint2_SV_simulation _6_Context_switchPoint2 /* simulation::switchPoint2 */;
  switchPoint2_SV_simulation _7_Context_switchPoint2 /* simulation::switchPoint2 */;
  switchPoint2_SV_simulation _8_Context_switchPoint2 /* simulation::switchPoint2 */;
  switchPoint2_SV_simulation _9_Context_switchPoint2 /* simulation::switchPoint2 */;
  switchPoint2_SV_simulation _10_Context_switchPoint2 /* simulation::switchPoint2 */;
  switchPoint2_SV_simulation _11_Context_switchPoint2 /* simulation::switchPoint2 */;
  switchPoint2_SV_simulation _12_Context_switchPoint2 /* simulation::switchPoint2 */;
  switchPointCross_SV_simulation Context_switchPointCross /* simulation::switchPointCross */;
  switchPointCross_SV_simulation _1_Context_switchPointCross /* simulation::switchPointCross */;
} tracksimulator_SV_simulation;

/* macro for state saving and restoring */
#ifndef copy_tracksimulator_SV_simulation
#define copy_tracksimulator_SV_simulation(x, y)                                 \
  do {                                                                          \
  {                                                                             \
    (x).init = (y).init;                                                        \
    copy_dataLocal_simulation ( (x)._L112_1 , (y)._L112_1 );                    \
    copy_dataLocal_simulation ( (x)._L115_1 , (y)._L115_1 );                    \
    copy_dataLocal_simulation ( (x)._L117_1 , (y)._L117_1 );                    \
    copy_dataLocal_simulation ( (x)._L123_1 , (y)._L123_1 );                    \
    copy_dataLocal_simulation ( (x)._L122_1 , (y)._L122_1 );                    \
    copy_dataLocal_simulation ( (x)._L127_1 , (y)._L127_1 );                    \
    copy_dataLocal_simulation ( (x)._L80_1 , (y)._L80_1 );                      \
    copy_dataLocal_simulation ( (x)._L130_1 , (y)._L130_1 );                    \
    copy_dataLocal_simulation ( (x)._L75_1 , (y)._L75_1 );                      \
    copy_dataLocal_simulation ( (x)._L133_1 , (y)._L133_1 );                    \
    copy_dataLocal_simulation ( (x)._L132_1 , (y)._L132_1 );                    \
    copy_dataLocal_simulation ( (x)._L71_1 , (y)._L71_1 );                      \
    copy_dataLocal_simulation ( (x)._L69_1 , (y)._L69_1 );                      \
    copy_dataLocal_simulation ( (x)._L64_1 , (y)._L64_1 );                      \
    copy_dataLocal_simulation ( (x)._L65_1 , (y)._L65_1 );                      \
    copy_dataLocal_simulation ( (x)._L53_1 , (y)._L53_1 );                      \
    copy_dataLocal_simulation ( (x)._L88_1 , (y)._L88_1 );                      \
    copy_dataLocal_simulation ( (x)._L54_1 , (y)._L54_1 );                      \
    copy_dataLocal_simulation ( (x)._L86_1 , (y)._L86_1 );                      \
    copy_dataLocal_simulation ( (x)._L51_1 , (y)._L51_1 );                      \
    copy_dataLocal_simulation ( (x)._L84_1 , (y)._L84_1 );                      \
    copy_dataLocal_simulation ( (x)._L82_1 , (y)._L82_1 );                      \
    copy_dataLocal_simulation ( (x)._L44_1 , (y)._L44_1 );                      \
    copy_dataLocal_simulation ( (x)._L77_1 , (y)._L77_1 );                      \
    copy_dataLocal_simulation ( (x)._L72_1 , (y)._L72_1 );                      \
    copy_dataLocal_simulation ( (x)._L42_1 , (y)._L42_1 );                      \
    copy_dataLocal_simulation ( (x)._L73_1 , (y)._L73_1 );                      \
    copy_dataLocal_simulation ( (x)._L39_1 , (y)._L39_1 );                      \
    copy_dataLocal_simulation ( (x)._1__L69_1 , (y)._1__L69_1 );                \
    copy_dataLocal_simulation ( (x)._L70_1 , (y)._L70_1 );                      \
    copy_dataLocal_simulation ( (x)._L35_1 , (y)._L35_1 );                      \
    copy_dataLocal_simulation ( (x)._L32_1 , (y)._L32_1 );                      \
    copy_dataLocal_simulation ( (x)._L68_1 , (y)._L68_1 );                      \
    copy_dataLocal_simulation ( (x)._L66_1 , (y)._L66_1 );                      \
    copy_dataLocal_simulation ( (x)._L28_1 , (y)._L28_1 );                      \
    copy_dataLocal_simulation ( (x)._L57_1 , (y)._L57_1 );                      \
    copy_dataLocal_simulation ( (x)._L26_1 , (y)._L26_1 );                      \
    copy_dataLocal_simulation ( (x)._1__L53_1 , (y)._1__L53_1 );                \
    copy_dataLocal_simulation ( (x)._L15_1 , (y)._L15_1 );                      \
    copy_dataLocal_simulation ( (x)._L5_1 , (y)._L5_1 );                        \
    copy_dataLocal_simulation ( (x)._L48_1 , (y)._L48_1 );                      \
    copy_dataLocal_simulation ( (x)._L40_1 , (y)._L40_1 );                      \
    copy_dataLocal_simulation ( (x)._L2_1 , (y)._L2_1 );                        \
    copy_dataLocal_simulation ( (x)._1__L32_1 , (y)._1__L32_1 );                \
    copy_dataLocal_simulation ( (x)._L91_1 , (y)._L91_1 );                      \
    copy_dataLocal_simulation ( (x)._1__L42_1 , (y)._1__L42_1 );                \
    copy_dataLocal_simulation ( (x)._L90_1 , (y)._L90_1 );                      \
    copy_dataLocal_simulation ( (x)._L29_1 , (y)._L29_1 );                      \
    copy_dataLocal_simulation ( (x)._L97_1 , (y)._L97_1 );                      \
    copy_dataLocal_simulation ( (x)._1__L51_1 , (y)._1__L51_1 );                \
    copy_dataLocal_simulation ( (x)._L24_1 , (y)._L24_1 );                      \
    copy_dataLocal_simulation ( (x)._L16_1 , (y)._L16_1 );                      \
    copy_dataLocal_simulation ( (x)._1__L54_1 , (y)._1__L54_1 );                \
    copy_dataLocal_simulation ( (x)._L17_1 , (y)._L17_1 );                      \
    copy_dataLocal_simulation ( (x)._1__L57_1 , (y)._1__L57_1 );                \
    copy_dataLocal_simulation ( (x)._L11_1 , (y)._L11_1 );                      \
    copy_dataLocal_simulation ( (x)._1__L2_1 , (y)._1__L2_1 );                  \
    copy_dataLocal_simulation ( (x)._1__L91_1 , (y)._1__L91_1 );                \
    copy_dataLocal_simulation ( (x)._L121_1 , (y)._L121_1 );                    \
    copy_dataLocal_simulation ( (x)._L107_1 , (y)._L107_1 );                    \
    copy_dataLocal_simulation ( (x)._L163_1 , (y)._L163_1 );                    \
    copy_dataLocal_simulation ( (x)._L20_1 , (y)._L20_1 );                      \
    copy_dataLocal_simulation ( (x)._L76_1 , (y)._L76_1 );                      \
    copy_dataLocal_simulation ( (x)._L93_1 , (y)._L93_1 );                      \
    copy_dataLocal_simulation ( (x)._L49_1 , (y)._L49_1 );                      \
    copy_dataLocal_simulation ( (x)._L61_1 , (y)._L61_1 );                      \
    copy_dataLocal_simulation ( (x)._L78_1 , (y)._L78_1 );                      \
    copy_dataLocal_simulation ( (x)._1__L132_1 , (y)._1__L132_1 );              \
    copy_dataLocal_simulation ( (x)._L131_1 , (y)._L131_1 );                    \
    copy_dataLocal_simulation ( (x)._L89_1 , (y)._L89_1 );                      \
    copy_dataLocal_simulation ( (x)._L140_1 , (y)._L140_1 );                    \
    copy_dataLocal_simulation ( (x)._L141_1 , (y)._L141_1 );                    \
    copy_dataLocal_simulation ( (x)._1__L20_1 , (y)._1__L20_1 );                \
    copy_dataLocal_simulation ( (x)._L21_1 , (y)._L21_1 );                      \
    copy_dataLocal_simulation ( (x)._L33_1 , (y)._L33_1 );                      \
    copy_dataLocal_simulation ( (x)._1__L40_1 , (y)._1__L40_1 );                \
    copy_dataLocal_simulation ( (x)._1__L39_1 , (y)._1__L39_1 );                \
    copy_dataLocal_simulation ( (x)._1__L66_1 , (y)._1__L66_1 );                \
    copy_dataLocal_simulation ( (x)._1__L68_1 , (y)._1__L68_1 );                \
    copy_dataLocal_simulation ( (x)._1__L70_1 , (y)._1__L70_1 );                \
    copy_dataLocal_simulation ( (x)._1__L72_1 , (y)._1__L72_1 );                \
    copy_dataLocal_simulation ( (x)._1__L71_1 , (y)._1__L71_1 );                \
    copy_dataLocal_simulation ( (x)._1__L75_1 , (y)._1__L75_1 );                \
    copy_dataLocal_simulation ( (x)._L74_1 , (y)._L74_1 );                      \
    copy_dataLocal_simulation ( (x)._1__L78_1 , (y)._1__L78_1 );                \
    copy_dataLocal_simulation ( (x)._1__L77_1 , (y)._1__L77_1 );                \
    copy_dataLocal_simulation ( (x)._1__L89_1 , (y)._1__L89_1 );                \
    copy_dataLocal_simulation ( (x)._L96_1 , (y)._L96_1 );                      \
    copy_dataLocal_simulation ( (x)._L99_1 , (y)._L99_1 );                      \
    copy_dataLocal_simulation ( (x)._L102_1 , (y)._L102_1 );                    \
    copy_dataLocal_simulation ( (x)._L105_1 , (y)._L105_1 );                    \
    copy_struct_7 ( (x).M_pre_ , (y).M_pre_ );                                  \
    copy_struct_7 ( (x)._1_M_pre_ , (y)._1_M_pre_ );                            \
    copy_struct_7 ( (x)._2_M_pre_ , (y)._2_M_pre_ );                            \
    copy_struct_7 ( (x)._3_M_pre_ , (y)._3_M_pre_ );                            \
    copy_struct_7 ( (x)._4_M_pre_ , (y)._4_M_pre_ );                            \
    copy_struct_7 ( (x)._5_M_pre_ , (y)._5_M_pre_ );                            \
    copy_struct_7 ( (x)._6_M_pre_ , (y)._6_M_pre_ );                            \
    copy_struct_7 ( (x)._7_M_pre_ , (y)._7_M_pre_ );                            \
    copy_struct_7 ( (x)._8_M_pre_ , (y)._8_M_pre_ );                            \
    copy_track_SV_simulation ( (x).Context_track , (y).Context_track );         \
    copy_track_SV_simulation ( (x)._1_Context_track , (y)._1_Context_track );   \
    copy_track_SV_simulation ( (x)._2_Context_track , (y)._2_Context_track );   \
    copy_track_SV_simulation ( (x)._3_Context_track , (y)._3_Context_track );   \
    copy_track_SV_simulation ( (x)._4_Context_track , (y)._4_Context_track );   \
    copy_track_SV_simulation ( (x)._5_Context_track , (y)._5_Context_track );   \
    copy_track_SV_simulation ( (x)._6_Context_track , (y)._6_Context_track );   \
    copy_track_SV_simulation ( (x)._7_Context_track , (y)._7_Context_track );   \
    copy_track_SV_simulation ( (x)._8_Context_track , (y)._8_Context_track );   \
    copy_track_SV_simulation ( (x)._9_Context_track , (y)._9_Context_track );   \
    copy_track_SV_simulation ( (x)._10_Context_track , (y)._10_Context_track ); \
    copy_track_SV_simulation ( (x)._11_Context_track , (y)._11_Context_track ); \
    copy_track_SV_simulation ( (x)._12_Context_track , (y)._12_Context_track ); \
    copy_track_SV_simulation ( (x)._13_Context_track , (y)._13_Context_track ); \
    copy_track_SV_simulation ( (x)._14_Context_track , (y)._14_Context_track ); \
    copy_track_SV_simulation ( (x)._15_Context_track , (y)._15_Context_track ); \
    copy_track_SV_simulation ( (x)._16_Context_track , (y)._16_Context_track ); \
    copy_track_SV_simulation ( (x)._17_Context_track , (y)._17_Context_track ); \
    copy_track_SV_simulation ( (x)._18_Context_track , (y)._18_Context_track ); \
    copy_track_SV_simulation ( (x)._19_Context_track , (y)._19_Context_track ); \
    copy_track_SV_simulation ( (x)._20_Context_track , (y)._20_Context_track ); \
    copy_track_SV_simulation ( (x)._21_Context_track , (y)._21_Context_track ); \
    copy_track_SV_simulation ( (x)._22_Context_track , (y)._22_Context_track ); \
    copy_track_SV_simulation ( (x)._23_Context_track , (y)._23_Context_track ); \
    copy_track_SV_simulation ( (x)._24_Context_track , (y)._24_Context_track ); \
    copy_track_SV_simulation ( (x)._25_Context_track , (y)._25_Context_track ); \
    copy_track_SV_simulation ( (x)._26_Context_track , (y)._26_Context_track ); \
    copy_track_SV_simulation ( (x)._27_Context_track , (y)._27_Context_track ); \
    copy_track_SV_simulation ( (x)._28_Context_track , (y)._28_Context_track ); \
    copy_track_SV_simulation ( (x)._29_Context_track , (y)._29_Context_track ); \
    copy_track_SV_simulation ( (x)._30_Context_track , (y)._30_Context_track ); \
    copy_track_SV_simulation ( (x)._31_Context_track , (y)._31_Context_track ); \
    copy_track_SV_simulation ( (x)._32_Context_track , (y)._32_Context_track ); \
    copy_track_SV_simulation ( (x)._33_Context_track , (y)._33_Context_track ); \
    copy_track_SV_simulation ( (x)._34_Context_track , (y)._34_Context_track ); \
    copy_track_SV_simulation ( (x)._35_Context_track , (y)._35_Context_track ); \
    copy_track_SV_simulation ( (x)._36_Context_track , (y)._36_Context_track ); \
    copy_track_SV_simulation ( (x)._37_Context_track , (y)._37_Context_track ); \
    copy_track_SV_simulation ( (x)._38_Context_track , (y)._38_Context_track ); \
    copy_track_SV_simulation ( (x)._39_Context_track , (y)._39_Context_track ); \
    copy_track_SV_simulation ( (x)._40_Context_track , (y)._40_Context_track ); \
    copy_track_SV_simulation ( (x)._41_Context_track , (y)._41_Context_track ); \
    copy_track_SV_simulation ( (x)._42_Context_track , (y)._42_Context_track ); \
    copy_track_SV_simulation ( (x)._43_Context_track , (y)._43_Context_track ); \
    copy_track_SV_simulation ( (x)._44_Context_track , (y)._44_Context_track ); \
    copy_track_SV_simulation ( (x)._45_Context_track , (y)._45_Context_track ); \
    copy_track_SV_simulation ( (x)._46_Context_track , (y)._46_Context_track ); \
    copy_track_SV_simulation ( (x)._47_Context_track , (y)._47_Context_track ); \
    copy_switchPoint1_SV_simulation ( (x).Context_switchPoint1 , (y).Context_switchPoint1 );\
    copy_switchPoint1_SV_simulation ( (x)._1_Context_switchPoint1 , (y)._1_Context_switchPoint1 );\
    copy_switchPoint1_SV_simulation ( (x)._2_Context_switchPoint1 , (y)._2_Context_switchPoint1 );\
    copy_switchPoint1_SV_simulation ( (x)._3_Context_switchPoint1 , (y)._3_Context_switchPoint1 );\
    copy_switchPoint1_SV_simulation ( (x)._4_Context_switchPoint1 , (y)._4_Context_switchPoint1 );\
    copy_switchPoint1_SV_simulation ( (x)._5_Context_switchPoint1 , (y)._5_Context_switchPoint1 );\
    copy_switchPoint1_SV_simulation ( (x)._6_Context_switchPoint1 , (y)._6_Context_switchPoint1 );\
    copy_switchPoint1_SV_simulation ( (x)._7_Context_switchPoint1 , (y)._7_Context_switchPoint1 );\
    copy_switchPoint1_SV_simulation ( (x)._8_Context_switchPoint1 , (y)._8_Context_switchPoint1 );\
    copy_switchPoint1_SV_simulation ( (x)._9_Context_switchPoint1 , (y)._9_Context_switchPoint1 );\
    copy_switchPoint1_SV_simulation ( (x)._10_Context_switchPoint1 , (y)._10_Context_switchPoint1 );\
    copy_switchPoint1_SV_simulation ( (x)._11_Context_switchPoint1 , (y)._11_Context_switchPoint1 );\
    copy_switchPoint1_SV_simulation ( (x)._12_Context_switchPoint1 , (y)._12_Context_switchPoint1 );\
    copy_switchPoint2_SV_simulation ( (x).Context_switchPoint2 , (y).Context_switchPoint2 );\
    copy_switchPoint2_SV_simulation ( (x)._1_Context_switchPoint2 , (y)._1_Context_switchPoint2 );\
    copy_switchPoint2_SV_simulation ( (x)._2_Context_switchPoint2 , (y)._2_Context_switchPoint2 );\
    copy_switchPoint2_SV_simulation ( (x)._3_Context_switchPoint2 , (y)._3_Context_switchPoint2 );\
    copy_switchPoint2_SV_simulation ( (x)._4_Context_switchPoint2 , (y)._4_Context_switchPoint2 );\
    copy_switchPoint2_SV_simulation ( (x)._5_Context_switchPoint2 , (y)._5_Context_switchPoint2 );\
    copy_switchPoint2_SV_simulation ( (x)._6_Context_switchPoint2 , (y)._6_Context_switchPoint2 );\
    copy_switchPoint2_SV_simulation ( (x)._7_Context_switchPoint2 , (y)._7_Context_switchPoint2 );\
    copy_switchPoint2_SV_simulation ( (x)._8_Context_switchPoint2 , (y)._8_Context_switchPoint2 );\
    copy_switchPoint2_SV_simulation ( (x)._9_Context_switchPoint2 , (y)._9_Context_switchPoint2 );\
    copy_switchPoint2_SV_simulation ( (x)._10_Context_switchPoint2 , (y)._10_Context_switchPoint2 );\
    copy_switchPoint2_SV_simulation ( (x)._11_Context_switchPoint2 , (y)._11_Context_switchPoint2 );\
    copy_switchPoint2_SV_simulation ( (x)._12_Context_switchPoint2 , (y)._12_Context_switchPoint2 );\
    copy_switchPointCross_SV_simulation ( (x).Context_switchPointCross , (y).Context_switchPointCross );\
    copy_switchPointCross_SV_simulation ( (x)._1_Context_switchPointCross , (y)._1_Context_switchPointCross );\
  }                                                                             \
}                                                                               \
while(kcg_false)
#endif /* copy_tracksimulator_SV_simulation */
/*   ============  node initialisation and cycle functions  ============   */
extern void tracksimulator_reset_simulation(
  outC_tracksimulator_simulation *outC /* simulation::tracksimulator */);
extern void tracksimulator_simulation(
  controllerCommands_simulation *commands /* simulation::tracksimulator::commands */,
  outC_tracksimulator_simulation *outC /* simulation::tracksimulator */);
#endif /* _tracksimulator_simulation_H_ */

/* $**************  KCG Version 6.0.0b (build i19) **************
** tracksimulator_simulation.h
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
