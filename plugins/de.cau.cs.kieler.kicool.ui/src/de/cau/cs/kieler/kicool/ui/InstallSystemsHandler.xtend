/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog
import java.util.ArrayList
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Composite
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.CoreException
import org.eclipse.xtext.ui.internal.Activator
import java.util.Comparator
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.swt.widgets.Shell
import org.eclipse.ui.IMemento

/**
 * @author kolja
 * 
 */
class InstallSystemsHandler extends AbstractHandler {

    static class SystemDialog extends FilteredItemsSelectionDialog {

        static val resources = new ArrayList();

        static def generateRescourcesTestCases(char startChar, char endChar, int length, String resource) {
            for (var ch = startChar; ch <= endChar; ch++) {

                var res = resource + String.valueOf(ch);
                if (length == res.length()) {
                    resources.add(res);
                } else if ((res.trim().length() % 2) == 0) {
                    generateRescourcesTestCases(Character.toUpperCase((startChar + 1) as char),
                        Character.toUpperCase((endChar + 1) as char), length, res);
                } else
                    generateRescourcesTestCases(Character.toLowerCase((startChar + 1) as char),
                        Character.toLowerCase((endChar + 1) as char), length, res);
            }
        }

        override protected Control createExtendedContentArea(Composite parent) {
            return null;
        }

        override protected ItemsFilter createFilter() {
            return new ItemsFilter() {
                override boolean matchItem(Object item) {
                    return matches(item.toString());
                }

                override boolean isConsistentItem(Object item) {
                    return true;
                }
            };
        }

        override protected fillContentProvider(AbstractContentProvider contentProvider, ItemsFilter itemsFilter,
            IProgressMonitor progressMonitor) throws CoreException {
            progressMonitor.beginTask("Searching", resources.size()); // $NON-NLS-1$
            for (val iter = resources.iterator(); iter.hasNext();) {
                contentProvider.add(iter.next(), itemsFilter);
                progressMonitor.worked(1);
            }
            progressMonitor.done();
        }

        static val DIALOG_SETTINGS = "FilteredResourcesSelectionDialogExampleSettings";

        override protected getDialogSettings() {
            var settings = Activator.getDefault().getDialogSettings().getSection(DIALOG_SETTINGS);
            if (settings === null) {
                settings = Activator.getDefault().getDialogSettings().addNewSection(DIALOG_SETTINGS);
            }
            return settings;
        }

        override getElementName(Object item) {
            return item.toString();
        }

        override protected getItemsComparator() {
            return new Comparator() {
                override compare(Object arg0, Object arg1) {
                    return arg0.toString().compareTo(arg1.toString());
                }
            };
        }

        override protected IStatus validateItem(Object item) {
            return Status.OK_STATUS;
        }

        new(Shell shell, boolean multi) {
            super(shell, multi);
            setTitle("Filtered Resources Selection Dialog Example");
            setSelectionHistory(new ResourceSelectionHistory());
        }

        private static class ResourceSelectionHistory extends SelectionHistory {
            override protected Object restoreItemFromMemento(IMemento element) {
                return null;
            }

            override protected storeItemToMemento(
                Object item,
                IMemento element
            ) {
            }
        }
    }

    override execute(ExecutionEvent event) throws ExecutionException {

        val dialog = new SystemDialog(new Shell(), true);
        SystemDialog.generateRescourcesTestCases('A', 'C', 8, "")
        SystemDialog.generateRescourcesTestCases('a', 'c', 4, "")
        dialog.setInitialPattern("a");
        dialog.open();
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }

}
