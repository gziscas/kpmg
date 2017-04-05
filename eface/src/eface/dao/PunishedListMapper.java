package eface.dao;

import eface.model.PunishedList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PunishedListMapper {
    int insert(PunishedList record);

    List<PunishedList> selectAll();
}