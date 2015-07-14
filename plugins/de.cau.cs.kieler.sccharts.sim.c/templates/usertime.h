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
#include <stdint.h>
#include <sys/time.h>
#include <sys/resource.h>
double remembered_time;
#endif


void resetusertime()
{
#ifdef WIN32
// Windows case
    QueryPerformanceCounter(&remembered_time);
    return;
#else
// Non-Windows case
    struct timeval tim;
    struct rusage ru;
    getrusage(RUSAGE_SELF, &ru);
    tim = ru.ru_utime;
    remembered_time = (double)tim.tv_sec*1000.0 + tim.tv_usec/1000.0;
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

    struct timeval tim;
    struct rusage ru;
    double current_time;
    getrusage(RUSAGE_SELF, &ru);
    tim = ru.ru_utime;
    current_time = (double)tim.tv_sec*1000.0 + tim.tv_usec/1000.0;

    return current_time - remembered_time;

#endif
}