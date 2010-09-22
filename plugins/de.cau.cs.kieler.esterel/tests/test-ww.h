#ifndef WW_H
#define WW_H

/* Supress all extern definitions in the */
#define _NO_EXTERN_DEFINITIONS

#include <time.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define SIMUL

/*
\headline{\hss\it C code for the beeper\hss}
\Section{Handling beeps : Files ``BEEP.h'' and ``beep.c''}

\SubSection{The \BEEPTYPE\ type and its copy function}

\noindent
This is file ``BEEP.h''.
*/

#define BEEP_LOADED

/*
\noindent
\BEEPTYPE\ is just integer
*/

typedef int BEEP_TYPE;

/*
\noindent
Copying is just assignment
*/

#define _BEEP_TYPE(X,Y) (*(X)=(Y))

/*
\noindent
No equality function is needed
*/

/*
\SubSection{Some constants}
*/

#define NO_BEEP_VALUE 0

#define ONE_BEEP 1

#define TWO_BEEPS 2

#define THREE_BEEPS 3

#define FOUR_BEEPS 4

/*
\headline={\hss\nineit C code for the \WATCH\ module\hss}
\Section{File ``WATCH.h'': types and defined
constants for the \WATCH\ module}
*/

#define WATCH_LOADED

/*
\SubSection{The \WATCHTIMETYPE\ type and its copy function}
*/

typedef struct {int day_in_week;
                int month;
                int day;
                int hours;
                int minutes;
                int seconds;
                int mode12h;} WATCH_TIME_TYPE;

/*
\noindent
Copying is simply done by assignment :
*/

#define _WATCH_TIME_TYPE(X,Y) (*(X)=(Y))

/*
\noindent
Equality is never used and needs not be declared.
*/

/*
\SubSection{ The \WATCHTIMEPOSITION\ type and its copy function}
*/

typedef int WATCH_TIME_POSITION;

/*
\noindent
Copying is simply done by assignment :
*/

#define _WATCH_TIME_POSITION(X,Y) (*(X)=(Y))

/*
\noindent
Equality is never used.
*/

/*
\SubSection{The \INITIALWATCHTIMEPOSITION\ constant}
*/

#define INITIAL_WATCH_TIME_POSITION 0

/*
\SubSection{The \WATCHBEEPVALUE\ constant}

\noindent
This constant is defined only if the \LOADBEEP\ flag is \#defined
*/

#define WATCH_BEEP_VALUE TWO_BEEPS


/*
\headline={\hss\nineit C code for the \STOPWATCH\ module\hss}
\Section{File ``stopwatch.h'' : types and defined constants for
the \STOPWATCH\ module}
*/

#define STOPWATCH_LOADED

/*
\SubSection{The \STOPWATCHTIMETYPE\ type and its copy function}
*/

typedef struct {int hundredths;
                int seconds;
                int minutes;} STOPWATCH_TIME_TYPE;

/*
\noindent
Copying is simply done by assignment :
*/

#define _STOPWATCH_TIME_TYPE(X,Y) (*(X)=(Y))

/*
\noindent
Equality is never used.
*/

/*
\SubSection{The \STOPWATCHBEEPVALUE\ constant}

\noindent
This constant is defined only if the \LOADBEEP\ flag is \#defined
*/


#define STOPWATCH_BEEP_VALUE ONE_BEEP

/*
\SubSection{Time handling constants}
*/

#ifdef SIMUL

#define HUNDREDTHS_PER_INCREMENT 1
#define HUNDREDTHS_PER_SECOND 2
#define SECONDS_PER_MINUTE 2
#define MINUTES_PER_HOUR 2
#define MINUTES_TO_BEEP 1

#else

extern int HUNDREDTHS_PER_INCREMENT;
#define HUNDREDTHS_PER_SECOND 100
#define SECONDS_PER_MINUTE 60
#define MINUTES_PER_HOUR 60
#define MINUTES_TO_BEEP 1 /* should be 10, but set to 1 for demos */

#endif


