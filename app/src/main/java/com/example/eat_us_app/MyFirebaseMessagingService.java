package com.example.eat_us_app;

import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseMsgService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "From: " + remoteMessage.getFrom());

        // 푸시 알림이 데이터 페이로드를 포함하는 경우 처리
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload: " + remoteMessage.getData());

            // 알림을 처리하고 사용자에게 표시하는 로직을 추가하세요
            // 예: sendNotification(remoteMessage.getData().get("message"));
        }

        // 푸시 알림이 알림 메시지를 포함하는 경우 처리
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());

            // 알림을 처리하고 사용자에게 표시하는 로직을 추가하세요
            // 예: sendNotification(remoteMessage.getNotification().getBody());
        }
    }

    // 사용자에게 푸시 알림을 표시하는 메서드
    private void sendNotification(String messageBody) {
        // 알림을 생성하고 표시하는 로직을 추가하세요
    }
}
