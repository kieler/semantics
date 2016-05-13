/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.circuit.eval

import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractHook
import de.cau.cs.kieler.kico.transformation.IProcessor
import de.cau.cs.kieler.kico.transformation.ITransformation
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.transformations.SCGTransformations
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scg.circuit.CircuitTransformation

class EvaluationHook extends AbstractHook {

    override getId() {
        return "de.cau.cs.kieler.circuit.eval"
    }

    override postProcessor(EObject input, Object result, KielerCompilerContext context, IProcessor processor) {
    }

    override postSnapshot(EObject model, KielerCompilerContext context) {
    }


    def boolean isVCC(Actor a) {
        val e = a.name.equals("vcc") || a.name.equals("1");
        //val e = a.name.startsWith("vcc") || a.name.startsWith("gnd");
//        if (e) {
//            System.out.println("BUUUH VCC TRUE:" + a.name);
//        } else {
//            System.out.println("BUUUH VCC FALSE:"  + a.name);
//        }
        return e;        
    }

    def boolean isProgramLogic(Actor a) {
        if (a.name.equals("Program Logic")) {
            return true;
        }
        if (a.eContainer != null) {
            return (a.eContainer as Actor).isProgramLogic
        }
        return false;
    }

    override postTransformation(EObject input, Object result, KielerCompilerContext context,
        ITransformation transformation) {
        if (result instanceof EObject) {
            var model = result as EObject
            val String msg = switch (model) {
                Actor:
                    "Number of Aactors: " + model.eAllContents.filter(Actor).filter[e |  
                        (((e.eContainer as Actor) != null) && ((e as Actor).innerActors.nullOrEmpty) 
                            && e.isProgramLogic
                        //&& ((e.eContainer as Actor).name.equals("Program Logic"))
                        )  
                        &&  (!(e as Actor).isVCC)
                    ].toList.size
                case transformation.id == SCGTransformations::SCC2SCG_ID: {
                    "Number of states: " + input.eAllContents.filter(State).size + "\n" + "Number of scg nodes: " +
                        model.eAllContents.filter(Node).size
                }
                case transformation.id == SCGTransformations::SEQUENTIALIZE_ID:
                    "Number of seq scg nodes: " + model.eAllContents.filter(Node).size
                case transformation.id == CircuitTransformation::SCG2SSASCG_ID:
                    "Number of ssa scg nodes: " + model.eAllContents.filter(Node).size
            }
            if (msg != null) {
                System.out.println(msg)
            }
        }
        return result
    }

    override preCompilation(KielerCompilerContext context) {
    }

    override preProcessor(EObject model, KielerCompilerContext context, IProcessor processor) {
    }

    override preSnapshot(EObject model, KielerCompilerContext context) {
    }

    override preTransformation(EObject model, KielerCompilerContext context, ITransformation transformation) {
    }

}