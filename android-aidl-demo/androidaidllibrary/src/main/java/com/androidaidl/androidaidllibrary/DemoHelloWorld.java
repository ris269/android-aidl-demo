package com.androidaidl.androidaidllibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by RIS on 04/06/2018.
 */

public class DemoHelloWorld {
    public DemoHelloWorld() {
    }

    public void sayHi(Context context){
        Toast.makeText(context, "HELLO WORLD", Toast.LENGTH_SHORT).show();
    }
}
