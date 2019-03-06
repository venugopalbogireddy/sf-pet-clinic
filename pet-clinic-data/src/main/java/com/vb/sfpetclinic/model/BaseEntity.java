package com.vb.sfpetclinic.model;

import java.io.Serializable;

/**
 * Created by venugopal on 2019-03-06.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
