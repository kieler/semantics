//#include "Uhr_class.h"
#include "Gui.h"

#include <qwidget.h>
#include <qpainter.h>
#include <qapplication.h>
#include <stdlib.h>

#include <qlcdnumber.h>
#include <qgrid.h>
#include <qvbox.h>
#include <qfont.h>
#include <qslider.h>
#include <qpushbutton.h>
#include <qpixmap.h>
#include <qtimer.h>
#include <qthread.h>//fuer den Thread

int blink_on;
static QString s;

volatile int bv1;
volatile int button_a;
volatile int button_b;
volatile int button_c;
volatile int button_d;
volatile int batt_ins;
volatile int batt_rem;
volatile int batt_wk;
volatile int batt_dies;


GraficWidget::GraficWidget( QWidget *parent, const char *name )
    : QWidget( parent, name, WStaticContents )
{
    //Background
    setBackgroundColor( white );

    QTimer *tim;
    tim= new QTimer(this);
    tim->start(1);
    connect(tim, SIGNAL(timeout()),SLOT(grafSlot()) );

    QTimer *tim2;
    tim2= new QTimer(this);
    tim2->start(500);
    connect(tim2, SIGNAL(timeout()),SLOT(blinkSlot()) );
    connect(tim2, SIGNAL(timeout()),SLOT(blinkSlot2()) );

    s.sprintf("%2d:%2d:%2d",0,0,0);
    lcd= new QLCDNumber (8, this);
    lcd->setSegmentStyle(QLCDNumber::Filled);
    lcd ->display(s);
    lcd ->setGeometry( 280,165, 140, 30 ); 
    lcd->setBackgroundColor( white );

    //Butons
//Quit
    QPushButton *quit = new QPushButton( "Quit", this, "quit" );
    quit->setGeometry( 10, 05, 110, 30 );
    quit->setFont( QFont( "Times", 15, QFont::Bold ) );
    connect( quit, SIGNAL(clicked()), qApp, SLOT(quit()) );

//Die Button fuer die InputSignale
    //Button_a
    QPushButton *Button_a = new QPushButton( "Button_a", this);
    Button_a->setGeometry( 10, 70, 110, 30 );  //Position des Button
    Button_a->setFont( QFont( "Times", 10, QFont::Bold ) ); 
    //Aussehen des Button

    connect( Button_a, SIGNAL(clicked()), SLOT(button_a_Slot()) ); 
    //wenn das Signal "clicked" auftritt wird der Slot button_a_Slot 
    //aufgerufen

    QPushButton *Button_b = new QPushButton( "Button_b", this);
    Button_b->setGeometry( 10, 105, 110, 30 );
    Button_b->setFont( QFont( "Times", 10, QFont::Bold ) );
    connect( Button_b, SIGNAL(clicked()), SLOT(button_b_Slot()) );
    //wenn das Signal "clicked" auftritt wird der Slot button_b_Slot 
    //aufgerufen

    QPushButton *Button_c = new QPushButton( "Button_c", this);
    Button_c->setGeometry( 10, 140, 110, 30 );
    Button_c->setFont( QFont( "Times", 10, QFont::Bold ) );
    connect( Button_c, SIGNAL(clicked()), SLOT(button_c_Slot()) );
    //wenn das Signal "clicked" auftritt wird der Slot button_c_Slot 
    //aufgerufen

    QPushButton *Button_d = new QPushButton( "Button_d", this);
    Button_d->setGeometry( 10, 175, 110, 30 );
    Button_d->setFont( QFont( "Times", 10, QFont::Bold ) );
    connect( Button_d, SIGNAL(clicked()), SLOT(button_d_Slot()) );
    //wenn das Signal "clicked" auftritt wird der Slot button_d_Slot 
    //aufgerufen

    QPushButton *Batt_ins = new QPushButton( "Batt_inserted", this);
    Batt_ins->setGeometry( 10, 210, 110, 30 );
    Batt_ins->setFont( QFont( "Times", 10, QFont::Bold ) );
    connect( Batt_ins, SIGNAL(clicked()), SLOT(batt_ins_Slot()) );
    //wenn das Signal "clicked" auftritt wird der Slot batt_ins_Slot 
    //aufgerufen

    QPushButton *Batt_rem = new QPushButton( "Batt_removed", this);   
    Batt_rem->setGeometry( 10, 245, 110, 30 );
    Batt_rem->setFont( QFont( "Times", 10, QFont::Bold ) );
    connect( Batt_rem, SIGNAL(clicked()), SLOT(batt_rem_Slot()) );
    //wenn das Signal "clicked" auftritt wird der Slot batt_rem_Slot 
    //aufgerufen

    QPushButton *Batt_wk = new QPushButton( "Batt_weakens", this);
    Batt_wk->setGeometry( 10, 280, 110, 30 );
    Batt_wk->setFont( QFont( "Times", 10, QFont::Bold ) );
    connect( Batt_wk, SIGNAL(clicked()), SLOT(batt_wk_Slot()) );
    //wenn das Signal "clicked" auftritt wird der Slot batt_wk_Slot 
    //aufgerufen

    QPushButton *Batt_dies = new QPushButton( "Batt_dies", this);
    Batt_dies->setGeometry( 10, 315, 110, 30 );
    Batt_dies->setFont( QFont( "Times", 10, QFont::Bold ) );
    connect( Batt_dies, SIGNAL(clicked()), SLOT(batt_dies_Slot()) );
    //wenn das Signal "clicked" auftritt wird der Slot batt_dies_Slot 
    //aufgerufen
}

