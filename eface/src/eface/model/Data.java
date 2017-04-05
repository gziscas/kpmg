package eface.model;

import java.util.Date;

public class Data {
	
	private String code;
	private String msg;
	private String orderNo;
	private String data;
	
	private String entName;
	private Date queryTime;

	public Data(){
		
	}
	
	public Data(String code, String msg, String orderNo, String data, int type){
		this.code = code;
		this.msg = msg;
		this.orderNo = orderNo;
		this.data = data;
	}
	
	public Data(String code, String msg, String orderNo, String entName){
		this.code = code;
		this.msg = msg;
		this.orderNo = orderNo;
		this.entName = entName;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEntName() {
		return entName;
	}

	public void setEntName(String entName) {
		this.entName = entName;
	}

	public Date getQueryTime() {
		return queryTime;
	}

	public void setQueryTime(Date queryTime) {
		this.queryTime = queryTime;
	}
}
