/****************************************************************/
/* Garcia Lucien 				9.3.00	                                 	*/
/* Declarations des types non predefinis utilises dans Chorus	*/
/*					                                                                   	*/ 								
/****************************************************************/
 /*Ecriture des Assignment Function necessaires a la     */
/* compilation de Berry                                                     	*/
/*******************************************************/
/* fichier a renommer 	PROG_types.h 	pour saxo	*/
/*			PROG.h pour 	pour berry	                       	*/
/* PROG.strl etant le fichier a compiler		               	*/
/*******************************************************/

#ifndef MAIN
#ifndef Type_h
#define Type_h 1

/* Enable Debugging output */
/* #define AFFICHAGE */

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

/*********************************/
/* Declaration des types	 */
/*********************************/
/* identificateur du thread */
typedef int ThreadRef;
extern void _text_to_ThreadRef(ThreadRef *value, char *str) ;
extern char * _ThreadRef_to_text(ThreadRef value) ;

/* descripteur de thread, comportant les informations necessaires */
/* a la politique d'ordonnancement du thread			  */
/*typedef	struct _T_ThreadDesc {
	int  priority; 
        int option; 
	} T_ThreadDesc, *PT_ThreadDesc;*/
typedef int ThreadDesc; 
extern void _text_to_ThreadDesc(ThreadDesc *value, char *str) ;
extern char * _ThreadDesc_to_text(ThreadDesc value) ;

/* une date */
typedef int TimeVal;
extern void _text_to_TimeVal(TimeVal *value, char *str) ;
extern char * _TimeVal_to_text(TimeVal value) ;

extern void affichage_tableau(int *);

/**assignement utile pour Berry********************/
#define _ThreadRef(X,Y) (*(X)=(Y))
#define _ThreadDesc(X,Y) (*(X)=(Y))
#define _TimeVal(X,Y) (*(X)=(Y))

/************************************************/
/* _check_type					                */
/* checks the syntax of a string to be read      	*/
/************************************************/
extern int _check_ThreadDesc (char* string);

extern int _check_TimeVal (char* string);
	
extern int _check_ThreadRef (char* string);
	
/***************************************************/

#endif
/*******************************************************
 * Garcia Lucien 			                       	9.3.00
 * declarations des constantes	
 * ce fichier est utilise par le compilateur saxo
*******************************************************/

#ifndef Const_h
#define Const_h 1

/********************************/
/* nombre de Thread	         	*/
/********************************/
#define MAX 11
#define Thread 1

/*************************************/
/* initialisation des constantes Time*/
/*************************************/
#define nullTimeVal 0
#define deltaT 1


/******************************************/
/* initialisation des constantes Interrupt*/
/******************************************/
#define TIMER_8254 8254

/******************************************/
/* initialisation des constantes Scheduler*/
/******************************************/
#define dummyThread 0

/*****************************************/
/* initialisation des constantes Thread	*/
/****************************************/
#define K_ETIMEOUT 2
#define K_EABORT 3
#define K_OK 4

#define actif 2
#define bloque 1
#define libre 0

/*****************************************/
/* constantes adresse de tableaux	*/
/****************************************/
extern int TAB_SetTimer[MAX];
extern int TAB_DelTimer[MAX];
extern int TAB_Awaken[MAX];
extern int TAB_Timer[MAX];
extern int TAB_TimerOut[MAX];
extern int TAB_ThreadState[MAX];
extern int TAB_Priority[MAX];

/* #define Ad_SetTimer &TAB_SetTimer[0] */
/* #define Ad_DelTimer &TAB_DelTimer[0]  */
/* #define Ad_Awaken &TAB_Awaken[0] */
/* #define Ad_ThreadState &TAB_ThreadState[0] */
/* #define Ad_Priority &TAB_Priority[0] */

typedef int *pointer;
extern pointer Ad_SetTimer();
extern pointer Ad_DelTimer();
extern pointer Ad_Awaken();
extern pointer Ad_ThreadState();
extern pointer Ad_Priority();
extern void multiplexage (pointer ptr,int p_Num_Thread, int p_valeur);
extern void demultiplexage (boolean *pt_presence, int p_Num_Thread);

