package com.dewords.pope.gui.helpers;

import java.lang.System;

/**
 * Delegate managing the key shortcuts for the players.
 * This class routes the key events to the player actions
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/dewords/pope/gui/helpers/PlayerKeyListenerDelegate;", "", "keycodeListener", "Lcom/dewords/pope/gui/helpers/KeycodeListener;", "(Lcom/dewords/pope/gui/helpers/KeycodeListener;)V", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "pope-player_debug"})
public final class PlayerKeyListenerDelegate {
    private final com.dewords.pope.gui.helpers.KeycodeListener keycodeListener = null;
    
    public PlayerKeyListenerDelegate(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.helpers.KeycodeListener keycodeListener) {
        super();
    }
    
    /**
     * Launches a player action depending on a [KeyEvent]
     *
     * @param keyCode: the keycode from the event
     * @param event: the key event with modifiers etc
     *
     * @return true if the event was consumed, false otherwise
     */
    public final boolean onKeyDown(int keyCode, @org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
}