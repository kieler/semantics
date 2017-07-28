/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.legacy.text.actions;

import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parser.IParseResult;


/**
 *
 * @author chsch
 */
public class ActionsResource extends LazyLinkingResource {

    /**
     * Eliminates an ugly bug within the calling method
     * {@link org.eclipse.xtext.resource.XtextResource#update(int, int, String)}:<br>
     * If a parsing round fails entirely, the last previously successfully deducted EObject will
     * remain in contents though the parseResult is empty! After the next successful parser run the
     * new EObject will be added to contents regardless the non-emptiness of contents.
     */
    protected void updateInternalState(IParseResult parseResult) {
        if (parseResult.getRootASTElement() != null && getContents().size() != 0
                && !getContents().get(0).equals(parseResult.getRootASTElement())) {
            unload(getContents().get(0));
            getContents().remove(0);
            while (!getContents().isEmpty()) {
                getContents().remove(0);
            }
        }
        this.getContents().clear();
        super.updateInternalState(parseResult);
    }


}
