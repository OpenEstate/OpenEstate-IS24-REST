<?php
/*
 * Copyright 2014-2021 OpenEstate.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//echo '<pre>' . print_r($_GET, true) . '</pre>';

// state of verification
$state = (isset($_REQUEST['state']))? $_REQUEST['state']: null;

// verification token
$token = (isset($_REQUEST['oauth_token']))? $_REQUEST['oauth_token']: null;

// verification code
$verifier = (isset($_REQUEST['oauth_verifier']))? $_REQUEST['oauth_verifier']: null;


if (!is_string($state) || !is_string($token) || !is_string($verifier)) {
  echo "<h2>Invalid Request</h2>";
  echo "The verification has presumably failed.";
  return;
}

$state = strtolower($state);
if ($state=='authorized') {
  echo "<h2>Access to IS24-Webservice was granted.</h2>";
  echo "<p>Enter the following verification code into your software in order to finish the verification process:</p>";
  echo "<p><input type=\"text\" value=\"".htmlspecialchars($verifier)."\" readonly=\"readonly\" onfocus=\"this.select();\" /></p>";
}
else {
  echo "<h2>Access to IS24-Webservice was not granted.</h2>";
  echo "<p>Please restart the verification process from your software.</p>";
}
