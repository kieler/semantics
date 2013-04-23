package de.cau.cs.kieler.scl.kaom.klighd;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

//SUPPRESS CHECKSTYLE NEXT LineLength
import org.eclipse.core.internal.resources.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.model.triggers.SelectionTrigger.SelectionState;
import de.cau.cs.kieler.kaom.Entity;
import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.effects.KlighdUpdateDiagramEffect;
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy;

public class KAOMNetlistDiagramSynthesisCombination extends AbstractCombination {

    /**
     * The execute method revealed and invoked by KIVi.
     * 
     * @param state
     *            A {@link de.cau.cs.kieler.core.kivi.ITriggerState} carrying the necessary
     *            information.
     */
    public void execute(final SelectionState triggerState) {
        List<Object> selection = triggerState.getSelectedObjects();

        if ((selection != null) 
                && (selection.size() == 1) 
                && (selection.get(0) instanceof File) 
                && (selection.size() > 0)) {
             
                File file = (File) selection.get(0);
                if (file.getFileExtension().equals("kaom") || file.getFileExtension().equals("kaot")) {
                String modelOSString = file.getFullPath().toOSString();
                URI uri = URI.createPlatformResourceURI(modelOSString, true);
                Resource resource = new ResourceSetImpl().createResource(uri);
                try {
                    resource.load(Collections.EMPTY_MAP);
                    if (resource != null && resource.getContents() != null) {
                        Entity kaomModel = (Entity) resource.getContents().get(0);
                        KlighdUpdateDiagramEffect klighdEffect = new KlighdUpdateDiagramEffect(kaomModel);
                        klighdEffect.setProperty(LightDiagramServices.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID);
                        this.schedule(klighdEffect);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                }
                        
        }
    }
}
