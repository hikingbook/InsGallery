/**
 * Author by robin, Date on 5/9/21.
 * Comment:
 *  - Create the currentSelectedImagesResult()
 */
package com.luck.picture.lib.listener;

import java.util.List;

public interface OnCurrentSelectedResultListener<T> {
    /**
     * return LocalMedia result when selected
     *
     * @param result
     */
    boolean onResult(List<T> result);
}
