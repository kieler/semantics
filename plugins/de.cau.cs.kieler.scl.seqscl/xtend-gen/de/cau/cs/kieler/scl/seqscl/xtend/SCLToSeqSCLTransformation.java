package de.cau.cs.kieler.scl.seqscl.xtend;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.inject.Guice;
import com.google.inject.Injector;
import de.cau.cs.kieler.scl.basicblocks.BasicBlock;
import de.cau.cs.kieler.scl.extensions.SCLBasicBlockExtensions;
import de.cau.cs.kieler.scl.extensions.SCLCreateExtensions;
import de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions;
import de.cau.cs.kieler.scl.extensions.SCLFactoryExtensions;
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions;
import de.cau.cs.kieler.scl.scl.Assignment;
import de.cau.cs.kieler.scl.scl.Conditional;
import de.cau.cs.kieler.scl.scl.Instruction;
import de.cau.cs.kieler.scl.scl.InstructionStatement;
import de.cau.cs.kieler.scl.scl.Program;
import de.cau.cs.kieler.scl.scl.SclFactory;
import de.cau.cs.kieler.scl.scl.Statement;
import de.cau.cs.kieler.scl.scl.VariableDeclaration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.yakindu.sct.model.stext.stext.AssignmentExpression;
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression;
import org.yakindu.sct.model.stext.stext.Expression;
import org.yakindu.sct.model.stext.stext.LogicalNotExpression;
import org.yakindu.sct.model.stext.stext.ParenthesizedExpression;
import org.yakindu.sct.model.stext.stext.StextFactory;

@SuppressWarnings("all")
public class SCLToSeqSCLTransformation {
  private SCLFactoryExtensions SCLFactoryExtensions = new Function0<SCLFactoryExtensions>() {
    public SCLFactoryExtensions apply() {
      Injector _createInjector = Guice.createInjector();
      SCLFactoryExtensions _instance = _createInjector.<SCLFactoryExtensions>getInstance(SCLFactoryExtensions.class);
      return _instance;
    }
  }.apply();
  
  private SCLCreateExtensions SCLCreateExtensions = new Function0<SCLCreateExtensions>() {
    public SCLCreateExtensions apply() {
      Injector _createInjector = Guice.createInjector();
      SCLCreateExtensions _instance = _createInjector.<SCLCreateExtensions>getInstance(SCLCreateExtensions.class);
      return _instance;
    }
  }.apply();
  
  private SCLBasicBlockExtensions SCLBasicBlockExtensions = new Function0<SCLBasicBlockExtensions>() {
    public SCLBasicBlockExtensions apply() {
      Injector _createInjector = Guice.createInjector();
      SCLBasicBlockExtensions _instance = _createInjector.<SCLBasicBlockExtensions>getInstance(SCLBasicBlockExtensions.class);
      return _instance;
    }
  }.apply();
  
  private SCLExpressionExtensions SCLExpressionExtensions = new Function0<SCLExpressionExtensions>() {
    public SCLExpressionExtensions apply() {
      Injector _createInjector = Guice.createInjector();
      SCLExpressionExtensions _instance = _createInjector.<SCLExpressionExtensions>getInstance(SCLExpressionExtensions.class);
      return _instance;
    }
  }.apply();
  
  private SCLStatementExtensions SCLStatementExtensions = new Function0<SCLStatementExtensions>() {
    public SCLStatementExtensions apply() {
      Injector _createInjector = Guice.createInjector();
      SCLStatementExtensions _instance = _createInjector.<SCLStatementExtensions>getInstance(SCLStatementExtensions.class);
      return _instance;
    }
  }.apply();
  
