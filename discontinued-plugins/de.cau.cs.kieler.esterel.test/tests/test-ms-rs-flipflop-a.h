#ifndef _IMPLEMENTATION_H
#define _IMPLEMENTATION_H

boolean calc_not (boolean value);
boolean calc_or (boolean a, boolean b);
boolean calc_and (boolean a, boolean b);

#ifndef MAIN
/*

	Implementation der C Funktionen

*/

#define true  1
#define false 0

boolean calc_not (boolean value)
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


boolean calc_or (boolean a, boolean b)
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


boolean calc_and (boolean a, boolean b)
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


void dump (boolean a, boolean b)
{
/*
	if (a == b)
		printf ("old=%i,new=%i\n",a,b);
*/
}
#endif


#endif