/**********************************************/
/*                                                                             */
/* Garcia Lucien 				9.3.00              */
/* Declaration des tableaux                                */
/* corps des fonctions et procedures	        	  */
/*                                                                              */
/**********************************************/

#define TRAITEMENT

#ifdef AFFICHAGE  
/* extern FILE *pFic; */
#  define pFic stdout
#endif


/******************************/
/*  Declaration                         */
/******************************/
int TAB_TimerOut[MAX];
int TAB_Timer[MAX];
int TAB_SetTimer[MAX];
int TAB_DelTimer[MAX];
int TAB_Awaken[MAX];
int TAB_ThreadState[MAX];
int TAB_Priority[MAX];

TimeVal CurrentTime;
int RunningThread = dummyThread;

/*********************************************
* functions de conversions text <-> type non standarts
*****************************************/
void _text_to_ThreadRef(ThreadRef *value, char *str) {
    if (sscanf(str,"%d",value) != 1) {
        printf("Error : wrong format in _text_to_ThreadRef ! \n");
        exit(1);
    }
}

char * _ThreadRef_to_text(ThreadRef value) {
    char str[100];

    sprintf(str,"%d",value);
    return (char *) strdup(str);
}

void _text_to_ThreadDesc(ThreadDesc *value, char *str) {
    if (sscanf(str,"%d",value) != 1) {
        printf("Error : wrong format in _text_to_ThreadDesc ! \n");
        exit(1);
    }
}

char * _ThreadDesc_to_text(ThreadDesc value) {
    char str[100];

    sprintf(str,"%d",value);
    return (char *) strdup(str);
}

void _text_to_TimeVal(TimeVal *value, char *str) {
    if (sscanf(str,"%d",value) != 1) {
        printf("Error : wrong format in _text_to_TimeVal ! \n");
        exit(1);
    }
}

char * _TimeVal_to_text(TimeVal value) {
    char str[100];

    sprintf(str,"%d",value);
    return (char *) strdup(str);
}

/************************************************/
/* _check_type					                */
/* checks the syntax of a string to be read      	*/
/************************************************/
int _check_ThreadDesc (char* string)
	{
	return ((sscanf(string, "%d") == 1) ? 1 : 0);
	}

int _check_TimeVal (char* string)
	{
	return ((sscanf(string, "%d") == 1) ? 1 : 0);
	}
	
int _check_ThreadRef (char* string)
	{
	return ((sscanf(string, "%d") == 1) ? 1 : 0);
	}
	
/***************************************************/


/********************************************************/
/*							*/
/*	 fonctions et procedures de Chorus		*/
/*							*/
/********************************************************/


/*****************************/
/* Fonctions  Interrupt      */
/*****************************/


int  runningThread (void)
    /* cette fonction renvoie une valeur de type int qui est 
       l'identificateur du thread courant */
	{
#ifdef AFFICHAGE
        fprintf(pFic,"runningThread : %d\n",RunningThread);
#endif
        return RunningThread;
	}


/****************************************/
/* declaration des procedures Interrupt*/
/****************************************/

void save_thCtx	(void)
{
#ifdef AFFICHAGE
	fprintf (pFic,"save_thCtx\n");
#endif
	}

void restore_thCtx(void)
{
#ifdef AFFICHAGE
	fprintf (pFic,"restore_thCtx\n");
#endif
}

void push_ItCtx	(void)
{
#ifdef AFFICHAGE
	fprintf (pFic,"push_ItCtx\n");
#endif
}
		
void pop_ItCtx	(void)
{
#ifdef AFFICHAGE
	fprintf (pFic,"pop_ItCtx\n");
#endif
}




/**************************/
/* procedure du Scheduler */
/**************************/