  public Program transformSCLToSCLControlflow(final Program program) {
    Program _xblockexpression = null;
    {
      SclFactory _SCL = this.SCLFactoryExtensions.SCL();
      final Program targetProgram = _SCL.createProgram();
      String _name = program.getName();
      String _plus = (_name + "_tick");
      targetProgram.setName(_plus);
      EList<VariableDeclaration> _declarations = targetProgram.getDeclarations();
      EList<VariableDeclaration> _declarations_1 = program.getDeclarations();
      Collection<VariableDeclaration> _copyAll = EcoreUtil.<VariableDeclaration>copyAll(_declarations_1);
      _declarations.addAll(_copyAll);
      EList<VariableDeclaration> _declarations_2 = targetProgram.getDeclarations();
      VariableDeclaration _createVariableDeclaration = this.SCLCreateExtensions.createVariableDeclaration("GO", "boolean");
      _declarations_2.add(_createVariableDeclaration);
      EList<Statement> _statements = program.getStatements();
      Statement _head = IterableExtensions.<Statement>head(_statements);
      List<BasicBlock> basicBlocks = this.SCLBasicBlockExtensions.getAllBasicBlocks(_head);
      for (final BasicBlock basicBlock : basicBlocks) {
        {
          EList<VariableDeclaration> _declarations_3 = targetProgram.getDeclarations();
          String _basicBlockName = this.SCLBasicBlockExtensions.getBasicBlockName(basicBlock);
          VariableDeclaration _createVariableDeclaration_1 = this.SCLCreateExtensions.createVariableDeclaration(_basicBlockName, "boolean");
          _declarations_3.add(_createVariableDeclaration_1);
          boolean _isPauseSurface = this.SCLBasicBlockExtensions.isPauseSurface(basicBlock);
          if (_isPauseSurface) {
            EList<VariableDeclaration> _declarations_4 = targetProgram.getDeclarations();
            String _basicBlockName_1 = this.SCLBasicBlockExtensions.getBasicBlockName(basicBlock);
            String _plus_1 = (_basicBlockName_1 + "_pre");
            VariableDeclaration _createVariableDeclaration_2 = this.SCLCreateExtensions.createVariableDeclaration(_plus_1, "boolean");
            _declarations_4.add(_createVariableDeclaration_2);
          }
          boolean _isParallelJoin = this.SCLBasicBlockExtensions.isParallelJoin(basicBlock);
          if (_isParallelJoin) {
            List<BasicBlock> _basicBlockPredecessor = this.SCLBasicBlockExtensions.getBasicBlockPredecessor(basicBlock);
            for (final BasicBlock pred : _basicBlockPredecessor) {
              EList<VariableDeclaration> _declarations_5 = targetProgram.getDeclarations();
              String _emptyBlockName = this.SCLBasicBlockExtensions.getEmptyBlockName(pred);
              VariableDeclaration _createVariableDeclaration_3 = this.SCLCreateExtensions.createVariableDeclaration(_emptyBlockName, "boolean");
              _declarations_5.add(_createVariableDeclaration_3);
            }
          }
        }
      }
      boolean changed = false;
      EList<Statement> _statements_1 = program.getStatements();
      Statement _head_1 = IterableExtensions.<Statement>head(_statements_1);
      List<BasicBlock> basicBlockPool = this.SCLBasicBlockExtensions.getAllBasicBlocks(_head_1);
      int _size = basicBlockPool.size();
      boolean _greaterThan = (_size > 0);
      boolean _while = _greaterThan;
      while (_while) {
        {
          changed = false;
          final ImmutableList<BasicBlock> tempPool = ImmutableList.<BasicBlock>copyOf(basicBlockPool);
          for (final BasicBlock basicBlock_1 : tempPool) {
            {
              List<BasicBlock> predecessors = this.SCLBasicBlockExtensions.getBasicBlockPredecessor(basicBlock_1);
              List<BasicBlock> depPredecessors = this.SCLBasicBlockExtensions.getBasicBlockDependencyPredecessors(basicBlock_1);
              boolean ready = true;
              for (final BasicBlock pred : predecessors) {
                {
                  boolean _and = false;
                  boolean _isPauseSurface = this.SCLBasicBlockExtensions.isPauseSurface(pred);
                  boolean _not = (!_isPauseSurface);
                  if (!_not) {
                    _and = false;
                  } else {
                    boolean _containsEqual = this.SCLBasicBlockExtensions.containsEqual(basicBlockPool, pred);
                    _and = (_not && _containsEqual);
                  }
                  if (_and) {
                    ready = false;
                  }
                  boolean _isParallelJoin = this.SCLBasicBlockExtensions.isParallelJoin(basicBlock_1);
                  if (_isParallelJoin) {
                    Statement _head_2 = pred.getHead();
                    final List<BasicBlock> guards = this.SCLBasicBlockExtensions.getBasicBlocks(_head_2);
                    for (final BasicBlock guard : guards) {
                      boolean _containsEqual_1 = this.SCLBasicBlockExtensions.containsEqual(basicBlockPool, guard);
                      if (_containsEqual_1) {
                        ready = false;
                      }
                    }
                  }
                }
              }
              for (final BasicBlock pred_1 : depPredecessors) {
                boolean _and = false;
                Statement _head_2 = pred_1.getHead();
                boolean _isPauseSurface = this.SCLBasicBlockExtensions.isPauseSurface(_head_2);
                boolean _not = (!_isPauseSurface);
                if (!_not) {
                  _and = false;
                } else {
                  boolean _containsEqual = this.SCLBasicBlockExtensions.containsEqual(basicBlockPool, pred_1);
                  _and = (_not && _containsEqual);
                }
                if (_and) {
                  ready = false;
                }
              }
              if (ready) {
                EList<Statement> _statements_2 = targetProgram.getStatements();
                List<Statement> _transformBasicBlock = this.transformBasicBlock(targetProgram, program, basicBlock_1);
                _statements_2.addAll(_transformBasicBlock);
                this.SCLBasicBlockExtensions.removeEqual(basicBlockPool, basicBlock_1);
                changed = true;
              }
            }
          }
          boolean _not = (!changed);
          if (_not) {
            this.SCLFactoryExtensions.Debug("SCL ERROR: Program not schedulable!");
            for (final BasicBlock pool : basicBlockPool) {
              String _basicBlockName = this.SCLBasicBlockExtensions.getBasicBlockName(pool);
              String _plus_1 = ("  not scheduled item: " + _basicBlockName);
              this.SCLFactoryExtensions.Debug(_plus_1);
            }
            return targetProgram;
          }
        }
        int _size_1 = basicBlockPool.size();
        boolean _greaterThan_1 = (_size_1 > 0);
        _while = _greaterThan_1;
      }
      for (final BasicBlock basicBlock_1 : basicBlocks) {
        boolean _isPauseSurface = this.SCLBasicBlockExtensions.isPauseSurface(basicBlock_1);
        if (_isPauseSurface) {
          EList<Statement> _statements_2 = targetProgram.getStatements();
          String _basicBlockName = this.SCLBasicBlockExtensions.getBasicBlockName(basicBlock_1);
          String _plus_1 = (_basicBlockName + "_pre");
          VariableDeclaration _declarationByName = this.getDeclarationByName(targetProgram, _plus_1);
          String _basicBlockName_1 = this.SCLBasicBlockExtensions.getBasicBlockName(basicBlock_1);
          VariableDeclaration _declarationByName_1 = this.getDeclarationByName(targetProgram, _basicBlockName_1);
          Assignment _createSCLAssignment = this.SCLCreateExtensions.createSCLAssignment(_declarationByName, _declarationByName_1);
          InstructionStatement _createStatement = this.SCLCreateExtensions.createStatement(_createSCLAssignment);
          _statements_2.add(_createStatement);
        }
      }
      _xblockexpression = (targetProgram);
    }
    return _xblockexpression;
  }
  
