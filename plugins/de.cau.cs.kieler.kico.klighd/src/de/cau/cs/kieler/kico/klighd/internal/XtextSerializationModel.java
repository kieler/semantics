/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.xbase.lib.Functions.Function3;

import com.google.common.base.Predicates;

import de.cau.cs.kieler.kico.KiCoPlugin;
import de.cau.cs.kieler.kico.internal.KiCoUtil;
import de.cau.cs.kieler.kico.internal.ResourceExtension;
import de.cau.cs.kieler.kico.klighd.view.SynthesisSelectionMenu;
import de.cau.cs.kieler.kico.klighd.view.model.CodePlaceHolder;
import de.cau.cs.kieler.kico.klighd.view.model.CodePlaceHolderSynthesis;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * This class represents a Ecore model as text.
 * 
 * @author als
 * @kieler.design 2015-07-06 proposed
 * @kieler.rating 2015-07-06 proposed yellow
 * 
 */
public class XtextSerializationModel extends CodePlaceHolder {

    // Register this model and synthesis as special synthesis in menu
    static {
        SynthesisSelectionMenu.registerGeneralSynthesis(CodePlaceHolderSynthesis.ID
                + ".XtextSerializationSythesis", CodePlaceHolderSynthesis.ID,
                Predicates.instanceOf(EObject.class),
                new Function3<Object, IEditorPart, KlighdSynthesisProperties, Object>() {

                    @Override
                    public Object apply(Object model, IEditorPart editor,
                            KlighdSynthesisProperties properties) {
                        return new XtextSerializationModel((EObject) model, editor.getTitle());
                    }
                });
    }

    /**
     * Default Constructor.
     * 
     * @param model
     *            The model
     * @param title
     *            The title of the model
     */
    public XtextSerializationModel(EObject model, String title) {
        super(title, "Cannot serialize model");
        // Adding file extension
        ResourceExtension resourceExtension = KiCoPlugin.getInstance().getResourceExtension(model);
        if (resourceExtension != null) {
            this.resourceExtension = resourceExtension.getExtension();
        } else {
            this.resourceExtension = "txt";
        }
        // TODO Cannot open xtext editor because it fails to create a resource for
        // the special StringEditorInput because it has no path
        ResourceExtension ext = KiCoPlugin.getInstance().getResourceExtension(model);
        if (ext != null) {
            this.editorID = ext.getEditorID();
        }
        this.code = KiCoUtil.serialize((EObject) model, null, false);
    }
}
