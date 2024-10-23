package api.factoryRequest;

import java.util.HashMap;
import java.util.Map;

public class FactoryRequest {
    public static IRequest make(String requestType){
        Map<String, IRequest> data = new HashMap<>();
        data.put("get",new RequestGet());
        data.put("post",new RequestPost());
        data.put("put",new RequestPut());
        data.put("delete",new RequestDelete());
        return  data.containsKey(requestType.toLowerCase())?
                data.get(requestType.toLowerCase()):
                data.get("get");
    }

}
