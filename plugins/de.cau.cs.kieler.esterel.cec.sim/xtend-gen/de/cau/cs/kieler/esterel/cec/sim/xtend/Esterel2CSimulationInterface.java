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
import org.eclipse.xtext.xbase.lib.StringExtensions;

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
      String gen = "";
      String _operator_plus = StringExtensions.operator_plus(gen, "\n");
      gen = _operator_plus;
      EList<ISignal> _signals = it.getSignals();
      for (final ISignal signal : _signals) {
        {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(moduleName, "");
          _builder.append("_O_");
          String _name = signal.getName();
          _builder.append(_name, "");
          _builder.append("(");
          String _string = _builder.toString();
          String _operator_plus_1 = StringExtensions.operator_plus(gen, _string);
          gen = _operator_plus_1;
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
            String _operator_plus_2 = StringExtensions.operator_plus(gen, "int i");
            gen = _operator_plus_2;
          }
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("){  \t");
          _builder_1.newLine();
          _builder_1.append("   \t  \t\t");
          _builder_1.append("value = cJSON_CreateObject();");
          _builder_1.newLine();
          _builder_1.append("\t\t\t");
          _builder_1.append("cJSON_AddTrueToObject(value, \"present\");");
          String _string_1 = _builder_1.toString();
          String _operator_plus_3 = StringExtensions.operator_plus(gen, _string_1);
          gen = _operator_plus_3;
          ValueType _type_2 = signal.getType();
          String _literal_2 = _type_2.getLiteral();
          boolean _operator_equals_2 = ObjectExtensions.operator_equals(_literal_2, "int");
          if (_operator_equals_2) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append(" ");
            _builder_2.append("cJSON_AddNumberToObject(value, \"value\", i);");
            String _string_2 = _builder_2.toString();
            String _operator_plus_4 = StringExtensions.operator_plus(gen, _string_2);
            gen = _operator_plus_4;
          } else {
            ValueType _type_3 = signal.getType();
            String _literal_3 = _type_3.getLiteral();
            boolean _operator_equals_3 = ObjectExtensions.operator_equals(_literal_3, "bool");
            if (_operator_equals_3) {
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append(" ");
              _builder_3.append("if (i == 0) {");
              _builder_3.newLine();
              _builder_3.append("\t\t\t\t");
              _builder_3.append("cJSON_AddFalseToObject(value, \"value\"); }");
              _builder_3.newLine();
              _builder_3.append("\t\t\t\t");
              _builder_3.append("else {");
              _builder_3.newLine();
              _builder_3.append("\t\t\t\t\t");
              _builder_3.append("cJSON_AddTrueToObject(value, \"value\");");
              _builder_3.newLine();
              _builder_3.append("\t\t\t\t");
              _builder_3.append("} ");
              _builder_3.newLine();
              String _string_3 = _builder_3.toString();
              String _operator_plus_5 = StringExtensions.operator_plus(gen, _string_3);
              gen = _operator_plus_5;
            }
          }
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("cJSON_AddItemToObject(output, \"");
          String _name_1 = signal.getName();
          _builder_4.append(_name_1, "");
          _builder_4.append("\", value);}");
          String _string_4 = _builder_4.toString();
          String _operator_plus_6 = StringExtensions.operator_plus(gen, _string_4);
          gen = _operator_plus_6;
        }
      }
      _xblockexpression = (gen);
    }
    return _xblockexpression;
  }
  
  protected String _outputFunctions(final InterfaceSignalDecl it, final String moduleName) {
    return null;
  }
  
  protected String _callInputs(final Input it, final String moduleName) {
    String _xblockexpression = null;
    {
      String gen = "";
      EList<ISignal> _signals = it.getSignals();
      for (final ISignal signal : _signals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("child = cJSON_GetObjectItem(object, \"");
        String _name = signal.getName();
        _builder.append(_name, "");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("if (child != NULL){");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("present = cJSON_GetObjectItem(child, \"present\");");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("value = cJSON_GetObjectItem(child, \"value\");");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("if (present != NULL && present->type==cJSON_True) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append(moduleName, "			");
        _builder.append("_I_");
        String _name_1 = signal.getName();
        _builder.append(_name_1, "			");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        String _string = _builder.toString();
        String _operator_plus = StringExtensions.operator_plus(gen, _string);
        gen = _operator_plus;
      }
      _xblockexpression = (gen);
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
