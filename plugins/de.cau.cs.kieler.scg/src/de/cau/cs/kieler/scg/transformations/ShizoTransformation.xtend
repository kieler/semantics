package de.cau.cs.kieler.scg.transformations

import com.google.inject.Guice
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoopAnalyzer
import de.cau.cs.kieler.scg.features.SCGFeatures

class ShizoTransformation extends AbstractProductionTransformation implements Traceable{
	
	override getProducedFeatureId() {
		"scg.shizo"
	}
	
	override getId() {
		"scg.shizo"
	}
	
	override getName() {
        "Shizo"
    }
	
	override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::BASIC_ID)
    }
	
	public def SCGraph transform(SCGraph scg, KielerCompilerContext context){
    	val PotentialInstantaneousLoopAnalyzer potentialInstantaneousLoopAnalyzer = Guice.createInjector().
            getInstance(typeof(PotentialInstantaneousLoopAnalyzer))
        context.compilationResult.addAuxiliaryData(potentialInstantaneousLoopAnalyzer.analyze(scg))
		scg
	}
}