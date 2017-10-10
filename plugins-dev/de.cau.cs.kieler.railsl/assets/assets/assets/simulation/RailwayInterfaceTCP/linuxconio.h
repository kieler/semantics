//============================================================================//
/*! \file linuxconio.h 

	This file is used when the source code is compiled under linux
	It defines a cbreak and getch function that normally is only
	available in conio.h of win32 or dos systems.
	With those functions it is possible to get a single keyboard
	character in contrast to getc where the input has to be terminated
	by a new line (<ENTER>).
*/
//============================================================================//

#ifndef __LINUXCONIO_H__
#define __LINUXCONIO_H__ 

#ifdef __APPLE__
  #include <curses.h>
#elif __unix__
#include <termios.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//-----------------------------------------------------------------------------
//! This function switches the terminal into cbreak mode
//! Controlflag ECHO and ICANON set to zero (0)
//! Controlcharacter: Read operation will deliver 1 byte VMIN=1 VTIME=1
extern int cbreak(int fd);

//-----------------------------------------------------------------------------
//! This function immitates the getch known from conio.h
//! It will wait for a pressed key on the keyboard and return the
//! ASCII code of that character as an integer value
extern int getch(void);

//-----------------------------------------------------------------------------
//! In case the code is compiled unter windows the orginal conio.h
//! can be used
#elif __WIN32__ || _MSC_VER || __MS_DOS__
  #include <conio.h>
#endif

#endif /*__LINUXCONIO_H__ */
