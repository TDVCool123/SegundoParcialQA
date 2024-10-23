package api.factoryRequest;

import io.restassured.response.Response;

public interface IRequest {
    public Response send(RequestInfo requestInfo);
}