  public List<Statement> transformBasicBlock(final Program program, final Program sourceProgram, final BasicBlock basicBlock) {
    ArrayList<Statement> _xblockexpression = null;
    {
      ArrayList<Statement> newStatements = this.SCLCreateExtensions.createNewStatementList();
      final List<BasicBlock> predecessors = this.SCLBasicBlockExtensions.getBasicBlockPredecessor(basicBlock);
      boolean _isParallelJoin = this.SCLBasicBlockExtensions.isParallelJoin(basicBlock);
      if (_isParallelJoin) {
        Expression syncExp = null;
        Expression termExp = null;
        for (final BasicBlock pred : predecessors) {
          {
            Expression handleExp = null;
            StextFactory _SText = this.SCLFactoryExtensions.SText();
            final LogicalNotExpression emptyExp = _SText.createLogicalNotExpression();
            StextFactory _SText_1 = this.SCLFactoryExtensions.SText();
            final ParenthesizedExpression _parExp = _SText_1.createParenthesizedExpression();
            Expression innerExp = null;
            Statement _head = pred.getHead();
            final List<BasicBlock> guards = this.SCLBasicBlockExtensions.getBasicBlocks(_head);
            BasicBlock _head_1 = IterableExtensions.<BasicBlock>head(guards);
            final String predID = this.SCLBasicBlockExtensions.getBasicBlockName(_head_1);
            StextFactory _SText_2 = this.SCLFactoryExtensions.SText();
            ElementReferenceExpression _createElementReferenceExpression = _SText_2.createElementReferenceExpression();
            innerExp = ((Expression) _createElementReferenceExpression);
            VariableDeclaration _declarationByName = this.getDeclarationByName(program, predID);
            ((ElementReferenceExpression) innerExp).setReference(_declarationByName);
            int _size = guards.size();
            boolean _greaterThan = (_size > 1);
            if (_greaterThan) {
              int _size_1 = guards.size();
              int _minus = (_size_1 - 1);
              IntegerRange _upTo = new IntegerRange(1, _minus);
              for (final Integer i : _upTo) {
                {
                  BasicBlock _get = guards.get((i).intValue());
                  String predIDi = this.SCLBasicBlockExtensions.getBasicBlockName(_get);
                  VariableDeclaration _declarationByName_1 = this.getDeclarationByName(program, predIDi);
                  final Expression exp2 = this.SCLExpressionExtensions.createElementReferenceExpression(_declarationByName_1);
                  Expression _createOrExpression = this.SCLExpressionExtensions.createOrExpression(innerExp, exp2);
                  innerExp = _createOrExpression;
                }
              }
            }
            _parExp.setExpression(innerExp);
            emptyExp.setOperand(_parExp);
            for (final BasicBlock guard : guards) {
              boolean _isExitBlock = this.SCLBasicBlockExtensions.isExitBlock(guard);
              if (_isExitBlock) {
                String _basicBlockName = this.SCLBasicBlockExtensions.getBasicBlockName(guard);
                VariableDeclaration _declarationByName_1 = this.getDeclarationByName(program, _basicBlockName);
                Expression exitExp = this.SCLExpressionExtensions.createElementReferenceExpression(_declarationByName_1);
                boolean _and = false;
                boolean _isConditionalExitBlock = this.SCLBasicBlockExtensions.isConditionalExitBlock(guard);
                if (!_isConditionalExitBlock) {
                  _and = false;
                } else {
                  boolean _isConditionalExitBlockTrue = this.SCLBasicBlockExtensions.isConditionalExitBlockTrue(guard);
                  boolean _not = (!_isConditionalExitBlockTrue);
                  _and = (_isConditionalExitBlock && _not);
                }
                if (_and) {
                  Expression _conditionalExpression = this.SCLBasicBlockExtensions.getConditionalExpression(guard);
                  Expression _copy = EcoreUtil.<Expression>copy(_conditionalExpression);
                  Expression _negate = this.SCLExpressionExtensions.negate(_copy);
                  Expression _transformExpression = this.transformExpression(_negate, program, sourceProgram);
                  Expression _addAndExpression = this.SCLExpressionExtensions.addAndExpression(exitExp, _transformExpression);
                  Expression _addParanthesizedExpression = this.SCLExpressionExtensions.addParanthesizedExpression(_addAndExpression);
                  exitExp = _addParanthesizedExpression;
                }
                Expression _addOrExpression = this.SCLExpressionExtensions.addOrExpression(termExp, exitExp);
                termExp = _addOrExpression;
                Expression _copy_1 = EcoreUtil.<Expression>copy(exitExp);
                Expression _addOrExpression_1 = this.SCLExpressionExtensions.addOrExpression(handleExp, _copy_1);
                handleExp = _addOrExpression_1;
              }
            }
            String _emptyBlockName = this.SCLBasicBlockExtensions.getEmptyBlockName(pred);
            ElementReferenceExpression _declarationByNameAsElemRef = this.getDeclarationByNameAsElemRef(program, _emptyBlockName);
            Expression _createAssignmentExpression = this.SCLExpressionExtensions.createAssignmentExpression(_declarationByNameAsElemRef, emptyExp);
            String _emptyBlockName_1 = this.SCLBasicBlockExtensions.getEmptyBlockName(pred);
            VariableDeclaration _declarationByName_2 = this.getDeclarationByName(program, _emptyBlockName_1);
            Assignment _createSCLAssignment = this.SCLCreateExtensions.createSCLAssignment(_createAssignmentExpression, _declarationByName_2);
            final InstructionStatement emptyAssignment = this.SCLCreateExtensions.createStatement(_createSCLAssignment);
            newStatements.add(emptyAssignment);
            String _emptyBlockName_2 = this.SCLBasicBlockExtensions.getEmptyBlockName(pred);
            VariableDeclaration _declarationByName_3 = this.getDeclarationByName(program, _emptyBlockName_2);
            Expression _createElementReferenceExpression_1 = this.SCLExpressionExtensions.createElementReferenceExpression(_declarationByName_3);
            Expression _addOrExpression_2 = this.SCLExpressionExtensions.addOrExpression(handleExp, _createElementReferenceExpression_1);
            handleExp = _addOrExpression_2;
            Expression _createParanthesizedExpression = this.SCLExpressionExtensions.createParanthesizedExpression(handleExp);
            Expression _addAndExpression_1 = this.SCLExpressionExtensions.addAndExpression(syncExp, _createParanthesizedExpression);
            syncExp = _addAndExpression_1;
          }
        }
        Expression _createParanthesizedExpression = this.SCLExpressionExtensions.createParanthesizedExpression(termExp);
        Expression _addAndExpression = this.SCLExpressionExtensions.addAndExpression(syncExp, _createParanthesizedExpression);
        syncExp = _addAndExpression;
        String _basicBlockName = this.SCLBasicBlockExtensions.getBasicBlockName(basicBlock);
        ElementReferenceExpression _declarationByNameAsElemRef = this.getDeclarationByNameAsElemRef(program, _basicBlockName);
        Expression _createAssignmentExpression = this.SCLExpressionExtensions.createAssignmentExpression(_declarationByNameAsElemRef, syncExp);
        String _basicBlockName_1 = this.SCLBasicBlockExtensions.getBasicBlockName(basicBlock);
        VariableDeclaration _declarationByName = this.getDeclarationByName(program, _basicBlockName_1);
        Assignment _createSCLAssignment = this.SCLCreateExtensions.createSCLAssignment(_createAssignmentExpression, _declarationByName);
        final InstructionStatement guardAssignment = this.SCLCreateExtensions.createStatement(_createSCLAssignment);
        newStatements.add(guardAssignment);
      } else {
        Expression guardExpression = null;
        int _size = predecessors.size();
        boolean _equals = (_size == 0);
        if (_equals) {
          StextFactory _SText = this.SCLFactoryExtensions.SText();
          final ElementReferenceExpression expression = _SText.createElementReferenceExpression();
          VariableDeclaration _declarationByName_1 = this.getDeclarationByName(program, "GO");
          expression.setReference(_declarationByName_1);
          guardExpression = expression;
        } else {
          int _size_1 = predecessors.size();
          boolean _equals_1 = (_size_1 == 1);
          if (_equals_1) {
            BasicBlock _head = IterableExtensions.<BasicBlock>head(predecessors);
            String predID = this.SCLBasicBlockExtensions.getBasicBlockName(_head);
            BasicBlock _head_1 = IterableExtensions.<BasicBlock>head(predecessors);
            boolean _isPauseSurface = this.SCLBasicBlockExtensions.isPauseSurface(_head_1);
            if (_isPauseSurface) {
              String _plus = (predID + "_pre");
              predID = _plus;
            }
            StextFactory _SText_1 = this.SCLFactoryExtensions.SText();
            final ElementReferenceExpression expression_1 = _SText_1.createElementReferenceExpression();
            VariableDeclaration _declarationByName_2 = this.getDeclarationByName(program, predID);
            expression_1.setReference(_declarationByName_2);
            BasicBlock _head_2 = IterableExtensions.<BasicBlock>head(predecessors);
            boolean _isConditionalPredecessor = this.SCLBasicBlockExtensions.isConditionalPredecessor(basicBlock, _head_2);
            if (_isConditionalPredecessor) {
              BasicBlock _head_3 = IterableExtensions.<BasicBlock>head(predecessors);
              Expression _conditionalExpression = this.SCLBasicBlockExtensions.getConditionalExpression(_head_3);
              Expression andExp = EcoreUtil.<Expression>copy(_conditionalExpression);
              Expression _transformExpression = this.transformExpression(andExp, program, sourceProgram);
              andExp = _transformExpression;
              Expression _createAndExpression = this.SCLExpressionExtensions.createAndExpression(expression_1, andExp);
              guardExpression = _createAndExpression;
            } else {
              guardExpression = expression_1;
            }
          } else {
            int _size_2 = predecessors.size();
            boolean _greaterThan = (_size_2 > 1);
            if (_greaterThan) {
              BasicBlock _head_4 = IterableExtensions.<BasicBlock>head(predecessors);
              String predID_1 = this.SCLBasicBlockExtensions.getBasicBlockName(_head_4);
              BasicBlock _head_5 = IterableExtensions.<BasicBlock>head(predecessors);
              boolean _isPauseSurface_1 = this.SCLBasicBlockExtensions.isPauseSurface(_head_5);
              if (_isPauseSurface_1) {
                String _plus_1 = (predID_1 + "_pre");
                predID_1 = _plus_1;
              }
              StextFactory _SText_2 = this.SCLFactoryExtensions.SText();
              ElementReferenceExpression _createElementReferenceExpression = _SText_2.createElementReferenceExpression();
              Expression expression_2 = ((Expression) _createElementReferenceExpression);
              VariableDeclaration _declarationByName_3 = this.getDeclarationByName(program, predID_1);
              ((ElementReferenceExpression) expression_2).setReference(_declarationByName_3);
              int _size_3 = predecessors.size();
              int _minus = (_size_3 - 1);
              IntegerRange _upTo = new IntegerRange(1, _minus);
              for (final Integer i : _upTo) {
                {
                  BasicBlock _get = predecessors.get((i).intValue());
                  String predIDi = this.SCLBasicBlockExtensions.getBasicBlockName(_get);
                  BasicBlock _get_1 = predecessors.get((i).intValue());
                  boolean _isPauseSurface_2 = this.SCLBasicBlockExtensions.isPauseSurface(_get_1);
                  if (_isPauseSurface_2) {
                    String _plus_2 = (predIDi + "_pre");
                    predIDi = _plus_2;
                  }
                  StextFactory _SText_3 = this.SCLFactoryExtensions.SText();
                  final ElementReferenceExpression exp2 = _SText_3.createElementReferenceExpression();
                  VariableDeclaration _declarationByName_4 = this.getDeclarationByName(program, predIDi);
                  exp2.setReference(_declarationByName_4);
                  Expression _createOrExpression = this.SCLExpressionExtensions.createOrExpression(expression_2, exp2);
                  expression_2 = _createOrExpression;
                }
              }
              guardExpression = expression_2;
            }
          }
        }
        String _basicBlockName_2 = this.SCLBasicBlockExtensions.getBasicBlockName(basicBlock);
        ElementReferenceExpression _declarationByNameAsElemRef_1 = this.getDeclarationByNameAsElemRef(program, _basicBlockName_2);
        Expression _createAssignmentExpression_1 = this.SCLExpressionExtensions.createAssignmentExpression(_declarationByNameAsElemRef_1, guardExpression);
        String _basicBlockName_3 = this.SCLBasicBlockExtensions.getBasicBlockName(basicBlock);
        VariableDeclaration _declarationByName_4 = this.getDeclarationByName(program, _basicBlockName_3);
        Assignment _createSCLAssignment_1 = this.SCLCreateExtensions.createSCLAssignment(_createAssignmentExpression_1, _declarationByName_4);
        final InstructionStatement guardAssignment_1 = this.SCLCreateExtensions.createStatement(_createSCLAssignment_1);
        newStatements.add(guardAssignment_1);
      }
      final Conditional guardConditional = this.SCLCreateExtensions.createSCLConditional();
      String _basicBlockName_4 = this.SCLBasicBlockExtensions.getBasicBlockName(basicBlock);
      ElementReferenceExpression _declarationByNameAsElemRef_2 = this.getDeclarationByNameAsElemRef(program, _basicBlockName_4);
      guardConditional.setExpression(_declarationByNameAsElemRef_2);
      List<Statement> _statements = basicBlock.getStatements();
      for (final Statement statement : _statements) {
        boolean _isAssignment = this.SCLStatementExtensions.isAssignment(statement);
        if (_isAssignment) {
          Statement _copy = EcoreUtil.<Statement>copy(statement);
          final Statement stmt = this.transformVarRef(_copy, program, sourceProgram);
          this.SCLStatementExtensions.setLabel(stmt, null);
          EList<Statement> _statements_1 = guardConditional.getStatements();
          _statements_1.add(stmt);
        }
      }
      EList<Statement> _statements_2 = guardConditional.getStatements();
      int _size_4 = _statements_2.size();
      boolean _greaterThan_1 = (_size_4 > 0);
      if (_greaterThan_1) {
        InstructionStatement _createStatement = this.SCLCreateExtensions.createStatement(guardConditional);
        newStatements.add(_createStatement);
      }
      _xblockexpression = (newStatements);
    }
    return _xblockexpression;
  }
  
