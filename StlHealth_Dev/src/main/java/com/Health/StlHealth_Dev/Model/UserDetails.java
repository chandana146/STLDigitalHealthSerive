package com.Health.StlHealth_Dev.Model;
import com.Health.StlHealth_Dev.enums.BloodGroup;
import com.Health.StlHealth_Dev.enums.Gender;
import com.Health.StlHealth_Dev.enums.Occupation;
import com.Health.StlHealth_Dev.enums.UserStatus;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="tbl_user_details")
public class UserDetails {
    /*---------------------- DECLARING USER DETAILS PROPERTIES --------------*/
    @Id
    @GeneratedValue
    @Column(name="user_detail_id")
    Long user_detail_id;
    @Column(name="user_id",nullable =false)
    Long user_id;
    @Column(name="reg_number",nullable = false)
    String reg_number;
    @Column(name="role_id")
    Long role_id;
    @Column(name="aadhar_card_no")
    String aadhar_card_no;
    @Column(name="first_name")
    String first_name;
    @Column(name="middle_name")
    String middle_name;
    @Column(name="last_name")
    String last_name;
    @Column(name="user_image")
    String user_image;
    @Column(name="address")
    String address;
    @Column(name="city")
    String city;
    @Column(name="state_id")
    Long state_id;
    @Column(name="districe_id")
    Long districe_id;
    @Column(name="taluka_id")
    Long taluka_id;
    @Column(name="village_id")
    Long village_id;
    @Column(name="panchayat_id")
    Long panchyat_id;
    @Column(name="pincode")
    Long pincode;
    @Column(name="whatsapp_no")
    String whatsapp_no;
    @Column(name="date_of_birth")
    String date_of_birth;
    @Column(name="age")
    int age;
    @Column(name="gender")
    Gender gender;
    @Column(name="blood_group")
    BloodGroup blood_group;
    @Column(name="occupation")
    Occupation Occupation;
    @Column(name="refer_by")
    String refer_by;
    @Column(name="user_status")
    UserStatus user_status;
    @Column(name="doctor_speciality")
    String doctor_speciality;
    @Column(name="doctor_degree")
    String doctor_degree;
    @Column(name="paytm_no")
    String paytm_no;
    @Column(name="hospital_name")
    String hospital_name;
    @Column(name="isGPChanged")
    int isGPChanged;
    @Column(name="created_date")
    Date created_date;
    @Column(name="updated_date")
    Date updated_date;
    /*------------------------ END OF DECLARING PROPERTIES ---------------------------*/

    /*----------------------- DEFAULT CONSTRUCTOR --------------------------*/


    /*----------------------- END OF DEFAULT CONSTRUCTOR ---------------------*/

    /*---------------------------- PARAMETERIZE CONSTRUCTOR -------------------*/

    public UserDetails(Long user_detail_id, Long user_id, String reg_number, Long role_id, String aadhar_card_no, String first_name, String middle_name, String last_name, String user_image, String address, String city, Long state_id, Long districe_id, Long taluka_id, Long village_id, Long panchyat_id, Long pincode, String whatsapp_no, String date_of_birth, int age, Gender gender, BloodGroup blood_group, Occupation Occupation, String refer_by, UserStatus user_status, String doctor_speciality, String doctor_degree, String paytm_no, String hospital_name, int isGPChanged, Date created_date, Date updated_date) {
        this.user_detail_id = user_detail_id;
        this.user_id = user_id;
        this.reg_number = reg_number;
        this.role_id = role_id;
        this.aadhar_card_no = aadhar_card_no;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.user_image = user_image;
        this.address = address;
        this.city = city;
        this.state_id = state_id;
        this.districe_id = districe_id;
        this.taluka_id = taluka_id;
        this.village_id = village_id;
        this.panchyat_id = panchyat_id;
        this.pincode = pincode;
        this.whatsapp_no = whatsapp_no;
        this.date_of_birth = date_of_birth;
        this.age = age;
        this.gender = gender;
        this.blood_group = blood_group;
        this.Occupation = Occupation;
        this.refer_by = refer_by;
        this.user_status = user_status;
        this.doctor_speciality = doctor_speciality;
        this.doctor_degree = doctor_degree;
        this.paytm_no = paytm_no;
        this.hospital_name = hospital_name;
        this.isGPChanged = isGPChanged;
        this.created_date = created_date;
        this.updated_date = updated_date;
    }
    /*--------------------------- END OF PARAMETERIZE CONSTRUCTOR -----------------*/



    /*------------------------ DECLARING GETTER AND SETTER ---------------------------*/
    public Long getuser_detail_id() {
        return user_detail_id;
    }

    public void setuser_detail_id(Long user_detail_id) {
        this.user_detail_id = user_detail_id;
    }

    public Long getuser_id() {
        return user_id;
    }

    public void setuser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getreg_number() {
        return reg_number;
    }

