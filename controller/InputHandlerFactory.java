package org.example.rpg.controller;

import org.example.rpg.controller.input.KeyboardInputHandler;

public final class InputHandlerFactory {
    public static Handler createKeyboard(){
        return new KeyboardInputHandler();
    }
}
