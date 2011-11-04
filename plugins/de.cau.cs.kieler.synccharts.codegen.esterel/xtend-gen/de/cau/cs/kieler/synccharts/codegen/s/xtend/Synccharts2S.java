package de.cau.cs.kieler.synccharts.codegen.s.xtend;

import com.google.inject.Inject;
import de.cau.cs.kieler.core.kexpressions.CombineOperator;
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.s.s.Halt;
import de.cau.cs.kieler.s.s.Instruction;
import de.cau.cs.kieler.s.s.Pause;
import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.s.s.SFactory;
import de.cau.cs.kieler.s.s.Term;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.codegen.s.xtend.Helper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Synccharts2S {
  
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
      Program _createProgram = SFactory.eINSTANCE.createProgram();
      target = _createProgram;
      _createCache_transform.put(_cacheKey, target);
    }
    {
      EList<State> _states = root.getStates();
      State _head = IterableExtensions.<State>head(_states);
      String _id = _head.getId();
      String _operator_plus = StringExtensions.operator_plus(_id, "BLABLA");
      target.setName(_operator_plus);
      List<State> _allStates = this.getAllStates(root);
      for (State state : _allStates) {
        EList<de.cau.cs.kieler.s.s.State> _states_1 = target.getStates();
        de.cau.cs.kieler.s.s.State _synccharts2sState = this.synccharts2sState(state);
        _states_1.add(_synccharts2sState);
      }
    }
    return target;
  }
  
  public List<State> getAllStates(final Region region) {
    List<State> _xblockexpression = null;
    {
      ArrayList<State> _arrayList = new ArrayList<State>();
      List<State> stateList = _arrayList;
      EList<State> _states = region.getStates();
      for (State state : _states) {
        {
          stateList.add(state);
          EList<Region> _regions = state.getRegions();
          for (Region regionsOfState : _regions) {
            List<State> _allStates = this.getAllStates(regionsOfState);
            stateList.addAll(_allStates);
          }
        }
      }
      _xblockexpression = (stateList);
    }
    return _xblockexpression;
  }
  
  public List<State> getAllStatesOfRegion(final Region region) {
    EList<State> _states = region.getStates();
    return _states;
  }
  
  public List<Region> getAllRegionsOfState(final State state) {
    EList<Region> _regions = state.getRegions();
    return _regions;
  }
  
  private final HashMap<ArrayList<?>,de.cau.cs.kieler.s.s.State> _createCache_synccharts2sState = new HashMap<ArrayList<?>,de.cau.cs.kieler.s.s.State>();
  
  public de.cau.cs.kieler.s.s.State synccharts2sState(final State state) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(state);
    de.cau.cs.kieler.s.s.State target;
    synchronized (_createCache_synccharts2sState) {
      if (_createCache_synccharts2sState.containsKey(_cacheKey)) {
        return _createCache_synccharts2sState.get(_cacheKey);
      }
      de.cau.cs.kieler.s.s.State _createState = SFactory.eINSTANCE.createState();
      target = _createState;
      _createCache_synccharts2sState.put(_cacheKey, target);
    }
    {
      String _statePathAsName = this.helper.getStatePathAsName(state);
      target.setName(_statePathAsName);
      EList<Signal> _signals = target.getSignals();
      List<Signal> _stateSignals = this.getStateSignals(state);
      _signals.addAll(_stateSignals);
      boolean _operator_and = false;
      EList<Transition> _outgoingTransitions = state.getOutgoingTransitions();
      boolean _isEmpty = _outgoingTransitions.isEmpty();
      if (!_isEmpty) {
        _operator_and = false;
      } else {
        boolean _isIsFinal = state.isIsFinal();
        _operator_and = BooleanExtensions.operator_and(_isEmpty, _isIsFinal);
      }
      if (_operator_and) {
        EList<Instruction> _instructions = target.getInstructions();
        Term _termInstruction = this.getTermInstruction(state);
        CollectionExtensions.<Term>addAll(_instructions, _termInstruction);
      }
      boolean _operator_and_1 = false;
      EList<Transition> _outgoingTransitions_1 = state.getOutgoingTransitions();
      boolean _isEmpty_1 = _outgoingTransitions_1.isEmpty();
      if (!_isEmpty_1) {
        _operator_and_1 = false;
      } else {
        boolean _isIsFinal_1 = state.isIsFinal();
        boolean _operator_not = BooleanExtensions.operator_not(_isIsFinal_1);
        _operator_and_1 = BooleanExtensions.operator_and(_isEmpty_1, _operator_not);
      }
      if (_operator_and_1) {
        EList<Instruction> _instructions_1 = target.getInstructions();
        Halt _haltInstruction = this.getHaltInstruction(state);
        CollectionExtensions.<Halt>addAll(_instructions_1, _haltInstruction);
      }
      boolean _operator_or = false;
      boolean _isIsFinal_2 = state.isIsFinal();
      if (_isIsFinal_2) {
        _operator_or = true;
      } else {
        EList<Transition> _outgoingTransitions_2 = state.getOutgoingTransitions();
        boolean _isEmpty_2 = _outgoingTransitions_2.isEmpty();
        _operator_or = BooleanExtensions.operator_or(_isIsFinal_2, _isEmpty_2);
      }
      boolean _operator_not_1 = BooleanExtensions.operator_not(_operator_or);
      if (_operator_not_1) {
        EList<Instruction> _instructions_2 = target.getInstructions();
        Pause _pauseInstruction = this.getPauseInstruction(state);
        CollectionExtensions.<Pause>addAll(_instructions_2, _pauseInstruction);
      }
    }
    return target;
  }
  
  private final HashMap<ArrayList<?>,Term> _createCache_getTermInstruction = new HashMap<ArrayList<?>,Term>();
  
  public Term getTermInstruction(final State state) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(state);
    Term target;
    synchronized (_createCache_getTermInstruction) {
      if (_createCache_getTermInstruction.containsKey(_cacheKey)) {
        return _createCache_getTermInstruction.get(_cacheKey);
      }
      Term _createTerm = SFactory.eINSTANCE.createTerm();
      target = _createTerm;
      _createCache_getTermInstruction.put(_cacheKey, target);
    }
    return target;
  }
  
  private final HashMap<ArrayList<?>,Halt> _createCache_getHaltInstruction = new HashMap<ArrayList<?>,Halt>();
  
  public Halt getHaltInstruction(final State state) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(state);
    Halt target;
    synchronized (_createCache_getHaltInstruction) {
      if (_createCache_getHaltInstruction.containsKey(_cacheKey)) {
        return _createCache_getHaltInstruction.get(_cacheKey);
      }
      Halt _createHalt = SFactory.eINSTANCE.createHalt();
      target = _createHalt;
      _createCache_getHaltInstruction.put(_cacheKey, target);
    }
    return target;
  }
  
  private final HashMap<ArrayList<?>,Pause> _createCache_getPauseInstruction = new HashMap<ArrayList<?>,Pause>();
  
  public Pause getPauseInstruction(final State state) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(state);
    Pause target;
    synchronized (_createCache_getPauseInstruction) {
      if (_createCache_getPauseInstruction.containsKey(_cacheKey)) {
        return _createCache_getPauseInstruction.get(_cacheKey);
      }
      Pause _createPause = SFactory.eINSTANCE.createPause();
      target = _createPause;
      _createCache_getPauseInstruction.put(_cacheKey, target);
    }
    return target;
  }
  
  public List<Signal> getStateSignals(final State state) {
    List<Signal> _xblockexpression = null;
    {
      ArrayList<Signal> _arrayList = new ArrayList<Signal>();
      List<Signal> signalList = _arrayList;
      EList<Signal> _signals = state.getSignals();
      for (Signal signalOfState : _signals) {
        Signal _transform = this.transform(signalOfState);
        signalList.add(_transform);
      }
      _xblockexpression = (signalList);
    }
    return _xblockexpression;
  }
  
  private final HashMap<ArrayList<?>,Signal> _createCache_transform_1 = new HashMap<ArrayList<?>,Signal>();
  
  public Signal transform(final Signal signal) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(signal);
    Signal target;
    synchronized (_createCache_transform_1) {
      if (_createCache_transform_1.containsKey(_cacheKey)) {
        return _createCache_transform_1.get(_cacheKey);
      }
      Signal _createSignal = KExpressionsFactory.eINSTANCE.createSignal();
      target = _createSignal;
      _createCache_transform_1.put(_cacheKey, target);
    }
    {
      CombineOperator _combineOperator = signal.getCombineOperator();
      target.setCombineOperator(_combineOperator);
      String _name = signal.getName();
      target.setName(_name);
      String _hostType = signal.getHostType();
      target.setHostType(_hostType);
      String _initialValue = signal.getInitialValue();
      target.setInitialValue(_initialValue);
      boolean _isIsInput = signal.isIsInput();
      target.setIsInput(_isIsInput);
      boolean _isIsOutput = signal.isIsOutput();
      target.setIsOutput(_isIsOutput);
      ValueType _type = signal.getType();
      target.setType(_type);
    }
    return target;
  }
}