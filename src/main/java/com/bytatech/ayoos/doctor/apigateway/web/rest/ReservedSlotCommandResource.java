package com.bytatech.ayoos.doctor.apigateway.web.rest;



import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.ReservedSlotResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.ReservedSlotDTO;
import com.codahale.metrics.annotation.Timed;

import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * REST controller for managing ReservedSlot.
 */
@RestController
@RequestMapping("/api/command")
public class ReservedSlotCommandResource {

    private final Logger log = LoggerFactory.getLogger(ReservedSlotCommandResource.class);


    private final ReservedSlotResourceApi reservedSlotResourceApi;

    public ReservedSlotCommandResource(ReservedSlotResourceApi reservedSlotResourceApi) {
        this.reservedSlotResourceApi = reservedSlotResourceApi;
    }

    @PostMapping("/reserved-slots")
	public void createReservedSlots(@RequestBody ReservedSlotDTO reservedSlotDTO) {
		 log.debug("REST request to save reserved-slots : {}", reservedSlotDTO);
		reservedSlotResourceApi.createReservedSlotUsingPOST(reservedSlotDTO);

	}

	@PutMapping("/reserved-slots")
	public void updateReservedSlots(@RequestBody ReservedSlotDTO reservedSlotDTO) {
		log.debug("REST request to update reserved-slots : {}", reservedSlotDTO);
		reservedSlotResourceApi.updateReservedSlotUsingPUT(reservedSlotDTO);
	}
	
	@DeleteMapping("/reserved-slots/{id}")
    
    public void deleteReservedSlots(@PathVariable Long id) {
       log.debug("REST request to delete reserved-slots : {}", id);
		reservedSlotResourceApi.deleteReservedSlotUsingDELETE(id);
       
    }

}
