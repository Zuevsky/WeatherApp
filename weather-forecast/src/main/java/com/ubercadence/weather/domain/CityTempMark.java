package com.ubercadence.weather.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "citytempmark")
public class CityTempMark {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "citytempmark_id_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "city_name", nullable = false)
    private String cityName;

    @Column(name = "temperature", nullable = false)
    private Double temperature;

    @Column(name = "request_time", nullable = false)
    private LocalDateTime requestTime;
}
