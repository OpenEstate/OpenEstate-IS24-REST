OpenEstate-IS24-REST 0.5
========================

OpenEstate-IS24-REST is a client library for the REST-Webservice of
[ImmobilienScout24.de](https://www.immobilienscout24.de/) written in Java. This
library is used within [OpenEstate-ImmoTool](https://openestate.org/) and in
some of our clients projects in order to import / export their real estates to
[ImmobilienScout24.de](https://www.immobilienscout24.de/).


Features
--------

-   authentication through [OAuth](https://api.immobilienscout24.de/useful/authentication.html)
-   read and write XML according to the specifications of the Webservice
-   low level functions to call [Import/Export API](https://api.immobilienscout24.de/our-apis/import-export.html)
    and [Geo Information Service API](https://api.immobilienscout24.de/our-apis/gis.html)
-   high level functions for the export of multiple real estates (including
    contacts, attachments and streaming videos)
-   create real estates randomly
-   example web application for the [OAuth](https://api.immobilienscout24.de/useful/authentication.html)
    verification process


Components
----------

The library is split into different components:

-   **OpenEstate-IS24-REST-Core**

    -   Java classes, that represent the [XML schemas](Core/src/main/xsd) of the Webservice
    -   XML reading and writing according to the [XML schemas](Core/src/main/xsd) of the Webservice
    -   low level methods to access the Webservice
        (see [`ImportExport.java`](Core/src/main/java/org/openestate/is24/restapi/ImportExport.java)
        and [`GIS.java`](Core/src/main/java/org/openestate/is24/restapi/GIS.java))
    -   high level methods for a straightforward export of real estates
        (see [`ExportPool.java`](Core/src/main/java/org/openestate/is24/restapi/utils/ExportPool.java)
        and [`ExportHandler.java`](Core/src/main/java/org/openestate/is24/restapi/utils/ExportHandler.java))
    -   communicate with the Webservice through [`java.net.HttpURLConnection`](https://docs.oracle.com/javase/7/docs/api/java/net/HttpURLConnection.html)
        (see [`DefaultClient.java`](Core/src/main/java/org/openestate/is24/restapi/DefaultClient.java))

-   **OpenEstate-IS24-REST-HC42**

    -   communicate with the Webservice through [Apache HttpComponents 4.2](https://hc.apache.org/httpcomponents-client-4.2.x/)
        (see [`HttpComponents42Client.java`](HC42/src/main/java/org/openestate/is24/restapi/hc42/HttpComponents42Client.java))

-   **OpenEstate-IS24-REST-HC43**

    -   communicate with the Webservice through [Apache HttpComponents 4.3](https://hc.apache.org/httpcomponents-client-4.3.x/)
        (see [`HttpComponents43Client.java`](HC43/src/main/java/org/openestate/is24/restapi/hc43/HttpComponents43Client.java))

-   **OpenEstate-IS24-REST-Examples**

    -   some example classes to illustrate library usage

-   **OpenEstate-IS24-REST-WebApp**

    -   an example web application to illustrate the [OAuth](https://api.immobilienscout24.de/useful/authentication.html) verification process
        (see [`VerificationServlet.java`](WebApp/src/main/java/org/openestate/is24/restapi/webapp/VerificationServlet.java))


How to use
----------

Download the [latest release from GitHub](https://github.com/OpenEstate/OpenEstate-IS24-REST/releases/latest).
The provided archive contains all required files (compiled libraries,
dependencies, source code and documentations).

Alternatively you can integrate the library from
[Maven Central Repository](https://search.maven.org/#search|ga|1|org.openestate.is24)
into your [Maven](https://maven.apache.org/) project. Just add one or more of the
following dependencies to your projects `pom.xml` (according to your
requirements):

```xml
<dependency>
  <groupId>org.openestate.is24</groupId>
  <artifactId>OpenEstate-IS24-REST-Core</artifactId>
  <version>0.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.is24</groupId>
  <artifactId>OpenEstate-IS24-REST-HC42</artifactId>
  <version>0.5</version>
</dependency>

<dependency>
  <groupId>org.openestate.is24</groupId>
  <artifactId>OpenEstate-IS24-REST-HC43</artifactId>
  <version>0.5</version>
</dependency>
```

You can find further information in the
[project wiki](https://github.com/OpenEstate/OpenEstate-IS24-REST/wiki) or in
the `docs` subfolder.


Requirements
------------

-   You need to [register for API access](https://rest.immobilienscout24.de/restapi/security/registration).
-   You need to accept the [terms of use](https://api.immobilienscout24.de/terms-of-use.html).
-   After the registration process you should receive a **consumer token** and
    **consumer secret**.


Dependencies
------------

-   Java 7 or newer
-   [commons-codec 1.11](https://commons.apache.org/proper/commons-codec/)
-   [commons-io 2.6](https://commons.apache.org/proper/commons-io/)
-   [commons-lang 3.8.1](https://commons.apache.org/proper/commons-lang/)
-   [commons-text 1.3](https://commons.apache.org/proper/commons-text/)
-   [jaxb2-basics-runtime 0.11.1](https://github.com/highsource/jaxb2-basics)
-   [oauth-signpost 1.2.1.2](https://code.google.com/p/oauth-signpost/)
-   [SLF4J 1.7.25](https://www.slf4j.org/)
-   [Lorem 2.1](https://github.com/mdeanda/lorem) (only required by
    [`RandomRealEstateFactory.java`](Core/src/main/java/org/openestate/is24/restapi/utils/RandomRealEstateFactory.java))
-   [Apache HttpComponents 4.2](https://hc.apache.org/httpcomponents-client-4.2.x/) or
    [Apache HttpComponents 4.3](https://hc.apache.org/httpcomponents-client-4.3.x/)
    (optional, 4.4 and 4.5 also seem to work)


Limitations
-----------

The use of the Webservice may be limited by
[ImmobilienScout24](https://www.immobilienscout24.de/) to a maximal number of
operations per day. Contact <service@immobilienscout24.de> if the limit is too
low for your use case.


XML schemas
-----------

XML specifications for the different webservices are available at:

-   [**Import/Export API**](https://api.immobilienscout24.de/our-apis/import-export.html)
    -   [XML-Schemas for the *production* system](https://rest.immobilienscout24.de/restapi/api/offer/v1.0/?_wadl&_schema)
    -   [XML-Schemas for the *sandbox* system](https://rest.sandbox-immobilienscout24.de/restapi/api/offer/v1.0/?_wadl&_schema)

-   [**Geo Information Service API**](https://api.immobilienscout24.de/our-apis/gis.html)
    -   [XML-Schemas for the *production* system](https://rest.immobilienscout24.de/restapi/api/gis/v1.0/?_wadl&_schema)
    -   [XML-Schemas for the *sandbox* system](https://rest.sandbox-immobilienscout24.de/restapi/api/gis/v1.0/?_wadl&_schema)


Changelog
---------

Take a look at [`CHANGELOG.md`](CHANGELOG.md) for the full changelog.


License
-------

This library is licensed under the terms of
[Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.html).
Take a look at [`LICENSE.txt`](LICENSE.txt) for the license text.


Todo
----

-   further testing
-   implement other API's - e.g.
    [Expose API](https://api.immobilienscout24.de/our-apis/expose.html),
    [Search API](https://api.immobilienscout24.de/our-apis/search.html),
    [Product Valuation Services API](https://api.immobilienscout24.de/our-apis/valuation.html),
    [Construction Financing API](https://api.immobilienscout24.de/our-apis/construction-financing.html)


Further information
-------------------

-   [OpenEstate-IS24-REST at GitHub](https://github.com/OpenEstate/OpenEstate-IS24-REST)
-   [Releases of OpenEstate-IS24-REST](https://github.com/OpenEstate/OpenEstate-IS24-REST/releases)
-   [Changelog of OpenEstate-IS24-REST](https://github.com/OpenEstate/OpenEstate-IS24-REST/blob/master/CHANGELOG.md)
-   [API documentation of OpenEstate-IS24-REST](https://media.openestate.org/apidocs/OpenEstate-IS24-REST/)
-   [ImmobilienScout24 Developer Center](https://api.immobilienscout24.de/)
-   [ImmobilienScout24-REST-API Forum](https://groups.google.com/forum/#!forum/immobilienscout24-development)
-   [ImmobilienScout24-REST-API Playground](https://playground.immobilienscout24.de/rest/playground)
-   [API registration for the *production* system](https://rest.immobilienscout24.de/restapi/security/registration)
-   [API registration for the *sandbox* system](https://rest.sandbox-immobilienscout24.de/restapi/security/registration)
-   [alternative Java SDK by ImmobilienScout24](https://github.com/ImmobilienScout24/restapi-java-sdk)
