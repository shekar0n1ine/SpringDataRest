package com.shek.springpractice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the request_details database table.
 * 
 */
@Entity
@Table(name="request_details")
@NamedQuery(name="RequestDetail.findAll", query="SELECT r FROM RequestDetail r")
public class RequestDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String class_Name;

	private String locale;

	private String method_Name;

	private Timestamp request_Time;

	private String request_Type;

	private BigInteger response_Time;

	private String session;

	private String url;

	private String user_Ip;

	private String userid;

	public RequestDetail() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClass_Name() {
		return this.class_Name;
	}

	public void setClass_Name(String class_Name) {
		this.class_Name = class_Name;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getMethod_Name() {
		return this.method_Name;
	}

	public void setMethod_Name(String method_Name) {
		this.method_Name = method_Name;
	}

	public Timestamp getRequest_Time() {
		return this.request_Time;
	}

	public void setRequest_Time(Timestamp request_Time) {
		this.request_Time = request_Time;
	}

	public String getRequest_Type() {
		return this.request_Type;
	}

	public void setRequest_Type(String request_Type) {
		this.request_Type = request_Type;
	}

	public BigInteger getResponse_Time() {
		return this.response_Time;
	}

	public void setResponse_Time(BigInteger response_Time) {
		this.response_Time = response_Time;
	}

	public String getSession() {
		return this.session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser_Ip() {
		return this.user_Ip;
	}

	public void setUser_Ip(String user_Ip) {
		this.user_Ip = user_Ip;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}