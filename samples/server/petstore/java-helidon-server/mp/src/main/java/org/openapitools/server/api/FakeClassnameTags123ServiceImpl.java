/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.api;

import org.openapitools.server.model.Client;

import jakarta.ws.rs.*;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/fake_classname_test")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen", comments = "Generator version: 7.6.0-SNAPSHOT")
public class FakeClassnameTags123ServiceImpl implements FakeClassnameTags123Service {

    @PATCH
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Client testClassname(@Valid @NotNull Client client) {
        Client result = null; // Replace with correct business logic.
        return result;
    }
}
