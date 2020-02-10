<html>
<head><title>GAME</title></head>
<body>

<table border="1">
<%@ page import="java.util.Random" %>
    <% 
	Random rn= new Random();
	int x = rn.nextInt(10);
  int y = rn.nextInt(10);
  boolean f= false;
        for(int i=1;i<=10;i++){%>
          <tr style="padding:30px"></tr>
<%	if(i==x+1){
       f = true;
       } 
       for(int p=1;p<=10;p++){
          if(f && p==y+1){
          f=false;
        %>
        <form action="${pageContext.request.contextPath}MyGame" method="post">
        <td><input type="submit" name="button" style="padding:30px" value="X" /></td>
        </form>
        <% }else{ %> 
        
		        <td style="padding:30px">    </td>
<% }  %>
<% }  %>
<% }  %>
</table>

</body>
</html>