  public VariableDeclaration getDeclarationByName(final Program program, final String name) {
    EList<VariableDeclaration> _declarations = program.getDeclarations();
    final Function1<VariableDeclaration,Boolean> _function = new Function1<VariableDeclaration,Boolean>() {
        public Boolean apply(final VariableDeclaration e) {
          String _name = e.getName();
          boolean _equals = Objects.equal(_name, name);
          return Boolean.valueOf(_equals);
        }
      };
    Iterable<VariableDeclaration> _filter = IterableExtensions.<VariableDeclaration>filter(_declarations, _function);
    VariableDeclaration _head = IterableExtensions.<VariableDeclaration>head(_filter);
    return _head;
  }
  
  public ElementReferenceExpression getDeclarationByNameAsElemRef(final Program program, final String name) {
    ElementReferenceExpression _xblockexpression = null;
    {
      final VariableDeclaration varRef = this.getDeclarationByName(program, name);
      StextFactory _SText = this.SCLFactoryExtensions.SText();
      final ElementReferenceExpression expression = _SText.createElementReferenceExpression();
      expression.setReference(varRef);
      _xblockexpression = (expression);
    }
    return _xblockexpression;
  }
  
  public Statement transformVarRef(final Statement statement, final Program targetProgram, final Program sourceProgram) {
    Statement _xblockexpression = null;
    {
      Instruction _instruction = this.SCLStatementExtensions.getInstruction(statement);
      final Assignment instr = ((Assignment) _instruction);
      Expression _assignment = instr.getAssignment();
      final AssignmentExpression aExp = ((AssignmentExpression) _assignment);
      TreeIterator<EObject> _eAllContents = aExp.eAllContents();
      Iterator<ElementReferenceExpression> _filter = Iterators.<ElementReferenceExpression>filter(_eAllContents, ElementReferenceExpression.class);
      final Procedure1<ElementReferenceExpression> _function = new Procedure1<ElementReferenceExpression>() {
          public void apply(final ElementReferenceExpression it) {
            EList<VariableDeclaration> _declarations = sourceProgram.getDeclarations();
            final Function1<VariableDeclaration,Boolean> _function = new Function1<VariableDeclaration,Boolean>() {
                public Boolean apply(final VariableDeclaration e) {
                  EObject _reference = it.getReference();
                  boolean _equals = Objects.equal(e, _reference);
                  return Boolean.valueOf(_equals);
                }
              };
            Iterable<VariableDeclaration> _filter = IterableExtensions.<VariableDeclaration>filter(_declarations, _function);
            final VariableDeclaration vD = IterableExtensions.<VariableDeclaration>head(_filter);
            String _name = vD.getName();
            final VariableDeclaration tD = SCLToSeqSCLTransformation.this.getDeclarationByName(targetProgram, _name);
            it.setReference(tD);
          }
        };
      IteratorExtensions.<ElementReferenceExpression>forEach(_filter, _function);
      _xblockexpression = (statement);
    }
    return _xblockexpression;
  }
  
