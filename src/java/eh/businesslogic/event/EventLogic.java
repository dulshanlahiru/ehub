/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eh.businesslogic.event;

import eh.bean.event.EventBean;
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
public class EventLogic {

    public List<EventBean> getUserEventList(int uni_org_id) throws SQLException {

        List<EventBean> appBean = new ArrayList<EventBean>();

        Connection con = null;
        try {
            con = new DBConnection().getConnection();
            String query = " SELECT * FROM eh_event_calender  WHERE `uni_org_id` = ? ";
            //SELECT * FROM appoinment WHERE doctorid = 1
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, uni_org_id);
            System.out.println("ps:" + ps);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                EventBean b = new EventBean();
                b.setId(rs.getInt("id"));
                b.setEvent_name(rs.getString("event_name"));
                b.setEvent_datetime(rs.getString("event_datetime"));
                appBean.add(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return appBean;
    }

    public boolean setEvent(EventBean bean) throws SQLException {
        boolean flag = false;
        Connection con = null;
        try {
            con = new DBConnection().getConnection();
            String query = " insert into `eh_event_calender` (\n"
                    + "  `event_name`,\n"
                    + "  `envent_id`,\n"
                    + "  `uni_org_id`,\n"
                    + "  `event_datetime`,\n"
                    + "  `comment`\n"
                    + ")\n"
                    + "values\n"
                    + "  (\n"
                    + "    ?,\n"
                    + "    ?,\n"
                    + "    ?,\n"
                    + "    ?,\n"
                    + "    ?\n"
                    + "  ); ";
            /*INSERT INTO users (fname,lname,gender,age,email,pword,TYPE)
VALUES ('uxnath','fernando','Male',30,'uxnathdo@gmail.com',PASSWORD('123'),'PNT')*/
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, bean.getEvent_name());
            ps.setInt(2, bean.getEnvent_id());
            ps.setInt(3, bean.getUni_org_id());
            ps.setString(4, bean.getEvent_datetime());
            ps.setString(5, bean.getComment());
            System.out.println("ps:" + ps);

            ps.execute();

            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return flag;
    }

}
