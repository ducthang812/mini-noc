package com.example.mini_noc.common;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class MetricSample {
    private String device;
    private String metricType; //CPU %, traffic,...
    private String value;
    private LocalDateTime measureTime = LocalDateTime.now();
}
