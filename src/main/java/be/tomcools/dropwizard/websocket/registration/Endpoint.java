package be.tomcools.dropwizard.websocket.registration;

import be.tomcools.dropwizard.websocket.registration.endpointtypes.EndpointType;

import java.util.Objects;

public abstract class Endpoint {
    protected Class<?> endpointClass;
    protected EndpointType type;
    protected String path;

    protected Endpoint(Class<?> endpointClass, EndpointType type, String path) {
        this.endpointClass = endpointClass;
        this.type = type;
        this.path = path;
    }

    public Class<?> getEndpointClass() {
        return endpointClass;
    }

    public void setEndpointClass(Class<?> endpointClass) {
        this.endpointClass = endpointClass;
    }

    public EndpointType getType() {
        return type;
    }

    public void setType(EndpointType type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Endpoint endpoint = (Endpoint) o;
        return Objects.equals(endpointClass, endpoint.endpointClass) &&
                type == endpoint.type &&
                Objects.equals(path, endpoint.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointClass, type, path);
    }

    @Override
    public String toString() {
        return "Endpoint{" +
                "endpointClass=" + endpointClass +
                ", type=" + type +
                ", path='" + path + '\'' +
                '}';
    }
}
