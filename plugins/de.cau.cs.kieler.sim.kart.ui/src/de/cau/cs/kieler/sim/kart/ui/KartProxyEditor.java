/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart.ui;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.MultiPageEditorPart;

import de.cau.cs.kieler.sim.kart.KartConstants;
import de.cau.cs.kieler.sim.kart.DataReplayComponent;
import de.cau.cs.kieler.sim.kart.DataValidationComponent;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * An editor to facilitate automatically changing the ESO file property in the current KIEM
 * schedule.
 * 
 * @author ssc, cmot
 * @kieler.rating 2012-01-24 red
 */
public class KartProxyEditor extends MultiPageEditorPart {

    /** The editor input. */
    private IEditorInput editorInput;

    /** The id of the view for KIEM. */
    private static final String KIEMVIEWID = "de.cau.cs.kieler.sim.kiem.view";

    // -------------------------------------------------------------------------

    /**
     * Instead of opening up a real editor, load a new schedule in KIEM and modify the properties of
     * the KART Replay component to set the opened file as the ESO file property.
     * 
     * @param editorSite
     *            the editor site
     * @param editorInputParam
     *            the editor input
     * @throws PartInitException
     *             the part init exception
     */
    @Override
    public void init(final IEditorSite editorSite, final IEditorInput editorInputParam)
            throws PartInitException {
        super.init(editorSite, editorInputParam);

        this.editorInput = editorInputParam;

        // bring KIEM view to the front (lazy loading)
        try {
            IWorkbenchWindow window = this.getSite().getWorkbenchWindow();
            IViewPart vP = window.getActivePage().showView(KIEMVIEWID);
            vP.setFocus();
        } catch (Exception e) {
            // do nothing, let it stay in the background
            // this normally only happens during startup
        }

        boolean suc = updateProperty();

        if (!suc) {
            List<AbstractDataComponent> allComps = KiemPlugin.getDefault()
                    .getRegisteredDataComponentList();
            Iterator<AbstractDataComponent> it = allComps.iterator();

            while (it.hasNext()) {
                AbstractDataComponent comp = it.next();
                if (comp instanceof DataValidationComponent || comp instanceof DataReplayComponent) {
                    KiemPlugin.getDefault().addTodataComponentWrapperList(comp);
                }
            }
            updateProperty();
        }

        KiemPlugin.getDefault().setDirty(true);
        KiemPlugin.getDefault().updateViewAsync();

        this.closeEditor();
    }

    // -------------------------------------------------------------------------

    /**
     * Update the ESO file property of the Replay component to reflect the "opened" ESO file.
     * 
     * @return {@code true} if the Replay component was found in the current list of
     *         {@code DataComponent}s and the property was changed. {@code false} otherwise.
     */
    private boolean updateProperty() {
        boolean success = false;

        List<DataComponentWrapper> components = KiemPlugin.getDefault()
                .getDataComponentWrapperList();

        for (DataComponentWrapper dataComponentWrapper : components) {

            if (dataComponentWrapper.getDataComponent().getClass().getName()
                    .equals(DataReplayComponent.DATA_REPLAY_COMPONENT_ID)) {

                KiemProperty[] properties = dataComponentWrapper.getProperties();
                if (properties.length > 0) {
                    KiemProperty modelFileKiemProperty = properties[0];
                    IFile file = (IFile) editorInput.getAdapter(IFile.class);
                    URI resource = URI.createURI(file.getLocationURI().toString());
                    resource = resource.trimFileExtension().appendFileExtension(
                            KartConstants.ESO_FILEEXTENSION);
                    modelFileKiemProperty.setValue(resource.toPlatformString(true));
                    success = true;
                }
            }
        }
        return success;
    }

    // -------------------------------------------------------------------------

    /**
     * Create just an empty fake page {@inheritDoc}.
     */
    @Override
    protected void createPages() {
        // create just an empty fake page
        Composite composite = new Composite(getContainer(), SWT.NONE);
        FillLayout layout = new FillLayout();
        composite.setLayout(layout);
        int index = addPage(composite);
        setPageText(index, " ");
    }

    // -------------------------------------------------------------------------

    /**
     * This allows asynchronous closing of this fake editor.
     */
    public void closeEditor() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                try {
                    IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                    IWorkbenchPage page = window.getActivePage();
                    IEditorPart editor = page.findEditor(editorInput);
                    if (editor != null) {
                        // page.activate(editor);
                        page.closeEditor(editor, false);
                    }
                } catch (Exception e) {
                    // In an unlikely case of an error leave the editor open//
                }
            }
        });
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void doSave(final IProgressMonitor monitor) {
        // not implemented, PROXY editor only!
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void doSaveAs() {
        // not implemented, PROXY editor only!
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSaveAsAllowed() {
        // not implemented, PROXY editor only!
        return false;
    }

    // -------------------------------------------------------------------------

}
