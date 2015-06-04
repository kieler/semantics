#ifndef _IMPLEMENTATION_H
#define _IMPLEMENTATION_H

boolean calc_not (boolean value);
boolean calc_or (boolean a, boolean b);
boolean calc_and (boolean a, boolean b);

extern int  bits;
extern char iterate_flag;

#if 0
#define COUNTER_O_ITERATE() {iterate_flag=1;}

#define WRITE_BIT(A,B,C) \
	{ if (C) A|=1 << B; else A &= ~(1 << B); } \

#define COUNTER_O_bit0(in) WRITE_BIT (bits,0,in)
#define COUNTER_O_bit1(in) WRITE_BIT (bits,1,in)
#define COUNTER_O_bit2(in) WRITE_BIT (bits,2,in)
#define COUNTER_O_bit3(in) WRITE_BIT (bits,3,in)
#define COUNTER_O_bit4(in) WRITE_BIT (bits,4,in)
#define COUNTER_O_bit5(in) WRITE_BIT (bits,5,in)
#define COUNTER_O_bit6(in) WRITE_BIT (bits,6,in)
#define COUNTER_O_bit7(in) WRITE_BIT (bits,7,in)
#define COUNTER_O_bit8(in) WRITE_BIT (bits,8,in)
#define COUNTER_O_bit9(in) WRITE_BIT (bits,9,in)
#define COUNTER_O_bit10(in) WRITE_BIT (bits,10,in)
#define COUNTER_O_bit11(in) WRITE_BIT (bits,11,in)
#define COUNTER_O_bit12(in) WRITE_BIT (bits,12,in)
#define COUNTER_O_bit13(in) WRITE_BIT (bits,13,in)
#define COUNTER_O_bit14(in) WRITE_BIT (bits,14,in)
#define COUNTER_O_bit15(in) WRITE_BIT (bits,15,in)
#endif

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
