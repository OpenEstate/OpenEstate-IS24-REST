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
    <title>Verification received | OpenEstate-IS24-REST-WebApp</title>
    <link href="/css/style.css" media="all" rel="stylesheet" type="text/css">
  </head>
  <body>
    <h1>Verification received</h1>

<% if (!Boolean.TRUE.equals( request.getAttribute( "authorized" ) )) { %>
    <p class="warning">
      The verification process failed. No access was granted.
    </p>
<% } else if (!Boolean.TRUE.equals( request.getAttribute( "valid" ) )) { %>
    <p class="warning">
      Can't find the verification token or secret.
    </p>
<% } else { %>
    <p class="success">
      The verification process was successfully finished. The following access
      credentials were generated.
    </p>
    <fieldset>
      <legend>Your access credentials</legend>
      <p>
        Your access token:<br>
        <input type="text" value="${ token }" readonly>
      </p>
      <p>
        Your access secret:<br>
        <input type="text" value="${ secret }" readonly>
      </p>
    </fieldset>
    <p>
      From now on you can use these credentials to access the agency account
      at ImmobilienScout24.de through the REST-Webservice. Please store these
      values somewhere into your application / database / documents.
    </p>
<% } %>
    <hr>
    <a href="http://www.immobilienscout24.de/"><img id="logo-is24" src="/images/is24.png" alt=""></a>
    <ul>
      <li><a href="/verify/">start new verification</a></li>
      <li><a href="/">back to main page</a></li>
    </ul>
    <a href="https://github.com/OpenEstate/OpenEstate-IS24-REST/"><img id="logo-github" src="/images/github.png" alt="" data-canonical-src="/images/github.png"></a>
  </body>
</html>