package eface.dao;

import eface.model.PersonList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonListMapper {
    int insert(PersonList record);

    List<PersonList> selectAll();
}