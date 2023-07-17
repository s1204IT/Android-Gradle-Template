package android.sample;

import android.os.Bundle;

public class Activity extends android.app.Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finishAndRemoveTask();
    }
}
