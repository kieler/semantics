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
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.model.cViewModel.File
import de.cau.cs.kieler.cview.model.cViewModel.Folder

/* Package and import statements... */
class DiagramSynthesis extends AbstractDiagramSynthesis<CViewModel> {

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    extension KRenderingFactory = KRenderingFactory.eINSTANCE

    override KNode transform(CViewModel model) {

        // If you get a NPE here, then add "de.cau.cs.kieler.klighd.syntheses.GuiceBasedSynthesisFactory:" before the
        // class name of the synthesis defined in the plugin.xml under "<diagramSynthesis>" 
        val root = model.createNode().associateWith(model);
        
        
        
        
        //val parentNode = model.createNode().associateWith(model);
        
        for (item : model.folders) {
            root.transform(item)
        }
        for (item : model.files) {
            root.transform(item)
        }


//        parentNode.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
//            EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
//
//
//        root.children.add(parentNode)

        return root;
    }
    
    def void transform(KNode parent, File item) {
        val childNode = item.createNode().associateWith(item);
        childNode.addRoundedRectangle(4, 4, 2);
        childNode.addInsideCenteredNodeLabel(item.name, KlighdConstants.DEFAULT_FONT_SIZE, KlighdConstants.DEFAULT_FONT_NAME);
        childNode.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
            EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
        
        parent.children.add(childNode)
    }

    def void transform(KNode parent, Folder item) {
        val childNode = item.createNode().associateWith(item);
        val rect =childNode.addRoundedRectangle(4, 4, 2);
        val label = childNode.addInsideCenteredNodeLabel(item.name, KlighdConstants.DEFAULT_FONT_SIZE, KlighdConstants.DEFAULT_FONT_NAME);
        rect.background = "YELLOW".color
        childNode.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
            EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
        parent.children.add(childNode)
    }


}
