
/******************************************************************
 * T E S T   H E A D E R                                          *
 *                                                                *
 * C O O L   S T U F F   H E R E                                  *
 ******************************************************************/

#include "kicking.h"
#include "railway.h"
#include "time.h"
#include "Controller.c"

// Basic dimension constants
#define NUM_OF_TRACKS 48
#define NUM_OF_POINTS 30
#define NUM_OF_LIGHTS 24

#define OPEN 0
#define CLOSED 1 


int main(int *argn, char *argv[]) {

    struct railway_system *railway;

	char _contacts_pre[48][2];
	int _tracks_pre[48][2];
  	char _points_pre[30];
  	int _signals_pre[48][2];
  	char _lights_pre[24];
  	char _crossing_pre;
    clock_t lastSecond = clock();
    int crossing = CLOSED;

    // Setup connection to the railway
    railway = railway_initsystem(&kicking);
    railway_openlinks_udp(railway,"node%02i","/dev/ttyS0");
    railway_startcontrol(railway,0,0);

    // Create TickData struct and initialize values
    TickData *data = (TickData *) malloc(sizeof(TickData));
    reset(data);

	for (int i = 0; i < NUM_OF_TRACKS; i++) {
		data->tracks[i][0] = 0;
		data->tracks[i][1] = 0;
		_tracks_pre[i][0] = 0;
		_tracks_pre[i][1] = 0;
		data->signals[i][0] = 1;
		data->signals[i][1] = 1;
		_signals_pre[i][0] = 1;
		_signals_pre[i][1] = 1;
	}
    
	for (int i = 0; i < NUM_OF_POINTS; i++) {
		data->points[i] = 0;
		_points_pre[i] = 0;
		setpoint(railway, i, 0);
	}
	
	for (int i = 0; i < NUM_OF_LIGHTS; i++) {
		data->lights[i] = 0;
		_lights_pre[i] = 0;
	}

    while(!data->_TERM) {
    	
        // Scan the contacts at the beginning of each tick
        for (int i = 0; i < NUM_OF_TRACKS - 1; i++) {
            if ((i != KH_ST_0) && (i != KH_ST_6) && (i != IC_ST_0) && (i != IC_ST_4) && \
                (i != OC_ST_0) && (i != OC_ST_4) && (i != IC_JCT_0) && (i != OC_JCT_0)) {
                data->contacts[i][0] = !!getcontact(railway, i, 0, 1);
                data->contacts[i][1] = !!getcontact(railway, i, 1, 1); 
			}
        }

        // Set second to true if at least one second has elapsed since the last time it was true
        if ((((double) clock() - lastSecond) / CLOCKS_PER_SEC) >= 1) {
            data->second = 1;
            lastSecond = clock();
        }

        // Execute a tick in the model
        tick(data);
        
        // Set the tracks to the appropriate speed
        for (int i = 0; i < NUM_OF_TRACKS; i++) {
			if ((data->tracks[i][1] != _tracks_pre[i][1]) 
				|| (data->tracks[i][0] != _tracks_pre[i][0])) {            
				settrack(railway, i, data->tracks[i][1], data->tracks[i][0]);

				//if applicable, set signals too
		        if ((i != KH_ST_0) && (i != KH_ST_6) && (i != IC_ST_0) && (i != IC_ST_4) && \
		            (i != OC_ST_0) && (i != OC_ST_4) && (i != IC_JCT_0) && (i != OC_JCT_0)) {
		            setsignal(railway, i, 0, data->signals[i][1]);
		            setsignal(railway, i, 1, data->signals[i][0]);
		        }
			}
        }

        // Set all the switch points appropriately
        for (int i = 0; i < NUM_OF_POINTS; i++) {
		    if (data->points[i] != _points_pre[i]) {     
				setpoint(railway, i, data->points[i]);
				setpoint(railway, i, data->points[i]);
			}
        }

        // Set all the lights appropriately
        for (int i = 0; i < NUM_OF_LIGHTS; i++) {
		    if (data->lights[i] != _lights_pre[i]) {     
            	setlight(railway, i, data->lights[i]);
			}
        }

        // If the crossing's state has been updated this tick, set it accordingly
		if (data->crossing != crossing) {
            setgate(railway, 0, data->crossing);
            setgate(railway, 1, data->crossing);
        }
	
        // Set local pre values appropriately
		data->second = 0;
		crossing = data->crossing;

		for (int i = 0; i < NUM_OF_TRACKS; i++) {
			_tracks_pre[i][0] = data->tracks[i][0];
			_tracks_pre[i][1] = data->tracks[i][1];
			_signals_pre[i][0] = data->signals[i][0];
			_signals_pre[i][1] = data->signals[i][1];
		}

		for (int i = 0; i < NUM_OF_POINTS; i++) {
			_points_pre[i] = data->points[i];
		}	

		for (int i = 0; i < NUM_OF_LIGHTS; i++) {
			_lights_pre[i] = data->lights[i];
		}
    } // End while
    
    // Shut down the connection to the railway
    railway_stopcontrol(railway,1);
    railway_closelinks(railway);
    railway_donesystem(railway);
    
    return 0;
}