/****
*  Cette fonction appele au debut de l'execution initialise le scheduler
****/
void schedulerInit(void)
{
    TAB_ThreadState[dummyThread] = actif;
#ifdef AFFICHAGE
    fprintf (pFic,"schedulerInit\n");
    fprintf (pFic,"\tdummyThread est actif\n");
#endif
}

/****
* Cette fonction appelee par le signal TestSchedule choisi un Thread parmi les Threads actifs
* 
*  On passe par adresse de Thread qui avait le processeur, on renvoie celui qui l'aura et
* on indique la presence d'un changement.
*
* PARAMETERS
*  INPUT : *pt_running, numero de thread qui avait le processeur 
*  OUTPUT : *pt_running, numero du thread qui aura le processeur
*                   *pt_change, boolean qui indique la presence de changement d'allocation du processeur 
***/
void scheduleChoose(boolean *pt_change ,int *pt_running)  
{
    int num;
    int prioritaire = dummyThread;
    int prio_max = 0;

#ifdef AFFICHAGE
    fprintf (pFic,"scheduleChoose\n");
    fprintf(pFic,"\t*pt_running (avant) : %d\n",*pt_running);
#endif
    /* On cherche le thread prioritaire parmi les Threads actifs autres que dummyThread (indice 0)  */
    for (num=1;num<MAX;num++)
    {
        if ( (TAB_ThreadState[num] == actif) )
        {
            if ( (TAB_Priority[num] < prio_max) || ( prio_max == 0) )
            {
                prio_max = TAB_Priority[num];
                prioritaire = num;
            }
        }
    }
    if (prioritaire == *pt_running)
        *pt_change = 0; /*FALSE*/
    else
        *pt_change = 1; /*TRUE*/
    
    if (*pt_change == 1 ) /*TRUE*/
    {
        *pt_running = prioritaire;
        RunningThread = *pt_running;
    }
    
#ifdef AFFICHAGE
    fprintf(pFic,"\t*pt_change : %d\n",*pt_change);
    fprintf(pFic,"\t*pt_running : %d\n",*pt_running);
#endif    
}


/**************************/
/* fonction du Scheduler */
/**************************/

/****
* Cette fonction renvoie le numero de thread attribue a la demande de creation.
*
* Elle cherche le numero du premier thread libre, lui attribue la priorite passee en
* argument et renvoie le numero. Si aucun thread n'est libre, elle renvoie un 
* numero corespondant a aucun thread instancier
*
* INPUT : p_CreateThread, indique la priorite du thread que l'on veut creer
* RETURN : numero, numero du thread cree
****/
int createThread (ThreadDesc p_CreateThread)
{
    int  numero = 1;

#ifdef AFFICHAGE
        fprintf(pFic,"before createThread\n");
	affichage_tableau(TAB_ThreadState);
#endif  

    while (TAB_ThreadState[numero]  != libre && numero <MAX)
        numero++;
    if (numero<MAX && TAB_ThreadState[numero] == libre)
    {
        TAB_Priority[numero] = p_CreateThread;
#ifdef AFFICHAGE
        fprintf(pFic,"createThread\n");
        fprintf(pFic,"\tThreadCreated  : %d\n",numero);
	affichage_tableau(TAB_ThreadState);
#endif
        return numero;
    }
    else 
    {
#ifdef AFFICHAGE
        fprintf(pFic,"createThread\n");
        fprintf(pFic,"\tIl n'y a plus de Thread disponible, le Thread n'est pas cree\n");
#endif
        return (MAX);
    }
}


/****
* Les fonctions timeSlice et IncludeIn sont utilises dans le module TimeSlice
* Il n'est donc pas utile de les remplir
****/
int timeSlice (int *pa)
    /* Cette fonction renvoie un entier correspondant a l intervalle
       de temps attribue au Thread passe en argument */ 
{
#ifdef AFFICHAGE
	fprintf (pFic,"timeSlice\n");
#endif
	return 2;
}				
int IncludedIn (int *pa,int *pb)
    /* Cette fonction indique si le Thread courant est en train de se suicider */
{
#ifdef AFFICHAGE
	fprintf (pFic,"IncludedIn\n");
#endif
	return 0;
}



