package de.cau.cs.kieler.kev.application;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.dialogs.PreferencesUtil;



public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    protected void makeActions(IWorkbenchWindow window) {
 //   	registerAsGlobal(ActionFactory.NEW_WIZARD_DROP_DOWN.create(window));
//		registerAsGlobal(ActionFactory.SAVE.create(window));
//		registerAsGlobal(ActionFactory.SAVE_AS.create(window));
		registerAsGlobal(ActionFactory.ABOUT.create(window));
//		registerAsGlobal(ActionFactory.SAVE_ALL.create(window));
		registerAsGlobal(ActionFactory.UNDO.create(window));
		registerAsGlobal(ActionFactory.REDO.create(window));
		registerAsGlobal(ActionFactory.CUT.create(window));
		registerAsGlobal(ActionFactory.COPY.create(window));
		registerAsGlobal(ActionFactory.PASTE.create(window));
		registerAsGlobal(ActionFactory.SELECT_ALL.create(window));
		registerAsGlobal(ActionFactory.FIND.create(window));
		registerAsGlobal(ActionFactory.CLOSE.create(window));
		registerAsGlobal(ActionFactory.CLOSE_ALL.create(window));
		registerAsGlobal(ActionFactory.CLOSE_ALL_SAVED.create(window));
		registerAsGlobal(ActionFactory.REVERT.create(window));
		registerAsGlobal(ActionFactory.HELP_CONTENTS.create(window));
		registerAsGlobal(ActionFactory.PREFERENCES.create(window));
		registerAsGlobal(ActionFactory.QUIT.create(window));
    }

    /**
	 * Registers the action as global action and registers it for disposal.
	 * 
	 * @param action the action to register
	 */
	private void registerAsGlobal(IAction action) {
		getActionBarConfigurer().registerGlobalAction(action);
		register(action);
	}
    
    protected void fillMenuBar(IMenuManager menuBar) {
    	menuBar.add(createFileMenu());
		//menuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		menuBar.add(createPreferencesAction());
		menuBar.add(createHelpMenu());
    }
    
    /**
	 * Creates and returns the File menu.
	 * 
	 * @return a menu manager holding the File menu
	 */
	private MenuManager createFileMenu() {
		MenuManager menu = new MenuManager("&File", IWorkbenchActionConstants.M_FILE);
//		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));
		
//		menu.add(getAction(ActionFactory.NEW_WIZARD_DROP_DOWN.getId()));
//		menu.add(new GroupMarker(IWorkbenchActionConstants.NEW_EXT));

		menu.add(new GroupMarker(IWorkbenchActionConstants.CLOSE_EXT));
		menu.add(new Separator());

		menu.add(new GroupMarker(IWorkbenchActionConstants.MRU));
		menu.add(new Separator());
		menu.add(getAction(ActionFactory.QUIT.getId()));
		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));
		return menu;
	}
	
	/**
	 * Creates and returns the Help menu.
	 * 
	 * @return a menu manager holding the Help menu
	 */
	private MenuManager createHelpMenu() {
		MenuManager menu = new MenuManager("&Help", IWorkbenchActionConstants.M_HELP);
		menu.add(new GroupMarker(IWorkbenchActionConstants.HELP_START));
		menu.add(getAction(ActionFactory.HELP_CONTENTS.getId()));
		menu.add(new GroupMarker(IWorkbenchActionConstants.HELP_END));
		menu.add(new Separator("about")); //$NON-NLS-1$
		menu.add(getAction(ActionFactory.ABOUT.getId()));
		return menu;
	}
	
	private Action createPreferencesAction(){
		Action preferenceAction = new Action() {
			public void run() {
				String[] displayedIds = {"de.cau.cs.kieler.kev.PreferencePage"};
				PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(null, displayedIds[0], null, null);
				dialog.open();
			}
		};
		preferenceAction.setText("Preferences");
		preferenceAction.setToolTipText("Open Preferences");
		return preferenceAction;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.application.ActionBarAdvisor#fillCoolBar(org.eclipse.jface.action.ICoolBarManager)
	 */
	protected void fillCoolBar(ICoolBarManager cbManager) {
	}
    
}