/*
\headline={\hss\nineit C code for the \ALARM\ module\hss}
\Section{File ``alarm.h'' : types and defined
constants for the \ALARM\ module}
*/

#define ALARM_LOADED

/*
\SubSection{The \ALARMTIMETYPE\ type and its copy function}
*/

typedef struct {int hours;
                int minutes;
                int mode12h;} ALARM_TIME_TYPE;

/*
\noindent
Copying is simply done by assignment :
*/

#define _ALARM_TIME_TYPE(X,Y) (*(X)=(Y))

/*
\noindent
Equality is never used.
*/

/*
\SubSection{The \ALARMTIMEPOSITION\ type and its copy function}

\noindent
The type is just integer
*/

typedef int ALARM_TIME_POSITION;

/*
\noindent
Copying is simply done by assignment :
*/

#define _ALARM_TIME_POSITION(X,Y) (*(X)=(Y))

/*
\noindent
Equality is never used.
*/

/*
\SubSection{The \INITIALALARMTIMEPOSITION\ constant}
*/

#define INITIAL_ALARM_TIME_POSITION 0

/*
\SubSection{The \ALARMDURATION\ constant}
*/

#ifdef SIMUL

#define ALARM_DURATION 3

#else

#define ALARM_DURATION 30

#endif

/*
\SubSection{The \ALARMBEEPVALUE\ constant}

\noindent
This constant is defined only if the \LOADBEEP\ flag is \#defined.
*/

#define ALARM_BEEP_VALUE FOUR_BEEPS

/*
\SubSection{Loading the WATCH.h definitions}
*/

/*
\headline={\hss\nineit C code for the \DISPLAY\ module\hss}
\Section{File ``display.h'' : types and defined
constants for the \DISPLAY\ module}
*/

#define DISPLAY_LOADED

/*
\SubSection{The \MAINDISPLAYTYPE\ type and its copy function}
*/

#ifdef SIMUL

typedef struct {char hours[3]; 
                char minutes[3];
                char seconds [4]; /* for the trailing : */
                char timemode[5];} MAIN_DISPLAY_TYPE;

#else

typedef struct {char hours[3]; 
                char minutes[3];
                char seconds [3];
                char timemode[4];} MAIN_DISPLAY_TYPE;

#endif

/*
\noindent
Copying is simply done by assignment :
*/

#define _MAIN_DISPLAY_TYPE(X,Y) (*(X)=(Y))

/*
\noindent
No equality function is needed.
*/

/*
\SubSection{The \MINIDISPLAYTYPE\ type and its copy function}
*/

typedef struct {char fst[3];
                char sep[2];
                char snd[3];} MINI_DISPLAY_TYPE;

/*
\noindent
Copying is simply done by assignment :
*/

#define _MINI_DISPLAY_TYPE(X,Y) (*(X)=(Y))

/*
\noindent
No equality function is needed.
*/

/*
\SubSection{ the \DISPLAYPOSITION\ type and its copy function}
*/

typedef int DISPLAY_POSITION;

/*
\noindent
Copying is simply done by assignment :
*/

#define _DISPLAY_POSITION(X,Y) (*(X)=(Y))

/*
\noindent
No equality function is needed.
*/

/* Compile printing functions, change some constants */

#define SIMUL

/*
\Section{File ``alarm.c'' : constants, functions, and
procedures of the \ALARM\ module}

\noindent
Files to include:
*/

/*
\SubSection{Time handling constants}

The time handling routines use constants that are set to their usual values
except in SIMUL mode where they are set to artificially low values
(setting the 10 minutes position becomes impossible).
*/

#ifdef SIMUL

/* #define MINUTES_PER_HOUR 2 */
#define MINUTES_PER_10MN 2
#define HOURS_PER_DAY 2
#define PM_VALUE 1

#else

/* #define MINUTES_PER_HOUR 60 */
#define MINUTES_PER_10MN 10
#define HOURS_PER_DAY 24
#define PM_VALUE 12

#endif

/*
\SubSection{The printing functions for simulation}
*/

#ifndef MAIN

