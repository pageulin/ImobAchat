<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<body class="background">

  <h1 class="align-center">ImobAchat</h1>
  <h4 class="align-center margin-top-30px">Vendre, Louer en toute simplicité...</h4>
  <h1 class="align-center margin-top-30px">Connectez vous !</h1>
  
  <center id="index-content">

    <form:form commandName="registration" id="registration">
      <div id="account_section">
        <div class="white-box width-25pc margin-top-30px">
          <div class="row">
            <div class="col-md-6">
              <form:input path="firstname" type="text" id="first_name_registration" placeholder="Prénom" class="form-control"/>
            </div>
            <div class="col-md-6">
              <form:input path="lastName" type="text" id="last_name_registration" placeholder="Nom" class="form-control"/>
            </div>
          </div>
          
          <form:input path="email" type="mail" id="mail_field_registration" placeholder="Address Mail" class="form-control margin-top-10px"/>
          
          <!-- <h3 id="error_mail_registration" class="red display-none"><i class="fa fa-warning"></i> Adresse mail déja utilisé.</h3><br/> -->
          
          <form:input type="password" path="passWord" id="password_field_registration" placeholder="Mot de passe" class="form-control margin-top-10px"/>
          <!-- <input type="password" id="confirm_password_field_registration" placeholder="Confirmation" class="form-control margin-top-10px"/> -->
          
          <!-- <h3 id="error_confirmation_registration" class="red display-none"><i class="fa fa-warning"></i> Erreur de confirmation.</h3><br/> -->
          
          <button id="registration_button" type="submit" class="btn btn-info margin-top-10px" onclick="makeAccount()">Créer</button>
        </div>

        <a href="registration"><h2 id="link_login" onclick="loadLogin()" class="pointer">Connectez vous</h2></a>
      </div>
    </form:form>
  </center>

</body>
