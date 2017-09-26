/*
 * Copyright (c) 2013, Christian Motika
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

#ifdef WIN32
// Windows case
#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
LARGE_INTEGER remembered_time;

#else
// Non-Windows case
#include <stdio.h>
#include <time.h>
//#include <stdint.h>
#include <sys/time.h>
//#include <errno.h>
//#include <string.h>
//#include <sys/resource.h>
double remembered_time;
#endif

#ifdef __MACH__
#include <sys/types.h>
#include <sys/_types/_timespec.h>
#include <mach/mach.h>
#include <mach/clock.h>

/* The opengroup spec isn't clear on the mapping from REALTIME to CALENDAR
 being appropriate or not.
 http://pubs.opengroup.org/onlinepubs/009695299/basedefs/time.h.html */

// XXX only supports a single timer
#define TIMER_ABSTIME -1
#define CLOCK_REALTIME CALENDAR_CLOCK
#define CLOCK_MONOTONIC SYSTEM_CLOCK

typedef int clockid_t;

/* the mach kernel uses struct mach_timespec, so struct timespec
    is loaded from <sys/_types/_timespec.h> for compatability */
// struct timespec { time_t tv_sec; long tv_nsec; };

int clock_gettime(clockid_t clk_id, struct timespec *tp);

#include <mach/mach_time.h>

#define MT_NANO (+1.0E-9)
#define MT_GIGA UINT64_C(1000000000)

// TODO create a list of timers,
static double mt_timebase = 0.0;
static uint64_t mt_timestart = 0;

// TODO be more careful in a multithreaded environement
int clock_gettime(clockid_t clk_id, struct timespec *tp)
{
    kern_return_t retval = KERN_SUCCESS;
    if( clk_id == TIMER_ABSTIME)
    {
        if (!mt_timestart) { // only one timer, initilized on the first call to the TIMER
            mach_timebase_info_data_t tb = { 0 };
            mach_timebase_info(&tb);
            mt_timebase = tb.numer;
            mt_timebase /= tb.denom;
            mt_timestart = mach_absolute_time();
        }

        double diff = (mach_absolute_time() - mt_timestart) * mt_timebase;
        tp->tv_sec = diff * MT_NANO;
        tp->tv_nsec = diff - (tp->tv_sec * MT_GIGA);
    }
    else // other clk_ids are mapped to the coresponding mach clock_service
    {
        clock_serv_t cclock;
        mach_timespec_t mts;

        host_get_clock_service(mach_host_self(), clk_id, &cclock);
        retval = clock_get_time(cclock, &mts);
        mach_port_deallocate(mach_task_self(), cclock);

        tp->tv_sec = mts.tv_sec;
        tp->tv_nsec = mts.tv_nsec;
    }

    return retval;
}
#endif


void resetusertime()
{
#ifdef WIN32
// Windows case
    QueryPerformanceCounter(&remembered_time);
    return;
#else
// Non-Windows case
//    time_t current_time;
//    gettimeofday(&tv, NULL); 
//    remembered_time=tv.tv_sec;

struct timespec ts_current;
clock_gettime(CLOCK_MONOTONIC, &ts_current);
remembered_time = (double)((ts_current.tv_sec*1000.0) + (ts_current.tv_nsec/1000000.0));

//    struct timeval tim;
//    struct rusage ru;
//    getrusage(RUSAGE_SELF, &ru);
//    tim = ru.ru_utime;
//    remembered_time = (double)((tim.tv_sec*1000.0) + (tim.tv_usec/1000.0));
#endif
}


double getusertime()
{
#ifdef WIN32
// Windows case

    LARGE_INTEGER frequency;
    LARGE_INTEGER current_time;
    double t;

    QueryPerformanceFrequency(&frequency);
    QueryPerformanceCounter(&current_time);

      // return Milliseconds
      t = (double) ((current_time.QuadPart - remembered_time.QuadPart) * 1000) / frequency.QuadPart;
    return t;
#else
// Non-Windows case

//struct timeval tv;
//    time_t current_time;
//    gettimeofday(&tv, NULL); 
//    current_time=tv.tv_sec;

double current_time;
struct timespec ts_current;
clock_gettime(CLOCK_MONOTONIC, &ts_current);
current_time = (double)((ts_current.tv_sec*1000.0) + (ts_current.tv_nsec/1000000.0));


//    struct timeval tim;
//    struct rusage ru;
//    double current_time;
//    if (getrusage(RUSAGE_SELF, &ru) != -1) {
//    tim = ru.ru_utime;
//    current_time = (double)((tim.tv_sec*1000.0) + (tim.tv_usec/1000.0));
//    } else {
//       printf("Oh dear, something went wrong:%i\n", errno);
//       return -1;
//    }

    return (current_time - remembered_time);

#endif
}
