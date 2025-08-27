<#-- Toggle -->
<#-- As input variable, toggles the state of a boolean variable. 

     Example for SCCharts:
         @SimWrapper Toggle
         input bool b; -->
<#macro Toggle>
    <@input>
        // Toggle ${varName}
        ${varReference()} = !${varReference()};
    </@>
</#macro>


<#-- Inc -->
<#-- As input variable, increments a variable.

     Example for SCCharts:
         @SimWrapper Inc, 2
         input int x; -->
<#macro Inc step=1>
    <@input>
        // Inc ${varName}
        ${varReference()} += ${step};
    </@>
</#macro>


<#-- StepRange -->
<#-- As input variable, steps through a given range of values. 
     
     Example for SCCharts:
         @SimWrapper StepRange, 2, 10
         input int x; -->
<#macro StepRange from, to, step=1>
    <@input>
        // StepRange ${varName}
        ${varReference()} += ${step};
        if(${varReference()} < ${from}) ${varReference()} = ${to};
        if(${varReference()} > ${to}) ${varReference()} = ${from};
    </@>
</#macro>


<#-- LoopValues -->
<#-- As input variable, sets the variable successively to the given values.
     Does also work with values different than integers (e.g. booleans).
     
     Example for SCCharts:
         @SimWrapper LoopValues, 2, 42, 123
         input int x; -->
<#macro LoopValues values...>
    <#assign indexVar = "loopValuesIndex_" + varName />
    <@init>
        // LoopValues ${varName}
        int ${indexVar} = 0;
    </@>
    <@input>
        // LoopValues ${varName}
        <#list 0..(values?size -1) as i>
        if(${indexVar} == ${i}) { ${varReference()} = ${values[i]?c}; }
        </#list>
        ${indexVar}++;
        if(${indexVar} >= ${values?size}) { ${indexVar} = 0; }
    </@>
</#macro>


<#-- RandomInt -->
<#-- As input variable, sets the variable to a random number between min and max,
     such that min and max are also possible values.
     
     Note that the random generation is biased and not perfectly random. 
     
     Example for SCCharts:
         @SimWrapper RandomInt, 1, 100
         input int x; -->
<#macro RandomInt min, max>
    <@input>
        // RandomInt ${varName}
        ${varReference()} = ThreadLocalRandom.current().nextInt(${min}, ${max} + 1);
    </@>
</#macro>


<#-- RandomFloat -->
<#-- As input variable, sets the variable to a random number between min and max,
     such that min and max are also possible values.
     
     Note that the random generation is biased not perfectly random.
     Note also that the random values are especially biased
     by floating point inaccuracy and rounding.
     
     Example for SCCharts:
         @SimWrapper RandomFloat, 1, 2
         input float x; -->
<#macro RandomFloat min, max>
    <@input>
        // RandomFloat ${varName}
        ${varReference()} = (ThreadLocalRandom.current().nextFloat() * (${max}-${min})) + ${min};
    </@>
</#macro>


<#-- Returns code that references the current variable -->
<#function varReference>
  <#return "model."+varName>
</#function>