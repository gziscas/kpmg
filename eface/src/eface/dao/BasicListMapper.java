package eface.dao;

import eface.model.BasicList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BasicListMapper {
    int insert(BasicList record);

    List<BasicList> selectAll();
}