package com.example.alejandroordaz.notificacionespush;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Alejandro Ordaz on 05/08/2017.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);


        //validad si el mensaje tiene una notificación

        if(remoteMessage.getNotification() != null){
            //verificar quien lo manda
            String remitente = remoteMessage.getFrom();
            Log.d(MyFirebaseInstanceIdServices.TAG,"From: "+remitente);


        }

    }
}
