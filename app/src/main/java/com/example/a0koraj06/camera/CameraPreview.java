package com.example.a0koraj06.camera;

import android.app.AlertDialog;
import android.content.Context;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by 0koraj06 on 19/04/2018.
 */

public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {


    Camera camera;

    public CameraPreview(Context ctx) {
        try {
            super(ctx);
            camera = Camera.open();
            this.getHolder().addCallback(this);
        } catch (Exception e) {
            new AlertDialog.Builder(ctx).setMessage(e.toString()).setPositiveButton("OK", null).show();
        }
    }


    public void surfaceCreated(SurfaceHolder holder){
        try {

            camera.setPreviewDisplay(holder);
            camera.startPreview();

        } catch (Exception e)

            {
                Log.d("cameraApp", e.toString());

            }

        }

        public void surfaceDestroyed(SurfaceHolder holder)


    }
