#include <qwidget.h>
#include <qapplication.h>
#include <qpushbutton.h>//fuer die Buttons
#include <qthread.h>//fuer den Thread
#include "Gui.h"

class Nebenbei : public QThread
{
public:
    Nebenbei();
    virtual void run();

Uhrclass *diuhr;
};

Nebenbei::Nebenbei()
{
}

void Nebenbei::run()
{
    diuhr= new Uhrclass;
    diuhr->reset();
    bv1=1;
    while(TRUE)
    {
        usleep(1);                 //Der Thread soll fuer eine Centisekunde
        diuhr->I_TimeTick();       //Warten, so entsteht der Time-Tikck 

	if(button_a==2)
	{
	    diuhr->I_Button_a();
	    button_a=0;
	}
	if(button_b==2)
	{
	    diuhr->I_Button_b();
	    button_b=0;
	}
	if(button_c==2)
	{
	    diuhr->I_Button_c();
	    button_c=0;
	}
	if(button_d==2)
	{
	    diuhr->I_Button_d();
	    button_d=0;
	}
	if(batt_ins==2)
	{
	    diuhr->I_Batt_inserted();
	    batt_ins=0;
	}
	if(batt_rem==2)
	{
	    diuhr->I_Batt_removed();
	    batt_rem=0;
	}
	if(batt_wk==2)
	{
	    diuhr->I_Batt_weakens();
	    batt_wk=0;
	}
	if(batt_dies==2)
	{
	    diuhr->I_Batt_dies();
	    batt_dies=0;
	}
        
	diuhr->run();    

    }
}//Ende Nebenbei

int main(int argc, char **argv)
{   
    Nebenbei nb;
    nb.start();

    QApplication a( argc, argv );
    GraficWidget *gw; 
    gw = new GraficWidget;
    a.setMainWidget( gw );
    gw->setCaption("Digitaluhr");
    gw->show();
    
    return a.exec();
}
