Changelog for OpenEstate-IS24-REST
==================================

0.6-SNAPSHOT (not released yet)
-------------------------------

-   Compile for Java 8.
-   Provide JAXB as dependency for easier use in Java 9 and beyond.
-   Updated Apache HttpClient to version 4.5. Artifacts `OpenEstate-IS24-REST-HC42`, `OpenEstate-IS24-REST-HC43` were removed and replaced with `OpenEstate-IS24-REST-HC4`.
-   Updated `commons-codec` library to version 1.15.
-   Updated `commons-io` library to version 2.11.0.
-   Updated `commons-lang` library to version 3.12.0.
-   Updated `commons-text` library to version 1.9.
-   Updated `oauth.signpost` library to version 2.1.1.
-   Regenerated JAXB classes against the latest XSD schemas from IS24 with JAXB 2.3.


0.5 (08 Dec 2018)
-----------------

-   Artifacts of the project were renamed to `OpenEstate-IS24-REST-Core`,
    `OpenEstate-IS24-REST-HC42`, `OpenEstate-IS24-REST-HC43`,
    `OpenEstate-IS24-REST-Examples` and `OpenEstate-IS24-REST-WebApp`. Please
    make sure to rename the dependencies in your Maven project.
-   Added [automatic module names](http://branchandbound.net/blog/java/2017/12/automatic-module-name/) 
    into JAR manifests.
-   Regenerated JAXB classes against the latest XSD schemas from IS24.
-   Updated `commons-codec` library to version 1.11.
-   Updated `commons-io` library to version 2.6.
-   Updated `commons-lang` library to version 3.8.1.
-   Updated `commons-text` library to version 1.3.
-   **API change:** We're using `java.net.URI` instead of `java.net.URL`
    whenever possible. See
    [Always read the documentation/code – a.k.a. java.net.URL is evil](https://sworddance.com/blog/2007/09/09/code-review-4-always-read-the-documentationcode-aka-javaneturl-is-evil/)
    for more information.
-   **API change:** JAXB classes were regenerated with compatibility for Bean 
    Introspection API's. Getter methods for `Boolean` values were renamed from 
    `getValue()` to `isValue()`.
-   Migrated project to IntelliJ IDEA.


0.4 (29 Jul 2017)
-----------------

-   Updated to Java 7.
-   Updated `commons-lang` library to version 3.6.
-   Add dependency to `commons-text` library in version 1.1.


0.3.3 (14 May 2017)
-------------------

### bugfixes

-   Bulk exports stop immediately, when invalid XML is provided.
    ([issue #6](https://github.com/OpenEstate/OpenEstate-IS24-REST/issues/6))

### updates

-   Allow object descriptions with maximal 3999 characters.
    ([issue #4](https://github.com/OpenEstate/OpenEstate-IS24-REST/issues/4))
-   Support XKO country code for Kosovo.
    ([issue #5](https://github.com/OpenEstate/OpenEstate-IS24-REST/issues/5))
-   Add option to remove objects before update in bulk exports.
-   `org.openestate.is24.restapi.AbstractClient` implements `java.io.Closeable`.
-   Generated JAXB classes implement `java.io.Serializable`.
-   Replaced deprecated `org.apache.commons.io.IOExceptionWithCause` with
    `java.io.IOException`.
-   Support simple JSON requests within
    `org.openestate.is24.restapi.AbstractClient` via `sendJsonRequest()`.
    ([issue #7](https://github.com/OpenEstate/OpenEstate-IS24-REST/pull/7))
-   Updated `commons-io` library to version 2.5.
-   Updated `commons-lang` library to version 3.5.
-   Updated `jaxb2-basics` library to version 0.11.1.
-   Updated `Lorem` library to version 2.1.
-   Updated `slf4j` libraries to version 1.7.25.


0.3.2 (11 Mar 2016)
-------------------

### bugfixes

-   Less strict validation of e-mail addresses.
    E-mail addresses are currently validated with classes provided by
    [commons-validator](https://commons.apache.org/validator/) when XML is read
    or written. This validator does not handle new top level domains (nTLD)
    properly. Therefore the validation is replaced by a more simple approach,
    that validates the e-mail address against the pattern, that is specified by
    IS24 in `common-1.0.xsd`.

### updates

-   The package `org.openestate.is24.restapi.utils.validator`, that contains
    some classes of [commons-validator](https://commons.apache.org/validator/),
    was removed from source code.


0.3.1 (10 Mar 2016)
-------------------

### updates

-   Updated `slf4j` library to version 1.7.18.
-   Updated `jaxb2-basics` libraries to version 0.11.0
    and regenerated JAXB classes.


0.3 (12 Dec 2015)
-----------------

### new features

-   The library is available through [Maven Central Repository](http://search.maven.org/#search|ga|1|org.openestate.is24)
    from this release on. See [documentation page about Maven](https://github.com/OpenEstate/OpenEstate-IS24-REST/wiki/Integration-with-Maven)
    for more informations.
-   Low level methods to access [Geo Information Service API](http://api.immobilienscout24.de/our-apis/gis.html)
    were implemented (see [`GIS.java`](https://github.com/OpenEstate/OpenEstate-IS24-REST/blob/v0.3/OpenEstate-IS24-REST/src/main/java/org/openestate/is24/restapi/GIS.java)).

### bugfixes

-   Updates and publishings are separately executed during bulk exports.
-   Always parse / print `xsd:decimal`, `xsd:double` or `xsd:float` values as
    `java.lang.BigDecimal`.

### updates

-   The JAXB classes were regenerated against the latest XSD schemas from IS24.
-   [`Authorization`](https://github.com/OpenEstate/OpenEstate-IS24-REST/blob/v0.3/OpenEstate-IS24-REST/src/main/java/org/openestate/is24/restapi/utils/Authorization.java) and
    [`Verification`](https://github.com/OpenEstate/OpenEstate-IS24-REST/blob/v0.3/OpenEstate-IS24-REST/src/main/java/org/openestate/is24/restapi/utils/Verification.java)
    classes are implementing [`java.io.Serializable`](https://docs.oracle.com/javase/7/docs/api/java/io/Serializable.html).
-   The following schemas are not provided anymore by IS24. Their corresponding
    Java classes / packages were removed from this library:
    -   `alterationdate-1.0.xsd`
    -   `bookingoverview-1.0.xsd`
    -   `productrecommondation-1.0.xsd`
    -   `realestatestock-1.0.xsd`
    -   `zipandlocationtoregion-1.0.xsd`
-   Classes and methods, that were marked as deprecated in 0.2.x versions
    have been removed.
-   Updated `annotations` library from FindBugs to version 3.0.1u2.
-   Updated `commons-lang` library to version 3.4.
-   Updated `jaxb2-basics` libraries to version 0.10.0.
-   Updated `lorem` library to version 2.0.
-   Updated `slf4j` library to version 1.7.13.
-   Updated HTTP components libraries in the `hc43` module to version 4.3.6.


0.2.3 (09 Apr 2015)
-------------------

### bugfixes

-   Automatic removal / deactivation of untouched objects during a bulk export
    may fail under certain conditions. Instead of processing untouched objects
    only all currently published objects are removed / deactivated at the
    webservice.

### updates

-   Updated slf4j to version 1.7.12.


0.2.2 (19 Mar 2015)
-------------------

### new features

-   Store the value of `L-IS24-RequestRefnum` header for failing requests into
    the `RequestFailedException` (for low level exports) and `ExportMessage`
    (for bulk exports). In case of problems with a certain request, one can
    provide the corresponding number to IS24 together with a support request.
    This allows IS24 to track the error / problem much easier and to provide
    better support for their users.

### bugfixes

-   If a transferred property provides more attachments than allowed by the
    webservice, an incorrect ordering of attachments may occur. We should make
    sure, that attachments are always send to the webservice in the correct
    order. This guarantees, that the title image is always properly transferred
    and only attachments from the end of the list are rejected / ignored.

### updates

-   Made some API improvements & documentations.
-   Updated dependencies jaxb2-basics-runtime 0.9.3, slf4j 1.7.10 & junit 4.12.
-   Changed signature of some protected logging functions in
    `org.openestate.is24.restapi.utils.ExportHandler`.

### deprecations

-   Changed signature of the constructor in
    `org.openestate.is24.restapi.utils.Response`.


0.2.1 (26 Jan 2015)
-------------------

### bugfixes

-   During the transfer of a property the maximum number of allowed attachments
    can exceed temporarily. We should make sure, that old attachments are
    removed from the Webservice **before** any new attachments are uploaded to
    the Webservice.


0.2 (27 Dec 2014)
-----------------

### new features

-   implemented a high level API for the export process (see
    [`BulkUploadExample.java`](https://github.com/OpenEstate/OpenEstate-IS24-REST/blob/v0.2/OpenEstate-IS24-REST-examples/src/main/java/org/openestate/is24/restapi/examples/BulkUploadExample.java),
    [`ExportPool.java`](https://github.com/OpenEstate/OpenEstate-IS24-REST/blob/v0.2/OpenEstate-IS24-REST/src/main/java/org/openestate/is24/restapi/utils/ExportPool.java) and
    [`ExportHandler.java`](https://github.com/OpenEstate/OpenEstate-IS24-REST/blob/v0.2/OpenEstate-IS24-REST/src/main/java/org/openestate/is24/restapi/utils/ExportHandler.java))
-   implemented a class for creation of random real estates (see
    [`RandomRealEstateExample.java`](https://github.com/OpenEstate/OpenEstate-IS24-REST/blob/v0.2/OpenEstate-IS24-REST-examples/src/main/java/org/openestate/is24/restapi/examples/RandomRealEstateExample.java) and
    [`RandomRealEstateFactory.java`](https://github.com/OpenEstate/OpenEstate-IS24-REST/blob/v0.2/OpenEstate-IS24-REST/src/main/java/org/openestate/is24/restapi/utils/RandomRealEstateFactory.java))
-   implemented a basic web application
    [`OpenEstate-IS24-REST-webapp`](https://github.com/OpenEstate/OpenEstate-IS24-REST/blob/v0.2/OpenEstate-IS24-REST-webapp)
    to illustrate the
    [OAuth verification process](http://api.immobilienscout24.de/useful/authentication.html)

### updates

-   updated JAXB classes for XML reading / writing to the latest XML schemas
    from *17th November 2014* (see
    [IS24-Changelog](http://api.immobilienscout24.de/useful/changelog.html))
-   support new values for `EnergySourceEnev2014` for `POST` and `UPDATE` of
    real estates with request paramater `usenewenergysourceenev2014values=true`
    (see
    [notes by IS24](http://api.immobilienscout24.de/useful/energy-certificate-2014.html))
-   properly escape external ID's in request URL's
-   any `post()` methods in
    [ImportExport.java](https://github.com/OpenEstate/OpenEstate-IS24-REST/blob/v0.2/OpenEstate-IS24-REST/src/main/java/org/openestate/is24/restapi/ImportExport.java)
    return the ID of created resources instead of HTTP response messages
-   added low level method
    [Contact/DELETE](http://api.immobilienscout24.de/our-apis/import-export/contact/delete.html)
    on the Import/Export API
-   added low level method
    [Publish/Post](http://api.immobilienscout24.de/our-apis/import-export/publish/post.html)
    on the Import/Export API for publishing multiple objects at once
-   added low level method
    [Publish/DELETEbyList](http://api.immobilienscout24.de/our-apis/import-export/publish/delete-by-list.html)
    on the Import/Export API for removing multiple publishings at once
-   added low level method
    [Attachment/GETbyID](http://api.immobilienscout24.de/our-apis/import-export/attachments/get-by-id.html)
    on the Import/Export API get single attachments with their external ID
-   added low level methods for
    [RealestatesCounts Webservice](http://api.immobilienscout24.de/our-apis/import-export/realestate/realestates-counts.html)
-   migrated `commons-lang` from version 2 to version 3
-   API documentation completed
-   refactorings
    -   moved class `XmlUtils` from `org.openestate.is24.restapi.xml` into `org.openestate.is24.restapi.utils`
    -   renamed class `SSLUtils` to `SslUtils` in `org.openestate.is24.restapi.utils`
    -   renamed method `getEncodedParameterValue` to `getUrlEncodedValue` in `org.openestate.is24.restapi.AbstractClient`
    -   renamed method `deleteById` to `delete` in `org.openestate.is24.restapi.ImportExport.PublishService`
    -   moved [Java Signpost Example](http://api.immobilienscout24.de/useful/tutorials-sdks-plugins/tutorial-java-signpost.html)
        into the `examples` component (see
        [`IS24OauthExample.java`](https://github.com/OpenEstate/OpenEstate-IS24-REST/blob/v0.2/OpenEstate-IS24-REST-examples/src/main/java/org/openestate/is24/restapi/examples/IS24OauthExample.java))

### deprecations

-   deprecated class `org.openestate.is24.restapi.xml.XmlUtils`
    -   calls to this class are redirected to `org.openestate.is24.restapi.utils.XmlUtils`
    -   this class will be removed with one of the next major releases
-   deprecated class `org.openestate.is24.restapi.utils.SSLUtils`
    -   calls to this class are redirected to `org.openestate.is24.restapi.utils.SslUtils`
    -   this class will be removed with one of the next major releases
-   deprecated method `org.openestate.is24.restapi.AbstractClient.getEncodedParameterValue`
    -   calls to this method are redirected to `org.openestate.is24.restapi.AbstractClient.getUrlEncodedValue`
    -   this method will be removed with one of the next major releases
-   deprecated method `org.openestate.is24.restapi.ImportExport.PublishService.deleteById`
    -   calls to this method are redirected to `org.openestate.is24.restapi.ImportExport.PublishService.delete`
    -   this method will be removed with one of the next major releases


0.1.2 (24 Aug 2014)
-------------------

-   fixed a regression, that was introduced with *0.1.1*


0.1.1 (24 Aug 2014)
-------------------

-   updated JAXB generated classes for XML reading / writing to the latest XML
    schemas from *20th August 2014* (see
    [IS24-Changelog](http://api.immobilienscout24.de/useful/changelog.html))


0.1 (27 Jul 2014)
-----------------

-   initial release
