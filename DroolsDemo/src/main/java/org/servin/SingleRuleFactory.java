package org.servin;

import org.drools.RuleBase;
import org.drools.RuleBaseFactory;

/**
 * To create a singleton factory.
 *
 * @author Candy
 */
public class SingleRuleFactory {

    private static RuleBase ruleBase;

    /**
     * Get the base factory.
     *
     * @return
     */
    public static RuleBase getRuleBase() {
        return null != ruleBase ? ruleBase : RuleBaseFactory.newRuleBase();
    }
}