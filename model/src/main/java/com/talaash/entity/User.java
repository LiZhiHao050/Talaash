package com.talaash.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_user.user_id
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_user.account
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_user.password
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_user.real_name
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private String realName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_user.user_birthday
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private Date userBirthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_user.user_gender
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private Integer userGender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_user.identity_number
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private String identityNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_user.user_email
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private String userEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_user.user_phone
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private String userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_user.power
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private Integer power;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_user.province
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private Integer province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_user.city
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private Integer city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_user.county
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private Integer county;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mj_user.address
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mj_user
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_user.user_id
     *
     * @return the value of mj_user.user_id
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_user.user_id
     *
     * @param userId the value for mj_user.user_id
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_user.account
     *
     * @return the value of mj_user.account
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_user.account
     *
     * @param account the value for mj_user.account
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_user.password
     *
     * @return the value of mj_user.password
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_user.password
     *
     * @param password the value for mj_user.password
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_user.real_name
     *
     * @return the value of mj_user.real_name
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_user.real_name
     *
     * @param realName the value for mj_user.real_name
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_user.user_birthday
     *
     * @return the value of mj_user.user_birthday
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public Date getUserBirthday() {
        return userBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_user.user_birthday
     *
     * @param userBirthday the value for mj_user.user_birthday
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_user.user_gender
     *
     * @return the value of mj_user.user_gender
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public Integer getUserGender() {
        return userGender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_user.user_gender
     *
     * @param userGender the value for mj_user.user_gender
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_user.identity_number
     *
     * @return the value of mj_user.identity_number
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public String getIdentityNumber() {
        return identityNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_user.identity_number
     *
     * @param identityNumber the value for mj_user.identity_number
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber == null ? null : identityNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_user.user_email
     *
     * @return the value of mj_user.user_email
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_user.user_email
     *
     * @param userEmail the value for mj_user.user_email
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_user.user_phone
     *
     * @return the value of mj_user.user_phone
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_user.user_phone
     *
     * @param userPhone the value for mj_user.user_phone
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_user.power
     *
     * @return the value of mj_user.power
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public Integer getPower() {
        return power;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_user.power
     *
     * @param power the value for mj_user.power
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_user.province
     *
     * @return the value of mj_user.province
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_user.province
     *
     * @param province the value for mj_user.province
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_user.city
     *
     * @return the value of mj_user.city
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public Integer getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_user.city
     *
     * @param city the value for mj_user.city
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_user.county
     *
     * @return the value of mj_user.county
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public Integer getCounty() {
        return county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_user.county
     *
     * @param county the value for mj_user.county
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public void setCounty(Integer county) {
        this.county = county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mj_user.address
     *
     * @return the value of mj_user.address
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mj_user.address
     *
     * @param address the value for mj_user.address
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mj_user
     *
     * @mbg.generated Thu Mar 26 18:55:39 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", realName=").append(realName);
        sb.append(", userBirthday=").append(userBirthday);
        sb.append(", userGender=").append(userGender);
        sb.append(", identityNumber=").append(identityNumber);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", power=").append(power);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", county=").append(county);
        sb.append(", address=").append(address);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}