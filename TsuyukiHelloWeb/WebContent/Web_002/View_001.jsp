<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=Shift_JIS"
  pageEncoding="Shift_JIS"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
<title>Insert title here</title>
</head>
<body>

  <%
    //���y�[�W�œ��͂����l���擾
    request.setCharacterEncoding( "Shift-JIS" );
    String param = request.getParameter( "param" );
    System.out.println( param );
  %>

  <%="JSP�̊�b�@��P"%>
  <hr>

  <%="����ɂ��́@" + param + "����"%>

  <hr>

</body>
</html>