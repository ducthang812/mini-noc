package com.example.mini_noc.common;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Device {
    private String deviceId;
    private String deviceName;
    private String deviceType; //router, switch, OLT,...
    private String deviceIp;
}
