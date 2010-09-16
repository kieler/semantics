/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.synchronizer.kitsView;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Injector;

import de.cau.cs.kieler.synccharts.text.ui.KitsUIPlugin;

/**
 * View providing textual view on parts of SyncCharts models.
 * The view serves as a SelectionListener to retrieve the graphical editors' models.
 * 
 * @author chsch
 */
public class KitsView extends ViewPart {

    private EmbeddedXtextEditor editor;

    private SyncChartSynchronizerJob synchronizer;

    @Override
    public void createPartControl(Composite parent) {
        parent.setLayout(new GridLayout());
        parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        Injector injector = KitsUIPlugin.getInstance().getInjector(
                KitsUIPlugin.KITS_LANGUAGE_EMBEDDED);

        editor = new EmbeddedXtextEditor(parent, injector);

        editor.getDocument().addModelListener(new IXtextModelListener() {
            public void modelChanged(XtextResource resource) {
                synchronizer.cancel();
                if (!documentHasErrors(editor.getDocument())) {
                    synchronizer.schedule(2000L);
                }
            }
        });

        synchronizer = new SyncChartSynchronizerJob("SyncChartsSynchronizer", editor);

        ((ISelectionService) getSite().getService(ISelectionService.class))
                .addSelectionListener(synchronizer);

    }

    /**
     * Copied from @{link org.eclipselabs.xtfo.demo.rcp.editor.detailspage.Domain
     * DomainModelDetailsPage}. (and simplified)
     * 
     * @param xtextDocument
     * @return true if the document could not be parsed and linked correctly, false otherwise
     */
    private boolean documentHasErrors(final IXtextDocument xtextDocument) {
        return (xtextDocument.readOnly(new IUnitOfWork<Boolean, XtextResource>() {
            public Boolean exec(XtextResource state) throws Exception {
                IParseResult parseResult = state.getParseResult();
                return !state.getErrors().isEmpty() || parseResult == null
                        || !parseResult.getParseErrors().isEmpty();
            }
        }));
    }

    public void dispose() {
        ((ISelectionService) getSite().getService(ISelectionService.class))
                .removeSelectionListener(synchronizer);
        editor.dispose();
        super.dispose();
    }

    @Override
    public void setFocus() {

    }

}