#ifdef SIMUL

char* _ALARM_TIME_TYPE_to_text (at)
ALARM_TIME_TYPE at; {
   static char res[10];
   sprintf (res, "%d:%02d%s",
                 (at.mode12h ? ((at.hours % PM_VALUE) == 0 ?
                                    PM_VALUE  :
                                    at.hours % PM_VALUE)
                             : at.hours),
                 at.minutes,
                 (at.mode12h ? (at.hours>12 ? " PM" : " AM") : " 24H"));
   return res;
}

static char *position_name [3] = {"hours", "10 minutes", "minutes"};

char* _ALARM_TIME_POSITION_to_text (atp)
ALARM_TIME_POSITION atp; {
   static char res[11];
   sprintf (res, "%s", position_name[atp]);
   return res;
}

#endif

/*
\SubSection{The \INITIALALARMTIME\ constant}

\noindent
The alarm is initially set a 00:00, \VQH\ mode:
*/

ALARM_TIME_TYPE INITIAL_ALARM_TIME = {0,0,0};

/*
\SubSection{The \TOGGLEVQHMODEINALARMTIME\ procedure}
*/

/*
void
TOGGLE_24H_MODE_IN_ALARM_TIME(pat)
ALARM_TIME_TYPE* pat; {
   pat->mode12h = ! pat->mode12h;
}
*/

/*
\SubSection{The \NEXTALARMTIMEPOSITION\ function}
*/


ALARM_TIME_POSITION
NEXT_ALARM_TIME_POSITION (atp) {
   return((atp+1)%3);
}

/*
\SubSection{The \SETALARMTIME\ procedure}
*/

/*
\SubSection{The \COMPAREALARMTIMETOWATCHTIME\ function}
*/

int
COMPARE_ALARM_TIME_TO_WATCH_TIME (at,wt)
ALARM_TIME_TYPE at;
WATCH_TIME_TYPE wt; {
   return(wt.seconds==0 && at.hours==wt.hours && at.minutes==wt.minutes);
}

/*
\SubSection{The \COMBINEBEEPS\ function}

\noindent
This is file ``beep.c''.

*/

char* _BEEP_TYPE_to_text (b)
BEEP_TYPE b; {
   static char res[2];
   sprintf(res, "%1d", b);
   return res;
}


BEEP_TYPE COMBINE_BEEPS (beep1,beep2)
BEEP_TYPE beep1, beep2; {
   return (beep1+beep2);
}
/*
\vfill\eject
\Section{File ``display.c'' : constants, functions and procedures
of the \DISPLAY\ module}

\noindent
Files to include:
*/


/*
\SubSection{Constants}
*/

#ifdef SIMUL
#define PM_VALUE 1
#else
#define PM_VALUE 12
#endif

/*
\SubSection{Printing functions for simulation}
*/

#ifdef SIMUL

static char* clear_blanks (s) 
char *s; {
   char *res;
   for (res=s; (*res)==' '; res++);
   return res;
}

char* _MAIN_DISPLAY_TYPE_to_text (md)
MAIN_DISPLAY_TYPE md; {
   static char res[14];
   sprintf (res, "%s:%s%s%s", 
                 clear_blanks(md.hours),
                 clear_blanks(md.minutes),
                 clear_blanks(md.seconds),
                 md.timemode);
   return res;
}

char* _MINI_DISPLAY_TYPE_to_text (md)
MINI_DISPLAY_TYPE md; {
   static char res[6];
   sprintf (res, "%s%s%s", 
                 clear_blanks(md.fst),
                 clear_blanks(md.sep), 
                 clear_blanks(md.snd));
   return res;
}

static char *disp_position_name [7] = {"seconds", "hours", "10 minutes",
				       "minutes", "month", "day", "day name"};

char* _DISPLAY_POSITION_to_text (dp)
DISPLAY_POSITION dp; {
   static char res[11];
   sprintf (res, "%s", disp_position_name[dp]);
   return res;
}

#endif

/*
\SubSection{The \WATCHTIMETOMAINDISPLAY\ function}
*/

