package com.epicodus.myrestaurants.util;

/**
 * Created by Guest on 4/2/18.
 */

public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPostion);
    void onItemDismiss(int position);
}
