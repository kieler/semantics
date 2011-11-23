package de.cau.cs.kieler.esterel.cec.sim.xtend;

import de.cau.cs.kieler.kies.esterel.EsterelFactory;
import de.cau.cs.kieler.kies.esterel.Module;
import de.cau.cs.kieler.kies.esterel.Program;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.util.stdlib.CloningExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Esterel2Simulation {
  
  private final HashMap<ArrayList<?>,Program> _createCache_transform2Simulation = new HashMap<ArrayList<?>,Program>();
  
  public Program transform2Simulation(final Program program) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(program);
    final Program _result;
    synchronized (_createCache_transform2Simulation) {
      if (_createCache_transform2Simulation.containsKey(_cacheKey)) {
        return _createCache_transform2Simulation.get(_cacheKey);
      }
      Program _createProgram = EsterelFactory.eINSTANCE.createProgram();
      _result = _createProgram;
      _createCache_transform2Simulation.put(_cacheKey, _result);
    }
    _init_transform2Simulation(_result, program);
    return _result;
  }
  private void _init_transform2Simulation(final Program target, final Program program) {
    EList<Module> _modules = program.getModules();
    for (final Module module : _modules) {
      EList<Module> _modules_1 = target.getModules();
      Object _clone = CloningExtensions.clone(module);
      _modules_1.add(((Module) _clone));
    }
  }
}