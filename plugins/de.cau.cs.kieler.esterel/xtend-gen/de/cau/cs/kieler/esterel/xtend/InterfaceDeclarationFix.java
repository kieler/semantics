package de.cau.cs.kieler.esterel.xtend;

import de.cau.cs.kieler.core.kexpressions.ChannelDescription;
import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ISignal;
import de.cau.cs.kieler.core.kexpressions.InterfaceSignalDecl;
import de.cau.cs.kieler.core.kexpressions.TypeIdentifier;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.esterel.esterel.ConstantExpression;
import de.cau.cs.kieler.esterel.esterel.Program;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class InterfaceDeclarationFix {
  public Program fix(final Program program) {
    Program _xblockexpression = null;
    {
      Resource _eResource = program.eResource();
      TreeIterator<EObject> _allContents = _eResource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<InterfaceSignalDecl> _filter = IterableExtensions.<InterfaceSignalDecl>filter(_iterable, de.cau.cs.kieler.core.kexpressions.InterfaceSignalDecl.class);
      List<InterfaceSignalDecl> _list = IterableExtensions.<InterfaceSignalDecl>toList(_filter);
      List<InterfaceSignalDecl> interfaceSignalDeclList = _list;
      for (final Object object : interfaceSignalDeclList) {
        {
          InterfaceSignalDecl interfaceSignalDecl = ((InterfaceSignalDecl) object);
          EList<ISignal> _signals = interfaceSignalDecl.getSignals();
          EList<ISignal> signalList = _signals;
          for (final ISignal signal : signalList) {
            ChannelDescription _channelDescr = signal.getChannelDescr();
            boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_channelDescr, null);
            if (_operator_notEquals) {
              {
                ChannelDescription _channelDescr_1 = signal.getChannelDescr();
                TypeIdentifier _type = _channelDescr_1.getType();
                ValueType _type_1 = _type.getType();
                String _string = _type_1.toString();
                final String __valOfSwitchOver = _string;
                boolean matched = false;
                if (!matched) {
                  if (ObjectExtensions.operator_equals(__valOfSwitchOver,"int")) {
                    matched=true;
                    signal.setType(ValueType.INT);
                  }
                }
                if (!matched) {
                  if (ObjectExtensions.operator_equals(__valOfSwitchOver,"bool")) {
                    matched=true;
                    signal.setType(ValueType.BOOL);
                  }
                }
                if (!matched) {
                  if (ObjectExtensions.operator_equals(__valOfSwitchOver,"double")) {
                    matched=true;
                    signal.setType(ValueType.DOUBLE);
                  }
                }
                if (!matched) {
                  if (ObjectExtensions.operator_equals(__valOfSwitchOver,"float")) {
                    matched=true;
                    signal.setType(ValueType.FLOAT);
                  }
                }
                if (!matched) {
                  if (ObjectExtensions.operator_equals(__valOfSwitchOver,"host")) {
                    matched=true;
                    signal.setType(ValueType.HOST);
                  }
                }
                if (!matched) {
                  if (ObjectExtensions.operator_equals(__valOfSwitchOver,"string")) {
                    matched=true;
                    signal.setType(ValueType.STRING);
                  }
                }
                if (!matched) {
                  if (ObjectExtensions.operator_equals(__valOfSwitchOver,"unsigned")) {
                    matched=true;
                    signal.setType(ValueType.UNSIGNED);
                  }
                }
                ChannelDescription _channelDescr_2 = signal.getChannelDescr();
                Expression _expression = _channelDescr_2.getExpression();
                Expression expression = _expression;
                if ((expression instanceof ConstantExpression)) {
                  {
                    ConstantExpression constantExpression = ((ConstantExpression) expression);
                    String _value = constantExpression.getValue();
                    String _string_1 = _value.toString();
                    signal.setInitialValue(_string_1);
                  }
                }
              }
            }
          }
        }
      }
      _xblockexpression = (program);
    }
    return _xblockexpression;
  }
}
