package kh_jdbc.vo;

import java.math.BigDecimal;
import java.sql.Date;

// Vo : Value Object → 화면에 출력 해야 될 정보를 입력 하는 곳
public class EmpVo {
    private int empNo;
    private String name;
    private String job;
    private int mgr;
    private Date date;
    private BigDecimal sal;         // BigDecimal → 오라클의 number 타입과 같음. 정수 + 실수. int보다 큰 수 가능
    private BigDecimal comm;
    private int deptNo;

    public EmpVo(int empNo, String name, String job, int mgr, Date date, BigDecimal sal, BigDecimal comm, int deptNo) {
        this.empNo = empNo;
        this.name = name;
        this.job = job;
        this.mgr = mgr;
        this.date = date;
        this.sal = sal;
        this.comm = comm;
        this.deptNo = deptNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public BigDecimal getComm() {
        return comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }
}

