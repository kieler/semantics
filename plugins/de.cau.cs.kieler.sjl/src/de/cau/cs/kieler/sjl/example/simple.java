
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

import de.cau.cs.kieler.sjl.example.simple.State;
import static de.cau.cs.kieler.sjl.example.simple.State.*;
    
public class simple extends SJLProgramWithSignals<State> {
    
    public static void main(final String[] args) {
        simple program = new simple();
        program.setDebug(true);
        SJLProgramWithSignals.main(args, program);
    }    
    
    enum State {
start,
startM106230788,
middle,
middle1247078909,
end
}

public boolean I = false;
public boolean O = false;
public Object I_value = null;
public Object O_value = null;

public simple() {
        super(start, 1, 1);
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
                
             case start:  
                  pauseB(startM106230788);
                  break;
             case startM106230788:  
                  if (I) { 
                             gotoB(middle);
                             break;
                           }
                             gotoB(start);
                  break;
             case middle:  
                  pauseB(middle1247078909);
                  break;
             case middle1247078909:  
                  O = true;          
                             gotoB(end);
                  break;
             case end:  
                  haltB();
                  break;
       
            }
        }       
    }

}
