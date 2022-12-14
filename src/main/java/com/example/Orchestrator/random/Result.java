package com.example.Orchestrator.random;

public class Result{
    public Random random;
    public int bitsUsed;
    public int bitsLeft;
    public int requestsLeft;
    public int advisoryDelay;

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getBitsUsed() {
        return bitsUsed;
    }

    public void setBitsUsed(int bitsUsed) {
        this.bitsUsed = bitsUsed;
    }

    public int getBitsLeft() {
        return bitsLeft;
    }

    public void setBitsLeft(int bitsLeft) {
        this.bitsLeft = bitsLeft;
    }

    public int getRequestsLeft() {
        return requestsLeft;
    }

    public void setRequestsLeft(int requestsLeft) {
        this.requestsLeft = requestsLeft;
    }

    public int getAdvisoryDelay() {
        return advisoryDelay;
    }

    public void setAdvisoryDelay(int advisoryDelay) {
        this.advisoryDelay = advisoryDelay;
    }
}