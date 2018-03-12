<html>
<head><title>First JSP</title></head>
<body>
  
      <h2>Message:</h2>
  <%
    out.print(request.getAttribute("mess"));
  %>

</body>
</html>

