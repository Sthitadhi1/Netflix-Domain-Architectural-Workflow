package com.netflix.sim.subscription;

public class MobilePlan extends SubscriptionPlan {
    public MobilePlan() { super("Mobile", 7.99); }

    @Override
    public void displayFeatures() {
        System.out.println("MobilePlan: SD quality, 1 screen, mobile only");
    }
}
