/**
 * 
 */
package com.techmavericks.donateit.domain;

import java.io.Serializable;

/**
 * @author Akshay Jain
 *
 */
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	private String email;

	private Long mobile;

	private String addr1;

	private String addr2;

	private String addr3;

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobile
	 */
	public Long getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the addr1
	 */
	public String getAddr1() {
		return addr1;
	}

	/**
	 * @param addr1
	 *            the addr1 to set
	 */
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	/**
	 * @return the addr2
	 */
	public String getAddr2() {
		return addr2;
	}

	/**
	 * @param addr2
	 *            the addr2 to set
	 */
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	/**
	 * @return the addr3
	 */
	public String getAddr3() {
		return addr3;
	}

	/**
	 * @param addr3
	 *            the addr3 to set
	 */
	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}

}