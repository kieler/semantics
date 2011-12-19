package de.cau.cs.kieler.esterel.cec.sim.xtend;

import de.cau.cs.kieler.core.kexpressions.ISignal;
import de.cau.cs.kieler.core.kexpressions.InterfaceSignalDecl;
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.core.kexpressions.Output;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.esterel.esterel.Abort;
import de.cau.cs.kieler.esterel.esterel.AbortInstance;
import de.cau.cs.kieler.esterel.esterel.Await;
import de.cau.cs.kieler.esterel.esterel.Block;
import de.cau.cs.kieler.esterel.esterel.DelayEvent;
import de.cau.cs.kieler.esterel.esterel.DelayExpr;
import de.cau.cs.kieler.esterel.esterel.Do;
import de.cau.cs.kieler.esterel.esterel.Emit;
import de.cau.cs.kieler.esterel.esterel.EsterelFactory;
import de.cau.cs.kieler.esterel.esterel.EveryDo;
import de.cau.cs.kieler.esterel.esterel.Exit;
import de.cau.cs.kieler.esterel.esterel.Halt;
import de.cau.cs.kieler.esterel.esterel.IfTest;
import de.cau.cs.kieler.esterel.esterel.LocalSignal;
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl;
import de.cau.cs.kieler.esterel.esterel.LocalSignalList;
import de.cau.cs.kieler.esterel.esterel.Loop;
import de.cau.cs.kieler.esterel.esterel.Module;
import de.cau.cs.kieler.esterel.esterel.ModuleBody;
import de.cau.cs.kieler.esterel.esterel.ModuleInterface;
import de.cau.cs.kieler.esterel.esterel.Nothing;
import de.cau.cs.kieler.esterel.esterel.Parallel;
import de.cau.cs.kieler.esterel.esterel.Pause;
import de.cau.cs.kieler.esterel.esterel.Present;
import de.cau.cs.kieler.esterel.esterel.Program;
import de.cau.cs.kieler.esterel.esterel.Repeat;
import de.cau.cs.kieler.esterel.esterel.Run;
import de.cau.cs.kieler.esterel.esterel.Sequence;
import de.cau.cs.kieler.esterel.esterel.Statement;
import de.cau.cs.kieler.esterel.esterel.StatementContainer;
import de.cau.cs.kieler.esterel.esterel.Suspend;
import de.cau.cs.kieler.esterel.esterel.Sustain;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.util.stdlib.CloningExtensions;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.EObjectExtensions;

@SuppressWarnings("all")
public class Esterel2Simulation {
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
  
  private final HashMap<ArrayList<?>,Program> _createCache_transform2Simulation = CollectionLiterals.newHashMap();
  
  private void _init_transform2Simulation(final Program target, final Program program) {
      String AUXILIARY_VARIABLE_TAG = "oESTERELoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo";
      EList<Module> _modules = program.getModules();
      for (final Module module : _modules) {
        EList<Module> _modules_1 = target.getModules();
        Object _clone = CloningExtensions.clone(module);
        _modules_1.add(((Module) _clone));
      }
      Iterable<EObject> _allContentsIterable = EObjectExtensions.allContentsIterable(program);
      Iterable<Statement> _filter = IterableExtensions.<Statement>filter(_allContentsIterable, de.cau.cs.kieler.esterel.esterel.Statement.class);
      Iterable<Statement> originalStatements = _filter;
      Iterable<EObject> _allContentsIterable_1 = EObjectExtensions.allContentsIterable(target);
      Iterable<Statement> _filter_1 = IterableExtensions.<Statement>filter(_allContentsIterable_1, de.cau.cs.kieler.esterel.esterel.Statement.class);
      Iterable<Statement> targetStatements = _filter_1;
      List<Statement> _list = IterableExtensions.<Statement>toList(targetStatements);
      List<Statement> targetStatementsCopy = _list;
      Iterable<EObject> _allContentsIterable_2 = EObjectExtensions.allContentsIterable(target);
      Iterable<Module> _filter_2 = IterableExtensions.<Module>filter(_allContentsIterable_2, de.cau.cs.kieler.esterel.esterel.Module.class);
      List<Module> _list_1 = IterableExtensions.<Module>toList(_filter_2);
      Module _get = _list_1.get(0);
      Module targetMainmodule = _get;
      ModuleInterface _interface = targetMainmodule.getInterface();
      boolean _operator_equals = ObjectExtensions.operator_equals(_interface, null);
      if (_operator_equals) {
        {
          ModuleInterface _createModuleInterface = EsterelFactory.eINSTANCE.createModuleInterface();
          ModuleInterface moduleInterface = _createModuleInterface;
          targetMainmodule.setInterface(moduleInterface);
        }
      }
      int i = 0;
      List<Statement> _list_2 = IterableExtensions.<Statement>toList(originalStatements);
      List<Statement> originalStatementsList = _list_2;
      for (final Statement targetStatement : targetStatementsCopy) {
        {
          Statement _get_1 = originalStatementsList.get(i);
          Statement originalStatement = _get_1;
          int _operator_plus = IntegerExtensions.operator_plus(((Integer)i), ((Integer)1));
          i = _operator_plus;
          Resource _eResource = originalStatement.eResource();
          String _uRIFragment = _eResource.getURIFragment(originalStatement);
          int _hashCode = _uRIFragment.hashCode();
          String _string = ((Integer)_hashCode).toString();
          String _replace = _string.replace("-", "M");
          String _operator_plus_1 = StringExtensions.operator_plus(AUXILIARY_VARIABLE_TAG, _replace);
          String statementUID = _operator_plus_1;
          this.transformStatement(targetStatement, targetMainmodule, statementUID);
        }
      }
  }
  
