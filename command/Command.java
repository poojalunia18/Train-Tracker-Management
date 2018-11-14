package com.thoughtworks.trains.command;

import com.thoughtworks.trains.Commuter;

/**
 * Provides a general interface to process input commands. Each implementation
 * should use the {@link Commuter} class to carry on their particular action
 * 
 * @see Commuter
 * 
 */
public interface Command {
    void execute(Commuter commuter);

}
