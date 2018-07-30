package com.jorge.jsf.model;


public class Usuario {
	
	private Integer id;
	
	private String name;
	private String nick_user;
	private String password;
	private Integer role_id_fk;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Usuario(Integer id, String name, String nick_user, String password, Integer role_id_fk) {
	
		this.id = id;
		this.name = name;
		this.nick_user = nick_user;
		this.password = password;
		this.role_id_fk = role_id_fk;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNick_user() {
		return nick_user;
	}

	public void setNick_user(String nick_user) {
		this.nick_user = nick_user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRole_id_fk() {
		return role_id_fk;
	}

	public void setRole_id_fk(Integer role_id_fk) {
		this.role_id_fk = role_id_fk;
	}
	
	
	
	
	
	
	

}
