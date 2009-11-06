package de.cau.cs.kieler.synccharts.codegen.sc;

import org.eclipse.emf.ecore.EObject;

public class test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WorkflowGenerator wg = new WorkflowGenerator();
        EObject myModel = wg.getModel();
        System.out.println(myModel.toString());

    }

}
