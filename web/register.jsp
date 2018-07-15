<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>University-Industry</title>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/animate.css">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" />	
        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <header>		
            <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
                <div class="navigation">
                    <div class="container">					
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse.collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <div class="navbar-brand">
                                <a href="index.html"><h1><span>Event</span>Hub</h1></a>
                            </div>
                        </div>

                        <div class="navbar-collapse collapse">							
                            <div class="menu">
                                     <%@include file="_menu_pre.jsp" %>
                            </div>
                        </div>						
                    </div>
                </div>	
            </nav>		
        </header>




        <div class="ehubbody" style="padding-top: 100px">
            <div class="container">
                <div class="row">
                    <div class="col-md-2"></div>
                    <div class="col-md-8">
                        ${msg}
                        <form class="form-horizontal" action="RegisterServlet" method="post">
                            <fieldset>

                                <!-- Form Name -->
                                <legend>University Organization Registration </legend>

                                <!-- Text input-->
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="uni_org_name">University / Organization Name</label>  
                                    <div class="col-md-4">
                                        <input id="uni_org_name" name="uni_org_name" type="text" placeholder="" class="form-control input-md">

                                    </div>
                                </div>

                                <!-- Select Basic -->
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="uni_org_type">Type</label>
                                    <div class="col-md-4">
                                        <select id="uni_org_type" name="uni_org_type" class="form-control">
                                            <option value="UNIVERSITY">UNIVERSITY</option>
                                            <option value="ORGANIZATION">ORGANIZATION</option>
                                        </select>
                                    </div>
                                </div>

                                <!-- Text input-->
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="email">Email</label>  
                                    <div class="col-md-4">
                                        <input id="email" name="email" type="text" placeholder="This will be the username" class="form-control input-md">

                                    </div>
                                </div>

                                <!-- Textarea -->
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="address">Address</label>
                                    <div class="col-md-4">                     
                                        <textarea class="form-control" id="address" name="address"></textarea>
                                    </div>
                                </div>

                                <!-- Text input-->
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="telephone">Telephone</label>  
                                    <div class="col-md-4">
                                        <input id="telephone" name="telephone" type="text" placeholder="" class="form-control input-md">

                                    </div>
                                </div>

                                <!-- Button -->
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="singlebutton"></label>
                                    <div class="col-md-4">
                                        <button id="singlebutton" name="singlebutton" class="btn btn-primary">Regester Now</button>
                                    </div>
                                </div>

                            </fieldset>
                        </form>



                    </div>
                    <div class="col-md-2"></div>
                </div> 
            </div>
        </div>






        <footer>
            <div class="footer">
                <div class="container">
                    <div class="social-icon">
                        <div class="col-md-4">
                            <ul class="social-network">
                                <li><a href="#" class="fb tool-tip" title="Facebook"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#" class="twitter tool-tip" title="Twitter"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#" class="gplus tool-tip" title="Google Plus"><i class="fa fa-google-plus"></i></a></li>
                                <li><a href="#" class="linkedin tool-tip" title="Linkedin"><i class="fa fa-linkedin"></i></a></li>
                                <li><a href="#" class="ytube tool-tip" title="You Tube"><i class="fa fa-youtube-play"></i></a></li>
                            </ul>	
                        </div>
                    </div>

                    <div class="col-md-4 col-md-offset-4">
                        <div class="copyright">
                            &copy; CodeOn 2018. All Rights Reserved.
                        </div>
                        <!-- 
                            All links in the footer should remain intact. 
                            Licenseing information is available at: http://bootstraptaste.com/license/
                            You can buy this theme without footer links online at: http://bootstraptaste.com/buy/?theme=Company
                        -->
                    </div>						
                </div>

                <div class="pull-right">
                    <a href="#home" class="scrollup"><i class="fa fa-angle-up fa-3x"></i></a>
                </div>		
            </div>
        </footer>



        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery-2.1.1.min.js"></script>	
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/jquery.isotope.min.js"></script>  
        <script src="js/wow.min.js"></script>
        <script src="js/functions.js"></script>

    </body>
</html>