
package de.cau.cs.kieler.sjl.example;
       
/*
 *****************************************************************************
 *                 G E N E R A T E D     S J    C O D E                      *
 *****************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient        *
 *                                                                           *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/                           *
 * Copyright 2013 by                                                         *
 * + Kiel University                                  *
 *   + Department of Computer Science                                        *
 *     + Real-Time and Embedded Systems Group                                *
 *                                                                           *
 * This code is provided under the terms of the Eclipse Public License (EPL).*
 *****************************************************************************
 */

import java.io.IOException;
import de.cau.cs.kieler.sjl.SJLProgramWithSignals;

import de.cau.cs.kieler.sjl.example.sj_simple.State;
import static de.cau.cs.kieler.sjl.example.sj_simple.State.*;
    
public class sj_simple extends SJLProgramWithSignals<State> {
    
    
    public static void main(final String[] args) {
        sj_simple program = new sj_simple();
        program.setDebug(true);
        SJLProgramWithSignals.main(args, program);
    }
    
    enum State {
L_root_surface,
L_root_depth,
L__ABO_surface,
L__ABO_depth,
L__ABO_depthM341268993,
L__ABO_depthM341268993M341268992,
L__ABO_dA_surface,
L__ABO_dA_depth,
L__ABO_dA__surface,
L__ABO_dA__surfaceM576307198,
L__ABO_dA__depth,
L__ABO_dA__depth777002499,
L__ABO_dA__depth777002499777002500,
L__ABO_wA_surface,
L__ABO_wA_depth,
L__ABO_wA_depthM811345403,
L__ABO_wA_depthM811345403M811345402,
L__ABO_wA_depthM811345403M811345402M811345401,
L__ABO_wA__surface,
L__ABO_wA__surfaceM402264189,
L__ABO_wA__depth,
L__ABO_wA__depth951045508,
L__ABO_wA__depth951045508951045509
}

public boolean A = false;
public boolean R = false;
public boolean O1 = false;
public boolean O2 = false;
public Object A_value = null;
public Object R_value = null;
public Object O1_value = null;
public Object O2_value = null;

public sj_simple() {
        super(L_root_surface, 8, 8);
    }
    


public void resetInputSignals() {    
A = false;
R = false;
}

public void resetOutputSignals() {    
O1 = false;
O2 = false;
}


   @Override
    protected final void tick() {
        while (!isTickDone()) {
            switch (state()) {
                
             case L_root_surface:  
                  fork(L__ABO_surface,7);
                                       gotoB(L_root_depth);
                  break;
             case L_root_depth:  
                  haltB();
                  break;
             case L__ABO_surface:  
                  fork(L__ABO_wA_surface,4);
                                       gotoB(L__ABO_depth);
                  break;
             case L__ABO_depth:  
                  prioB(7, L__ABO_depthM341268993);
                  break;
             case L__ABO_depthM341268993:  
                  pauseB(L__ABO_depthM341268993M341268992);
                  break;
             case L__ABO_depthM341268993M341268992:  
                  if (R) { 
                             abort();
                             gotoB(L__ABO_surface);
                             break;
                           }
                             gotoB(L__ABO_depth);
                  break;
             case L__ABO_dA_surface:  
                  fork(L__ABO_dA__surface,5);
                                       gotoB(L__ABO_dA_depth);
                  break;
             case L__ABO_dA_depth:  
                  haltB();
                  break;
             case L__ABO_dA__surface:  
                  prioB(5, L__ABO_dA__surfaceM576307198);
                  break;
             case L__ABO_dA__surfaceM576307198:  
                  gotoB(L__ABO_dA__depth);
                  break;
             case L__ABO_dA__depth:  
                  prioB(5, L__ABO_dA__depth777002499);
                  break;
             case L__ABO_dA__depth777002499:  
                  pauseB(L__ABO_dA__depth777002499777002500);
                  break;
             case L__ABO_dA__depth777002499777002500:  
                  if (true) { 
                             O2 = true;          
                             gotoB(L__ABO_dA__surface);
                             break;
                           }
                             gotoB(L__ABO_dA__depth);
                  break;
             case L__ABO_wA_surface:  
                  fork(L__ABO_wA__surface,3);
                                       gotoB(L__ABO_wA_depth);
                  break;
             case L__ABO_wA_depth:  
                  prioB(4, L__ABO_wA_depthM811345403);
                  break;
             case L__ABO_wA_depthM811345403:  
                  pauseB(L__ABO_wA_depthM811345403M811345402);
                  break;
             case L__ABO_wA_depthM811345403M811345402:  
                  prioB(2, L__ABO_wA_depthM811345403M811345402M811345401);
                  break;
             case L__ABO_wA_depthM811345403M811345402M811345401:  
                  if (A) { 
                             abort();
                             gotoB(L__ABO_dA_surface);
                             break;
                           }
                             gotoB(L__ABO_wA_depth);
                  break;
             case L__ABO_wA__surface:  
                  prioB(3, L__ABO_wA__surfaceM402264189);
                  break;
             case L__ABO_wA__surfaceM402264189:  
                  gotoB(L__ABO_wA__depth);
                  break;
             case L__ABO_wA__depth:  
                  prioB(3, L__ABO_wA__depth951045508);
                  break;
             case L__ABO_wA__depth951045508:  
                  pauseB(L__ABO_wA__depth951045508951045509);
                  break;
             case L__ABO_wA__depth951045508951045509:  
                  if (true) { 
                             O1 = true;          
                             gotoB(L__ABO_wA__surface);
                             break;
                           }
                             gotoB(L__ABO_wA__depth);
                  break;
       
            }
        }       
    }

}
