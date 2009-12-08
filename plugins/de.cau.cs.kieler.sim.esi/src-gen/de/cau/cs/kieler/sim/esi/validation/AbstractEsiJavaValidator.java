package de.cau.cs.kieler.sim.esi.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators= {org.eclipse.xtext.validation.ImportUriValidator.class})
public class AbstractEsiJavaValidator extends AbstractDeclarativeValidator {

    @Override
    protected List<EPackage> getEPackages() {
        List<EPackage> result = new ArrayList<EPackage>();
        result.add(de.cau.cs.kieler.sim.esi.esi.EsiPackage.eINSTANCE);
        return result;
    }

}
