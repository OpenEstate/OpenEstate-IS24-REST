<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%--
 Copyright 2014-2015 OpenEstate.org.

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
    <title>Verification requested | OpenEstate-IS24-REST-WebApp</title>
    <link href="/css/style.css" media="all" rel="stylesheet" type="text/css">
  </head>
  <body>
    <h1>Verification requested</h1>
    <p>
      A new verification was requested from the REST-Webservice of
      ImmobilienScout24.de. Please click the following button to start the
      verification process. This will redirect you to the website of
      ImmobilienScout24.de, where you have to enter the login credentials of
      your agency account. Afterwards you are asked to grant access to your
      agency account for this application.
    </p>
    <p class="center">
      <a href="${ url }" class="button">Start Verification</a>
    </p>
    <fieldset>
      <legend>Your verification request</legend>
      <p>
        Verification token:<br>
        <input type="text" value="${ token }" readonly>
      </p>
      <p>
        Verification secret:<br>
        <input type="text" value="${ secret }" readonly>
      </p>
    </fieldset>
    <hr>
    <a href="http://www.immobilienscout24.de/"><img id="logo-is24" src="/images/is24.png" alt=""></a>
    <ul>
      <li><a href="/">back to main page</a></li>
    </ul>
    <a href="https://github.com/OpenEstate/OpenEstate-IS24-REST/"><img id="logo-github" src="/images/github.png" alt="" data-canonical-src="/images/github.png"></a>
  </body>
</html>