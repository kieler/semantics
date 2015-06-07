#ifndef _TEST_PROCEDURE1_H
#  define _TEST_PROCEDURE1_H

#  ifndef MAIN
void proc1(integer *a, boolean *b, integer c, integer d, boolean e)
{
  *a += c + d;
  *b = e;
}
#  endif
#endif
