package de.cau.cs.kieler.kvid.datadistributor;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

import de.cau.cs.kieler.kvid.data.KViDDataType;

public class KViDPropertySource implements IPropertySource {
    
    
    public KViDPropertySource() {
    }

    public Object getEditableValue() {
        // TODO Auto-generated method stub
        return null;
    }

    public IPropertyDescriptor[] getPropertyDescriptors() {
        IPropertyDescriptor[] propertyDescriptors =
            new IPropertyDescriptor[KViDDataDistributor.getInstance().getKnownOptions().size()];
        int i = 0;
        for (KViDOptionData optionData : KViDDataDistributor.getInstance().getKnownOptions()) {
            propertyDescriptors[i] = new KViDPropertyDescriptor(optionData);
            i++;
        }
        return propertyDescriptors;
    }

    public Object getPropertyValue(Object id) {
        Object value = null;
        for (KViDOptionData optionData : KViDDataDistributor.getInstance().getKnownOptions()) {
            if (optionData.getId().equals(id)) {
                return optionData.getCurrentValue();
            }
        }
        return value;
    }

    public boolean isPropertySet(Object id) {
        return true;
    }

    public void resetPropertyValue(Object id) {
        for (KViDOptionData optionData : KViDDataDistributor.getInstance().getKnownOptions()) {
            if (optionData.getId().equals(id)) {
                optionData.setCurrentValue(0);
            }
        }

    }

    public void setPropertyValue(Object id, Object value) {
        for (KViDOptionData optionData : KViDDataDistributor.getInstance().getKnownOptions()) {
            if (optionData.getId().equals(id)) {
                optionData.setCurrentValue(1);
            }
        }
    }

}
