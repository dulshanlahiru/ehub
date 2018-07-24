/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eh.bean.user;

/**
 *
 * @author grdul
 */
public class UserBean {

    private int id;
    private String role_code;
    private String email_address;
    private String pword;
    private String status_code;
    private int uni_org_id;
    private String created_datetime;
    private int created_user;
    private String uni_org_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole_code() {
        return role_code;
    }

    public void setRole_code(String role_code) {
        this.role_code = role_code;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public int getUni_org_id() {
        return uni_org_id;
    }

    public void setUni_org_id(int uni_org_id) {
        this.uni_org_id = uni_org_id;
    }

    public String getCreated_datetime() {
        return created_datetime;
    }

    public void setCreated_datetime(String created_datetime) {
        this.created_datetime = created_datetime;
    }

    public int getCreated_user() {
        return created_user;
    }

    public void setCreated_user(int created_user) {
        this.created_user = created_user;
    }

    public String getUni_org_type() {
        return uni_org_type;
    }

    public void setUni_org_type(String uni_org_type) {
        this.uni_org_type = uni_org_type;
    }
    
    
    
    
}
