#ifndef _IMPLEMENTATION_H
#define _IMPLEMENTATION_H

int calc_not (int value);
int calc_or (int a, int b);
int calc_and (int a, int b);

#ifndef MAIN
/*

	Implementation der C Funktionen

*/

#define true  1
#define false 0

int calc_not (int value)
{
//	printf ("not(%i)\r\n", value);
	if (value == true)
	{
		return false;
	}
	else
	{
		return true;
	}
}


int calc_or (int a, int b)
{
//	printf ("or(%i,%i)\r\n", a,b);
	if (a == true)
	{
		return true;
	}
	else if (b == true)
	{
		return true;
	}
	else
	{
		return false;
	}
}


int calc_and (int a, int b)
{
//	printf ("and (%i,%i)\r\n",a,b);
	if (a == false)
	{
		return false;
	}
	else if (b == false)
	{
		return false;
	}
	else
	{
		return true;
	}
}


void dump (int a, int b)
{
/*
	if (a == b)
		printf ("old=%i,new=%i\n",a,b);
*/
}
#endif


#endif
