package com.dchealth.VO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/21.
 */
public class Form {
    private List<FormData> form_data = new ArrayList<>() ;
    private  String form_dom  ;
    private Object form_config ;

    public List<FormData> getForm_data() {
        return form_data;
    }

    public void setForm_data(List<FormData> form_data) {
        this.form_data = form_data;
    }

    public String getForm_dom() {
        return form_dom;
    }

    public void setForm_dom(String form_dom) {
        this.form_dom = form_dom;
    }

    public Object getForm_config() {
        return form_config;
    }

    public void setForm_config(Object form_config) {
        this.form_config = form_config;
    }
}
