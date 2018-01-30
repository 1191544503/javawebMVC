<%@page language="java" contentType="text/html; charset=utf-8"%>
<%@page import="java.util.*"%>
<%@page import="mk.UserBean"%>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="./css/default.css"/>

</head>
<body>
<h2>投票结果</h2>
<% List<mk.UserBean> list=null;
	list = (List)request.getAttribute("list");
	int oneticket=0,thoticket=0,threeticket=0,fourticket=0;
	for(int i=0;i<list.size();i++) {
	    oneticket=(int)(list.get(i)).getone();
		thoticket=(int)(list.get(i)).gettwo();
		threeticket=(int)(list.get(i)).getthree();
		fourticket=(int)(list.get(i)).getfour();
	}
	int sum=oneticket+thoticket+threeticket+fourticket;
	double a=(double)oneticket/(double)sum;
    double b=(double)thoticket/(double)sum;
    double c=(double)threeticket/(double)sum;
    double d=(double)fourticket/(double)sum;
%>
<br>
好&nbsp&nbsp&nbsp&nbsp&nbsp<img src="jindutiao.png" width="<%=a*500%>px" height="20px"><%=(int)(a*100)%>%
<br>
较好&nbsp&nbsp<img src="jindutiao.png" width="<%=b*500%>px" height="20px"><%=(int)(b*100) %>%
<br>
一般&nbsp&nbsp<img src="jindutiao.png" width="<%=c*500%>px" height="20px"><%=(int)(c*100) %>%
<br>
差&nbsp&nbsp&nbsp&nbsp&nbsp<img src="jindutiao.png" width="<%=d*500%>px" height="20px"><%=(int)(d*100) %>%

</body>
</html>