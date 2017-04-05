package eface.dao;

import eface.model.EntinvItemList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface EntinvItemListMapper {
    int insert(EntinvItemList record);

    List<EntinvItemList> selectAll();
}