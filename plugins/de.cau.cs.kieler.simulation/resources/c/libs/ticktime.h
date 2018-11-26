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

#if defined WIN32
// - Windows case -
#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
LARGE_INTEGER remembered_time;
LARGE_INTEGER frequency;
#elif defined __MACH__
// - Mac case -
#import <mach/mach_time.h>

uint64_t remembered_time;
#else
// - Unix case -
// Make sure clocks are available in c99 compilation
#define _POSIX_C_SOURCE 199309L

#include <time.h>
#include <unistd.h>
struct timespec remembered_spec;
long int remembered_time;
#endif


void resetticktime() {
#if defined WIN32
    QueryPerformanceFrequency(&frequency);
    QueryPerformanceCounter(&remembered_time);
    return;
#elif defined __MACH__
    remembered_time = mach_absolute_time();
#elif defined CLOCK_REALTIME
	clock_gettime(CLOCK_REALTIME, &remembered_spec);
#endif
}

double getticktime() {
#if defined WIN32
    LARGE_INTEGER current_time;
    QueryPerformanceCounter(&current_time);

    // Time in milliseconds
    return (((double) (current_time.QuadPart - remembered_time.QuadPart)) * 1000000000) / frequency.QuadPart;
#elif defined __MACH__
    uint64_t end = mach_absolute_time();
    uint64_t elapsed = end - remembered_time;
    
    mach_timebase_info_data_t info;
    if (mach_timebase_info(&info) != KERN_SUCCESS) {
        return -1.0;
    }
    
    return (double) elapsed * info.numer / info.denom;
#elif defined CLOCK_REALTIME
	struct timespec now;
	double diff;
	
    clock_gettime(CLOCK_REALTIME, &now);
	
    if (clock_gettime(CLOCK_REALTIME, &now) == -1) {
        return -1.0;
    }
	
	diff = ((double)(now.tv_sec - remembered_spec.tv_sec)) * 1000000000;
	diff += now.tv_nsec - remembered_spec.tv_nsec;

    return diff;
#else
    return -1.0;
#endif
}
