package az.orient.course.model;

import java.util.Date;

public abstract class AbstractModel {

    private Long r;
    private Long id;
    private Date dataDate;
    private Integer active;

    public Long getR() {
        return r;
    }

    public void setR(Long r) {
        this.r = r;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataDate() {
        return dataDate;
    }

    public void setDataDate(Date dataDate) {
        this.dataDate = dataDate;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    
    @Override
    public String toString() {
        return "AbstarctModel [id=" + id + ", dataDate=" + dataDate + ", active=" + active + "]";
    }

}
