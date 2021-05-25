<!DOCTYPE html>
<html>
<head>

<title>Register Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	<meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
<style>
       
		div.input-container{
        text-align: center;
		justify-items: center;
		
		}
		div{
		font-family: cursive;
		
		}
		
	
        .input-container {
			text-align: center;
            background-color: whitesmoke;
            background-origin: 2px solid red;


            border: 5px solid whitesmoke;
            box-shadow: 1px 7px 6px 5px gray;

            justify-content: center;

            display: flex;
            flex-direction: row;
            width: 40%;
            margin-top: 5px;
            margin-bottom: 5px;
        }

        .icon {
            padding: 10px;
            background: dodgerblue;
            color: white;
            min-width: 50px;
            text-align: center;
        }

        .input-field {
             
            width: 100%;
            padding: 1px;
            outline: none;
            text-shadow: black;
        }

        .input-field:focus {
            border: 2px solid rgb(81, 161, 241);
        }
		.btn {
           
           
            padding: 15px 20px;
            border: double;
            cursor: pointer;
            width: 20%;
            opacity: 0.9;
        }
        h2{font-family: cursive;
         }
       
        </style>
</head>

<div>
	<nav class="navbar navbar-light" style="background-color:whitesmoke;border: black">
		<i class="fa fa-gamepad icon">
		<a class="navbar-brand" href="#" style="font-family: cursive;"> BATTLEGROUNDS MOBILE INDIA</a> </i>
		<i class="fa fa-sign-in icon">
		<a class="navbar-brand" class="float-right" href="#" > SignIn</a></i>
	</nav></div>

<body style="background-image: url('img/home.jpg');
       background-repeat:repeat;ss ;
       background-position:60px;
      margin-left: 20px ;margin-right: 20px"; >
    <h3>
		<span style="color: red;">${msg}</span>
	</h3> 
	<h2><marquee behavior="scroll" direction="right"  style="color: white">Pre - register</marquee></h2>
	

	<form name="myForm" action="registration.do" method="post" >
	<div class="input-container">
		<i class="fa fa-user icon"></i>
		<input class="input-field" type="text" placeholder="Enter full name" name="fullName" id="user">
	</div>
	<div class="input-container">
		<i class="fa fa-envelope icon"></i>
		<input required class="input-field" type="text" placeholder="EmailId" name="EmailId" id="email">
	</div>
	
	
	<div class="input-container">
		<i class="fa fa-calendar icon"></i>
		<input class="input-field" type="date"  placeholder="Dob"  name="dob" id="user">
	</div>
	<div class="input-container">
		<i class="fa fa-phone icon"></i>
		<input class="input-field" type="phonenumber" placeholder="Phone_number" name="contactNo" id="phnumber">
	</div>
	

	<div class="input-container">
		<i class="fa fa-home icon"></i>
		<input class="input-field" type="text" placeholder="Enter address" name="address" id="user">
	</div>
	<div class="input-container">
		<i class="fa fa-user-circle icon"></i>
	
		<input class="input-field" type="radio"  name="gender" value="male">Male
		<input class="input-field" type="radio" name="gender" value="female">Female 
		<input  class="input-field" type="radio" name="gender" value="others">Others
	</div>
	
	<div class="input-container">
		<i class="fa fa-key icon"></i>
		<input class="input-field" type="password" placeholder="password" name="password" id="pwd">
	</div>

	<div class="input-container">
		<i class="fa fa-key icon"></i>
		<input class="input-field" type="password" placeholder="Confirmpassward" name="cpwd">
	</div>
	
	<div>
	<button type="submit" class="btn btn-success btn-sm">Register</button>
	<button type="reset" class="btn btn-danger btn-sm">Reset</button>
	
	</div>
	</form>

	
	<footer style="background: whitesmoke;"
		class="page-footer font-small black">
		<div class="footer-copyright text-center py-3">© 2021 Copyright</div>
	</footer>
</body>

</html>