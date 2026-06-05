package com.netflix.sim;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.netflix.sim.subscription.FamilyPlan;
import com.netflix.sim.subscription.PremiumPlan;
import com.netflix.sim.subscription.SubscriptionPlan;

public class Level3Test {
    @Test
    void subscriptionPlanPolymorphismWorks() {
        SubscriptionPlan premium = new PremiumPlan();
        assertEquals("Premium", premium.getPlanName());
        assertEquals(19.99, premium.calculateMonthlyCost(), 0.001);

        SubscriptionPlan family = new FamilyPlan();
        assertEquals("Family", family.getPlanName());
        assertEquals(14.99, family.calculateMonthlyCost(), 0.001);
    }
}
