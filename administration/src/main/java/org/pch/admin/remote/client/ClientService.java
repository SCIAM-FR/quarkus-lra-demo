package org.pch.admin.remote.client;

import java.util.List;
import java.util.UUID;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

@RegisterRestClient
public interface ClientService {

    @DELETE
    @Path("{id}")
    Response deleteClient(@PathParam("id") UUID clientId);

    @GET
    List<ClientDTO> getClients();

    @GET
    @Path("{id}")
    ClientDTO getClient(@PathParam("id") UUID clientId);
}
