package id.sch.smktelkom_mlg.project.xiirpl406162636.pencariankoskelompok6;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Shifa amelia on 11/20/2016.
 */
public class FireApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);

    }
}
