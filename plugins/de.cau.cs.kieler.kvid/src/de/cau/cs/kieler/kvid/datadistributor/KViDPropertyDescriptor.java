package de.cau.cs.kieler.kvid.datadistributor;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

public class KViDPropertyDescriptor implements IPropertyDescriptor {

    private KViDOptionData optionData;
    
    KViDOptionLabelProvider labelProvider;
    
    public KViDPropertyDescriptor(KViDOptionData theoptiondata) {
        this.optionData = theoptiondata;
    }
    
    /**
     * {@inheritDoc}
     */
    public CellEditor createPropertyEditor(final Composite parent) {
        switch(optionData.getType()) {
            case BOOLEAN:
                return new ComboBoxCellEditor(parent, optionData.getChoices(), SWT.READ_ONLY);
            default:
                return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    public String getCategory() {
        return optionData.getDescription();
    }

    /**
     * {@inheritDoc}
     */
    public String getDescription() {
        return optionData.getDescription();
    }
    
    /**
     * {@inheritDoc}
     */
    public String getDisplayName() {
        return optionData.getName();
    }

    /**
     * {@inheritDoc}
     */
    public String[] getFilterFlags() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public Object getHelpContextIds() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public Object getId() {
        return optionData.getId();
    }

    /**
     * {@inheritDoc}
     */
    public ILabelProvider getLabelProvider() {
        if (labelProvider == null) {
            labelProvider = new KViDOptionLabelProvider();
        }
        return labelProvider;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isCompatibleWith(final IPropertyDescriptor anotherProperty) {
        return anotherProperty instanceof KViDPropertyDescriptor
            && this.optionData.getId().equals(anotherProperty.getId());
    }
    
    private class KViDOptionLabelProvider extends LabelProvider {
        
        @Override
        public String getText(Object element) {
            switch(optionData.getType()) {
                case STRING:
                    return (String) element;
                case BOOLEAN:
                    return optionData.getChoices()[(Integer) element];
                default:
                    return element.toString();
            }
        }
        
    }

}
