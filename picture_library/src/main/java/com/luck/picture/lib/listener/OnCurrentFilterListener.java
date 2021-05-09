/**
 * Author by robin, Date on 5/9/21.
 * Comment:
 *  - Create the currentFilterResult()
 */
package com.luck.picture.lib.listener;

import com.luck.picture.lib.instagram.filter.FilterType;

import java.util.List;

public interface OnCurrentFilterListener {
    /**
     * return FilterType result when selected
     *
     * @param filter
     */
    boolean onResult(FilterType filter);
}
