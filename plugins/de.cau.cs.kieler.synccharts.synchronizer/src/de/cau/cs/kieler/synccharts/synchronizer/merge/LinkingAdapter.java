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
package de.cau.cs.kieler.synccharts.synchronizer.merge;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class LinkingAdapter implements Adapter {

    public static void installLinkingAdapter(EObject theSource, EObject theCopy) {
        internalInstallLinkingAdapter(theSource, theCopy, true);
    }

    private static void internalInstallLinkingAdapter(EObject theSource, EObject theCopy,
            boolean includeContent) {
        if (SyncchartsPackage.eINSTANCE.getAssignment().isInstance(theCopy)
                || SyncchartsPackage.eINSTANCE.getEmission().isInstance(theCopy)
                || KExpressionsPackage.eINSTANCE.getValuedObjectReference().isInstance(theCopy)) {
            new LinkingAdapter(theSource, theCopy);
        } else {
            if (SyncchartsPackage.eINSTANCE.getTransition().isInstance(theCopy)) {
                new LinkingAdapter(theSource, theCopy);
            }
            if (includeContent
                    && (SyncchartsPackage.eINSTANCE.getScope().isInstance(theCopy) || KExpressionsPackage.eINSTANCE
                            .getExpression().isInstance(theCopy))) {

                Iterator<EObject> it_s = theSource.eAllContents();
                Iterator<EObject> it_c = theCopy.eAllContents();

                EObject o_s = null;
                EObject o_c = null;

                while (it_s.hasNext()) {
                    o_s = it_s.next();
                    o_c = it_c.next();
                    if (!o_s.getClass().equals(o_c.getClass())) {
                        throw new IllegalStateException("LINKING ERROR");
                    }
                    internalInstallLinkingAdapter(theSource, theCopy, false);
                }
            }
        }
        
//        EList<EObject> content = theSource.eContents();
//        
////        EObject eSourceChild = null;
//        EObject eCopyChild = null;
//        EReference eRef = null;
//        
//        // inspect all references of the EObject under investigation
//        for (EObject eSourceChild : content) {
//                eRef = eSourceChild.eContainmentFeature();
//                
//                if (child instanceof EObject) {
//                    installSingleLinkingAdapter((EObject) child, (EObject) theCopy.eGet(eRef));
//                } else {
//                    if (child instanceof EList<?>) {
//                        EList<EObject> list = (EList<EObject>) child;
//
//                        for (Iterator<EObject> it = list.iterator(); it.hasNext();) {
//                            eSourceChild = it.next();
//                            int index = list.indexOf(eSourceChild);
//                            eCopyChild = ((EList<EObject>) theCopy.eGet(eRef)).get(index);
//
//                            installSingleLinkingAdapter(eSourceChild, eCopyChild);
//                        }
//                    }
//                }
//            }
//            
//            internalInstallLinkingAdapter(ref, theCopy, includeContent)
//        }

    }
    
    private static void installSingleLinkingAdapter(EObject theSource, EObject theCopy) {
        
    }

    public static EObject getCounterPartAndUnlink(EObject eObj) {
        for (Adapter a : eObj.eAdapters()) {
            if (a instanceof LinkingAdapter && ((LinkingAdapter) a).isLinkingAdapterOf(eObj)) {
                EObject cp = ((LinkingAdapter) a).getTheCounterPart(eObj);
                ((LinkingAdapter) a).unlink();
                return cp;

            }
        }
        return null;
    }

    private EObject source = null;
    private EObject copy = null;

    public LinkingAdapter(EObject theSource, EObject theCopy) {
        this.source = theSource;
        this.copy = theCopy;

        theSource.eAdapters().add(this);
        theCopy.eAdapters().add(this);
    }

    public boolean isLinkingAdapterOf(EObject eObj) {
        return this.source == eObj || this.copy == eObj;
    }

    public EObject getTheCounterPart(EObject eObj) {
        if (eObj == this.source) {
            return this.copy;
        }
        if (eObj == this.copy) {
            return this.source;
        }
        return null;
    }

    public void unlink() {
        this.source.eAdapters().remove(this);
        this.copy.eAdapters().remove(this);
        this.source = null;
        this.copy = null;
    }

    public void unsetTarget(Notifier oldTarget) {
        unlink();
    }

    public void setTarget(Notifier newTarget) {

    }

    /**
     * {@inheritDoc}
     */
    public void notifyChanged(Notification notification) {
    }

    /**
     * {@inheritDoc}
     */
    public Notifier getTarget() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isAdapterForType(Object type) {
        return false;
    }

}
