OpenEstate-IS24-REST 0.7-SNAPSHOT
=================================

OpenEstate-IS24-REST is a client library for the REST-Webservice of [ImmobilienScout24.de](https://www.immobilienscout24.de/) written in Java. This library is used within [OpenEstate-ImmoTool](https://openestate.org/) and in some of our clients projects in order to import / export their real estates to [ImmobilienScout24.de](https://www.immobilienscout24.de/).


Features
--------

-   authentication through [OAuth](https://api.immobilienscout24.de/useful/authentication.html)
-   read and write XML according to the specifications of the Webservice
-   low level functions to call [Import/Export API](https://api.immobilienscout24.de/our-apis/import-export.html) and [Geo Information Service API](https://api.immobilienscout24.de/our-apis/gis.html)
-   high level functions for the export of multiple real estates (including contacts, attachments and streaming videos)
-   create real estates randomly
-   example web application for the [OAuth](https://api.immobilienscout24.de/useful/authentication.html)
    verification process


Components
----------

The library is split into different components:

-   **OpenEstate-IS24-REST-Core**

    -   Java classes, that represent the [XML schemas](Core/src/main/schema) of the Webservice
    -   XML reading and writing according to the [XML schemas](Core/src/main/schema) of the Webservice
    -   low level methods to access the Webservice (see [`ImportExport.java`](Core/src/main/java/org/openestate/is24/restapi/ImportExport.java) and [`GIS.java`](Core/src/main/java/org/openestate/is24/restapi/GIS.java))
    -   high level methods for a straightforward export of real estates (see [`ExportPool.java`](Core/src/main/java/org/openestate/is24/restapi/utils/ExportPool.java) and [`ExportHandler.java`](Core/src/main/java/org/openestate/is24/restapi/utils/ExportHandler.java))
    -   communicate with the Webservice through [`java.net.HttpURLConnection`](https://docs.oracle.com/javase/8/docs/api/java/net/HttpURLConnection.html) (see [`DefaultClient.java`](Core/src/main/java/org/openestate/is24/restapi/DefaultClient.java))

-   **OpenEstate-IS24-REST-HC4**

    -   communicate with the Webservice through [Apache HttpClient 4.5](https://hc.apache.org/httpcomponents-client-4.5.x/) (see [`HttpComponents4Client.java`](HC4/src/main/java/org/openestate/is24/restapi/hc4/HttpComponents4Client.java))

-   **OpenEstate-IS24-REST-Examples**

    -   some example classes to illustrate library usage

-   **OpenEstate-IS24-REST-WebApp**

    -   an example web application to illustrate the [OAuth](https://api.immobilienscout24.de/useful/authentication.html) verification process (see [`VerificationServlet.java`](WebApp/src/main/java/org/openestate/is24/restapi/webapp/VerificationServlet.java))


How to use
----------

Download the [latest release from GitHub](https://github.com/OpenEstate/OpenEstate-IS24-REST/releases/latest). The provided archive contains all required files (compiled libraries, dependencies, source code and documentations).

Alternatively you can integrate the library from [Maven Central Repository](https://search.maven.org/#search|ga|1|org.openestate.is24) into your [Maven](https://maven.apache.org/) project. Just add one or more of the following dependencies to your projects `pom.xml` (according to your requirements):

```xml
<dependency>
  <groupId>org.openestate.is24</groupId>
  <artifactId>OpenEstate-IS24-REST-Core</artifactId>
  <version>0.7-SNAPSHOT</version>
</dependency>

<dependency>
  <groupId>org.openestate.is24</groupId>
  <artifactId>OpenEstate-IS24-REST-HC4</artifactId>
  <version>0.7-SNAPSHOT</version>
</dependency>
```

You can find further information in the [project wiki](https://github.com/OpenEstate/OpenEstate-IS24-REST/wiki) or in the `docs` subfolder.


Requirements
------------

-   You need to [register for API access](https://rest.immobilienscout24.de/restapi/security/registration).
-   You need to accept the [terms of use](https://api.immobilienscout24.de/terms-of-use.html).
-   After the registration process you should receive a **consumer token** and **consumer secret**.


Dependencies
------------

-   Java 8 or newer
-   [commons-codec 1.15](https://commons.apache.org/proper/commons-codec/)
-   [commons-io 2.11.0](https://commons.apache.org/proper/commons-io/)
-   [commons-lang 3.12.0](https://commons.apache.org/proper/commons-lang/)
-   [commons-text 1.9](https://commons.apache.org/proper/commons-text/)
-   [Eclipse Implementation of JAXB 2.3.5](https://projects.eclipse.org/projects/ee4j.jaxb-impl)
-   [Jakarta Activation 1.2.2](https://projects.eclipse.org/projects/ee4j.jaf)
-   [Jakarta Annotations 1.3.5](https://projects.eclipse.org/projects/ee4j.ca)
-   [Jakarta XML Binding 2.3.3](https://projects.eclipse.org/projects/ee4j.jaxb)
-   [jaxb2-basics-runtime 0.12.0](https://github.com/highsource/jaxb2-basics)
-   [oauth-signpost 2.1.1](https://github.com/mttkay/signpost)
-   [SLF4J 1.7.30](https://www.slf4j.org/)
-   [Lorem 2.1](https://github.com/mdeanda/lorem) (only required by [`RandomRealEstateFactory.java`](Core/src/main/java/org/openestate/is24/restapi/utils/RandomRealEstateFactory.java))
-   [Apache HttpClient 4.5](https://hc.apache.org/httpcomponents-client-4.5.x/) (optional) with further dependencies:
    -   [commons-logging 1.2](https://commons.apache.org/proper/commons-logging/)
    -   [Apache HttpCore 4.4](https://hc.apache.org/httpcomponents-core-4.4.x/)


Notes about JDK versions below 11
---------------------------------

JAXB is bundled with JDK 8, was disabled / deprecated in JDK 9 & 10 and finally removed in JDK 11. Therefore, we're providing JAXB as an explicit dependency. See also ["JAXB on Java 9, 10, 11 and beyond"](https://www.jesperdj.com/2018/09/30/jaxb-on-java-9-10-11-and-beyond/). 

It is recommended to use this library with JDK 11 as it should work out of the box. In case you're using JDK 8, you might need to follow one of these steps documented at ["JAXB Release Documentation"](https://javaee.github.io/jaxb-v2/doc/user-guide/release-documentation.html#deployment-migrating-jaxb-2-0-applications-to-javase-6):

> JavaSE comes with JAXB 2.x API/implementation in `rt.jar`. Each version of JavaSE (6, 7, 8, ...) contains different version of JAXB 2.x API. Therefore, if you want to use different version of JAXB API/implementation than the one present in your version of JDK, you are required to override a portion of `rt.jar` with the new API. There are several ways to achieve this:
> 
> 1.    Place the `jakarta.xml.bind-api-X.Y.Z.jar` into `$JRE_HOME/lib/endorsed`. **Do not put other JAXB jars into the endorsed directory.** This essentially makes your JRE to "JRE X + JAXB 2.y". This would affect any other applications that use this JRE, and it's easy. On the other hand, in various scenarios you may not be able to alter the JRE.
> 
> 2.    Use the system property `java.endorsed.dirs` when you launch your application, and have it point to the directory which contains the `jakarta.xml.bind-api-X.Y.Z.jar` only. **The directory must not contain any other jaxb artifacts.** This allows you to use different version of JAXB for different applications. 
> 
> See the [endorsed directory mechanism](http://docs.oracle.com/javase/6/docs/technotes/guides/standards/) for more details.

All provided dependencies should work with JDK 8. If compatibility problems occur, you might replace them with an earlier version.


Limitations
-----------

The use of the Webservice may be limited by [ImmobilienScout24](https://www.immobilienscout24.de/) to a maximal number of operations per day. Contact <service@immobilienscout24.de> if the limit is too low for your use case.


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

This library is licensed under the terms of [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.html). Take a look at [`LICENSE.txt`](LICENSE.txt) for the license text.


Todo
----

-   further testing
-   implement other API's - e.g.
    -   [Expose API](https://api.immobilienscout24.de/our-apis/expose.html)
    -   [Search API](https://api.immobilienscout24.de/our-apis/search.html)
    -   [Product Valuation Services API](https://api.immobilienscout24.de/our-apis/valuation.html)
    -   [Construction Financing API](https://api.immobilienscout24.de/our-apis/construction-financing.html)


Further information
-------------------

-   [OpenEstate-IS24-REST at GitHub](https://github.com/OpenEstate/OpenEstate-IS24-REST)
-   [Releases of OpenEstate-IS24-REST](https://github.com/OpenEstate/OpenEstate-IS24-REST/releases)
-   [Changelog of OpenEstate-IS24-REST](https://github.com/OpenEstate/OpenEstate-IS24-REST/blob/develop/CHANGELOG.md)
-   [API documentation of OpenEstate-IS24-REST](https://media.openestate.org/apidocs/OpenEstate-IS24-REST/)
-   [ImmobilienScout24 Developer Center](https://api.immobilienscout24.de/)
-   [ImmobilienScout24-REST-API Forum](https://groups.google.com/forum/#!forum/immobilienscout24-development)
-   [ImmobilienScout24-REST-API Playground](https://playground.immobilienscout24.de/rest/playground)
-   [API registration for the *production* system](https://rest.immobilienscout24.de/restapi/security/registration)
-   [API registration for the *sandbox* system](https://rest.sandbox-immobilienscout24.de/restapi/security/registration)
-   [alternative Java SDK by ImmobilienScout24](https://github.com/ImmobilienScout24/restapi-java-sdk)
