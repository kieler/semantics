
package de.cau.cs.kieler.sjl.example;
       
/*
 *****************************************************************************
 *                 G E N E R A T E D     S J    C O D E                      *
 *****************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient        *
 *                                                                           *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/                           *
 * Copyright 2013 by                                                         *
 * + Christian-Albrechts-University of Kiel                                  *
 *   + Department of Computer Science                                        *
 *     + Real-Time and Embedded Systems Group                                *
 *                                                                           *
 * This code is provided under the terms of the Eclipse Public License (EPL).*
 *****************************************************************************
 */

import java.io.IOException;
import de.cau.cs.kieler.sjl.SJLProgramWithSignals;

import de.cau.cs.kieler.sjl.example.CausalSCADEExample2.State;
import static de.cau.cs.kieler.sjl.example.CausalSCADEExample2.State.*;
    
public class CausalSCADEExample2 extends SJLProgramWithSignals<State> {
    
    public static void main(final String[] args) {
        CausalSCADEExample2 program = new CausalSCADEExample2();
        program.setDebug(true);
        SJLProgramWithSignals.main(args, program);
    }        
    
    
    enum State {
L_root_surface,
L_root_depth,
L__B_surface,
L__B_surface2,
L__B_surface2M341268992,
L__B_depth,
L__B_depth1012040705,
L__B_depth10120407051012040707,
L__B_depth101204070510120407071012040709,
L__B_During2Internal2991163_surface,
L__B_During2Internal2991163_surfaceM1929616894,
L__B_During2Internal2991163_depth,
L__B_During2Internal2991163_depthM576307197,
L__B_During2Internal2991163_depthM576307197M576307195,
L__B_During1Internal2991163_surface,
L__B_During1Internal2991163_surface777002500,
L__B_During1Internal2991163_depth,
L__B_During1Internal2991163_depth2130312197,
L__B_During1Internal2991163_depth21303121972130312199,
L__A_surface,
L__A_depth,
L__A_depthM402264188,
L__A_depthM402264188M402264186,
L__A_depthM402264188M402264186M402264184,
L__A_depthM402264188M402264186M402264184M402264180,
L__A_During2Internal16381711_surface,
L__A_During2Internal16381711_surface951045509,
L__A_During2Internal16381711_depth,
L__A_During2Internal16381711_depthM1990612090,
L__A_During2Internal16381711_depthM1990612090M1990612088,
L__A_During1Internal16381711_surface,
L__A_During1Internal16381711_surfaceM637302393,
L__A_During1Internal16381711_depth,
L__A_During1Internal16381711_depth716007304,
L__A_During1Internal16381711_depth716007304716007306,
L__C_surface,
L__C_depth,
L__C_During2Internal1612182_surface,
L__C_During2Internal1612182_surface480969099,
L__C_During2Internal1612182_depth,
L__C_During2Internal1612182_depth1834278796,
L__C_During2Internal1612182_depth18342787961834278798,
L__C_During1Internal1612182_surface,
L__C_During1Internal1612182_surfaceM1107378803,
L__C_During1Internal1612182_depth,
L__C_During1Internal1612182_depthM1399336541,
L__C_During1Internal1612182_depthM1399336541M1399336539
}

public boolean I = false;
public boolean L = false;
public boolean O = false;
public boolean oSYNCCHARTSoAUXTRANSo860837186 = false;
public boolean oSYNCCHARTSoAUXTRANSo860837187 = false;
public boolean oSYNCCHARTSoAUXTRANSo793830433 = false;
public boolean oSYNCCHARTSoAUXSTATEo733279297 = false;
public boolean oSYNCCHARTSoAUXSTATEo733279298 = false;
public boolean oSYNCCHARTSoAUXSTATEo733279299 = false;
public boolean oSoAUXILIARYoM106230788 = false;
public boolean oSoAUXILIARYoM106230787 = false;
public boolean oSoAUXILIARYo1247078909 = false;
public boolean oSoAUXILIARYoM1694578690 = false;
public boolean oSoAUXILIARYoM1694578689 = false;
public boolean oSoAUXILIARYoM341268993 = false;
public boolean oSoAUXILIARYoM341268992 = false;
public boolean oSoAUXILIARYo416335960 = false;
public boolean oSoAUXILIARYo416335961 = false;
public boolean oSoAUXILIARYo416335962 = false;
public boolean oSoAUXILIARYo416335963 = false;
public boolean oSoAUXILIARYoM341268991 = false;
public boolean oSoAUXILIARYo1012040704 = false;
public boolean oSoAUXILIARYo1012040705 = false;
public boolean oSoAUXILIARYo1012040706 = false;
public boolean oSoAUXILIARYo1012040707 = false;
public boolean oSoAUXILIARYo939278427 = false;
public boolean oSoAUXILIARYo939278428 = false;
public boolean oSoAUXILIARYo939278429 = false;
public boolean oSoAUXILIARYo939278430 = false;
public boolean oSoAUXILIARYo1012040708 = false;
public boolean oSoAUXILIARYoM1929616895 = false;
public boolean oSoAUXILIARYoM1929616894 = false;
public boolean oSoAUXILIARYoM576307198 = false;
public boolean oSoAUXILIARYoM576307197 = false;
public boolean oSoAUXILIARYoM576307196 = false;
public boolean oSoAUXILIARYoM486417828 = false;
public boolean oSoAUXILIARYoM576307195 = false;
public boolean oSoAUXILIARYo777002499 = false;
public boolean oSoAUXILIARYo777002500 = false;
public boolean oSoAUXILIARYo271562844 = false;
public boolean oSoAUXILIARYo271562845 = false;
public boolean oSoAUXILIARYo777002501 = false;
public boolean oSoAUXILIARYo2130312196 = false;
public boolean oSoAUXILIARYo2130312197 = false;
public boolean oSoAUXILIARYo2130312198 = false;
public boolean oSoAUXILIARYoM558804386 = false;
public boolean oSoAUXILIARYoM558804385 = false;
public boolean oSoAUXILIARYo2130312199 = false;
public boolean oSoAUXILIARYoM811345403 = false;
public boolean oSoAUXILIARYoM811345402 = false;
public boolean oSoAUXILIARYoM402264189 = false;
public boolean oSoAUXILIARYoM402264188 = false;
public boolean oSoAUXILIARYoM402264187 = false;
public boolean oSoAUXILIARYoM402264186 = false;
public boolean oSoAUXILIARYo1684424158 = false;
public boolean oSoAUXILIARYo1684424159 = false;
public boolean oSoAUXILIARYo1684424160 = false;
public boolean oSoAUXILIARYo1684424161 = false;
public boolean oSoAUXILIARYoM402264185 = false;
public boolean oSoAUXILIARYoM402264184 = false;
public boolean oSoAUXILIARYo96076256 = false;
public boolean oSoAUXILIARYo96076257 = false;
public boolean oSoAUXILIARYo96076258 = false;
public boolean oSoAUXILIARYoM402264183 = false;
public boolean oSoAUXILIARYo951045508 = false;
public boolean oSoAUXILIARYo951045509 = false;
public boolean oSoAUXILIARYoM1990612091 = false;
public boolean oSoAUXILIARYoM1990612090 = false;
public boolean oSoAUXILIARYoM1990612089 = false;
public boolean oSoAUXILIARYo258727903 = false;
public boolean oSoAUXILIARYoM1990612088 = false;
public boolean oSoAUXILIARYoM637302394 = false;
public boolean oSoAUXILIARYoM637302393 = false;
public boolean oSoAUXILIARYo1016708575 = false;
public boolean oSoAUXILIARYo1016708576 = false;
public boolean oSoAUXILIARYoM637302392 = false;
public boolean oSoAUXILIARYo716007303 = false;
public boolean oSoAUXILIARYo716007304 = false;
public boolean oSoAUXILIARYo716007305 = false;
public boolean oSoAUXILIARYo186341345 = false;
public boolean oSoAUXILIARYo186341346 = false;
public boolean oSoAUXILIARYo716007306 = false;
public boolean oSoAUXILIARYo2069317000 = false;
public boolean oSoAUXILIARYo2069317001 = false;
public boolean oSoAUXILIARYoM872340599 = false;
public boolean oSoAUXILIARYo480969098 = false;
public boolean oSoAUXILIARYo480969099 = false;
public boolean oSoAUXILIARYo1834278795 = false;
public boolean oSoAUXILIARYo1834278796 = false;
public boolean oSoAUXILIARYo1834278797 = false;
public boolean oSoAUXILIARYo41568229 = false;
public boolean oSoAUXILIARYo1834278798 = false;
public boolean oSoAUXILIARYoM1107378804 = false;
public boolean oSoAUXILIARYoM1107378803 = false;
public boolean oSoAUXILIARYo799548901 = false;
public boolean oSoAUXILIARYo799548902 = false;
public boolean oSoAUXILIARYoM1107378802 = false;
public boolean oSoAUXILIARYoM1399336542 = false;
public boolean oSoAUXILIARYoM1399336541 = false;
public boolean oSoAUXILIARYoM1399336540 = false;
public boolean oSoAUXILIARYo1356606460 = false;
public boolean oSoAUXILIARYo1356606461 = false;
public boolean oSoAUXILIARYoM1399336539 = false;
public Object I_value = null;
public Object L_value = null;
public Object O_value = null;
public Object oSYNCCHARTSoAUXTRANSo860837186_value = null;
public Object oSYNCCHARTSoAUXTRANSo860837187_value = null;
public Object oSYNCCHARTSoAUXTRANSo793830433_value = null;
public Object oSYNCCHARTSoAUXSTATEo733279297_value = null;
public Object oSYNCCHARTSoAUXSTATEo733279298_value = null;
public Object oSYNCCHARTSoAUXSTATEo733279299_value = null;
public Object oSoAUXILIARYoM106230788_value = null;
public Object oSoAUXILIARYoM106230787_value = null;
public Object oSoAUXILIARYo1247078909_value = null;
public Object oSoAUXILIARYoM1694578690_value = null;
public Object oSoAUXILIARYoM1694578689_value = null;
public Object oSoAUXILIARYoM341268993_value = null;
public Object oSoAUXILIARYoM341268992_value = null;
public Object oSoAUXILIARYo416335960_value = null;
public Object oSoAUXILIARYo416335961_value = null;
public Object oSoAUXILIARYo416335962_value = null;
public Object oSoAUXILIARYo416335963_value = null;
public Object oSoAUXILIARYoM341268991_value = null;
public Object oSoAUXILIARYo1012040704_value = null;
public Object oSoAUXILIARYo1012040705_value = null;
public Object oSoAUXILIARYo1012040706_value = null;
public Object oSoAUXILIARYo1012040707_value = null;
public Object oSoAUXILIARYo939278427_value = null;
public Object oSoAUXILIARYo939278428_value = null;
public Object oSoAUXILIARYo939278429_value = null;
public Object oSoAUXILIARYo939278430_value = null;
public Object oSoAUXILIARYo1012040708_value = null;
public Object oSoAUXILIARYoM1929616895_value = null;
public Object oSoAUXILIARYoM1929616894_value = null;
public Object oSoAUXILIARYoM576307198_value = null;
public Object oSoAUXILIARYoM576307197_value = null;
public Object oSoAUXILIARYoM576307196_value = null;
public Object oSoAUXILIARYoM486417828_value = null;
public Object oSoAUXILIARYoM576307195_value = null;
public Object oSoAUXILIARYo777002499_value = null;
public Object oSoAUXILIARYo777002500_value = null;
public Object oSoAUXILIARYo271562844_value = null;
public Object oSoAUXILIARYo271562845_value = null;
public Object oSoAUXILIARYo777002501_value = null;
public Object oSoAUXILIARYo2130312196_value = null;
public Object oSoAUXILIARYo2130312197_value = null;
public Object oSoAUXILIARYo2130312198_value = null;
public Object oSoAUXILIARYoM558804386_value = null;
public Object oSoAUXILIARYoM558804385_value = null;
public Object oSoAUXILIARYo2130312199_value = null;
public Object oSoAUXILIARYoM811345403_value = null;
public Object oSoAUXILIARYoM811345402_value = null;
public Object oSoAUXILIARYoM402264189_value = null;
public Object oSoAUXILIARYoM402264188_value = null;
public Object oSoAUXILIARYoM402264187_value = null;
public Object oSoAUXILIARYoM402264186_value = null;
public Object oSoAUXILIARYo1684424158_value = null;
public Object oSoAUXILIARYo1684424159_value = null;
public Object oSoAUXILIARYo1684424160_value = null;
public Object oSoAUXILIARYo1684424161_value = null;
public Object oSoAUXILIARYoM402264185_value = null;
public Object oSoAUXILIARYoM402264184_value = null;
public Object oSoAUXILIARYo96076256_value = null;
public Object oSoAUXILIARYo96076257_value = null;
public Object oSoAUXILIARYo96076258_value = null;
public Object oSoAUXILIARYoM402264183_value = null;
public Object oSoAUXILIARYo951045508_value = null;
public Object oSoAUXILIARYo951045509_value = null;
public Object oSoAUXILIARYoM1990612091_value = null;
public Object oSoAUXILIARYoM1990612090_value = null;
public Object oSoAUXILIARYoM1990612089_value = null;
public Object oSoAUXILIARYo258727903_value = null;
public Object oSoAUXILIARYoM1990612088_value = null;
public Object oSoAUXILIARYoM637302394_value = null;
public Object oSoAUXILIARYoM637302393_value = null;
public Object oSoAUXILIARYo1016708575_value = null;
public Object oSoAUXILIARYo1016708576_value = null;
public Object oSoAUXILIARYoM637302392_value = null;
public Object oSoAUXILIARYo716007303_value = null;
public Object oSoAUXILIARYo716007304_value = null;
public Object oSoAUXILIARYo716007305_value = null;
public Object oSoAUXILIARYo186341345_value = null;
public Object oSoAUXILIARYo186341346_value = null;
public Object oSoAUXILIARYo716007306_value = null;
public Object oSoAUXILIARYo2069317000_value = null;
public Object oSoAUXILIARYo2069317001_value = null;
public Object oSoAUXILIARYoM872340599_value = null;
public Object oSoAUXILIARYo480969098_value = null;
public Object oSoAUXILIARYo480969099_value = null;
public Object oSoAUXILIARYo1834278795_value = null;
public Object oSoAUXILIARYo1834278796_value = null;
public Object oSoAUXILIARYo1834278797_value = null;
public Object oSoAUXILIARYo41568229_value = null;
public Object oSoAUXILIARYo1834278798_value = null;
public Object oSoAUXILIARYoM1107378804_value = null;
public Object oSoAUXILIARYoM1107378803_value = null;
public Object oSoAUXILIARYo799548901_value = null;
public Object oSoAUXILIARYo799548902_value = null;
public Object oSoAUXILIARYoM1107378802_value = null;
public Object oSoAUXILIARYoM1399336542_value = null;
public Object oSoAUXILIARYoM1399336541_value = null;
public Object oSoAUXILIARYoM1399336540_value = null;
public Object oSoAUXILIARYo1356606460_value = null;
public Object oSoAUXILIARYo1356606461_value = null;
public Object oSoAUXILIARYoM1399336539_value = null;
public int I_prio = -1;
public int L_prio = -1;
public int O_prio = -1;
public int oSYNCCHARTSoAUXTRANSo860837186_prio = -1;
public int oSYNCCHARTSoAUXTRANSo860837187_prio = -1;
public int oSYNCCHARTSoAUXTRANSo793830433_prio = -1;
public int oSYNCCHARTSoAUXSTATEo733279297_prio = -1;
public int oSYNCCHARTSoAUXSTATEo733279298_prio = -1;
public int oSYNCCHARTSoAUXSTATEo733279299_prio = -1;
public int oSoAUXILIARYoM106230788_prio = -1;
public int oSoAUXILIARYoM106230787_prio = -1;
public int oSoAUXILIARYo1247078909_prio = -1;
public int oSoAUXILIARYoM1694578690_prio = -1;
public int oSoAUXILIARYoM1694578689_prio = -1;
public int oSoAUXILIARYoM341268993_prio = -1;
public int oSoAUXILIARYoM341268992_prio = -1;
public int oSoAUXILIARYo416335960_prio = -1;
public int oSoAUXILIARYo416335961_prio = -1;
public int oSoAUXILIARYo416335962_prio = -1;
public int oSoAUXILIARYo416335963_prio = -1;
public int oSoAUXILIARYoM341268991_prio = -1;
public int oSoAUXILIARYo1012040704_prio = -1;
public int oSoAUXILIARYo1012040705_prio = -1;
public int oSoAUXILIARYo1012040706_prio = -1;
public int oSoAUXILIARYo1012040707_prio = -1;
public int oSoAUXILIARYo939278427_prio = -1;
public int oSoAUXILIARYo939278428_prio = -1;
public int oSoAUXILIARYo939278429_prio = -1;
public int oSoAUXILIARYo939278430_prio = -1;
public int oSoAUXILIARYo1012040708_prio = -1;
public int oSoAUXILIARYoM1929616895_prio = -1;
public int oSoAUXILIARYoM1929616894_prio = -1;
public int oSoAUXILIARYoM576307198_prio = -1;
public int oSoAUXILIARYoM576307197_prio = -1;
public int oSoAUXILIARYoM576307196_prio = -1;
public int oSoAUXILIARYoM486417828_prio = -1;
public int oSoAUXILIARYoM576307195_prio = -1;
public int oSoAUXILIARYo777002499_prio = -1;
public int oSoAUXILIARYo777002500_prio = -1;
public int oSoAUXILIARYo271562844_prio = -1;
public int oSoAUXILIARYo271562845_prio = -1;
public int oSoAUXILIARYo777002501_prio = -1;
public int oSoAUXILIARYo2130312196_prio = -1;
public int oSoAUXILIARYo2130312197_prio = -1;
public int oSoAUXILIARYo2130312198_prio = -1;
public int oSoAUXILIARYoM558804386_prio = -1;
public int oSoAUXILIARYoM558804385_prio = -1;
public int oSoAUXILIARYo2130312199_prio = -1;
public int oSoAUXILIARYoM811345403_prio = -1;
public int oSoAUXILIARYoM811345402_prio = -1;
public int oSoAUXILIARYoM402264189_prio = -1;
public int oSoAUXILIARYoM402264188_prio = -1;
public int oSoAUXILIARYoM402264187_prio = -1;
public int oSoAUXILIARYoM402264186_prio = -1;
public int oSoAUXILIARYo1684424158_prio = -1;
public int oSoAUXILIARYo1684424159_prio = -1;
public int oSoAUXILIARYo1684424160_prio = -1;
public int oSoAUXILIARYo1684424161_prio = -1;
public int oSoAUXILIARYoM402264185_prio = -1;
public int oSoAUXILIARYoM402264184_prio = -1;
public int oSoAUXILIARYo96076256_prio = -1;
public int oSoAUXILIARYo96076257_prio = -1;
public int oSoAUXILIARYo96076258_prio = -1;
public int oSoAUXILIARYoM402264183_prio = -1;
public int oSoAUXILIARYo951045508_prio = -1;
public int oSoAUXILIARYo951045509_prio = -1;
public int oSoAUXILIARYoM1990612091_prio = -1;
public int oSoAUXILIARYoM1990612090_prio = -1;
public int oSoAUXILIARYoM1990612089_prio = -1;
public int oSoAUXILIARYo258727903_prio = -1;
public int oSoAUXILIARYoM1990612088_prio = -1;
public int oSoAUXILIARYoM637302394_prio = -1;
public int oSoAUXILIARYoM637302393_prio = -1;
public int oSoAUXILIARYo1016708575_prio = -1;
public int oSoAUXILIARYo1016708576_prio = -1;
public int oSoAUXILIARYoM637302392_prio = -1;
public int oSoAUXILIARYo716007303_prio = -1;
public int oSoAUXILIARYo716007304_prio = -1;
public int oSoAUXILIARYo716007305_prio = -1;
public int oSoAUXILIARYo186341345_prio = -1;
public int oSoAUXILIARYo186341346_prio = -1;
public int oSoAUXILIARYo716007306_prio = -1;
public int oSoAUXILIARYo2069317000_prio = -1;
public int oSoAUXILIARYo2069317001_prio = -1;
public int oSoAUXILIARYoM872340599_prio = -1;
public int oSoAUXILIARYo480969098_prio = -1;
public int oSoAUXILIARYo480969099_prio = -1;
public int oSoAUXILIARYo1834278795_prio = -1;
public int oSoAUXILIARYo1834278796_prio = -1;
public int oSoAUXILIARYo1834278797_prio = -1;
public int oSoAUXILIARYo41568229_prio = -1;
public int oSoAUXILIARYo1834278798_prio = -1;
public int oSoAUXILIARYoM1107378804_prio = -1;
public int oSoAUXILIARYoM1107378803_prio = -1;
public int oSoAUXILIARYo799548901_prio = -1;
public int oSoAUXILIARYo799548902_prio = -1;
public int oSoAUXILIARYoM1107378802_prio = -1;
public int oSoAUXILIARYoM1399336542_prio = -1;
public int oSoAUXILIARYoM1399336541_prio = -1;
public int oSoAUXILIARYoM1399336540_prio = -1;
public int oSoAUXILIARYo1356606460_prio = -1;
public int oSoAUXILIARYo1356606461_prio = -1;
public int oSoAUXILIARYoM1399336539_prio = -1;
int order = 0;
public int I_order = -1;
public int L_order = -1;
public int O_order = -1;
public int oSYNCCHARTSoAUXTRANSo860837186_order = -1;
public int oSYNCCHARTSoAUXTRANSo860837187_order = -1;
public int oSYNCCHARTSoAUXTRANSo793830433_order = -1;
public int oSYNCCHARTSoAUXSTATEo733279297_order = -1;
public int oSYNCCHARTSoAUXSTATEo733279298_order = -1;
public int oSYNCCHARTSoAUXSTATEo733279299_order = -1;
public int oSoAUXILIARYoM106230788_order = -1;
public int oSoAUXILIARYoM106230787_order = -1;
public int oSoAUXILIARYo1247078909_order = -1;
public int oSoAUXILIARYoM1694578690_order = -1;
public int oSoAUXILIARYoM1694578689_order = -1;
public int oSoAUXILIARYoM341268993_order = -1;
public int oSoAUXILIARYoM341268992_order = -1;
public int oSoAUXILIARYo416335960_order = -1;
public int oSoAUXILIARYo416335961_order = -1;
public int oSoAUXILIARYo416335962_order = -1;
public int oSoAUXILIARYo416335963_order = -1;
public int oSoAUXILIARYoM341268991_order = -1;
public int oSoAUXILIARYo1012040704_order = -1;
public int oSoAUXILIARYo1012040705_order = -1;
public int oSoAUXILIARYo1012040706_order = -1;
public int oSoAUXILIARYo1012040707_order = -1;
public int oSoAUXILIARYo939278427_order = -1;
public int oSoAUXILIARYo939278428_order = -1;
public int oSoAUXILIARYo939278429_order = -1;
public int oSoAUXILIARYo939278430_order = -1;
public int oSoAUXILIARYo1012040708_order = -1;
public int oSoAUXILIARYoM1929616895_order = -1;
public int oSoAUXILIARYoM1929616894_order = -1;
public int oSoAUXILIARYoM576307198_order = -1;
public int oSoAUXILIARYoM576307197_order = -1;
public int oSoAUXILIARYoM576307196_order = -1;
public int oSoAUXILIARYoM486417828_order = -1;
public int oSoAUXILIARYoM576307195_order = -1;
public int oSoAUXILIARYo777002499_order = -1;
public int oSoAUXILIARYo777002500_order = -1;
public int oSoAUXILIARYo271562844_order = -1;
public int oSoAUXILIARYo271562845_order = -1;
public int oSoAUXILIARYo777002501_order = -1;
public int oSoAUXILIARYo2130312196_order = -1;
public int oSoAUXILIARYo2130312197_order = -1;
public int oSoAUXILIARYo2130312198_order = -1;
public int oSoAUXILIARYoM558804386_order = -1;
public int oSoAUXILIARYoM558804385_order = -1;
public int oSoAUXILIARYo2130312199_order = -1;
public int oSoAUXILIARYoM811345403_order = -1;
public int oSoAUXILIARYoM811345402_order = -1;
public int oSoAUXILIARYoM402264189_order = -1;
public int oSoAUXILIARYoM402264188_order = -1;
public int oSoAUXILIARYoM402264187_order = -1;
public int oSoAUXILIARYoM402264186_order = -1;
public int oSoAUXILIARYo1684424158_order = -1;
public int oSoAUXILIARYo1684424159_order = -1;
public int oSoAUXILIARYo1684424160_order = -1;
public int oSoAUXILIARYo1684424161_order = -1;
public int oSoAUXILIARYoM402264185_order = -1;
public int oSoAUXILIARYoM402264184_order = -1;
public int oSoAUXILIARYo96076256_order = -1;
public int oSoAUXILIARYo96076257_order = -1;
public int oSoAUXILIARYo96076258_order = -1;
public int oSoAUXILIARYoM402264183_order = -1;
public int oSoAUXILIARYo951045508_order = -1;
public int oSoAUXILIARYo951045509_order = -1;
public int oSoAUXILIARYoM1990612091_order = -1;
public int oSoAUXILIARYoM1990612090_order = -1;
public int oSoAUXILIARYoM1990612089_order = -1;
public int oSoAUXILIARYo258727903_order = -1;
public int oSoAUXILIARYoM1990612088_order = -1;
public int oSoAUXILIARYoM637302394_order = -1;
public int oSoAUXILIARYoM637302393_order = -1;
public int oSoAUXILIARYo1016708575_order = -1;
public int oSoAUXILIARYo1016708576_order = -1;
public int oSoAUXILIARYoM637302392_order = -1;
public int oSoAUXILIARYo716007303_order = -1;
public int oSoAUXILIARYo716007304_order = -1;
public int oSoAUXILIARYo716007305_order = -1;
public int oSoAUXILIARYo186341345_order = -1;
public int oSoAUXILIARYo186341346_order = -1;
public int oSoAUXILIARYo716007306_order = -1;
public int oSoAUXILIARYo2069317000_order = -1;
public int oSoAUXILIARYo2069317001_order = -1;
public int oSoAUXILIARYoM872340599_order = -1;
public int oSoAUXILIARYo480969098_order = -1;
public int oSoAUXILIARYo480969099_order = -1;
public int oSoAUXILIARYo1834278795_order = -1;
public int oSoAUXILIARYo1834278796_order = -1;
public int oSoAUXILIARYo1834278797_order = -1;
public int oSoAUXILIARYo41568229_order = -1;
public int oSoAUXILIARYo1834278798_order = -1;
public int oSoAUXILIARYoM1107378804_order = -1;
public int oSoAUXILIARYoM1107378803_order = -1;
public int oSoAUXILIARYo799548901_order = -1;
public int oSoAUXILIARYo799548902_order = -1;
public int oSoAUXILIARYoM1107378802_order = -1;
public int oSoAUXILIARYoM1399336542_order = -1;
public int oSoAUXILIARYoM1399336541_order = -1;
public int oSoAUXILIARYoM1399336540_order = -1;
public int oSoAUXILIARYo1356606460_order = -1;
public int oSoAUXILIARYo1356606461_order = -1;
public int oSoAUXILIARYoM1399336539_order = -1;

public CausalSCADEExample2() {
        super(L_root_surface, 15, 15);
    }
    


public void resetInputSignals() {    
I = false;
}

public void resetOutputSignals() {    
O = false;
oSYNCCHARTSoAUXTRANSo860837186 = false;
oSYNCCHARTSoAUXTRANSo860837187 = false;
oSYNCCHARTSoAUXTRANSo793830433 = false;
oSYNCCHARTSoAUXSTATEo733279297 = false;
oSYNCCHARTSoAUXSTATEo733279298 = false;
oSYNCCHARTSoAUXSTATEo733279299 = false;
oSoAUXILIARYoM106230788 = false;
oSoAUXILIARYoM106230787 = false;
oSoAUXILIARYo1247078909 = false;
oSoAUXILIARYoM1694578690 = false;
oSoAUXILIARYoM1694578689 = false;
oSoAUXILIARYoM341268993 = false;
oSoAUXILIARYoM341268992 = false;
oSoAUXILIARYo416335960 = false;
oSoAUXILIARYo416335961 = false;
oSoAUXILIARYo416335962 = false;
oSoAUXILIARYo416335963 = false;
oSoAUXILIARYoM341268991 = false;
oSoAUXILIARYo1012040704 = false;
oSoAUXILIARYo1012040705 = false;
oSoAUXILIARYo1012040706 = false;
oSoAUXILIARYo1012040707 = false;
oSoAUXILIARYo939278427 = false;
oSoAUXILIARYo939278428 = false;
oSoAUXILIARYo939278429 = false;
oSoAUXILIARYo939278430 = false;
oSoAUXILIARYo1012040708 = false;
oSoAUXILIARYoM1929616895 = false;
oSoAUXILIARYoM1929616894 = false;
oSoAUXILIARYoM576307198 = false;
oSoAUXILIARYoM576307197 = false;
oSoAUXILIARYoM576307196 = false;
oSoAUXILIARYoM486417828 = false;
oSoAUXILIARYoM576307195 = false;
oSoAUXILIARYo777002499 = false;
oSoAUXILIARYo777002500 = false;
oSoAUXILIARYo271562844 = false;
oSoAUXILIARYo271562845 = false;
oSoAUXILIARYo777002501 = false;
oSoAUXILIARYo2130312196 = false;
oSoAUXILIARYo2130312197 = false;
oSoAUXILIARYo2130312198 = false;
oSoAUXILIARYoM558804386 = false;
oSoAUXILIARYoM558804385 = false;
oSoAUXILIARYo2130312199 = false;
oSoAUXILIARYoM811345403 = false;
oSoAUXILIARYoM811345402 = false;
oSoAUXILIARYoM402264189 = false;
oSoAUXILIARYoM402264188 = false;
oSoAUXILIARYoM402264187 = false;
oSoAUXILIARYoM402264186 = false;
oSoAUXILIARYo1684424158 = false;
oSoAUXILIARYo1684424159 = false;
oSoAUXILIARYo1684424160 = false;
oSoAUXILIARYo1684424161 = false;
oSoAUXILIARYoM402264185 = false;
oSoAUXILIARYoM402264184 = false;
oSoAUXILIARYo96076256 = false;
oSoAUXILIARYo96076257 = false;
oSoAUXILIARYo96076258 = false;
oSoAUXILIARYoM402264183 = false;
oSoAUXILIARYo951045508 = false;
oSoAUXILIARYo951045509 = false;
oSoAUXILIARYoM1990612091 = false;
oSoAUXILIARYoM1990612090 = false;
oSoAUXILIARYoM1990612089 = false;
oSoAUXILIARYo258727903 = false;
oSoAUXILIARYoM1990612088 = false;
oSoAUXILIARYoM637302394 = false;
oSoAUXILIARYoM637302393 = false;
oSoAUXILIARYo1016708575 = false;
oSoAUXILIARYo1016708576 = false;
oSoAUXILIARYoM637302392 = false;
oSoAUXILIARYo716007303 = false;
oSoAUXILIARYo716007304 = false;
oSoAUXILIARYo716007305 = false;
oSoAUXILIARYo186341345 = false;
oSoAUXILIARYo186341346 = false;
oSoAUXILIARYo716007306 = false;
oSoAUXILIARYo2069317000 = false;
oSoAUXILIARYo2069317001 = false;
oSoAUXILIARYoM872340599 = false;
oSoAUXILIARYo480969098 = false;
oSoAUXILIARYo480969099 = false;
oSoAUXILIARYo1834278795 = false;
oSoAUXILIARYo1834278796 = false;
oSoAUXILIARYo1834278797 = false;
oSoAUXILIARYo41568229 = false;
oSoAUXILIARYo1834278798 = false;
oSoAUXILIARYoM1107378804 = false;
oSoAUXILIARYoM1107378803 = false;
oSoAUXILIARYo799548901 = false;
oSoAUXILIARYo799548902 = false;
oSoAUXILIARYoM1107378802 = false;
oSoAUXILIARYoM1399336542 = false;
oSoAUXILIARYoM1399336541 = false;
oSoAUXILIARYoM1399336540 = false;
oSoAUXILIARYo1356606460 = false;
oSoAUXILIARYo1356606461 = false;
oSoAUXILIARYoM1399336539 = false;
}


