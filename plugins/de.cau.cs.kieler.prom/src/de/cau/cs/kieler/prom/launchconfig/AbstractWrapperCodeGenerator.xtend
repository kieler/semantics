package de.cau.cs.kieler.prom.launchconfig

abstract class AbstractWrapperCodeGenerator implements IWrapperCodeGenerator {
    
    private LaunchConfiguration launchConfig
    
    override getLaunchConfiguration() {
        return launchConfig
    }
    
    override setLaunchConfiguration(LaunchConfiguration value) {
        launchConfig = value
    }
    
}