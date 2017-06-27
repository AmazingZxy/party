package org.party.zxy.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee implements Serializable{

	private Integer id;			// id
	private Job job;			// 职位 员工关联的职位对象
	private String name;		// 姓名
	private String cardId;		// 省份证
	private String address;     // 地址
	private String postCode;	// 邮政编码
	private String tel;			// 电话
	private String phone;		// 手机
	private String qqNum;		// qq
	private String email;		// 邮箱
	private Integer sex;		// 性别
	private String party;		// 政治面貌
	/**
	 *  使用@ModelAttribute接受参数的时候
	 *  form表单上的日期，spring不知道如何转换，所以呢要在尸体累的日期属性上加上
	 *  @DateTimeFormat(pattern="yyyy-MM-dd")注解
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private java.util.Date birthday;	// 出生日期
	private String race;				// 名族
	private String education;			// 学历
	private String speciality;			// 专业
	private String hobby;				// 爱好
	private String remark;				// 备注
	private java.util.Date createDate;	// 建档日期
	
	
	public Employee() {
		super();
	}
	public Employee(Integer id, Job job, String name, String cardId,
			String address, String postCode, String tel, String phone,
			String qqNum, String email, Integer sex, String party,
			Date birthday, String race, String education, String speciality,
			String hobby, String remark, Date createDate) {
		super();
		this.id = id;
		this.job = job;
		this.name = name;
		this.cardId = cardId;
		this.address = address;
		this.postCode = postCode;
		this.tel = tel;
		this.phone = phone;
		this.qqNum = qqNum;
		this.email = email;
		this.sex = sex;
		this.party = party;
		this.birthday = birthday;
		this.race = race;
		this.education = education;
		this.speciality = speciality;
		this.hobby = hobby;
		this.remark = remark;
		this.createDate = createDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQqNum() {
		return qqNum;
	}
	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public java.util.Date getBirthday() {
		return birthday;
	}
	public void setBirthday(java.util.Date birthday) {
		this.birthday = birthday;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public java.util.Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", job=" + job + ", name=" + name
				+ ", cardId=" + cardId + ", address=" + address + ", postCode="
				+ postCode + ", tel=" + tel + ", phone=" + phone + ", qqNum="
				+ qqNum + ", email=" + email + ", sex=" + sex + ", party="
				+ party + ", birthday=" + birthday + ", race=" + race
				+ ", education=" + education + ", speciality=" + speciality
				+ ", hobby=" + hobby + ", remark=" + remark + ", createDate="
				+ createDate + "]";
	}
	
	
	

}
