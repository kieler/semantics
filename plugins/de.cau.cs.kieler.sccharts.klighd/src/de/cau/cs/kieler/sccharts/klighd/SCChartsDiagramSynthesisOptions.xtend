package de.cau.cs.kieler.sccharts.klighd

import de.cau.cs.kieler.klighd.SynthesisOption

class SCChartsDiagramSynthesisOptions {
    protected static val SynthesisOption PAPER_BW = SynthesisOption::createCheckOption("Black/White (Paper)",
        false);
        
    protected static val SynthesisOption SHOW_SIGNAL_DECLARATIONS = SynthesisOption::createCheckOption("Declarations",
        true);

    protected static val SynthesisOption SHOW_STATE_ACTIONS = SynthesisOption::createCheckOption("State actions",
        true);

    protected static val SynthesisOption SHOW_LABELS = SynthesisOption::createCheckOption("Transition labels",
        true);

    protected static val SynthesisOption SHOW_DEPENDENCIES = SynthesisOption::createCheckOption(
        "Dependencies && optimized priorities", false);

    protected static val SynthesisOption SHOW_ORDER = SynthesisOption::createCheckOption(
        "Dependencies && priorities", false);

    protected static val SynthesisOption SHOW_REFERENCEEXPANSION = SynthesisOption::createCheckOption(
        "Reference Expansion", true);
        
    protected static val SynthesisOption USE_ADAPTIVEZOOM = SynthesisOption::createCheckOption(
        "Adaptive Zoom", false);
        
    protected static val SynthesisOption SHOW_SCG_DEPENDENCIES = SynthesisOption::createCheckOption(
        "SCG Dependencies", false);        
        
    protected static val SynthesisOption SHOW_SCG_LOOPS = SynthesisOption::createCheckOption(
        "SCG Loops", false);

    protected static val SynthesisOption SHOW_SHADOW = SynthesisOption::createCheckOption("Shadow", true);
	
}