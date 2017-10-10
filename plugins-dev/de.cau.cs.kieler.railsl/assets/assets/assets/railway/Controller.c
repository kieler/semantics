/*
 * Automatically generated C code by
 * KIELER SCCharts - The Key to Efficient Modeling
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 */

typedef struct {
  char contacts[48][2];
  int tracks[48][2];
  char points[30];
  int signals[48][2];
  char lights[24];
  char second;
  char crossing;
  char _g0;
  char _g1;
  char _g2;
  char _g3;
  char _GO;
  char _TERM;
  char _pg1;
} TickData;

void reset(TickData* d) {
  d->_GO = 1;
  d->_TERM = 0;
  d->_pg1 = 0;
}

void logic(TickData* d) {
  d->_g0 = d->_GO;
  d->_g2 = d->_pg1;
  d->_g1 = d->_g0 || d->_g2;
  if (d->_g1) {
    d->points[1] = 1;
    d->tracks[25][0] = 120;
    d->tracks[25][1] = 1;
    d->signals[25][1] = 4;
    d->signals[25][0] = 1;
}

void tick(TickData* d) {
  logic(d);

  d->_pg1 = d->_g1;
  d->_GO = 0;
}
