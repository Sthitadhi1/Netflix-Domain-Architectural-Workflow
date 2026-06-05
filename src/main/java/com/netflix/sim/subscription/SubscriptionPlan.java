package com.netflix.sim.subscription;

public abstract class SubscriptionPlan {
    private final String planName;
    private final double monthlyCost;

    protected SubscriptionPlan(String planName, double monthlyCost) {
        this.planName = planName;
        this.monthlyCost = monthlyCost;
    }

    public String getPlanName() { return planName; }
    public double getMonthlyCost() { return monthlyCost; }

    public abstract void displayFeatures();

    public double calculateMonthlyCost() { return monthlyCost; }
}
