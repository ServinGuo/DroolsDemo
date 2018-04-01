package org.servin;

/**
 * RuleEngine-Interface
 *
 * @author Candy
 */
public interface RuleEngine {

    /**
     * Initializes the rules engine.
     */
    public void init();

    /**
     * Refresh the rules engine.
     */
    public void refresh();

    /**
     * Execute the rules engine.
     */
    public void execute(final EntityRule entityRule);
}