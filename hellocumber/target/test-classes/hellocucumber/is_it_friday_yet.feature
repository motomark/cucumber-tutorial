Feature: Is it Friday yet
    Everybody wnats to know when it's Friday
    
    Scenario: Sunday isn't Friday
        Given today is Sunday
        When I ask wether it's Friday yet
        Then I should be told "Nope"

    Scenario: Friday is Friday
        Given today is Friday
        When I ask wether it's Friday yet
        Then I should be told "TGIF"

    