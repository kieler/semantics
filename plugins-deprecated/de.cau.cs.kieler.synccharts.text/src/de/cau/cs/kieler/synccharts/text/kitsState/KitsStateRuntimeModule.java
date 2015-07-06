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
package de.cau.cs.kieler.synccharts.text.kitsState;

import de.cau.cs.kieler.synccharts.text.kits.KitsLinker;
import de.cau.cs.kieler.synccharts.text.kits.KitsResource;
import de.cau.cs.kieler.synccharts.text.kits.KitsTransientValueService;

/**
 * @author chsch
 * 
 */
public class KitsStateRuntimeModule extends
de.cau.cs.kieler.synccharts.text.kitsState.AbstractKitsStateRuntimeModule {

    public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
        return de.cau.cs.kieler.synccharts.text.kits.scoping.KitsEmbeddedScopeProvider.class;
    }
    public Class<? extends org.eclipse.xtext.resource.XtextResource> bindXtextResource() {
        return KitsResource.class;
    }

    public Class<? extends org.eclipse.xtext.linking.ILinker> bindILinker() {
        return KitsLinker.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITransientValueService> bindITransientValueService() {
        return KitsTransientValueService.class;
    }

    public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
        return de.cau.cs.kieler.synccharts.text.kits.formatting.KitsValueConverter.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IKeywordSerializer> bindIKeywordSerializer() {
        return de.cau.cs.kieler.synccharts.text.kits.formatting.KitsKeywordSerializer.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IValueSerializer> bindIValueSerializer() {
        return de.cau.cs.kieler.synccharts.text.kits.formatting.KitsValueSerializer.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IEnumLiteralSerializer> bindIEnumLiteralSerializer() {
        return de.cau.cs.kieler.synccharts.text.kits.formatting.KitsEnumLiteralSerializer.class;
    }

    public Class<? extends org.eclipse.xtext.formatting.IIndentationInformation> bindIIndentationInformation() {
        return de.cau.cs.kieler.synccharts.text.kits.formatting.KitsIndentionInformation.class;
    }

}