package de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend

import org.eclipse.xtend.util.stdlib.CloningExtensions
import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableCollection;
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import java.util.Collections
import java.util.List
import java.util.Collection
import java.util.ArrayList
import org.eclipse.emf.common.util.EList;
import com.google.inject.Guice


import de.cau.cs.kieler.yakindu.sgraph.syncgraph.TransitionType
import org.yakindu.sct.model.sgraph.Statechart
//import org.yakindu.sct.model.sgraph.State
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncState

import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncgraphFactory

import org.yakindu.sct.model.sgraph.SGraphFactory
import org.yakindu.sct.model.sgraph.State
import org.yakindu.sct.model.sgraph.Trigger
import org.yakindu.sct.model.sgraph.Region
import org.yakindu.sct.model.stext.stext.StextFactory
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.ReactionTrigger
import org.yakindu.sct.model.stext.stext.ReactionEffect

import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpFactory
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.*
import org.yakindu.sct.model.sgraph.Choice

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclFactory;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionList
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Scope
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment

import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgFactory;


class SCLToSCGTransformation {
    
     extension de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend.SCLHelper SCLHelper = 
         Guice::createInjector().getInstance(typeof(SCLHelper))
 
    //-------------------------------------------------------------------------
    //--          C O R E   TO   S C L -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------
           
    // Transforming SCC Aborts.
    def Program SCLToSCG(Program sclProgram) {
        val scgProgram = SCL.createProgram()

        sclProgram.program.instructions.forEach(e | 
            {
                var de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction scgI = null
                switch e {
                    Parallel: scgI = null 
                    default: scgI = null
                }
                scgI.setPriority(1);
                scgProgram.program.instructions.add(scgI);
            }
            
        );
        
        scgProgram
    }
    

}