Changelog for OpenEstate-IS24-REST
==================================


0.3-SNAPSHOT (not released yet)
-------------------------------

### new features

-   Store the value of `L-IS24-RequestRefnum` header for failing requests into
    the `RequestFailedException` (for low level exports) and `ExportMessage`
    (for bulk exports). In case of problems with a certain request, one can
    provide the corresponding number to IS24 together with a support request.
    This allows IS24 to track the error / problem much easier and to provide
    better support for their users.
-   Made some API improvements & documentations.

### bugfixes

-   If a transferred property provides more attachments than allowed by the
    webservice, an incorrect ordering of attachments may occur. We should make
    sure, that attachments are always send to the webservice in the correct
    order. This guarantees, that the title image is always properly transferred
    and only attachments from the end of the list are rejected / ignored.

### updates

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
