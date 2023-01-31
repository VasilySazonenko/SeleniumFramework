package framework;

import PageObjects.Page;

import java.util.concurrent.TimeUnit;

public class AssertionPromise {

    private final boolean waitSuccess;

    private final int waitTime;

    private TimeUnit timeUnit;

    public AssertionPromise(boolean waitResult, int waitTime) {
        this.waitSuccess = waitResult;
        this.waitTime = waitTime;
        this.timeUnit = TimeUnit.SECONDS;
    }

    public void andAssert(String message) {
        if (!waitSuccess) {
            throw new AssertionError(String.format("%s. Wait time: %s %s", message, waitTime, timeUnit.toString()));
        }
    }
}