   @Override
    protected final void tick() {
        while (!isTickDone()) {
            switch (state()) {
                
             case L_root_surface:  
                  oSoAUXILIARYoM106230788 = true;          
                                oSoAUXILIARYoM106230788_prio = currentPrio();
                                oSoAUXILIARYoM106230788_order = order++;
                             fork(L__A_surface,11);
                             oSoAUXILIARYoM106230787 = true;          
                                oSoAUXILIARYoM106230787_prio = currentPrio();
                                oSoAUXILIARYoM106230787_order = order++;
                                       gotoB(L_root_depth);
                  break;
             case L_root_depth:  
                  oSoAUXILIARYo1247078909 = true;          
                                oSoAUXILIARYo1247078909_prio = currentPrio();
                                oSoAUXILIARYo1247078909_order = order++;
                             haltB();
                  break;
             case L__B_surface:  
                  oSoAUXILIARYoM1694578690 = true;          
                                oSoAUXILIARYoM1694578690_prio = currentPrio();
                                oSoAUXILIARYoM1694578690_order = order++;
                             fork(L__B_During1Internal2991163_surface,12);
                             oSoAUXILIARYoM1694578689 = true;          
                                oSoAUXILIARYoM1694578689_prio = currentPrio();
                                oSoAUXILIARYoM1694578689_order = order++;
                                       gotoB(L__B_surface2);
                  break;
             case L__B_surface2:  
                  oSoAUXILIARYoM341268993 = true;          
                                oSoAUXILIARYoM341268993_prio = currentPrio();
                                oSoAUXILIARYoM341268993_order = order++;
                             prioB(5, L__B_surface2M341268992);
                  break;
             case L__B_surface2M341268992:  
                  oSoAUXILIARYoM341268992 = true;          
                                oSoAUXILIARYoM341268992_prio = currentPrio();
                                oSoAUXILIARYoM341268992_order = order++;
                             if (true) { 
                             oSoAUXILIARYo416335960 = true;          
                                           oSoAUXILIARYo416335960_prio = currentPrio();
                                           oSoAUXILIARYo416335960_order = order++;
                             L = true;          
                                           L_prio = currentPrio();
                                           L_order = order++;
                             oSoAUXILIARYo416335961 = true;          
                                           oSoAUXILIARYo416335961_prio = currentPrio();
                                           oSoAUXILIARYo416335961_order = order++;
                             oSYNCCHARTSoAUXTRANSo793830433 = true;          
                                           oSYNCCHARTSoAUXTRANSo793830433_prio = currentPrio();
                                           oSYNCCHARTSoAUXTRANSo793830433_order = order++;
                             oSoAUXILIARYo416335962 = true;          
                                           oSoAUXILIARYo416335962_prio = currentPrio();
                                           oSoAUXILIARYo416335962_order = order++;
                                           System.out.println("LBsurface active thread before abort(): " + super.getCurrentThread().toString());
                             abort();
                             System.out.println("LBsurface active thread before abort(): " + super.getCurrentThread().toString());
                             oSoAUXILIARYo416335963 = true;          
                                           oSoAUXILIARYo416335963_prio = currentPrio();
                                           oSoAUXILIARYo416335963_order = order++;
                             gotoB(L__C_surface);
                             break;
                           }
                             oSoAUXILIARYoM341268991 = true;          
                                oSoAUXILIARYoM341268991_prio = currentPrio();
                                oSoAUXILIARYoM341268991_order = order++;
                             gotoB(L__B_depth);
                  break;
             case L__B_depth:  
                  oSoAUXILIARYo1012040704 = true;          
                                oSoAUXILIARYo1012040704_prio = currentPrio();
                                oSoAUXILIARYo1012040704_order = order++;
                             prioB(14, L__B_depth1012040705);
                  break;
             case L__B_depth1012040705:  
                  oSoAUXILIARYo1012040705 = true;          
                                oSoAUXILIARYo1012040705_prio = currentPrio();
                                oSoAUXILIARYo1012040705_order = order++;
                             pauseB(L__B_depth10120407051012040707);
                  break;
             case L__B_depth10120407051012040707:  
                  oSoAUXILIARYo1012040706 = true;          
                                oSoAUXILIARYo1012040706_prio = currentPrio();
                                oSoAUXILIARYo1012040706_order = order++;
                             prioB(5, L__B_depth101204070510120407071012040709);
                  break;
             case L__B_depth101204070510120407071012040709:  
                  oSoAUXILIARYo1012040707 = true;          
                                oSoAUXILIARYo1012040707_prio = currentPrio();
                                oSoAUXILIARYo1012040707_order = order++;
                             if (true) { 
                             oSoAUXILIARYo939278427 = true;          
                                           oSoAUXILIARYo939278427_prio = currentPrio();
                                           oSoAUXILIARYo939278427_order = order++;
                             L = true;          
                                           L_prio = currentPrio();
                                           L_order = order++;
                             oSoAUXILIARYo939278428 = true;          
                                           oSoAUXILIARYo939278428_prio = currentPrio();
                                           oSoAUXILIARYo939278428_order = order++;
                             oSYNCCHARTSoAUXTRANSo793830433 = true;          
                                           oSYNCCHARTSoAUXTRANSo793830433_prio = currentPrio();
                                           oSYNCCHARTSoAUXTRANSo793830433_order = order++;
                             oSoAUXILIARYo939278429 = true;          
                                           oSoAUXILIARYo939278429_prio = currentPrio();
                                           oSoAUXILIARYo939278429_order = order++;
                                           System.out.println("LBdepth active thread before abort(): " + super.getCurrentThread().toString());
                             abort();
                                         System.out.println("LBdepth active thread before abort(): " + super.getCurrentThread().toString());
                             oSoAUXILIARYo939278430 = true;          
                                           oSoAUXILIARYo939278430_prio = currentPrio();
                                           oSoAUXILIARYo939278430_order = order++;
                             gotoB(L__C_surface);
                             break;
                           }
                             oSoAUXILIARYo1012040708 = true;          
                                oSoAUXILIARYo1012040708_prio = currentPrio();
                                oSoAUXILIARYo1012040708_order = order++;
                             gotoB(L__B_depth);
                  break;
             case L__B_During2Internal2991163_surface:  
                  oSoAUXILIARYoM1929616895 = true;          
                                oSoAUXILIARYoM1929616895_prio = currentPrio();
                                oSoAUXILIARYoM1929616895_order = order++;
                             prioB(13, L__B_During2Internal2991163_surfaceM1929616894);
                  break;
             case L__B_During2Internal2991163_surfaceM1929616894:  
                  oSoAUXILIARYoM1929616894 = true;          
                                oSoAUXILIARYoM1929616894_prio = currentPrio();
                                oSoAUXILIARYoM1929616894_order = order++;
                             gotoB(L__B_During2Internal2991163_depth);
                  break;
             case L__B_During2Internal2991163_depth:  
                  oSoAUXILIARYoM576307198 = true;          
                                oSoAUXILIARYoM576307198_prio = currentPrio();
                                oSoAUXILIARYoM576307198_order = order++;
                             prioB(13, L__B_During2Internal2991163_depthM576307197);
                  break;
             case L__B_During2Internal2991163_depthM576307197:  
                  oSoAUXILIARYoM576307197 = true;          
                                oSoAUXILIARYoM576307197_prio = currentPrio();
                                oSoAUXILIARYoM576307197_order = order++;
                             pauseB(L__B_During2Internal2991163_depthM576307197M576307195);
                  break;
             case L__B_During2Internal2991163_depthM576307197M576307195:  
                  oSoAUXILIARYoM576307196 = true;          
                                oSoAUXILIARYoM576307196_prio = currentPrio();
                                oSoAUXILIARYoM576307196_order = order++;
                             if (true) { 
                             oSoAUXILIARYoM486417828 = true;          
                                           oSoAUXILIARYoM486417828_prio = currentPrio();
                                           oSoAUXILIARYoM486417828_order = order++;
                             gotoB(L__B_During1Internal2991163_surface);
                             break;
                           }
                             oSoAUXILIARYoM576307195 = true;          
                                oSoAUXILIARYoM576307195_prio = currentPrio();
                                oSoAUXILIARYoM576307195_order = order++;
                             gotoB(L__B_During2Internal2991163_depth);
                  break;
             case L__B_During1Internal2991163_surface:  
                  oSoAUXILIARYo777002499 = true;          
                                oSoAUXILIARYo777002499_prio = currentPrio();
                                oSoAUXILIARYo777002499_order = order++;
                             prioB(12, L__B_During1Internal2991163_surface777002500);
                  break;
             case L__B_During1Internal2991163_surface777002500:  
                  oSoAUXILIARYo777002500 = true;          
                                oSoAUXILIARYo777002500_prio = currentPrio();
                                oSoAUXILIARYo777002500_order = order++;
                             if (true) { 
                             oSoAUXILIARYo271562844 = true;          
                                           oSoAUXILIARYo271562844_prio = currentPrio();
                                           oSoAUXILIARYo271562844_order = order++;
                             oSYNCCHARTSoAUXSTATEo733279298 = true;          
                                           oSYNCCHARTSoAUXSTATEo733279298_prio = currentPrio();
                                           oSYNCCHARTSoAUXSTATEo733279298_order = order++;
                             oSoAUXILIARYo271562845 = true;          
                                           oSoAUXILIARYo271562845_prio = currentPrio();
                                           oSoAUXILIARYo271562845_order = order++;
                             gotoB(L__B_During2Internal2991163_surface);
                             break;
                           }
                             oSoAUXILIARYo777002501 = true;          
                                oSoAUXILIARYo777002501_prio = currentPrio();
                                oSoAUXILIARYo777002501_order = order++;
                             gotoB(L__B_During1Internal2991163_depth);
                  break;
             case L__B_During1Internal2991163_depth:  
                  oSoAUXILIARYo2130312196 = true;          
                                oSoAUXILIARYo2130312196_prio = currentPrio();
                                oSoAUXILIARYo2130312196_order = order++;
                             prioB(12, L__B_During1Internal2991163_depth2130312197);
                  break;
             case L__B_During1Internal2991163_depth2130312197:  
                  oSoAUXILIARYo2130312197 = true;          
                                oSoAUXILIARYo2130312197_prio = currentPrio();
                                oSoAUXILIARYo2130312197_order = order++;
                             pauseB(L__B_During1Internal2991163_depth21303121972130312199);
                  break;
             case L__B_During1Internal2991163_depth21303121972130312199:  
                  oSoAUXILIARYo2130312198 = true;          
                                oSoAUXILIARYo2130312198_prio = currentPrio();
                                oSoAUXILIARYo2130312198_order = order++;
                             if (true) { 
                             oSoAUXILIARYoM558804386 = true;          
                                           oSoAUXILIARYoM558804386_prio = currentPrio();
                                           oSoAUXILIARYoM558804386_order = order++;
                             oSYNCCHARTSoAUXSTATEo733279298 = true;          
                                           oSYNCCHARTSoAUXSTATEo733279298_prio = currentPrio();
                                           oSYNCCHARTSoAUXSTATEo733279298_order = order++;
                             oSoAUXILIARYoM558804385 = true;          
                                           oSoAUXILIARYoM558804385_prio = currentPrio();
                                           oSoAUXILIARYoM558804385_order = order++;
                             gotoB(L__B_During2Internal2991163_surface);
                             break;
                           }
                             oSoAUXILIARYo2130312199 = true;          
                                oSoAUXILIARYo2130312199_prio = currentPrio();
                                oSoAUXILIARYo2130312199_order = order++;
                             gotoB(L__B_During1Internal2991163_depth);
                  break;
             case L__A_surface:  
                  oSoAUXILIARYoM811345403 = true;          
                                oSoAUXILIARYoM811345403_prio = currentPrio();
                                oSoAUXILIARYoM811345403_order = order++;
                             fork(L__A_During1Internal16381711_surface,8);
                             oSoAUXILIARYoM811345402 = true;          
                                oSoAUXILIARYoM811345402_prio = currentPrio();
                                oSoAUXILIARYoM811345402_order = order++;
                                       gotoB(L__A_depth);
                  break;
             case L__A_depth:  
                  oSoAUXILIARYoM402264189 = true;          
                                oSoAUXILIARYoM402264189_prio = currentPrio();
                                oSoAUXILIARYoM402264189_order = order++;
                             prioB(11, L__A_depthM402264188);
                  break;
             case L__A_depthM402264188:  
                  oSoAUXILIARYoM402264188 = true;          
                                oSoAUXILIARYoM402264188_prio = currentPrio();
                                oSoAUXILIARYoM402264188_order = order++;
                             pauseB(L__A_depthM402264188M402264186);
                  break;
             case L__A_depthM402264188M402264186:  
                  oSoAUXILIARYoM402264187 = true;          
                                oSoAUXILIARYoM402264187_prio = currentPrio();
                                oSoAUXILIARYoM402264187_order = order++;
                             prioB(7, L__A_depthM402264188M402264186M402264184);
                  break;
             case L__A_depthM402264188M402264186M402264184:  
                  oSoAUXILIARYoM402264186 = true;          
                                oSoAUXILIARYoM402264186_prio = currentPrio();
                                oSoAUXILIARYoM402264186_order = order++;
                             if ((
                  I && 
                  L
                          )
                  ) { 
                             oSoAUXILIARYo1684424158 = true;          
                                           oSoAUXILIARYo1684424158_prio = currentPrio();
                                           oSoAUXILIARYo1684424158_order = order++;
                             O = true;          
                                           O_prio = currentPrio();
                                           O_order = order++;
                             oSoAUXILIARYo1684424159 = true;          
                                           oSoAUXILIARYo1684424159_prio = currentPrio();
                                           oSoAUXILIARYo1684424159_order = order++;
                             oSYNCCHARTSoAUXTRANSo860837186 = true;          
                                           oSYNCCHARTSoAUXTRANSo860837186_prio = currentPrio();
                                           oSYNCCHARTSoAUXTRANSo860837186_order = order++;
                             oSoAUXILIARYo1684424160 = true;          
                                           oSoAUXILIARYo1684424160_prio = currentPrio();
                                           oSoAUXILIARYo1684424160_order = order++;
                             abort();
                             oSoAUXILIARYo1684424161 = true;          
                                           oSoAUXILIARYo1684424161_prio = currentPrio();
                                           oSoAUXILIARYo1684424161_order = order++;
                             gotoB(L__B_surface);
                             break;
                           }
                             oSoAUXILIARYoM402264185 = true;          
                                oSoAUXILIARYoM402264185_prio = currentPrio();
                                oSoAUXILIARYoM402264185_order = order++;
                             prioB(6, L__A_depthM402264188M402264186M402264184M402264180);
                  break;
             case L__A_depthM402264188M402264186M402264184M402264180:  
                  oSoAUXILIARYoM402264184 = true;          
                                oSoAUXILIARYoM402264184_prio = currentPrio();
                                oSoAUXILIARYoM402264184_order = order++;
                             if ((
                  I && 
                  (!(L))
                          )
                  ) { 
                             oSoAUXILIARYo96076256 = true;          
                                           oSoAUXILIARYo96076256_prio = currentPrio();
                                           oSoAUXILIARYo96076256_order = order++;
                             oSYNCCHARTSoAUXTRANSo860837187 = true;          
                                           oSYNCCHARTSoAUXTRANSo860837187_prio = currentPrio();
                                           oSYNCCHARTSoAUXTRANSo860837187_order = order++;
                             oSoAUXILIARYo96076257 = true;          
                                           oSoAUXILIARYo96076257_prio = currentPrio();
                                           oSoAUXILIARYo96076257_order = order++;
                                           
                                           System.out.println("active thread before abort(): " + super.getCurrentThread().toString());

                             abort();
                                             System.out.println("active thread after abort(): " + super.getCurrentThread().toString());
                             
                             oSoAUXILIARYo96076258 = true;          
                                           oSoAUXILIARYo96076258_prio = currentPrio();
                                           oSoAUXILIARYo96076258_order = order++;
                             gotoB(L__B_surface);
                             break;
                           }
                             oSoAUXILIARYoM402264183 = true;          
                                oSoAUXILIARYoM402264183_prio = currentPrio();
                                oSoAUXILIARYoM402264183_order = order++;
                             gotoB(L__A_depth);
                  break;
             case L__A_During2Internal16381711_surface:  
                  oSoAUXILIARYo951045508 = true;          
                                oSoAUXILIARYo951045508_prio = currentPrio();
                                oSoAUXILIARYo951045508_order = order++;
                             prioB(9, L__A_During2Internal16381711_surface951045509);
                  break;
             case L__A_During2Internal16381711_surface951045509:  
                  oSoAUXILIARYo951045509 = true;          
                                oSoAUXILIARYo951045509_prio = currentPrio();
                                oSoAUXILIARYo951045509_order = order++;
                             gotoB(L__A_During2Internal16381711_depth);
                  break;
             case L__A_During2Internal16381711_depth:  
                  oSoAUXILIARYoM1990612091 = true;          
                                oSoAUXILIARYoM1990612091_prio = currentPrio();
                                oSoAUXILIARYoM1990612091_order = order++;
                             prioB(9, L__A_During2Internal16381711_depthM1990612090);
                  break;
             case L__A_During2Internal16381711_depthM1990612090:  
                  oSoAUXILIARYoM1990612090 = true;          
                                oSoAUXILIARYoM1990612090_prio = currentPrio();
                                oSoAUXILIARYoM1990612090_order = order++;
                             pauseB(L__A_During2Internal16381711_depthM1990612090M1990612088);
                  break;
             case L__A_During2Internal16381711_depthM1990612090M1990612088:  
                  oSoAUXILIARYoM1990612089 = true;          
                                oSoAUXILIARYoM1990612089_prio = currentPrio();
                                oSoAUXILIARYoM1990612089_order = order++;
                             if (true) { 
                             oSoAUXILIARYo258727903 = true;          
                                           oSoAUXILIARYo258727903_prio = currentPrio();
                                           oSoAUXILIARYo258727903_order = order++;
                             gotoB(L__A_During1Internal16381711_surface);
                             break;
                           }
                             oSoAUXILIARYoM1990612088 = true;          
                                oSoAUXILIARYoM1990612088_prio = currentPrio();
                                oSoAUXILIARYoM1990612088_order = order++;
                             gotoB(L__A_During2Internal16381711_depth);
                  break;
             case L__A_During1Internal16381711_surface:  
                  oSoAUXILIARYoM637302394 = true;          
                                oSoAUXILIARYoM637302394_prio = currentPrio();
                                oSoAUXILIARYoM637302394_order = order++;
                             prioB(8, L__A_During1Internal16381711_surfaceM637302393);
                  break;
             case L__A_During1Internal16381711_surfaceM637302393:  
                  oSoAUXILIARYoM637302393 = true;          
                                oSoAUXILIARYoM637302393_prio = currentPrio();
                                oSoAUXILIARYoM637302393_order = order++;
                             if (true) { 
                             oSoAUXILIARYo1016708575 = true;          
                                           oSoAUXILIARYo1016708575_prio = currentPrio();
                                           oSoAUXILIARYo1016708575_order = order++;
                             oSYNCCHARTSoAUXSTATEo733279297 = true;          
                                           oSYNCCHARTSoAUXSTATEo733279297_prio = currentPrio();
                                           oSYNCCHARTSoAUXSTATEo733279297_order = order++;
                             oSoAUXILIARYo1016708576 = true;          
                                           oSoAUXILIARYo1016708576_prio = currentPrio();
                                           oSoAUXILIARYo1016708576_order = order++;
                             gotoB(L__A_During2Internal16381711_surface);
                             break;
                           }
                             oSoAUXILIARYoM637302392 = true;          
                                oSoAUXILIARYoM637302392_prio = currentPrio();
                                oSoAUXILIARYoM637302392_order = order++;
                             gotoB(L__A_During1Internal16381711_depth);
                  break;
             case L__A_During1Internal16381711_depth:  
                  oSoAUXILIARYo716007303 = true;          
                                oSoAUXILIARYo716007303_prio = currentPrio();
                                oSoAUXILIARYo716007303_order = order++;
                             prioB(8, L__A_During1Internal16381711_depth716007304);
                  break;
             case L__A_During1Internal16381711_depth716007304:  
                  oSoAUXILIARYo716007304 = true;          
                                oSoAUXILIARYo716007304_prio = currentPrio();
                                oSoAUXILIARYo716007304_order = order++;
                             pauseB(L__A_During1Internal16381711_depth716007304716007306);
                  break;
             case L__A_During1Internal16381711_depth716007304716007306:  
                  oSoAUXILIARYo716007305 = true;          
                                oSoAUXILIARYo716007305_prio = currentPrio();
                                oSoAUXILIARYo716007305_order = order++;
                             if (true) { 
                             oSoAUXILIARYo186341345 = true;          
                                           oSoAUXILIARYo186341345_prio = currentPrio();
                                           oSoAUXILIARYo186341345_order = order++;
                             oSYNCCHARTSoAUXSTATEo733279297 = true;          
                                           oSYNCCHARTSoAUXSTATEo733279297_prio = currentPrio();
                                           oSYNCCHARTSoAUXSTATEo733279297_order = order++;
                             oSoAUXILIARYo186341346 = true;          
                                           oSoAUXILIARYo186341346_prio = currentPrio();
                                           oSoAUXILIARYo186341346_order = order++;
                             gotoB(L__A_During2Internal16381711_surface);
                             break;
                           }
                             oSoAUXILIARYo716007306 = true;          
                                oSoAUXILIARYo716007306_prio = currentPrio();
                                oSoAUXILIARYo716007306_order = order++;
                             gotoB(L__A_During1Internal16381711_depth);
                  break;
             case L__C_surface:  
                  oSoAUXILIARYo2069317000 = true;          
                                oSoAUXILIARYo2069317000_prio = currentPrio();
                                oSoAUXILIARYo2069317000_order = order++;
                             fork(L__C_During1Internal1612182_surface,2);
                             oSoAUXILIARYo2069317001 = true;          
                                oSoAUXILIARYo2069317001_prio = currentPrio();
                                oSoAUXILIARYo2069317001_order = order++;
                                       gotoB(L__C_depth);
                  break;
             case L__C_depth:  
                  oSoAUXILIARYoM872340599 = true;          
                                oSoAUXILIARYoM872340599_prio = currentPrio();
                                oSoAUXILIARYoM872340599_order = order++;
                                System.out.println("LCdepth active thread before haltB(): " + super.getCurrentThread().toString());
                             haltB();
                             System.out.println("LCdepth active thread before haltB(): " + super.getCurrentThread().toString());
                  break;
             case L__C_During2Internal1612182_surface:  
                  oSoAUXILIARYo480969098 = true;          
                                oSoAUXILIARYo480969098_prio = currentPrio();
                                oSoAUXILIARYo480969098_order = order++;
                             prioB(3, L__C_During2Internal1612182_surface480969099);
                  break;
             case L__C_During2Internal1612182_surface480969099:  
                  oSoAUXILIARYo480969099 = true;          
                                oSoAUXILIARYo480969099_prio = currentPrio();
                                oSoAUXILIARYo480969099_order = order++;
                             gotoB(L__C_During2Internal1612182_depth);
                  break;
             case L__C_During2Internal1612182_depth:  
                  oSoAUXILIARYo1834278795 = true;          
                                oSoAUXILIARYo1834278795_prio = currentPrio();
                                oSoAUXILIARYo1834278795_order = order++;
                             prioB(3, L__C_During2Internal1612182_depth1834278796);
                  break;
             case L__C_During2Internal1612182_depth1834278796:  
                  oSoAUXILIARYo1834278796 = true;          
                                oSoAUXILIARYo1834278796_prio = currentPrio();
                                oSoAUXILIARYo1834278796_order = order++;
                             pauseB(L__C_During2Internal1612182_depth18342787961834278798);
                  break;
             case L__C_During2Internal1612182_depth18342787961834278798:  
                  oSoAUXILIARYo1834278797 = true;          
                                oSoAUXILIARYo1834278797_prio = currentPrio();
                                oSoAUXILIARYo1834278797_order = order++;
                             if (true) { 
                             oSoAUXILIARYo41568229 = true;          
                                           oSoAUXILIARYo41568229_prio = currentPrio();
                                           oSoAUXILIARYo41568229_order = order++;
                             gotoB(L__C_During1Internal1612182_surface);
                             break;
                           }
                             oSoAUXILIARYo1834278798 = true;          
                                oSoAUXILIARYo1834278798_prio = currentPrio();
                                oSoAUXILIARYo1834278798_order = order++;
                             gotoB(L__C_During2Internal1612182_depth);
                  break;
             case L__C_During1Internal1612182_surface:  
                  oSoAUXILIARYoM1107378804 = true;          
                                oSoAUXILIARYoM1107378804_prio = currentPrio();
                                oSoAUXILIARYoM1107378804_order = order++;
                             prioB(2, L__C_During1Internal1612182_surfaceM1107378803);
                  break;
             case L__C_During1Internal1612182_surfaceM1107378803:  
                  oSoAUXILIARYoM1107378803 = true;          
                                oSoAUXILIARYoM1107378803_prio = currentPrio();
                                oSoAUXILIARYoM1107378803_order = order++;
                             if (true) { 
                             oSoAUXILIARYo799548901 = true;          
                                           oSoAUXILIARYo799548901_prio = currentPrio();
                                           oSoAUXILIARYo799548901_order = order++;
                             oSYNCCHARTSoAUXSTATEo733279299 = true;          
                                           oSYNCCHARTSoAUXSTATEo733279299_prio = currentPrio();
                                           oSYNCCHARTSoAUXSTATEo733279299_order = order++;
                             oSoAUXILIARYo799548902 = true;          
                                           oSoAUXILIARYo799548902_prio = currentPrio();
                                           oSoAUXILIARYo799548902_order = order++;
                             gotoB(L__C_During2Internal1612182_surface);
                             break;
                           }
                             oSoAUXILIARYoM1107378802 = true;          
                                oSoAUXILIARYoM1107378802_prio = currentPrio();
                                oSoAUXILIARYoM1107378802_order = order++;
                             gotoB(L__C_During1Internal1612182_depth);
                  break;
             case L__C_During1Internal1612182_depth:  
                  oSoAUXILIARYoM1399336542 = true;          
                                oSoAUXILIARYoM1399336542_prio = currentPrio();
                                oSoAUXILIARYoM1399336542_order = order++;
                             prioB(2, L__C_During1Internal1612182_depthM1399336541);
                  break;
             case L__C_During1Internal1612182_depthM1399336541:  
                  oSoAUXILIARYoM1399336541 = true;          
                                oSoAUXILIARYoM1399336541_prio = currentPrio();
                                oSoAUXILIARYoM1399336541_order = order++;
                             pauseB(L__C_During1Internal1612182_depthM1399336541M1399336539);
                  break;
             case L__C_During1Internal1612182_depthM1399336541M1399336539:  
                  oSoAUXILIARYoM1399336540 = true;          
                                oSoAUXILIARYoM1399336540_prio = currentPrio();
                                oSoAUXILIARYoM1399336540_order = order++;
                             if (true) { 
                             oSoAUXILIARYo1356606460 = true;          
                                           oSoAUXILIARYo1356606460_prio = currentPrio();
                                           oSoAUXILIARYo1356606460_order = order++;
                             oSYNCCHARTSoAUXSTATEo733279299 = true;          
                                           oSYNCCHARTSoAUXSTATEo733279299_prio = currentPrio();
                                           oSYNCCHARTSoAUXSTATEo733279299_order = order++;
                             oSoAUXILIARYo1356606461 = true;          
                                           oSoAUXILIARYo1356606461_prio = currentPrio();
                                           oSoAUXILIARYo1356606461_order = order++;
                             gotoB(L__C_During2Internal1612182_surface);
                             break;
                           }
                             oSoAUXILIARYoM1399336539 = true;          
                                oSoAUXILIARYoM1399336539_prio = currentPrio();
                                oSoAUXILIARYoM1399336539_order = order++;
                             gotoB(L__C_During1Internal1612182_depth);
                  break;
       
            }
        }       
    }

}