void GraficWidget::paintEvent( QPaintEvent * )
{
    QPainter paint ( this );   //Notwendig, damit qt weiss wohin gemalt 
                               //werden soll
    //Malen des Uhr-body
    paint.drawLine(260, 100, 440, 100);            //draws "-"
    paint.drawArc(244, 85,70,180,100*20,161*11);   //draws "(" 
    paint.drawLine(260, 250, 440, 250);            //draws "-"
    paint.drawArc(393, 95,70,163,100*11,-165*13);  //draws ")"
    paint.drawRoundRect(275, 120, 150, 110);

    //Malen des Armbandes
    paint.drawArc(250,40,200,50,-100*22,160*10);
    paint.drawArc(250,260,200,50,100*22,-160*10);

    paint.drawArc(250,-17,60,100,100*1,-161*10);  
    paint.drawArc(250,267,60,100,-100*1,161*10);

    paint.drawArc(402, 270,60,100,100*15,165*9);
    paint.drawArc(400, -20,60,100,100*28,165*9);

    //Label fuer die input Signale
    paint.setFont(QFont("Times",11, QFont::Bold ));
    paint.drawText(10,60,"Input-Signale:");
 
    paint.drawRect(5,40,120,310 );

    //Label fuer die Uhr Knoepfe
    paint.setFont(QFont("Times",11, QFont::Bold ));
    paint.drawText(227,117,"a");
    paint.drawText(465,114,"b");
    paint.drawText(480,180,"c");
    paint.drawText(470,240,"d");

    //Buttons an der Uhr, rechts
    //Button c
    paint.drawRect(462,170,11,11 ); 

    //Button b
    paint.drawLine(451, 117, 459, 112);
    paint.drawLine(455, 125, 463, 120);
    paint.drawLine(459, 112, 463, 120);

    //Button d
    paint.drawLine(453, 235, 460, 238);
    paint.drawLine(455, 225, 464, 229);
    paint.drawLine(460, 238, 464, 229);

    //Button an der Uhr, links, Button a
    paint.drawLine(251, 117, 243, 113);
    paint.drawLine(248, 125, 240, 121);
    paint.drawLine(243, 113, 240, 121);

    //Bild fuer den Alarm1
    QPixmap pixmap;           
    pixmap.load("glocke2.bmp");
    paint.drawPixmap(280, 125, pixmap);

    //Bild fuer den Alarm2
    QPixmap pixmap2;           
    pixmap2.load("glocke2.bmp");
    paint.drawPixmap(312, 125, pixmap2);

    //Label fuer beide Alarme
    paint.setFont(QFont("Times",8, QFont::Bold ));
    paint.drawText(305,160,"1");
    paint.drawText(337,160,"2");

    //Bild fuer Chime 
    QPixmap pixmap3;           
    pixmap3.load("chime2.bmp");
    paint.drawPixmap(345, 125, pixmap3);

    //Bild fuer die Stopwatch
    QPixmap pixmap4;           
    pixmap4.load("Stopwatch2.bmp");
    paint.drawPixmap(380, 125, pixmap4);
}


