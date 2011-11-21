package de.cau.cs.kieler.esterel.cec.sim.xtend;

import de.cau.cs.kieler.core.kexpressions.ISignal;
import de.cau.cs.kieler.core.kexpressions.Input;
import de.cau.cs.kieler.core.kexpressions.InterfaceSignalDecl;
import de.cau.cs.kieler.core.kexpressions.Output;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.kies.esterel.Module;
import de.cau.cs.kieler.kies.esterel.ModuleInterface;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Esterel2CSimulationInterface {
  
  public StringConcatenation createCSimulationInterface(final Module module) {
    StringConcatenation _xblockexpression = null;
    {
      this.esterelHeader();
      ModuleInterface _interface = module.getInterface();
      EList<InterfaceSignalDecl> _intSignalDecls = _interface.getIntSignalDecls();
      for (final InterfaceSignalDecl interfaceSignalDecl : _intSignalDecls) {
        String _name = module.getName();
        this.outputFunctions(interfaceSignalDecl, _name);
      }
      this.esterelSetInputsFunction(module);
      StringConcatenation _mainFunction = this.mainFunction(module);
      _xblockexpression = (_mainFunction);
    }
    return _xblockexpression;
  }
  
  public StringConcatenation esterelHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* Generated CSimulationInterface Wrapper */");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("#include <string.h>");
    _builder.newLine();
    _builder.append("#include <stdlib.h>");
    _builder.newLine();
    _builder.append("#include <stdio.h>");
    _builder.newLine();
    _builder.append("#include \"cJSON.h\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("cJSON* output = 0;");
    _builder.newLine();
    _builder.append("cJSON* value = 0;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("cJSON* output = 0;");
    _builder.newLine();
    _builder.append("cJSON* value = 0;");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation esterelSetInputsFunction(final Module module) {
    StringConcatenation _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("void setInputs(){");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("char buffer[2048];");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("int i=0;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("char c;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("// read next line");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("for (i=0; (c=getchar())!=\'\\n\'; i++){");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("buffer[i]=c;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("buffer[i]=0;");
      _builder.newLine();
      _builder.append("  ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("cJSON* object = 0;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("cJSON* child = 0;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("cJSON* present = 0;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("cJSON* value = 0;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("object = cJSON_Parse(buffer);");
      ModuleInterface _interface = module.getInterface();
      EList<InterfaceSignalDecl> _intSignalDecls = _interface.getIntSignalDecls();
      for (final InterfaceSignalDecl interfaceSignalDecl : _intSignalDecls) {
        String _name = module.getName();
        this.callInputs(interfaceSignalDecl, _name);
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("}");
      _xblockexpression = (_builder_1);
    }
    return _xblockexpression;
  }
  
  public StringConcatenation mainFunction(final Module it) {
    StringConcatenation _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("int main(){");
      it.getName();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("_reset();");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("output = cJSON_CreateObject();");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("while(1){");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("setInputs();");
      _builder_1.newLine();
      it.getName();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("\'();");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("char* outString = cJSON_Print(output);");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("strip_white_spaces(outString);");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("printf(\"%s\\n\", outString);");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("fflush(stdout);");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("output = cJSON_CreateObject();");
      _builder_2.newLine();
      _builder_2.append("  ");
      _builder_2.append("}  \t");
      _builder_2.newLine();
      _builder_2.append("}");
      _xblockexpression = (_builder_2);
    }
    return _xblockexpression;
  }
  
  public void outputFunctions(final Output it, final String moduleName) {
    EList<ISignal> _signals = it.getSignals();
    for (final ISignal signal : _signals) {
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("_O_");
        String _operator_plus = StringExtensions.operator_plus(moduleName, _builder);
        String _name = signal.getName();
        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("(");
        StringExtensions.operator_plus(_operator_plus_1, _builder_1);
        ValueType _type = signal.getType();
        boolean _operator_equals = ObjectExtensions.operator_equals(_type, "int");
        if (_operator_equals) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("int i");
        }
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("){  \tvalue = cJSON_CreateObject();");
        _builder_3.newLine();
        _builder_3.append("\t\t\t\t");
        _builder_3.append("cJSON_AddTrueToObject(value, \"present\");");
        ValueType _type_1 = signal.getType();
        boolean _operator_equals_1 = ObjectExtensions.operator_equals(_type_1, "int");
        if (_operator_equals_1) {
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("cJSON_AddNumberToObject(value, \"value\", i);");
        }
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("cJSON_AddItemToObject(output, \"");
        signal.getName();
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("\", value);}");
      }
    }
  }
  
  public Object outputFunctions(final InterfaceSignalDecl it, final String moduleName) {
    return null;
  }
  
  public void callInputs(final Input it, final String moduleName) {
    EList<ISignal> _signals = it.getSignals();
    for (final ISignal signal : _signals) {
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("child = cJSON_GetObjectItem(object, \"");
        signal.getName();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\");");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("if (child != NULL){");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("present = cJSON_GetObjectItem(child, \"present\");");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("value = cJSON_GetObjectItem(child, \"value\");");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("if (present != NULL && present->type==cJSON_True) {");
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("_I_");
        String _operator_plus = StringExtensions.operator_plus(moduleName, _builder_2);
        String _name = signal.getName();
        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name);
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("();");
        _builder_3.newLine();
        _builder_3.append("\t\t");
        _builder_3.append("}");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.append("}");
        StringExtensions.operator_plus(_operator_plus_1, _builder_3);
      }
    }
  }
  
  public Object callInputs(final InterfaceSignalDecl it, final String moduleName) {
    return null;
  }
}