package com.ohgiraffers.model.dto;

import java.sql.Date;

/* DTO(Data Transfer object)
여러 계층간 데이터 전송을 위해 다양한 타입의 데이터를 하나로 묶어서 전송하는 쓰임의 클래스
유사한 말) VO, Bean, Entity, (Do, Domain, Row) 등이 있다.

DTO 클래스의 조건
1. 모든 필드는 private
2. 기본 생성자와 모든 필드를 초기화 하는 행성자
3. 모든 필드에 대한 setter/getter
4. toString Overriding을 이용한 필드 값 반환용 메소드
5. 직렬화 처리 */

public class EmployeeDTO implements java.io.Serializable {
    private String empID;
    private String empNAME;
    private String empNO;
    private String email;
    private String phone;
    private String deptCODE;
    private String jobCODE;
    private String salLEVEL;
    private int salary;
    private double bonus;
    private String managerID;
    private java.sql.Date hireDATE;
    private java.sql.Date entDATE;
    private String entYN;

    public EmployeeDTO() {}

    public String getEmoID() {
        return empID;
    }

    public void setEmoID(String emoID) {
        this.empID = emoID;
    }

    public String getEmpNAME() {
        return empNAME;
    }

    public void setEmpNAME(String empNAME) {
        this.empNAME = empNAME;
    }

    public String getEmpNO() {
        return empNO;
    }

    public void setEmpNO(String empNO) {
        this.empNO = empNO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeptCODE() {
        return deptCODE;
    }

    public void setDeptCODE(String deptCODE) {
        this.deptCODE = deptCODE;
    }

    public String getJobCODE() {
        return jobCODE;
    }

    public void setJobCODE(String jobCODE) {
        this.jobCODE = jobCODE;
    }

    public String getSalLEVEL() {
        return salLEVEL;
    }

    public void setSalLEVEL(String salLEVEL) {
        this.salLEVEL = salLEVEL;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }

    public Date getHireDATE() {
        return hireDATE;
    }

    public void setHireDATE(Date hireDATE) {
        this.hireDATE = hireDATE;
    }

    public Date getEntDATE() {
        return entDATE;
    }

    public void setEntDATE(Date entDATE) {
        this.entDATE = entDATE;
    }

    public String getEntYN() {
        return entYN;
    }

    public void setEntYN(String entYN) {
        this.entYN = entYN;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empID='" + empID + '\'' +
                ", empNAME='" + empNAME + '\'' +
                ", empNO='" + empNO + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", deptCODE='" + deptCODE + '\'' +
                ", jobCODE='" + jobCODE + '\'' +
                ", salLEVEL='" + salLEVEL + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", managerID='" + managerID + '\'' +
                ", hireDATE=" + hireDATE +
                ", entDATE=" + entDATE +
                ", entYN='" + entYN + '\'' +
                '}';
    }
}
