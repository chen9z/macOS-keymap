package com.looper.macoskeymap;

import com.intellij.openapi.keymap.Keymap;
import com.intellij.openapi.keymap.KeymapManager;

/**
 * @author looper
 * @date 2023-12-19
 **/
public class KeymapRemapper {

    public void remapKeymap() {
        KeymapManager keymapManager = KeymapManager.getInstance();
        Keymap activeKeymap = keymapManager.getActiveKeymap();
        System.out.println(activeKeymap.getName());
    }

}
