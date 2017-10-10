//============================================================================//
/*! \file linuxconio.c 

	This file is used when the source code is compiled under linux
	It defines a cbreak and getch function that normally is only
	available in conio.h of win32 or dos systems.
	With those functions it is possible to get a single keyboard
	character in contrast to getc where the input has to be terminated
	by a new line (<ENTER>).
*/
//============================================================================//

#ifdef __APPLE__
#include "linuxconio.h" 
#elif __unix__
#include "linuxconio.h"

static struct termios new_io;
static struct termios old_io;

//-----------------------------------------------------------------------------
//! This function switches the terminal into cbreak mode
//! Controlflag ECHO and ICANON set to zero (0)
//! Controlcharacter: Read operation will deliver 1 byte VMIN=1 VTIME=1
int cbreak(int fd) {
   /*Backup our terminal*/
   if((tcgetattr(fd, &old_io)) == -1)
      return -1;
   new_io = old_io;
   /*Change flags for the cbreak mode*/
   new_io.c_lflag = new_io.c_lflag & ~(ECHO|ICANON);
   new_io.c_cc[VMIN] = 1;
   new_io.c_cc[VTIME]= 0;

   /*Now set the cbreak mode*/
   if((tcsetattr(fd, TCSAFLUSH, &new_io)) == -1)
      return -1;
   return 1;
}

//-----------------------------------------------------------------------------
//! This function immitates the getch known from conio.h
//! It will wait for a pressed key on the keyboard and return the
//! ASCII code of that character as an integer value
int getch(void) {
   int c;

   if(cbreak(STDIN_FILENO) == -1) {
      printf("Error in cbreak function ... \n");
      exit(EXIT_FAILURE);
   }
   c = getchar();
   /*Restore old terminal mode*/
   tcsetattr(STDIN_FILENO, TCSANOW, &old_io);
   return c;
}

//-----------------------------------------------------------------------------
//! In case the code is compiled unter windows the orginal conio.h
//! can be used
#elif __WIN32__ || _MSC_VER || __MS_DOS__
  #include <conio.h>
#endif
