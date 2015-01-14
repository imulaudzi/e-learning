package com.els.instructor.model;

import com.els.common.User;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * User: ISAAC
 * Date: 12/18/14
 * Time: 2:51 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "INSTRUCTOR")
public class Instructor extends User{
     @Id
    private long instructor_id;
    private String profession;

}