    public void setreg_number(String reg_number) {
        this.reg_number = reg_number;
    }

    public Long getrole_id() {
        return role_id;
    }

    public void setrole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getaadhar_card_no() {
        return aadhar_card_no;
    }

    public void setaadhar_card_no(String aadhar_card_no) {
        this.aadhar_card_no = aadhar_card_no;
    }

    public String getfirst_name() {
        return first_name;
    }

    public void setfirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getmiddle_name() {
        return middle_name;
    }

    public void setmiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getlast_name() {
        return last_name;
    }

    public void setlast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getuser_image() {
        return user_image;
    }

    public void setuser_image(String user_image) {
        this.user_image = user_image;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public Long getstate_id() {
        return state_id;
    }

    public void setstate_id(Long state_id) {
        this.state_id = state_id;
    }

    public Long getdistrice_id() {
        return districe_id;
    }

    public void setdistrice_id(Long districe_id) {
        this.districe_id = districe_id;
    }

    public Long gettaluka_id() {
        return taluka_id;
    }

    public void settaluka_id(Long taluka_id) {
        this.taluka_id = taluka_id;
    }

    public Long getvillage_id() {
        return village_id;
    }

    public void setvillage_id(Long village_id) {
        this.village_id = village_id;
    }

    public Long getpanchyat_id() {
        return panchyat_id;
    }

    public void setpanchyat_id(Long panchyat_id) {
        this.panchyat_id = panchyat_id;
    }

    public Long getpincode() {
        return pincode;
    }

    public void setpincode(Long pincode) {
        this.pincode = pincode;
    }

    public String getwhatsapp_no() {
        return whatsapp_no;
    }

    public void setwhatsapp_no(String whatsapp_no) {
        this.whatsapp_no = whatsapp_no;
    }

    public String getdate_of_birth() {
        return date_of_birth;
    }

    public void setdate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public Gender getgender() {
        return gender;
    }

    public void setgender(Gender gender) {
        this.gender = gender;
    }

    public BloodGroup getblood_group() {
        return blood_group;
    }

    public void setblood_group(BloodGroup blood_group) {
        this.blood_group = blood_group;
    }

    public Occupation getOccupation() {
        return Occupation;
    }

    public void setOccupation(Occupation Occupation) {
        this.Occupation = Occupation;
    }

    public String getrefer_by() {
        return refer_by;
    }

    public void setrefer_by(String refer_by) {
        this.refer_by = refer_by;
    }

    public UserStatus getuser_status() {
        return user_status;
    }

    public void setuser_status(UserStatus user_status) {
        this.user_status = user_status;
    }

    public String getdoctor_speciality() {
        return doctor_speciality;
    }

    public void setdoctor_speciality(String doctor_speciality) {
        this.doctor_speciality = doctor_speciality;
    }

    public String getdoctor_degree() {
        return doctor_degree;
    }

    public void setdoctor_degree(String doctor_degree) {
        this.doctor_degree = doctor_degree;
    }

    public String getpaytm_no() {
        return paytm_no;
    }

    public void setpaytm_no(String paytm_no) {
        this.paytm_no = paytm_no;
    }

    public String gethospital_name() {
        return hospital_name;
    }

    public void sethospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public int getisGPChanged() {
        return isGPChanged;
    }

    public void setisGPChanged(int isGPChanged) {
        this.isGPChanged = isGPChanged;
    }

    public Date getcreated_date() {
        return created_date;
    }

    public void setcreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getupdated_date() {
        return updated_date;
    }

    public void setupdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }

    /*------------------------------- END OF GETTERS AND SETTERS -------------------*/


    /*------------------------------- TO STRING METHOD FOR PRINT USER DETAILS ----------------*/

    @Override
    public String toString() {
        return "UserDetails{" +
                "user_detail_id=" + user_detail_id +
                ", user_id=" + user_id +
                ", reg_number='" + reg_number + '\'' +
                ", role_id=" + role_id +
                ", aadhar_card_no='" + aadhar_card_no + '\'' +
                ", first_name='" + first_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", user_image='" + user_image + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state_id=" + state_id +
                ", districe_id=" + districe_id +
                ", taluka_id=" + taluka_id +
                ", village_id=" + village_id +
                ", panchyat_id=" + panchyat_id +
                ", pincode=" + pincode +
                ", whatsapp_no='" + whatsapp_no + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", blood_group=" + blood_group +
                ", Occupation=" + Occupation +
                ", refer_by='" + refer_by + '\'' +
                ", user_status=" + user_status +
                ", doctor_speciality='" + doctor_speciality + '\'' +
                ", doctor_degree='" + doctor_degree + '\'' +
                ", paytm_no='" + paytm_no + '\'' +
                ", hospital_name='" + hospital_name + '\'' +
                ", isGPChanged=" + isGPChanged +
                ", created_date=" + created_date +
                ", updated_date=" + updated_date +
                '}';
    }



	
}
