<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Admin ImobAchat</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>

        <!-- THEME STYLESHEETS -->
        <link rel="stylesheet" href="resources/css/bootstrap.css"/>
        <link rel="stylesheet" href="resources/css/font-awesome.min.css"/>
        <link rel="stylesheet" href="resources/css/style.css"/>

        <!-- Theme style -->
        <link href="resources/css/AdminLTE.css" rel="stylesheet" type="text/css" />

    </head>
    <body class="skin-blue">
        <!-- header logo: style can be found in header.less -->
        <header class="row">
            <label class="col-md-1 uppercase">ImobAchat</label>
            <div class="col-md-4 pos-right pointer" onclick="document.location.href='/ImobAchat/home'">
                <i class="fa fa-close pointer"></i>
                <label class="pointer">Quitter</label>
            </div>
        </header>

        <div class="wrapper row-offcanvas row-offcanvas-left">
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="left-side sidebar-offcanvas">
                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar">
                    <!-- Sidebar user panel -->
                    <div class="user-panel">
                        <div class="pull-left info">
                            <p>Hello, UserName</p>

                            <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                        </div>
                    </div>
                    <!-- sidebar menu: : style can be found in sidebar.less -->
                    <ul class="sidebar-menu">
                        <li> <!-- class="active" -->
                            <a class="pointer" onclick="loadDashBoard()">
                                <i class="fa fa-dashboard"></i> <span>Dashboard</span>
                            </a>
                        </li>
                        <li>
                            <a class="pointer" onclick="loadUsers()">
                                <i class="fa fa-user"></i> <span>Utilisateurs</span>
                                <small class="badge pull-right bg-red">150</small>
                            </a>
                        </li>
                        <li>
                            <a class="pointer" onclick="loadProperties()">
                                <i class="fa fa-home"></i> <span>Propriétés</span>
                                <small class="badge pull-right bg-yellow">30</small>
                            </a>
                        </li>
                    </ul>
                </section>
                <!-- /.sidebar -->
            </aside>

            <!-- Right side column. Contains the navbar and content of the page -->
            <aside class="right-side">
                <jsp:include page="/WEB-INF/jsp/dashboard.jsp"/>
            </aside><!-- /.right-side -->
        </div><!-- ./wrapper -->

    </body>

    <!-- JQUERY -->
    <script type="text/javascript" src="resources/js/jquery.min.js"></script>

    <!-- ADMIN SCRIPT -->
    <script type="text/javascript" src="resources/js/admin.js"></script>

</html>