  public Pause createPause(final Object object) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(object);
    final Pause _result;
    synchronized (_createCache_createPause) {
      if (_createCache_createPause.containsKey(_cacheKey)) {
        return _createCache_createPause.get(_cacheKey);
      }
      Pause _createPause = EsterelFactory.eINSTANCE.createPause();
      _result = _createPause;
      _createCache_createPause.put(_cacheKey, _result);
    }
    _init_createPause(_result, object);
    return _result;
  }
  
  private final HashMap<ArrayList<?>,Pause> _createCache_createPause = CollectionLiterals.newHashMap();
  
  private void _init_createPause(final Pause pause, final Object object) {
  }
  
  public Parallel createParallel(final Object object) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(object);
    final Parallel _result;
    synchronized (_createCache_createParallel) {
      if (_createCache_createParallel.containsKey(_cacheKey)) {
        return _createCache_createParallel.get(_cacheKey);
      }
      Parallel _createParallel = EsterelFactory.eINSTANCE.createParallel();
      _result = _createParallel;
      _createCache_createParallel.put(_cacheKey, _result);
    }
    _init_createParallel(_result, object);
    return _result;
  }
  
  private final HashMap<ArrayList<?>,Parallel> _createCache_createParallel = CollectionLiterals.newHashMap();
  
  private void _init_createParallel(final Parallel parallel, final Object object) {
  }
  
  public Sequence createSequence(final Object object) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(object);
    final Sequence _result;
    synchronized (_createCache_createSequence) {
      if (_createCache_createSequence.containsKey(_cacheKey)) {
        return _createCache_createSequence.get(_cacheKey);
      }
      Sequence _createSequence = EsterelFactory.eINSTANCE.createSequence();
      _result = _createSequence;
      _createCache_createSequence.put(_cacheKey, _result);
    }
    _init_createSequence(_result, object);
    return _result;
  }
  
  private final HashMap<ArrayList<?>,Sequence> _createCache_createSequence = CollectionLiterals.newHashMap();
  
  private void _init_createSequence(final Sequence sequence, final Object object) {
  }
  
  public ModuleInterface createModuleInterface(final Object object) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(object);
    final ModuleInterface _result;
    synchronized (_createCache_createModuleInterface) {
      if (_createCache_createModuleInterface.containsKey(_cacheKey)) {
        return _createCache_createModuleInterface.get(_cacheKey);
      }
      ModuleInterface _createModuleInterface = EsterelFactory.eINSTANCE.createModuleInterface();
      _result = _createModuleInterface;
      _createCache_createModuleInterface.put(_cacheKey, _result);
    }
    _init_createModuleInterface(_result, object);
    return _result;
  }
  
  private final HashMap<ArrayList<?>,ModuleInterface> _createCache_createModuleInterface = CollectionLiterals.newHashMap();
  
  private void _init_createModuleInterface(final ModuleInterface sequence, final Object object) {
  }
  
  public void transformStatementSimple(final Statement statement, final Module mainmodule, final String UID) {
    boolean _operator_or = false;
    boolean _operator_or_1 = false;
    boolean _operator_or_2 = false;
    boolean _operator_or_3 = false;
    boolean _operator_or_4 = false;
    boolean _operator_or_5 = false;
    boolean _operator_or_6 = false;
    boolean _operator_or_7 = false;
    boolean _operator_or_8 = false;
    boolean _operator_or_9 = false;
    boolean _operator_or_10 = false;
    boolean _operator_or_11 = false;
    boolean _operator_or_12 = false;
    boolean _operator_or_13 = false;
    boolean _operator_or_14 = false;
    if ((statement instanceof Abort)) {
      _operator_or_14 = true;
    } else {
      _operator_or_14 = BooleanExtensions.operator_or((statement instanceof Abort), (statement instanceof Await));
    }
    if (_operator_or_14) {
      _operator_or_13 = true;
    } else {
      _operator_or_13 = BooleanExtensions.operator_or(_operator_or_14, (statement instanceof Do));
    }
    if (_operator_or_13) {
      _operator_or_12 = true;
    } else {
      _operator_or_12 = BooleanExtensions.operator_or(_operator_or_13, (statement instanceof Emit));
    }
    if (_operator_or_12) {
      _operator_or_11 = true;
    } else {
      _operator_or_11 = BooleanExtensions.operator_or(_operator_or_12, (statement instanceof EveryDo));
    }
    if (_operator_or_11) {
      _operator_or_10 = true;
    } else {
      _operator_or_10 = BooleanExtensions.operator_or(_operator_or_11, (statement instanceof Exit));
    }
    if (_operator_or_10) {
      _operator_or_9 = true;
    } else {
      _operator_or_9 = BooleanExtensions.operator_or(_operator_or_10, (statement instanceof Halt));
    }
    if (_operator_or_9) {
      _operator_or_8 = true;
    } else {
      _operator_or_8 = BooleanExtensions.operator_or(_operator_or_9, (statement instanceof IfTest));
    }
    if (_operator_or_8) {
      _operator_or_7 = true;
    } else {
      _operator_or_7 = BooleanExtensions.operator_or(_operator_or_8, (statement instanceof Loop));
    }
    if (_operator_or_7) {
      _operator_or_6 = true;
    } else {
      _operator_or_6 = BooleanExtensions.operator_or(_operator_or_7, (statement instanceof Nothing));
    }
    if (_operator_or_6) {
      _operator_or_5 = true;
    } else {
      _operator_or_5 = BooleanExtensions.operator_or(_operator_or_6, (statement instanceof Pause));
    }
    if (_operator_or_5) {
      _operator_or_4 = true;
    } else {
      _operator_or_4 = BooleanExtensions.operator_or(_operator_or_5, (statement instanceof Present));
    }
    if (_operator_or_4) {
      _operator_or_3 = true;
    } else {
      _operator_or_3 = BooleanExtensions.operator_or(_operator_or_4, (statement instanceof Repeat));
    }
    if (_operator_or_3) {
      _operator_or_2 = true;
    } else {
      _operator_or_2 = BooleanExtensions.operator_or(_operator_or_3, (statement instanceof Run));
    }
    if (_operator_or_2) {
      _operator_or_1 = true;
    } else {
      _operator_or_1 = BooleanExtensions.operator_or(_operator_or_2, (statement instanceof Suspend));
    }
    if (_operator_or_1) {
      _operator_or = true;
    } else {
      _operator_or = BooleanExtensions.operator_or(_operator_or_1, (statement instanceof Sustain));
    }
    if (_operator_or) {
      {
        EObject _eContainer = statement.eContainer();
        EObject container = _eContainer;
        Block _createBlock = EsterelFactory.eINSTANCE.createBlock();
        Block blockStatement = _createBlock;
        this.addStatement(blockStatement, statement);
        this.addStatement(container, blockStatement);
      }
    }
  }
  
  public void transformStatement(final Statement statement, final Module mainmodule, final String UID) {
      EObject _eContainer = statement.eContainer();
      EObject container = _eContainer;
      Parallel _createParallel = EsterelFactory.eINSTANCE.createParallel();
      Parallel parallelStatement = _createParallel;
      Pause _createPause = EsterelFactory.eINSTANCE.createPause();
      Pause pauseStatement = _createPause;
      Sequence _createSequence = EsterelFactory.eINSTANCE.createSequence();
      Sequence sequenceStatement1 = _createSequence;
      Sequence _createSequence_1 = EsterelFactory.eINSTANCE.createSequence();
      Sequence sequenceStatement2 = _createSequence_1;
      Block _createBlock = EsterelFactory.eINSTANCE.createBlock();
      Block blockStatement = _createBlock;
      Block _createBlock_1 = EsterelFactory.eINSTANCE.createBlock();
      Block blockStatement2 = _createBlock_1;
      LocalSignalDecl _createLocalSignalDecl = EsterelFactory.eINSTANCE.createLocalSignalDecl();
      LocalSignalDecl abortSignalDecl = _createLocalSignalDecl;
      LocalSignal _createLocalSignal = EsterelFactory.eINSTANCE.createLocalSignal();
      LocalSignal abortSignalLink = _createLocalSignal;
      ISignal _createISignal = KExpressionsFactory.eINSTANCE.createISignal();
      ISignal abortISignal = _createISignal;
      Emit _createEmit = EsterelFactory.eINSTANCE.createEmit();
      Emit abortEmitStatement = _createEmit;
      ISignal _createISignal_1 = KExpressionsFactory.eINSTANCE.createISignal();
      ISignal auxiliarySignalISignal = _createISignal_1;
      Output _createOutput = KExpressionsFactory.eINSTANCE.createOutput();
      Output auxiliarySignalOutput = _createOutput;
      Emit _createEmit_1 = EsterelFactory.eINSTANCE.createEmit();
      Emit auxiliaryEmitStatement = _createEmit_1;
      Sustain _createSustain = EsterelFactory.eINSTANCE.createSustain();
      Sustain auxiliarySustainStatement = _createSustain;
      Abort _createAbort = EsterelFactory.eINSTANCE.createAbort();
      Abort abortStatement = _createAbort;
      AbortInstance _createAbortInstance = EsterelFactory.eINSTANCE.createAbortInstance();
      AbortInstance abortInstanceStatement = _createAbortInstance;
      DelayExpr _createDelayExpr = EsterelFactory.eINSTANCE.createDelayExpr();
      DelayExpr abortDelay = _createDelayExpr;
      DelayEvent _createDelayEvent = EsterelFactory.eINSTANCE.createDelayEvent();
      DelayEvent abortDelayEvent = _createDelayEvent;
      ValuedObjectReference _createValuedObjectReference = KExpressionsFactory.eINSTANCE.createValuedObjectReference();
      ValuedObjectReference abortValuedObjectReference = _createValuedObjectReference;
      boolean _operator_or = false;
      boolean _operator_or_1 = false;
      boolean _operator_or_2 = false;
      boolean _operator_or_3 = false;
      boolean _operator_or_4 = false;
      boolean _operator_or_5 = false;
      boolean _operator_or_6 = false;
      boolean _operator_or_7 = false;
      boolean _operator_or_8 = false;
      boolean _operator_or_9 = false;
      boolean _operator_or_10 = false;
      boolean _operator_or_11 = false;
      boolean _operator_or_12 = false;
      boolean _operator_or_13 = false;
      boolean _operator_or_14 = false;
      if ((statement instanceof Abort)) {
        _operator_or_14 = true;
      } else {
        _operator_or_14 = BooleanExtensions.operator_or((statement instanceof Abort), (statement instanceof Await));
      }
      if (_operator_or_14) {
        _operator_or_13 = true;
      } else {
        _operator_or_13 = BooleanExtensions.operator_or(_operator_or_14, (statement instanceof Do));
      }
      if (_operator_or_13) {
        _operator_or_12 = true;
      } else {
        _operator_or_12 = BooleanExtensions.operator_or(_operator_or_13, (statement instanceof Emit));
      }
      if (_operator_or_12) {
        _operator_or_11 = true;
      } else {
        _operator_or_11 = BooleanExtensions.operator_or(_operator_or_12, (statement instanceof EveryDo));
      }
      if (_operator_or_11) {
        _operator_or_10 = true;
      } else {
        _operator_or_10 = BooleanExtensions.operator_or(_operator_or_11, (statement instanceof Exit));
      }
      if (_operator_or_10) {
        _operator_or_9 = true;
      } else {
        _operator_or_9 = BooleanExtensions.operator_or(_operator_or_10, (statement instanceof Halt));
      }
      if (_operator_or_9) {
        _operator_or_8 = true;
      } else {
        _operator_or_8 = BooleanExtensions.operator_or(_operator_or_9, (statement instanceof IfTest));
      }
      if (_operator_or_8) {
        _operator_or_7 = true;
      } else {
        _operator_or_7 = BooleanExtensions.operator_or(_operator_or_8, (statement instanceof Loop));
      }
      if (_operator_or_7) {
        _operator_or_6 = true;
      } else {
        _operator_or_6 = BooleanExtensions.operator_or(_operator_or_7, (statement instanceof Nothing));
      }
      if (_operator_or_6) {
        _operator_or_5 = true;
      } else {
        _operator_or_5 = BooleanExtensions.operator_or(_operator_or_6, (statement instanceof Pause));
      }
      if (_operator_or_5) {
        _operator_or_4 = true;
      } else {
        _operator_or_4 = BooleanExtensions.operator_or(_operator_or_5, (statement instanceof Present));
      }
      if (_operator_or_4) {
        _operator_or_3 = true;
      } else {
        _operator_or_3 = BooleanExtensions.operator_or(_operator_or_4, (statement instanceof Repeat));
      }
      if (_operator_or_3) {
        _operator_or_2 = true;
      } else {
        _operator_or_2 = BooleanExtensions.operator_or(_operator_or_3, (statement instanceof Run));
      }
      if (_operator_or_2) {
        _operator_or_1 = true;
      } else {
        _operator_or_1 = BooleanExtensions.operator_or(_operator_or_2, (statement instanceof Suspend));
      }
      if (_operator_or_1) {
        _operator_or = true;
      } else {
        _operator_or = BooleanExtensions.operator_or(_operator_or_1, (statement instanceof Sustain));
      }
      if (_operator_or) {
        {
          int _hashCode = statement.hashCode();
          String _string = ((Integer)_hashCode).toString();
          String _replace = _string.replace("-", "M");
          String _operator_plus = StringExtensions.operator_plus("AP", _replace);
          abortISignal.setName(_operator_plus);
          abortISignal.setIsInput(false);
          abortISignal.setIsOutput(false);
          abortISignal.setType(ValueType.PURE);
          EList<ISignal> _signal = abortSignalLink.getSignal();
          _signal.add(abortISignal);
          abortSignalDecl.setSignalList(((LocalSignalList) abortSignalLink));
          abortEmitStatement.setSignal(abortISignal);
          auxiliarySignalISignal.setName(UID);
          auxiliarySignalISignal.setIsInput(false);
          auxiliarySignalISignal.setIsOutput(false);
          auxiliarySignalISignal.setType(ValueType.PURE);
          EList<ISignal> _signals = auxiliarySignalOutput.getSignals();
          _signals.add(auxiliarySignalISignal);
          ModuleInterface _interface = mainmodule.getInterface();
          EList<InterfaceSignalDecl> _intSignalDecls = _interface.getIntSignalDecls();
          _intSignalDecls.add(auxiliarySignalOutput);
          auxiliaryEmitStatement.setSignal(auxiliarySignalISignal);
          auxiliarySustainStatement.setSignal(auxiliarySignalISignal);
          abortStatement.setStatement(auxiliarySustainStatement);
          abortValuedObjectReference.setValuedObject(abortISignal);
          abortDelayEvent.setExpr(abortValuedObjectReference);
          abortDelay.setEvent(abortDelayEvent);
          abortDelay.setIsImmediate(true);
          abortInstanceStatement.setDelay(abortDelay);
          abortStatement.setBody(abortInstanceStatement);
          EList<Statement> _list = sequenceStatement2.getList();
          _list.add(auxiliaryEmitStatement);
          EList<Statement> _list_1 = sequenceStatement2.getList();
          _list_1.add(abortStatement);
          EList<Statement> _list_2 = sequenceStatement1.getList();
          _list_2.add(statement);
          EList<Statement> _list_3 = sequenceStatement1.getList();
          _list_3.add(abortEmitStatement);
          EList<Statement> _list_4 = parallelStatement.getList();
          _list_4.add(sequenceStatement1);
          EList<Statement> _list_5 = parallelStatement.getList();
          _list_5.add(sequenceStatement2);
          this.addStatement(blockStatement, parallelStatement);
          this.addStatement(abortSignalDecl, blockStatement);
          this.addStatement(blockStatement2, abortSignalDecl);
          this.addStatement(container, blockStatement2);
        }
      }
  }
  
  protected void _addStatement(final ModuleBody parent, final Statement addStatement) {
      EList<Statement> _statements = parent.getStatements();
      _statements.clear();
      EList<Statement> _statements_1 = parent.getStatements();
      _statements_1.add(addStatement);
  }
  
  protected void _addStatement(final Parallel parent, final Statement addStatement) {
    EList<Statement> _list = parent.getList();
    _list.add(addStatement);
  }
  
  protected void _addStatement(final Sequence parent, final Statement addStatement) {
    EList<Statement> _list = parent.getList();
    _list.add(addStatement);
  }
  
  protected void _addStatement(final StatementContainer parent, final Statement addStatement) {
    parent.setStatement(addStatement);
  }
  
  public void addStatement(final EObject parent, final Statement addStatement) {
    if (parent instanceof Parallel) {
      _addStatement((Parallel)parent, addStatement);
    } else if (parent instanceof Sequence) {
      _addStatement((Sequence)parent, addStatement);
    } else if (parent instanceof ModuleBody) {
      _addStatement((ModuleBody)parent, addStatement);
    } else if (parent instanceof StatementContainer) {
      _addStatement((StatementContainer)parent, addStatement);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(parent, addStatement).toString());
    }
  }
}