/************************************/
/* declarations des procedures	Time */
/************************************/

/****
* Cette procedure affiche un tableau de taille MAX.
*
* PARAMETERS
*  INPUT : *pt_tableau, adresse du premier element du tableau a afficher
****/
void affichage_tableau (int p_tableau [])
{
#ifdef AFFICHAGE
    int i;
   
    if   ( &p_tableau[0]==&TAB_Timer[0] ) 
        fprintf(pFic,"\tTABLEAU TAB_Timer\t :");
     
    if ( &p_tableau[0] ==  &TAB_SetTimer[0] )
        fprintf(pFic,"\tTABLEAU TAB_SetTimer\t :");
    
    if ( &p_tableau[0] ==  &TAB_DelTimer[0] )
        fprintf(pFic,"\tTABLEAU TAB_DelTimer\t :");

    if ( &p_tableau[0] == &TAB_TimerOut[0])
        fprintf(pFic,"\tTABLEAU TAB_TimerOut\t :");
  
    if ( &p_tableau[0] ==  &TAB_Awaken[0] )
        fprintf(pFic,"\tTABLEAU TAB_Awaken\t :");

   if ( &p_tableau[0] ==  &TAB_ThreadState[0] )
        fprintf(pFic,"\tTABLEAU TAB_ThreadState\t :");
  
  if ( &p_tableau[0] ==  &TAB_Priority[0] )
        fprintf(pFic,"\tTABLEAU TAB_Priority\t:");
 
    for (i=0;i<MAX;i++)
        fprintf (pFic,"\t%d",p_tableau[i]);    

    fprintf(pFic,"\n");
#endif
}
/****
* Cette procedure empile les Timers
*
*  Les Timers a ajouter sont contenus dans le tableau SelTimer. Sur reception du signal 
* SetTimer par le module TimerMgr, cette procedure est appelee : elle ajoute les timers
* dans le tableau TAB_Timer, et indique si le prochain Timer attendu vient d'etre ajoute. Dans ce cas,
* elle indique quel est le prochain Timer attendu.
*
* PARAMETERS
*  INPUT  :   *pt_next, valeur du prochain Timer avant empilement
*  OUTPUT : *pt_next, valeur du prochain Timer apres empilement
*                   *pt_isNext, boolean pui indique que un des Timers empiles est le prochain Timer
****/
void enqueueTimers (TimeVal *pt_next, boolean *pt_isNext)
    /* empile les timers */
{
#ifdef TRAITEMENT
    int i;
    TimeVal next = 0;
    *pt_isNext = 0; /*FALSE*/

#ifdef AFFICHAGE
    fprintf (pFic,"enqueueTimers\n");
    affichage_tableau(TAB_SetTimer);
#endif

    for (i=0;i<MAX;i++)
    {
        if (TAB_SetTimer[i] != 0)
        {
         
            /* On empile les nouveaux Timers dans le tableau des Timers */
            TAB_Timer[i]=TAB_SetTimer[i];

            /* Recherche du prochain Timer */
            if (TAB_SetTimer[i] < next || next ==0 )
            {
                next = TAB_Timer[i];
            }
            /* mise a zero du tableau TAB_SetTimer */
            TAB_SetTimer[i] = 0;
        }
    }
 
    if ( (next  < *pt_next) || (*pt_next == 0) )
    {
        *pt_isNext = 1; /*TRUE*/
        *pt_next = next;
    }
#ifdef AFFICHAGE
    affichage_tableau(TAB_Timer);
    fprintf(pFic,"\tProchain Timer = %d\n",*pt_next);
    fprintf (pFic,"\tisnext : %d , next : %d\n",*pt_isNext,*pt_next);
    
#endif

#endif

}




