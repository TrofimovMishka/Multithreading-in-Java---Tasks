package com.javarush.task.task22.task2201;

public class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        final String string = "%s : %s : %s";
        if (Solution.FIRST_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForFirstThread(t, e, string));
        } else if (Solution.SECOND_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForSecondThread(t, e, string));
        } else {
            System.out.println(getFormattedStringForOtherThread(t, e, string));
        }
    }

    protected String getFormattedStringForOtherThread(Thread t, Throwable e, String string) {
        String middle = getString(e);
        return String.format(string, middle, e.getMessage(), t.getName());
    }

    protected String getFormattedStringForSecondThread(Thread t, Throwable e, String string) {
        String middle = getString(e);
        return String.format(string, e.getMessage(), middle, t.getName());
    }

    protected String getFormattedStringForFirstThread(Thread t, Throwable e, String string) {
        String middle = getString(e);
        String last = e.getMessage();
        return String.format(string, t.getName(), middle, last);
    }

    private String getString(Throwable e) {
        String[] arr = e.toString().split(":")[0].split("\\.");
        return arr[arr.length - 1];
    }
}