  public Expression transformExpression(final Expression exp, final Program targetProgram, final Program sourceProgram) {
    Expression _xblockexpression = null;
    {
      if ((exp instanceof ElementReferenceExpression)) {
        final ElementReferenceExpression ere = ((ElementReferenceExpression) exp);
        EList<VariableDeclaration> _declarations = sourceProgram.getDeclarations();
        final Function1<VariableDeclaration,Boolean> _function = new Function1<VariableDeclaration,Boolean>() {
            public Boolean apply(final VariableDeclaration e) {
              EObject _reference = ere.getReference();
              boolean _equals = Objects.equal(e, _reference);
              return Boolean.valueOf(_equals);
            }
          };
        Iterable<VariableDeclaration> _filter = IterableExtensions.<VariableDeclaration>filter(_declarations, _function);
        final VariableDeclaration vD = IterableExtensions.<VariableDeclaration>head(_filter);
        String _name = vD.getName();
        final VariableDeclaration tD = this.getDeclarationByName(targetProgram, _name);
        ere.setReference(tD);
      } else {
        TreeIterator<EObject> _eAllContents = exp.eAllContents();
        Iterator<ElementReferenceExpression> _filter_1 = Iterators.<ElementReferenceExpression>filter(_eAllContents, ElementReferenceExpression.class);
        final Procedure1<ElementReferenceExpression> _function_1 = new Procedure1<ElementReferenceExpression>() {
            public void apply(final ElementReferenceExpression it) {
              EList<VariableDeclaration> _declarations = sourceProgram.getDeclarations();
              final Function1<VariableDeclaration,Boolean> _function = new Function1<VariableDeclaration,Boolean>() {
                  public Boolean apply(final VariableDeclaration e) {
                    EObject _reference = it.getReference();
                    boolean _equals = Objects.equal(e, _reference);
                    return Boolean.valueOf(_equals);
                  }
                };
              Iterable<VariableDeclaration> _filter = IterableExtensions.<VariableDeclaration>filter(_declarations, _function);
              final VariableDeclaration vD = IterableExtensions.<VariableDeclaration>head(_filter);
              String _name = vD.getName();
              final VariableDeclaration tD = SCLToSeqSCLTransformation.this.getDeclarationByName(targetProgram, _name);
              it.setReference(tD);
            }
          };
        IteratorExtensions.<ElementReferenceExpression>forEach(_filter_1, _function_1);
      }
      _xblockexpression = (exp);
    }
    return _xblockexpression;
  }
}
