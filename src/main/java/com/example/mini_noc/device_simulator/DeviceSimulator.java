package com.example.mini_noc.device_simulator;

import com.example.mini_noc.common.Device;
import com.example.mini_noc.common.MetricSample;

import java.time.LocalDateTime;
import java.util.Random;

public class DeviceSimulator {
    public MetricSample measure(Device device) {
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        return new MetricSample(device.getDeviceName(), device.getDeviceType(), String.valueOf(randomInt), LocalDateTime.now());
    }
}