/****
* Cette procedure depile les Timers.
*
* Les Timers a annuler sont contenus dans le tableau DelTimer. Sur reception du signal 
* DelTimer par le module TimerMgr, cette procedure est appelee : elle met a zero les timers
* dans le tableau TAB_Timer, et indique si le prochain Timer attendu a ete annule. Dans ce cas,
* elle indique quel est le prochain Timer attendu.
*
* PARAMETERS
*  INPUT  :   *pt_next, valeur du prochain Timer avant depilement
*  OUTPUT : *pt_next, valeur du prochain Timer apres depilement
*                  *pt_noMore : boolean qui indique l'abscence de Timer dans la pile
*                  *pt_was_Next : boolean pui indique que un des Timers depiles etait le prochain Timer
****/
void dequeueTimers (TimeVal *pt_next, boolean *pt_noMore, boolean *pt_wasNext)

{
#ifdef TRAITEMENT

    int i;
   
    *pt_wasNext = 0; /*FALSE*/
    *pt_noMore = 0; /*FALSE*/

#ifdef AFFICHAGE
    fprintf (pFic,"dequeueTimers\n");
    affichage_tableau(TAB_DelTimer);
#endif

    for (i=0;i<MAX;i++)
    {
        if (TAB_DelTimer[i] != 0)
        {
            /* Le Timer annule etait le prochain attendu */
            if (*pt_next == TAB_DelTimer[i])
                *pt_wasNext = 1; /*TRUE*/
            /* On annule le Timer */
            TAB_Timer[i]=0;
            TAB_DelTimer[i]=0;
        }
    }
#ifdef AFFICHAGE
    affichage_tableau(TAB_Timer);
#endif
        
       if (*pt_wasNext == 1)
           /* Recherche du nouveau prochain Timer */
       {
           *pt_next = 0;
           for (i=0;i<MAX;i++)
           {
               if (TAB_Timer[i] != 0)
               {
                   if  ( (*pt_next == 0) || (TAB_Timer[i] < *pt_next) )
                       *pt_next = TAB_Timer[i];
               }
           }
       }
#ifdef AFFICHAGE
       fprintf (pFic,"\tProchain Timer = %d \n ",*pt_next);
       fprintf (pFic,"\t*pt_wasNext : %d\n",*pt_wasNext );
       fprintf (pFic,"\t*pt_noMore : %d\n",*pt_noMore);
#endif
       

#endif
}


/****
* Cette procedure depile les Timers qui arrive a  expiration.
* 
* Sur expiration d'un Timer, cette procedure est appelee : les Timers expires
* sont annules, la procedure recherche alors le prochain Timer et indique 
* s'il reste encore des Timers.
* 
* PARAMETERS
*  INPUT :      p_nextTimer, date du Timer arrive a expiration
*  OUTPUT :   *pt_nextTimer, date du prochain Timer attendu
*                     *noMore, boolean qui indique l'abscence de Timers dans la pile
****/
void dequeueTimersAt(TimeVal *pt_nextTimer, boolean *pt_noMore,TimeVal p_nextTimer)
{
#ifdef TRAITEMENT
    int i; 
    *pt_nextTimer = 0;
    
    for (i=0;i<MAX;i++)
    {
        /* Reinitialisation du tableau TAB_TimerOut*/
        TAB_TimerOut[i] = 0;
        /* Recherche des TimerOuts */
        if (TAB_Timer[i] == p_nextTimer)
        {
            TAB_TimerOut[i] = 1;
            TAB_Timer[i] = 0;
        }
        
        /* Recherche du prochain timer */
        if (TAB_Timer[i] != 0)
        {
            if  ( (*pt_nextTimer == 0) || (TAB_Timer[i] < *pt_nextTimer) )
                *pt_nextTimer = TAB_Timer[i];
        }

        if (*pt_nextTimer == 0)
            *pt_noMore = 1; /*TRUE*/
        else
            *pt_noMore = 0; /*FALSE*/

    }
#ifdef AFFICHAGE
    fprintf (pFic,"dequeueTimersAt\n");
    affichage_tableau(TAB_Timer);
    affichage_tableau(TAB_TimerOut);
    fprintf (pFic,"\tProchain Timer : %d \n",*pt_nextTimer);
    fprintf (pFic,"\tnoMore : %d \n",*pt_noMore);
#endif
#endif
}

