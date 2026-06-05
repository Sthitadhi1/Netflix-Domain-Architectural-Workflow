package com.netflix.sim;

import com.netflix.sim.subscription.FamilyPlan;
import com.netflix.sim.subscription.PremiumPlan;
import com.netflix.sim.subscription.SubscriptionPlan;

public class Level3 {
    public static void run() {
        System.out.println();
        System.out.println("-- Level 3: Subscription Plans --");
        SubscriptionPlan plan = new PremiumPlan();
        System.out.println("Starting subscription: " + plan.getPlanName() + " cost=" + plan.calculateMonthlyCost());
        plan.displayFeatures();

        plan = new FamilyPlan();
        System.out.println("Switched subscription to: " + plan.getPlanName() + " cost=" + plan.calculateMonthlyCost());
        plan.displayFeatures();
    }
}
