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
        <link rel="stylesheet" type="text/css" href="assets/bower_components/angular-toastr/dist/angular-toastr.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/miestilo.css">

        <!-- ICONO-->
        <link rel="shortcut icon" href="assets/img/icon-pages2.png">

        <!--[if lt IE 9]>
             <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.js"></script>
             <script src="https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js"></script>
             <![endif]-->
    </head>

    <body class="dashboard-page" ng-app="icebergApp">
        <!-- -------------- Body Wrap  -------------- -->
        <div id="main">
            <div ui-view>

            </div>
        </div>

        <!-- -------------- /Body Wrap  -------------- -->

        <script>
            apiUrl = "${apiUrl}"
        </script>


        <!--Scripts  -->

        <script src="assets/js/libs/jquery-1.11.3.min.js" type="text/javascript"></script>
        <script src="assets/js/libs/jquery-ui.min.js" type="text/javascript"></script>

        <!--ANGULAR JS-->
        <script src="assets/bower_components/angular/angular.min.js" type="text/javascript"></script>
        <script src="assets/bower_components/angular-ui-router/release/angular-ui-router.min.js" type="text/javascript"></script>
        <script src="assets/bower_components/angular-animate/angular-animate.min.js" type="text/javascript"></script>
        <script src="assets/bower_components/angular-toastr/dist/angular-toastr.tpls.min.js" type="text/javascript"></script>
        <script src="assets/bower_components/lodash/dist/lodash.min.js" type="text/javascript"></script>

        <!--JQUERY JS-->


        <script src="assets/js/libs/moment.min.js"></script>
        <script src="assets/js/libs/jquery.validate.min.js"></script>
        <script src="assets/js/libs/jquery.steps.min.js"></script>
        <script src="assets/js/libs/jquery.magnific-popup.js"></script>
        <script src="assets/js/libs/bootstrap-datetimepicker.min.js"></script>
        <!-- -------------- -------------- -->

        <!-- -------------- HighCharts Plugin -------------- -->
        <script src="assets/js/libs/plugins/highcharts/highcharts.js"></script>
        <script src="assets/js/libs/plugins/c3charts/d3.min.js"></script>
        <script src="assets/js/libs/plugins/c3charts/c3.min.js"></script>

        <!-- -------------- Simple Circles Plugin -------------- -->
        <script src="assets/js/libs/plugins/circles/circles.js"></script>

        <!-- -------------- Maps JSs -------------- -->



        <!-- -------------- FullCalendar Plugin -------------- -->
        <script src="assets/js/libs/plugins/fullcalendar/lib/moment.min.js"></script>
        <script src="assets/js/libs/plugins/fullcalendar/fullcalendar.min.js"></script>

        <!-- -------------- Date/Month - Pickers -------------- -->
        <script src="assets/js/libs/plugins/form/jquery-ui-monthpicker.min.js"></script>
        <script src="assets/js/libs/plugins/form/jquery-ui-datepicker.min.js"></script>

        <!-- -------------- Magnific Popup Plugin -------------- -->
        <script src="assets/js/libs/plugins/magnific/jquery.magnific-popup.js"></script>


        <!-- -------------- Theme Scripts -------------- -->
        <script src="assets/js/libs/utility.js"></script>
        <script src="assets/js/libs/demo.js"></script>
        <script src="assets/js/libs/main.js"></script>



        <!-- -------------- Widget JS -------------- -->

        <script src="assets/js/libs/dashboard1.js"></script>
        <!-- -------------- /Scripts -------------- -->


        <!------------------JQ------------------->

        <script src="assets/js/jq/index.js"></script>
        <script src="assets/js/jq/zonas/jqzona.js"></script>


        <!------------------Fin JQ------------------->

        <!-- -------------- Angular Js  Scripts -------------- -->

        <script src="assets/js/app/moduleRegistration.js"></script>
        <script src="assets/js/app/services/authService.js"></script>
        <script src="assets/js/app/services/zonaService.js"></script>
        <script src="assets/js/app/services/beneficiarioService.js"></script>
        <script src="assets/js/app/services/perfilService.js"></script>
        <script src="assets/js/app/services/programaService.js"></script>
        <script src="assets/js/app/services/objetivoService.js"></script>
        <script src="assets/js/app/services/indicadorService.js"></script>
        <script src="assets/js/app/services/actividadService.js"></script>

        <script src="assets/js/app/controllers/loginController.js"></script>
        <script src="assets/js/app/controllers/zonaController.js"></script>
        <script src="assets/js/app/controllers/beneficiarioController.js"></script>
        <script src="assets/js/app/controllers/perfilController.js"></script>
        <script src="assets/js/app/controllers/programaController.js"></script>
        <script src="assets/js/app/controllers/objetivoController.js"></script>
        <script src="assets/js/app/controllers/actividadController.js"></script>
        <script src="assets/js/app/controllers/indicadorController.js"></script>
        <script src="assets/js/app/app.js"></script>




    </body>

</html>
