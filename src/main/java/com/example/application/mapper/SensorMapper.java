package com.example.application.mapper;

import com.example.application.dto.SensorDto;
import com.example.application.entity.SensorEntity;

public class SensorMapper {

    public static SensorDto of(SensorEntity entity) {
        return new SensorDto(
                entity.getId(),
                entity.getName(),
                entity.getValue(),
                entity.getSensorType()
        );
    }

    public static SensorEntity toEntity(SensorDto dto) {
        SensorEntity entity = new SensorEntity();
        entity.setId(dto.id());
        entity.setName(dto.name());
        entity.setValue(dto.value());
        entity.setSensorType(dto.sensorType());
        return entity;
    }
}
