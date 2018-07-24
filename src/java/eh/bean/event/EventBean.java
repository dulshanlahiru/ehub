/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eh.bean.event;

/**
 *
 * @author grdul
 */
public class EventBean {

    private int id;
    private String event_name;
    private int envent_id;
    private int uni_org_id;
    private String event_datetime;
    private String comment;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public int getEnvent_id() {
        return envent_id;
    }

    public void setEnvent_id(int envent_id) {
        this.envent_id = envent_id;
    }

    public int getUni_org_id() {
        return uni_org_id;
    }

    public void setUni_org_id(int uni_org_id) {
        this.uni_org_id = uni_org_id;
    }

    public String getEvent_datetime() {
        return event_datetime;
    }

    public void setEvent_datetime(String event_datetime) {
        this.event_datetime = event_datetime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
