package com.example.application.mapper;

import com.example.application.dto.Window;
import com.example.application.entity.RoomEntity;
import com.example.application.entity.WindowEntity;

public class WindowMapper {

    public static Window of(WindowEntity entity) {
        return new Window(
                entity.getId(),
                entity.getName(),
                entity.getWindowStatus(),
                entity.getRoom() != null ? entity.getRoom().getId() : null
        );
    }

    public static WindowEntity toEntity(Window dto, RoomEntity roomEntity) {
        WindowEntity entity = new WindowEntity();
        entity.setId(dto.id());
        entity.setName(dto.name());
        entity.setWindowStatus(dto.windowStatus());
        entity.setRoom(roomEntity);
        return entity;
    }
}