MAIN_DISPLAY_TYPE WATCH_TIME_TO_MAIN_DISPLAY (wt)
WATCH_TIME_TYPE wt; {
   static MAIN_DISPLAY_TYPE maindt;
   static int hours;
   if (wt.mode12h) {
     hours = wt.hours % PM_VALUE;
     if (!hours) hours=PM_VALUE;
   }
   else {
     hours=wt.hours;
   }
   sprintf(maindt.hours,"%2d",hours);
   sprintf(maindt.minutes,"%02d",wt.minutes);
#ifdef SIMUL
   sprintf(maindt.seconds,":%02d",wt.seconds);
#else
   sprintf(maindt.seconds,"%02d",wt.seconds);
#endif
   if (wt.mode12h) {
      if (wt.hours>(PM_VALUE-1))
#ifdef SIMUL
        strcpy(maindt.timemode," PM");
        else strcpy(maindt.timemode,"");
   } else strcpy(maindt.timemode," 24H");
#else
        strcpy(maindt.timemode,"PM ");
        else strcpy(maindt.timemode,"   ");
   } else strcpy(maindt.timemode,"24H");
#endif
   return(maindt);
}
                           
/*
\SubSection{The \WATCHTIMETOMINIDISPLAY\ function}
*/

MINI_DISPLAY_TYPE WATCH_TIME_TO_MINI_DISPLAY (wt)
WATCH_TIME_TYPE wt; {
   static MINI_DISPLAY_TYPE minidt;
   sprintf(minidt.fst,"%2d",wt.hours);
   strcpy(minidt.sep,":");
   sprintf(minidt.snd,"%02d",wt.minutes);
   return(minidt);
}

/*
\SubSection{The \WATCHDATETOMINIDISPLAY\ function}
*/

MINI_DISPLAY_TYPE WATCH_DATE_TO_MINI_DISPLAY (wt)
WATCH_TIME_TYPE wt; {
   static MINI_DISPLAY_TYPE minidt;
   sprintf(minidt.fst,"%2d",wt.month+1);
   strcpy(minidt.sep,"-");
   sprintf(minidt.snd,"%2d",wt.day);
   return(minidt);
}


/*
\SubSection{The \WATCHDAYTOALPHABETICDISPLAY\ function}
*/

static char *day_names [7] = {"SU","MO","TU","WE","TH","FR","SA"};

char * WATCH_DAY_TO_ALPHABETIC_DISPLAY (wt)
WATCH_TIME_TYPE wt; {
   return(day_names[wt.day_in_week]);
}

/*
\vfill\eject
\SubSection{The \WATCHDISPLAYPOSITION\ function}

\noindent
The two positions are identical:
*/

DISPLAY_POSITION WATCH_DISPLAY_POSITION (wtp)
WATCH_TIME_POSITION wtp; {
   return(wtp);
}

/*
\SubSection{The \STOPWATCHTIMETOMAINDISPLAY\ function}
*/

MAIN_DISPLAY_TYPE STOPWATCH_TIME_TO_MAIN_DISPLAY (st)
STOPWATCH_TIME_TYPE st; {
   static MAIN_DISPLAY_TYPE maindt;
   sprintf(maindt.hours,"%2d",st.minutes);
   sprintf(maindt.minutes,"%02d",st.seconds);
#ifdef SIMUL
   sprintf(maindt.seconds,":%02d",st.hundredths);
   strcpy(maindt.timemode,"");
#else
   sprintf(maindt.seconds,"%02d",st.hundredths);
   strcpy(maindt.timemode,"   ");
#endif
   return(maindt);
}

/*
\SubSection{The \ALARMTIMETOMAINDISPLAY\ function}
*/

