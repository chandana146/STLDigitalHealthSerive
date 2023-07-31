package com.Health.StlHealth_Dev.Model;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_health_data")
public class HealthData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "health_id")
    private Long health_id;

    
    @Column(name = "case_id")
    private Long case_id;

    
    @Column(name = "patient_id")
    private Long patient_id;

    @Column(name = "bt_temperature")
    private double bt_temperature;

    @Column(name = "bp_systolic")
    private int bp_systolic;

    @Column(name = "bp_diastolic")
    private int bp_diastolic;

    @Column(name = "bp_ma_pressure")
    private int bp_ma_pressure;

    @Column(name = "bp_pulse")
    private int bp_pulse;

    @Column(name = "pom_oxegen_level")
    private int pom_oxegen_level;

    @Column(name = "pom_pulse")
    private int pom_pulse;

    @Column(name = "bg_glucose_level")
    private int bg_glucose_level;

    @Column(name = "bg_post_glucose_level")
    private int bg_post_glucose_level;

    @Column(name = "fb_heart_rates")
    private int fb_heart_rates;

    @Column(name = "fb_steps")
    private int fb_steps;

    @Column(name = "fb_calories")
    private int fb_calories;

    @Column(name = "wm_weight")
    private double wm_weight;

    @Column(name = "other_data")
    private String other_data;

    @Column(name = "type")
    private String type;

    @Column(name = "created_date")
    private Date created_date;

    @Column(name = "updated_date")
    private Date updated_date;

	public HealthData(Long health_id, Long case_id, Long patient_id, double bt_temperature, int bp_systolic,
			int bp_diastolic, int bp_ma_pressure, int bp_pulse, int pom_oxegen_level, int pom_pulse,
			int bg_glucose_level, int bg_post_glucose_level, int fb_heart_rates, int fb_steps, int fb_calories,
			double wm_weight, String other_data, String type, Date created_date, Date updated_date) {
		super();
		this.health_id = health_id;
		this.case_id = case_id;
		this.patient_id = patient_id;
		this.bt_temperature = bt_temperature;
		this.bp_systolic = bp_systolic;
		this.bp_diastolic = bp_diastolic;
		this.bp_ma_pressure = bp_ma_pressure;
		this.bp_pulse = bp_pulse;
		this.pom_oxegen_level = pom_oxegen_level;
		this.pom_pulse = pom_pulse;
		this.bg_glucose_level = bg_glucose_level;
		this.bg_post_glucose_level = bg_post_glucose_level;
		this.fb_heart_rates = fb_heart_rates;
		this.fb_steps = fb_steps;
		this.fb_calories = fb_calories;
		this.wm_weight = wm_weight;
		this.other_data = other_data;
		this.type = type;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}
	public HealthData() {
		
	}
	public Long getHealth_id() {
		return health_id;
	}

	public void setHealth_id(Long health_id) {
		this.health_id = health_id;
	}

	public Long getCase_id() {
		return case_id;
	}

	public void setCase_id(Long case_id) {
		this.case_id = case_id;
	}

	public Long getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(Long patient_id) {
		this.patient_id = patient_id;
	}

	public double getBt_temperature() {
		return bt_temperature;
	}

	public void setBt_temperature(double bt_temperature) {
		this.bt_temperature = bt_temperature;
	}

	public int getBp_systolic() {
		return bp_systolic;
	}

	public void setBp_systolic(int bp_systolic) {
		this.bp_systolic = bp_systolic;
	}

	public int getBp_diastolic() {
		return bp_diastolic;
	}

	public void setBp_diastolic(int bp_diastolic) {
		this.bp_diastolic = bp_diastolic;
	}

	public int getBp_ma_pressure() {
		return bp_ma_pressure;
	}

	public void setBp_ma_pressure(int bp_ma_pressure) {
		this.bp_ma_pressure = bp_ma_pressure;
	}

	public int getBp_pulse() {
		return bp_pulse;
	}

	public void setBp_pulse(int bp_pulse) {
		this.bp_pulse = bp_pulse;
	}

	public int getPom_oxegen_level() {
		return pom_oxegen_level;
	}

	public void setPom_oxegen_level(int pom_oxegen_level) {
		this.pom_oxegen_level = pom_oxegen_level;
	}

	public int getPom_pulse() {
		return pom_pulse;
	}

	public void setPom_pulse(int pom_pulse) {
		this.pom_pulse = pom_pulse;
	}

	public int getBg_glucose_level() {
		return bg_glucose_level;
	}

	public void setBg_glucose_level(int bg_glucose_level) {
		this.bg_glucose_level = bg_glucose_level;
	}

	public int getBg_post_glucose_level() {
		return bg_post_glucose_level;
	}

	public void setBg_post_glucose_level(int bg_post_glucose_level) {
		this.bg_post_glucose_level = bg_post_glucose_level;
	}

	public int getFb_heart_rates() {
		return fb_heart_rates;
	}

	public void setFb_heart_rates(int fb_heart_rates) {
		this.fb_heart_rates = fb_heart_rates;
	}

	public int getFb_steps() {
		return fb_steps;
	}

	public void setFb_steps(int fb_steps) {
		this.fb_steps = fb_steps;
	}

	public int getFb_calories() {
		return fb_calories;
	}

	public void setFb_calories(int fb_calories) {
		this.fb_calories = fb_calories;
	}

	public double getWm_weight() {
		return wm_weight;
	}

	public void setWm_weight(double wm_weight) {
		this.wm_weight = wm_weight;
	}

	public String getOther_data() {
		return other_data;
	}

	public void setOther_data(String other_data) {
		this.other_data = other_data;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	@Override
	public String toString() {
		return "HealthData [health_id=" + health_id + ", case_id=" + case_id + ", patient_id=" + patient_id
				+ ", bt_temperature=" + bt_temperature + ", bp_systolic=" + bp_systolic + ", bp_diastolic="
				+ bp_diastolic + ", bp_ma_pressure=" + bp_ma_pressure + ", bp_pulse=" + bp_pulse + ", pom_oxegen_level="
				+ pom_oxegen_level + ", pom_pulse=" + pom_pulse + ", bg_glucose_level=" + bg_glucose_level
				+ ", bg_post_glucose_level=" + bg_post_glucose_level + ", fb_heart_rates=" + fb_heart_rates
				+ ", fb_steps=" + fb_steps + ", fb_calories=" + fb_calories + ", wm_weight=" + wm_weight
				+ ", other_data=" + other_data + ", type=" + type + ", created_date=" + created_date + ", updated_date="
				+ updated_date + "]";
	}

	
}
