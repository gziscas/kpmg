package eface.dao;

import eface.model.AlterList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AlterListMapper {
    int insert(AlterList record);

    List<AlterList> selectAll();
}