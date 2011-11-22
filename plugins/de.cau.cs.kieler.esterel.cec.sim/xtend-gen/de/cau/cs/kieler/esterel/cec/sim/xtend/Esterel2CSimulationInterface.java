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
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Esterel2CSimulationInterface {
  
  public StringConcatenation createCSimulationInterface(final Module module) {
    StringConcatenation _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      StringConcatenation gen = _builder;
      StringConcatenation _esterelHeader = this.esterelHeader();
      gen.append(_esterelHeader);
      ModuleInterface _interface = module.getInterface();
      EList<InterfaceSignalDecl> _intSignalDecls = _interface.getIntSignalDecls();
      for (final InterfaceSignalDecl interfaceSignalDecl : _intSignalDecls) {
        String _name = module.getName();
        Object _outputFunctions = this.outputFunctions(interfaceSignalDecl, _name);
        gen.append(_outputFunctions);
      }
      StringConcatenation _esterelSetInputsFunction = this.esterelSetInputsFunction(module);
      gen.append(_esterelSetInputsFunction);
      StringConcatenation _mainFunction = this.mainFunction(module);
      gen.append(_mainFunction);
      _xblockexpression = (gen);
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
      StringConcatenation gen = _builder;
      ModuleInterface _interface = module.getInterface();
      EList<InterfaceSignalDecl> _intSignalDecls = _interface.getIntSignalDecls();
      for (final InterfaceSignalDecl interfaceSignalDecl : _intSignalDecls) {
        String _name = module.getName();
        Object _callInputs = this.callInputs(interfaceSignalDecl, _name);
        gen.append(_callInputs);
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("}");
      gen.append(_builder_1);
      _xblockexpression = (gen);
    }
    return _xblockexpression;
  }
  
  public StringConcatenation mainFunction(final Module it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("int main(){");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append("_reset();");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("output = cJSON_CreateObject();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("while(1){");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("setInputs();");
    _builder.newLine();
    _builder.append("\t");
    String _name_1 = it.getName();
    _builder.append(_name_1, "	");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("char* outString = cJSON_Print(output);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("strip_white_spaces(outString);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("printf(\"%s\\n\", outString);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fflush(stdout);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("output = cJSON_CreateObject();");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}  \t");
    _builder.newLine();
    _builder.append("}");
    return _builder;
  }
  
  public StringConcatenation outputFunctions(final Output it, final String moduleName) {
    StringConcatenation _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      StringConcatenation gen = _builder;
      EList<ISignal> _signals = it.getSignals();
      for (final ISignal signal : _signals) {
        {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(moduleName, "");
          _builder_1.append("_O_");
          String _name = signal.getName();
          _builder_1.append(_name, "");
          _builder_1.append("(");
          gen.append(_builder_1);
          ValueType _type = signal.getType();
          boolean _operator_equals = ObjectExtensions.operator_equals(_type, "int");
          if (_operator_equals) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("int i");
            gen.append(_builder_2);
          }
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("){  \tvalue = cJSON_CreateObject();");
          _builder_3.newLine();
          _builder_3.append("\t\t\t\t");
          _builder_3.append("cJSON_AddTrueToObject(value, \"present\");");
          gen.append(_builder_3);
          ValueType _type_1 = signal.getType();
          boolean _operator_equals_1 = ObjectExtensions.operator_equals(_type_1, "int");
          if (_operator_equals_1) {
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("cJSON_AddNumberToObject(value, \"value\", i);");
            gen.append(_builder_4);
          }
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("cJSON_AddItemToObject(output, \"");
          String _name_1 = signal.getName();
          _builder_5.append(_name_1, "");
          _builder_5.append("\", value);}");
          gen.append(_builder_5);
        }
      }
      _xblockexpression = (gen);
    }
    return _xblockexpression;
  }
  
  public Object outputFunctions(final InterfaceSignalDecl it, final String moduleName) {
    return null;
  }
  
  public StringConcatenation callInputs(final Input it, final String moduleName) {
    StringConcatenation _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      StringConcatenation gen = _builder;
      EList<ISignal> _signals = it.getSignals();
      for (final ISignal signal : _signals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("child = cJSON_GetObjectItem(object, ");
        String _name = signal.getName();
        _builder_1.append(_name, "");
        _builder_1.append("\");");
        _builder_1.newLineIfNotEmpty();
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
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append(moduleName, "			");
        _builder_1.append("_I_");
        String _name_1 = signal.getName();
        _builder_1.append(_name_1, "			");
        _builder_1.append("();");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("}");
        gen.append(_builder_1);
      }
      _xblockexpression = (gen);
    }
    return _xblockexpression;
  }
  
  public Object callInputs(final InterfaceSignalDecl it, final String moduleName) {
    return null;
  }
}