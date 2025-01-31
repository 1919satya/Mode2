package com.hcl.cms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class FeedBack {
	private String fid;
	private  String studentName;
	private String instructor;
	private  String subject;
	private  String fbvalue;
	@Id
	@Column(name="fid")
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	@Column(name="studentName")
        public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Column(name="instructor")
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	@Column(name="subject")

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Column(name="fbvalue")	
	public String getFbvalue() {
		return fbvalue;
	}
	public void setFbvalue(String fbvalue) {
		this.fbvalue = fbvalue;
	}
	

}
