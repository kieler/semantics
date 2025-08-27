
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

import de.cau.cs.kieler.sjl.example.simple_hierarchy.State;
import static de.cau.cs.kieler.sjl.example.simple_hierarchy.State.*;
    
public class simple_hierarchy extends SJLProgramWithSignals<State> {
    
    public static void main(final String[] args) {
        simple_hierarchy program = new simple_hierarchy();
        program.setDebug(true);
        SJLProgramWithSignals.main(args, program);
    }
        
    
    enum State {
L_root_surface,
L_root_depth,
L__B_surface,
L__B_join,
L__B_joinM341268993,
L__B_depth,
L__B_depth1012040704,
L__B_C_surface,
L__B_C_surfaceM1929616895,
L__B_C_depth,
L__B_C_depthM576307198,
L__B_C_depthM576307198M576307197,
L__A_surface,
L__A_surface777002499,
L__A_depth,
L__A_depth2130312196,
L__A_depth21303121962130312197,
L__E_surface,
L__E_depth,
L__B_D_surface,
L__B_D_depth,
L__B_D_depthM1990612091
}


public simple_hierarchy() {
        super(L_root_surface, 6, 6);
    }
    


public void resetInputSignals() {    
}

public void resetOutputSignals() {    
}


   @Override
    protected final void tick() {
        while (!isTickDone()) {
            switch (state()) {
                
             case L_root_surface:  
                  fork(L__A_surface,2);
                                       gotoB(L_root_depth);
                  break;
             case L_root_depth:  
                  haltB();
                  break;
             case L__B_surface:  
                  fork(L__B_C_surface,4);
                                       gotoB(L__B_join);
                  break;
             case L__B_join:  
                  prioB(3, L__B_joinM341268993);
                  break;
             case L__B_joinM341268993:  
                  if(!join()) {
                                 pauseB(L__B_depth);
                  break;
                            };
                             if (true) { 
                             abort();
                             gotoB(L__E_surface);
                             break;
                           }
             case L__B_depth:  
                  prioB(3, L__B_depth1012040704);
                  break;
             case L__B_depth1012040704:  
                  gotoB(L__B_join);
                  break;
             case L__B_C_surface:  
                  prioB(4, L__B_C_surfaceM1929616895);
                  break;
             case L__B_C_surfaceM1929616895:  
                  gotoB(L__B_C_depth);
                  break;
             case L__B_C_depth:  
                  prioB(4, L__B_C_depthM576307198);
                  break;
             case L__B_C_depthM576307198:  
                  pauseB(L__B_C_depthM576307198M576307197);
                  break;
             case L__B_C_depthM576307198M576307197:  
                  if (true) { 
                             gotoB(L__B_D_surface);
                             break;
                           }
                             gotoB(L__B_C_depth);
                  break;
             case L__A_surface:  
                  prioB(2, L__A_surface777002499);
                  break;
             case L__A_surface777002499:  
                  gotoB(L__A_depth);
                  break;
             case L__A_depth:  
                  prioB(2, L__A_depth2130312196);
                  break;
             case L__A_depth2130312196:  
                  pauseB(L__A_depth21303121962130312197);
                  break;
             case L__A_depth21303121962130312197:  
                  if (true) { 
                             gotoB(L__B_surface);
                             break;
                           }
                             gotoB(L__A_depth);
                  break;
             case L__E_surface:  
                  gotoB(L__E_depth);
                  break;
             case L__E_depth:  
                  haltB();
                  break;
             case L__B_D_surface:  
                  gotoB(L__B_D_depth);
                  break;
             case L__B_D_depth:  
                  termB();
                  break;
             case L__B_D_depthM1990612091:  
       
            }
        }          }

}
