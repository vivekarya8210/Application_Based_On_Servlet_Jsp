<%!public String generateWishMessage(String user) {  //Declaration_Tag

		//get System Date and Time

		java.time.LocalDateTime ldt = java.time.LocalDateTime.now();

		//get current hour of the day

		int hour = ldt.getHour();

		if (hour < 12)
			return "Good Morning " + user;

		else if (hour < 16)
			return "Good Afternoon " + user;
		else if (hour < 20)
			return "Good Evening " + user;

		else
			return "Good Night " + user;

	}%>
	
<h1 style="color: red; text-align: center">Welcome To Java Server
	Pages</h1>
<br>

<h1 style="color: green; text-align: center">
	Date and Time is ::<%=new java.util.Date()%></h1>   //Expression Tag
<br>


<%String name = "Shiva";%>     //Scriplet Tag

<br>
<br>

<h1 style="color:black;text-align:center">The wish Message is ::<%=generateWishMessage(name)%></h1>










