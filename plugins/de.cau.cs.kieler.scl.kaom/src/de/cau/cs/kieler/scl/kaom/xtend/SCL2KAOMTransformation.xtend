/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.kaom.xtend

import com.google.inject.Injector
import de.cau.cs.kieler.scl.SCLStandaloneSetup

//import com.google.common.collect.ImmutableList
import com.google.inject.Guice
//import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
//import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.scl.scl.Annotation
import de.cau.cs.kieler.core.annotations.NamedObject 
//import de.cau.cs.kieler.scl.scl.Conditional
//import de.cau.cs.kieler.scl.scl.Goto
//import de.cau.cs.kieler.scl.scl.InstructionList
//import de.cau.cs.kieler.scl.scl.Label
import de.cau.cs.kieler.scl.scl.Program
//import de.cau.cs.kieler.scl.scl.SclFactory
//import java.util.ArrayList
//import java.util.HashMap
//import org.yakindu.sct.model.sgraph.Event
//import org.yakindu.sct.model.sgraph.Region
//import org.yakindu.sct.model.sgraph.Statechart

import org.eclipse.xtext.serializer.ISerializer
import org.yakindu.sct.model.stext.stext.Expression


import de.cau.cs.kieler.kaom.Entity
import de.cau.cs.kieler.kaom.KaomFactory

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.SCLHelper
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.Assignment
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.common.util.EList
//import de.cau.cs.kieler.scl.scl.InstructionList
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kaom.Port
import de.cau.cs.kieler.kaom.Relation
import de.cau.cs.kieler.kaom.Linkable

//import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSequence

class SCL2KAOMTransformation {
    
    /*
     * Injector and Serializer
     * Needed for SText expression serialization
     */
    private static val Injector i = SCLStandaloneSetup::doSetup();
    private static val ISerializer serializer = i.getInstance(typeof(ISerializer));
    
     extension de.cau.cs.kieler.scl.SCLHelper SCLHelper = 
            Guice::createInjector().getInstance(typeof(SCLHelper))
//     extension de.cau.cs.kieler.yakindu.sccharts.scl.xtend.SCCHelper SCCHelper = 
//         Guice::createInjector().getInstance(typeof(SCCHelper))
 
    //-------------------------------------------------------------------------
    //--          S C L  2  K A O M  -  T R A N S F O R M A T I O N        --
    //-------------------------------------------------------------------------
           
    // Transform the SCL program into a KAOM netlist model
    def Entity transform(Program program) {
        var targetModel = KaomFactory::eINSTANCE.createEntity();
        val instructionList = program.instructions;
        instructionList.transform(targetModel);        
        targetModel
    }
    
    
    def dispatch void transform(EList<EObject> eObjectList, Entity targetModel) {
        var Instruction priorInstruction = null;
        for (eObject : eObjectList) {
            if (eObject instanceof Instruction) {
                val instruction = eObject as Instruction;
                instruction.transform(targetModel);
                
                if (priorInstruction != null) {
                    // Connect prioInstruction with Instruction
                
                }
            
                priorInstruction = instruction;
            }
        }
    }
    
//    def dispatch void transform(InstructionList instructionList, Entity targetModel) {
//        instructionList.instructions.transform(targetModel);
//    }
    
    def dispatch void transform(Pause pause, Entity targetModel) {
        val kaomPause = targetModel.createCompound;
        kaomPause.setName("PAUSE");
        val register = kaomPause.createRegister;
        val and1 = kaomPause.createAnd;
        val and2 = kaomPause.createAnd;
        val or = kaomPause.createOr;
        val not = kaomPause.createNot;
        val r1 = kaomPause.createRelation;
        val r2 = kaomPause.createRelation;
        
        kaomPause.go.link(r1);
        kaomPause.res.link(and2);
        kaomPause.kill.link(not);
        r1.link(kaomPause.k1);
        r1.link(or);
        or.link(and1);
        not.link(and1);
        and1.link(register);
        register.link(r2);
        r2.link(and2);
        and2.link(kaomPause.k0);
        r2.link(kaomPause.sel);
        r2.link(or);
        targetModel.childEntities.add(kaomPause);
    }
    
    def dispatch void transform(Parallel parallel, Entity targetModel) {
        var kaomParallel = KaomFactory::eINSTANCE.createEntity();
        kaomParallel.setName("||");
        targetModel.childEntities.add(kaomParallel);
        for (thread : parallel.threads) {
            thread.instructions.transform(targetModel);  
        } 
    }
    
    def dispatch void transform(Goto goto, Entity targetModel) {
        var kaomGoto = KaomFactory::eINSTANCE.createEntity();
        kaomGoto.setName("GOTO");
        targetModel.childEntities.add(kaomGoto);
    }
    
    def dispatch void transform(Assignment assignment, Entity targetModel) {
        var kaomAssignment = KaomFactory::eINSTANCE.createEntity();
        val assignmentCopy = assignment.assignment;
        var nodeText = serializer.serialize(assignmentCopy);
        kaomAssignment.setName(nodeText.correctSerialization);
        targetModel.childEntities.add(kaomAssignment);
    }
    
