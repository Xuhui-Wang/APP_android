package com.wangxuhui.navigationdrawer;

import java.util.Comparator;

public class Comparator_By_Last_Name implements Comparator<Legislator_data> {
    @Override
    public int compare(Legislator_data o1, Legislator_data o2) {
        return o1.last_name.compareTo(o2.last_name);
    }

}
