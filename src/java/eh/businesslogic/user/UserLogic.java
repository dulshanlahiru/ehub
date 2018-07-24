/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eh.businesslogic.user;

import eh.bean.user.UserBean;
import eh.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grdul
 */
public class UserLogic {

    public UserBean getLogin(UserBean u) throws SQLException {

        UserBean result = null;

        Connection con = null;
        try {
            con = new DBConnection().getConnection();
            String query = " SELECT eh_user.*,eh_uni_org.id as uni_org_id,eh_uni_org.`uni_org_type` FROM `eh_user` INNER JOIN \n"
                    + "`eh_uni_org` ON `eh_uni_org`.`id` = `eh_user`.`uni_org_id`\n"
                    + "WHERE `eh_user`.`email_address` = ? AND `eh_user`.`pword` = ? ";
            //SELECT * FROM appoinment WHERE doctorid = 1
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, u.getEmail_address());
            ps.setString(2, u.getPword());
            System.out.println("ps:" + ps);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                result = new UserBean();
                result.setEmail_address(rs.getString("email_address"));
                result.setUni_org_type(rs.getString("Uni_org_type"));
                result.setId(rs.getInt("id"));
                result.setUni_org_id(rs.getInt("uni_org_id"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return result;
    }
}
