package eface.dao;

import eface.model.Data;

import org.springframework.stereotype.Repository;

@Repository
public interface DataMapper {
    int insertData(Data record);
    
    int insertLog(Data record);
}