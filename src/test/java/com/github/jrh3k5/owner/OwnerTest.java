package com.github.jrh3k5.owner;

import org.aeonbits.owner.Config;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.aeonbits.owner.ConfigFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class OwnerTest {
    @Test
    @Parameters({"env"})
    public void TestConfigResolution(String envProp) {
        final OwnerDemoConfig config = ConfigFactory.create(OwnerDemoConfig.class, System.getenv(), System.getProperties());
        assertThat(config).isNotNull();

        switch(envProp) {
            case "dev":
                assertThat(config.keyMatches()).isEqualTo("devWithMatch");
                assertThat(config.getNonMatchingKey()).isEqualTo("devNoMatch");
                break;
            case "test":
                assertThat(config.keyMatches()).isEqualTo("testWithMatch");
                assertThat(config.getNonMatchingKey()).isEqualTo("testNoMatch");
                break;
            default:
                throw new RuntimeException("Unrecognized environment value: " + envProp);
        }
    }
}
