<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Task</title>
</head>
<body>

	<div class="main">

		<!-- Sign up form -->
		<section class="signup">
			
				
					<div>
						<h2 class="form-title">Add New Task</h2>
					
						<form method="post" action="">
							<div>
								<input type="text" name="title" id="title" placeholder="Title" />
							</div><br>
							
							<div>
								<input type="text" name="description" id="description" placeholder="Task Description" />
							</div><br>
							
							<div>
								<input type="text" name="category" id="category" placeholder="Category" />
							</div><br>
							
							<div>
								<input type="text" name="status" id="status" placeholder="Status" />
							</div><br>
							
							<div>
								<input type="text" name="deadline" id="deadline" placeholder="Deadline" />
							</div><br>
							
							
							<div>
								<input type="submit" name="save" id="save" value="Save" />
							</div>
						</form>
					</div>
		</section>
	</div>


</body>
</html>