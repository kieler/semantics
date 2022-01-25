#ifndef _TEST_RUN11_H
#  define _TEST_RUN11_H

typedef int t1;

#  define _t1(x,y) (*(x) = (y))

#  define f1(x,y) ( (x) + (y) )
#  define f2(x,y) ( (x) - (y) )
#  define f3(x,y,z) ( (x) + (y) - (z) )
#  define f4(x) ( (x) + 4 )

#endif
