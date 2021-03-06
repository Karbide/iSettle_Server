package com.karbide.iSettle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by deepeshuniyal on 03/12/16.
 */
@Entity
public class UserStatus implements Serializable{

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int status;
        private String status_display_name;
        private boolean active;
        private Date update_time;

    public int getId() {
        return status;
    }

    public void setId(int id) {
        this.status = id;
    }

    public String getStatus_display_name() {
        return status_display_name;
    }

    public void setStatus_display_name(String status_display_name) {
        this.status_display_name = status_display_name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
