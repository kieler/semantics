package de.cau.cs.kieler.synccharts.codegen.s.xtend;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ComparableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Helper {
  
  public Boolean isRootState(final State state) {
    Region _parentRegion = state.getParentRegion();
    State _parentState = _parentRegion.getParentState();
    boolean _operator_equals = ObjectExtensions.operator_equals(_parentState, null);
    return ((Boolean)_operator_equals);
  }
  
  public String getParentRegionString(final State state) {
    String _xblockexpression = null;
    {
      Region _parentRegion = state.getParentRegion();
      Region region = _parentRegion;
      String _xifexpression = null;
      State _parentState = region.getParentState();
      EList<Region> _regions = _parentState.getRegions();
      int _size = _regions.size();
      boolean _operator_equals = ObjectExtensions.operator_equals(((Integer)_size), ((Integer)1));
      if (_operator_equals) {
        _xifexpression = "";
      } else {
        String _id = region.getId();
        String _operator_plus = StringExtensions.operator_plus("_", _id);
        _xifexpression = _operator_plus;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public String getStatePathAsName(final State state) {
    String _xifexpression = null;
    Boolean _isRootState = this.isRootState(state);
    if (_isRootState) {
      String _xifexpression_1 = null;
      EList<Region> _regions = state.getRegions();
      int _size = _regions.size();
      boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)_size), ((Integer)1));
      if (_operator_greaterThan) {
        String _id = state.getId();
        String _operator_plus = StringExtensions.operator_plus("_", _id);
        _xifexpression_1 = _operator_plus;
      } else {
        _xifexpression_1 = "L";
      }
      _xifexpression = _xifexpression_1;
    } else {
      String _xblockexpression = null;
      {
        String _parentRegionString = this.getParentRegionString(state);
        String regionString = _parentRegionString;
        Region _parentRegion = state.getParentRegion();
        State _parentState = _parentRegion.getParentState();
        String _statePathAsName = this.getStatePathAsName(_parentState);
        String _operator_plus_1 = StringExtensions.operator_plus(_statePathAsName, regionString);
        String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "_");
        String _id_1 = state.getId();
        String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _id_1);
        _xblockexpression = (_operator_plus_3);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
}