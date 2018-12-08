
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MESSAGE_RESOURCE_CREATED"/&gt;
 *     &lt;enumeration value="MESSAGE_RESOURCE_UPDATED"/&gt;
 *     &lt;enumeration value="MESSAGE_RESOURCE_DELETED"/&gt;
 *     &lt;enumeration value="MESSAGE_OPERATION_SUCCESSFUL"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_HEADER_PARAMETER_VALIDATION_FAILED"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_RESOURCE_REQUIRED"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_REQUEST_CONFLICT"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_AUTHENTICATION_REQUIRED"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_AUTHENTICATION_OAUTH_NONCE_EXPIRED"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_ACCESS_DENIED"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_SCHEMA_VALIDATION_FAILED"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_URL_PARAMETER_REQUIRED"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_URL_PARAMETER_VALIDATION_FAILED"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_URL_MULTIPLE_PARAMETERS_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_URL_PARAMETER_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_NOT_IMPLEMENTED"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_SERVICE_UNAVAILABLE"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_INTERNAL_SERVER_ERROR"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_UNPROCESSABLE_ENTITY"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_INTERNAL_SERVER_ERROR_WITH_DETAILS"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_RESOURCE_NOT_FOUND"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_METHOD_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_ACCEPT_TYPE_NOT_APPLICABLE"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_MEDIA_TYPE_UNSUPPORTED"/&gt;
 *     &lt;enumeration value="ERROR_COMMON_BAD_REQUEST"/&gt;
 *     &lt;enumeration value="ERROR_RESOURCE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="ERROR_RESOURCE_NOT_FOUND"/&gt;
 *     &lt;enumeration value="ERROR_RESOURCE_NOT_FOUND_FOR_MULTIPLE_PARAMETERS"/&gt;
 *     &lt;enumeration value="ERROR_RESOURCE_VALIDATION"/&gt;
 *     &lt;enumeration value="ERROR_REQUESTED_DATA_NOT_FOUND"/&gt;
 *     &lt;enumeration value="ERROR_RESOURCE_NOT_UNIQUE"/&gt;
 *     &lt;enumeration value="ERROR_RESOURCE_NO_LONGER_AVAILABLE"/&gt;
 *     &lt;enumeration value="ERROR_DB_NOT_AVAILABLE"/&gt;
 *     &lt;enumeration value="ERROR_CONTACT_DETAILS_MISSING"/&gt;
 *     &lt;enumeration value="ERROR_INVALID_COORDINATES"/&gt;
 *     &lt;enumeration value="ERROR_GEOCODING_FAILED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageCode")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T04:04:29+02:00", comments = "JAXB RI v2.2.11")
public enum MessageCode {


    /**
     * Resource was successful created (includes name and id of the
     *                         resource).
     *                     
     * 
     */
    MESSAGE_RESOURCE_CREATED,

    /**
     * Resource was successful updated (includes name and id of the
     *                         resource).
     *                     
     * 
     */
    MESSAGE_RESOURCE_UPDATED,

    /**
     * Resource was successful deleted (includes name and id of the
     *                         resource).
     *                     
     * 
     */
    MESSAGE_RESOURCE_DELETED,

    /**
     * Operation successful executed.
     * 
     */
    MESSAGE_OPERATION_SUCCESSFUL,

    /**
     * Operation successful executed.
     * 
     */
    ERROR_COMMON_HEADER_PARAMETER_VALIDATION_FAILED,

    /**
     * Request is only valid within the context of an specific resource
     *                         (includes name of the required resource).
     *                     
     * 
     */
    ERROR_COMMON_RESOURCE_REQUIRED,

    /**
     * A conflict occured during execution of an operation (e.g. on a
     *                         resource).
     *                     
     * 
     */
    ERROR_COMMON_REQUEST_CONFLICT,

    /**
     * No authorization for the requested operation.
     * 
     */
    ERROR_COMMON_AUTHENTICATION_REQUIRED,

    /**
     * The OAuth Nonce has expired.
     * 
     */
    ERROR_COMMON_AUTHENTICATION_OAUTH_NONCE_EXPIRED,

    /**
     * No authorization for the requested operation.
     * 
     */
    ERROR_COMMON_ACCESS_DENIED,

