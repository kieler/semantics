package de.cau.cs.kieler.scg.opt.test;

import de.cau.cs.kieler.sim.kiem.test.KiemAutomatedJUnitTest;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import java.util.List;
import java.util.ArrayList;

public class SimulateModels extends KiemAutomatedJUnitTest {
	static int runs = 50;
    public SimulateModels(final IPath esoFile) {
        super(esoFile);
    }
    protected String getPluginId() {
        return "de.cau.cs.kieler.scg.opt.test";
    }
    protected IPath getBundleTestPath() {
        return null;
    }
    protected List<IPath> getBundleTestPaths() {
        List paths = new ArrayList<IPath>();
        paths.add(new Path("/tests/"));
        //paths.add(new Path("/longtest/"));
        return paths;
    }
    protected String getModelFileExtension() {
        return "sct";
    }
    protected String getTemporaryWorkspaceFolderName() {
        return "test-sccharts-c";
    }
    protected String getExecutionFileName() {
    	// seq_scg, cp, rv, cprv, rvcp
    	return "rvcp.execution";
    }
    @Override
    protected IPath getExternalRelativeTestPath() {
        return null;
    }
    @Override
    protected boolean stopOnError() {
        return false;
    }
    @Override
    public void kiemAutomatedJUnitTestExecution() {
    	for(int i = 0; i < runs; i++) // to secure a correct value
    	{
        	super.kiemAutomatedJUnitTestExecution();
    	}
    }
}