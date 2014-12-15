package com.lala.myapi;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Created by admin on 14-10-21
 */
@Entity
@Table(name = "users")
public class User{
	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;//自增长的id（userId）
	@Column
	private String uname;
	@Column
	private String nick;
	@Column
	private String email;
	@Column
	private Date ctime;
	@Column
	private Integer status;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}