void GraficWidget::mousePressEvent( QMouseEvent *e )
{
    QPoint mousepos;
    mousepos=e->pos();
    //Bereich des Button c und die auszufuehrende Aktion 
    if ((mousepos.x()>462)&&(mousepos.x()<473)) //Stimmt Mausposition x...
    {
	if ((mousepos.y()>170)&&(mousepos.y()<181)) //Stimmt Mausposition y...
	{
	    button_c=2;   //Aktion
	}
    }
    //Bereich des Button b und die auszufuehrende Aktion 
    if ((mousepos.x()>451)&&(mousepos.x()<463))
    {
	if ((mousepos.y()>112)&&(mousepos.y()<125))
	{
	    button_b=2;
	}
    }
    //Bereich des Button d und die auszufuehrende Aktion 
    if ((mousepos.x()>455)&&(mousepos.x()<464))
    {
	if ((mousepos.y()>224)&&(mousepos.y()<238))
	{
	    button_d=2;
	}
    }

    //Bereich des Button a und die auszufuehrende Aktion 
    if ((mousepos.x()>240)&&(mousepos.x()<253))
    {
	if ((mousepos.y()>113)&&(mousepos.y()<127))
	{
	    button_a=2;
	}
    }
}

//Wird der entsprechende Button gedrueckt, dann wird der 
//entsprechende Slot ausgefuehrt...
void GraficWidget::button_a_Slot()
{
    button_a=2;  //Im Uhr-Thread wird ,wenn der Wert von button_a
}                //gleich 2 ist das entsprechende Input Signal gesetzt
void GraficWidget::button_b_Slot()
{
    button_b=2;
}
void GraficWidget::button_c_Slot()
{
    button_c=2;
}
void GraficWidget::button_d_Slot()
{
    button_d=2;
    csec_o=0;
}
void GraficWidget::batt_ins_Slot()
{
    batt_ins=2;
}
void GraficWidget::batt_rem_Slot()
{
    batt_rem=2;
}
void GraficWidget::batt_wk_Slot()
{
    batt_wk=2;
}
void GraficWidget::batt_dies_Slot()
{
    batt_dies=2;  
}
void GraficWidget::blinkSlot()
{
    if(blink==2)
    {
	if(blink_on==1)
	{
	    lcd->setBackgroundColor( red );
	    blink_on=0;
	}
	else
	{
	    lcd->setBackgroundColor( white );
	    blink_on=1;
	}
	blink=0;
    }
}

void GraficWidget::blinkSlot2()
{
    if(al1beep==2)
    {
	if(blink_on==1)
	{
	    lcd->setBackgroundColor( green );
	    blink_on=0;
	}
	else
	{
	    lcd->setBackgroundColor( white );
	    blink_on=1;
	}
	blink=0;
    }
    al1beep=0;
    if(al2beep==2)
    {
	if(blink_on==1)
	{
	    lcd->setBackgroundColor( blue );
	    blink_on=0;
	}
	else
	{
	    lcd->setBackgroundColor( white );
	    blink_on=1;
	}
	blink=0;
    }
    al2beep=0;
}


