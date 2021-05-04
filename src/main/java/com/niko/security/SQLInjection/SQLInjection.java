package com.niko.security.SQLInjection;

import org.owasp.esapi.ESAPI;
import org.owasp.esapi.codecs.OracleCodec;

import javax.servlet.http.HttpServletRequest;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLInjection{
    //1.使用预编译语句
        /*
        String custName = request.getParameter("custname");
        String query = "select account_balance from user_data where user_name";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, custname);
        ResultSet rs = ps.executeQuery();
        */

    //2.使用存储过程
        /*
        String custname = request.getParameter("custname");
        try{
            CallableStatement cs = connection.prepareCall("{call sp_getAccountBalance(?)}");
            cs.setString(1, custname);
            ResultSet rs = cs.executeQuery();
        }catch(SQLException se){
            //loging
        }
        */

    //3.檢查數據類型

    //4.使用安全函數  --> 可参考OWASP ESAPI中的实现 ESAPI.encoder().encodeForSQL(new OracleCodec(), queryParam);
        /*
        Codec ORACLE_CODEC = new OracleCodec();
        String query = "select user_id from user_data where user_name = '" +
                ESAPI.encoder().encodeForSQL(ORACLE_CODEC, req.getParameter("userID")) + "' and user_password = '" +
                ESAPI.encoder().encodeForSQL(ORACLE_CODEC, req.getParameter("pwd")) + "'";
         */
}
