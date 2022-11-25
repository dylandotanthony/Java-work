<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css"/>
<title>Omikuji Form </title>
</head>
<body>
	<h1 class="text-center">Send an Omikuji</h1>
	
	<div  class="container ">
		<div class="row">
			<div class="col">
			<span></span>
			</div>
		
			<div class=" col-6">
				<form action="/new" method="POST">
				
					<div class="row mb-3">
						<label for="numbers" class="col-sm-5 col-form-label">Pick any number from 5 to 25:</label>
						<div class="col-sm-2">
							<input class="form-control" type=number min="5" max="25" name="numbers"/>
						</div>
					</div>
					<div class="row mb-3">
						<label for="city" class="col-sm-5 col-form-label">Enter the name of any city:</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="city"/>
						</div>
					</div>
					<div class="row mb-3">
						<label for="name" class="col-sm-5 col-form-label">Enter the name of any real person:</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="name"/>
						</div>
					</div>
					<div class="row mb-3">
						<label for="interest" class="col-sm-5 col-form-label">Enter a professional endeavor or hobby:</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="interest"/>
						</div>
					</div>
					<div class="row mb-3">
						<label for="living" class="col-sm-5 col-form-label">Enter any type of living thing:</label>
						<div class="col-sm-4">
							<input class="form-control" type="text" name="living"/>
						</div>
					</div>
					<div class="row mb-3">
						<label for="something" class="col-sm-5 col-form-label">Say something nice to someone:</label>
						<div class="col-sm-4">
							<textarea class="form-control" name="something" cols="30" rows="4"></textarea>
						</div>
					</div>
					<div class="d-flex justify-content-center ">
						<button class="btn  btn-info" type="submit">Send</button>	
					</div>
				</form>
			</div>
			<div class="col">
			<span></span>
			</div>
		</div>
	</div>




</body>
</html>