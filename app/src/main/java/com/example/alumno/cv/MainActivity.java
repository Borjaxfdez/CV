package com.example.alumno.cv;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void datos(View view) {
        Toast.makeText(getApplicationContext(), "DATOS", Toast.LENGTH_SHORT).show();
        Notification.Builder builder = new Notification.Builder(getApplicationContext());
        builder.setContentTitle("ESTUDIOS")
                .setContentText("dentro")
                .setSmallIcon(R.drawable.iconsuper)
                .setAutoCancel(true);
        Notification n = builder.build();
        NotificationManager manager = (NotificationManager) getSystemService(getApplicationContext().NOTIFICATION_SERVICE);
        manager.notify(4, builder.build());
    }

    public void estudios(View view) {
        Toast.makeText(getApplicationContext(), "ESTUDIOS", Toast.LENGTH_SHORT).show();
        Notification.Builder n = new Notification.Builder(this)
                .setContentTitle("ESTUDIOS")
                .setContentText("dentro")
                .setSmallIcon(R.drawable.iconsuper)
                .setAutoCancel(true);
        n.build();
    }

    public void idiomas(View view) {
        Toast.makeText(getApplicationContext(), "IDIOMAS", Toast.LENGTH_SHORT).show();
        Notification.Builder n = new Notification.Builder(this)
                .setContentTitle("IDIOMAS")
                .setContentText("dentro")
                .setSmallIcon(R.drawable.iconsuper)
                .setAutoCancel(true);
        n.build();
    }

    public void exp(View view) {
        Toast.makeText(getApplicationContext(), "EXPERIENCIA", Toast.LENGTH_SHORT).show();
        Notification.Builder n = new Notification.Builder(this)
                .setContentTitle("ESPERIENCIA")
                .setContentText("dentro")
                .setSmallIcon(R.drawable.iconsuper)
                .setAutoCancel(true);
        n.build();
    }

    public void llamar(View view) {
        Toast.makeText(getApplicationContext(), "LLAMAR", Toast.LENGTH_SHORT).show();
        Notification.Builder n = new Notification.Builder(this)
                .setContentTitle("LLAMAR")
                .setContentText("dentro")
                .setSmallIcon(R.drawable.iconsuper)
                .setAutoCancel(true);
        n.build();
    }

    public void email(View view) {
        Toast.makeText(getApplicationContext(), "EMAIL", Toast.LENGTH_SHORT).show();
        Notification.Builder n = new Notification.Builder(this)
                .setContentTitle("EMAIL")
                .setContentText("dentro")
                .setSmallIcon(R.drawable.iconsuper)
                .setAutoCancel(true);
        n.build();
    }

    public void maps(View view) {
        Toast.makeText(getApplicationContext(), "MAPS", Toast.LENGTH_SHORT).show();
        Notification.Builder n = new Notification.Builder(this)
                .setContentTitle("MAPS")
                .setContentText("dentro")
                .setSmallIcon(R.drawable.iconsuper)
                .setAutoCancel(true);
        n.build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.alumno.cv/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.alumno.cv/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
