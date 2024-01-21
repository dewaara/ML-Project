package com.seven.mlproject.object;

import android.os.Bundle;

import com.seven.mlproject.helpers.MLVideoHelperActivity;
import com.seven.mlproject.helpers.vision.VisionBaseProcessor;
import com.seven.mlproject.helpers.vision.posedetector.PoseDetectorProcessor;
import com.google.mlkit.vision.pose.accurate.AccuratePoseDetectorOptions;

public class PoseDetectionActivity extends MLVideoHelperActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected VisionBaseProcessor setProcessor() {
        AccuratePoseDetectorOptions options = new AccuratePoseDetectorOptions.Builder()
                .setDetectorMode(AccuratePoseDetectorOptions.STREAM_MODE)
                .build();
        return new PoseDetectorProcessor(
                options,
                true,
                false,
                false,
                false,
                true,
                this,
                graphicOverlay,
                previewView
            );
    }
}
