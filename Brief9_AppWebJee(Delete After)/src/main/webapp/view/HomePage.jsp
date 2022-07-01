
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />

<title>Dashboard - Task Manager</title>

</head>

<body>

	

	<div class="row">

		<div class="container">
			<h3 class="text-center">List of Tasks</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/addTask" class="btn btn-success">Add New Task</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>todoId</th>
						<th>Title</th>
						<th>Description</th>
						<th>CategoyId</th>
						<th>Status</th>
						<th>Deadline</th>
					</tr>
				</thead>
				<tbody>
					
					
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>
