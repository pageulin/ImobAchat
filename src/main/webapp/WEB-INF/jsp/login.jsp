<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<body class="background">

  <h1 class="align-center">ImobAchat</h1>
  <h4 class="align-center margin-top-30px">Vendre, Louer en toute simplicité...</h4>
  <h1 class="align-center margin-top-30px">Connectez vous !</h1>
  
  <center id="index-content">
	<form:form commandName="login">
		<div id="login_section">
		  <div id="mail_section" class="white-box width-25pc margin-top-30px">
		    <form:input path="email" type="text" id="mail_field_login" placeholder="Adresse mail" class="form-control margin-top-30px"/>
		    <form:input path="passWord" type="password" id="password_field_login" placeholder="Mot de passe" class="form-control margin-top-30px"/>
		    
		    <!-- <h3 id="error_mail_login" class="red display-none"><i class="fa fa-warning"></i> Adresse mail inconnu.</h3> -->
		    <!-- <h3 id="invalid_mail_login" class="red display-none"><i class="fa fa-warning"></i> Adresse mail invalide.</h3> -->
		    <!-- <h3 id="error_password_login" class="red display-none"><i class="fa fa-warning"></i> Mauvais mot de passe.</h3><br/> -->
		    
		    <button id="next_button" type="submit" class="btn btn-info margin-top-10px">Connection</button>
		  </div>

		  <a href="registration"><h2 class="pointer">Créer un compte</h2></a>
		</div>
	</form:form>
  </center>

</body>