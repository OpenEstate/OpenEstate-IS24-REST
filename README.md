OpenEstate-IS24-REST 0.2-SNAPSHOT
=================================

OpenEstate-IS24-REST is a client library for the REST-Webservice of
[ImmobilienScout24](http://www.immobilienscout24.de/) written in Java. This
library is used within [OpenEstate-ImmoTool](http://openestate.org/) and in
some of our clients projects in order to import / export properties to
[ImmobilienScout24](http://www.immobilienscout24.de/).


Work in progress
----------------

This library is in an early stage of development. The API may change along with
updates. But we're trying to mark changes as *deprecated* and keep them for some
time. Also we're going to document incompabilities in the change log of a new
release.


Features
--------

-   authentication through [OAuth](http://api.immobilienscout24.de/useful/authentication.html)
-   read and write XML according to the specifications of the Webservice
-   helper functions to call the [Import/Export-API](http://api.immobilienscout24.de/our-apis/import-export.html)
    (see [`ImportExport.java`](OpenEstate-IS24-REST/src/main/java/org/openestate/is24/restapi/ImportExport.java))
-   bulk export of multiple properties (including contacts, attachments and
    streaming videos)


Components
----------

The library is splitted into different components:

-   **OpenEstate-IS24-REST**

    -   XML reading and writing
    -   implement methods to access the Webservice
    -   communicate with the Webservice through [`java.net.HttpURLConnection`](http://docs.oracle.com/javase/6/docs/api/java/net/HttpURLConnection.html)
        (see [`DefaultClient.java`](OpenEstate-IS24-REST/src/main/java/org/openestate/is24/restapi/DefaultClient.java))

-   **OpenEstate-IS24-REST-hc42**

    -   communicate with the Webservice through [Apache HttpComponents 4.2](http://hc.apache.org/httpcomponents-client-4.2.x/)
        (see [`HttpComponents42Client.java`](OpenEstate-IS24-REST-hc42/src/main/java/org/openestate/is24/restapi/hc42/HttpComponents42Client.java))

-   **OpenEstate-IS24-REST-hc43**

    -   communicate with the Webservice through [Apache HttpComponents 4.3](http://hc.apache.org/httpcomponents-client-4.3.x/)
        (see [`HttpComponents43Client.java`](OpenEstate-IS24-REST-hc43/src/main/java/org/openestate/is24/restapi/hc43/HttpComponents43Client.java))

-   **OpenEstate-IS24-REST-examples**

    -   some example code


How to use
----------

You can find further informations in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IS24-REST/wiki) or in
the `docs` subfolder.


Requirements
------------

-   You need to [register for API access](http://rest.immobilienscout24.de/restapi/security/registration).
-   You need to accept the [terms of use](http://api.immobilienscout24.de/terms-of-use.html).
-   After the registration process you should receive a **consumer token** and
    **consumer secret**.


Dependencies
------------

-   Java 6 or newer
-   [commons-io 2.4](http://commons.apache.org/proper/commons-io/)
-   [commons-lang 2.6](http://commons.apache.org/proper/commons-lang/)
-   [commons-validator 1.4](http://commons.apache.org/proper/commons-validator/)
-   [oauth-signpost 1.2.1.2](https://code.google.com/p/oauth-signpost/)
-   [SLF4J 1.7.7](http://www.slf4j.org/)
-   [Apache HttpComponents 4.2](http://hc.apache.org/httpcomponents-client-4.2.x/) or
    [Apache HttpComponents 4.3](http://hc.apache.org/httpcomponents-client-4.3.x/) (optional)


Limitations
-----------

The use of the Webservice may be limited by
[ImmobilienScout24](http://www.immobilienscout24.de/) to a maximal number of
operations per day. Contact <service@immobilienscout24.de> if the limit is too
low for your use case.


License
-------

This library is licensed under the terms of
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).


Todo
----

-   further testing
-   add missing javadoc comments
-   publish at Maven Central Repository
-   implement other API's - e.g.
    [Expose API](http://api.immobilienscout24.de/our-apis/expose.html),
    [Search API](http://api.immobilienscout24.de/our-apis/search.html),
    [Geo Information Service API](http://api.immobilienscout24.de/our-apis/gis.html),
    [Product Valuation Services API](http://api.immobilienscout24.de/our-apis/valuation.html),
    [Construction Financing API](http://api.immobilienscout24.de/our-apis/construction-financing.html)


Further informations
--------------------

-   [OpenEstate-IS24-REST at GitHub](https://github.com/OpenEstate/OpenEstate-IS24-REST)
-   [ImmobilienScout24 Developer Center](http://api.immobilienscout24.de/)
-   [ImmobilienScout24-REST-API Forum](https://groups.google.com/forum/#!forum/immobilienscout24-development)
-   [ImmobilienScout24-REST-API Playground](http://playground.immobilienscout24.de/rest/playground)
-   [XML-Schemas (production)](http://rest.immobilienscout24.de/restapi/api/offer/v1.0/?_wadl&_schema)
-   [XML-Schemas (sandbox)](http://rest.sandbox-immobilienscout24.de/restapi/api/offer/v1.0/?_wadl&_schema)
-   [An alternative implementation by IS24](https://github.com/ImmobilienScout24/restapi-java-sdk)
