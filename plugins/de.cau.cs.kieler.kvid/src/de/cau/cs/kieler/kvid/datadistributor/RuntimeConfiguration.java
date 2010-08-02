package de.cau.cs.kieler.kvid.datadistributor;

public class RuntimeConfiguration {
    
    private static RuntimeConfiguration instance = new RuntimeConfiguration();
    
    private boolean animation = true;
    
    public static final int DISAPPEAR_AFTER_ANIMATION = 1;
    
    public static final int STAY_AT_LAST_POSITION = 2;
    
    private int figureBehaviorAfterAnimation = DISAPPEAR_AFTER_ANIMATION;
    
    public static final int AT_BEGINNING = 101;
    
    public static final int AT_END = 102;
    
    private int placementIfStatic = AT_BEGINNING;
    
    private RuntimeConfiguration() {
        
    }
    
    public static RuntimeConfiguration getInstance() {
        return instance;
    }
    
    public boolean isAnimating() {
        return animation;
    }
    
    public void setAnimating(boolean isActive) {
        animation = isActive;
    }
    
    public int getAfterAnimationFigureBehavior() {
        return figureBehaviorAfterAnimation;
    }
    
    public void setAfterAnimationFigureBehavior(int newBehavior) {
        if (0 < newBehavior && newBehavior < 3) {
            figureBehaviorAfterAnimation = newBehavior;
        } else {
            throw new RuntimeException("Unknown option type for after animation behavior.");
        }
    }
    
    public int getPlacementIfStatic() {
        return placementIfStatic;
    }
    
    public void setPlacementIfStatic(int newPlacement) {
        if (100 < newPlacement && newPlacement < 103) {
            placementIfStatic = newPlacement;
        } else {
            throw new RuntimeException("Unknown option type for static placement.");
        }
    }
    
    public void resetToDefault() {
        animation = true;
        figureBehaviorAfterAnimation = DISAPPEAR_AFTER_ANIMATION;
        placementIfStatic = AT_BEGINNING;
    }
    
}
