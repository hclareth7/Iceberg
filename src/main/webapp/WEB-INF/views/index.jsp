<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Iceberg(Fundacion Puerto Bahia)</title>
	<meta name="description" content="">

	<!-- FONTS-->
	<link rel='stylesheet' type='text/css' href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700'>
	<link href='https://fonts.googleapis.com/css?family=Lato:400,300,300italic,400italic,700,700italic' rel='stylesheet' type='text/css'>

	<!-- ESTILO-->
	<link rel="stylesheet" type="text/css" href="assets/css/theme.css">
	<link rel="stylesheet" type="text/css" href="assets/css/forms.css">
	<link rel="stylesheet" type="text/css" href="assets/css/bootstrap-datetimepicker.css">
	<link rel="stylesheet" type="text/css" href="assets/css/magnific-popup.css">
	<link rel="stylesheet" type="text/css" href="assets/css/miestilo.css">

	<!-- ICONO-->
	<link rel="shortcut icon" href="assets/img/favicon.ico">

	<!--[if lt IE 9]>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.js"></script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js"></script>
         <![endif]-->
</head>

<body class="dashboard-page" ng-app="icebergApp">

	<!-- -------------- Customizer -------------- -->
	<div id="customizer" class="hidden-xs">
		<div class="panel">
			<div class="panel-heading">
				<span class="panel-icon">
                        <i class="fa fa-cogs"></i>
                    </span>
				<span class="panel-title"> Theme Options</span>
			</div>
			<div class="panel-body pn">
				<ul class="nav nav-list nav-list-sm" role="tablist">
					<li class="active">
						<a href="#customizer-header" role="tab" data-toggle="tab">Navbar</a>
					</li>
					<li>
						<a href="#customizer-sidebar" role="tab" data-toggle="tab">Sidebar</a>
					</li>
					<li>
						<a href="#customizer-settings" role="tab" data-toggle="tab">Misc</a>
					</li>
				</ul>
				<div class="tab-content p20 ptn pb15">
					<div role="tabpanel" class="tab-pane active" id="customizer-header">
						<form id="customizer-header-skin">
							<h6 class="mv20">Header Skins</h6>

							<div class="customizer-sample">
								<table>
									<tr>
										<td>
											<div class="checkbox-custom fill checkbox-dark mb10">
												<input type="radio" name="headerSkin" id="headerSkin5" checked value="bg-dark">
												<label for="headerSkin5">Dark</label>
											</div>
										</td>
										<td>
											<div class="checkbox-custom fill checkbox-warning mb10">
												<input type="radio" name="headerSkin" id="headerSkin2" value="bg-warning">
												<label for="headerSkin2">Warning</label>
											</div>
										</td>
									</tr>
									<tr>
										<td>
											<div class="checkbox-custom fill checkbox-danger mb10">
												<input type="radio" name="headerSkin" id="headerSkin3" value="bg-danger">
												<label for="headerSkin3">Danger</label>
											</div>
										</td>
										<td>
											<div class="checkbox-custom fill checkbox-success mb10">
												<input type="radio" name="headerSkin" id="headerSkin4" value="bg-success">
												<label for="headerSkin4">Success</label>
											</div>
										</td>
									</tr>
									<tr>
										<td>
											<div class="checkbox-custom fill checkbox-primary mb10">
												<input type="radio" name="headerSkin" id="headerSkin6" value="bg-primary">
												<label for="headerSkin6">Primary</label>
											</div>
										</td>
										<td>
											<div class="checkbox-custom fill checkbox-info mb10">
												<input type="radio" name="headerSkin" id="headerSkin7" value="bg-info">
												<label for="headerSkin7">Info</label>
											</div>
										</td>
									</tr>
									<tr>
										<td>
											<div class="checkbox-custom fill checkbox-alert mb10">
												<input type="radio" name="headerSkin" id="headerSkin8" value="bg-alert">
												<label for="headerSkin8">Alert</label>
											</div>
										</td>
										<td>
											<div class="checkbox-custom fill checkbox-system mb10">
												<input type="radio" name="headerSkin" id="headerSkin9" value="bg-system">
												<label for="headerSkin9">System</label>
											</div>
										</td>
									</tr>
								</table>

								<div class="checkbox-custom checkbox-disabled fill mb10">
									<input type="radio" name="headerSkin" id="headerSkin1" value="bgc-light">
									<label for="headerSkin1">Light</label>
								</div>
							</div>
						</form>
						<form id="customizer-footer-skin">
							<h6 class="mv20">Footer Skins</h6>

							<div class="customizer-sample">
								<table>
									<tr>
										<td>
											<div class="checkbox-custom fill checkbox-dark mb10">
												<input type="radio" name="footerSkin" id="footerSkin1" checked value="">
												<label for="footerSkin1">Dark</label>
											</div>
										</td>
										<td>
											<div class="checkbox-custom checkbox-disabled fill mb10">
												<input type="radio" name="footerSkin" id="footerSkin2" value="footer-light">
												<label for="footerSkin2">Light</label>
											</div>
										</td>
									</tr>
								</table>
							</div>
						</form>
					</div>
					<div role="tabpanel" class="tab-pane" id="customizer-sidebar">
						<form id="customizer-sidebar-skin">
							<h6 class="mv20">Sidebar Skins</h6>

							<div class="customizer-sample">
								<div class="checkbox-custom fill checkbox-dark mb10">
									<input type="radio" name="sidebarSkin" checked id="sidebarSkin2" value="">
									<label for="sidebarSkin2">Dark</label>
								</div>
								<div class="checkbox-custom fill checkbox-disabled mb10">
									<input type="radio" name="sidebarSkin" id="sidebarSkin1" value="sidebar-light">
									<label for="sidebarSkin1">Light</label>
								</div>
							</div>
						</form>
					</div>
					<div role="tabpanel" class="tab-pane" id="customizer-settings">
						<form id="customizer-settings-misc">
							<h6 class="mv20 mtn">Layout Options</h6>

							<div class="form-group">
								<div class="checkbox-custom fill mb10">
									<input type="checkbox" checked="" id="header-option">
									<label for="header-option">Fixed Header</label>
								</div>
							</div>
							<div class="form-group">
								<div class="checkbox-custom fill mb10">
									<input type="checkbox" checked="" id="sidebar-option">
									<label for="sidebar-option">Fixed Sidebar</label>
								</div>
							</div>
							<div class="form-group">
								<div class="checkbox-custom fill mb10">
									<input type="checkbox" id="breadcrumb-option">
									<label for="breadcrumb-option">Fixed Breadcrumbs</label>
								</div>
							</div>
							<div class="form-group">
								<div class="checkbox-custom fill mb10">
									<input type="checkbox" id="breadcrumb-hidden">
									<label for="breadcrumb-hidden">Hide Breadcrumbs</label>
								</div>
							</div>
						</form>
					</div>
				</div>
				<div class="form-group mn pb35 pt25 text-center">
					<a href="#" id="clearAll" class="btn btn-primary btn-bordered btn-sm">Clear All</a>
				</div>
			</div>
		</div>
	</div>
	<!-- -------------- /Customizer -------------- -->

	<!-- -------------- Body Wrap  -------------- -->
	<div id="main">

		<!-- -------------- Header  -------------- -->
		<header class="navbar navbar-fixed-top bg-dark">
			<div class="navbar-logo-wrapper">
				<a class="navbar-logo-text" href="dashboard1.html">
					<b>Alliance</b>
				</a>
				<span id="sidebar_left_toggle" class="ad ad-lines"></span>
			</div>
			<ul class="nav navbar-nav navbar-left">
				<li class="dropdown dropdown-fuse hidden-xs">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown
                            <span class="fa fa-chevron-down"></span>
                        </a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="#">Action</a></li>
						<li><a href="#">One more action</a></li>
						<li><a href="#">More actions if needed</a></li>
						<li class="divider"></li>
						<li><a href="#">Separated action</a></li>
					</ul>
				</li>
				<li class="hidden-xs">
					<a class="navbar-fullscreen toggle-active" href="#">
						<span class="glyphicon glyphicon-fullscreen"></span>
					</a>
				</li>
			</ul>
			<form class="navbar-form navbar-left search-form square" role="search">
				<div class="input-group add-on">

					<input type="text" class="form-control" placeholder="Search..." onfocus="this.placeholder = ''" onblur="this.placeholder = 'Search...'">

					<div class="input-group-btn">
						<button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
					</div>

				</div>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li class="hidden-xs">
					<div class="navbar-btn btn-group">
						<a href="#" class="topbar-dropmenu-toggle btn" data-toggle="button">
							<span class="fa fa-magic fs20 text-info"></span>
						</a>
					</div>
				</li>
				<li class="dropdown dropdown-fuse">
					<div class="navbar-btn btn-group">
						<button data-toggle="dropdown" class="btn dropdown-toggle">
							<span class="fa fa-envelope fs20 text-danger"></span>
						</button>
						<button data-toggle="dropdown" class="btn dropdown-toggle fs18 visible-xl">
							3
						</button>
						<div class="dropdown-menu keep-dropdown w375 animated animated-shorter fadeIn" role="menu">
							<div class="panel mbn">
								<div class="panel-menu">
									<div class="btn-group btn-group-justified btn-group-nav" role="tablist">
										<a href="#nav-tab1" data-toggle="tab" class="btn btn-primary btn-bordered btn-sm active">Activity</a>
										<a href="#nav-tab2" data-toggle="tab" class="btn btn-primary btn-bordered btn-sm br-l-n br-r-n">Messages</a>
										<a href="#nav-tab3" data-toggle="tab" class="btn btn-primary btn-bordered btn-sm">Notifications</a>
									</div>
								</div>
								<div class="panel-body panel-scroller scroller-overlay scroller-navbar pn">
									<div class="tab-content br-n pn">
										<div id="nav-tab1" class="tab-pane active" role="tabpanel">
											<ul class="media-list" role="menu">
												<li class="media">
													<a class="media-left" href="#"> <img src="assets/img/avatars/5.jpg" class="mw40 br2" alt="avatar">
													</a>

													<div class="media-body">
														<h5 class="media-heading">New post
                                                                <small class="text-muted">- 09/01/15</small>
                                                            </h5> Last Updated 5 days ago by
														<a class="" href="#"> John Doe </a>
													</div>
												</li>
												<li class="media">
													<a class="media-left" href="#"> <img src="assets/img/avatars/2.jpg" class="mw40 br2" alt="avatar">
													</a>

													<div class="media-body">
														<h5 class="media-heading">New post
                                                                <small> - 09/01/15</small>
                                                            </h5> Last Updated 5 days ago by
														<a class="" href="#"> John Doe </a>
													</div>
												</li>
												<li class="media">
													<a class="media-left" href="#"> <img src="assets/img/avatars/3.jpg" class="mw40 br2" alt="avatar">
													</a>

													<div class="media-body">
														<h5 class="media-heading">New post
                                                                <small class="text-muted">- 09/01/15</small>
                                                            </h5> Last Updated 5 days ago by
														<a class="" href="#"> John Doe </a>
													</div>
												</li>
												<li class="media">
													<a class="media-left" href="#"> <img src="assets/img/avatars/4.jpg" class="mw40 br2" alt="avatar">
													</a>

													<div class="media-body">
														<h5 class="media-heading">New post
                                                                <small class="text-muted">- 09/01/15</small>
                                                            </h5> Last Updated 5 days ago by
														<a class="" href="#"> John Doe </a>
													</div>
												</li>
												<li class="media">
													<a class="media-left" href="#"> <img src="assets/img/avatars/5.jpg" class="mw40 br2" alt="avatar">
													</a>

													<div class="media-body">
														<h5 class="media-heading">New post
                                                                <small class="text-muted">- 09/01/15</small>
                                                            </h5> Last Updated 5 days ago by
														<a class="" href="#"> John Doe </a>
													</div>
												</li>
												<li class="media">
													<a class="media-left" href="#"> <img src="assets/img/avatars/2.jpg" class="mw40 br2" alt="avatar">
													</a>

													<div class="media-body">
														<h5 class="media-heading">New post
                                                                <small> - 09/01/15</small>
                                                            </h5> Last Updated 5 days ago by
														<a class="" href="#"> John Doe </a>
													</div>
												</li>
												<li class="media">
													<a class="media-left" href="#"> <img src="assets/img/avatars/3.jpg" class="mw40 br2" alt="avatar">
													</a>

													<div class="media-body">
														<h5 class="media-heading">New post
                                                                <small class="text-muted">- 09/01/15</small>
                                                            </h5> Last Updated 5 days ago by
														<a class="" href="#"> John Doe </a>
													</div>
												</li>
											</ul>
										</div>
										<div id="nav-tab2" class="tab-pane chat-widget" role="tabpanel">
											<div class="media">
												<div class="media-left">
													<a href="#">
														<img class="media-object" alt="64x64" src="assets/img/avatars/3.jpg">
													</a>
												</div>
												<div class="media-body">
													<span class="media-status online"></span>
													<h5 class="media-heading">Frank Hill
                                                            <small> - 14:10am</small>
                                                        </h5> Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
												</div>
											</div>
											<div class="media">
												<div class="media-body">
													<span class="media-status offline"></span>
													<h5 class="media-heading">George Kelly
                                                            <small> - 15:25am</small>
                                                        </h5> Sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.
												</div>
												<div class="media-right">
													<a href="#">
														<img class="media-object" alt="64x64" src="assets/img/avatars/1.jpg">
													</a>
												</div>
											</div>
											<div class="media">
												<div class="media-left">
													<a href="#">
														<img class="media-object" alt="64x64" src="assets/img/avatars/2.jpg">
													</a>
												</div>
												<div class="media-body">
													<span class="media-status online"></span>
													<h5 class="media-heading">Frank Hill
                                                            <small> - 15:33am</small>
                                                        </h5> Lorem ipsum dolor sit amet, nonummy nibh euismod tinc consectetuer adipiscing elit.
												</div>
											</div>
											<div class="media">
												<div class="media-body">
													<span class="media-status offline"></span>
													<h5 class="media-heading">George Kelly
                                                            <small> - 15:43am</small>
                                                        </h5> Euismod sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.
												</div>
												<div class="media-right">
													<a href="#">
														<img class="media-object" alt="64x64" src="assets/img/avatars/1.jpg">
													</a>
												</div>
											</div>
											<div class="media">
												<div class="media-left">
													<a href="#">
														<img class="media-object" alt="64x64" src="assets/img/avatars/2.jpg">
													</a>
												</div>
												<div class="media-body">
													<span class="media-status online"></span>
													<h5 class="media-heading">Frank Hill
                                                            <small> - 16:30am</small>
                                                        </h5> Corem ipsum dolor sit amet, nonummy nibh euismod tinc co.
												</div>
											</div>
											<div class="media">
												<div class="media-body">
													<span class="media-status offline"></span>
													<h5 class="media-heading">George Kelly
                                                            <small> - 12:30am</small>
                                                        </h5> Ubh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.
												</div>
												<div class="media-right">
													<a href="#">
														<img class="media-object" alt="64x64" src="assets/img/avatars/1.jpg">
													</a>
												</div>
											</div>
										</div>
										<div id="nav-tab3" class="tab-pane alerts-widget" role="tabpanel">
											<div class="media">
												<a class="media-left" href="#"> <span class="fa fa-shopping-cart text-success"></span> </a>

												<div class="media-body">
													<h5 class="media-heading">New Product Order
                                                            <small class="text-muted"></small>
                                                        </h5>
													<a href="#">iPad Air</a> - 3 hours ago
												</div>
												<div class="media-right">
													<div class="media-response"> Confirm?</div>
													<div class="btn-group">
														<button type="button" class="btn btn-default btn-sm btn-bordered light">
															<i class="fa fa-check text-success"></i>
														</button>
														<button type="button" class="btn btn-default btn-sm btn-bordered light">
															<i class="fa fa-cog"></i>
														</button>
													</div>
												</div>
											</div>
											<div class="media">
												<a class="media-left" href="#"> <span class="fa fa-comment text-system"></span>
												</a>

												<div class="media-body">
													<h5 class="media-heading">New User Comment
                                                            <small class="text-muted"></small>
                                                        </h5> Sam Fisher - I'd like to read more!
												</div>
												<div class="media-right">
													<div class="media-response text-right"> Moderate?</div>
													<div class="btn-group">
														<button type="button" class="btn btn-default btn-sm btn-bordered light">
															<i class="fa fa-check text-success"></i>
														</button>
														<button type="button" class="btn btn-default btn-sm btn-bordered light">
															<i class="fa fa-pencil"></i>
														</button>
													</div>
												</div>
											</div>
											<div class="media">
												<a class="media-left" href="#"> <span class="fa fa-eye text-warning"></span>
												</a>

												<div class="media-body">
													<h5 class="media-heading">New User Review
                                                            <small class="text-muted"></small>
                                                        </h5> Sebastian Jones - 5 hours ago
												</div>
												<div class="media-right">
													<div class="media-response"> Approve?</div>
													<div class="btn-group">
														<button type="button" class="btn btn-default btn-sm btn-bordered light">
															<i class="fa fa-check text-success"></i>
														</button>
														<button type="button" class="btn btn-default btn-sm btn-bordered light">
															<i class="fa fa-remove"></i>
														</button>
													</div>
												</div>
											</div>
											<div class="media">
												<a class="media-left" href="#"> <span class="fa fa-user text-info"></span>
												</a>

												<div class="media-body">
													<h5 class="media-heading">New User Registration
                                                            <small class="text-muted"></small>
                                                        </h5> Carlos Santiyago - 7 hours ago
												</div>
												<div class="media-right">
													<div class="media-response"> Approve?</div>
													<div class="btn-group">
														<button type="button" class="btn btn-default btn-sm btn-bordered light">
															<i class="fa fa-check text-success"></i>
														</button>
														<button type="button" class="btn btn-default btn-sm btn-bordered light">
															<i class="fa fa-remove"></i>
														</button>
													</div>
												</div>
											</div>
											<div class="media">
												<a class="media-left" href="#"> <span class="fa fa-user text-info"></span>
												</a>

												<div class="media-body">
													<h5 class="media-heading">New User Registration
                                                            <small class="text-muted"></small>
                                                        </h5> Douglas Adams - 13 hours ago

												</div>
												<div class="media-right">
													<div class="media-response"> Approve?</div>
													<div class="btn-group">
														<button type="button" class="btn btn-default btn-sm btn-bordered light">
															<i class="fa fa-check text-success"></i>
														</button>
														<button type="button" class="btn btn-default btn-sm btn-bordered light">
															<i class="fa fa-remove"></i>
														</button>
													</div>
												</div>
											</div>
											<div class="media">
												<a class="media-left" href="#"> <span class="fa fa-info text-alert"></span>
												</a>

												<div class="media-body">
													<h5 class="media-heading">New Invoice
                                                            <small class="text-muted"></small>
                                                        </h5>
													<a href="#">iPad Air</a> - 14 hours ago

												</div>
												<div class="media-right">
													<div class="media-response single">#1234567</div>
													<button type="button" class="btn btn-default btn-sm btn-bordered light">
														<i class="fa fa-link"></i>
													</button>
												</div>
											</div>
											<div class="media">
												<a class="media-left" href="#"> <span class="fa fa-shopping-cart text-success"></span> </a>

												<div class="media-body">
													<h5 class="media-heading">New Product Order
                                                            <small class="text-muted"></small>
                                                        </h5>
													<a href="#">iPad Air</a> - 14 hours ago
												</div>
												<div class="media-right">
													<div class="media-response"> Confirm?</div>
													<div class="btn-group">
														<button type="button" class="btn btn-default btn-sm btn-bordered light">
															<i class="fa fa-check text-success"></i>
														</button>
														<button type="button" class="btn btn-default btn-sm btn-bordered light">
															<i class="fa fa-cog"></i>
														</button>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="panel-footer text-center">
									<a href="#" class="btn btn-primary btn-sm btn-bordered"> View All </a>
								</div>
							</div>
						</div>
					</div>
				</li>
				<li class="dropdown dropdown-fuse">
					<div class="navbar-btn btn-group">
						<button data-toggle="dropdown" class="btn dropdown-toggle">
							<span class="fa fa-bell fs20 text-primary"></span>
						</button>
						<button data-toggle="dropdown" class="btn dropdown-toggle fs18 visible-xl">
							8
						</button>
						<div class="dropdown-menu keep-dropdown w375 animated animated-shorter fadeIn" role="menu">
							<div class="panel mbn">
								<div class="panel-menu">
									<span class="panel-icon"><i class="fa fa-tasks"></i></span>
									<span class="panel-title fw600"> Activity reports</span>
									<button class="btn btn-default light btn-xs btn-bordered pull-right" type="button"><i class="fa fa-refresh"></i>
									</button>
								</div>
								<div class="panel-body panel-scroller scroller-navbar scroller-overlay scroller-pn pn">
									<ol class="timeline-list">
										<li class="timeline-item">
											<div class="timeline-icon bg-dark light">
												<span class="fa fa-envelope"></span>
											</div>
											<div class="timeline-desc">
												<b>John Doe</b> Sent you a message.
												<a href="#">View now</a>
											</div>
											<div class="timeline-date">11:15am</div>
										</li>
										<li class="timeline-item">
											<div class="timeline-icon bg-success">
												<span class="fa fa-info"></span>
											</div>
											<div class="timeline-desc">
												<b>Admin</b> created invoice for:
												<a href="#">iPad Air</a>
											</div>
											<div class="timeline-date">6:26pm</div>
										</li>
										<li class="timeline-item">
											<div class="timeline-icon bg-success">
												<span class="fa fa-info"></span>
											</div>
											<div class="timeline-desc">
												<b>Admin</b> created invoice for:
												<a href="#">iPhone 5s</a>
											</div>
											<div class="timeline-date">11:45am</div>
										</li>
										<li class="timeline-item">
											<div class="timeline-icon bg-dark light">
												<span class="fa fa-envelope"></span>
											</div>
											<div class="timeline-desc">
												<b>Lara Johnes</b> Sent you a message.
												<a href="#">View now</a>
											</div>
											<div class="timeline-date">3:18pm</div>
										</li>
										<li class="timeline-item">
											<div class="timeline-icon bg-primary">
												<span class="fa fa-star"></span>
											</div>
											<div class="timeline-desc">
												<b>Richard Johnes</b> Added to wishlist:
												<a href="#">iPhone 5c</a>
											</div>
											<div class="timeline-date">8:15am</div>
										</li>
										<li class="timeline-item">
											<div class="timeline-icon bg-success">
												<span class="fa fa-info"></span>
											</div>
											<div class="timeline-desc">
												<b>Admin</b> created invoice for:
												<a href="#">Mac Pro</a>
											</div>
											<div class="timeline-date">9:29pm</div>
										</li>
										<li class="timeline-item">
											<div class="timeline-icon bg-primary">
												<span class="fa fa-star"></span>
											</div>
											<div class="timeline-desc">
												<b>Douglas Adams</b> Added to wishlist:
												<a href="#">iPad 4</a>
											</div>
											<div class="timeline-date">3:05am</div>
										</li>
									</ol>

								</div>
								<div class="panel-footer text-center">
									<a href="#" class="btn btn-primary btn-sm btn-bordered"> View All </a>
								</div>
							</div>
						</div>
					</div>
				</li>
				<li class="dropdown dropdown-fuse">
					<div class="navbar-btn btn-group">
						<button data-toggle="dropdown" class="btn btn-md dropdown-toggle">
							EN
						</button>
						<ul class="dropdown-menu pv5 animated animated-short fadeIn" role="menu">
							<li>
								<a href="javascript:void(0);"> Spanish </a>
							</li>
							<li>
								<a href="javascript:void(0);"> Italian </a>
							</li>
						</ul>
					</div>
				</li>
				<li class="dropdown dropdown-fuse">
					<a href="#" class="dropdown-toggle fw600" data-toggle="dropdown">
						<span class="hidden-xs"><name>Doug Adams</name> </span>
						<span class="fa fa-caret-down hidden-xs mr15"></span>
						<img src="assets/img/avatars/profile_avatar.jpg" alt="avatar" class="mw55">
					</a>
					<ul class="dropdown-menu list-group keep-dropdown w250" role="menu">
						<li class="dropdown-header clearfix">
							<div class="pull-left ml10">
								<select id="user-status">
									<optgroup label="Current Status:">
										<option value="1-1">Away</option>
										<option value="1-2">Busy</option>
										<option value="1-3" selected="selected">Online</option>
										<option value="1-4">Offline</option>
									</optgroup>
								</select>
							</div>

							<div class="pull-right mr10">
								<select id="user-role">
									<optgroup label="Logged in As:">
										<option value="1-1" selected="selected">Admin</option>
										<option value="1-2">Editor</option>
										<option value="1-3">User</option>
									</optgroup>
								</select>
							</div>
						</li>
						<li class="list-group-item">
							<a href="#" class="animated animated-short fadeInUp">
								<span class="fa fa-envelope-o"></span> Messages
								<span class="label label-warning">54</span>
							</a>
						</li>
						<li class="list-group-item">
							<a href="#" class="animated animated-short fadeInUp">
								<span class="fa fa-users"></span> Friends
								<span class="label label-warning">6</span>
							</a>
						</li>
						<li class="list-group-item">
							<a href="#" class="animated animated-short fadeInUp">
								<span class="fa fa-bell"></span> Notifications </a>
						</li>
						<li class="list-group-item">
							<a href="#" class="animated animated-short fadeInUp">
								<span class="fa fa-cogs"></span> Settings </a>
						</li>
						<li class="dropdown-footer text-center">
							<a href="#" class="btn btn-primary btn-sm btn-bordered">
								<span class="fa fa-power-off pr5"></span> Logout </a>
						</li>
					</ul>
				</li>
			</ul>
		</header>
		<!-- -------------- /Header  -------------- -->

		<!-- -------------- Sidebar  -------------- -->
		<aside id="sidebar_left" class="nano nano-light affix">

			<!-- -------------- Sidebar Left Wrapper  -------------- -->
			<div class="sidebar-left-content nano-content">

				<!-- -------------- Sidebar Header -------------- -->
				<header class="sidebar-header">

					<!-- -------------- Sidebar - Author -------------- -->
					<div class="sidebar-widget author-widget">
						<div class="media">
							<a class="media-left" href="#">
								<img src="assets/img/avatars/profile_avatar.jpg" class="img-responsive">
							</a>

							<div class="media-body">
								<div class="media-links">
									<a href="#" class="sidebar-menu-toggle">User Menu -</a> <a href="utility-login.html">Logout</a>
								</div>
								<div class="media-author">Douglas Adams</div>
							</div>
						</div>
					</div>

					<!-- -------------- Sidebar - Author Menu  -------------- -->
					<div class="sidebar-widget menu-widget">
						<div class="row text-center mbn">
							<div class="col-xs-2 pln prn">
								<a href="dashboard1.html" class="text-primary" data-toggle="tooltip" data-placement="top" title="Dashboard">
									<span class="fa fa-dashboard"></span>
								</a>
							</div>
							<div class="col-xs-4 col-sm-2 pln prn">
								<a href="charts-highcharts.html" class="text-info" data-toggle="tooltip" data-placement="top" title="Stats">
									<span class="fa fa-bar-chart-o"></span>
								</a>
							</div>
							<div class="col-xs-4 col-sm-2 pln prn">
								<a href="sales-stats-products.html" class="text-system" data-toggle="tooltip" data-placement="top" title="Orders">
									<span class="fa fa-info-circle"></span>
								</a>
							</div>
							<div class="col-xs-4 col-sm-2 pln prn">
								<a href="sales-stats-purchases.html" class="text-warning" data-toggle="tooltip" data-placement="top" title="Invoices">
									<span class="fa fa-file"></span>
								</a>
							</div>
							<div class="col-xs-4 col-sm-2 pln prn">
								<a href="basic-profile.html" class="text-alert" data-toggle="tooltip" data-placement="top" title="Users">
									<span class="fa fa-users"></span>
								</a>
							</div>
							<div class="col-xs-4 col-sm-2 pln prn">
								<a href="management-tools-dock.html" class="text-danger" data-toggle="tooltip" data-placement="top" title="Settings">
									<span class="fa fa-cogs"></span>
								</a>
							</div>
						</div>
					</div>

				</header>
				<!-- -------------- /Sidebar Header -------------- -->

				<!-- -------------- Sidebar Menu  -------------- -->
				<ul class="nav sidebar-menu">
					<li class="sidebar-label pt30">Menu</li>

					<li class="active">
						<a class="accordion-toggle menu-open" href="#">
							<span class="fa fa-dashboard"></span>
							<span class="sidebar-title">Dashboard</span>
							<span class="caret"></span>
						</a>
						<ul class="nav sub-nav">
							<li class="active">
								<a href="dashboard1.html">
									<span class="fa fa-file-text-o"></span> Layout 1 </a>
							</li>
							<li>
								<a href="dashboard2.html">
									<span class="fa fa-file-text-o"></span> Layout 2 </a>
							</li>
						</ul>
					</li>
					<li class="sidebar-label pt25">Tools</li>
					<li>
						<a class="accordion-toggle" href="#">
							<span class="fa fa-share-square-o"></span>
							<span class="sidebar-title">Sales stats</span>
							<span class="caret"></span>
						</a>
						<ul class="nav sub-nav">
							<li>
								<a href="dashboard2.html">
									<span class="glyphicon glyphicon-tags"></span> Overview </a>
							</li>
							<li>
								<a href="sales-stats-products.html">
									<span class="glyphicon glyphicon-tags"></span> Products </a>
							</li>
							<li>
								<a href="sales-stats-purchases.html">
									<span class="fa fa-money"></span> Purchases </a>
							</li>
							<li>
								<a href="sales-stats-clients.html">
									<span class="fa fa-users"></span> Clients </a>
							</li>
							<li>
								<a href="sales-stats-general-settings.html">
									<span class="fa fa-gears"></span> General Settings </a>
							</li>
						</ul>
					</li>


					<li>
						<a class="accordion-toggle" href="#">
							<span class="fa fa-desktop"></span>
							<span class="sidebar-title">Layout Templates</span>
							<span class="caret"></span>
						</a>
						<ul class="nav sub-nav">
							<li>
								<a class="accordion-toggle" href="#">
									<span class="fa fa fa-arrows-h"></span> Sidebars
									<span class="caret"></span>
								</a>
								<ul class="nav sub-nav">
									<li>
										<a href="sidebar-left-static.html">
                                                Left Static </a>
									</li>
									<li>
										<a href="sidebar-left-fixed.html">
                                                Left Fixed </a>
									</li>
									<li>
										<a href="sidebar-left-minified.html">
                                                Left Minified </a>
									</li>
									<li>
										<a href="sidebar-right-fixed.html">
                                                Right Fixed </a>
									</li>
									<li>
										<a href="sidebar-right-menu.html">
                                                Right Static </a>
									</li>
								</ul>
							</li>
							<li>
								<a class="accordion-toggle" href="#">
									<span class="fa fa-arrows-v"></span> Navigation
									<span class="caret"></span>
								</a>
								<ul class="nav sub-nav">
									<li>
										<a href="navigation-static.html">
                                                Static </a>
									</li>
									<li>
										<a href="navigation-fixed.html">
                                                Fixed </a>
									</li>
								</ul>
							</li>
							<li>
								<a class="accordion-toggle" href="#">
									<span class="fa fa-hand-o-up"></span> Top Panel
									<span class="caret"></span>
								</a>
								<ul class="nav sub-nav">
									<li>
										<a href="top-panel.html">
                                                Default </a>
									</li>
									<li>
										<a href="top-panel-menu.html">
                                                With Menu </a>
									</li>
								</ul>
							</li>
							<li>
								<a class="accordion-toggle" href="#">
									<span class="fa fa-arrows-v"></span> Content
									<span class="caret"></span>
								</a>
								<ul class="nav sub-nav">
									<li>
										<a href="content-blank.html">
                                                Blank </a>
									</li>
									<li>
										<a href="content-fixed.html">
                                                Fixed </a>
									</li>
									<li>
										<a href="content-hero.html">
                                                Hero Content </a>
									</li>
								</ul>
							</li>
							<li>
								<a class="accordion-toggle" href="#">
									<span class="fa fa-pause"></span> Content Chutes
									<span class="caret"></span>
								</a>
								<ul class="nav sub-nav">
									<li>
										<a href="chute-left.html">
                                                Left Static </a>
									</li>
									<li>
										<a href="chute-left-fixed.html">
                                                Left Fixed </a>
									</li>
									<li>
										<a href="chute-right.html">
                                                Right Static </a>
									</li>
									<li>
										<a href="chute-right-fixed.html">
                                                Right Fixed </a>
									</li>
									<li>
										<a href="chute-both.html">
                                                Left &amp; Right Static </a>
									</li>
									<li>
										<a href="chute-both-fixed.html">
                                                Left &amp; Right Fixed </a>
									</li>
								</ul>
							</li>
							<li>
								<a class="accordion-toggle" href="#">
									<span class="fa fa-plus-square-o"></span> Boxed Frontpage
									<span class="caret"></span>
								</a>
								<ul class="nav sub-nav">
									<li>
										<a href="boxed-default.html">
                                                Default </a>
									</li>
									<li>
										<a href="horizontal-navigation-boxed.html">
                                                Optional Navigation </a>
									</li>
								</ul>
							</li>
							<li>
								<a class="accordion-toggle" href="#">
									<span class="fa fa-arrow-circle-o-up"></span> Horizontal Navigation
									<span class="caret"></span>
								</a>
								<ul class="nav sub-nav">
									<li>
										<a href="horizontal-navigation-small-menu.html">
                                                Small Menu</a>
									</li>
									<li>
										<a href="horizontal-navigation-medium-menu.html">
                                                Medium Menu</a>
									</li>
									<li>
										<a href="horizontal-navigation-large-menu.html">
                                                Large Menu</a>
									</li>
									<li>
										<a href="horizontal-navigation-top-panel.html">
                                                With Top panel</a>
									</li>
									<li>
										<a href="horizontal-navigation-collapsing-top-panel.html">
                                                Collapsing Top panel</a>
									</li>
									<li>
										<a href="horizontal-navigation-boxed.html">
                                                Boxed Layout</a>
									</li>
								</ul>
							</li>
						</ul>
					</li>
					<li>
						<a class="accordion-toggle" href="#">
							<span class="fa fa-wrench"></span>
							<span class="sidebar-title">Management Tools</span>
							<span class="caret"></span>
						</a>
						<ul class="nav sub-nav">
							<li>
								<a href="management-tools-panels.html">
									<span class="glyphicon glyphicon-book"></span> Panels </a>
							</li>
							<li>
								<a href="management-tools-modals.html">
									<span class="glyphicon glyphicon-modal-window"></span> Modals </a>
							</li>
							<li>
								<a href="management-tools-dock.html">
									<span class="glyphicon glyphicon-equalizer"></span> Dock </a>
							</li>
						</ul>
					</li>
					<li>
						<a class="accordion-toggle" href="#">
							<span class="fa fa-check-square-o"></span>
							<span class="sidebar-title">Forms</span>
							<span class="caret"></span>
						</a>
						<ul class="nav sub-nav">
							<li>
								<a href="forms-elements.html">
									<span class="glyphicon glyphicon-shopping-cart"></span> Elements </a>
							</li>
							<li>
								<a href="forms-widgets.html">
									<span class="glyphicon glyphicon-calendar"></span> Widgets </a>
							</li>
							<li>
								<a href="forms-layouts.html">
									<span class="fa fa-desktop"></span> Layouts </a>
							</li>
							<li>
								<a href="forms-wizard.html">
									<span class="fa fa-clipboard"></span> Wizard </a>
							</li>
							<li>
								<a href="forms-validation.html">
									<span class="glyphicon glyphicon-check"></span> Validation </a>
							</li>
						</ul>
					</li>

					<li class="sidebar-label pt30">Elements</li>
					<li>
						<a class="accordion-toggle" href="#">
							<span class="fa fa-cogs"></span>
							<span class="sidebar-title">Widgets</span>
							<span class="caret"></span>
						</a>
						<ul class="nav sub-nav">
							<li>
								<a href="widgets-panels.html">
									<span class="fa fa-desktop"></span> Panels </a>
							</li>
							<li>
								<a href="widgets-scrollers-tiles.html">
									<span class="fa fa-columns"></span> Scrollers &amp; Tiles</a>
							</li>
							<li>
								<a href="widgets-tools.html">
									<span class="fa fa-dot-circle-o"></span> Tools </a>
							</li>
						</ul>
					</li>
					<li>
						<a href="email-layouts.html">
							<span class="fa fa-envelope-o"></span>
							<span class="sidebar-title">Email Layouts</span>
						</a>
					</li>
					<li>
						<a class="accordion-toggle" href="#">
							<span class="fa fa-star-half-full "></span>
							<span class="sidebar-title">User Interface</span>
							<span class="caret"></span>
						</a>
						<ul class="nav sub-nav">
							<li>
								<a href="user-interface-alerts.html">
									<span class="fa fa-warning"></span> Alerts </a>
							</li>
							<li>
								<a href="user-interface-buttons.html">
									<span class="fa fa-plus-square-o"></span> Buttons </a>
							</li>
							<li>
								<a href="user-interface-typography.html">
									<span class="fa fa-text-width"></span> Typography </a>
							</li>
							<li>
								<a href="user-interface-panels.html">
									<span class="fa fa-archive"></span> Panels </a>
							</li>
							<li>
								<a href="user-interface-progress-bars.html">
									<span class="fa fa-bars"></span> Progress Bars </a>
							</li>
							<li>
								<a href="user-interface-tabs.html">
									<span class="fa fa-toggle-off"></span> Tabs </a>
							</li>
							<li>
								<a href="user-interface-icons.html">
									<span class="fa fa-hand-o-right"></span> Icons </a>
							</li>
							<li>
								<a href="user-interface-grid.html">
									<span class="fa fa-th-large"></span> Grid </a>
							</li>
							<li>
								<a href="user-interface-progress-loader.html">
									<span class="fa fa-th-large"></span> Page Progress Loader </a>
							</li>
						</ul>
					</li>
					<li>
						<a class="accordion-toggle" href="#">
							<span class="fa fa-tasks"></span>
							<span class="sidebar-title">User Forms</span>
							<span class="caret"></span>
						</a>
						<ul class="nav sub-nav">
							<li>
								<a href="user-forms-standart-inputs.html">
									<span class="fa fa-magic"></span> Standart Inputs </a>
							</li>
							<li>
								<a href="user-forms-additional-inputs.html">
									<span class="fa fa-bell-o"></span> Additional Inputs
								</a>
							</li>
							<li>
								<a href="user-forms-editors.html">
									<span class="fa fa-clipboard"></span> Editors </a>
							</li>
							<li>
								<a href="user-forms-treeview.html">
									<span class="fa fa-tree"></span> Treeview </a>
							</li>
							<li>
								<a href="user-forms-nestable.html">
									<span class="fa fa-tasks"></span> Nestable </a>
							</li>
							<li>
								<a href="user-forms-image-tools.html">
									<span class="fa fa-cloud-upload"></span> Image Tools
								</a>
							</li>
							<li>
								<a href="user-forms-file-uploaders.html">
									<span class="fa fa-cloud-upload"></span> File Uploaders </a>
							</li>
							<li>
								<a href="user-forms-notifications.html">
									<span class="fa fa-bell-o"></span> Notifications </a>
							</li>
							<li>
								<a href="user-forms-content-sliders.html">
									<span class="fa fa-exchange"></span> Content Sliders </a>
							</li>
						</ul>
					</li>
					<li>
						<a class="accordion-toggle" href="#">
							<span class="fa fa-crop"></span>
							<span class="sidebar-title">Plugins</span>
							<span class="caret"></span>
						</a>
						<ul class="nav sub-nav">
							<li>
								<a class="accordion-toggle" href="#">
									<span class="glyphicon glyphicon-globe"></span> Maps
									<span class="caret"></span>
								</a>
								<ul class="nav sub-nav">
									<li>
										<a href="maps-basic.html">Basic</a>
									</li>
									<li>
										<a href="maps-vector.html">Vector</a>
									</li>
									<li>
										<a href="maps-full.html">Full</a>
									</li>
								</ul>
							</li>
							<li>
								<a class="accordion-toggle" href="#">
									<span class="fa fa-area-chart"></span> Charts
									<span class="caret"></span>
								</a>
								<ul class="nav sub-nav">
									<li>
										<a href="charts-highcharts.html">Highcharts</a>
									</li>
									<li>
										<a href="charts-d3.html">D3 Charts</a>
									</li>
									<li>
										<a href="charts-flot.html">Flot Charts</a>
									</li>
								</ul>
							</li>
							<li>
								<a class="accordion-toggle" href="#">
									<span class="fa fa-table"></span> Tables
									<span class="caret"></span>
								</a>
								<ul class="nav sub-nav">
									<li>
										<a href="tables-basic.html"> Basic </a>
									</li>
									<li>
										<a href="tables-datatables.html"> Data </a>
									</li>
									<li>
										<a href="tables-sortable.html"> Sortable </a>
									</li>
									<li>
										<a href="tables-pricing.html"> Pricing </a>
									</li>
								</ul>
							</li>
						</ul>
					</li>
					<li>
						<a class="accordion-toggle" href="#">
							<span class="fa fa-file-text-o"></span>
							<span class="sidebar-title">Pages</span>
							<span class="caret"></span>
						</a>
						<ul class="nav sub-nav">
							<li>
								<a class="accordion-toggle" href="#">
									<span class="fa fa-gears"></span> Utility
									<span class="caret"></span>
								</a>
								<ul class="nav sub-nav">
									<li>
										<a href="utility-confirmation.html" target="_blank"> Confirmation </a>
									</li>
									<li>
										<a href="utility-login.html" target="_blank"> Login </a>
									</li>
									<li>
										<a href="utility-register.html" target="_blank"> Register </a>
									</li>
									<li>
										<a href="utility-forgot-password.html" target="_blank"> Forgot Password </a>
									</li>
									<li>
										<a href="utility-coming-soon.html" target="_blank"> Coming Soon
                                            </a>
									</li>
									<li>
										<a href="utility-404-error.html"> 404 Error </a>
									</li>
								</ul>
							</li>
							<li>
								<a class="accordion-toggle" href="#">
									<span class="fa fa-desktop"></span> Basic
									<span class="caret"></span>
								</a>
								<ul class="nav sub-nav">
									<li>
										<a href="basic-search-results.html">Search Results </a>
									</li>
									<li>
										<a href="basic-profile.html"> Profile </a>
									</li>
									<li>
										<a href="basic-timeline.html"> Timeline </a>
									</li>
									<li>
										<a href="basic-faq-page.html"> FAQ Page </a>
									</li>
									<li>
										<a href="basic-calendar.html"> Calendar </a>
									</li>
									<li>
										<a href="basic-messages.html"> Messages </a>
									</li>
									<li>
										<a href="basic-gallery.html"> Gallery </a>
									</li>
									<li>
										<a href="basic-invoice.html"> Invoice </a>
									</li>
								</ul>
							</li>
						</ul>
					</li>


					<li>
						<a href="doc/index.html">
							<span class="fa fa-book"></span>
							<span class="sidebar-title">Documentation</span>
						</a>
					</li>

					<!-- -------------- Sidebar Progress Bars -------------- -->
					<li class="sidebar-label pt25 pb15">Stats</li>
					<li class="sidebar-stat">
						<a href="#" class="fs11">
							<span class="fa fa-calendar-o text-info"></span>
							<span class="sidebar-title text-muted">September earnings</span>
							<span class="pull-right mr20 text-muted">$1158</span>

							<div id="high-column4" style="height: 150px;"></div>
						</a>
					</li>
					<li class="sidebar-stat">
						<a href="#" class="fs11">
							<span class="fa fa-calendar text-info"></span>
							<span class="sidebar-title text-muted">August earnings</span>
							<span class="pull-right mr20 text-muted">$1001</span>

							<div id="high-column5" style="height: 150px;"></div>
						</a>
					</li>
				</ul>
				<!-- -------------- /Sidebar Menu  -------------- -->

				<!-- -------------- Sidebar Hide Button -------------- -->
				<div class="sidebar-toggler">
					<a href="#">
						<span class="fa fa-arrow-circle-o-left"></span>
					</a>
				</div>
				<!-- -------------- /Sidebar Hide Button -------------- -->

			</div>
			<!-- -------------- /Sidebar Left Wrapper  -------------- -->

		</aside>
		<!-- -------------- /Sidebar -------------- -->

		<!-- -------------- Main Wrapper -------------- -->
		<section id="content_wrapper">

			<!-- -------------- Topbar Menu Wrapper -------------- -->
			<div id="topbar-dropmenu-wrapper">
				<div class="topbar-menu row">
					<div class="col-xs-4 col-sm-2">
						<a href="#" class="service-box bg-danger">
							<span class="fa fa-music"></span>
							<span class="service-title">Audio</span>
						</a>
					</div>
					<div class="col-xs-4 col-sm-2">
						<a href="#" class="service-box bg-success">
							<span class="fa fa-picture-o"></span>
							<span class="service-title">Images</span>
						</a>
					</div>
					<div class="col-xs-4 col-sm-2">
						<a href="#" class="service-box bg-primary">
							<span class="fa fa-video-camera"></span>
							<span class="service-title">Videos</span>
						</a>
					</div>
					<div class="col-xs-4 col-sm-2">
						<a href="#" class="service-box bg-alert">
							<span class="fa fa-envelope"></span>
							<span class="service-title">Messages</span>
						</a>
					</div>
					<div class="col-xs-4 col-sm-2">
						<a href="#" class="service-box bg-system">
							<span class="fa fa-cog"></span>
							<span class="service-title">Settings</span>
						</a>
					</div>
					<div class="col-xs-4 col-sm-2">
						<a href="#" class="service-box bg-dark">
							<span class="fa fa-user"></span>
							<span class="service-title">Users</span>
						</a>
					</div>
				</div>
			</div>
			<!-- -------------- /Topbar Menu Wrapper -------------- -->

			<!-- -------------- Topbar -------------- -->
			<header id="topbar" class="alt">
				<div class="topbar-left">
					<ol class="breadcrumb">
						<li class="breadcrumb-icon">
							<a href="dashboard1.html">
								<span class="fa fa-home"></span>
							</a>
						</li>
						<li class="breadcrumb-active">
							<a href="dashboard1.html">Dashboard</a>
						</li>
						<li class="breadcrumb-link">
							<a href="index.html">Home</a>
						</li>
						<li class="breadcrumb-current-item">Dashboard</li>
					</ol>
				</div>
				<div class="topbar-right">
					<div class="ib topbar-dropdown">
						<label for="topbar-multiple" class="control-label">Reporting Period</label>
						<select id="topbar-multiple" class="hidden">
							<optgroup label="Filter By:">
								<option value="1-1">Last 30 Days</option>
								<option value="1-2" selected="selected">Last 60 Days</option>
								<option value="1-3">Last Year</option>
							</optgroup>
						</select>
					</div>
					<div class="ml15 ib va-m" id="sidebar_right_toggle">
						<div class="navbar-btn btn-group btn-group-number mv0">
							<button class="btn btn-sm btn-default btn-bordered prn pln">
								<i class="fa fa-bar-chart fs22 text-default"></i>
							</button>

						</div>
					</div>
				</div>
			</header>
			<!-- -------------- /Topbar -------------- -->

			<!-- -------------- Content -------------- -->
			<section id="content" class="table-layout animated fadeIn">

				<!-- -------------- Column Center -------------- -->
				<div class="chute chute-center">

					<!-- -------------- Quick Links -------------- -->
					<div class="row">
						<div class="col-sm-6 col-xl-3">
							<div class="panel panel-tile">
								<div class="panel-body">
									<div class="row pv10">
										<div class="col-xs-5 ph10"><img src="assets/img/pages/clipart0.png" class="img-responsive mauto" alt="" /></div>
										<div class="col-xs-7 pl5">
											<h6 class="text-muted">TICKETS ANSWERED</h6>

											<h2 class="fs50 mt5 mbn">385</h2>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-sm-6 col-xl-3">
							<div class="panel panel-tile">
								<div class="panel-body">
									<div class="row pv10">
										<div class="col-xs-5 ph10"><img src="assets/img/pages/clipart1.png" class="img-responsive mauto" alt="" /></div>
										<div class="col-xs-7 pl5">
											<h6 class="text-muted">PROJECTS LAUNCHED</h6>

											<h2 class="fs50 mt5 mbn">197</h2>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-sm-6 col-xl-3">
							<div class="panel panel-tile">
								<div class="panel-body">
									<div class="row pv10">
										<div class="col-xs-5 ph10"><img src="assets/img/pages/clipart2.png" class="img-responsive mauto" alt="" /></div>
										<div class="col-xs-7 pl5">
											<h6 class="text-muted">HAPPY CUSTOMERS</h6>

											<h2 class="fs50 mt5 mbn">6789</h2>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-sm-6 col-xl-3">
							<div class="panel panel-tile">
								<div class="panel-body">
									<div class="row pv10">
										<div class="col-xs-5 ph10"><img src="assets/img/pages/clipart3.png" class="img-responsive mauto" alt="" /></div>
										<div class="col-xs-7 pl5">
											<h6 class="text-muted">UNIQUE INNOVATIONS</h6>

											<h2 class="fs50 mt5 mbn">256</h2>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!-- -------------- AllCP Info -------------- -->
					<div class="allcp-panels fade-onload">

						<div class="row">

							<!-- -------------- AllCP Grid -------------- -->
							<div class="col-md-12 allcp-grid">

								<!-- -------------- Perfomance -------------- -->
								<div class="panel mbn" data-panel-title="false">
									<div class=" text-dark pl25 fw700 fs35">
										Perfomance
									</div>
									<div class="panel-body pn">
										<div class="row">
											<!-- -------------- Chart -------------- -->
											<div class="col-md-9 mb10">
												<div id="high-area" style="width: 100%; height: 350px; margin: 0 auto"></div>
											</div>

											<!-- -------------- Text -------------- -->
											<div class="col-md-3">
												<div class="mb20">
													<div class="text-dark fw700">January - March:</div>
													Nunc luctus dui quis ligula placerat feugiat.
												</div>

												<div class="mb20">
													<div class="text-dark fw700">April - June:</div>
													Curabitur convallis lacus urna, eu ultrices mauris luctus nec libero dui, porttitor sit amet.
												</div>

												<div class="mb20">
													<div class="text-dark fw700">Jule - September:</div>
													Nullam quis turpis a nisl pulvinar dignissim.
												</div>

												<div class="mb20">
													<div class="text-dark fw700">October - December</div>
													Nunc eget consectetur tellus.
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<!-- -------------- /AllCP Grid -------------- -->

							<div class="col-xs-12 allcp-grid hidden-xs">

								<!-- -------------- Widget Calendar -------------- -->
								<div class="panel mbn">
									<div class="text-dark pl25 fw700 fs35">
										Monthly Events: 2015
									</div>
									<div class="panel-body">
										<div id="calendar" class="events-calendar"></div>
									</div>
								</div>
							</div>
						</div>

						<div class="row">

							<div class="col-md-6">

								<!-- -------------- Poll -------------- -->
								<div class="panel" id="spy1">
									<div class="panel-heading">
										<span class="panel-title">Poll</span>
									</div>
									<div class="panel-body p20 br-a br6">

										<div id="donut-chart1" style="height: 350px; width: 100%;"></div>

									</div>
									<div class="panel-body">
										<div class="radio-custom mb5 radio-danger">
											<input type="radio" id="browser1" name="radioExample">
											<label for="browser1">Option 1: Google Chrome</label>
										</div>
										<div class="radio-custom mb5 radio-success">
											<input type="radio" id="browser2" name="radioExample">
											<label for="browser2">Option 2: Mozilla FireFox</label>
										</div>
										<div class="radio-custom mb5 radio-primary">
											<input type="radio" id="browser3" name="radioExample">
											<label for="browser3">Option 3: Microsoft IE</label>
										</div>
										<div class="mt20">
											<div class="btn btn-primary btn-lg mr20 mb5">VOTE</div>
											<div class="btn btn-default btn-lg mb5">Hide result</div>
										</div>
									</div>

								</div>

								<!-- -------------- Task-list -------------- -->
								<div class="panel panel-widget task-widget sort-disable" id="spy11">
									<div class="panel-heading cursor">
										<span class="panel-title"> Task-List Widget</span>
									</div>
									<div class="panel-body pn br-t">

										<h6 class="fs14 mv20"><i class="fa fa-bell text-alert mr15"></i><span
                                                    class="text-muted">PERSONAL TASKS</span></h6>
										<ul class="task-list task-current mb40">
											<li class="task-item success">
												<div class="task-handle">
													<div class="checkbox-custom">
														<input type="checkbox" id="task0">
														<label for="task0"></label>
													</div>
												</div>
												<div class="task-desc">Remove announcement</div>
												<div class="task-menu"></div>
											</li>
											<li class="task-item danger">
												<div class="task-handle">
													<div class="checkbox-custom">
														<input type="checkbox" id="task1">
														<label for="task1"></label>
													</div>
												</div>
												<div class="task-desc">Post an announcement</div>
												<div class="task-menu"></div>
											</li>
											<li class="task-item primary">
												<div class="task-handle">
													<div class="checkbox-custom">
														<input type="checkbox" id="task2">
														<label for="task2"></label>
													</div>
												</div>
												<div class="task-desc">Add new products</div>
												<div class="task-menu"></div>
											</li>
											<li class="task-item info">
												<div class="task-handle">
													<div class="checkbox-custom">
														<input type="checkbox" id="task3">
														<label for="task3"></label>
													</div>
												</div>
												<div class="task-desc">Ban a few users</div>
												<div class="task-menu"></div>
											</li>
											<li class="task-item warning">
												<div class="task-handle">
													<div class="checkbox-custom">
														<input type="checkbox" id="task4">
														<label for="task4"></label>
													</div>
												</div>
												<div class="task-desc">Clean comments</div>
												<div class="task-menu"></div>
											</li>
										</ul>

										<h6 class="fs14 mb20"><i class="fa fa-check-square-o text-success mr15"></i><span
                                                    class="text-muted">COMPLETE TASKS</span></h6>
										<ul class="task-list task-completed">
											<li class="task-item danger item-checked">
												<div class="task-handle">
													<div class="checkbox-custom">
														<input type="checkbox" checked="" id="task7">
														<label for="task7"></label>
													</div>
												</div>
												<div class="task-desc">Add article review</div>
												<div class="task-menu"></div>
											</li>
											<li class="task-item system item-checked">
												<div class="task-handle">
													<div class="checkbox-custom">
														<input type="checkbox" checked="" id="task8">
														<label for="task8"></label>
													</div>
												</div>
												<div class="task-desc">Add iPad review</div>
												<div class="task-menu"></div>
											</li>
											<li class="task-item item-alert item-checked">
												<div class="task-handle">
													<div class="checkbox-custom">
														<input type="checkbox" checked="" id="task9">
														<label for="task9"></label>
													</div>
												</div>
												<div class="task-desc">Ban THATuser user</div>
												<div class="task-menu"></div>
											</li>
											<li class="task-item info item-checked">
												<div class="task-handle">
													<div class="checkbox-custom">
														<input type="checkbox" checked="" id="task10">
														<label for="task10"></label>
													</div>
												</div>
												<div class="task-desc">Create new pages</div>
												<div class="task-menu"></div>
											</li>
											<li class="task-item info item-checked">
												<div class="task-handle">
													<div class="checkbox-custom">
														<input type="checkbox" checked="" id="task11">
														<label for="task10"></label>
													</div>
												</div>
												<div class="task-desc">Remove old pages</div>
												<div class="task-menu"></div>
											</li>
										</ul>
									</div>

								</div>

								<!-- -------------- Crawler-list -------------- -->
								<div class="panel" id="spy2">
									<div class="panel-heading">
										<span class="panel-title">Crawler List</span>
									</div>
									<div class="panel-body panel-scroller scroller-primary scroller-md scroller-pn pn">
										<table class="table mbn tc-icon-bold br-t">
											<thead>
												<tr class="hidden">
													<th>#</th>
													<th>First Name</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>
														<span class="favicons-sm google va-t mr10"></span>Google Bot
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm bing va-t mr10"></span>Bing Bot
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm yahoo va-t mr10"></span>Yahoo Bot
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm google va-t mr10"></span>Google Bot
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm bing va-t mr10"></span>Bing Bot
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm yahoo va-t mr10"></span>Yahoo Bot
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm google va-t mr10"></span>Google Bot
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm bing va-t mr10"></span>Bing Bot
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm yahoo va-t mr10"></span>Yahoo Bot
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm google va-t mr10"></span>Google Bot
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm bing va-t mr10"></span>Bing Bot
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm yahoo va-t mr10"></span>Yahoo Bot
													</td>
													<td>33%</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>

								<!-- -------------- Browser-list -------------- -->
								<div class="panel" id="spy3">
									<div class="panel-heading">
										<span class="panel-title">Browser List</span>
									</div>
									<div class="panel-body panel-scroller scroller-md scroller-primary scroller-pn pn">
										<table class="table mbn tc-icon-bold br-t">
											<thead>
												<tr class="hidden">
													<th>#</th>
													<th>First Name</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>
														<span class="favicons-sm chrome va-t mr10"></span>Chrome
													</td>
													<td>50%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm firefox va-t mr10"></span>Firefox
													</td>
													<td>25%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm ie va-t mr10"></span>Internet Explorer
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm safari va-t mr10"></span>Safari
													</td>
													<td>5%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm chrome va-t mr10"></span>Chrome
													</td>
													<td>50%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm firefox va-t mr10"></span>Firefox
													</td>
													<td>25%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm ie va-t mr10"></span>Internet Explorer
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm safari va-t mr10"></span>Safari
													</td>
													<td>5%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm chrome va-t mr10"></span>Chrome
													</td>
													<td>50%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm firefox va-t mr10"></span>Firefox
													</td>
													<td>25%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm ie va-t mr10"></span>Internet Explorer
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="favicons-sm safari va-t mr10"></span>Safari
													</td>
													<td>5%</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>

								<!-- -------------- Visitors Graph -------------- -->
								<div class="panel" id="spy4">
									<div class="panel-heading">
										<span class="panel-title">Visitors Graph Widget</span>
									</div>
									<div class="panel-body pn">
										<table class="table mbn tc-icon-bold br-t">
											<tbody>
												<tr>
													<td class="va-m fw600 text-muted">
														<span class="fa fa-circle text-success fs14 mr10"></span>Google
													</td>
													<td class="fs15 fw600 text-right">45%</td>
												</tr>
												<tr>
													<td class="va-m fw600 text-muted">
														<span class="fa fa-circle text-warning fs14 mr10"></span>Bing
													</td>
													<td class="fs15 fw600 text-right">33%</td>
												</tr>
												<tr>
													<td class="va-m fw600 text-muted">
														<span class="fa fa-circle text-primary fs14 mr10"></span>Twitter
													</td>
													<td class="fs15 fw600 text-right">18%</td>
												</tr>
											</tbody>
										</table>
									</div>

									<div class="panel-body">
										<div id="high-area2" style="height: 200px; width: 100%;"></div>
									</div>
								</div>

							</div>

							<div class="col-md-6">

								<!-- -------------- Server Status -------------- -->
								<div class="panel" id="spy5">
									<div class="panel-heading">
										<span class="panel-title">Server Status</span>
									</div>
									<div class="panel-body pn">
										<div class="progress progress-bar-xl br4">
											<div class="progress-bar progress-bar-system" role="progressbar" aria-valuenow="55" aria-valuemin="0" aria-valuemax="100" style="width: 55%;">
												<span class="pull-left ph10">Memory Used</span>
												<span class="pull-right ph10">55%</span>
											</div>
										</div>
										<div class="progress progress-bar-xl br4">
											<div class="progress-bar progress-bar-system" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
												<span class="pull-left ph10">Disk dev/sda1</span>
												<span class="pull-right ph10">60%</span>
											</div>
										</div>
										<div class="progress progress-bar-xl br4">
											<div class="progress-bar progress-bar-system" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%;">
												<span class="pull-left ph10">Disk dev/sda2</span>
												<span class="pull-right ph10">80%</span>
											</div>
										</div>
										<div class="progress progress-bar-xl br4">
											<div class="progress-bar progress-bar-system" role="progressbar" aria-valuenow="66" aria-valuemin="0" aria-valuemax="100" style="width: 66%;">
												<span class="pull-left ph10">Disk dev/sda3</span>
												<span class="pull-right ph10">66%</span>
											</div>
										</div>
										<div class="progress progress-bar-xl br4">
											<div class="progress-bar progress-bar-system" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 45%;">
												<span class="pull-left ph10">Disk dev/sda4</span>
												<span class="pull-right ph10">45%</span>
											</div>
										</div>
										<div class="progress progress-bar-xl br4">
											<div class="progress-bar progress-bar-system" role="progressbar" aria-valuenow="78" aria-valuemin="0" aria-valuemax="100" style="width: 78%;">
												<span class="pull-left ph10">Disk dev/sda5</span>
												<span class="pull-right ph10">78%</span>
											</div>
										</div>

										<p class="">Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis.</p>

									</div>
								</div>

								<!-- -------------- User Project List -------------- -->
								<div class="panel" id="spy6">
									<div class="panel-heading">
										<span class="panel-title">User Project List</span>
									</div>
									<div class="panel-body pn">
										<div class="bs-component">
											<div class="table-responsive">
												<table class="table table-striped">
													<thead class="bg-primary br6">
														<tr class="br6">
															<th class="br-t-l-r6 br-b-n lh25 pl30">SCHEDULE</th>
															<th class="br-b-n"></th>
															<th class="br-b-n"></th>
															<th class="br-t-r-r6 br-b-n"></th>
														</tr>
													</thead>
													<thead class="bg-dark">
														<tr>
															<th class="br-t-n pl30">Project</th>
															<th class="br-t-n hidden-xs">Start Date</th>
															<th class="br-t-n">Deadline</th>
															<th class="br-t-n">Status</th>
														</tr>
													</thead>
													<tbody>
														<tr>
															<td class="pl30">#4551</td>
															<td class="hidden-xs">Oct 10, 2014</td>
															<td>Oct 10, 2015</td>
															<td><span class="label label-success ml5">Done</span></td>
														</tr>
														<tr>
															<td class="pl30">#4532</td>
															<td class="hidden-xs">Oct 10, 2013</td>
															<td>Oct 10, 2014</td>
															<td><span class="label label-danger ml5">Failed</span></td>
														</tr>
														<tr>
															<td class="pl30">#4853</td>
															<td class="hidden-xs">Oct 10, 2015</td>
															<td>Oct 10, 2016</td>
															<td><span class="label label-primary ml5">In Progress</span></td>
														</tr>
														<tr>
															<td class="pl30">#5564</td>
															<td class="hidden-xs">Oct 10, 2014</td>
															<td>Oct 10, 2015</td>
															<td><span class="label label-success ml5">Done</span></td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
									</div>
								</div>

								<!-- -------------- Traphic Sources -------------- -->
								<div class="panel" id="spy7">
									<div class="panel-heading">
										<span class="panel-title">Traphic Sources</span>
									</div>
									<div class="panel-body">
										<div class="row">
											<div class="col-sm-4 text-center p5">
												<div class="info-circle  va-m" id="c1" value="55" data-circle-color="primary"></div>
												<div class="text-dark fw600">Google</div>
											</div>
											<div class="col-sm-4 text-center p5">
												<div class="info-circle" id="c2" value="15" data-circle-color="primary"></div>
												<div class="text-dark fw600">Bing</div>
											</div>
											<div class="col-sm-4 text-center p5">
												<div class="info-circle" id="c3" value="30" data-circle-color="primary"></div>
												<div class="text-dark fw600">Twitter</div>
											</div>
										</div>
									</div>
								</div>

								<!-- -------------- Country List -------------- -->
								<div class="panel" id="spy8">
									<div class="panel-heading">
										<span class="panel-title">Country List</span>
									</div>
									<div class="panel-body panel-scroller scroller-md scroller-pn pn">
										<table class="table mbn tc-icon-bold br-t">
											<thead>
												<tr class="hidden">
													<th>#</th>
													<th>First Name</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>
														<span class="flag-sm flag-mx mr5 va-b"></span>Mexico
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="flag-sm flag-gb mr5 va-b"></span> Great Britain
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="flag-sm flag-ca mr5 va-b"></span>Canada
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="flag-sm flag-us mr5 va-b"></span>United States
													</td>
													<td>31%</td>
												</tr>
												<tr>
													<td>
														<span class="flag-sm flag-cn mr5 va-b"></span> China
													</td>
													<td>22%</td>
												</tr>
												<tr>
													<td>
														<span class="flag-sm flag-mx mr5 va-b"></span>Mexico
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="flag-sm flag-gb mr5 va-b"></span> Great Britain
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="flag-sm flag-ca mr5 va-b"></span>Canada
													</td>
													<td>33%</td>
												</tr>
												<tr>
													<td>
														<span class="flag-sm flag-us mr5 va-b"></span>United States
													</td>
													<td>31%</td>
												</tr>
												<tr>
													<td>
														<span class="flag-sm flag-cn mr5 va-b"></span> China
													</td>
													<td>22%</td>
												</tr>
												<tr>
													<td>
														<span class="flag-sm flag-us mr5 va-b"></span>United States
													</td>
													<td>31%</td>
												</tr>
												<tr>
													<td>
														<span class="flag-sm flag-cn mr5 va-b"></span> China
													</td>
													<td>22%</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>

								<!-- -------------- Traphic Sources -------------- -->
								<div class="panel" id="spy9">
									<div class="panel-heading">
										<span class="panel-title">Traphic Sources</span>
									</div>
									<div class="panel-body pn">
										<div class="row table-layout table-clear-sm">
											<div class="col-md-6 va-m pn pr20 pt10">
												<div class="progress progress-bar-xl mt50 mb35">
													<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="55" aria-valuemin="0" aria-valuemax="100" style="width: 55%;">
														<span>Google</span>
													</div>
												</div>
												<div class="progress progress-bar-xl mb35">
													<div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="15" aria-valuemin="0" aria-valuemax="100" style="width: 15%;">
														<span>Bing</span>
													</div>
												</div>
												<div class="progress progress-bar-xl">
													<div class="progress-bar progress-bar-alert" role="progressbar" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100" style="width: 30%;">
														<span>Twitter</span>
													</div>
												</div>


											</div>
											<div class="col-md-6 pn">
												<div class="allcp-form">
													<!-- -------------- Block Widget -------------- -->
													<div class="smart-widget sm-right smr-50">
														<label class="field">
															<input type="text" name="sub" id="sub" class="gui-input br-n br-b" placeholder="Add Data Source">
														</label>
														<button type="submit" class="button br-n br-b br-l">
															<i class="fa fa-plus"></i>
														</button>
													</div>
												</div>
												<table class="table mbn tc-icon-bold">
													<tbody>
														<tr>
															<td>
																<span class="fa fa-circle text-warning fs14 mr10"></span>Google
															</td>
															<td>55%</td>
														</tr>
														<tr>
															<td>
																<span class="fa fa-circle text-info fs14 mr10"></span>Bing
															</td>
															<td>15%</td>
														</tr>
														<tr>
															<td>
																<span class="fa fa-circle text-alert fs14 mr10"></span>Twitter
															</td>
															<td>30%</td>
														</tr>
													</tbody>
												</table>
											</div>
										</div>
									</div>
								</div>

								<!-- -------------- Visitor Geography -------------- -->
								<div class="panel" id="spy10">
									<div class="panel-heading">
										<span class="panel-title">Visitor Geography</span>
									</div>
									<div class="panel-body">
										<div id="WidgetMap" class="jvector-colors hide-jzoom" style="width: 100%; height: 220px;"></div>
									</div>
									<div class="panel-menu allcp-form pn br-t">
										<!-- -------------- Block Widget -------------- -->
										<div class="smart-widget sm-right smr-50">
											<label class="field">
												<input type="text" name="sub1" id="sub1" class="gui-input br-n" placeholder="United States of America" disabled>
											</label>
											<button type="submit" class="button br-n br-l">
												<i class="fa fa-caret-down"></i>
											</button>
										</div>
									</div>
									<div class="panel-body pn">
										<table class="table mbn tc-icon-bold br-t">
											<tbody>
												<tr>
													<td class="va-m fw600 text-muted">
														<span class="fa fa-circle text-success fs14 mr10"></span>California
													</td>
													<td class="fs15 fw600 text-right">45%</td>
												</tr>
												<tr>
													<td class="va-m fw600 text-muted">
														<span class="fa fa-circle text-warning fs14 mr10"></span>Texas
													</td>
													<td class="fs15 fw600 text-right">33%</td>
												</tr>
												<tr>
													<td class="va-m fw600 text-muted">
														<span class="fa fa-circle text-primary fs14 mr10"></span>Florida
													</td>
													<td class="fs15 fw600 text-right">18%</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>

							</div>
							<!-- -------------- /.col-md-6 -------------- -->


						</div>


					</div>


				</div>
				<!-- -------------- /Column Center -------------- -->

				<!-- -------------- Column Right -------------- -->
				<aside class="chute chute-right chute270 pn hidden" data-chute-height="match">

					<!-- -------------- Activity Timeline -------------- -->
					<ol class="timeline-list pl5 mt5">
						<li class="timeline-item">
							<div class="timeline-icon bg-dark light">
								<span class="fa fa-tags"></span>
							</div>
							<div class="timeline-desc">
								<b>Genry</b> Added a new item to his store:
								<a href="#">Ipod</a>
							</div>
							<div class="timeline-date">1:25am</div>
						</li>
						<li class="timeline-item">
							<div class="timeline-icon bg-dark light">
								<span class="fa fa-tags"></span>
							</div>
							<div class="timeline-desc">
								<b>Lion</b> Added a new item to his store:
								<a href="#">Notebook</a>
							</div>
							<div class="timeline-date">3:05am</div>
						</li>
						<li class="timeline-item">
							<div class="timeline-icon bg-success">
								<span class="fa fa-usd"></span>
							</div>
							<div class="timeline-desc">
								<b>Admin</b> created a new invoice for:
								<a href="#">Software</a>
							</div>
							<div class="timeline-date">4:15am</div>
						</li>
						<li class="timeline-item">
							<div class="timeline-icon bg-warning">
								<span class="fa fa-pencil"></span>
							</div>
							<div class="timeline-desc">
								<b>Laura</b> edited her work experience
							</div>
							<div class="timeline-date">5:25am</div>
						</li>
						<li class="timeline-item">
							<div class="timeline-icon bg-success">
								<span class="fa fa-usd"></span>
							</div>
							<div class="timeline-desc">
								<b>Admin</b> created a new invoice for:
								<a href="#">Apple Inc.</a>
							</div>
							<div class="timeline-date">7:45am</div>
						</li>
						<li class="timeline-item">
							<div class="timeline-icon bg-dark light">
								<span class="fa fa-tags"></span>
							</div>
							<div class="timeline-desc">
								<b>Genry</b> Added a new item to his store:
								<a href="#">Ipod</a>
							</div>
							<div class="timeline-date">8:25am</div>
						</li>
						<li class="timeline-item">
							<div class="timeline-icon bg-dark light">
								<span class="fa fa-tags"></span>
							</div>
							<div class="timeline-desc">
								<b>Lion</b> Added a new item to his store:
								<a href="#">Watch</a>
							</div>
							<div class="timeline-date">9:35am</div>
						</li>
						<li class="timeline-item">
							<div class="timeline-icon bg-system">
								<span class="fa fa-fire"></span>
							</div>
							<div class="timeline-desc">
								<b>Admin</b> created a new invoice for:
								<a href="#">Software</a>
							</div>
							<div class="timeline-date">4:15am</div>
						</li>
						<li class="timeline-item">
							<div class="timeline-icon bg-warning">
								<span class="fa fa-pencil"></span>
							</div>
							<div class="timeline-desc">
								<b>Laura</b> edited her work experience
							</div>
							<div class="timeline-date">5:25am</div>
						</li>
						<li class="timeline-item">
							<div class="timeline-icon bg-success">
								<span class="fa fa-usd"></span>
							</div>
							<div class="timeline-desc">
								<b>Admin</b> created a new invoice for:
								<a href="#">Software</a>
							</div>
							<div class="timeline-date">4:15am</div>
						</li>
						<li class="timeline-item">
							<div class="timeline-icon bg-warning">
								<span class="fa fa-pencil"></span>
							</div>
							<div class="timeline-desc">
								<b>Laura</b> edited her work experience
							</div>
							<div class="timeline-date">5:25am</div>
						</li>
						<li class="timeline-item">
							<div class="timeline-icon bg-success">
								<span class="fa fa-usd"></span>
							</div>
							<div class="timeline-desc">
								<b>Admin</b> created a new invoice for:
								<a href="#">Apple Inc.</a>
							</div>
							<div class="timeline-date">7:45am</div>
						</li>
						<li class="timeline-item">
							<div class="timeline-icon bg-dark light">
								<span class="fa fa-tags"></span>
							</div>
							<div class="timeline-desc">
								<b>Genry</b> Added a new item to his store:
								<a href="#">Ipod</a>
							</div>
							<div class="timeline-date">8:25am</div>
						</li>
						<li class="timeline-item">
							<div class="timeline-icon bg-dark light">
								<span class="fa fa-tags"></span>
							</div>
							<div class="timeline-desc">
								<b>Lion</b> Added a new item to his store:
								<a href="#">Watch</a>
							</div>
							<div class="timeline-date">9:35am</div>
						</li>
					</ol>

				</aside>
				<!-- -------------- /Column Right -------------- -->

			</section>
			<!-- -------------- /Content -------------- -->

			<!-- -------------- Page Footer -------------- -->
			<footer id="content-footer" class="affix">
				<div class="row">
					<div class="col-md-6">
						<span class="footer-legal">© 2015 All rights reserved. <a href="#">Therms of use</a> and <a
                                    href="#">Privacy policy</a></span>
					</div>
					<div class="col-md-6 text-right">
						<span class="footer-meta"></span>
						<a href="#content" class="footer-return-top">
							<span class="fa fa-angle-up"></span>
						</a>
					</div>
				</div>
			</footer>
			<!-- -------------- /Page Footer -------------- -->

		</section>
		<!-- -------------- /Main Wrapper -------------- -->

		<!-- -------------- Sidebar Right -------------- -->
		<aside id="sidebar_right" class="nano affix">

			<!-- -------------- Sidebar Right Content -------------- -->
			<div class="sidebar-right-wrapper nano-content">

				<div class="sidebar-block br-n p15">

					<h6 class="title-divider text-muted mb20"> Visitors Stats
                            <span class="pull-right"> 2015
                                <i class="fa fa-caret-down ml5"></i>
                            </span>
                        </h6>

					<div class="progress mh5">
						<div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="34" aria-valuemin="0" aria-valuemax="100" style="width: 34%">
							<span class="fs11">New visitors</span>
						</div>
					</div>
					<div class="progress mh5">
						<div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="66" aria-valuemin="0" aria-valuemax="100" style="width: 66%">
							<span class="fs11 text-left">Returnig visitors</span>
						</div>
					</div>
					<div class="progress mh5">
						<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 45%">
							<span class="fs11 text-left">Orders</span>
						</div>
					</div>

					<h6 class="title-divider text-muted mt30 mb10">New visitors</h6>

					<div class="row">
						<div class="col-xs-5">
							<h3 class="text-primary mn pl5">350</h3>
						</div>
						<div class="col-xs-7 text-right">
							<h3 class="text-warning mn">
                                    <i class="fa fa-caret-down"></i> 15.7% </h3>
						</div>
					</div>

					<h6 class="title-divider text-muted mt25 mb10">Returnig visitors</h6>

					<div class="row">
						<div class="col-xs-5">
							<h3 class="text-primary mn pl5">660</h3>
						</div>
						<div class="col-xs-7 text-right">
							<h3 class="text-success-dark mn">
                                    <i class="fa fa-caret-up"></i> 20.2% </h3>
						</div>
					</div>

					<h6 class="title-divider text-muted mt25 mb10">Orders</h6>

					<div class="row">
						<div class="col-xs-5">
							<h3 class="text-primary mn pl5">153</h3>
						</div>
						<div class="col-xs-7 text-right">
							<h3 class="text-success mn">
                                    <i class="fa fa-caret-up"></i> 5.3% </h3>
						</div>
					</div>

					<h6 class="title-divider text-muted mt40 mb20"> Site Statistics
                            <span class="pull-right text-primary fw600">Today</span>
                        </h6>
				</div>
			</div>
		</aside>
		<!-- -------------- /Sidebar Right -------------- -->

	</div>
	<!-- -------------- /Body Wrap  -------------- -->


	<!--Scripts  -->

	<script src="assets/js/libs/jquery-1.12.3.min.js" type="text/javascript"></script>
	<script src="assets/js/libs/angular.min.js" type="text/javascript"></script>
	<script src="assets/js/libs/angular-ui-router.min.js" type="text/javascript"></script>

	<script src="assets/js/libs/jquery-ui.min.js" type="text/javascript"></script>

	<script src="assets/js/libs/moment.min.js"></script>

	<script src="assets/js/libs/jquery.validate.min.js"></script>
	<script src="assets/js/libs/jquery.steps.min.js"></script>

	<script src="assets/js/libs/jquery.magnific-popup.js"></script>

	<script src="assets/js/libs/bootstrap-datetimepicker.min.js"></script>
	<!-- -------------- HighCharts Plugin -------------- -->

	<!-- -------------- Plugins -------------- -->


	<!-- -------------- Theme Scripts -------------- -->
	<script src="assets/js/libs/utility.js"></script>


	<!-- -------------- Angular Js  Scripts -------------- -->

	<script src="assets/js/app/moduleRegistration.js"></script>
	<script src="assets/js/app/services/authService.js"></script>
	<script src="assets/js/app/controllers/loginController.js"></script>

	<script src="assets/js/app/app.js"></script>


</body>

</html>
