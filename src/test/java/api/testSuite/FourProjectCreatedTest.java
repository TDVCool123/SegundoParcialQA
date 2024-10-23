package api.testSuite;

import api.config.ApiProjectConfig;
import api.factoryRequest.FactoryRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class FourProjectCreatedTest extends BasicAuthTestBase{
    @Test
    @DisplayName("Verify the create of 4 proyects- todo.ly")

    //You must have an user created
    public void create4Projects() {

        //Create 4 Projects
        for (int i = 1;i <=4;i++) {
            request.setUrl(ApiProjectConfig.CREATE_PROJECT);
            request.setHeaders(auth, valueAuth);

            body.put("Content", "Project "+i);

            request.setBody(body.toString());

            response = FactoryRequest.make("post").send(request);
            response.then().statusCode(200).body("Content", equalTo(body.get("Content")));
        }


    }

    @Test
    @DisplayName("Delete all project - todo.ly")
    public void deleteAllProject() {
        //get all proyects
        request.setUrl(ApiProjectConfig.READ_ALL_PROJECTS);
        request.setHeaders(auth,valueAuth);
        response = FactoryRequest.make("get").send(request);
        response.then().statusCode(200)
                .body("size()", greaterThan(0))
                .body("[-1].Content", equalTo("Project 4"));
        List<Map<String, Object>> projects = response.jsonPath().getList("");

        //Delete all Projects
        for (Map<String, Object> project : projects) {
            int projectId = (int) project.get("Id");
            System.out.println(projectId);
            request.setUrl(ApiProjectConfig.DELETE_PROJECT.replace("{id}", ""+projectId));
            response = FactoryRequest.make("delete").send(request);
            response.then().statusCode(200).body("Deleted",equalTo(true));
        }


    }
}
