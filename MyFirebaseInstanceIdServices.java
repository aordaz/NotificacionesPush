package com.example.alejandroordaz.notificacionespush;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Alejandro Ordaz on 05/08/2017.
 */

public class MyFirebaseInstanceIdServices extends FirebaseInstanceIdService {

    //el tag me sirve para ver en consola cuando haya un aviso
    public static final String TAG = "AvisoFireBase";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        //hacemos lo que queremos cuando el token se refresque

        String token = FirebaseInstanceId.getInstance().getToken();

        Log.d(TAG,"Token Asignado: "+token);

    }
}
