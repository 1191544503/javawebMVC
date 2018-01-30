<%@ page language="java" pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <base href="<%=basePath%>">
</head>
<body align="center">
<h1>投票</h1>
<H4>
服务满意度调查表<BR/>
&nbsp&nbsp&nbsp&nbsp请选择对我们服务器的评价:
</H4>

<form action="deal.action" method="post">
  <table align="center">
    <tr>
      <td><input type="radio" name="piao" id="T1" value="1"/></td>
      <td><label for="T1">好</label></td>
    </tr>
    <tr>
      <td><input type="radio" name="piao" id="T2" value="2"/></td>
      <td><label for="T2">较好</label></td>
    </tr>
    <tr>
      <td><input type="radio" name="piao" id="T3" value="3"/></td>
      <td><label for="T3">一般</label></td>
    </tr>
    <tr>
      <td><input type="radio" name="piao" id="T4" value="4"/></td>
      <td><label for="T4">差</label></td>
    </tr>
    <tr><td><input type="submit" name="sm" value="投票"></td></tr>
  </table>
</form>
</body>
</html>