MAIN_DISPLAY_TYPE ALARM_TIME_TO_MAIN_DISPLAY (at)
ALARM_TIME_TYPE at; {
   static MAIN_DISPLAY_TYPE maindt;
   static int hours;
   if (at.mode12h) {
     hours = at.hours % PM_VALUE;
     if (!hours) hours = PM_VALUE;
   }
   else {
     hours=at.hours;
   }
   sprintf(maindt.hours,"%2d",hours);
   sprintf(maindt.minutes,"%02d",at.minutes);
   sprintf(maindt.seconds,"  ");
   if (at.mode12h) {
     if (at.hours > PM_VALUE-1)
#ifdef SIMUL
        strcpy(maindt.timemode," PM");
        else strcpy(maindt.timemode,"");
     } else strcpy(maindt.timemode," 24H");
#else
        strcpy(maindt.timemode,"PM ");
        else strcpy(maindt.timemode,"   ");
     } else strcpy(maindt.timemode,"24H");
#endif
   return(maindt);
}

/*
\SubSection{The \ALARMDISPLAYPOSITION\ function}
*/

DISPLAY_POSITION
ALARM_DISPLAY_POSITION (atp)
ALARM_TIME_POSITION atp; {
   return(atp+1);
}

/*
\vfill\eject
\Section{File ``stopwatch.c'' : constants, functions and procedures
of the \STOPWATCH\ module}
*/


#ifndef SIMUL
int HUNDREDTHS_PER_INCREMENT = 25; /* 1/4 seconds */
#endif
/*
\SubSection{The printing functions for simulation}
*/

char* _STOPWATCH_TIME_TYPE_to_text (st)
STOPWATCH_TIME_TYPE st; {
   static char res[9];
   sprintf (res, "%d:%02d:%02d",
	    st.minutes, st.seconds, st.hundredths);
   return res;
}

/*
\SubSection{The \ZEROSTOPWATCHTIME\ constant}
*/

STOPWATCH_TIME_TYPE ZERO_STOPWATCH_TIME = {0, 0, 0};

/*
\SubSection{The \INCREMENTSTOPWATCHTIME\ procedure}
*/

/*
INCREMENT_STOPWATCH_TIME (pst)
STOPWATCH_TIME_TYPE *pst; {
   pst->hundredths += HUNDREDTHS_PER_INCREMENT;
   if (pst->hundredths == HUNDREDTHS_PER_SECOND) {
     pst->hundredths = 0;
     pst->seconds ++;
     if (pst->seconds == SECONDS_PER_MINUTE) {
       pst->seconds = 0;
       pst->minutes ++;
       if (pst->minutes == MINUTES_PER_HOUR) 
         pst->minutes = 0;
     }
   }
}
*/

/*
\SubSection{The \STOPWATCHBEEP\ function}
*/

BEEP_TYPE STOPWATCH_BEEP (st)
STOPWATCH_TIME_TYPE st; {
   return (((st.hundredths == 0) &&
            (st.seconds == 0) &&
            (st.minutes % MINUTES_TO_BEEP == 0))
         ? STOPWATCH_BEEP_VALUE : NO_BEEP_VALUE);
}

/*
\vfill\eject
\Section{File ``watch_data.c'' : constants, functions and procedures of the \WATCH\
module}

\noindent
The files to include :
*/


/*
\SubSection{Time handling constants}

The time handling routines use constants that are set to their usual values
except in SIMUL mode where they are set to artificially low values
(setting the 10 minutes position becomes impossible).
*/

#ifdef SIMUL

#define SECONDS_PER_MINUTE 2
#define MINUTES_PER_10MN 2
#define MINUTES_PER_HOUR 2
#define HOURS_PER_DAY 2
#define PM_VALUE 1
#define DAYS_PER_WEEK 2
#define MONTHS_PER_YEAR 2

static short monthlength [] = {2, 2};

#else

#define SECONDS_PER_MINUTE 60
#define MINUTES_PER_10MN 10
#define MINUTES_PER_HOUR 60
#define HOURS_PER_DAY 24
#define PM_VALUE 12
#define DAYS_PER_WEEK 7
#define MONTHS_PER_YEAR 12

static short monthlength [] = {31,28,31,30,31,30,31,31,30,31,30,31};

#endif

/*
\SubSection{The printing functions for simulation}
*/

#ifdef SIMUL

