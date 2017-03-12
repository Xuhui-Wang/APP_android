package com.wangxuhui.navigationdrawer;

import java.util.Comparator;

public class Comparator_By_States implements Comparator<Legislator_data> {
    @Override
    public int compare(Legislator_data o1, Legislator_data o2) {
        return o1.state.compareTo(o2.state);
    }

}
