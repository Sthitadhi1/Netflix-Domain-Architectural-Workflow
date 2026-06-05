package com.netflix.sim.subscription;

public class FamilyPlan extends SubscriptionPlan {
    public FamilyPlan() { super("Family", 14.99); }

    @Override
    public void displayFeatures() {
        System.out.println("FamilyPlan: HD quality, 2 screens, shared household");
    }
}
