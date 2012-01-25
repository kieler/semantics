package de.cau.cs.kieler.esterel.cec.sim.xtend;

import de.cau.cs.kieler.core.kexpressions.ISignal;
import de.cau.cs.kieler.core.kexpressions.Input;
import de.cau.cs.kieler.core.kexpressions.InterfaceSignalDecl;
import de.cau.cs.kieler.core.kexpressions.Output;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.esterel.esterel.Module;
import de.cau.cs.kieler.esterel.esterel.ModuleInterface;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class Esterel2CSimulationInterface {
  public CharSequence createCSimulationInterface(final Module module) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("       ");
    CharSequence _esterelHeader = this.esterelHeader();
    _builder.append(_esterelHeader, "       ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    {
      ModuleInterface _interface = module.getInterface();
      EList<InterfaceSignalDecl> _intSignalDecls = _interface.getIntSignalDecls();
      for(final InterfaceSignalDecl intSignalDecl : _intSignalDecls) {
        String _name = module.getName();
        String _outputFunctions = this.outputFunctions(intSignalDecl, _name);
        _builder.append(_outputFunctions, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.append("       ");
    CharSequence _esterelSetInputsFunction = this.esterelSetInputsFunction(module);
    _builder.append(_esterelSetInputsFunction, "       ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    CharSequence _mainFunction = this.mainFunction(module);
    _builder.append(_mainFunction, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence esterelHeader() {
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
  
  public CharSequence esterelSetInputsFunction(final Module module) {
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
    {
      ModuleInterface _interface = module.getInterface();
      EList<InterfaceSignalDecl> _intSignalDecls = _interface.getIntSignalDecls();
      for(final InterfaceSignalDecl intSignalDecl : _intSignalDecls) {
        String _name = module.getName();
        String _callInputs = this.callInputs(intSignalDecl, _name);
        _builder.append(_callInputs, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("   ");
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence mainFunction(final Module it) {
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
  
  protected String _outputFunctions(final Output it, final String moduleName) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      CharSequence gen = _builder;
      String _string = gen.toString();
      String _concat = _string.concat("\n");
      gen = _concat;
      EList<ISignal> _signals = it.getSignals();
      for (final ISignal signal : _signals) {
        {
          String _string_1 = gen.toString();
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(moduleName, "");
          _builder_1.append("_O_");
          String _name = signal.getName();
          _builder_1.append(_name, "");
          _builder_1.append("(");
          String _string_2 = _builder_1.toString();
          String _concat_1 = _string_1.concat(_string_2);
          gen = _concat_1;
          boolean _operator_or = false;
          ValueType _type = signal.getType();
          String _literal = _type.getLiteral();
          boolean _operator_equals = ObjectExtensions.operator_equals(_literal, "int");
          if (_operator_equals) {
            _operator_or = true;
          } else {
            ValueType _type_1 = signal.getType();
            String _literal_1 = _type_1.getLiteral();
            boolean _operator_equals_1 = ObjectExtensions.operator_equals(_literal_1, "bool");
            _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
          }
          if (_operator_or) {
            String _string_3 = gen.toString();
            String _concat_2 = _string_3.concat("int i");
            gen = _concat_2;
          }
          String _string_4 = gen.toString();
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("){  \t");
          _builder_2.newLine();
          _builder_2.append("   \t  \t\t");
          _builder_2.append("value = cJSON_CreateObject();");
          _builder_2.newLine();
          _builder_2.append("\t\t\t");
          _builder_2.append("cJSON_AddTrueToObject(value, \"present\");");
          String _string_5 = _builder_2.toString();
          String _concat_3 = _string_4.concat(_string_5);
          gen = _concat_3;
          ValueType _type_2 = signal.getType();
          String _literal_2 = _type_2.getLiteral();
          boolean _operator_equals_2 = ObjectExtensions.operator_equals(_literal_2, "int");
          if (_operator_equals_2) {
            String _string_6 = gen.toString();
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append(" ");
            _builder_3.append("cJSON_AddNumberToObject(value, \"value\", i);");
            String _string_7 = _builder_3.toString();
            String _concat_4 = _string_6.concat(_string_7);
            gen = _concat_4;
          } else {
            ValueType _type_3 = signal.getType();
            String _literal_3 = _type_3.getLiteral();
            boolean _operator_equals_3 = ObjectExtensions.operator_equals(_literal_3, "bool");
            if (_operator_equals_3) {
              String _string_8 = gen.toString();
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append(" ");
              _builder_4.append("if (i == 0) {");
              _builder_4.newLine();
              _builder_4.append("\t\t\t\t");
              _builder_4.append("cJSON_AddFalseToObject(value, \"value\"); }");
              _builder_4.newLine();
              _builder_4.append("\t\t\t\t");
              _builder_4.append("else {");
              _builder_4.newLine();
              _builder_4.append("\t\t\t\t\t");
              _builder_4.append("cJSON_AddTrueToObject(value, \"value\");");
              _builder_4.newLine();
              _builder_4.append("\t\t\t\t");
              _builder_4.append("} ");
              _builder_4.newLine();
              String _string_9 = _builder_4.toString();
              String _concat_5 = _string_8.concat(_string_9);
              gen = _concat_5;
            }
          }
          String _string_10 = gen.toString();
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("cJSON_AddItemToObject(output, \"");
          String _name_1 = signal.getName();
          _builder_5.append(_name_1, "");
          _builder_5.append("\", value);}");
          String _string_11 = _builder_5.toString();
          String _concat_6 = _string_10.concat(_string_11);
          gen = _concat_6;
        }
      }
      String _string_12 = gen.toString();
      _xblockexpression = (_string_12);
    }
    return _xblockexpression;
  }
  
  protected String _outputFunctions(final InterfaceSignalDecl it, final String moduleName) {
    return null;
  }
  
  protected String _callInputs(final Input it, final String moduleName) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      CharSequence gen = _builder;
      EList<ISignal> _signals = it.getSignals();
      for (final ISignal signal : _signals) {
        String _string = gen.toString();
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
        String _string_1 = _builder_1.toString();
        String _concat = _string.concat(_string_1);
        gen = _concat;
      }
      String _string_2 = gen.toString();
      _xblockexpression = (_string_2);
    }
    return _xblockexpression;
  }
  
  protected String _callInputs(final InterfaceSignalDecl it, final String moduleName) {
    return null;
  }
  
  public String outputFunctions(final InterfaceSignalDecl it, final String moduleName) {
    if (it instanceof Output) {
      return _outputFunctions((Output)it, moduleName);
    } else if (it != null) {
      return _outputFunctions(it, moduleName);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, moduleName).toString());
    }
  }
  
  public String callInputs(final InterfaceSignalDecl it, final String moduleName) {
    if (it instanceof Input) {
      return _callInputs((Input)it, moduleName);
    } else if (it != null) {
      return _callInputs(it, moduleName);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, moduleName).toString());
    }
  }
}
