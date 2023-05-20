package com.example.testtoasterlibrary

import android.content.Context
import android.widget.Toast

public class TestToasterMessage {
    public fun toast(contextObj: Context, messageStr: String) {
        Toast.makeText(contextObj, messageStr, Toast.LENGTH_SHORT).show()
    }
}