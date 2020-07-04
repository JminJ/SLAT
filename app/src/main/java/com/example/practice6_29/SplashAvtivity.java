package com.example.practice6_29;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import androidx.annotation.Nullable;

public class SplashAvtivity extends Thread {

    private Handler handler;

    public SplashAvtivity(Handler handler){
        this.handler = handler;
    }

    @Override
    public void run() {
        Message msg = new Message();

        try{
            Thread.sleep(3000);
            msg.what = 1;
            handler.sendEmptyMessage(msg.what);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
