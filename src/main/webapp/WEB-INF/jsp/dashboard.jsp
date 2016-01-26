<body class="skin-blue">

    <div class="wrapper row-offcanvas row-offcanvas-left">

		<jsp:include page="/WEB-INF/jsp/adminSideLeft.jsp"/>

        <aside class="right-side">
            <!-- Main content -->
			<section class="content">
			
			    <!-- Small boxes (Stat box) -->
			    <div class="row">
			        <div class="col-lg-3 col-xs-6">
			            <!-- small box -->
			            <div class="small-box bg-aqua">
			                <div class="inner">
			                    <h4><b>150</b></h4>
			                    <p>Utilisateurs</p>
			                </div>
			                <div class="icon">
			                    <i class="fa fa-user"></i>
			                </div>
			                <a href="/ImobAchat/admin/users" class="pointer small-box-footer pointer">
			                    Visualiser <i class="fa fa-arrow-circle-right"></i>
			                </a>
			            </div>
			        </div><!-- ./col -->
			        <div class="col-lg-3 col-xs-6">
			            <!-- small box -->
			            <div class="small-box bg-green">
			                <div class="inner">
			                    <h4><b>30</b></h4>
			                    <p>Propriétés</p>
			                </div>
			                <div class="icon">
			                    <i class="fa fa-home"></i>
			                </div>
			                <a href="/ImobAchat/admin/properties" class="pointer small-box-footer pointer">
			                    Visualiser <i class="fa fa-arrow-circle-right"></i>
			                </a>
			            </div>
			        </div><!-- ./col -->
			    </div><!-- /.row -->
			
			    <!-- top row -->
			    <div class="row">
			        <div class="col-xs-12 connectedSortable">
			            
			        </div><!-- /.col -->
			    </div>
			    <!-- /.row -->
			
			</section><!-- /.content -->
        </aside>
    </div>

</body>