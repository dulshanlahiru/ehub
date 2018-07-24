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



        <link href='css/fullcalendar.min.css' rel='stylesheet' />
        <link href='css/fullcalendar.print.min.css' rel='stylesheet' media='print' />
        <script src='lib/moment.min.js'></script>
        <script src='lib/jquery.min.js'></script>
        <script src='js/fullcalendar.min.js'></script>
        <script>

            $(document).ready(function () {

                $('#calendar').fullCalendar({
                    defaultDate: '2018-03-12',
                    editable: true,
                    eventLimit: true, // allow "more" link when too many events
                    events: [
                        {
                            title: 'All Day Event',
                            start: '2018-03-01'
                        },
                        {
                            title: 'Long Event',
                            start: '2018-03-07',
                            end: '2018-03-10'
                        },
                        {
                            id: 999,
                            title: 'Repeating Event',
                            start: '2018-03-09T16:00:00'
                        },
                        {
                            id: 999,
                            title: 'Repeating Event',
                            start: '2018-03-16T16:00:00'
                        },
                        {
                            title: 'Conference',
                            start: '2018-03-11',
                            end: '2018-03-13'
                        },
                        {
                            title: 'Meeting',
                            start: '2018-03-12T10:30:00',
                            end: '2018-03-12T12:30:00'
                        },
                        {
                            title: 'Lunch',
                            start: '2018-03-12T12:00:00'
                        },
                        {
                            title: 'Meeting',
                            start: '2018-03-12T14:30:00'
                        },
                        {
                            title: 'Happy Hour',
                            start: '2018-03-12T17:30:00'
                        },
                        {
                            title: 'Dinner',
                            start: '2018-03-12T20:00:00'
                        },
                        {
                            title: 'Birthday Party',
                            start: '2018-03-13T07:00:00'
                        },
                        {
                            title: 'Click for Google',
                            url: 'http://google.com/',
                            start: '2018-03-28'
                        }
                    ]
                });

            });

        </script>
        <style>

            body {
                margin: 40px 10px;
                padding: 0;
                font-family: "Lucida Grande",Helvetica,Arial,Verdana,sans-serif;
                font-size: 14px;
            }

            #calendar {
                max-width: 900px;
                margin: 0 auto;
            }

        </style>



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
                    <div class="col-md-4"><h1>Organization</h1></div>
                    <div class="col-md-8">

                        <div id='calendar'></div>

                    </div>
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
        <!--<script src="js/jquery-2.1.1.min.js"></script>-->	
        <!-- Include all compiled plugins (below), or include individual files as needed -->
    </body>

</html>