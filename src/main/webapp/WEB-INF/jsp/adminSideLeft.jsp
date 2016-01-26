<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- Left side column. contains the logo and sidebar -->
<aside class="left-side sidebar-offcanvas">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left info">
                <p>Hello, ${sessionScope.user.pseudo}</p>

                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li> <!-- class="active" -->
                <a class="pointer" href="/ImobAchat/admin">
                    <i class="fa fa-dashboard"></i> <span>Dashboard</span>
                </a>
            </li>
            <li>
                <a class="pointer" href="/ImobAchat/adminUsers">
                    <i class="fa fa-user"></i> <span>Utilisateurs</span>
                    <small class="badge pull-right bg-red">${nb_users}</small>
                </a>
            </li>
            <li>
                <a class="pointer" href="/ImobAchat/adminProperties">
                    <i class="fa fa-home"></i> <span>Propriétés</span>
                    <small class="badge pull-right bg-yellow">${nb_announcements}</small>
                </a>
            </li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>