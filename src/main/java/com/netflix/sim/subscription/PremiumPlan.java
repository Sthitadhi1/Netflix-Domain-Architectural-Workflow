package com.netflix.sim.subscription;

public class PremiumPlan extends SubscriptionPlan {
    public PremiumPlan() { super("Premium", 19.99); }

    @Override
    public void displayFeatures() {
        System.out.println("PremiumPlan: 4K Ultra HD, 4 screens, all devices");
    }
}
