package com.example.administrator.lesson18_service3_aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import aidl.IMathAidlInterface;

/**
 * Created by Administrator on 2016/11/11.
 */

public class MathService extends Service {

    private IMathAidlInterface.Stub stub = new IMathAidlInterface.Stub() {

        @Override
        public int add(int i, int j) throws RemoteException {
            return i + j;
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        return stub;
    }
}
