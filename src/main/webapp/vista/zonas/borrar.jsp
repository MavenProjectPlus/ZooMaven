<%-- 
    Document   : crear
    Created on : 23/11/2017, 02:35:43 PM
    Author     : mcifuentes
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <title>Zoologico Santa Cruz</title>
        <!-- Favicon-->
        <link rel="icon" href="../favicon.ico" type="image/x-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">

        <!-- Bootstrap Core Css -->
        <link href="../plugins/bootstrap/css/bootstrap.css" rel="stylesheet">

        <!-- Waves Effect Css -->
        <link href="../plugins/node-waves/waves.css" rel="stylesheet" />

        <!-- Animation Css -->
        <link href="../plugins/animate-css/animate.css" rel="stylesheet" />

        <!-- Preloader Css -->
        <link href="../plugins/material-design-preloader/md-preloader.css" rel="stylesheet" />

        <!-- Sweet Alert Css -->
        <link href="../plugins/sweetalert/sweetalert.css" rel="stylesheet" />

        <!-- Custom Css -->
        <link href="../css/style.css" rel="stylesheet">

        <link href="../plugins/bootstrap-select/css/bootstrap-select.css" rel="stylesheet" />

        <!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
        <link href="../css/themes/all-themes.css" rel="stylesheet" />
    </head>
    <body class="theme-red">
        <!-- Page Loader -->
        <div class="page-loader-wrapper">
            <div class="loader">
                <div class="md-preloader pl-size-md">
                    <svg viewbox="0 0 75 75">
                    <circle cx="37.5" cy="37.5" r="33.5" class="pl-red" stroke-width="4" />
                    </svg>
                </div>
                <p>Espere por favor......</p>
            </div>
        </div>
        <!-- #END# Page Loader -->
        <!-- Overlay For Sidebars -->
        <div class="overlay"></div>
        <!-- #END# Overlay For Sidebars -->
        <!-- Top Bar -->
        <nav class="navbar">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a href="javascript:void(0);" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false"></a>
                    <a href="javascript:void(0);" class="bars"></a>
                    <a class="navbar-brand" href="../index.jsp">Zoologico Santa Cruz</a>
                </div>
                <div class="collapse navbar-collapse" id="navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="pull-right"><a href="javascript:void(0);" class="js-right-sidebar" data-close="true"><i class="material-icons">more_vert</i></a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- #Top Bar -->
        <section>
            <!-- Left Sidebar -->
            <aside id="leftsidebar" class="sidebar">
                <!-- Menu -->
                <div class="menu">
                    <ul class="list">
                        <li class="header">Navegacion Principal</li>
                        <li>
                            <a href="../index.jsp">
                                <i class="material-icons">home</i>
                                <span>Inicio</span>
                            </a>
                        </li>
                        <li>
                            <a href="javascript:void(0);" class="menu-toggle">
                                <i class="material-icons">person</i>
                                <span>Cargos</span>
                            </a>
                            <ul class="ml-menu">
                                <li>
                                    <a href="../zona/crear.jsp">Crear</a>
                                </li>
                                <li>
                                    <a href="../zona/borrar.jsp">Borrar</a>
                                </li>
                                <li>
                                    <a href="../zona/actualizar.jsp">Actualizar</a>
                                </li>
                                <li>
                                    <a href="../zona/leer.jsp">Leer</a>
                                </li>

                            </ul>
                            <a href="javascript:void(0);" class="menu-toggle">
                                <i class="material-icons">map</i>
                                <span>Continentes</span>
                            </a>
                            <ul class="ml-menu">
                                <li>
                                    <a href="../continente/crear.jsp">Crear</a>
                                </li>
                                <li>
                                    <a href="../continente/borrar.jsp">Borrar</a>
                                </li>
                                <li>
                                    <a href="../continente/actualizar.jsp">Actualizar</a>
                                </li>
                                <li>
                                    <a href="../continente/leer.jsp">Leer</a>
                                </li>
                            </ul>
                            <a href="javascript:void(0);" class="menu-toggle">
                                <i class="material-icons">face</i>
                                <span>Empleados</span>
                            </a>
                            <ul class="ml-menu">
                                <li>
                                    <a href="../empleados/crear.jsp">Crear</a>
                                </li>
                                <li>
                                    <a href="../empleados/borrar.jsp">Borrar</a>
                                </li>
                                <li>
                                    <a href="../empleados/actualizar.jsp">Actualizar</a>
                                </li>
                                <li>
                                    <a href="../empleados/leer.jsp">Leer</a>
                                </li>    
                            </ul>

                            <a href="javascript:void(0);" class="menu-toggle">
                                <i class="material-icons">pets</i>
                                <span>Especies</span>
                            </a>
                            <ul class="ml-menu">
                                <li>
                                    <a href="../especies/crear.jsp">Crear</a>
                                </li>
                                <li>
                                    <a href="../especies/borrar.jsp">Borrar</a>
                                </li>
                                <li>
                                    <a href="../especies/actualizar.jsp">Actualizar</a>
                                </li>
                                <li>
                                    <a href="../especies/leer.jsp">Leer</a>
                                </li>    
                            </ul>
                            <a href="javascript:void(0);" class="menu-toggle">
                                <i class="material-icons">account_balance</i>
                                <span>Habitats</span>
                            </a>
                            <ul class="ml-menu">
                                <li>
                                    <a href="../habitats/crear.jsp">Crear</a>
                                </li>
                                <li>
                                    <a href="../habitats/borrar.jsp">Borrar</a>
                                </li>
                                <li>
                                    <a href="../habitats/actualizar.jsp">Actualizar</a>
                                </li>
                                <li>
                                    <a href="../habitats/leer.jsp">Leer</a>
                                </li>    
                            </ul>
                            <a href="javascript:void(0);" class="menu-toggle">
                                <i class="material-icons">assignment</i>
                                <span>Itinerarios</span>
                            </a>
                            <ul class="ml-menu">
                                <li>
                                    <a href="../itinerarios/crear.jsp">Crear</a>
                                </li>
                                <li>
                                    <a href="../itinerarios/borrar.jsp">Borrar</a>
                                </li>
                                <li>
                                    <a href="../itinerarios/actualizar.jsp">Actualizar</a>
                                </li>
                                <li>
                                    <a href="../itinerarios/leer.jsp">Leer</a>
                                </li>    
                            </ul>
                            <a href="javascript:void(0);" class="menu-toggle">
                                <i class="material-icons">local_florist</i>
                                <span>Vegetacion</span>
                            </a>
                            <ul class="ml-menu">
                                <li>
                                    <a href="../vegetacion/crear.jsp">Crear</a>
                                </li>
                                <li>
                                    <a href="../vegetacion/borrar.jsp">Borrar</a>
                                </li>
                                <li>
                                    <a href="../vegetacion/actualizar.jsp">Actualizar</a>
                                </li>
                                <li>
                                    <a href="../vegetacion/leer.jsp">Leer</a>
                                </li>    
                            </ul>
                            <a href="javascript:void(0);" class="menu-toggle">
                                <i class="material-icons">terrain   </i>
                                <span>Zonas</span>
                            </a>
                            <ul class="ml-menu">
                                <li>
                                    <a href="../zona/crear.jsp">Crear</a>
                                </li>
                                <li>
                                    <a href="../zona/borrar.jsp">Borrar</a>
                                </li>
                                <li>
                                    <a href="../zona/actualizar.jsp">Actualizar</a>
                                </li>
                                <li>
                                    <a href="../zona/leer.jsp">Leer</a>
                                </li>    
                            </ul>
                        </li>
                    </ul>
                </div>
                <!-- #Menu -->
                <!-- Footer -->
                <div class="legal">
                    <div class="copyright">
                        &copy; 2016 <a href="javascript:void(0);">AdminBSB - Material Design</a>.
                    </div>
                    <div class="version">
                        <b>Version: </b> 1.0.3
                    </div>
                </div>
                <!-- #Footer -->
            </aside>
            <!-- #END# Left Sidebar -->
            <!-- Right Sidebar -->
            <aside id="rightsidebar" class="right-sidebar">
                <ul class="nav nav-tabs tab-nav-right" role="tablist">
                    <li role="presentation" class="active"><a href="#skins" data-toggle="tab">SKINS</a></li>
                </ul>
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane fade in active in active" id="skins">
                        <ul class="demo-choose-skin">
                            <li data-theme="red" class="active">
                                <div class="red"></div>
                                <span>Red</span>
                            </li>
                            <li data-theme="pink">
                                <div class="pink"></div>
                                <span>Pink</span>
                            </li>
                            <li data-theme="purple">
                                <div class="purple"></div>
                                <span>Purple</span>
                            </li>
                            <li data-theme="deep-purple">
                                <div class="deep-purple"></div>
                                <span>Deep Purple</span>
                            </li>
                            <li data-theme="indigo">
                                <div class="indigo"></div>
                                <span>Indigo</span>
                            </li>
                            <li data-theme="blue">
                                <div class="blue"></div>
                                <span>Blue</span>
                            </li>
                            <li data-theme="light-blue">
                                <div class="light-blue"></div>
                                <span>Light Blue</span>
                            </li>
                            <li data-theme="cyan">
                                <div class="cyan"></div>
                                <span>Cyan</span>
                            </li>
                            <li data-theme="teal">
                                <div class="teal"></div>
                                <span>Teal</span>
                            </li>
                            <li data-theme="green">
                                <div class="green"></div>
                                <span>Green</span>
                            </li>
                            <li data-theme="light-green">
                                <div class="light-green"></div>
                                <span>Light Green</span>
                            </li>
                            <li data-theme="lime">
                                <div class="lime"></div>
                                <span>Lime</span>
                            </li>
                            <li data-theme="yellow">
                                <div class="yellow"></div>
                                <span>Yellow</span>
                            </li>
                            <li data-theme="amber">
                                <div class="amber"></div>
                                <span>Amber</span>
                            </li>
                            <li data-theme="orange">
                                <div class="orange"></div>
                                <span>Orange</span>
                            </li>
                            <li data-theme="deep-orange">
                                <div class="deep-orange"></div>
                                <span>Deep Orange</span>
                            </li>
                            <li data-theme="brown">
                                <div class="brown"></div>
                                <span>Brown</span>
                            </li>
                            <li data-theme="grey">
                                <div class="grey"></div>
                                <span>Grey</span>
                            </li>
                            <li data-theme="blue-grey">
                                <div class="blue-grey"></div>
                                <span>Blue Grey</span>
                            </li>
                            <li data-theme="black">
                                <div class="black"></div>
                                <span>Black</span>
                            </li>
                        </ul>
                    </div>
                </div>
            </aside>
            <!-- #END# Right Sidebar -->
        </section>

        <section class="content">
            <div class="container-fluid">
                <div class="row clearfix">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="card">
                            <div class="header">
                                <h2>
                                    Borrar zona
                                </h2>
                            </div>
                            <div class="body">
                                <h2 class="card-inside-title">Seleccione un zona</h2>
                                <div class="row clearfix">
                                    <div class="col-sm-6">
                                        <form method="POST" action="../zona_servlet">
                                            <div class="form-group form-float">
                                        <select class="form-control show-tick" name="id">
                                            <%
                                                modelo.zona_DAO zona = new modelo.zona_DAO();
                                                ResultSet res = zona.Listado();
                                                while (res.next()) {
                                            %>
                                            <option value=<%=res.getString(1)%>><%=res.getString(2)%></option>
                                            <%
                                                }
                                            %>
                                        </select>
                                            </div>
                                        <input class="btn btn-primary waves-effect" type="submit" name="boton" value="Eliminar">
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- Jquery Core Js -->
        <script src="../plugins/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core Js -->
        <script src="../plugins/bootstrap/js/bootstrap.js"></script>

        <script src="../plugins/bootstrap-select/js/bootstrap-select.js"></script>

        <!-- Select Plugin Js -->
        <script src="../plugins/bootstrap-select/js/bootstrap-select.js"></script>

        <!-- Slimscroll Plugin Js -->
        <script src="../plugins/jquery-slimscroll/jquery.slimscroll.js"></script>

        <!-- Waves Effect Plugin Js -->
        <script src="../plugins/node-waves/waves.js"></script>

        <!-- Custom Js -->
        <script src="../js/admin.js"></script>

        <!-- Demo Js -->
        <script src="../js/demo.js"></script>
    </body>
</html>