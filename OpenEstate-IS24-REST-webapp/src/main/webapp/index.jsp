<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%--
 Copyright 2014 OpenEstate.org.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.

  Author : Andreas Rudolph <andy@openindex.de>
--%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>OpenEstate-IS24-REST-WebApp</title>
    <link href="/css/style.css" media="all" rel="stylesheet" type="text/css">
  </head>
  <body>
    <h1>Welcome</h1>
    <p>
      This is an example web application, that shows some features of the
      <a href="https://github.com/OpenEstate/OpenEstate-IS24-REST">OpenEstate-IS24-REST</a>
      library. Click one of the following buttons to start a certain feature.
    </p>
    <p class="center">
      <a href="/verify/" class="button">Request Verification</a>
    </p>
    <hr>
    <a href="http://www.immobilienscout24.de/"><img id="logo-is24" src="/images/is24.png" alt=""></a>
    <a href="https://github.com/OpenEstate/OpenEstate-IS24-REST/"><img id="logo-github" src="/images/github.png" alt="" data-canonical-src="/images/github.png"></a>
  </body>
</html>