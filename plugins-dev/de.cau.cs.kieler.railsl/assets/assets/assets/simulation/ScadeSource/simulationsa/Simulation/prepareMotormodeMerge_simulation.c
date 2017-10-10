/* $**************  KCG Version 6.0.0b (build i19) **************
** Command: s2c -config U:/SIMULATION/Programmcode/ScadeSource/simulationsa/Simulation\kcg_s2c_config.txt
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
#include "kcg_consts.h"
#include "kcg_sensors.h"
#include "prepareMotormodeMerge_simulation.h"
void prepareMotormodeMerge_simulation(
  motormodeArray_simulation *Motormodes /* simulation::prepareMotormodeMerge::Motormodes */,
  speedArray_simulation *Speeds /* simulation::prepareMotormodeMerge::Speeds */,
  motormodeArray_simulation *PreparedMotormodes /* simulation::prepareMotormodeMerge::PreparedMotormodes */)
{
  
  kcg_int i;
  
  for (i = 0; i < 48; i++)
    {
      (*PreparedMotormodes)[i] = prepareMotormode_simulation(
          (*Motormodes)[i],
          (*Speeds)[i]);
    }
}

/* $**************  KCG Version 6.0.0b (build i19) **************
** prepareMotormodeMerge_simulation.c
** Generation date: 2009-02-24T01:42:12
*************************************************************$ */