void GraficWidget::grafSlot()
{
    QPainter p (this);
    //Display
    if(setTime==2)
    {
	if(setStopwatch==2)
	{	
	    //lcd->setBackgroundColor( white );
	    lcd->setNumDigits(11);
	    s.sprintf("%2d:%2d:%2d:%2d",hr_o,min_o,sec_o,csec_o);
	    lcd->display(s);
	    setStopwatch=0;
	}
	else
	{
	    ///lcd->setBackgroundColor( white );
	    lcd->setNumDigits(8);
	    s.sprintf("%2d:%2d:%2d",hr_o,min_o,sec_o);
	    lcd->display(s);
	}
	setTime=0;
    }
    if(setDate==2)
    {
	//lcd->setBackgroundColor( white );
	printf("Date");
	s.sprintf("%2d:%2d:%2d",day_o,month_o,year_o);
	lcd->display(s);
	setDate=0;
    }
    //Alarm1 on/off
    if(al1_on==2)
    {
	QPixmap al1on;           
	al1on.load("glocke.bmp");
	p.drawPixmap(280, 125, al1on);
	al1_on=0;

	p.setFont(QFont("Times",8, QFont::Bold ));
	p.drawText(305,160,"1");
	p.drawText(337,160,"2");

    }
    if(al1_off==2)
    {
	QPixmap al1off;           
	al1off.load("glocke2.bmp");
	p.drawPixmap(280, 125, al1off);
	al1_off=0;

	p.setFont(QFont("Times",8, QFont::Bold ));
	p.drawText(305,160,"1");
	p.drawText(337,160,"2");
    }
    //Alarm 2 on/off
    if(al2_on==2)
    {
	QPixmap al2on;           
	al2on.load("glocke.bmp");
	p.drawPixmap(312, 125, al2on);
	al2_on=0;

	p.setFont(QFont("Times",8, QFont::Bold ));
	p.drawText(305,160,"1");
	p.drawText(337,160,"2");
    }
    if(al2_off==2)
    {
	QPixmap al2off;           
	al2off.load("glocke2.bmp");
	p.drawPixmap(312, 125, al2off);
	al2_off=0;

	p.setFont(QFont("Times",8, QFont::Bold ));
	p.drawText(305,160,"1");
	p.drawText(337,160,"2");
    }
    //Light on/off
    if(light_on==2)
    {
	lcd->setBackgroundColor( yellow );
	light_on=0;
    }
    if(light_off==2)
    {
	lcd->setBackgroundColor( white );
	light_off=0;
    }
    //Chime on/off
    if(chime_on==2)
    {
	lcd->setBackgroundColor( white );
	QPixmap chimeon;           
	chimeon.load("chime.bmp");
	p.drawPixmap(345, 125, chimeon);
	chime_on=0;
    }
    if(chime_off==2)
    {
	lcd->setBackgroundColor( white );
	QPixmap chimeoff;           
	chimeoff.load("chime2.bmp");
	p.drawPixmap(345, 125, chimeoff);
	chime_off=0;
    }
    //Stopwatch on/off
    if(sw_on==2)
    {
	QPixmap swon;           
	swon.load("Stopwatch.bmp");
	p.drawPixmap(380, 125, swon);
	sw_on=0;
    }
    if(sw_off==2)
    {
	QPixmap swoff;           
	swoff.load("Stopwatch2.bmp");
	p.drawPixmap(380, 125, swoff);
	sw_off=0;
    }
/*
    //Update Time
    if(setUpdate==2)
    {
	int min;
	min=(min10_u+min_u);
	s.sprintf("%2d:%2d:%2d",hr_u,min,sec_u);
	lcd->display(s);
	setUpdate=0;
    }
    //Update Date
    if(setUpdateDate==2)
    {
	s.sprintf("%2d:%2d:%2d",day_u,month_u,year_u);
	lcd->display(s);
	setUpdateDate=0;
    }
*/
    if(al1upd==2)
    {
	lcd->setNumDigits(6);
	s.sprintf("%2d:%2d",ta1hr,ta1min);
	lcd->display(s);
	al1upd=0;
    }
    if(al2upd==2)
    {
	lcd->setNumDigits(6);
	s.sprintf("%2d:%2d",ta2hr,ta2min);
	lcd->display(s);
	al2upd=0;
    }
}//Ende Slot grafSlot 
