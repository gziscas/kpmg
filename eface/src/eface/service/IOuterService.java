package eface.service;

import java.util.List;

import eface.DataBo;
import eface.model.Data;
import net.sf.json.JSONArray;

public interface IOuterService {

	public DataBo searchInfo(String json) throws Exception;
	
	public List<Data> searchLike(String json) throws Exception;
	
}
