<!--Author :neeraja admin crud operations-->

<!--Author :neeraja admin crud operations-->

<html>
<head>
<title>Home</title>
</head>

<style>
	body
	{ 
		background-color:lightblue;
	}
	h1
	{
		color:White;
		text-align:center;
	}
	
	
</style>
<body>
<div>
<h1>Operations</h1></br></br>

<a href="AddQuestion.jsp"><img src="/fbtest/images/addQuestion.jpg" width="50" height="50" title=addQuestion><%out.println("add a question");%></a></br></br>


<form action="addQuestion" method="get"> 
	<input type="submit" value="showAllQuestions">
</form>



</body>
</html>