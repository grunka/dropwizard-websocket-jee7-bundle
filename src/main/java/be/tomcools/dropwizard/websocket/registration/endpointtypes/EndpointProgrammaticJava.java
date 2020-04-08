package be.tomcools.dropwizard.websocket.registration.endpointtypes;

import be.tomcools.dropwizard.websocket.registration.Endpoint;

import javax.websocket.server.ServerEndpointConfig;
import java.util.Objects;

public class EndpointProgrammaticJava extends Endpoint {
    private ServerEndpointConfig config;

    public EndpointProgrammaticJava(ServerEndpointConfig config) {
        super(config.getEndpointClass(), EndpointType.JAVA_PROGRAMMATIC_ENDPOINT, config.getPath());
        this.config = config;
    }

    public ServerEndpointConfig getConfig() {
        return config;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        EndpointProgrammaticJava that = (EndpointProgrammaticJava) o;
        return Objects.equals(config, that.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), config);
    }
}
