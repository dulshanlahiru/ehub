/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eh.bean.registration;

/**
 *
 * @author grdul
 */
public class UniOrgBean {
  private  int id;
  private String uni_org_name;
  private String uni_org_type;
  private String email;
  private String address;
  private String telephone;
  private String status_code;
  private String created_datetime;
  private int created_user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUni_org_name() {
        return uni_org_name;
    }

    public void setUni_org_name(String uni_org_name) {
        this.uni_org_name = uni_org_name;
    }

    public String getUni_org_type() {
        return uni_org_type;
    }

    public void setUni_org_type(String uni_org_type) {
        this.uni_org_type = uni_org_type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
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
  
  
}
