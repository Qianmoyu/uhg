package com.interviewblank.pojo;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * {  "firstName": "",
 *    "lastName: "",
 *    "middleName: "",
 *    "dob": "",
 *    "degree" : ""
 *  }
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "userInfo")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Column(name = "firstname", length=100)
    private String firstName;
    @Column(name = "middlename", length=100)
    private String middleName;
    @NotNull
    @Column(name = "lastname", length=100)
    private String lastName;
    @Column
    private Date dob;
    @Column(name = "degree", length=100)
    private String degree;
}
