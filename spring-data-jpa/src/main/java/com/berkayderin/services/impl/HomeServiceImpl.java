package com.berkayderin.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berkayderin.dto.DtoHome;
import com.berkayderin.dto.DtoRoom;
import com.berkayderin.entities.Home;
import com.berkayderin.entities.Room;
import com.berkayderin.repository.HomeRepository;
import com.berkayderin.services.IHomeService;

@Service
public class HomeServiceImpl implements IHomeService {

    @Autowired
    private HomeRepository homeRepository;

    @Override
    public DtoHome findHomeById(Long id) {
        DtoHome dtohome = new DtoHome();
        Optional<Home> optional = homeRepository.findById(id);

        if (optional.isEmpty()) {
            return null;
        }

        Home dbHome = optional.get();
        List<Room> dbRooms = optional.get().getRoom();

        BeanUtils.copyProperties(dbHome, dtohome);

        if (dbRooms != null) {
            List<DtoRoom> dtoRooms = new ArrayList<>();
            for (Room dbRoom : dbRooms) {
                DtoRoom dtoRoom = new DtoRoom();
                BeanUtils.copyProperties(dbRoom, dtoRoom);
                dtoRooms.add(dtoRoom);
            }
            dtohome.setRooms(dtoRooms);
        }

        return dtohome;
    }

}
