package de.cau.cs.kieler.synccharts.text.actions.ui;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.validation.DiagnosticConverterImpl;
import org.eclipse.xtext.validation.Issue;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

public class ActionsDiagnosticConverterImpl extends DiagnosticConverterImpl {

    public void convertValidatorDiagnostic(org.eclipse.emf.common.util.Diagnostic diagnostic,
            IAcceptor<Issue> acceptor) {
        if (SyncchartsPackage.eINSTANCE.getTransition().isInstance(getCauser(diagnostic))) {
            EStructuralFeature feature = getFeature(diagnostic);
            if (SyncchartsPackage.eINSTANCE.getTransition_SourceState().equals(feature)
                    || SyncchartsPackage.eINSTANCE.getTransition_TargetState().equals(feature)) {
                return;
            }
        }
        super.convertValidatorDiagnostic(diagnostic, acceptor);
    }
    
    protected EStructuralFeature getFeature(Diagnostic diagnostic) {
        List<?> data = diagnostic.getData();
        Object feature = data.size() > 1 ? data.get(1) : null;
        return resolveStructuralFeature(getCauser(diagnostic), feature);
    }
}
