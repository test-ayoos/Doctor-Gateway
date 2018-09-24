/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.doctor.apigateway.client.doctor.api;

import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.ProfileInfoDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-23T16:09:16.109+05:30[Asia/Kolkata]")

@Api(value = "ProfileInfoResource", description = "the ProfileInfoResource API")
public interface ProfileInfoResourceApi {

    @ApiOperation(value = "createProfileInfo", nickname = "createProfileInfoUsingPOST", notes = "", response = ProfileInfoDTO.class, tags={ "profile-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProfileInfoDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/profile-infos",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ProfileInfoDTO> createProfileInfoUsingPOST(@ApiParam(value = "profileInfoDTO" ,required=true )  @Valid @RequestBody ProfileInfoDTO profileInfoDTO);


    @ApiOperation(value = "deleteProfileInfo", nickname = "deleteProfileInfoUsingDELETE", notes = "", tags={ "profile-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/profile-infos/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteProfileInfoUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllProfileInfos", nickname = "getAllProfileInfosUsingGET", notes = "", response = ProfileInfoDTO.class, responseContainer = "List", tags={ "profile-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProfileInfoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/profile-infos",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ProfileInfoDTO>> getAllProfileInfosUsingGET(@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getProfileInfo", nickname = "getProfileInfoUsingGET", notes = "", response = ProfileInfoDTO.class, tags={ "profile-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProfileInfoDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/profile-infos/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ProfileInfoDTO> getProfileInfoUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchProfileInfos", nickname = "searchProfileInfosUsingGET", notes = "", response = ProfileInfoDTO.class, responseContainer = "List", tags={ "profile-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProfileInfoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/profile-infos",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ProfileInfoDTO>> searchProfileInfosUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "updateProfileInfo", nickname = "updateProfileInfoUsingPUT", notes = "", response = ProfileInfoDTO.class, tags={ "profile-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProfileInfoDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/profile-infos",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<ProfileInfoDTO> updateProfileInfoUsingPUT(@ApiParam(value = "profileInfoDTO" ,required=true )  @Valid @RequestBody ProfileInfoDTO profileInfoDTO);

}