/* static char *day_names [7] = {"SU","MO","TU","WE","TH","FR","SA"}; */

char* _WATCH_TIME_TYPE_to_text (wt)
WATCH_TIME_TYPE wt; {
   static char res[22];
   sprintf (res, "%s %d-%d %d:%d:%d%s",
                 day_names[wt.day_in_week],
                 wt.month+1,
                 wt.day,
                 (wt.mode12h ? ((wt.hours % PM_VALUE ==0) ?
                                    PM_VALUE :
                                    wt.hours % PM_VALUE)
                             : wt.hours),
                 wt.minutes,
                 wt.seconds,
                (wt.mode12h
                         ? ((wt.hours>=PM_VALUE) ? " PM" : " AM") 
                         : " 24H"));
   return res;
}

static char *wt_position_name [7] = {"seconds", "hours", "10 minutes",
  "minutes", "month", "day", "day name"};

char* _WATCH_TIME_POSITION_to_text (wtp)
WATCH_TIME_POSITION wtp; {
   static char res[12];
   sprintf (res, "%s", wt_position_name[wtp]);
   return res;
}

#endif

/*
\SubSection{The \INITIALWATCHTIME\ constant}

The \INITIALWATCHTIME\ constant is declared here and
initialized in the main program, using the function \GETINITIALWATCHTIME,
unless in SIMUL mode where it is initialized here.
*/

#ifdef SIMUL

WATCH_TIME_TYPE INITIAL_WATCH_TIME = 
      {0, 0, 1, PM_VALUE, 0, 0, 0};

#else

WATCH_TIME_TYPE INITIAL_WATCH_TIME;

#endif

WATCH_TIME_TYPE GET_INITIAL_WATCH_TIME () {
   WATCH_TIME_TYPE wt;
   struct tm *ptm;
   long tloc;
   time(&tloc);
   ptm=localtime(&tloc);
   wt.day_in_week = ptm->tm_wday;
   wt.month = ptm->tm_mon;
   wt.day = ptm->tm_mday;
   wt.hours = ptm->tm_hour;
   wt.minutes = ptm->tm_min;
   wt.seconds = ptm->tm_sec;
   wt.mode12h = 0;
   return(wt);
}

/*
\SubSection{The \INCREMENTWATCHTIME\ procedure}
*/

/*
INCREMENT_WATCH_TIME (pwt)
WATCH_TIME_TYPE *pwt; {
   pwt->seconds ++;
   if (pwt->seconds == SECONDS_PER_MINUTE) {
      pwt->seconds = 0;
      pwt->minutes ++;
      if (pwt->minutes == MINUTES_PER_HOUR) {
         pwt->minutes = 0;
         pwt->hours ++;
         if (pwt->hours == HOURS_PER_DAY) {
            pwt->hours = 0;
            pwt->day ++;
            pwt->day_in_week = (pwt->day_in_week+1) % DAYS_PER_WEEK;
            if (pwt->day > monthlength[pwt->month]) {
               pwt->day = 1;
               pwt->month = (pwt->month+1) % MONTHS_PER_YEAR;
            }
         }
      }
   }
}
*/

/*
\SubSection{The \TOGGLEVQHMODEINWATCHTIME\ procedure}
*/

/*
TOGGLE_24H_MODE_IN_WATCH_TIME (pwt)
WATCH_TIME_TYPE *pwt; {
   pwt->mode12h = ! pwt->mode12h;
}
*/

/*
\SubSection{The \NEXTWATCHTIMEPOSITION\ function}
*/

WATCH_TIME_POSITION
NEXT_WATCH_TIME_POSITION (wtp)
WATCH_TIME_POSITION wtp; {
   return((wtp+1)%7);
}

/*
\SubSection{The \SETWATCHTIME\ procedure}
*/

/*
\SubSection{The \INCREMENTWATCHTIMEINSETMODE\ procedure}

\noindent
The incrementation is done only up to the watch time position being currently
set.
*/

/*
\SubSection{The \WATCHBEEP\ function}
*/

#endif

#endif
