package com.seven.mlproject.object;

import android.os.Bundle;

import com.seven.mlproject.helpers.MLVideoHelperActivity;
import com.seven.mlproject.helpers.vision.drowsiness.FaceDrowsinessDetectorProcessor;
import com.seven.mlproject.helpers.vision.VisionBaseProcessor;

public class DriverDrowsinessDetectionActivity extends MLVideoHelperActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected VisionBaseProcessor setProcessor() {
        return new FaceDrowsinessDetectorProcessor(graphicOverlay);
    }
}
