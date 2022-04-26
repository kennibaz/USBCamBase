package com.viziolinq.vtest2;

import com.serenegiant.common.BaseActivity;
import com.serenegiant.usb.CameraDialog;
import com.serenegiant.usb.USBMonitor;

public class NewActivity extends BaseActivity implements CameraDialog.CameraDialogParent{
    @Override
    public USBMonitor getUSBMonitor() {
        return null;
    }

    @Override
    public void onDialogResult(boolean b) {

    }
}
