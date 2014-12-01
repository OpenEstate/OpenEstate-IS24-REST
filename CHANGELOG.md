Changelog for OpenEstate-IS24-REST
==================================


0.2 (not released yet)
----------------------

### new features

-   implemented a high level API for the export process
    (see [`ExportPool.java`](OpenEstate-IS24-REST/src/main/java/org/openestate/is24/restapi/utils/ExportPool.java)
    and [`ExportHandler.java`](OpenEstate-IS24-REST/src/main/java/org/openestate/is24/restapi/utils/ExportHandler.java))
-   implemented a class for creation of random real estates
    (see [`RandomRealEstateFactory.java`](OpenEstate-IS24-REST/src/main/java/org/openestate/is24/restapi/utils/RandomRealEstateFactory.java))
-   implemented a basic web application [`OpenEstate-IS24-REST-webapp`](OpenEstate-IS24-REST-webapp)
    to illustrate the [OAuth](http://api.immobilienscout24.de/useful/authentication.html)
    verification process

### updates

-   updated JAXB classes for XML reading / writing to the latest XML schemas from *13th October 2014*
    (see [IS24-Changelog](http://api.immobilienscout24.de/useful/changelog.html))
-   moved class `XmlUtils` from `org.openestate.is24.restapi.xml` into `org.openestate.is24.restapi.utils`
-   renamed class `SSLUtils` to `SslUtils` in `org.openestate.is24.restapi.utils`
-   support new values for `EnergySourceEnev2014` for `POST` and `UPDATE` of real
    estates with request paramater `usenewenergysourceenev2014values=true`
    (see [notes by IS24](http://api.immobilienscout24.de/useful/energy-certificate-2014.html))
-   moved [Java Signpost Example](http://api.immobilienscout24.de/useful/tutorials-sdks-plugins/tutorial-java-signpost.html)
    into the `examples` component
    (see [`RandomRealEstateFactory.java`](OpenEstate-IS24-REST-examples/src/main/java/org/openestate/is24/restapi/examples/IS24OauthExample.java))
-   API documentation completed

### deprecations

-   deprecated class `org.openestate.is24.restapi.xml.XmlUtils`
    -   calls to this class are redirected to `org.openestate.is24.restapi.utils.XmlUtils`
    -   this deprecated class will be removed with one of the next major releases
-   deprecated class `org.openestate.is24.restapi.utils.SSLUtils`
    -   calls to this class are redirected to `org.openestate.is24.restapi.utils.SslUtils`
    -   this deprecated class will be removed with one of the next major releases


0.1.2 (24 Aug 2014)
-------------------

-   fixed a regression, that was introduced with *0.1.1*


0.1.1 (24 Aug 2014)
-------------------

-   updated JAXB generated classes for XML reading / writing to the latest XML schemas from *20th August 2014*
    (see [IS24-Changelog](http://api.immobilienscout24.de/useful/changelog.html))


0.1 (27 Jul 2014)
-----------------

-   initial release
