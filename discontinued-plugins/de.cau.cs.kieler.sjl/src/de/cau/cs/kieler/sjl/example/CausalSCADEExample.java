
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

import de.cau.cs.kieler.sjl.example.CausalSCADEExample.State;
import static de.cau.cs.kieler.sjl.example.CausalSCADEExample.State.*;
    
public class CausalSCADEExample extends SJLProgramWithSignals<State> {
    
    public static void main(final String[] args) {
        CausalSCADEExample program = new CausalSCADEExample();
        program.setDebug(true);
        SJLProgramWithSignals.main(args, program);
    }        
    
    enum State {
L_root_surface,
L_root_depth,
L__A_surface,
L__A_surfaceM1694578690,
L__A_depth,
L__A_depthM341268993,
L__A_depthM341268993M341268992,
L__A_depthM341268993M341268992M341268990,
L__B_surface,
L__B_surface1012040704,
L__B_depth,
L__B_depthM1929616895,
L__B_depthM1929616895M1929616894,
L__C_surface,
L__C_depth
}

public boolean I = false;
public boolean L = false;
public boolean O = false;
public Object I_value = null;
public Object L_value = null;
public Object O_value = null;

public CausalSCADEExample() {
        super(L_root_surface, 5, 5);
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
                 fork(L__A_surface,4);
                                      gotoB(L_root_depth);
                 break;
            case L_root_depth:  
                 haltB();
                 break;
            case L__A_surface:  
                 prioB(4, L__A_surfaceM1694578690);
                 break;
            case L__A_surfaceM1694578690:  
                 gotoB(L__A_depth);
                 break;
            case L__A_depth:  
                 prioB(4, L__A_depthM341268993);
                 break;
            case L__A_depthM341268993:  
                 pauseB(L__A_depthM341268993M341268992);
                 break;
            case L__A_depthM341268993M341268992:  
                 if ((
                 I && 
                 L
                         )
                 ) { 
                            O = true;          
                            gotoB(L__B_surface);
                            break;
                          }
                            prioB(3, L__A_depthM341268993M341268992M341268990);
                 break;
            case L__A_depthM341268993M341268992M341268990:  
                 if ((
                 I && 
                 (!(L))
                         )
                 ) { 
                            gotoB(L__B_surface);
                            break;
                          }
                            gotoB(L__A_depth);
                 break;
            case L__B_surface:  
                 prioB(2, L__B_surface1012040704);
                 break;
            case L__B_surface1012040704:  
                 if (true) { 
                            L = true;          
                            gotoB(L__C_surface);
                            break;
                          }
                            gotoB(L__B_depth);
                 break;
            case L__B_depth:  
                 prioB(2, L__B_depthM1929616895);
                 break;
            case L__B_depthM1929616895:  
                 pauseB(L__B_depthM1929616895M1929616894);
                 break;
            case L__B_depthM1929616895M1929616894:  
                 if (true) { 
                            L = true;          
                            gotoB(L__C_surface);
                            break;
                          }
                            gotoB(L__B_depth);
                 break;
            case L__C_surface:  
                 gotoB(L__C_depth);
                 break;
            case L__C_depth:  
                 haltB();
                 break;
      
           }
       }         
    }

}
