/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext;

import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.sequencer.IContextFinder;
import org.yakindu.base.types.ITypeSystem;
import org.yakindu.sct.model.sgraph.resource.SCTLinker;
import org.yakindu.sct.model.sgraph.resource.provider.SCTResourceDescriptionStrategy;
import org.yakindu.sct.model.stext.conversion.StextValueConverterService;
import org.yakindu.sct.model.stext.naming.StextNameProvider;
import org.yakindu.sct.model.stext.scoping.STextGlobalScopeProvider;
import org.yakindu.sct.model.stext.types.ISTextTypeInferrer;
import org.yakindu.sct.model.stext.types.STextDefaulTypeSystem;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.serializer.SynctextContextFinder;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.types.SyncTypeInferrer;

/**
 * This class registers components that are used at runtime / without the Equinox extension
 * registry.
 */
public class SynctextRuntimeModule extends AbstractSynctextRuntimeModule {

    public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
        super.bindIGlobalScopeProvider();
        return STextGlobalScopeProvider.class;
    }

//    public Class<? extends XtextResource> bindXtextResource() {
//        return XtextResource.class;
//    }

//  @Override
//  public Class<? extends XtextResource> bindXtextResource() {
//      return SyncTextLinker.class;
//  }

    @Override
    public Class<? extends ILinker> bindILinker() {
        return SyncTextLinker.class;
    }

    
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return StextNameProvider.class;
    }

    @Override
    public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
        return StextValueConverterService.class;
    }

    public Class<? extends ITypeSystem> bindITypeSystem() {
        return STextDefaulTypeSystem.class;
    }

    public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
        return SCTResourceDescriptionStrategy.class;
    }

    public Class<? extends ISTextTypeInferrer> bindISTextTypeInferrer() {
        return SyncTypeInferrer.class;
    }

    public Class<? extends IContextFinder> bindIContextFinder() {
        return SynctextContextFinder.class;
    }
}
