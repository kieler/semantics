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
package de.cau.cs.kieler.sccharts.text.sct;

//import org.eclipse.xtext.ui.editor.IXtextEditorCallback;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.linking.impl.Linker;

import de.cau.cs.kieler.sccharts.text.sct.scoping.SctQualifiedNameProvider;
import de.cau.cs.kieler.sccharts.text.sct.scoping.SctScopeProvider;

/**
 * @author chsch
 * 
 */
public class SctRuntimeModule extends de.cau.cs.kieler.sccharts.text.sct.AbstractSctRuntimeModule {

    public Class<? extends org.eclipse.xtext.resource.XtextResource> bindXtextResource() {
        return SctResource.class;
    }

    public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return SctQualifiedNameProvider.class;
    }

    public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
        return SctScopeProvider.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITransientValueService> bindITransientValueService() {
        return SctTransientValueService.class;
    }

    public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
        return de.cau.cs.kieler.sccharts.text.sct.formatting.SctValueConverter.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IKeywordSerializer> bindIKeywordSerializer() {
        return de.cau.cs.kieler.sccharts.text.sct.formatting.SctKeywordSerializer.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IValueSerializer> bindIValueSerializer() {
        return de.cau.cs.kieler.sccharts.text.sct.formatting.SctValueSerializer.class;
    }

    public Class<? extends org.eclipse.xtext.parsetree.reconstr.ITokenSerializer.IEnumLiteralSerializer> bindIEnumLiteralSerializer() {
        return de.cau.cs.kieler.sccharts.text.sct.formatting.SctEnumLiteralSerializer.class;
    }

    public Class<? extends org.eclipse.xtext.formatting.IIndentationInformation> bindIIndentationInformation() {
        return de.cau.cs.kieler.sccharts.text.sct.formatting.SctIndentionInformation.class;
    }
    
    @org.eclipse.xtext.service.SingletonBinding(eager=true) public Class<? extends de.cau.cs.kieler.sccharts.text.sct.validation.SctJavaValidator> bindSctJavaValidator() {
        return de.cau.cs.kieler.sccharts.text.sct.validation.SctValidator.class;
}    

    /**
     * Method registers the non-lazy linking Linker since the default
     * {@link org.eclipse.xtext.linking.lazy.LazyLinker} doesn't work properly with EOpposite
     * references. (Produces error markers in editor.)
     * 
     * @return the {@link Linker} class
     */
    @Override
    public Class<? extends ILinker> bindILinker() {
        return SctLinker.class;
    }

    /**
     * FIXME Xtext EOpposite Problem. Temporary fix for an issue where Transition#targetState is set
     * to null again _after_ it was successfully linked. Xtext EOpposite.
     */
    private static class SctLinker extends Linker {

        protected boolean isClearAllReferencesRequired(Resource resource) {
            return false;
        }

        // protected void ensureModelLinked(EObject model, final IDiagnosticProducer producer) {
        // boolean clearAllReferencesRequired = isClearAllReferencesRequired(model.eResource());
        // TreeIterator<EObject> iterator = getAllLinkableContents(model);
        //
        // // first clear all (possibly invalid) references
        // while(iterator.hasNext()) {
        // EObject next = iterator.next();
        // if (clearAllReferencesRequired) {
        // clearReferences(next);
        // }
        // }
        //
        // // re-link
        // iterator = getAllLinkableContents(model);
        // while(iterator.hasNext()) {
        // EObject next = iterator.next();
        // ensureLinked(next, producer);
        // }
        // }
    }
}
