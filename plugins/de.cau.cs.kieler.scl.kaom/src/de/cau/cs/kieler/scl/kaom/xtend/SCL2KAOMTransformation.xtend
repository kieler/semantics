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
    
    //-------------------------------
    
    def dispatch Entity transform(EList<EObject> eObjectList, Entity targetModel) {
        val kaomSequence = targetModel.createCompound;
        kaomSequence.setName("SEQUENCE");
        val or1 = kaomSequence.createOr;
        val or2 = kaomSequence.createOr;
        or1.link(kaomSequence.sel);
        or2.link(kaomSequence.k1);
        
        var firstEntityLinktToGo = false;
        
        var Instruction priorInstruction = null;
        var Entity priorEntity = null;
        for (eObject : eObjectList) {
            if (eObject instanceof Instruction) {
                val instruction = eObject as Instruction;
                // TODO: The following SHOULD be an Entity!
                val entity = instruction.transform(kaomSequence) as Entity;

                if (!firstEntityLinktToGo) {
                    kaomSequence.go.link(entity.go);
                    firstEntityLinktToGo = true;
                }
                
                entity.sel.link(or1);
                entity.k1.link(or2);
                kaomSequence.res.link(entity.res);
                
                if (priorInstruction != null) {
                    // Connect prioInstruction with Instruction
                    priorEntity.k0.link(entity.go);
                }
            
                priorInstruction = instruction;
                priorEntity = entity;
            }
        }
        // Connect last instruction
        priorEntity.k0.link(kaomSequence.k0);
        kaomSequence
    }
    
    //-------------------------------

    def dispatch Entity transform(Pause pause, Entity targetModel) {
        val kaomPause = targetModel.createCompound;
        kaomPause.setName("PAUSE");
        val reg = kaomPause.createRegister;
        val and = kaomPause.createAnd;
        val r1 = kaomPause.createRelation;
        val r2 = kaomPause.createRelation;
        
        kaomPause.go.link(r1);
        r1.link(reg);
        kaomPause.res.link(and);
        r1.link(kaomPause.k1);
        reg.link(r2);
        r2.link(and);
        and.link(kaomPause.k0);
        r2.link(kaomPause.sel);
        targetModel.childEntities.add(kaomPause);
        kaomPause
    }
    
    def dispatch Entity transform(Parallel parallel, Entity targetModel) {
        val kaomParallel = targetModel.createCompound;
        kaomParallel.setName("||");

        val kaomSynchronizer = kaomParallel.createSynchronizer;
        kaomSynchronizer.setName("Synchronizer");
        kaomSynchronizer.k0.link(kaomParallel.k0);
        kaomSynchronizer.k1.link(kaomParallel.k1);

        val or1 = kaomParallel.createOr;
        or1.link(kaomParallel.sel);

        targetModel.childEntities.add(kaomParallel);
        for (thread : parallel.threads) {
            val or2 = kaomParallel.createOr;
            val not = kaomParallel.createNot;
            
            // TODO: The following SHOULD be an Entity!
            val entity = thread.instructions.transform(kaomParallel) as Entity;
            kaomParallel.go.link(entity.go);  
            kaomParallel.res.link(entity.res);  
            entity.k0.link(kaomSynchronizer.i0);
            entity.k1.link(kaomSynchronizer.i1);
            or2.link(not);
            not.link(kaomSynchronizer.iem);
            entity.sel.link(or2);
            kaomParallel.go.link(or2);
            entity.sel.link(or1);
        } 
        kaomParallel
    }
    
    def dispatch Entity transform(Goto goto, Entity targetModel) {
        
        
//        goto.gotoTargetExists(//goto.rootContainer.)
        
        var kaomGoto = targetModel.createCompound;
        kaomGoto.setName("GOTO");
        targetModel.childEntities.add(kaomGoto);
        kaomGoto
    }
    
    def dispatch Entity transform(Assignment assignment, Entity targetModel) {
        var kaomAssignment = targetModel.createCompound;
        val assignmentCopy = assignment.assignment;
        var nodeText = serializer.serialize(assignmentCopy);
        kaomAssignment.setName(nodeText.correctSerialization);
        targetModel.childEntities.add(kaomAssignment);
        kaomAssignment
    }
    
    def dispatch Entity transform(Conditional conditional, Entity targetModel) {
        var kaomConditional = targetModel.createCompound;

        val or = kaomConditional.createOr;
        
        val and1 = kaomConditional.createAnd;
        val and2 = kaomConditional.createAnd;
        val not = kaomConditional.createNot;
        
        val conditionPort = kaomConditional.getPort("C");
        
        conditionPort.link(and1);
        kaomConditional.go.link(and1);
        
        conditionPort.link(not);
        not.link(and2);
        kaomConditional.go.link(and2);

        // TODO: The following SHOULD be an Entity!
        val entity = conditional.instructions.transform(kaomConditional) as Entity;
        
        and1.link(entity.go);
        kaomConditional.res.link(entity.res);
        
        entity.sel.link(kaomConditional.sel);
        
        // K0 if entity terminates instantaneously or if implicit else branch
        entity.k0.link(or);
        and2.link(or);
        or.link(kaomConditional.k0);
        
        entity.k1.link(kaomConditional.k1);
        
        kaomConditional.setName("C?P:Q");
        targetModel.childEntities.add(kaomConditional);
        kaomConditional
    }
    
    def dispatch void transform(Object object, Entity targetModel) {
        // The default case
    }
    
    //-------------------------------

    def Entity createCompound(Entity containingEntity) {
        val entity = KaomFactory::eINSTANCE.createEntity();
        // Create ports
        entity.go;
        entity.res;
        entity.sel;
        entity.k0;
        entity.k1;
        containingEntity.childEntities.add(entity);
        return entity;
    }

    //-------------------------------

    def Entity createSynchronizer(Entity containingEntity) {
        val entity = KaomFactory::eINSTANCE.createEntity();
        // Create ports
        entity.iem;
        entity.i0;
        entity.i1;
        entity.k0;
        entity.k1;
        containingEntity.childEntities.add(entity);
        return entity;
    }
    
    //-------------------------------
    
    def Port getIn(Entity entity) {entity.getPort("In");}
    def Port getOut(Entity entity) {entity.getPort("Out");}
    def Port getGo(Entity entity) {entity.getPort("Go");}
    def Port getRes(Entity entity) {entity.getPort("Res");}
    def Port getSel(Entity entity) {entity.getPort("Sel");}
    def Port getK0(Entity entity) {entity.getPort("K0");}
    def Port getK1(Entity entity) {entity.getPort("K1");}
    def Port getI0(Entity entity) {entity.getPort("I0");}
    def Port getI1(Entity entity) {entity.getPort("I1");}
    def Port getIem(Entity entity) {entity.getPort("IEM");}
    
    def Port getPort(Entity entity, String name) {
        if (entity.childPorts.filter(e | e.name.equals(name)).nullOrEmpty) {
            // Create port if it has not exist yet
            val port = KaomFactory::eINSTANCE.createPort();
            port.setName(name);
            entity.childPorts.add(port);
        }
        entity.childPorts.filter(e | e.name.equals(name)).head;
    }

    //-------------------------------
    
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
        entity.setName("NOT");
        containingEntity.childEntities.add(entity);
        return entity;
    }

    def Relation createRelation(Entity containingRelation) {
        val relation = KaomFactory::eINSTANCE.createRelation();
        containingRelation.childRelations.add(relation);
        return relation;
    }
    
    //-------------------------------
}