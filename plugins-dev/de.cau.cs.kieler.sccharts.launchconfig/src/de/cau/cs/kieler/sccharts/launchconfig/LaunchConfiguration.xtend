package de.cau.cs.kieler.sccharts.launchconfig

import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.debug.core.ILaunch
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate2

class LaunchConfiguration implements ILaunchConfigurationDelegate2 {

    public static val ATTR_COMPILE_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.compile"
    public static val ATTR_DEPLOY_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.deploy" 
    public static val ATTR_RUN_COMMAND = "de.cau.cs.kieler.scchart.launchconfig.execute.command.run"
    
    override void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
        IProgressMonitor monitor) throws CoreException {
        // TODO Auto-generated method stub
        System.out.println("Now launching an SCT project!")
    }

    override ILaunch getLaunch(ILaunchConfiguration configuration, String mode) throws CoreException {
        // TODO Auto-generated method stub
        return null
    }

    override boolean buildForLaunch(ILaunchConfiguration configuration, String mode,
        IProgressMonitor monitor) throws CoreException {
        // TODO Auto-generated method stub
        System.out.println("buildForLaunch SCT project!")
        return true
    }

    override boolean finalLaunchCheck(ILaunchConfiguration configuration, String mode,
        IProgressMonitor monitor) throws CoreException {
        // TODO Auto-generated method stub
        System.out.println("finalLaunchCheck SCT project!")
        return true
    }

    override boolean preLaunchCheck(ILaunchConfiguration configuration, String mode,
        IProgressMonitor monitor) throws CoreException {
        // TODO Auto-generated method stub
        System.out.println("preLaunchCheck SCT project!")
        return true
    }

}
