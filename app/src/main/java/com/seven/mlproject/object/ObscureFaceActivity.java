package com.seven.mlproject.object;

import androidx.camera.core.CameraSelector;

import com.seven.mlproject.helpers.MLVideoHelperActivity;
import com.seven.mlproject.helpers.vision.VisionBaseProcessor;
import com.seven.mlproject.helpers.vision.obscure.ObscureFaceProcessor;
import com.seven.mlproject.helpers.vision.obscure.ObscureType;

public class ObscureFaceActivity extends MLVideoHelperActivity {

    private ObscureFaceProcessor obscureFaceProcessor;

    @Override
    protected VisionBaseProcessor setProcessor() {
        obscureFaceProcessor = new ObscureFaceProcessor(graphicOverlay);
        obscureFaceProcessor.setObscureType(ObscureType.TRANSLUCENT);
        return obscureFaceProcessor;
    }

    @Override
    protected int getLensFacing() {
        return CameraSelector.LENS_FACING_FRONT;
    }
}
