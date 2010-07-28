/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kvid.views;

import org.eclipse.gef.EditPart;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetEntry;
import org.eclipse.ui.views.properties.PropertySheetPage;

import de.cau.cs.kieler.kvid.KViDPlugin;
import de.cau.cs.kieler.kvid.datadistributor.KViDPropertySource;

public class KViDView extends ViewPart {

    /** the form container for the property sheet page. */
    private ScrolledForm form;
    /** the page that is displayed in this view part. */
    private PropertySheetPage page;
    /** the part listener that tracks the active editor part. */
    private IPartListener partListener;
    /** the currently tracked diagram editor. */
    private IEditorPart currentEditor;
    /* the layout provider data for the currently displayed options.
    private LayoutProviderData[] currentProviderData;*/
    
    /** margin width for the form layout. */
    private static final int MARGIN_WIDTH = 4;
    /** position for left attachment. */
    private static final int FORM_LEFT = 0;
    /** position for right attachment. */
    private static final int FORM_RIGHT = 100;
    /** position for top attachment. */
    private static final int FORM_TOP = 0;
    /** position for bottom attachment. */
    private static final int FORM_BOTTOM = 100;
    
    @Override
    public void createPartControl(Composite parent) {
        FormToolkit toolkit = new FormToolkit(parent.getDisplay());
        form = toolkit.createScrolledForm(parent);
        form.setText("");
        Composite content = form.getBody();
        FormLayout contentLayout = new FormLayout();
        contentLayout.marginWidth = MARGIN_WIDTH;
        content.setLayout(contentLayout);

        page = new PropertySheetPage();
        page.setRootEntry(new PropertySheetEntry());
        page.createControl(content);
        FormData formData = new FormData();
        formData.left = new FormAttachment(FORM_LEFT, 0);
        formData.right = new FormAttachment(FORM_RIGHT, 0);
        formData.top = new FormAttachment(FORM_TOP, 0);
        formData.bottom = new FormAttachment(FORM_BOTTOM, 0);
        page.getControl().setLayoutData(formData);
        page.setPropertySourceProvider(new IPropertySourceProvider() {
            
            IPropertySource source = new KViDPropertySource();
            
            public IPropertySource getPropertySource(final Object object) {
                return source;
            }
        });
        
        IActionBars actionBars = getViewSite().getActionBars();
        page.setActionBars(actionBars);
    }

    @Override
    public void setFocus() {
        page.setFocus();
    }

}
