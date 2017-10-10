/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "tracksimulator_simulation.h"
void tracksimulator_reset_simulation(
  outC_tracksimulator_simulation *outC /* simulation::tracksimulator */)
{
  outC->init = kcg_true;
  switchPointCross_reset_simulation(&outC->_1_Context_switchPointCross);
  /* 12 */
   switchPointCross_reset_simulation(&outC->Context_switchPointCross);
  /* 12 */
   switchPoint2_reset_simulation(&outC->_12_Context_switchPoint2);
  /* 13 */
   switchPoint2_reset_simulation(&outC->_11_Context_switchPoint2);
  /* 14 */
   switchPoint2_reset_simulation(&outC->_10_Context_switchPoint2);
  /* 15 */
   switchPoint2_reset_simulation(&outC->_9_Context_switchPoint2);
  /* 16 */
   switchPoint2_reset_simulation(&outC->_8_Context_switchPoint2);
  /* 17 */
   switchPoint2_reset_simulation(&outC->_7_Context_switchPoint2);
  /* 12 */
   switchPoint2_reset_simulation(&outC->_6_Context_switchPoint2);
  /* 11 */
   switchPoint2_reset_simulation(&outC->_5_Context_switchPoint2);
  /* 13 */
   switchPoint2_reset_simulation(&outC->_4_Context_switchPoint2);
  /* 12 */
   switchPoint2_reset_simulation(&outC->_3_Context_switchPoint2);
  /* 13 */
   switchPoint2_reset_simulation(&outC->_2_Context_switchPoint2);
  /* 11 */
   switchPoint2_reset_simulation(&outC->_1_Context_switchPoint2);
  /* 14 */
   switchPoint2_reset_simulation(&outC->Context_switchPoint2);
  /* 13 */
   switchPoint1_reset_simulation(&outC->_12_Context_switchPoint1);
  /* 14 */
   switchPoint1_reset_simulation(&outC->_11_Context_switchPoint1);
  /* 15 */
   switchPoint1_reset_simulation(&outC->_10_Context_switchPoint1);
  /* 16 */
   switchPoint1_reset_simulation(&outC->_9_Context_switchPoint1);
  /* 17 */
   switchPoint1_reset_simulation(&outC->_8_Context_switchPoint1);
  /* 18 */
   switchPoint1_reset_simulation(&outC->_7_Context_switchPoint1);
  /* 12 */
   switchPoint1_reset_simulation(&outC->_6_Context_switchPoint1);
  /* 11 */
   switchPoint1_reset_simulation(&outC->_5_Context_switchPoint1);
  /* 13 */
   switchPoint1_reset_simulation(&outC->_4_Context_switchPoint1);
  /* 14 */
   switchPoint1_reset_simulation(&outC->_3_Context_switchPoint1);
  /* 13 */
   switchPoint1_reset_simulation(&outC->_2_Context_switchPoint1);
  /* 12 */
   switchPoint1_reset_simulation(&outC->_1_Context_switchPoint1);
  /* 11 */
   switchPoint1_reset_simulation(&outC->Context_switchPoint1);
  /* 11 */
   track_reset_simulation(&outC->_47_Context_track);
  /* 12 */
   track_reset_simulation(&outC->_46_Context_track);
  /* 13 */
   track_reset_simulation(&outC->_45_Context_track);
  /* 14 */
   track_reset_simulation(&outC->_44_Context_track);
  /* 15 */
   track_reset_simulation(&outC->_43_Context_track);
  /* 16 */
   track_reset_simulation(&outC->_42_Context_track);
  /* 17 */
   track_reset_simulation(&outC->_41_Context_track);
  /* 18 */
   track_reset_simulation(&outC->_40_Context_track);
  /* 19 */
   track_reset_simulation(&outC->_39_Context_track);
  /* 110 */
   track_reset_simulation(&outC->_38_Context_track);
  /* 111 */
   track_reset_simulation(&outC->_37_Context_track);
  /* 112 */
   track_reset_simulation(&outC->_36_Context_track);
  /* 113 */
   track_reset_simulation(&outC->_35_Context_track);
  /* 114 */
   track_reset_simulation(&outC->_34_Context_track);
  /* 115 */
   track_reset_simulation(&outC->_33_Context_track);
  /* 116 */
   track_reset_simulation(&outC->_32_Context_track);
  /* 117 */
   track_reset_simulation(&outC->_31_Context_track);
  /* 13 */
   track_reset_simulation(&outC->_30_Context_track);
  /* 115 */
   track_reset_simulation(&outC->_29_Context_track);
  /* 111 */
   track_reset_simulation(&outC->_28_Context_track);
  /* 15 */
   track_reset_simulation(&outC->_27_Context_track);
  /* 18 */
   track_reset_simulation(&outC->_26_Context_track);
  /* 113 */
   track_reset_simulation(&outC->_25_Context_track);
  /* 19 */
   track_reset_simulation(&outC->_24_Context_track);
  /* 11 */
   track_reset_simulation(&outC->_23_Context_track);
  /* 12 */
   track_reset_simulation(&outC->_22_Context_track);
  /* 17 */
   track_reset_simulation(&outC->_21_Context_track);
  /* 16 */
   track_reset_simulation(&outC->_20_Context_track);
  /* 114 */
   track_reset_simulation(&outC->_19_Context_track);
  /* 110 */
   track_reset_simulation(&outC->_18_Context_track);
  /* 112 */
   track_reset_simulation(&outC->_17_Context_track);
  /* 116 */
   track_reset_simulation(&outC->_16_Context_track);
  /* 16 */
   track_reset_simulation(&outC->_15_Context_track);
  /* 114 */
   track_reset_simulation(&outC->_14_Context_track);
  /* 113 */
   track_reset_simulation(&outC->_13_Context_track);
  /* 15 */
   track_reset_simulation(&outC->_12_Context_track);
  /* 13 */
   track_reset_simulation(&outC->_11_Context_track);
  /* 112 */
   track_reset_simulation(&outC->_10_Context_track);
  /* 18 */
   track_reset_simulation(&outC->_9_Context_track);
  /* 14 */
   track_reset_simulation(&outC->_8_Context_track);
  /* 19 */
   track_reset_simulation(&outC->_7_Context_track);
  /* 115 */
   track_reset_simulation(&outC->_6_Context_track);
  /* 12 */
   track_reset_simulation(&outC->_5_Context_track);
  /* 11 */
   track_reset_simulation(&outC->_4_Context_track);
  /* 17 */
   track_reset_simulation(&outC->_3_Context_track);
  /* 111 */
   track_reset_simulation(&outC->_2_Context_track);
  /* 116 */
   track_reset_simulation(&outC->_1_Context_track);
  /* 117 */
   track_reset_simulation(&outC->Context_track);
}
void tracksimulator_simulation(
  controllerCommands_simulation *commands /* simulation::tracksimulator::commands */,
  outC_tracksimulator_simulation *outC /* simulation::tracksimulator */)
{
  /* simulation::tracksimulator::kickingHorsePass_670__L101 */
  dataAll_simulation _L101_1;
  /* simulation::tracksimulator::outerCircle_700_dataAll2Local_601_cycleBreaker_559__L2 */
  dataLocal_simulation _L2_2_5_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L98 */
  dataAll_simulation _L98_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_639__L2 */
  dataLocal_simulation _L2_12_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L95 */
  dataAll_simulation _L95_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L88 */
  dataAll_simulation _L88_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_640__L2 */
  dataLocal_simulation _L2_22_1;
  /* simulation::tracksimulator::outerCircle_700_dataLocal2All_602__L3 */
  dataAll_simulation _L3_3_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L79 */
  dataAll_simulation _L79_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L76 */
  dataAll_simulation _L76_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_641__L2 */
  dataLocal_simulation _L2_26_1;
  /* simulation::tracksimulator::outerCircle_700_dataLocal2All_603__L3 */
  dataAll_simulation _L3_1_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L73 */
  dataAll_simulation _L73_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L69 */
  dataAll_simulation _L69_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_642__L2 */
  dataLocal_simulation _L2_5_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L67 */
  dataAll_simulation _L67_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L65 */
  dataAll_simulation _L65_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_604__L2 */
  dataLocal_simulation _L2_10_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_643__L2 */
  dataLocal_simulation _L2_21_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L41 */
  dataAll_simulation _L41_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L32 */
  dataAll_simulation _L32_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_605__L2 */
  dataLocal_simulation _1__L2_12_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_644__L2 */
  dataLocal_simulation _L2_4_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L4 */
  dataAll_simulation _L4_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L3 */
  dataAll_simulation _L3_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_606__L2 */
  dataLocal_simulation _1__L2_5_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_645__L2 */
  dataLocal_simulation _L2_9_1;
  /* simulation::tracksimulator::kickingHorsePass_670_dataLocal2All_561__L3 */
  dataAll_simulation _1__L3_1_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_607__L2 */
  dataLocal_simulation _L2_6_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_646__L2 */
  dataLocal_simulation _L2_13_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_562__L2 */
  dataLocal_simulation _L2_1_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_608__L2 */
  dataLocal_simulation _1__L2_13_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_647__L2 */
  dataLocal_simulation _L2_19_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_563__L2 */
  dataLocal_simulation _L2_3_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_609__L2 */
  dataLocal_simulation _1__L2_3_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_648__L2 */
  dataLocal_simulation _L2_15_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_564__L2 */
  dataLocal_simulation _1__L2_4_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_610__L2 */
  dataLocal_simulation _L2_17_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_649__L2 */
  dataLocal_simulation _1__L2_17_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_565__L2 */
  dataLocal_simulation _2__L2_5_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_611__L2 */
  dataLocal_simulation _L2_25_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_650__L2 */
  dataLocal_simulation _L2_18_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_566__L2 */
  dataLocal_simulation _1__L2_6_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_612__L2 */
  dataLocal_simulation _L2_20_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_651__L2 */
  dataLocal_simulation _L2_23_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_567__L2 */
  dataLocal_simulation _L2_8_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_613__L2 */
  dataLocal_simulation _1__L2_22_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_652__L2 */
  dataLocal_simulation _1__L2_20_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_568__L2 */
  dataLocal_simulation _L2_7_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_614__L2 */
  dataLocal_simulation _1__L2_9_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_653__L2 */
  dataLocal_simulation _2__L2_3_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_569__L2 */
  dataLocal_simulation _2__L2_9_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_615__L2 */
  dataLocal_simulation _L2_14_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_654__L2 */
  dataLocal_simulation _1__L2_8_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_570__L2 */
  dataLocal_simulation _1__L2_10_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_616__L2 */
  dataLocal_simulation _1__L2_19_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_655__L2 */
  dataLocal_simulation _1__L2_14_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_571__L2 */
  dataLocal_simulation _2__L2_12_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_617__L2 */
  dataLocal_simulation _L2_16_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_656__L2 */
  dataLocal_simulation _1__L2_16_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_572__L2 */
  dataLocal_simulation _2__L2_13_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_618__L2 */
  dataLocal_simulation _L2_11_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_657__L2 */
  dataLocal_simulation _L2_24_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_573__L2 */
  dataLocal_simulation _2__L2_14_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_619__L2 */
  dataLocal_simulation _2__L2_8_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_658__L2 */
  dataLocal_simulation _1__L2_25_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_574__L2 */
  dataLocal_simulation _1__L2_15_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_620__L2 */
  dataLocal_simulation _1__L2_23_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_659__L2 */
  dataLocal_simulation _1__L2_1_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_575__L2 */
  dataLocal_simulation _2__L2_16_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_621__L2 */
  dataLocal_simulation _1__L2_24_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_660__L2 */
  dataLocal_simulation _1__L2_7_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_576__L2 */
  dataLocal_simulation _2__L2_17_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_622__L2 */
  dataLocal_simulation _2__L2_15_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_661__L2 */
  dataLocal_simulation _L2_2_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_577__L2 */
  dataLocal_simulation _1__L2_18_1;
  /* simulation::tracksimulator::_L43 */
  dataGlobal_simulation _L43;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_623__L2 */
  dataLocal_simulation _1__L2_2_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_662__L2 */
  dataLocal_simulation _L2_27_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_578__L2 */
  dataLocal_simulation _2__L2_19_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_624__L2 */
  dataLocal_simulation _2__L2_7_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_663__L2 */
  dataLocal_simulation _2__L2_6_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_579__L2 */
  dataLocal_simulation _2__L2_20_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_625__L2 */
  dataLocal_simulation _1__L2_21_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_664__L2 */
  dataLocal_simulation _1__L2_11_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_580__L2 */
  dataLocal_simulation _2__L2_21_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_626__L2 */
  dataLocal_simulation _1__L2_26_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_665__L2 */
  dataLocal_simulation _2__L2_10_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_581__L2 */
  dataLocal_simulation _2__L2_22_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_627__L2 */
  dataLocal_simulation _2__L2_4_1;
  /* simulation::tracksimulator::innerCircle_724_cycleBreaker_666__L2 */
  dataLocal_simulation _L2_29_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_582__L2 */
  dataLocal_simulation _2__L2_23_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_628__L2 */
  dataLocal_simulation _2__L2_18_1;
  /* simulation::tracksimulator::innerCircle_724_dataLocal2All_667__L3 */
  dataAll_simulation _1__L3_3_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_583__L2 */
  dataLocal_simulation _2__L2_24_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_629__L2 */
  dataLocal_simulation _1__L2_27_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_584__L2 */
  dataLocal_simulation _2__L2_25_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_630__L2 */
  dataLocal_simulation _L2_28_1;
  /* simulation::tracksimulator::innerCircle_724_dataAll2LocalOnly_668_cycleBreaker_560__L2 */
  dataLocal_simulation _L2_1_1_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_585__L2 */
  dataLocal_simulation _2__L2_26_1;
  /* simulation::tracksimulator::outerCircle_700_cycleBreaker_631__L2 */
  dataLocal_simulation _1__L2_29_1;
  /* simulation::tracksimulator::outerCircle_700_dataLocal2All_632__L3 */
  dataAll_simulation _L3_4_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_586__L2 */
  dataLocal_simulation _2__L2_27_1;
  /* simulation::tracksimulator::innerCircle_724_dataAll2LocalOnly_669_cycleBreaker_560__L2 */
  dataLocal_simulation _L2_1_2_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_587__L2 */
  dataLocal_simulation _1__L2_28_1;
  /* simulation::tracksimulator::innerCircle_724__L142 */
  dataLocal_simulation _L142_1;
  /* simulation::tracksimulator::outerCircle_700_dataAll2LocalOnly_633_cycleBreaker_560__L2 */
  dataLocal_simulation _1__L2_1_1_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_588__L2 */
  dataLocal_simulation _2__L2_29_1;
  /* simulation::tracksimulator::innerCircle_724__L138 */
  dataLocal_simulation _L138_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_589__L2 */
  dataLocal_simulation _L2_30_1;
  /* simulation::tracksimulator::innerCircle_724__L90 */
  dataAll_simulation _L90_1;
  /* simulation::tracksimulator::outerCircle_700_dataAll2LocalOnly_634_cycleBreaker_560__L2 */
  dataLocal_simulation _1__L2_1_2_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_590__L2 */
  dataLocal_simulation _L2_31_1;
  /* simulation::tracksimulator::innerCircle_724__L91 */
  dataAll_simulation _L91_1;
  /* simulation::tracksimulator::outerCircle_700__L133 */
  dataAll_simulation _L133_1;
  /* simulation::tracksimulator::outerCircle_700__L134 */
  dataAll_simulation _L134_1;
  /* simulation::tracksimulator::innerCircle_724__L79 */
  dataAll_simulation _1__L79_1;
  /* simulation::tracksimulator::innerCircle_724__L80 */
  dataAll_simulation _L80_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_591__L2 */
  dataLocal_simulation _L2_32_1;
  /* simulation::tracksimulator::innerCircle_724__L62 */
  dataAll_simulation _L62_1;
  /* simulation::tracksimulator::innerCircle_724__L63 */
  dataAll_simulation _L63_1;
  /* simulation::tracksimulator::innerCircle_724__L50 */
  dataAll_simulation _L50_1;
  /* simulation::tracksimulator::innerCircle_724__L51 */
  dataAll_simulation _L51_1;
  /* simulation::tracksimulator::outerCircle_700_dataAll2LocalOnly_635_cycleBreaker_560__L2 */
  dataLocal_simulation _L2_1_3_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_592__L2 */
  dataLocal_simulation _L2_33_1;
  /* simulation::tracksimulator::outerCircle_700__L94 */
  dataAll_simulation _L94_1;
  /* simulation::tracksimulator::outerCircle_700__L95 */
  dataAll_simulation _1__L95_1;
  /* simulation::tracksimulator::outerCircle_700__L77 */
  dataAll_simulation _L77_1;
  /* simulation::tracksimulator::outerCircle_700__L78 */
  dataAll_simulation _L78_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_593__L2 */
  dataLocal_simulation _L2_34_1;
  /* simulation::tracksimulator::outerCircle_700__L21 */
  dataAll_simulation _L21_1;
  /* simulation::tracksimulator::outerCircle_700__L22 */
  dataAll_simulation _L22_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_594__L2 */
  dataLocal_simulation _L2_35_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_595__L2 */
  dataLocal_simulation _L2_36_1;
  /* simulation::tracksimulator::kickingHorsePass_670_cycleBreaker_596__L2 */
  dataLocal_simulation _L2_37_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L162 */
  dataAll_simulation _L162_1;
  /* simulation::tracksimulator::kickingHorsePass_670_dataAll2Local_597_cycleBreaker_559__L2 */
  dataLocal_simulation _L2_2_2_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L108 */
  dataAll_simulation _L108_1;
  /* simulation::tracksimulator::innerCircle_724__L120 */
  dataAll_simulation _L120_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L109 */
  dataAll_simulation _L109_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L92 */
  dataAll_simulation _L92_1;
  /* simulation::tracksimulator::innerCircle_724__L1 */
  dataAll_simulation _L1_1;
  /* simulation::tracksimulator::kickingHorsePass_670_dataLocal2All_598__L3 */
  dataAll_simulation _L3_2_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L93 */
  dataAll_simulation _L93_1;
  /* simulation::tracksimulator::innerCircle_724__L10 */
  dataAll_simulation _L10_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L58 */
  dataAll_simulation _L58_1;
  /* simulation::tracksimulator::innerCircle_724__L18 */
  dataAll_simulation _L18_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L59 */
  dataAll_simulation _L59_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L55 */
  dataAll_simulation _L55_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L56 */
  dataAll_simulation _L56_1;
  /* simulation::tracksimulator::innerCircle_724__L23 */
  dataAll_simulation _L23_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L52 */
  dataAll_simulation _L52_1;
  /* simulation::tracksimulator::outerCircle_700__L96 */
  dataAll_simulation _L96_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L53 */
  dataAll_simulation _L53_1;
  /* simulation::tracksimulator::kickingHorsePass_670_dataAll2LocalOnly_599_cycleBreaker_560__L2 */
  dataLocal_simulation _2__L2_1_1_1;
  /* simulation::tracksimulator::innerCircle_724__L28 */
  dataAll_simulation _L28_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L43 */
  dataAll_simulation _L43_1;
  /* simulation::tracksimulator::outerCircle_700__L92 */
  dataAll_simulation _1__L92_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L44 */
  dataAll_simulation _L44_1;
  /* simulation::tracksimulator::innerCircle_724__L31 */
  dataAll_simulation _L31_1;
  /* simulation::tracksimulator::outerCircle_700__L1 */
  dataAll_simulation _1__L1_1;
  /* simulation::tracksimulator::outerCircle_700__L8 */
  dataAll_simulation _L8_1;
  /* simulation::tracksimulator::innerCircle_724__L39 */
  dataAll_simulation _L39_1;
  /* simulation::tracksimulator::outerCircle_700__L7 */
  dataAll_simulation _L7_1;
  /* simulation::tracksimulator::outerCircle_700__L6 */
  dataLocal_simulation _L6_1;
  /* simulation::tracksimulator::innerCircle_724__L47 */
  dataAll_simulation _L47_1;
  /* simulation::tracksimulator::innerCircle_724__L55 */
  dataAll_simulation _1__L55_1;
  /* simulation::tracksimulator::innerCircle_724__L54 */
  dataLocal_simulation _L54_1;
  /* simulation::tracksimulator::outerCircle_700__L14 */
  dataAll_simulation _L14_1;
  /* simulation::tracksimulator::outerCircle_700__L25 */
  dataAll_simulation _L25_1;
  /* simulation::tracksimulator::innerCircle_724__L56 */
  dataAll_simulation _1__L56_1;
  /* simulation::tracksimulator::outerCircle_700__L27 */
  dataAll_simulation _L27_1;
  /* simulation::tracksimulator::innerCircle_724__L65 */
  dataAll_simulation _1__L65_1;
  /* simulation::tracksimulator::innerCircle_724__L67 */
  dataAll_simulation _1__L67_1;
  /* simulation::tracksimulator::outerCircle_700__L31 */
  dataAll_simulation _1__L31_1;
  /* simulation::tracksimulator::innerCircle_724__L71 */
  dataAll_simulation _L71_1;
  /* simulation::tracksimulator::outerCircle_700__L34 */
  dataAll_simulation _L34_1;
  /* simulation::tracksimulator::innerCircle_724__L74 */
  dataAll_simulation _L74_1;
  /* simulation::tracksimulator::outerCircle_700__L38 */
  dataAll_simulation _L38_1;
  /* simulation::tracksimulator::outerCircle_700__L41 */
  dataAll_simulation _1__L41_1;
  /* simulation::tracksimulator::innerCircle_724__L76 */
  dataAll_simulation _1__L76_1;
  /* simulation::tracksimulator::outerCircle_700__L43 */
  dataAll_simulation _1__L43_1;
  /* simulation::tracksimulator::innerCircle_724__L81 */
  dataAll_simulation _L81_1;
  /* simulation::tracksimulator::innerCircle_724__L83 */
  dataAll_simulation _L83_1;
  /* simulation::tracksimulator::outerCircle_700__L50 */
  dataAll_simulation _1__L50_1;
  /* simulation::tracksimulator::outerCircle_700__L55 */
  dataAll_simulation _2__L55_1;
  /* simulation::tracksimulator::innerCircle_724__L85 */
  dataAll_simulation _L85_1;
  /* simulation::tracksimulator::innerCircle_724__L87 */
  dataAll_simulation _L87_1;
  /* simulation::tracksimulator::outerCircle_700__L66 */
  dataAll_simulation _L66_1;
  /* simulation::tracksimulator::outerCircle_700__L68 */
  dataAll_simulation _L68_1;
  /* simulation::tracksimulator::outerCircle_700__L70 */
  dataAll_simulation _L70_1;
  /* simulation::tracksimulator::innerCircle_724_dataAll2Local_636_cycleBreaker_559__L2 */
  dataLocal_simulation _L2_2_3_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L134 */
  dataAll_simulation _1__L134_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L129 */
  dataAll_simulation _L129_1;
  /* simulation::tracksimulator::outerCircle_700__L74 */
  dataAll_simulation _1__L74_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L126 */
  dataAll_simulation _L126_1;
  /* simulation::tracksimulator::outerCircle_700__L79 */
  dataAll_simulation _2__L79_1;
  /* simulation::tracksimulator::innerCircle_724_dataLocal2All_637__L3 */
  dataAll_simulation _1__L3_2_1;
  /* simulation::tracksimulator::outerCircle_700_dataLocal2All_600__L3 */
  dataAll_simulation _L3_5_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L124 */
  dataAll_simulation _L124_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L116 */
  dataAll_simulation _L116_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L114 */
  dataAll_simulation _L114_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L111 */
  dataAll_simulation _L111_1;
  /* simulation::tracksimulator::innerCircle_724_dataLocal2All_638__L3 */
  dataAll_simulation _2__L3_1_1;
  /* simulation::tracksimulator::kickingHorsePass_670__L104 */
  dataAll_simulation _L104_1;
  
  if (outC->init)
    {
      copy_struct_7 ( &_L2_1_2_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_1_1_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_29_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_10_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_11_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_6_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_27_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_2_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_7_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_1_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_25_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_24_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_16_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_14_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_8_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_3_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_20_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_23_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_18_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_17_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_15_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_19_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_13_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_9_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_4_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_21_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_5_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_26_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_22_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_12_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_2_3_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_1_3_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_1_2_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_1_1_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_29_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_28_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_27_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_18_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_4_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_26_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_21_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_7_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_2_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_15_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_24_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_23_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_8_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_11_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_16_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_19_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_14_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_9_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_22_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_20_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_25_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_17_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_3_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_13_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_6_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_5_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_12_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_10_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_2_5_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_1_1_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_2_2_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_37_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_36_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_35_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_34_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_33_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_32_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_31_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_30_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_29_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_28_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_27_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_26_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_25_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_24_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_23_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_22_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_21_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_20_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_19_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_18_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_17_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_16_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_15_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_14_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_13_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_12_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_10_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_9_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_7_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_8_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_6_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_2__L2_5_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_1__L2_4_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_3_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
      copy_struct_7 ( &_L2_1_1 , (struct_7*) &INIT_DATA_LOCAL_simulation );
    }
  else
    {
      copy_struct_7 ( &_L2_1_2_1 , &outC->_8_M_pre_ );
      copy_struct_7 ( &_L2_1_1_1 , &outC->_7_M_pre_ );
      copy_struct_7 ( &_L2_29_1 , &outC->_L121_1 );
      copy_struct_7 ( &_2__L2_10_1 , &outC->_L61_1 );
      copy_struct_7 ( &_1__L2_11_1 , &outC->_L48_1 );
      copy_struct_7 ( &_2__L2_6_1 , &outC->_L16_1 );
      copy_struct_7 ( &_L2_27_1 , &outC->_L77_1 );
      copy_struct_7 ( &_L2_2_1 , &outC->_1__L2_1 );
      copy_struct_7 ( &_1__L2_7_1 , &outC->_1__L32_1 );
      copy_struct_7 ( &_1__L2_1_1 , &outC->_L72_1 );
      copy_struct_7 ( &_1__L2_25_1 , &outC->_L57_1 );
      copy_struct_7 ( &_L2_24_1 , &outC->_L24_1 );
      copy_struct_7 ( &_1__L2_16_1 , &outC->_L88_1 );
      copy_struct_7 ( &_1__L2_14_1 , &outC->_L70_1 );
      copy_struct_7 ( &_1__L2_8_1 , &outC->_L44_1 );
      copy_struct_7 ( &_2__L2_3_1 , &outC->_L73_1 );
      copy_struct_7 ( &_1__L2_20_1 , &outC->_L68_1 );
      copy_struct_7 ( &_L2_23_1 , &outC->_L11_1 );
      copy_struct_7 ( &_L2_18_1 , &outC->_L89_1 );
      copy_struct_7 ( &_1__L2_17_1 , &outC->_L141_1 );
      copy_struct_7 ( &_L2_15_1 , &outC->_L86_1 );
      copy_struct_7 ( &_L2_19_1 , &outC->_1__L69_1 );
      copy_struct_7 ( &_L2_13_1 , &outC->_L17_1 );
      copy_struct_7 ( &_L2_9_1 , &outC->_L66_1 );
      copy_struct_7 ( &_L2_4_1 , &outC->_L78_1 );
      copy_struct_7 ( &_L2_21_1 , &outC->_L40_1 );
      copy_struct_7 ( &_L2_5_1 , &outC->_L82_1 );
      copy_struct_7 ( &_L2_26_1 , &outC->_L49_1 );
      copy_struct_7 ( &_L2_22_1 , &outC->_1__L53_1 );
      copy_struct_7 ( &_L2_12_1 , &outC->_L84_1 );
      copy_struct_7 ( &_L2_2_3_1 , &outC->_6_M_pre_ );
      copy_struct_7 ( &_L2_1_3_1 , &outC->_5_M_pre_ );
      copy_struct_7 ( &_1__L2_1_2_1 , &outC->_4_M_pre_ );
      copy_struct_7 ( &_1__L2_1_1_1 , &outC->_3_M_pre_ );
      copy_struct_7 ( &_1__L2_29_1 , &outC->_L140_1 );
      copy_struct_7 ( &_L2_28_1 , &outC->_L97_1 );
      copy_struct_7 ( &_1__L2_27_1 , &outC->_L93_1 );
      copy_struct_7 ( &_2__L2_18_1 , &outC->_L20_1 );
      copy_struct_7 ( &_2__L2_4_1 , &outC->_L91_1 );
      copy_struct_7 ( &_1__L2_26_1 , &outC->_L90_1 );
      copy_struct_7 ( &_1__L2_21_1 , &outC->_L26_1 );
      copy_struct_7 ( &_2__L2_7_1 , &outC->_L163_1 );
      copy_struct_7 ( &_1__L2_2_1 , &outC->_L29_1 );
      copy_struct_7 ( &_2__L2_15_1 , &outC->_L51_1 );
      copy_struct_7 ( &_1__L2_24_1 , &outC->_L71_1 );
      copy_struct_7 ( &_1__L2_23_1 , &outC->_L35_1 );
      copy_struct_7 ( &_2__L2_8_1 , &outC->_L5_1 );
      copy_struct_7 ( &_L2_11_1 , &outC->_L54_1 );
      copy_struct_7 ( &_L2_16_1 , &outC->_L32_1 );
      copy_struct_7 ( &_1__L2_19_1 , &outC->_L39_1 );
      copy_struct_7 ( &_L2_14_1 , &outC->_L69_1 );
      copy_struct_7 ( &_1__L2_9_1 , &outC->_L28_1 );
      copy_struct_7 ( &_1__L2_22_1 , &outC->_L80_1 );
      copy_struct_7 ( &_L2_20_1 , &outC->_L75_1 );
      copy_struct_7 ( &_L2_25_1 , &outC->_L15_1 );
      copy_struct_7 ( &_L2_17_1 , &outC->_L76_1 );
      copy_struct_7 ( &_1__L2_3_1 , &outC->_L42_1 );
      copy_struct_7 ( &_1__L2_13_1 , &outC->_L65_1 );
      copy_struct_7 ( &_L2_6_1 , &outC->_1__L132_1 );
      copy_struct_7 ( &_1__L2_5_1 , &outC->_L131_1 );
      copy_struct_7 ( &_1__L2_12_1 , &outC->_L64_1 );
      copy_struct_7 ( &_L2_10_1 , &outC->_L53_1 );
      copy_struct_7 ( &_L2_2_5_1 , &outC->_2_M_pre_ );
      copy_struct_7 ( &_2__L2_1_1_1 , &outC->_1_M_pre_ );
      copy_struct_7 ( &_L2_2_2_1 , &outC->M_pre_ );
      copy_struct_7 ( &_L2_37_1 , &outC->_L133_1 );
      copy_struct_7 ( &_L2_36_1 , &outC->_L2_1 );
      copy_struct_7 ( &_L2_35_1 , &outC->_L132_1 );
      copy_struct_7 ( &_L2_34_1 , &outC->_L21_1 );
      copy_struct_7 ( &_L2_33_1 , &outC->_L130_1 );
      copy_struct_7 ( &_L2_32_1 , &outC->_L127_1 );
      copy_struct_7 ( &_L2_31_1 , &outC->_L123_1 );
      copy_struct_7 ( &_L2_30_1 , &outC->_L122_1 );
      copy_struct_7 ( &_2__L2_29_1 , &outC->_L117_1 );
      copy_struct_7 ( &_1__L2_28_1 , &outC->_L115_1 );
      copy_struct_7 ( &_2__L2_27_1 , &outC->_L112_1 );
      copy_struct_7 ( &_2__L2_26_1 , &outC->_L105_1 );
      copy_struct_7 ( &_2__L2_25_1 , &outC->_L107_1 );
      copy_struct_7 ( &_2__L2_24_1 , &outC->_L102_1 );
      copy_struct_7 ( &_2__L2_23_1 , &outC->_L99_1 );
      copy_struct_7 ( &_2__L2_22_1 , &outC->_L96_1 );
      copy_struct_7 ( &_2__L2_21_1 , &outC->_1__L91_1 );
      copy_struct_7 ( &_2__L2_20_1 , &outC->_1__L89_1 );
      copy_struct_7 ( &_2__L2_19_1 , &outC->_1__L72_1 );
      copy_struct_7 ( &_1__L2_18_1 , &outC->_1__L39_1 );
      copy_struct_7 ( &_2__L2_17_1 , &outC->_L74_1 );
      copy_struct_7 ( &_2__L2_16_1 , &outC->_1__L78_1 );
      copy_struct_7 ( &_1__L2_15_1 , &outC->_1__L75_1 );
      copy_struct_7 ( &_2__L2_14_1 , &outC->_1__L40_1 );
      copy_struct_7 ( &_2__L2_13_1 , &outC->_1__L77_1 );
      copy_struct_7 ( &_2__L2_12_1 , &outC->_1__L71_1 );
      copy_struct_7 ( &_1__L2_10_1 , &outC->_1__L68_1 );
      copy_struct_7 ( &_2__L2_9_1 , &outC->_1__L54_1 );
      copy_struct_7 ( &_L2_7_1 , &outC->_1__L70_1 );
      copy_struct_7 ( &_L2_8_1 , &outC->_L33_1 );
      copy_struct_7 ( &_1__L2_6_1 , &outC->_1__L66_1 );
      copy_struct_7 ( &_2__L2_5_1 , &outC->_1__L51_1 );
      copy_struct_7 ( &_1__L2_4_1 , &outC->_1__L20_1 );
      copy_struct_7 ( &_L2_3_1 , &outC->_1__L57_1 );
      copy_struct_7 ( &_L2_1_1 , &outC->_1__L42_1 );
    }
  copy_struct_4 ( &_L43.commands , commands );
  copy_struct_5 ( &_L43.feedback , (struct_5*) &INIT_FEEDBACK_simulation );
  /* 15 */
   switchAlignment_simulation(&_L2_1_1_1, kcg_true, &_L142_1);
  /* 14 */
   switchAlignment_simulation(&_L2_1_3_1, kcg_true, &outC->_L141_1);
  copy_struct_6 ( &_L3_2_1.d_global , &_L43 );
  copy_struct_7 ( &_L3_2_1.d_local , &_L2_2_2_1 );
  copy_struct_6 ( &_1__L3_1_1.d_global , &_L43 );
  copy_struct_7 ( &_1__L3_1_1.d_local , &_1__L2_1_1_1 );
  /* 117 */
   track_simulation(&_1__L3_1_1, &_L2_37_1, 31, &outC->_31_Context_track);
  copy_struct_7 ( &outC->_L163_1 , &outC->_31_Context_track.output_rear );
  copy_struct_8 ( &_L162_1 , &outC->_31_Context_track.output_front );
  /* 18 */
   switchPoint1_simulation(
    &_L3_2_1,
    &_L162_1,
    &_L2_34_1,
    0,
    &outC->_7_Context_switchPoint1);
  copy_struct_8 ( &_1__L134_1 , &outC->_7_Context_switchPoint1.output_rear );
  copy_struct_7 ( &outC->_L133_1 , &outC->_7_Context_switchPoint1.output_turn );
  copy_struct_7 ( &outC->_L132_1 , &outC->_7_Context_switchPoint1.output_straight );
  /* 11 */
   track_simulation(&_1__L134_1, &_L2_1_1, 24, &outC->_47_Context_track);
  copy_struct_7 ( &outC->_L21_1 , &outC->_47_Context_track.output_rear );
  copy_struct_8 ( &_L3_1 , &outC->_47_Context_track.output_front );
  /* 12 */
   switchPoint2_simulation(
    &_L3_1,
    &_1__L2_6_1,
    &_2__L2_5_1,
    1,
    &outC->_12_Context_switchPoint2);
  copy_struct_8 ( &_L44_1 , &outC->_12_Context_switchPoint2.output_turn );
  copy_struct_8 ( &_L43_1 , &outC->_12_Context_switchPoint2.output_straight );
  copy_struct_7 ( &outC->_1__L42_1 , &outC->_12_Context_switchPoint2.output_front );
  /* 14 */
   track_simulation(&_L43_1, &_2__L2_13_1, 29, &outC->_44_Context_track);
  copy_struct_7 ( &outC->_1__L66_1 , &outC->_44_Context_track.output_rear );
  copy_struct_8 ( &_L65_1 , &outC->_44_Context_track.output_front );
  /* 13 */
   switchPoint2_simulation(
    &_L44_1,
    &_2__L2_9_1,
    &_1__L2_10_1,
    2,
    &outC->_11_Context_switchPoint2);
  copy_struct_8 ( &_L53_1 , &outC->_11_Context_switchPoint2.output_turn );
  copy_struct_8 ( &_L52_1 , &outC->_11_Context_switchPoint2.output_straight );
  copy_struct_7 ( &outC->_1__L51_1 , &outC->_11_Context_switchPoint2.output_front );
  /* 15 */
   track_simulation(&_L53_1, &_2__L2_16_1, 28, &outC->_43_Context_track);
  copy_struct_7 ( &outC->_1__L68_1 , &outC->_43_Context_track.output_rear );
  copy_struct_8 ( &_L67_1 , &outC->_43_Context_track.output_front );
  /* 14 */
   switchPoint2_simulation(
    &_L52_1,
    &_L2_3_1,
    &_L2_7_1,
    3,
    &outC->_10_Context_switchPoint2);
  copy_struct_8 ( &_L56_1 , &outC->_10_Context_switchPoint2.output_turn );
  copy_struct_8 ( &_L55_1 , &outC->_10_Context_switchPoint2.output_straight );
  copy_struct_7 ( &outC->_1__L54_1 , &outC->_10_Context_switchPoint2.output_front );
  /* 16 */
   switchPoint1_simulation(
    &_L65_1,
    &_L67_1,
    &_2__L2_17_1,
    5,
    &outC->_9_Context_switchPoint1);
  copy_struct_8 ( &_L79_1 , &outC->_9_Context_switchPoint1.output_rear );
  copy_struct_7 ( &outC->_1__L78_1 , &outC->_9_Context_switchPoint1.output_turn );
  copy_struct_7 ( &outC->_1__L77_1 , &outC->_9_Context_switchPoint1.output_straight );
  /* 16 */
   track_simulation(&_L56_1, &_1__L2_15_1, 27, &outC->_42_Context_track);
  copy_struct_7 ( &outC->_1__L70_1 , &outC->_42_Context_track.output_rear );
  copy_struct_8 ( &_L69_1 , &outC->_42_Context_track.output_front );
  /* 15 */
   switchPoint2_simulation(
    &_L55_1,
    &_1__L2_4_1,
    &_L2_8_1,
    4,
    &outC->_9_Context_switchPoint2);
  copy_struct_8 ( &_L59_1 , &outC->_9_Context_switchPoint2.output_turn );
  copy_struct_8 ( &_L58_1 , &outC->_9_Context_switchPoint2.output_straight );
  copy_struct_7 ( &outC->_1__L57_1 , &outC->_9_Context_switchPoint2.output_front );
  /* 15 */
   switchPoint1_simulation(
    &_L79_1,
    &_L69_1,
    &_1__L2_18_1,
    6,
    &outC->_10_Context_switchPoint1);
  copy_struct_8 ( &_L76_1 , &outC->_10_Context_switchPoint1.output_rear );
  copy_struct_7 ( &outC->_1__L75_1 , &outC->_10_Context_switchPoint1.output_turn );
  copy_struct_7 ( &outC->_L74_1 , &outC->_10_Context_switchPoint1.output_straight );
  /* 13 */
   track_simulation(&_L59_1, &_2__L2_14_1, 26, &outC->_45_Context_track);
  copy_struct_7 ( &outC->_L33_1 , &outC->_45_Context_track.output_rear );
  copy_struct_8 ( &_L32_1 , &outC->_45_Context_track.output_front );
  /* 12 */
   track_simulation(&_L58_1, &_2__L2_12_1, 25, &outC->_46_Context_track);
  copy_struct_7 ( &outC->_1__L20_1 , &outC->_46_Context_track.output_rear );
  copy_struct_8 ( &_L4_1 , &outC->_46_Context_track.output_front );
  /* 13 */
   switchPoint1_simulation(
    &_L76_1,
    &_L32_1,
    &_2__L2_19_1,
    7,
    &outC->_12_Context_switchPoint1);
  copy_struct_8 ( &_L41_1 , &outC->_12_Context_switchPoint1.output_rear );
  copy_struct_7 ( &outC->_1__L40_1 , &outC->_12_Context_switchPoint1.output_turn );
  copy_struct_7 ( &outC->_1__L39_1 , &outC->_12_Context_switchPoint1.output_straight );
  /* 14 */
   switchPoint1_simulation(
    &_L4_1,
    &_L41_1,
    &_2__L2_20_1,
    8,
    &outC->_11_Context_switchPoint1);
  copy_struct_8 ( &_L73_1 , &outC->_11_Context_switchPoint1.output_rear );
  copy_struct_7 ( &outC->_1__L72_1 , &outC->_11_Context_switchPoint1.output_turn );
  copy_struct_7 ( &outC->_1__L71_1 , &outC->_11_Context_switchPoint1.output_straight );
  /* 17 */
   track_simulation(&_L73_1, &_2__L2_21_1, 30, &outC->_41_Context_track);
  copy_struct_7 ( &outC->_1__L89_1 , &outC->_41_Context_track.output_rear );
  copy_struct_8 ( &_L88_1 , &outC->_41_Context_track.output_front );
  /* 16 */
   switchPoint2_simulation(
    &_L88_1,
    &_2__L2_22_1,
    &_L2_36_1,
    9,
    &outC->_8_Context_switchPoint2);
  copy_struct_8 ( &_L93_1 , &outC->_8_Context_switchPoint2.output_turn );
  copy_struct_8 ( &_L92_1 , &outC->_8_Context_switchPoint2.output_straight );
  copy_struct_7 ( &outC->_1__L91_1 , &outC->_8_Context_switchPoint2.output_front );
  /* 18 */
   track_simulation(&_L92_1, &_2__L2_23_1, 15, &outC->_40_Context_track);
  copy_struct_7 ( &outC->_L96_1 , &outC->_40_Context_track.output_rear );
  copy_struct_8 ( &_L95_1 , &outC->_40_Context_track.output_front );
  /* 19 */
   track_simulation(&_L95_1, &_2__L2_24_1, 16, &outC->_39_Context_track);
  copy_struct_7 ( &outC->_L99_1 , &outC->_39_Context_track.output_rear );
  copy_struct_8 ( &_L98_1 , &outC->_39_Context_track.output_front );
  /* 110 */
   track_simulation(&_L98_1, &_2__L2_25_1, 17, &outC->_38_Context_track);
  copy_struct_7 ( &outC->_L102_1 , &outC->_38_Context_track.output_rear );
  copy_struct_8 ( &_L101_1 , &outC->_38_Context_track.output_front );
  /* 17 */
   switchPoint2_simulation(
    &_L101_1,
    &_2__L2_26_1,
    &_2__L2_27_1,
    15,
    &outC->_7_Context_switchPoint2);
  copy_struct_8 ( &_L109_1 , &outC->_7_Context_switchPoint2.output_turn );
  copy_struct_8 ( &_L108_1 , &outC->_7_Context_switchPoint2.output_straight );
  copy_struct_7 ( &outC->_L107_1 , &outC->_7_Context_switchPoint2.output_front );
  /* 112 */
   track_simulation(&_L109_1, &_1__L2_28_1, 19, &outC->_36_Context_track);
  copy_struct_7 ( &outC->_L112_1 , &outC->_36_Context_track.output_rear );
  copy_struct_8 ( &_L111_1 , &outC->_36_Context_track.output_front );
  /* 111 */
   track_simulation(&_L108_1, &_2__L2_29_1, 18, &outC->_37_Context_track);
  copy_struct_7 ( &outC->_L105_1 , &outC->_37_Context_track.output_rear );
  copy_struct_8 ( &_L104_1 , &outC->_37_Context_track.output_front );
  /* 114 */
   track_simulation(&_L104_1, &_L2_31_1, 20, &outC->_34_Context_track);
  copy_struct_7 ( &outC->_L117_1 , &outC->_34_Context_track.output_rear );
  copy_struct_8 ( &_L116_1 , &outC->_34_Context_track.output_front );
  /* 113 */
   track_simulation(&_L111_1, &_L2_30_1, 21, &outC->_35_Context_track);
  copy_struct_7 ( &outC->_L115_1 , &outC->_35_Context_track.output_rear );
  copy_struct_8 ( &_L114_1 , &outC->_35_Context_track.output_front );
  /* 17 */
   switchPoint1_simulation(
    &_L114_1,
    &_L116_1,
    &_L2_32_1,
    14,
    &outC->_8_Context_switchPoint1);
  copy_struct_8 ( &_L124_1 , &outC->_8_Context_switchPoint1.output_rear );
  copy_struct_7 ( &outC->_L123_1 , &outC->_8_Context_switchPoint1.output_turn );
  copy_struct_7 ( &outC->_L122_1 , &outC->_8_Context_switchPoint1.output_straight );
  /* 115 */
   track_simulation(&_L124_1, &_L2_33_1, 22, &outC->_33_Context_track);
  copy_struct_7 ( &outC->_L127_1 , &outC->_33_Context_track.output_rear );
  copy_struct_8 ( &_L126_1 , &outC->_33_Context_track.output_front );
  /* 116 */
   track_simulation(&_L126_1, &_L2_35_1, 23, &outC->_32_Context_track);
  copy_struct_7 ( &outC->_L130_1 , &outC->_32_Context_track.output_rear );
  copy_struct_8 ( &_L129_1 , &outC->_32_Context_track.output_front );
  copy_struct_6 ( &_L3_4_1.d_global , &_L129_1.d_global );
  copy_struct_7 ( &_L3_4_1.d_local , &_1__L2_1_2_1 );
  copy_struct_6 ( &_L3_1_1.d_global , &_L129_1.d_global );
  copy_struct_7 ( &_L3_1_1.d_local , &_1__L2_29_1 );
  copy_struct_6 ( &_L3_3_1.d_global , &_L129_1.d_global );
  copy_struct_7 ( &_L3_3_1.d_local , &_2__L2_1_1_1 );
  copy_struct_6 ( &_L3_5_1.d_global , &_L129_1.d_global );
  copy_struct_7 ( &_L3_5_1.d_local , &_L2_2_3_1 );
  /* 114 */
   track_simulation(&_L3_4_1, &_1__L2_23_1, 35, &outC->_19_Context_track);
  copy_struct_7 ( &outC->_L71_1 , &outC->_19_Context_track.output_rear );
  copy_struct_8 ( &_L70_1 , &outC->_19_Context_track.output_front );
  /* 12 */
   track_simulation(&_L3_5_1, &_2__L2_4_1, 14, &outC->_22_Context_track);
  copy_struct_7 ( &outC->_L44_1 , &outC->_22_Context_track.output_rear );
  copy_struct_8 ( &_1__L43_1 , &outC->_22_Context_track.output_front );
  /* 113 */
   track_simulation(&_L70_1, &_1__L2_22_1, 36, &outC->_25_Context_track);
  copy_struct_7 ( &outC->_L35_1 , &outC->_25_Context_track.output_rear );
  copy_struct_8 ( &_L34_1 , &outC->_25_Context_track.output_front );
  /* 13 */
   track_simulation(&_L3_3_1, &_1__L2_5_1, 32, &outC->_30_Context_track);
  copy_struct_7 ( &outC->_L2_1 , &outC->_30_Context_track.output_rear );
  copy_struct_8 ( &_1__L1_1 , &outC->_30_Context_track.output_front );
  /* 112 */
   track_simulation(&_L34_1, &_1__L2_21_1, 37, &outC->_17_Context_track);
  copy_struct_7 ( &outC->_L80_1 , &outC->_17_Context_track.output_rear );
  copy_struct_8 ( &_2__L79_1 , &outC->_17_Context_track.output_front );
  /* 111 */
   track_simulation(&_2__L79_1, &_L2_20_1, 38, &outC->_28_Context_track);
  copy_struct_7 ( &outC->_L26_1 , &outC->_28_Context_track.output_rear );
  copy_struct_8 ( &_L25_1 , &outC->_28_Context_track.output_front );
  /* 110 */
   track_simulation(&_L25_1, &_L2_6_1, 39, &outC->_18_Context_track);
  copy_struct_7 ( &outC->_L75_1 , &outC->_18_Context_track.output_rear );
  copy_struct_8 ( &_1__L74_1 , &outC->_18_Context_track.output_front );
  /* 12 */
   switchPointCross_simulation(
    &_1__L1_1,
    &_1__L74_1,
    &_L142_1,
    &_1__L2_19_1,
    28,
    27,
    40,
    &outC->Context_switchPointCross);
  copy_struct_8 ( &_L134_1 , &outC->Context_switchPointCross.output_turn_front );
  copy_struct_8 ( &_L133_1 , &outC->Context_switchPointCross.output_straight_front );
  copy_struct_7 ( &outC->_1__L132_1 , &outC->Context_switchPointCross.output_turn_rear );
  copy_struct_7 ( &outC->_L131_1 , &outC->Context_switchPointCross.output_straight_rear );
  /* 19 */
   track_simulation(&_L134_1, &_2__L2_18_1, 40, &outC->_24_Context_track);
  copy_struct_7 ( &outC->_L39_1 , &outC->_24_Context_track.output_rear );
  copy_struct_8 ( &_L38_1 , &outC->_24_Context_track.output_front );
  /* 12 */
   switchPoint2_simulation(
    &_L38_1,
    &_L2_14_1,
    &_L2_17_1,
    25,
    &outC->_6_Context_switchPoint2);
  copy_struct_8 ( &_L22_1 , &outC->_6_Context_switchPoint2.output_turn );
  copy_struct_8 ( &_L21_1 , &outC->_6_Context_switchPoint2.output_straight );
  copy_struct_7 ( &outC->_L20_1 , &outC->_6_Context_switchPoint2.output_front );
  /* 16 */
   track_simulation(&_L21_1, &_1__L2_12_1, 43, &outC->_20_Context_track);
  copy_struct_7 ( &outC->_L69_1 , &outC->_20_Context_track.output_rear );
  copy_struct_8 ( &_L68_1 , &outC->_20_Context_track.output_front );
  /* 11 */
   switchPoint2_simulation(
    &_L22_1,
    &_L2_16_1,
    &_2__L2_15_1,
    26,
    &outC->_5_Context_switchPoint2);
  copy_struct_8 ( &_L78_1 , &outC->_5_Context_switchPoint2.output_turn );
  copy_struct_8 ( &_L77_1 , &outC->_5_Context_switchPoint2.output_straight );
  copy_struct_7 ( &outC->_L76_1 , &outC->_5_Context_switchPoint2.output_front );
  /* 17 */
   track_simulation(&_L78_1, &_L2_11_1, 42, &outC->_21_Context_track);
  copy_struct_7 ( &outC->_L51_1 , &outC->_21_Context_track.output_rear );
  copy_struct_8 ( &_1__L50_1 , &outC->_21_Context_track.output_front );
  /* 18 */
   track_simulation(&_L77_1, &_L2_10_1, 41, &outC->_26_Context_track);
  copy_struct_7 ( &outC->_L32_1 , &outC->_26_Context_track.output_rear );
  copy_struct_8 ( &_1__L31_1 , &outC->_26_Context_track.output_front );
  /* 12 */
   switchPoint1_simulation(
    &_1__L31_1,
    &_1__L50_1,
    &_1__L2_13_1,
    22,
    &outC->_6_Context_switchPoint1);
  copy_struct_8 ( &_2__L55_1 , &outC->_6_Context_switchPoint1.output_rear );
  copy_struct_7 ( &outC->_L54_1 , &outC->_6_Context_switchPoint1.output_turn );
  copy_struct_7 ( &outC->_L53_1 , &outC->_6_Context_switchPoint1.output_straight );
  /* 11 */
   switchPoint1_simulation(
    &_L68_1,
    &_2__L55_1,
    &_1__L2_9_1,
    21,
    &outC->_5_Context_switchPoint1);
  copy_struct_8 ( &_L66_1 , &outC->_5_Context_switchPoint1.output_rear );
  copy_struct_7 ( &outC->_L65_1 , &outC->_5_Context_switchPoint1.output_turn );
  copy_struct_7 ( &outC->_L64_1 , &outC->_5_Context_switchPoint1.output_straight );
  /* 15 */
   track_simulation(&_L66_1, &_2__L2_8_1, 44, &outC->_27_Context_track);
  copy_struct_7 ( &outC->_L28_1 , &outC->_27_Context_track.output_rear );
  copy_struct_8 ( &_L27_1 , &outC->_27_Context_track.output_front );
  switchPointCross_simulation(
    &_L27_1,
    &_L3_1_1,
    &_L2_25_1,
    &_2__L2_7_1,
    16,
    17,
    44,
    &outC->_1_Context_switchPointCross);
  copy_struct_8 ( &_L8_1 , &outC->_1_Context_switchPointCross.output_turn_front );
  copy_struct_8 ( &_L7_1 , &outC->_1_Context_switchPointCross.output_straight_front );
  copy_struct_7 ( &_L6_1 , &outC->_1_Context_switchPointCross.output_turn_rear );
  copy_struct_7 ( &outC->_L5_1 , &outC->_1_Context_switchPointCross.output_straight_rear );
  /* 12 */
   switchAlignment_simulation(&_L6_1, kcg_true, &_L138_1);
  /* 115 */
   track_simulation(&_L7_1, &_1__L2_26_1, 34, &outC->_29_Context_track);
  copy_struct_7 ( &outC->_L15_1 , &outC->_29_Context_track.output_rear );
  copy_struct_8 ( &_L14_1 , &outC->_29_Context_track.output_front );
  /* 13 */
   switchPoint1_simulation(
    &_L14_1,
    &_1__L43_1,
    &_L2_28_1,
    10,
    &outC->_4_Context_switchPoint1);
  copy_struct_8 ( &_1__L92_1 , &outC->_4_Context_switchPoint1.output_rear );
  copy_struct_7 ( &outC->_L91_1 , &outC->_4_Context_switchPoint1.output_turn );
  copy_struct_7 ( &outC->_L90_1 , &outC->_4_Context_switchPoint1.output_straight );
  /* 116 */
   track_simulation(&_1__L92_1, &_1__L2_27_1, 33, &outC->_16_Context_track);
  copy_struct_7 ( &outC->_L97_1 , &outC->_16_Context_track.output_rear );
  copy_struct_8 ( &_L96_1 , &outC->_16_Context_track.output_front );
  /* 13 */
   switchPoint2_simulation(
    &_L96_1,
    &_1__L2_24_1,
    &_1__L2_3_1,
    12,
    &outC->_4_Context_switchPoint2);
  copy_struct_8 ( &_1__L95_1 , &outC->_4_Context_switchPoint2.output_turn );
  copy_struct_8 ( &_L94_1 , &outC->_4_Context_switchPoint2.output_straight );
  copy_struct_7 ( &outC->_L93_1 , &outC->_4_Context_switchPoint2.output_front );
  /* 11 */
   track_simulation(&_1__L95_1, &_1__L2_2_1, 45, &outC->_23_Context_track);
  copy_struct_7 ( &outC->_L42_1 , &outC->_23_Context_track.output_rear );
  copy_struct_8 ( &_1__L41_1 , &outC->_23_Context_track.output_front );
  copy_struct_6 ( &_1__L3_3_1.d_global , &_1__L41_1.d_global );
  copy_struct_7 ( &_1__L3_3_1.d_local , &_L2_1_2_1 );
  copy_struct_6 ( &_2__L3_1_1.d_global , &_1__L41_1.d_global );
  copy_struct_7 ( &_2__L3_1_1.d_local , &_L2_2_5_1 );
  copy_struct_6 ( &_1__L3_2_1.d_global , &_1__L41_1.d_global );
  copy_struct_7 ( &_1__L3_2_1.d_local , &_L138_1 );
  /* 15 */
   track_simulation(&_2__L3_1_1, &_1__L2_7_1, 46, &outC->_12_Context_track);
  copy_struct_7 ( &outC->_L29_1 , &outC->_12_Context_track.output_rear );
  copy_struct_8 ( &_L28_1 , &outC->_12_Context_track.output_front );
  /* 16 */
   track_simulation(&_1__L3_3_1, &_L2_22_1, 6, &outC->_15_Context_track);
  copy_struct_7 ( &outC->_1__L2_1 , &outC->_15_Context_track.output_rear );
  copy_struct_8 ( &_L1_1 , &outC->_15_Context_track.output_front );
  /* 13 */
   switchPoint1_simulation(
    &_L1_1,
    &_1__L3_2_1,
    &_1__L2_16_1,
    18,
    &outC->_2_Context_switchPoint1);
  copy_struct_8 ( &_1__L55_1 , &outC->_2_Context_switchPoint1.output_rear );
  copy_struct_7 ( &_L54_1 , &outC->_2_Context_switchPoint1.output_turn );
  copy_struct_7 ( &outC->_1__L53_1 , &outC->_2_Context_switchPoint1.output_straight );
  /* 13 */
   track_simulation(&_L28_1, &_2__L2_3_1, 47, &outC->_11_Context_track);
  copy_struct_7 ( &outC->_1__L32_1 , &outC->_11_Context_track.output_rear );
  copy_struct_8 ( &_L31_1 , &outC->_11_Context_track.output_front );
  /* 13 */
   switchAlignment_simulation(&_L54_1, kcg_true, &outC->_L140_1);
  /* 116 */
   track_simulation(&_1__L55_1, &_2__L2_10_1, 7, &outC->_1_Context_track);
  copy_struct_7 ( &outC->_L88_1 , &outC->_1_Context_track.output_rear );
  copy_struct_8 ( &_L87_1 , &outC->_1_Context_track.output_front );
  /* 13 */
   switchPoint2_simulation(
    &_L87_1,
    &_1__L2_25_1,
    &_L2_26_1,
    20,
    &outC->_2_Context_switchPoint2);
  copy_struct_8 ( &_L63_1 , &outC->_2_Context_switchPoint2.output_turn );
  copy_struct_8 ( &_L62_1 , &outC->_2_Context_switchPoint2.output_straight );
  copy_struct_7 ( &outC->_L61_1 , &outC->_2_Context_switchPoint2.output_front );
  /* 12 */
   switchPoint2_simulation(
    &_L63_1,
    &_L2_29_1,
    &_L2_27_1,
    19,
    &outC->_3_Context_switchPoint2);
  copy_struct_8 ( &_L51_1 , &outC->_3_Context_switchPoint2.output_turn );
  copy_struct_8 ( &_L50_1 , &outC->_3_Context_switchPoint2.output_straight );
  copy_struct_7 ( &outC->_L49_1 , &outC->_3_Context_switchPoint2.output_front );
  /* 117 */
   track_simulation(&_L50_1, &_2__L2_6_1, 10, &outC->Context_track);
  copy_struct_7 ( &outC->_L121_1 , &outC->Context_track.output_rear );
  copy_struct_8 ( &_L120_1 , &outC->Context_track.output_front );
  /* 12 */
   track_simulation(&_L51_1, &_L2_13_1, 9, &outC->_5_Context_track);
  copy_struct_7 ( &outC->_L77_1 , &outC->_5_Context_track.output_rear );
  copy_struct_8 ( &_1__L76_1 , &outC->_5_Context_track.output_front );
  /* 14 */
   track_simulation(&_L62_1, &_L2_19_1, 8, &outC->_8_Context_track);
  copy_struct_7 ( &outC->_L57_1 , &outC->_8_Context_track.output_rear );
  copy_struct_8 ( &_1__L56_1 , &outC->_8_Context_track.output_front );
  /* 14 */
   switchPoint1_simulation(
    &_L120_1,
    &_1__L76_1,
    &_1__L2_14_1,
    23,
    &outC->_3_Context_switchPoint1);
  copy_struct_8 ( &_L18_1 , &outC->_3_Context_switchPoint1.output_rear );
  copy_struct_7 ( &outC->_L17_1 , &outC->_3_Context_switchPoint1.output_turn );
  copy_struct_7 ( &outC->_L16_1 , &outC->_3_Context_switchPoint1.output_straight );
  /* 12 */
   switchPoint1_simulation(
    &_1__L56_1,
    &_L18_1,
    &_L2_15_1,
    24,
    &outC->_1_Context_switchPoint1);
  copy_struct_8 ( &_L71_1 , &outC->_1_Context_switchPoint1.output_rear );
  copy_struct_7 ( &outC->_L70_1 , &outC->_1_Context_switchPoint1.output_turn );
  copy_struct_7 ( &outC->_1__L69_1 , &outC->_1_Context_switchPoint1.output_straight );
  /* 111 */
   track_simulation(&_L71_1, &_L2_18_1, 11, &outC->_2_Context_track);
  copy_struct_7 ( &outC->_L86_1 , &outC->_2_Context_track.output_rear );
  copy_struct_8 ( &_L85_1 , &outC->_2_Context_track.output_front );
  /* 14 */
   switchPoint2_simulation(
    &_L85_1,
    &_1__L2_11_1,
    &_1__L2_17_1,
    29,
    &outC->Context_switchPoint2);
  copy_struct_8 ( &_L91_1 , &outC->Context_switchPoint2.output_turn );
  copy_struct_8 ( &_L90_1 , &outC->Context_switchPoint2.output_straight );
  copy_struct_7 ( &outC->_L89_1 , &outC->Context_switchPoint2.output_front );
  /* 18 */
   track_simulation(&_L90_1, &_L2_21_1, 1, &outC->_9_Context_track);
  copy_struct_7 ( &outC->_L48_1 , &outC->_9_Context_track.output_rear );
  copy_struct_8 ( &_L47_1 , &outC->_9_Context_track.output_front );
  /* 112 */
   track_simulation(&_L47_1, &_L2_9_1, 2, &outC->_10_Context_track);
  copy_struct_7 ( &outC->_L40_1 , &outC->_10_Context_track.output_rear );
  copy_struct_8 ( &_L39_1 , &outC->_10_Context_track.output_front );
  /* 19 */
   track_simulation(&_L39_1, &_L2_23_1, 3, &outC->_7_Context_track);
  copy_struct_7 ( &outC->_L66_1 , &outC->_7_Context_track.output_rear );
  copy_struct_8 ( &_1__L65_1 , &outC->_7_Context_track.output_front );
  /* 114 */
   track_simulation(&_1__L65_1, &_L2_24_1, 4, &outC->_14_Context_track);
  copy_struct_7 ( &outC->_L11_1 , &outC->_14_Context_track.output_rear );
  copy_struct_8 ( &_L10_1 , &outC->_14_Context_track.output_front );
  /* 113 */
   track_simulation(&_L10_1, &_1__L2_1_1, 5, &outC->_13_Context_track);
  copy_struct_7 ( &outC->_L24_1 , &outC->_13_Context_track.output_rear );
  copy_struct_8 ( &_L23_1 , &outC->_13_Context_track.output_front );
  /* 11 */
   switchPoint1_simulation(
    &_L23_1,
    &_L31_1,
    &_L2_5_1,
    13,
    &outC->Context_switchPoint1);
  copy_struct_8 ( &_L74_1 , &outC->Context_switchPoint1.output_rear );
  copy_struct_7 ( &outC->_L73_1 , &outC->Context_switchPoint1.output_turn );
  copy_struct_7 ( &outC->_L72_1 , &outC->Context_switchPoint1.output_straight );
  /* 11 */
   track_simulation(&_L74_1, &_L2_4_1, 0, &outC->_4_Context_track);
  copy_struct_7 ( &outC->_L82_1 , &outC->_4_Context_track.output_rear );
  copy_struct_8 ( &_L81_1 , &outC->_4_Context_track.output_front );
  /* 11 */
   switchPoint2_simulation(
    &_L81_1,
    &_L2_2_1,
    &_1__L2_20_1,
    11,
    &outC->_1_Context_switchPoint2);
  copy_struct_8 ( &_L80_1 , &outC->_1_Context_switchPoint2.output_turn );
  copy_struct_8 ( &_1__L79_1 , &outC->_1_Context_switchPoint2.output_straight );
  copy_struct_7 ( &outC->_L78_1 , &outC->_1_Context_switchPoint2.output_front );
  /* 115 */
   track_simulation(&_L80_1, &_L2_12_1, 12, &outC->_6_Context_track);
  copy_struct_7 ( &outC->_L68_1 , &outC->_6_Context_track.output_rear );
  copy_struct_8 ( &_1__L67_1 , &outC->_6_Context_track.output_front );
  /* 17 */
   track_simulation(&_1__L67_1, &_1__L2_8_1, 13, &outC->_3_Context_track);
  copy_struct_7 ( &outC->_L84_1 , &outC->_3_Context_track.output_rear );
  copy_struct_8 ( &_L83_1 , &outC->_3_Context_track.output_front );
  copy_array_6 ( &outC->feedback_sensors.contacts , &_L83_1.d_global.feedback.contacts );
  copy_array_8 ( &outC->feedback_sensors.extTrackData , &_L83_1.d_global.feedback.extTrackData );
  copy_array_3 ( &outC->feedback_debug.positionHead , &_L83_1.d_global.feedback.positionHead );
  copy_array_3 ( &outC->feedback_debug.positionTail , &_L83_1.d_global.feedback.positionTail );
  copy_array_7 ( &outC->feedback_debug.blockErrors , &_L83_1.d_global.feedback.blockErrors );
  copy_array_7 ( &outC->feedback_debug.pointErrors , &_L83_1.d_global.feedback.pointErrors );
  copy_struct_7 ( &outC->_8_M_pre_ , &_1__L79_1.d_local );
  copy_struct_7 ( &outC->_7_M_pre_ , &_L91_1.d_local );
  copy_struct_7 ( &outC->_6_M_pre_ , &_L83_1.d_local );
  copy_struct_7 ( &outC->_5_M_pre_ , &_L133_1.d_local );
  copy_struct_7 ( &outC->_4_M_pre_ , &_L94_1.d_local );
  copy_struct_7 ( &outC->_3_M_pre_ , &_L8_1.d_local );
  copy_struct_7 ( &outC->_2_M_pre_ , &_1__L41_1.d_local );
  copy_struct_7 ( &outC->_1_M_pre_ , &_L93_1.d_local );
  copy_struct_7 ( &outC->M_pre_ , &_L129_1.d_local );
  outC->init = kcg_false;
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** tracksimulator_simulation.c
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
