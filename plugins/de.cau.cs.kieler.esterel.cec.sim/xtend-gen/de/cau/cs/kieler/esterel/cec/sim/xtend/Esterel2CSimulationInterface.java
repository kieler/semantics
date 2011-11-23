package de.cau.cs.kieler.esterel.cec.sim.xtend;

import de.cau.cs.kieler.core.kexpressions.ISignal;
import de.cau.cs.kieler.core.kexpressions.Input;
import de.cau.cs.kieler.core.kexpressions.InterfaceSignalDecl;
import de.cau.cs.kieler.core.kexpressions.Output;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.kies.esterel.Module;
import de.cau.cs.kieler.kies.esterel.ModuleInterface;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Esterel2CSimulationInterface {
  
  public StringConcatenation createCSimulationInterface(final Module module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("       ");
    StringConcatenation _esterelHeader = this.esterelHeader();
    _builder.append(_esterelHeader, "       ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("       ");
    ModuleInterface _interface = module.getInterface();
    EList<InterfaceSignalDecl> _intSignalDecls = _interface.getIntSignalDecls();
    final Function1<InterfaceSignalDecl,StringConcatenation> _function = new Function1<InterfaceSignalDecl,StringConcatenation>() {
        public StringConcatenation apply(final InterfaceSignalDecl e) {
          String _name = module.getName();
          StringConcatenation _outputFunctions = Esterel2CSimulationInterface.this.outputFunctions(e, _name);
          return _outputFunctions;
        }
      };
    List<StringConcatenation> _map = ListExtensions.<InterfaceSignalDecl, StringConcatenation>map(_intSignalDecls, _function);
    StringConcatenation _stringConcatenation = this.toStringConcatenation(_map);
    _builder.append(_stringConcatenation, "       ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("       ");
    StringConcatenation _esterelSetInputsFunction = this.esterelSetInputsFunction(module);
    _builder.append(_esterelSetInputsFunction, "       ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    StringConcatenation _mainFunction = this.mainFunction(module);
    _builder.append(_mainFunction, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
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
    return _builder;
  }
  
  public StringConcatenation toStringConcatenation(final List<StringConcatenation> list) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final StringConcatenation element : list) {
        _builder.append(element, "");
      }
    }
    return _builder;
  }
  
  public StringConcatenation esterelSetInputsFunction(final Module module) {
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
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    ModuleInterface _interface = module.getInterface();
    EList<InterfaceSignalDecl> _intSignalDecls = _interface.getIntSignalDecls();
    final Function1<InterfaceSignalDecl,StringConcatenation> _function = new Function1<InterfaceSignalDecl,StringConcatenation>() {
        public StringConcatenation apply(final InterfaceSignalDecl e) {
          String _name = module.getName();
          StringConcatenation _callInputs = Esterel2CSimulationInterface.this.callInputs(e, _name);
          return _callInputs;
        }
      };
    List<StringConcatenation> _map = ListExtensions.<InterfaceSignalDecl, StringConcatenation>map(_intSignalDecls, _function);
    StringConcatenation _stringConcatenation = this.toStringConcatenation(_map);
    _builder.append(_stringConcatenation, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("}");
    return _builder;
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
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _outputFunctions(final Output it, final String moduleName) {
    StringConcatenation _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      StringConcatenation gen = _builder;
      gen.newLine();
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
          _builder_3.append("){  \t");
          _builder_3.newLine();
          _builder_3.append("   \t  \t\t");
          _builder_3.append("value = cJSON_CreateObject();");
          _builder_3.newLine();
          _builder_3.append("\t\t\t");
          _builder_3.append("cJSON_AddTrueToObject(value, \"present\");");
          gen.append(_builder_3);
          ValueType _type_1 = signal.getType();
          boolean _operator_equals_1 = ObjectExtensions.operator_equals(_type_1, "int");
          if (_operator_equals_1) {
            {
              gen.newLine();
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("cJSON_AddNumberToObject(value, \"value\", i);");
              gen.append(_builder_4);
            }
          }
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("cJSON_AddItemToObject(output, \"");
          String _name_1 = signal.getName();
          _builder_5.append(_name_1, "");
          _builder_5.append("\", value);");
          _builder_5.newLineIfNotEmpty();
          _builder_5.append("   \t  \t");
          _builder_5.append("}");
          gen.append(_builder_5);
          gen.newLine();
        }
      }
      _xblockexpression = (gen);
    }
    return _xblockexpression;
  }
  
  protected StringConcatenation _outputFunctions(final InterfaceSignalDecl it, final String moduleName) {
    return null;
  }
  
  protected StringConcatenation _callInputs(final Input it, final String moduleName) {
    StringConcatenation _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      StringConcatenation gen = _builder;
      EList<ISignal> _signals = it.getSignals();
      for (final ISignal signal : _signals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("child = cJSON_GetObjectItem(object, \"");
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
  
  protected StringConcatenation _callInputs(final InterfaceSignalDecl it, final String moduleName) {
    return null;
  }
  
  public StringConcatenation outputFunctions(final InterfaceSignalDecl it, final String moduleName) {
    if ((it instanceof Output)) {
      return _outputFunctions((Output)it, (String)moduleName);
    } else {
      return _outputFunctions((InterfaceSignalDecl)it, (String)moduleName);
    }
  }
  
  public StringConcatenation callInputs(final InterfaceSignalDecl it, final String moduleName) {
    if ((it instanceof Input)) {
      return _callInputs((Input)it, (String)moduleName);
    } else {
      return _callInputs((InterfaceSignalDecl)it, (String)moduleName);
    }
  }
}