    /**
     * Validation according the schema failed (includes the description of
     *                         the failure).
     *                     
     * 
     */
    ERROR_COMMON_SCHEMA_VALIDATION_FAILED,

    /**
     * A required parameter is missing in the request (contains the name of
     *                         the parameter).
     *                     
     * 
     */
    ERROR_COMMON_URL_PARAMETER_REQUIRED,

    /**
     * At least one request parameter contains an invalid value (contains
     *                         the name and the value of the parameter).
     *                     
     * 
     */
    ERROR_COMMON_URL_PARAMETER_VALIDATION_FAILED,

    /**
     * Multiple parameters are not allowed.
     * 
     */
    ERROR_COMMON_URL_MULTIPLE_PARAMETERS_NOT_ALLOWED,

    /**
     * A request parameter is not supported (contains the name of the
     *                         parameter).
     *                     
     * 
     */
    ERROR_COMMON_URL_PARAMETER_NOT_SUPPORTED,

    /**
     * HTTP 501: The method is not yet implemented.
     * 
     */
    ERROR_COMMON_NOT_IMPLEMENTED,

    /**
     * HTTP 503: Service Unavailable
     * 
     */
    ERROR_COMMON_SERVICE_UNAVAILABLE,

    /**
     * HTTP 500: Internal Server Error
     * 
     */
    ERROR_COMMON_INTERNAL_SERVER_ERROR,

    /**
     * HTTP 422: Unprocessable Entity
     * 
     */
    ERROR_COMMON_UNPROCESSABLE_ENTITY,

    /**
     * HTTP 500: Internal Server Error with Details
     * 
     */
    ERROR_COMMON_INTERNAL_SERVER_ERROR_WITH_DETAILS,

    /**
     * Resource was not found.
     * 
     */
    ERROR_COMMON_RESOURCE_NOT_FOUND,

    /**
     * Method not allowed for this resource.
     * 
     */
    ERROR_COMMON_METHOD_NOT_ALLOWED,

    /**
     * Accept type not applicable.
     * 
     */
    ERROR_COMMON_ACCEPT_TYPE_NOT_APPLICABLE,

    /**
     * Media type is not supported.
     * 
     */
    ERROR_COMMON_MEDIA_TYPE_UNSUPPORTED,

    /**
     * The http request is invalid (check the url or body content).
     *                     
     * 
     */
    ERROR_COMMON_BAD_REQUEST,

    /**
     * The resource is not supported within the context of the request
     *                         (includes name of the unauthorized and unavailable resource e.g. savedsearch is only for
     *                         searchers).
     *                     
     * 
     */
    ERROR_RESOURCE_NOT_SUPPORTED,

    /**
     * Resource was not found (includes name and id of the resource).
     *                     
     * 
     */
    ERROR_RESOURCE_NOT_FOUND,

    /**
     * Resource was not found for at least one of the given parameters.
     *                     
     * 
     */
    ERROR_RESOURCE_NOT_FOUND_FOR_MULTIPLE_PARAMETERS,

    /**
     * Not all of the data for the resource are valid (includes the
     *                         description of the failure).
     *                     
     * 
     */
    ERROR_RESOURCE_VALIDATION,

    /**
     * The requested data was not found.
     * 
     */
    ERROR_REQUESTED_DATA_NOT_FOUND,

    /**
     * The requested resource is not unique, but is expected to be
     *                         unique.
     *                     
     * 
     */
    ERROR_RESOURCE_NOT_UNIQUE,

    /**
     * resource requested is no longer available and will not be available
     *                         again.
     *                     
     * 
     */
    ERROR_RESOURCE_NO_LONGER_AVAILABLE,

    /**
     * The DB ist not reachable.
     * 
     */
    ERROR_DB_NOT_AVAILABLE,

    /**
     * Contact data is missing some attributes.
     * 
     */
    ERROR_CONTACT_DETAILS_MISSING,

    /**
     * The given coordinates are invalid.
     * 
     */
    ERROR_INVALID_COORDINATES,

    /**
     * The geocoding was not successful.
     * 
     */
    ERROR_GEOCODING_FAILED;

    public String value() {
        return name();
    }

    public static MessageCode fromValue(String v) {
        return valueOf(v);
    }

}
