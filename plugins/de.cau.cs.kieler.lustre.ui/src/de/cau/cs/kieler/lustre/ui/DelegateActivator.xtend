/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.lustre.ui

import com.google.inject.Module
import org.apache.log4j.Logger
import org.eclipse.xtext.ui.shared.SharedStateModule
import java.util.Map
import org.eclipse.ui.plugin.AbstractUIPlugin
import com.google.common.collect.Maps
import org.osgi.framework.BundleContext
import com.google.inject.Injector
import java.util.Collections
import de.cau.cs.kieler.lustre.ui.internal.LustreActivator
import de.cau.cs.kieler.lustre.ui.internal.ScadeEquationsActivator

/**
 * Delegate Activator for Lustre and Scade Equations.
 * @author lgr
 *
 */
class DelegateActivator extends AbstractUIPlugin {
    
    public static final String DE_CAU_CS_KIELER_ESTEREL = "de.cau.cs.kieler.esterel";
    
    static final Logger logger = Logger.getLogger(DelegateActivator);
    
    static DelegateActivator INSTANCE;
    
    Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
    
    
    override start(BundleContext context) throws Exception {
        super.start(context);
        INSTANCE = this;
        new LustreActivator().start(context);
        new ScadeEquationsActivator().start(context);
    }
    
    override stop(BundleContext context) throws Exception {
        LustreActivator.getInstance().stop(context);
        ScadeEquationsActivator.getInstance().stop(context);
        injectors.clear();
        INSTANCE = null;
        super.stop(context);
    }
    
    def Injector getInjector(String language) {
        if (LustreActivator.DE_CAU_CS_KIELER_LUSTRE_LUSTRE.equals(language)) {
            return LustreActivator.getInstance().getInjector(language);
        }
        if (ScadeEquationsActivator.DE_CAU_CS_KIELER_LUSTRE_SCADE_SCADEEQUATIONS.equals(language)) {
            return ScadeEquationsActivator.getInstance().getInjector(language);
        }
        
        throw new IllegalArgumentException(language); 
    }

    protected def Module getRuntimeModule(String grammar) {
        if (LustreActivator.DE_CAU_CS_KIELER_LUSTRE_LUSTRE.equals(grammar)) {
            return new de.cau.cs.kieler.lustre.LustreRuntimeModule();
        }
        if (ScadeEquationsActivator.DE_CAU_CS_KIELER_LUSTRE_SCADE_SCADEEQUATIONS.equals(grammar)) {
            return new de.cau.cs.kieler.lustre.scade.ScadeEquationsRuntimeModule();
        }
        
        throw new IllegalArgumentException(grammar);
    }
    
    protected def Module getUiModule(String grammar) {
        if (LustreActivator.DE_CAU_CS_KIELER_LUSTRE_LUSTRE.equals(grammar)) {
            return new de.cau.cs.kieler.lustre.ui.LustreUiModule(this);
        }
        if (ScadeEquationsActivator.DE_CAU_CS_KIELER_LUSTRE_SCADE_SCADEEQUATIONS.equals(grammar)) {
            return new de.cau.cs.kieler.lustre.ui.scade.ScadeEquationsUiModule(this);
        }
        
        throw new IllegalArgumentException(grammar);
    }
    
    protected def Module getSharedStateModule() {
        return new SharedStateModule();
    }
    
}