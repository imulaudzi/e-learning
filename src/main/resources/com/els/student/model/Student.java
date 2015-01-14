package com.els.student.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ISAAC
 * Date: 12/18/14
 * Time: 2:50 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfbirth;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddrs;
    @Column(name = "SCREEN_NAME")
    private String screenName;
    @Column(name = "CREATE_DATE")
    private Date createDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(Date dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailAddrs() {
        return emailAddrs;
    }

    public void setEmailAddrs(String emailAddrs) {
        this.emailAddrs = emailAddrs;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
