package eface.dao;

import eface.model.PunishBreakList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PunishBreakListMapper {
    int insert(PunishBreakList record);

    List<PunishBreakList> selectAll();
}