
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

import de.cau.cs.kieler.sjl.SJLProgramWithSignals;

import de.cau.cs.kieler.sjl.example.advanced.State;
import static de.cau.cs.kieler.sjl.example.advanced.State.*;
    
public class advanced extends SJLProgramWithSignals<State> {

    public static void main(final String[] args) {
        advanced program = new advanced();
        program.setDebug(true);
        SJLProgramWithSignals.main(args, program);
    }
    
    enum State {
L_root_surface,
L_root_depth,
L__14547458_BC_surface,
L__14547458_BC_depth,
L__14547458_A_surface,
L__14547458_A_surface1012040704,
L__14547458_A_depth,
L__14547458_A_depthM1929616895,
L__14547458_A_depthM1929616895M1929616894,
L__1789689_D_surface,
L__1789689_D_surfaceM576307198,
L__1789689_D_depth,
L__1789689_D_depth777002499,
L__1789689_D_depth777002499777002500,
L__14547458_BC_B_surface,
L__14547458_BC_B_surface2130312196,
L__14547458_BC_B_depth,
L__14547458_BC_B_depthM811345403,
L__14547458_BC_B_depthM811345403M811345402,
L__14547458_BC_C_surface,
L__14547458_BC_C_depth,
L__1789689_E_surface,
L__1789689_E_depth
}

public boolean L1 = false;
public boolean L2 = false;
public boolean I = false;
public boolean O = false;
public Object L1_value = null;
public Object L2_value = null;
public Object I_value = null;
public Object O_value = null;

public advanced() {
        super(L_root_surface, 6, 6);
    }
    


public void resetInputSignals() {    
I = false;
}

public void resetOutputSignals() {    
O = false;
}


   @Override
    protected final void tick() {
        while (!isTickDone()) {
            switch (state()) {
                
             case L_root_surface:  
                  fork(L__1789689_D_surface,3);
                             fork(L__14547458_A_surface,4);
                                       gotoB(L_root_depth);
                  break;
             case L_root_depth:  
                  haltB();
                  break;
             case L__14547458_BC_surface:  
                  fork(L__14547458_BC_B_surface,2);
                                       gotoB(L__14547458_BC_depth);
                  break;
             case L__14547458_BC_depth:  
                  haltB();
                  break;
             case L__14547458_A_surface:  
                  prioB(4, L__14547458_A_surface1012040704);
                  break;
             case L__14547458_A_surface1012040704:  
                  gotoB(L__14547458_A_depth);
                  break;
             case L__14547458_A_depth:  
                  prioB(4, L__14547458_A_depthM1929616895);
                  break;
             case L__14547458_A_depthM1929616895:  
                  pauseB(L__14547458_A_depthM1929616895M1929616894);
                  break;
             case L__14547458_A_depthM1929616895M1929616894:  
                  if (I) { 
                             L1 = true;          
                             gotoB(L__14547458_BC_surface);
                             break;
                           }
                             gotoB(L__14547458_A_depth);
                  break;
             case L__1789689_D_surface:  
                  prioB(3, L__1789689_D_surfaceM576307198);
                  break;
             case L__1789689_D_surfaceM576307198:  
                  if (L1) { 
                             L2 = true;          
                             gotoB(L__1789689_E_surface);
                             break;
                           }
                             gotoB(L__1789689_D_depth);
                  break;
             case L__1789689_D_depth:  
                  prioB(3, L__1789689_D_depth777002499);
                  break;
             case L__1789689_D_depth777002499:  
                  pauseB(L__1789689_D_depth777002499777002500);
                  break;
             case L__1789689_D_depth777002499777002500:  
                  if (L1) { 
                             L2 = true;          
                             gotoB(L__1789689_E_surface);
                             break;
                           }
                             gotoB(L__1789689_D_depth);
                  break;
             case L__14547458_BC_B_surface:  
                  prioB(2, L__14547458_BC_B_surface2130312196);
                  break;
             case L__14547458_BC_B_surface2130312196:  
                  if (L2) { 
                             O = true;          
                             gotoB(L__14547458_BC_C_surface);
                             break;
                           }
                             gotoB(L__14547458_BC_B_depth);
                  break;
             case L__14547458_BC_B_depth:  
                  prioB(2, L__14547458_BC_B_depthM811345403);
                  break;
             case L__14547458_BC_B_depthM811345403:  
                  pauseB(L__14547458_BC_B_depthM811345403M811345402);
                  break;
             case L__14547458_BC_B_depthM811345403M811345402:  
                  if (L2) { 
                             O = true;          
                             gotoB(L__14547458_BC_C_surface);
                             break;
                           }
                             gotoB(L__14547458_BC_B_depth);
                  break;
             case L__14547458_BC_C_surface:  
                  gotoB(L__14547458_BC_C_depth);
                  break;
             case L__14547458_BC_C_depth:  
                  haltB();
                  break;
             case L__1789689_E_surface:  
                  gotoB(L__1789689_E_depth);
                  break;
             case L__1789689_E_depth:  
                  haltB();
                  break;
       
            }
        }       
    }

}
