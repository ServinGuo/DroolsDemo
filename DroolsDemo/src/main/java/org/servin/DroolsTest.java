package org.servin;

import java.io.IOException;

/**
 * Test Drools
 *
 * @author Candy
 */
public class DroolsTest {

    public static void main(String[] args) throws IOException {
        RuleEngine engineImpl = new RuleEngineImpl();
        engineImpl.init();
        final EntityRule entityRule = new EntityRule();
        entityRule.setCurrentmoney(350d);
        entityRule.setUsername("Candy");
        entityRule.setAccount(true);
        entityRule.setTotailaddmoney(350d);
        entityRule.setAddtime(7);
        engineImpl.execute(entityRule);

    }

}