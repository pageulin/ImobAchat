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

    <!-- THEME ACTUALITY SLIDER -->
    <link rel="stylesheet" href="resources/css/slider.css"/>
    
    <!-- GOOGLE WEB FONTS -->
	<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,300italic,400italic' rel='stylesheet' type='text/css' />

    <!-- THEME ADMIN -->
    <link href="resources/css/AdminLTE.css" rel="stylesheet" type="text/css" />

</head>

<body class="background-grid">
  
    <jsp:include page="/WEB-INF/jsp/header.jsp" />
    
    <div id="home-content" class="row height-100pc">
        <jsp:include page="/WEB-INF/jsp/search-property.jsp" />
    </div>
    
    <!-- property-details.jsp -->
</body>

<!-- JQUERY -->
<script type="text/javascript" src="resources/js/jquery.min.js"></script>

<!-- MAIN SCRIPT -->
<script type="text/javascript" src="resources/js/index.js"></script>

<!-- SEARCH MAP SCRIPT -->
<script type="text/javascript" src="resources/js/modernizr-2.7.1.min.js"></script>
<script type="text/javascript" src="resources/js/infobox.js"></script>
<script type="text/javascript" src="resources/js/markerclusterer.js"></script>
<script type="text/javascript" src="resources/js/property.js"></script>
<script type="text/javascript" src="resources/js/gmap-data.js"></script>

<!-- ACTUALITY SLIDER SCRIPT -->
<script type="text/javascript" src="resources/js/jquery.carouFredSel-6.2.1-packed.js"></script>
<script type="text/javascript" src="resources/js/property-slider.js"></script>

</html>
