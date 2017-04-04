package by.dt.userstorage.controller;

import org.springframework.http.HttpStatus;

import java.util.Objects;

/**
 * Class wrapper contains information about errors in project for client
 */
public class ErrorMessage {

    private HttpStatus status;
    private String url;
    private String message;

    public ErrorMessage(final HttpStatus status, final String url, final String message) {
        super();
        this.status = status;
        this.message = message;
        this.url = url;
    }

    public ErrorMessage() {
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorMessage that = (ErrorMessage) o;
        return status == that.status &&
                Objects.equals(url, that.url) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, url, message);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ErrorMessage{");
        sb.append("status=").append(status);
        sb.append(", url='").append(url).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