/****
* Appele une seule fois au lancement, cette procedure initalise l'horloge interne 
* avec la constante nullTimeVall.
****/
void initCurrentTime (void)
{
#ifdef TRAITEMENT
    CurrentTime = nullTimeVal;
#ifdef AFFICHAGE
    fprintf (pFic,"initCurrentTime\n");
    fprintf (pFic,"\tCurrentTime = %d\n",CurrentTime);
#endif
#endif
}


/****************************************/
/* Declaration des fonctions Time       */
/****************************************/

/****
* Cette fonction calcule le temps a attendre avant l'expiration 
* du prochain Timer.
*
*  INPUT : p_nextTimer, date du prochain Timer attendu
*               p_ClockVal, valeur de l'horloge interne
*  RETURN : intervalle de temps a attendre avant expiration du Timer
****/
int diffTimeVal (TimeVal p_nextTimer, TimeVal p_ClockVal)
{
#ifdef AFFICHAGE
    fprintf (pFic,"diffTimeVal => %d\n",(p_nextTimer - p_ClockVal) );
#endif
	return ( p_nextTimer - p_ClockVal) ; 
}

/****
* Cette fonction incremente l'horloge interne.
*
*  INPUT : p_delta_T, valeur de la constante du pas d'incrementation de l'horloge interne
*  RETURN : valeur de l'horloge interne
****/
TimeVal TimeInc (TimeVal p_deltaT)
{
#ifdef TRAITEMENT
    CurrentTime = CurrentTime + p_deltaT;
#ifdef AFFICHAGE
    fprintf (pFic,"TimeInc\n");
    fprintf (pFic,"\tCurrentTime = %d \n", CurrentTime);
#endif
#endif
    return CurrentTime;

}
/*****************************************/
/* Declaration des procedures de Thread*/
/*****************************************/

/****
* Cette procedure multiplexe des valeurs dans un tableau
*
* La procedure de multiplexage est appelee avant emission 
* du signal a multiplexer. Le signal emis ne transmet pas de valeur.
* Il indique que le multiplexage a eu lieu.
*
* PARAMETERS :
*  INPUT : p_Num_Thread, numero interne du thread
*               p_valeur, valeur a multiplexer
*  OUTPUT : p_tableau, adresse du tableau
****/ 
void multiplexage (pointer p_tableau,int p_Num_Thread, int p_valeur) 
{
#ifdef TRAITEMENT
    p_tableau[p_Num_Thread] = p_valeur;
#ifdef AFFICHAGE
    fprintf (pFic,"multiplexage\n");
    affichage_tableau(p_tableau);
#endif

#endif
}


/****
* Cette procedure demultiplexe les signaux TimerOut
*
* Cette procedure parcourt le tableau TAB_TimerOut et indique 
* si le signal correspondant au Thread est present.
*
* PARAMETERS
*  INPUT : p_Num_Thread, numero interne du thread
*  OUTPUT : *pt_presence, boolean qui indique si le signal est present
****/
void demultiplexage (boolean *pt_presence, int p_Num_Thread)
{
    if (TAB_TimerOut[p_Num_Thread] ==1)
    {
        *pt_presence =1; /*TRUE*/
#ifdef AFFICHAGE
        fprintf (pFic,"demultiplexage\n");
        fprintf (pFic,"\tTimerOut du Thread : %d\n",p_Num_Thread);
#endif
    }
    else 
        *pt_presence = 0; /*FALSE*/
}
            
pointer Ad_SetTimer(void) {return TAB_SetTimer;}
pointer Ad_DelTimer(void) {return TAB_DelTimer;}
pointer Ad_Awaken(void) {return TAB_Awaken;}
pointer Ad_ThreadState(void) {return TAB_ThreadState;}
pointer Ad_Priority(void) {return TAB_Priority;}
char* _pointer_to_text(pointer ptr){

}
void _text_to_pointer(pointer* ptr,char *str) {

}

#


#endif
#endif
