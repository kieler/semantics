package de.cau.cs.kieler.cview

import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.KlighdConstants
import java.util.EnumSet
import org.eclipse.elk.core.options.SizeConstraint
import de.cau.cs.kieler.klighd.syntheses.DiagramLayoutOptions
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.Colors
import org.eclipse.emf.ecore.EObject
import java.lang.Object
import org.eclipse.ui.texteditor.AbstractMarkerAnnotationModel

/* Package and import statements... */
class DiagramSynthesis extends AbstractDiagramSynthesis<AbstractMarkerAnnotationModel> {

	@Inject extension KNodeExtensions
	@Inject extension KEdgeExtensions
	@Inject extension KPortExtensions
	@Inject extension KLabelExtensions
	@Inject extension KRenderingExtensions
	@Inject extension KContainerRenderingExtensions
	@Inject extension KPolylineExtensions
	@Inject extension KColorExtensions
	extension KRenderingFactory = KRenderingFactory.eINSTANCE

	override KNode transform(AbstractMarkerAnnotationModel model) {
		
		// If you get a NPE here, then add "de.cau.cs.kieler.klighd.syntheses.GuiceBasedSynthesisFactory:" before the
		// class name of the synthesis defined in the plugin.xml under "<diagramSynthesis>" 
		val root = model.createNode().associateWith(model);

		// Your dsl element <-> diagram figure mapping goes here!!
		//model.folders.forEach[ s | root.children += transform(s) ]
		
		return root;
	}

}
