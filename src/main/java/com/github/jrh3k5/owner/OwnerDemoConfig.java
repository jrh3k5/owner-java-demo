package com.github.jrh3k5.owner;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${env}.properties")
public interface OwnerDemoConfig extends Config {
    String keyMatches();

    @Config.Key("nonMatchingKeyABC")
    String getNonMatchingKey();
}
