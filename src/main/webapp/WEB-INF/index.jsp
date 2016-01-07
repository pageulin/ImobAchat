<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <title>ImobAchat</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="author" content=""/>
    <meta content="text/html; charset=utf-8" http-equiv="Content-Type"/>
    <meta content="fr" http-equiv="Content-Language"/>

    <!-- THEME STYLESHEETS -->
    <link rel="stylesheet" href="resources/css/bootstrap.css"/>
    <link rel="stylesheet" href="resources/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="resources/css/style.css"/>

</head>

<body class="background">

  <h1 class="align-center">ImobAchat</h1>
  <h4 class="align-center margin-top-30px">Vendre, Louer en toute simplicité...</h4>
  <h1 class="align-center margin-top-30px">Connectez vous !</h1>
  
  <center id="content">
	<jsp:include page="/WEB-INF/jsp/registration.jsp" />
  </center>

</body>


<!-- JQUERY -->
<script type="text/javascript" src="resources/js/jquery.min.js"></script>

<!-- MAIN SCRIPT -->
<script type="text/javascript" src="resources/js/index.js"></script>

<script>
  //$('#content').load('WEB-INF/jsp/login.jsp');
  //$('#content').load('WEB-INF/jsp/registration.jsp');
</script>

</html>
