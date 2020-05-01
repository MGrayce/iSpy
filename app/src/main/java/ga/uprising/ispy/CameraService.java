package ga.uprising.ispy;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;


public class CameraService extends Service {

    public CameraService() { }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        CameraManager mgr = CameraManager.getInstance(CameraService.this);
        mgr.takePhoto();
        return START_NOT_STICKY;
    }
}
