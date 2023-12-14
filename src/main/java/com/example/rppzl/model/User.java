package com.example.rppzl.model;


import com.example.rppzl.repositories.UserRepository;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "person_info", schema = "rppzl", catalog = "")
public class User{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "FirstName", nullable = false, length = 20)
    private String firstName;
    @Basic
    @Column(name = "SecondName", nullable = false, length = 15)
    private String secondName;
    @Basic
    @Column(name = "Patronymic", nullable = false, length = 15)
    private String patronymic;
    @Basic
    @Column(name = "BirthDate", nullable = false)
    private Date birthDate;
    @Basic
    @Column(name = "PassportSeries", nullable = false, length = 2)
    private String passportSeries;
    @Basic
    @Column(name = "PassportNumber", nullable = false, length = 9)
    private String passportNumber;
    @Basic
    @Column(name = "IssuedBy", nullable = false, length = 45)
    private String issuedBy;
    @Basic
    @Column(name = "DateOfIssuing", nullable = false)
    private Date dateOfIssuing;
    @Basic
    @Column(name = "IDNumber", nullable = false, length = 14)
    private String idNumber;
    @Basic
    @Column(name = "BirthPlace", nullable = false, length = 45)
    private String birthPlace;
    @Basic
    @Column(name = "ResidenceCity", nullable = false, length = 45)
    private String residenceCity;
    @Basic
    @Column(name = "ResidenceAddress", nullable = false, length = 45)
    private String residenceAddress;
    @Basic
    @Column(name = "LinePhoneNumber", nullable = true, length = 45)
    private String linePhoneNumber;
    @Basic
    @Column(name = "MobilePhoneNumber", nullable = true, length = 45)
    private String mobilePhoneNumber;
    @Basic
    @Column(name = "Email", nullable = true, length = 45)
    private String email;
    @Basic
    @Column(name = "Occupation", nullable = true, length = 45)
    private String occupation;
    @Basic
    @Column(name = "JobTitle", nullable = true, length = 45)
    private String jobTitle;
    @Basic
    @Column(name = "FamilyStatus", nullable = false, length = 45)
    private String familyStatus;
    @Basic
    @Column(name = "Citizenship", nullable = false, length = 45)
    private String citizenship;
    @Basic
    @Column(name = "Handicap", nullable = false, length = 45)
    private String handicap;
    @Basic
    @Column(name = "Salary", nullable = true, precision = 0)
    private Double salary;
    @Basic
    @Column(name = "Conscript", nullable = false)
    private byte conscript;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Credit> credits;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Deposit> deposits;



}