    def dispatch void transform(Conditional conditional, Entity targetModel) {
        var kaomConditional = KaomFactory::eINSTANCE.createEntity();
        kaomConditional.setName("C?P:Q");
        targetModel.childEntities.add(kaomConditional);
    }
    
    def dispatch void transform(Object object, Entity targetModel) {
        // The default case
    }
    
    
    // Because expression serialization, serializes ALL text until the preceding ";",
    // one needs to filter this maybe wrongly serialized text away. 
    def String correctSerialization(String text) {
        val i1 = text.lastIndexOf("\r");
        val i2 = text.lastIndexOf("\n");
        val i3 = text.lastIndexOf("\t");
        val i4 = text.lastIndexOf("*/")+1;
        
        if ((i1 > 0) || (i2 > 0) || (i3 > 0) || (i4 > 1)) {
            var i = i4;
            if ((i1 > i2) && (i1 > i3)  && (i1 > i4)) {
                i = i1;
            }
            else if ((i2 > i1) && (i2 > i3)  && (i2 > i4)) {
                i = i2;
            }
            else if ((i3 > i1) && (i3 > i2)  && (i3 > i4)) {
                i = i3;
            }
            return text.substring(i+1);
        }
        text;
    }
    
    //-------------------------------

    def Entity createCompound(Entity containingEntity) {
        val entity = KaomFactory::eINSTANCE.createEntity();
        val inPort1 = KaomFactory::eINSTANCE.createPort();
        inPort1.setName("Go");
        val inPort2 = KaomFactory::eINSTANCE.createPort();
        inPort2.setName("Res");
        val inPort3 = KaomFactory::eINSTANCE.createPort();
        inPort3.setName("Kill");
        val outPort1 = KaomFactory::eINSTANCE.createPort();
        outPort1.setName("Sel");
        val outPort2 = KaomFactory::eINSTANCE.createPort();
        outPort2.setName("K0");
        val outPort3 = KaomFactory::eINSTANCE.createPort();
        outPort3.setName("K1");
        entity.childPorts.add(inPort1);
        entity.childPorts.add(inPort2);
        entity.childPorts.add(inPort3);
        entity.childPorts.add(outPort1);
        entity.childPorts.add(outPort2);
        entity.childPorts.add(outPort3);
        containingEntity.childEntities.add(entity);
        return entity;
    }
    
    //-------------------------------
    
    def Port getIn(Entity entity) {entity.getPort("In");}
    def Port getOut(Entity entity) {entity.getPort("Out");}
    def Port getGo(Entity entity) {entity.getPort("Go");}
    def Port getRes(Entity entity) {entity.getPort("Res");}
    def Port getKill(Entity entity) {entity.getPort("Kill");}
    def Port getSel(Entity entity) {entity.getPort("Sel");}
    def Port getK0(Entity entity) {entity.getPort("K0");}
    def Port getK1(Entity entity) {entity.getPort("K1");}
    
    def Port getPort(Entity entity, String name) {
        entity.childPorts.filter(e | e.name.equals(name)).head;
    }
    
    def void link(Linkable source, Linkable target) {
        val link = KaomFactory::eINSTANCE.createLink;
        (source.eContainer as Entity).childLinks.add(link);

        if (source instanceof Entity) {
            val port = KaomFactory::eINSTANCE.createPort();
            port.setName("Out");
            (source as Entity).childPorts.add(port);
            link.setSource(port);
        }
        else {
            link.setSource(source);
        }
        if (target instanceof Entity) {
            val port = KaomFactory::eINSTANCE.createPort();
            port.setName("In");
            (target as Entity).childPorts.add(port);
            link.setTarget(port);
        }
        else {
            link.setTarget(target);
        }
    }
    
    //-------------------------------

    def Entity createRegister(Entity containingEntity) {
        val entity = KaomFactory::eINSTANCE.createEntity();
        entity.setName("R");
        containingEntity.childEntities.add(entity);
        return entity;
    }

    def Entity createAnd(Entity containingEntity) {
        val entity = KaomFactory::eINSTANCE.createEntity();
        entity.setName("AND");
        containingEntity.childEntities.add(entity);
        return entity;
    }

    def Entity createOr(Entity containingEntity) {
        val entity = KaomFactory::eINSTANCE.createEntity();
        entity.setName("OR");
        containingEntity.childEntities.add(entity);
        return entity;
    }
    
    def Entity createNot(Entity containingEntity) {
        val entity = KaomFactory::eINSTANCE.createEntity();
        entity.setName("!");
        containingEntity.childEntities.add(entity);
        return entity;
    }

    def Relation createRelation(Entity containingRelation) {
        val relation = KaomFactory::eINSTANCE.createRelation();
        containingRelation.childRelations.add(relation);
        return relation;
    }
    
}