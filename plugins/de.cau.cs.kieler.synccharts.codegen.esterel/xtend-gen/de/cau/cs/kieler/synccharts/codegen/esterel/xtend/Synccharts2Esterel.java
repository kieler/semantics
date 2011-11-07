package de.cau.cs.kieler.synccharts.codegen.esterel.xtend;

import com.google.inject.Inject;
import de.cau.cs.kieler.kies.esterel.EsterelFactory;
import de.cau.cs.kieler.kies.esterel.Module;
import de.cau.cs.kieler.kies.esterel.ModuleBody;
import de.cau.cs.kieler.kies.esterel.Pause;
import de.cau.cs.kieler.kies.esterel.Program;
import de.cau.cs.kieler.kies.esterel.Statement;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.codegen.esterel.xtend.Helper;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Synccharts2Esterel {
  
  @Inject
  private Helper helper;
  
  private final HashMap<ArrayList<?>,Program> _createCache_transform = new HashMap<ArrayList<?>,Program>();
  
  public Program transform(final Region root) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(root);
    Program target;
    synchronized (_createCache_transform) {
      if (_createCache_transform.containsKey(_cacheKey)) {
        return _createCache_transform.get(_cacheKey);
      }
      Program _createProgram = EsterelFactory.eINSTANCE.createProgram();
      target = _createProgram;
      _createCache_transform.put(_cacheKey, target);
    }
    {
      Module _createModule = EsterelFactory.eINSTANCE.createModule();
      Module module = _createModule;
      ModuleBody _createModuleBody = EsterelFactory.eINSTANCE.createModuleBody();
      ModuleBody body = _createModuleBody;
      Pause _createPause = EsterelFactory.eINSTANCE.createPause();
      Pause pause = _createPause;
      EList<Statement> _statements = body.getStatements();
      _statements.add(pause);
      module.setBody(body);
      EList<Module> _modules = target.getModules();
      _modules.add(module);
    }
    return target;
  }
}