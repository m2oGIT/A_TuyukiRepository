<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=Shift_JIS"
    pageEncoding="Shift_JIS"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
<title>はじめてのJSP</title>
</head>
<body>
    <h1><font color="blue">はじめてのJSPです。</font></h1>
    
    <form action="./EchoJSP.jsp"method="POST">
        <input type="text" name="param"/>
        <input type="submit" value="自ページに送信！"/>
    </form>

<!-- HTMLのコメントは画面のソースに出力される -->
<%-- JSPのコメントは出力されない --%>

<%
    //自ページで入力した値を取得
        request.setCharacterEncoding("Shift-JIS");
        String param= request.getParameter("param");
        System.out.println(param);
%>

<%= param  %>

<hr>
    ループによる列の出力
    <table border="1"bordercolor="black">
    <tr>
    <% for (int i = 0; i < 10; i++){ %>
    
        <td><%= i  %><td>
        
    <% } %>
    </tr>
    </table>
    
<hr>
    現在の日時を表示<br>
<%
    SimpleDateFormat fmt = new SimpleDateFormat("yyyy年MM月dd日 hh時mm分ss秒");
    Date now = new Date();
%>


<%= fmt.format(now) %>

    
</body>
</html>