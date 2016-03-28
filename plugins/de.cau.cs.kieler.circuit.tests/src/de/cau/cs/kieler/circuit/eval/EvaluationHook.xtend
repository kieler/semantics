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

    override postTransformation(EObject input, Object result, KielerCompilerContext context,
        ITransformation transformation) {
        if (result instanceof EObject) {
            var model = result as EObject
            val String msg = switch (model) {
                Actor:
                    "Number of actors: " + model.eAllContents.filter(Actor).size
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