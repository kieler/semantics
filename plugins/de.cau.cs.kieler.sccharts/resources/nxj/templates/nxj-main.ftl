<#include "/templates/injection.ftl">
//package kieler-gen;

<@inject position="header" />
//#include "${tickdata_file}"


import lejos.nxt.*;
import lejos.nxt.addon.*;
import lejos.nxt.comm.RConsole;

public class Main${model_name} {
    // Instantiate SCChart
    public static ${tickdata_type} scchart = new ${tickdata_type}();
    
    <@inject position="global-decl" />
    <@inject position="body" />
    
    public static void main(String[] args) {
        
        // RConsole is meant to be used
        // together with the nxjconsoleviewer program in the leJOS bin directory.
//        RConsole.openUSB(10000);
//        RConsole.println("RConsole opened");

        // Init SCChart
        <@inject position="local-decl" />
        System.out.println("running...");
        scchart.reset();
        <@inject position="init" /><#nt>

        // Init Annotations
        
        // Tick loop
        <@inject position="start-loop" /><#nt>
        while(!Button.ESCAPE.isDown()){
            
          // Update input annotations
          <@inject position="input" /><#nt>
        
          // Tick
          <@inject position="pre-tick" /><#nt>
          scchart.tick();
          <@inject position="post-tick" /><#nt>
        
          // Update output annotations
          <@inject position="output" /><#nt>

        }
        <@inject position="end-loop" /><#nt>
        
//        RConsole.close();
    }
}

