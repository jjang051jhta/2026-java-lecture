package ch10.exception.ex04;

public class NetworkClientException extends RuntimeException {
    public NetworkClientException(String message ) {
        super(message);
    }
}
